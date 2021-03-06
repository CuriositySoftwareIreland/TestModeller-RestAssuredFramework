package utilities.testmodeller;

import ie.curiositysoftware.runresult.dto.TestPathRunStatusEnum;
import ie.curiositysoftware.runresult.dto.TestPathRunStep;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TestModellerLogger {
    public static List<TestPathRunStep> steps = new ArrayList<TestPathRunStep>();

    public static String LastNodeGuid;

    public static void LogMessage(String name, String description, TestPathRunStatusEnum status)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(name);
        step.setStepDescription(description);
        step.setTestStatus(status);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }

    public static void FailStep(String stepName, String details)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(stepName);
        step.setStepDescription(details);
        step.setTestStatus(TestPathRunStatusEnum.Failed);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }

    public static void PassStep(String stepName)
    {
        TestPathRunStep step = new TestPathRunStep();

        step.setStepName(stepName);
        step.setTestStatus(TestPathRunStatusEnum.Passed);
        step.setNodeGuid(LastNodeGuid);

        steps.add(step);
    }


    public static void SetLastNodeGuid(String guid)
    {
        LastNodeGuid = guid;
    }

    public static void ClearMessages()
    {
        steps.clear();
    }

}
