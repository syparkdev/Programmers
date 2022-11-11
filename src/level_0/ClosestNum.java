package level_0;

import java.util.*;

public class ClosestNum {
    public static int closestNum(int[] array, int n) {
        Map<Integer, Integer> closeDegree = new TreeMap<>();
        List<Map.Entry<Integer, Integer>> entryForSort;
        
        for (int key : array) {
        	int max = Math.max(key, n);
        	int min = Math.min(key, n);
        	closeDegree.put(key, max - min);
        }
        entryForSort = new ArrayList<>(closeDegree.entrySet());
        entryForSort.sort(Map.Entry.comparingByValue());
        
        return entryForSort.get(0).getKey();
    }
}