import repository.RegisterRepository;
import service.ParkingGuardianService;

public class App {
    void initialApplication(){


        RegisterRepository registerRepository = new RegisterRepository();
        ParkingGuardianService parkingGuardianService = new ParkingGuardianService(registerRepository);
        parkingGuardianService.initParkingGuardianService();
    }
}
