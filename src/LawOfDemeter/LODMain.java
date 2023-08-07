package LawOfDemeter;

public class LODMain {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person person = new Person("John Doe", address);

        String cityName = person.getAddressCity();
        System.out.println(cityName);

        Address address2 = new Address("Dubai");
        Person person2 = new Person("Hula lala", address2);

        String cityName2 = person2.getAddressCity();
        System.out.println(cityName2);

        // 2nd example
        Product product = new Product("Watch");
        Orders orders = new Orders(product);

        Customer customer= new Customer(orders);

        System.out.println(customer.getProduct());


    }
}
