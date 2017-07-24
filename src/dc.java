import java.util.Random;

final class dc extends j {

	static int[] Q;
	static lf R;
	private int S = 0;
	static int[] T;
	private int U = 0;
	static int V;
	static int[] W;
	static int X;
	static lf Y = dd.a("null", 2);
	static int[] Z;
	static int int_ab;
	private int int_bb = 2000;
	static int[] ints_cb;
	static int int_db;
	static int int_eb;
	private int int_fb = 4096;
	static lf[] lfs_gb;
	private static lf lf_hb = dd.a(" ", 2);
	static df df_ib;
	static int[] ints_jb;
	static int int_kb;
	static int int_lb;
	private int int_mb = 16;
	static int[] ints_nb;
	static int int_ob;
	static int int_pb;

	public static void d(byte var0) {
		try {
			Z = null;
			df_ib = null;
			ints_jb = null;
			if (var0 != -87) {
				int_pb = -91;
			}

			ints_nb = null;
			T = null;
			R = null;
			Y = null;
			lf_hb = null;
			W = null;
			Q = null;
			lfs_gb = null;
			ints_cb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "dc.L(" + var0 + ')');
		}
	}

	static boolean a(int var0, int var1, int var2, long var3) {
		ab var5 = i.Ib[var0][var1][var2];
		if (var5 == null) {
			return false;
		} else if (var5.H != null && var5.H.long_h == var3) {
			return true;
		} else if (var5.K != null && var5.K.long_i == var3) {
			return true;
		} else if (var5.D != null && var5.D.long_l == var3) {
			return true;
		} else {
			for (int var6 = 0; var6 < var5.int_p; ++var6) {
				if (var5.eds_t[var6].long_w == var3) {
					return true;
				}
			}

			return false;
		}
	}

	final int[] a(int var1, int var2) {
		int var27 = client.int_gc;

		try {
			if (var1 > -49) {
				df_ib = null;
			}

			++int_kb;
			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int var4 = this.int_fb >> 1951068961;
				int[][] var5 = super.H.a((byte) -28);
				Random var6 = new Random((long) this.S);
				int var7 = 0;
				if (var27 != 0 || ~this.int_bb < ~var7) {
					do {
						int var8 = ~this.int_fb >= -1 ? this.U : this.U - var4 - -nb.a(this.int_fb, var6, true);
						int var9 = nb.a(ff.int_a, var6, true);
						var8 = (4086 & var8) >> -1805227036;
						int var10 = nb.a(dg.int_p, var6, true);
						int var12 = (ne.ints_d[var8] * this.int_mb >> 37021196) + var10;
						int var11 = (lf.P[var8] * this.int_mb >> -1302550836) + var9;
						int var14 = var11 + -var9;
						int var13 = -var10 + var12;
						if (var14 != 0 || ~var13 != -1) {
							if (var14 < 0) {
								var14 = -var14;
							}

							if (var13 < 0) {
								var13 = -var13;
							}

							boolean var15 = var14 < var13;
							int var16;
							int var17;
							if (var15) {
								var16 = var9;
								var17 = var11;
								var9 = var10;
								var10 = var16;
								var11 = var12;
								var12 = var17;
							}

							if (~var11 > ~var9) {
								var16 = var9;
								var17 = var10;
								var9 = var11;
								var10 = var12;
								var11 = var16;
								var12 = var17;
							}

							int var18 = var12 - var10;
							var17 = var11 + -var9;
							var16 = var10;
							if (var18 < 0) {
								var18 = -var18;
							}

							int var19 = -var17 / 2;
							int var20 = 2048 / var17;
							int var21 = 1024 + -(nb.a(4096, var6, true) >> 852712770);
							int var22 = ~var10 > ~var12 ? 1 : -1;
							int var23 = var9;
							if (var27 != 0 || ~var11 < ~var9) {
								do {
									var19 += var18;
									int var24 = var20 * (-var9 + var23) + 1024 + var21;
									int var26 = qb.Z & var16;
									if (var19 > 0) {
										var16 += var22;
										var19 += -var17;
									}

									label55:
									{
										int var25 = var23 & ch.int_h;
										if (!var15) {
											var5[var25][var26] = var24;
											if (var27 == 0) {
												break label55;
											}
										}

										var5[var26][var25] = var24;
									}

									++var23;
								} while (~var11 < ~var23);
							}
						}

						++var7;
					} while (~this.int_bb < ~var7);
				}
			}

			return var3;
		} catch (RuntimeException var28) {
			throw ec.a(var28, "dc.G(" + var1 + ',' + var2 + ')');
		}
	}

	public dc() {
		super(0, true);
	}

	static void e(int var0) {
		try {
			++int_lb;
			int var1 = la.int_e;
			int var2 = lb.E;
			int var3 = lh.I;
			int var5 = 6116423;
			int var4 = ng.M;
			b.e(var1, var2, var3, var4, var5);
			b.e(1 + var1, 1 + var2, var3 - 2, 16, 0);
			b.c(var1 + 1, 18 + var2, var3 - 2, var4 - 19, 0);
			ee.S.a(u.Nc, var1 - -3, 14 + var2, var5, -1);
			if (var0 > 86) {
				int var7 = lf.int_c;
				int var6 = c.int_bb;
				int var8 = 0;
				if (var8 >= qa.int_eb) {
					tg.a(lh.I, 0, ng.M, la.int_e, lb.E);
				} else {
					do {
						int var10 = 16777215;
						int var9 = 31 + var2 + (-var8 + -1 + qa.int_eb) * 15;
						if (var6 > var1 && var6 < var1 + var3 && var7 > -13 + var9 && var7 < var9 + 3) {
							var10 = 16776960;
						}

						ee.S.a(mb.a(var8, (byte) -49), 3 + var1, var9, var10, 0);
						++var8;
					} while (var8 < qa.int_eb);

					tg.a(lh.I, 0, ng.M, la.int_e, lb.E);
				}
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "dc.O(" + var0 + ')');
		}
	}

	final void c(int var1) {
		try {
			++int_ab;
			td.b(127);
			if (var1 != 25614) {
				a((byte[]) null, -60, -109, -81, 25, -30, (lb[]) null);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "dc.M(" + var1 + ')');
		}
	}

	static void a(byte[] var0, int var1, int var2, int var3, int x, int y, lb[] collisionMaps) {
		try {
			int collisionPlane = 0;
			do {
				int collisionRegionX = 0;
				do {
					int collisionRegionY = 0;
					do {
						if (collisionRegionX + x > 0 && collisionRegionX + x < 103 && y + collisionRegionY > 0 && y + collisionRegionY < 103) {
							collisionMaps[collisionPlane].ints_g[collisionRegionX + x][collisionRegionY + y] = sd.a(collisionMaps[collisionPlane].ints_g[collisionRegionX + x][collisionRegionY + y], -16777217);
						}

						++collisionRegionY;
					} while (collisionRegionY < 64);

					++collisionRegionX;
				} while (collisionRegionX < 64);

				++collisionPlane;
			} while (collisionPlane < 4);

			if (var2 != 3752) {
				a(-83, -55, -14, -35L);
			}

			++int_eb;
			ja class_ja = new ja(var0);
			int plane = 0;
			do {
				int regionX = 0;
				do {
					int regionY = 0;
					do {
						ch.a(plane, 120, var3, 0, y + regionY, regionX + x, var1, class_ja);
						++regionY;
					} while (regionY < 64);

					++regionX;
				} while (regionX < 64);

				++plane;
			} while (plane < 4);

		} catch (RuntimeException var13) {
			throw ec.a(var13, "dc.N(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + x + ',' + y + ',' + (collisionMaps != null ? "{...}" : "null") + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label55:
			{
				label54:
				{
					label53:
					{
						label52:
						{
							label51:
							{
								++int_db;
								if (~var2 != -1) {
									if (~var2 == -2) {
										break label51;
									}

									if (~var2 == -3) {
										break label52;
									}

									if (var2 == 3) {
										break label53;
									}

									if (var2 != 4) {
										break label55;
									}

									if (var5 == 0) {
										break label54;
									}
								}

								this.S = var3.j((byte) 109);
								if (var5 == 0) {
									break label55;
								}
							}

							this.int_bb = var3.b(true);
							if (var5 == 0) {
								break label55;
							}
						}

						this.int_mb = var3.j((byte) 93);
						if (var5 == 0) {
							break label55;
						}
					}

					this.U = var3.b(true);
					if (var5 == 0) {
						break label55;
					}
				}

				this.int_fb = var3.b(true);
			}

			if (var1 >= -120) {
				this.c(-16);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "dc.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static boolean f(int var0) {
		try {
			if (var0 > -68) {
				return true;
			} else {
				++V;

				try {
					if (ig.int_r == 2) {
						if (e.s_o == null) {
							e.s_o = s.a(be.bg_l, hc.int_eb, pf.int_gb);
							if (e.s_o == null) {
								return false;
							}
						}

						if (j.E == null) {
							j.E = new cb(bb.cache4, me.cache14);
						}

						if (gg.sh_n.a(103, e.s_o, v.cache15, 22050, j.E)) {
							gg.sh_n.e((byte) -75);
							gg.sh_n.a(ag.int_a, (byte) -34);
							gg.sh_n.a(jc.C, (byte) -85, e.s_o);
							be.bg_l = null;
							ig.int_r = 0;
							e.s_o = null;
							j.E = null;
							return true;
						}
					}
				} catch (Exception var2) {
					var2.printStackTrace();
					gg.sh_n.f((byte) 105);
					j.E = null;
					e.s_o = null;
					be.bg_l = null;
					ig.int_r = 0;
				}

				return false;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "dc.J(" + var0 + ')');
		}
	}

	static {
		R = lf_hb;
		int_ob = 0;
		int_pb = 50;
		W = new int[int_pb];
		Z = new int[int_pb];
		T = new int[int_pb];
		ints_cb = new int[int_pb];
		lfs_gb = new lf[int_pb];
		Q = new int[int_pb];
		ints_nb = new int[int_pb];
		ints_jb = new int[int_pb];
	}
}
