final class jb extends kc {

	private int int_r;
	private int int_s;
	private int int_t;
	private int int_u;
	private int int_v;
	private int int_w;
	private boolean x;
	private int y;
	private int z;
	private int A;
	private int B;
	private int C;
	private int D;
	private int E;
	private int F;

	final synchronized void a(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.c(var2, var3);
		} else {
			int var4 = d(var2, var3);
			int var5 = a(var2, var3);
			if (this.int_u == var4 && this.C == var5) {
				this.z = 0;
			} else {
				int var6 = var2 - this.int_w;
				if (this.int_w - var2 > var6) {
					var6 = this.int_w - var2;
				}

				if (var4 - this.int_u > var6) {
					var6 = var4 - this.int_u;
				}

				if (this.int_u - var4 > var6) {
					var6 = this.int_u - var4;
				}

				if (var5 - this.C > var6) {
					var6 = var5 - this.C;
				}

				if (this.C - var5 > var6) {
					var6 = this.C - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.z = var1;
				this.y = var2;
				this.int_v = var3;
				this.int_t = (var2 - this.int_w) / var1;
				this.B = (var4 - this.int_u) / var1;
				this.E = (var5 - this.C) / var1;
			}
		}
	}

	final synchronized int e() {
		return this.F < 0 ? -this.F : this.F;
	}

