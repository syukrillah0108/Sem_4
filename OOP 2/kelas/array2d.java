public class array2d {
    public static void main(String[] args) {
        String[][] nama = {
            {"A", "B", "C"},
            {"D", "E", "F"}
        };

        for (String[] baris : nama) {
            for (String elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
        System.out.println(nama[1][2] + " "+ nama[1][1]);
    }
}