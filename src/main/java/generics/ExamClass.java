package generics;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2024/2/23 16:23
 */
public class ExamClass<K,V> {
    //member K
    K member1;

    V member2;

    public ExamClass() {
    }

    public ExamClass(K member1, V member2) {
        this.member1 = member1;
        this.member2 = member2;
    }

    public K getMember1() {
        return member1;
    }

    public void setMember1(K member1) {
        this.member1 = member1;
    }

    public V getMember2() {
        return member2;
    }

    public void setMember2(V member2) {
        this.member2 = member2;
    }


}
