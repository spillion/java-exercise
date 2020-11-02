import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
public @interface MyAnnotation {
    //注解定义变量的写法，后面一定需要（）
    String name() default "";
    int age() default -1;
}
