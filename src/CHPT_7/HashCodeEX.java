package CHPT_7;

import java.util.HashSet;
import java.util.Objects;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point)obj;
        if (x == p.x && y == p.y)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Circle {
    Point center;
    int radius;

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle(center = " + center + "radius = " + radius + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Circle c = (Circle)obj;
        if (center.equals(c.center) && radius == c.radius)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}

public class HashCodeEX {
    public static void main(String[] args) {
        HashSet<Circle> set = new HashSet<>();
        set.add(new Circle(new Point(1, 2), 2));
        set.add(new Circle(new Point(1, 2), 2));
        set.add(new Circle(new Point(3, 4), 2));
        set.add(new Circle(new Point(4, 5), 2));
        set.add(new Circle(new Point(5, 6), 2));

        System.out.println("size : " + set.size());

        for (Circle c: set)
            System.out.println(c.toString() + "\t");
    }
}
