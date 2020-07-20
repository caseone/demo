import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaTest {

    public static void f1(){
        List<String> list= Arrays.asList("a", "b", "c", "d");

        List<String> collect =list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]
    }

    public static void main(String[] args) {
        System.out.println("main start...");

        f1();
    }
}
