import java.sql.SQLOutput;

public class factorial {
    static long getFactorial1(int x){
        long ans = x;
        int i = x - 1;
        while(i > 0){
           ans = ans * i;
            i--;
        }
        return ans;
    }
//    static long getFactorial2(int x){
//
//    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the values");
        int x = sc.nextInt();
        long ans = getFactorial1(x);
        System.out.println(ans);

    }
}
