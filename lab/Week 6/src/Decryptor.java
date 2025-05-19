/**
 *
 * @author COM102
 * Date created: Feb 2025
 * Version 1.0
 * 
 * This small program performs very basic decryption of an input string. 
 */
import java.util.Scanner;
public class Decryptor 
{
    Scanner obj = new Scanner(System.in);
    private String theString ;
    private String decryptedString;
    
    public static void main(String[] args)
    {
        Decryptor myEncryptor = new Decryptor() ;
        myEncryptor.start() ;
    }
    
    private void start()
    {
        // Decomposing the problem into a discrete set of well focussed steps.
		// If the user enters a single word “exit”, the program should terminate.
		this.getString() ;
        if (!theString.equals("exit")){
            this.decryptString() ;
            this.reportAnalysis() ;
        }
        System.out.println("Program Terminating, Goodbye");
    }

    private void getString(){
        System.out.print("Input String: ");
        theString = obj.nextLine();
    }

    private void decryptString(){
        String[] arr = theString.split(" ");
        if (arr.length > 1) {
            String firstElement = arr[0];
            String secondElement = arr[1];
            arr[0] = secondElement;
            arr[1] = firstElement;
        }
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            String word = "";
            for (int j = temp.length() - 1; j >= 0; j--) {
                word += temp.charAt(j);
            }
            arr[i] = word;
        }
        decryptedString = "";
        for (String s : arr) {
            decryptedString += s + " ";
        }
    }

    private void reportAnalysis(){
        System.out.println(decryptedString);
        decryptedString = decryptedString.toLowerCase();
        int count = 0;
        for (int i = 0; i < decryptedString.length(); i++) {
            if (decryptedString.charAt(i) == 'e'){
                count++;
            }
        }
        System.out.println("The total number of occurrences of letter 'E' in the supplied string (ignoring the case) is " + count);
    }

    //
	//Your Task - Complete the following 3 methods as instructed in the spec.
	//1. getString() - This method should take a string of text for analysis from the keyboard. 
	//2. decryptString() - Perform decryption on the strinig as required
	//3. reportAnalysis() - Print the results back to the user on the screen as required.
	
	// Please note that at least one additional instance variable needs to be define as required	
    
}
