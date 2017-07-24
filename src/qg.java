import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class qg extends kb implements MouseWheelListener {

	private int int_j = 0;

	final void a(byte var1, Component var2) {
		var2.removeMouseWheelListener(this);
		if (var1 < 114) {
			this.b((byte) 45);
		}

	}

	public final synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.int_j += var1.getWheelRotation();
	}

	final void a(Component var1, int var2) {
		int var3 = -61 % ((var2 - -85) / 36);
		var1.addMouseWheelListener(this);
	}

	final synchronized int b(byte var1) {
		if (var1 < 26) {
			return 96;
		} else {
			int var2 = this.int_j;
			this.int_j = 0;
			return var2;
		}
	}
}
