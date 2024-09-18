public class Array2 {

    static void display(int array[][]){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void display1(int array[][]){
        for(int ar[] : array){
            for(int a:ar){
                System.out.print(a+"\t");
            }
            System.out.println();
        }
    }

    static int[][] addition(int arr1[][], int arr2[][]){
        int arr3[][] = new int[arr1.length][arr1[0].length];
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }
    public static void main(String[] args) {
        int arr1[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,8,7,6}
        };
        System.out.println("array row length "+arr1.length);
        System.out.println("array col length "+arr1[0].length);
        int arr2[][]={
                {9,8,7,6},
                {5,4,3,2},
                {1,2,3,4},
        };
        System.out.println("array1 is \n");
        display(arr1);
        display1(arr1);
        System.out.println("addition of 2d arrays:");
        display(addition(arr1,arr2));
    }
}
