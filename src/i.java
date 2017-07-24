final class i extends ph {

	static int G;
	boolean H = false;
	int I = 1;
	private short[] J;
	static int K;
	int L = 1;
	int M = -1;
	static int N = 0;
	static rc O = new rc(64);
	private int P = 128;
	lf[] Q = new lf[5];
	static int R;
	private int S = -1;
	static int T;
	int U = 16;
	int V = 2;
	static int W;
	static int X;
	int Y = 0;
	private short[] Z;
	static int int_ab;
	private short[] shorts_bb;
	int int_cb;
	private int int_db = -1;
	private int int_eb = 128;
	private int[] ints_fb;
	private int[] ints_gb;
	static int int_hb;
	private int int_ib = 0;
	private int int_jb = 128;
	boolean boolean_kb = false;
	int int_lb = -1;
	int[] ints_mb;
	private int int_nb = -1;
	int int_ob = -1;
	static int int_pb;
	private int int_qb = 0;
	static int int_rb;
	int int_sb = 0;
	int int_tb = 0;
	private boolean boolean_ub = false;
	boolean boolean_vb = false;
	boolean boolean_wb = true;
	boolean xb = true;
	static int yb;
	lf zb;
	static int Ab;
	static int Bb;
	int Cb = -1;
	int[] Db;
	private boolean Eb;
	private int Fb;
	int Gb;
	int Hb;
	static ab[][][] Ib;
	static lf Jb = dd.a("Bitte warten Sie)3)3)3", 2);
	static int Kb;
	private short[] Lb;
	private int Mb;
	static lf Nb = dd.a("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 2);
	private int Ob;
	int Pb;

	final ka a(int var1, int var2, int var3, int var4, int var5, int var6, int[][] var7) {
		int var12 = client.int_gc;

		try {
			long var8;
			label60:
			{
				++R;
				if (this.ints_gb != null) {
					var8 = (long) ((this.int_cb << -959993622) + ((var3 << -260588669) - -var4));
					if (var12 == 0) {
						break label60;
					}
				}

				var8 = (long) (var4 + (this.int_cb << -1661335222));
			}

			Object var10 = (ka) me.rc_q.a(var8, (int) -96);
			if (var10 == null) {
				oe var11 = this.a(false, var4, var3);
				if (var11 == null) {
					return null;
				}

				label52:
				{
					if (!this.boolean_ub) {
						var10 = var11.a(this.Ob + 64, 768 + this.int_qb * 5, -50, -10, -50, this.S >= 0, false);
						if (var12 == 0) {
							break label52;
						}
					}

					var10 = var11;
					var11.short_wb = (short) (5 * this.int_qb + 768);
					var11.Ab = (short) (64 + this.Ob);
					var11.j();
				}

				me.rc_q.a(var8, var5 ^ 117, (ph) var10);
			}

			if (this.boolean_ub) {
				var10 = ((oe) var10).f();
			}

			if (~this.S <= var5) {
				if (!(var10 instanceof ue)) {
					if (!(var10 instanceof oe)) {
						return (ka) var10;
					}

					var10 = ((oe) var10).a(var7, var2, var6, var1, true, this.S);
					if (var12 == 0) {
						return (ka) var10;
					}
				}

				var10 = ((ue) var10).a(var7, var2, var6, var1, true, this.S);
			}

			return (ka) var10;
		} catch (RuntimeException var13) {
			throw ec.a(var13, "i.I(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, int var1, int var2) {
		ab var3 = Ib[var0][var1][var2];
		if (var3 != null) {
			var3.O = null;
		}
	}

	final i b(int var1) {
		try {
			++G;
			int var2 = -1;
			if (var1 <= 22) {
				this.Cb = 24;
			}

			if (this.int_db == -1) {
				if (~this.int_nb == 0) {
					return var2 >= 0 && ~var2 > ~this.ints_mb.length && this.ints_mb[var2] != -1 ? pa.a((int) this.ints_mb[var2], 0) : null;
				}

				var2 = uc.ints_ub[this.int_nb];
				if (client.int_gc == 0) {
					return var2 >= 0 && ~var2 > ~this.ints_mb.length && this.ints_mb[var2] != -1 ? pa.a((int) this.ints_mb[var2], 0) : null;
				}
			}

			var2 = mc.a((byte) 108, this.int_db);
			return var2 >= 0 && ~var2 > ~this.ints_mb.length && this.ints_mb[var2] != -1 ? pa.a((int) this.ints_mb[var2], 0) : null;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "i.G(" + var1 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, lb[] var3, int var4, byte[] var5, int var6, int var7, int var8, int var9) {
		int var15 = client.int_gc;

		try {
			++int_ab;
			if (var1 > -13) {
				Ib = null;
			}

			int var10 = 0;
			if (var15 != 0 || var10 < 8) {
				do {
					int var11 = 0;
					if (var15 == 0 && ~var11 <= -9) {
						++var10;
					} else {
						do {
							if (var4 + var10 > 0 && ~(var4 + var10) > -104 && var6 + var11 > 0 && ~(var11 + var6) > -104) {
								var3[var7].ints_g[var10 + var4][var6 + var11] = sd.a(var3[var7].ints_g[var10 + var4][var6 + var11], -16777217);
							}

							++var11;
						} while (~var11 > -9);

						++var10;
					}
				} while (var10 < 8);
			}

			ja var17 = new ja(var5);
			int var12 = 0;
			if (var15 != 0 || ~var12 > -5) {
				do {
					int var13 = 0;
					if (var15 == 0 && ~var13 <= -65) {
						++var12;
					} else {
						do {
							int var14 = 0;
							if (var15 == 0 && var14 >= 64) {
								++var13;
							} else {
								do {
									label139:
									{
										if (var0 != var12 || ~var9 < ~var13 || var9 + 8 <= var13 || var14 < var8 || var14 >= var8 + 8) {
											ch.a(0, 124, 0, 0, -1, -1, 0, var17);
											if (var15 == 0) {
												break label139;
											}
										}

										ch.a(var7, 127, 0, var2, var6 + la.a(var14 & 7, var13 & 7, var2, -93), jg.a(-29778, var2, var13 & 7, var14 & 7) + var4, 0, var17);
									}

									++var14;
								} while (var14 < 64);

								++var13;
							}
						} while (~var13 > -65);

						++var12;
					}
				} while (~var12 > -5);

			}
		} catch (RuntimeException var16) {
			throw ec.a(var16, "i.J(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	final boolean a(int var1, int var2) {
		int var5 = client.int_gc;

		try {
			if (var1 != -42) {
				return true;
			} else {
				++Ab;
				if (this.ints_gb == null) {
					if (this.ints_fb == null) {
						return true;
					} else if (var2 != 10) {
						return true;
					} else {
						boolean var7 = true;
						int var4 = 0;
						if (var5 == 0 && this.ints_fb.length <= var4) {
							return var7;
						} else {
							do {
								var7 &= tb.bg_ab.d(0, this.ints_fb[var4], -111);
								++var4;
							} while (this.ints_fb.length > var4);

							return var7;
						}
					}
				} else {
					int var3 = 0;
					if (var5 == 0 && ~var3 <= ~this.ints_gb.length) {
						return true;
					} else {
						do {
							if (~var2 == ~this.ints_gb[var3]) {
								return tb.bg_ab.d(0, this.ints_fb[var3], -128);
							}

							++var3;
						} while (~var3 > ~this.ints_gb.length);

						return true;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "i.F(" + var1 + ',' + var2 + ')');
		}
	}

	public static void c(int var0) {
		try {
			Ib = null;
			O = null;
			int var1 = -9 % ((var0 - 21) / 44);
			Nb = null;
			Jb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "i.H(" + var0 + ')');
		}
	}

	private final oe a(boolean var1, int var2, int var3) {
		int var10 = client.int_gc;

		try {
			++Bb;
			oe var4 = null;
			boolean var5 = this.Eb;
			if (~var3 == -3 && ~var2 < -4) {
				var5 = !var5;
			}

			int var6;
			int var7;
			int var8;
			if (this.ints_gb == null) {
				if (var3 != 10) {
					return null;
				}

				if (this.ints_fb == null) {
					return null;
				}

				var6 = this.ints_fb.length;

				for (var7 = 0; var7 < var6; ++var7) {
					var8 = this.ints_fb[var7];
					if (var5) {
						var8 += 65536;
					}

					var4 = (oe) hg.rc_n.a((long) var8, (int) -112);
					if (var4 == null) {
						var4 = oe.a(tb.bg_ab, var8 & '\uffff', 0);
						if (var4 == null) {
							return null;
						}

						if (var5) {
							var4.e();
						}

						hg.rc_n.a((long) var8, 59, var4);
					}

					if (~var6 < -2) {
						rg.oes_b[var7] = var4;
					}
				}

				if (var6 > 1) {
					var4 = new oe(rg.oes_b, var6);
				}
			} else {
				var6 = -1;
				var7 = 0;
				if (var10 != 0 || var7 < this.ints_gb.length) {
					do {
						if (var3 == this.ints_gb[var7]) {
							var6 = var7;
							if (var10 == 0) {
								break;
							}
						}

						++var7;
					} while (var7 < this.ints_gb.length);
				}

				if (var6 == -1) {
					return null;
				}

				var8 = this.ints_fb[var6];
				if (var5) {
					var8 += 65536;
				}

				var4 = (oe) hg.rc_n.a((long) var8, (int) -112);
				if (var4 == null) {
					var4 = oe.a(tb.bg_ab, var8 & '\uffff', 0);
					if (var4 == null) {
						return null;
					}

					if (var5) {
						var4.e();
					}

					hg.rc_n.a((long) var8, -25, var4);
				}
			}

			boolean var12;
			label194:
			{
				if (this.int_jb == 128 && ~this.P == -129 && this.int_eb == 128) {
					var12 = false;
					if (var10 == 0) {
						break label194;
					}
				}

				var12 = true;
			}

			if (var1) {
				this.zb = null;
			}

			boolean var13;
			label238:
			{
				if (~this.Fb != -1 || this.Mb != 0 || ~this.int_ib != -1) {
					var13 = true;
					if (var10 == 0) {
						break label238;
					}
				}

				var13 = false;
			}

			oe var14 = new oe(var4, var2 == 0 && !var12 && !var13 && !var5, this.shorts_bb == null, this.Lb == null, true);
			if (var5) {
				var14.c();
			}

			if (var3 == 4 && var2 > 3) {
				var14.c(256);
				var14.b(45, 0, -45);
			}

			label227:
			{
				var2 &= 3;
				if (var2 == 1) {
					var14.g();
					if (var10 == 0) {
						break label227;
					}
				}

				if (~var2 != -3) {
					if (var2 != 3) {
						break label227;
					}

					var14.b();
					if (var10 == 0) {
						break label227;
					}
				}

				var14.d();
			}

			int var9;
			if (this.shorts_bb != null) {
				var9 = 0;
				if (var10 != 0 || ~var9 > ~this.shorts_bb.length) {
					do {
						var14.a(this.shorts_bb[var9], this.J[var9]);
						++var9;
					} while (~var9 > ~this.shorts_bb.length);
				}
			}

			if (this.Lb != null) {
				var9 = 0;
				if (var10 != 0 || this.Lb.length > var9) {
					do {
						var14.b(this.Lb[var9], this.Z[var9]);
						++var9;
					} while (this.Lb.length > var9);
				}
			}

			if (var12) {
				var14.a(this.int_jb, this.P, this.int_eb);
			}

			if (var13) {
				var14.b(this.Fb, this.Mb, this.int_ib);
			}

			return var14;
		} catch (RuntimeException var11) {
			throw ec.a(var11, "i.C(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final ue a(boolean var1, int var2, int var3, int var4, int[][] var5, int var6, int var7) {
		try {
			long var8;
			label47:
			{
				++T;
				if (this.ints_gb != null) {
					var8 = (long) (var3 + (this.int_cb << -440418454) - -(var6 << -1980915965));
					if (client.int_gc == 0) {
						break label47;
					}
				}

				var8 = (long) (var3 + (this.int_cb << -512046006));
			}

			ue var10 = (ue) me.rc_v.a(var8, (int) -99);
			if (!var1) {
				this.H = false;
			}

			if (var10 == null) {
				oe var11 = this.a(!var1, var3, var6);
				if (var11 == null) {
					return null;
				}

				var10 = var11.a(64 + this.Ob, 768 - -(5 * this.int_qb), -50, -10, -50, this.S >= 0, false);
				me.rc_v.a(var8, -122, var10);
			}

			if (this.S >= 0) {
				var10 = var10.a(var5, var2, var4, var7, true, this.S);
			}

			return var10;
		} catch (RuntimeException var12) {
			throw ec.a(var12, "i.N(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ')');
		}
	}

	final boolean d(int var1) {
		int var4 = client.int_gc;

		try {
			++int_hb;
			if (this.ints_mb == null) {
				return this.Pb != -1 || this.Db != null;
			} else {
				int var2 = 0;
				if (var4 == 0 && ~var2 <= ~this.ints_mb.length) {
					return var1 != -1;
				} else {
					do {
						if (this.ints_mb[var2] != -1) {
							i var3 = pa.a((int) this.ints_mb[var2], 0);
							if (var3.Pb != -1 || var3.Db != null) {
								return true;
							}
						}

						++var2;
					} while (~var2 > ~this.ints_mb.length);

					if (var1 != -1) {
						return true;
					} else {
						return false;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "i.O(" + var1 + ')');
		}
	}

	private final void a(ja var1, int var2, int var3) {
		int var6 = client.int_gc;

		try {
			label327:
			{
				int var4;
				int var5;
				if (~var3 != -2) {
					if (var3 != 2) {
						if (var3 == 5) {
							var4 = var1.j((byte) 81);
							if (~var4 >= -1) {
								break label327;
							}

							if (this.ints_fb == null || af.boolean_t) {
								this.ints_fb = new int[var4];
								this.ints_gb = null;
								var5 = 0;
								if (var6 != 0 || ~var4 < ~var5) {
									do {
										this.ints_fb[var5] = var1.b(true);
										++var5;
									} while (~var4 < ~var5);
								}

								if (var6 == 0) {
									break label327;
								}
							}

							var1.P += var4 * 2;
							if (var6 == 0) {
								break label327;
							}
						}

						if (var3 != 14) {
							if (var3 == 15) {
								this.I = var1.j((byte) 87);
								if (var6 == 0) {
									break label327;
								}
							}

							if (~var3 == -18) {
								this.xb = false;
								this.V = 0;
								if (var6 == 0) {
									break label327;
								}
							}

							if (~var3 == -19) {
								this.xb = false;
								if (var6 == 0) {
									break label327;
								}
							}

							if (~var3 != -20) {
								if (~var3 != -22) {
									if (var3 != 22) {
										if (var3 == 23) {
											this.boolean_vb = true;
											if (var6 == 0) {
												break label327;
											}
										}

										if (~var3 == -25) {
											this.Cb = var1.b(true);
											if (~this.Cb != -65536) {
												break label327;
											}

											this.Cb = -1;
											if (var6 == 0) {
												break label327;
											}
										}

										if (~var3 == -28) {
											this.V = 1;
											if (var6 == 0) {
												break label327;
											}
										}

										if (var3 == 28) {
											this.U = var1.j((byte) 73);
											if (var6 == 0) {
												break label327;
											}
										}

										if (~var3 == -30) {
											this.Ob = var1.m(3);
											if (var6 == 0) {
												break label327;
											}
										}

										if (~var3 != -40) {
											if (var3 < 30 || var3 >= 35) {
												if (var3 != 40) {
													if (~var3 == -42) {
														var4 = var1.j((byte) 124);
														this.Lb = new short[var4];
														this.Z = new short[var4];
														var5 = 0;
														if (var6 != 0 || ~var5 > ~var4) {
															do {
																this.Lb[var5] = (short) var1.b(true);
																this.Z[var5] = (short) var1.b(true);
																++var5;
															} while (~var5 > ~var4);
														}

														if (var6 == 0) {
															break label327;
														}
													}

													if (~var3 != -61) {
														if (var3 == 62) {
															this.Eb = true;
															if (var6 == 0) {
																break label327;
															}
														}

														if (var3 == 64) {
															this.boolean_wb = false;
															if (var6 == 0) {
																break label327;
															}
														}

														if (~var3 != -66) {
															if (~var3 == -67) {
																this.P = var1.b(true);
																if (var6 == 0) {
																	break label327;
																}
															}

															if (var3 != 67) {
																if (var3 != 68) {
																	if (var3 != 69) {
																		if (var3 != 70) {
																			if (~var3 != -72) {
																				if (~var3 != -73) {
																					if (~var3 != -74) {
																						if (var3 != 74) {
																							if (var3 == 75) {
																								this.M = var1.j((byte) 104);
																								if (var6 == 0) {
																									break label327;
																								}
																							}

																							if (var3 == 77) {
																								this.int_db = var1.b(true);
																								if (this.int_db == '\uffff') {
																									this.int_db = -1;
																								}

																								this.int_nb = var1.b(true);
																								if (~this.int_nb == -65536) {
																									this.int_nb = -1;
																								}

																								var4 = var1.j((byte) 86);
																								this.ints_mb = new int[var4 + 1];
																								var5 = 0;
																								if (var6 != 0 || var4 >= var5) {
																									do {
																										this.ints_mb[var5] = var1.b(true);
																										if (~this.ints_mb[var5] == -65536) {
																											this.ints_mb[var5] = -1;
																										}

																										++var5;
																									}
																									while (var4 >= var5);
																								}

																								if (var6 == 0) {
																									break label327;
																								}
																							}

																							if (~var3 != -79) {
																								if (var3 != 79) {
																									if (~var3 != -82) {
																										break label327;
																									}

																									this.S = 256 * var1.j((byte) 110);
																									if (var6 == 0) {
																										break label327;
																									}
																								}

																								this.Y = var1.b(true);
																								this.int_sb = var1.b(true);
																								this.Gb = var1.j((byte) 90);
																								var4 = var1.j((byte) 124);
																								this.Db = new int[var4];
																								var5 = 0;
																								if (var6 != 0 || var4 > var5) {
																									do {
																										this.Db[var5] = var1.b(true);
																										++var5;
																									}
																									while (var4 > var5);
																								}

																								if (var6 == 0) {
																									break label327;
																								}
																							}

																							this.Pb = var1.b(true);
																							this.Gb = var1.j((byte) 123);
																							if (var6 == 0) {
																								break label327;
																							}
																						}

																						this.H = true;
																						if (var6 == 0) {
																							break label327;
																						}
																					}

																					this.boolean_kb = true;
																					if (var6 == 0) {
																						break label327;
																					}
																				}

																				this.int_ib = var1.c(true);
																				if (var6 == 0) {
																					break label327;
																				}
																			}

																			this.Mb = var1.c(true);
																			if (var6 == 0) {
																				break label327;
																			}
																		}

																		this.Fb = var1.c(true);
																		if (var6 == 0) {
																			break label327;
																		}
																	}

																	this.int_tb = var1.j((byte) 87);
																	if (var6 == 0) {
																		break label327;
																	}
																}

																this.int_ob = var1.b(true);
																if (var6 == 0) {
																	break label327;
																}
															}

															this.int_eb = var1.b(true);
															if (var6 == 0) {
																break label327;
															}
														}

														this.int_jb = var1.b(true);
														if (var6 == 0) {
															break label327;
														}
													}

													this.Hb = var1.b(true);
													if (var6 == 0) {
														break label327;
													}
												}

												var4 = var1.j((byte) 106);
												this.shorts_bb = new short[var4];
												this.J = new short[var4];
												var5 = 0;
												if (var6 != 0 || ~var4 < ~var5) {
													do {
														this.shorts_bb[var5] = (short) var1.b(true);
														this.J[var5] = (short) var1.b(true);
														++var5;
													} while (~var4 < ~var5);
												}

												if (var6 == 0) {
													break label327;
												}
											}

											this.Q[var3 + -30] = var1.e((byte) 87);
											if (!this.Q[-30 + var3].a((byte) -121, rb.lf_o)) {
												break label327;
											}

											this.Q[-30 + var3] = null;
											if (var6 == 0) {
												break label327;
											}
										}

										this.int_qb = 5 * var1.m(var2 ^ -83);
										if (var6 == 0) {
											break label327;
										}
									}

									this.boolean_ub = true;
									if (var6 == 0) {
										break label327;
									}
								}

								this.S = 0;
								if (var6 == 0) {
									break label327;
								}
							}

							this.int_lb = var1.j((byte) 119);
							if (var6 == 0) {
								break label327;
							}
						}

						this.L = var1.j((byte) 107);
						if (var6 == 0) {
							break label327;
						}
					}

					this.zb = var1.e((byte) 87);
					if (var6 == 0) {
						break label327;
					}
				}

				var4 = var1.j((byte) 70);
				if (~var4 < -1) {
					label346:
					{
						if (this.ints_fb != null && !af.boolean_t) {
							var1.P += var4 * 3;
							if (var6 == 0) {
								break label346;
							}
						}

						this.ints_fb = new int[var4];
						this.ints_gb = new int[var4];
						var5 = 0;
						if (var6 != 0 || ~var5 > ~var4) {
							do {
								this.ints_fb[var5] = var1.b(true);
								this.ints_gb[var5] = var1.j((byte) 99);
								++var5;
							} while (~var5 > ~var4);
						}
					}
				}
			}

			++int_pb;
			if (var2 != -82) {
				this.xb = true;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "i.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void d(byte var1) {
		int var3 = client.int_gc;

		try {
			if (var1 == -62) {
				++int_rb;
				if (this.int_lb == -1) {
					this.int_lb = 0;
					if (this.ints_fb != null && (this.ints_gb == null || ~this.ints_gb[0] == -11)) {
						this.int_lb = 1;
					}

					int var2 = 0;
					if (var3 != 0 || var2 < 5) {
						do {
							if (this.Q[var2] != null) {
								this.int_lb = 1;
							}

							++var2;
						} while (var2 < 5);
					}
				}

				if (~this.M == 0) {
					this.M = ~this.V != -1 ? 1 : 0;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "i.L(" + var1 + ')');
		}
	}

	final void a(int var1, ja var2) {
		int var4 = client.int_gc;

		try {
			if (var1 == 0) {
				do {
					int var3 = var2.j((byte) 86);
					if (var3 == 0) {
						break;
					}

					this.a(var2, -82, var3);
				} while (var4 == 0);

				++W;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "i.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final ue a(bi var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[][] var9) {
		int var15 = client.int_gc;

		try {
			long var10;
			label53:
			{
				++Kb;
				int var12 = -34 % ((var6 - 11) / 35);
				if (this.ints_gb != null) {
					var10 = (long) ((this.int_cb << 964745674) - (-(var2 << -580010493) - var7));
					if (var15 == 0) {
						break label53;
					}
				}

				var10 = (long) ((this.int_cb << -1491391670) + var7);
			}

			ue var13 = (ue) wh.rc_i.a(var10, (int) -99);
			if (var13 == null) {
				oe var14 = this.a(false, var7, var2);
				if (var14 == null) {
					return null;
				}

				var13 = var14.a(64 - -this.Ob, 768 - -(5 * this.int_qb), -50, -10, -50, true, true);
				wh.rc_i.a(var10, -104, var13);
			}

			if (var1 == null && ~this.S == 0) {
				return var13;
			} else {
				label45:
				{
					if (var1 != null) {
						var13 = var1.a(var4, var13, var7, (byte) -57);
						if (var15 == 0) {
							break label45;
						}
					}

					var13 = var13.c(true);
				}

				if (~this.S <= -1) {
					var13 = var13.a(var9, var3, var8, var5, false, this.S);
				}

				return var13;
			}
		} catch (RuntimeException var16) {
			throw ec.a(var16, "i.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + (var9 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, vg var1, int var2, byte var3) {
		try {
			++yb;
			if (tg.W == null && !f.boolean_ab) {
				if (var1 != null && rc.a(var1, -12633) != null) {
					tg.W = var1;
					ee.Q = rc.a(var1, -12633);
					p.Hc = false;
					ph.E = var0;
					if (var3 > 71) {
						rd.G = var2;
						n.int_i = 0;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "i.K(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	final boolean e(int var1) {
		int var5 = client.int_gc;

		try {
			++K;
			if (this.ints_fb == null) {
				return true;
			} else {
				boolean var2 = true;
				int var3 = 0;
				int var4 = -99 % ((var1 - 37) / 63);
				if (var5 == 0 && ~var3 <= ~this.ints_fb.length) {
					return var2;
				} else {
					do {
						var2 &= tb.bg_ab.d(0, '\uffff' & this.ints_fb[var3], -112);
						++var3;
					} while (~var3 > ~this.ints_fb.length);

					return var2;
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "i.A(" + var1 + ')');
		}
	}

	public i() {
		this.zb = nb.lf_g;
		this.Gb = 0;
		this.Mb = 0;
		this.Fb = 0;
		this.Hb = -1;
		this.Eb = false;
		this.Ob = 0;
		this.Pb = -1;
	}
}
