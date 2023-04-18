import repository.RepositoryMovie;
import repository.RepositoryRegister;
import service.VideoStoreService;

public class App {

    void initialApplication(){

        RepositoryRegister repositoryRegister = new RepositoryRegister();
        RepositoryMovie repositoryMovie = new RepositoryMovie();
        VideoStoreService videoStoreService = new VideoStoreService(repositoryRegister, repositoryMovie);
        videoStoreService.initVideoStoreService();

    }
}
