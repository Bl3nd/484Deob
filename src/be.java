final class be {

	static int int_a;
	static int int_b;
	private int[] ints_c;
	static int int_d;
	static int int_e;
	private int[] ints_f;
	private long long_g;
	private int int_h;
	private long long_i;
	static int int_j;
	static int int_k;
	static bg bg_l;
	static int int_m;
	static int int_n;
	static int int_o;
	static int int_p;
	static wb wb_q;
	boolean boolean_r;
	static lf art = dd.a("Art", 2);//lf_s
	static int int_t;
	static lf lf_u = dd.a("Lade)3)3)3", 2);
	static int int_v;
	static int int_w;

	final ue a(int var1, int var2, bi var3, bi var4, byte var5) {
		int var17 = client.int_gc;

		try {
			++int_p;
			if (~this.int_h != 0) {
				return uh.a((byte) -99, this.int_h).a(var5 ^ -91, var3, var1, var2, var4);
			} else {
				int[] var8 = this.ints_c;
				long var6 = this.long_g;
				if (var3 != null && (~var3.L <= -1 || var3.int_hb >= 0)) {
					var8 = new int[12];
					int var9 = 0;
					if (var17 != 0 || ~var9 > -13) {
						do {
							var8[var9] = this.ints_c[var9];
							++var9;
						} while (~var9 > -13);
					}

					if (var3.L >= 0) {
						label169:
						{
							if (~var3.L == -65536) {
								var8[5] = 0;
								var6 ^= -4294967296L;
								if (var17 == 0) {
									break label169;
								}
							}

							var8[5] = d.c(1073741824, var3.L);
							var6 ^= (long) var8[5] << 32;
						}
					}

					if (~var3.int_hb <= -1) {
						label164:
						{
							if (~var3.int_hb != -65536) {
								var8[3] = d.c(var3.int_hb, 1073741824);
								var6 ^= (long) var8[3];
								if (var17 == 0) {
									break label164;
								}
							}

							var8[3] = 0;
							var6 ^= 4294967295L;
						}
					}
				}

				ue var19 = (ue) v.rc_qb.a(var6, var5 + -146);
				if (var19 == null) {
					boolean var10 = false;
					int var11 = 0;
					if (var17 != 0 || var11 < 12) {
						do {
							label147:
							{
								int var12 = var8[var11];
								if (~(1073741824 & var12) == -1) {
									if ((var12 & Integer.MIN_VALUE) == 0 || af.c((byte) 58, var12 & 1073741823).b(false)) {
										break label147;
									}

									var10 = true;
									if (var17 == 0) {
										break label147;
									}
								}

								if (!ng.a(var12 & 1073741823, (int) -4).a(this.boolean_r, 0)) {
									var10 = true;
								}
							}

							++var11;
						} while (var11 < 12);
					}

					if (var10) {
						if (~this.long_i != 0L) {
							var19 = (ue) v.rc_qb.a(this.long_i, var5 ^ -90);
						}

						if (var19 == null) {
							return null;
						}
					}

					if (var19 == null) {
						int var13 = 0;
						oe[] var21 = new oe[12];
						int var14 = 0;
						if (var17 != 0 || ~var14 > -13) {
							do {
								label125:
								{
									int var15 = var8[var14];
									oe var16;
									if (~(1073741824 & var15) == -1) {
										if (~(var15 & Integer.MIN_VALUE) == -1) {
											break label125;
										}

										var16 = af.c((byte) -110, 1073741823 & var15).b(0);
										if (var16 == null) {
											break label125;
										}

										var21[var13++] = var16;
										if (var17 == 0) {
											break label125;
										}
									}

									var16 = ng.a(1073741823 & var15, var5 + -52).a((byte) -94, this.boolean_r);
									if (var16 != null) {
										var21[var13++] = var16;
									}
								}

								++var14;
							} while (~var14 > -13);
						}

						oe var22 = new oe(var21, var13);
						int var23 = 0;
						if (var17 != 0 || ~var23 > -6) {
							do {
								if (this.ints_f[var23] < ic.C[var23].length) {
									var22.a(rg.shorts_t[var23], ic.C[var23][this.ints_f[var23]]);
								}

								if (this.ints_f[var23] < di.shorts_gb[var23].length) {
									var22.a(ig.shorts_k[var23], di.shorts_gb[var23][this.ints_f[var23]]);
								}

								++var23;
							} while (~var23 > -6);
						}

						var19 = var22.a(64, 850, -30, -50, -30, true, true);
						v.rc_qb.a(var6, -111, var19);
						this.long_i = var6;
					}
				}

				if (var3 == null && var4 == null) {
					return var19;
				} else {
					ue var20;
					if (var3 != null && var4 != null) {
						var20 = var3.a(var4, 26, var2, var19, var1);
						if (var17 == 0) {
							return var5 != 48 ? null : var20;
						}
					}

					if (var3 != null) {
						var20 = var3.a(var2, var19, (byte) -58);
						if (var17 == 0) {
							return var5 != 48 ? null : var20;
						}
					}

					var20 = var4.a(var1, var19, (byte) -58);
					return var5 != 48 ? null : var20;
				}
			}
		} catch (RuntimeException var18) {
			throw ec.a(var18, "be.G(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	final void a(int var1, int var2, boolean var3) {
		int var6 = client.int_gc;

		try {
			++int_b;
			if (var1 != 1 || !this.boolean_r) {
				int var4 = this.ints_c[d.Y[var1]];
				if (var4 != 0) {
					var4 &= 1073741823;
					if (var2 <= 109) {
						wb_q = null;
					}

					hh var5;
					do {
						label46:
						{
							if (var3) {
								++var4;
								if (~hf.int_o < ~var4) {
									break label46;
								}

								var4 = 0;
								if (var6 == 0) {
									break label46;
								}
							}

							--var4;
							if (~var4 > -1) {
								var4 = -1 + hf.int_o;
							}
						}

						var5 = af.c((byte) 83, var4);
					} while (var5 == null || var5.T || ~(var1 + (this.boolean_r ? 7 : 0)) != ~var5.R);

					this.ints_c[d.Y[var1]] = d.c(var4, Integer.MIN_VALUE);
					this.a(758424712);
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "be.N(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a(int var1, int var2, int var3) {
		try {
			this.ints_f[var1] = var2;
			this.a(758424712);
			++int_t;
			if (var3 != 12) {
				wb_q = null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "be.M(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	private final void a(int var1) {
		int var7 = client.int_gc;

		try {
			++int_n;
			long var2 = this.long_g;
			this.long_g = -1L;
			long[] var4 = ng.longs_bb;
			if (var1 == 758424712) {
				int var5 = 0;
				do {
					this.long_g = this.long_g >>> 8 ^ var4[(int) (255L & (this.long_g ^ (long) (this.ints_c[var5] >> 24)))];
					this.long_g = var4[(int) (255L & (this.long_g ^ (long) (this.ints_c[var5] >> 16)))] ^ this.long_g >>> 8;
					this.long_g = var4[(int) (((long) (this.ints_c[var5] >> 8) ^ this.long_g) & 255L)] ^ this.long_g >>> 8;
					this.long_g = this.long_g >>> 8 ^ var4[(int) (255L & (this.long_g ^ (long) this.ints_c[var5]))];
					++var5;
				} while (var5 < 12);

				int var6 = 0;
				if (var7 != 0) {
					this.long_g = this.long_g >>> 8 ^ var4[(int) (255L & (this.long_g ^ (long) this.ints_f[var6]))];
					++var6;
				}

				while (var6 < 5) {
					this.long_g = this.long_g >>> 8 ^ var4[(int) (255L & (this.long_g ^ (long) this.ints_f[var6]))];
					++var6;
				}

				this.long_g = this.long_g >>> 8 ^ var4[(int) (255L & ((long) (!this.boolean_r ? 0 : 1) ^ this.long_g))];
				if (var2 != 0L && this.long_g != var2) {
					v.rc_qb.a(var2, (byte) 40);
				}
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "be.D(" + var1 + ')');
		}
	}

	final void a(int var1, boolean var2, int[] var3, byte var4, int[] var5) {
		int var9 = client.int_gc;

		try {
			++int_d;
			if (var3 == null) {
				var3 = new int[12];
				int var6 = 0;
				if (var9 != 0 || ~var6 > -8) {
					do {
						int var7 = 0;
						if (var9 != 0 || hf.int_o > var7) {
							do {
								hh var8 = af.c((byte) 121, var7);
								if (var8 != null && !var8.T && var6 - -(!var2 ? 0 : 7) == var8.R) {
									var3[d.Y[var6]] = d.c(var7, Integer.MIN_VALUE);
									if (var9 == 0) {
										break;
									}
								}

								++var7;
							} while (hf.int_o > var7);
						}

						++var6;
					} while (~var6 > -8);
				}
			}

			this.int_h = var1;
			this.boolean_r = var2;
			this.ints_f = var5;
			this.ints_c = var3;
			this.a(758424712);
			if (var4 < 12) {
				this.long_g = 109L;
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "be.L(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}

	final void b(int var1, int var2, int var3) {
		try {
			if (var1 == -8621) {
				++int_o;
				int var4 = d.Y[var3];
				if (this.ints_c[var4] != 0) {
					if (af.c((byte) 94, var2) != null) {
						this.ints_c[var4] = d.c(Integer.MIN_VALUE, var2);
						this.a(758424712);
					}
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "be.H(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void b(int var0) {
		try {
			bg_l = null;
			wb_q = null;
			if (var0 != 1073741823) {
				a(-19, 104, -63, -93, true, (bg) null);
			}

			art = null;
			lf_u = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "be.C(" + var0 + ')');
		}
	}

	final void b(int var1, int var2, boolean var3) {
		try {
			++int_a;
			if (var1 > -94) {
				this.a((byte) -15);
			}

			int var4;
			label23:
			{
				var4 = this.ints_f[var2];
				if (var3) {
					++var4;
					if (~ic.C[var2].length < ~var4) {
						break label23;
					}

					var4 = 0;
					if (client.int_gc == 0) {
						break label23;
					}
				}

				--var4;
				if (~var4 > -1) {
					var4 = -1 + ic.C[var2].length;
				}
			}

			this.ints_f[var2] = var4;
			this.a(758424712);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "be.B(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a(int var1, ja var2) {
		int var5 = client.int_gc;

		try {
			var2.e(-13488, !this.boolean_r ? 0 : 1);
			int var3 = 0;
			int var4;
			if (var5 != 0 || var3 < 7) {
				do {
					label39:
					{
						var4 = this.ints_c[d.Y[var3]];
						if ((Integer.MIN_VALUE & var4) == 0) {
							var2.c((int) 9698, '\uffff');
							if (var5 == 0) {
								break label39;
							}
						}

						var2.c((int) 9698, 1073741823 & var4);
					}

					++var3;
				} while (var3 < 7);
			}

			var4 = 0;
			if (var5 != 0) {
				var2.e(-13488, this.ints_f[var4]);
				++var4;
			}

			while (~var4 > -6) {
				var2.e(-13488, this.ints_f[var4]);
				++var4;
			}

			++int_j;
			if (var1 >= -93) {
				this.a(41, true);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "be.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, boolean var4, bg var5) {
		try {
			if (var1 > -103) {
				b(-23);
			}

			ig.int_r = 1;
			++int_m;
			ag.int_a = var2;
			pf.int_gb = var0;
			jc.C = var4;
			hc.int_ob = 10000;
			bg_l = var5;
			hc.int_eb = var3;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "be.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}

	final ue a(int var1, bi var2, int var3) {
		int var12 = client.int_gc;

		try {
			++int_e;
			if (~this.int_h != 0) {
				return uh.a((byte) -99, this.int_h).a((byte) 90, var3, (bi) var2);
			} else {
				ue var4 = (ue) af.rc_s.a(this.long_g, var1 + -1073741920);
				if (var4 == null) {
					boolean var5 = false;
					int var6 = 0;
					if (var12 != 0 || var6 < 12) {
						do {
							label100:
							{
								int var7 = this.ints_c[var6];
								if ((1073741824 & var7) != 0) {
									if (ng.a(var7 & 1073741823, (int) -4).a(var1 + -1073741781, this.boolean_r)) {
										break label100;
									}

									var5 = true;
									if (var12 == 0) {
										break label100;
									}
								}

								if (~(Integer.MIN_VALUE & var7) != -1 && !af.c((byte) -117, var7 & 1073741823).c(-1)) {
									var5 = true;
								}
							}

							++var6;
						} while (var6 < 12);
					}

					if (var5) {
						return null;
					}

					oe[] var14 = new oe[12];
					int var8 = 0;
					int var9 = 0;
					if (var12 != 0 || ~var9 > -13) {
						do {
							label81:
							{
								int var10 = this.ints_c[var9];
								oe var11;
								if ((var10 & 1073741824) != 0) {
									var11 = ng.a(var10 & 1073741823, (int) -4).b(this.boolean_r, var1 + -1073741823);
									if (var11 == null) {
										break label81;
									}

									var14[var8++] = var11;
									if (var12 == 0) {
										break label81;
									}
								}

								if ((var10 & Integer.MIN_VALUE) != 0) {
									var11 = af.c((byte) -126, 1073741823 & var10).d((byte) -62);
									if (var11 != null) {
										var14[var8++] = var11;
									}
								}
							}

							++var9;
						} while (~var9 > -13);
					}

					oe var15 = new oe(var14, var8);
					int var16 = 0;
					if (var12 != 0 || var16 < 5) {
						do {
							if (~this.ints_f[var16] > ~ic.C[var16].length) {
								var15.a(rg.shorts_t[var16], ic.C[var16][this.ints_f[var16]]);
							}

							if (~this.ints_f[var16] > ~di.shorts_gb[var16].length) {
								var15.a(ig.shorts_k[var16], di.shorts_gb[var16][this.ints_f[var16]]);
							}

							++var16;
						} while (var16 < 5);
					}

					var4 = var15.a(64, 768, -50, -10, -50, true, true);
					af.rc_s.a(this.long_g, var1 ^ -1073741718, var4);
				}

				if (var1 != 1073741823) {
					this.ints_c = null;
				}

				if (var2 != null) {
					var4 = var2.a(var4, var3, var1 ^ 557063759);
				}

				return var4;
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "be.J(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	final int a(byte var1) {
		try {
			++int_w;
			if (var1 >= -77) {
				this.b(80, -24, true);
			}

			return this.int_h != -1 ? uh.a((byte) -99, this.int_h).Ab + 305419896 : this.ints_c[1] + (this.ints_c[11] << 5) + (this.ints_c[0] << 15) + (this.ints_f[4] << 20) + (this.ints_f[0] << 25) - -(this.ints_c[8] << 10);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "be.K(" + var1 + ')');
		}
	}

	final void a(int var1, boolean var2) {
		try {
			++int_v;
			this.boolean_r = var2;
			int var3 = 84 % ((var1 - 60) / 52);
			this.a(758424712);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "be.F(" + var1 + ',' + var2 + ')');
		}
	}

	final void a(boolean var1, byte var2) {
		try {
			++int_k;
			if (this.boolean_r != var1) {
				int var3 = -1 / ((-39 - var2) / 39);
				this.a(-1, var1, (int[]) null, (byte) 47, this.ints_f);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "be.I(" + var1 + ',' + var2 + ')');
		}
	}
}
