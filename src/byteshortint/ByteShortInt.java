package byteshortint;

public class ByteShortInt {

	public static void main(String[] args) {
		// int has a width of 32
		int myMinIntValue = -2_147_483_648;  // -2147483649
		int myMaxIntValue = 2_147_483_647; // 2147483648
		int myTotal = (myMinIntValue/2);
		
		// byte has a width of 8
		byte myMinByteValue = -128; // -129
		byte myMaxByteValue = 127; // 128
		byte myByteTotal = (byte) (myMinByteValue/2);
		
		// short has a width of 16  double of byte
		short myMinShortValue = -32768; // -32769
		short myMaxShortValue = 32767; // 32768
		short myShortTotal = (short) (myMinShortValue/2);
		
		// long has with of 64   double of int
		long myMinLongValue = -9_223_372_036_854_775_808L; // -9_223_372_036_854_775_809L
		long myMaxLongValue = 9_223_372_036_854_775_807L; // 9_223_372_036_854_775_808L
		long myLongTotal = (myMinLongValue/2);
		
		System.out.println(myMinIntValue);
		System.out.println(myMaxIntValue);
		System.out.println(myMinByteValue);
		System.out.println(myMaxByteValue);
		System.out.println(myMinShortValue);
		System.out.println(myMaxShortValue);
		System.out.println(myMinLongValue);
		System.out.println(myMaxLongValue);
		System.out.println(myTotal);
		System.out.println(myByteTotal);
		System.out.println(myShortTotal);
		System.out.println(myLongTotal);
		
	}

}
