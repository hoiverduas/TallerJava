import repository.CakeRepository;
import repository.RegisterRepository;
import service.CakeShopService;

public class App {
    public void initialApplication(){

        RegisterRepository registerRepository = new RegisterRepository();
        CakeRepository cakeRepository = new CakeRepository();


        CakeShopService cakeShopService = new CakeShopService(registerRepository,cakeRepository);

        cakeShopService.initCakeShopService();
    }
}
