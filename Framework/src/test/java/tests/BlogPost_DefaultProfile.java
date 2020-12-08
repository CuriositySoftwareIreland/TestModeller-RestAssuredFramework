package tests;

import pages.JSONPlaceHolder;
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

//http://modeller.dev.testinsights.io/app/#!/model-engine/guid/6c33d7ab-37b7-417b-abae-c6a050da5d90
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 279, profileId = 100187)
public class BlogPost_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Blog Post","Blog Post - Default Profile"})
    @TestModellerPath(guid = "96636b04-776e-4c5b-9067-5407fdd66654")
    public void PositivePOSTposts1()
    {
        
        JSONPlaceHolder _JSONPlaceHolder = new JSONPlaceHolder(driver);
    // Positive POST - (posts) - POST - (posts)
    TestModellerLogger.SetLastNodeGuid("fdfdf90c-dad6-4071-9c9b-fededab9106a");
    _JSONPlaceHolder.posts("Mr", "86172 Ankunding Lock, Fisherberg, Antarctica (the territory South of 60 deg S)");
    

    }

    @Test  (groups= {"Blog Post","Blog Post - Default Profile"})
    @TestModellerPath(guid = "c2d19967-7e9a-4144-b064-a2ae61670b69")
    public void NegativePOSTposts2()
    {
        
        JSONPlaceHolder _JSONPlaceHolder = new JSONPlaceHolder(driver);
    // Negative POST - (posts) - POST - (posts)
    TestModellerLogger.SetLastNodeGuid("53822e47-9f34-4b5d-945f-6ff6f8691efa");
    _JSONPlaceHolder.posts("Mr", "");
    

    }

    @Test  (groups= {"Blog Post","Blog Post - Default Profile"})
    @TestModellerPath(guid = "c2318664-dd51-4782-85c4-8c36cc5c2613")
    public void NegativePOSTposts3()
    {
        
        JSONPlaceHolder _JSONPlaceHolder = new JSONPlaceHolder(driver);
    // Negative POST - (posts) - POST - (posts)
    TestModellerLogger.SetLastNodeGuid("53822e47-9f34-4b5d-945f-6ff6f8691efa");
    _JSONPlaceHolder.posts("Mr", "#!_ @");
    

    }

    @Test  (groups= {"Blog Post","Blog Post - Default Profile"})
    @TestModellerPath(guid = "42c4c4d1-7917-4fa0-91cf-39072fe08c4c")
    public void PositivePOSTposts4()
    {
        
        JSONPlaceHolder _JSONPlaceHolder = new JSONPlaceHolder(driver);
    // Positive POST - (posts) - POST - (posts)
    TestModellerLogger.SetLastNodeGuid("fdfdf90c-dad6-4071-9c9b-fededab9106a");
    _JSONPlaceHolder.posts("Mrs", "0114 Dicki Ville, West Kadefurt, Somalia");
    

    }

    @Test  (groups= {"Blog Post","Blog Post - Default Profile"})
    @TestModellerPath(guid = "b6371904-373d-447f-b29e-9b936c93565a")
    public void PositivePOSTposts5()
    {
        
        JSONPlaceHolder _JSONPlaceHolder = new JSONPlaceHolder(driver);
    // Positive POST - (posts) - POST - (posts)
    TestModellerLogger.SetLastNodeGuid("fdfdf90c-dad6-4071-9c9b-fededab9106a");
    _JSONPlaceHolder.posts("Miss", "27827 Huel Path, New Eunicefort, Switzerland");
    

    }

    @Test  (groups= {"Blog Post","Blog Post - Default Profile"})
    @TestModellerPath(guid = "e1e78d47-668a-457f-a22d-db91bd2cb9ce")
    public void PositivePOSTposts6()
    {
        
        JSONPlaceHolder _JSONPlaceHolder = new JSONPlaceHolder(driver);
    // Positive POST - (posts) - POST - (posts)
    TestModellerLogger.SetLastNodeGuid("fdfdf90c-dad6-4071-9c9b-fededab9106a");
    _JSONPlaceHolder.posts("Ms", "05113 Ben Route, Smithview, Angola");
    

    }

    @Test  (groups= {"Blog Post","Blog Post - Default Profile"})
    @TestModellerPath(guid = "297d4a26-d4c4-497d-bd0f-44ce36f85e4f")
    public void PositivePOSTposts7()
    {
        
        JSONPlaceHolder _JSONPlaceHolder = new JSONPlaceHolder(driver);
    // Positive POST - (posts) - POST - (posts)
    TestModellerLogger.SetLastNodeGuid("fdfdf90c-dad6-4071-9c9b-fededab9106a");
    _JSONPlaceHolder.posts("Dr", "13135 Mavis Mission, West Andrewville, Lebanon");
    

    }

}
