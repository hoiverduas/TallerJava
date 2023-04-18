import repositoy.ProductsRepository;
import repositoy.RegisterRepository;
import service.DrugstoreService;

public class App {
    void initialApplication(){

        RegisterRepository registerRepository = new RegisterRepository();
        ProductsRepository productsRepository = new ProductsRepository();
        DrugstoreService drugstoreService = new DrugstoreService(registerRepository, productsRepository);
        drugstoreService.initDrugstoreService();

    }
}
