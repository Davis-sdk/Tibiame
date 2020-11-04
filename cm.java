public class cm extends c implements bm, k {
   static final int MBOOSTER_MAX_INSTANCES = 8;
   protected boolean c;
   protected static final int[] d = new int[]{4210752, 6316128, 8421504, 10526880, 8421504, 6316128};
   private static final l a;
   protected static final int e;
   protected boolean f;
   protected byte[] g;
   private int b;
   private byte j;
   private byte k;
   protected short h;
   private byte l;
   private Object m;
   private byte n;
   private byte o;
   private byte p;
   private byte q;
   protected byte i;
   private z r;
   private short[] s;
   private byte t;
   private int u;

   public cm() {
      super(false);
      this.p = this.q = 1;
      this.i = -1;
      this.b = -1;
      this.b((byte)1);
      this.f = true;
      this.u = -1;
   }

   public cm b(int var1) {
      if (this.b != var1) {
         this.b = var1;
         this.e(var1 >= 0);
         this.x();
      }

      return this;
   }

   public int E() {
      return (this.j & 255) - 1;
   }

   public cm c(int var1) {
      if (this.E() != var1) {
         this.j = (byte)(var1 + 1);
         this.k = (byte)((var1 >> 1) + 1);
         this.b();
      }

      return this;
   }

   public cm p(int var1) {
      if (this.u((byte)1) != var1) {
         this.l = (byte)var1;
         this.s = null;
         this.b();
      }

      return this;
   }

   public cm q(int var1) {
      if (this.u((byte)0) != var1) {
         this.t = (byte)var1;
         this.s = null;
         this.b();
      }

      return this;
   }

   public void a(Object var1) {
      this.m = var1;
      synchronized(a) {
         z var3 = (z)a.a(var1);
         if (var3 == null) {
            a.a(var1, var3 = new z(6));
         }

         var3.a((Object)this);
      }
   }

   public cm r(int var1) {
      this.n = (byte)var1;
      return this;
   }

   public cm s(int var1) {
      this.o = (byte)var1;
      return this;
   }

   public cm t(int var1) {
      this.p = (byte)var1;
      return this;
   }

   public cm u(int var1) {
      this.q = (byte)var1;
      return this;
   }

   public int F() {
      return this.i == -1 ? -1 : this.i % this.t;
   }

   public int G() {
      return this.i == -1 ? -1 : this.i / this.t;
   }

   public cm e(int var1, int var2) {
      int var3 = var2 * this.t + var1;
      if (var3 != this.i) {
         this.x();
         this.x();
         this.i = (byte)var3;
         this.w(var2);
         this.a((byte)0, (int)this.i);
      }

      return this;
   }

   public cm a(int var1, short var2) {
      this.a(var1 % this.t, var1 / this.t, var2);
      return this;
   }

   public cm a(int var1, int var2, short var3) {
      if (this.s == null) {
         this.s = new short[this.t * this.l];
         int var5 = 0;

         for(int var6 = this.s.length; var5 < var6; ++var5) {
            this.s[var5] = -1;
         }
      }

      int var4 = var2 * this.t + var1;
      if (this.s[var4] != var3) {
         this.s[var4] = var3;
         this.x();
      }

      return this;
   }

   public cm a(byte[] var1) {
      this.g = var1;
      return this;
   }

   public cm v(int var1) {
      this.u = var1;
      return this;
   }

   protected boolean a(byte var1) {
      if (this.g != null) {
         for(int var2 = 0; var2 < this.g.length; ++var2) {
            if (var1 == this.g[var2]) {
               this.e(bh.a(var2 % this.t, 0, this.t - 1), bh.a(var2 / this.t, 0, this.l - 1));
               this.a((byte)1, (int)this.i);
               return true;
            }
         }
      }

      return false;
   }

   public void a(af var1) {
      if (this.r == null) {
         this.r = new z(3);
      }

      this.r.a((Object)var1);
   }

   public void a() {
      if (this.i != -1) {
         this.x();
         this.i = -1;
         this.a((byte)0, (int)this.i);
      }

   }

   public void a(int var1) {
      this.e(var1 % this.t, var1 / this.t);
   }

   public void b(af var1) {
      if (this.r != null && this.r.d(var1) && this.r.d() == 0) {
         this.r = null;
      }

   }

   protected void D() {
      if (this.m != null) {
         Object var1 = this.m;
         synchronized(a) {
            a.b(var1);
         }
      }

   }

   public void a(Object var1, e var2) {
      switch(var2.a) {
      case 5000:
         switch(var2.d(0)) {
         case 0:
         case 1:
         case 2:
         case 5:
         case 7:
         case 9:
         case 17:
            this.c = this.g != null;
            this.x();
            return;
         case 3:
         case 4:
         case 6:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         default:
            return;
         }
      case 5001:
         this.c = false;
         this.x();
      }

   }

   protected void b(s var1) {
      int var2 = this.t((byte)1);
      ax var3 = var1.d();
      if (this.b >= 0) {
         var1.a(this.b, 0, this.t((byte)1), this.u((byte)0), (int)this.u((byte)1));
      }

      int var4 = (var3.a + this.j - 1) / this.j * this.j;

      short var5;
      for(var5 = var3.b; var4 <= var5; var4 += this.j) {
         var1.b(0, var4, var2, var4, var2 + this.u((byte)1));
      }

      var4 = (var3.c + this.j - 1) / this.j * this.j;

      for(var5 = var3.d; var4 <= var5; var4 += this.j) {
         var1.b(0, 0, var4, this.u((byte)0), var4);
      }

      int var12;
      if (this.i != -1) {
         var4 = this.i % this.t * this.j;
         var12 = this.i / this.t * this.j;
         var1.c(16777215, var4, var12, this.j + 1, this.j + 1);
         var1.a(this.n() ? d[this.h / e] : 10526880, var4 + 1, var12 + 1, this.j - 1, this.j - 1);
      }

      if (this.s != null) {
         var4 = var3.c / this.j;

         for(var12 = (var3.d - 1) / this.j; var4 <= var12; ++var4) {
            int var6 = var3.a / this.j;

            for(int var7 = (var3.b - 1) / this.j; var6 <= var7; ++var6) {
               int var9 = var4 * this.t + var6;
               short var8 = this.s[var9];
               if (var8 != -1) {
                  var1.i();
                  var1.a(var6 * this.j + 1, var4 * this.j + 1, this.j - 1, this.j - 1, (byte)0);
                  var1.b((short)var8, var6 * this.j + this.k, var4 * this.j + this.k, 3);
                  if (this.c) {
                     String var10 = bh.h(this.g[var4 * this.t + var6] - 4);
                     var1.a((byte)0, var10, 16777215, var6 * this.j, var4 * this.j);
                  }

                  var1.h();
               } else if (this.u != -1 && var9 >= this.u) {
                  int var13 = var9 % this.t * this.j;
                  int var11 = var9 / this.t * this.j;
                  var1.a(8750469, var13 + 1, var11 + 1, this.j - 1, this.j - 1);
               }
            }
         }
      }

      var1.b();
   }

   protected boolean z(byte var1) {
      if (this.i != -1) {
         if (var1 == 3) {
            this.f(-1, 0);
            return true;
         }

         if (var1 == 1) {
            this.f(1, 0);
            return true;
         }

         if (var1 == 0) {
            this.f(0, -1);
            return true;
         }

         if (var1 == 2) {
            this.f(0, 1);
            return true;
         }

         if (var1 == 16) {
            this.a((byte)1, (int)this.i);
            return true;
         }

         if (var1 == 17) {
            this.a();
            this.a((byte)2, (int)0);
            return true;
         }

         if (this.a(var1)) {
            return true;
         }

         if (this.m != null) {
            Object var2 = this.m;
            z var3;
            synchronized(a) {
               var3 = (z)a.a(var2);
            }

            for(int var4 = 0; var4 < var3.d(); ++var4) {
               cm var5 = (cm)var3.b(var4);
               if (var5.l() && var5.f) {
                  this.a();
                  var5.e(0, 0);
                  if (var5.a(var1)) {
                     return true;
                  }

                  var5.a();
               }
            }

            this.a((byte)2, (int)this.i);
         }
      }

      return false;
   }

   protected void o(int var1) {
      if (this.i != -1 && this.n()) {
         this.h = (short)((this.h + var1) % 300);
         this.x();
      }

   }

   private void w(int var1) {
      int var2 = var1 * this.j;
      int var3 = this.t((byte)1);
      int var4 = var2 - this.n((byte)1);
      if (var4 < var3) {
         this.d(0, var4);
      }

      var4 = var2 + this.j + 1 + this.o((byte)1) - this.u((byte)1);
      if (var4 - var3 > 0) {
         this.d(0, var4);
      }

   }

   protected void a(byte var1, int var2) {
      if (this.r != null) {
         int var3 = 0;

         for(int var4 = this.r.d(); var3 < var4; ++var3) {
            ((af)this.r.b(var3)).a(this, var1, var2);
         }
      }

   }

   private void f(int var1, int var2) {
      int var3 = this.F() + var1;
      int var4 = this.G() + var2;
      if (this.m != null && (var3 < 0 || var3 >= this.t || var4 < 0 || var4 >= this.l)) {
         cm var11 = null;
         Object var6 = this.m;
         z var5;
         synchronized(a) {
            var5 = (z)a.a(var6);
         }

         int var8 = Integer.MAX_VALUE;
         int var7 = Integer.MAX_VALUE;
         int var10 = Integer.MIN_VALUE;
         int var9 = Integer.MIN_VALUE;
         int var12 = 0;

         int var13;
         for(var13 = var5.d(); var12 < var13; ++var12) {
            var11 = (cm)var5.b(var12);
            var7 = Math.min(var7, var11.n);
            var8 = Math.min(var8, var11.o);
            var9 = Math.max(var9, var11.n + var11.p * var11.t - 1);
            var10 = Math.max(var10, var11.o + var11.q * var11.l - 1);
         }

         var3 += this.n;
         var4 += this.o;

         do {
            if (var3 > var9) {
               var3 = var7;
            }

            if (var3 < var7) {
               var3 = var9;
            }

            if (var4 > var10) {
               var4 = var8;
            }

            if (var4 < var8) {
               var4 = var10;
            }

            var12 = 0;

            for(var13 = var5.d(); var12 < var13; ++var12) {
               var11 = (cm)var5.b(var12);
               if (var11.l() && var11.f && bh.b(var3, var11.n, var11.n + var11.t * var11.p - 1) && bh.b(var4, var11.o, var11.o + var11.l * var11.q - 1)) {
                  break;
               }

               var11 = null;
            }

            if (var11 == null) {
               var3 += var1;
               var4 += var2;
            }
         } while(var11 == null);

         this.a();
         var11.e(bh.b(var3 - var11.n, var11.t), bh.b(var4 - var11.o, var11.l)).d(true);
      } else {
         this.e(bh.b(var3, this.t), bh.b(var4, this.l));
      }

   }

   private void b() {
      this.c(this.t * this.j + 1, this.l * this.j + 1);
   }

   static {
      e = 300 / d.length;
      a = new l(6);
   }
}
