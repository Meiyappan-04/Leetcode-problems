class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        if (n <= 1)
            return s;

        int mid = n / 2;

        String firstHalf = s.substring(0, mid);
        String secondHalf = (n % 2 == 0) ? s.substring(mid) : s.substring(mid + 1);

        char[] ch1 = firstHalf.toCharArray();
        char[] ch2 = secondHalf.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String left = new String(ch1);
        String right = new StringBuilder(new String(ch2)).reverse().toString();

        if (n % 2 == 0) {
            return left + right;
        }

        return left + s.charAt(mid) + right;
    }
}