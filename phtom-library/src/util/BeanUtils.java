/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author hiro
 */
public class BeanUtils {

    public static <T> T convert(Object source, T target) throws ConvertException {

        Field[] fileds = source.getClass().getDeclaredFields();
        for (Field f : fileds) {
            try {
                String name = f.getName();
                Object getter = org.apache.commons.beanutils.BeanUtils.getProperty(source, name);
                org.apache.commons.beanutils.BeanUtils.setProperty(target, name, getter);
            } catch (IllegalAccessException ex) {
                throw new ConvertException(ex);
            } catch (InvocationTargetException ex) {
                throw new ConvertException(ex);
            } catch (NoSuchMethodException ex) {
                throw new ConvertException(ex);
            }
        }

        return target;
    }
}
