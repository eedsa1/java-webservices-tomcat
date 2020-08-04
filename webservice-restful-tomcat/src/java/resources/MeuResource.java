/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author INGRID-PC
 */
@Path("/meures")
public class MeuResource {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHello(){
        return "Hello";
    }
}
