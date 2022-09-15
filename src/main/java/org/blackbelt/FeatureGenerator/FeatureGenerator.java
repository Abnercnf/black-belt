package org.blackbelt.FeatureGenerator;

import io.swagger.models.*;
import io.swagger.models.parameters.BodyParameter;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.parameters.PathParameter;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.RefProperty;
import io.swagger.models.refs.RefFormat;
import io.swagger.parser.SwaggerParser;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class FeatureGenerator {
    public static void main(String[] args) {
        Swagger swagger = new SwaggerParser().read("swagger.json");

        try {
        	System.out.println("Description: " + swagger.getInfo().getDescription());
        	System.out.println("Path"+ swagger.getInfo().getTitle());
        	System.out.println("Path"+ swagger.getPath());
        	
		} catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
        
    }

//    public void returnPath(Swagger swagger, String path) {
//    	
//    } 
 
//    public void takeScreenShot() {
//		
//		try {
//			File featureFile = 
//			String title = swagger.getInfo().getDescription().replaceAll(" ","").replace('|','-').trim();
//			FileUtils.copyFile(featureFile, new File("C:\\TestScreenShot\\"+ title +".feature"), true);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//			e.getMessage();
//			
//		}
//	    
//	}

}
