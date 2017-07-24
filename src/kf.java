import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

final class kf extends b {

	int[] O;
	int P;
	int Q;
	int R;
	int S;
	int T;
	int U;

	final void a(int var1, int var2) {
		var1 += this.S;
		var2 += this.U;
		int var3 = var1 + var2 * b.J;
		int var4 = 0;
		int var5 = this.P;
		int var6 = this.Q;
		int var7 = b.J - var6;
		int var8 = 0;
		int var9;
		if (var2 < b.H) {
			var9 = b.H - var2;
			var5 -= var9;
			var2 = b.H;
			var4 += var9 * var6;
			var3 += var9 * b.J;
		}

		if (var2 + var5 > b.L) {
			var5 -= var2 + var5 - b.L;
		}

		if (var1 < b.I) {
			var9 = b.I - var1;
			var6 -= var9;
			var1 = b.I;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > b.K) {
			var9 = var1 + var6 - b.K;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			a(b.M, this.O, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	final void e(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			this.a(var1, var2);
		} else {
			var1 += this.S;
			var2 += this.U;
			int var5 = var1 + var2 * b.J;
			int var6 = 0;
			int var7 = this.P;
			int var8 = this.Q;
			int var9 = b.J - var8;
			int var10 = 0;
			int var11;
			if (var2 < b.H) {
				var11 = b.H - var2;
				var7 -= var11;
				var2 = b.H;
				var6 += var11 * var8;
				var5 += var11 * b.J;
			}

			if (var2 + var7 > b.L) {
				var7 -= var2 + var7 - b.L;
			}

			if (var1 < b.I) {
				var11 = b.I - var1;
				var8 -= var11;
				var1 = b.I;
				var6 += var11;
				var5 += var11;
				var10 += var11;
				var9 += var11;
			}

			if (var1 + var8 > b.K) {
				var11 = var1 + var8 - b.K;
				var8 -= var11;
				var10 += var11;
				var9 += var11;
			}

			if (var8 > 0 && var7 > 0) {
				a(b.M, this.O, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}

	private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
				;
			}

			var3 += var6;
			var2 += var7;
		}

	}

	final void a(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.O.length; ++var4) {
			int var5 = this.O[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 255;
				var6 += var1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 255;
				var7 += var2;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var5 & 255;
				var8 += var3;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				this.O[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}

	}

	final void b(int var1) {
		if (this.Q != this.T || this.P != this.R) {
			int var2 = var1;
			if (var1 > this.S) {
				var2 = this.S;
			}

			int var3 = var1;
			if (var1 + this.S + this.Q > this.T) {
				var3 = this.T - this.S - this.Q;
			}

			int var4 = var1;
			if (var1 > this.U) {
				var4 = this.U;
			}

			int var5 = var1;
			if (var1 + this.U + this.P > this.R) {
				var5 = this.R - this.U - this.P;
			}

			int var6 = this.Q + var2 + var3;
			int var7 = this.P + var4 + var5;
			int[] var8 = new int[var6 * var7];

			for (int var9 = 0; var9 < this.P; ++var9) {
				for (int var10 = 0; var10 < this.Q; ++var10) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.O[var9 * this.Q + var10];
				}
			}

			this.O = var8;
			this.Q = var6;
			this.P = var7;
			this.S -= var2;
			this.U -= var4;
		}
	}

	private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = var9; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (int var12 = var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	final void d() {
		b.a(this.O, this.Q, this.P);
	}

	final void e() {
		int[] var1 = new int[this.Q * this.P];
		int var2 = 0;

		for (int var3 = 0; var3 < this.P; ++var3) {
			for (int var4 = this.Q - 1; var4 >= 0; --var4) {
				var1[var2++] = this.O[var4 + var3 * this.Q];
			}
		}

		this.O = var1;
		this.S = this.T - this.Q - this.S;
	}

	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * b.J;

			for (var2 = 0; var2 < var4; ++var2) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					b.M[var19++] = this.O[(var20 >> 16) + (var21 >> 16) * this.Q];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += b.J;
			}

		} catch (Exception var22) {
			;
		}
	}

