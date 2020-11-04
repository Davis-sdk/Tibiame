public final class l {
   static final int MBOOSTER_MAX_INSTANCES = 16;
   private z a;
   private z b;

   public l(int var1) {
      this.a = new z(var1);
      this.b = new z(var1);
   }

   public void a() {
      this.a.b();
      this.b.b();
   }

   public Object a(Object var1) {
      for(int var2 = 0; var2 < this.a.d(); ++var2) {
         if (var1.equals(this.a.b(var2))) {
            return this.b.b(var2);
         }
      }

      return null;
   }

   public z b() {
      return this.a;
   }

   public void a(Object var1, Object var2) {
      for(int var3 = 0; var3 < this.a.d(); ++var3) {
         if (var1.equals(this.a.b(var3))) {
            this.b.a(var3, var2);
            return;
         }
      }

      this.a.a(var1);
      this.b.a(var2);
   }

   public void b(Object var1) {
      for(int var2 = 0; var2 < this.a.d(); ++var2) {
         if (var1.equals(this.a.b(var2))) {
            this.a.c(var2);
            this.b.c(var2);
            return;
         }
      }

   }

   public int c() {
      return this.a.d();
   }
}
