public class Test5 {
    static  int count =0;
    int c= 0;
    public Test5(){
        count++;
        c++;
    }

    public static void main(String[] args) {
        Test5 test1 = new Test5();
        Test5 test2 = new Test5();
        Test5 test3 = new Test5();
        Test5 test4 = new Test5();

        System.out.println(test4.count);
        System.out.println(test3.count);
        System.out.println(test2.count);
        System.out.println(test1.count);

        System.out.println("------------------------------------------------\n");

        System.out.println(test4.c);
        System.out.println(test3.c);


    }

    public static class StringTest1 {
        public static void main(String[] args) {
            String s1 = "hello";

            System.out.println(s1);
            s1.concat("world");
            System.out.println(s1);
            System.out.println(s1.concat("world"));

            String s2 = s1.concat("world");

            String var1 = "abc";
            String var2 = "abc";

            System.out.println(var1==var2);

            String var3 = new String("abc");

            System.out.println(var1==var3);

            System.out.println(var1.equals(var3));
            System.out.println(var1.equals(var2));
        }
    }
}
