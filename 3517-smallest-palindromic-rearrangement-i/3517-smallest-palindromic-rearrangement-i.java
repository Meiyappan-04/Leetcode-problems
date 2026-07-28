class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n==0)
        return null;
        if(n==1)
        return s;
        int mid=n/2;
        String tots=" ";
        if(n%2!=0){
            String firstHalf=s.substring(0,mid);
            String secHalf=s.substring(mid+1);
            char middle=s.charAt(mid);
            char[] ch1=firstHalf.toCharArray();
            Arrays.sort(ch1);
            String og1=new String(ch1);
            char[] ch2=secHalf.toCharArray();
            Arrays.sort(ch2);
            String og2=new String(ch2);
            String reversed = new StringBuilder(og2).reverse().toString();
            tots=og1+middle+reversed;
        }
        else{
            String firstHalf=s.substring(0,mid);
            String secHalf=s.substring(mid);
            char[] ch1=firstHalf.toCharArray();
            Arrays.sort(ch1);
            String og1=new String(ch1);
            char[] ch2=secHalf.toCharArray();
            Arrays.sort(ch2);
            String og2=new String(ch2);
            String reversed = new StringBuilder(og2).reverse().toString();
            tots=og1+reversed;
        }
        return tots;
    }
}