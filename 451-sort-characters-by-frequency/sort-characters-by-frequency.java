// class Solution {
//     public String frequencySort(String s) {
//       int n = s.length();
//     Map<Character,Integer>map = new HashMap<>();
//     for(char c:s.toCharArray()){
//         map.put(c,map.getOrDefault(c,0)+1);
//     }  
//     List<Map.Entry<Character,Integer>>list = new ArrayList<>(map.entrySet());
//     list.sort((a,b)->{
//         int com = Integer.compare(b.getValue(),a.getValue());
//         if(com!=0)return com;
//         return Integer.compare(a.getValue(),b.getValue());
//     });
//     String ans="";
//     for(Map.Entry<Character,Integer>entry:list){
//         int f=entry.getValue();
//         for(int i=0;i<f;i++){
//             ans+=entry.getKey();
//         }
//     }
//     return ans;
//     }
// }

class Solution {
    public String frequencySort(String s) {
    HashMap<Character,Integer> map = new HashMap<>();
    for(char c:s.toCharArray()){
      map.put(c,map.getOrDefault(c,0)+1);
    }
  List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
  Collections.sort(list,(a,b)->Integer.compare(b.getValue(),a.getValue()));
  StringBuilder sb = new StringBuilder();
for(Map.Entry<Character,Integer> entry: list){
    char ch = entry.getKey();
    int freq = entry.getValue();
    for(int i=0;i<freq;i++){
        sb.append(ch);
    }
}
return sb.toString();
} }