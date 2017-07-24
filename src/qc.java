final class qc {

	int[] ints_a;
	int int_b;
	int int_c;
	int[] ints_d;

	qc() {
		fe.a(16);
		this.int_c = fe.b() != 0 ? fe.a(4) + 1 : 1;
		if (fe.b() != 0) {
			fe.a(8);
		}

		fe.a(2);
		if (this.int_c > 1) {
			this.int_b = fe.a(4);
		}

		this.ints_d = new int[this.int_c];
		this.ints_a = new int[this.int_c];

		for (int var1 = 0; var1 < this.int_c; ++var1) {
			fe.a(8);
			this.ints_d[var1] = fe.a(8);
			this.ints_a[var1] = fe.a(8);
		}

	}
}
