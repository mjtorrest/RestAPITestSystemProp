package mx.joe.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;



@Path("/properties")
public class Services {
	
	public static String getSystemProperty(String nameProperty) {
		return System.getProperty(nameProperty);
	}
	
	@GET
	@Path("/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStatusProperty(@PathParam("name") String name) {
		
		String propertyValue = null;
		propertyValue = getSystemProperty(name);
		
		if(propertyValue == null) {
			return Response.status(Status.NOT_FOUND).entity("This property: "+name+", is not set").build();
		} else {
			return Response.status(Status.OK).entity(name + ": "+propertyValue).build();
		}
	}
}
