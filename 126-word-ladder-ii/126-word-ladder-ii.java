class Solution {
    
    public boolean diffByOne(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))count++;
        }
        return count==1 ? true: false;
    }
    
    public HashMap<String,List<String>> graph(List<String> wordList){
        HashMap<String,List<String>> adj_list = new HashMap<>();
        for(String word: wordList){
            adj_list.put(word,new ArrayList<String>());
        }
        
        
        for(int i=0;i<wordList.size();i++){
            for(int j=i+1;j<wordList.size();j++){
                if(diffByOne(wordList.get(i),wordList.get(j))){
                    adj_list.get(wordList.get(i)).add(wordList.get(j));
                    adj_list.get(wordList.get(j)).add(wordList.get(i));
                }
            }
        }
        return adj_list;
    }
    
    public void reverseTraverse(List<List<String>> res,String beginWord,String endWord,List<String> path,HashMap<String,List<String>> adj_list,Map<String, Integer> levels){
        if(endWord==beginWord){
            List<String> path_copy = new ArrayList<>();
            for(String p: path)path_copy.add(0,p);
            path_copy.add(0,beginWord);
            
            res.add(path_copy);
            return;
        }
        // add endword to the path
        path.add(endWord);
        
        // get all the neigbours of endWord
        for(String neigh: adj_list.get(endWord)){
            // the neigh which is at one level above endWord level is the desired neighbours 
            if(levels.get(endWord)!=null && levels.get(neigh)!=null && levels.get(endWord)-1 == levels.get(neigh)){
                reverseTraverse(res,beginWord,neigh,path,adj_list,levels);
            }
        }
        // backtrack
        path.remove(path.size()-1);
    }
    
    // Time Complexity: O(N^2 + N)
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        wordList.add(0,beginWord);// add the beginWord in wordList
        HashMap<String,List<String>> adj_list = graph(wordList);// create graph
        Map<String, Integer> levels = new HashMap<>();// mark the levels because we need to backtrack in a order to get all paths
        levels.put(beginWord, 0);// beginword is at first levels
        
        Set<String> visited = new HashSet<>(wordList.size());//visited Set
        
        // init the queue
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);visited.add(beginWord);
        
        // for getting the levels from begin to endWord
        int cnt = 0;
        int lev = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                // poll and get the currLevel
                String poll = q.poll();
                int currLevel = levels.get(poll);
                // if we got endWord then update the lev and break 
                if(poll.equals(endWord)){
                    lev = cnt;
                    break;
                }
                // get all the neighbours
                List<String> neighs = adj_list.get(poll);
                for(String neigh: neighs){
                    // not visited
                    if(!visited.contains(neigh)){
                        visited.add(neigh);
                        q.add(neigh);
                        // add the levels [neigh -> parent_level+1]
                        levels.put(neigh,currLevel+1);
                    }
                }
            }
            cnt++;
        }
        
        List<List<String>> res = new ArrayList<>();
        if(lev!=0){
           // now just backtrack to get all the paths from endword to beginword
           reverseTraverse(res,beginWord,endWord,new ArrayList<String>(),adj_list,levels);
           return res;
        }
        return res;
    }
}