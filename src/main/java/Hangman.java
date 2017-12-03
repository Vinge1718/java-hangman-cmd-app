import java.io.Console;
import java.util.List;
import java.util.ArrayList;

                //-----------Words to be used during the game

private static String[] words = {"weather", "program", "computer", "animals", "beverage", "entertaiment" };

                /* - Selecting a word from the array of words above.
                -- 1. Generate a random number and multiply by the words-array size/length and initialize the result as a primitive integer.
                -- 2. Step one gives you a random word from the words array and assigns it a variable "word"
                */
private static String word = words[(int) (Math.random() * words.length)];

public class Hangman{

}
