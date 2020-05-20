import java.util.Random;

public final class UserGenerator {

    static Random random = new Random();

    public static String nameGenerator() {
        String[] array = {"Kiraz", "Ezgi", "Senem", "İrem", "Doruk", "Azra", "Turgay", "Songül", "Tezcan", "İzzet",
                "Demir", "Ufuk", "Erol", "Aytaç", "Elvan", "Yıldız", "Nergis"};
        int randomNumber = random.nextInt(17);
        return array[randomNumber];
    }

    public static String surnameGenerator() {
        String[] array = {"Yıldırım", "Tuncel", "Gündüz", "Deniz", "Öktem", "Durel", "Kaner", "Torun", "Denizli", "Kutlu",
                "Gürsu", "Akçam", "Bayındır", "Bereket", "Okur", "Ulusoy", "Saçan"};
        int randomNumber = random.nextInt(17);
        return array[randomNumber];
    }

    public static String numberGenerator() {
        String phoneNumber = "+90";
        for(int i=0; i<10; i++) {
            int randomNumber = random.nextInt(9);
            phoneNumber = phoneNumber + randomNumber;
        }
        return phoneNumber;
    }

    public static String locationGenerator() {
        String[] array = {"Aliağa", "Balçova", "Bayraklı", "Bornova", "Buca", "Çeşme", "Çiğli", "Foça", "Gaziemir", "Güzelbahçe",
                "Karabağlar", "Karşıyaka", "Konak", "Narlıdere", "Seferihisar", "Urla", "Torbalı"};
        int randomNumber = random.nextInt(17);
        return array[randomNumber];
    }

    public static String conditionGenerator() {
        String[] array = {"Good", "Bad", "Normal", "Weak", "Fever", "Runny Nose"};
        int randomNumber = random.nextInt(6);
        return array[randomNumber];
    }
}
