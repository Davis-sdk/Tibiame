public abstract class d {
   static final int MBOOSTER_MAX_INSTANCES = 111;
   protected bv a;
   final byte[] b;
   final short[] c;

   protected d(int var1, int var2) {
      this.b = new byte[var1];
      this.c = var2 > 0 ? new short[var2] : null;
      this.b(true);
   }

   public final boolean a() {
      return this.c(1);
   }

   public final void a(boolean var1) {
      if (this.c(1) != var1) {
         this.b(var1);
         if (this.a != null) {
            this.a.d(this);
         }
      }

   }

   public final void b(boolean var1) {
      this.a(1, var1);
   }

   public void a(bv var1) {
      this.a = var1;
   }

   public abstract boolean a(int var1, int var2);

   public abstract void a(s var1, byte var2);

   public abstract void a(byte var1, byte var2);

   public void a(int var1) {
   }

   public final void b() {
      if (!this.c(2)) {
         this.a(2, true);
         this.c();
         if (this.a != null) {
            this.a.c(this);
            this.a = null;
         }
      }

   }

   protected final void b(int var1) {
      byte[] var10000 = this.b;
      var10000[0] &= (byte)(~var1);
   }

   protected void c() {
   }

   protected final boolean c(int var1) {
      return (this.b[0] & var1) != 0;
   }

   protected final void d(int var1) {
      byte[] var10000 = this.b;
      var10000[0] |= (byte)var1;
   }

   protected final void a(int var1, boolean var2) {
      if (var2) {
         this.d(var1);
      } else {
         this.b(var1);
      }

   }
}
