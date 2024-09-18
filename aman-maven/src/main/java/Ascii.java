public class Ascii {
    static void smallAlphabet(int x){
        while(x<=122){
            System.out.println(x+"\t"+(char)x+"\t");
            if(x%5==0){
                System.out.println();
            }
            x++;
        }
    }
    public static void main(String[] args) {
        int x = 65;
        System.out.println(x);
        System.out.println((char)x);
        System.out.println((char)(++x));

        char p='Z';
        System.out.println(p);
        System.out.println((int)p);
        System.out.println("capital alphabet ");
        x=65;

        while(x<=90){
            System.out.println(x+"\t"+(char)x+"\t");
            if(x%5==0){
                System.out.println();
            }
            x++;
        }

        System.out.println("\n small alphabet ");
        int j=1;
        char g ='a';
        while(g!='{'){
            System.out.print((g++)+"\t");
            if(j%5==0){
                System.out.println();
                j++;
            }
        }
         x=97;
        smallAlphabet(x);
    }
}
