package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rana on 09/12/2021.
 */
public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<Channel>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}
