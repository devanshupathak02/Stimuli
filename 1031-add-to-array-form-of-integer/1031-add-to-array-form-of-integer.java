class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];  // Add digit from array to k
                i--;
            }
            result.add(k % 10); // Store the rightmost digit of sum
            k /= 10;            // Carry the remaining number (without the last digit)
        }

        Collections.reverse(result); // Reverse to get the correct order
        return result;
    }
}