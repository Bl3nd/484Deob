final class qh implements Runnable {

	static int int_a;
	static int int_b;
	static int int_c;
	static int int_d;
	static lf lf_e;
	final Object object_f = new Object();
	private static lf lf_g = dd.a("Benutzername: ", 2);
	boolean boolean_h = true;
	static int int_i;
	static int int_j;
	private static lf lf_k = dd.a("flash2:", 2);
	static int int_l;
	static lf lf_m;
	static int int_n;
	int[] ints_o = new int[500];
	int int_p = 0;
	int[] ints_q = new int[500];

	static final void a(int var0, int var1, int var2, boolean var3, int var4) {
		int var14 = client.int_gc;

		try {
			++int_c;
			b.c(var4, var0, var1 + var4, var2 + var0);
			nc.d();
			++fd.int_t;
			gb.a(true, 0);
			td.a((byte) -33, true);
			gb.a(var3, 0);
			td.a((byte) -99, false);
			e.a((byte) 56);
			bg.b((int) 117);
			int var5;
			int var6;
			if (!lf.boolean_q) {
				var5 = pc.int_a;
				if (var5 < ah.int_i / 256) {
					var5 = ah.int_i / 256;
				}

				if (pa.booleans_i[4] && var5 < client.ints_ab[4] + 128) {
					var5 = 128 + client.ints_ab[4];
				}

				var6 = 2047 & hg.int_j + h.int_l;
				p.a(67, var6, a.int_e, 3 * var5 + 600, bh.a(r.X.int_nc, var3, hc.int_pb, r.X.int_fb) + -50, ba.int_n, var5);
			}

			label99:
			{
				if (!lf.boolean_q) {
					var5 = fd.a((int) 80);
					if (var14 == 0) {
						break label99;
					}
				}

				var5 = r.e(662);
			}

			int var7 = nd.y;
			var6 = dh.int_i;
			int var8 = mb.A;
			int var9 = hc.int_hb;
			int var10 = pd.int_c;
			int var11 = 0;
			int var12;
			if (var14 != 0) {
				if (pa.booleans_i[var11]) {
					var12 = (int) ((double) (-ld.T[var11]) + Math.random() * (double) (ld.T[var11] * 2 + 1) + Math.sin((double) gh.Q[var11] * ((double) tg.Q[var11] / 100.0D)) * (double) client.ints_ab[var11]);
					if (~var11 == -1) {
						dh.int_i += var12;
					}

					if (~var11 == -4) {
						pd.int_c = 2047 & pd.int_c - -var12;
					}

					if (~var11 == -3) {
						mb.A += var12;
					}

					if (var11 == 1) {
						nd.y += var12;
					}

					if (~var11 == -5) {
						hc.int_hb += var12;
						if (~hc.int_hb > -129) {
							hc.int_hb = 128;
						}

						if (hc.int_hb > 383) {
							hc.int_hb = 383;
						}
					}
				}

				++var11;
			}

			for (; ~var11 > -6; ++var11) {
				if (pa.booleans_i[var11]) {
					var12 = (int) ((double) (-ld.T[var11]) + Math.random() * (double) (ld.T[var11] * 2 + 1) + Math.sin((double) gh.Q[var11] * ((double) tg.Q[var11] / 100.0D)) * (double) client.ints_ab[var11]);
					if (~var11 == -1) {
						dh.int_i += var12;
					}

					if (~var11 == -4) {
						pd.int_c = 2047 & pd.int_c - -var12;
					}

					if (~var11 == -3) {
						mb.A += var12;
					}

					if (var11 == 1) {
						nd.y += var12;
					}

					if (~var11 == -5) {
						hc.int_hb += var12;
						if (~hc.int_hb > -129) {
							hc.int_hb = 128;
						}

						if (hc.int_hb > 383) {
							hc.int_hb = 383;
						}
					}
				}
			}

			int var13;
			label93:
			{
				var12 = c.int_bb;
				var13 = lf.int_c;
				if (var4 <= var12 && ~var12 > ~(var4 - -var1) && ~var0 >= ~var13 && var13 < var0 + var2) {
					ue.int_wb = c.int_bb - var4;
					ue.boolean_nb = true;
					ue.int_fb = 0;
					ue.int_ub = lf.int_c + -var0;
					if (var14 == 0) {
						break label93;
					}
				}

				ue.boolean_nb = false;
				ue.int_fb = 0;
			}

			uf.a((byte) 98);
			b.e(var4, var0, var1, var2, 0);
			uf.a((byte) 89);
			hf.a(dh.int_i, nd.y, mb.A, hc.int_hb, pd.int_c, var5);
			uf.a((byte) 104);
			rd.a();
			je.a(var2, var0, (byte) 63, var4, var1);
			ge.a(var0, -28, var4);
			((bc) nc.Z).e(36, v.int_tb);
			nf.a((byte) 124, var4, var0, var1, var2);
			nd.y = var7;
			dh.int_i = var6;
			pd.int_c = var10;
			hc.int_hb = var9;
			mb.A = var8;
			if (eg.boolean_k && re.a(true, false, false) == 0) {
				eg.boolean_k = false;
			}

			if (eg.boolean_k) {
				b.e(var4, var0, var1, var2, 0);
				l.a(me.loading_pleaseWait, -1, false);
			}

			if (!eg.boolean_k && !f.boolean_ab && var12 >= var4 && var4 + var1 > var12 && ~var0 >= ~var13 && ~var13 > ~(var0 - -var2)) {
				od.a(var4, var13, var12, var0, (byte) 29);
			}
		} catch (RuntimeException var15) {
			throw ec.a(var15, "qh.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static final ei a(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		return var3 != null && var3.D != null ? var3.D : null;
	}

	static final void a(byte var0) {
		int var2 = client.int_gc;

		try {
			pa.lf_l = nh.lf_ob;
			tc.Q = bb.lf_kb;
			bc.lf_kb = qd.lf_c;
			bc.K = nh.lf_ob;
			tc.lf_mb = i.Nb;
			bc.lf_b = nh.lf_ob;
			cb.lf_c = sb.lf_f;
			id.lf_u = jf.C;
			ph.lf_n = tf.lf_r;
			og.lf_g = tg.Y;
			jg.D = md.lf_g;
			hh.V = jc.y;
			ph.lf_v = tf.lf_r;
			bc.lf_fb = nh.lf_ob;
			me.lf_o = pa.lf_b;
			kb.lf_i = nb.lf_h;
			bc.lf_l = nh.lf_ob;
			if (var0 <= 52) {
				a((byte) -57);
			}

			jf.B = ga.lf_f;
			rf.lf_fb = pd.lf_w;
			ad.pleaseWait1MinuteAndTryAgain2 = se.Z;
			gh.Y = u.Rc;
			u.lf_jd = rd.T;
			wc.W = hf.lf_q;
			ka.Z = tb.W;
			fb.lf_f = pd.x;
			ch.lf_r = kh.W;
			vh.lf_g = v.lf_ob;
			sf.Q = lh.lf_eb;
			va.P = ag.lf_e;
			f.lf_fb = ma.lf_r;
			dg.lf_n = kb.lf_d;
			wg.lf_e = nf.lf_b;
			tc.lf_gb = bi.I;
			de.lf_s = ad.lf_q;
			ma.lf_l = og.lf_j;
			me.loading_pleaseWait = wh.lf_e;
			bc.lf_jb = nh.lf_ob;
			pb.lf_b = sb.lf_a;
			ma.lf_s = ce.T;
			d.lf_cb = vg.R;
			of.D = ka.Q;
			cb.lf_t = oa.lf_bb;
			pb.lf_a = rb.lf_j;
			ld.U = va.lf_cb;
			ne.lf_c = a.lf_a;
			hb.lf_l = a.lf_b;
			ja.R = be.lf_u;
			te.P = ea.lf_d;
			ib.lf_d = rc.lf_u;
			bc.lf_i = nh.lf_ob;
			bc.lf_ab = nh.lf_ob;
			pb.lf_l = h.lf_i;
			ub.lf_ab = nf.lf_q;
			p.yc = sb.lf_k;
			bc.I = nh.lf_ob;
			fb.lf_b = pd.x;
			re.lf_m = a.lf_c;
			vf.lf_s = di.lf_cb;
			sf.R = he.I;
			bc.H = q.lf_pb;
			of.lf_q = eg.lf_j;
			ph.x = id.D;
			bi.R = wb.lf_d;
			lc.x = ub.Y;
			r.lf_cb = wb.lf_i;
			bc.lf_w = nh.lf_ob;
			tb.U = fb.lf_a;
			id.lf_q = id.y;
			oh.lf_cb = bi.X;
			bc.lf_v = nh.lf_ob;
			bc.S = ah.lf_f;
			pe.lf_p = qe.lf_d;
			bc.R = ce.U;
			ei.lf_d = j.lf_v;
			ng.G = fd.lf_g;
			ph.lf_t = hd.lf_v;
			wh.lf_l = md.lf_a;
			bc.Z = nh.lf_ob;
			bc.lf_g = bh.lf_cb;
			cb.lf_o = ig.lf_v;
			ec.T = rc.lf_f;
			bc.lf_q = o.lf_b;
			oa.X = je.lf_l;
			rf.lf_ib = ua.T;
			va.lf_fb = f.R;
			vf.startingGameEngine = ph.F;
			bc.U = o.lf_a;
			qd.lf_d = th.lf_b;
			ed.y = ie.Qb;
			pb.lf_d = qd.lf_c;
			bb.lf_hb = h.lf_q;
			jg.lf_w = tf.lf_f;
			bc.lf_k = lf.lf_bb;
			jc.lf_w = m.Y;
			pa.lf_w = ed.A;
			pa.lf_t = sd.Bb;
			bc.Y = nh.lf_ob;
			ai.welcomeToRuneScape = wh.lf_o;
			ha.I = ig.lf_f;
			bc.lf_a = nh.lf_ob;
			bc.y = nh.lf_ob;
			he.G = ef.lf_b;
			ua.O = ia.lf_g;
			uc.Qb = sd.Eb;
			oh.lf_wb = fa.lf_db;
			j.K = se.lf_eb;
			lb.lf_s = ib.lf_r;
			pb.lf_c = sb.lf_a;
			nb.lf_f = ac.T;
			bd.lf_m = re.lf_b;
			bc.lf_f = lf.lf_bb;
			bc.E = di.Y;
			hd.lf_q = te.I;
			og.lf_i = i.Jb;
			md.lf_i = ci.lf_nb;
			lb.lf_r = pf.Z;
			gh.lf_jb = ne.lf_r;
			bc.lf_e = nh.lf_ob;
			oh.lf_ob = lc.lf_o;
			jf.lf_v = oh.lf_mb;
			gg.lf_c = pa.lf_c;
			dc.R = pe.lf_d;
			nf.lf_n = nh.lf_bb;
			tc.lf_bb = ch.lf_e;
			cf.K = he.O;
			cb.x = e.lf_k;
			ca.lf_d = c.R;
			pf.lf_mb = de.lf_r;
			eh.lf_f = ci.lf_qb;
			dh.lf_e = fc.T;
			bc.V = n.lf_l;
			bc.lf_t = tg.lf_cb;
			lf_e = tc.lf_ob;
			d.lf_bb = vg.R;
			wh.lf_h = ba.lf_c;
			fd.lf_h = vg.zb;
			ug.lf_ab = jf.M;
			ne.lf_q = ac.V;
			ha.D = rb.lf_m;
			bb.X = je.lf_g;
			lh.U = gg.lf_l;
			pf.S = ub.U;
			bc.z = q.lf_pb;
			d.T = ch.lf_n;
			nf.lf_g = eh.lf_k;
			ff.lf_c = re.lf_f;
			bc.L = nh.lf_ob;
			tb.Z = ia.lf_m;
			bc.lf_r = kd.lf_hb;
			lb.lf_w = ph.z;
			va.lf_eb = fb.lf_o;
			u.lf_dd = rd.I;
			bc.lf_n = nh.lf_ob;
			pb.lf_m = qd.lf_c;
			bc.lf_db = td.H;
			je.lf_d = lb.G;
			bc.lf_p = nh.lf_ob;
			ec.lf_gb = eh.lf_b;
			rf.lf_mb = vh.lf_l;
			re.lf_n = ea.lf_a;
			pb.lf_k = qd.lf_c;
			fi.lf_v = be.art;
			bc.lf_s = tg.lf_cb;
			vd.lf_db = ag.lf_i;
			ha.lf_o = bb.Y;
			td.K = jh.lf_n;
			ff.lf_k = pf.lf_fb;
			++int_j;
			og.lf_q = ig.lf_o;
			fa.S = ne.lf_v;
			ea.lf_f = dg.lf_q;
			gh.lf_eb = fc.S;
			jg.preparedVisibilityMap = ae.Y;
			pf.W = ng.P;
			fb.lf_p = dh.lf_b;
			bg.lf_a = se.lf_bb;
			bc.G = nh.lf_ob;
			hh.J = ug.V;
			ig.lf_l = hd.lf_n;
			m.S = u.Pc;
			ie.Ob = qd.lf_a;
			bc.lf_ib = nh.lf_ob;
			td.O = lf_g;
			ad.noReplyFromLoginserver = dh.lf_d;
			ad.pleaseWait1MinuteAndTryAgain = se.Z;
			qb.X = tf.lf_b;
			uf.lf_e = af.lf_n;
			fb.lf_d = eg.lf_e;
			bi.lf_cb = ic.lf_p;
			ac.lf_db = ci.lf_jb;
			od.U = q.lf_ib;
			u.Nc = cf.lf_i;
			bc.lf_eb = nh.lf_ob;
			wh.lf_j = ba.lf_c;
			rb.lf_o = pb.lf_i;
			jc.x = a.lf_d;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "qh.D(" + var0 + ')');
		}

		if (ua.U) {
			++var2;
			client.int_gc = var2;
		}

	}

	public static void b(byte var0) {
		try {
			lf_k = null;
			lf_e = null;
			lf_m = null;
			lf_g = null;
			int var1 = -80 % ((var0 - 83) / 38);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "qh.B(" + var0 + ')');
		}
	}

	public final void run() {
		int var2 = client.int_gc;

		try {
			if (var2 == 0 && !this.boolean_h) {
				++int_b;
			} else {
				do {
					synchronized (this.object_f) {
						if (~this.int_p > -501) {
							this.ints_q[this.int_p] = c.int_bb;
							this.ints_o[this.int_p] = lf.int_c;
							++this.int_p;
						}
					}

					fc.a(50L, -23);
				} while (this.boolean_h);

				++int_b;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "qh.run(" + ')');
		}
	}

	static {
		lf_e = lf_k;
		lf_m = lf_k;
	}
}
