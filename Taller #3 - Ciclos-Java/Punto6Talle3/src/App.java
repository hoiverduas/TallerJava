import repository.RegisterRepository;
import service.ContactPhoneService;

public class App {
    void initialApplication(){


        RegisterRepository registerRepository = new RegisterRepository();
        ContactPhoneService contactPhoneService = new ContactPhoneService(registerRepository);
        contactPhoneService.initContactPhoneService();

    }

}
