import java.util.*;
public class hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
       // System.out.println(map);
       // System.out.println("What key do you need to check?");
       // Scanner sc = new Scanner(System.in);
       // String key = sc.nextLine();
       // if (map.containsKey(key)){
       //     System.out.println("The value for the key " + key + " is " + map.get(key));
      //  }
      //  else{
      //      System.out.println("The key " + key + " is not present in the hashmap");

    //    }
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.print (e.getKey()+ ":");
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key +" : " + map.get(key));
        }
        map.remove("Three");
        Set<String> keyss = map.keySet();
        for (String key : keyss){
            System.out.println(key +" : " + map.get(key));
        }
    }
    
}
