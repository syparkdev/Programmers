package level_0;

import java.util.*;

public class PatientSeq {
	
	public int[] patientSeq(int[] emergency) {
		
		int[] em_clone = emergency.clone();
		int[] answer = new int[emergency.length];
		HashMap<Integer,Integer> pSeq = new HashMap<>();
		
		Arrays.sort(em_clone);
		
		for(int i = 0; i < emergency.length; i++) {
			
			pSeq.put(em_clone[i], emergency.length - i);
		}
		
		for(int i = 0; i < emergency.length;i++) {
			
			answer[i] = pSeq.get(emergency[i]);
		}
		
		return answer;
	}
}
