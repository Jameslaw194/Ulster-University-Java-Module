import java.util.Scanner;

public class StringAnalyzer{

    private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'} ;
    private int[] frequency = new int[26];
    private String inputString;

    public static void main(String[] args){
        StringAnalyzer myAnalyzer = new StringAnalyzer();
        myAnalyzer.start();
    }

    private void start(){
        getString();
        analyzeString();
        reportAnalysis();
        System.out.println("Program Terminating, Goodbye");
    }

    private void getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in a sentence: ");
        inputString = scanner.nextLine().toLowerCase();
        scanner.close();
    }

    private void analyzeString() {
        //Initialise frequency array with zeros to prepare for character counting
        for(int i = 0; i < frequency.length; i++) {
            frequency[i] = 0;
        }

        //Count occurrences of lowercase letters in the input string
        for(char c : inputString.toCharArray()) {
            //Check if current character is a lowercase letter (ASCII 'a' through 'z')
            if(c >= 'a' && c <= 'z') {
                //Convert ASCII value to index (0-25) and increment corresponding counter
                frequency[c - 'a']++;
            }
        }
    }

    private void reportAnalysis(){
        for(int i = 0; i < letters.length; i++) {
            if(frequency[i] > 0) {
                System.out.printf("Character %c occurs %d time%s%n",
                        letters[i], frequency[i], frequency[i] == 1 ? "" : "s");
            }
        }
    }
}