package Test.ApiTest;

import org.apache.http.HttpStatus;
import org.junit.Test;
import org.mozilla.javascript.ast.Scope;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import io.restassured.*;
import static com.jayway.restassured.RestAssured.*;

import java.net.URI;
import java.net.URISyntaxException;







public class outlook {
	
	@Test
	public void ourtest_0(){
		
		given().get("http://services.groupkt.com/country/get/iso2code/NG")
		.then()
		.statusCode(200)
		.log()
		.all();
	}
	
	@Test
	public void ourtest_print_out() throws URISyntaxException{
		
		         given()
				.accept(ContentType.JSON)
				.when()
				.get(new URI ("http://services.groupkt.com/country/get/iso2code/US"))
		        .then()
		        .assertThat()
		         .statusCode(HttpStatus.SC_OK);
		        // System.out.println(response.asString());
		         //http://services.groupkt.com/country/get/iso3code/BRA
		      }	
	
	@Test
	public void ourtest_3(){
		
		given().get("http://services.groupkt.com/country/get/iso2code/IND")
		.then()
		.statusCode(200)
		.log()
		.all();
	}
	@Test
	public void ourtest_4(){
		
		given().get("http://services.groupkt.com/country/get/iso2code/GBR")
		.then()
		.statusCode(200)
		.log()
		.all();
	}
	@Test
	public void assert_status() throws URISyntaxException{
		given()
		.accept(ContentType.JSON)
		.when()
		.get(new URI("http://services.groupkt.com/country/get/all"))
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK);
		
	}
	@Test
	public void ourtest_Test_USA_API() throws URISyntaxException{
		
        given()
		.accept(ContentType.JSON)
		.when()
		.get(new URI ("http://services.groupkt.com/country/get/iso2code/US"))
       .then()
       .assertThat()
        .statusCode(HttpStatus.SC_OK);
       // System.out.println(response.asString());
        //http://services.groupkt.com/country/get/iso3code/BRA

	}
}