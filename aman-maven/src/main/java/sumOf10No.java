
public class sumOf10No {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 10 no ");
        int n=1, sum=0;
        int k=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n<=10){
            k=sc.nextInt();
            sum=sum+k;

            if(k>max){
                max = k;
            }

            if(k<min){
                min = k;
            }

            n++;
        }
        System.out.println("Sum is "+sum);
        System.out.println("maximum value is "+max);
        System.out.println("minimum value is "+min);
    }
}
