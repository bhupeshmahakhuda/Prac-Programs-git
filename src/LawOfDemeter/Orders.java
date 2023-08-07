package LawOfDemeter;

public class Orders {
    private Product product;

    public Orders(Product product) {
        this.product = product;
    }

    public String getProductName(){
        return product.getName();
    }
}
