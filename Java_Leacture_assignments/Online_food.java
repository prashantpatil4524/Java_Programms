// multithreading in java for food delivery of oredr1 pizza and order2 burger, order3 pasta

class chef extends Thread {
    String order;

    chef(String order) {
        this.order = order;
    }

    public void run() {
        System.out.println("Chef is started preparing " + order);
        for(int i=1;i<=5;i++){
            System.out.println(order + " - Step " + i + " completed");
        }
        System.out.println(order + " is ready!");

        
}
}


public class Online_food {
    public static void main(String[] args) {
        chef order1 = new chef("Pizza");
        chef order2 = new chef("Burger");
        chef order3 = new chef("Pasta");

        order1.start();
        order2.start();
        order3.start();
    }
}   





