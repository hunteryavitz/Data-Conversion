package data_conversion;

public class DataConversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "This is a test.";
		System.out.println(message);
		System.out.println("To Hex: " + ByteArrayToHexString.bytesToHex("This is a test.".getBytes()));
	}
}
