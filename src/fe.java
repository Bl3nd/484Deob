final class fe extends hb {

	private static boolean boolean_n = false;
	private static oc[] ocs_o;
	private boolean boolean_p;
	private static int int_q;
	private int int_r;
	private static int[] ints_s;
	static gd[] gds_t;
	private static qc[] qcs_u;
	private static float[] floats_v;
	private static float[] floats_w;
	private int x;
	private static int[] y;
	private boolean z;
	private int A;
	private static float[] B;
	private int C;
	private byte[][] D;
	private static float[] E;
	private static float[] F;
	private static int[] G;
	private static float[] H;
	private int I;
	private static float[] J;
	private float[] K;
	private static int L;
	private static int M;
	private static byte[] N;
	private static int O;
	private int P;
	private static g[] Q;
	private int R;
	private byte[] S;
	private static boolean[] T;
	private int U;

	static int a(int length) {
		int value = 0;
		int var2;
		int var3;
		for (var2 = 0; length >= 8 - O; length -= var3) {
			var3 = 8 - O;
			int var4 = (1 << var3) - 1;
			value += (N[int_q] >> O & var4) << var2;
			O = 0;
			++int_q;
			var2 += var3;
		}

		if (length > 0) {
			var3 = (1 << length) - 1;
			value += (N[int_q] >> O & var3) << var2;
			O += length;
		}

		return value;
	}

	public static void a() {
		N = null;
		gds_t = null;
		Q = null;
		ocs_o = null;
		qcs_u = null;
		T = null;
		ints_s = null;
		floats_v = null;
		J = null;
		H = null;
		B = null;
		F = null;
		E = null;
		floats_w = null;
		y = null;
		G = null;
	}

	private static void a(byte[] data, int var1) {
		N = data;
		int_q = var1;
		O = 0;
	}

	final k a(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.S == null) {
				this.x = 0;
				this.K = new float[L];
				this.S = new byte[this.C];
				this.R = 0;
				this.U = 0;
			}

			for (; this.U < this.D.length; ++this.U) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.b(this.U);
				if (var2 != null) {
					int var3 = this.R;
					int var4 = var2.length;
					if (var4 > this.C - var3) {
						var4 = this.C - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int) (128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.S[var3++] = (byte) (var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.R;
					}

					this.R = var3;
				}
			}

			this.K = null;
			byte[] var7 = this.S;
			this.S = null;
			return new k(this.int_r, var7, this.I, this.P, this.boolean_p);
		}
	}

	private static void a(byte[] data) {
		a(data, 0);
		M = 1 << a(4);
		L = 1 << a(4);
		floats_v = new float[L];

		for (int var1 = 0; var1 < 2; ++var1) {
			int var2 = var1 != 0 ? L : M;
			int var3 = var2 >> 1;
			int var4 = var2 >> 2;
			int var5 = var2 >> 3;

			float[] var6 = new float[var3];
			for (int var7 = 0; var7 < var4; ++var7) {
				var6[2 * var7] = (float) Math.cos((double) (4 * var7) * 3.141592653589793D / (double) var2);
				var6[2 * var7 + 1] = -((float) Math.sin((double) (4 * var7) * 3.141592653589793D / (double) var2));
			}

			float[] var8 = new float[var3];
			for (int var9 = 0; var9 < var4; ++var9) {
				var8[2 * var9] = (float) Math.cos((double) (2 * var9 + 1) * 3.141592653589793D / (double) (2 * var2));
				var8[2 * var9 + 1] = (float) Math.sin((double) (2 * var9 + 1) * 3.141592653589793D / (double) (2 * var2));
			}

			float[] var10 = new float[var4];
			for (int var11 = 0; var11 < var5; ++var11) {
				var10[2 * var11] = (float) Math.cos((double) (4 * var11 + 2) * 3.141592653589793D / (double) var2);
				var10[2 * var11 + 1] = -((float) Math.sin((double) (4 * var11 + 2) * 3.141592653589793D / (double) var2));
			}

			int[] var12 = new int[var5];
			int var13 = fh.a(-5, var5 - 1);
			for (int var14 = 0; var14 < var5; ++var14) {
				var12[var14] = ec.a(var14, (byte) -91, var13);
			}

			if (var1 != 0) {
				F = var6;
				E = var8;
				floats_w = var10;
				G = var12;
			} else {
				J = var6;
				H = var8;
				B = var10;
				y = var12;
			}
		}

		int var2 = a(8) + 1;
		gds_t = new gd[var2];
		for (int var3 = 0; var3 < var2; ++var3) {
			gds_t[var3] = new gd();
		}

		int var4 = a(6) + 1;
		for (int var5 = 0; var5 < var4; ++var5) {
			a(16);
		}

		int var15 = a(6) + 1;
		Q = new g[var15];
		for (int var7 = 0; var7 < var15; ++var7) {
			Q[var7] = new g();
		}

		int var16 = a(6) + 1;
		ocs_o = new oc[var16];
		for (int var9 = 0; var9 < var16; ++var9) {
			ocs_o[var9] = new oc();
		}

		int var17 = a(6) + 1;
		qcs_u = new qc[var17];
		for (int var11 = 0; var11 < var17; ++var11) {
			qcs_u[var11] = new qc();
		}

		int var18 = a(6) + 1;
		T = new boolean[var18];
		ints_s = new int[var18];
		for (int var13 = 0; var13 < var18; ++var13) {
			T[var13] = b() != 0;
			a(16);
			a(16);
			ints_s[var13] = a(8);
		}
	}

	private static boolean a(bg var0) {
		if (!boolean_n) {
			byte[] var1 = var0.a(0, 0, 0);
			if (var1 == null) {
				return false;
			}

			a(var1);
			boolean_n = true;
		}

		return true;
	}

	static fe a(bg var0, int var1, int var2) {
		if (!a(var0)) {
			var0.d(var2, var1, -120);
			return null;
		} else {
			byte[] var3 = var0.a(0, var2, var1);
			return var3 == null ? null : new fe(var3);
		}
	}

	private final float[] b(int var1) {
		a(this.D[var1], 0);
		b();
		int var2 = a(fh.a(-5, ints_s.length - 1));
		boolean var3 = T[var2];
		int var4 = var3 ? L : M;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = b() != 0;
			var6 = b() != 0;
		}

		int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (M >> 2);
			var9 = (var4 >> 2) + (M >> 2);
			var10 = M >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}

		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (M >> 2);
			var12 = var4 - (var4 >> 2) + (M >> 2);
			var13 = M >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}

		qc var14 = qcs_u[ints_s[var2]];
		int var16 = var14.int_b;
		int var17 = var14.ints_d[var16];
		boolean var15 = !Q[var17].b();
		boolean var18 = var15;

		float[] var21;
		for (int var19 = 0; var19 < var14.int_c; ++var19) {
			oc var20 = ocs_o[var14.ints_a[var19]];
			var21 = floats_v;
			var20.a(var21, var4 >> 1, var18);
		}

		int var47;
		int var48;
		if (!var15) {
			var47 = var14.int_b;
			var48 = var14.ints_d[var47];
			Q[var48].a(floats_v, var4 >> 1);
		}

		int var22;
		if (var15) {
			for (var47 = var4 >> 1; var47 < var4; ++var47) {
				floats_v[var47] = 0.0F;
			}
		} else {
			var47 = var4 >> 1;
			var48 = var4 >> 2;
			var22 = var4 >> 3;
			float[] var23 = floats_v;

			for (int var24 = 0; var24 < var47; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (int var25 = var47; var25 < var4; ++var25) {
				var23[var25] = -var23[var4 - var25 - 1];
			}

			float[] var26 = var3 ? F : J;
			float[] var27 = var3 ? E : H;
			float[] var28 = var3 ? floats_w : B;
			int[] var29 = var3 ? G : y;

			float var32;
			float var33;
			float var34;
			for (int var30 = 0; var30 < var48; ++var30) {
				float var31 = var23[4 * var30] - var23[var4 - 4 * var30 - 1];
				var32 = var23[4 * var30 + 2] - var23[var4 - 4 * var30 - 3];
				var33 = var26[2 * var30];
				var34 = var26[2 * var30 + 1];
				var23[var4 - 4 * var30 - 1] = var31 * var33 - var32 * var34;
				var23[var4 - 4 * var30 - 3] = var31 * var34 + var32 * var33;
			}

			for (int var51 = 0; var51 < var22; ++var51) {
				var32 = var23[var47 + 3 + 4 * var51];
				var33 = var23[var47 + 1 + 4 * var51];
				var34 = var23[4 * var51 + 3];
				float var35 = var23[4 * var51 + 1];
				var23[var47 + 3 + 4 * var51] = var32 + var34;
				var23[var47 + 1 + 4 * var51] = var33 + var35;
				float var36 = var26[var47 - 4 - 4 * var51];
				float var37 = var26[var47 - 3 - 4 * var51];
				var23[4 * var51 + 3] = (var32 - var34) * var36 - (var33 - var35) * var37;
				var23[4 * var51 + 1] = (var33 - var35) * var36 + (var32 - var34) * var37;
			}

			int var52 = fh.a(-5, var4 - 1);

			int var38;
			int var39;
			int var40;
			float var41;
			float var42;
			float var43;
			float var44;
			float var45;
			int var54;
			int var55;
			int var56;
			int var57;
			for (int var53 = 0; var53 < var52 - 3; ++var53) {
				var54 = var4 >> var53 + 2;
				var55 = 8 << var53;

				for (var56 = 0; var56 < 2 << var53; ++var56) {
					var57 = var4 - var54 * 2 * var56;
					var38 = var4 - var54 * (2 * var56 + 1);

					for (var39 = 0; var39 < var4 >> var53 + 4; ++var39) {
						var40 = 4 * var39;
						var41 = var23[var57 - 1 - var40];
						var42 = var23[var57 - 3 - var40];
						var43 = var23[var38 - 1 - var40];
						var44 = var23[var38 - 3 - var40];
						var23[var57 - 1 - var40] = var41 + var43;
						var23[var57 - 3 - var40] = var42 + var44;
						var45 = var26[var39 * var55];
						float var46 = var26[var39 * var55 + 1];
						var23[var38 - 1 - var40] = (var41 - var43) * var45 - (var42 - var44) * var46;
						var23[var38 - 3 - var40] = (var42 - var44) * var45 + (var41 - var43) * var46;
					}
				}
			}

			float var58;
			for (var54 = 1; var54 < var22 - 1; ++var54) {
				var55 = var29[var54];
				if (var54 < var55) {
					var56 = 8 * var54;
					var57 = 8 * var55;
					var58 = var23[var56 + 1];
					var23[var56 + 1] = var23[var57 + 1];
					var23[var57 + 1] = var58;
					var58 = var23[var56 + 3];
					var23[var56 + 3] = var23[var57 + 3];
					var23[var57 + 3] = var58;
					var58 = var23[var56 + 5];
					var23[var56 + 5] = var23[var57 + 5];
					var23[var57 + 5] = var58;
					var58 = var23[var56 + 7];
					var23[var56 + 7] = var23[var57 + 7];
					var23[var57 + 7] = var58;
				}
			}

			for (var55 = 0; var55 < var47; ++var55) {
				var23[var55] = var23[2 * var55 + 1];
			}

			for (var56 = 0; var56 < var22; ++var56) {
				var23[var4 - 1 - 2 * var56] = var23[4 * var56];
				var23[var4 - 2 - 2 * var56] = var23[4 * var56 + 1];
				var23[var4 - var48 - 1 - 2 * var56] = var23[4 * var56 + 2];
				var23[var4 - var48 - 2 - 2 * var56] = var23[4 * var56 + 3];
			}

			for (var57 = 0; var57 < var22; ++var57) {
				var58 = var28[2 * var57];
				float var59 = var28[2 * var57 + 1];
				float var60 = var23[var47 + 2 * var57];
				var41 = var23[var47 + 2 * var57 + 1];
				var42 = var23[var4 - 2 - 2 * var57];
				var43 = var23[var4 - 1 - 2 * var57];
				var44 = var59 * (var60 - var42) + var58 * (var41 + var43);
				var23[var47 + 2 * var57] = (var60 + var42 + var44) * 0.5F;
				var23[var4 - 2 - 2 * var57] = (var60 + var42 - var44) * 0.5F;
				var44 = var59 * (var41 + var43) - var58 * (var60 - var42);
				var23[var47 + 2 * var57 + 1] = (var41 - var43 + var44) * 0.5F;
				var23[var4 - 1 - 2 * var57] = (-var41 + var43 + var44) * 0.5F;
			}

			for (var38 = 0; var38 < var48; ++var38) {
				var23[var38] = var23[2 * var38 + var47] * var27[2 * var38] + var23[2 * var38 + 1 + var47] * var27[2 * var38 + 1];
				var23[var47 - 1 - var38] = var23[2 * var38 + var47] * var27[2 * var38 + 1] - var23[2 * var38 + 1 + var47] * var27[2 * var38];
			}

			for (var39 = 0; var39 < var48; ++var39) {
				var23[var4 - var48 + var39] = -var23[var39];
			}

			for (var40 = 0; var40 < var48; ++var40) {
				var23[var40] = var23[var48 + var40];
			}

			for (int var61 = 0; var61 < var48; ++var61) {
				var23[var48 + var61] = -var23[var48 - var61 - 1];
			}

			for (int var62 = 0; var62 < var48; ++var62) {
				var23[var47 + var62] = var23[var4 - var62 - 1];
			}

			for (int var63 = var8; var63 < var9; ++var63) {
				var44 = (float) Math.sin(((double) (var63 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
				floats_v[var63] *= (float) Math.sin(1.5707963267948966D * (double) var44 * (double) var44);
			}

			for (int var64 = var11; var64 < var12; ++var64) {
				var45 = (float) Math.sin(((double) (var64 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				floats_v[var64] *= (float) Math.sin(1.5707963267948966D * (double) var45 * (double) var45);
			}
		}

		float[] var49 = null;
		if (this.x > 0) {
			var48 = this.x + var4 >> 2;
			var49 = new float[var48];
			int var50;
			if (!this.z) {
				for (var22 = 0; var22 < this.A; ++var22) {
					var50 = (this.x >> 1) + var22;
					var49[var22] += this.K[var50];
				}
			}

			if (!var15) {
				for (var22 = var8; var22 < var4 >> 1; ++var22) {
					var50 = var49.length - (var4 >> 1) + var22;
					var49[var50] += floats_v[var22];
				}
			}
		}

		var21 = this.K;
		this.K = floats_v;
		floats_v = var21;
		this.x = var4;
		this.A = var12 - (var4 >> 1);
		this.z = var15;
		return var49;
	}

	static float c(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
	}

	static int b() {
		int var0 = N[int_q] >> O & 1;
		++O;
		int_q += O >> 3;
		O &= 7;
		return var0;
	}

	private final void b(byte[] var1) {
		ja var2 = new ja(var1);
		this.int_r = var2.l(15);
		this.C = var2.l(15);
		this.I = var2.l(15);
		this.P = var2.l(15);
		if (this.P < 0) {
			this.P = ~this.P;
			this.boolean_p = true;
		}

		int var3 = var2.l(15);
		this.D = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.j((byte) 126);
				var5 += var6;
			} while (var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.a(var7, 0, var5, 1174839336);
			this.D[var4] = var7;
		}

	}

	private fe(byte[] var1) {
		this.b(var1);
	}
}
