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
                Scanner sc = new Scanner(new File("/Users/ali/dev/labs/FileIOJava/Step4/input.txt"));
                int sum = 0;
                while(sc.hasNext()){
                    int lineIn = sc.nextInt();
                        sum += lineIn;
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