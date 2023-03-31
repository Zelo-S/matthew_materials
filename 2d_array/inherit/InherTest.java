package inherit;

class A{
    private int num;

    public A(int one, int two){
        num = one+two;
    }
    
    public int getNum(){
        return this.num;
    }
}

class B extends A{ 
    
}

public class InherTest{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(1, 4);
        
        System.out.println(a1.getNum());
        System.out.println(a2.getNum());
        
    }
}