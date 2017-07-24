final class lb {

	static int int_a;
	static int int_b;
	static rc rc_c;
	private int int_d;
	static int int_e = -2;
	static int int_f;
	int[][] ints_g;
	static int int_h;
	static int int_i;
	static int int_j;
	static int int_k;
	static int int_l;
	static int int_m;
	private int int_n;
	static int int_o;
	private static lf lf_p = dd.a("Loading interfaces )2 ", 2);
	static int int_q;
	static lf lf_r;
	static lf lf_s;
	private int int_t;
	private static lf lf_u = dd.a("Malformed login packet)3", 2);
	private int int_v;
	static lf lf_w;
	static int x;
	static int y;
	static int z;
	private static lf A;
	static int B;
	static lf C;
	static ja D;
	static int E;
	static int F;
	static lf G;

	final void a(boolean var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
		int var11 = client.int_gc;

		try {
			var7 -= this.int_t;
			++z;
			if (!var1) {
				a((ja) null, -82, -105);
			}

			var4 -= this.int_v;
			int var8 = 256;
			int var9;
			if (var2 == 1 || var2 == 3) {
				var9 = var3;
				var3 = var5;
				var5 = var9;
			}

			if (var6) {
				var8 += 131072;
			}

			var9 = var7;
			if (var11 != 0 || ~var7 > ~(var7 + var3)) {
				do {
					if (var9 >= 0 && ~this.int_d < ~var9) {
						int var10 = var4;
						if (var11 != 0 || var4 < var4 + var5) {
							do {
								if (~var10 <= -1 && ~this.int_n < ~var10) {
									this.b(var8, var10, -23178, var9);
								}

								++var10;
							} while (var10 < var4 + var5);
						}
					}

					++var9;
				} while (~var9 > ~(var7 + var3));

			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "lb.E(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			++B;
			if (var5 == var2 && var6 == var3) {
				return true;
			} else {
				var2 -= this.int_t;
				var6 -= this.int_v;
				var3 -= this.int_v;
				if (var1 != 32) {
					this.a(-29, -85, -54, -66, 66, (byte) -22, 46, -28);
				}

				var5 -= this.int_t;
				if (~var4 == -7 || ~var4 == -8) {
					if (~var4 == -8) {
						var7 = var7 + 2 & 3;
					}

					if (var7 == 0) {
						if (var5 + 1 == var2 && var6 == var3 && (128 & this.ints_g[var2][var6]) == 0) {
							return true;
						}

						if (var2 == var5 && var6 == var3 - 1 && (2 & this.ints_g[var2][var6]) == 0) {
							return true;
						}
					} else if (var7 == 1) {
						if (-1 + var5 == var2 && var6 == var3 && (this.ints_g[var2][var6] & 8) == 0) {
							return true;
						}

						if (var5 == var2 && var3 + -1 == var6 && ~(2 & this.ints_g[var2][var6]) == -1) {
							return true;
						}
					} else if (var7 != 2) {
						if (~var7 == -4) {
							if (var2 == var5 - -1 && ~var6 == ~var3 && ~(this.ints_g[var2][var6] & 128) == -1) {
								return true;
							}

							if (var5 == var2 && var6 == var3 + 1 && ~(32 & this.ints_g[var2][var6]) == -1) {
								return true;
							}
						}
					} else {
						if (var2 == var5 + -1 && var3 == var6 && (this.ints_g[var2][var6] & 8) == 0) {
							return true;
						}

						if (var5 == var2 && 1 + var3 == var6 && ~(this.ints_g[var2][var6] & 32) == -1) {
							return true;
						}
					}
				}

				if (var4 == 8) {
					if (~var2 == ~var5 && ~var6 == ~(1 + var3) && ~(32 & this.ints_g[var2][var6]) == -1) {
						return true;
					}

					if (var2 == var5 && var6 == -1 + var3 && (this.ints_g[var2][var6] & 2) == 0) {
						return true;
					}

					if (var2 == -1 + var5 && ~var6 == ~var3 && (this.ints_g[var2][var6] & 8) == 0) {
						return true;
					}

					if (~(var5 + 1) == ~var2 && var6 == var3 && ~(128 & this.ints_g[var2][var6]) == -1) {
						return true;
					}
				}

				return false;
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "lb.O(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	final void a(boolean var1) {
		try {
			int x = 0;
			if (this.int_d <= x) {
				++y;
				if (!var1) {
					this.int_d = -127;
				}
			} else {
				do {
					int y = 0;
					if (y >= this.int_n) {
						++x;
					} else {
						do {
							if (x != 0 && y != 0 && x < this.int_d + -5 && y < -5 + this.int_n) {
								this.ints_g[x][y] = 16777216;
							} else {
								this.ints_g[x][y] = 16777215;
							}

							++y;
						} while (y < this.int_n);

						++x;
					}
				} while (x < this.int_d);

				++y;
				if (!var1) {
					this.int_d = -127;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lb.D(" + var1 + ')');
		}
	}

	final void a(int var1, int var2, boolean var3, boolean var4, int var5, int var6) {
		int var10 = client.int_gc;

		try {
			++int_o;
			var5 -= this.int_v;
			int var7 = 256;
			if (var4) {
				var7 += 131072;
			}

			var1 -= this.int_t;
			int var8 = var1;
			if (var3) {
				for (; var8 < var1 - -var2; ++var8) {
					if (~var8 <= -1 && ~this.int_d < ~var8) {
						int var9 = var5;
						if (var10 != 0 || var5 < var5 - -var6) {
							do {
								if (var9 >= 0 && ~this.int_n < ~var9) {
									this.a(var8, var7, -31133, var9);
								}

								++var9;
							} while (var9 < var5 - -var6);
						}
					}
				}

			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "lb.C(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			lf_p = null;
			rc_c = null;
			lf_r = null;
			A = null;
			G = null;
			lf_w = null;
			lf_s = null;
			lf_u = null;
			C = null;
			if (var0) {
				C = null;
			}

			D = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lb.J(" + var0 + ')');
		}
	}

	static final void a(long var0, int var2) {
		int var5 = client.int_gc;

		try {
			++int_k;
			if (var0 != 0L) {
				if (var2 != 1) {
					a(42L, -95);
				}

				int var3;
				label36:
				{
					var3 = 0;
					if (var5 != 0) {
						if (var0 == lf.C[var3]) {
							break label36;
						}

						++var3;
					}

					while (true) {
						if (~vf.int_t >= ~var3) {
							return;
						}

						if (var0 == lf.C[var3]) {
							break;
						}

						++var3;
					}
				}

				--vf.int_t;
				int var4 = var3;
				if (var5 == 0 && var3 >= vf.int_t) {
					++cb.int_v;
					ld.int_db = hf.int_p;
					vg.J.e((byte) 113, 238);
					vg.J.a(var0, -562765672);
				} else {
					do {
						mb.y[var4] = mb.y[var4 + 1];
						jh.ints_t[var4] = jh.ints_t[1 + var4];
						lf.C[var4] = lf.C[1 + var4];
						pc.ints_c[var4] = pc.ints_c[1 + var4];
						++var4;
					} while (var4 < vf.int_t);

					++cb.int_v;
					ld.int_db = hf.int_p;
					vg.J.e((byte) 113, 238);
					vg.J.a(var0, -562765672);
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lb.L(" + var0 + ',' + var2 + ')');
		}
	}

	private final void a(int var1, int var2, int var3, int var4) {
		try {
			if (var3 != -31133) {
				this.b(22, 71, (byte) -52);
			}

			++x;
			this.ints_g[var1][var4] = d.c(this.ints_g[var1][var4], var2);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lb.A(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final void a(int var1, boolean var2, int var3, int var4, int var5, int var6) {
		try {
			++int_b;
			var6 -= this.int_v;
			var1 -= this.int_t;
			if (var5 == 0) {
				if (~var3 == -1) {
					this.a(var1, 128, var4 ^ 31132, var6);
					this.a(-1 + var1, 8, -31133, var6);
				}

				if (~var3 == -2) {
					this.a(var1, 2, -31133, var6);
					this.a(var1, 32, -31133, 1 + var6);
				}

				if (~var3 == -3) {
					this.a(var1, 8, -31133, var6);
					this.a(var1 + 1, 128, -31133, var6);
				}

				if (~var3 == -4) {
					this.a(var1, 32, -31133, var6);
					this.a(var1, 2, -31133, var6 - 1);
				}
			}

			if (~var5 == -2 || var5 == 3) {
				if (var3 == 0) {
					this.a(var1, 1, -31133, var6);
					this.a(-1 + var1, 16, -31133, var6 + 1);
				}

				if (~var3 == -2) {
					this.a(var1, 4, -31133, var6);
					this.a(var1 + 1, 64, -31133, var6 - -1);
				}

				if (var3 == 2) {
					this.a(var1, 16, -31133, var6);
					this.a(var1 - -1, 1, var4 + -31132, var6 + -1);
				}

				if (var3 == 3) {
					this.a(var1, 64, var4 + -31132, var6);
					this.a(var1 - 1, 4, -31133, var6 - 1);
				}
			}

			if (var4 != -1) {
				this.a(108, -28, (int) 116);
			}

			if (~var5 == -3) {
				if (var3 == 0) {
					this.a(var1, 130, -31133, var6);
					this.a(var1 - 1, 8, -31133, var6);
					this.a(var1, 32, -31133, var6 + 1);
				}

				if (~var3 == -2) {
					this.a(var1, 10, -31133, var6);
					this.a(var1, 32, var4 ^ 31132, 1 + var6);
					this.a(var1 - -1, 128, -31133, var6);
				}

				if (~var3 == -3) {
					this.a(var1, 40, -31133, var6);
					this.a(var1 + 1, 128, -31133, var6);
					this.a(var1, 2, var4 ^ 31132, -1 + var6);
				}

				if (~var3 == -4) {
					this.a(var1, 160, var4 + -31132, var6);
					this.a(var1, 2, -31133, -1 + var6);
					this.a(-1 + var1, 8, -31133, var6);
				}
			}

			if (var2) {
				if (~var5 == -1) {
					if (var3 == 0) {
						this.a(var1, 65536, -31133, var6);
						this.a(var1 + -1, 4096, -31133, var6);
					}

					if (var3 == 1) {
						this.a(var1, 1024, -31133, var6);
						this.a(var1, 16384, -31133, var6 - -1);
					}

					if (var3 == 2) {
						this.a(var1, 4096, -31133, var6);
						this.a(var1 + 1, 65536, var4 + -31132, var6);
					}

					if (~var3 == -4) {
						this.a(var1, 16384, -31133, var6);
						this.a(var1, 1024, var4 + -31132, var6 - 1);
					}
				}

				if (~var5 == -2 || var5 == 3) {
					if (var3 == 0) {
						this.a(var1, 512, -31133, var6);
						this.a(-1 + var1, 8192, var4 ^ 31132, 1 + var6);
					}

					if (~var3 == -2) {
						this.a(var1, 2048, var4 ^ 31132, var6);
						this.a(1 + var1, '耀', var4 ^ 31132, var6 + 1);
					}

					if (~var3 == -3) {
						this.a(var1, 8192, -31133, var6);
						this.a(1 + var1, 512, -31133, -1 + var6);
					}

					if (var3 == 3) {
						this.a(var1, '耀', var4 + -31132, var6);
						this.a(-1 + var1, 2048, -31133, -1 + var6);
					}
				}

				if (~var5 == -3) {
					if (~var3 == -1) {
						this.a(var1, 66560, -31133, var6);
						this.a(-1 + var1, 4096, var4 + -31132, var6);
						this.a(var1, 16384, var4 + -31132, 1 + var6);
					}

					if (var3 == 1) {
						this.a(var1, 5120, var4 + -31132, var6);
						this.a(var1, 16384, -31133, var6 + 1);
						this.a(var1 - -1, 65536, -31133, var6);
					}

					if (var3 == 2) {
						this.a(var1, 20480, -31133, var6);
						this.a(var1 - -1, 65536, -31133, var6);
						this.a(var1, 1024, -31133, var6 - 1);
					}

					if (~var3 == -4) {
						this.a(var1, 81920, var4 + -31132, var6);
						this.a(var1, 1024, var4 ^ 31132, -1 + var6);
						this.a(-1 + var1, 4096, var4 + -31132, var6);
						return;
					}
				}
			}

		} catch (RuntimeException var8) {
			throw ec.a(var8, "lb.N(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	final void a(int var1, int var2, byte var3) {
		try {
			++int_m;
			var1 -= this.int_v;
			var2 -= this.int_t;
			if (var3 != 123) {
				a((ja) null, -84, 79);
			}

			this.ints_g[var2][var1] = d.c(this.ints_g[var2][var1], 262144);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lb.K(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a(int var1, int var2, int var3) {
		try {
			var3 -= this.int_v;
			var2 -= this.int_t;
			this.ints_g[var2][var3] = d.c(this.ints_g[var2][var3], var1);
			++int_f;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lb.H(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a(boolean var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			var3 -= this.int_t;
			var2 -= this.int_v;
			if (var5 == 0) {
				if (~var4 == -1) {
					this.b(128, var2, -23178, var3);
					this.b(8, var2, -23178, var3 - 1);
				}

				if (~var4 == -2) {
					this.b(2, var2, -23178, var3);
					this.b(32, 1 + var2, -23178, var3);
				}

				if (~var4 == -3) {
					this.b(8, var2, -23178, var3);
					this.b(128, var2, -23178, var3 + 1);
				}

				if (var4 == 3) {
					this.b(32, var2, -23178, var3);
					this.b(2, -1 + var2, -23178, var3);
				}
			}

			++int_l;
			if (~var5 == -2 || var5 == 3) {
				if (var4 == 0) {
					this.b(1, var2, -23178, var3);
					this.b(16, var2 - -1, -23178, var3 + -1);
				}

				if (~var4 == -2) {
					this.b(4, var2, -23178, var3);
					this.b(64, 1 + var2, -23178, 1 + var3);
				}

				if (~var4 == -3) {
					this.b(16, var2, -23178, var3);
					this.b(1, var2 + -1, -23178, 1 + var3);
				}

				if (var4 == 3) {
					this.b(64, var2, -23178, var3);
					this.b(4, var2 - 1, -23178, var3 - 1);
				}
			}

			if (var6 < 68) {
				this.a(90, true, -17, 91, 46, 106);
			}

			if (var5 == 2) {
				if (~var4 == -1) {
					this.b(130, var2, -23178, var3);
					this.b(8, var2, -23178, var3 - 1);
					this.b(32, var2 - -1, -23178, var3);
				}

				if (var4 == 1) {
					this.b(10, var2, -23178, var3);
					this.b(32, 1 + var2, -23178, var3);
					this.b(128, var2, -23178, var3 - -1);
				}

				if (~var4 == -3) {
					this.b(40, var2, -23178, var3);
					this.b(128, var2, -23178, var3 + 1);
					this.b(2, var2 + -1, -23178, var3);
				}

				if (~var4 == -4) {
					this.b(160, var2, -23178, var3);
					this.b(2, var2 - 1, -23178, var3);
					this.b(8, var2, -23178, var3 - 1);
				}
			}

			if (var1) {
				if (var5 == 0) {
					if (var4 == 0) {
						this.b(65536, var2, -23178, var3);
						this.b(4096, var2, -23178, var3 - 1);
					}

					if (~var4 == -2) {
						this.b(1024, var2, -23178, var3);
						this.b(16384, var2 + 1, -23178, var3);
					}

					if (~var4 == -3) {
						this.b(4096, var2, -23178, var3);
						this.b(65536, var2, -23178, 1 + var3);
					}

					if (~var4 == -4) {
						this.b(16384, var2, -23178, var3);
						this.b(1024, var2 + -1, -23178, var3);
					}
				}

				if (~var5 == -2 || var5 == 3) {
					if (var4 == 0) {
						this.b(512, var2, -23178, var3);
						this.b(8192, 1 + var2, -23178, -1 + var3);
					}

					if (var4 == 1) {
						this.b(2048, var2, -23178, var3);
						this.b('耀', var2 - -1, -23178, var3 - -1);
					}

					if (var4 == 2) {
						this.b(8192, var2, -23178, var3);
						this.b(512, -1 + var2, -23178, 1 + var3);
					}

					if (~var4 == -4) {
						this.b('耀', var2, -23178, var3);
						this.b(2048, var2 + -1, -23178, -1 + var3);
					}
				}

				if (~var5 == -3) {
					if (~var4 == -1) {
						this.b(66560, var2, -23178, var3);
						this.b(4096, var2, -23178, var3 - 1);
						this.b(16384, var2 - -1, -23178, var3);
					}

					if (~var4 == -2) {
						this.b(5120, var2, -23178, var3);
						this.b(16384, 1 + var2, -23178, var3);
						this.b(65536, var2, -23178, 1 + var3);
					}

					if (~var4 == -3) {
						this.b(20480, var2, -23178, var3);
						this.b(65536, var2, -23178, 1 + var3);
						this.b(1024, var2 + -1, -23178, var3);
					}

					if (var4 == 3) {
						this.b(81920, var2, -23178, var3);
						this.b(1024, -1 + var2, -23178, var3);
						this.b(4096, var2, -23178, var3 - 1);
						return;
					}
				}
			}

		} catch (RuntimeException var8) {
			throw ec.a(var8, "lb.G(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	static final lf a(ja var0, int var1, int var2) {
		try {
			++int_a;

			try {
				lf var3 = new lf();
				var3.S = var0.f(var1 ^ var1);
				if (var2 < var3.S) {
					var3.S = var2;
				}

				var3.Y = new byte[var3.S];
				var0.P += bh.ad_fb.a(var3.Y, var0.P, var3.S, var0.yb, 0, 4581);
				return var3;
			} catch (Exception var4) {
				return fh.lf_b;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lb.I(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	lb(int x, int y) {
		try {
			this.int_t = 0;
			this.int_n = y;
			this.int_v = 0;
			this.int_d = x;
			this.ints_g = new int[this.int_d][this.int_n];
			this.a(true);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "lb.<init>(" + x + ',' + y + ')');
		}
	}

	private final void b(int var1, int var2, int var3, int var4) {
		try {
			if (var3 != -23178) {
				this.b(-116, -56, 127, 86);
			}

			++int_q;
			this.ints_g[var4][var2] = sd.a(this.ints_g[var4][var2], ~var1);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lb.M(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final boolean a(int var1, int var2, int var3, int var4, int var5, byte var6, int var7, int var8) {
		try {
			int var9 = var1 + (var2 - 1);
			++int_j;
			int var10 = var5 + var7 + -1;
			return ~var2 >= ~var8 && ~var8 >= ~var9 && ~var3 <= ~var7 && var3 <= var10 ? true : (var8 == var2 + -1 && var3 >= var7 && var3 <= var10 && ~(8 & this.ints_g[-this.int_t + var8][var3 + -this.int_v]) == -1 && ~(8 & var4) == -1 ? true : (~(var9 - -1) == ~var8 && var3 >= var7 && ~var10 <= ~var3 && ~(this.ints_g[var8 + -this.int_t][var3 - this.int_v] & 128) == -1 && ~(var4 & 2) == -1 ? true : (-1 + var7 == var3 && ~var8 <= ~var2 && var8 <= var9 && (2 & this.ints_g[-this.int_t + var8][-this.int_v + var3]) == 0 && ~(var4 & 4) == -1 ? true : (var3 == var10 - -1 && var2 <= var8 && var8 <= var9 && (this.ints_g[var8 + -this.int_t][-this.int_v + var3] & 32) == 0 && ~(var4 & 1) == -1 ? true : var6 <= 106))));
		} catch (RuntimeException var11) {
			throw ec.a(var11, "lb.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
		}
	}

	final void b(int var1, int var2, byte var3) {
		try {
			if (var3 > -25) {
				this.a(21, 106, -84, 30, -92, (byte) 46, -32, -82);
			}

			var2 -= this.int_t;
			++int_i;
			var1 -= this.int_v;
			this.ints_g[var2][var1] = sd.a(this.ints_g[var2][var1], -262145);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lb.P(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final boolean a(int var1, int var2, byte var3, int var4, int var5, int var6, int var7) {
		try {
			++int_h;
			if (var5 == var1 && var2 == var6) {
				return true;
			} else {
				var5 -= this.int_t;
				var1 -= this.int_t;
				var6 -= this.int_v;
				var2 -= this.int_v;
				if (~var4 == -1) {
					if (~var7 == -1) {
						if (var1 == -1 + var5 && var2 == var6) {
							return true;
						}

						if (var1 == var5 && 1 + var2 == var6 && (19661088 & this.ints_g[var1][var6]) == 0) {
							return true;
						}

						if (var5 == var1 && var6 == -1 + var2 && ~(19661058 & this.ints_g[var1][var6]) == -1) {
							return true;
						}
					} else if (var7 == 1) {
						if (var1 == var5 && var2 + 1 == var6) {
							return true;
						}

						if (~(var5 + -1) == ~var1 && var6 == var2 && (19661064 & this.ints_g[var1][var6]) == 0) {
							return true;
						}

						if (~var1 == ~(1 + var5) && ~var2 == ~var6 && (this.ints_g[var1][var6] & 19661184) == 0) {
							return true;
						}
					} else if (var7 != 2) {
						if (~var7 == -4) {
							if (~var1 == ~var5 && ~var6 == ~(var2 + -1)) {
								return true;
							}

							if (var1 == -1 + var5 && ~var6 == ~var2 && ~(19661064 & this.ints_g[var1][var6]) == -1) {
								return true;
							}

							if (1 + var5 == var1 && var2 == var6 && ~(this.ints_g[var1][var6] & 19661184) == -1) {
								return true;
							}
						}
					} else {
						if (~var1 == ~(1 + var5) && ~var2 == ~var6) {
							return true;
						}

						if (var5 == var1 && var6 == var2 + 1 && (19661088 & this.ints_g[var1][var6]) == 0) {
							return true;
						}

						if (var1 == var5 && var6 == -1 + var2 && (this.ints_g[var1][var6] & 19661058) == 0) {
							return true;
						}
					}
				}

				if (~var4 == -3) {
					if (~var7 != -1) {
						if (~var7 == -2) {
							if (~var1 == ~(-1 + var5) && ~var2 == ~var6 && (19661064 & this.ints_g[var1][var6]) == 0) {
								return true;
							}

							if (~var5 == ~var1 && ~(1 + var2) == ~var6) {
								return true;
							}

							if (1 + var5 == var1 && ~var2 == ~var6) {
								return true;
							}

							if (~var1 == ~var5 && -1 + var2 == var6 && (19661058 & this.ints_g[var1][var6]) == 0) {
								return true;
							}
						} else if (~var7 == -3) {
							if (var5 + -1 == var1 && ~var6 == ~var2 && (19661064 & this.ints_g[var1][var6]) == 0) {
								return true;
							}

							if (var1 == var5 && ~(1 + var2) == ~var6 && ~(19661088 & this.ints_g[var1][var6]) == -1) {
								return true;
							}

							if (var1 == 1 + var5 && ~var6 == ~var2) {
								return true;
							}

							if (~var5 == ~var1 && ~var6 == ~(-1 + var2)) {
								return true;
							}
						} else if (var7 == 3) {
							if (~var1 == ~(var5 + -1) && var6 == var2) {
								return true;
							}

							if (~var1 == ~var5 && ~var6 == ~(1 + var2) && ~(19661088 & this.ints_g[var1][var6]) == -1) {
								return true;
							}

							if (1 + var5 == var1 && ~var2 == ~var6 && (19661184 & this.ints_g[var1][var6]) == 0) {
								return true;
							}

							if (var5 == var1 && var2 + -1 == var6) {
								return true;
							}
						}
					} else {
						if (-1 + var5 == var1 && var6 == var2) {
							return true;
						}

						if (var1 == var5 && var2 - -1 == var6) {
							return true;
						}

						if (var1 == 1 + var5 && var2 == var6 && ~(19661184 & this.ints_g[var1][var6]) == -1) {
							return true;
						}

						if (var5 == var1 && -1 + var2 == var6 && ~(this.ints_g[var1][var6] & 19661058) == -1) {
							return true;
						}
					}
				}

				if (var3 < 28) {
					this.a(80, -64, false, false, 71, -20);
				}

				if (~var4 == -10) {
					if (var5 == var1 && ~var6 == ~(var2 - -1) && ~(32 & this.ints_g[var1][var6]) == -1) {
						return true;
					}

					if (~var1 == ~var5 && ~var6 == ~(-1 + var2) && ~(this.ints_g[var1][var6] & 2) == -1) {
						return true;
					}

					if (~var1 == ~(var5 - 1) && ~var2 == ~var6 && ~(this.ints_g[var1][var6] & 8) == -1) {
						return true;
					}

					if (var1 == var5 - -1 && ~var2 == ~var6 && (128 & this.ints_g[var1][var6]) == 0) {
						return true;
					}
				}

				return false;
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "lb.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	static {
		lf_w = lf_u;
		lf_r = lf_p;
		A = dd.a("Too many connections from your address)3", 2);
		lf_s = A;
		rc_c = new rc(64);
		C = dd.a(")1j", 2);
		D = new ja(8);
		F = 0;
		G = dd.a("Spieler", 2);
	}
}
