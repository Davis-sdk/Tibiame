public final class bj extends be {
   static final int MBOOSTER_MAX_INSTANCES = 16;
   private String b;

   public bj a(String var1) {
      this.b = var1;
      if (this.k()) {
         this.a(this.d().a(var1));
      }

      return this;
   }

   protected void a(c var1) {
      super.a(var1);
      ((bj)var1).a(this.b);
   }

   protected void c(s var1) {
      this.a(var1.a(this.b));
   }
}
