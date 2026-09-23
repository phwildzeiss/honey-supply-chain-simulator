package h.burgenland.simulator.si;

public final class Ahp {

    private Ahp() {
    }

    public static double[][] normalizeMatrix(double[][] matrix) {
        int size = matrix.length;
        double[] columnSums = new double[size];
        double[][] normalized = new double[size][size];

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                columnSums[j] += matrix[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                normalized[i][j] = matrix[i][j] / columnSums[j];
            }
        }

        return normalized;
    }

    public static double[] calculateWeights(double[][] normalizedMatrix) {
        int size = normalizedMatrix.length;
        double[] weights = new double[size];

        for (int i = 0; i < size; i++) {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += normalizedMatrix[i][j];
            }
            weights[i] = sum / size;
        }

        return weights;
    }

    public static double computeConsistencyRatio(double[][] matrix, double[] weights) {
        int n = matrix.length;
        if (n < 3) {
            return 0.0;
        }

        double[] lambda = new double[n];
        for (int i = 0; i < n; i++) {
            double rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j] * weights[j];
            }
            if (weights[i] == 0) {
                throw new IllegalArgumentException("Weight at index " + i + " is 0, division by zero not possible.");
            }
            lambda[i] = rowSum / weights[i];
        }

        double lambdaMax = 0;
        for (double v : lambda) {
            lambdaMax += v;
        }
        lambdaMax /= n;

        double ci = (lambdaMax - n) / (n - 1);

        double[] riValues = {0.0, 0.0, 0.58, 0.90, 1.12, 1.24, 1.32, 1.41};
        double ri = (n - 1 < riValues.length) ? riValues[n - 1] : 1.41;

        return ci / ri;
    }
}
