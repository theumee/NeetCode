package ArraysAndHashmaps;

import java.util.*;

public class TopKFrequentElements {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new TreeMap<>();

            for (int num : nums) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            int[] result = new int[k];

            int j = 0;
            System.out.println(map);
            for(Integer key : map.keySet()){
               System.out.println(key);
               if(k-- > 0){
                   result[j++] = key;
               }else {
                   break;
               }
           }

            return result;
        }

}
