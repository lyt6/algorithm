package com.hello.number;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] doublePointer(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    public int[] hashMap(int[] arr ,int target){
        Map<Integer,Integer> map  = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return new int[0];
    }

}
