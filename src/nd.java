import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

final class nd implements Runnable {

	static int int_a = 1;
	private byte[] bytes_b;
	private ke ke_c;
	private boolean boolean_d = false;
	private int int_e = 0;
	static int int_f;
	static lf compass = dd.a("compass", 2);//lf_g
	static int int_h;
	static int int_i;
	static int int_j;
	static int[] ints_k = new int[2048];
	private int int_l = 0;
	static int int_m;
	private Socket socket_n;
	static int int_o;
	static int int_p;
	static int int_q;
	static int int_r = 0;
	static int int_s;
	static bg cache8;//bg_t
	static int int_u;
	private InputStream inputStream_v;
	static int int_w;
	private da x;
	static int y;
	private boolean z = false;
	private OutputStream A;
	static lf assistFlag = dd.a(":assist:", 2);
	static int C;
	static int D;

	final void a(int var1, int len, byte[] buf, int off) throws IOException {
		try {
			int var5 = 96 % ((var1 - 54) / 46);
			++int_m;
			if (!this.boolean_d) {
				while (~len < -1) {
					int var6 = this.inputStream_v.read(buf, off, len);
					if (~var6 >= -1) {
						throw new EOFException();
					}

					off += var6;
					len -= var6;
				}

			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "nd.L(" + var1 + ',' + len + ',' + (buf != null ? "{...}" : "null") + ',' + off + ')');
		}
	}

	final int a(int var1) throws IOException {
		try {
			++int_f;
			if (this.boolean_d) {
				return 0;
			} else {
				if (var1 > -65) {
					a(false, (bg) null);
				}

				return this.inputStream_v.available();
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "nd.I(" + var1 + ')');
		}
	}

	final void a(int unused, int off, int len, byte[] buf) throws IOException {
		int dummy = client.int_gc;
		try {
			++int_j;
			if (!this.boolean_d) {
				if (this.z) {
					this.z = false;
					throw new IOException();
				} else {
					if (this.bytes_b == null) {
						this.bytes_b = new byte[5000];
					}

					synchronized (this) {
						int index = 0;
						if (dummy != 0 || len > index) {
							do {
								this.bytes_b[this.int_e] = buf[off + index];
								this.int_e = (1 + this.int_e) % 5000;
								if (~((this.int_l - -4900) % 5000) == ~this.int_e) {
									throw new IOException();
								}

								++index;
							} while (len > index);
						}

						if (this.x == null) {
							this.x = this.ke_c.a(this, 3, (byte) 46);
						}

						this.notifyAll();
					}

					if (unused >= -40) {
						y = -35;
					}
				}
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "nd.K(" + unused + ',' + off + ',' + len + ',' + (buf != null ? "{...}" : "null") + ')');
		}
	}

