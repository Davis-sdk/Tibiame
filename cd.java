public final class cd {
   static final int MBOOSTER_MAX_INSTANCES = 16;
   public final String a;
   public final int b;
   public final int c;
   public final int d;
   public final int e;

   public cd(int var1, int var2, int var3, int var4) {
      this.a = String.valueOf(var1);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public boolean a() {
      return this.c == 1 && !this.b();
   }

   public boolean b() {
      return this.b == 1 || this.b == 3;
   }

   public static int a(cd[] var0) {
      if (var0 != null && var0.length != 0) {
         if (var0.length == 1) {
            return var0[0].c;
         } else {
            int var1 = var0[0].c;

            for(int var2 = 1; var2 < var0.length; ++var2) {
               var1 = Math.max(var1, var0[var2].c);
            }

            return var1;
         }
      } else {
         return 0;
      }
   }

   public static cd a(cd[] var0, int var1) {
      if (var0 == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            cd var3 = var0[var2];
            if (var3.b == (short)var1) {
               return var3;
            }
         }

         return null;
      }
   }

   public static cd b(cd[] var0, int var1) {
      if (var0 == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            cd var3 = var0[var2];
            if (var3.c == (short)var1) {
               return var3;
            }
         }

         return null;
      }
   }

   public static cd[] b(cd[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         for(int var2 = 0; var2 < var0.length - var1; ++var2) {
            if (var2 + 1 != var0.length && var0[var2].c > var0[var2 + 1].c) {
               cd var3 = var0[var2];
               var0[var2] = var0[var2 + 1];
               var0[var2 + 1] = var3;
            }
         }
      }

      return var0;
   }

   public String toString() {
      return "Pack { number = " + this.b + "; priority = " + this.c + "; size = " + this.d + "; version = " + this.e + " }";
   }
}
