package behavioral.templatemethod;

/**
 * Created by Rana on 19/12/2021.
 */
public class DatabaseDataParser extends DataParser {
    @Override
    void readData() {
        System.out.println("Read data from database");
    }

    @Override
    void processData() {
        System.out.println("Process dataset");
    }
}
