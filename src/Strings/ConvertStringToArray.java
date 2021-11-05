package Strings;

import java.util.Arrays;

public class ConvertStringToArray {
    public static void main(String[] args) {
        String name ="Thulani";
        char [] array = new char[name.length()];

        for(int i =0;i<array.length;i++){
            array[i] = getChar(name,i);
        }
        System.out.println(Arrays.toString(array));
    }
    public static char getChar(String s, int index){
        return s.charAt(index);
    }
}
