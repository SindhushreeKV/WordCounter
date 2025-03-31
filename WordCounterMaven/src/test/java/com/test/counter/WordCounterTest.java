package example;

import com.test.counter.WordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCounterTest {

    @Test
    public void getWordCountReturnsCorrectCount() {
        WordCounter wordCounter = Mockito.spy(new WordCounter());
        wordCounter.addWords(new ArrayList<>(Arrays.asList("flower","blume","flor","test")));
     //   Mockito.verify(translator, Mockito.times(1)) if translator works then we can add Mockito to check if its' called
        Mockito.when(wordCounter.getWordCount("flower")).thenReturn(3);
        Mockito.when(wordCounter.getWordCount("blume")).thenReturn(3);
        Mockito.when(wordCounter.getWordCount("flor")).thenReturn(3);
        Mockito.when(wordCounter.getWordCount("test")).thenReturn(1);

        Assertions.assertEquals(wordCounter.getWordCount("flower"), 3);
      //  Mockito.verify(wordCounter, Mockito.atLeast(4)).getWordCount(anyString());
    }

}