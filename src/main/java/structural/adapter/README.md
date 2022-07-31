## Adapter Design Pattern

Adapter design pattern makes connection between two incompatible interface. It converts one interface to another expected
interface by client to make workable otherwise it's not possible to use by client.

Adapters are used, when a class (Client) expecting some type of object and we have an object (Adaptee) offering the same 
features but exposing a different interface.

#### Example

An Ethernet to USB adapter. Lets say, we have an Ethernet interface on one end and USB on the other end. We want to use 
Ethernet as USB interface. Since both are incompatible with each other, so we use an adapter that converts Ethernet to 
USB.

#### Remarks

List of Object in Adapter patter:
- Target (`USBInterface`)
- Adapter (`EthernetToUSBAdapter`)
- Adaptee (`EthernetInterface`)
- Client (`AdapterTest`)

#### Test
```
USBInterface usbInterface = new USBPort();
// Wrap a usb port in EthernetToUSBAdapter so that it behaves like ethernet interface
EthernetInterface ethernetInterface = new EthernetToUSBAdapter(usbInterface);

ethernetInterface.connectToInternet();

Assertions.assertEquals("Using through USB", outputStreamCaptor.toString()
        .trim());
```



