package level_0;

public class BinaryAdd {
    public String binaryAdd(String bin1, String bin2) {
        int addInDecimal = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        
        return Integer.toBinaryString(addInDecimal);
    }
}