package copyReference;

import java.io.*;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/11/15 16:38
 */
@SuppressWarnings("uncheck")
public class SerializationUtil {
    public static <T> T clone(T obj){
        T cloneObject = null;
        cloneObject = getT(obj, cloneObject);
        return cloneObject;
    }

    private static <T> T getT(T obj, T cloneObject) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(obj);
            obs.close();

            ByteArrayInputStream input = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream obi = new ObjectInputStream(input);
            cloneObject = (T) obi.readObject();
            obi.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return cloneObject;
    }

}
