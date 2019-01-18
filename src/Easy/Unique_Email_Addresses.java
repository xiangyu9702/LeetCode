package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//929
public class Unique_Email_Addresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> se=new HashSet<>();
        for (String email:emails){
            int x=email.indexOf("@");
            System.out.println(x);
            String local=email.substring(0,x);
            String domain=email.substring(x);
            if (local.contains("+")){
                local=local.substring(0,local.indexOf("x"));
            }
        local=local.replaceAll(".","");
            se.add(local+domain);
        }
        return se.size();
    }
}
