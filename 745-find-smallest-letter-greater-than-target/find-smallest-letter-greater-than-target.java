class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (letters[mid] <= target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return letters[s % letters.length];//here we wrap up for numbers to bound inside the array=>ex:0->1->2 ,length=3====>3%3=0....now start again with 0....
    }
}
