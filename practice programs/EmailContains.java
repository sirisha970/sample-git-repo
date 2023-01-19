import java.util.regex.*;    
import java.util.*;    
public class Email{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("Siri@capgemini.co.in");  
        emails.add("Siri123@capgemini.com");  
        emails.add("sirisha@capgemini.com");  
        emails.add("siri7@capgemini.co.in");  
        emails.add("sirisha789@capgemini.com");  
        emails.add("sirishaanu@capgemini.com");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("siri#capgemini.com");  
        String regex = "^(.+)@(.+)$";  
          
        Pattern pattern = Pattern.compile(regex);  
         
        for(String email : emails){    
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  