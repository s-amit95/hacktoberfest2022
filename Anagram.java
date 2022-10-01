import java.util.*;
public class Anagram{

    public static boolean checkAnagram(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        else{
            char[] ch1 = a.toLowerCase().toCharArray();
            char[] ch2 = b.toLowerCase().toCharArray();
            
            int[] cnt = new int[26];
            for(int i=0;i<ch1.length;i++){
                cnt[ch1[i]-97]++;
            }
            for(int i=0;i<ch2.length;i++){
                cnt[ch2[i]-97]--;
            }
            for(int i=0;i<cnt.length;i++){
                if(cnt[i]!=0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        if(checkAnagram(s1, s2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }

    }
}
