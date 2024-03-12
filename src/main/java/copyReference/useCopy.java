package copyReference;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/11/15 17:03
 */
public class useCopy {

    public static void main(String[] args) {

        ExamTwo examTwo = new ExamTwo();
        examTwo.setWords("dasaxx");
        Exam exam = new Exam();
        exam.setAge(1);
        exam.setNum(2);
        exam.setExamTwo(examTwo);

        Exam clone = SerializationUtil.clone(exam);
        examTwo.setWords("大手");
        System.out.println(exam);
        System.out.println(clone);
    }
}
