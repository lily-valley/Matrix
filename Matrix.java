public class Matrix extends Vector{
	
	private int i, j;
	protected void printingTheMatrixMult(){
		String s = "Произведение матриц a и b равно с:";
		System.out.println(s);
		if (m == n){
			for (i = 1; i <= m; i++){
				for (j = 1; j <= m; j++){
					System.out.print(mu[i][j]);
					System.out.print(" ");
				}
				System.out.println();			}
		}
	}
	
	protected int trackMatrix(int z[][],int n){
		int track=0;
		int i;
		for (i = 0; i < n; i++){
			track += a[i][i];
		}
		return track;
	}

}
