
import java.util.HashMap;
import java.util.Locale;


public class MorseCodeToMorse {
    private HashMap<String, String> toMorse;

    public MorseCodeToMorse(){
        toMorse = new HashMap<>();

        toMorse.put("A", "*-");     toMorse.put("B", "-***");   toMorse.put("C", "-*-*");
        toMorse.put("D", "-**");    toMorse.put("E", "*");      toMorse.put("F", "**-*");
        toMorse.put("G", "--*");    toMorse.put("H", "****");   toMorse.put("I", "**");
        toMorse.put("J", "*---");   toMorse.put("K", "-*-");    toMorse.put("L", "*-**");
        toMorse.put("M", "--");     toMorse.put("N", "-*");     toMorse.put("O", "---");
        toMorse.put("P", "*--*");   toMorse.put("Q", "--*-");   toMorse.put("R", "*-*");
        toMorse.put("S", "***");    toMorse.put("T", "-");      toMorse.put("U", "**-");
        toMorse.put("V", "***-");   toMorse.put("W", "*--");    toMorse.put("X", "-**-");
        toMorse.put("Y", "-*--");   toMorse.put("Z", "--**");   toMorse.put("1", "*----");
        toMorse.put("2", "**---");  toMorse.put("3", "***--");  toMorse.put("4", "****-");
        toMorse.put("5", "*****");  toMorse.put("6", "-****");  toMorse.put("7", "--***");
        toMorse.put("8", "---**");  toMorse.put("9", "----*");  toMorse.put("0", "-----");
        toMorse.put(".", "*-*-*-"); toMorse.put(",", "--**--"); toMorse.put("?", "**--**");
        toMorse.put(" ", "|");
    }
    public String convertToMorse(String input) {
        String convertedLetter[] = input.toUpperCase(Locale.ROOT).split("");
        //Konvertera bokstäverna till storbokstav så man inte kan skriva fel, då hashmap inte har små bokstäver.

        StringBuilder morseReturn = new StringBuilder();
        //Inte använt en StringBuilder förut men något som rekommenderades när man ville plussa på strängar på en sträng.

        for (int i = 0; i<convertedLetter.length; i++) {
            convertedLetter[i] = toMorse.get(convertedLetter[i]);
            if (!(i == convertedLetter.length - 1)) {
                morseReturn.append(convertedLetter[i] + " ");
            } else {
                morseReturn.append(convertedLetter[i]);
            }
            //Såvida i inte har nått slutet på arrayen lägg till ett extra mellanslag, annars när i har nått slutet på arrayen
            //lägg bara till den sista morse biten.
        }

        return morseReturn.toString();
    }
}