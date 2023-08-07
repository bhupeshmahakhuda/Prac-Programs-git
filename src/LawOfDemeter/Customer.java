package LawOfDemeter;

public class Customer {
    private Orders orders;

    public Customer(Orders orders) {
        this.orders = orders;
    }

    public String getProduct(){
        return orders.getProductName();
    }
}
