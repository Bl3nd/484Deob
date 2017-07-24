import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class ua extends Applet implements Runnable, FocusListener, WindowListener {

	static int int_a;
	static int int_b;
	static int int_c;
	static int int_d;
	static int int_e;
	static int int_f;
	static int[] ints_g = new int[4000];
	static int int_h;
	static int int_i;
	static int int_j;
	static int int_k;
	private boolean boolean_l = false;
	static int int_m;
	static int int_n;
	static int int_o;
	static int int_p;
	static int int_q;
	static int int_r;
	static int int_s;
	static int int_t;
	static int int_u;
	static int int_v;
	static int int_w;
	static int x;
	static wa y = new wa(5000);
	static int z;
	static int A;
	static int B;
	static int C;
	static int D;
	static int F;
	static int G;
	static int H;
	private static lf J = dd.a("Login", 2);
	static int[] K;
	static lf hitmarks;
	static int M = 0;
	static boolean N;
	static lf O;
	static int P;
	static int Q;
	static int[] R;
	static bg S;
	static lf T;
	public static boolean U;

	final void a(byte var1, String var2) {
		try {
			++int_h;
			if (var1 >= -31) {
				O = null;
			}

			if (!this.boolean_l) {
				this.boolean_l = true;
				System.out.println("error_game_" + var2);

				try {
					this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var2 + ".ws"), "_self");
				} catch (Exception var4) {
					;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ua.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public static final void providesignlink(ke var0) {
		try {
			++int_q;
			eh.ke_o = var0;
			kh.Y = var0;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ua.providesignlink(" + (var0 != null ? "{...}" : "null") + ')');
		}
	}

	public final URL getDocumentBase() {
		try {
			++C;
			return ce.Z != null ? null : eh.ke_o != null && this != eh.ke_o.applet_n ? eh.ke_o.applet_n.getDocumentBase() : super.getDocumentBase();
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ua.getDocumentBase(" + ')');
		}
	}

	public final void destroy() {
		try {
			++int_o;
			if (this == vh.ua_m && !wc.Y) {
				mf.y = nb.a(false);
				fc.a(5000L, 122);
				kh.Y = null;
				this.b((byte) 112);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ua.destroy(" + ')');
		}
	}

	public final void windowIconified(WindowEvent var1) {
		try {
			++int_t;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.windowIconified(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1, int var2, byte var3, int var4, int var5) {
		try {
			++int_j;

			try {
				if (vh.ua_m != null) {
					++vd.int_cb;
					if (~vd.int_cb <= -4) {
						this.a((byte) -107, "alreadyloaded");
					} else {
						this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					}
				} else {
					ad.int_m = var5;
					og.int_e = var1;
					int var6 = -92 % ((-58 - var3) / 53);
					vh.ua_m = this;
					pa.int_e = var2;
					if (eh.ke_o == null) {
						kh.Y = eh.ke_o = new ke(false, this, var4, null, 0);
					}

					eh.ke_o.a(this, 1, (byte) 46);
				}
			} catch (Exception var7) {
				ah.a(null, -106, var7);
				this.a((byte) -73, "crash");
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "ua.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	public final void run() {
		try {
			++int_c;

			try {
				if (ke.string_h != null) {
					String var1 = ke.string_h.toLowerCase();
					if (!var1.contains("sun") && !var1.contains("apple")) {
						if (var1.contains("ibm") && (ke.string_m == null || ke.string_m.equals("1.4.2"))) {
							this.a((byte) -44, "wrongjava");
							return;
						}
					} else {
						String var2 = ke.string_m;
						if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
							this.a((byte) -72, "wrongjava");
							return;
						}

						j.P = 5;
					}
				}

				if (eh.ke_o.applet_n != null) {
					Method var7 = ke.method_e;
					if (var7 != null) {
						try {
							var7.invoke(eh.ke_o.applet_n, Boolean.TRUE);
						} catch (Throwable throwable) {
							throwable.printStackTrace();
						}
					}
				}

				this.a(0);
				gh.Z = ie.a(-3503, pa.int_e, og.int_e, ae.U);
				this.d((int) '鱀');
				pe.uf_h = pf.g(31379);
				if (mf.y == 0L || mf.y > nb.a(false)) {
					do {
						mf.int_u = pe.uf_h.a(p.Ac, j.P, (byte) -58);
						int var8 = 0;
						while (var8 < mf.int_u) {
							this.c(true);
							++var8;
						}

						this.c((byte) -127);
						q.a(eh.ke_o, 0, ae.U);
					} while (mf.y == 0L || mf.y > nb.a(false));
				}
			} catch (Exception var5) {
				ah.a(null, -90, var5);
				this.a((byte) -116, "crash");
			}

			this.b((byte) 42);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ua.run(" + ')');
		}
	}

	final synchronized void a(int var1) {
		try {
			++int_i;
			if (var1 != 0) {
				Q = 41;
			}

			Container container;
			if (ce.Z == null) {
				container = eh.ke_o.applet_n;
			} else {
				container = ce.Z;
			}

			if (ae.U != null) {
				ae.U.removeFocusListener(this);
				container.remove(ae.U);
			}

			ae.U = new pe(this);
			container.add(ae.U);
			ae.U.setSize(og.int_e, pa.int_e);
			ae.U.setVisible(true);
			if (ce.Z == null) {
				ae.U.setLocation(0, 0);
			} else {
				Insets insets = ce.Z.getInsets();
				ae.U.setLocation(insets.left, insets.top);
			}

			ae.U.addFocusListener(this);
			ae.U.requestFocus();
			ib.boolean_s = true;
			sg.boolean_f = false;
			a.long_f = nb.a(false);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ua.P(" + var1 + ')');
		}
	}

	public final String getParameter(String var1) {
		try {
			++F;
			return ce.Z != null ? null : eh.ke_o != null && eh.ke_o.applet_n != this ? eh.ke_o.applet_n.getParameter(var1) : super.getParameter(var1);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.getParameter(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void a(boolean var1);

	public final void focusGained(FocusEvent var1) {
		try {
			++D;
			bd.boolean_n = true;
			ib.boolean_s = true;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, int var1, byte var2) {
		try {
			++int_f;
			rd var3 = nb.a(true, var0);
			int var4 = var3.N;
			if (var2 <= 8) {
				Q = 34;
			}

			int var5 = var3.S;
			int var6 = var3.U;
			int var7 = client.ints_jb[var6 + -var5];
			if (var1 < 0 || ~var7 > ~var1) {
				var1 = 0;
			}

			var7 <<= var5;
			uc.ints_ub[var4] = d.c(sd.a(uc.ints_ub[var4], ~var7), sd.a(var7, var1 << var5));
		} catch (RuntimeException var8) {
			throw ec.a(var8, "ua.N(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static final boolean a(boolean var0, int rootInterfaceID) {
		int var5 = client.int_gc;

		try {
			++H;
			if (de.booleans_w[rootInterfaceID]) {
				return true;
			} else if (!fd.cache3.b(rootInterfaceID, (byte) 103)) {
				return false;
			} else {
				int var2 = fd.cache3.b((byte) 90, rootInterfaceID);
				if (var2 == 0) {
					de.booleans_w[rootInterfaceID] = true;
					return true;
				} else {
					if (sc.vgs_db[rootInterfaceID] == null) {
						sc.vgs_db[rootInterfaceID] = new vg[var2];
					}

					int cacheID = 0;
					if (var5 == 0 && cacheID >= var2) {
						de.booleans_w[rootInterfaceID] = true;
						if (var0) {
							a(-128, -98, (byte) -54);
						}

						return true;
					} else {
						do {
							if (sc.vgs_db[rootInterfaceID][cacheID] == null) {
								byte[] var4 = fd.cache3.a(0, cacheID, rootInterfaceID);
								if (var4 != null) {
									sc.vgs_db[rootInterfaceID][cacheID] = new vg();
									sc.vgs_db[rootInterfaceID][cacheID].Z = cacheID + (rootInterfaceID << 16);
									if (var4[0] == -1) {
										sc.vgs_db[rootInterfaceID][cacheID].a(1, new ja(var4));
									} else {
										sc.vgs_db[rootInterfaceID][cacheID].a((byte) 95, new ja(var4));
									}
								}
							}

							++cacheID;
						} while (cacheID < var2);

						de.booleans_w[rootInterfaceID] = true;
						if (var0) {
							a(-128, -98, (byte) -54);
						}

						return true;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ua.J(" + var0 + ',' + rootInterfaceID + ')');
		}
	}

	public static void b(int var0) {
		try {
			O = null;
			T = null;
			y = null;
			J = null;
			hitmarks = null;
			R = null;
			if (var0 == 31) {
				K = null;
				ints_g = null;
				S = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ua.O(" + var0 + ')');
		}
	}

	public final void windowDeiconified(WindowEvent var1) {
		try {
			++int_s;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.windowDeiconified(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean b(boolean var1) {
		try {
			++int_k;
			String var2 = this.getDocumentBase().getHost().toLowerCase();
			if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
				if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
					if (!var1) {
						K = null;
					}

					if (var2.endsWith("127.0.0.1")) {
						return true;
					} else {
						while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48 && ~var2.charAt(var2.length() - 1) >= -58) {
							var2 = var2.substring(0, var2.length() + -1);
						}

						if (var2.endsWith("192.168.1.")) {
							return true;
						} else {
							this.a((byte) -74, "invalidhost");
							return false;
						}
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.M(" + var1 + ')');
		}
	}

	public final void windowDeactivated(WindowEvent var1) {
		try {
			++int_p;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.windowDeactivated(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void windowClosed(WindowEvent var1) {
		try {
			++int_d;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.windowClosed(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void c(int var1);

	public final void windowClosing(WindowEvent var1) {
		try {
			this.destroy();
			++int_r;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.windowClosing(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void update(Graphics var1) {
		try {
			this.paint(var1);
			++A;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.update(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	private void c(boolean var1) {
		try {
			++int_u;
			long var2 = nb.a(false);
			long var4 = rf.X[kb.int_f];
			rf.X[kb.int_f] = var2;
			boolean var10000;
			if (var4 != 0L && var2 > var4) {
				var10000 = true;
			} else {
				var10000 = false;
			}

			kb.int_f = 1 + kb.int_f & 31;
			if (var1) {
				synchronized (this) {
					wc.S = bd.boolean_n;
				}

				this.a((byte) -104);
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "ua.L(" + var1 + ')');
		}
	}

	public final synchronized void paint(Graphics var1) {
		try {
			++int_a;
			if (vh.ua_m == this && !wc.Y) {
				ib.boolean_s = true;
				if (ke.string_m != null && ke.string_m.startsWith("1.5") && nb.a(false) - a.long_f > 1000L) {
					Rectangle var2 = var1.getClipBounds();
					if (var2 == null || var2.width >= og.int_e && pa.int_e <= var2.height) {
						sg.boolean_f = true;
					}

				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.paint(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1, int var2, String var3, int var4, int var5, int var6, int var7) {
		try {
			try {
				og.int_e = var1;
				pa.int_e = var5;
				vh.ua_m = this;
				ad.int_m = var2;
				ce.Z = new Frame();
				ce.Z.setTitle("Jagex");
				int var9 = 20 / ((var4 - -13) / 33);
				ce.Z.setResizable(false);
				ce.Z.addWindowListener(this);
				ce.Z.setVisible(true);
				ce.Z.toFront();
				Insets var8 = ce.Z.getInsets();
				ce.Z.setSize(var8.left + var1 + var8.right, var8.bottom + var5 - -var8.top);
				kh.Y = eh.ke_o = new ke(true, null, var6, var3, var7);
				eh.ke_o.a(this, 1, (byte) 46);
			} catch (Exception var10) {
				ah.a(null, -78, var10);
			}

			++int_v;
		} catch (RuntimeException var11) {
			throw ec.a(var11, "ua.G(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	public abstract void init();

	abstract void a(byte var1);

	public final void windowOpened(WindowEvent var1) {
		try {
			++z;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.windowOpened(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	private synchronized void b(byte var1) {
		try {
			++int_b;
			if (!wc.Y) {
				wc.Y = true;

				try {
					ae.U.removeFocusListener(this);
				} catch (Exception var6) {
					;
				}

				try {
					this.a(true);
				} catch (Exception var5) {
					;
				}

				if (var1 <= 17) {
					M = -43;
				}

				if (ce.Z != null) {
					try {
						System.exit(0);
					} catch (Throwable var4) {
						;
					}
				}

				if (eh.ke_o != null) {
					try {
						eh.ke_o.a(false);
					} catch (Exception var3) {
						;
					}
				}

				this.d((byte) 2);
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ua.H(" + var1 + ')');
		}
	}

	public final void start() {
		try {
			++B;
			if (vh.ua_m == this && !wc.Y) {
				mf.y = 0L;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ua.start(" + ')');
		}
	}

	public final void stop() {
		try {
			++int_w;
			if (this == vh.ua_m && !wc.Y) {
				mf.y = 4000L + nb.a(false);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ua.stop(" + ')');
		}
	}

	public final AppletContext getAppletContext() {
		try {
			++x;
			return ce.Z != null ? null : eh.ke_o != null && this != eh.ke_o.applet_n ? eh.ke_o.applet_n.getAppletContext() : super.getAppletContext();
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ua.getAppletContext(" + ')');
		}
	}

	public final URL getCodeBase() {
		try {
			++int_n;
			return ce.Z != null ? null : eh.ke_o != null && this != eh.ke_o.applet_n ? eh.ke_o.applet_n.getCodeBase() : super.getCodeBase();
		} catch (RuntimeException var2) {
			throw var2;
		}
	}

	public final void focusLost(FocusEvent var1) {
		try {
			++int_m;
			bd.boolean_n = false;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	private void c(byte var1) {
		try {
			++G;
			long var2 = nb.a(false);
			int var6 = 118 % ((-64 - var1) / 47);
			long var4 = ka.V[ie.Kb];
			ka.V[ie.Kb] = var2;
			if (var4 != 0L && ~var2 < ~var4) {
				int var7 = (int) (var2 + -var4);
				ph.int_o = (32000 - -(var7 >> 1)) / var7;
			}

			ie.Kb = 31 & 1 + ie.Kb;
			if (bh.int_rb++ > 50) {
				bh.int_rb -= 50;
				ib.boolean_s = true;
				ae.U.setSize(og.int_e, pa.int_e);
				ae.U.setVisible(true);
				if (ce.Z == null) {
					ae.U.setLocation(0, 0);
				} else {
					Insets var9 = ce.Z.getInsets();
					ae.U.setLocation(var9.left, var9.top);
				}
			}

			this.c(16);
		} catch (RuntimeException var8) {
			throw ec.a(var8, "ua.A(" + var1 + ')');
		}
	}

	abstract void d(byte var1);

	public final void windowActivated(WindowEvent var1) {
		try {
			++int_e;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ua.windowActivated(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void d(int var1);

	static {
		O = J;
		N = false;
		hitmarks = dd.a("hitmarks", 2);
		T = dd.a("Titelbild geladen)3", 2);
		P = 0;
		R = new int[25];
	}
}
