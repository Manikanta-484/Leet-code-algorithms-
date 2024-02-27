/* To run your Java program with command-line arguments in IntelliJ IDEA, you can follow these steps:
Open your project in IntelliJ IDEA
Edit the run configuration:
Go to the top menu and select "Run" > "Edit Configurations..."
Click the "+" icon in the top-left corner and select "Application" to create a new run configuration.
In the "Name" field, enter a name for your configuration (e.g., "Matrix Addition").
In the "Main class" field, enter the fully qualified name of your main class (Main in your case).
In the "Program arguments" field, enter the command-line argument (the size of the matrices, e.g., 3).
Apply and run the configuration:
Click "Apply" and then "OK" to save your run configuration.
Click the green "Run" button in the top-right corner to run your program with the specified command-line argument. */
public class Main {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("usage: java matrix addition <order_N>");
            return;
        }
        int N=Integer.parseInt(args[0]);
        if(N<=0){
            System.out.println("enter a positive integer for N ");
            return;
        }

        int[][]matrix1=new int[N][N];
        int[][]matrix2=new int[N][N];

        fillMatrix(matrix1,1);
        fillMatrix(matrix2,2);

        int[][]resultMatrix=adaMatrix(matrix1,matrix2);
        System.out.println("matrix 1: ");
        printMatrix(matrix1);
        System.out.println("matrix 2: ");
        printMatrix(matrix2);
        System.out.println("resultant Matrix: ");
        printMatrix(resultMatrix);
    }

    public static void fillMatrix(int[][]matrix,int startValue){
        int value=startValue;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=value++;
            }
        }
    }

    private static void printMatrix(int[][]matrix){
        for(int[] row : matrix){
            for (int value : row){
                System.out.print(value+"\t");
            }
            System.out.println();

        }
        
    }

    private static int[][] adaMatrix(int[][]matrix1,int[][]matrix2){
        int N=matrix1.length;
        int [][]resultMatrix=new int[N][N];
        for(int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return resultMatrix;
    }
}
