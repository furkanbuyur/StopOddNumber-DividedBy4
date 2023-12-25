import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    int i,total=0;
        System.out.println("Enter a number : ");

        do {
        i = sc.nextInt();
        if (i % 4 == 0){
            total += i;
        }
    } while(i % 2 == 0 );


        System.out.println("The sum of the numbers that can be divisible by 4 : "+ total);
    }
}