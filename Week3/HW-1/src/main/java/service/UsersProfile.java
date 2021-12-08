package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import spec.RequestSpec;

public class UsersProfile extends RequestSpec {

    public UsersProfile() {
        super();
    }

    public  Response getCurrentUsers(ResponseSpecification responseSpecification){
        return RestAssured.given()
                .spec(super.getRequestSpecification())
                .when()
                .get("/me")
                .then()
                .spec(responseSpecification)
                .extract()
                .response();
    }

    public Response getUsersWithID(String profileID, ResponseSpecification responseSpecification) {
        return RestAssured.given()
                .spec(super.getRequestSpecification())
                .when()
                .get("/users/{user_id}", profileID)
                .then()
                .spec(responseSpecification)
                .extract()
                .response();
    }
}
