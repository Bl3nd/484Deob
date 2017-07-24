import java.awt.Component;
import java.io.DataInputStream;
import java.net.URL;

class ah {

	static int int_a;
	static int int_b;
	static int int_c;
	static byte[][][] bytes_d;
	static int int_e;
	static lf lf_f = dd.a("auf einer freien Welt zu spielen)3", 2);
	static bg bg_g;
	static int int_h;
	static int int_i = 0;
	static int[] ints_j = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
	static int int_k;
	static int int_l;
	static int int_m;
	static int int_n;
	private kc kc_o;
	static int int_p;
	int[] ints_q;
	private long long_r = nb.a(false);
	static int int_s;
	static int int_t;
	static int int_u;
	static int int_v;
	static int int_w = -1;
	static int x;
	private int y = 32;
	static int z;
	private int A = 0;
	private kc[] B = new kc[8];
	private int C = 0;
	private long E = 0L;
	private boolean F = true;
	int G;
	private int H;
	private int I = 0;
	int J;
	private int K = 0;
	private kc[] L = new kc[8];
	private long M = 0L;

	final void a(int var1) {
		try {
			this.F = true;
			++int_c;
			if (var1 != 8) {
				a((byte) 38, (int[][]) null);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ah.P(" + var1 + ')');
		}
	}

	int a() throws Exception {
		try {
			++int_l;
			return this.J;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ah.E(" + ')');
		}
	}

	void b(int var1) throws Exception {
		try {
			++int_a;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ah.J(" + var1 + ')');
		}
	}

	static final void a(String var0, int var1, Throwable var2) {
		int var6 = client.int_gc;

		try {
			if (var1 < -34) {
				++int_b;

				try {
					String var3 = "";
					if (var2 != null) {
						var3 = wg.a((byte) -113, var2);
					}

					if (var0 != null) {
						if (var2 != null) {
							var3 = var3 + " | ";
						}

						var3 = var3 + var0;
					}

					System.out.println("Error: " + var3);
					var3 = var3.replace(':', '.');
					var3 = var3.replace('@', '_');
					var3 = var3.replace('&', '_');
					var3 = var3.replace('#', '_');
					if (kh.Y.applet_n != null) {
						da var4 = kh.Y.a(new URL(kh.Y.applet_n.getCodeBase(), "clienterror.ws?c=" + ad.int_m + "&u=" + wa.Nb + "&v1=" + ke.string_h + "&v2=" + ke.string_m + "&e=" + var3), -896798992);
						if (var6 != 0) {
							fc.a(1L, -65);
						}

						while (~var4.int_a == -1) {
							fc.a(1L, -65);
						}

						if (var4.int_a == 1) {
							DataInputStream var5 = (DataInputStream) var4.object_c;
							var5.read();
							var5.close();
						}
					}
				} catch (Exception var7) {
					;
				}
			}
		} catch (RuntimeException var8) {
			throw var8;
		}
	}

	final synchronized void a(byte var1) {
		try {
			this.F = true;

			try {
				this.d();
			} catch (Exception var3) {
				this.b();
				this.M = 2000L + nb.a(false);
			}

			int var2 = -72 / ((var1 - 79) / 36);
			++x;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ah.C(" + var1 + ')');
		}
	}

	private void a(byte var1, kc var2, int var3) {
		try {
			++int_v;
			if (var1 <= -19) {
				int var4 = var3 >> 5;
				kc var5 = this.L[var4];
				if (var5 != null) {
					var5.kc_o = var2;
				} else {
					this.B[var4] = var2;
				}

				this.L[var4] = var2;
				var2.int_q = var3;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ah.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	void b() {
		try {
			++int_u;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ah.F(" + ')');
		}
	}

	final synchronized void c(int var1) {
		int var6 = client.int_gc;

		try {
			if (var1 == 1) {
				++z;
				if (this.ints_q != null) {
					long var2 = nb.a(false);

					try {
						if (this.M != 0L) {
							if (this.M > var2) {
								return;
							}

							this.b(this.J);
							this.F = true;
							this.M = 0L;
						}

						int var4 = this.a();
						if (this.I + -var4 > this.C) {
							this.C = this.I + -var4;
						}

						int var5 = this.G + this.H;
						if (256 + var5 > 16384) {
							var5 = 16128;
						}

						if (256 + var5 > this.J) {
							this.J += 1024;
							var4 = 0;
							if (this.J > 16384) {
								this.J = 16384;
							}

							this.b();
							this.b(this.J);
							if (~(var5 - -256) < ~this.J) {
								var5 = -256 + this.J;
								this.H = var5 + -this.G;
							}

							this.F = true;
						}

						while (var4 < var5) {
							this.a(this.ints_q, 256);
							this.c();
							var4 += 256;
						}

						if (this.E < var2) {
							if (this.F) {
								this.F = false;
							} else {
								if (this.C == 0 && this.K == 0) {
									this.b();
									this.M = var2 + 2000L;
									return;
								}

								this.H = Math.min(this.K, this.C);
								this.K = this.C;
							}

							this.E = 2000L + var2;
							this.C = 0;
						}

						this.I = var4;
					} catch (Exception var7) {
						this.b();
						this.M = var2 + 2000L;
					}

					try {
						if (this.long_r + 500000L < var2) {
							var2 = this.long_r;
							if (var6 != 0) {
								this.a(256, (byte) 110);
								this.long_r += (long) (256000 / cb.sampleRate);
							}
						}

						while (var2 > this.long_r + 5000L) {
							this.a(256, (byte) 110);
							this.long_r += (long) (256000 / cb.sampleRate);
						}

					} catch (Exception var8) {
						this.long_r = var2;
					}
				}
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "ah.I(" + var1 + ')');
		}
	}

	static final void a(byte var0, int[][] var1) {
		try {
			if (var0 <= 14) {
				lf_f = null;
			}

			++int_m;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ah.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public static void d(int var0) {
		try {
			ints_j = null;
			if (var0 != 16128) {
				a((String) null, -17, (Throwable) null);
			}

			bg_g = null;
			bytes_d = null;
			lf_f = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ah.K(" + var0 + ')');
		}
	}

	final synchronized void e(int var1) {
		int var4 = client.int_gc;

		try {
			++int_k;
			if (vg.Kc != null) {
				boolean var2 = true;
				int var3 = 0;
				if (var4 != 0 || var3 < 2) {
					do {
						if (vg.Kc.ahs_o[var3] == this) {
							vg.Kc.ahs_o[var3] = null;
						}

						if (vg.Kc.ahs_o[var3] != null) {
							var2 = false;
						}

						++var3;
					} while (var3 < 2);
				}

				if (var2) {
					vg.Kc.boolean_f = true;
					if (var4 != 0) {
						fc.a(50L, 69);
					}

					while (vg.Kc.boolean_c) {
						fc.a(50L, 69);
					}

					vg.Kc = null;
				}
			}

			if (var1 == 2) {
				this.b();
				this.ints_q = null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ah.L(" + var1 + ')');
		}
	}

	void c() throws Exception {
		try {
			++int_n;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ah.D(" + ')');
		}
	}

	private void a(int var1, byte var2) {
		try {
			++int_s;
			this.A -= var1;
			if (this.A < 0) {
				this.A = 0;
			}

			if (this.kc_o != null) {
				this.kc_o.a(var1);
			}

			int var3 = -99 / ((-39 - var2) / 39);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ah.A(" + var1 + ',' + var2 + ')');
		}
	}

	void d() throws Exception {
		try {
			++int_p;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ah.M(" + ')');
		}
	}

	void a(Component component) throws Exception {
		try {
			++int_h;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ah.N(" + (component != null ? "{...}" : "null") + ')');
		}
	}

	private void a(int[] var1, int var2) {
		int var3 = var2;
		if (sc.channel) {
			var3 = var2 << 1;
		}

		na.a(var1, 0, var3);
		this.A -= var2;
		if (this.kc_o != null && this.A <= 0) {
			this.A += cb.sampleRate >> 4;
			je.a(this.kc_o, true);
			this.a((byte) -46, this.kc_o, this.kc_o.a());
			int var4 = 0;
			int var5 = 255;

			int var7;
			label98:
			for (int var6 = 7; var5 != 0; --var6) {
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						kc var10 = null;
						kc var11 = this.B[var7];

						while (var11 != null) {
							cd var12 = var11.cd_p;
							if (var12 != null && var12.int_n > var8) {
								var5 |= 1 << var7;
								var10 = var11;
								var11 = var11.kc_o;
							} else {
								var11.boolean_n = true;
								int var13 = var11.d();
								var4 += var13;
								if (var12 != null) {
									var12.int_n += var13;
								}

								if (var4 >= this.y) {
									break label98;
								}

								kc var14 = var11.b();
								if (var14 != null) {
									for (int var15 = var11.int_q; var14 != null; var14 = var11.c()) {
										this.a((byte) -112, var14, var15 * var14.a() >> 8);
									}
								}

								kc var18 = var11.kc_o;
								var11.kc_o = null;
								if (var10 == null) {
									this.B[var7] = var18;
								} else {
									var10.kc_o = var18;
								}

								if (var18 == null) {
									this.L[var7] = var10;
								}

								var11 = var18;
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var7 = 0; var7 < 8; ++var7) {
				kc var16 = this.B[var7];

				kc var17;
				for (this.B[var7] = this.L[var7] = null; var16 != null; var16 = var17) {
					var17 = var16.kc_o;
					var16.kc_o = null;
				}
			}
		}

		if (this.A < 0) {
			this.A = 0;
		}

		if (this.kc_o != null) {
			this.kc_o.a(var1, 0, var2);
		}

		this.long_r = nb.a(false);
	}

	final synchronized void a(int dummy, kc var2) {
		try {
			this.kc_o = var2;
			if (dummy != -28922) {
				this.long_r = -60L;
			}

			++int_e;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ah.G(" + dummy + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void f(int var0) {
		int var9 = client.int_gc;

		try {
			++int_t;
			int var1 = -99 / ((-81 - var0) / 41);
			fi var2 = (fi) ma.eh_e.a((byte) 111);
			if (var9 != 0 || var2 != null) {
				do {
					int var3 = var2.int_n;
					if (ua.a(false, var3)) {
						boolean var4 = true;
						vg[] var5 = sc.vgs_db[var3];
						int var6 = 0;
						if (var9 != 0 || var6 < var5.length) {
							do {
								if (var5[var6] != null) {
									var4 = var5[var6].Bc;
									if (var9 == 0) {
										break;
									}
								}

								++var6;
							} while (var6 < var5.length);
						}

						if (!var4) {
							int var7 = (int) var2.long_e;
							vg var8 = ra.a(var7, (byte) 127);
							if (var8 != null) {
								mc.a(var8, -23101);
							}
						}
					}

					var2 = (fi) ma.eh_e.c(1);
				} while (var2 != null);

			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "ah.O(" + var0 + ')');
		}
	}
}
