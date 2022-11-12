package level_0;

import java.util.*;

public class StrCut {
	    public String[] strCut(String my_str, int n) {
	        final int SHORT_PIECE_LEN = my_str.length() % n;
	        final int STR_LEN = my_str.length();
	        String[] answer;
	        List<String> strPiece = new ArrayList<>();

	        for (int i = 1; i <= STR_LEN / n; i++) {
	            strPiece.add(my_str.substring(n * (i - 1), n * i));
	        }
	        if (SHORT_PIECE_LEN  != 0) {
	            strPiece.add(my_str.substring(STR_LEN - SHORT_PIECE_LEN, STR_LEN));
	        }

	        answer = new String[strPiece.size()];
	        for (int i = 0; i < answer.length;i++) {
	            answer[i] = strPiece.get(i);
	        }
	        return answer;
	    }
}