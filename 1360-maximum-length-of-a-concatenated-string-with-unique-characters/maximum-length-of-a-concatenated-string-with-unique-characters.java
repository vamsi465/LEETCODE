class Solution {
    int filter(List<String> arr,int num)
    {
        Set<Character> hs=new HashSet<>();
        int length=0;
        int j=0;
        while(num>0)
        {
            int lastDigit =num&1;
            if(lastDigit==1)
            {
                String s=arr.get(j);
                for(int k=0;k<s.length();k++)
                {
                    char ch=s.charAt(k);
                    if(hs.contains(ch))
                    {
                        return 0;
                    }
                    else{
                        length++;
                        hs.add(ch);
                    }
                }
            }
            j++;
            num=num>>1;
        }
        return length;
    }
    public int maxLength(List<String> arr) {
        List<String> ans=new ArrayList<>();
        int max=0;
       int n=arr.size();
       for(int i=0;i<(1<<n);i++)
       {
        int num=i;
         int length=filter(arr,num);
         max=Math.max(length,max);
       }
       return max;
       }
    }