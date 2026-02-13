
import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking input
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Checking even or odd
        System.out.println("Even and Odd numbers:");
        for(int i = 0; i < n; i++) {

            if(arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is Even");
            } else {
                System.out.println(arr[i] + " is Odd");
            }

        }

        sc.close();
    }
}
