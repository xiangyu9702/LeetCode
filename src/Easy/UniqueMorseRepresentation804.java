package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseRepresentation804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for (int a=0;a<words.length;a++){
            String s="";
            for (char b:words[a].toCharArray()
                 ) {
                s=s+morse[b-'a'];
            }
            set.add(s);
        }
    return set.size();}
}
