public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int namber1 = Integer.parseInt(a, 2);
        int namber2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(namber1 + namber2);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int namber1 = Integer.parseInt(a, 2);
        int namber2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(namber1 * namber2);
    }
}


