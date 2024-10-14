public class OperasiMatematika {
    public static void main(String[] args) {
        // operasi matematika
        int a = 2;
        int b = 3;

        System.out.println("a = " +  a);
        System.out.println("b = " +  b);
        System.out.println("hasil penjumlahan = " + (a + b)); // tambah
        System.out.println("hasil pengurangan = " + (a - b)); // kurang
        System.out.println("hasil perkalian = " + (a * b)); // kali
        System.out.println("hasil pembagian = " + (a / b)); // bagi
        System.out.println("hasil modulo = " + (a % b)); // sisa bagi / modulo

        // argumented assignments
        System.out.println("argumented assignments");
        int c = 100;

        c += 10; // c = c + 10;
        System.out.println(c);

        c -= 10; // c = c - 10;

        c *= 10; // c = c * 10;

        c /= 10; // c = c / 10;

        // unary operator
        int d = +100; // + adalah nilai positif

        d++; // tambah 1
        System.out.println(d);

        d--; // kurangi 1
        System.out.println(d);
    }
}
