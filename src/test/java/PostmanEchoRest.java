
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class PostmanEchoRest {
    @Test
    void shouldReturnPostRequest() {
        //Подход Given-When-Then
        //Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("fail test")
                //Выполняемые действия
                .when()
                .post("/post")
                //Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("test"));

    }
}


