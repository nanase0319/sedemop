package generics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2024/2/23 16:29
 */
public class ExamInterfaceImplTest {

    @Test
    public void getValue() {
        ExamInterface examInterface = new ExamInterfaceImpl();
        System.out.println(examInterface.getValue());
    }
}