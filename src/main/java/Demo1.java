import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/3/3 16:24
 */
public class Demo1 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Object> set2 = new HashSet<>();
        set1.addAll(Stream.of(347,341,344,126,241,225,368,372,370,353,345,369,351,350,371,223,317,378,383,380,236,184,346,231,239).collect(Collectors.toSet()));
        set2.addAll(Stream.of(383,380,378,372,371,370,369,368,353,351,350,348,347,346,345,344,341,241,239,236,231,225,184,126).collect(Collectors.toSet()));
        set1.removeAll(set2);
        System.out.println(set1);
        System.out.println(set1.size());

    }
}
