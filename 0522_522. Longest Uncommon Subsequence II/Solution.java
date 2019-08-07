import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=522 lang=java
 *
 * [522] Longest Uncommon Subsequence II
 */
class Solution {
    public int findLUSlength(String[] strs) {
        if(strs.length == 0) {
            return -1;
        }

        Arrays.sort(strs, new Comparator<String>(){
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        Set<String> duplicates = getDuplicates(strs);
        for(int i = 0; i < strs.length; i++){
            if(!duplicates.contains(strs[i])) {
                if(i == 0) {
                    return strs[0].length();
                }
                for(int j = 0; j < i; j++){
                    if(isSubsequence(strs[i], strs[j])){
                        break;
                    }
                    if(j == i - 1){
                        return strs[i].length();
                    }
                }
            }
        }
        return -1;
    }

    private Set<String> getDuplicates(String[] strs) {
        Set<String> set = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for(String s : strs){
            if(set.contains(s)){
                duplicates.add(s);
            }
            set.add(s);
        }
        return duplicates;
    }

    private boolean isSubsequence(String child, String parent) {
        int indexChild = 0;
        int indexParent = 0;
        while(indexChild < child.length() && indexParent < parent.length()) {
            if(child.charAt(indexChild) == parent.charAt(indexParent)) {
                indexChild++;
            }
            indexParent++;
        }
        return indexChild == child.length();
    }
}


