import java.util.*;

class Group_Anagrams {
    public static void main(String[] args) {
        Map<String, List<String>> m1 = new HashMap<>();
        String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        for (String s1 : str) {

            char arr[] = s1.toCharArray();
            Arrays.sort(arr);
            String s2 = new String(arr);
            if (!m1.containsKey(s2))
                m1.put(s2, new ArrayList<>());
            m1.get(s2).add(s1);
        }
        System.out.print(m1.values());
    }
}