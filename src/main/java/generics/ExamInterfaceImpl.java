package generics;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2024/2/23 16:28
 */
public class ExamInterfaceImpl implements ExamInterface<String> {
    @Override
    public String getValue() {
        return "test:genericsInterface";
    }
}
