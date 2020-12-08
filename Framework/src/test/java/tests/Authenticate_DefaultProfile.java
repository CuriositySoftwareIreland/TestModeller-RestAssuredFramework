package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://modeller.dev.testinsights.io/app/#!/model-engine/guid/04de63f7-e540-4c5c-b7c2-e436aad8666d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 283, profileId = 100188)
public class Authenticate_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Authenticate","Authenticate - Default Profile"})
    @TestModellerPath(guid = "6bfe7789-e5bc-4042-baf2-9af34997a08a")
    public void RegisterUserPositiveLoginUserSuccess1()
    {
        
        pages.Reqres _Reqres = new pages.Reqres(driver);
    // Register User - Register User
    TestModellerLogger.SetLastNodeGuid("f06d0e78-5130-48ca-9b9e-ded63d29c5da");
    _Reqres.RegisterUser("eve.holt@reqres.in", "cityslicka", 200);
    

    // Positive Login User - Login User
    TestModellerLogger.SetLastNodeGuid("08ffab3b-bb9d-42d6-a597-1525b13ad000");
    _Reqres.LoginUser("eve.holt@reqres.in", "cityslicka");
    

    }

    @Test  (groups= {"Authenticate","Authenticate - Default Profile"})
    @TestModellerPath(guid = "ffd44a11-f47c-447b-a02c-4f487d2f67f8")
    public void NegativeRegisterUserError2()
    {
        
        pages.Reqres _Reqres = new pages.Reqres(driver);
    // Negative Register User - Register User
    TestModellerLogger.SetLastNodeGuid("f5b1d9dd-bd05-4061-9fa6-c32603e78527");
    _Reqres.RegisterUser("", "#!_ @", 400);
    

    }

    @Test  (groups= {"Authenticate","Authenticate - Default Profile"})
    @TestModellerPath(guid = "acf11629-8a67-4867-a206-20367d0dd678")
    public void NegativeRegisterUserError3()
    {
        
        pages.Reqres _Reqres = new pages.Reqres(driver);
    // Negative Register User - Register User
    TestModellerLogger.SetLastNodeGuid("f5b1d9dd-bd05-4061-9fa6-c32603e78527");
    _Reqres.RegisterUser("james.walker", "#!_ @", 400);
    

    }

}
