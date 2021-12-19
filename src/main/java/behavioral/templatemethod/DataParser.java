package behavioral.templatemethod;

/**
 * Created by Rana on 19/12/2021.
 */
public abstract class DataParser {
    //Template method
    public final void parseDataAndGenerateOutput() {
        readData();
        processData();
        writeData();
    }

    abstract void readData();

    abstract void processData();

    public void writeData() {
        System.out.println("Writing to CSV");
    }
}
