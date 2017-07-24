import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

final class jd extends ah {

	private AudioFormat mAudioFormat;
	private int N;
	private SourceDataLine mSourceDataLine;
	private byte[] P;

	final void b(int var1) throws LineUnavailableException {
		try {
			Info info = new Info(SourceDataLine.class, this.mAudioFormat, var1 << (sc.channel ? 2 : 1));
			this.mSourceDataLine = (SourceDataLine) AudioSystem.getLine(info);
			this.mSourceDataLine.open();
			this.mSourceDataLine.start();
			this.N = var1;
		} catch (LineUnavailableException lue) {
			lue.printStackTrace();
			if (ab.a(1834, var1) != 1) {
				this.b(nd.a(true, var1));
			} else {
				this.mSourceDataLine = null;
				throw lue;
			}
		}
	}

	final void a(Component component) {
		this.mAudioFormat = new AudioFormat((float) cb.sampleRate, 16, !sc.channel ? 1 : 2, true, false);
		this.P = new byte[256 << (sc.channel ? 2 : 1)];
	}

	final void d() {
		this.mSourceDataLine.flush();
	}

	final int a() {
		return this.N - (this.mSourceDataLine.available() >> (!sc.channel ? 1 : 2));
	}

	final void c() {
		int var1 = 256;
		if (sc.channel) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = this.ints_q[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.P[var2 * 2] = (byte) (var3 >> 8);
			this.P[var2 * 2 + 1] = (byte) (var3 >> 16);
		}

		this.mSourceDataLine.write(this.P, 0, var1 << 1);
	}

	final void b() {
		if (null != this.mSourceDataLine) {
			this.mSourceDataLine.close();
			this.mSourceDataLine = null;
		}

	}
}
