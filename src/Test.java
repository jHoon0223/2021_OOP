/*class Shape {
    protected String name;
    public void paint(){
        draw();
    }
    public void draw() {
        System.out.println("Shape");
    }
}

public class Test extends Shape{
    protected String name;
    @Override
    public void draw() {
        name = "Circle";
        super.name = "Shape";
        super.draw();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Shape b = new Test();
        b.paint();
    }
}*/