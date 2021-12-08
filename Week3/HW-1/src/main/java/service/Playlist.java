package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import spec.RequestSpec;

public class Playlist extends RequestSpec {

    public Playlist() {
        super();
    }

    String createPlaylistRequestBody = "{\n" +
            "  \"name\": \"Spotify Api Test\",\n" +
            "  \"description\": \"New playlist description\",\n" +
            "  \"public\": false\n" +
            "}";

    String updatePlaylistRequestBody = "{\n" +
            "  \"name\": \"Updated Spotify Api Test\",\n" +
            "  \"description\": \"Updated playlist description\",\n" +
            "  \"public\": false\n" +
            "}";

    public Response cretePlaylist(String userID, ResponseSpecification responseSpecification){
        return RestAssured.given()
                .spec(super.getRequestSpecification())
                .body(createPlaylistRequestBody)
                .when()
                .post("/users/{user_id}/playlists",userID)
                .then()
                .spec(responseSpecification)
                .extract()
                .response();
    }

    public Response changePlaylist(String playlistID, ResponseSpecification responseSpecification){
        return RestAssured.given()
                .spec(super.getRequestSpecification())
                .body(updatePlaylistRequestBody)
                .when()
                .put("/playlists/{playlist_id}",playlistID)
                .then()
                .spec(responseSpecification)
                .extract()
                .response();
    }
}
