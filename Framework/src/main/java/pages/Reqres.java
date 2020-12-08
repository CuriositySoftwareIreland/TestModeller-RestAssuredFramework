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

// http://dev.testinsights.io/app/#!/module-collection/guid/ee5c6c27-0a2b-4b78-8b13-53cea8238bfa
@TestModellerModule(guid = "ee5c6c27-0a2b-4b78-8b13-53cea8238bfa")
public class Reqres extends BasePage
{
	public Reqres (RestAssured driver)
	{
		super(driver);
	}

	//Region - Identifiers 

	//Region - Methods 

	public void LoginUser(String Username,String Password)
	{
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.contentType(ContentType.JSON);

		httpRequest = httpRequest.header("Content-Type", "application/json");


		httpRequest.body("{     \"email\": \"" + Username+ "\",     \"password\": \"" + Password+ "\" } ");
		Response response = httpRequest.post("https://reqres.in/api/login");

		if (!(response.getStatusCode() == 200)) {
			Assert.fail("Status code invalid - expected 200 - found " + response.getStatusCode());
		}
		ExtentReportManager.passStep("LoginUser");
		TestModellerLogger.PassStep("LoginUser");
	}

	public void RegisterUser(String Email,String Password,Integer Response)
	{
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.contentType(ContentType.JSON);

		httpRequest = httpRequest.header("Content-Type", "application/json");


		httpRequest.body("{     \"email\": \"" + Email+ "\",     \"password\": \"" + Password+ "\" } ");
		Response response = httpRequest.post("https://reqres.in/api/register");

		if (!(response.getStatusCode() == Response)) {
			Assert.fail("Status code invalid - expected " + Response + "- found " + response.getStatusCode());
		}
		ExtentReportManager.passStep("RegisterUser");
		TestModellerLogger.PassStep("RegisterUser");
	}
}