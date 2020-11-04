public final class az extends c implements bm {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final int a;
   private final int b;
   private final int c;
   private bv d;

   public az(int var1, int var2, int var3) {
      super(false);
      if ((var1 & 1) != 0 && (var2 & 1) != 0) {
         this.b = var1;
         this.a = var2;
         this.c = var3;
         this.e(true);
         this.b((byte)2);
      } else {
         throw bh.b(861296723);
      }
   }

   public bv a() {
      return this.d;
   }

   public void a(Object var1, e var2) {
      if (var2.a == 4013) {
         this.d.b().b(this.d.a(), this.d.a());
      }

   }

   protected void a(s var1) {
      this.d = new bv(var1, this.i().c(), this.b, this.a, this.c);
      if (ci.h != 0) {
         for(Object var2 = this; var2 != null; var2 = ((c)var2).h()) {
            if (((c)var2).r((byte)0) != 0 && ((c)var2).r((byte)1) != 0) {
               ((c)var2).c(((c)var2).r((byte)0) + ci.h, ((c)var2).r((byte)1) + ci.h);
            }
         }
      }

   }

   protected void C() {
      super.C();
      this.d.m();
      this.d = null;
   }

   protected void D() {
      if (this.d != null) {
         this.d.m();
         this.d = null;
      }

   }

   protected void b(s var1) {
      this.d.d(this.u((byte)0), this.u((byte)1));
   }

   protected void o(int var1) {
      this.d.b(var1);
      this.x();
   }
}
