package com.genpact.restful;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    
 
    
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String postForm(
        @DefaultValue("true") @FormDataParam("enabled") boolean enabled,
//        @FormDataParam("data") FileData bean,
        @FormDataParam("file") InputStream file,
        @FormDataParam("file") FormDataContentDisposition fileDisposition,
    	@Context ServletContext context ) throws FileNotFoundException, IOException {
    	String fileName = fileDisposition.getFileName();
    	System.out.println("desc ++++++++++++++++++++++++++++");
    	System.out.println(fileName);
    	System.out.println(fileDisposition.getName());
    	System.out.println(fileDisposition.getSize());
    	System.out.println(fileDisposition.getType());
    	System.out.println("desc ++++++++++++++++++++++++++++");
    	
    	File destFile = new File(context.getRealPath("/upload")+File.separator+UUID.randomUUID().toString()+fileName.substring(fileName.lastIndexOf(".")));
    	if(null != destFile ){
    		if(!destFile.exists()){
    			destFile.getParentFile().mkdirs();
    		}
    	}
    	IOUtils.copy(file, new FileOutputStream(destFile));
    	
    	
     return null;
        // ...
    }
}
