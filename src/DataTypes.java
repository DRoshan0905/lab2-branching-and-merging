public class DataTypes {
    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!// changed to long to avoid integer overflow.
        // below is a "foreach" loop which iterates through numbers
        for (long x : numbers) {
            s += x;
        }
        return s;
    }
}
