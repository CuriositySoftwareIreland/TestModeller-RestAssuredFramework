package pages;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

/**
 * Generic API Testing Interface
 */
public class GenericAPICall extends  BasePage{
    public GenericAPICall(RestAssured restAssured)
    {
        super(restAssured);
    }

    /**
     * Post a message to an API
     * @name Post
     * @param url Endpoint URL
     * @param resource Resource
     * @param msg Message
     */
    public Response Post(String url, String resource, String msg)
    {
        restAssured.baseURI = url;

        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);
        httpRequest.body(msg);

        Response response = httpRequest.post(resource);

        return response;
    }

    /**
     * Put a message to an API
     * @name Put
     * @param url Endpoint URL
     * @param resource Resource
     * @param msg Message
     */
    public Response Put(String url, String resource, String msg)
    {
        restAssured.baseURI = url;

        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);
        httpRequest.body(msg);

        Response response = httpRequest.put(resource);

        return response;
    }

    /**
     * Get from an API
     * @name Get
     * @param url Endpoint URL
     * @param resource Resource
     */
    public Response Get(String url, String resource)
    {
        restAssured.baseURI = url;

        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);

        Response response = httpRequest.get(resource);

        return response;
    }

    /**
     * Delete from an API
     * @name Delete
     * @param url Endpoint URL
     * @param resource Resource
     */
    public Response Delete(String url, String resource)
    {
        restAssured.baseURI = url;

        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);

        Response response = httpRequest.delete(resource);

        return response;
    }

    /**
     * Assert status code in API response
     * @name Assert Response Status
     * @param response Response
     * @param statusCode Status Code
     */
    public void AssertStatusCode(Response response, String statusCode)
    {
        if (response.getStatusCode() != Integer.parseInt(statusCode)) {
            Assert.fail("Expected response code " + statusCode + " received " + response.getStatusCode() + " with response " + response.getBody().prettyPrint());
        }
    }

    /**
     * Assert API response contains path
     * @name Assert Response Contains
     * @param response Response
     * @param jsonPath JSON Path
     */
    public void AssertMessageContains(Response response, String jsonPath)
    {
        if (response.getBody().jsonPath().get(jsonPath) == null) {
            Assert.fail("Expected response to contain path " + jsonPath + " received response " + response.getBody().prettyPrint());
        }
    }

    /**
     * Assert API message contains value
     * @name Assert Response Contains Value
     * @param response Response
     * @param jsonPath JSON Path
     * @param value Value
     */
    public void AssertMessageContainsValue(Response response, String jsonPath, String value)
    {
        if (response.getBody().jsonPath().get(jsonPath) == null || !response.getBody().jsonPath().get(jsonPath).equals(value)) {
            Assert.fail("Expected response to contain path " + jsonPath + " with value " + value + " received response " + response.getBody().prettyPrint());
        }
    }
}
