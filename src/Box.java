import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Box<X, Y> {
    X a;
    Y b;

    public Box( X a, Y b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static <T> void main(String[] args) {
        Box<Integer, Integer> mybox = new Box<>(2, 3);
        System.out.println(mybox);

        Collection<T> maCollection = new ArrayList<>();
        //...
        for (T nom : maCollection) {
            //bloc d'instructions
        }
    }

}


