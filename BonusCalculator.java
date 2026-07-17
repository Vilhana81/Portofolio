public class BonusCalculator {
    
    public static double calculateBonus(double salary){
        return (salary * 0.5);
    }
    public static void main(String[] args) {
        
        double salary = 50000;
        double bonusAmount =  calculateBonus(salary);

        System.out.println("The employe salary is " + salary + "and is bonus is " + bonusAmount);
    }
}
