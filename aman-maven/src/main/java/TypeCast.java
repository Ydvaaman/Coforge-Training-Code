public class TypeCast {
    public static void main(String[] args) {
        int x =100;
        float p=x;

        double d1=555555555555554.3455;
        int p1=(int)d1;
        System.out.println(p1);

        Number n1=90;
        float f1=887f;
        int d2=78;
        n1=f1;
        n1=d2;


        f1=(float)d1;
        d1=(int)f1;
    }
}

