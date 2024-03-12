package copyReference;

import lombok.ToString;

import java.io.Serializable;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/11/15 17:04
 * sll
 */
@ToString
public class ExamTwo implements Serializable {
    private static final long serialVersionUID = 6990633400257279907L;
    private String words;

    public String getWords() {
        return words;
    }


    public void setWords(String words) {
        this.words = words;
    }
}
