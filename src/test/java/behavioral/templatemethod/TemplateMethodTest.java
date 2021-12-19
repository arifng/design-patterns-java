package behavioral.templatemethod;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

/**
 * Created by Rana on 19/12/2021.
 */
public class TemplateMethodTest {
    @Test
    public void databaseDataParserShouldCallMethodInOrder() {
        DatabaseDataParser dataParser = Mockito.mock(DatabaseDataParser.class);
        dataParser.parseDataAndGenerateOutput();

        InOrder order = Mockito.inOrder(dataParser);

        order.verify(dataParser).readData();
        order.verify(dataParser).processData();
        order.verify(dataParser).writeData();
    }

    @Test
    public void excelDataParserShouldCallMethodInOrder() {
        ExcelDataParser dataParser = Mockito.mock(ExcelDataParser.class);
        dataParser.parseDataAndGenerateOutput();

        InOrder order = Mockito.inOrder(dataParser);

        order.verify(dataParser).readData();
        order.verify(dataParser).processData();
        order.verify(dataParser).writeData();
    }
}
