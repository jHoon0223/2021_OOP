package Final;

class ChildException extends Exception {}
class GrandChildException extends ChildException {}

public class ExceptionHandlingTest2 {
    public static void main(String[] args) {
        try {
            throw new GrandChildException();
        }
        catch(GrandChildException g) {
            System.out.println("Grand");
        }
        catch(ChildException c) {
            System.out.println("Child");
        }

        try {
            throw new GrandChildException();
        }
        catch(ChildException c) {
            System.out.println("ChildException");
        }
    }
}
