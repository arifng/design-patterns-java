package structural.adapter;

/**
 * Created by Rana on 31/07/2022.
 */
public class EthernetConnector implements EthernetInterface {
    @Override
    public void connectToInternet() {
        System.out.println("Connect to internet");
    }
}
