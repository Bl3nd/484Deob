abstract class bg {

	static lf lf_a;
	private boolean boolean_b;
	static int int_c;
	private static lf lf_d = dd.a("Too many incorrect logins from your address)3", 2);
	private int[] ints_e;
	private ig ig_f;
	static int int_g;
	static int int_h;
	static int int_i;
	int[] ints_j;
	static int int_k;
	static int int_l;
	private ig[] igs_m;
	private Object[][] objects_n;
	static int int_o;
	static int int_p;
	static int int_q;
	private int int_r;
	static int int_s;
	static int[] ints_t = new int[25];
	static int int_u;
	static int int_v;
	static lf lf_w;
	static int x;
	static ob[] y = new ob[6];
	static int z;
	int[] A;
	int[] B;
	int C;
	private int[] D;
	static int E;
	static int F;
	static int G;
	static int H;
	private int[][] I;
	static int J;
	private boolean K;
	static int L;
	static int M;
	Object[] N;
	static int O;
	static int P;
	static int Q;
	static int R;
	static int S;
	static int T;
	static int U;
	static int V;
	static int W;
	static int X;
	private int[][] Y;
	static int Z;

	final byte[] a(int var1, int cacheID, int fileID) {
		try {
			++J;
			if (var1 != 0) {
				this.a(-81, null, -58, -65);
			}

			return this.a(46, null, fileID, cacheID);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "bg.D(" + var1 + ',' + cacheID + ',' + fileID + ')');
		}
	}

	final byte[] b(int var1, int var2, int var3) {
		try {
			++z;
			if (~var3 <= -1 && this.objects_n.length > var3 && this.objects_n[var3] != null && ~var1 <= -1 && this.objects_n[var3].length > var1) {
				if (this.objects_n[var3][var1] == null) {
					boolean var4 = this.a(null, 0, var3);
					if (!var4) {
						this.a(var3, 120);
						var4 = this.a(null, 0, var3);
						if (!var4) {
							return null;
						}
					}
				}

				if (var2 < 25) {
					return null;
				} else {
					byte[] var6 = cf.a(false, this.objects_n[var3][var1], (byte) 87);
					return var6;
				}
			} else {
				return null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "bg.P(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final int[] a(byte var1, int var2) {
		int var5 = client.int_gc;

		try {
			++int_q;
			int[] var3 = this.Y[var2];
			if (var1 <= 76) {
				this.ig_f = null;
			}

			if (var3 == null) {
				var3 = new int[this.A[var2]];
				int var4 = 0;
				if (var5 != 0) {
					var3[var4] = var4++;
				}

				while (~var3.length < ~var4) {
					var3[var4] = var4++;
				}
			}

			return var3;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bg.O(" + var1 + ',' + var2 + ')');
		}
	}

	static void a(boolean var0, bg var1) {
		try {
			bd.bg_l = var1;
			++int_u;
			if (var0) {
				ints_t = null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "bg.W(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final int a(byte var1, lf class_lf) {
		try {
			++int_c;
			class_lf = class_lf.b(-10180);
			if (var1 != 106) {
				this.A = null;
			}

			return this.ig_f.a((byte) -38, class_lf.h(-105));
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.EA(" + var1 + ',' + (class_lf != null ? "{...}" : "null") + ')');
		}
	}

	void a(int var1, int var2) {
		try {
			int var3 = 61 / ((-16 - var2) / 49);
			++M;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.DA(" + var1 + ',' + var2 + ')');
		}
	}

	static boolean b(int var0, int var1) {
		try {
			if (var1 != 16908) {
				return false;
			} else {
				++L;
				return (var0 & 1426948785) >> 564900062 != 0;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "bg.AA(" + var0 + ',' + var1 + ')');
		}
	}

	final int a(byte dummy, lf class_lf, int fileID) {
		try {
			++Z;
			class_lf = class_lf.b(-10180);
			if (dummy >= -22) {
				this.a(51, null, 65, 117);
			}

			return this.igs_m[fileID].a((byte) -38, class_lf.h(-103));
		} catch (RuntimeException var5) {
			throw ec.a(var5, "bg.M(" + dummy + ',' + (class_lf != null ? "{...}" : "null") + ',' + fileID + ')');
		}
	}

	static long c(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		return var3 != null && var3.H != null ? var3.H.long_h : 0L;
	}

	final byte[] a(int var1, lf class_lf, lf fileName) {
		try {
			fileName = fileName.b(-10180);
			class_lf = class_lf.b(-10180);
			++x;
			int fileID = this.ig_f.a((byte) -38, fileName.h(-125));
			if (var1 <= 76) {
				this.K = true;
			}

			int cacheID = this.igs_m[fileID].a((byte) -38, class_lf.h(-60));
			return this.a(0, cacheID, fileID);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bg.H(" + var1 + ',' + (class_lf != null ? "{...}" : "null") + ',' + (fileName != null ? "{...}" : "null") + ')');
		}
	}

	void a(int var1, byte var2) {
		try {
			if (var2 >= -32) {
				this.objects_n = null;
			}

			++int_v;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.K(" + var1 + ',' + var2 + ')');
		}
	}

	private final boolean a(int[] keys, int var2, int fileID) {
		int dummy = client.int_gc;

		try {
			++int_g;
			if (this.N[fileID] == null) {
				return false;
			} else {
				int[] var5 = this.Y[fileID];
				int var4 = this.A[fileID];
				Object[] var6 = this.objects_n[fileID];
				boolean var7 = true;
				int var8 = var2;
				if (dummy != 0 || var2 < var4) {
					do {
						int var9;
						if (var5 == null) {
							var9 = var8;
						} else {
							var9 = var5[var8];
						}

						if (var6[var9] == null) {
							var7 = false;
							if (dummy == 0) {
								break;
							}
						}

						++var8;
					} while (var8 < var4);
				}

				if (var7) {
					return true;
				} else {
					byte[] var25;
					if (keys == null || keys[0] == 0 && keys[1] == 0 && keys[2] == 0 && keys[3] == 0) {
						var25 = cf.a(false, this.N[fileID], (byte) 87);
					} else {
						var25 = cf.a(true, this.N[fileID], (byte) 87);
						ja var10 = new ja(var25);
						var10.a((byte) 112, keys, var10.yb.length, 5);
					}

					byte[] var26;
					try {
						var26 = od.a((byte) -53, var25);
					} catch (RuntimeException var23) {
						throw ec.a(var23, "T3 - " + (keys != null) + "," + fileID + "," + var25.length + "," + pa.a(-14629, var25, var25.length) + "," + pa.a(-14629, var25, var25.length - 2) + "," + this.B[fileID] + "," + this.C);
					}

					if (this.boolean_b) {
						this.N[fileID] = null;
					}

					int var11;
					if (var4 > 1) {
						var11 = var26.length;
						int[] var14 = new int[var4];
						--var11;
						int var12 = var26[var11] & 255;
						ja var13 = new ja(var26);
						var11 -= var4 * var12 * 4;
						var13.P = var11;
						int var15 = 0;
						int var17;
						if (var12 > var15) {
							do {
								int var16 = 0;
								var17 = 0;
								if (var17 >= var4) {
									++var15;
								} else {
									do {
										var16 += var13.l(15);
										var14[var17] += var16;
										++var17;
									} while (var17 < var4);

									++var15;
								}
							} while (var12 > var15);
						}

						byte[][] var27 = new byte[var4][];
						var17 = 0;
						if (dummy != 0 || ~var4 < ~var17) {
							do {
								var27[var17] = new byte[var14[var17]];
								var14[var17] = 0;
								++var17;
							} while (~var4 < ~var17);
						}

						var13.P = var11;
						int var18 = 0;
						int var19 = 0;
						int var20;
						int var21;
						if (dummy != 0 || ~var12 < ~var19) {
							do {
								var20 = 0;
								var21 = 0;
								if (dummy == 0 && ~var21 <= ~var4) {
									++var19;
								} else {
									do {
										var20 += var13.l(var2 + 15);
										na.a(var26, var18, var27[var21], var14[var21], var20);
										var18 += var20;
										var14[var21] += var20;
										++var21;
									} while (~var21 > ~var4);

									++var19;
								}
							} while (~var12 < ~var19);
						}

						var20 = 0;
						if (dummy != 0 || ~var4 < ~var20) {
							do {
								if (var5 == null) {
									var21 = var20;
								} else {
									var21 = var5[var20];
								}

								if (this.K) {
									var6[var21] = var27[var20];
								} else {
									var6[var21] = uc.a(28199, var27[var20], false);
								}

								++var20;
							} while (~var4 < ~var20);
						}
					}

					if (var5 != null) {
						var11 = var5[0];
					} else {
						var11 = 0;
					}

					if (!this.K) {
						var6[var11] = uc.a(var2 + 28199, var26, false);
					} else {
						var6[var11] = var26;
					}

					return true;
				}
			}
		} catch (RuntimeException var24) {
			throw ec.a(var24, "bg.G(" + (keys != null ? "{...}" : "null") + ',' + var2 + ',' + fileID + ')');
		}
	}

	final boolean b(int var1, byte var2) {
		try {
			++int_i;
			if (this.N[var1] != null) {
				return true;
			} else {
				this.a(var1, -84);
				if (var2 != 103) {
					ints_t = null;
				}

				return this.N[var1] != null;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.Q(" + var1 + ',' + var2 + ')');
		}
	}

	final boolean b(int var1, lf param, lf class_lf) {
		try {
			++H;
			if (var1 != -1) {
				return true;
			} else {
				param = param.b(var1 + -10179);
				class_lf = class_lf.b(-10180);
				int fileID = this.ig_f.a((byte) -38, param.h(-105));
				int var5 = this.igs_m[fileID].a((byte) -38, class_lf.h(-54));
				return this.d(var5, fileID, -116);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bg.E(" + var1 + ',' + (param != null ? "{...}" : "null") + ',' + (class_lf != null ? "{...}" : "null") + ')');
		}
	}

	final boolean d(int var1, int var2, int var3) {
		try {
			++int_o;
			if (var3 >= -107) {
				lf_w = null;
			}

			if (var2 >= 0 && ~var2 > ~this.objects_n.length && this.objects_n[var2] != null && var1 >= 0 && this.objects_n[var2].length > var1) {
				if (this.objects_n[var2][var1] != null) {
					return true;
				} else if (this.N[var2] != null) {
					return true;
				} else {
					this.a(var2, -114);
					return this.N[var2] != null;
				}
			} else {
				return false;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "bg.C(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static fc c(int var0, int var1) {
		try {
			++int_k;
			fc var2 = (fc) me.y.a((long) var1, -102);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = bd.bg_l.a(0, var1, 5);
				var2 = new fc();
				if (var3 != null) {
					var2.a(new ja(var3), -26780);
				}

				me.y.a((long) var1, 88, var2);
				if (var0 > -81) {
					b(-107, 53);
				}

				return var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.CA(" + var0 + ',' + var1 + ')');
		}
	}

	final boolean d(int var1, int var2) {
		try {
			if (var1 != -5526) {
				return true;
			} else {
				++X;
				if (this.objects_n.length == 1) {
					return this.d(var2, 0, var1 ^ 5607);
				} else if (~this.objects_n[var2].length == -2) {
					return this.d(0, var2, -117);
				} else {
					throw new RuntimeException();
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.B(" + var1 + ',' + var2 + ')');
		}
	}

	final void a(boolean var1, lf var2) {
		try {
			++G;
			var2 = var2.b(-10180);
			int var3 = this.ig_f.a((byte) -38, var2.h(-93));
			if (var3 >= 0) {
				if (!var1) {
					this.d(47, 73);
				}

				this.a(var3, (byte) -76);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.S(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static void a(int var0) {
		try {
			++O;
			if (ie.Pb) {
				ai.ints_d = null;
				tc.S = null;
				pd.ints_h = null;
				hg.ints_m = null;
				rc.kf_l = null;
				td.V = null;
				mc.ints_s = null;
				sd.ints_ab = null;
				id.dfs_s = null;
				hh.W = null;
				ba.ints_d = null;
				dc.df_ib = null;
				nb.dfs_m = null;
				wh.dfs_c = null;
				sh.Bb = null;
				dg.ints_k = null;
				f.S = null;
				ra.Q = null;
				if (var0 != 24831) {
					a(false, (bg) null);
				}

				ng.df_db = null;
				uf.ints_a = null;
				ie.Nb = null;
				kd.kf_mb = null;
				eh.b(2, var0 + -24830);
				e.a(var0 ^ -24832, true);
				ie.Pb = false;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "bg.J(" + var0 + ')');
		}
	}

	final void e(int var1, int var2) {
		int var5 = client.int_gc;

		try {
			int var3 = 0;
			if (var5 != 0) {
				this.objects_n[var1][var3] = null;
				++var3;
			}

			while (var3 < this.objects_n[var1].length) {
				this.objects_n[var1][var3] = null;
				++var3;
			}

			++V;
			int var4 = -101 / ((57 - var2) / 56);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bg.I(" + var1 + ',' + var2 + ')');
		}
	}

	final int b(byte var1, int var2) {
		try {
			if (var1 < 6) {
				this.f(109, 34);
			}

			++F;
			return this.objects_n[var2].length;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.BA(" + var1 + ',' + var2 + ')');
		}
	}

	final int a(byte var1) {
		try {
			++int_p;
			return var1 <= 92 ? 32 : this.objects_n.length;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "bg.U(" + var1 + ')');
		}
	}

	final void a(byte[] var1, int var2) {
		int var19 = client.int_gc;

		try {
			++E;
			this.C = pa.a(-14629, var1, var1.length);
			ja var3 = new ja(od.a((byte) -53, var1));
			int var4 = var3.j((byte) 125);
			if (var4 != 5 && var4 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
			} else {
				if (~var4 <= -7) {
					var3.l(var2 + -5525);
				}

				int var6 = 0;
				int var5 = var3.j((byte) 107);
				this.int_r = var3.b(true);
				this.D = new int[this.int_r];
				int var7 = -1;
				int var8 = 0;
				if (var19 != 0) {
					this.D[var8] = var6 += var3.b(true);
					if (~this.D[var8] < ~var7) {
						var7 = this.D[var8];
					}

					++var8;
				}

				for (; ~this.int_r < ~var8; ++var8) {
					this.D[var8] = var6 += var3.b(true);
					if (~this.D[var8] < ~var7) {
						var7 = this.D[var8];
					}
				}

				this.B = new int[1 + var7];
				this.ints_j = new int[1 + var7];
				this.N = new Object[1 + var7];
				this.A = new int[var7 - -1];
				this.Y = new int[var7 - -1][];
				this.objects_n = new Object[1 + var7][];
				int var9;
				int var10;
				if (var5 != 0) {
					this.ints_e = new int[var7 - -1];
					var9 = 0;
					if (var19 != 0) {
						this.ints_e[var9] = -1;
						++var9;
					}

					while (~var9 > ~(var7 + 1)) {
						this.ints_e[var9] = -1;
						++var9;
					}

					var10 = 0;
					if (var19 != 0 || this.int_r > var10) {
						do {
							this.ints_e[this.D[var10]] = var3.l(15);
							++var10;
						} while (this.int_r > var10);
					}

					this.ig_f = new ig(this.ints_e);
				}

				var9 = 0;
				if (var19 != 0 || ~this.int_r < ~var9) {
					do {
						this.B[this.D[var9]] = var3.l(cc.c(var2, 5547));
						++var9;
					} while (~this.int_r < ~var9);
				}

				var10 = 0;
				if (var19 != 0) {
					this.ints_j[this.D[var10]] = var3.l(15);
					++var10;
				}

				while (~var10 > ~this.int_r) {
					this.ints_j[this.D[var10]] = var3.l(15);
					++var10;
				}

				int var11 = 0;
				if (var19 != 0 || ~this.int_r < ~var11) {
					do {
						this.A[this.D[var11]] = var3.b(true);
						++var11;
					} while (~this.int_r < ~var11);
				}

				int var12 = 0;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				if (var19 != 0) {
					var6 = 0;
					var13 = this.D[var12];
					var14 = this.A[var13];
					this.Y[var13] = new int[var14];
					var15 = -1;
					var16 = 0;
					if (var19 == 0 && var16 >= var14) {
						if (1 + var15 == var14) {
							this.Y[var13] = null;
						}

						this.objects_n[var13] = new Object[1 + var15];
						++var12;
					} else {
						while (true) {
							var17 = this.Y[var13][var16] = var6 += var3.b(true);
							if (~var15 > ~var17) {
								var15 = var17;
							}

							++var16;
							if (var16 >= var14) {
								if (1 + var15 == var14) {
									this.Y[var13] = null;
								}

								this.objects_n[var13] = new Object[1 + var15];
								++var12;
								break;
							}
						}
					}
				}

				while (this.int_r > var12) {
					var6 = 0;
					var13 = this.D[var12];
					var14 = this.A[var13];
					this.Y[var13] = new int[var14];
					var15 = -1;
					var16 = 0;
					if (var19 == 0 && var16 >= var14) {
						if (1 + var15 == var14) {
							this.Y[var13] = null;
						}

						this.objects_n[var13] = new Object[1 + var15];
						++var12;
					} else {
						do {
							var17 = this.Y[var13][var16] = var6 += var3.b(true);
							if (~var15 > ~var17) {
								var15 = var17;
							}

							++var16;
						} while (var16 < var14);

						if (1 + var15 == var14) {
							this.Y[var13] = null;
						}

						this.objects_n[var13] = new Object[1 + var15];
						++var12;
					}
				}

				if (var2 != 5540) {
					this.A = null;
				}

				if (~var5 != -1) {
					this.I = new int[1 + var7][];
					this.igs_m = new ig[var7 - -1];
					var13 = 0;
					if (var19 != 0 || this.int_r > var13) {
						do {
							var14 = this.D[var13];
							var15 = this.A[var14];
							this.I[var14] = new int[this.objects_n[var14].length];
							var16 = 0;
							if (var19 != 0) {
								this.I[var14][var16] = -1;
								++var16;
							}

							while (this.objects_n[var14].length > var16) {
								this.I[var14][var16] = -1;
								++var16;
							}

							var17 = 0;
							if (var19 != 0 || ~var15 < ~var17) {
								do {
									int var18;
									label83:
									{
										if (this.Y[var14] != null) {
											var18 = this.Y[var14][var17];
											if (var19 == 0) {
												break label83;
											}
										}

										var18 = var17;
									}

									this.I[var14][var18] = var3.l(cc.c(var2, 5547));
									++var17;
								} while (~var15 < ~var17);

								this.igs_m[var14] = new ig(this.I[var14]);
								++var13;
							} else {
								this.igs_m[var14] = new ig(this.I[var14]);
								++var13;
							}
						} while (this.int_r > var13);

					}
				}
			}
		} catch (RuntimeException var20) {
			throw ec.a(var20, "bg.R(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final boolean b(byte var1) {
		int var5 = client.int_gc;

		try {
			if (var1 != -68) {
				this.int_r = -53;
			}

			++T;
			boolean var2 = true;
			int var3 = 0;
			if (var5 == 0 && var3 >= this.D.length) {
				return var2;
			} else {
				do {
					int var4 = this.D[var3];
					if (this.N[var4] == null) {
						this.a(var4, -102);
						if (this.N[var4] == null) {
							var2 = false;
						}
					}

					++var3;
				} while (var3 < this.D.length);

				return var2;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bg.A(" + var1 + ')');
		}
	}

	final byte[] a(int var1, int[] var2, int fileID, int cacheID) {
		try {
			++int_h;
			if (~fileID <= -1 && ~fileID > ~this.objects_n.length && this.objects_n[fileID] != null && cacheID >= 0 && ~this.objects_n[fileID].length < ~cacheID) {
				if (this.objects_n[fileID][cacheID] == null) {
					boolean var5 = this.a(var2, 0, fileID);
					if (!var5) {
						this.a(fileID, -76);
						var5 = this.a(var2, 0, fileID);
						if (!var5) {
							return null;
						}
					}
				}

				if (var1 <= 25) {
					this.objects_n = null;
				}

				assert this.objects_n != null;
				byte[] var7 = cf.a(false, this.objects_n[fileID][cacheID], (byte) 87);
				if (this.K) {
					this.objects_n[fileID][cacheID] = null;
				}

				return var7;
			} else {
				return null;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bg.FA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + fileID + ',' + cacheID + ')');
		}
	}

	static void b(int var0) {
		int var2 = client.int_gc;

		try {
			++P;
			ci var1 = (ci) bb.V.c(41);
			if (var0 <= 108) {
				ints_t = null;
				if (var2 == 0 && var1 == null) {
					return;
				}
			} else if (var1 == null) {
				return;
			}

			do {
				label54:
				{
					if (~hc.int_pb != ~var1.int_mb || var1.boolean_rb) {
						var1.a(true);
						if (var2 == 0) {
							break label54;
						}
					}

					if (var1.int_gb <= pd.int_i) {
						label25:
						{
							var1.a(v.int_tb, (byte) -79);
							if (!var1.boolean_rb) {
								ka.a(var1.int_mb, var1.int_pb, var1.int_sb, var1.int_wb, 60, var1, 0, -1L, false);
								if (var2 == 0) {
									break label25;
								}
							}

							var1.a(true);
						}
					}
				}

				var1 = (ci) bb.V.d(-1);
			} while (var1 != null);

		} catch (RuntimeException var3) {
			throw ec.a(var3, "bg.T(" + var0 + ')');
		}
	}

	final byte[] f(int var1, int var2) {
		try {
			++Q;
			if (this.objects_n.length == 1) {
				return this.a(0, var2, 0);
			} else if (~this.objects_n[var2].length == -2) {
				return this.a(var1, 0, var2);
			} else {
				if (var1 != 0) {
					this.objects_n = null;
				}

				throw new RuntimeException();
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.F(" + var1 + ',' + var2 + ')');
		}
	}

	final void c(int var1) {
		int var4 = client.int_gc;

		try {
			++U;
			int var2 = 0;
			if (var1 != 512) {
				this.objects_n = null;
				if (var4 == 0 && var2 >= this.objects_n.length) {
					return;
				}
			} else if (var2 >= this.objects_n.length) {
				return;
			}

			do {
				if (this.objects_n[var2] != null) {
					int var3 = 0;
					if (var4 != 0 || this.objects_n[var2].length > var3) {
						do {
							this.objects_n[var2][var3] = null;
							++var3;
						} while (this.objects_n[var2].length > var3);
					}
				}

				++var2;
			} while (var2 < this.objects_n.length);

		} catch (RuntimeException var5) {
			throw ec.a(var5, "bg.N(" + var1 + ')');
		}
	}

	public static void c(byte var0) {
		try {
			if (var0 != 61) {
				c((byte) 104);
			}

			lf_d = null;
			lf_a = null;
			lf_w = null;
			ints_t = null;
			y = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "bg.GA(" + var0 + ')');
		}
	}

	static db a(bg cache8, lf class_lf, bg cache13, boolean dummy, lf fontParam) {
		try {
			if (dummy) {
				a(false, (bg) null);
			}

			++S;
			int fileID = cache8.a((byte) 106, fontParam);
			int var6 = cache8.a((byte) -46, class_lf, fileID);
			return je.a((byte) -72, fileID, var6, cache8, cache13);
		} catch (RuntimeException var7) {
			throw ec.a(var7, "bg.V(" + (cache8 != null ? "{...}" : "null") + ',' + (class_lf != null ? "{...}" : "null") + ',' + (cache13 != null ? "{...}" : "null") + ',' + dummy + ',' + (fontParam != null ? "{...}" : "null") + ')');
		}
	}

	bg(boolean var1, boolean var2) {
		try {
			this.boolean_b = var1;
			this.K = var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bg.<init>(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		lf_a = lf_d;
		lf_w = dd.a("<col=c0ff00>", 2);
	}
}
