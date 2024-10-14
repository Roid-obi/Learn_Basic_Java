public class TipeDataNumer {
    public static void main(String[] args) {
        //variable number dibedakan berdasarkan kapasitasnya

        //integer number
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 100000000000L;

        //floating point number
        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        //literals
        int decimalInt = 25; //decimal
        int hexaDecimal = 0xFFFFFFF; //hexa
        int binaryDecimal = 0b10101000111; //binary

        //underscore
        int amount = 1_000_000; //hanya untuk mempermudah membaca bilangan angka


        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);

        System.out.println(iniFloat);
        System.out.println(iniDouble);

        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);

        System.out.println(amount);
    }
}
