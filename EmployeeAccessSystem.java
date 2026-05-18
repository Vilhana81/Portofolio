import java.util.Scanner;

public class EmployeeAccessSystem {

    public static void main(String[] args) {
        
        int age; boolean card; boolean admin;

        Scanner sc = new Scanner (System.in);

        System.out.println("Qual a sua idade?");

        age = sc.nextInt();

        System.out.println("Tem cartão de funcionário? 1-SIM 2-NÃO");

        if(sc.nextInt() == 1){
            card = true;
        }
        else{
            card = false;
        }

        System.out.println("É Administrador 1-SIM 2-NÃO?");
        
        if(sc.nextInt() == 1){
            admin = true;
        }
        else{
            admin = false;
        }

        if (age < 18 || (!card && !admin)) {

            System.out.println("Access denied");
        }
        else if (admin){
            System.out.println("Access granted\nWelcome administrator");
        }
        else{
            System.out.println("Access granted\nWelcome employee");           
        }
        sc.close();
    }
}
