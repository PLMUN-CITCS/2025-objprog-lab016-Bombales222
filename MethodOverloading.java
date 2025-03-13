public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        
        obj.display(10);
        obj.display(3.14);
        obj.display("Hello!");
    }

    public void display(int value) {
        System.out.println("Integer value: " + value);
    }

    public void display(double value) {
        System.out.println("Double value: " + value);
    }

    public void display(String value) {
        System.out.println("String value: " + value);
    }
}