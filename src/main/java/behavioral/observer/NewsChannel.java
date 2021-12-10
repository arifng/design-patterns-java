package behavioral.observer;

import lombok.Getter;

/**
 * Created by Rana on 09/12/2021.
 */
@Getter
public class NewsChannel implements Channel{
    private String news;

    public void update(Object news) {
        this.news = (String) news;
    }
}
