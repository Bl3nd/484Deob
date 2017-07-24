final class he extends ph {

	static lf G;
	static int H;
	static lf I = dd.a("Diese Welt ist voll)3", 2);
	static int J;
	static volatile int K = 0;
	static int[] L = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
	private static lf M = dd.a("Select", 2);
	static boolean[] N = new boolean[112];
	static lf O = dd.a("Hierhin gehen", 2);
	int P = 0;
	static db Q;

	public static void b(boolean var0) {
		try {
			L = null;
			if (!var0) {
				K = 51;
			}

			O = null;
			Q = null;
			I = null;
			M = null;
			N = null;
			G = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "he.A(" + var0 + ')');
		}
	}

	private final void a(byte var1, ja var2, int var3) {
		try {
			if (var3 == 5) {
				this.P = var2.b(true);
			}

			++J;
			int var4 = 59 % ((7 - var1) / 50);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "he.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	final void a(int var1, ja var2) {
		int var4 = client.int_gc;

		try {
			do {
				int var3 = var2.j((byte) 107);
				if (~var3 == -1) {
					break;
				}

				this.a((byte) -128, var2, var3);
			} while (var4 == 0);

			++H;
			if (var1 != 0) {
				K = -93;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "he.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		G = M;
	}
}
