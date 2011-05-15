/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import apiservice.ItemService;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import model.Item;

/**
 * REST Web Service
 *
 * @author hiro
 */
@Path("item")
public class ItemResource {

    @Context
    private UriInfo context;

    /** Creates a new instance of ItemResource */
    public ItemResource() {
    }

    /**
     * Retrieves representation of an instance of webservice.ItemResource
     * @return an instance of model.Item
     */
    @GET
    @Produces("application/xml")
    @Path("{id}")
    public Item get(@PathParam("id") String id) {
        ItemService service = new ItemService();
        return service.getItem(id);
    }

    /**
     * PUT method for updating or creating an instance of ItemResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(Item content) {
    }
}
