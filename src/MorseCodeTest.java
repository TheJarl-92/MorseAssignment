import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeTest {
    @Test
    public void getStarsFromLetterS(){
        MorseCodeToMorse morse = new MorseCodeToMorse();

        String input = "S";

        String actual = morse.convertToMorse(input);

        assertEquals("***", actual);
    }
    @Test
    public void getStarsFromLetterE(){
        MorseCodeToMorse morse = new MorseCodeToMorse();

        String input = "E";

        String actual = morse.convertToMorse(input);

        assertEquals("*", actual);
    }

    @Test
    public void getStarsFromMoreLetters(){
        MorseCodeToMorse morse = new MorseCodeToMorse();

        String input = "E";
        String actual = morse.convertToMorse(input);

        assertEquals("*", actual);

        String input2 = "J";
        String actual2 = morse.convertToMorse(input2);

        assertEquals("*---", actual2);
    }

    @Test
    public void getStarsFromLongerInput(){
        MorseCodeToMorse morse = new MorseCodeToMorse();

        String input = "EJ";
        String actual = morse.convertToMorse(input);

        assertEquals("* *---", actual);
    }

    @Test
    public void getStarsFromTwoWords(){
        MorseCodeToMorse morse = new MorseCodeToMorse();

        String input = "E J";
        String actual = morse.convertToMorse(input);

        assertEquals("* | *---", actual);
    }

    @Test
    public void getStarsFromLongerTwoWords(){
        MorseCodeToMorse morse = new MorseCodeToMorse();

        String input = "HEJ JAG";
        String actual = morse.convertToMorse(input);

        assertEquals("**** * *--- | *--- *- --*", actual);
    }

    @Test
    public void getLetterSFromStars(){
        MorseCodeToEnglish english = new MorseCodeToEnglish();

        String input = "***";
        String actual = english.convertToEnglish(input);

        assertEquals("S", actual);
    }

    @Test
    public void getLetterEFromStars(){
        MorseCodeToEnglish english = new MorseCodeToEnglish();

        String input = "*";
        String actual = english.convertToEnglish(input);

        assertEquals("E", actual);
    }

    @Test
    public void getTwoLettersFromStars(){
        MorseCodeToEnglish english = new MorseCodeToEnglish();

        String input = "* ***";
        String actual = english.convertToEnglish(input);

        assertEquals("E S", actual);
    }

    @Test
    public void getLettersFromStarsSentence(){
        MorseCodeToEnglish english = new MorseCodeToEnglish();

        String input = "**** * *--- *--- *- --*";
        String actual = english.convertToEnglish(input);

        assertEquals("H E J J A G", actual);
    }

}
