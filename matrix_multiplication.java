class Main {
    public static void main(String[] args) {
        int row = 2;
        int column = 2;
        int mat1[][] = {{1,2},{3,4}};
        int mat2[][] = {{5,6},{7,8}};
        int product[][] = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                product[i][j] = 0;
                for (int k = 0; k < column; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(" "+product[i][j]);
            }
            System.out.println();
        }
    }
}
