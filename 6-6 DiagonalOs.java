public class DiagonalOs {
    public static void main(String[] args) {
        // Write your code here
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("O");
        }
    }
}
