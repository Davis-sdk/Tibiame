import java.io.InputStream;

final class aj extends InputStream {
   private byte[] a;
   private int b;
   private final a c;

   private aj(a var1) {
      this.c = var1;
   }

   public int read() {
      if (this.a == null) {
         return -1;
      } else if (this.b >= this.a.length) {
         this.a = null;
         return -1;
      } else {
         return this.a[this.b++] & 255;
      }
   }

   public int available() {
      return this.a == null ? 0 : this.a.length - this.b;
   }

   public void close() {
      this.a = null;
   }

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public int read(byte[] var1, int var2, int var3) {
      if (this.a == null) {
         return -1;
      } else if (this.b >= this.a.length) {
         this.a = null;
         return -1;
      } else {
         int var4 = Math.min(this.available(), var3);
         System.arraycopy(this.a, this.b, var1, var2, var4);
         this.b += var4;
         return var4;
      }
   }

   public long skip(long var1) {
      if (this.a == null) {
         return -1L;
      } else if (this.b >= this.a.length) {
         this.a = null;
         return 0L;
      } else {
         int var3 = (int)Math.min((long)this.available(), var1);
         this.b += var3;
         return (long)var3;
      }
   }

   private void a(byte[] var1) {
      this.a = var1;
      this.b = 0;
   }

   aj(a var1, bn var2) {
      this(var1);
   }

   static void a(aj var0, byte[] var1) {
      var0.a(var1);
   }
}
