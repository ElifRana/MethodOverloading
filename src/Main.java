public class Main {

    public static void display(int number){
        System.out.println("Tamsayı verileri: " + number);
    }

    public static void display(int number, int number1){
        System.out.println("Tamsayı verileri: " + number + ", " + number1);
    }

    public static void display(String name) {
        System.out.println("String nesneleri: " + name);
    }

    public static void main(String[] args) {

        display(17);
        display(1, 2);
        display("Rana");

    }
}
