package uk.co.autotrader.fundamentals5;

public class BytesConverter {
    public static void main(String[] args) {
        int megabytes = 24;
        int kilobytes = 17000;

        int kbOutput = convertMegaBytesToKiloBytes(megabytes);

        System.out.println(megabytes + " megabytes = " + kbOutput +" kilobytes2");

        int mbOutput = convertKilobytesToMegabytes(kilobytes);

        System.out.println(kilobytes + " kilobytes = " + mbOutput +" megabytes ");


    }

    public static int convertMegaBytesToKiloBytes(int megabytes) {
        int kilobytes2 = megabytes * 1024;
        return kilobytes2;
    }

    public static int convertKilobytesToMegabytes(int kilobytes) {
        int megabytes2 = kilobytes / 1024;
                return megabytes2;
    }
}
