public class StudiKasus2Segitiga {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - 1 - i; s++) {
                System.out.print(" ");
            }
            for (int r = 0; r <= i; r++) {
                System.out.print("*");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}