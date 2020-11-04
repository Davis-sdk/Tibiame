public final class cc extends v implements bm {
   static final int MBOOSTER_MAX_INSTANCES = 6;
   private byte b;

   public cc C(byte var1) {
      this.b = var1;
      return this;
   }

   public void a(Object var1, e var2) {
      if (var2.a == 4014 && var2.d(0) == this.b) {
         this.a(bh.a((long)var2.e(0), 4));
      } else if (var2.a == 4015 && this.b == 1) {
         this.a(bh.a((long)var2.e(0), 4));
      }

   }

   protected void a(c var1) {
      super.a(var1);
      ((cc)var1).C(this.b);
   }
}
