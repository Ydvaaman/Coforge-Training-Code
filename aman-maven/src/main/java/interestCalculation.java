import java.util.Scanner;

public class interestCalculation {

    static  float intCalc(){
        float amt,rate;
        int time;
        java.util.Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter rate > 0 ");
            rate = sc.nextFloat();
        }while (rate<=0);

        do{
            System.out.println("Enter amt > 0 ");
            amt = sc.nextFloat();
        }while (amt<=0);

        do{
            System.out.println("Enter time > 0 ");
            time = sc.nextInt();
        }while (time<=0);

        return amt*rate*time/100;
    }
    public static void main(String[] args) {
        System.out.println(intCalc());
    }
}
