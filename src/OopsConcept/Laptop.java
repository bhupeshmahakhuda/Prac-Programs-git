package OopsConcept;

import java.util.Comparator;
import java.util.Objects;

public class Laptop implements Comparable<Laptop>{
   private String model;
   private int value;

    public void setModel(String model) {
        this.model = model;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return this.model +":"+this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return this.value == laptop.value && this.model.equals(laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, value);
    }

    @Override
    public int compareTo(Laptop obj) {
        return Integer.compare(this.value, obj.value);
    }
}
