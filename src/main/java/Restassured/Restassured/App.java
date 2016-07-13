package Restassured.Restassured;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.google.gson.stream.JsonReader;
//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;



import Restassured.Restassured.Constants;
import Restassured.Restassured.Xls_Reader;

import Restassured.Restassured.Keywords;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

//import org.json.JSONException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;




public class App 

{
	Keywords keyword1=new Keywords();
	
	public static void main( String[] args ) throws FileNotFoundException, IOException
	{
	//App test=new App();
 
		//System.out.println(System.getProperty("user.dir"));
		
		//File fXmlFile = new File(System.getProperty("user.dir")+"//src//res//Response//"+FileName+"."+FileType);
		//System.out.println(System.getProperty("user.dir")+"//src//res//Response//JsonValidation.json");
		
		//File file = new File(System.getProperty(System.getProperty("user.dir")+"//src//res//Response//JsonValidation.json"));
		
		//File file = new File(System.getProperty("user.dir")+"//src//res//Response//JsonValidation.json");
		
		
		  
//		System.out.println(file.length());
//		//String response = file.toString();
//		//System.out.println(response);
//		
//		
//		try (FileOutputStream fop = new FileOutputStream(file)) 
//		{
//			System.out.println(file.length());
//			//String response = file.toString();
//			//System.out.println(response);
//					
//		}
//		catch (IOException e) {e.printStackTrace();}
//		
//		String response = get("/store").asString();
//		// Get the sum of all author length's as an int. "from" is again statically imported from the JsonPath class
//		int sumOfAllAuthorLengths = from(response).getInt("store.book.author*.length().sum()");
//		// We can also assert that the sum is equal to 53 as expected.
//		assertThat(sumOfAllAuthorLengths, is(53));
		
//		Response res=get("http://10.146.211.7:3000/api/v1/devices/576b92fc252a8f541d10c065");	
//		System.out.println(res.statusCode());
//		String ResMessage=res.getBody().asString();
				
//		System.out.println(ResMessage);
		
//		get("http://10.146.211.7:3000/api/v1/devices/576b92fc252a8f541d10c065").then().assertThat().body("history.temperature.findAll{humidity >30}.temperature", greaterThan(50));
//		
//		get("http://10.146.211.7:3000/api/v1/devices/576b92fc252a8f541d10c065").body("history.temperature.collect{humidity >30}.temperature",hasSize());
//		
		
		//.body("history.temperature.findAll{humidity >30.temperature",hasItems(""));	
		//String s=given().baseUri("http://10.146.211.7:3000/api/v1/devices").get("/576b92fc252a8f541d10c065").body("history.humidity",equalTo("68"));
	//	System.out.println(get("http://10.146.211.7:3000/api/v1/devices/576b92fc252a8f541d10c065").then().assertThat().body("history.humidity",equalTo("68")));
//		String s =get("http://10.146.211.7:3000/api/v1/devices/576b92fc252a8f541d10c065").then().assertThat().body("history.humidity.collect",equalTo("68")).toString();
//		
//		get("/lotto").then().body("history.humidity",\
//				
//		String words= given().when().get("http://10.146.211.7:3000/api/v1/devices/576b92fc252a8f541d10c065").then()
//		.body("history.humidity.temperature",hasItems("68")).toString();
//		System.out.println(words);
		
//	//	List<String> bookTitles = from(response).getList("store.book.findAll { it.price < 10 }.title");
		
		
//		RestAssured.useRelaxedHTTPSValidation();
//       // Response Gres=given().authentication().basic("admin", "admin").
//        ]     get(APIURL);
//            this.StoreRespose(current_TestCase_xls,TCID,APIType,Gres.asString(),rowNum);
//            int GStatusCode=Gres.getStatusCode();

//            RestAssured.useRelaxedHTTPSValidation();
//            
//            Response response= given().proxy("10.150.5.12",80).authentication().basic("admin", "admin").get("https://agtechactivate.verizon.com/agtech/v1/customers/5755b59d6e493f2121ffcbc9");
		
	//Response response = get("http://10.146.211.7:3000/api/v1/devices/576b92fc252a8f541d10c065");

  
	//given().param("x", "y").and().header("z", "w").when().get("/something").then().assertThat().statusCode(200).and().body("x.y", equalTo("z"));
	
	//List<String> bookTitles  = jsonResponse.getList(".findAll{it.temperature > 30}.humidity");
//	System.out.println(bookTitles.size());
//	String s1= jsonResponse.getString("customer.address.street");
//	String s1= jsonResponse.getList("customer.id")
	//String s1= jsonResponse.getList("customer.id.findAll{it.temperature > 40}.humidity").toString();	
//	System.out.println(""+s1);
	
	
	//list = jsonResponse.get("history");		
//	System.out.println(list.size());
//	String res=response.asString();
	
	//List<String> bookTitles = from(res).getList("store.book.findAll { it.price < 10 }.title");
		

		//String JSON = 	get("http://10.146.211.7:3000/api/v1/devices/576b92fc252a8f541d10c065").asString();
		
   // String JSON = "{\"LanguageLevels\":{\"1\":\"Pocz\\u0105tkuj\\u0105cy\",\"2\":\"\\u015arednioZaawansowany\",\"3\":\"Zaawansowany\",\"4\":\"Ekspert\"}}\n";
//
//    JSONObject jsonObject = new JSONObject(JSON);
//    System.out.println( jsonObject.length());
//    
//    JSONObject getSth = jsonObject.getJSONObject("history");
//    Object level = getSth.get("68");
//
//    System.out.println(level);

		
		
//		when().
//	       get("/store").
//	       then().
//	       body("store.book.findAll { it.price < 10 }.title", hasItems("Sayings of the Century", "Moby Dick"));
			
		
//		try
//		 {    
//			get("file:///D:/WC/Restassured/src/res/Response/JsonValidation.json").then().assertThat().and()
//			return true;
//		 }
//		 catch (AssertionError e)
//		 {     			
//			 return false;
//		 }
//	    RestAssured.useRelaxedHTTPSValidation();
//	    Response response= given().proxy("10.150.5.12",80).authentication().basic("admin", "admin").get("https://agtechactivate.verizon.com/agtech/v1/customers/5755b59d6e493f2121ffcbc9");
//	    System.out.println("Status Code "+response.statusCode());
//		JsonPath jsonResponse = new JsonPath(response.asString());
//		String s1=jsonResponse.getString("customer");
//		//ArrayList<String> list = new ArrayList<String>();
//		//String s1= jsonResponse.getString("customer");
//		//String s2= jsonResponse.getString("lastModifiedAtTimestamp");
//		System.out.println("Child Items : "+s1 );

//		
//		
//		String apiurl = "https://agtechactivate.verizon.com/agtech/v1/customers/5756ebe96e493f2121ffcc1d/flowMeters/F123/events";
//		Response res=given()
//    	.contentType("application/json;charset=UTF-8").proxy("10.150.5.12",80).authentication().basic("admin", "admin").header("api-key","2e1de0c2346ff0592530844aae0609e5")
//		.body("{\"events.timeStamp\":\"0\"}")
//		.when()
//		.post(apiurl);
//	
	
	
		
		//String apiurl = "https://agtechactivate.verizon.com/agtech/v1/customers/5756ebe96e493f2121ffcc1d/flowMeters/F123/events";
//		Response res=given()
//    	.contentType("application/json;charset=UTF-8").proxy("10.150.5.182",80).authentication().basic("admin", "admin").header("api-key","2e1de0c2346ff0592530844aae0609e5")
		
//		
//	Response response= given().contentType("application/json;charset=UTF-8").proxy("10.150.5.12",80).authentication().basic("admin", "admin")		  
//	.body("{customer.address.street=json}")
//	.when()
//	.put("https://agtechactivate.verizon.com/agtech/v1/customers/5755b59d6e493f2121ffcbc9");
//
//
//	
//		// String requestParams - jsonParams.putAll(params).valueToString();
//		
//	
//		System.out.println("Response code ....:" +response.statusCode());
//		System.out.println("Response :" +response.asString());
	
		
//		RestAssured.useRelaxedHTTPSValidation();
//	    Response response= given().proxy("10.150.5.12",80).authentication().basic("admin", "admin").get("https://agtechactivate.verizon.com/agtech/v1/customers/5755b59d6e493f2121ffcbc9"); 		
//		JsonPath jsonResponse = new JsonPath(response.asString());
//		//ArrayList<String> list = new ArrayList<String>();
//		
//		String s1= jsonResponse.getString("customer.entities.devices.attributes.name");			 
//		System.out.println("Child Items : "+s1);
		
		
	// test.Post_GetResponseMessage("http://10.146.211.7:3000/api/v1/devices", "name|type", "Testdemo21|health");
		
//		
//		
//	given().
//        header("Authorization", "abcdefgh-123456").
//        param("rideId", "gffgr-3423-gsdgh").
//        param("guestCount", 2).
//    when().
//        post("http://someWebsite/reserveRide").
//    then().
//        contentType("application/json;charset=UTF-8").
//        body("result.message", equalTo("success"));
//	    
		
		
    }
    

    
    
		
//		
//		
//		
    

	
	
	
	
   
			
////	public String  JsonGetChildItemsValue()
////	{
////		
//////			RestAssured.useRelaxedHTTPSValidation();
////		    Response response= given().proxy("10.150.5.12",80).authentication().basic("admin", "admin").get("https://agtechactivate.verizon.com/agtech/v1/customers/5755b59d6e493f2121ffcbc9"); 		
////			JsonPath jsonResponse = new JsonPath(response.asString());
////			//ArrayList<String> list = new ArrayList<String>();
////			String s1= jsonResponse.getString("customer.entities.devices.attributes.name");			 
////			System.out.println("Child Items : "+s1);
////			return s1;
////			
//			
////	        JsonPath jsonPath = new JsonPath(response.asString()).setRoot("events");
////            int lottoId = jsonPath.getInt("energyAvailable");
////            List winnderIds = jsonPath.get("energyAvailablec.winnderId");
//            
//			
//	}
//		
    
	    
	
