public class Vector extends Inputing {
	
	private int k;
	protected void summation(int a[][], int b[][], int j, int n){ //передаем методу номер столбцов j
		for (k = 0; k < n; k++){
			c[k][j] = a[k][j] + b[k][j];
			System.out.println(c[k][j]);
		}
	}
	
	
	protected void innerproduct(int a[][], int b[][], int i, int j){  /*скалярное произведение, 
		передаем номер строки i матрицы a[][] и номер столбца j матрицы b[][] */
		if (m != n){
			System.out.println("Несоответствующие размеры матриц");
		}
		else{
			mu[i][j] = 0;
			for (k = 0; k < m; k++){
				mu[i][j] = mu[i][j] + a[i][k] * b[k][j];
			}
		}
	}
}
