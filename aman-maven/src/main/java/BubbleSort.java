public class BubbleSort {
    static int[] sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    var temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static void display(int a[]){
        for(int p:a){
            System.out.print(p+ ", ");
        }
    }

    public static void main(String[] args) {
        var name = "aman kumar";
        var age = 67;
        int arr[] = {11,2,1,45,7};
        System.out.println("unsorted array");
        display(arr);
        System.out.println("\nsorted array");
        display(sort(arr));
    }
}
