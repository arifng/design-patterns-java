package behavioral.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Rana on 17/12/2021.
 */
public class StateTest {
    private WallFanPullingChain pullingChain;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        pullingChain = new WallFanPullingChain();
    }

    // initial test
    @Test
    public void initializePullingChangeStateToOff() {
        Assertions.assertInstanceOf(Off.class, pullingChain.getCurrentState());
    }

    // One time pulling
    @Test
    public void pullingChainOneTimeShouldChangeStateToLow() {
        pullingChain.pull();

        Assertions.assertInstanceOf(Low.class, pullingChain.getCurrentState());
    }

    @Test
    public void pullingChainOneTimeShouldPrintLowSpeed() {
        System.setOut(new PrintStream(outputStreamCaptor));
        pullingChain.pull();

        Assertions.assertEquals("Low speed", outputStreamCaptor.toString()
                .trim());
    }

    // Two times pulling
    @Test
    public void pullingChainTwoTimesShouldChangeStateToMedium() {
        pullingChain.pull();
        pullingChain.pull();

        Assertions.assertInstanceOf(Medium.class, pullingChain.getCurrentState());
    }

    @Test
    public void pullingChainTwoTimesShouldPrintMediumSpeed() {
        pullingChain.pull();

        System.setOut(new PrintStream(outputStreamCaptor));
        pullingChain.pull();

        Assertions.assertEquals("Medium speed", outputStreamCaptor.toString()
                .trim());
    }

    // Three times pulling
    @Test
    public void pullingChainThreeTimesShouldChangeStateToHigh() {
        pullingChain.pull();
        pullingChain.pull();
        pullingChain.pull();

        Assertions.assertInstanceOf(High.class, pullingChain.getCurrentState());
    }

    @Test
    public void pullingChainThreeTimesShouldPrintHighSpeed() {
        pullingChain.pull();
        pullingChain.pull();

        System.setOut(new PrintStream(outputStreamCaptor));
        pullingChain.pull();

        Assertions.assertEquals("High speed", outputStreamCaptor.toString()
                .trim());
    }

    // Three times pulling
    @Test
    public void pullingChainFourTimesShouldChangeStateToOff() {
        pullingChain.pull();
        pullingChain.pull();
        pullingChain.pull();
        pullingChain.pull();

        Assertions.assertInstanceOf(Off.class, pullingChain.getCurrentState());
    }

    @Test
    public void pullingChainFourTimesShouldPrintTurningOff() {
        pullingChain.pull();
        pullingChain.pull();
        pullingChain.pull();

        System.setOut(new PrintStream(outputStreamCaptor));
        pullingChain.pull();

        Assertions.assertEquals("Turning off", outputStreamCaptor.toString()
                .trim());
    }
}
