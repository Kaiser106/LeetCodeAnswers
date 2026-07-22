void main() {
    class Solution {
        public int digitFrequencyScore(int n) {
            // 1. Adım: Rakamların adetlerini tutacağımız 10 elemanlı frekans tablosu
            int[] frekans = new int[10];

            // 2. Adım: Sayıyı metne (String) çeviriyoruz
            String sayiMetni = String.valueOf(n);

            // 3. Adım: Metnin tüm karakterlerini döngüyle geziyoruz
            for (int i = 0; i < sayiMetni.length(); i++) {
                char karakter = sayiMetni.charAt(i);

                // Karakterden '0' çıkararak gerçek rakam (indeks) değerini buluyoruz
                int rakam = karakter - '0';

                // Bulduğumuz rakamın frekans tablosundaki adetini 1 artırıyoruz
                frekans[rakam]++;
            }

            // 4. Adım: Toplam skoru hesaplıyoruz
            int toplamSkor = 0;

            // Frekans tablosunu gezip, sadece sayısı 0'dan büyük olanları formüle uyguluyoruz
            for (int r = 0; r < 10; r++) {
                if (frekans[r] > 0) {
                    toplamSkor += r * frekans[r];
                }
            }

            // 5. Adım: Bulduğumuz nihai skoru döndürüyoruz
            return toplamSkor;
        }
    }

}