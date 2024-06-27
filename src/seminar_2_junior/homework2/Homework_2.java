package seminar_2_junior.homework2;

import java.util.Date;

public class Homework_2 {
    /**
     * Создать аннотацию RandomDate со следующими возможностями:
     * 1.1. Если параметры не заданы, то в поле должна вставляться рандомная дата ТКУЩЕГО года.
     * 1.2 Аннотация должна работать ТОЛЬКО с полями java.util.Date и java.time.Localdate.
     * 1.3. Должна генерить дату в диапазоне [min, max].
     * 1.4. ** Научиться работать с полями LocalDateTime, LocalDate etc.
     */
    // TODO
//    private static @interface RandomDate{
//        //UNIX timestamp - количество миллисекунд, прошедших с 1 января 1970 года по UTCO.
//        long min() default 1704056400L;
//        long max() default 1735592400L;
//
//    }


    public static void main(String[] args) throws IllegalAccessException {
        MyClass myClass = new MyClass();
        RandomDateProcessor.processRandomDate(myClass);

        System.out.println(myClass.randomDate);
    }

    private static class MyClass {
        @RandomDate
        private Date randomDate;

    }
}
