package trail;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    public static void main(String[] args) {
        Producr p1= new Producr(100);
        Producr p2= new Producr(200);

        List<Producr> arrayList= new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);

        List<Integer> intList = new ArrayList<>();

        arrayList.stream();

    }


}
