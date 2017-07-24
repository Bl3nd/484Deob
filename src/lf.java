import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

final class lf implements wf {

	static int int_a;
	static int int_b;
	static int int_c = 0;
	static int int_d;
	static int int_e;
	private int int_f;
	static int int_g;
	static int int_h;
	static int int_i;
	static int int_j;
	static int int_k;
	static int int_l;
	static int int_m;
	static int int_n;
	static int int_o;
	static int int_p;
	static boolean boolean_q = false;
	static int int_r;
	static int int_s;
	static int int_t;
	static int int_u;
	static tf tf_v = new tf();
	static int int_w;
	static int x;
	static int y;
	static boolean z;
	static int A;
	static int B;
	static long[] C = new long[200];
	static int D;
	private boolean E = true;
	static int F;
	static int G;
	static int H;
	static int I;
	static int J = 0;
	static int K;
	static int L;
	static int M;
	static int N;
	static int O;
	static int[] P;
	static int Q;
	static int R;
	int S;
	static int T;
	static int U;
	static int V;
	static int W;
	static int X;
	byte[] Y;
	static int Z;
	static int int_ab;
	static lf lf_bb = dd.a("und loggen sich dann erneut ein)3", 2);
	// $FF: synthetic field
	static Class class_cb;

	final int a(lf var1, int var2) {
		int var5 = client.int_gc;

		try {
			int var3;
			label46:
			{
				if (~this.S < ~var1.S) {
					var3 = var1.S;
					if (var5 == 0) {
						break label46;
					}
				}

				var3 = this.S;
			}

			++F;
			int var4 = 0;
			if (var5 == 0 && var3 <= var4) {
				if (var2 != -10166) {
					P = null;
				}

				return this.S < var1.S ? -1 : (var1.S < this.S ? 1 : 0);
			} else {
				do {
					if ((this.Y[var4] & 255) < (255 & var1.Y[var4])) {
						return -1;
					}

					if (~(this.Y[var4] & 255) < ~(255 & var1.Y[var4])) {
						return 1;
					}

					++var4;
				} while (var3 > var4);

				if (var2 != -10166) {
					P = null;
				}

				if (this.S < var1.S) {
					return -1;
				} else if (var1.S < this.S) {
					return 1;
				} else {
					return 0;
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lf.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final lf a(byte var1) {
		int var6 = client.int_gc;

		try {
			++I;
			int var2 = 0;
			int var3 = this.S;
			if (var6 != 0) {
				++var2;
			}

			while (true) {
				if (this.S > var2) {
					if (this.Y[var2] >= 0 && this.Y[var2] <= 32 || (255 & this.Y[var2]) == 160) {
						++var2;
						continue;
					}

					if (var6 != 0) {
						--var3;
					}
				}

				while (~var3 < ~var2 && (this.Y[var3 - 1] >= 0 && this.Y[var3 - 1] <= 32 || (255 & this.Y[-1 + var3]) == 160)) {
					--var3;
				}

				if (var2 == 0 && this.S == var3) {
					return this;
				} else {
					lf var4 = new lf();
					var4.S = var3 + -var2;
					var4.Y = new byte[var4.S];
					if (var1 != 62) {
						return null;
					} else {
						int var5 = 0;
						if (var6 == 0 && ~var5 <= ~var4.S) {
							return var4;
						} else {
							do {
								var4.Y[var5] = this.Y[var2 + var5];
								++var5;
							} while (~var5 > ~var4.S);

							return var4;
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lf.G(" + var1 + ')');
		}
	}

	final lf a(int var1) {
		try {
			long var2 = this.i(109);
			++int_p;
			synchronized (class_cb != null ? class_cb : (class_cb = a("lf"))) {
				af var7;
				if (a.eh_i != null) {
					for (var7 = (af) a.eh_i.a(var2, (byte) -115); var7 != null; var7 = (af) a.eh_i.a((int) -1)) {
						if (this.e(var7.lf_q, -1)) {
							return var7.lf_q;
						}
					}
				} else {
					a.eh_i = new eh(4096);
				}

				if (var1 != 18712) {
					this.a((byte) 54, (lf) null);
				}

				var7 = new af();
				this.E = false;
				var7.lf_q = this;
				a.eh_i.a(var2, false, var7);
			}

			return this;
		} catch (RuntimeException var11) {
			throw ec.a(var11, "lf.LA(" + var1 + ')');
		}
	}

	public final int hashCode() {
		try {
			++U;
			return this.h(-108);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lf.hashCode(" + ')');
		}
	}

	final lf b(int var1) {
		int var5 = client.int_gc;

		try {
			if (var1 != -10180) {
				this.e(-24);
			}

			lf var2 = new lf();
			var2.S = this.S;
			++O;
			var2.Y = new byte[this.S];
			int var3 = 0;
			if (var5 == 0 && var3 >= this.S) {
				return var2;
			} else {
				do {
					byte var4 = this.Y[var3];
					if (~var4 <= -66 && var4 <= 90 || ~var4 <= 63 && ~var4 >= 33 && var4 != -41) {
						var4 = (byte) (var4 + 32);
					}

					var2.Y[var3] = var4;
					++var3;
				} while (var3 < this.S);

				return var2;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lf.JA(" + var1 + ')');
		}
	}

	final int a(int var1, byte var2) {
		int var9 = client.int_gc;

		try {
			if (~var1 > -2 || var1 > 36) {
				var1 = 10;
			}

			++int_s;
			if (var2 != 61) {
				return -106;
			} else {
				boolean var3 = false;
				boolean var4 = false;
				int var5 = 0;
				int var6 = 0;
				if (var9 == 0 && ~var6 <= ~this.S) {
					if (!var4) {
						throw new NumberFormatException();
					} else {
						return var5;
					}
				} else {
					do {
						label103:
						{
							int var7 = 255 & this.Y[var6];
							if (var6 == 0) {
								if (var7 == 45) {
									var3 = true;
									if (var9 == 0) {
										break label103;
									}
								}

								if (var7 == 43 && var9 == 0) {
									break label103;
								}
							}

							label104:
							{
								if (~var7 <= -49 && var7 <= 57) {
									var7 -= 48;
									if (var9 == 0) {
										break label104;
									}
								}

								if (var7 >= 65 && var7 <= 90) {
									var7 -= 55;
									if (var9 == 0) {
										break label104;
									}
								}

								if (var7 < 97 || ~var7 < -123) {
									throw new NumberFormatException();
								}

								var7 -= 87;
							}

							if (var1 <= var7) {
								throw new NumberFormatException();
							}

							if (var3) {
								var7 = -var7;
							}

							int var8 = var1 * var5 - -var7;
							if (~var5 != ~(var8 / var1)) {
								throw new NumberFormatException();
							}

							var5 = var8;
							var4 = true;
						}

						++var6;
					} while (~var6 > ~this.S);

					if (!var4) {
						throw new NumberFormatException();
					} else {
						return var5;
					}
				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "lf.P(" + var1 + ',' + var2 + ')');
		}
	}

	final boolean a(byte var1, lf var2) {
		try {
			++int_l;
			if (var2 == null) {
				return false;
			} else if (~this.S != ~var2.S) {
				return false;
			} else {
				int var3 = 0;
				if (var1 != -121) {
					return false;
				} else {
					while (var3 < this.S) {
						byte var5 = var2.Y[var3];
						byte var4 = this.Y[var3];
						if (~var5 <= -66 && var5 <= 90 || var5 >= -64 && ~var5 >= 33 && ~var5 != 40) {
							var5 = (byte) (var5 + 32);
						}

						if (~var4 <= -66 && ~var4 >= -91 || ~var4 <= 63 && ~var4 >= 33 && var4 != -41) {
							var4 = (byte) (var4 + 32);
						}

						if (var4 != var5) {
							return false;
						}

						++var3;
					}

					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lf.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final int a(int var1, int var2) {
		try {
			++Z;
			int var3 = 48 / ((-9 - var1) / 39);
			return 255 & this.Y[var2];
		} catch (RuntimeException var4) {
			throw ec.a(var4, "lf.W(" + var1 + ',' + var2 + ')');
		}
	}

	static final void c(int var0) {
		try {
			++A;
			jf var1 = (jf) q.tf_cb.c(89);
			if (var0 >= 89) {
				for (; var1 != null; var1 = (jf) q.tf_cb.d(-1)) {
					if (var1.jb_r != null) {
						pe.t_b.b(var1.jb_r);
						var1.jb_r = null;
					}

					if (var1.jb_p != null) {
						pe.t_b.b(var1.jb_p);
						var1.jb_p = null;
					}
				}

				q.tf_cb.e(-15004);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lf.U(" + var0 + ')');
		}
	}

	final int b(byte var1) {
		try {
			int var2 = 83 % ((76 - var1) / 42);
			++B;
			return this.a(10, (byte) 61);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lf.C(" + var1 + ')');
		}
	}

	final boolean d(int var1) {
		try {
			if (var1 != -29838) {
				this.b(false);
			}

			++int_w;
			return this.b(10, var1 ^ 1178);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lf.E(" + var1 + ')');
		}
	}

	public final String toString() {
		try {
			++int_e;
			return "String: " + new String(Y);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lf.toString(" + ')');
		}
	}

	final int a(int var1, byte var2, int var3) {
		int var6 = client.int_gc;

		try {
			++L;
			byte var4 = (byte) var1;
			if (var2 <= 26) {
				lf_bb = null;
			}

			int var5 = var3;
			if (var6 == 0 && ~this.S >= ~var3) {
				return -1;
			} else {
				do {
					if (~this.Y[var5] == ~var4) {
						return var5;
					}

					++var5;
				} while (~this.S < ~var5);

				return -1;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lf.F(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final long a(boolean var1) {
		try {
			long var2 = 0L;
			int var4 = 0;
			if (var4 < this.S) {
				do {
					var2 *= 37L;
					byte var5 = this.Y[var4];
					if (var5 >= 65 && var5 <= 90) {
						var2 += (long) (-65 + var5 + 1);
					} else if (var5 >= 97 && var5 <= 122) {
						var2 += (long) (var5 + -96);
					} else if (var5 >= 48 && var5 <= 57) {
						var2 += (long) (var5 + -21);
					}

					++var4;
				} while (var4 < this.S && var4 < 12);
			}

			++int_t;
			if (var1) {
				return 10L;
			} else {
				while (var2 % 37L == 0L && var2 != 0L) {
					var2 /= 37L;
				}

				return var2;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lf.D(" + var1 + ')');
		}
	}

	private final boolean b(int var1, int var2) {
		int var9 = client.int_gc;

		try {
			if (var1 < 1 || var1 > 36) {
				var1 = 10;
			}

			boolean var3 = false;
			++int_b;
			boolean var4 = false;
			if (var2 != -28696) {
				P = null;
			}

			int var5 = 0;
			int var6 = 0;
			if (var9 == 0 && ~this.S >= ~var6) {
				return var4;
			} else {
				while (true) {
					label93:
					{
						int var7 = this.Y[var6] & 255;
						if (var6 == 0) {
							if (var7 == 45) {
								var3 = true;
								if (var9 == 0) {
									break label93;
								}
							}

							if (~var7 == -44 && var9 == 0) {
								break label93;
							}
						}

						label94:
						{
							if (~var7 <= -49 && var7 <= 57) {
								var7 -= 48;
								if (var9 == 0) {
									break label94;
								}
							}

							if (~var7 <= -66 && var7 <= 90) {
								var7 -= 55;
							} else {
								if (~var7 > -98 || ~var7 < -123) {
									break;
								}

								var7 -= 87;
								if (var9 != 0) {
									break;
								}
							}
						}

						if (var1 <= var7) {
							return false;
						}

						if (var3) {
							var7 = -var7;
						}

						int var8 = var7 + var1 * var5;
						if (~var5 != ~(var8 / var1)) {
							return false;
						}

						var5 = var8;
						var4 = true;
					}

					++var6;
					if (~this.S >= ~var6) {
						return var4;
					}
				}

				return false;
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "lf.BA(" + var1 + ',' + var2 + ')');
		}
	}

	final int e(int var1) {
		try {
			if (var1 != -30593) {
				z = true;
			}

			++int_u;
			return this.S;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lf.T(" + var1 + ')');
		}
	}

	final lf b(boolean var1) {
		int var4 = client.int_gc;

		try {
			lf var2 = new lf();
			var2.S = this.S;
			++int_k;
			var2.Y = new byte[this.S];
			if (var1) {
				J = 71;
			}

			int var3 = 0;
			if (var4 != 0) {
				var2.Y[var3] = 42;
				++var3;
			}

			while (~this.S < ~var3) {
				var2.Y[var3] = 42;
				++var3;
			}

			return var2;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lf.S(" + var1 + ')');
		}
	}

	final int a(FontMetrics var1, byte var2) {
		try {
			if (var2 > -96) {
				return 88;
			} else {
				++int_o;

				String var3;
				try {
					var3 = new String(this.Y, 0, this.S, "ISO-8859-1");
				} catch (UnsupportedEncodingException var4) {
					var3 = new String(this.Y, 0, this.S);
				}

				return var1.stringWidth(var3);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lf.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final URL f(int var1) throws MalformedURLException {
		try {
			if (var1 != 0) {
				this.a(true);
			}

			++int_h;
			return new URL(new String(this.Y, 0, this.S));
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lf.L(" + var1 + ')');
		}
	}

	final int a(int var1, byte[] var2, int var3, int var4, byte var5) {
		try {
			na.a(this.Y, var3, var2, var1, -var3 + var4);
			if (var5 != 9) {
				return 55;
			} else {
				++R;
				return var4 - var3;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lf.N(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	final lf g(int var1) {
		try {
			++Q;
			if (!this.E) {
				throw new IllegalArgumentException();
			} else {
				if (var1 != 18879) {
					tf_v = null;
				}

				this.int_f = 0;
				if (this.Y.length != this.S) {
					byte[] var2 = new byte[this.S];
					na.a((byte[]) this.Y, 0, (byte[]) var2, 0, this.S);
					this.Y = var2;
				}

				return this;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lf.R(" + var1 + ')');
		}
	}

	final void a(int var1, int var2, int var3, Graphics var4) {
		try {
			String var5;
			try {
				var5 = new String(this.Y, var3, this.S, "ISO-8859-1");
			} catch (UnsupportedEncodingException var6) {
				var5 = new String(this.Y, 0, this.S);
			}

			++y;
			var4.drawString(var5, var1, var2);
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lf.B(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean b(byte var1, lf var2) {
		int var4 = client.int_gc;

		try {
			++int_j;
			if (var1 >= -67) {
				this.b(false);
			}

			if (~var2.S < ~this.S) {
				return false;
			} else {
				int var3 = 0;
				if (var4 == 0 && var3 >= var2.S) {
					return true;
				} else {
					do {
						if (var2.Y[var3] != this.Y[var3]) {
							return false;
						}

						++var3;
					} while (var3 < var2.S);

					return true;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lf.GA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final lf a(int var1, int var2, int var3) {
		try {
			lf var4 = new lf();
			var4.Y = new byte[-var2 + var1];
			if (var3 < 43) {
				boolean_q = true;
			}

			var4.S = var1 - var2;
			++D;
			na.a((byte[]) this.Y, var2, (byte[]) var4.Y, 0, var4.S);
			return var4;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lf.HA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final lf b(lf var1, int var2) {
		int var5 = client.int_gc;

		try {
			++K;
			if (var2 > -54) {
				return null;
			} else if (!this.E) {
				throw new IllegalArgumentException();
			} else {
				this.int_f = 0;
				if (~this.Y.length > ~(this.S + var1.S)) {
					int var3 = 1;
					if (var5 != 0) {
						var3 += var3;
					}

					while (var3 < this.S - -var1.S) {
						var3 += var3;
					}

					byte[] var4 = new byte[var3];
					na.a((byte[]) this.Y, 0, (byte[]) var4, 0, this.S);
					this.Y = var4;
				}

				na.a((byte[]) var1.Y, 0, (byte[]) this.Y, this.S, var1.S);
				this.S += var1.S;
				return this;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lf.Q(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public static void c(boolean var0) {
		try {
			tf_v = null;
			lf_bb = null;
			P = null;
			C = null;
			if (!var0) {
				c((int) -110);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lf.CA(" + var0 + ')');
		}
	}

	final lf d(boolean var1) {
		try {
			if (!var1) {
				return null;
			} else {
				++M;
				lf var2 = of.a((byte) 86, this.a(false));
				return var2 == null ? re.lf_d : var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lf.V(" + var1 + ')');
		}
	}

	final lf c(int var1, int var2) {
		try {
			if (var1 != -41) {
				this.a(61, 14, (lf) null);
			}

			++G;
			return this.a(this.S, var2, var1 ^ -105);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "lf.FA(" + var1 + ',' + var2 + ')');
		}
	}

	final int c(lf var1, int var2) {
		try {
			if (var2 <= 9) {
				this.S = -33;
			}

			++int_i;
			return this.a(-99, 0, var1);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "lf.NA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final lf d(int var1, int var2) {
		try {
			++int_ab;
			if (~var2 < -1 && ~var2 >= -256) {
				if (var1 != 117) {
					J = 26;
				}

				lf var3 = new lf();
				var3.Y = new byte[1 + this.S];
				var3.S = 1 + this.S;
				na.a((byte[]) this.Y, 0, (byte[]) var3.Y, 0, this.S);
				var3.Y[this.S] = (byte) var2;
				return var3;
			} else {
				throw new IllegalArgumentException("invalid char");
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "lf.EA(" + var1 + ',' + var2 + ')');
		}
	}

	final boolean d(lf var1, int var2) {
		int var5 = client.int_gc;

		try {
			++int_d;
			if (this.S < var1.S) {
				return false;
			} else {
				int var3 = this.S + -var1.S;
				int var4 = var2;
				if (var5 == 0 && var2 >= var1.S) {
					return true;
				} else {
					do {
						if (this.Y[var4 + var3] != var1.Y[var4]) {
							return false;
						}

						++var4;
					} while (var4 < var1.S);

					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lf.MA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final lf e(int var1, int var2) {
		int var5 = client.int_gc;

		try {
			++x;
			if (~var2 < -1 && ~var2 >= -256) {
				if (!this.E) {
					throw new IllegalArgumentException();
				} else {
					if (var1 != -64) {
						this.int_f = -84;
					}

					this.int_f = 0;
					if (this.Y.length == this.S) {
						int var3 = 1;
						if (var5 != 0) {
							var3 += var3;
						}

						while (~var3 >= ~this.S) {
							var3 += var3;
						}

						byte[] var4 = new byte[var3];
						na.a((byte[]) this.Y, 0, (byte[]) var4, 0, this.S);
						this.Y = var4;
					}

					this.Y[this.S++] = (byte) var2;
					return this;
				}
			} else {
				throw new IllegalArgumentException("invalid char:" + var2);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lf.DA(" + var1 + ',' + var2 + ')');
		}
	}

	final int h(int var1) {
		try {
			int var2 = 0;
			++W;
			if (var1 > -51) {
				int_c = 6;
			}

			for (int var3 = 0; ~this.S < ~var3; ++var3) {
				var2 = -var2 + ((var2 << 867680933) - -(this.Y[var3] & 255));
			}

			return var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "lf.AA(" + var1 + ')');
		}
	}

	public final boolean equals(Object var1) {
		try {
			++int_a;
			if (var1 instanceof lf) {
				return this.e((lf) var1, -1);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lf.equals(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final int a(int var1, int var2, lf var3) {
		int var17 = client.int_gc;

		try {
			++X;
			int[] var4 = new int[var3.S];
			int[] var5 = new int[256];
			int[] var6 = new int[var3.S];
			int var7 = 0;
			if (var17 != 0) {
				var5[var7] = var3.S;
				++var7;
			}

			while (~var7 > ~var5.length) {
				var5[var7] = var3.S;
				++var7;
			}

			int var8 = 1;
			if (var1 >= -31) {
				return -61;
			} else {
				while (var3.S >= var8) {
					var4[var8 + -1] = (var3.S << 472801217) + -var8;
					var5[sd.a(var3.Y[var8 + -1], 255)] = var3.S - var8;
					++var8;
				}

				int var9 = var3.S + 1;
				int var10 = var3.S;
				if (var17 != 0 || var10 > 0) {
					do {
						var6[-1 + var10] = var9;
						if (var17 != 0 || var3.S >= var9 && var3.Y[var10 + -1] != var3.Y[var9 - 1]) {
							do {
								if (~(-var10 + var3.S) >= ~var4[var9 - 1]) {
									var4[var9 - 1] = var3.S + -var10;
								}

								var9 = var6[-1 + var9];
							} while (var3.S >= var9 && var3.Y[var10 + -1] != var3.Y[var9 - 1]);
						}

						--var9;
						--var10;
					} while (var10 > 0);
				}

				int var12 = 1;
				int var11 = var9;
				int var13 = 0;
				var9 = var3.S + 1 - var9;
				int var14 = 1;
				if (var17 != 0) {
					var6[-1 + var14] = var13;
					if (var17 != 0) {
						var13 = var6[var13 + -1];
					}

					while (var13 >= 1 && var3.Y[var13 - 1] != var3.Y[-1 + var14]) {
						var13 = var6[var13 + -1];
					}

					++var13;
					++var14;
				}

				while (var14 <= var9) {
					var6[-1 + var14] = var13;
					if (var17 != 0) {
						var13 = var6[var13 + -1];
					}

					while (var13 >= 1 && var3.Y[var13 - 1] != var3.Y[-1 + var14]) {
						var13 = var6[var13 + -1];
					}

					++var13;
					++var14;
				}

				int var15;
				if (var17 != 0 || ~var11 > ~var3.S) {
					do {
						var15 = var12;
						if (var17 == 0 && var12 > var11) {
							var12 = 1 + var11;
							var11 = var9 + (var11 - var6[var9 + -1]);
							var9 = var6[-1 + var9];
						} else {
							do {
								if (var3.S - (-var11 - -var15) <= var4[-1 + var15]) {
									var4[-1 + var15] = -var15 + var11 + var3.S;
								}

								++var15;
							} while (var15 <= var11);

							var12 = 1 + var11;
							var11 = var9 + (var11 - var6[var9 + -1]);
							var9 = var6[-1 + var9];
						}
					} while (~var11 > ~var3.S);
				}

				var15 = -1 + var3.S + var2;
				if (var17 == 0 && this.S <= var15) {
					return -1;
				} else {
					do {
						int var16 = -1 + var3.S;
						if (var17 != 0) {
							--var15;
							--var16;
						}

						while (~var16 <= -1 && ~this.Y[var15] == ~var3.Y[var16]) {
							--var15;
							--var16;
						}

						if (var16 == -1) {
							return var15 - -1;
						}

						var15 += Math.max(var5[this.Y[var15] & 255], var4[var16]);
					} while (this.S > var15);

					return -1;
				}
			}
		} catch (RuntimeException var18) {
			throw ec.a(var18, "lf.OA(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private final long i(int var1) {
		try {
			long var2 = 0L;
			int var4 = -67 % ((var1 - 57) / 40);
			++N;

			for (int var5 = 0; ~var5 > ~this.S; ++var5) {
				var2 = (var2 << -973900027) - var2 + (long) (255 & this.Y[var5]);
			}

			return var2;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lf.O(" + var1 + ')');
		}
	}

	final int a(int var1, lf var2) {
		int var5 = client.int_gc;

		try {
			int var3;
			label69:
			{
				++int_g;
				if (var2.S < this.S) {
					var3 = var2.S;
					if (var5 == 0) {
						break label69;
					}
				}

				var3 = this.S;
			}

			if (var1 > -89) {
				return -69;
			} else {
				int var4 = 0;
				if (var5 == 0 && var4 >= var3) {
					return ~this.S > ~var2.S ? -1 : (this.S > var2.S ? 1 : 0);
				} else {
					do {
						if (ea.ints_j[this.Y[var4] & 255] < ea.ints_j[255 & var2.Y[var4]]) {
							return -1;
						}

						if (ea.ints_j[255 & var2.Y[var4]] < ea.ints_j[255 & this.Y[var4]]) {
							return 1;
						}

						++var4;
					} while (var4 < var3);

					if (~this.S > ~var2.S) {
						return -1;
					} else if (this.S > var2.S) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "lf.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final byte[] c(byte var1) {
		try {
			if (var1 != 62) {
				C = null;
			}

			byte[] var2 = new byte[this.S];
			++int_m;
			na.a((byte[]) this.Y, 0, (byte[]) var2, 0, this.S);
			return var2;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lf.I(" + var1 + ')');
		}
	}

	final lf d(byte var1) {
		int var6 = client.int_gc;

		try {
			lf var2 = new lf();
			++V;
			if (var1 != -68) {
				return null;
			} else {
				byte var3 = 2;
				var2.S = this.S;
				var2.Y = new byte[this.S];
				int var4 = 0;
				if (var6 == 0 && ~this.S >= ~var4) {
					return var2;
				} else {
					do {
						byte var5;
						label113:
						{
							var5 = this.Y[var4];
							if (var5 >= 97 && var5 <= 122 || var5 >= -32 && ~var5 >= 1 && var5 != -9) {
								if (var3 == 2) {
									var5 = (byte) (var5 - 32);
								}

								var3 = 0;
								if (var6 == 0) {
									break label113;
								}
							}

							if (~var5 <= -66 && var5 <= 90 || ~var5 <= 63 && ~var5 >= 33 && ~var5 != 40) {
								if (var3 == 0) {
									var5 = (byte) (var5 + 32);
								}

								var3 = 0;
								if (var6 == 0) {
									break label113;
								}
							}

							if (var5 != 46 && ~var5 != -34 && var5 != 63) {
								if (var5 == 32) {
									if (var3 == 2) {
										break label113;
									}

									var3 = 1;
									if (var6 == 0) {
										break label113;
									}
								}

								var3 = 1;
								if (var6 == 0) {
									break label113;
								}
							}

							var3 = 2;
						}

						var2.Y[var4] = var5;
						++var4;
					} while (~this.S < ~var4);

					return var2;
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lf.J(" + var1 + ')');
		}
	}

	final boolean e(lf var1, int var2) {
		try {
			++int_r;
			if (var2 != -1) {
				int_c = 35;
			}

			if (var1 == null) {
				return false;
			} else if (this.S != var1.S) {
				return false;
			} else {
				if (!this.E || !var1.E) {
					if (this.int_f == 0) {
						this.int_f = this.h(var2 + -56);
						if (~this.int_f == -1) {
							this.int_f = 1;
						}
					}

					if (~var1.int_f == -1) {
						var1.int_f = var1.h(-55);
						if (~var1.int_f == -1) {
							var1.int_f = 1;
						}
					}

					if (this.int_f != var1.int_f) {
						return false;
					}
				}

				for (int var3 = 0; var3 < this.S; ++var3) {
					if (this.Y[var3] != var1.Y[var3]) {
						return false;
					}
				}

				return true;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "lf.KA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final lf e(boolean var1) {
		try {
			++T;
			lf var2 = new lf();
			var2.S = this.S;
			var2.Y = new byte[this.S];
			boolean var3 = var1;
			int var4 = 0;
			if (this.S <= var4) {
				return var2;
			} else {
				do {
					byte var5 = this.Y[var4];
					if (var5 == 95) {
						var3 = true;
						var2.Y[var4] = 32;
					} else if (var5 < 97 || var5 > 122 || !var3) {
						var3 = false;
						var2.Y[var4] = var5;
					} else {
						var2.Y[var4] = (byte) (var5 + -32);
						var3 = false;
					}

					++var4;
				} while (this.S > var4);

				return var2;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lf.IA(" + var1 + ')');
		}
	}

	// $FF: synthetic method
	static Class a(String var0) {
		try {
			return Class.forName(var0);
		} catch (ClassNotFoundException var2) {
			throw new NoClassDefFoundError(var2.getMessage());
		}
	}
}
