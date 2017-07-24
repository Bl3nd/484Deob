import java.nio.ByteBuffer;

final class ve extends pg {

	private ByteBuffer byteBuffer_l;

	final void a(byte var1, byte[] var2) {
		try {
			this.byteBuffer_l = ByteBuffer.allocateDirect(var2.length);
			this.byteBuffer_l.position(0);
			int var3 = 76 / ((47 - var1) / 52);
			this.byteBuffer_l.put(var2);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	final byte[] b(byte var1) {
		byte[] buffer = new byte[this.byteBuffer_l.capacity()];
		if (var1 < 104) {
			this.a((byte) -90, (byte[]) null);
		}

		this.byteBuffer_l.position(0);
		this.byteBuffer_l.get(buffer);
		return buffer;
	}
}
