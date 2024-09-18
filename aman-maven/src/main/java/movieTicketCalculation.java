public class movieTicketCalculation {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter number of tickets ");
        int tickets = sc.nextInt();

        if(tickets < 5 || tickets > 40){
            System.out.println("minimum of 5 and maximum of 40 tickets");
            return;
        }
        System.out.println("Do you want refreshment?");
        char refreshment = sc.next().charAt(0);

        System.out.println("Do you have coupon?");
        char coupon = sc.next().charAt(0);

        System.out.println("Enter the circle: k/q");
        char circle = sc.next().charAt(0);

        double ticketCost;
        if(circle=='k'){
            ticketCost=75;
        } else if (circle=='q') {
            ticketCost=150;

        }else{
            System.out.println("invalid input");
            return;
        }
        double totalCost = tickets * ticketCost;
        if(tickets > 20){
            totalCost*=0.90;
        }
        if(coupon=='y'){
            totalCost*=0.98;
        }
        if(refreshment=='y'){
            totalCost= totalCost+tickets*50;
        }
        System.out.println("ticket cost "+totalCost);
    }
}
