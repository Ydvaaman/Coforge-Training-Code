import java.util.Scanner;

public class circle {
    static float circumference(float r){
        return 2 * 3.14f * r;
    }
    static  float area(float r){
        return 3.14f*r*r;
    }
    public static void main(String[] args){
        float r = 7.5f;
        System.out.println("circumference of circle is "+circumference(r));
        System.out.println("area of circle is "+area(r));

    }
}
