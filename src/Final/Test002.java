package Final;

public class Test002 {
    public static void print(Parent p) {
        System.out.println(p.i);
        System.out.println(p.get());
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);
        System.out.println(p.get());

        Child c = new Child();
        System.out.println(c.i);
        System.out.println(c.get());

        Parent cp = new Child();
        System.out.println(cp.i);
        System.out.println(cp.get());

        print(c);
        print(cp);
    }
}

class Parent {
    int i = 10;
    public int get(){
        return i;
    }
}

class Child extends Parent {
    int i = 8;
    public int get(){
        return i;
    }
}
