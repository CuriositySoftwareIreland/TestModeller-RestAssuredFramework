package pages;

import io.restassured.RestAssured;

public class BasePage {
    RestAssured restAssured;

    public BasePage(RestAssured restAssured)
    {
        this.restAssured = restAssured;
    }

}
