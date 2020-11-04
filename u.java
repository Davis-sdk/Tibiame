import java.io.InputStream;

final class u extends InputStream {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final byte[] a;
   private boolean b;
   private bu c;
   private int d;
   private int e;

   u(bu var1, byte[] var2, int var3) {
      this.c = var1;
      this.c.a = this;
      this.a = var2;
      this.d = var3;
   }

   public int read() {
      if (this.b) {
         return -1;
      } else {
         int var1 = this.a[this.e++] & 255;
         if (this.e == this.d) {
            this.close();
         }

         return var1;
      }
   }

   public int available() {
      return this.b ? 0 : this.d - this.e;
   }

   public void close() {
      if (!this.b) {
         this.b = true;
         this.c.l();
      }

   }

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public int read(byte[] var1, int var2, int var3) {
      if (this.b) {
         return -1;
      } else {
         int var4 = Math.min(this.d - this.e, var3);
         System.arraycopy(this.a, this.e, var1, var2, var4);
         this.e += var4;
         if (this.e == this.d) {
            this.close();
         }

         return var4;
      }
   }

   public long skip(long var1) {
      if (this.b) {
         return 0L;
      } else {
         int var3 = (int)Math.min((long)(this.d - this.e), var1);
         this.e += var3;
         if (this.e == this.d) {
            this.close();
         }

         return (long)var3;
      }
   }
}
