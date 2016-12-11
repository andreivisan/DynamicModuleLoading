package io.programminglife.dynamicmoduleloading;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import io.programminglife.loader.PluginService;
import io.programminglife.loader.ServiceFactory;
import io.programminglife.loader.internals.Plugins;

public class MainActivity extends Activity {

    private TextView plugin1Text;
    private TextView plugin2Text;
    private TextView plugin3Text;

    private PluginService pluginService;
    private ServiceFactory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plugin1Text = (TextView) findViewById(R.id.plugin1_text);
        plugin2Text = (TextView) findViewById(R.id.plugin2_text);
        plugin3Text = (TextView) findViewById(R.id.plugin3_text);

        factory = new ServiceFactory();

        callPlugin1();
        callPlugin2();
        callPlugin3();
    }

    private void callPlugin1() {
        try {
            pluginService = factory.getService(Plugins.PLUGIN1.getServiceName());
            plugin1Text.setText(pluginService.action());
        } catch (ClassNotFoundException e) {
            plugin1Text.setText("Plugin 1 not loaded");
        } catch (IllegalAccessException e) {
            plugin1Text.setText("Plugin 1 not loaded");
        } catch (InstantiationException e) {
            plugin1Text.setText("Plugin 1 not loaded");
        }
    }

    private void callPlugin2() {
        try {
            pluginService = factory.getService(Plugins.PLUGIN2.getServiceName());
            plugin2Text.setText(pluginService.action());
        } catch (ClassNotFoundException e) {
            plugin2Text.setText("Plugin 2 not loaded");
        } catch (IllegalAccessException e) {
            plugin2Text.setText("Plugin 2 not loaded");
        } catch (InstantiationException e) {
            plugin2Text.setText("Plugin 2 not loaded");
        }
    }

    private void callPlugin3() {
        try {
            pluginService = factory.getService(Plugins.PLUGIN3.getServiceName());
            plugin3Text.setText(pluginService.action());
        } catch (ClassNotFoundException e) {
            plugin3Text.setText("Plugin 3 not loaded");
        } catch (IllegalAccessException e) {
            plugin3Text.setText("Plugin 3 not loaded");
        } catch (InstantiationException e) {
            plugin3Text.setText("Plugin 3 not loaded");
        }
    }
}
