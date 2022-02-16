import java.util.ArrayList;
import java.util.HashMap;


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
    }
    public String convertToMorse(String input) {
        String convertedLetter;
        /*
        for (int i = 0; i<input.length(); i++) {
             englishLetter = String.valueOf(input.charAt(i));
            if (!(englishLetter.equalsIgnoreCase(" "))) {
                convertedLetter = toMorse.get(englishLetter);
                return convertedLetter;
            } else {
                i++;
            }
        }*/

        convertedLetter = toMorse.get(input);
        return convertedLetter;

    }
}
