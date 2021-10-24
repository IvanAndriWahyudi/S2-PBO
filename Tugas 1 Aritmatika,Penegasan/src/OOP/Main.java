package OOP;

public class Main {

    public static void main(String[] args) {
	    int angka1 = 3, angka2 = 5, hasil;
	    String nama;

	    //ARITMATIKA
        //*, /, +, -, %.
        hasil = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + hasil);

        hasil = angka1 % angka2;
        System.out.println(angka1 + " % " + angka2 + " = " + hasil);

        //PENEGASAN
        angka1 *= angka2;
        System.out.println("Hasil Penegasan Adalah = " + angka1);

        //PERBANDINGAN
        boolean a = false;
        System.out.println(a);

        a = angka1 < angka2;
        System.out.println(a);

    }
}
