import repository.RegisterRepository;
import service.DrivingSchoolService;

public class App {

    void initialApplication(){


        RegisterRepository registerRepository = new RegisterRepository();
        DrivingSchoolService drivingSchoolService = new DrivingSchoolService(registerRepository);
        drivingSchoolService.initDrivingSchoolService();
    }
}
