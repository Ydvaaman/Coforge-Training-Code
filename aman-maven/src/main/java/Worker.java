public class Worker {
    int id;
    String name;
    float wages;

    void workerDetail(){
        System.out.println("Details ");
        System.out.println("\tid is "+id);
        System.out.println("\tname is "+name);
        System.out.println("\twages is "+wages);
    }

    static float[] highLowWages(float[] wages){
        float [] arr1 = new float[2];
        for(int i=0;i<wages.length-1;i++){
            for(int j=0;j<wages.length-i-1;j++) {
                var temp = wages[j + 1];
                wages[j + 1] = wages[i];
                wages[j] = temp;
            }
        }
        arr1[0] = wages[wages.length-1];
        arr1[1] = wages[0];
        return arr1;
    }
    static float[] totalAvgWages(float wages[]){
        float arr2[] = new float[2];
        float t = 0;
        for (float f: wages){
            t = t+f;
            arr2[0] = t;
            arr2[1] = t/wages.length;
        }
         return arr2;
    }
    static void display(float a[]){
        for(float p:a){
            System.out.print(p+ ", ");
        }
    }
}
