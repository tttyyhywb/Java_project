package kevin.test.about

import kevin.test.BaseApiTest
import org.junit.Test

import io.restassured.RestAssured.given

class AboutControllerApiTest : BaseApiTest() {

    @Test
    fun about() {
        given()
                .get("/about")
                .then()
                .log().all()


    }
}