	private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, jb var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.int_s = var4;
		return var5;
	}

	final synchronized void b(int var1) {
		this.int_r = var1;
	}

	private static final int a(int var0, int var1) {
		return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
	}

	private static final int a(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, jb var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.int_s = var3 << 8;
		return var4 >> 1;
	}

	final synchronized void c(int var1) {
		int var2 = ((k) super.cd_p).bytes_q.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.int_s = var1;
	}

	final kc b() {
		return null;
	}

	private static final int a(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, jb var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.int_s = var2 << 8;
		return var3;
	}

	final boolean f() {
		return this.int_s < 0 || this.int_s >= ((k) super.cd_p).bytes_q.length << 8;
	}

	final synchronized void b(int var1, int var2) {
		this.a(var1, var2, this.i());
	}

	final synchronized void d(int var1) {
		if (this.F < 0) {
			this.F = -var1;
		} else {
			this.F = var1;
		}
	}

	private static final int a(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, jb var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.int_u += var9.B * (var6 - var3);
		var9.C += var9.E * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.int_w = var4 >> 2;
		var9.int_s = var2 << 8;
		return var3;
	}

	final synchronized void e(int var1) {
		this.c(var1 << 6, this.i());
	}

	final synchronized void a(int[] var1, int var2, int var3) {
		if (this.y == 0 && this.z == 0) {
			this.a(var3);
		} else {
			k var4 = (k) super.cd_p;
			int var5 = this.A << 8;
			int var6 = this.D << 8;
			int var7 = var4.bytes_q.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.int_r = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.int_s < 0) {
				if (this.F <= 0) {
					this.h();
					this.a(true);
					return;
				}

				this.int_s = 0;
			}

			if (this.int_s >= var7) {
				if (this.F >= 0) {
					this.h();
					this.a(true);
					return;
				}

				this.int_s = var7 - 1;
			}

			if (this.int_r < 0) {
				if (this.x) {
					if (this.F < 0) {
						var9 = this.a(var1, var2, var5, var3, var4.bytes_q[this.A]);
						if (this.int_s >= var5) {
							return;
						}

						this.int_s = var5 + var5 - 1 - this.int_s;
						this.F = -this.F;
					}

					while (true) {
						var9 = this.b(var1, var9, var6, var3, var4.bytes_q[this.D - 1]);
						if (this.int_s < var6) {
							return;
						}

						this.int_s = var6 + var6 - 1 - this.int_s;
						this.F = -this.F;
						var9 = this.a(var1, var9, var5, var3, var4.bytes_q[this.A]);
						if (this.int_s >= var5) {
							return;
						}

						this.int_s = var5 + var5 - 1 - this.int_s;
						this.F = -this.F;
					}
				} else if (this.F < 0) {
					while (true) {
						var9 = this.a(var1, var9, var5, var3, var4.bytes_q[this.D - 1]);
						if (this.int_s >= var5) {
							return;
						}

						this.int_s = var6 - 1 - (var6 - 1 - this.int_s) % var8;
					}
				} else {
					while (true) {
						var9 = this.b(var1, var9, var6, var3, var4.bytes_q[this.A]);
						if (this.int_s < var6) {
							return;
						}

						this.int_s = var5 + (this.int_s - var5) % var8;
					}
				}
			} else {
				if (this.int_r > 0) {
					if (this.x) {
						label133:
						{
							if (this.F < 0) {
								var9 = this.a(var1, var2, var5, var3, var4.bytes_q[this.A]);
								if (this.int_s >= var5) {
									return;
								}

								this.int_s = var5 + var5 - 1 - this.int_s;
								this.F = -this.F;
								if (--this.int_r == 0) {
									break label133;
								}
							}

							do {
								var9 = this.b(var1, var9, var6, var3, var4.bytes_q[this.D - 1]);
								if (this.int_s < var6) {
									return;
								}

								this.int_s = var6 + var6 - 1 - this.int_s;
								this.F = -this.F;
								if (--this.int_r == 0) {
									break;
								}

								var9 = this.a(var1, var9, var5, var3, var4.bytes_q[this.A]);
								if (this.int_s >= var5) {
									return;
								}

								this.int_s = var5 + var5 - 1 - this.int_s;
								this.F = -this.F;
							} while (--this.int_r != 0);
						}
					} else {
						int var10;
						if (this.F < 0) {
							while (true) {
								var9 = this.a(var1, var9, var5, var3, var4.bytes_q[this.D - 1]);
								if (this.int_s >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.int_s) / var8;
								if (var10 >= this.int_r) {
									this.int_s += var8 * this.int_r;
									this.int_r = 0;
									break;
								}

								this.int_s += var8 * var10;
								this.int_r -= var10;
							}
						} else {
							while (true) {
								var9 = this.b(var1, var9, var6, var3, var4.bytes_q[this.A]);
								if (this.int_s < var6) {
									return;
								}

								var10 = (this.int_s - var5) / var8;
								if (var10 >= this.int_r) {
									this.int_s -= var8 * this.int_r;
									this.int_r = 0;
									break;
								}

								this.int_s -= var8 * var10;
								this.int_r -= var10;
							}
						}
					}
				}

				if (this.F < 0) {
					this.a(var1, var9, 0, var3, 0);
					if (this.int_s < 0) {
						this.int_s = -1;
						this.h();
						this.a(true);
						return;
					}
				} else {
					this.b(var1, var9, var7, var3, 0);
					if (this.int_s >= var7) {
						this.int_s = var7;
						this.h();
						this.a(true);
					}
				}

			}
		}
	}

	private static final int a(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, jb var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.int_w += var12.int_t * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.int_u = var5 >> 2;
		var12.C = var6 >> 2;
		var12.int_s = var3 << 8;
		return var4 >> 1;
	}

	final synchronized void a(int var1) {
		if (this.z > 0) {
			if (var1 >= this.z) {
				if (this.y == Integer.MIN_VALUE) {
					this.y = 0;
					this.int_w = this.int_u = this.C = 0;
					this.a(true);
					var1 = this.z;
				}

				this.z = 0;
				this.k();
			} else {
				this.int_w += this.int_t * var1;
				this.int_u += this.B * var1;
				this.C += this.E * var1;
				this.z -= var1;
			}
		}

		k var2 = (k) super.cd_p;
		int var3 = this.A << 8;
		int var4 = this.D << 8;
		int var5 = var2.bytes_q.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.int_r = 0;
		}

		if (this.int_s < 0) {
			if (this.F <= 0) {
				this.h();
				this.a(true);
				return;
			}

			this.int_s = 0;
		}

		if (this.int_s >= var5) {
			if (this.F >= 0) {
				this.h();
				this.a(true);
				return;
			}

			this.int_s = var5 - 1;
		}

		this.int_s += this.F * var1;
		if (this.int_r < 0) {
			if (!this.x) {
				if (this.F < 0) {
					if (this.int_s < var3) {
						this.int_s = var4 - 1 - (var4 - 1 - this.int_s) % var6;
					}
				} else if (this.int_s >= var4) {
					this.int_s = var3 + (this.int_s - var3) % var6;
				}
			} else {
				if (this.F < 0) {
					if (this.int_s >= var3) {
						return;
					}

					this.int_s = var3 + var3 - 1 - this.int_s;
					this.F = -this.F;
				}

				while (this.int_s >= var4) {
					this.int_s = var4 + var4 - 1 - this.int_s;
					this.F = -this.F;
					if (this.int_s >= var3) {
						return;
					}

					this.int_s = var3 + var3 - 1 - this.int_s;
					this.F = -this.F;
				}

			}
		} else {
			if (this.int_r > 0) {
				if (this.x) {
					label126:
					{
						if (this.F < 0) {
							if (this.int_s >= var3) {
								return;
							}

							this.int_s = var3 + var3 - 1 - this.int_s;
							this.F = -this.F;
							if (--this.int_r == 0) {
								break label126;
							}
						}

						do {
							if (this.int_s < var4) {
								return;
							}

							this.int_s = var4 + var4 - 1 - this.int_s;
							this.F = -this.F;
							if (--this.int_r == 0) {
								break;
							}

							if (this.int_s >= var3) {
								return;
							}

							this.int_s = var3 + var3 - 1 - this.int_s;
							this.F = -this.F;
						} while (--this.int_r != 0);
					}
				} else {
					int var7;
					if (this.F < 0) {
						if (this.int_s >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.int_s) / var6;
						if (var7 < this.int_r) {
							this.int_s += var6 * var7;
							this.int_r -= var7;
							return;
						}

						this.int_s += var6 * this.int_r;
						this.int_r = 0;
					} else {
						if (this.int_s < var4) {
							return;
						}

						var7 = (this.int_s - var3) / var6;
						if (var7 < this.int_r) {
							this.int_s -= var6 * var7;
							this.int_r -= var7;
							return;
						}

						this.int_s -= var6 * this.int_r;
						this.int_r = 0;
					}
				}
			}

			if (this.F < 0) {
				if (this.int_s < 0) {
					this.int_s = -1;
					this.h();
					this.a(true);
					return;
				}
			} else if (this.int_s >= var5) {
				this.int_s = var5;
				this.h();
				this.a(true);
			}

		}
	}

	final int a() {
		int var1 = this.int_w * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.int_r == 0) {
			var1 -= var1 * this.int_s / (((k) super.cd_p).bytes_q.length << 8);
		} else if (this.int_r >= 0) {
			var1 -= var1 * this.A / ((k) super.cd_p).bytes_q.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	final boolean g() {
		return this.z != 0;
	}

	static final jb a(k var0, int var1, int var2, int var3) {
		return var0.bytes_q != null && var0.bytes_q.length != 0 ? new jb(var0, var1, var2, var3) : null;
	}

	private final void h() {
		if (this.z != 0) {
			if (this.y == Integer.MIN_VALUE) {
				this.y = 0;
			}

			this.z = 0;
			this.k();
		}

	}

	private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, jb var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.int_s = var4;
		return var5 >> 1;
	}

	private static final int b(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, jb var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.int_u += var9.B * (var6 - var3);
		var9.C += var9.E * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.int_w = var4 >> 2;
		var9.int_s = var2 << 8;
		return var3;
	}

	private static final int b(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, jb var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.int_s = var3 << 8;
		return var4 >> 1;
	}

	final kc c() {
		return null;
	}

	final synchronized int i() {
		return this.int_v < 0 ? -1 : this.int_v;
	}

	private final synchronized void f(int var1) {
		this.c(var1, this.i());
	}

	private static final int b(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, jb var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.int_s = var2 << 8;
		return var3;
	}

	private final synchronized void c(int var1, int var2) {
		this.y = var1;
		this.int_v = var2;
		this.z = 0;
		this.k();
	}

	final synchronized int j() {
		return this.y == Integer.MIN_VALUE ? 0 : this.y;
	}

	private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, jb var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.int_s = var4;
		return var5;
	}

	private static final int d(int var0, int var1) {
		return var1 < 0 ? var0 : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, jb var13, int var14, int var15) {
		var13.int_w -= var13.int_t * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.int_w += var13.int_t * var5;
		var13.int_u = var6;
		var13.C = var7;
		var13.int_s = var4;
		return var5;
	}

	private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, jb var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.int_s = var4;
		return var5 >> 1;
	}

	final synchronized void b(boolean var1) {
		this.F = (this.F ^ this.F >> 31) + (this.F >>> 31);
		if (var1) {
			this.F = -this.F;
		}

	}

	private final int a(int[] var1, int var2, int var3, int var4, int var5) {
		do {
			if (this.z <= 0) {
				if (this.F == -256 && (this.int_s & 255) == 0) {
					if (sc.channel) {
						return a(0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_u, this.C, 0, var4, var3, this);
					}

					return a(((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_w, 0, var4, var3, this);
				}

				if (sc.channel) {
					return b(0, 0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_u, this.C, 0, var4, var3, this, this.F, var5);
				}

				return a(0, 0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_w, 0, var4, var3, this, this.F, var5);
			}

			int var6 = var2 + this.z;
			if (var6 > var4) {
				var6 = var4;
			}

			this.z += var2;
			if (this.F == -256 && (this.int_s & 255) == 0) {
				if (sc.channel) {
					var2 = b(0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_u, this.C, this.B, this.E, 0, var6, var3, this);
				} else {
					var2 = a(((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_w, this.int_t, 0, var6, var3, this);
				}
			} else if (sc.channel) {
				var2 = a(0, 0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_u, this.C, this.B, this.E, 0, var6, var3, this, this.F, var5);
			} else {
				var2 = c(0, 0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_w, this.int_t, 0, var6, var3, this, this.F, var5);
			}

			this.z -= var2;
			if (this.z != 0) {
				return var2;
			}
		} while (!this.l());

		return var4;
	}

	private final int b(int[] var1, int var2, int var3, int var4, int var5) {
		do {
			if (this.z <= 0) {
				if (this.F == 256 && (this.int_s & 255) == 0) {
					if (sc.channel) {
						return b(0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_u, this.C, 0, var4, var3, this);
					}

					return b(((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_w, 0, var4, var3, this);
				}

				if (sc.channel) {
					return a(0, 0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_u, this.C, 0, var4, var3, this, this.F, var5);
				}

				return b(0, 0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_w, 0, var4, var3, this, this.F, var5);
			}

			int var6 = var2 + this.z;
			if (var6 > var4) {
				var6 = var4;
			}

			this.z += var2;
			if (this.F == 256 && (this.int_s & 255) == 0) {
				if (sc.channel) {
					var2 = a(0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_u, this.C, this.B, this.E, 0, var6, var3, this);
				} else {
					var2 = b(((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_w, this.int_t, 0, var6, var3, this);
				}
			} else if (sc.channel) {
				var2 = b(0, 0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_u, this.C, this.B, this.E, 0, var6, var3, this, this.F, var5);
			} else {
				var2 = d(0, 0, ((k) super.cd_p).bytes_q, var1, this.int_s, var2, this.int_w, this.int_t, 0, var6, var3, this, this.F, var5);
			}

			this.z -= var2;
			if (this.z != 0) {
				return var2;
			}
		} while (!this.l());

		return var4;
	}

	private final void k() {
		this.int_w = this.y;
		this.int_u = d(this.y, this.int_v);
		this.C = a(this.y, this.int_v);
	}

	private static final int c(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, jb var11, int var12, int var13) {
		var11.int_u -= var11.B * var5;
		var11.C -= var11.E * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.int_u += var11.B * var5;
		var11.C += var11.E * var5;
		var11.int_w = var6;
		var11.int_s = var4;
		return var5;
	}

	static final jb a(k var0, int var1, int var2) {
		return var0.bytes_q != null && var0.bytes_q.length != 0 ? new jb(var0, (int) ((long) var0.int_s * 256L * (long) var1 / (long) (100 * cb.sampleRate)), var2 << 6) : null;
	}

	private final boolean l() {
		int var1 = this.y;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = d(var1, this.int_v);
			var3 = a(var1, this.int_v);
		}

		if (this.int_w == var1 && this.int_u == var2 && this.C == var3) {
			if (this.y == Integer.MIN_VALUE) {
				this.y = 0;
				this.int_w = this.int_u = this.C = 0;
				this.a(true);
				return true;
			} else {
				this.k();
				return false;
			}
		} else {
			if (this.int_w < var1) {
				this.int_t = 1;
				this.z = var1 - this.int_w;
			} else if (this.int_w > var1) {
				this.int_t = -1;
				this.z = this.int_w - var1;
			} else {
				this.int_t = 0;
			}

			if (this.int_u < var2) {
				this.B = 1;
				if (this.z == 0 || this.z > var2 - this.int_u) {
					this.z = var2 - this.int_u;
				}
			} else if (this.int_u > var2) {
				this.B = -1;
				if (this.z == 0 || this.z > this.int_u - var2) {
					this.z = this.int_u - var2;
				}
			} else {
				this.B = 0;
			}

			if (this.C < var3) {
				this.E = 1;
				if (this.z == 0 || this.z > var3 - this.C) {
					this.z = var3 - this.C;
				}
			} else if (this.C > var3) {
				this.E = -1;
				if (this.z == 0 || this.z > this.C - var3) {
					this.z = this.C - var3;
				}
			} else {
				this.E = 0;
			}

			return false;
		}
	}

	final synchronized void g(int var1) {
		if (var1 == 0) {
			this.f(0);
			this.a(true);
		} else if (this.int_u == 0 && this.C == 0) {
			this.z = 0;
			this.y = 0;
			this.int_w = 0;
			this.a(true);
		} else {
			int var2 = -this.int_w;
			if (this.int_w > var2) {
				var2 = this.int_w;
			}

			if (-this.int_u > var2) {
				var2 = -this.int_u;
			}

			if (this.int_u > var2) {
				var2 = this.int_u;
			}

			if (-this.C > var2) {
				var2 = -this.C;
			}

			if (this.C > var2) {
				var2 = this.C;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.z = var1;
			this.y = Integer.MIN_VALUE;
			this.int_t = -this.int_w / var1;
			this.B = -this.int_u / var1;
			this.E = -this.C / var1;
		}
	}

	private static final int d(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, jb var11, int var12, int var13) {
		var11.int_u -= var11.B * var5;
		var11.C -= var11.E * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.int_u += var11.B * var5;
		var11.C += var11.E * var5;
		var11.int_w = var6;
		var11.int_s = var4;
		return var5;
	}

	private static final int b(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, jb var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.int_w += var12.int_t * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.int_u = var5 >> 2;
		var12.C = var6 >> 2;
		var12.int_s = var3 << 8;
		return var4 >> 1;
	}

	final int d() {
		return this.y == 0 && this.z == 0 ? 0 : 1;
	}

	private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, jb var13, int var14, int var15) {
		var13.int_w -= var13.int_t * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.int_w += var13.int_t * var5;
		var13.int_u = var6;
		var13.C = var7;
		var13.int_s = var4;
		return var5;
	}

	private jb(k var1, int var2, int var3) {
		super.cd_p = var1;
		this.A = var1.int_p;
		this.D = var1.int_r;
		this.x = var1.boolean_o;
		this.F = var2;
		this.y = var3;
		this.int_v = 8192;
		this.int_s = 0;
		this.k();
	}

	private jb(k var1, int var2, int var3, int var4) {
		super.cd_p = var1;
		this.A = var1.int_p;
		this.D = var1.int_r;
		this.x = var1.boolean_o;
		this.F = var2;
		this.y = var3;
		this.int_v = var4;
		this.int_s = 0;
		this.k();
	}
}
