## Observer Design Patter

Observer Design Patter specifies communication between two side objects: `observable` and `observers`. 

_An observable is an object **which notifies observers about the changes** in its state._

#### Example
A news agency can notify channels when it receives news. 

Receiving news is what changes the state of the news agency, and it causes the channels to be notified.

#### Remarks

- `NewsAgency` is `observable`.
- `Channel` is `observer`.

#### Test
```
NewsAgency observable = new NewsAgency();
NewsChannel observer = new NewsChannel();

observable.addObserver(observer);

// it will notifiy observer by calling ovserver method
// and observer set news
observable.setNews("A breaking news"); 

Assertions.assertEquals(observer.getNews(), "A breaking news");
```