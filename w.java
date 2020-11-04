public final class w implements cl {
   static final int MBOOSTER_MAX_INSTANCES = 32;
   private byte a;
   private c b;
   private c c;

   public w(c var1, c var2) {
      this.c = var1;
      this.b = var2;
   }

   public void a() {
      this.c.b(false);
      this.b.b(false);
   }

   public void a(boolean var1, boolean var2) {
      this.a = (byte)((var1 ? 1 : 0) | (var2 ? 2 : 0));
   }

   public void a(c var1, byte var2) {
      if (var2 == 3 || var2 == 5 && var1.p()) {
         this.c.b((this.a & 1) != 0 || var1.d((byte)1));
         this.b.b((this.a & 2) != 0 || var1.c((byte)1));
      }

   }
}
