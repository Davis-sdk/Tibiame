public final class bi implements bm {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final ci b;
   private String c;
   private boolean d;
   private boolean e;
   private int f;
   String a = "";
   private byte g;
   private boolean h;
   private boolean i;
   private boolean j;
   private int k;
   private byte l;
   private byte[] m;
   private an[] n;
   private int o;
   private e p = new e();
   private e q = new e();
   private int r = -1;

   public bi(ci var1) {
      this.b = var1;
      this.o = -1;
      this.l();
   }

   public boolean a() {
      return this.b.b((short)6009) || this.b.b((short)6011) || this.b.b((short)6012) || this.b.b((short)6010);
   }

   public boolean b() {
      return this.j;
   }

   public boolean c() {
      return this.o != -1;
   }

   public void d() {
      this.k();
      this.b.b().a((short)3024).b(this.f).a((Object)this.a).e();
      this.l();
      this.j = false;
      this.l = 0;
      this.j();
      this.b.j();
   }

   public void e() {
      this.a(0, 17);
   }

   public void f() {
      this.a(0, 12);
   }

   public void g() {
      this.a(0, 13);
   }

   private void a(int var1, int var2) {
      this.b.b().a((short)3025).b(var1).a((Object)this.a).b(var2).e();
      this.h = false;
      this.n();
   }

   public void a(String var1) {
      if (!this.b.b((short)6009)) {
         throw bh.c(1196307255);
      } else {
         if (var1 == null) {
            this.d();
         } else {
            this.b.b().a((short)3026).b(this.f).a((Object)this.a).b(this.i()).a((Object)var1).e();
            this.l();
            this.n();
         }

      }
   }

   public void a(int var1) {
      if (var1 == -1) {
         if (this.n != null && this.n.length != 0) {
            this.c(this.k).e();
         } else {
            this.d();
         }
      } else {
         this.b.b().a((short)3016).b(this.f).a((Object)this.a).b(this.i()).a((byte)(var1 + 1)).e();
         this.l();
         this.n();
      }

   }

   public void b(int var1) {
      if (var1 == -1) {
         if (this.n != null && this.n.length != 0) {
            this.c(this.k).e();
         } else {
            this.d();
         }
      } else {
         if (var1 < 0 || var1 >= this.b.f().e(1)) {
            throw bh.b(1163216951, String.valueOf(var1));
         }

         int var2 = this.b.f().e(var1 + 3);
         this.b.b().a((short)3020).b(this.f).a((Object)this.a).b(this.i()).b(var2).e();
         this.l();
         this.n();
      }

   }

   public void a(int var1, boolean var2) {
      if (this.f != -1) {
         if (var1 == -1) {
            if (!this.i || !var2) {
               this.d();
            }
         } else {
            int var3 = -1;

            for(int var5 = 0; var5 < this.n.length; ++var5) {
               if (var1 == this.n[var5].b) {
                  var3 = var5;
                  break;
               }
            }

            if (var3 == -1) {
               throw bh.c(842613588, String.valueOf(var1));
            }

            this.k = var3;
            byte var4 = this.m[var3];
            if (var4 != 0 && var4 != 32 && var4 != 64) {
               if ((var4 & 1) != 0) {
                  this.b(var1, false);
               } else if ((var4 & 2) != 0) {
                  this.b(var1, true);
               } else {
                  this.l = 0;
               }

               this.c(var3).e();
               if ((var4 & 8) != 0 && (this.b.f().a == 6010 || this.b.f().a == 6011)) {
                  if (this.b.f().a != 6011) {
                     this.b.e().a((short)5004, this.b);
                     this.b.c((short)6011).a(this.p).e();
                     this.c(this.k).e();
                  }

                  this.h();
               }

               if ((var4 & 16) != 0 && (this.b.f().a == 6010 || this.b.f().a == 6011)) {
                  if (this.b.f().a != 6010) {
                     this.b.e().a((short)5004, this.b);
                     this.b.c((short)6010).a(this.q).e();
                     this.c(this.k).e();
                  }

                  this.b(this.b.p());
               }
            } else {
               this.l = 0;
               this.d(var1);
               this.l();
               this.n();
            }
         }

      }
   }

   private void b(int var1, boolean var2) {
      if ((this.b.f().a == 6011 || this.b.f().a == 6010) && this.p != null && this.p.c(var2 ? 0 : 1) && this.b.d().a(var2)) {
         this.l = (byte)(var2 ? -1 : 1);
         this.d(var1);
         this.n();
      } else {
         this.b.c((short)4010).a(!var2).a(false).e();
         this.r = this.b.d().Q();
      }
   }

   public void a(Object var1, e var2) {
      switch(var2.a) {
      case 2000:
         boolean var14 = var2.d(0) == 1;
         this.k();
         this.l();
         this.j = false;
         this.b.j();
         this.j();
         if (var14) {
            this.b.q();
         }
         break;
      case 2010:
         this.e = true;
         this.d = (var2.d(0) & 8) != 0;
         this.b.c((short)6009).a((var2.d(0) & 1) != 0).a((var2.d(0) & 2) != 0).a((var2.d(0) & 4) != 0).b(this.f).b(var2.e(0)).a((Object)this.c).a((Object)var2.g(0)).a((Object)var2.g(1)).e();
         break;
      case 2011:
         this.e = true;
         this.d = (var2.e(0) & 8) != 0;
         e var5 = this.b.c((short)6011).a((var2.e(0) & 128) != 0).a((var2.e(0) & 64) != 0).a((var2.e(0) & 32) != 0).b(this.f).b(var2.e(1)).b(var2.e(0)).a((Object)this.c).a((Object)var2.g(3));
         var5.a((Object)var2.g(0)).a((Object)var2.g(1)).a((Object)var2.g(2));
         int var12 = 0;

         for(int var13 = var2.e(1); var12 < var13; ++var12) {
            var5.a((byte)-1);
            var5.b(var2.e(var12 + 2));
            var5.a((Object)var2.g(var12 * 3 + 4));
            var5.a((Object)var2.g(var12 * 3 + 5));
            var5.a((Object)var2.g(var12 * 3 + 6));
            var5.a(var2.d(var12 * 5 + 0));
            var5.a(var2.d(var12 * 5 + 1));
            var5.a(var2.d(var12 * 5 + 2));
            var5.a(var2.d(var12 * 5 + 3));
            var5.a(var2.d(var12 * 5 + 4));
         }

         this.r = -1;
         this.p.a(var5);
         var5.e();
         break;
      case 2012:
         this.m = new byte[var2.e(0)];
         this.n = new an[var2.e(0)];
         int var8 = 0;

         for(int var15 = var2.e(0); var8 < var15; ++var8) {
            byte var10 = a(this.b.d().b(var2.d(var8 * 2) & 255));
            an var11 = new an(var2.e(var8 + 1), var2.g(var8), var10);
            this.m[var8] = var2.d(var8 * 2 + 1);
            this.n[var8] = var11;
         }

         this.m();
         break;
      case 2013:
         String var4 = var2.g(0);
         if (this.a.length() != 0 && !this.a.equals(var4)) {
            this.b.b().a((short)3003).a((Object)this.a).e();
         }

         int var3 = var2.e(0);
         this.i = var3 == this.f;
         this.f = var3;
         this.a = var4;
         this.g = var2.d(0);
         this.c = var2.g(1);
         this.d = false;
         this.k = -1;
         break;
      case 2014:
         this.e = true;
         this.b.c((short)6012).a((var2.d(0) & 2) != 0).a((var2.d(0) & 1) != 0).b(this.f).a((Object)this.c).a((Object)var2.g(0)).e();
         break;
      case 2026:
         this.j = false;
         break;
      case 2035:
         this.l();
         this.j();
         this.b.j();
         String var9 = var2.g(0);
         if (var9 != null && var9.trim().length() != 0) {
            this.b.c((short)6001).a((Object)var9).e();
         } else {
            this.b.c((short)6008).e();
         }
         break;
      case 2050:
         this.e = true;
         this.d = (var2.d(0) & 8) != 0;
         byte var7 = (byte)(var2.d(0) & 1);
         e var6 = this.b.c((short)6010).a(var7).a(this.d);
         this.q.a(var6);
         var6.e();
         break;
      case 2065:
         this.j = true;
      }

   }

   e c(int var1) {
      boolean var4;
      boolean var3 = var4 = this.b.d().J();
      if ((!var3 || !var4) && this.b.b((short)6011) || this.b.b((short)6012)) {
         var3 |= this.b.f().c(0);
         var4 |= this.b.f().c(1);
      }

      if ((!var3 || !var4) && this.b.b((short)6010) && this.p != null) {
         var3 |= this.p.c(0);
         var4 |= this.p.c(1);
      }

      e var2 = this.b.c((short)5002).a((byte)6).a((Object)this.b.d().a((short)4161));
      int var5 = 0;

      for(int var6 = this.n.length; var5 < var6; ++var5) {
         if (!var4 && (this.m[var5] & 1) != 0 || !var3 && (this.m[var5] & 2) != 0) {
            if (var1 >= var5 && var1 > 0) {
               --var1;
            }
         } else {
            var2.a((Object)this.n[var5]);
         }
      }

      var2.b(var1);
      return var2;
   }

   private static byte a(byte var0) {
      switch(var0) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 16:
      case 17:
         return -1;
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      default:
         return var0;
      }
   }

   private void h() {
      this.b.c((short)5000).a((byte)14).b(this.r).e();
   }

   private void b(byte var1) {
      this.b.c((short)5000).a((byte)17).b(0).a(var1).e();
   }

   private byte i() {
      byte var1;
      if (this.n != null && this.n.length != 0 && this.k >= 0 && this.k < this.n.length) {
         var1 = this.n[this.k].b;
      } else {
         var1 = 1;
      }

      return var1;
   }

   private void j() {
      if (this.o != -1) {
         this.b.h(this.o);
         this.o = -1;
      }

   }

   private void k() {
      if (this.j) {
         this.j();
         this.b.c((short)6014).e();
         this.b.o();
      }

   }

   private void l() {
      this.f = -1;
      this.k = -1;
      this.c = null;
      this.m = null;
      this.n = null;
      this.d = false;
      this.e = false;
      this.i = false;
   }

   private void d(int var1) {
      this.b.b().a((short)3025).b(this.f).a((Object)this.a).b(var1).e();
   }

   private void m() {
      this.j();
      if (this.h) {
         this.d();
         this.h = false;
      } else {
         if (!this.e) {
            this.b.j();
         }

         int var1 = 0;
         if (this.i) {
            for(int var2 = 0; var2 < this.m.length; ++var2) {
               if (this.l == 1 && (this.m[var2] & 1) != 0 || this.l == -1 && (this.m[var2] & 2) != 0) {
                  var1 = var2;
                  break;
               }
            }
         }

         this.c(var1).e();
         if (this.d) {
            if (this.b.b((short)6009)) {
               this.b.c((short)5005).a((byte)5).a((Object)this.b.f().g(1)).a((Object)null).a((Object)this.b.f().g(2)).e();
            } else if (this.b.b((short)6011)) {
               this.h();
            } else {
               if (!this.b.b((short)6010)) {
                  throw bh.c(1146444368);
               }

               this.b(this.b.p());
            }
         } else if (this.i) {
            this.b.c((short)4010).a(this.l == -1).a(true).e();
         }

      }
   }

   private void n() {
      this.o = this.b.a((short)1, false, true);
   }
}
