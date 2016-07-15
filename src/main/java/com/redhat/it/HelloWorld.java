package com.redhat.it;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.Optional;

@Path("/sayHello")
public class HelloWorld {

    @GET
    @Produces("text/plain")
    public String sayHello(@QueryParam("name") String name) {
        return "Hello " + Optional.ofNullable(name).orElse("") + "!";
    }
}
