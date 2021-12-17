package behavioral.strategy;

import java.io.File;
import java.util.List;

/**
 * Created by Rana on 17/12/2021.
 */
public class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFiles(List<File> files) {
        System.out.println("Compress files to ZIP");
    }
}
