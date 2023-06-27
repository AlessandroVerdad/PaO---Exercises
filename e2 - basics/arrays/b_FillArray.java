import java.util.Random;

public class b_FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise) {
        Random random = new Random();

        double[] v = new double[size];
        for (double i : v) {
            i = value;
            if (addNoise) {
                double noise = (random.nextDouble() - 0.5) * 5 / 100 * value;
                i += noise;
            }
        }
        return v;

    }
}
