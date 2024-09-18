public class forEach {
    public static void main(String[] args) {
        int arr[] = {12,13,13,45,65,67};
        System.out.println("for loop");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nusing for each loop");
        for(int n:arr){
            System.out.print(n+"\t");
        }
    }
}

