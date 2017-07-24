import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;

final class ci extends ka {

	private int int_ab = 0;
	static int int_bb;
	static int int_cb;
	static BigInteger bigInteger_db = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	static int int_eb;
	static int int_fb;
	int int_gb;
	static lf event_opbase = dd.a("event_opbase", 2);//lf_hb
	static int int_ib;
	static lf lf_jb = dd.a("leuchten2:", 2);
	static int int_kb;
	private bi bi_lb;
	int int_mb;
	static lf lf_nb = dd.a("scrollen:", 2);
	private int int_ob;
	int int_pb;
	static lf lf_qb = dd.a("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 2);
	boolean boolean_rb = false;
	int int_sb;
	static int int_tb = 0;
	static int int_ub;
	private int int_vb = 0;
	int int_wb;
	static int[] xb = new int[128];

	public static void c(int var0) {
		try {
			if (var0 < -64) {
				xb = null;
				lf_jb = null;
				bigInteger_db = null;
				event_opbase = null;
				lf_nb = null;
				lf_qb = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ci.D(" + var0 + ')');
		}
	}

	final ue b(int var1) {
		try {
			++int_cb;
			int var3 = -3 % ((var1 - 61) / 46);
			lh var2 = v.c(this.int_ob, -18753);
			ue var4;
			if (!this.boolean_rb) {
				var4 = var2.a(this.int_vb, 125);
				if (client.int_gc == 0) {
					return var4 == null ? null : var4;
				}
			}

			var4 = var2.a(-1, 117);
			return var4 == null ? null : var4;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ci.FA(" + var1 + ')');
		}
	}

	static ah a(Component component, ke class_ke, byte dummy, int var3, int var4) {
		try {
			++int_kb;
			if (cb.sampleRate == 0) {
				throw new IllegalStateException();
			} else if (var3 >= 0 && var3 < 2) {
				if (var4 < 256) {
					var4 = 256;
				}

				try {
					ah class_ah = (ah) Class.forName("jd").newInstance();
					class_ah.ints_q = new int[256 * (!sc.channel ? 1 : 2)];
					class_ah.G = var4;
					class_ah.a(component);
					class_ah.J = (var4 & -1024) + 1024;
					if (class_ah.J > 16384) {
						class_ah.J = 16384;
					}

					class_ah.b(class_ah.J);
					if (fc.K > 0 && vg.Kc == null) {
						vg.Kc = new h();
						vg.Kc.ke_e = class_ke;
						class_ke.a(vg.Kc, fc.K, (byte) 46);
					}

					if (vg.Kc != null) {
						if (vg.Kc.ahs_o[var3] != null) {
							throw new IllegalArgumentException();
						}

						vg.Kc.ahs_o[var3] = class_ah;
					}

					return class_ah;
				} catch (Throwable throwable) {
					try {
						mg var5 = new mg(class_ke, var3);
						int var6 = -49 / ((9 - dummy) / 40);
						var5.ints_q = new int[256 * (sc.channel ? 2 : 1)];
						var5.G = var4;
						var5.a(component);
						var5.J = 16384;
						var5.b(var5.J);
						if (~fc.K < -1 && vg.Kc == null) {
							vg.Kc = new h();
							vg.Kc.ke_e = class_ke;
							class_ke.a(vg.Kc, fc.K, (byte) 46);
						}

						if (vg.Kc != null) {
							if (vg.Kc.ahs_o[var3] != null) {
								throw new IllegalArgumentException();
							}

							vg.Kc.ahs_o[var3] = var5;
						}

						return var5;
					} catch (Throwable var7) {
						return new ah();
					}
				}
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "ci.E(" + (component != null ? "{...}" : "null") + ',' + (class_ke != null ? "{...}" : "null") + ',' + dummy + ',' + var3 + ',' + var4 + ')');
		}
	}

	final void a(int var1, byte var2) {
		int var4 = client.int_gc;

		try {
			if (var2 > -57) {
				c(-64);
			}

			++int_bb;
			if (!this.boolean_rb) {
				this.int_ab += var1;
				if (var4 != 0 || this.bi_lb.T[this.int_vb] < this.int_ab) {
					do {
						this.int_ab -= this.bi_lb.T[this.int_vb];
						++this.int_vb;
						if (this.bi_lb.Q.length <= this.int_vb) {
							this.boolean_rb = true;
							return;
						}
					} while (this.bi_lb.T[this.int_vb] < this.int_ab);

				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ci.A(" + var1 + ',' + var2 + ')');
		}
	}

	static int a(int var0, int var1) {
		try {
			int var2 = -12 / ((-80 - var0) / 39);
			++int_eb;
			return (var1 & 129084) >> 1486643403;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ci.C(" + var0 + ',' + var1 + ')');
		}
	}

	static void a(int var0, byte var1, wa var2) {
		int var14 = client.int_gc;

		try {
			++int_fb;
			if (var1 > 9) {
				while (true) {
					uh var3 = (uh) wd.tf_jb.c(50);
					if (var3 == null) {
						return;
					}

					boolean var4 = false;
					int var5 = 0;
					if (var14 != 0) {
						if (var3.das_n[var5] != null) {
							if (var3.das_n[var5].int_a == 2) {
								var3.ints_q[var5] = -5;
							}

							if (var3.das_n[var5].int_a == 0) {
								var4 = true;
							}
						}

						if (var3.das_p[var5] != null) {
							if (~var3.das_p[var5].int_a == -3) {
								var3.ints_q[var5] = -6;
							}

							if (~var3.das_p[var5].int_a == -1) {
								var4 = true;
							}
						}

						++var5;
					}

					for (; var5 < var3.int_w; ++var5) {
						if (var3.das_n[var5] != null) {
							if (var3.das_n[var5].int_a == 2) {
								var3.ints_q[var5] = -5;
							}

							if (var3.das_n[var5].int_a == 0) {
								var4 = true;
							}
						}

						if (var3.das_p[var5] != null) {
							if (~var3.das_p[var5].int_a == -3) {
								var3.ints_q[var5] = -6;
							}

							if (~var3.das_p[var5].int_a == -1) {
								var4 = true;
							}
						}
					}

					if (var4) {
						return;
					}

					var2.e((byte) 104, var0);
					var2.e(-13488, 0);
					int var6 = var2.P;
					var2.b((byte) 104, var3.int_u);
					int var7 = 0;
					if (var14 != 0 || var3.int_w > var7) {
						do {
							label136:
							{
								if (~var3.ints_q[var7] != -1) {
									var2.e(-13488, var3.ints_q[var7]);
									if (var14 == 0) {
										break label136;
									}
								}

								try {
									label198:
									{
										int var8;
										int var10;
										label129:
										{
											var8 = var3.A[var7];
											Field var9;
											if (~var8 != -1) {
												if (var8 == 1) {
													var9 = (Field) var3.das_n[var7].object_c;
													var9.setInt((Object) null, var3.B[var7]);
													var2.e(-13488, 0);
													if (var14 == 0) {
														break label129;
													}
												}

												if (var8 != 2) {
													break label129;
												}

												var9 = (Field) var3.das_n[var7].object_c;
												var10 = var9.getModifiers();
												var2.e(-13488, 0);
												var2.b((byte) 101, var10);
												if (var14 == 0) {
													break label129;
												}
											}

											var9 = (Field) var3.das_n[var7].object_c;
											var10 = var9.getInt((Object) null);
											var2.e(-13488, 0);
											var2.b((byte) 120, var10);
										}

										Method var28;
										if (var8 == 3) {
											var28 = (Method) var3.das_p[var7].object_c;
											byte[][] var29 = var3.bytes_v[var7];
											Object[] var11 = new Object[var29.length];
											int var12 = 0;
											if (var14 != 0 || var29.length > var12) {
												do {
													ObjectInputStream var13 = new ObjectInputStream(new ByteArrayInputStream(var29[var12]));
													var11[var12] = var13.readObject();
													++var12;
												} while (var29.length > var12);
											}

											Object var30 = var28.invoke((Object) null, var11);
											if (var30 == null) {
												var2.e(-13488, 0);
												if (var14 == 0) {
													break label198;
												}
											}

											if (!(var30 instanceof Number)) {
												if (!(var30 instanceof lf)) {
													var2.e(-13488, 4);
													if (var14 == 0) {
														break label198;
													}
												}

												var2.e(-13488, 2);
												var2.a((lf) var30, (byte) -111);
												if (var14 == 0) {
													break label198;
												}
											}

											var2.e(-13488, 1);
											var2.a(((Number) var30).longValue(), -562765672);
											if (var14 == 0) {
												break label198;
											}
										}

										if (~var8 == -5) {
											var28 = (Method) var3.das_p[var7].object_c;
											var10 = var28.getModifiers();
											var2.e(-13488, 0);
											var2.b((byte) 122, var10);
										}
									}
								} catch (ClassNotFoundException var15) {
									var2.e(-13488, -10);
								} catch (InvalidClassException var16) {
									var2.e(-13488, -11);
								} catch (StreamCorruptedException var17) {
									var2.e(-13488, -12);
								} catch (OptionalDataException var18) {
									var2.e(-13488, -13);
								} catch (IllegalAccessException var19) {
									var2.e(-13488, -14);
								} catch (IllegalArgumentException var20) {
									var2.e(-13488, -15);
								} catch (InvocationTargetException var21) {
									var2.e(-13488, -16);
								} catch (SecurityException var22) {
									var2.e(-13488, -17);
								} catch (IOException var23) {
									var2.e(-13488, -18);
								} catch (NullPointerException var24) {
									var2.e(-13488, -19);
								} catch (Exception var25) {
									var2.e(-13488, -20);
								} catch (Throwable var26) {
									var2.e(-13488, -21);
								}
							}

							++var7;
						} while (var3.int_w > var7);

						var2.i(var6, -1503604504);
						var2.d((int) (var2.P - var6), 61);
						var3.a(true);
					} else {
						var2.i(var6, -1503604504);
						var2.d((int) (var2.P - var6), 61);
						var3.a(true);
					}
				}
			}
		} catch (RuntimeException var27) {
			throw ec.a(var27, "ci.B(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	ci(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			this.int_mb = var2;
			this.int_pb = var3;
			this.int_sb = var4;
			this.int_gb = var6 + var7;
			this.int_wb = var5;
			this.int_ob = var1;
			int var8 = v.c(this.int_ob, -18753).Z;
			if (var8 == -1) {
				this.boolean_rb = true;
			} else {
				this.boolean_rb = false;
				this.bi_lb = client.a(12, var8);
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "ci.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
}
