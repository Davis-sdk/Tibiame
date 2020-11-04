public final class t extends d {
   static final int MBOOSTER_MAX_INSTANCES = 10;

   public t(byte var1, int var2, int var3) {
      super(2, 3);
      super.c[1] = (short)var2;
      super.c[2] = (short)var3;
      super.b[1] = var1;
      super.c[0] = 699;
   }

   public void a(int var1) {
      short[] var10000 = super.c;
      if ((var10000[0] -= (short)var1) < 0) {
         this.b();
      }

   }

   public boolean a(int var1, int var2) {
      return false;
   }

   public void a(s var1, byte var2) {
      short var3 = super.c[1];
      short var4 = super.c[2];
      if (var2 == 1 && var1.b((int)var3, var4, 20, 20)) {
         var1.a((short)var1.c(super.b[1], (byte)(3 - super.c[0] * 4 / 700)), (int)var3, (int)var4);
      }

   }

   public void a(byte var1, byte var2) {
      short[] var10000 = super.c;
      var10000[1] += (short)(var1 * super.a.d());
      var10000 = super.c;
      var10000[2] += (short)(var2 * super.a.d());
   }

   public void a(bv var1) {
      super.a(var1);
      short[] var10000 = super.c;
      var10000[1] *= (short)var1.d();
      var10000 = super.c;
      var10000[2] *= (short)var1.d();
   }
}
