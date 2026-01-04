import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String randomWord = getRandomWord(rand);
        System.out.println(randomWord);
        char[] wordToArray = randomWord.toCharArray();
        int randomCharIndex = rand.nextInt(wordToArray.length);
        char randomWordChar = wordToArray[randomCharIndex];
        String wordLigne = "";
        boolean status = false ; 
        char[]  answerArray = new char[wordToArray.length]; 
        for (int i = 0; i < wordToArray.length; i++) {
            if (randomWordChar == wordToArray[i]) {
                wordLigne += randomWordChar;
                answerArray[i] = randomWordChar ;
            }else{
                answerArray[i] = "_".charAt(0) ;
                wordLigne += "_";
            }
        }
        for (int i = 0; i < gallows.length; i++) {

            System.out.println("----------------------------------");
            if(status){

                System.out.println(gallows[i-1]);
                i -=1 ; 
            }else{
                System.out.println(gallows[i]);
                
            }

            System.out.println("Word : " + new String(answerArray));

        char userWord = scanner.next().charAt(0);
        for (int c = 0; c < wordToArray.length; c++) {
            
            if (userWord == wordToArray[c]) {
                answerArray[c] = wordToArray[c];
                status = true ; 
                break;
            }else{

                status = false ; 
            }
        }
        if (wordLigne.equals(randomWord)) {
            System.out.println("Good job !!");
            break;
        }
        }
        System.out.println(Arrays.toString(answerArray));

        System.out.println(randomWord);

    }

    public static String getRandomWord(Random rand) {
        // get random Items
        int randomIndex = rand.nextInt(words.length);
        String randomWord = words[randomIndex];
        return randomWord;

    }

}
