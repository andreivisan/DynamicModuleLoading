package io.programminglife.loader.internals;

/**
 * Created by andreivisan on 12/11/16.
 */

public enum Plugins {

    PLUGIN1 {
        @Override
        public String getServiceName() {
            return "io.programminglife.plugin1.Plugin1Service";
        }
    },

    PLUGIN2 {
        @Override
        public String getServiceName() {
            return "io.programminglife.plugin2.Plugin2Service";
        }
    },

    PLUGIN3 {
        @Override
        public String getServiceName() {
            return "io.programminglife.plugin3.Plugin3Service";
        }
    };

    public abstract String getServiceName();

}
