final class k extends cd {

	boolean boolean_o;
	int int_p;
	byte[] bytes_q;
	int int_r;
	int int_s;

	final k a(pa var1) {
		this.bytes_q = var1.a(25709, this.bytes_q);
		this.int_s = var1.b(-23741, this.int_s);
		if (this.int_p == this.int_r) {
			this.int_p = this.int_r = var1.a((byte) 63, this.int_p);
		} else {
			this.int_p = var1.a((byte) 63, this.int_p);
			this.int_r = var1.a((byte) 63, this.int_r);
			if (this.int_p == this.int_r) {
				--this.int_p;
			}
		}

		return this;
	}

	k(int var1, byte[] var2, int var3, int var4) {
		this.int_s = var1;
		this.bytes_q = var2;
		this.int_p = var3;
		this.int_r = var4;
	}

	k(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.int_s = var1;
		this.bytes_q = var2;
		this.int_p = var3;
		this.int_r = var4;
		this.boolean_o = var5;
	}
}
