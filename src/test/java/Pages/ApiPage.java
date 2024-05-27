package Pages;

import Helper.Endpoint;
import Helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;

import java.io.File;
import java.util.List;
import java.util.Objects;

import static Helper.Models.getLsitUser;
import static org.assertj.core.api.Assertions.assertThat;


public class ApiPage {
    String setURL;
    Response res;

    public void prepareURLValidFor(String URL){
        switch (URL){
            case "GET_LIST":
                setURL = Endpoint.GET_LIST;
                break;
            default:
                System.out.println("input right url");
        }
        System.out.println("Endpoint siap di pakai adalah : " + setURL);
    }

    public void hitAPIGetListData (){
        res = getLsitUser(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(int statusCode){
        assertThat(res.statusCode()).isEqualTo(statusCode);
    }

    public void validationResponseBodyGetListUser(){
        List<Objects> id = res.jsonPath().getList("data[0].id");
        List<Objects> title = res.jsonPath().getList("data[0].title");
        List<Objects> firstName = res.jsonPath().getList("data[0].firstName");
        List<Objects> lastName = res.jsonPath().getList("data[0].lastName");
        List<Objects> picture = res.jsonPath().getList("data[0].picture");

        Assertions.assertThat(id).isNotNull();
        Assertions.assertThat(title).isIn("mr", "ms", "mrs", "miss", "dr");
        Assertions.assertThat(firstName).isNotNull();
        Assertions.assertThat(lastName).isNotNull();
        Assertions.assertThat(picture).isNotNull();
    }

    public void validationResponseJsonWhitJSONSchema(String fileName){
        File JSONFile = Utility.getJSONSchema(fileName);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }
}
