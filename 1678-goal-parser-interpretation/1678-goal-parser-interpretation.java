class Solution {
    public String interpret(String command) {
        	StringBuilder S = new StringBuilder();
	for(int i = 0 ; i < command.length() ; i++){
		if(command.charAt(i)=='G') S.append('G');
		if(command.charAt(i)=='('){
			if(command.charAt(i+1)==')') {S.append('o'); i++;}
			else{S.append("al"); i = i + 3;}
		}
	}
	return S.toString();
//         String res="";
//         for(int i=0;i<command.length();i++)
//         {
//             char ch=command.charAt(i);
            
//             if(ch=='G')
//                 res+="G";
//             else if(ch==')')
//             {
//                 if(command.charAt(i-1)=='(')
//                     res+="o";
//                 else
//                 res+="al";
//             }
            

//         }
//         return res;
    }
}