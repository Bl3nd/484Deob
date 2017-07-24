import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

final class ib {

	private DataInputStream dataInputStream_a;
	private byte[] bytes_b = new byte[4];
	static int int_c;
	static lf lf_d;
	private byte[] bytes_e;
	static int int_f = (int) (17.0D * Math.random()) - 8;
	static int[] ints_g = new int[5];
	static int int_h;
	private static lf lf_i = dd.a("You can(Wt add yourself to your own ignore list)3", 2);
	private int int_j;
	private int int_k;
	static lf lf_l = dd.a("<col=00ffff>", 2);
	static int[] ints_m = new int[128];
	private long long_n;
	private da da_o;
	private int int_p;
	static int int_q;
	static lf lf_r = dd.a("Zu viele Verbindungen von Ihrer Adresse)3", 2);
	static volatile boolean boolean_s = true;

	static void a(int var0) {
		try {
			int var1 = 87 / ((-20 - var0) / 49);
			++int_c;
			if (ke.string_h.toLowerCase().contains("microsoft")) {
				ld.ints_cb[188] = 71;
				ld.ints_cb[186] = 57;
				ld.ints_cb[222] = 59;
				ld.ints_cb[190] = 72;
				ld.ints_cb[191] = 73;
				ld.ints_cb[220] = 74;
				ld.ints_cb[223] = 28;
				ld.ints_cb[221] = 43;
				ld.ints_cb[192] = 58;
				ld.ints_cb[187] = 27;
				ld.ints_cb[189] = 26;
				ld.ints_cb[219] = 42;
			} else {
				ld.ints_cb[44] = 71;
				ld.ints_cb[93] = 43;
				ld.ints_cb[92] = 74;
				ld.ints_cb[47] = 73;
				if (ke.method_r == null) {
					ld.ints_cb[192] = 58;
					ld.ints_cb[222] = 59;
				} else {
					ld.ints_cb[520] = 59;
					ld.ints_cb[192] = 28;
					ld.ints_cb[222] = 58;
				}

				ld.ints_cb[59] = 57;
				ld.ints_cb[61] = 27;
				ld.ints_cb[45] = 26;
				ld.ints_cb[46] = 72;
				ld.ints_cb[91] = 42;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ib.A(" + var0 + ')');
		}
	}

	static int a(byte var0, int var1, int var2) {
		int var4 = client.int_gc;

		try {
			++int_h;
			if (var0 < 89) {
				return 63;
			} else {
				int var3 = 1;
				if (var4 == 0 && var2 <= 1) {
					return var2 == 1 ? var1 * var3 : var3;
				} else {
					do {
						if ((var2 & 1) != 0) {
							var3 *= var1;
						}

						var1 *= var1;
						var2 >>= 1;
					} while (var2 > 1);

					if (var2 == 1) {
						return var1 * var3;
					} else {
						return var3;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ib.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	final byte[] b(int var1) throws IOException {
		try {
			++int_q;
			if (~this.long_n > ~nb.a(false)) {
				throw new IOException("fdt");
			} else {
				if (this.int_p == 0) {
					if (this.da_o.int_a == 2) {
						throw new IOException("fds");
					}

					if (this.da_o.int_a == 1) {
						this.int_p = 1;
						this.dataInputStream_a = (DataInputStream) this.da_o.object_c;
					}
				}

				int var2;
				if (this.int_p == var1) {
					var2 = this.dataInputStream_a.available();
					if (~var2 < -1) {
						if (~(this.int_k + var2) < -5) {
							var2 = 4 - this.int_k;
						}

						this.int_k += this.dataInputStream_a.read(this.bytes_b, this.int_k, var2);
						if (~this.int_k == -5) {
							int var3 = (new ja(this.bytes_b)).l(15);
							this.bytes_e = new byte[var3];
							this.int_p = 2;
						}
					}
				}

				if (~this.int_p == -3) {
					var2 = this.dataInputStream_a.available();
					if (var2 > 0) {
						if (~(this.int_j + var2) < ~this.bytes_e.length) {
							var2 = this.bytes_e.length + -this.int_j;
						}

						this.int_j += this.dataInputStream_a.read(this.bytes_e, this.int_j, var2);
						if (~this.bytes_e.length == ~this.int_j) {
							return this.bytes_e;
						}
					}
				}

				return null;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ib.B(" + var1 + ')');
		}
	}

	public static void c(int var0) {
		try {
			lf_l = null;
			ints_m = null;
			lf_i = null;
			if (var0 != -9855) {
				a(-26);
			}

			lf_d = null;
			ints_g = null;
			lf_r = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ib.D(" + var0 + ')');
		}
	}

	ib(ke var1, URL var2) {
		try {
			this.da_o = var1.a(var2, -896798992);
			this.int_p = 0;
			this.long_n = nb.a(false) + 30000L;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ib.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_d = lf_i;
	}
}
