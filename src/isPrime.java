public class isPrime {
    public static void main(String[] args) {
        int sayi = 29;  // Kontrol edilecek sayı
        boolean asal = true;  // Başlangıçta sayının asal olduğunu varsayıyoruz

        // 2'den başlayıp sayının yarısına kadar döngü ile kontrol ederiz
        for (int i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) {  // Eğer sayı, i'ye tam bölünüyorsa asal değildir
                asal = false;
                break;  // Daha fazla kontrol etmeye gerek yok
            }
        }

        // Sonucu ekrana yazdırırız
        if (asal && sayi > 1) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
}
