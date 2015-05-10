package com.meistermeier.mvc.beer.web;

import com.meistermeier.mvc.beer.model.Beer;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static com.google.common.collect.Lists.newArrayList;

@Path("/")
public class BeerController {

    @Inject
    Models models;

    @GET
    @Controller
    public String beerList() {
        models.put("beers", newArrayList(new Beer(1L, "tasty"), new Beer(2L, "ugly")));
        return "list.html";
    }

    @Path("{beerId}/")
    @GET
    @Controller
    public Response beerDetails(@PathParam("beerId") String beerId) {
        models.put("beer", new Beer(1L, "tasty"));
        return Response.status(Response.Status.OK).entity("details.html").build();
    }


    @Path("{beerId}/")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Beer jsonDetails(@PathParam("beerId") String beerId) {
        return new Beer(1L, "super beer");
    }

}
