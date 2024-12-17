package ec.edu.uce.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/hello-world")
public class HelloResource {

    @GET
    @Produces("text/plain")
    @Path("save")
    public String saveEmployee(@QueryParam("name") String name) {
        Employee employee = new Employee();
        employee.setName();

    }


    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}