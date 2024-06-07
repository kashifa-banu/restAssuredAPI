import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetAndPost {
    @Test
    public void test2(){
        baseURI = "https://reqres.in/api";
        //given().when().get("/unknown").then().log().all();

        //https://reqres.in/api/users
//        Map m = new HashMap();
//        m.put("name","morpheus");
//        m.put("job","leader");
//        String m = "{\n" +
//                "    \"name\": \"morpheus\",\n" +
//                "    \"job\": \"leader\"\n" +
//                "}";
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("name","morpheus");
//        jsonObject.put("job","leader");
//        String a = given().body(jsonObject.toJSONString()).when().post("/users").
//                then().extract().path("id");
//        System.out.println(a);

       // https://reqres.in/api/register
        JSONObject registerObject = new JSONObject();
        registerObject.put("email","eve.holt@reqres.in");
        registerObject.put("password","pistol");
       // registerObject.put("username","asdf");
        given().body(registerObject.toJSONString()).when().post("/login").then().log().all();
    }
}
