public class v extends b {
   static final int MBOOSTER_MAX_INSTANCES = 32;
   private String b;

   public v() {
   }

   public v(String var1, byte var2, int var3) {
      this.b = var1;
      this.a(var2);
      this.a(var3);
   }

   public final String b() {
      return this.b;
   }

   public final b a(String var1) {
      if (!bh.a((Object)this.b, var1)) {
         this.b = var1;
         this.E();
      }

      return this;
   }

   protected final void b(int var1) {
      this.x();
   }

   protected final void c(int var1) {
      this.E();
   }

   protected void a(s var1) {
      this.E();
   }

   protected final void C() {
      this.E();
   }

   protected final void b(s var1) {
      if (this.b != null) {
         var1.a(this.a(), this.b, super.a, 0, 0);
         var1.b();
      }

   }

   private void E() {
      if (this.k()) {
         if (this.b != null) {
            s var1 = this.d();
            byte var2 = this.a();
            this.c(var1.a((byte)0, var2, (String)this.b, 0, this.b.length()), var1.a((byte)2, (byte)var2));
            this.x();
         } else {
            this.c((int)0, 0);
         }
      }

   }
}
