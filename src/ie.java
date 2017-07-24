import java.awt.Component;

final class ie extends ph {

	static int G;
	private int H;
	static int I;
	private int J = -1;
	int K = -1;
	int L = 0;
	int M = 0;
	static int N;
	private int O = 0;
	int P;
	private int Q = -1;
	int R;
	boolean S;
	private int T = 0;
	lf U;
	private int V = 0;
	private short[] W;
	static int X;
	private short[] Y;
	private int Z = 128;
	static int int_ab;
	static int int_bb;
	static int int_cb;
	private short[] shorts_db;
	int int_eb = 0;
	static int int_fb;
	private int int_gb;
	private int int_hb = -1;
	private int int_ib = -1;
	int int_jb = 1;
	static int int_kb;
	static int int_lb;
	int int_mb;
	int[] ints_nb;
	static rc rc_ob = new rc(50);
	static int int_pb;
	static int int_qb;
	private int int_rb;
	static int int_sb;
	int int_tb;
	int int_ub;
	int int_vb;
	private int int_wb;
	int xb;
	private int yb;
	private int zb;
	private short[] Ab;
	static int Bb;
	int Cb;
	lf[] Db;
	int[] Eb;
	lf[] Fb;
	private int Gb;
	private int Hb;
	int Ib;
	boolean Jb;
	static int Kb;
	static int Lb = 99;
	static rc Mb = new rc(64);
	static df[] Nb;
	static lf Ob;
	static boolean Pb;
	static lf Qb = dd.a("Ein kostenloses Spielkonto erstellen)3", 2);
	private static lf Rb = dd.a("Try again in 60 secs)3)3)3", 2);

