class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int pcount[] = new int[26];
        int scount[] = new int[26];
        for (int i = 0; i < p.length(); i++)
            pcount[p.charAt(i) - 'a']++;
        int left=0;
        for(int right=0;right<s.length();right++){
            scount[s.charAt(right)-'a']++;
            if(right-left+1>p.length()){
                scount[s.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(pcount,scount))
                l1.add(left);
        }
        return l1;
    }
}