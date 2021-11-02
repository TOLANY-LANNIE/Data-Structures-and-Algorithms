import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] letters = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(letters));
        reverseString(letters);
    }
    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i <len; i++ ){

            char first = s[i];
            char last = s[len-1];

            s[i] = last;
            s[len-1] = first;

            len--;
        }
        System.out.println(Arrays.toString(s));
    }
}
