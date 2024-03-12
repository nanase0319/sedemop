import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/3/20 11:37
 */
public class Split {

    public static void main(String[] args) {
        List<Long> list =new ArrayList<>();

        list.add(1L);
        list.add(2L);
        list.add(3L);

        Integer size = list.size();

        list = list.stream().filter(l -> !l.equals(1L)).collect(Collectors.toList());

        System.out.println(!size.equals(list.size()));


        list.stream().reduce((m1, m2) -> m1.compareTo(m2) < 0 ? m1 : m2).ifPresent(System.out::println);

        }
}
