/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apiservice;

import messagehubservice.stub.ItemWebService_Service;
import model.Item;

/**
 *
 * @author hiro
 */
public class ItemService {

    public Item getItem(String id) {
        ItemWebService_Service factory = new ItemWebService_Service();
        messagehubservice.stub.ItemWebService service = factory.getItemWebServicePort();
        messagehubservice.stub.Item item = service.get(id);
     
        Item item2 = new Item();
        item2.setId(item.getId());
        item2.setTitle(item.getTitle());
        
        return item2;
    }
    
}
