package structural.adapter;

/**
 * Created by Rana on 31/07/2022.
 */
public class EthernetToUSBAdapter implements EthernetInterface {
    private final USBInterface usbInterface;

    public EthernetToUSBAdapter(USBInterface usbInterface) {
        this.usbInterface = usbInterface;
    }

    @Override
    public void connectToInternet() {
        // do work to connect to internet
        usbInterface.use();
    }
}
