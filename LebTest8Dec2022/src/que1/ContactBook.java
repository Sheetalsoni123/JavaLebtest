package que1;
import java.util.*;

public class ContactBook {
	public static void main(String[] args) {
		
        Set<String> a = new HashSet<String>();
        Set<String> b = new HashSet<String>();
        Set<String> c = new HashSet<String>();
       
        a.add("sheetal");
        a.add("4789753679");
        a.add("sheetal@gmail.com");
      
        b.add("sonam");
        b.add("2836393687");
        b.add("sonam@gmail.com");
        
        c.add("sonam");
        c.add("2836393687");
        c.add("sonam@gmail.com");
        System.out.println(a);
        System.out.println(b); 
   }
}