import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserRegistrarShould {
    @Test
    public void commandToPersistTheUser() throws Exception {
        String email = "email@email.com";
        UserRepository repository = mock(UserRepository.class);
        UserRegistrar registrar = new UserRegistrar(repository);

        registrar.register(email);

        verify(repository).save(email);
    }

    @Test
    public void getAnUserIdRandomlyGenerated() throws Exception {
        String email = "email@email.com";
        UserRepository repository = new UserRepository();
        UserRegistrar registrar = new UserRegistrar(repository);

        String userId = registrar.register(email);

        assertNotNull(userId);
    }

    @Test
    public void couldGetTheUserAfterBeingPersisted() throws Exception {
        String email = "email@email.com";
        UserRepository repository = new UserRepository();
        UserRegistrar registrar = new UserRegistrar(repository);

        String userIdGenerated = registrar.register(email);
        String userIdRequested = registrar.findUserByEmail(email);

        assertEquals(userIdGenerated, userIdRequested);
    }

    @Test
    public void shouldNotExistTwoUsersWithTheSameEmail() throws Exception {
        String email1 = "email@email.com";
        String email2 = "email@email.com";
        UserRepository repository = new UserRepository();
        UserRegistrar registrar = new UserRegistrar(repository);

        registrar.register(email1);
        registrar.register(email2);

        long count = registrar.countAllUsersByEmail(email1);

        assertEquals(1, count);
    }

}
