package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try{
                Scanner sc = new Scanner(new File("input.txt"));
                while(sc.hasNext()){
                    String lineIn = sc.nextLine();
                    String [] input = lineIn.split(" ");
                    int sum = 0;
                    for (int i = 0; i < input.length; i++) {
                        sum += Integer.parseInt(input[i]);
                    }
                    System.out.println(sum);
                }
            }
            catch(IOException e){
                System.out.println("File not found");
            }
            System.out.println();

            // Print out a running total of all the
            // values in the input file.
        }
}