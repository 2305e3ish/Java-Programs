public class ElementArray {
    public static void main(String[] args) {
        int[] nums = {10, 15, 90, 5, 26};
        int smallest = nums[0];
        int largest = nums[0];

        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
