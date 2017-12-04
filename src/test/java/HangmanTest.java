import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class HangmanTest{
    @Test
    public void getWords_displayRandomWord_Array(){
        Hangman testHangman = new Hangman();
        String[] expectedOutput = {"weather", "program", "computer", "animals", "beverage", "entertaiment" };
        assertEquals(expectedOutput, testHangman.getWords());
    }

    @Test
    public void word_displayRandomWordFromListOfWords_String(){
        Hangman testHangman = new Hangman();
        String[] testWords = {"weather", "program", "computer", "animals", "beverage", "entertaiment" };
        String expectedOutput = testWords[(int) (Math.random() * testWords.length)].getClass().getName();
        assertEquals(expectedOutput, testHangman.getWord().getClass().getName());
    }

    @Test
    public void getAsterisk_convertRandomlySelectedWordToAsterics_String(){
        Hangman testHangman = new Hangman();
        String testWord = "weather";
        String expectedOutput = "*******";
        assertEquals(expectedOutput, testHangman.getAsterisk());
    }
/*
    @Test
    public void hang_replaceAstesriskWithCharacters_String(){
        Hangman testHangman = new Hangman();
        String testAsterick = "*******";
        String expectedOutput = "animals";
        assertEquals(expectedOutput, testHangman)
    }
    */
}
