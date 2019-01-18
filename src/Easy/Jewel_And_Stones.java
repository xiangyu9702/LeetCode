package Easy;
//771
//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

import java.util.HashSet;
import java.util.Set;

//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
//Example 1:
//Input: J = "aA", S = "aAAbbbb"
//Output: 3
//Example 2:
//Input: J = "z", S = "ZZ"
//Output: 0
public class Jewel_And_Stones {
    public int numJewelsInStones(String J, String S) {
        int sum=0;
    char[] jchar=J.toCharArray();
    char[] schar=S.toCharArray();
    HashSet<Character> j_set=new HashSet<Character>();
    for (int i=0;i<jchar.length;i++){
        j_set.add(jchar[i]);
    }
        System.out.println(j_set);
        jchar=j_set.toString().toCharArray();
    for(char a:jchar){
        for (char b:schar){
            if(a==b){
                sum++;
            }
        }
    }
        return sum;
    }
}

