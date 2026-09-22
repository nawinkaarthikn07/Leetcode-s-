class Solution {
    public boolean isValid(String s) {
        char c[]=s.toCharArray();
        char s1[]=new char[s.length()+1];
        int i=1;
        if(s.length()==1){return false;}
        for(char c1:c){
            if(c1==')' || c1==']' || c1=='}'){
                if(c1==')' && s1[i-1]=='('){
                    s1[--i]=' ';
                }
                else if(c1=='}' && s1[i-1]=='{'){
                    s1[--i]=' ';
                }
                else if(c1==']' && s1[i-1]=='['){
                    s1[--i]=' ';
                }
                else{
                    return false;
                }
                continue;
               }
               s1[i++]=c1; 
            }
            if(s1[1]==' '){
                return true;
            }
            else{
                return false;
            }

        }

    }