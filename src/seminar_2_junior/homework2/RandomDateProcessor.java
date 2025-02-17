package seminar_2_junior.homework2;

import seminar_2_junior.lesson2.rand.RandomInteger;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateProcessor {
    LocalDateTime startDate = LocalDateTime.MIN;
    LocalDateTime endDate = LocalDateTime.MAX;

    public static void processRandomDate(Object obj) {
        for (Field declaredField : obj.getClass().getDeclaredFields()) {
            RandomDate annotation = declaredField.getAnnotation(RandomDate.class);
            if (annotation != null) {

                long min = annotation.min();
                long max = annotation.max();

                declaredField.setAccessible(true);

                try {
                    declaredField.set(obj, new Date (
                            ThreadLocalRandom
                            .current()
                            .nextLong(min, max)
                    ));
                } catch (IllegalAccessException e) {
                    System.err.println("Не удалось подставить рандомное значение: " + e);
                }
            }
        }
    }
}
