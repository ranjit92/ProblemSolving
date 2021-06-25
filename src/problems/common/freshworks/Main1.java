package problems.common.freshworks;

import java.util.List;
import java.util.*;

class Main1 {
  public static void main(String[] args) {
   

  String[] str = new String[]{"trace", "react", "retro", "resorts", "cater", "carte", "eat", "rosters", "cat", "bat", "act", "123", "321"};

  Map<String, List<String>> map = new HashMap<>();

  for(String s : str){

    char[] sc = s.toCharArray();
    Arrays.sort(sc);
    String sorted = String.valueOf(sc);

    if(!map.containsKey(sorted)){
      List<String> list = new ArrayList<>();
      list.add(s);
      map.put(sorted, list);
    }
    else{
      map.get(sorted).add(s);
    }

  }

  for(List<String> lst : map.values()){
    
    for(String s : lst){
      System.out.print(s + " ");
    }
    System.out.println();
  }

  }
}