public class Book {
    int i = 0;
    Book increase(){
        i++;
        return this;
    }
    void show(){
        System.out.println(i);
    }
    public static void main(String[] args){
        Book tt = new Book();
        tt.increase().increase().increase().show();
    }
}
