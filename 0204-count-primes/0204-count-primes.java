class Solution {
    public int countPrimes(int n) {
   
        int number=n;
        boolean values[]=new boolean[number+1];
        if(number<2)
        {
            return 0;
        }
        for(int i=2;i<number;i++)
        {
            values[i]=true;
        }
        for(int i=2;i*i<=number;i++){
            if(values[i]==true){
                for(int j=i*i;j<number;j+=i){
                    values[j]=false;
                }
            }
        }
        int count=0;
        for(int k=2;k<number;k++)
        {
            if(values[k]==true)
            {
                count++;
            }
        }
        return count;
    }
}