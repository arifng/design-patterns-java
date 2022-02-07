package structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Rana on 07/02/2022.
 */
public class ProxyTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Internet internet;

    @BeforeEach
    public void setUp() {
        internet = new ProxyInternet();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void connectToThrowsExceptionIfRestrictedSiteProvided() {
        Exception exception = Assertions.assertThrows(IllegalAccessException.class, () -> {
            internet.connect("www.bannedsite.com");
        });

        Assertions.assertInstanceOf(IllegalAccessException.class, exception);
    }

    @Test
    public void connectToThrowsExceptionMessageIfRestrictedSiteProvided() {
        Exception exception = Assertions.assertThrows(IllegalAccessException.class, () -> {
            internet.connect("www.bannedsite.com");
        });

        Assertions.assertEquals("You don't have permission to access this site", exception.getMessage());
    }

    @Test
    public void connectToCallRealInternetMethodWhenProvidedValidSite() {
        try {
            internet.connect("www.abc.com");
        } catch (Exception e) {
            e.printStackTrace();
        }


        Assertions.assertEquals("Connecting to internet", outputStreamCaptor.toString()
                .trim());
    }
}
