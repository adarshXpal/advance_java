package InputSteam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class exam extends InputStreamReader {

    public exam(java.io.InputStream in) {
        super(in);
    }

    @Override
    public String toString() {
        return "Adarsh Exam";
    }
}

public class InputStream {
    public static void main(String[] args) throws IOException { // this is not the good practice to throw the exception
                                                                // to the JVM Because it wont be resolved !!
        System.out.println("Enter the Number: ");
        InputStreamReader in = new exam(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.println(in.toString());
        // try{
        int i = Integer.parseInt(bf.readLine());
        System.out.println("Value Entered is: " + i);
        bf.close();
        // }
        // catch(IOException e){
        // System.out.println("Occured a IO exception");
        // }
    }
}
