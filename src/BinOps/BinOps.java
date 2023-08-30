package BinOps;
import IntsCalculator.*;

public class BinOps{
    public String sum(String a, String b) {
        int BinSum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(BinSum);
    }
    public String mult(String a, String b) {
        int BinMult = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(BinMult);
    }
}
