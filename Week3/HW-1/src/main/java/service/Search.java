package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import spec.RequestSpec;

public class Search extends RequestSpec {
    public Search() {
    }

    public Response getArtistTracks(ResponseSpecification responseSpecification){
        return RestAssured.given()
                .spec(super.getRequestSpecification())
                .queryParam("q", "mfö")
                .queryParam("type", "track")
                .queryParam("market", "TR")
                .get("/search")
                .then()
                .spec(responseSpecification)
                .extract()
                .response();
    }
}
