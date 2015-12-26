package hms.dropWizardEx.resources;

import hms.dropWizardEx.domain.Developer;
import hms.dropWizardEx.domain.Response;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;

/**
 * Created by dasuni on 12/17/15.
 */
@Path("/developer")
public class DeveloperResource {

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Developer sayHello(@PathParam("name") String name) {
        return new Developer(1,name,"sfsd@gmail.com");
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Developer developer) {

        String result = "Developer saved : " + developer.getName();

        return new Response("success","hello",developer);
        //return Response.status(200).entity(result).build();
       // return Response.ok(developer).type(MediaType.APPLICATION_JSON_TYPE).build();
    }

}
