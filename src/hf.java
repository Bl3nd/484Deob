import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class hf {

	static int int_a;
	static int int_b = 0;
	static int int_c;
	private long long_d;
	static int int_e;
	static int int_f;
	private long long_g = -1L;
	private long long_h;
	static int int_i;
	private int int_j = 0;
	static int int_k;
	private long long_l;
	private long long_m;
	private long long_n = -1L;
	static int int_o;
	static int int_p = 1;
	static lf lf_q = dd.a("Bitte versuchen Sie es erneut)3", 2);
	static int int_r;
	private int int_s;
	static int int_t;
	static int int_u;
	static int int_v;
	static int int_w;
	static lf[] x = new lf[100];
	private byte[] y;
	private byte[] z;
	static byte A = 0;
	private sa B;

	private final void a(byte var1) throws IOException {
		int var3 = client.int_gc;

		try {
			this.int_s = 0;
			if (this.long_l != this.long_d) {
				this.B.a(-29, this.long_l);
				this.long_d = this.long_l;
			}

			if (var1 != 60) {
				this.c((byte) -34);
			}

			this.long_n = this.long_l;
			++int_r;
			if (var3 != 0 || ~this.z.length < ~this.int_s) {
				do {
					int var2 = this.B.a(this.z.length - this.int_s, this.z, this.int_s, 1);
					if (~var2 == 0) {
						break;
					}

					this.long_d += (long) var2;
					this.int_s += var2;
				} while (~this.z.length < ~this.int_s);
			}

		} catch (RuntimeException var4) {
			throw ec.a(var4, "hf.B(" + var1 + ')');
		}
	}

	public static void b(byte var0) {
		try {
			x = null;
			lf_q = null;
			if (var0 != 100) {
				A = 50;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "hf.D(" + var0 + ')');
		}
	}

	final void a(int var1, int var2, int var3, byte[] var4) throws IOException {
		int var14 = client.int_gc;

		try {
			++int_k;

			try {
				if (~var4.length > ~(var2 - -var3)) {
					throw new ArrayIndexOutOfBoundsException(-var4.length + var2 + var3);
				}

				if (~this.long_g != 0L && ~this.long_l <= ~this.long_g && ~((long) this.int_j + this.long_g) <= ~(this.long_l - -((long) var3))) {
					na.a(this.y, (int) (this.long_l - this.long_g), var4, var2, var3);
					this.long_l += (long) var3;
					return;
				}

				long var5 = this.long_l;
				int var8 = var3;
				int var9;
				if (this.long_l >= this.long_n && this.long_n + (long) this.int_s > this.long_l) {
					var9 = (int) ((long) this.int_s + -this.long_l - -this.long_n);
					if (~var3 > ~var9) {
						var9 = var3;
					}

					var3 -= var9;
					na.a(this.z, (int) (-this.long_n + this.long_l), var4, var2, var9);
					var2 += var9;
					this.long_l += (long) var9;
				}

				label141:
				{
					if (this.z.length < var3) {
						this.B.a(-96, this.long_l);
						this.long_d = this.long_l;
						if (var14 != 0 || ~var3 < -1) {
							do {
								var9 = this.B.a(var3, var4, var2, 1);
								if (var9 == -1) {
									break;
								}

								var2 += var9;
								this.long_l += (long) var9;
								var3 -= var9;
								this.long_d += (long) var9;
							} while (~var3 < -1);
						}

						if (var14 == 0) {
							break label141;
						}
					}

					if (~var3 < -1) {
						this.a((byte) 60);
						var9 = var3;
						if (this.int_s < var3) {
							var9 = this.int_s;
						}

						var3 -= var9;
						na.a((byte[]) this.z, 0, (byte[]) var4, var2, var9);
						var2 += var9;
						this.long_l += (long) var9;
					}
				}

				if (~this.long_g != 0L) {
					if (this.long_l < this.long_g && var3 > 0) {
						label114:
						{
							var9 = (int) (-this.long_l + this.long_g) + var2;
							if (~(var2 + var3) > ~var9) {
								var9 = var3 + var2;
								if (var14 == 0 && var2 >= var9) {
									break label114;
								}
							} else if (var2 >= var9) {
								break label114;
							}

							do {
								--var3;
								var4[var2++] = 0;
								++this.long_l;
							} while (var2 < var9);
						}
					}

					long var17;
					label100:
					{
						var17 = -1L;
						if (~this.long_g <= ~var5 && this.long_g < (long) var8 + var5) {
							var17 = this.long_g;
							if (var14 == 0) {
								break label100;
							}
						}

						if (~var5 <= ~this.long_g && (long) this.int_j + this.long_g > var5) {
							var17 = var5;
						}
					}

					long var11;
					label94:
					{
						var11 = -1L;
						if (~(this.long_g - -((long) this.int_j)) < ~var5 && ~(var5 + (long) var8) <= ~((long) this.int_j + this.long_g)) {
							var11 = (long) this.int_j + this.long_g;
							if (var14 == 0) {
								break label94;
							}
						}

						if (~this.long_g > ~(var5 + (long) var8) && ~(this.long_g - -((long) this.int_j)) <= ~(var5 - -((long) var8))) {
							var11 = var5 + (long) var8;
						}
					}

					if (~var17 < 0L && ~var11 < ~var17) {
						int var13 = (int) (-var17 + var11);
						na.a(this.y, (int) (-this.long_g + var17), var4, (int) (-var5 + var17) + var2, var13);
						if (this.long_l < var11) {
							var3 = (int) ((long) var3 - (var11 - this.long_l));
							this.long_l = var11;
						}
					}
				}

				if (var1 >= -124) {
					this.c((byte) 116);
				}
			} catch (IOException var15) {
				this.long_d = -1L;
				throw var15;
			}

			if (var3 > 0) {
				throw new EOFException();
			}
		} catch (RuntimeException var16) {
			throw ec.a(var16, "hf.A(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1) throws IOException {
		try {
			++int_e;
			this.e((byte) -32);
			if (var1 != 2) {
				this.long_g = 5L;
			}

			this.B.a((byte) 88);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "hf.I(" + var1 + ')');
		}
	}

	static final boolean a(int var0, int var1) {
		try {
			if (var0 != 48) {
				A = -8;
			}

			++int_t;
			return var1 >= 48 && var1 <= 57;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "hf.H(" + var0 + ',' + var1 + ')');
		}
	}

	final void a(byte[] var1, boolean var2) throws IOException {
		try {
			++int_v;
			if (!var2) {
				this.a(-126, 0, var1.length, var1);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "hf.N(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	private final File c(byte var1) {
		try {
			if (var1 >= -56) {
				return null;
			} else {
				++int_i;
				return this.B.a(false);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "hf.J(" + var1 + ')');
		}
	}

	static final void a(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		ab var6 = i.Ib[var3][var4][var5];
		if (var6 != null) {
			nf var7 = var6.L;
			int var9;
			if (var7 == null) {
				eb var17 = var6.M;
				if (var17 != null) {
					var9 = var17.int_s;
					int var10 = var17.int_n;
					int var11 = var17.int_b;
					int var12 = var17.int_r;
					int[] var13 = kb.ints_a[var9];
					int[] var14 = jh.ints_g[var10];
					int var15 = 0;
					int var16;
					if (var11 != 0) {
						for (var16 = 0; var16 < 4; ++var16) {
							var0[var1] = var13[var14[var15++]] == 0 ? var11 : var12;
							var0[var1 + 1] = var13[var14[var15++]] == 0 ? var11 : var12;
							var0[var1 + 2] = var13[var14[var15++]] == 0 ? var11 : var12;
							var0[var1 + 3] = var13[var14[var15++]] == 0 ? var11 : var12;
							var1 += var2;
						}

					} else {
						for (var16 = 0; var16 < 4; ++var16) {
							if (var13[var14[var15++]] != 0) {
								var0[var1] = var12;
							}

							if (var13[var14[var15++]] != 0) {
								var0[var1 + 1] = var12;
							}

							if (var13[var14[var15++]] != 0) {
								var0[var1 + 2] = var12;
							}

							if (var13[var14[var15++]] != 0) {
								var0[var1 + 3] = var12;
							}

							var1 += var2;
						}

					}
				}
			} else {
				int var8 = var7.int_l;
				if (var8 != 0) {
					for (var9 = 0; var9 < 4; ++var9) {
						var0[var1] = var8;
						var0[var1 + 1] = var8;
						var0[var1 + 2] = var8;
						var0[var1 + 3] = var8;
						var1 += var2;
					}

				}
			}
		}
	}

	final void a(byte[] var1, int var2, byte var3, int var4) throws IOException {
		int var10 = client.int_gc;

		try {
			++int_u;

			try {
				if (var3 != 19) {
					d((byte) -8);
				}

				if (this.long_l - -((long) var4) > this.long_m) {
					this.long_m = (long) var4 + this.long_l;
				}

				if (~this.long_g != 0L && (~this.long_g < ~this.long_l || this.long_l > (long) this.int_j + this.long_g)) {
					this.e((byte) -74);
				}

				if (~this.long_g != 0L && this.long_g + (long) this.y.length < this.long_l - -((long) var4)) {
					int var5 = (int) (this.long_g + -this.long_l + (long) this.y.length);
					na.a(var1, var2, this.y, (int) (this.long_l + -this.long_g), var5);
					var4 -= var5;
					var2 += var5;
					this.long_l += (long) var5;
					this.int_j = this.y.length;
					this.e((byte) -85);
				}

				if (~this.y.length > ~var4) {
					long var13 = -1L;
					long var7 = -1L;
					if (this.long_d != this.long_l) {
						this.B.a(-107, this.long_l);
						this.long_d = this.long_l;
					}

					label90:
					{
						this.B.a(var1, var2, (byte) -7, var4);
						if (~this.long_n > ~((long) var4 + this.long_l) && this.long_n - -((long) this.int_s) >= this.long_l + (long) var4) {
							var7 = this.long_l - -((long) var4);
							if (var10 == 0) {
								break label90;
							}
						}

						if (~(this.long_n + (long) this.int_s) < ~this.long_l && ~(this.long_l - -((long) var4)) <= ~(this.long_n + (long) this.int_s)) {
							var7 = (long) this.int_s + this.long_n;
						}
					}

					label118:
					{
						this.long_d += (long) var4;
						if (this.long_n > this.long_l || this.long_l >= this.long_n - -((long) this.int_s)) {
							if (this.long_l > this.long_n || this.long_n >= this.long_l + (long) var4) {
								break label118;
							}

							var13 = this.long_n;
							if (var10 == 0) {
								break label118;
							}
						}

						var13 = this.long_l;
					}

					if (this.long_d > this.long_h) {
						this.long_h = this.long_d;
					}

					if (var13 > -1L && var7 > var13) {
						int var9 = (int) (var7 + -var13);
						na.a(var1, (int) ((long) var2 - (-var13 - -this.long_l)), this.z, (int) (var13 + -this.long_n), var9);
					}

					this.long_l += (long) var4;
				} else if (~var4 < -1) {
					if (~this.long_g == 0L) {
						this.long_g = this.long_l;
					}

					na.a(var1, var2, this.y, (int) (-this.long_g + this.long_l), var4);
					this.long_l += (long) var4;
					if (~((long) this.int_j) > ~(-this.long_g + this.long_l)) {
						this.int_j = (int) (-this.long_g + this.long_l);
					}

				}
			} catch (IOException var11) {
				this.long_d = -1L;
				throw var11;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "hf.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static final boolean d(byte var0) {
		try {
			++int_w;
			int var1 = -112 % (var0 / 50);
			return ig.int_r != 0 || gg.sh_n.d(68);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "hf.C(" + var0 + ')');
		}
	}

	final long b(int var1) {
		try {
			if (var1 >= -116) {
				this.b((int) 89);
			}

			++int_f;
			return this.long_m;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "hf.M(" + var1 + ')');
		}
	}

	final void a(long var1, boolean var3) throws IOException {
		try {
			++int_a;
			if (~var1 > -1L) {
				throw new IOException("Invalid seek to " + var1 + " in file " + this.c((byte) -77));
			} else {
				if (var3) {
					this.z = null;
				}

				this.long_l = var1;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "hf.G(" + var1 + ',' + var3 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < 0) {
			var0 = 0;
		} else if (var0 >= l.int_l * 128) {
			var0 = l.int_l * 128 - 1;
		}

		if (var2 < 0) {
			var2 = 0;
		} else if (var2 >= ge.int_c * 128) {
			var2 = ge.int_c * 128 - 1;
		}

		++kh.V;
		pc.int_b = nc.X[var3];
		mf.C = nc.ints_bb[var3];
		ua.Q = nc.X[var4];
		ei.int_e = nc.ints_bb[var4];
		of.booleans_w = cb.booleans_p[(var3 - 128) / 32][var4 / 64];
		bg.int_l = var0;
		tc.int_lb = var1;
		pe.int_l = var2;
		ra.int_ab = var0 / 128;
		d.Z = var2 / 128;
		wg.int_n = var5;
		ad.int_o = ra.int_ab - ce.Q;
		if (ad.int_o < 0) {
			ad.int_o = 0;
		}

		cc.S = d.Z - ce.Q;
		if (cc.S < 0) {
			cc.S = 0;
		}

		pa.int_d = ra.int_ab + ce.Q;
		if (pa.int_d > l.int_l) {
			pa.int_d = l.int_l;
		}

		d.V = d.Z + ce.Q;
		if (d.V > ge.int_c) {
			d.V = ge.int_c;
		}

		u.a();
		de.int_u = 0;

		int var8;
		int var9;
		for (int var6 = v.int_rb; var6 < ec.int_bb; ++var6) {
			ab[][] var7 = i.Ib[var6];

			for (var8 = ad.int_o; var8 < pa.int_d; ++var8) {
				for (var9 = cc.S; var9 < d.V; ++var9) {
					ab var10 = var7[var8][var9];
					if (var10 != null) {
						if (var10.z <= var5 && (of.booleans_w[var8 - ra.int_ab + ce.Q][var9 - d.Z + ce.Q] || ch.ints_g[var6][var8][var9] - var1 >= 2000)) {
							var10.B = true;
							var10.J = true;
							if (var10.int_p > 0) {
								var10.boolean_u = true;
							} else {
								var10.boolean_u = false;
							}

							++de.int_u;
						} else {
							var10.B = false;
							var10.J = false;
							var10.y = 0;
						}
					}
				}
			}
		}

		int var11;
		int var12;
		int var13;
		int var14;
		int var20;
		for (int var17 = v.int_rb; var17 < ec.int_bb; ++var17) {
			ab[][] var18 = i.Ib[var17];

			for (var9 = -ce.Q; var9 <= 0; ++var9) {
				var20 = ra.int_ab + var9;
				var11 = ra.int_ab - var9;
				if (var20 >= ad.int_o || var11 < pa.int_d) {
					for (var12 = -ce.Q; var12 <= 0; ++var12) {
						var13 = d.Z + var12;
						var14 = d.Z - var12;
						ab var15;
						if (var20 >= ad.int_o) {
							if (var13 >= cc.S) {
								var15 = var18[var20][var13];
								if (var15 != null && var15.B) {
									rf.a(var15, true);
								}
							}

							if (var14 < d.V) {
								var15 = var18[var20][var14];
								if (var15 != null && var15.B) {
									rf.a(var15, true);
								}
							}
						}

						if (var11 < pa.int_d) {
							if (var13 >= cc.S) {
								var15 = var18[var11][var13];
								if (var15 != null && var15.B) {
									rf.a(var15, true);
								}
							}

							if (var14 < d.V) {
								var15 = var18[var11][var14];
								if (var15 != null && var15.B) {
									rf.a(var15, true);
								}
							}
						}

						if (de.int_u == 0) {
							ng.boolean_ab = false;
							return;
						}
					}
				}
			}
		}

		for (var8 = v.int_rb; var8 < ec.int_bb; ++var8) {
			ab[][] var19 = i.Ib[var8];

			for (var20 = -ce.Q; var20 <= 0; ++var20) {
				var11 = ra.int_ab + var20;
				var12 = ra.int_ab - var20;
				if (var11 >= ad.int_o || var12 < pa.int_d) {
					for (var13 = -ce.Q; var13 <= 0; ++var13) {
						var14 = d.Z + var13;
						int var21 = d.Z - var13;
						ab var16;
						if (var11 >= ad.int_o) {
							if (var14 >= cc.S) {
								var16 = var19[var11][var14];
								if (var16 != null && var16.B) {
									rf.a(var16, false);
								}
							}

							if (var21 < d.V) {
								var16 = var19[var11][var21];
								if (var16 != null && var16.B) {
									rf.a(var16, false);
								}
							}
						}

						if (var12 < pa.int_d) {
							if (var14 >= cc.S) {
								var16 = var19[var12][var14];
								if (var16 != null && var16.B) {
									rf.a(var16, false);
								}
							}

							if (var21 < d.V) {
								var16 = var19[var12][var21];
								if (var16 != null && var16.B) {
									rf.a(var16, false);
								}
							}
						}

						if (de.int_u == 0) {
							ng.boolean_ab = false;
							return;
						}
					}
				}
			}
		}

		ng.boolean_ab = false;
	}

	private final void e(byte var1) throws IOException {
		int var7 = client.int_gc;

		try {
			++int_c;
			if (~this.long_g != 0L) {
				long var4 = -1L;
				long var2 = -1L;
				if (~this.long_d != ~this.long_g) {
					this.B.a(-104, this.long_g);
					this.long_d = this.long_g;
				}

				label72:
				{
					this.B.a(this.y, 0, (byte) -7, this.int_j);
					if (~this.long_n <= ~(this.long_g - -((long) this.int_j)) || (long) this.int_s + this.long_n < this.long_g - -((long) this.int_j)) {
						if (~((long) this.int_s + this.long_n) >= ~this.long_g || this.long_n + (long) this.int_s > this.long_g + (long) this.int_j) {
							break label72;
						}

						var4 = this.long_n + (long) this.int_s;
						if (var7 == 0) {
							break label72;
						}
					}

					var4 = this.long_g + (long) this.int_j;
				}

				label70:
				{
					if (this.long_n > this.long_g || this.long_g >= (long) this.int_s + this.long_n) {
						if (~this.long_g < ~this.long_n || (long) this.int_j + this.long_g <= this.long_n) {
							break label70;
						}

						var2 = this.long_n;
						if (var7 == 0) {
							break label70;
						}
					}

					var2 = this.long_g;
				}

				this.long_d += (long) this.int_j;
				if (this.long_d > this.long_h) {
					this.long_h = this.long_d;
				}

				if (var2 > -1L && ~var4 < ~var2) {
					int var6 = (int) (-var2 + var4);
					na.a(this.y, (int) (-this.long_g + var2), this.z, (int) (-this.long_n + var2), var6);
				}

				this.long_g = -1L;
				this.int_j = 0;
			}

			int var9 = -86 % ((var1 - 16) / 42);
		} catch (RuntimeException var8) {
			throw ec.a(var8, "hf.L(" + var1 + ')');
		}
	}

	hf(sa var1, int var2, int var3) throws IOException {
		try {
			this.B = var1;
			this.long_m = this.long_h = var1.a(-103);
			this.z = new byte[var2];
			this.y = new byte[var3];
			this.long_l = 0L;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "hf.<init>(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
}
