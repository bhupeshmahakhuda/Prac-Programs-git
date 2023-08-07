package OopsConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class LaptopOwner {
    public static void main(String[] args) {
        Laptop obj1= new Laptop();
        obj1.setModel("Mac");
        obj1.setValue(1003);

        Laptop obj2= new Laptop();
        obj2.setModel("Mac");
        obj2.setValue(1001);

        Laptop[] laptops = {obj1,obj2};

//        System.out.println(obj1.toString());
//        System.out.println(obj2.toString());

//        System.out.println(obj1.equals(obj2));

        Arrays.sort(laptops);
        for(Laptop lap : laptops){
            System.out.println(lap);
        }
    }
}
