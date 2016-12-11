package io.programminglife.loader;

/**
 * Created by andreivisan on 12/7/16.
 */

public class ServiceFactory {

    public PluginService getService(String serviceName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (PluginService) Class.forName(serviceName).newInstance();
    }

}
