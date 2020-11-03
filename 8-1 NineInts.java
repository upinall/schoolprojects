public class NineInts {
    public static void main (String args[]) {
        // Write your code here
        int nums[] = {10, 15, 19, 23, 26, 29, 31, 34, 38};
        System.out.println("From first to last: ");
        for (int i = 0; i<nums.length; i++)
        System.out.print(nums[i]+" ");
        System.out.println("From last to first: ");
        for (int i = nums.length - 1; i>=0; i--)
        System.out.print(nums[i]+" ");
    }
}
