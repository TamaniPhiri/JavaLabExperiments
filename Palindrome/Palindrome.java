import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        boolean isPalindrome= true;

        for (int i=0; i<input.length(); i++){
            if(input.charAt(i)!=input.charAt(input.length()-i-1)){
                isPalindrome = false; 
                break;
            }
        }
        if(isPalindrome) {
            System.out.println(input+ " is palindrome");
        }
        else{
            System.out.println(input+ " is not palindrome");
        }
    }
}