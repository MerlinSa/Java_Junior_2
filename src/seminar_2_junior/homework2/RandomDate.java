package seminar_2_junior.homework2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD})
public @interface RandomDate {

    //UNIX timestamp - количество миллисекунд, прошедших с 1 января 1970 года по UTCO.
    long min() default 1704056400L * 1000;//1704056400L; // 1 января 2024 UTC-3

    long max() default 1735592400L * 1000; //1735592400L;
}
