public class bz extends cm implements bm {
   public byte a;
   protected String b;
   private byte j = 0;
   private int k = 0;
   private int l = 1;
   private int m = 0;
   private short n = -1;
   private int o;
   private boolean p;

   public bz(byte var1) {
      this.a = var1;
      super.g = new byte[1];
      super.g[0] = (byte)(var1 == 101 ? 15 : 14);
      this.b = var1 == 101 ? "*" : "#";
      this.q(1);
      this.p(1);
      this.c(18);
      this.o = this.E() / 2;
      this.a((Object)"Inventory");
      this.r(var1 == 101 ? 0 : 1);
      this.s(0);
      this.t(1);
      this.u(1);
      this.b(true);
      super.f = false;
   }

   public void a(Object var1, e var2) {
      super.a(var1, var2);
      byte var3;
      switch(var2.a) {
      case 4026:
         if (var2.d(0) == this.a) {
            var3 = var2.d(1);
            byte var4 = var2.d(2);
            byte var5 = var2.d(3);
            byte var6 = var2.d(5);
            this.k = var2.e(0);
            this.l = Math.max(this.k, 1);
            this.j = var6;
            this.m = 0;
            this.n = this.d().a((short)var3, (short)(var4 & 255), (short)(var5 & 255));
         }
         break;
      case 4027:
         if (var2.d(0) == this.a) {
            var3 = var2.d(1);
            this.k = var2.e(0);
            if (var3 != this.j) {
               this.l = Math.max(this.k, 1);
            }

            this.j = var3;
            this.m = 0;
         }
         break;
      case 6003:
      case 6009:
      case 6010:
      case 6011:
      case 6012:
         super.f = false;
         break;
      case 6015:
         super.f = true;
      }

      if (this.j != 0) {
         this.b(true);
      } else {
         this.b(false);
      }

   }

   public void a(boolean var1) {
      this.p = var1;
   }

   public boolean b() {
      return this.p;
   }

   protected void b(s var1) {
      if (!this.b()) {
         if (this.j != 0) {
            int var2 = this.E() - 2;
            if (super.i != -1) {
               var1.a(this.n() ? cm.d[super.h / cm.e] : 10526880, 1, 1, var2, (int)var2);
            }

            if (this.j == 1) {
               var1.a((short)this.n, this.o, this.o, 3);
            } else {
               var1.b((short)this.n, this.o, this.o, 3);
            }

            if (super.c) {
               var1.a((byte)0, this.b, 16777215, 0, 0);
            }

            if (this.j != 2) {
               byte var3 = 1;
               int var4 = (this.E() - 18) / 2;
               byte var5 = 15;
               int var6 = 16777215;
               int var7 = bh.a(1, var2, this.k, this.l);
               switch(this.j) {
               case 1:
                  var6 = 16719904;
               case 2:
               default:
                  break;
               case 3:
               case 4:
               case 5:
                  var6 = 65280;
               }

               int var8 = var7;
               if (this.j == 1) {
                  var8 = var2 - var7;
               }

               var1.a(10526880, var4 + 1, var5 + 1, var2, (int)var3);
               var1.a(var6, var4 + 1, var5 + 1, var8, (int)var3);
               var1.b(0, var4, var5, var4 + var2 + 1, var5);
               var1.b(0, var4, var5 + var3 + 1, var4 + var2 + 1, var5 + var3 + 1);
               var1.b(0, var4, var5, var4, var5 + var3);
               var1.b(0, var4 + var2 + 1, var5, var4 + var2 + 1, var5 + var3 + 1);
            }

            if (super.i != -1) {
               var1.c(16777215, 0, 0, var2 + 2, var2 + 2);
            }
         }

      }
   }

   protected void o(int var1) {
      super.o(var1);
      if (this.j == 1 || this.j == 4) {
         this.m += var1;
         if (this.m >= 1000) {
            this.m -= 1000;
            --this.k;
            if (this.k <= 0) {
               this.k = 0;
            }

            this.x();
         }
      }

   }
}
