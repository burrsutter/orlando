package com.burrsutter.orlando;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TodoResource {
  @GET
  public List<Todo> getAll() {
    return Todo.listAll();
  }
  @POST
  @Transactional
  public Response create(
    //@Valid 
    Todo item) {
    // item.id = null;
    item.persist();
    return Response.ok(item).status(201).build();
  }
}