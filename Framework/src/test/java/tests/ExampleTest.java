package tests;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import reports.TestNGListener;
import utilities.testmodeller.TestModellerLogger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Listeners(TestNGListener.class)
@TestModellerSuite(id = 303, profileId = 101322)
public class ExampleTest extends TestBase {
    @Test(groups= {"Master","Master - Default Profile"})
    @TestModellerPath(guid = "30ebd2ec-a69c-4aa8-9d89-0caf187a4b2a")
    public void test1()
    {
        TestModellerLogger.SetLastNodeGuid("326d4c1a-f1a6-4bd6-98e7-f555ef4ecf54");

        postman("asd","asd");
    }

    public String postman(String foo1,String foo2)
    {
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);

        httpRequest = httpRequest.header("Content-Type", "application/json");

        httpRequest = httpRequest.param("foo1", "" + foo1+ "");
        httpRequest = httpRequest.param("foo2", "" + foo2+ "");
        Response response = httpRequest.get("https://postman-echo.com/get");

        if (!(response.getStatusCode() == 200)) {
            Assert.fail("Status code invalid - expected 200 - found " + response.getStatusCode());
        }

        Pattern r = Pattern.compile("(" + foo1+ ")");

        Matcher m = r.matcher(response.getBody().asString());

        if (m.find()) {
            return m.group(1);
        } else {
            return null;
        }
    }

}
