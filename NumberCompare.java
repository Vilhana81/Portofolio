import java.util.Scanner;

public class NumberCompare {

    public static void main(String[] args) {
        
        int first; int second; int third;

        System.out.println("Insert first number");

        Scanner sc = new Scanner(System.in);

        first = sc.nextInt();

        System.out.println("Insert second number");

        second = sc.nextInt();

        System.out.println("Insert third number");

        third = sc.nextInt();

        if(first > 0 && second > 0 && third > 0){
            System.out.println("All numbers are positive");
        }
        else{
            System.out.println("Not all numbers are positive");
        }
        if(first == 0 || second == 0 || third == 0){
            System.out.println("At least one number is zero");
        }
        else{
            System.out.println("No number is zero");
        }
        if(first == second && second == third ){
            System.out.println("All numbers are equal");
        }
        else if (first == second) {
            System.out.println("The first and second number are equals");
        }
        else if (first == third) {
            System.out.println("The first and third number are equals");
        }
        else if (third == second) {
            System.out.println("The second and third number are equals");
        }
        else {
            System.out.println("No numbers are equal");
        }
        sc.close();
    }
}
