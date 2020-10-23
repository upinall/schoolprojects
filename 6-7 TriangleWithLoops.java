class TriangleWithLoops {
    public static void main(String[] args) {
        // Write your code here
        int n=7, spaces = 7;
        for(int i = 0;i<n;i++){
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }
            spaces--;
            for(int j=0;j < 2*i+1; j++){
                System.out.print("T");
            }
            System.out.println();
        }
    }
}
