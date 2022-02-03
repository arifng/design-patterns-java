package creational.objectpool;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rana on 03/02/2022.
 */
public abstract class ObjectPool<T> {
    private Set<T> availables;
    private Set<T> uses;

    public ObjectPool() {
        availables = new HashSet<>();
        uses = new HashSet<>();
    }

    protected abstract T create();

    public synchronized T acquire() {
        if (availables.isEmpty()) {
            availables.add(create());
        }

        T object = availables.iterator().next();
        availables.remove(object);
        uses.add(object);

        return object;
    }

    public synchronized void release(T object) {
        uses.remove(object);
        availables.add(object);
    }

}
