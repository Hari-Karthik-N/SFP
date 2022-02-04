package basicprogramming;

import java.util.Scanner;

public class Program63ReverseSentenceRecursion {
    static String sentenceReverse(String[] splitSentence, int currentWordIndex) {
        if(currentWordIndex < 0) return "";
        return splitSentence[currentWordIndex] + " " + sentenceReverse(splitSentence, currentWordIndex-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String sentence = input.nextLine();
        String[] splitSentence = sentence.split(" ");
        int currentWordIndex = splitSentence.length - 1;
        System.out.println("Reversed Sentence: " + sentenceReverse(splitSentence, currentWordIndex));
    }
}
