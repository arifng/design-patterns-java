package behavioral.strategy;

import lombok.Setter;

import java.io.File;
import java.util.List;

/**
 * Created by Rana on 17/12/2021.
 */
@Setter
public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    public void createArchive(List<File> files) {
        this.compressionStrategy.compressFiles(files);
    }
}
