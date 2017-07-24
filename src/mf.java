final class mf extends kc {

	private sh sh_r;
	static int int_s;
	static kf[] kfs_t = new kf[1000];
	static int int_u;
	static int int_v;
	tf tf_w = new tf();
	static int x;
	static long y = 0L;
	static int z;
	static ja A;
	static int B;
	static int C;
	static int D;
	static int E;
	static ib F;
	static int G;
	t H = new t();

	final int d() {
		try {
			++int_s;
			return 0;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "mf.E(" + ')');
		}
	}

	private final void a(byte var1, int var2, vf var3) {
		try {
			++E;
			if (~(4 & this.sh_r.ints_lb[var3.Q]) != -1 && ~var3.int_p > -1) {
				int var4 = this.sh_r.S[var3.Q] / cb.sampleRate;
				int var5 = (-var3.K + var4 + 1048575) / var4;
				var3.K = var2 * var4 + var3.K & 1048575;
				if (var5 <= var2) {
					label48:
					{
						if (this.sh_r.ints_r[var3.Q] == 0) {
							var3.z = jb.a(var3.G, var3.z.e(), var3.z.j(), var3.z.i());
							if (client.int_gc == 0) {
								break label48;
							}
						}

						var3.z = jb.a(var3.G, var3.z.e(), 0, var3.z.i());
						this.sh_r.a(var3, ~var3.N.shorts_n[var3.V] > -1, -4123);
					}

					if (~var3.N.shorts_n[var3.V] > -1) {
						var3.z.b(-1);
					}

					var2 = var3.K / var4;
				}
			}

			if (var1 <= 56) {
				this.H = null;
			}

			var3.z.a(var2);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "mf.I(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final kc c() {
		try {
			++x;

			vf var1;
			do {
				var1 = (vf) this.tf_w.d(-1);
				if (var1 == null) {
					return null;
				}
			} while (var1.z == null);

			return var1.z;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "mf.B(" + ')');
		}
	}

	private final void a(int var1, int[] var2, vf var3, int var4, int var5, int var6) {
		int var12 = client.int_gc;

		try {
			if (~(this.sh_r.ints_lb[var3.Q] & 4) != -1 && var3.int_p < 0) {
				int var7 = this.sh_r.S[var3.Q] / cb.sampleRate;

				while (true) {
					int var8 = (-var3.K + 1048575 + var7) / var7;
					if (~var8 < ~var1) {
						break;
					}

					var3.z.a(var2, var4, var8);
					int var9 = cb.sampleRate / 100;
					var1 -= var8;
					jb var11 = var3.z;
					var3.K += var8 * var7 - 1048576;
					int var10 = 262144 / var7;
					var4 += var8;
					if (~var10 > ~var9) {
						var9 = var10;
					}

					label71:
					{
						if (this.sh_r.ints_r[var3.Q] == 0) {
							var3.z = jb.a(var3.G, var11.e(), var11.j(), var11.i());
							if (var12 == 0) {
								break label71;
							}
						}

						var3.z = jb.a(var3.G, var11.e(), 0, var11.i());
						this.sh_r.a(var3, var3.N.shorts_n[var3.V] < 0, -4123);
						var3.z.b(var9, var11.j());
					}

					if (~var3.N.shorts_n[var3.V] > -1) {
						var3.z.b(-1);
					}

					var11.g(var9);
					var11.a(var2, var4, -var4 + var6);
					if (var11.g()) {
						this.H.a((kc) var11);
						if (var12 != 0) {
							break;
						}
					}
				}

				var3.K += var1 * var7;
			}

			++B;
			var3.z.a(var2, var4, var1);
			if (var5 != 813) {
				this.H = null;
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "mf.J(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	public static void b(int var0) {
		try {
			if (var0 != -1) {
				C = 77;
			}

			A = null;
			F = null;
			kfs_t = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "mf.H(" + var0 + ')');
		}
	}

	final kc b() {
		try {
			++G;
			vf var1 = (vf) this.tf_w.c(51);
			return (kc) (var1 == null ? null : (var1.z != null ? var1.z : this.c()));
		} catch (RuntimeException var2) {
			throw ec.a(var2, "mf.F(" + ')');
		}
	}

	final void a(int var1) {
		int var4 = client.int_gc;

		try {
			this.H.a(var1);
			++D;
			vf var3 = (vf) this.tf_w.c(126);
			if (var4 != 0 || var3 != null) {
				do {
					if (!this.sh_r.b((byte) 117, var3)) {
						int var2 = var1;
						if (var4 == 0 && ~var1 >= ~var3.S) {
							this.a((byte) 81, var1, var3);
							var3.S -= var1;
						} else {
							while (true) {
								this.a((byte) 108, var3.S, var3);
								var2 -= var3.S;
								if (this.sh_r.a(0, (int[]) null, var2, var3, 103) && var4 == 0) {
									break;
								}

								if (~var2 >= ~var3.S) {
									this.a((byte) 81, var2, var3);
									var3.S -= var2;
									break;
								}
							}
						}
					}

					var3 = (vf) this.tf_w.d(-1);
				} while (var3 != null);

			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "mf.A(" + var1 + ')');
		}
	}

	static final int a(int var0, int var1, int var2) {
		try {
			++z;
			if (var2 == -1) {
				return 12345678;
			} else {
				var0 = (127 & var2) * var0 >> 103095527;
				if (var0 < 2) {
					var0 = 2;
					if (client.int_gc == 0) {
						return var1 != -14538 ? -76 : (var2 & 'ﾀ') + var0;
					}
				}

				if (var0 > 126) {
					var0 = 126;
				}

				return var1 != -14538 ? -76 : (var2 & 'ﾀ') + var0;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "mf.K(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	final void a(int[] var1, int var2, int var3) {
		int var7 = client.int_gc;

		try {
			this.H.a(var1, var2, var3);
			vf var6 = (vf) this.tf_w.c(42);
			if (var7 == 0 && var6 == null) {
				++int_v;
			} else {
				do {
					if (!this.sh_r.b((byte) 127, var6)) {
						int var5 = var3;
						int var4 = var2;
						if (var7 == 0 && ~var6.S <= ~var3) {
							this.a(var3, var1, var6, var2, 813, var3 + var2);
							var6.S -= var3;
						} else {
							while (true) {
								this.a(var6.S, var1, var6, var4, 813, var4 - -var5);
								var5 -= var6.S;
								var4 += var6.S;
								if (this.sh_r.a(var4, var1, var5, var6, 103) && var7 == 0) {
									break;
								}

								if (~var6.S <= ~var5) {
									this.a(var5, var1, var6, var4, 813, var5 + var4);
									var6.S -= var5;
									break;
								}
							}
						}
					}

					var6 = (vf) this.tf_w.d(-1);
				} while (var6 != null);

				++int_v;
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "mf.G(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	mf(sh var1) {
		try {
			this.sh_r = var1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mf.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
}
