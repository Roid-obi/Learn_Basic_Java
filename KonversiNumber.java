public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //konversi yang besar ke yang kecil
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // akan terjadi number overflow
    }
}
