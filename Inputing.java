import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inputing {
	protected int n; //число строк
	protected int m; //число столбцов
	private int i = 0; //положение курсора во входной строке
	private int j; //номер текущей строки
	private int[] currentNumber;
	protected int[][] a, b, c, mu;
	
	protected void inputingFromScreen(){
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()){
			currentNumber[i] = in.nextInt();
			i++;
		}
		in.close();
		n = currentNumber[0];
		m = currentNumber[1];
		for (j = 1; j <= n; j++){
			for (i = j*m + 2; i <= j*(m+1) + 2; i++){
				a[j][i - 2 - j*m] = currentNumber[i];
			}
		}
		for (j = n+1; j <= 2*n; j++){
			for (i = j*m + 2; i <= j*(m+1) + 2; i++){
				b[j][i - 2 - j*m] = currentNumber[i];
			}
		}
	}
	
	
	protected void inputingFromFile(){
		try{
			FileInputStream fileStream = new FileInputStream("input.txt");
			Scanner scanner = new Scanner(fileStream);
			while (scanner.hasNextInt()){
				currentNumber[i] = scanner.nextInt();
				i++;
			}
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		n = currentNumber[0];
		m = currentNumber[1];
		for (j = 1; j <= n; j++){
			for (i = j*m + 2; i <= j*(m+1) + 2; i++){
				a[j][i - 2 - j*m] = currentNumber[i];
			}
		}
		for (j = n+1; j <= 2*n; j++){
			for (i = j*m + 2; i <= j*(m+1) + 2; i++){
				b[j][i - 2 - j*m] = currentNumber[i];
			}
		}
	}
}
