package pl.grzeslowski.project_euler_1;

public final class Main {

    public static void main(final String[] args) {
        final int maxValue = Integer.parseInt(args[0]);

        final ProjectEuler1 projectEuler1SimpleImpl = new ProjectEuler1SimpleImpl();

        System.out.println(projectEuler1SimpleImpl.findSum(maxValue));
    }

}
