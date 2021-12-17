package behavioral.state;

/**
 * Created by Rana on 17/12/2021.
 */
public class Off implements State {
    public void pull(WallFanPullingChain wrapper) {
        wrapper.setState(new Low());
        System.out.println("Low speed");
    }
}
