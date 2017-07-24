import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class ke implements Runnable {

	public sa sa_a = null;
	private Thread thread_b;
	public sa sa_c = null;
	public sa sa_d = null;
	public static Method method_e;
	private static String string_f;
	private da da_g = null;
	public static String string_h;
	private boolean boolean_i = false;
	public EventQueue eventQueue_j;
	private da da_k = null;
	public sa[] sas_l;
	public static String string_m;
	public Applet applet_n = null;
	public static int int_o = 3;
	private fg fg_p;
	private File file_q = null;
	public static Method method_r;
	public File file_s = null;

	public final da a(Runnable runnable, int var2, byte var3) {
		if (var3 != 46) {
			this.applet_n = null;
		}

		return this.a(var2, runnable, 2, (byte) 121, 0);
	}

	public final fg a(int var1) {
		int var2 = -65 % ((var1 - -73) / 32);
		return this.fg_p;
	}

	private da a(int var1, Object var2, int var3, byte var4, int var5) {
		if (var4 <= 49) {
			return null;
		} else {
			da var6 = new da();
			var6.int_f = var1;
			var6.object_e = var2;
			var6.int_b = var3;
			synchronized (this) {
				if (this.da_g == null) {
					this.da_g = this.da_k = var6;
				} else {
					this.da_g.da_d = var6;
					this.da_g = var6;
				}

				this.notify();
			}

			return var6;
		}
	}

	public final da a(Class var1, String var2, boolean var3) {
		if (!var3) {
			this.sa_d = null;
		}

		return this.a(0, new Object[]{var1, var2}, 9, (byte) 76, 0);
	}

	private void a(String var1, int var2, byte var3, int var4) {
		if (var4 < 32 || var4 > 34) {
			var4 = 32;
		}

		int var6 = 69 / ((var3 - 26) / 63);
		String[] var5 = new String[]{"./rscache/"/*"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", string_f, "/tmp/", ""*/};
		String[] var7 = new String[]{".jagex_cache_" + var4, ".file_store_" + var4};

		for (int var8 = 0; ~var8 > -3; ++var8) {
			for (int var9 = 0; ~var7.length < ~var9; ++var9) {
				for (int var10 = 0; ~var10 > ~var5.length; ++var10) {
					try {
						String var11 = var5[var10];
						if (var11.length() > 0 && !(new File(var11)).exists()) {
							continue;
						}

						File var12 = new File(var11 + var7[var9]);
						boolean var13;
						if (var8 == 1 && !var12.exists()) {
							var13 = var12.mkdir();
							if (!var13) {
								continue;
							}
						}

						File var20;
						if (this.sa_d == null) {
							try {
								var20 = new File(var12, "random.dat");
								if (~var8 == -2 || var20.exists()) {
									this.sa_d = new sa(var20, "rw", 25L);
								}
							} catch (Exception var16) {
								this.sa_d = null;
							}
						}

						if (this.file_q == null) {
							try {
								var12 = new File(var12, var1);
								if (~var8 == -2 && !var12.exists()) {
									var13 = var12.mkdir();
									if (!var13) {
										continue;
									}
								}

								var20 = new File(var12, "main_file_cache.dat2");
								if (~var8 == -1 && !var20.exists()) {
									continue;
								}

								this.sa_a = new sa(var20, "rw", 104857600L);
								this.sas_l = new sa[var2];

								for (int var14 = 0; var2 > var14; ++var14) {
									this.sas_l[var14] = new sa(new File(var12, "main_file_cache.idx" + var14), "rw", 1048576L);
								}

								this.sa_c = new sa(new File(var12, "main_file_cache.idx255"), "rw", 1048576L);
								this.file_s = this.file_q = var12;
							} catch (Exception var17) {
								try {
									this.sa_a.a((byte) 91);

									for (int var21 = 0; var2 > var21; ++var21) {
										this.sas_l[var21].a((byte) 107);
									}

									this.sa_c.a((byte) 39);
								} catch (Exception var15) {
									;
								}

								this.sas_l = null;
								this.file_s = this.file_q = null;
								this.sa_a = this.sa_c = null;
							}
						}
					} catch (Exception var18) {
						;
					}

					if (this.sa_d != null && this.file_q != null) {
						return;
					}
				}
			}
		}

		if (this.file_q == null) {
			throw new RuntimeException();
		}
	}

	public final da a(URL var1, int var2) {
		return var2 != -896798992 ? null : this.a(0, var1, 4, (byte) 122, 0);
	}

	public final void run() {
		while (true) {
			da var1;
			synchronized (this) {
				label120:
				{
					while (!this.boolean_i) {
						if (this.da_k != null) {
							var1 = this.da_k;
							this.da_k = this.da_k.da_d;
							if (this.da_k == null) {
								this.da_g = null;
							}
							break label120;
						} else {
							try {
								this.wait();
							} catch (InterruptedException ie) {
								ie.printStackTrace();
							}
						}
					}

					return;
				}
			}


			try {
				int var2 = var1.int_b;
				if (~var2 != -2) {
					if (~var2 == -3) {
						Thread var3 = new Thread((Runnable) var1.object_e);
						var3.setDaemon(true);
						var3.start();
						var3.setPriority(var1.int_f);
						var1.object_c = var3;
					} else if (var2 == 4) {
						var1.object_c = new DataInputStream(((URL) var1.object_e).openStream());
					} else {
						Object[] var14;
						if (~var2 != -9) {
							if (var2 != 9) {
								throw new Exception();
							}

							var14 = (Object[]) var1.object_e;
							var1.object_c = ((Class) var14[0]).getDeclaredField((String) var14[1]);
						} else {
							var14 = (Object[]) var1.object_e;
							var1.object_c = ((Class) var14[0]).getDeclaredMethod((String) var14[1], (Class[]) var14[2]);
						}
					}
				} else {
					var1.object_c = new Socket(InetAddress.getByName((String) var1.object_e), var1.int_f);
				}

				var1.int_a = 1;
			} catch (ThreadDeath var9) {
				throw var9;
			} catch (Throwable var10) {
				var1.int_a = 2;
			}
		}
	}

	public final void a(boolean var1) {
		synchronized (this) {
			this.boolean_i = true;
			if (var1) {
				this.sa_a = null;
			}

			this.notifyAll();
		}

		try {
			this.thread_b.join();
		} catch (InterruptedException var14) {
			;
		}

		if (this.sa_a != null) {
			try {
				this.sa_a.a((byte) -125);
			} catch (IOException var13) {
				;
			}
		}

		if (this.sa_c != null) {
			try {
				this.sa_c.a((byte) -104);
			} catch (IOException var12) {
				;
			}
		}

		if (this.sas_l != null) {
			for (int var2 = 0; ~var2 > ~this.sas_l.length; ++var2) {
				if (this.sas_l[var2] != null) {
					try {
						this.sas_l[var2].a((byte) -118);
					} catch (IOException var11) {
						;
					}
				}
			}
		}

		if (this.sa_d != null) {
			try {
				this.sa_d.a((byte) -126);
			} catch (IOException var10) {
				;
			}
		}
	}

	public final da a(int var1, boolean var2, String var3) {
		if (var2) {
			this.a((URL) null, 31);
		}

		return this.a(var1, var3, 1, (byte) 75, 0);
	}

	public final da a(String var1, Class[] var2, Class var3, byte var4) {
		if (var4 <= 71) {
			this.da_g = null;
		}

		return this.a(0, new Object[]{var3, var1, var2}, 8, (byte) 90, 0);
	}

	public final da a(int var1, int var2) {
		return var1 != 7249 ? null : this.a(var2, (Object) null, 3, (byte) 51, 0);
	}

	public ke(boolean var1, Applet var2, int var3, String var4, int var5) {
		string_m = "1.1";
		this.applet_n = var2;
		string_h = "Unknown";

		try {
			string_h = System.getProperty("java.vendor");
			string_m = System.getProperty("java.version");
		} catch (Exception var11) {
			;
		}

		try {
			string_f = System.getProperty("user.home");
			if (string_f != null) {
				string_f = string_f + "/";
			}
		} catch (Exception var10) {
			;
		}

		if (string_f == null) {
			string_f = "~/";
		}

		try {
			this.eventQueue_j = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var9) {
			;
		}

		try {
			if (var2 != null) {
				method_r = var2.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
			} else {
				method_r = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
			}
		} catch (Exception var8) {
			;
		}

		try {
			if (var2 != null) {
				method_e = var2.getClass().getMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
			} else {
				method_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
			}
		} catch (Exception var7) {
			;
		}

		if (var1) {
			this.a(var4, var5, (byte) -90, var3);
		}

		this.boolean_i = false;
		this.thread_b = new Thread(this);
		this.thread_b.setPriority(10);
		this.thread_b.setDaemon(true);
		this.thread_b.start();
	}
}
