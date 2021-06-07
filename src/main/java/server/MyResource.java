package server;

import controllers.DataSourceController;
import controllers.UserController;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/")
public class MyResource {

	
	//to authorize sign in
	@Path("/signin")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response userSignIn(@QueryParam("phoneNumber")String phoneNumber,@QueryParam("password")String password){
	    System.out.println(phoneNumber+" "+password);
	    return Response.ok(200).entity(new UserController().signIn(phoneNumber,password)).header("Access-Control-Allow-Origin", "*").build();
	}
	

	//to get chart-data of a particular user
	@Path("/getchartdata")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMostKeywords(@QueryParam("phone")String phone) {
	    return Response.ok(200).entity(new DataSourceController().getMostSearched(phone) ).header("Access-Control-Allow-Origin", "*").build() ;
	}
	
	//to get the user's previously searched keyword data
	@Path("/keyworddata")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getKeywordData(@QueryParam("phone")String phone){
	    return Response.ok(200).entity(new DataSourceController().getAllKeywords(phone)).header("Access-Control-Allow-Origin", "*").build();
	}
}
