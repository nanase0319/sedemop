package generics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2024/2/23 16:33
 */
public class ExamMethodTest {

    @Test
    public void test1() {
        new ExamMethod().test(new ExamClass(), new ExamInterfaceImpl());
    }
}