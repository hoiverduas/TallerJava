import repository.UserRepository;
import service.BancoFielService;

public class App {

    void initialApplication(){
        UserRepository userRepository = new UserRepository();
        BancoFielService bancoFielService = new BancoFielService(userRepository);
        bancoFielService.initBancoFielService();

    }
}
