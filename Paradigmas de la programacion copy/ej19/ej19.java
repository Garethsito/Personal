package ej19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ej19 {
  /**
   * @param args
   * @throws IOException 
   * @throws FileNotFoundException 
   * @throws org.json.simple.parser.ParseException 
   */
  public static void main(String[] args) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {
    System.out.println("hola mundo");
    JSONParser jsonP = new JSONParser();
    try(FileReader reader = new FileReader("d:/borrame/postsmodificado.json")){
      Object obj = jsonP.parse(reader);
      JSONArray empList =(JSONArray) obj;
      //System.out.println(empList);
      empList.forEach(emp -> parseEmpObj((JSONObject)emp));
    }
    catch (FileNotFoundException e){e.printStackTrace();}
    catch (IOException e){e.printStackTrace();}   
 } //main
 private static void parseEmpObj(JSONObject emp){
  JSONObject empObj = (JSONObject) emp.get("posts");
  String userid =  empObj.get("userId").toString();
  //String userid =  (String) empObj.get("userId");
  String id =  empObj.get("id").toString();
  String title = empObj.get("title").toString();
  String body =  empObj.get("body").toString();
  System.out.println("User = "+ userid);
  System.out.println("ID="+ id);
  System.out.println("Title = " + title);
  System.out.println("Message = " + body);
}

}