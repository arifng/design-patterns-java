package behavioral.state;

import lombok.Getter;

/**
 * Created by Rana on 17/12/2021.
 */
@Getter
public class WallFanPullingChain {
    private State currentState;

    public WallFanPullingChain() {
        currentState = new Off();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void pull() {
        currentState.pull(this);
    }
}
