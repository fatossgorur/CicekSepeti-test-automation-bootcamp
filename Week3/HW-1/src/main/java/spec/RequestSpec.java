package spec;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    RequestSpecification requestSpecification;
    public String baseURL= "https://api.spotify.com/v1";
    public String token = "BQCrwC4O9AJC2hE1XABUvWU0itFUYdrQe4JIu2ht8iNRkIcaNp15H3UAuO0DWDNN_t9pTTtze60r6mYLgoQA1MROy69wPO96KpHdKGGQJzr9Mxrqx5VazEWxNSmHQIegUWOc30MUR-7BZHOslMQI3_KXacn17PPR30TxWZUWKQvO3IKJhJ05SUFM29RDVCnnmFi4JNfgYuaPr4-Ss0JFQ49VZlZnWGq6LcHv5It-sb3ftaOH8rIJhQ";

    public RequestSpec(){
        requestSpecification=  new RequestSpecBuilder()
                .setBaseUri(baseURL)
                .addHeader("Authorization","Bearer " +token)
                .setContentType("application/json")
                .setAccept("application/json")
                .build();
    }

    public RequestSpecification getRequestSpecification() {return requestSpecification;}
}
