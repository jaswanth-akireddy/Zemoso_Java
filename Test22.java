import java.util.*;
public class Test22{
    public static void main(String[] args) {
        Bmw b1=new Bmw();
        System.out.println(b1.name);
        System.out.println(b1.year);
    }
}
interface car{
     void engine();
     void tires();
}
class Bmw implements car{
    String name;
    int year;
    Bmw(){
        
    }
    public void engine(){
        System.out.println("enginee running");
    }
    public void tires(){
        System.out.println("Tires working");
    }
}