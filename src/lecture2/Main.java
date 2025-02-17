package lecture2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Reflection API.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> car = Class.forName("lecture2.Car");     //для создания объекта по конструктору по умол.//Class <?> означает Класс с каким-то типом, пока неизвестно. Class.forName позволяет достать класс по имени.
        Constructor<?>[] constructors = car.getConstructors();    //инфо о конструкторов в массиве.
        //System.out.println(constructors);
        Object gaz = constructors[0].newInstance("ГАЗ");
        System.out.println(gaz);

        Field[] fields = gaz.getClass().getFields();
        int tmp = fields[fields.length - 1].getInt(gaz);
        fields[fields.length - 1].setInt(gaz, tmp *2);

        System.out.println(gaz);

        Method[] methods = gaz.getClass().getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i]);
        }
    }


}
