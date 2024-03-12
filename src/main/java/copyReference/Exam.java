package copyReference;

import lombok.ToString;

import java.io.Serializable;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/11/15 17:04
 */
@ToString
public class Exam implements Serializable {
    private static final long serialVersionUID = -7146282176226132272L;

    private int age;
    private int num;
    private ExamTwo examTwo;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ExamTwo getExamTwo() {
        return examTwo;
    }

    public void setExamTwo(ExamTwo examTwo) {
        this.examTwo = examTwo;
    }
}
