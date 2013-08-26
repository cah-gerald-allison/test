package com.cardinal.ws.rest.resource;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
=======
import java.util.Date;
>>>>>>> abcd982aae5736f854df31d612dcdc602c5149ed

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

<<<<<<< HEAD
import com.cardinal.ws.rest.Person;

=======
>>>>>>> abcd982aae5736f854df31d612dcdc602c5149ed

@Path(value = "/theData")
public class DataResource {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPatientList(@Context HttpHeaders headers) {
		
    	Response.ResponseBuilder builder = Response.ok();
    	
<<<<<<< HEAD
    	Person tim = new Person();
    	tim.setFirstName("Tim");
    	tim.setLastName("Johnson");    	
    	tim.setFavoriteMovie("Heat");

    	Person jerry = new Person();
    	jerry.setFirstName("Jerry");
    	jerry.setLastName("Allison");    	
    	jerry.setFavoriteMovie("Jerry Gone Wild: College Years");    	
    	
    	List peeps = new ArrayList<Person>();
    	peeps.add(tim);
    	peeps.add(jerry);
    	
    	Map myMap = new HashMap();
    	myMap.put("items", peeps);
    	
		try {
    	
			builder = Response.ok(myMap, MediaType.APPLICATION_JSON);
=======
		Date d = new Date();
		
		try {
    	
			builder = Response.ok(d, MediaType.APPLICATION_JSON);
>>>>>>> abcd982aae5736f854df31d612dcdc602c5149ed
			
    	}
        catch (Exception e) {
       		builder = Response.serverError();
       		
   		}       
       	return builder.build();
     }	
	
}
