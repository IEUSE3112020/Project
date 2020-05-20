import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        // Single server instance
        Server server = Server.getServer();

        // OS adapters
        MobilePhone iPhoneClient = new MobilePhone(new Iphone());
        MobilePhone samsungClient = new MobilePhone(new Samsung());

        Adapter iphoneAdapter = new Adapter(iPhoneClient.getOperatingSystem());
        Adapter samsungAdapter = new Adapter(samsungClient.getOperatingSystem());


        /* */
        String userPhoneNumber;
        User user;

        // count of users to be generated
        int userCount = 1000;

        // a random number to choose what operating system the user will use
        int randomNumber;

        // Users gets generated randomly by the utility class UserGenerator
        for(int i=0; i<userCount; i++) {
            randomNumber = random.nextInt(2);
            user = new User(UserGenerator.nameGenerator() +" " + UserGenerator.surnameGenerator(), random.nextInt(70), UserGenerator.locationGenerator());
            if (randomNumber == 1) {
                userPhoneNumber = (String) iphoneAdapter.send(UserGenerator.numberGenerator());
                // mock user registration of phone number to the server
                iphoneAdapter.send(user);
            }
            else {
                userPhoneNumber = (String) samsungAdapter.send(UserGenerator.numberGenerator());
                // mock user registration of phone number to the server
                samsungAdapter.send(user);
            }

            // mock user filling up a registration form, and save the user into a map, associated with their phone numbers
            // this also attaches the User to the Server, as the Server will listen to User's condition updates
            server.putToPhoneMap(userPhoneNumber, user);

            // mock User entering their condition info
            // ama o
            for(int j=0; j<=random.nextInt(3); j++) {
                user.putToConditionMap(UserGenerator.conditionGenerator(), UserGenerator.locationGenerator());
            }
        }


        server.returnList();
    }
}