import org.junit.jupiter.api.Test;

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

}
