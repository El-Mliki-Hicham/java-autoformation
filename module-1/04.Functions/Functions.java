public class Functions {

    public static void main(String[] args) {
        int rest = buy(12);
        printMessage(rest);
        System.exit(1);

    }

    public static int buy(int pricePayed) {
        System.out.println("the t-chirt cost 30");

        int rest = (30 - pricePayed);
        return rest;
    }

    public static void printMessage(int rest) {
        System.out.println("Current value of rest = " + rest);
    }

}
