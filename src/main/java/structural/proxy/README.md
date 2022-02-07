## Proxy Design Pattern

Proxy design pattern provides the control for accessing the original object. It adds a way to hide the complexities 
of the real object.

Four use cases:
- `Virtual proxy` used when object creation expensive, real object is only created when a client accesses the object.
- `Remote proxy` used for local representative for an object that resides in a different address space.
- `Protective proxy` used to control access to a sensitive real object.
- `Smart proxy` used for some additional actions when an object is accessed. Like loading DB object into memory.

#### Example

A real life scenario is college internet, which restricts few site access. The proxy first checks the host user are 
connecting to, if it is not part of restricted site list, then it connects to the real internet. 
This is related to `protection proxy`.

#### Remarks

- `ProxyInternet` is the proxy object of `RealInternet` object.
- Client only access proxy internet's `connect` method. It checks site names and if allowed, then it call real object's 
method.

#### Test
```
Exception exception = Assertions.assertThrows(IllegalAccessException.class, () -> {
            internet.connect("www.bannedsite.com");
        });
Assertions.assertEquals("You don't have permission to access this site", exception.getMessage());

// or

try {
    internet.connect("www.abc.com");    
} catch (Exception e) {
    e.printStackTrace();
}
Assertions.assertEquals("Connecting to internet", outputStreamCaptor.toString().trim());
```



