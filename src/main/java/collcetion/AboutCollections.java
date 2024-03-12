package collcetion;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collections - is a util class has static method to resolve Collection  question
 * @author hsl
 * @version 2.0.0
 * @date 2023/9/25 20:26
 */
public class AboutCollections {
    public void useCollection(){
        Integer max = Collections.max(Stream.of(1, 2, 3).collect(Collectors.toList()));
        //println max value
        System.out.println(max);
    }
}
