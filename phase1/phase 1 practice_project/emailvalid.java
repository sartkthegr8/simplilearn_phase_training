import java.util.regex.*;
import java.util.*;

public class emailvalid {



        public static void main(String args[]){
            ArrayList<String> emails = new ArrayList<String>();
            emails.add("java@domain.co.in");
            emails.add("java@domain.com");
            emails.add("java.name@domain.com");
            emails.add("java#@domain.co.in");
            emails.add("java@domain.com");
            emails.add("java@domaincom");
            //Add invalid emails in list
            emails.add("@yahoo.com");
            emails.add("java#domain.com");
            //Regular Expression
            String regex = "^(.+)@(.+)$";
            //Compile regular expression to get the pattern
            Pattern pattern = Pattern.compile(regex);
            //Iterate emails array list
            for(String email : emails){
                //Create instance of matcher
                Matcher matcher = pattern.matcher(email);
                System.out.println(email +" : "+ matcher.matches()+"\n");
            }
        }
}


