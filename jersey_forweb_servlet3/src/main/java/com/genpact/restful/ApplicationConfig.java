package com.genpact.restful;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * 下面的两种方式都可以
 * @author 710009498
 *
 */

//@ApplicationPath("/api")
//public class ApplicationConfig extends Application {
//	
//    @Override
//    public Map<String, Object> getProperties() {
//        Map<String, Object> properties = new HashMap<String, Object>();
//        properties.put("jersey.config.server.provider.packages", "com.genpact.restful");
//        return properties;
//    }
//}


@ApplicationPath("/api")
public class ApplicationConfig extends  ResourceConfig{
	
	public ApplicationConfig() {
		packages("com.genpact.restful");
		property("jersey.config.server.provider.classnames", "org.glassfish.jersey.filter.LoggingFilter;  org.glassfish.jersey.media.multipart.MultiPartFeature");
	}
	
   
}