import java.util.Scanner;

class CharacterUpperOrLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char char1 = sc.next().charAt(0); // Get the first character of the input
        if (char1 >= 'a' && char1 <= 'z') {
            System.out.println("lower case");
        }  else if (char1 >= 'A' && char1 <= 'Z'){
            System.out.println("Upper Case");
        } else {
            System.out.println("Enter Character is not valid");
        }
    }
}
