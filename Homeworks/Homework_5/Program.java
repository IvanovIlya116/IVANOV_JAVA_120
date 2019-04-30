import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		int a[] = new int[length];
		int resMin = 0;
		int resMax = 0;

		for (int i = 0; i < length; i++)
			a[i] = scanner.nextInt();


		if (a[0] < a[1])
			resMin++;
		else if (a[0] > a[1]) 
			resMax++;
		

		for (int i = 1; i < length-1; i++)
			if (a[i-1] > a[i] && a[i]< a[i+1]) 
				resMin++;
			else if (a[i-1] < a[i] && a[i] > a[i+1])
				resMax++;
		

		if (a[length-2] < a[length-1])
			resMax++;
		else if (a[length-2] > a[length-1]) 
			resMin++;
		

		System.out.print("Кол-во локальных минимумов: " + resMin + "\nКол-во локальных максимумов: " + resMax);
	}
}