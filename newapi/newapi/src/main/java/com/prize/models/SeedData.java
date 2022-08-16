package com.prize.models;
import com.prize.jsonmodel.Root;
import com.google.gson.*;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class SeedData 
{
	public static void Initialize()
	{		
		
		  File jsonFile = new File("/prize.json").getAbsoluteFile();

	        ObjectMapper mapper = new ObjectMapper();
	        Root root = null;
			try {
				root = mapper.readValue(jsonFile, Root.class);
			} catch (StreamReadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatabindException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println(root);
	   
	        	
	    }
		
}

