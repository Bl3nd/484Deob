final class t extends kc {

	private tf tf_r = new tf();
	private tf tf_s = new tf();
	private int int_t = -1;
	private int int_u = 0;

	final synchronized void a(int var1) {
		do {
			if (this.int_t < 0) {
				this.b(var1);
				return;
			}

			if (this.int_u + var1 < this.int_t) {
				this.int_u += var1;
				this.b(var1);
				return;
			}

			int var2 = this.int_t - this.int_u;
			this.b(var2);
			var1 -= var2;
			this.int_u += var2;
			this.e();
			kg var3 = (kg) this.tf_s.c(90);
			synchronized (var3) {
				int var6 = var3.a(this);
				if (var6 < 0) {
					var3.int_n = 0;
					this.a(var3);
				} else {
					var3.int_n = var6;
					this.a(var3.hb_i, var3);
				}
			}
		} while (var1 != 0);

	}

	final int d() {
		return 0;
	}

	final synchronized void a(int[] var1, int var2, int var3) {
		do {
			if (this.int_t < 0) {
				this.c(var1, var2, var3);
				return;
			}

			if (this.int_u + var3 < this.int_t) {
				this.int_u += var3;
				this.c(var1, var2, var3);
				return;
			}

			int var4 = this.int_t - this.int_u;
			this.c(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.int_u += var4;
			this.e();
			kg var5 = (kg) this.tf_s.c(123);
			synchronized (var5) {
				int var8 = var5.a(this);
				if (var8 < 0) {
					var5.int_n = 0;
					this.a(var5);
				} else {
					var5.int_n = var8;
					this.a(var5.hb_i, var5);
				}
			}
		} while (var3 != 0);

	}

	final synchronized void a(kc var1) {
		this.tf_r.a(var1, (byte) -69);
	}

	private final void b(int var1) {
		for (kc var2 = (kc) this.tf_r.c(35); var2 != null; var2 = (kc) this.tf_r.d(-1)) {
			var2.a(var1);
		}

	}

	final synchronized void b(kc var1) {
		var1.a(true);
	}

	private final void a(kg var1) {
		var1.a(true);
		var1.a();
		hb var2 = this.tf_s.hb_n.hb_i;
		if (var2 == this.tf_s.hb_n) {
			this.int_t = -1;
		} else {
			this.int_t = ((kg) var2).int_n;
		}
	}

	private final void c(int[] var1, int var2, int var3) {
		for (kc var4 = (kc) this.tf_r.c(47); var4 != null; var4 = (kc) this.tf_r.d(-1)) {
			var4.b(var1, var2, var3);
		}

	}

	final kc c() {
		return (kc) this.tf_r.d(-1);
	}

	final kc b() {
		return (kc) this.tf_r.c(63);
	}

	private final void a(hb var1, kg var2) {
		while (var1 != this.tf_s.hb_n && ((kg) var1).int_n <= var2.int_n) {
			var1 = var1.hb_i;
		}

		this.tf_s.a(0, var1, var2);
		this.int_t = ((kg) this.tf_s.hb_n.hb_i).int_n;
	}

	private final void e() {
		if (this.int_u > 0) {
			for (kg var1 = (kg) this.tf_s.c(49); var1 != null; var1 = (kg) this.tf_s.d(-1)) {
				var1.int_n -= this.int_u;
			}

			this.int_t -= this.int_u;
			this.int_u = 0;
		}

	}
}
