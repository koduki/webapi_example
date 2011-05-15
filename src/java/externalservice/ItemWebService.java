/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package externalservice;

import dataservice.ItemDao;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Item;

/**
 *
 * @author hiro
 */
@WebService(serviceName = "ItemWebService")
public class ItemWebService {

    /** This is a sample web service operation */
    @WebMethod(operationName = "get")
    public Item get(@WebParam(name = "id") String id) {
        ItemDao dao = new ItemDao();
        return dao.get(id);
    }
}
