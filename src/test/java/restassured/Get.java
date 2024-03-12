package restassured;

import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Response;

import static io.restassured.RestAssured.*;
public class Get {
  @Test
  public void f() {
	  baseURI="https://reqres.in/";
	  String listuser_endpoint="api/users?page=2";
	  
	//Response listusergetresponse=get(baseURI+listuser_endpoint);
	//listusergetresponse.prettyPrint;
	
	  
  }
}
