public class student {
    static void display(int r, String nm, String sb1, String sb2, float m1, float m2, float tot, float avg ){
        System.out.println("\nStudent data\n");
        System.out.println("\tRoll is "+r);
        System.out.println("\tName is "+nm);
        System.out.println("\tsubject1 is "+sb1);
        System.out.println("\tsubject2 is "+sb2);
        System.out.println("\tMarks1 is "+m1);
        System.out.println("\tMarks2 is "+m2);
        System.out.println("\tTotal Marks2 is "+tot);
        System.out.println("\tAverage marks is "+avg);
        if(avg<34)
        {
            System.out.println("fail");
        }
        else if(avg<50)
        {
            System.out.println("third grade");
        }
        else if(avg<60)
        {
            System.out.println("second grade");
        }
        else if(avg<74)
        {
            System.out.println("first grade");
        }
        else
        {
            System.out.println("distinction");
        }
    }
    public static void main(String[] args) {
        int roll;
        String name;
        String subject1, subject2;

        float marks1;
        float marks2;
        float total_marks;
        float average_marks;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter roll");
        roll = sc.nextInt();

        System.out.println("Enter name");
        name = sc.next();

        System.out.println("Enter subject1 name");
        sc.nextLine();
        subject1 = sc.nextLine();

        System.out.println("Enter subject2 name");
        subject2 = sc.next();

        System.out.println("Enter marks1");
        marks1 = sc.nextFloat();

        System.out.println("Enter marks2");
        marks2 = sc.nextFloat();

        total_marks = marks1+marks2;
        average_marks= total_marks/2;
        display(roll,name,subject1,subject2,marks1,marks2,total_marks,average_marks);
    }
}
