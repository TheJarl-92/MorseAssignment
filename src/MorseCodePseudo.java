public class MorseCodePseudo {
    /*
    Skriv ett program som gör om morsekod till engelska och engelska till morsekod
    Use user input to convert morse to english and vice versa.
    Scanner to read user input.
    FROM ENGLISH
    User input sent to morse logic class to get read and converted.
    Create hashmap table to easily get correct morse depending on char.
    Read the input for every char, probably in a for loop.
    Use .get to get from hashmap and save to a variable.
    Return morse code saved in the variable.

    FROM MORSE
    User input sent to english logic class to get read and converted.
    Create hashmap table to easily get correct English character depending on morse.
    Read the input for every morse code separate with space.
    Split regex "" or something like it.
    Use .get to get from hashmap and save to a variable.
    Return english character saved in the variable.

    Skriv programmet med minst en logikklass samt en klass som läser in text och skriver ut text (med en main-metod)
    Use two logic classes, one for English to morse and another for morse to English.
    One class for main, one class for Test(TDD).

    Använd den internationella morsekoden (se slide 4)
    Look at the picture and use it to create a hashmap in the constructor for each logic class.

    Utveckla programmet i TDD och skriv minst 3 JUnit-testfall
    Try to go slow and easy to get some different types of testcases before doing the code. Do the bare minimum.

    Skapa minst två felhanteringar i systemet som fångar två saker som användaren kan göra som går utanför det vanliga användandet av systemet
    Create a try/catch method for places where it could go wrong. Like English to morse and you can't put more than one char at a time.
    Morse is a bit harder but kind of the same, catch it going outside of the hashmap, it will get a null value.
    Null won't create an exception so do some sort of 'if' instead.
    if return statement equals null, sout(please do it correctly.)
    */
}
