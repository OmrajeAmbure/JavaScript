import java.util.Scanner;

public class Sum_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to calculate the Sum of Number :-");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("The sum of number is :- "+sum);
    }
}
