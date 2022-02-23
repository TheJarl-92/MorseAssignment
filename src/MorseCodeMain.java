import java.util.Locale;
import java.util.Scanner;

public class MorseCodeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String question = "";

        System.out.println("Welcome to the morse/english converter.");
        System.out.println("Which one do you want to do?");
        System.out.println("A. Convert english letters to morse code?");
        System.out.println("B. Convert morse code to english letters?");
        System.out.println("C. Oops I didn't want to end up here, please let me out.");
        System.out.print("Please select a choice (A, B, C): ");


        String userInput;
        boolean switchLoop = true;
        question = scan.nextLine();
        while (switchLoop) {
            switch (question.toUpperCase(Locale.ROOT)) {
                //switch case som ser till att jag bara kan få rätt alternativ ganska lätt
                //och en while loop för att köra igenom det från rätt plats där felet blev.
                //Ser också till att inputten alltid är stor bokstav så man kan skriva med stor eller liten
                case "A":
                    MorseCodeToMorse morse = new MorseCodeToMorse();
                    System.out.print("Write in your letters: ");
                    userInput = scan.nextLine();
                    if (morse.convertToMorse(userInput).contains("null")) {
                        System.out.println("You probably used a special sign or letter. Please only use english letters or numbers. ('.' & ',' & '?' also work)");
                        question = "A";
                        break;
                        //Om null uppstår, skriv om hela inputten igen.
                    }
                    if (morse.convertToMorse(userInput).contains("| |")) {
                        System.out.println("You used more than one space, please only use one.");
                        question = "A";
                        break;
                    }
                    //Om dubbelspace uppstår på något ställe, skriv om igen.

                    System.out.println(morse.convertToMorse(userInput));
                    switchLoop = false;
                    break;
                case "B":
                    MorseCodeToEnglish english = new MorseCodeToEnglish();
                    System.out.print("Write in your morse code: ");
                    userInput = scan.nextLine();
                    if (english.convertToEnglish(userInput).contains("null")){
                        System.out.println("Something went wrong here. Please write the morse code correctly.");
                        question = "B";
                        break;
                    }
                    //Samma här, om null uppstår skriv om det man vill översätta.

                    System.out.println(english.convertToEnglish(userInput));
                    switchLoop = false;
                    break;
                case "C":
                    System.out.println("Well okay then. Here's the exit. Off you go then.");
                    switchLoop = false;
                    break;
                    //Ett onödigt val för programmet men jag ville ha fler än två val och ett sätt att stänga ned programmet.

                default:
                    System.out.print("Hmm, something with your choice went wrong. Please choose correctly (A, B, C): ");
                    question = scan.nextLine();
                    break;
                    //Kommer bara ha ett val mellan A, B eller C.
            }
        }
    }
}
