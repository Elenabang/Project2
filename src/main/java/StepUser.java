import model.UserRequestModel;
import model.Root;

public class StepUser {
    ApiUser apiUser = new ApiUser();
public Root createUser(String name, String job) {
    UserRequestModel model = new UserRequestModel(name, job);
    return apiUser.createUser(model);

}
}



