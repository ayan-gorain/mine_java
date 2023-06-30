package today;
import java.util.Scanner;
public class swap {
    public static byte swap(byte b) {

        byte upperNibble = (byte) ((b & 0xF0) >> 4);
        byte lowerNibble = (byte) (b & 0x0F);

        return (byte) ((lowerNibble << 4) | upperNibble);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 255: ");
        int input = sc.nextInt();

        if (input < 0 || input > 255) {
            System.out.println("Invalid input");
            return;
        }
        byte oByte = (byte) input;
        byte swaped = swap(oByte);

        System.out.println("Original byte: " + String.format("%8s", Integer.toBinaryString(oByte & 0xFF)).replace(' ', '0'));
        System.out.println("Swapped byte:  " + String.format("%8s", Integer.toBinaryString(swaped & 0xFF)).replace(' ', '0'));
    }
}
