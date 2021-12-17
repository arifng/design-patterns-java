package behavioral.state;

/**
 * Created by Rana on 17/12/2021.
 */
public class Medium implements State {
    public void pull(WallFanPullingChain wrapper) {
        wrapper.setState(new High());
        System.out.println("High speed");
    }
}
