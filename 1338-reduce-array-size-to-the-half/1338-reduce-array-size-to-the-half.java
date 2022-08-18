class Solution {
  public int minSetSize(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Arrays.stream(arr).forEach(num -> countMap.put(num, countMap.getOrDefault(num, 0) + 1));
        List<Integer> countValues = countMap.values().stream().sorted(Comparator.reverseOrder()).toList();
        
        int size = arr.length, result = 0;
        while (size > arr.length / 2) 
            size -= countValues.get(result++);
        
        return result;
    }
}