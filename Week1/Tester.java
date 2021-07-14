
public class Tester {
	public static boolean first() {
		if(Main.factorial(10) != 3628800) {
			System.out.println("Hasil dari faktorial 10 salah");
			return false;
		}
		if(Main.factorial(5) != 120) {
			System.out.println("Hasil dari faktorial 5 salah");
			return false;
		}
		if(Main.factorial(0) != 1) {
			System.out.println("Hasil dari faktorial 0 salah");
			return false;
		}
		if(Main.factorial(1) != 1) {
			System.out.println("Hasil dari faktorial 1 salah");
			return false;
		}
		return true;
	}
	
	public static boolean third() {
		if(Main.sumMultipleOfThreeAndFive(5) != 8) {
			System.out.println("Hasil dengan input 5 salah");
			return false;
		}
		if(Main.sumMultipleOfThreeAndFive(10) != 33) {
			System.out.println("Hasil dengan input 10 salah");
			return false;
		}
		if(Main.sumMultipleOfThreeAndFive(15) != 60) {
			System.out.println("Hasil dengan input 15 salah");
			return false;
		}
		if(Main.sumMultipleOfThreeAndFive(20) != 98) {
			System.out.println("Hasil dengan input 20 salah");
			return false;
		}
		return true;
	}
	
	public static boolean fourth() {
		if(Main.fibonacci(1) != 0) {
			System.out.println("Hasil dengan input 1 salah");
			return false;
		}
		if(Main.fibonacci(2) != 1) {
			System.out.println("Hasil dengan input 2 salah");
			return false;
		}
		if(Main.fibonacci(5) != 3) {
			System.out.println("Hasil dengan input 5 salah");
			return false;
		}
		if(Main.fibonacci(10) != 34) {
			System.out.println("Hasil dengan input 10 salah");
			return false;
		}
		if(Main.fibonacci(15) != 377) {
			System.out.println("Hasil dengan input 15 salah");
			return false;
		}
		if(Main.fibonacci(20) != 4181) {
			System.out.println("Hasil dengan input 20 salah");
			return false;
		}
		return true;
	}
	
	public static boolean fifth() {
		Student student1 = new Student("Class 1A", "Winsten", 61, 73, 94, 43);
		if(!student1.evaluate(85).equals("A")) {
			System.out.println("Hasil konversi nilai 85 menjadi huruf salah");
			return false;
		}
		if(!student1.evaluate(84).equals("B")) {
			System.out.println("Hasil konversi nilai 84 menjadi huruf salah");
			return false;
		}
		if(!student1.evaluate(70).equals("B")) {
			System.out.println("Hasil konversi nilai 70 menjadi huruf salah");
			return false;
		}
		if(!student1.evaluate(69).equals("C")) {
			System.out.println("Hasil konversi nilai 69 menjadi huruf salah");
			return false;
		}
		if(!student1.evaluate(45).equals("C")) {
			System.out.println("Hasil konversi nilai 45 menjadi huruf salah");
			return false;
		}
		if(!student1.evaluate(44).equals("D")) {
			System.out.println("Hasil konversi nilai 44 menjadi huruf salah");
			return false;
		}
		if(student1.overallAbility() != 72) {
			System.out.println("Kalkulasi overall ability salah");
			return false;
		}
		Student student2 = new Student("Class 1A", "Winsten", 86, 54, 70, 96);
		if(student2.overallAbility() != 74) {
			System.out.println("Kalkulasi overall ability salah");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Soal 1: " + first());
		System.out.println("Soal 3: " + third());
		System.out.println("Soal 4: " + fourth());
		System.out.println("Soal 5: " + fifth());
	}
}
