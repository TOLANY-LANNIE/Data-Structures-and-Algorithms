package Strings;

import java.io.*;

public class RepeatedString {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        long full_string = n/s.length();
        long remainder = n%s.length();
        long count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') count++;
        }
        count*=full_string;

        for(int i=0;i<remainder;i++){
            if(s.charAt(i)=='a') count++;
        }
        return count;
    }
}
