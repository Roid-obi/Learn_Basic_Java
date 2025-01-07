public class SwitchStatement {
  public static void main(String[] args) {

      String nilai = "A";

      // Switch tradisional dengan break
      switch (nilai) {
          case "A":
              System.out.println("Wow, Anda Lulus Dengan Baik");
              break;
          case "B":
          case "C":
              System.out.println("Nilai Anda Cukup Baik");
              break;
          case "D":
              System.out.println("Anda tidak lulus");
              break;
          default:
              System.out.println("Mungkin Anda salah jurusan");
              break;
      }

      // Switch tradisional dengan break (mengganti arrow syntax)
      switch (nilai) {
          case "A":
              System.out.println("Wow, Anda Lulus Dengan Baik");
              break;
          case "B":
          case "C":
              System.out.println("Nilai Anda Cukup Baik");
              break;
          case "D":
              System.out.println("Anda Tidak Lulus");
              break;
          default:
              System.out.println("Mungkin Anda Salah Jurusan");
              break;
      }

      // Switch tradisional untuk mengassign nilai ke variabel 'ucapan'
      String ucapan;
      switch (nilai) {
          case "A":
              ucapan = "Wow, Anda Lulus Dengan Baik";
              break;
          case "B":
          case "C":
              ucapan = "Nilai Anda Cukup Baik";
              break;
          case "D":
              ucapan = "Anda Tidak Lulus";
              break;
          default:
              ucapan = "Mungkin Anda Salah Jurusan";
              break;
      }

      System.out.println(ucapan);

      // Switch tradisional menggunakan switch sebagai ekspresi
      // (Perlu diingat bahwa switch sebagai ekspresi diperkenalkan di Java 12 sebagai fitur preview dan stabil di Java 14)
      // Jika Anda menggunakan Java versi lebih lama, gunakan switch tradisional seperti di atas
      /*
      ucapan = switch (nilai) {
          case "A":
              yield "Wow, Anda Lulus Dengan Baik";
          case "B", "C":
              yield "Nilai Anda Cukup Baik";
          case "D":
              yield "Anda Tidak Lulus";
          default:
              yield "Mungkin Anda Salah Jurusan";
      };

      System.out.println(ucapan);
      */

      // Jika Anda ingin menggunakan switch sebagai ekspresi dan Anda menggunakan Java 14 atau lebih baru,
      // pastikan Anda telah mengatur versi Java yang benar di lingkungan pengembangan Anda.
  }
}
