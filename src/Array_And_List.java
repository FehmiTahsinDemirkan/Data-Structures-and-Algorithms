import java.util.ArrayList;
import java.util.List;

public class Array_And_List {
    //**DİZİLER[ARRAYS]**
    //Sabit Boyut: Diziler, oluşturulduktan sonra boyutları değiştirilemez.
    //Primitif ve Referans Tipleri: Diziler, hem primitif veri tiplerini hem de nesne (referans) tiplerini içerebilir.
    // [] Operatörü: Elemanlara erişim için [] operatörü kullanılır. Örneğin: myArray[0].
    //Homojen: Diziler, aynı türdeki elemanları içermelidir.
    //int[] myArray = new int[5];
    //Contigous(bitişik) saklanır

    //Listeler (Lists):
    //Değişken Boyut: Listeler, dinamik olarak boyutlandırılabilir. Eleman eklendiğinde veya çıkarıldığında boyut otomatik olarak ayarlanır.
    //Referans Tipleri: Listeler, sadece nesne (referans) tiplerini içerebilir.
    //List Interface: Java'da List arabirimini uygular ve bu arabirimin birçok uygulaması vardır, örneğin ArrayList, LinkedList.
    //get() ve set() Metotları: Elemanlara erişim ve güncelleme için get(index) ve set(index, element) metotları kullanılır.
    //Heterojen: Farklı türlerdeki elemanları içerebilir.
    //List<Integer> myList = new ArrayList<>();



        public static void main(String[] args) {
            // Dizi oluşturuluyor
            int[] myArray = new int[5];

            // Elemanlara değer atanıyor
            myArray[0] = 10;
            myArray[1] = 20;
            myArray[2] = 30;
            myArray[3] = 40;
            myArray[4] = 50;

            // Dizi üzerinde döngü kullanarak elemanlar yazdırılıyor
            for (int i = 0; i < myArray.length; i++) {
                System.out.println("Element at index " + i + ": " + myArray[i]);
            }
            System.out.println("**************");

            // Liste oluşturuluyor
            List<Integer> myList = new ArrayList<>();
            // Elemanlar ekleniyor
            myList.add(10);
            myList.add(20);
            myList.add(30);
            myList.add(40);
            myList.add(50);

            // Liste üzerinde foreach döngüsü kullanarak elemanlar yazdırılıyor
            for (int element : myList) {
                System.out.println("Element: " + element);
            }
        }
        }





