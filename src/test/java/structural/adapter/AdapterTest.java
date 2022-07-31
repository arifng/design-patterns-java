package structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Rana on 31/07/2022.
 */
public class AdapterTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void connectToThrowsExceptionIfRestrictedSiteProvided() {
        USBInterface usbInterface = new USBPort();
        EthernetInterface ethernetInterface = new EthernetToUSBAdapter(usbInterface);

        ethernetInterface.connectToInternet();

        Assertions.assertEquals("Using through USB", outputStreamCaptor.toString()
                .trim());
    }
}
