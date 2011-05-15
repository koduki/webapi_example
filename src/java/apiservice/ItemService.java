/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apiservice;

import externalservice.stub.ItemWebService_Service;
import model.Item;
import util.BeanUtils;
import util.ConvertException;

/**
 *
 * @author hiro
 */
public class ItemService {

    public Item getItem(String id) throws ConvertException {
        externalservice.stub.ItemWebService service = new ItemWebService_Service().getItemWebServicePort();
        externalservice.stub.Item item = service.get(id);

        return BeanUtils.convert(item, new Item());
    }
}
