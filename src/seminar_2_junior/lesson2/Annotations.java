package seminar_2_junior.lesson2;

import seminar_2_junior.lesson2.rand.RandomInteger;
import seminar_2_junior.lesson2.rand.RandomIntegerProcessor;

public class Annotations {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        RandomIntegerProcessor.processRandomInteger(myClass);

        System.out.println(myClass.integer);
    }

    private static class MyClass {

        @RandomInteger(min = 2, max = 50)
        private int integer;

    }
}
