package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);

System.out.print("How many people will be displayed? ");
System.out.println();
int n = input.nextInt();

String[] names = new String[n];
int [] age = new int [n];
double [] heights = new double[n];

for (int i = 0; i < n; i++) {
	System.out.println("Data of the " +(i+1)+ " pessoa: ");
	System.out.println();
	System.out.print("Nome: ");
	names[i] = input.next();
	System.out.print("Age: ");
	age[i] = input.nextInt();
	System.out.print("Heights: ");
	heights[i] = input.nextDouble();
	System.out.println();
}

double sum = 0;
for (int i = 0; i < n; i++) {
	sum = sum + heights[i];
}


double mediumHeights = sum / n;

System.out.println();
System.out.printf("Medium height: %.2f%n", mediumHeights);


int cont = 0;

for (int i=0; i<n; i++) {
	if (age[i] < 16) {
		cont = cont + 1;
	}
}

double percent = cont * 100.0 / n;

System.out.print("Underage percent (less than 16yo): "+percent+"%");


input.close();
	}	
}	
	
	