	private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	final void f() {
		if (this.Q != this.T || this.P != this.R) {
			int[] var1 = new int[this.T * this.R];

			for (int var2 = 0; var2 < this.P; ++var2) {
				for (int var3 = 0; var3 < this.Q; ++var3) {
					var1[(var2 + this.U) * this.T + var3 + this.S] = this.O[var2 * this.Q + var3];
				}
			}

			this.O = var1;
			this.Q = this.T;
			this.P = this.R;
			this.S = 0;
			this.U = 0;
		}
	}

	private final void d(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.S << 4;
			var2 -= this.U << 4;
			double var7 = (double) (var5 & '\uffff') * 9.587379924285257E-5D;
			int var9 = (int) Math.floor(Math.sin(var7) * (double) var6 + 0.5D);
			int var10 = (int) Math.floor(Math.cos(var7) * (double) var6 + 0.5D);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = var1 * var9 + -var2 * var10;
			int var13 = ((this.Q << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((this.Q << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((this.P << 4) - var2) * var9;
			int var16 = var1 * var9 + ((this.P << 4) - var2) * var10;
			int var17 = ((this.Q << 4) - var1) * var10 + ((this.P << 4) - var2) * var9;
			int var18 = -((this.Q << 4) - var1) * var9 + ((this.P << 4) - var2) * var10;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19) {
				var19 = var15;
			}

			if (var17 < var19) {
				var19 = var17;
			}

			if (var15 > var20) {
				var20 = var15;
			}

			if (var17 > var20) {
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21) {
				var21 = var16;
			}

			if (var18 < var21) {
				var21 = var18;
			}

			if (var16 > var22) {
				var22 = var16;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			var19 >>= 12;
			var20 = var20 + 4095 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < b.I) {
				var19 = b.I;
			}

			if (var20 > b.K) {
				var20 = b.K;
			}

			if (var21 < b.H) {
				var21 = b.H;
			}

			if (var22 > b.L) {
				var22 = b.L;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = var21 * b.J + var19;
					double var24 = 1.6777216E7D / (double) var6;
					int var26 = (int) Math.floor(Math.sin(var7) * var24 + 0.5D);
					int var27 = (int) Math.floor(Math.cos(var7) * var24 + 0.5D);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					int var32;
					int var33;
					int var34;
					int var35;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += b.J) {
								var34 = var23;
								var35 = var30;
								var36 = var31;
								var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (this.Q << 12) < 0 && var31 - (this.P << 12) < 0) {
									for (; var37 < 0; ++var37) {
										var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
										if (var38 != 0) {
											b.M[var34++] = var38;
										} else {
											++var34;
										}
									}
								}

								++var33;
							}

						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += b.J) {
								var34 = var23;
								var35 = var30;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.Q << 12) < 0) {
									if ((var32 = var36 - (this.P << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var36 - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
										if (var38 != 0) {
											b.M[var34++] = var38;
										} else {
											++var34;
										}

										var36 += var26;
										++var37;
									}
								}

								++var33;
								var30 -= var26;
							}

						} else {
							for (var33 = var22; var33 < 0; var23 += b.J) {
								var34 = var23;
								var35 = var30;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.Q << 12) < 0) {
									if (var36 < 0) {
										var32 = (var26 - 1 - var36) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (1 + var36 - (this.P << 12) - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
										if (var38 != 0) {
											b.M[var34++] = var38;
										} else {
											++var34;
										}

										var36 += var26;
										++var37;
									}
								}

								++var33;
								var30 -= var26;
							}

						}
					} else if (var27 < 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += b.J) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31;
								var37 = var20;
								if (var31 >= 0 && var31 - (this.P << 12) < 0) {
									if ((var32 = var35 - (this.Q << 12)) >= 0) {
										var32 = (var27 - var32) / var27;
										var37 = var20 + var32;
										var35 += var27 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 - var27) / var27) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
										if (var38 != 0) {
											b.M[var34++] = var38;
										} else {
											++var34;
										}

										var35 += var27;
										++var37;
									}
								}

								++var33;
								var31 += var27;
							}

						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += b.J) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if ((var32 = var35 - (this.Q << 12)) >= 0) {
									var32 = (var27 - var32) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 - var27) / var27) > var37) {
									var37 = var32;
								}

								if ((var32 = var36 - (this.P << 12)) >= 0) {
									var32 = (var26 - var32) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}

								if ((var32 = (var36 - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
									if (var38 != 0) {
										b.M[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									var36 += var26;
									++var37;
								}

								++var33;
								var30 -= var26;
								var31 += var27;
							}

						} else {
							for (var33 = var22; var33 < 0; var23 += b.J) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if ((var32 = var35 - (this.Q << 12)) >= 0) {
									var32 = (var27 - var32) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 - var27) / var27) > var37) {
									var37 = var32;
								}

								if (var36 < 0) {
									var32 = (var26 - 1 - var36) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}

								if ((var32 = (1 + var36 - (this.P << 12) - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
									if (var38 != 0) {
										b.M[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									var36 += var26;
									++var37;
								}

								++var33;
								var30 -= var26;
								var31 += var27;
							}

						}
					} else if (var26 == 0) {
						for (var33 = var22; var33 < 0; var23 += b.J) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31;
							var37 = var20;
							if (var31 >= 0 && var31 - (this.P << 12) < 0) {
								if (var35 < 0) {
									var32 = (var27 - 1 - var35) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (1 + var35 - (this.Q << 12) - var27) / var27) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
									if (var38 != 0) {
										b.M[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									++var37;
								}
							}

							++var33;
							var31 += var27;
						}

					} else if (var26 < 0) {
						for (var33 = var22; var33 < 0; var23 += b.J) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31 + (var28 * var26 >> 4);
							var37 = var20;
							if (var35 < 0) {
								var32 = (var27 - 1 - var35) / var27;
								var37 = var20 + var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 = var23 + var32;
							}

							if ((var32 = (1 + var35 - (this.Q << 12) - var27) / var27) > var37) {
								var37 = var32;
							}

							if ((var32 = var36 - (this.P << 12)) >= 0) {
								var32 = (var26 - var32) / var26;
								var37 += var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 += var32;
							}

							if ((var32 = (var36 - var26) / var26) > var37) {
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
								if (var38 != 0) {
									b.M[var34++] = var38;
								} else {
									++var34;
								}

								var35 += var27;
								var36 += var26;
								++var37;
							}

							++var33;
							var30 -= var26;
							var31 += var27;
						}

					} else {
						for (var33 = var22; var33 < 0; var23 += b.J) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31 + (var28 * var26 >> 4);
							var37 = var20;
							if (var35 < 0) {
								var32 = (var27 - 1 - var35) / var27;
								var37 = var20 + var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 = var23 + var32;
							}

							if ((var32 = (1 + var35 - (this.Q << 12) - var27) / var27) > var37) {
								var37 = var32;
							}

							if (var36 < 0) {
								var32 = (var26 - 1 - var36) / var26;
								var37 += var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 += var32;
							}

							if ((var32 = (1 + var36 - (this.P << 12) - var26) / var26) > var37) {
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.O[(var36 >> 12) * this.Q + (var35 >> 12)];
								if (var38 != 0) {
									b.M[var34++] = var38;
								} else {
									++var34;
								}

								var35 += var27;
								var36 += var26;
								++var37;
							}

							++var33;
							var30 -= var26;
							var31 += var27;
						}

					}
				}
			}
		}
	}

	final void c(int var1) {
		for (int var2 = this.P - 1; var2 > 0; --var2) {
			int var3 = var2 * this.Q;

			for (int var4 = this.Q - 1; var4 > 0; --var4) {
				if (this.O[var4 + var3] == 0 && this.O[var4 + var3 - 1 - this.Q] != 0) {
					this.O[var4 + var3] = var1;
				}
			}
		}

	}

	private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var14 = var3;

		for (int var15 = -var8; var15 < 0; ++var15) {
			int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; ++var17) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var18 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var14;
			var5 += var6;
		}

	}

	private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & '\uff00') * var11 & 16711680;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; ++var14) {
			for (int var15 = -var5; var15 < 0; ++var15) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & '\uff00') * var9 & 16711680;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	final kf g() {
		kf var1 = new kf(this.Q, this.P);
		var1.T = this.T;
		var1.R = this.R;
		var1.S = this.T - this.Q - this.S;
		var1.U = this.U;

		for (int var2 = 0; var2 < this.P; ++var2) {
			for (int var3 = 0; var3 < this.Q; ++var3) {
				var1.O[var2 * this.Q + var3] = this.O[var2 * this.Q + this.Q - 1 - var3];
			}
		}

		return var1;
	}

	final void f(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.Q;
			int var6 = this.P;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.T;
			int var10 = this.R;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			int var13;
			if (this.S > 0) {
				var13 = ((this.S << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.S << 16);
			}

			if (this.U > 0) {
				var13 = ((this.U << 16) + var12 - 1) / var12;
				var2 += var13;
				var8 += var13 * var12 - (this.U << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			var13 = var1 + var2 * b.J;
			int var14 = b.J - var3;
			if (var2 + var4 > b.L) {
				var4 -= var2 + var4 - b.L;
			}

			int var15;
			if (var2 < b.H) {
				var15 = b.H - var2;
				var4 -= var15;
				var13 += var15 * b.J;
				var8 += var12 * var15;
			}

			if (var1 + var3 > b.K) {
				var15 = var1 + var3 - b.K;
				var3 -= var15;
				var14 += var15;
			}

			if (var1 < b.I) {
				var15 = b.I - var1;
				var3 -= var15;
				var13 += var15;
				var7 += var11 * var15;
				var14 += var15;
			}

			a(b.M, this.O, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
		}
	}

	final void a(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * b.J;

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					int var20 = this.O[(var18 >> 16) + (var19 >> 16) * this.Q];
					if (var20 != 0) {
						b.M[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += b.J;
			}

		} catch (Exception var21) {
			;
		}
	}

	final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * b.J;

			for (var2 = 0; var2 < var4; ++var2) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					int var22 = this.O[(var20 >> 16) + (var21 >> 16) * this.Q];
					if (var22 != 0) {
						b.M[var19++] = var22;
					} else {
						++var19;
					}

					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += b.J;
			}

		} catch (Exception var23) {
			;
		}
	}

	final void h() {
		int[] var1 = new int[this.Q * this.P];
		int var2 = 0;

		for (int var3 = this.P - 1; var3 >= 0; --var3) {
			for (int var4 = 0; var4 < this.Q; ++var4) {
				var1[var2++] = this.O[var4 + var3 * this.Q];
			}
		}

		this.O = var1;
		this.U = this.R - this.P - this.U;
	}

	final void a(int var1, int var2, int[] var3, int[] var4) {
		if (b.L - b.H != var3.length) {
			throw new IllegalStateException();
		} else {
			var1 += this.S;
			var2 += this.U;
			int var5 = 0;
			int var6 = this.P;
			int var7 = this.Q;
			int var8 = b.J - var7;
			int var9 = 0;
			int var10 = var1 + var2 * b.J;
			int var11;
			if (var2 < b.H) {
				var11 = b.H - var2;
				var6 -= var11;
				var2 = b.H;
				var5 += var11 * var7;
				var10 += var11 * b.J;
			}

			if (var2 + var6 > b.L) {
				var6 -= var2 + var6 - b.L;
			}

			if (var1 < b.I) {
				var11 = b.I - var1;
				var7 -= var11;
				var1 = b.I;
				var5 += var11;
				var10 += var11;
				var9 += var11;
				var8 += var11;
			}

			if (var1 + var7 > b.K) {
				var11 = var1 + var7 - b.K;
				var7 -= var11;
				var9 += var11;
				var8 += var11;
			}

			if (var7 > 0 && var6 > 0) {
				var11 = var1 - b.I;
				int var12 = var2 - b.H;

				for (int var13 = var12; var13 < var12 + var6; ++var13) {
					int var14 = var3[var13];
					int var15 = var4[var13];
					int var16 = var7;
					int var17;
					if (var11 > var14) {
						var17 = var11 - var14;
						if (var17 >= var15) {
							var5 += var7 + var9;
							var10 += var7 + var8;
							continue;
						}

						var15 -= var17;
					} else {
						var17 = var14 - var11;
						if (var17 >= var7) {
							var5 += var7 + var9;
							var10 += var7 + var8;
							continue;
						}

						var5 += var17;
						var16 = var7 - var17;
						var10 += var17;
					}

					var17 = 0;
					if (var16 < var15) {
						var15 = var16;
					} else {
						var17 = var16 - var15;
					}

					for (int var18 = -var15; var18 < 0; ++var18) {
						int var19 = this.O[var5++];
						if (var19 != 0) {
							b.M[var10++] = var19;
						} else {
							++var10;
						}
					}

					var5 += var17 + var9;
					var10 += var17 + var8;
				}

			}
		}
	}

	final void g(int var1, int var2, int var3, int var4) {
		int var5 = this.T << 3;
		int var6 = this.R << 3;
		var1 = (var1 << 4) + (var5 & 15);
		var2 = (var2 << 4) + (var6 & 15);
		this.d(var5, var6, var1, var2, var3, var4);
	}

	final void d(int var1) {
		int[] var2 = new int[this.Q * this.P];
		int var3 = 0;

		for (int var4 = 0; var4 < this.P; ++var4) {
			for (int var5 = 0; var5 < this.Q; ++var5) {
				int var6 = this.O[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.O[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && this.O[var3 - this.Q] != 0) {
						var6 = var1;
					} else if (var5 < this.Q - 1 && this.O[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < this.P - 1 && this.O[var3 + this.Q] != 0) {
						var6 = var1;
					}
				}

				var2[var3++] = var6;
			}
		}

		this.O = var2;
	}

	final void f(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.Q;
			int var7 = this.P;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.T;
			int var11 = this.R;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.S > 0) {
				var14 = ((this.S << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.S << 16);
			}

			if (this.U > 0) {
				var14 = ((this.U << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var14 * var13 - (this.U << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			var14 = var1 + var2 * b.J;
			int var15 = b.J - var3;
			if (var2 + var4 > b.L) {
				var4 -= var2 + var4 - b.L;
			}

			int var16;
			if (var2 < b.H) {
				var16 = b.H - var2;
				var4 -= var16;
				var14 += var16 * b.J;
				var9 += var13 * var16;
			}

			if (var1 + var3 > b.K) {
				var16 = var1 + var3 - b.K;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < b.I) {
				var16 = b.I - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var12 * var16;
				var15 += var16;
			}

			a(b.M, this.O, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	final void b(int var1, int var2, int var3) {
		var1 += this.S;
		var2 += this.U;
		int var4 = var1 + var2 * b.J;
		int var5 = 0;
		int var6 = this.P;
		int var7 = this.Q;
		int var8 = b.J - var7;
		int var9 = 0;
		int var10;
		if (var2 < b.H) {
			var10 = b.H - var2;
			var6 -= var10;
			var2 = b.H;
			var5 += var10 * var7;
			var4 += var10 * b.J;
		}

		if (var2 + var6 > b.L) {
			var6 -= var2 + var6 - b.L;
		}

		if (var1 < b.I) {
			var10 = b.I - var1;
			var7 -= var10;
			var1 = b.I;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var1 + var7 > b.K) {
			var10 = var1 + var7 - b.K;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			a(b.M, this.O, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	final void b(int var1, int var2) {
		var1 += this.S;
		var2 += this.U;
		int var3 = var1 + var2 * b.J;
		int var4 = 0;
		int var5 = this.P;
		int var6 = this.Q;
		int var7 = b.J - var6;
		int var8 = 0;
		int var9;
		if (var2 < b.H) {
			var9 = b.H - var2;
			var5 -= var9;
			var2 = b.H;
			var4 += var9 * var6;
			var3 += var9 * b.J;
		}

		if (var2 + var5 > b.L) {
			var5 -= var2 + var5 - b.L;
		}

		if (var1 < b.I) {
			var9 = b.I - var1;
			var6 -= var9;
			var1 = b.I;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > b.K) {
			var9 = var1 + var6 - b.K;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			a(b.M, this.O, var4, var3, var6, var5, var7, var8);
		}
	}

	protected kf() {
	}

	kf(int var1, int var2) {
		this.O = new int[var1 * var2];
		this.Q = this.T = var1;
		this.P = this.R = var2;
		this.S = this.U = 0;
	}

	kf(byte[] imageData, Component component) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(imageData);
			MediaTracker mediaTracker = new MediaTracker(component);
			mediaTracker.addImage(image, 0);
			mediaTracker.waitForAll();
			this.Q = image.getWidth(component);
			this.P = image.getHeight(component);
			this.T = this.Q;
			this.R = this.P;
			this.S = 0;
			this.U = 0;
			this.O = new int[this.Q * this.P];
			PixelGrabber pixelGrabber
					= new PixelGrabber(image, 0, 0, this.Q, this.P, this.O, 0, this.Q);
			pixelGrabber.grabPixels();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
