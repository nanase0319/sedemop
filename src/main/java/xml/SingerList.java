package xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2024/2/22 16:16
 */
@XmlRootElement(name="list")
public class SingerList {

    private List<Singer> singers;

    @XmlElement(name="singer")
    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
    }
}
