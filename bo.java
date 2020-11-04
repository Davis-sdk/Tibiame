public final class bo implements bm {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   int a;
   int b;
   private final ci f;
   int c;
   public boolean d = false;
   public int e = 0;

   bo(ci var1) {
      this.f = var1;
   }

   public void a(Object var1, e var2) {
      String var6;
      switch(var2.a) {
      case 2006:
         this.f.b().a((short)3006).a(var2.f(0)).a((byte)3).a((byte)0).a((Object)"").a((Object)"").e();
         break;
      case 2028:
         var6 = var2.g(0);
         this.f.b().a((short)3027).a((Object)var6).b(this.f.c.b((byte)11)).b(this.f.c.b((byte)12)).e();
         break;
      case 2032:
         this.a = var2.e(0);
         if (this.a == 65535) {
            this.a = 1;
         }

         this.b = var2.d(0);
         this.f.l();
         break;
      case 2049:
         String var3 = var2.g(0);
         String var4 = var2.g(1);
         String var5 = var2.g(2);
         var6 = this.f.c().a;
         if (var6.length() != 0 && !var6.equals(var3)) {
            this.f.b().a((short)3003).a((Object)var6).e();
         } else {
            br var7 = new br(this.f, true);
            var7.a().a((Object)var4).a((Object)var5);
            var7.start();
         }
      }

   }

   void a() {
      this.f.h(this.c);
   }
}
