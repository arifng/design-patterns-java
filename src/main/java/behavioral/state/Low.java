package behavioral.state;

/**
 * Created by Rana on 17/12/2021.
 */
public class Low implements State {
    public void pull(WallFanPullingChain wrapper) {
        wrapper.setState(new Medium());
        System.out.println("Medium speed");
    }
}
