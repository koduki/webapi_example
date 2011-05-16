/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import model.Item;

/**
 *
 * @author hiro
 */
public class ItemDao {
    public Item get(String id){
        return new Item(id, "Hello World");
    }
}
