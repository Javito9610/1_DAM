import java.util.Random;

public class Aleatorio1 {
    public static void main (String[] args){
        Random random = new Random();
        byte randomByte = (byte) (random.nextInt(256) - 128);
        short randomShort = (short) (random.nextInt(65536) - 32768);
        int numEntero = random.nextInt();
        long numLargo = random.nextLong();
        float numDec = random.nextFloat();
        double numDecL = random.nextDouble();
        boolean booleano = random.nextBoolean();

        System.out.println(randomByte);
        System.out.println(randomByte);
        System.out.println(numEntero);
        System.out.println(numLargo);
        System.out.println(numDec);
        System.out.println(numDecL);
        System.out.println(booleano);


    }
}
