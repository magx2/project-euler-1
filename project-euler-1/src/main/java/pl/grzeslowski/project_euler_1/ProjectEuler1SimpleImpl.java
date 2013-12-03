package pl.grzeslowski.project_euler_1;

public final class ProjectEuler1SimpleImpl implements ProjectEuler1 {

    public long findSum(final int maxValue) {
        if (maxValue <= 0) {
            throw new IllegalArgumentException(
                    "Max value must be positive integer!");
        }

        return sumForNumber(maxValue, 3) + sumForNumber(maxValue, 5)
                - sumForNumber(maxValue, 15);
    }

    private long sumForNumber(final int maxValue, final int number) {
        long sum = 0;
        for (int i = number; i < maxValue; i += number) {
            sum += i;
        }

        return sum;
    }

}
