public final class an {
   static final int MBOOSTER_MAX_INSTANCES = 16;
   public final byte a;
   public byte b;
   public String c;

   public an(int var1, String var2, int var3) {
      this.b = (byte)var1;
      this.c = var2;
      this.a = (byte)var3;
   }

   public static an a(an[] var0, byte var1) {
      int var2 = 0;

      for(int var3 = var0.length; var2 < var3; ++var2) {
         if (var0[var2].a == var1) {
            return var0[var2];
         }
      }

      return null;
   }
}
