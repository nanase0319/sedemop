package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JAXB2XmlTest {

    public static void main(String[] args) throws JAXBException, IOException {
        
        List<Singer> list = new ArrayList<>();
        list.add(new Singer("jay", 8));
        list.add(new Singer("eason", 10));

        SingerList singerList = new SingerList();
        singerList.setSingers(list);

        String str = JAXB2XmlTest.beanToXml(singerList, SingerList.class);
        String path = "D:\\jay.txt";
        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(path)));
        bfw.write(str);
        bfw.close();

    }

    private static String beanToXml(Object obj, Class<?> load) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(load);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj,writer);
        return writer.toString();
    }
}

