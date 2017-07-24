import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class pe extends Canvas {

	static int int_a;
	static t t_b;
	static be be_c = new be();
	static lf lf_d = dd.a(": ", 2);
	static int int_e;
	static int int_f;
	static int int_g;
	static uf uf_h;
	static lf lf_i = dd.a("nav", 2);
	static int int_j;
	private static lf lf_k = dd.a(" has logged out)3", 2);
	static int int_l;
	static int int_m;
	private Component component_n;
	static int int_o;
	static lf lf_p;

	static final void a(int var0, uc var1, int var2) {
		try {
			++int_o;
			ec.a(var1.int_fb, var1.int_nc, (byte) 24, var2);
			if (var0 != -25993) {
				int_j = -28;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "pe.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public static void a(boolean var0) {
		try {
			be_c = null;
			lf_k = null;
			t_b = null;
			lf_p = null;
			lf_i = null;
			uf_h = null;
			lf_d = null;
			if (!var0) {
				uf_h = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pe.B(" + var0 + ')');
		}
	}

	public final void paint(Graphics var1) {
		try {
			++int_f;
			this.component_n.paint(var1);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pe.paint(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void update(Graphics var1) {
		try {
			++int_a;
			this.component_n.update(var1);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pe.update(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	pe(Component var1) {
		try {
			this.component_n = var1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pe.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_p = lf_k;
		int_m = 0;
		int_j = 0;
	}
}
