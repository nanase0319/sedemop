package xml;

import javax.xml.bind.annotation.XmlAttribute;

public class Singer {

    private String name;
    private int age;
    public Singer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @XmlAttribute(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @XmlAttribute(name="age")
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}