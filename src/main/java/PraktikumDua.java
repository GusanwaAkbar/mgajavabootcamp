import java.util.Scanner;

public class PraktikumDua {


    public static void main(String[] args) {

        int s = 0;
        Scanner sc = new Scanner(System.in);
        double i = 0;
        int j =  0;
        double ans = 0;

        System.out.println("Masukan Angka");

        while (true)
        {

            try {
                s = sc.nextInt();
                i += s;
                j +=1;

                System.out.println("Kamu memasukkan angka" + s);
            }
            catch (Exception e)
            {
                ans = i/j;
                System.out.println("Rata-rata input = "+ ans);
                System.out.println("Keluar dari program");
                break;

            }

        }






    }
}