	/**************************************************************************
	 *  Function name 		: ExpectedValueValidation
	 *  Reuse Function 		: spiltstring
	 *  Description 		: Validate the JSON and XML file field value
	 	/**********************************************************************/
    public boolean ExpectedValueValidation(String url,String str1,String str2) 
    {
    		try
    		 {    
    			get(url).then().assertThat().body(str1, equalTo(str2));
    			return true;
    		 }
    		 catch (AssertionError e)
    		 {     			
    			 return false;
    		 }
    }
    
	/***************************************************************************************
	 *  Function name 		: spiltstring
	 *  Reuse Function 		: ReadExcel_Data2
	 *  Description 		: Split the GetOutputKey and Expected values using delimiter |. 
	/****************************************************************************************/         

    public void spiltstring( Xls_Reader current_TestCase_xls,int rowNum,String url,String S1, String S2) 
    {
    	boolean SetValue3,SetValue4;
       	String joined = null;
    	String[] GetOutputKey = S1.split("\\|");
    	String[] Actual = S2.split("\\|");
    	String[] descrition = new String[GetOutputKey.length];
    	String Status=null;
    	boolean TestFlag=true; 	
    	boolean[] result = new boolean[GetOutputKey.length];
		for(int i=0;i<GetOutputKey.length;i++)
		{	
		 	result[i]= ExpectedValueValidation(url, GetOutputKey[i], Actual[i]);
			if (result[i] == true)
			 descrition[i]= "Validation match " + GetOutputKey[i]+":" +Actual[i];				
			else{
				TestFlag=false;
				descrition[i]= "Validation not match " + GetOutputKey[i]+":" +Actual[i];
				}
		  } 			
			joined = String.join("|", descrition);			
			if (TestFlag==true)
			 Status ="PASS"; 
			else
			 {Status="FAIL";}
			
			 SetValue3=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Description", rowNum, joined);
			 SetValue4=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, Status);
			 System.out.println(" Result:"+SetValue3+SetValue4);
			
		}
	
	/***************************************************************************************
	 *  Function name 		: Post_GetResponseMessage
	 *  Reuse Function 		: ReadExcel_Data2 
	 *  Description 		: Post Method API WebServices
	/****************************************************************************************/         

    public Response Post_GetResponseMessage(String apiurl,String PKeys, String PValues){    
    	int StatusCode;
    	StatusCode=1;
    	
    	//Map<String, Object>  jsonAsMap = new HashMap(); 
    	Map<String, Object>  jsonAsMap = new HashMap<>();
        String[] ArKeys = PKeys.split(Constants.DATA_SPLIT);
        String[] ArValues = PValues.split(Constants.DATA_SPLIT);
        for(int i =0; i < (ArKeys.length & ArValues.length) ; i++)
        {
        	jsonAsMap.put(ArKeys[i], ArValues[i]);
        	
        }
        System.out.println("jsonAsMap"+jsonAsMap);
        Response res=given()    		
    	.contentType("application/json;charset=UTF-8")
		.body(jsonAsMap)
		.when()
		.post(apiurl);
    	StatusCode=res.getStatusCode();
    	if (StatusCode==200)
    	{
    		String body = res.getBody().asString();
        	System.out.println("Added the post request and the reponse is "+body);
        	return res;
    	}
    	else
    	{
    		System.out.println("Not added the post request and status code is "+res.getStatusCode());
    		return res;
    	}
    	
   }
    
    
	/***************************************************************************************
	 *  Function name 		: Delete_GetResponseMessage
	 *  Reuse Function 		: ReadExcel_Data2
	 *  Description 		: Delete Method API WebServices  
	/****************************************************************************************/ 
    public Response Delete_GetResponseMessage(String apiurl,String PKeys, String PValues){    
    	int StatusCode;
    	StatusCode=1;
    	
    	//Map<String, Object>  jsonAsMap = new HashMap();
    	Map<String, Object>  jsonAsMap = new HashMap<>();
        String[] ArKeys = PKeys.split(Constants.DATA_SPLIT);
        String[] ArValues = PValues.split(Constants.DATA_SPLIT);
        for(int i =0; i < (ArKeys.length & ArValues.length) ; i++)
        {
        	jsonAsMap.put(ArKeys[i], ArValues[i]);      	
        }
    	Response res=given()
    	.contentType("application/json;charset=UTF-8")
		.body(jsonAsMap)
		.when()
		.delete(apiurl);
		 StatusCode=res.getStatusCode();
    	System.out.println("Device is sucessfully deleted and reponse is "+StatusCode);
    	if (StatusCode==200)
    	{
    		String body = res.getBody().asString();
        	System.out.println("Deleted rquest items and the reponse is"+body);
        	return res;
    	}
    	else
    	{
    		System.out.println("Not Deleted rquest items and status code is "+res.getStatusCode());
    		return res;
    	}
   }
	/***************************************************************************************
	 *  Function name 		: Put_GetResponseMessage
	 *  Reuse Function 		: ReadExcel_Data2
	 *  Description 		: Update Method API WebServices 
	/****************************************************************************************/ 
    public Response Put_GetResponseMessage(String apiurl,String PKeys, String PValues){    
    	int StatusCode;
    	StatusCode=1;
    	
    	//Map<String, Object>  jsonAsMap = new HashMap();
    	Map<String, Object>  jsonAsMap = new HashMap<>();
        String[] ArKeys = PKeys.split(Constants.DATA_SPLIT);
        String[] ArValues = PValues.split(Constants.DATA_SPLIT);
        for(int i =0; i < (ArKeys.length & ArValues.length) ; i++)
        {
        	jsonAsMap.put(ArKeys[i], ArValues[i]);
        	
        }
    	Response res=given()
    	.contentType("application/json;charset=UTF-8")
		.body(jsonAsMap)
		.when()
		.put(apiurl);
    	StatusCode=res.getStatusCode();
    	if (StatusCode==200)
    	{
    		String body = res.getBody().asString();
        	System.out.println("Device is updated sucessfully and reponse is "+body);
        	return res;
    	}
    	else
    	{
    		System.out.println("Device is not updated and status code is "+res.getStatusCode());
    		return res;
    	}
   }
    
    /*************************************************************************************************
	 *  Function name 		: GetReferenceValue
	 *  Reuse Function 		: ReadExcel_Data2
	 *  Description 		: Get the reference value from the URL column  
	/**************************************************************************************************/   
  
	public String GetReferenceValue(String XString)
    {
    	String ResStr1,ResStr2,ResStr3,ResStr4,OpValue;
    	ResStr4=null;
    	String ReTurnString=XString;
    	Xls_Reader current_TestCase_xls1=null;
        current_TestCase_xls1=new Xls_Reader(System.getProperty("user.dir")+"//src//res//Automation_Run_Report.xlsx");
    	if (XString.contains(Constants.KEYWORD_REF))
        {
        	String[] A1tokens=XString.split(Constants.KEYWORD_REF);
        	ResStr1=A1tokens[0];
        	if (ResStr1.charAt(ResStr1.length()-1)=='{')
        	{
        	ResStr1 = ResStr1.replace(ResStr1.substring(ResStr1.length()-1), "");
        	}
        	ResStr2=A1tokens[1];
        	if (ResStr2.charAt(ResStr2.length()-1)=='}')
        	{
        		ResStr2 = ResStr2.replace(ResStr2.substring(ResStr2.length()-1), "");
        		if (ResStr2.contains("|"))
        		{
        			 String[] ArValues = ResStr2.split(Constants.DATA_SPLIT);
        			ResStr3=ArValues[0];
        			ResStr4=ArValues[1];
                	System.out.println("Ref Testcase ID : "+ResStr3); 	
                	int ValueRow= current_TestCase_xls1.getCellRowNum(Constants.TEST_STEPS_SHEET, "TCID", ResStr3);
                	OpValue=current_TestCase_xls1.getCellData(Constants.TEST_STEPS_SHEET, "Output_Values", ValueRow);
                	System.out.println(ResStr4+" Value  of "+ResStr3+" is "+OpValue);
                	ReTurnString=ResStr1+OpValue;
        		}
        	}
        }
        System.out.println("Return String:"+ReTurnString);
    	return ReTurnString;
    }
	
	/*************************************************************************************************
	 *  Function name 		: StoreRespose
	 *  Reuse Function 		: ReadExcel_Data2
	 *  Description 		: Stored the Web services Response 
	/**************************************************************************************************/
	
    public void StoreRespose(Xls_Reader current_TestCase_xls,String Filename, String FileType,String Value,int rowNum)throws FileNotFoundException
    {
    	boolean SetValue2;
    	File file = new File(System.getProperty("user.dir")+"//src//res//Response//"+Filename+"."+FileType);
		try (FileOutputStream fop = new FileOutputStream(file)) 
		{
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			// get the content in bytes
			byte[] contentInBytes = Value.getBytes();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
			URL myUrl = file.toURI().toURL();
			SetValue2=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Response", rowNum, myUrl.toString());
			System.out.println("SetValue2 "+SetValue2);	
		}
     catch (IOException e) {e.printStackTrace();}
    }
   
	/*************************************************************************************************
	 *  Function name 		: JsonStream
	 *  Reuse Function 		: ReadExcel_Data2
	 *  Description 		: Read the Json response and get field value 
	/**************************************************************************************************/
    public String JsonStream(String FileName,String FileType,String Key)
    {   	
    	String ReString;
    	ReString=null;
    	ReString="Not Found";
	    File file = new File(System.getProperty("user.dir")+"//src//res//Response//"+FileName+"."+FileType);
	    try 
	        {
	        	JsonReader reader = new JsonReader(new FileReader(file));
	        	reader.beginObject();
	        	while (reader.hasNext()) 
	        	{
	        		String messgae = reader.nextName();
	        		if (messgae.equals("message")) 
	        		{
	        			ReString=reader.nextString();
	        		} 
	        		else if (messgae.equals("data")) 
	        		{
	        			reader.beginObject();
				   		while (reader.hasNext()) 
				   		{
				   			String data = reader.nextName();
				   			if (data.equals(Key)) 
			        		{			        
			        			ReString=reader.nextString();
			           		} 
				   			else 
			        		{
			        			reader.skipValue(); //avoid some unhandle events
			        		}				   		}
				   		reader.endObject();
	        		} 
	        		else if (messgae.equals(Key)) 
	        		{        			
	        			ReString=reader.nextString();	        			
	        		} 
	        		else 
	        		{
	        			reader.skipValue(); //avoid some unhandle events
	        		}
	           }	
	        	reader.endObject();
	        	reader.close();	        	
	        } 
	        catch (FileNotFoundException e) 
	        {
	        	e.printStackTrace();
	        } 
	        catch (IOException e) 
	        {
	        	e.printStackTrace();
	        }        	      
     	return ReString;
      }    
	/*************************************************************************************************
	 *  Function name 		: XMLStream
	 *  Reuse Function 		: ReadExcel_Data2
	 *  Description 		: Read the XML response and get field value 
	/**************************************************************************************************/    
    public String XMLStream(String FileName,String FileType,String Key)
    {
    	String ReString;
    	ReString=null;
    	ReString="Not Found"; 
    	      try {				
		    	  	System.out.println("XML Value for : "+FileName+" : " +FileType);	
				  	File fXmlFile = new File(System.getProperty("user.dir")+"//src//res//Response//"+FileName+"."+FileType);
				  	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				  	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();				 
				  	Document doc = dBuilder.parse(fXmlFile);
				  	doc.getDocumentElement().normalize();  				  						  	
				  	String roolElement=doc.getDocumentElement().getNodeName().toString();			  
				  	
				    NodeList nList = doc.getElementsByTagName(roolElement);			  					  					  	
				  	for (int temp = 0; temp < nList.getLength(); temp++)
				  	{				
				  		Node nNode = nList.item(temp);	
				  		
				  		if (nNode.getNodeType() == Node.ELEMENT_NODE) {				
				  			Element eElement = (Element) nNode;	
				  			ReString=eElement.getElementsByTagName(Key.trim()).item(0).getTextContent();			  						  						
				  			}
				  	}
				  } 
		      catch (Exception e) {e.printStackTrace();}
    	return ReString;
     }


	/*************************************************************************************************
	 *  Function name 		: ReadExcel_Data2
	 *  Reuse Function 		: 
	 *  Description 		: Read the all the Excel values.Based on the inputs flow the functionality. 
	/**************************************************************************************************/  

  
    public void ReadExcel_Data2(String File_name)throws AbstractMethodError, BiffException, IOException,  WriteException
    {
    	 
		  	Xls_Reader current_TestCase_xls=null;		  
            String APIType,APIURL,MethodType,ParamKey,ParamValues,Expected,Actual,TCID,OpKey,WebServices,RunMode1,SwitchingMode;
            String OutValues;
            boolean SetValue1,SetValue2,SetValue3,SetValue4,URLupdate,status,des,database;
            
            current_TestCase_xls=new Xls_Reader(System.getProperty("user.dir")+"//src//res//Automation_Run_Report.xlsx");
     	 	int TEST_CASES_rows= current_TestCase_xls.getRowCount(Constants.TEST_CASES_SHEET);     	 	
			for(int rowNum1=2;rowNum1<=TEST_CASES_rows;rowNum1++)
				{	
					String RunMode=current_TestCase_xls.getCellData(Constants.TEST_CASES_SHEET, "RunMode", rowNum1);
					System.out.println("Excecution" +RunMode+rowNum1);
					if (RunMode.equalsIgnoreCase("YES"))					
					{
						
						Constants.TEST_STEPS_SHEET=current_TestCase_xls.getCellData(Constants.TEST_CASES_SHEET, "SuiteName", rowNum1);
			     	 	int TEST_STEPS_rows= current_TestCase_xls.getRowCount(Constants.TEST_STEPS_SHEET);			
						for(int rowNum=2;rowNum<=TEST_STEPS_rows;rowNum++){
							APIType="";				
							TCID=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "TCID", rowNum);
							APIURL=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "URL", rowNum);
							OpKey=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "GetOutputKey", rowNum);
							//APIURL= this.GetReferenceValue(APIURL);
							APIType=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "RequestType", rowNum).trim();
							MethodType=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "MethodType", rowNum);
							ParamKey=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "Param_Keys", rowNum);
							ParamValues=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "Param_Values", rowNum);
							Expected=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "Expected", rowNum);		
							Actual=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "Actual", rowNum);
							WebServices=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "WebServices", rowNum);							
							RunMode1=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "RunMode", rowNum);						
							ParamValues= this.GetReferenceValue(ParamValues);
							System.out.println("Column Wise"+APIURL+APIType+MethodType+ParamKey+ParamValues+Expected+Actual+WebServices+RunMode1);
							if (RunMode1.equalsIgnoreCase("YES"))
							{
							  switch(WebServices.toUpperCase())
							  {
								case "UI":
								keyword1.openBrowser("test","IE");
								keyword1.navigate("test",APIURL);
								String s1=keyword1.VerifyWebTable("test", "//tr/td[contains(text(),'"+Expected+"')]");
								String s2=keyword1.VerifyImage("test", "//div[@class='row placeholders']//h4[(text()='"+Expected+"')]");
								
								if (s1.length() > 0  && s2.length() > 0)
								{	
								  des=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Description", rowNum, "Device "+Expected+" Validated in UI sucessfully - matched");
								  status=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "PASS");
								  System.out.println("des"+ des);
								}
								else
								{
									 des=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Description", rowNum, "Device "+Expected+" Validated in UI - un matched");
									 status=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "FAIL");	
								}
								System.out.println("status"+ status);
								 break;
							case "DATABASE":
								 database=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Description", rowNum, "Need to add Framework for DataBase Services");
								 System.out.println("database"+ database);
								break;
							case "API":	
							
								switch(MethodType) 
								{
									case "PUT":								
								    	Response Putres= this.Put_GetResponseMessage(APIURL,ParamKey,ParamValues);
								    	int PutStatusCode=Putres.getStatusCode();
								    	if (PutStatusCode==200)
								    	{								    										        	
								        	this.StoreRespose(current_TestCase_xls,TCID,APIType,Putres.asString(),rowNum);
								        	SetValue1=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "Pass");			        	        	   	
								        	OutValues=JsonStream(TCID,APIType,OpKey);
								        	SwitchingMode=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "SwitchingMode", rowNum);
								        	String[] switching = SwitchingMode.split("\\|");							           
								 			        	
								        	String switchValues=JsonStream(TCID,APIType,switching[0]);	
								    		for(int i=1;i<switching.length ;i++)
								    		{								    			
								    			String[] tc=switching[i].split(":");
								    			
								    			if (switchValues.equalsIgnoreCase(tc[0]))
								    			{		
									    			int rownum2=current_TestCase_xls.getCellRowNum(Constants.TEST_STEPS_SHEET, "TCID",tc[1]);
									    			 SetValue3=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "RunMode", rownum2, "YES");
									    			 String URL=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "URL", rownum2);
									    			 URLupdate=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "URL", rownum2, URL+"/"+OutValues);
								    			}	
								    		}
								        	 SetValue3=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Output_Values", rowNum, OutValues);
								        	 SetValue4=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Description", rowNum,ParamValues+" : Sucessfully updated");
								    	}
								    	else
								    	{								    	
								    		 SetValue1=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "Fail");
								        }					
								        break; 								    	
									case "POST":										
								    	Response Pres= this.Post_GetResponseMessage(APIURL,ParamKey,ParamValues);
								    	int PStatusCode=Pres.getStatusCode();
								    	if (PStatusCode==200)
								    	{								        	
								        	this.StoreRespose(current_TestCase_xls,TCID,APIType,Pres.asString(),rowNum);
								        	SetValue1=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "Pass");			        	        	   	
								        	OutValues=JsonStream(TCID,APIType,OpKey);
								        	SwitchingMode=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "SwitchingMode", rowNum);
								        	String[] switching = SwitchingMode.split("\\|");
								     							        	
								        	String switchValues=JsonStream(TCID,APIType,switching[0]);	
								    		for(int i=1;i<switching.length ;i++)
								    		{								    			
								    			String[] tc=switching[i].split(":");
								    			
								    			if (switchValues.equalsIgnoreCase(tc[0]))
								    			{		
									    			int rownum2=current_TestCase_xls.getCellRowNum(Constants.TEST_STEPS_SHEET, "TCID",tc[1]);
									    			 SetValue3=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "RunMode", rownum2, "YES");
									    			String URL=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "URL", rownum2);
									    			 URLupdate=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "URL", rownum2, URL+"/"+OutValues);
								    			}	
								    		}
								        	 SetValue3=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Output_Values", rowNum, OutValues);
								        	 SetValue4=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Description", rowNum,ParamValues+" : Sucessfully posted");
								        	 System.out.println("values"+ SetValue4);
								    	}
								    	else
								    	{								    		
								    		 SetValue1=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "Fail");
								        }					
								        break;
								        
								    case "GET":								    									    	
								    	Response Gres=get(APIURL);
								    	this.StoreRespose(current_TestCase_xls,TCID,APIType,Gres.asString(),rowNum);
								    	int GStatusCode=Gres.getStatusCode();								    	
								    	if (GStatusCode==200)
								    	{								        	
								        	this.StoreRespose(current_TestCase_xls,TCID,APIType,Gres.asString(),rowNum);
							        	 	switch(APIType)
								        	{
								        		case "XML" :								        		
								        		if (Expected.length() > 0 )
									    			spiltstring(current_TestCase_xls,rowNum,APIURL,OpKey,Expected);
								        		else{
										        		OutValues=XMLStream(TCID,APIType,OpKey);								        		
										        		SwitchingMode=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "SwitchingMode", rowNum);
											        	String[] switching = SwitchingMode.split("\\|");					        										           
											        					        										        
											        	String switchValues=XMLStream(TCID,APIType,switching[0]);	
											    		for(int i=1;i<switching.length ;i++)
											    		{								    			
											    			String[] tc=switching[i].split(":");									    			
											    			if (switchValues.equalsIgnoreCase(tc[0]))
											    			{		
												    			int rownum2=current_TestCase_xls.getCellRowNum(Constants.TEST_STEPS_SHEET, "TCID",tc[1]);
												    			 SetValue3=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "RunMode", rownum2, "YES");
												    			 String URL=current_TestCase_xls.getCellData(Constants.TEST_STEPS_SHEET, "URL", rownum2);
												    			 URLupdate=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "URL", rownum2, URL+"/"+OutValues);
												    			 SetValue1=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "PASS");
												    			 System.out.println("values"+ SetValue1+URLupdate+SetValue3);
											    			}	
											    		}
									    		 SetValue3=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Output_Values", rowNum, OutValues);
								        		}
									    	   	break;
										    case "JSON" :										    	
										    	spiltstring(current_TestCase_xls,rowNum,APIURL,OpKey,Expected);
										    	break;
										    }	        	
								    	} 
								    	else
								    	{
								    		 SetValue1=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "Fail");
								        	 SetValue2=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Response", rowNum, Gres.asString());
								        	 System.out.println("values"+ SetValue2);
								    	}
								    	
								        break;
								    	case "DELETE":							  
									    	Response Delres= this.Delete_GetResponseMessage(APIURL,ParamKey,ParamValues);
									    	int DelStatusCode=Delres.getStatusCode();
									    	if (DelStatusCode==404)
									    	{
									    		this.StoreRespose(current_TestCase_xls,TCID,APIType,Delres.asString(),rowNum);
									    		OutValues=JsonStream(TCID,APIType,OpKey);
									    		 SetValue1=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "PASS");
									    		 URLupdate=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Output_Values", rowNum, OutValues);
									    		System.out.println("values"+ SetValue1+URLupdate);
									    	}
									    	else
									    	{									    		
									    		 SetValue1=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Status", rowNum, "Fail");
									        	 SetValue2=current_TestCase_xls.setCellData(Constants.TEST_STEPS_SHEET, "Response", rowNum, Delres.asString());
									    	}
									    	
								    	break;
								    default:
							}
							break;
							default:
								
						   }
						}
					 }
						
				 }
			}
        }    
	}
	
    
	
