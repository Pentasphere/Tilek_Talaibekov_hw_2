import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String accessOutside1 = accessForWalking(21, 0);
        System.out.println(accessOutside1);
        String accessOutside2 = accessForWalking(19, 25);
        System.out.println(accessOutside2);
        String accessOutside3 = accessForWalking(46, -9);
        System.out.println(accessOutside3);
        String accessOutside4 = accessForWalking(13, -10);
        System.out.println(accessOutside4);
        String accessOutside5 = accessForWalking(19, -21);
        System.out.println(accessOutside5);
        int age = generateRandomAge();
        System.out.println(age);
        String randomAgeAccessOutside = accessForWalking(generateRandomAge(), 10);
        System.out.println(randomAgeAccessOutside);

    }
    public static String accessForWalking (int ageOfMan, int temperatureOutside){ /*Changed double to int*/
        String walking = "Можно идти гулять";
        if (ageOfMan >= 20 && ageOfMan <= 45 && temperatureOutside >= -20 && temperatureOutside <= 30) {
        } else if (ageOfMan < 20 && temperatureOutside >= 0 && temperatureOutside <= 28) {
        } else if (ageOfMan > 45 && temperatureOutside >= -10 && temperatureOutside <= 25) {
        } else walking = "Оставайтесь дома";
        return walking;
    }
    public static int generateRandomAge (){
        int randomAge = new Random().nextInt();
        return randomAge;
    }
}