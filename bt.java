public final class bt extends d {
   static final int MBOOSTER_MAX_INSTANCES = 10;
   private static final int[] d = new int[]{16777215, 16729156, 4521796};
   private final String e;

   public bt(String var1, byte var2, int var3, int var4) {
      super(2, 3);
      this.e = var1;
      super.b[1] = var2;
      super.c[0] = (short)var3;
      super.c[1] = (short)(var4 - 15);
      super.c[2] = 1200;
   }

   public void a(int var1) {
      super.a(var1);
      short[] var10000 = super.c;
      if ((var10000[2] -= (short)var1) < 0) {
         this.b();
      }

   }

   public boolean a(int var1, int var2) {
      return false;
   }

   public void a(s var1, byte var2) {
      if (var2 == 1) {
         String var3 = this.e;
         char var4 = ' ';
         if (var3.length() != 0) {
            var4 = var3.charAt(0);
         }

         if (var4 >= 129 && var4 <= 142) {
            var1.a((byte)1, (char[])var3.toCharArray(), 0, var3.length(), d[super.b[1]], super.c[0], super.c[1] + super.c[2] * 15 / 1200);
            return;
         }

         var1.a((byte)1, var3, d[super.b[1]], super.c[0], super.c[1] + super.c[2] * 15 / 1200, 1);
      }

   }

   public void a(byte var1, byte var2) {
      short[] var10000 = super.c;
      var10000[0] += (short)(var1 * super.a.d());
      var10000 = super.c;
      var10000[1] += (short)(var2 * super.a.d());
   }
}