	public static void b(int var0) {
		try {
			assistFlag = null;
			compass = null;
			if (var0 != -1147533848) {
				a((vg) null, -73, (lf) null);
			}

			ints_k = null;
			cache8 = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nd.F(" + var0 + ')');
		}
	}

	static final void c(int var0) {
		int var14 = client.int_gc;

		try {
			short var1;
			int var2;
			label215:
			{
				++int_i;
				var1 = 256;
				if (~nf.int_d < -1) {
					var2 = 0;
					if (var14 != 0 || var2 < 256) {
						do {
							label217:
							{
								if (~nf.int_d < -769) {
									mc.ints_s[var2] = sg.a(hg.ints_m[var2], 1024 + -nf.int_d, pd.ints_h[var2], (byte) 120);
									if (var14 == 0) {
										break label217;
									}
								}

								if (~nf.int_d < -257) {
									mc.ints_s[var2] = pd.ints_h[var2];
									if (var14 == 0) {
										break label217;
									}
								}

								mc.ints_s[var2] = sg.a(pd.ints_h[var2], 256 - nf.int_d, hg.ints_m[var2], (byte) 126);
							}

							++var2;
						} while (var2 < 256);
					}

					if (var14 == 0) {
						break label215;
					}
				}

				if (~jh.int_k < -1) {
					var2 = 0;
					if (var14 != 0 || var2 < 256) {
						do {
							label219:
							{
								if (~jh.int_k < -769) {
									mc.ints_s[var2] = sg.a(hg.ints_m[var2], 1024 - jh.int_k, sd.ints_ab[var2], (byte) 103);
									if (var14 == 0) {
										break label219;
									}
								}

								if (~jh.int_k >= -257) {
									mc.ints_s[var2] = sg.a(sd.ints_ab[var2], -jh.int_k + 256, hg.ints_m[var2], (byte) 121);
									if (var14 == 0) {
										break label219;
									}
								}

								mc.ints_s[var2] = sd.ints_ab[var2];
							}

							++var2;
						} while (var2 < 256);
					}

					if (var14 == 0) {
						break label215;
					}
				}

				var2 = 0;
				if (var14 != 0 || ~var2 > -257) {
					do {
						mc.ints_s[var2] = hg.ints_m[var2];
						++var2;
					} while (~var2 > -257);
				}
			}

			if (var0 < -9) {
				int var3 = kd.kf_mb.Q * 9;
				var2 = 0;
				int var4 = 0;
				int var5 = 1;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				if (var14 != 0 || var5 < var1 + -1) {
					do {
						var6 = 22 + (-var5 + var1) * v.ints_ub[var5] / var1;
						if (var6 < 0) {
							var6 = 0;
						}

						var2 += var6;
						var7 = var6;
						if (var14 == 0 && var6 >= 128) {
							var8 = 0;
							if (var14 != 0) {
								hh.W.O[var4++] = kd.kf_mb.O[var3++];
								++var8;
							}

							while (~var6 < ~var8) {
								hh.W.O[var4++] = kd.kf_mb.O[var3++];
								++var8;
							}

							var3 += -128 + kd.kf_mb.Q;
							++var5;
						} else {
							do {
								label105:
								{
									var8 = dg.ints_k[var2++];
									var9 = kd.kf_mb.O[var3++];
									if (var8 != 0) {
										var10 = var8;
										var11 = 256 + -var8;
										var8 = mc.ints_s[var8];
										hh.W.O[var4++] = sd.a(16711680, sd.a(var8, '\uff00') * var10 + var11 * sd.a('\uff00', var9)) + sd.a(-16711936, sd.a(16711935, var8) * var10 + var11 * sd.a(var9, 16711935)) >> 1144018408;
										if (var14 == 0) {
											break label105;
										}
									}

									hh.W.O[var4++] = var9;
								}

								++var7;
							} while (var7 < 128);

							var8 = 0;
							if (var14 != 0) {
								hh.W.O[var4++] = kd.kf_mb.O[var3++];
								++var8;
							}

							while (~var6 < ~var8) {
								hh.W.O[var4++] = kd.kf_mb.O[var3++];
								++var8;
							}

							var3 += -128 + kd.kf_mb.Q;
							++var5;
						}
					} while (var5 < var1 + -1);
				}

				hh.W.b(0, 9);
				var4 = 0;
				var3 = 128 + 9 * kd.kf_mb.Q;
				var2 = 0;
				var6 = 1;
				if (var14 == 0 && var1 + -1 <= var6) {
					rc.kf_l.b(637, 9);
				} else {
					do {
						var7 = 22 - -((-var6 + var1) * v.ints_ub[var6] / var1);
						if (var7 < 0) {
							var7 = 0;
						}

						var8 = 0;
						int var10001;
						if (var14 != 0) {
							var10001 = var4++;
							--var3;
							rc.kf_l.O[var10001] = kd.kf_mb.O[var3];
							++var8;
						}

						while (var8 < var7) {
							var10001 = var4++;
							--var3;
							rc.kf_l.O[var10001] = kd.kf_mb.O[var3];
							++var8;
						}

						var9 = var7;
						if (var14 != 0 || ~var7 > -129) {
							do {
								label71:
								{
									--var3;
									var11 = kd.kf_mb.O[var3];
									var10 = dg.ints_k[var2++];
									if (var10 == 0) {
										rc.kf_l.O[var4++] = var11;
										if (var14 == 0) {
											break label71;
										}
									}

									int var12 = var10;
									int var13 = -var10 + 256;
									var10 = mc.ints_s[var10];
									rc.kf_l.O[var4++] = sd.a(-16711936, var13 * sd.a(var11, 16711935) + var12 * sd.a(16711935, var10)) - -sd.a(16711680, sd.a(var11, '\uff00') * var13 + sd.a(var10, '\uff00') * var12) >> -1147533848;
								}

								++var9;
							} while (~var9 > -129);

							var3 += kd.kf_mb.Q - -128;
							var2 += var7;
							++var6;
						} else {
							var3 += kd.kf_mb.Q - -128;
							var2 += var7;
							++var6;
						}
					} while (var1 + -1 > var6);

					rc.kf_l.b(637, 9);
				}
			}
		} catch (RuntimeException var15) {
			throw ec.a(var15, "nd.G(" + var0 + ')');
		}
	}

	static final lf a(vg var0, int var1, lf var2) {
		int var6 = client.int_gc;

		try {
			if (~var2.c(cb.lf_b, 59) != 0) {
				int var3;
				do {
					var3 = var2.c(cg.O, var1 ^ 1121);
					if (~var3 == 0) {
						break;
					}

					var2 = de.a(new lf[]{var2.a(var3, (int) 0, var1 + -961), af.a((byte) -91, tf.a(var0, var1 ^ 1034, 0)), var2.c(-41, 2 + var3)}, var1 ^ 1141);
				} while (var6 == 0);

				do {
					var3 = var2.c(ka.M, var1 ^ 1125);
					if (var3 == -1) {
						break;
					}

					var2 = de.a(new lf[]{var2.a(var3, (int) 0, 102), af.a((byte) -99, tf.a(var0, 10, 1)), var2.c(-41, var3 + 2)}, var1 + -1138);
				} while (var6 == 0);

				do {
					var3 = var2.c(ug.lf_eb, 28);
					if (~var3 == 0) {
						break;
					}

					var2 = de.a(new lf[]{var2.a(var3, (int) 0, 80), af.a((byte) -85, tf.a(var0, 10, 2)), var2.c(-41, var3 + 2)}, var1 ^ 1143);
				} while (var6 == 0);

				do {
					var3 = var2.c(th.lf_h, 126);
					if (var3 == -1) {
						break;
					}

					var2 = de.a(new lf[]{var2.a(var3, (int) 0, 122), af.a((byte) -33, tf.a(var0, 10, 3)), var2.c(-41, 2 + var3)}, var1 + -901);
				} while (var6 == 0);

				do {
					var3 = var2.c(pa.lf_m, 96);
					if (~var3 == 0) {
						break;
					}

					var2 = de.a(new lf[]{var2.a(var3, (int) 0, 106), af.a((byte) -100, tf.a(var0, 10, 4)), var2.c(-41, 2 + var3)}, 118);
				} while (var6 == 0);

				do {
					var3 = var2.c(ed.lf_l, 58);
					if (~var3 == 0) {
						break;
					}

					lf var4 = sh.Gb;
					if (fd.da_l != null) {
						var4 = l.a(fd.da_l.int_f, -1665);

						try {
							if (fd.da_l.object_c != null) {
								byte[] var5 = ((String) fd.da_l.object_c).getBytes("ISO-8859-1");
								var4 = wd.a(var5, var5.length, 0, false);
							}
						} catch (UnsupportedEncodingException var7) {
							;
						}
					}

					var2 = de.a(new lf[]{var2.a(var3, (int) 0, 73), var4, var2.c(-41, var3 + 4)}, var1 + -897);
				} while (var6 == 0);
			}

			if (var1 != 1024) {
				a((vg) null, 4, (lf) null);
			}

			++int_p;
			return var2;
		} catch (RuntimeException var8) {
			throw ec.a(var8, "nd.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, int var1, lb[] var2, byte[] var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var26 = client.int_gc;

		try {
			++int_w;
			ja var10 = new ja(var3);
			int var11 = -1;
			if (var9 >= -114) {
				b((byte) -115);
			}

			do {
				int var12 = var10.f((int) 0);
				if (~var12 == -1) {
					break;
				}

				int var13 = 0;
				var11 += var12;

				while (true) {
					int var14 = var10.f((int) 0);
					if (~var14 == -1) {
						break;
					}

					var13 += var14 + -1;
					int var15 = var13 & 63;
					int var16 = (4073 & var13) >> 696963878;
					int var17 = var13 >> -53748724;
					int var18 = var10.j((byte) 90);
					int var19 = var18 >> 883338050;
					int var20 = var18 & 3;
					if (~var17 == ~var4 && ~var7 >= ~var16 && ~var16 > ~(8 + var7) && ~var15 <= ~var5 && var15 < 8 + var5) {
						i var21 = pa.a((int) var11, 0);
						int var22 = var1 - -va.a(var20, var21.I, 7 & var16, var21.L, true, var15 & 7, var0);
						int var23 = ed.a(var21.I, var20, 7 & var15, var0, 3, 7 & var16, var21.L) + var6;
						if (var22 > 0 && var23 > 0 && ~var22 > -104 && ~var23 > -104) {
							lb var25 = null;
							int var24 = var8;
							if (~(jc.bytes_q[1][var22][var23] & 2) == -3) {
								var24 = var8 - 1;
							}

							if (var24 >= 0) {
								var25 = var2[var24];
							}

							w.a(var8, var11, 3 & var20 + var0, var19, 16, var25, var22, var23);
							if (var26 != 0) {
								break;
							}
						}
					}
				}
			} while (var26 == 0);

		} catch (RuntimeException var27) {
			throw ec.a(var27, "nd.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	static final int a(boolean var0, int var1) {
		try {
			--var1;
			++int_h;
			var1 |= var1 >>> 888525857;
			var1 |= var1 >>> 2065787170;
			var1 |= var1 >>> -1455939516;
			if (!var0) {
				return 64;
			} else {
				var1 |= var1 >>> 1709092168;
				var1 |= var1 >>> -1974003888;
				return var1 - -1;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "nd.C(" + var0 + ',' + var1 + ')');
		}
	}

	final int a(boolean var1) throws IOException {
		try {
			++int_q;
			if (this.boolean_d) {
				return 0;
			} else {
				if (!var1) {
					c(9);
				}

				return this.inputStream_v.read();
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "nd.E(" + var1 + ')');
		}
	}

	public final void run() {
		int var5 = client.int_gc;

		try {
			++int_o;

			try {
				while (true) {
					int var1;
					int var2;
					synchronized (this) {
						if (~this.int_e == ~this.int_l) {
							if (this.boolean_d) {
								break;
							}

							try {
								this.wait();
							} catch (InterruptedException interruptedException) {
								interruptedException.printStackTrace();
							}
						}

						label146:
						{
							if (this.int_l > this.int_e) {
								var1 = -this.int_l + 5000;
								if (var5 == 0) {
									break label146;
								}
							}

							var1 = this.int_e - this.int_l;
						}

						var2 = this.int_l;
					}

					if (~var1 < -1) {
						try {
							this.A.write(this.bytes_b, var2, var1);
						} catch (IOException var15) {
							this.z = true;
						}

						this.int_l = (var1 + this.int_l) % 5000;

						try {
							if (this.int_l == this.int_e) {
								this.A.flush();
							}
						} catch (IOException var14) {
							this.z = true;
						}
					}
				}

				try {
					if (this.inputStream_v != null) {
						this.inputStream_v.close();
					}

					if (this.A != null) {
						this.A.close();
					}

					if (this.socket_n != null) {
						this.socket_n.close();
					}
				} catch (IOException var13) {
					;
				}

				this.bytes_b = null;
			} catch (Exception var18) {
				ah.a((String) null, -35, var18);
			}
		} catch (RuntimeException var19) {
			throw ec.a(var19, "nd.run(" + ')');
		}
	}

	final void a(byte var1) {
		try {
			++C;
			if (!this.boolean_d) {
				synchronized (this) {
					this.boolean_d = true;
					this.notifyAll();
				}

				if (var1 >= -35) {
					this.x = null;
				}

				if (this.x != null) {
					while (this.x.int_a == 0) {
						fc.a(1L, -126);
					}

					if (this.x.int_a == 1) {
						try {
							((Thread) this.x.object_c).join();
						} catch (InterruptedException ie) {
							ie.printStackTrace();
						}
					}
				}

				this.x = null;
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "nd.B(" + var1 + ')');
		}
	}

	static final void a(boolean var0, bg var1) {
		try {
			qb.T = var1;
			if (var0) {
				a((vg) null, 51, (lf) null);
			}

			++int_u;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "nd.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	nd(Socket socket, ke var2) throws IOException {
		try {
			this.ke_c = var2;
			this.socket_n = socket;
			this.socket_n.setSoTimeout(30000);
			this.socket_n.setTcpNoDelay(true);
			this.inputStream_v = this.socket_n.getInputStream();
			this.A = this.socket_n.getOutputStream();
		} catch (RuntimeException var4) {
			throw ec.a(var4, "nd.<init>(" + (socket != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void b(byte var0) {
		try {
			jc.a(2047);
			la.a((byte) 124);
			ef.b(121);
			cc.e((byte) -99);
			ed.a((byte) 25);
			++int_s;
			tc.e((byte) 109);
			od.e(109);
			ub.e(5041);
			gg.a((byte) 114);
			v.f(64);
			ab.a(113);
			me.c((byte) -7);
			((bc) nc.Z).a((int) 2);
			cg.L.c(-51);
			ga.cache0.c((int) 512);
			ee.cache1.c((int) 512);
			ff.cache3.c((int) 512);
			of.cache4.c((int) 512);
			se.cache5.c((int) 512);
			l.cache6.c((int) 512);
			sh.cache7.c((int) 512);
			if (var0 >= -57) {
				y = 72;
			}

			hd.cache8.c((int) 512);
			dh.cache10.c((int) 512);
			ka.cache11.c((int) 512);
			ei.cache12.c((int) 512);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nd.J(" + var0 + ')');
		}
	}

	protected final void finalize() {
		try {
			++D;
			this.a((byte) -69);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nd.finalize(" + ')');
		}
	}
}
