public class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<List<String>>();
        int n = paths.length;
        if (n == 0) return result;
        
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] strs = path.split("\\s+");
            for (int i = 1; i < strs.length; i++) {
                int idx = strs[i].indexOf("(");
                String content = strs[i].substring(idx);
                String filename = strs[0] + "/" + strs[i].substring(0, idx);
                List<String> filenames = map.getOrDefault(content, new ArrayList<String>());
                filenames.add(filename);
                map.put(content, filenames);
            }
        }
        
//         for (String key : map.keySet()) {
//             if (map.get(key).size() > 1) {
//                 result.add(new ArrayList<String>(map.get(key)));
//             }
//         }
        map.entrySet().removeIf(entry->entry.getValue().size()<2);
        return new ArrayList<>(map.values());
        
      //  return result;
    }
}