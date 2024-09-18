import java.util.Scanner;

public class sumOfDigit {
    static boolean palindrome(int b){
        int rev = 0,temp = b;
        while(temp!=0){
             int d = temp%10;
            rev= rev*10+ d;
            temp = temp / 10;
        }

        if(rev == b){
            return true;
        }
        else{
            return false;
        }
    }
    static int sumDigit(int a){
        int sum = 0;
        while(a!=0){
            sum=sum+a%10;
            a=a/10;
        }
        return sum;
    }
    public static void main(String[] args) {
         java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
         int n = sc.nextInt();
         int res = sumDigit(n);
        System.out.println(res);
        System.out.println(palindrome(n));

    }
}
