package code.practice;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x=12321;
        String val = String.valueOf(x);

        if(val.equals(new StringBuilder(val).reverse().toString())){
            System.out.println("number is palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }
}
