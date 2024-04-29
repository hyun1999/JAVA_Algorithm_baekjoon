import java.util.*;
class Solution {
    public static String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String str : participant){
            map.put(str,0);
        }

        for(String s : completion){
            map.replace(s,map.get(s)+1);
        }

        for(String str : participant){
            map.replace(str,map.get(str)-1);
        }

        for(String st : participant){
            if(map.get(st) != 0){
                return st;
            }

        }
        return null;
    }
}