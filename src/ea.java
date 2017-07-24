final class ea {

	static lf lf_a = dd.a("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 2);
	static lf lf_b = dd.a(")3", 2);
	static int int_c;
	static lf lf_d = dd.a("Bitte geben Sie Ihren Benutzenamen ein)3", 2);
	static int int_e = 0;
	static lf lf_f;
	static int[] ints_g = new int[2000];
	static int int_h;
	static kf kf_i;
	static int[] ints_j = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179};
	private static lf lf_k = dd.a("Loaded input handler", 2);
	static int int_l;
	static int[] ints_m = new int[]{1, -1, -1, 1};
	static lf lf_n = dd.a("<br>(X100(U(Y", 2);

	public static void a(int var0) {
		try {
			lf_d = null;
			ints_j = null;
			ints_g = null;
			lf_k = null;
			kf_i = null;
			lf_f = null;
			lf_n = null;
			lf_b = null;
			lf_a = null;
			ints_m = null;
			if (var0 != -11830) {
				lf_f = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ea.A(" + var0 + ')');
		}
	}

	static final boolean a(int var0, int var1) {
		try {
			++int_c;
			if (var1 != 2547355) {
				a(-8, 16);
			}

			return (2547355 & var0) >> -982315019 != 0;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ea.B(" + var0 + ',' + var1 + ')');
		}
	}

	static final void a(int var0, id var1) {
		try {
			++int_l;
			of.a(false, var1, 200000);
			if (var0 != 24087) {
				lf_b = null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ea.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final ed a(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		if (var3 == null) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3.int_p; ++var4) {
				ed var5 = var3.eds_t[var4];
				if ((var5.long_w >> 29 & 3L) == 2L && var5.int_u == var1 && var5.int_f == var2) {
					return var5;
				}
			}

			return null;
		}
	}

	static {
		lf_f = lf_k;
	}
}
