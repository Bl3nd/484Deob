import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class sa {

	private long long_a;
	private File file_b;
	private RandomAccessFile randomAccessFile_c;
	private long long_d;

	protected final void finalize() throws Throwable {
		try {
			if (this.randomAccessFile_c != null) {
				System.out.println("Warning! fileondisk " + this.file_b + " not closed correctly using close(). Auto-closing instead. ");
				this.a((byte) -119);
			}
		} catch (RuntimeException var2) {
			throw var2;
		}
	}

	public final void a(byte var1) throws IOException {
		try {
			int var2 = 74 % ((var1 - -44) / 54);
			if (this.randomAccessFile_c != null) {
				this.randomAccessFile_c.close();
				this.randomAccessFile_c = null;
			}
		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public final void a(byte[] var1, int var2, byte var3, int var4) throws IOException {
		try {
			if (var3 != -7) {
				this.file_b = null;
			}

			if (~this.long_d > ~(this.long_a + (long) var4)) {
				this.randomAccessFile_c.seek(this.long_d + 1L);
				this.randomAccessFile_c.write(1);
				throw new EOFException();
			} else {
				this.randomAccessFile_c.write(var1, var2, var4);
				this.long_a += (long) var4;
			}
		} catch (RuntimeException var6) {
			throw var6;
		}
	}

	public final int a(int var1, byte[] var2, int var3, int var4) throws IOException {
		try {
			int var5 = this.randomAccessFile_c.read(var2, var3, var1);
			if (~var5 < -1) {
				this.long_a += (long) var5;
			}

			if (var4 != 1) {
				this.randomAccessFile_c = null;
			}

			return var5;
		} catch (RuntimeException var6) {
			throw var6;
		}
	}

	public final void a(int var1, long var2) throws IOException {
		try {
			this.randomAccessFile_c.seek(var2);
			this.long_a = var2;
			if (var1 >= -18) {
				this.randomAccessFile_c = null;
			}
		} catch (RuntimeException var5) {
			throw var5;
		}
	}

	public final File a(boolean var1) {
		try {
			return var1 ? null : this.file_b;
		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	sa(File var1, String var2, long var3) throws IOException {
		try {
			if (var3 == -1L) {
				var3 = Long.MAX_VALUE;
			}

			if (~var3 >= ~var1.length()) {
				var1.delete();
			}

			this.randomAccessFile_c = new RandomAccessFile(var1, var2);
			this.long_a = 0L;
			this.file_b = var1;
			this.long_d = var3;
			int var5 = this.randomAccessFile_c.read();
			if (~var5 != 0 && !var2.equals("r")) {
				this.randomAccessFile_c.seek(0L);
				this.randomAccessFile_c.write(var5);
			}

			this.randomAccessFile_c.seek(0L);
		} catch (RuntimeException var6) {
			throw var6;
		}
	}

	public final long a(int var1) throws IOException {
		try {
			int var2 = -18 % ((1 - var1) / 62);
			return this.randomAccessFile_c.length();
		} catch (RuntimeException var3) {
			throw var3;
		}
	}
}
