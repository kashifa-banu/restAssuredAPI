import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PutAndDelete {

    @Test
    public void test3(){
        baseURI = "https://reqres.in/api";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","morpheus");
        jsonObject.put("job","leader");
        String a = given().body(jsonObject.toJSONString()).when().post("/users").
                then().extract().path("id");
        System.out.println(a);
        //https://reqres.in/api/users/2
        jsonObject.put("job","abc");
      given().body(jsonObject.toJSONString()).when().put("/users/890").then().log().all();
       // given().body(jsonObject.toJSONString()).when().pat("/users/2").then().log().all();

    }

    @Test
    public void testPatch(){
        baseURI = "https://reqres.in/api";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","morpheus");
        jsonObject.put("job","leader");
        String a = given().body(jsonObject.toJSONString()).when().post("/users").
                then().extract().path("id");
        System.out.println(a);
        //https://reqres.in/api/users/2
        jsonObject.put("job","abc");
        given().body(jsonObject.toJSONString()).when().patch("/users/7890").then().log().all();
       // given().body(jsonObject.toJSONString()).when().pat("/users/2").then().log().all();

    }
    @Test
    public void testdelete(){
        baseURI = "https://reqres.in/api";
        //https://reqres.in/api/users/2
        given().when().delete("/users/2").then().log().all();
        // given().body(jsonObject.toJSONString()).when().pat("/users/2").then().log().all();

    }
}
