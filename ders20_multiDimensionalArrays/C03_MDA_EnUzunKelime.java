package ders20_multiDimensionalArrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {
        // verilen multi Dimensional String bir array deki
        //en uzun String , bulan kod yaziniz

        String [][] arr={{"ilker", "Nesrin"},{"Hasan","Heysem","Adem","Yusuf Enes"}};
        String enUzunKelime=arr[0][0];
        for (int i = 0; i < arr.length; i++) { //outer arrray in ellemnetleri kontrıl eder
            for (int j = 0; j < arr[i].length; j++) {

               if (arr[i][j].length()>enUzunKelime.length()){
                   enUzunKelime=arr[i][i];
               }

            }

        }
        System.out.println("en uzun kelime : "+enUzunKelime);
    }

}
