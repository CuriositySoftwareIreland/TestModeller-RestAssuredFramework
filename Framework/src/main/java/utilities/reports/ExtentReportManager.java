package utilities.reports;


import utilities.testmodeller.GetScreenShot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.lang.reflect.Method;

public class ExtentReportManager {
    public static ExtentReports extentReport;

    public static ExtentTest extentTest;

    public static String currentTestGuid;

    public static String currentTestName;

    public static String extentDir = System.getProperty("user.dir") +"/report";

    public static void setupReporter()
    {
        ExtentHtmlReporter avent = new ExtentHtmlReporter(extentDir +  "/index.html");

        System.out.println("Report location - " + extentDir +  "/index.html");
        if (extentReport == null) {
            extentReport = new ExtentReports();
            extentReport.attachReporter(avent);
        }
    }

    public static void closeReporter()
    {
        extentReport.flush();
    }

    public static void createNewTest(Method method)
    {
        extentTest = extentReport.createTest(method.getName());

        currentTestName = method.getName();
    }

    public static void passStep(String stepName)
    {
        extentTest.log(Status.PASS, stepName);
    }

    public static void failStep(String stepName)
    {
        extentTest.log(Status.FAIL, stepName);
    }
}
