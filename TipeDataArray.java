public class TipeDataArray {
    public static void main(String[] args) {
        // Array /larik
        // berisikan kumpulan data dengan tipe yang sama

        String[] dataArrayString;
        dataArrayString = new String[3];

        dataArrayString[0] = "Roid ";
        dataArrayString[1] = "dan ";
        dataArrayString[2] = "Zeta ";

        System.out.print(dataArrayString[0]);
        System.out.print(dataArrayString[1]);
        System.out.println(dataArrayString[2]);

        String[] kisahSaya = {
            "Roid", "dan", "Vestia"
        };

        System.out.println(kisahSaya[0]);
        kisahSaya[1] = null; //sebenarnya bukan dihilangkan, tapi di 

        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        System.out.println(arrayInt[0]);
        System.out.println(arrayLong[0]);

        System.out.println(arrayInt.length);
        System.out.println(arrayLong.length);

        //array di dalam array
        String[][] members = {
            {"Roid", "Robih"},
            {"Vestia", "Zeta"},
            {"Roid", "&", "Zeta"}
        };

        String[] member1 = members[0];
        System.out.println(member1[1]);
        System.out.println(members[0][1]);
    }
}
