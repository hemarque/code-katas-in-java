import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserRegistrarShould {
    String email = "email@email.com";
    String password = "goodPassword_";
    UserRepository repository = new UserRepository();
    PasswordValidator validator = new PasswordValidator();
    EmailSender sender = new EmailSender();

    @Test
    public void commandToPersistTheUser() throws Exception {
        UserRepository mockRepository = mock(UserRepository.class);
        UserRegistrar registrar = new UserRegistrar(mockRepository, validator, sender);

        registrar.register(email, password);

        verify(mockRepository).save(email, password);
    }

    @Test
    public void getAnUserIdRandomlyGenerated() throws Exception {
        UserRegistrar registrar = new UserRegistrar(repository, validator, sender);

        registrar.register(email, password);

        assertNotNull(repository.findUserByEmail(email).getId());
    }

    @Test
    public void couldGetTheUserInTheRepositoryAfterBeingPersisted() throws Exception {
        UserRegistrar registrar = new UserRegistrar(repository, validator, sender);

        registrar.register(email, password);

        User user = repository.findUserByEmail(email);
        assertNotNull(user);
        assertNotNull(user.getId());
        assertEquals(password, user.getPassword());
        assertEquals(email, user.getEmail());
    }

    @Test
    public void shouldNotExistTwoUsersInTheRepositoryWithTheSameEmail() throws Exception {
        UserRegistrar registrar = new UserRegistrar(repository, validator, sender);
        registrar.register(email, password);
        registrar.register(email, password);

        long count = repository.findAllUsersByEmail(email).count();

        assertEquals(1, count);
    }

    @Test
    public void shouldValidateThePassword() throws Exception {
        PasswordValidator mockValidator = mock(PasswordValidator.class);
        UserRegistrar registrar = new UserRegistrar(repository, mockValidator, sender);

        registrar.register(email, password);

        verify(mockValidator).validate(password);
    }

    @Test
    public void shouldValidateThatThePasswordHasMoreThan8Characters() throws Exception {
        String password = "badPass_";
        UserRegistrar registrar = new UserRegistrar(repository, validator, sender);

        assertThrows(PasswordWithLessThan9CharactersException.class, () -> registrar.register(email, password));
    }

    @Test
    public void shouldValidateThatThePasswordContainsUnderscore() throws Exception {
        String password = "badPassword";
        UserRegistrar registrar = new UserRegistrar(repository, validator, sender);

        assertThrows(PasswordWithoutUnderscoreException.class, () -> registrar.register(email, password));
    }

    @Test
    public void shouldSendAConfirmationEmailWhenTheUserIsRegistered() throws Exception {
        EmailSender mockSender = mock(EmailSender.class);
        UserRegistrar registrar = new UserRegistrar(repository, validator, mockSender);

        registrar.register(email, password);

        verify(mockSender).sendConfirmation(email);
    }

}
