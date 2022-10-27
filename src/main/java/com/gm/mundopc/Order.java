package com.gm.mundopc;

public class Order {
    private final int idOrder;
    private Computer computers[];
    private static int counterOrders;
    private int counterComputers;
    private static final int MAX_COMPUTERS = 50;

    public Order() {
        this.idOrder = ++Order.counterOrders;
        this.computers = new Computer[Order.MAX_COMPUTERS];
    }

    //Métodos:
    public void addComputer(Computer computer) {
        if(this.counterComputers < Order.MAX_COMPUTERS) {
            this.computers[this.counterComputers++] = computer;//for each product i add the variable products increases,
            // but after index [0], this is why i put ++ after and not before
        }
        else {
            System.out.println("Oveloaded max products: " + Order.MAX_COMPUTERS);//prints the maximun number of products
            //that can be added to array products
        }
    }

    public void showOrder() {
        System.out.println("Id Order: " + this.idOrder);
        System.out.println("The order products are: ");
        for (int i = 0; i < this.counterComputers; i++) {
            System.out.println(this.computers[i]);
        }

    }
}
