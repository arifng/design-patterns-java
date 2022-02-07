package structural.proxy;

import java.util.Set;

/**
 * Created by Rana on 07/02/2022.
 */
public class ProxyInternet implements Internet {
    private Set<String> restrictedSites;
    private RealInternet realInternet;

    public ProxyInternet() {
        restrictedSites = Set.of("www.bannedsite.com",
                "www.restrictedsite.com");
        realInternet = new RealInternet();
    }

    @Override
    public void connect(String domainName) throws IllegalAccessException {
        if (restrictedSites.contains(domainName)) {
            throw new IllegalAccessException("You don't have permission to access this site");
        }

        realInternet.connect(domainName);
    }
}
