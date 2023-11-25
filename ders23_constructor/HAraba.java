package ders23_constructor;

public class HAraba {
    String marka="marka belirtilmedi";
    String model="model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;
    public HAraba(String mrk,String mdl, String ykt, int yl, int fyt){
    marka=mrk;
    model=mdl;
    yakit=ykt;
    yil=yl;
    fiyat=fyt;

    }
    public HAraba(String mrk, String mdl, int yl){
        //istersek parametreleri azaltarak da constructor olusturabiliriz
        marka=mrk;
        model=mdl;
        yil=yl;

    }
    public HAraba(){
        //gorunur durumundaki parametresiz construcktor
        //default constructor DEGILDIR
        //Default constructor un body si de bos olur
        //ancak parametresiz constructor da body e kod yazilabilir

        //parametresiz constructor in body sinde kod yoksa
        //default ile aynı islevi gorur
        //ama yine de gorunur durumdaysa default cons demez
    }
    //biz gozle gorulur bir constructor olusturdugumuzda
    //Java default constructor i siler
    //bu durumda daha once olusturulmus olan objelerin sorun olmaması icin
    // class a parametresiz bir constructor eklememiz faydali olur

    @Override
    public String toString() {
        return "Araba Ozellikleri" +
                "\nmarka : " + marka +
                "\nModel : " + model +
                "\nyakit : " + yakit +
                "\nyil  : " + yil +
                "\nfiyat : " + fiyat;
    }
    public int maxHiz (String yakit){
        int maxHiz=120;
        if (yakit.equalsIgnoreCase("Dizel")){
            maxHiz=200;
        }else if (yakit.equalsIgnoreCase("Benzin")){
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        } return maxHiz;


    }
}
