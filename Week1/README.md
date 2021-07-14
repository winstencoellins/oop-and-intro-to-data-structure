# Week1 Assignment
Gunakan semua ilmu yang kamu ketahui tentang programming yang telah kamu pelajari di Programming Fundamanetals untuk menyelesaikan semua masalah dalam bahasa pemrograman Java.
Sebelum memulai, buatlah file baru dengan nama Main.java.

```java
public class Main {
  public static void main(String[] args){
    
  }
}
```

## Soal 1: Factorial
Selesaikanlah fungsi Java dibawah yang menghitung nilai faktorial dari sebuah input yang diberikan. Cara kerja faktorial:
- Jika faktorial 4, biasa ditulis 4! di matematika, maka hasilnya akan sama dengan 4 * 3 * 2 * 1 = 24
- Jika faktorial 6, 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
- Note: 0! = 1

```java
public static int factorial (int n) {
  // Code here
}
```

## Soal 2: Reverse String
Selesaikanlah fungsi Java dibawah ini yang membalikkan sebuah String. Contoh:
- "java programming" -> "gnimmargorp avaj"
- "welcome" -> "emoclew"

```java
public static String reverse(String str) {
  // Code here
}
```

<strong>Note: Jika kalian menyadari adanya built - in function ".reverse()" di Java, itu merupakan hal yang bagus. Tetapi saya melarang kalian menggunakannya karena pada kelas
ini, kita akan berfokus pada penggunaan Data Structure. Pikirkan Struktur Data apa yang cocok untuk menyelesaikan soal tersebut."</strong>

If you are stuck, open the link below, do `Ctrl + F`, then type `toCharArray()`. Mungkin kalian akan menemukan sebuah petunjuk disana. 

Link ini akan sangat membantu:

https://www.w3schools.com/java/java_ref_string.asp

## Soal 3: Sum All Multiple Of Three and Five
Selesaikanlah fungsi dibawah dimana fungsi tersebut akan menjumlahkan semua bilangan kelipatan tiga dan bilangan kelipatan lima. Contoh:
- Jika input = 5, maka hasil yang akan didapatkan adalah 8. (3 + 5 = 8)
- Jika input = 20, maka hasil yang akan didapatkan adalah 98. (3 + 6 + 9 + 12 + 15 + 18 + 5 + 10 + 20 = 98)

```java
public static int sumMultipleOfThreeAndFive(int n) {
  // Code here
}
```

## Soal 4: Fibonacci Sum
Selesaikanlah fungsi yang mengembalikan nilai ke n dari fibonacci tersebut.

Contoh:
- input = 5, maka output = 3.
- input = 7, maka output = 8.

Cara kerja fibonacci:

0 1 1 2 3 5 8

untuk mendapatkan nilai kelima (3), maka kita harus menjumlahkan dua nilai sebelumnya yaitu 1 dan 2. untuk mendapatkan nilai keenam (5), maka kita menjumlahkan  dua nilai
sebelumnya yaitu 2 dan 3.

```java
public static int fibonacci(int n){
  // Code here
}
```
Hint: fibonacci(0) <strong>sudah pasti</strong> 0, fibonacci(1) sudah pasti 1. Pikirkan sebuah sturktur data yang bisa digunakan untuk menyelesaikan soal ini.

## Soal 5: Object Oriented Programming
Buatlah sebuah file java baru bernama Student.java `tanpa main method di dalamnya`. Object dari class ini akan dipanggil di Main.java yang memiliki main method di dalamnya. 
Di dalam class tersebut terdapat attribute academic ability, physical ability, adaptability, social contribution, dan overall ability.
Setiap attribute akan mengembalikan (return) nilai dalam bentuk huruf (A, B, C, atau D). Nilai dibagi ke dalam kategori dengan ketentuan:
- A: 85 <=
- B: 70 <= nilai <= 84
- C: 45 <= nilai <= 69
- D: <= 44

Rumus untuk menghitung nilai overall: `(academic + physical + adapt + (social contribution * 0.5)) / 350 * 100` (rounded up). Untuk membulatkan nilai double ke atas gunakan
`Math.ceil()`.

Gunakan link ini jika kalian tidak tau cara untuk membulatkan nilai ke atas. https://www.javatpoint.com/java-math-round-method

```java
public class Student {
  String className;
  String name;
  int academic;
  int physical;
  int adapt;
  int socialContribution;
  int score;
  
  // Constructor
  public Student(String className, String name, int academic, int physical, int adapt, int socialContribution) {
    // Code here
  }
  
  // Attrs
  
  /*
  * Mengevaluasi nilai yang diberikan menjadi bentuk huruf
  * @return nilai huruf dalam bentuk String
  */
  public String evaluate(int score) {
    // Code here
  }
  
  /*
  * Menghitung overallAbility
  * @return nilai overall dari murid dalam bentuk integer
  */
  public int overallAbility() {
    // Code here
  }
  
  // toString
  @Override
  public String toString() {
    // Code here
  }
}
```

Untuk memeriksa jika semua yang telah kalian kerjakan benar, copy dan paste kode dibawah ini ke `main method` yang terdapat di `Main.java`:

```java
Student student1 = new Student("Class 1-B", "Ichinose Honami", 86, 54, 70, 96);
System.out.println(student1);
```

Expected Output:

```
Class 1-B - Ichinose Honami
Academic Ability: A (86)
Physical Ability: C (54)
Adaptability: B (70)
Social Contribution: A (96)
Overall Ability: B (74)
```
