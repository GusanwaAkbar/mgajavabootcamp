public class PraktikumSatu {

    public static void main(String[] args) {

        char chArray[];
        String s = "Tid4k $@ma";
        chArray = s.toCharArray();

        int l = chArray.length;
        int TotalAsci = 0;

        for (int i = 0; i < l; i++) {

            int asci = chArray[i];

            if (asci >= 64 && asci <= 95) {
                //System.out.println(chArray[i]);
                TotalAsci += asci;
                //System.out.println(asci);


            }

        }

        System.out.println("Ouput dari input Tid4k $@ma adalah " + TotalAsci);


    }

}
