package matera.systems.cursoferias2018.api.resources;

import org.junit.Test;

import io.restassured.RestAssured;

/**
 * Created by rochapaulo on 04/09/17.
 */
public class HealthCheckResourceIT {

    @Test
    public void run() {

        RestAssured
            .given()
                .get("http://localhost:8080/health")
            .then()
                .statusCode(200);
    }

}
