import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;
        int nilai;

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 kalau sudah selesai.");

        // do-while lebih pas karena nilai pertama harus diminta dulu sebelum ada yang bisa dinilai
        do {
            System.out.print("Nilai ke-" + (jumlah + 1) + " : ");
            nilai = input.nextInt();

            if (nilai == SELESAI) {
                continue;
            }
            if (nilai < 0 || nilai > 100) {
                System.out.println("  ditolak — nilai harus 0..100");
                continue;
            }

            jumlah++;

            char grade;
            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default  -> "Tidak Lulus";
            };

            System.out.println("  Grade " + grade + " — " + keterangan);

        } while (nilai != SELESAI);

        System.out.println();
        System.out.println("Nilai sah   : " + jumlah);

        input.close();
    }
}