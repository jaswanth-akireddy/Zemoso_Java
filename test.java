
public class test extends A{
    String hola;
    test(int name,int age,String h){
        super(name,age);
        hola=h;
    }

    public static void main(String[] args) {
        test a1=new test(99,10,"jash");
        System.out.println(a1.age+"  "+a1.name+"  "+a1.hola);
    }
}
class A{
    int name;
    int age;
    A(int n , int a ){
        name=n;
        age=a;
    }
}