package structural.adapter;

/**
 * Created by Rana on 31/07/2022.
 */
public class USBPort implements USBInterface {
    @Override
    public void use() {
        System.out.println("Using through USB");
    }
}
