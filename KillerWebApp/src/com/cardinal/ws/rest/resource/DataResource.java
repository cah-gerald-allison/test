package com.cardinal.ws.rest.resource;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path(value = "/theData")
public class DataResource {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPatientList(@Context HttpHeaders headers) {
		
    	Response.ResponseBuilder builder = Response.ok();
    	
		Date d = new Date();
		
		try {
    	
			builder = Response.ok(d, MediaType.APPLICATION_JSON);
			
    	}
        catch (Exception e) {
       		builder = Response.serverError();
       		
   		}       
       	return builder.build();
     }	
	
}
