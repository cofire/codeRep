package knowledge;

/**
 * Created by gzx on 16-12-27.
 */
public class StaticClassDemo {
    public static Pair minmax(double[] data) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double tmp : data) {
            if (min > tmp) {
                min = tmp;
            } else if (max < tmp) {
                max = tmp;
            }
        }
        return new Pair(min, max);
    }

    // 静态内部类不能访问实例属性，没有外部类实例的this
    public static class Pair {
        private double min, max;

        public Pair(double min, double max) {
            this.min = min;
            this.max = max;
        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }
    }

    public static void main(String[] args) {
        double[] data = { 10, 1324.12, 2134.11, -132.32 };
        StaticClassDemo.Pair pair = StaticClassDemo.minmax(data);
        System.out.println(pair.getMin());
        System.out.println(pair.getMax());
    }
}
