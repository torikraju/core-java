package BoundedType;

public class Stats<T extends Number> {

    private T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    public double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{10, 12, 15};
        Stats stats = new Stats(nums);
        System.out.println(stats.average());

    }
}
