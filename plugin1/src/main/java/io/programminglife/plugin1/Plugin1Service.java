package io.programminglife.plugin1;

import android.util.Log;

import io.programminglife.loader.PluginService;

/**
 * Created by andreivisan on 12/11/16.
 */

public class Plugin1Service implements PluginService {

    private static final String TAG = "Plugin1Service";


    @Override
    public String action() {
        return "Plugin 1 activated";
    }

}
