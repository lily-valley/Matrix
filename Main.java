public class Main {
	public static void main(String[] args) {
		Inputing bringingIn = new Inputing();
		bringingIn.inputingFromScreen();  
		//запустили ввод данных с экрана
		
		Vector vector = new Vector();
		for (int i = 1; i <= bringingIn.n; i++){
			for (int j = 1; j <= bringingIn.n; j++){
				vector.innerproduct(bringingIn.a, bringingIn.b, i, j);
			}
		}
		//посчитали скалярное произведение
		
		Matrix matrix = new Matrix();
		matrix.printingTheMatrixMult();
		//вывели матрицу произведения
		
		int track = matrix.trackMatrix(vector.mu, bringingIn.n);
		System.out.println(track);
		//вывели след матрицы произведения
	}

}
