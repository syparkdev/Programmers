package level_0;

import java.util.Arrays;

public class AppearedOnlyOnce {
    public static String appearedOnlyOnce(String s) {
    	char[] sorting = {};
    	String sorted = "";
    	
        sorting = s.toCharArray();
        Arrays.sort(sorting);
        sorted = new String(sorting).replaceAll("([a-z])\\1+","");
        
        return sorted;
    }
}