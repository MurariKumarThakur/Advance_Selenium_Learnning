package Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.SynchronousQueue;

import org.testng.ReporterConfig.Property;

public class readPropertiesFile {
	static  boolean  b ;
	public static void main(String[] args) throws IOException {
	  File file = new File("./config/config.properties");
      FileInputStream fis = new FileInputStream(file);  
      FileOutputStream fos = new FileOutputStream(file);
      Properties property = new Properties ();
      property.load(fis);
  //--------------------------------------------------------
     /*
      * getting url  using key value 
      * 
      * and it is storing as String ....
      *  
      */
      
      
      String gettingUrl =    property.getProperty("url");
      
      
      
      
             System.out.println(gettingUrl);
             
             
             
             
             /*
              *  here i can get any value if this url key is present in respective
              *  
              *   .properties file if key will not there then
              *   
              *   i will get null 
              */
            
      
      
  //--------------------------------------------------------    
  
      
      /*
       * Getting url using key 
       * 
       * but if key is not present then this get Property will written 
       * 
       * default value ex http://goole.com ( here)
       * 
       * 
       */
   
    String gettingUrl2 = property.getProperty("url", "http://www.google.com");
           
    
          System.out.println(gettingUrl2);
    /*
     * in this case we will not get any null value 
     * 
     * because if value is not there then we can get http://www.google.com
     * 
     * if key wll match then i will get respective vlaue .... 
     * 
     * 
     * 
     */
   
    //--------------------------------
          
          property.load(fis);
          
          
          /*
           * 
           * This command will load file it is taking FileInputStreame
           * 
           * for programmer level
           * 
           * 
           * 
           */
    
    
 //----------------------------------------
          
         property.store(fos, "i am adding some comment here  ");
           
           
         /*
          * 
          * in order to store file  
          * 
          * we have to use   store() , this command is taking 
          * 
          * two argument first is  FileOutPutStreame 
          * 
          * and another is Comment , after adding this command 
          * 
          * message will display in  .properties file 
          * 
          * 
          */
         
         
         property.setProperty("url", "http://www.murari.com");
         
         /*
          * in order to add key and value in our .properties file 
          * 
          * we are using       setProperty () , this method is holding 
          * 
          * two argument first is key and second is value 
          * 
          * after executing this command data will set but need to add 
          * 
          * one more command 
          * 
          * 
          * property.store(fos , "message")
          * 
          */
         
         
         property.put("name", "Murari");
         
         
         /*
          *  this method  is similar  to
          *  
          *  setProperty()
          * 
          *  both will do same task 
          * 
          * 
          */
         
          boolean b =     property.containsKey("url");
     
     
           /*
            * 
            * This method will check whether url key is present in 
            * 
            * .properties file or not 
            * 
            * if  key is present then  this method will return  true 
            * 
            *  Otherwise false
            * 
            */
     
           property.clear();
           
           /*
            * 
            * 
            * 
            * 
            */
    
    
    
     b =     property.containsKey("url");
     
     
      
      if (b == false){
    	  
    	property.setProperty("url", "https://www.facebook")  ;
    	property.store(fos, "i am adding url-----");
    	System.out.println("url added");
      }else {
    	  
    	  
    	  String url =  property.getProperty("url");
    	  
    	  System.out.println("--- your url is ---- "+url);
    	  
    	  
      }
	}

}
