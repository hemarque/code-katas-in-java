import org.junit.jupiter.api.Test;

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
}
