
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Group_Anagrams {

    public static void main(String[] args) {

        String strs[] = {"eat", "ate", "bat", "tan", "tea", "nat"};

        System.out.println(groupAnagrams(strs));
    }

    static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String strs1 : strs) {

            char str[] = strs1.toCharArray();
            Arrays.sort(str);

            String result = new String(str);

            if (!map.containsKey(result)) {
                map.put(result, new ArrayList<>());

            }
            map.get(result).add(strs1);
        }
        return new ArrayList<>(map.values());
    }
}
