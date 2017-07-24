import java.awt.Component;

abstract class kb {

	static int[][] ints_a = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
	static byte[][] bytes_b = new byte[50][];
	static byte[] bytes_c = new byte[520];
	static lf lf_d = dd.a("Ung-Ultige Session)2ID)3", 2);
	static lf tradeFlag = dd.a(":trade:", 2);//lf_e
	static int int_f;
	private static lf lf_g = dd.a("Unexpected loginserver response)3", 2);
	static int int_h;
	static lf lf_i;

	public static void a(byte var0) {
		try {
			ints_a = null;
			lf_d = null;
			bytes_b = null;
			if (var0 <= 51) {
				a((byte) 74);
			}

			tradeFlag = null;
			lf_i = null;
			lf_g = null;
			bytes_c = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "kb.C(" + var0 + ')');
		}
	}

	abstract void a(Component var1, int var2);

	abstract int b(byte var1);

	abstract void a(byte var1, Component var2);

	static {
		lf_i = lf_g;
	}
}
