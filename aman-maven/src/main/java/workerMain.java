public class workerMain {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Worker worker[] = new Worker[3];
        float wages[] = new float[worker.length];
        for(int i=0;i<worker.length;i++){
            worker[i] = new Worker();
            System.out.println("Enter Each worker id name and wages");
            worker[i].id = sc.nextInt();
            sc.nextLine();
            worker[i].name=sc.nextLine();
            worker[i].wages=sc.nextFloat();
            wages[i] = worker[i].wages;

        }
        for (Worker w : worker){
            w.workerDetail();
        }
        System.out.println("Low to high wages of a worker");
        Worker.display(Worker.highLowWages(wages));
        System.out.println("\nTotal average of wages of a worker");
        Worker.display(Worker.totalAvgWages(wages));

    }
}
