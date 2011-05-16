/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hiro
 */
public class BeanUtilsTest {
    class Item {
        Integer id;
        String title;

        public Item() {
        }

        public Item(int id, String title) {
            this.id = id;
            this.title = title;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
    
    public BeanUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convert method, of class BeanUtils.
     */
    @Test
    public void testConvert() throws Exception {
        Item source = new Item();
        source.setId(1);
        source.setTitle("test");

        Item item = BeanUtils.convert(source, new Item());
        assertEquals(item.getId(), Integer.valueOf(1));
        assertEquals(item.getTitle(), "test");

        System.out.println(item);
    }
}
