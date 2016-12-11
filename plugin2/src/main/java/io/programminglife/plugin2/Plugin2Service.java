package io.programminglife.plugin2;

import android.util.Log;

import io.programminglife.loader.PluginService;

/**
 * Created by andreivisan on 12/11/16.
 */

public class Plugin2Service implements PluginService {

    private static final String TAG = "Plugin2Service";


    @Override
    public String action() {
        return "Plugin 2 activated";
    }

}
