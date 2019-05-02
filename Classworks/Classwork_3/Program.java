class Program {
public static void main(String[] args) {
	int a[] = {-1, 5, -3, 20, 11, 0, 2, 6};
	int i, j, z, x;
	for (i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.println("");
	for (i = a.length; i > -1; i--) {
		for (j = 1; j < a.length; j++) {
			if (a[j] < a[j -1]) {
				x = a[j];
				z = a[j - 1];
				a[j - 1] = x;
				a[j] = z;
			}
		}
	}
	for (i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
}
}