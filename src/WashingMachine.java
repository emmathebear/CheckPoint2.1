import java.util.HashSet;
import java.util.Set;

public class WashingMachine {
    private int water, capacity;

    private Set<Washable> loadedObjects;

    public void load(Washable washable) {
        loadedObjects.add(washable);
    }

    public Set<Washable> wash() {
        for (Washable w : loadedObjects) {
            w.onWash();

        }
        Set<Washable> washedObjects = new HashSet<>();
        washedObjects.addAll(loadedObjects);
        loadedObjects.clear();
        return washedObjects;
    }

    public WashingMachine(int water, int capacity) {
        this.water = water;
        this.capacity = capacity;
        this.loadedObjects = new HashSet<>();
    }
}
