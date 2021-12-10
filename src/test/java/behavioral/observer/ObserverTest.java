package behavioral.observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Rana on 09/12/2021.
 */
public class ObserverTest {
    @Test
    public void checkObservableNotifyObserver() {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        Assertions.assertEquals(observer.getNews(), "news");
    }
}
