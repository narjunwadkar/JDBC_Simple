package com.example.controller;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
  
class GFG {
  
    // Function to print difference in
    // time start_date and end_date
	

	long difference_In_Seconds;
	long difference_In_Minutes;
	long difference_In_Hours;
	long difference_In_Years;
	long difference_In_Days;
	
		
    public GFG  findDifference(String start_date, String end_date)
    {
  
        // SimpleDateFormat converts the
        // string format to date object
    	
    	    	
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss");
  
        // Try Block
        try {
  
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
  
            // Calucalte time difference
            // in milliseconds
            long difference_In_Time
                = d2.getTime() - d1.getTime();
  
            // Calucalte time difference in
            // seconds, minutes, hours, years,
            // and days
            difference_In_Seconds
                = (difference_In_Time
                   / 1000)
                  % 60;
  
            difference_In_Minutes
                = (difference_In_Time
                   / (1000 * 60))
                  % 60;
  
            difference_In_Hours
                = (difference_In_Time
                   / (1000 * 60 * 60))
                  % 24;
  
            difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
  
            difference_In_Days
                = (difference_In_Time
                   / (1000 * 60 * 60 * 24))
                  % 365;
  
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
  
            System.out.print(
                "Difference "
                + "between two dates is: ");
  
            System.out.println(
                difference_In_Years
                + " years, "
                + difference_In_Days
                + " days, "
                + difference_In_Hours
                + " hours, "
                + difference_In_Minutes
                + " minutes, "
                + difference_In_Seconds
                + " seconds");
            
           
        }       
              
  
        // Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();
        }
             
        
    
        return new GFG();
    }
    
     
   
}
