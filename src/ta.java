final class ta {

	int int_a;
	private int[] ints_b = new int[2];
	int int_c;
	private int[] ints_d = new int[2];
	int int_e;
	private int int_f = 2;
	private int int_g;
	private int int_h;
	private int int_i;
	private int int_j;
	private int int_k;

	final int a(int var1) {
		if (this.int_k >= this.int_h) {
			this.int_i = this.ints_b[this.int_g++] << 15;
			if (this.int_g >= this.int_f) {
				this.int_g = this.int_f - 1;
			}

			this.int_h = (int) ((double) this.ints_d[this.int_g] / 65536.0D * (double) var1);
			if (this.int_h > this.int_k) {
				this.int_j = ((this.ints_b[this.int_g] << 15) - this.int_i) / (this.int_h - this.int_k);
			}
		}

		this.int_i += this.int_j;
		++this.int_k;
		return this.int_i - this.int_j >> 15;
	}

	final void a() {
		this.int_h = 0;
		this.int_g = 0;
		this.int_j = 0;
		this.int_i = 0;
		this.int_k = 0;
	}

	final void a(ja var1) {
		this.int_f = var1.j((byte) 118);
		this.ints_d = new int[this.int_f];
		this.ints_b = new int[this.int_f];

		for (int var2 = 0; var2 < this.int_f; ++var2) {
			this.ints_d[var2] = var1.b(true);
			this.ints_b[var2] = var1.b(true);
		}

	}

	final void b(ja var1) {
		this.int_c = var1.j((byte) 122);
		this.int_e = var1.l(15);
		this.int_a = var1.l(15);
		this.a(var1);
	}

	public ta() {
		this.ints_d[0] = 0;
		this.ints_d[1] = '\uffff';
		this.ints_b[0] = 0;
		this.ints_b[1] = '\uffff';
	}
}
