import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserRegistrarShould {
    @Test
    public void commandToPersistTheUser() throws Exception {
        String email = "email@email.com";
        String password = "goodPassword_";
        UserRepository repository = mock(UserRepository.class);
        PasswordValidator validator = new PasswordValidator();
        UserRegistrar registrar = new UserRegistrar(repository, validator);

        registrar.register(email, password);

        verify(repository).save(email);
    }

    @Test
    public void getAnUserIdRandomlyGenerated() throws Exception {
        String email = "email@email.com";
        String password = "goodPassword_";
        UserRepository repository = new UserRepository();
        PasswordValidator validator = new PasswordValidator();
        UserRegistrar registrar = new UserRegistrar(repository, validator);

        String userId = registrar.register(email, password);

        assertNotNull(userId);
    }

    @Test
    public void couldGetTheUserAfterBeingPersisted() throws Exception {
        String email = "email@email.com";
        String password = "goodPassword_";
        UserRepository repository = new UserRepository();
        PasswordValidator validator = new PasswordValidator();
        UserRegistrar registrar = new UserRegistrar(repository, validator);

        String userIdGenerated = registrar.register(email, password);
        User userIdRequested = registrar.findUserByEmail(email);

        assertEquals(userIdGenerated, userIdRequested.getUserId());
    }

    @Test
    public void shouldNotExistTwoUsersWithTheSameEmail() throws Exception {
        String email1 = "email@email.com";
        String email2 = "email@email.com";
        String password = "goodPassword_";
        UserRepository repository = new UserRepository();
        PasswordValidator validator = new PasswordValidator();
        UserRegistrar registrar = new UserRegistrar(repository, validator);

        registrar.register(email1, password);
        registrar.register(email2, password);

        long count = registrar.countAllUsersByEmail(email1);

        assertEquals(1, count);
    }

    @Test
    public void shouldValidateThePassword() throws Exception {
        String email = "email@email.com";
        String password = "goodPassword_";
        UserRepository repository = new UserRepository();
        PasswordValidator validator = mock(PasswordValidator.class);
        UserRegistrar registrar = new UserRegistrar(repository, validator);

        registrar.register(email, password);

        verify(validator).validate(password);
    }

    @Test
    public void shouldValidateThatThePasswordHasMoreThan8Characters() throws Exception {
        String email = "email@email.com";
        String password = "badPass_";
        UserRepository repository = new UserRepository();
        PasswordValidator validator = new PasswordValidator();
        UserRegistrar registrar = new UserRegistrar(repository, validator);

        Exception exception = assertThrows(Exception.class, () -> registrar.register(email, password));
        assertEquals("Password should have more than 8 characters", exception.getMessage());
    }

    @Test
    public void shouldValidateThatThePasswordContainsUnderscore() throws Exception {
        String email = "email@email.com";
        String password = "badPassword";
        UserRepository repository = new UserRepository();
        PasswordValidator validator = new PasswordValidator();
        UserRegistrar registrar = new UserRegistrar(repository, validator);

        Exception exception = assertThrows(Exception.class, () -> registrar.register(email, password));
        assertEquals("Password should contain at least one underscore", exception.getMessage());
    }

}
