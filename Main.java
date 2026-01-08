public class Main {
    public static void main(String[] args) {
       // task 1
//        int[] number = {4,7,-2,15,0,99,-100};
//
//        int boyuk = number[0];
//        int kicik = number[0];
//
//        for (int i = 1; i < number.length; i++) {
//            if (number[i] > boyuk) {
//                boyuk = number[i];
//            }
//            if (number[i] < kicik) {
//                kicik = number[i];
//            }
//        }
//
//
//        System.out.println("Ən böyük ədəd: " + boyuk);
//        System.out.println("Ən kiçik ədəd: " + kicik);

        //task 2

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int esascemi = 0;
//        int komekcicemi = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//
//
//            esascemi = esascemi + matrix[i][i];
//
//
//            komekcicemi = komekcicemi + matrix[i][matrix.length - 1 - i];
//        }
//
//        System.out.println("Əsas diaqonal cəmi: " + esascemi);
//        System.out.println("Köməkçi diaqonal cəmi: " + komekcicemi);

        //task 3
//        int[][][] cube = {
//                {
//                        {1, 2}, {3, 4}
//                },
//                {
//                        {5, 6}, {7, 8}
//                }
//        };
//
//        for (int i = 0; i < cube.length; i++) {
//            for (int j = 0; j < cube[i].length; j++) {
//                for (int k = 0; k < cube[i][j].length; k++) {
//
//                    if (cube[i][j][k] > 6) {
//                        System.out.println("6-dan böyük ədədlər: "+cube[i][j][k]);
//
//                    }
//                }
//            }
//        }

        // task 4

//        int[] arr = {10, 5, 8, 3, 1};
//
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//
//                    int eded = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = eded;
//                }
//            }
//        }
//        System.out.print("Tərsinə sort edilmiş array: ");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(" " + arr[i]) ;
//        }
      // task 5

//        String input = "OpenAI";
//        String tersi = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//            tersi = tersi + input.charAt(i);
//        }
//        System.out.println(tersi);

        // task 6
//        String word = "madam";
//        String ters = "";
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            ters = ters + word.charAt(i);
//        }
//
//        if (word.equals(ters)) {
//            System.out.println(word + " palindrome-dur.");
//        } else {
//            System.out.println(word + " palindrome deyil.");
//        }

        //task7

        String sentence = "Java is awesome";
        sentence = sentence.replace(" ", "");

        for (int i = 0; i < sentence.length(); i++) {

            boolean sayilib = false;

            for (int j = 0; j < i; j++) {
                if (sentence.charAt(j) == sentence.charAt(i)) {
                    sayilib = true;
                    break;
                }
            }

            if (!sayilib) {
                int count = 0;

                for (int k = 0; k < sentence.length(); k++) {
                    if (sentence.charAt(k) == sentence.charAt(i)) {
                        count++;
                    }
                }

                System.out.println(sentence.charAt(i) + " - " + count);
            }
        }

    }
}
