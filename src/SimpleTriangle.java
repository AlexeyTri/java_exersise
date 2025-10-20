public class SimpleTriangle {
    public static void main(String[] args) {
        int[][] triangle = new int[5][];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = i + j;
                System.out.print(triangle[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
