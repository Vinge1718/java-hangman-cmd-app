import java.io.Console;
import java.util.List;
import java.util.ArrayList;

                // VARIABLES
                //-----------Words to be used during the game

private static String[] words = {"weather", "program", "computer", "animals", "beverage", "entertaiment" };

                /* - Selecting a word from the array of words above.
                -- 1. Generate a random number and multiply by the words-array size/length and initialize the result as a primitive integer.
                -- 2. Step one gives you a random word from the words array and assigns it a variable "word"
                */

private static String word = words[(int) (Math.random() * words.length)];

                /* - Since characters in java strings are immutable (can't reassign/replace with new values). We create a new string of asterics
                -- 1. Get the length of the random word selected.
                -- 2. create a new string whose length is based on the randomly selected word.
                */

private static String asterisk = new String(new char[word.length()]).replace("\0", "*");

                //Keeps track of how many tries the user has made
private static int count = 0;

public class Hangman{

}
