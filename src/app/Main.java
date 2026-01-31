package app;

public class Main {
    public static void main(String[] args) {

    }

    public static String[] getData() {
        return new String[]{"Maks", "555 123-8596"};
    }

    public static Customer getCustomer(String [] data) {
        return new Customer(data[0], data[1]);
    }
}
