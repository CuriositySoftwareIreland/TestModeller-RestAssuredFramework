package pages;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// http://dev.testinsights.io/app/#!/module-collection/guid/82cc0e5e-a05a-4841-9c8d-7d586834212d
@TestModellerModule(guid = "82cc0e5e-a05a-4841-9c8d-7d586834212d")
public class JSONPlaceHolder extends BasePage
{
    public JSONPlaceHolder (RestAssured driver)
    {
        super(driver);
    }

    public void posts(String title,String comment)
    {
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);

        httpRequest = httpRequest.header("Content-Type", "application/json");


        httpRequest.body("{     \"title\": \"" + title+ "\",     \"body\": \"" + comment+ "\",     \"userId\": 1 } ");
        Response response = httpRequest.post("https://jsonplaceholder.typicode.com/posts");

        if (!(response.getStatusCode() == 201)) {
            Assert.fail("Status code invalid - expected 201 - found " + response.getStatusCode());
        }
        ExtentReportManager.passStep("posts");
        TestModellerLogger.PassStep("posts");
    }
}