	final void a(ja var1, byte var2) {
		int var4 = client.int_gc;

		try {
			do {
				int var3 = var1.j((byte) 91);
				if (var3 == 0) {
					break;
				}

				this.a(var1, (byte) -1, var3);
			} while (var4 == 0);

			++X;
			if (var2 != -95) {
				this.int_ub = 127;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ie.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final boolean a(boolean var1, int var2) {
		try {
			++int_fb;
			int var5 = this.int_ib;
			int var4 = this.zb;
			int var3 = this.K;
			if (var1) {
				var5 = this.int_gb;
				var4 = this.int_wb;
				var3 = this.int_tb;
			}

			if (~var3 == 0) {
				return true;
			} else {
				boolean var6 = true;
				if (!ah.bg_g.d(0, var3, var2 + -110)) {
					var6 = false;
				}

				if (var4 != -1 && !ah.bg_g.d(0, var4, -127)) {
					var6 = false;
				}

				if (~var5 != var2 && !ah.bg_g.d(0, var5, -122)) {
					var6 = false;
				}

				return var6;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ie.I(" + var1 + ',' + var2 + ')');
		}
	}

	final gf b(int var1) {
		int var4 = client.int_gc;

		try {
			oe var2 = oe.a(ah.bg_g, this.yb, 0);
			++int_kb;
			if (var2 == null) {
				return null;
			} else {
				int var3;
				if (this.Ab != null) {
					var3 = 0;
					if (var4 != 0 || ~this.Ab.length < ~var3) {
						do {
							var2.a(this.Ab[var3], this.shorts_db[var3]);
							++var3;
						} while (~this.Ab.length < ~var3);
					}
				}

				if (this.Y != null) {
					var3 = 0;
					if (var4 != 0 || ~var3 > ~this.Y.length) {
						do {
							var2.b(this.Y[var3], this.W[var3]);
							++var3;
						} while (~var3 > ~this.Y.length);
					}
				}

				gf var6 = var2.b(64 + this.O, this.T + 768, -50, -10, -50);
				var6.boolean_hb = true;
				if (var1 != 13634) {
					return null;
				} else {
					if (this.Z != 128 || this.int_rb != 128 || this.Gb != 128) {
						var6.b(this.Z, this.int_rb, this.Gb);
					}

					return var6;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ie.N(" + var1 + ')');
		}
	}

	final boolean a(int var1, boolean var2) {
		try {
			++int_pb;
			int var3 = this.Hb;
			int var4 = this.int_hb;
			if (var2) {
				var4 = this.Q;
				var3 = this.J;
			}

			if (~var3 == 0) {
				return true;
			} else {
				if (var1 < 39) {
					this.int_mb = 70;
				}

				boolean var5 = true;
				if (!ah.bg_g.d(0, var3, -116)) {
					var5 = false;
				}

				if (var4 != -1 && !ah.bg_g.d(0, var4, -125)) {
					var5 = false;
				}

				return var5;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ie.C(" + var1 + ',' + var2 + ')');
		}
	}

	final ie a(int var1, int var2) {
		int var5 = client.int_gc;

		try {
			if (var2 != 10) {
				b(66, 31);
			}

			++int_qb;
			if (this.ints_nb != null && ~var1 < -2) {
				int var3 = -1;
				int var4 = 0;
				if (var5 != 0 || var4 < 10) {
					do {
						if (~var1 <= ~this.Eb[var4] && this.Eb[var4] != 0) {
							var3 = this.ints_nb[var4];
						}

						++var4;
					} while (var4 < 10);
				}

				if (~var3 != 0) {
					return ng.a(var3, -4);
				}
			}

			return this;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ie.L(" + var1 + ',' + var2 + ')');
		}
	}

	final ue a(int var1, bi var2, int var3, int var4) {
		int var8 = client.int_gc;

		try {
			++I;
			if (this.ints_nb != null && var4 > 1) {
				int var5 = -1;
				int var6 = 0;
				if (var8 != 0 || ~var6 > -11) {
					do {
						if (var4 >= this.Eb[var6] && this.Eb[var6] != 0) {
							var5 = this.ints_nb[var6];
						}

						++var6;
					} while (~var6 > -11);
				}

				if (var5 != -1) {
					return ng.a(var5, -4).a(-95, var2, var3, 1);
				}
			}

			if (var1 >= -78) {
				this.K = -120;
			}

			ue var10 = (ue) ph.D.a((long) this.P, -119);
			if (var10 == null) {
				oe var11 = oe.a(ah.bg_g, this.yb, 0);
				if (var11 == null) {
					return null;
				}

				int var7;
				if (this.Ab != null) {
					var7 = 0;
					if (var8 != 0 || ~this.Ab.length < ~var7) {
						do {
							var11.a(this.Ab[var7], this.shorts_db[var7]);
							++var7;
						} while (~this.Ab.length < ~var7);
					}
				}

				if (this.Y != null) {
					var7 = 0;
					if (var8 != 0 || ~var7 > ~this.Y.length) {
						do {
							var11.b(this.Y[var7], this.W[var7]);
							++var7;
						} while (~var7 > ~this.Y.length);
					}
				}

				var10 = var11.a(64 + this.O, 768 + this.T, -50, -10, -50, false, false);
				if (~this.Z != -129 || this.int_rb != 128 || ~this.Gb != -129) {
					var10.b(this.Z, this.int_rb, this.Gb);
				}

				ph.D.a((long) this.P, 104, var10);
			}

			if (var2 != null) {
				var10 = var2.a(var10, var3, 516678064);
			}

			return var10;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "ie.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}

	final void c(int var1) {
		try {
			if (var1 != 20045) {
				Nb = null;
			}

			++int_lb;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ie.J(" + var1 + ')');
		}
	}

	public static void d(int var0) {
		try {
			Mb = null;
			Ob = null;
			Qb = null;
			if (var0 != 13799) {
				Rb = null;
			}

			Nb = null;
			Rb = null;
			rc_ob = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ie.B(" + var0 + ')');
		}
	}

	final void a(ie var1, ie var2, byte var3) {
		try {
			++int_bb;
			this.shorts_db = var2.shorts_db;
			this.Y = var2.Y;
			int var4 = 87 % ((var3 - -23) / 61);
			this.W = var2.W;
			this.U = var1.U;
			this.yb = var2.yb;
			this.xb = var2.xb;
			this.int_jb = var1.int_jb;
			this.Ib = var2.Ib;
			this.M = var2.M;
			this.L = 1;
			this.int_eb = var2.int_eb;
			this.S = var1.S;
			this.Ab = var2.Ab;
			this.int_mb = var2.int_mb;
			this.int_vb = var2.int_vb;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ie.G(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	static final boolean b(int var0, int var1) {
		try {
			++int_sb;
			if (var1 != 128) {
				Mb = null;
			}

			return ~(1 & var0 >> 618406268) != -1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ie.A(" + var0 + ',' + var1 + ')');
		}
	}

	static final eg a(int var0, int var1, int var2, Component var3) {
		try {
			++Bb;

			try {
				if (var0 != -3503) {
					return null;
				} else {
					Class clazz = Class.forName("le");
					eg class_eg = (eg) clazz.newInstance();
					class_eg.a(124, var2, var3, var1);
					return class_eg;
				}
			} catch (Throwable throwable) {
				mc class_mc = new mc();
				class_mc.a(125, var2, var3, var1);
				return class_mc;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ie.M(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private final void a(ja var1, byte var2, int var3) {
		int var6 = client.int_gc;

		try {
			if (var2 != -1) {
				this.int_rb = 71;
			}

			label250:
			{
				if (var3 == 1) {
					this.yb = var1.b(true);
					if (var6 == 0) {
						break label250;
					}
				}

				if (var3 == 2) {
					this.U = var1.e((byte) 87);
					if (var6 == 0) {
						break label250;
					}
				}

				if (~var3 == -5) {
					this.int_mb = var1.b(true);
					if (var6 == 0) {
						break label250;
					}
				}

				if (~var3 != -6) {
					if (~var3 != -7) {
						if (~var3 == -8) {
							this.int_eb = var1.b(true);
							if (~this.int_eb >= -32768) {
								break label250;
							}

							this.int_eb -= 65536;
							if (var6 == 0) {
								break label250;
							}
						}

						if (var3 == 8) {
							this.xb = var1.b(true);
							if (this.xb <= 32767) {
								break label250;
							}

							this.xb -= 65536;
							if (var6 == 0) {
								break label250;
							}
						}

						if (~var3 != -12) {
							if (var3 == 12) {
								this.int_jb = var1.l(var2 + 16);
								if (var6 == 0) {
									break label250;
								}
							}

							if (var3 != 16) {
								if (~var3 != -24) {
									if (~var3 == -25) {
										this.zb = var1.b(true);
										if (var6 == 0) {
											break label250;
										}
									}

									if (~var3 == -26) {
										this.int_tb = var1.b(true);
										this.V = var1.j((byte) 81);
										if (var6 == 0) {
											break label250;
										}
									}

									if (var3 != 26) {
										if (~var3 <= -31 && var3 < 35) {
											this.Db[var3 - 30] = var1.e((byte) 87);
											if (!this.Db[var3 - 30].a((byte) -121, rb.lf_o)) {
												break label250;
											}

											this.Db[-30 + var3] = null;
											if (var6 == 0) {
												break label250;
											}
										}

										if (var3 >= 35 && ~var3 > -41) {
											this.Fb[var3 + -35] = var1.e((byte) 87);
											if (var6 == 0) {
												break label250;
											}
										}

										int var4;
										int var5;
										if (~var3 == -41) {
											var4 = var1.j((byte) 104);
											this.shorts_db = new short[var4];
											this.Ab = new short[var4];
											var5 = 0;
											if (var6 != 0 || ~var4 < ~var5) {
												do {
													this.Ab[var5] = (short) var1.b(true);
													this.shorts_db[var5] = (short) var1.b(true);
													++var5;
												} while (~var4 < ~var5);
											}

											if (var6 == 0) {
												break label250;
											}
										}

										if (var3 != 41) {
											if (~var3 != -66) {
												if (~var3 == -79) {
													this.int_ib = var1.b(true);
													if (var6 == 0) {
														break label250;
													}
												}

												if (var3 != 79) {
													if (var3 != 90) {
														if (var3 == 91) {
															this.J = var1.b(true);
															if (var6 == 0) {
																break label250;
															}
														}

														if (var3 != 92) {
															if (~var3 == -94) {
																this.Q = var1.b(true);
																if (var6 == 0) {
																	break label250;
																}
															}

															if (~var3 != -96) {
																if (var3 == 97) {
																	this.R = var1.b(true);
																	if (var6 == 0) {
																		break label250;
																	}
																}

																if (var3 == 98) {
																	this.int_ub = var1.b(true);
																	if (var6 == 0) {
																		break label250;
																	}
																}

																if (var3 < 100 || var3 >= 110) {
																	if (~var3 == -111) {
																		this.Z = var1.b(true);
																		if (var6 == 0) {
																			break label250;
																		}
																	}

																	if (~var3 != -112) {
																		if (var3 != 112) {
																			if (~var3 == -114) {
																				this.O = var1.m(3);
																				if (var6 == 0) {
																					break label250;
																				}
																			}

																			if (var3 != 114) {
																				if (~var3 != -116) {
																					break label250;
																				}

																				this.Cb = var1.j((byte) 113);
																				if (var6 == 0) {
																					break label250;
																				}
																			}

																			this.T = var1.m(3) * 5;
																			if (var6 == 0) {
																				break label250;
																			}
																		}

																		this.Gb = var1.b(true);
																		if (var6 == 0) {
																			break label250;
																		}
																	}

																	this.int_rb = var1.b(true);
																	if (var6 == 0) {
																		break label250;
																	}
																}

																if (this.ints_nb == null) {
																	this.Eb = new int[10];
																	this.ints_nb = new int[10];
																}

																this.ints_nb[-100 + var3] = var1.b(true);
																this.Eb[var3 + -100] = var1.b(true);
																if (var6 == 0) {
																	break label250;
																}
															}

															this.int_vb = var1.b(true);
															if (var6 == 0) {
																break label250;
															}
														}

														this.int_hb = var1.b(true);
														if (var6 == 0) {
															break label250;
														}
													}

													this.Hb = var1.b(true);
													if (var6 == 0) {
														break label250;
													}
												}

												this.int_gb = var1.b(true);
												if (var6 == 0) {
													break label250;
												}
											}

											this.Jb = true;
											if (var6 == 0) {
												break label250;
											}
										}

										var4 = var1.j((byte) 120);
										this.Y = new short[var4];
										this.W = new short[var4];
										var5 = 0;
										if (var6 != 0 || var5 < var4) {
											do {
												this.Y[var5] = (short) var1.b(true);
												this.W[var5] = (short) var1.b(true);
												++var5;
											} while (var5 < var4);
										}

										if (var6 == 0) {
											break label250;
										}
									}

									this.int_wb = var1.b(true);
									if (var6 == 0) {
										break label250;
									}
								}

								this.K = var1.b(true);
								this.H = var1.j((byte) 123);
								if (var6 == 0) {
									break label250;
								}
							}

							this.S = true;
							if (var6 == 0) {
								break label250;
							}
						}

						this.L = 1;
						if (var6 == 0) {
							break label250;
						}
					}

					this.Ib = var1.b(true);
					if (var6 == 0) {
						break label250;
					}
				}

				this.M = var1.b(true);
			}

			++N;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ie.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	final oe a(byte var1, boolean var2) {
		int var10 = client.int_gc;

		try {
			int var4 = this.zb;
			int var3 = this.K;
			++int_cb;
			int var5 = this.int_ib;
			if (var2) {
				var3 = this.int_tb;
				var5 = this.int_gb;
				var4 = this.int_wb;
			}

			if (var3 == -1) {
				return null;
			} else {
				oe var6 = oe.a(ah.bg_g, var3, 0);
				if (var4 != -1) {
					label67:
					{
						oe var7 = oe.a(ah.bg_g, var4, 0);
						if (var5 != -1) {
							oe var8 = oe.a(ah.bg_g, var5, 0);
							oe[] var9 = new oe[]{var6, var7, var8};
							var6 = new oe(var9, 3);
							if (var10 == 0) {
								break label67;
							}
						}

						oe[] var13 = new oe[]{var6, var7};
						var6 = new oe(var13, 2);
					}
				}

				if (!var2 && ~this.H != -1) {
					var6.b(0, this.H, 0);
				}

				if (var2 && this.V != 0) {
					var6.b(0, this.V, 0);
				}

				if (var1 >= -71) {
					this.a(-22, null, -6, 17);
				}

				int var12;
				if (this.Ab != null) {
					var12 = 0;
					if (var10 != 0 || this.Ab.length > var12) {
						do {
							var6.a(this.Ab[var12], this.shorts_db[var12]);
							++var12;
						} while (this.Ab.length > var12);
					}
				}

				if (this.Y != null) {
					var12 = 0;
					if (var10 != 0 || ~this.Y.length < ~var12) {
						do {
							var6.b(this.Y[var12], this.W[var12]);
							++var12;
						} while (~this.Y.length < ~var12);
					}
				}

				return var6;
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "ie.K(" + var1 + ',' + var2 + ')');
		}
	}

	final oe b(boolean var1, int var2) {
		int var8 = client.int_gc;

		try {
			++G;
			int var3 = this.Hb;
			int var4 = this.int_hb;
			if (var1) {
				var3 = this.J;
				var4 = this.Q;
			}

			if (var3 == -1) {
				return null;
			} else {
				oe var5 = oe.a(ah.bg_g, var3, var2);
				if (~var4 != 0) {
					oe var6 = oe.a(ah.bg_g, var4, 0);
					oe[] var7 = new oe[]{var5, var6};
					var5 = new oe(var7, 2);
				}

				int var10;
				if (this.Ab != null) {
					var10 = 0;
					if (var8 != 0 || var10 < this.Ab.length) {
						do {
							var5.a(this.Ab[var10], this.shorts_db[var10]);
							++var10;
						} while (var10 < this.Ab.length);
					}
				}

				if (this.Y != null) {
					var10 = 0;
					if (var8 != 0 || ~var10 > ~this.Y.length) {
						do {
							var5.b(this.Y[var10], this.W[var10]);
							++var10;
						} while (~var10 > ~this.Y.length);
					}
				}

				return var5;
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "ie.H(" + var1 + ',' + var2 + ')');
		}
	}

	public ie() {
		this.U = ra.X;
		this.int_wb = -1;
		this.int_tb = -1;
		this.H = 0;
		this.int_mb = 2000;
		this.R = -1;
		this.Db = new lf[]{null, null, nf.lf_n, null, null};
		this.S = false;
		this.xb = 0;
		this.zb = -1;
		this.int_rb = 128;
		this.Fb = new lf[]{null, null, null, null, hh.V};
		this.Cb = 0;
		this.Hb = -1;
		this.Gb = 128;
		this.Jb = false;
		this.int_gb = -1;
		this.Ib = 0;
		this.int_ub = -1;
		this.int_vb = 0;
	}

	static {
		Ob = Rb;
	}
}
