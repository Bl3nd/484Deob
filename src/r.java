import java.util.zip.CRC32;

final class r extends j {

	static int Q;
	static lf qa_op_testCommand = dd.a("::qa_op_test", 2);
	static lf S = dd.a(":", 2);
	static int T;
	static int U;
	static int V;
	static CRC32 W = new CRC32();
	static u X;
	static int Y = 0;
	static lf Z;
	static int int_ab = 5063219;
	static short[][] shorts_bb;
	static lf lf_cb;
	static int[] ints_db = new int[]{0, 1, 2, 3};
	private static lf lf_eb = dd.a("red:", 2);
	static int int_fb;
	private ch[] chs_gb;

	static final void a(boolean var0, byte var1, fi var2) {
		try {
			++T;
			if (var1 >= 112) {
				int var4 = (int) var2.long_e;
				int var3 = var2.int_n;
				var2.a(true);
				if (var0) {
					bi.a(-60, (int) var3);
				}

				wg.a((byte) -64, var3);
				vg var5 = ra.a(var4, (byte) 115);
				if (var5 != null) {
					mc.a(var5, -23101);
				}

				qa.int_eb = 0;
				f.boolean_ab = false;
				v.a(ng.M, lb.E, la.int_e, lh.I, 188);
				if (ac.int_ab != -1) {
					ce.c(1, 119, ac.int_ab);
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "r.B(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final int e(int var0) {
		try {
			if (var0 != 662) {
				W = null;
			}

			int var1 = bh.a(mb.A, false, hc.int_pb, dh.int_i);
			++V;
			return var1 + -nd.y < 800 && ~(jc.bytes_q[hc.int_pb][dh.int_i >> 504150023][mb.A >> -374028121] & 4) != -1 ? hc.int_pb : 3;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "r.C(" + var0 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		try {
			if (var1 > -49) {
				int_ab = 86;
			}

			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				this.a(0, super.H.a((byte) -77));
			}

			++U;
			return var3;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "r.G(" + var1 + ',' + var2 + ')');
		}
	}

	public static void f(int var0) {
		try {
			ints_db = null;
			shorts_bb = null;
			qa_op_testCommand = null;
			if (var0 != 4382) {
				a(false, (byte) -115, (fi) null);
			}

			S = null;
			X = null;
			W = null;
			lf_cb = null;
			Z = null;
			lf_eb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "r.A(" + var0 + ')');
		}
	}

	public r() {
		super(0, true);
	}

	final int[][] b(int var1, int var2) {
		int var16 = client.int_gc;

		try {
			if (var2 != 2177) {
				return null;
			} else {
				int[][] var3 = super.jh_q.a((byte) -128, var1);
				if (super.jh_q.boolean_w) {
					int var4 = ff.int_a;
					int var5 = dg.int_p;
					int[][] var6 = new int[var5][var4];
					int[][][] var7 = super.jh_q.a((byte) 94);
					this.a(0, var6);
					int var8 = 0;
					if (var16 != 0 || ~dg.int_p < ~var8) {
						do {
							int[] var9 = var6[var8];
							int[][] var10 = var7[var8];
							int[] var12 = var10[1];
							int[] var11 = var10[0];
							int[] var13 = var10[2];
							int var14 = 0;
							if (var16 == 0 && var14 >= ff.int_a) {
								++var8;
							} else {
								do {
									int var15 = var9[var14];
									var13[var14] = sd.a(var15, 255) << 831591620;
									var12[var14] = sd.a(var15, '\uff00') >> 142048516;
									var11[var14] = sd.a(var15 >> 1860875468, 4080);
									++var14;
								} while (var14 < ff.int_a);

								++var8;
							}
						} while (~dg.int_p < ~var8);
					}
				}

				++Q;
				return var3;
			}
		} catch (RuntimeException var17) {
			throw ec.a(var17, "r.E(" + var1 + ',' + var2 + ')');
		}
	}

	private final void a(int var1, int[][] var2) {
		int var9 = client.int_gc;

		try {
			int var3 = ff.int_a;
			++int_fb;
			int var4 = dg.int_p;
			ah.a((byte) 119, (int[][]) var2);
			ka.a(qb.Z, var1 ^ -3753, ch.int_h, var1, 0);
			if (this.chs_gb != null) {
				int var5 = 0;
				if (var9 != 0 || var5 < this.chs_gb.length) {
					do {
						label37:
						{
							ch var6 = this.chs_gb[var5];
							int var7 = var6.int_f;
							int var8 = var6.int_a;
							if (var7 >= 0) {
								if (var8 >= 0) {
									var6.a(var4, var3, (int) -35);
									if (var9 == 0) {
										break label37;
									}
								}

								var6.a(var4, var3, (byte) 0);
								if (var9 == 0) {
									break label37;
								}
							}

							if (var8 >= 0) {
								var6.c(var3, 20396, var4);
							}
						}

						++var5;
					} while (var5 < this.chs_gb.length);

				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "r.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Z = lf_eb;
		lf_cb = lf_eb;
		shorts_bb = new short[][]{{(short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) -22182, (short) -27211, (short) -27198, (short) -27186, (short) -27302, (short) 542, (short) 555, (short) 941, (short) 951, (short) 8076, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 11096, (short) 10258, (short) 10776, (short) 10661, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) -6630, (short) -5467, (short) -6473, (short) -6838, (short) -32318, (short) -26069, (short) -25925, (short) -25669, (short) 11202, (short) 22193, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) -25437, (short) -26445, (short) -27450, (short) 9694, (short) 21824, (short) 123, (short) 111, (short) 99, (short) 17814, (short) 16801, (short) 17837, (short) 16697, (short) 7341, (short) 7496, (short) 5330, (short) 7384, (short) 5268, (short) 3230, (short) 2223, (short) 72, (short) 10277, (short) 8377, (short) 8394, (short) 7384, (short) -22370, (short) -22221, (short) -22196, (short) -22314, (short) -29637, (short) -27434, (short) -29604, (short) -25491, (short) 662, (short) 796, (short) 933, (short) 819, (short) 10258, (short) 6430, (short) 5425, (short) 5314, (short) 10917, (short) 10925, (short) 10935, (short) 10471, (short) 10258, (short) 10524, (short) 10415, (short) 10301, (short) -11108, (short) -11093, (short) -11203, (short) -8034, (short) -5839, (short) -6836, (short) -5934, (short) -32674, (short) -14444, (short) -15455, (short) -15697, (short) -15557, (short) -15424, (short) -11622, (short) -11601, (short) -11450, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) -30054, (short) -30159, (short) -30019, (short) -21734, (short) -21845, (short) -21707, (short) -21690, (short) -21564, (short) -24921, (short) -24775, (short) -24640, (short) 662, (short) 794, (short) 811, (short) 945, (short) 827, (short) 957, (short) 5425, (short) 5314, (short) 11032, (short) 10921, (short) 11183, (short) 11069, (short) 11200, (short) 4775, (short) 3891, (short) 3904, (short) -18792, (short) -19799, (short) -20807, (short) -20677, (short) -20534, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 20366, (short) 21274, (short) 21415, (short) 20401, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 4300, (short) 8412, (short) 3294, (short) 4193, (short) 3303, (short) 123, (short) 111, (short) 99, (short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) 14990, (short) 14746, (short) 15779, (short) 15795, (short) 15944, (short) 662, (short) 796, (short) 941, (short) 951, (short) 148, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 10894, (short) 10776, (short) 10661, (short) 10795, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) 12998, (short) 12731, (short) 11718, (short) -6838, (short) -32318, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86}, {(short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) -22182, (short) -27211, (short) -27198, (short) -27186, (short) -27302, (short) 542, (short) 555, (short) 941, (short) 951, (short) 8076, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 11096, (short) 10258, (short) 10776, (short) 10661, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) -6630, (short) -5467, (short) -6473, (short) -6838, (short) -32318, (short) -26069, (short) -25925, (short) -25669, (short) 11202, (short) 22193, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) -25437, (short) -26445, (short) -27450, (short) 9694, (short) 21824, (short) 123, (short) 111, (short) 99, (short) 17814, (short) 16801, (short) 17837, (short) 16697, (short) 7341, (short) 7496, (short) 5330, (short) 7384, (short) 5268, (short) 3230, (short) 2223, (short) 72, (short) 10277, (short) 8377, (short) 8394, (short) 7384, (short) -22370, (short) -22221, (short) -22196, (short) -22314, (short) -29637, (short) -27434, (short) -29604, (short) -25491, (short) 662, (short) 796, (short) 933, (short) 819, (short) 10258, (short) 6430, (short) 5425, (short) 5314, (short) 10917, (short) 10925, (short) 10935, (short) 10471, (short) 10258, (short) 10524, (short) 10415, (short) 10301, (short) -11108, (short) -11093, (short) -11203, (short) -8034, (short) -5839, (short) -6836, (short) -5934, (short) -32674, (short) -14444, (short) -15455, (short) -15697, (short) -15557, (short) -15424, (short) -11622, (short) -11601, (short) -11450, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) -30054, (short) -30159, (short) -30019, (short) -21734, (short) -21845, (short) -21707, (short) -21690, (short) -21564, (short) -24921, (short) -24775, (short) -24640, (short) 662, (short) 794, (short) 811, (short) 945, (short) 827, (short) 957, (short) 5425, (short) 5314, (short) 11032, (short) 10921, (short) 11183, (short) 11069, (short) 11200, (short) 4775, (short) 3891, (short) 3904, (short) -18792, (short) -19799, (short) -20807, (short) -20677, (short) -20534, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 20366, (short) 21274, (short) 21415, (short) 20401, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 4300, (short) 8412, (short) 3294, (short) 4193, (short) 3303, (short) 123, (short) 111, (short) 99, (short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) 14990, (short) 14746, (short) 15779, (short) 15795, (short) 15944, (short) 662, (short) 796, (short) 941, (short) 951, (short) 148, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 10894, (short) 10776, (short) 10661, (short) 10795, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) 12998, (short) 12731, (short) 11718, (short) -6838, (short) -32318, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86}, {(short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) -22182, (short) -27211, (short) -27198, (short) -27186, (short) -27302, (short) 542, (short) 555, (short) 941, (short) 951, (short) 8076, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 11096, (short) 10258, (short) 10776, (short) 10661, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) -6630, (short) -5467, (short) -6473, (short) -6838, (short) -32318, (short) -26069, (short) -25925, (short) -25669, (short) 11202, (short) 22193, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) -25437, (short) -26445, (short) -27450, (short) 9694, (short) 21824, (short) 123, (short) 111, (short) 99, (short) 17814, (short) 16801, (short) 17837, (short) 16697, (short) 7341, (short) 7496, (short) 5330, (short) 7384, (short) 5268, (short) 3230, (short) 2223, (short) 72, (short) 10277, (short) 8377, (short) 8394, (short) 7384, (short) -22370, (short) -22221, (short) -22196, (short) -22314, (short) -29637, (short) -27434, (short) -29604, (short) -25491, (short) 662, (short) 796, (short) 933, (short) 819, (short) 10258, (short) 6430, (short) 5425, (short) 5314, (short) 10917, (short) 10925, (short) 10935, (short) 10471, (short) 10258, (short) 10524, (short) 10415, (short) 10301, (short) -11108, (short) -11093, (short) -11203, (short) -8034, (short) -5839, (short) -6836, (short) -5934, (short) -32674, (short) -14444, (short) -15455, (short) -15697, (short) -15557, (short) -15424, (short) -11622, (short) -11601, (short) -11450, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) -30054, (short) -30159, (short) -30019, (short) -21734, (short) -21845, (short) -21707, (short) -21690, (short) -21564, (short) -24921, (short) -24775, (short) -24640, (short) 662, (short) 794, (short) 811, (short) 945, (short) 827, (short) 957, (short) 5425, (short) 5314, (short) 11032, (short) 10921, (short) 11183, (short) 11069, (short) 11200, (short) 4775, (short) 3891, (short) 3904, (short) -18792, (short) -19799, (short) -20807, (short) -20677, (short) -20534, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 20366, (short) 21274, (short) 21415, (short) 20401, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 4300, (short) 8412, (short) 3294, (short) 4193, (short) 3303, (short) 123, (short) 111, (short) 99, (short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) 14990, (short) 14746, (short) 15779, (short) 15795, (short) 15944, (short) 662, (short) 796, (short) 941, (short) 951, (short) 148, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 10894, (short) 10776, (short) 10661, (short) 10795, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) 12998, (short) 12731, (short) 11718, (short) -6838, (short) -32318, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86}, {(short) 4300, (short) 3294, (short) 3303, (short) 3264, (short) 4506, (short) 4382, (short) 4387, (short) 5293, (short) 7622, (short) 7384, (short) 8412, (short) 7496, (short) 86, (short) 123, (short) 111, (short) 99, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) -25437, (short) -26445, (short) -27450, (short) 9694, (short) 21824, (short) 123, (short) 111, (short) 99, (short) 17814, (short) 16801, (short) 17837, (short) 16697, (short) 7341, (short) 7496, (short) 5330, (short) 7384, (short) 5268, (short) 3230, (short) 2223, (short) 72, (short) 10277, (short) 8377, (short) 8394, (short) 7384, (short) -22370, (short) -22221, (short) -22196, (short) -22314, (short) -29637, (short) -27434, (short) -29604, (short) -25491, (short) 662, (short) 796, (short) 933, (short) 819, (short) 10258, (short) 6430, (short) 5425, (short) 5314, (short) 10917, (short) 10925, (short) 10935, (short) 10471, (short) 10258, (short) 10524, (short) 10415, (short) 10301, (short) -11108, (short) -11093, (short) -11203, (short) -8034, (short) -5839, (short) -6836, (short) -5934, (short) -32674, (short) -14444, (short) -15455, (short) -15697, (short) -15557, (short) -15424, (short) -11622, (short) -11601, (short) -11450, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) -30054, (short) -30159, (short) -30019, (short) -21734, (short) -21845, (short) -21707, (short) -21690, (short) -21564, (short) -24921, (short) -24775, (short) -24640, (short) 662, (short) 794, (short) 811, (short) 945, (short) 827, (short) 957, (short) 5425, (short) 5314, (short) 11032, (short) 10921, (short) 11183, (short) 11069, (short) 11200, (short) 4775, (short) 3891, (short) 3904, (short) -18792, (short) -19799, (short) -20807, (short) -20677, (short) -20534, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 20366, (short) 21274, (short) 21415, (short) 20401, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 4300, (short) 8412, (short) 3294, (short) 4193, (short) 3303, (short) 123, (short) 111, (short) 99, (short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) 14990, (short) 14746, (short) 15779, (short) 15795, (short) 15944, (short) 662, (short) 796, (short) 941, (short) 951, (short) 148, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 10894, (short) 10776, (short) 10661, (short) 10795, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) 12998, (short) 12731, (short) 11718, (short) -6838, (short) -32318, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86}, {(short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) -22182, (short) -27211, (short) -27198, (short) -27186, (short) -27302, (short) 542, (short) 555, (short) 941, (short) 951, (short) 8076, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 11096, (short) 10258, (short) 10776, (short) 10661, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) -6630, (short) -5467, (short) -6473, (short) -6838, (short) -32318, (short) -26069, (short) -25925, (short) -25669, (short) 11202, (short) 22193, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 22461, (short) -21571, (short) 11200, (short) 957, (short) -10317, (short) 5056, (short) -31808, (short) 123, (short) 22453, (short) -21579, (short) 11191, (short) 949, (short) -10325, (short) 4023, (short) -31817, (short) 4, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 20366, (short) 20401, (short) 662, (short) 827, (short) 7054, (short) 5056, (short) -21734, (short) -21564, (short) -14444, (short) -15424, (short) 11032, (short) 11200, (short) 4, (short) 123, (short) 61, (short) -18792, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 4300, (short) 3294, (short) 3303, (short) 3264, (short) 4506, (short) 4382, (short) 4387, (short) 5293, (short) 8412, (short) 8301, (short) 8076, (short) 6936, (short) 5675, (short) 941, (short) 5056, (short) 15795, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0}};
	}
}
