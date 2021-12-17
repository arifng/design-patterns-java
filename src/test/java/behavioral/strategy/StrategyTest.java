package behavioral.strategy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * Created by Rana on 17/12/2021.
 */
public class StrategyTest {
    private CompressionContext compressionContext;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private File file;

    @BeforeEach
    public void setUp() {
        compressionContext = new CompressionContext();
        System.setOut(new PrintStream(outputStreamCaptor));
        file = new File("/test.txt");
    }

    @AfterEach
    public void tearDown() {
        file.delete();
    }

    @Test
    public void settingZipStrategyWillExecuteMethodOfZipCompressionStrategy() {
        compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
        compressionContext.createArchive(Arrays.asList(file));

        Assertions.assertEquals("Compress files to ZIP", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void settingRarStrategyWillExecuteMethodOfRarCompressionStrategy() {
        compressionContext.setCompressionStrategy(new RarCompressionStrategy());
        compressionContext.createArchive(Arrays.asList(file));

        Assertions.assertEquals("Compress files to RAR", outputStreamCaptor.toString()
                .trim());
    }
}
