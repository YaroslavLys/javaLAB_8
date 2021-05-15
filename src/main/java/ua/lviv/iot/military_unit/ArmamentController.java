package ua.lviv.iot.military_unit;

import ua.lviv.iot.military_unit.models.Armament;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Path("armament")
public class ArmamentController {

    static final AtomicInteger id = new AtomicInteger(1);
    static final Map<Integer, Armament> armaments =
            new HashMap<>(Collections.singletonMap(id.get(), new Armament(id.get(), "Tank")));

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getArmament(@PathParam("id") int id) {
        if (armaments.containsKey(id)) {
            return Response.ok(armaments.get(id).toJson()).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllArmaments() {
        return Response.status(Response.Status.OK).entity(armaments).build();
    }

    @HEAD
    @Path("{id}")
    public Response getArmamentStatus(@PathParam("id") int id) {
        if (armaments.containsKey(id)) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createArmament(@FormParam("name") String name) {
        Armament armament = new Armament(id.incrementAndGet(), name);
        armaments.put(armament.getId(), armament);
        URI uri = UriBuilder.fromUri(Main.BASE_URI).path("armaments").path("" + armament.getId()).build();
        return Response.created(uri).build();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateOrCreateArmament(@PathParam("id") int id, @FormParam("name") String name) {
        Armament armament = new Armament(id, name);
        armaments.put(armament.getId(), armament);
        return Response.ok().entity(armament.toJson()).build();
    }

    @DELETE
    @Path("{id}")
    @Produces
    public Response deleteArmament(@PathParam("id") int id) {
        if (armaments.containsKey(id)) {
            Armament armament = armaments.remove(id);
            return Response.ok().entity(armament.toJson()).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
