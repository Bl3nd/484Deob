final class pc {

	static int int_a = 128;
	static int int_b;
	static int[] ints_c = new int[200];
	static byte[][][] bytes_d;

	public static void a(byte var0) {
		try {
			bytes_d = null;
			if (var0 > 12) {
				ints_c = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pc.A(" + var0 + ')');
		}
	}
}
