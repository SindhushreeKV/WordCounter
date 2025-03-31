package com.test.counter;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WordCounter {

    private List<String> words;
    private Map<String, Integer> wordCount;
 //   private Translator translator;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public WordCounter() {
        this.words = new ArrayList<>();
        this.wordCount = new ConcurrentHashMap<>();
    //    this.translator = new Translator();
    }

    public void addWords(ArrayList<String> words) {
        for(String word : words){
            if(isAlphabeticWord(word)) {
                String englishWord = "";
          /*      synchronized (translator) {
                    englishWord = translator.translate(word).toLowerCase();
                }*/
                this.words.add(englishWord);
                wordCount.put(englishWord, wordCount.getOrDefault(englishWord, 0) + 1);
            }
        }
    }

    private boolean isAlphabeticWord(String word) {
        return word != null && word.matches("[a-zA-Z]+");
    }

    public int getWordCount(String word) {
        String englishWord = "";
  /*      synchronized (translator) {
            englishWord = translator.translate(word).toLowerCase();
        }*/
        return wordCount.getOrDefault(englishWord, 0);

    }
}