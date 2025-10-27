public class Numbers {

    private static double N = 25;

    public static double formula(double z) {
        return round((z + Math.sqrt(4 + Math.pow(z, 2))) / 2);
    }

    public static double recursive(double z) {
        return round(recursive(z, N) / recursive(z, N - 1));
    }

    public static double iterative(double z) {
        return round(iterative(z, N) / iterative(z, N - 1));
    }

    private static double recursive(double z, double n) {
        if (n == 0 || n == 1) return 1.0;
        return z * recursive(z, n - 1) + recursive(z, n - 2);
    }

    private static double iterative(double z, double n) {
        if (n == 0 || n == 1) return 1.0;
        double f0 = 1.0, f1 = 1.0, fn = 1.0;
        for (int i = 2; i <= n; i++) {
            fn = z * f1 + f0;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }

    private static double round(double value) {
        var ROUND = 10000000000.0;
        return Math.round(value * ROUND) / ROUND;
    }

    public static void main(String[] args) {
        String[] metallics = {
                "Platinum", "Golden", "Silver", "Bronze",
                "Copper", "Nickel", "Aluminum", "Iron",
                "Tin", "Lead"
        };
        for (var z = 0; z < metallics.length; z++) {
            System.out.println("\n[" + z + "] " + metallics[z]);
            System.out.println(" ↳ formula(" + z + ")   ≈ " + formula(z));
            System.out.println(" ↳ recursive(" + z + ") ≈ " + recursive(z));
            System.out.println(" ↳ iterative(" + z + ") ≈ " + iterative(z));
        }
    }
}
