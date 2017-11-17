package Twitter;

import java.util.*;
import javax.xml.bind.ValidationEvent;
import java.io.*;

public class Cipher {

	static char [] val ;
  public static void main(String[] args)throws IOException {

        String originalText="";
        String inputFile;
        String outputFile = "";
        String shiftDirection;
        int shiftValue;
       
        Scanner keyboard = new Scanner(System.in);

        //Prompt user for input file name
       Scanner in = new Scanner(System.in);
       System.out.print("What is the filename?: ");
       inputFile = in.nextLine();
       FileReader fr = new FileReader(inputFile);
       BufferedReader br = new BufferedReader(fr);
       String str ;
       while((str = br.readLine())!=null){
           val = str.toCharArray();
           for (int j = 0 ; j< val.length; j ++ ){
        	   System.out.print(val[j] + " ");
           }
       }
    


       //check if file exists
            File file = new File(inputFile);
               if (!file.exists())
               {
                  System.out.println("\nFile " + inputFile + " does not exist. File could not be opened.");

                  System.exit(0);
               }

         //send the filename to be read into String

         originalText = readFile(inputFile);
 
         

         //Prompt user for shift value
         System.out.print("\nWhat is the shift value? ");
         shiftValue = keyboard.nextInt();
         int len = Integer.toString(shiftValue).length();
         int[] array = new int[len];
         for (int index = 0; index < len; index++) {
             array[index] = shiftValue % 10;
             shiftValue /= 10;
         }
         for(int i = 0; i < array.length / 2; i++)
         {
             int temp = array[i];
             array[i] = array[array.length - i - 1];
             array[array.length - i - 1] = temp;
         }
         for (int i = 0 ; i < array.length ; i++  ){
        	 System.out.print(array[i] + " ");
         }
         System.out.println();

         //Prompt user for shift direction
         Scanner sc = new Scanner(System.in);
         System.out.print("What direction would you like to shift? Press R for right or L for Left: ");

         //validate the input
         while (!sc.hasNext("[LR]")) {
             System.out.println("That's not a valid form of input! Please enter only the letter 'L' or letter 'R' : ");
             sc.next();
             shiftDirection = sc.next(); //stores the validated direction
         }//end while

         shiftDirection = sc.next(); //stores the validated direction

         //Return encrypted string
        String encryptedText = encrypt(val , array);
        // String EText = String.valueOf(encryptedText);

         //get the outputfile name
         System.out.print("What is the name of the output file you want to create?: ");
         outputFile = in.nextLine();

         //make sure file does not exist
         File file2 = new File(outputFile);
            if (file2.exists())
            {
               System.out.println("\nFile " + outputFile + " already exists. Output not written.");

               System.exit(0);
            }

        try {
            File file3 = new File(outputFile);
            BufferedWriter output = new BufferedWriter(new FileWriter(file3));
            output.write(encryptedText);
            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        System.out.println("\nOutput written to " + outputFile);        

    } //end main

    //rotate and change chars
    public static String rotate(char [] val, int [] array) {

        String convertedText = "";
        for(int i = 0; i < val.length; i++){
        char lowerLetter = val[i];

        //Convert to uppercase
        char upperLetter = Character.toUpperCase(lowerLetter);
        int charNumber = upperLetter;

        //Apply shift, remembering to wrap text
        for (int k = 0 ; k < array.length ; k++) {
        int rotateShift = ((charNumber - 'A' + array[k]) % 26) + 'A';
        char shiftLetter = (char) rotateShift;

        //Create new string of shifted chars
        convertedText += shiftLetter;
        }
        }
      return convertedText;
    }

    //encrypt
    public static String encrypt(char [] val, int [] array) {
        String encryptedString = rotate(val , array);
        return encryptedString;
    }

    private static String readFile(String inputFile) throws java.io.IOException {
      File file = new File(inputFile);
      StringBuilder fileContents = new StringBuilder((int) file.length());
      Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
      String lineSeparator = System.getProperty("line.separator");

         try {
             if (scanner.hasNextLine()) {
                 fileContents.append(scanner.nextLine());
             }
             while (scanner.hasNextLine()) {
                 fileContents.append(lineSeparator + scanner.nextLine());
             }

         return fileContents.toString();
    }


     finally {
        scanner.close();
    }

 }
}
