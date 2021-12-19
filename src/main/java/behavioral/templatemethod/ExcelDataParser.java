package behavioral.templatemethod;

/**
 * Created by Rana on 19/12/2021.
 */
public class ExcelDataParser extends DataParser {
    @Override
    void readData() {
        System.out.println("Read data from excel");
    }

    @Override
    void processData() {
        System.out.println("Process excel data");
    }
}
