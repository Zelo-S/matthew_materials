import java.util.ArrayList;

class A {
    public void say_hello(){
        System.out.println("Hello from A");
    }
}

class B extends A{
    public void say_neigh(){
        System.out.println("Neighed");
    }
}

class C extends A{
    public void say_bye(){
        System.out.println("Bye bye!");
    }
}

public class inher {
    public static void main(String[] args) {
        ArrayList<A> newArrayList = new ArrayList<A>();
        newArrayList.add(new A());
        newArrayList.add(new B());
        newArrayList.add(new C());
    } 
}
