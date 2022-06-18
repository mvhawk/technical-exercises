package cl.technical.excercises.service;

import java.util.HashMap;
import java.util.Map;

public class StringService {
    
    public Map<Character, Integer> countingDuplicateCharacters(String str){
        Map<Character, Integer> mapStr = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char charStr = str.charAt(i);
            mapStr.compute(charStr, (k,v) -> (v==null) ? 1: ++v);
        }
        return mapStr;
    }
}
