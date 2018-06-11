
import java.io.Serializable;

public class TestPoJo  implements Serializable {
    private int a;
    private String b;
    private TesEnum tesEnum;

    public  TestPoJo(int a,String b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public TesEnum getTesEnum() {
        return tesEnum;
    }

    public void setTesEnum(TesEnum tesEnum) {
        this.tesEnum = tesEnum;
    }

    @Override
    public String toString() {
        return "TestPoJo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
