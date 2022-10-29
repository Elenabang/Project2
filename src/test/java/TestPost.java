import model.Root;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPost
{
    StepUser stepuser =  new StepUser();
    Root model;

    @Test
    public void firstTest(){
        model = stepuser.createUser("Diana","Singer");
        Assert.assertEquals(model.getJob(),"Singer");
        Assert.assertEquals(model.getName(),"Rachel");
    }
}
