package uk.co.autotrader.fundamentals5;

public class BytesConverter {
    public static void main(String[] args) {

        int kilobytes = 17000;

        int mbOutput = convertKilobytesToMegabytes(kilobytes);
        int kbOutput = convertRemainingKilobytes(kilobytes);

        System.out.println(kilobytes + " kilobytes = " + mbOutput +" megabytes and " + kbOutput +" kiliobytes.");

    }

    public static int convertKilobytesToMegabytes(int kilobytes) {
        int megabytes = kilobytes / 1024;
        return megabytes;
    }

    public static int convertRemainingKilobytes(int kilobytes) {
        int remainder = kilobytes % 1024;
        return remainder;
    }
}
