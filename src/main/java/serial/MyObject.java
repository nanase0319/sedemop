package serial;

import java.io.*;

public class MyObject implements Serializable {
    private static final long serialVersionUID = 1L;

    private String field1;
    private transient String field2; // 使用 transient 关键字标记不需要序列化的字段

    // 构造方法、getter 和 setter 方法省略...

    // 覆盖 writeObject() 方法以自定义序列化过程
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // 序列化所有非瞬态和非静态字段
        out.writeObject(field2); // 序列化 field2 字段，尽管它被标记为 transient
    }

    // 覆盖 readObject() 方法以自定义反序列化过程
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // 反序列化所有非瞬态和非静态字段
        field2 = (String) in.readObject(); // 反序列化 field2 字段
    }
}