public abstract class ad {
   private final Object[] a = new Object[0];
   private final Object[] b = new Object[1];

   protected ad() {
   }

   public abstract String a(short var1, Object[] var2);

   public final String a(short var1) {
      return this.a(var1, this.a);
   }

   public final String a(short var1, Object var2) {
      this.b[0] = var2;

      String var3;
      try {
         var3 = this.a(var1, this.b);
      } finally {
         this.b[0] = null;
      }

      return var3;
   }

   public abstract byte a();

   public abstract String b();
}
