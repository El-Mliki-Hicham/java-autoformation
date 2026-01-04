public class While {
    public static void main(String[] args) {
        int number = rollDice();

        while (number != 3) {

            System.out.println(number);
            number = rollDice();
        }

        System.out.println("done with : " + number);
    }

    public static int rollDice() {
        int diceNumber = (int) (Math.random() * 5); // 0,1,2,3,4
        return diceNumber;
    }
}
