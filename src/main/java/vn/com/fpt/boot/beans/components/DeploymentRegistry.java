package vn.com.fpt.boot.beans.components;

import java.util.Properties;

import org.springframework.stereotype.Component;

import vn.com.fpt.boot.commons.utils.FileUtils;


@Component
public class DeploymentRegistry {

	private Properties registry = new Properties();

    public DeploymentRegistry() {

        registry = FileUtils.load("configs/deployment.configuration.properties");

        if(registry == null) {
            registry = new Properties();
        }
    }

    public String get(String inKey) {

        if(registry.containsKey(inKey)) {
            return registry.getProperty(inKey);
        }

        return null;
    }

    public void put(String inKey, String inValue) {
        registry.put(inKey, inValue);
    }

    public void remove(String inKey) {
        if(registry.containsKey(inKey)) {
            registry.remove(inKey);
        }
    }
	
}
