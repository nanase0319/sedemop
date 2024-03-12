public class DeepCopyExample implements Cloneable {
    private String str;

    public DeepCopyExample(String str) {
        this.str = new String(str);  // 使用 new String() 创建新对象，而不是直接复制引用
    }

    @Override
    public DeepCopyExample clone() throws CloneNotSupportedException {
        DeepCopyExample copy = (DeepCopyExample) super.clone();
        copy.str = new String(this.str);  // 复制字符串对象
        return copy;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopyExample original = new DeepCopyExample("Hello");
        DeepCopyExample copied = original.clone();
        System.out.println(copied.str == original.str);  // 输出 false，因为引用的是不同的对象
    }
}