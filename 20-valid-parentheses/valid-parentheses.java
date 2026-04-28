class Solution {
    public boolean isValid(String s) {
      Stack<Character>sta=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{'||ch=='('||ch=='[')
            {
                sta.push(ch);
            }
            else
            {
                if(sta.isEmpty())
                {
                    return false;
                }
                char top=sta.pop();
         if(ch==')' && top!='('||ch=='}' && top!='{'||ch==']' && top!='[')
                {
                    return false;
                }
             }
         }
      return sta.isEmpty();
        }
    }
