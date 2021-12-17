package behavioral.state;

/**
 * Created by Rana on 17/12/2021.
 */
public class High implements State {
    public void pull(WallFanPullingChain wrapper) {
        wrapper.setState(new Off());
        System.out.println("Turning off");
    }
}
