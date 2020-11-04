import java.io.InputStream;

final class ac extends InputStream {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final InputStream a;
   private boolean b;
   private bu c;

   ac(bu var1, InputStream var2) {
      this.c = var1;
      this.c.a = this;
      this.a = var2;
   }

   public int read() {
      if (this.b) {
         return -1;
      } else {
         int var1 = this.a.read();
         if (var1 == -1) {
            this.close();
         }

         return var1;
      }
   }

   public int available() {
      return this.b ? 0 : this.a.available();
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
         int var4 = this.a.read(var1, var2, var3);
         if (var4 == -1) {
            this.close();
         }

         return var4;
      }
   }

   public long skip(long var1) {
      return this.b ? 0L : this.a.skip(var1);
   }
}
