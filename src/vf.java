final class vf extends hb {

	private static lf lf_n = dd.a("Your profile will be transferred in:", 2);
	int int_o;
	int int_p;
	private static lf mStartingGameEngine;//lf_q
	static lf startingGameEngine;//lf_r
	static lf lf_s;
	static int int_t;
	int int_u;
	int int_v;
	static int int_w;
	int x;
	int y;
	jb z;
	static int A = 0;
	static int B = 0;
	static lf mapmarker = dd.a("mapmarker", 2);
	static lf D;
	int E;
	int F;
	k G;
	static nd H;
	int I;
	int K;
	static int L;
	int M;
	mb N;
	static int O;
	int P;
	int Q;
	int R;
	int S;
	int T;
	static int U;
	int V;
	ne W;

	final void c(byte var1) {
		try {
			this.N = null;
			++int_w;
			if (var1 <= 64) {
				b(false);
			}

			this.G = null;
			this.z = null;
			this.W = null;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "vf.A(" + var1 + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			startingGameEngine = null;
			mapmarker = null;
			lf_s = null;
			if (!var0) {
				A = -87;
			}

			D = null;
			lf_n = null;
			H = null;
			mStartingGameEngine = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "vf.B(" + var0 + ')');
		}
	}

	static {
		lf_s = lf_n;
		U = 0;
		int_t = 0;
		D = dd.a("m", 2);
		mStartingGameEngine = dd.a("Starting game engine)3)3)3", 2);
		startingGameEngine = mStartingGameEngine;
	}
}
