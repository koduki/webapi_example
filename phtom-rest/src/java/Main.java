
import java.lang.reflect.InvocationTargetException;
import externalservice.stub.ItemWebService_Service;
import model.Item;

import util.BeanUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hiro
 */
public class Main {

    public static void main(String[] args) throws Exception {

        externalservice.stub.Item item2 = new externalservice.stub.Item();
        item2.setId("a");
        item2.setTitle("b");

        Item item = BeanUtils.convert(item2, new Item());

        System.out.println(item);
        
    }
}