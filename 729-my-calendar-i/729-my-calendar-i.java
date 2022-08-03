class MyCalendar {

        ArrayList<ArrayList<Integer>> al;
    public MyCalendar() {
        
        al = new ArrayList<ArrayList<Integer>>();
    }
    
    public boolean book(int start, int end) {
        
        if(al.size()==0)
        {
            al.add(new ArrayList(Arrays.asList(start,end)));
            
        }
        else
        {
            for(int i=0;i<al.size();i++)
            {
                
                 // System.out.println(al.get(i).get(0) +" "+end +" "+ al.get(i).get(1)+" "+start);
                if((al.get(i).get(0)<end  && al.get(i).get(1)>start))
                    return false;
            
            }
            
            al.add(new ArrayList(Arrays.asList(start,end)));
        }
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */