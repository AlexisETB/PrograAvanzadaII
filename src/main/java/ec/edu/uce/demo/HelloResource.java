package ec.edu.uce.demo;

import ec.edu.uce.demo.Entities.Employee;
import ec.edu.uce.demo.Services.EmployeeService;
import jakarta.inject.Inject;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Order;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import java.util.List;

@Path("/hello-world")
public class HelloResource {

    @Inject
    EmployeeService employeeService;

    @GET
    @Produces("text/plain")
    @Path("save")
    public String saveEmployee(@QueryParam("name") String name) {
        Employee employee = new Employee();
        employee.setName(name);
        return "a";
    }

    @GET
    @Produces("text/plain")
    @Path("age")
    public String age(@QueryParam("age") int age) {
        List<Employee> employees = employeeService.getEmployeesByAge(age);
        for (Employee employee : employees) {

        }
        return "Empleados por edad";
    }


    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}