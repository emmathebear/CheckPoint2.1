import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(20, 30);
        LinkedList<Washable> toWash = new LinkedList<>();
        Shirt shirt1 = new Shirt("blue", 60);
        Shirt shirt2 = new Shirt("red", 20);
        Pants pants1 = new Pants("Denim", 70, true);
        toWash.add(shirt1);
        toWash.add(shirt2);
        toWash.add(pants1);
        System.out.println(toWash);
        for (Washable w : toWash) {
            washingMachine.load(w);
        }
        ;
        Set<Washable> washed = washingMachine.wash();
        System.out.println("washed: " + washed);
        for (Washable w : toWash) {
            if (w.shouldBeWashed()){
                System.out.println(w + " has to be washed again!");
            }
        }


    }
}