import repository.RegisterRepository;
import repository.ToolRepository;
import service.WorkShopService;

public class App {

    void initialApplication(){

        ToolRepository toolRepository = new ToolRepository();
        RegisterRepository registerRepository = new RegisterRepository();

        WorkShopService workShopService = new WorkShopService(toolRepository, registerRepository);

        workShopService.initWorkShop();

    }
}
