package pl.nyczjablonska.recursion;

public class Palindrome {
    public boolean isIntPalindrome(int[] t) {
        int i = 0;
        int j = t.length -1;
        return checkIfIntIsPalindrome(t, i, j);
    }
    private boolean checkIfIntIsPalindrome(int[] t, int i, int j) {
        if(i == j){
            return true;
        }
        if(t[i] != t[j]){
            return false;
        }
        return checkIfIntIsPalindrome(t, i + 1, j - 1);
    }

    public boolean isStringPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        return checkIfStringIsPalindrome(s, i, j);
    }

    private boolean checkIfStringIsPalindrome(String s, int i, int j) {
        if(i == j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return checkIfStringIsPalindrome(s, i + 1, j - 1);
    }
}
