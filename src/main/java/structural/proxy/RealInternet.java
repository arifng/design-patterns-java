package structural.proxy;

/**
 * Created by Rana on 07/02/2022.
 */
public class RealInternet implements Internet {
    @Override
    public void connect(String domainName) {
        System.out.println("Connecting to internet");
    }
}
