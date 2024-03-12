package generics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2024/2/23 16:25
 */
public class ExamClassTest {

    //generics class
    @Test
    public void getMember1() {
        ExamClass<Integer, String> sww = new ExamClass<>(1, "SWW");

        Integer member1 = sww.getMember1();
        String member2 = sww.getMember2();
    }


    @Test
    public void setMember1() {
    }

    @Test
    public void getMember2() {
    }

    @Test
    public void setMember2() {
    }
}