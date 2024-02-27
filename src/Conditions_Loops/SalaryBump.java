package Conditions_Loops;

public class SalaryBump {
    public static void main(String[] args) {
        boolean check = false;
        int salary = 25400;

        if (salary > 10000){
            //salary = salary + 2000;
            salary += 2000;
            System.out.println("Congrats on 2Gs!");
        }else {
            //salary = salary + 1000;
            salary += 1000;
            System.out.println("Congrats on 1Gs!");

        }
    }
}
