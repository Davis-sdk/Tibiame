public class c implements ap, o {
   static final int MBOOSTER_MAX_INSTANCES = 384;
   private static final int a = 253952;
   private static final int b = 6291456;
   private static final int c = 1835008;
   private short[] d;
   private short[] e;
   private byte[] f;
   private byte[] g;
   private int h;
   private Object[] i;
   private Object[] j;

   public c() {
      this.a(17, true);
   }

   public c(co var1, s var2, ad var3) {
      this();
      if (var1 == null) {
         throw bh.b(1196251443);
      } else if (var2 == null) {
         throw bh.b(844777264);
      } else if (var3 == null) {
         throw bh.b(1128942936);
      } else {
         this.b(1, this);
         this.i = new Object[8];
         this.a(4, var2);
         this.a(5, var3);
         this.a(6, var1);
         this.a(4096, true);
         this.c(var2.f(), var2.e());
         this.d(true);
      }
   }

   protected c(boolean var1) {
      this.a(1, true);
      this.a(16, var1);
   }

   public final int c() {
      z var1;
      return (var1 = (z)this.p((int)1)) == null ? 0 : var1.d();
   }

   public final s d() {
      c var1 = this.G();
      s var2 = (s)(var1 == null ? null : var1.p((int)4));
      if (var2 == null) {
         throw bh.c(1481328449);
      } else {
         return var2;
      }
   }

   public final int e() {
      return this.c((int)9) & 255;
   }

   public final c d(int var1) {
      this.h(9, var1);
      return this;
   }

   public final z f() {
      return (z)this.q((int)3);
   }

   public final c a(z var1) {
      this.b(3, var1);
      return this;
   }

   public final ad g() {
      c var1 = this.G();
      if (var1 == null) {
         throw bh.c(844318542);
      } else {
         ad var2 = (ad)var1.p((int)5);
         if (var2 == null) {
            throw bh.c(1480083000);
         } else {
            return var2;
         }
      }
   }

   public final c h() {
      return (c)this.q((int)0);
   }

   public final co i() {
      c var1 = this.G();
      if (var1 == null) {
         throw bh.c(1145262150);
      } else {
         co var2 = (co)var1.p((int)6);
         if (var2 == null) {
            throw bh.c(1180251481);
         } else {
            return var2;
         }
      }
   }

   public final int j() {
      return this.c((int)8);
   }

   public final c e(int var1) {
      c var2;
      if (this.h(8, var1) && (var2 = this.h()) != null) {
         var2.a(8, true);
      }

      return this;
   }

   public final boolean k() {
      return this.G() != null;
   }

   public final boolean l() {
      return this.n((int)1);
   }

   public final c b(boolean var1) {
      if (this.n((int)1) != var1) {
         this.a(1, var1);
         this.L();
      }

      return this;
   }

   public final boolean m() {
      return this.n((int)2);
   }

   public final c c(boolean var1) {
      if (this.n((int)2) != var1) {
         this.a(2, var1);
         if (var1 && this.n((int)4096) && this.I()) {
            this.a(this.h(), this);
         }
      }

      return this;
   }

   public final boolean n() {
      return this.J() && !this.H() && this.k();
   }

   public final c d(boolean var1) {
      c var2 = this.h();
      if (this.J()) {
         c var3 = this.F();
         if (var3 != null) {
            var3.d(false);
            this.a(0, (Object)null);
         }

         if (!var1 && var2 != null) {
            var2.a(0, (Object)null);
         }

         if (var3 != null != var1) {
            return this;
         }
      } else {
         if (!var1) {
            return this;
         }

         this.s();
         if (var2 != null) {
            var2.f(this);
         }
      }

      this.x();
      if (var2 != null) {
         var2.a(8, true);
      }

      this.B((byte)0);
      return this;
   }

   public final boolean o() {
      return this.n((int)4);
   }

   public final c e(boolean var1) {
      if (this.n((int)4) != var1) {
         this.a(4, var1);
         this.x();
         if (this.I()) {
            this.h().a(8, true);
         }
      }

      return this;
   }

   public final boolean p() {
      return this.n((int)4096);
   }

   public final c f(int var1) {
      this.f(6, (short)var1);
      if (var1 > 0) {
         this.b((byte)2);
      }

      return this;
   }

   public c b(byte var1) {
      switch(var1) {
      case 0:
         this.a(524288, false);
         this.a(262144, false);
         if (this.I()) {
            this.h().g(false);
         }
         break;
      case 1:
         this.a(262144, true);
         if (this.I()) {
            this.h().g(true);
         }
         break;
      case 2:
         this.a(524288, true);
         if (this.I()) {
            this.h().g(true);
         }
      }

      return this;
   }

   public static z a(z var0, c var1) {
      var0.b();
      var0.a((Object)var1.a(var0));

      for(int var2 = 1; var2 < var0.a(); ++var2) {
         var0.a((Object)var1.q().a(var0));
      }

      return var0;
   }

   public final c b(c var1) {
      if (var1.k() && var1.h() != this) {
         throw bh.c(1110783302);
      } else {
         this.j((int)1);
         z var2 = this.a();
         if (!var2.b(var1)) {
            var1.l(this);
            var2.a((Object)var1);
            this.a(8, true);
            if (var1.n(c)) {
               this.g(true);
            }

            this.j(var1);
            var1.d(false);
            if (this.k()) {
               var1.a(this.G(), this.d());
            }

            var1.L();
         }

         return this;
      }
   }

   public final void a(cl var1) {
      z var2 = (z)this.q((int)2);
      if (var2 == null) {
         this.b(2, var2 = new z(2));
      }

      var2.a((Object)var1);
   }

   public boolean c(byte var1) {
      return this.t(var1) < this.p(var1);
   }

   public boolean d(byte var1) {
      return this.t(var1) > 0;
   }

   public final c q() {
      c var1 = this.B();
      this.a(var1);
      return var1;
   }

   public void r() {
      c var1;
      for(var1 = this; var1.h() != null; var1 = var1.h()) {
      }

      var1.z();
   }

   public final c s() {
      c var1 = this.h();
      if (var1 != null) {
         var1.s();
         if (this.k()) {
            for(byte var2 = 0; var2 <= 1; ++var2) {
               int var3 = var1.t(var2);
               int var4 = this.q(var2);
               if (var4 < var3) {
                  var1.d(var2 == 0 ? var4 : -1, var2 == 1 ? var4 : -1);
               }

               var4 = this.q(var2) + this.u(var2) + this.k(var2) - var1.u(var2) - var1.o(var2);
               if (var4 > var3) {
                  var1.d(var2 == 0 ? var4 : -1, var2 == 1 ? var4 : -1);
               }
            }
         }
      } else if (this.k()) {
         this.t();
      }

      this.b(true);
      return this;
   }

   public final c g(int var1) {
      if (this.e() == var1) {
         return this;
      } else {
         Object[] var2 = this.b();
         int var3 = 0;

         for(int var4 = this.c(); var3 < var4; ++var3) {
            c var5;
            if ((var5 = ((c)var2[var3]).g(var1)) != null) {
               return var5;
            }
         }

         return null;
      }
   }

   public final byte e(byte var1) {
      return this.c(2 + var1);
   }

   public final c h(int var1) {
      z var2 = this.a();
      return var2 != null ? (c)var2.b(var1) : null;
   }

   public final c a(int var1, int var2) {
      Object[] var3 = this.b();
      int var4 = 0;

      for(int var5 = this.c(); var4 < var5; ++var4) {
         c var6 = (c)var3[var4];
         if (var6.f((byte)0) == var1 && var6.f((byte)1) == var2) {
            return var6;
         }
      }

      return null;
   }

   public final int f(byte var1) {
      return this.c(0 + var1);
   }

   public int g(byte var1) {
      return this.f == null ? 0 : this.f[4 + var1];
   }

   public int h(byte var1) {
      return this.f == null ? 0 : this.f[6 + var1] & 255;
   }

   public final int c(c var1) {
      z var2 = this.a();
      return var2 == null ? -1 : var2.c(var1);
   }

   public int i(byte var1) {
      return Math.max(0, this.u(var1) - this.m(var1));
   }

   public final int j(byte var1) {
      return this.c(4 + var1);
   }

   public final int k(byte var1) {
      return this.c(6 + var1);
   }

   public int l(byte var1) {
      return this.d == null ? this.r(var1) : this.d[0 + var1] & '\uffff';
   }

   public final int m(byte var1) {
      return this.f == null ? 0 : (this.f[0 + var1] & 255) + (this.f[2 + var1] & 255);
   }

   public final int n(byte var1) {
      return this.f == null ? 0 : this.f[0 + var1] & 255;
   }

   public final int o(byte var1) {
      return this.f == null ? 0 : this.f[2 + var1] & 255;
   }

   public final int p(byte var1) {
      return Math.max(0, this.l(var1) - this.u(var1));
   }

   public final int q(byte var1) {
      return this.b(0 + var1);
   }

   public final int r(byte var1) {
      return this.b(4 + var1) & '\uffff';
   }

   public final int s(byte var1) {
      int var3 = this.q(var1);
      c var2 = this.h();
      if (var2 != null) {
         var3 += var2.s(var1) + var2.n(var1) - var2.t(var1);
      }

      return var3;
   }

   public final int t(byte var1) {
      return var1 == 0 ? this.c((int)10) & 255 : this.b((int)7) & '\uffff';
   }

   public final int u(byte var1) {
      return this.b(2 + var1) & '\uffff';
   }

   public final boolean v(byte var1) {
      return this.n(var1 == 0 ? 1024 : 2048);
   }

   public final boolean w(byte var1) {
      return this.n(var1 == 0 ? 64 : 128);
   }

   public final boolean x(byte var1) {
      return this.n(var1 == 0 ? 256 : 512);
   }

   public c t() {
      c var1 = this.G();
      if (var1 != null) {
         while((var1.h & a) != 0) {
            var1.i((c)null);
         }
      }

      return this;
   }

   public final void u() {
      c var1 = this.G();
      if (var1 != null) {
         if (!var1.p()) {
            return;
         }

         s var2 = var1.d();
         boolean var3 = var2.f() != var1.r((byte)0) || var2.e() != var1.r((byte)1);
         if (var3) {
            var1.c(var2.f(), var2.e());
         }

         this.t();
         if (!this.n(b)) {
            return;
         }

         c var4 = (c)var1.p((int)7);
         var1.a(7, (Object)null);
         var2.a();
         if (var2.g()) {
            var1.d(var2);
         }

         if (var4 != null) {
            var2.a(var4.s((byte)0), var4.s((byte)1), var4.u((byte)0), var4.u((byte)1), (byte)1);
         }

         var1.a(var3);
         var2.c();
      }

   }

   public final c v() {
      while(this.c() > 0) {
         this.i((int)0);
      }

      return this;
   }

   public final c i(int var1) {
      c var2 = (c)this.a().b(var1);
      var2.d(false);
      var2.l((c)null);
      this.a().c(var1);
      if (var2.n(c)) {
         this.g(false);
      }

      this.k(var2);
      var2.L();
      var2.K();
      if (this.k()) {
         var2.f(true);
         var2.f(false);
      }

      return this;
   }

   public final c d(c var1) {
      z var2 = this.a();
      if (var2 != null) {
         int var3 = var2.c(var1);
         if (var3 != -1) {
            this.i(var3);
         }
      }

      return this;
   }

   public final c w() {
      c var1 = this.h();
      if (var1 != null) {
         var1.d(this);
      }

      return this;
   }

   public final void x() {
      if (this.k() && this.p()) {
         c var1;
         c var2;
         for(var1 = this; !var1.o(); var1 = var2) {
            var2 = var1.h();
            if (var2 == null) {
               break;
            }
         }

         for(var2 = var1.h(); var2 != null; var2 = var2.h()) {
            var2.a(4194304, true);
         }

         var1.a(2097152, true);
         this.G().e(var1);

         do {
            var2 = var1.h();
            if (var2 != null) {
               int var4 = var1.f((byte)0);
               int var5 = var1.f((byte)1);
               Object[] var3 = var2.b();
               int var6 = var2.c(var1) + 1;

               for(int var7 = var2.c(); var6 < var7; ++var6) {
                  c var8 = (c)var3[var6];
                  if (var8.p() && var8.f((byte)0) == var4 && var8.f((byte)1) == var5) {
                     var8.a(2097152, true);
                  }
               }
            }

            var1 = var2;
         } while(var2 != null);
      }

   }

   public final c y() {
      this.B((byte)3);
      return this;
   }

   public final c a(byte var1, byte var2) {
      if (this.h(2, var1)) {
         this.b(8192, true);
      }

      if (this.h(3, var2)) {
         this.b(16384, true);
      }

      return this;
   }

   public final c a(boolean var1, boolean var2) {
      boolean var3 = this.n((int)1024) != var1;
      boolean var4 = this.n((int)2048) != var2;
      if (var3) {
         this.h ^= 1024;
         this.b(8192, true);
      }

      if (var4) {
         this.h ^= 2048;
         this.b(16384, true);
      }

      return this;
   }

   public final c b(int var1, int var2) {
      this.c((byte)0, var1);
      this.c((byte)1, var2);
      return this;
   }

   public final c b(boolean var1, boolean var2) {
      this.a((byte)0, (byte)0, var1);
      this.a((byte)1, (byte)0, var2);
      return this;
   }

   public final c a(int var1, int var2, int var3, int var4) {
      c var5 = this.h();
      if (this.h(4, (byte)bh.a(var1, -128, 127)) | this.h(6, (byte)bh.a(var3, -128, 127)) && var5 != null) {
         var5.a((byte)0, this.f((byte)0), this, false);
         this.b(8192, true);
      }

      if (this.h(5, (byte)bh.a(var2, -128, 127)) | this.h(7, (byte)bh.a(var4, -128, 127)) && var5 != null) {
         var5.a((byte)1, this.f((byte)1), this, false);
         this.b(16384, true);
      }

      return this;
   }

   public final c b(int var1, int var2, int var3, int var4) {
      boolean var5 = this.g(0, bh.a(var1, 0, 255)) | this.g(2, bh.a(var3, 0, 255));
      boolean var6 = this.g(1, bh.a(var2, 0, 255)) | this.g(3, bh.a(var4, 0, 255));
      if (var5) {
         this.C((byte)0);
         this.b(32768, true);
      }

      if (var6) {
         this.C((byte)1);
         this.b(65536, true);
      }

      return this;
   }

   public final c c(int var1, int var2) {
      if (var1 != -1 && this.f(4, (short)bh.a(var1, 0, 65535))) {
         this.C((byte)0);
         this.b(40960, true);
      }

      if (var2 != -1 && this.f(5, (short)bh.a(var2, 0, 65535))) {
         this.C((byte)1);
         this.b(81920, true);
      }

      return this;
   }

   public final c d(int var1, int var2) {
      boolean var3 = var1 != -1 && this.h(10, (byte)bh.a(var1, 0, this.p((byte)0)));
      var3 |= var2 != -1 && this.f(7, (short)bh.a(var2, 0, this.p((byte)1)));
      if (var3) {
         this.x();
         this.y();
      }

      return this;
   }

   public final c c(boolean var1, boolean var2) {
      this.a((byte)0, (byte)2, var1);
      this.a((byte)1, (byte)2, var2);
      return this;
   }

   public final c j(int var1) {
      z var2 = (z)this.p((int)1);
      if (var2 == null) {
         this.a(1, new z(var1));
      } else {
         var2.a(var1);
      }

      return this;
   }

   public final c c(int var1, int var2, int var3, int var4) {
      this.a((byte)0, (int)var1, var3 - var1 + 1);
      this.a((byte)1, (int)var2, var4 - var2 + 1);
      return this;
   }

   public final void k(int var1) {
      short var2 = this.b((int)6);
      if (var2 > 0) {
         var2 -= (short)var1;
         if (var2 <= 0) {
            this.B((byte)1);
            var2 = 0;
         }

         this.f(6, var2);
      }

      if (this.n(524288) || this.n(262144) && this.n((int)1)) {
         try {
            this.o(var1);
         } catch (Throwable var6) {
            throw bh.a(1313755731, var6, this.getClass().getName());
         }
      }

      if (this.n(1048576)) {
         Object[] var3 = this.b();
         int var4 = 0;

         for(int var5 = this.c(); var4 < var5; ++var4) {
            ((c)var3[var4]).k(var1);
         }
      }

   }

   public final int a(Object var1, Object var2) {
      c var3 = (c)var1;
      c var4 = (c)var2;
      if (var3.o() && !var4.o()) {
         return -1;
      } else if (var4.o() && !var3.o()) {
         return 1;
      } else if (var3.n() && !var4.n()) {
         return 1;
      } else {
         return var4.n() && !var3.n() ? -1 : bh.a(var3.j(), var4.j());
      }
   }

   public final void z() {
      if (!this.A()) {
         if (this.I()) {
            this.h().d(this);
         } else if (this.K()) {
            return;
         }

         this.D();

         while(this.c() > 0) {
            this.h((int)0).z();
         }

         this.B((byte)2);
         this.E();
         this.a(32, true);
      }
   }

   public final boolean A() {
      return this.n((int)32);
   }

   public final boolean l(int var1) {
      c var2;
      if (this.i != null && (var2 = (c)this.i[0]) != null && var2.l(var1)) {
         return true;
      } else {
         try {
            return this.z((byte)var1);
         } catch (Throwable var4) {
            throw bh.a(1264005208, var4, this.getClass().getName());
         }
      }
   }

   public final boolean m(int var1) {
      c var2;
      if (this.i != null && (var2 = (c)this.i[0]) != null && var2.m(var1)) {
         return true;
      } else {
         try {
            return this.A((byte)var1);
         } catch (Throwable var4) {
            throw bh.a(825835856, var4, this.getClass().getName());
         }
      }
   }

   public final boolean a(char var1) {
      c var2;
      return this.i != null && (var2 = (c)this.i[0]) != null && var2.a(var1) ? true : this.b(var1);
   }

   protected void y(byte var1) {
   }

   protected void a(s var1) {
   }

   protected void a(c var1) {
      var1.a(this.e((byte)0), this.e((byte)1)).b(this.l()).c(this.m()).a(this.v((byte)0), this.v((byte)1)).d(this.n()).b(this.f((byte)0), this.f((byte)1)).b(this.w((byte)0), this.w((byte)1)).d(this.e()).a(this.j((byte)0), this.j((byte)1), this.k((byte)0), this.k((byte)1)).a(this.f()).b(this.n((byte)0), this.n((byte)1), this.o((byte)0), this.o((byte)1)).e(this.o()).c(this.r((byte)0), this.r((byte)1)).d(this.t((byte)0), this.t((byte)1)).c(this.x((byte)0), this.x((byte)1)).e(this.j());
      int var2 = this.c();
      if (var2 > 0) {
         var1.j(var2);
         var1.c(this.g((byte)0), this.g((byte)1), this.g((byte)0) + this.h((byte)0) - 1, this.g((byte)1) + this.h((byte)1) - 1);
         Object[] var3 = this.b();

         for(int var4 = 0; var4 < var2; ++var4) {
            var1.b(((c)var3[var4]).q());
         }
      }

   }

   protected c B() {
      try {
         return (c)this.getClass().newInstance();
      } catch (Exception var2) {
         throw bh.a(1379031617, (Throwable)var2);
      }
   }

   protected void C() {
   }

   protected void D() {
   }

   protected boolean n(int var1) {
      return (this.h & var1) != 0;
   }

   protected void b(s var1) {
   }

   protected boolean z(byte var1) {
      return false;
   }

   protected boolean A(byte var1) {
      return false;
   }

   protected boolean b(char var1) {
      return false;
   }

   protected void o(int var1) {
   }

   protected void c(s var1) {
   }

   void B(byte var1) {
      this.y(var1);
      z var2 = (z)this.q((int)2);
      if (var2 != null) {
         int var3 = 0;

         for(int var4 = var2.d(); var3 < var4; ++var3) {
            ((cl)var2.b(var3)).a(this, var1);
         }
      }

   }

   private void a(byte var1, byte var2, int var3, boolean var4) {
      int var5;
      int var6;
      label30: {
         var5 = var3 - this.g(var1);
         var6 = this.a(var1, var2, var5);
         if (!var4 || var6++ != 0) {
            if (var4) {
               break label30;
            }

            --var6;
            if (var6 != 0) {
               break label30;
            }
         }

         this.b(var1 == 0 ? '耀' : 65536, true);
      }

      this.a(var1, var2, var5, var6);
   }

   private void e(c var1) {
      c var2 = (c)this.p((int)7);
      if (var2 == null) {
         this.a(7, var1);
      } else if (var2 != var1) {
         this.a(7, this);
      }

   }

   private int a(c var1, byte var2) {
      int var3 = this.f(var2);
      int var4;
      int var5;
      if (var1 == null) {
         var5 = this.l(var2);
         var4 = 0;
      } else {
         var4 = var1.a(var2, var3 - var1.g(var2) - 1);
         var5 = var1.a(var2, var3 - var1.g(var2)) - var4;
      }

      int var6 = this.j(var2);
      int var7 = this.k(var2);
      int var8 = var4 + var6;
      int var9 = var5 - var6 - var7;
      if (!this.v(var2)) {
         int var11 = var9 - (var9 = Math.min(var9, this.l(var2)));
         byte var12 = this.e(var2);
         if (var12 == 0) {
            var8 += var11 >> 1;
         } else if (var12 == 2) {
            var8 += var11;
         }
      }

      int var10 = 0;
      if (this.f(2 + var2, var9)) {
         this.D(var2);
         var10 |= 2;
      }

      if (this.f(0 + var2, var8)) {
         var10 |= 1;
      }

      return var10;
   }

   private void a(byte var1) {
      int var2 = this.c();
      if (var2 > 0) {
         Object[] var5 = this.b();
         int var3 = this.u(var1) - this.E(var1) - this.m(var1);
         int var4 = var3 >= 0 ? 0 : 2;
         int var9 = 0;
         int var12 = 0;

         int var13;
         for(var13 = this.h(var1); var12 < var13; ++var12) {
            if (this.a(var1, (byte)var4, var12) > 0) {
               ++var9;
            }
         }

         if (var4 == 2 && var9 > 1) {
            return;
         }

         int var6;
         int var7;
         int var10;
         if (var9 > 0) {
            var6 = var3 / var9;
            var10 = var3 % var9;
            var7 = bh.e(var10);
         } else {
            var7 = 0;
            var10 = 0;
            var6 = 0;
         }

         int var11 = 0;
         var12 = 0;

         for(var13 = this.h(var1); var12 < var13; ++var12) {
            var11 += this.b(var1, var12);
            if (var9 > 0 && this.a(var1, (byte)var4, var12) > 0) {
               var11 += var6;
               if (var10 > 0) {
                  var11 += var7;
                  var10 -= var7;
               }
            }

            if (var11 != this.a(var1, var12)) {
               this.b(var1, var12, ~var11);
            }
         }

         int var8 = this.g(var1);
         var12 = 0;

         for(var13 = this.c(); var12 < var13; ++var12) {
            c var14 = (c)var5[var12];
            int var15 = var14.f(var1) - var8;
            if (var15 > 0 && this.a(var1, var15 - 1) < 0 || this.a(var1, var15) < 0) {
               var14.b(var1 == 0 ? 8192 : 16384, false);
            }
         }

         var12 = 0;

         for(var13 = this.h(var1); var12 < var13; ++var12) {
            int var16 = this.a(var1, var12);
            if (var16 < 0) {
               this.b(var1, var12, ~var16);
            }
         }
      }

   }

   private void a(byte var1, int var2, int var3) {
      if (this.p(2 + var1) == null) {
         this.a(2 + var1, new short[var3 * 3]);
         this.g(4 + var1, var2);
         this.g(6 + var1, var3);
      } else {
         int var4 = Math.max(0, this.g(var1) - var2);
         int var5 = Math.max(0, var2 + var3 - this.g(var1) - this.h(var1));
         if (var4 > 0 || var5 > 0) {
            this.a(2 + var1, bh.a((short[])((short[])this.p(2 + var1)), var4 * 3, var5 * 3));
            byte[] var10000 = this.f;
            var10000[4 + var1] -= (byte)var4;
            var10000 = this.f;
            var10000[6 + var1] += (byte)(var5 + var4);
         }
      }

   }

   private void a(byte var1, int var2, c var3, boolean var4) {
      int var5 = this.b(var1, var2 - this.g(var1));
      int var6 = var3.l(var1) + var3.j(var1) + var3.k(var1);
      int var7;
      if (!var4 && var6 > var5) {
         var7 = var6;
      } else {
         var7 = 0;
         Object[] var8 = this.b();
         int var9 = 0;

         for(int var10 = this.c(); var9 < var10; ++var9) {
            c var11 = (c)var8[var9];
            if (var11.f(var1) == var2) {
               var7 = Math.max(var7, var11.l(var1) + var11.j(var1) + var11.k(var1));
            }
         }
      }

      if (var5 != var7) {
         this.e(2 + var1, this.a(2 + var1) + var7 - var5);
         this.c(var1, var2 - this.g(var1), var7);
         this.C(var1);
         this.b(var1 == 0 ? '耀' : 65536, true);
      }

   }

   private void C(byte var1) {
      int var2 = this.r(var1);
      if (var2 == 0) {
         var2 = this.m(var1) + this.E(var1);
      }

      if (this.e(0 + var1, (short)var2)) {
         c var3;
         if ((var3 = this.h()) != null) {
            var3.a(var1, this.f(var1), this, false);
         }

         this.D(var1);
         this.b(var1 == 0 ? 8192 : 16384, true);
      }

   }

   private void D(byte var1) {
      int var2;
      if (var1 == 0) {
         var2 = bh.a(this.c((int)10) & 255, 0, this.p((byte)0));
         if (this.h(10, (byte)var2)) {
            this.x();
         }

         this.y();
      } else {
         var2 = bh.a(this.b((int)7) & '\uffff', 0, this.p((byte)1));
         if (this.f(7, (short)var2)) {
            this.x();
         }

         this.y();
      }

   }

   private void f(c var1) {
      c var2 = this.F();
      if (var2 != null && var2 != var1) {
         var2.d(false);
      }

      this.a(0, var1);
      if (this.I()) {
         this.h().f(this);
      }

   }

   private z a() {
      z var1 = (z)this.p((int)1);
      if (this.n((int)8)) {
         if (var1 != null) {
            var1.a((ap)this);
         }

         this.a(8, false);
      }

      return var1;
   }

   private Object[] b() {
      z var1 = this.a();
      return var1 == null ? null : var1.a;
   }

   private void g(c var1) {
      if (var1.p() && var1.m() && this.h(var1)) {
         var1.b(false);
      } else {
         Object[] var2 = var1.b();
         int var3 = 0;

         for(int var4 = var1.c(); var3 < var4; ++var3) {
            this.g((c)var2[var3]);
         }
      }

   }

   private void a(c var1, c var2) {
      if (!var1.m() && var1.I()) {
         this.a(var1.h(), var1);
      }

      Object[] var3 = var1.b();
      int var4 = 0;

      for(int var5 = var1.c(); var4 < var5; ++var4) {
         c var6 = (c)var3[var4];
         if (var6 != var2) {
            this.g(var6);
         }
      }

   }

   private void E() {
      this.g = null;
      this.e = null;
      this.j = null;
      this.f = null;
      this.d = null;
      this.i = null;
   }

   private boolean a(boolean var1) {
      boolean var2 = this.n(4194304);
      boolean var3 = var1 || this.n(2097152);
      this.a(b, false);
      if (this.p() && (var2 || var3)) {
         int var4 = this.q((byte)0);
         int var5 = this.q((byte)1);
         int var6 = this.u((byte)0);
         int var7 = this.u((byte)1);
         s var8 = this.d();
         int var10;
         int var11;
         if (var3 && !this.n((int)16)) {
            if (var8.i().a(var4, var5, var6, var7, (byte)0)) {
               var10 = this.t((byte)0);
               var11 = this.t((byte)1);
               var8.a((int)(var4 - var10), (int)(var5 - var11), (byte)1);

               try {
                  this.b(var8);
               } catch (Throwable var14) {
                  bh.a((byte)1, 1479618899, this.getClass().getName(), var14);
               }

               var8.a((int)(-var4 + var10), (int)(-var5 + var11), (byte)1);
            }

            var8.h();
         }

         int var9;
         if ((var9 = this.c()) > 0) {
            if (var8.i().a(var4 + this.n((byte)0), var5 + this.n((byte)1), var6 - this.m((byte)0), var7 - this.m((byte)1), (byte)0)) {
               var10 = var4 + this.n((byte)0) - this.t((byte)0);
               var11 = var5 + this.n((byte)1) - this.t((byte)1);
               var8.a((int)var10, (int)var11, (byte)1);
               Object[] var12 = this.b();

               for(int var13 = 0; var13 < var9; ++var13) {
                  ((c)var12[var13]).a(var3);
               }

               var8.a((int)(-var10), (int)(-var11), (byte)1);
            }

            var8.h();
         }
      }

      return var3;
   }

   private short a(int var1) {
      short[] var2 = this.d;
      return var2 == null ? 0 : var2[var1];
   }

   private short b(int var1) {
      short[] var2 = this.e;
      return var2 == null ? 0 : var2[var1];
   }

   private byte c(int var1) {
      byte[] var2 = this.g;
      return var2 == null ? 0 : var2[var1];
   }

   private int a(byte var1, int var2) {
      return var2 < 0 ? 0 : ((short[])((short[])this.i[2 + var1]))[var2 * 3 + 1];
   }

   private int a(byte var1, byte var2, int var3) {
      int var4 = ((short[])((short[])this.i[2 + var1]))[var3 * 3 + 2] & '\uffff';
      return var2 == 0 ? var4 >> 8 : var4 & 255;
   }

   private int b(byte var1, int var2) {
      return ((short[])((short[])this.i[2 + var1]))[var2 * 3] & '\uffff';
   }

   private int E(byte var1) {
      return this.d == null ? 0 : this.d[2 + var1] & '\uffff';
   }

   private c F() {
      return (c)this.p((int)0);
   }

   private Object p(int var1) {
      Object[] var2 = this.i;
      return var2 == null ? null : var2[var1];
   }

   private Object q(int var1) {
      Object[] var2 = this.j;
      return var2 == null ? null : var2[var1];
   }

   private c G() {
      return (c)this.q((int)1);
   }

   private boolean H() {
      return this.p((int)0) != null;
   }

   private boolean I() {
      return this.q((int)0) != null;
   }

   private boolean h(c var1) {
      for(byte var2 = 0; var2 <= 1; ++var2) {
         int var3 = this.s(var2);
         int var4 = var1.s(var2);
         if (Math.max(var3, var4) >= Math.min(var3 + this.u(var2), var4 + var1.u(var2))) {
            return false;
         }
      }

      return true;
   }

   private boolean J() {
      c var1 = this.h();
      return var1 == null || var1.F() == this;
   }

   private void i(c var1) {
      int var3 = this.h & a;
      if (var3 != 0) {
         int var5 = 0;
         int var4 = 0;
         if (this.n((int)8192)) {
            var4 |= this.a(var1, (byte)0);
         }

         if (var4 != 0 || this.n((int)32768)) {
            this.a((byte)0);
         }

         if (this.n((int)16384)) {
            var5 |= this.a(var1, (byte)1);
         }

         if (var5 != 0 || this.n(65536)) {
            this.a((byte)1);
         }

         this.a(a, false);
         if ((var4 & 2) == 0) {
            this.B((byte)6);
         } else {
            this.B((byte)4);
         }

         if ((var4 | var5) != 0) {
            this.x();
         }

         Object[] var2 = this.b();
         int var6 = 0;

         for(int var7 = this.c(); var6 < var7; ++var6) {
            ((c)var2[var6]).i(this);
         }

      }
   }

   private void j(c var1) {
      int var2 = var1.f((byte)0);
      int var3 = var1.f((byte)1);
      this.a((byte)0, (int)var2, 1);
      if (var1.w((byte)0)) {
         this.a((byte)0, (byte)0, var2, true);
      }

      if (var1.x((byte)0)) {
         this.a((byte)0, (byte)2, var2, true);
      }

      this.a((byte)0, var2, var1, false);
      this.a((byte)1, (int)var3, 1);
      if (var1.w((byte)1)) {
         this.a((byte)1, (byte)0, var3, true);
      }

      if (var1.x((byte)1)) {
         this.a((byte)1, (byte)2, var3, true);
      }

      this.a((byte)1, var3, var1, false);
      var1.b(24576, true);
      this.b(98304, true);
      var1.x();
      this.x();
   }

   private void k(c var1) {
      int var2 = var1.f((byte)0);
      int var3 = var1.f((byte)1);
      if (var1.w((byte)0)) {
         this.a((byte)0, (byte)0, var2, false);
      }

      if (var1.x((byte)0)) {
         this.a((byte)0, (byte)2, var2, false);
      }

      this.a((byte)0, var2, var1, true);
      if (var1.w((byte)1)) {
         this.a((byte)1, (byte)0, var3, false);
      }

      if (var1.x((byte)1)) {
         this.a((byte)1, (byte)2, var3, false);
      }

      this.a((byte)1, var3, var1, true);
      this.b(98304, true);
      this.x();
   }

   private void a(c var1, s var2) {
      this.b(1, var1);
      Object[] var3 = this.b();
      int var4 = 0;

      for(int var5 = this.c(); var4 < var5; ++var4) {
         ((c)var3[var4]).a(var1, var2);
      }

      this.a(var2);
      this.c(var2);
   }

   private void f(boolean var1) {
      Object[] var2 = this.b();
      int var3 = 0;

      for(int var4 = this.c(); var3 < var4; ++var3) {
         ((c)var2[var3]).f(var1);
      }

      if (var1) {
         this.b(1, (Object)null);
      } else {
         this.C();
      }

   }

   private void d(s var1) {
      Object[] var2 = this.b();
      int var3 = 0;

      for(int var4 = this.c(); var3 < var4; ++var3) {
         ((c)var2[var3]).d(var1);
      }

      this.c(var1);
   }

   private boolean K() {
      if (this.q((int)3) != null) {
         ((z)this.q((int)3)).a((Object)this);
         return true;
      } else {
         return false;
      }
   }

   private boolean e(int var1, int var2) {
      if (this.d == null) {
         this.d = new short[4];
      }

      if (this.d[var1] != (short)var2) {
         this.d[var1] = (short)var2;
         return true;
      } else {
         return false;
      }
   }

   private boolean f(int var1, int var2) {
      if (this.e == null) {
         if (var2 == 0) {
            return false;
         }

         this.e = new short[8];
      }

      if (this.e[var1] != (short)var2) {
         this.e[var1] = (short)var2;
         return true;
      } else {
         return false;
      }
   }

   private boolean g(int var1, int var2) {
      if (this.f == null) {
         this.f = new byte[8];
      }

      if (this.f[var1] != (byte)var2) {
         this.f[var1] = (byte)var2;
         return true;
      } else {
         return false;
      }
   }

   private boolean h(int var1, int var2) {
      if (this.g == null) {
         if (var2 == 0) {
            return false;
         }

         this.g = new byte[11];
      }

      if (this.g[var1] != (byte)var2) {
         this.g[var1] = (byte)var2;
         return true;
      } else {
         return false;
      }
   }

   private void b(byte var1, int var2, int var3) {
      ((short[])((short[])this.i[2 + var1]))[var2 * 3 + 1] = (short)var3;
   }

   private void a(byte var1, byte var2, boolean var3) {
      c var4 = this.h();
      int var6 = var1 == 0 ? (var2 == 0 ? 64 : 256) : (var2 == 0 ? 128 : 512);
      boolean var5 = this.n(var6) != var3;
      if (var5) {
         this.h ^= var6;
         if (var4 != null) {
            var4.a(var1, var2, this.f(var1), var3);
         }
      }

   }

   private void a(byte var1, byte var2, int var3, int var4) {
      short[] var5 = (short[])((short[])this.i[2 + var1]);
      var3 = var3 * 3 + 2;
      if (var2 == 0) {
         var5[var3] = (short)((var5[var3] & 255) + (var4 << 8));
      } else {
         var5[var3] = (short)((var5[var3] & '\uff00') + (var4 & 255));
      }

   }

   private void c(byte var1, int var2, int var3) {
      ((short[])((short[])this.i[2 + var1]))[var2 * 3] = (short)var3;
   }

   private void a(int var1, boolean var2) {
      if (var2) {
         this.h |= var1;
      } else {
         this.h &= ~var1;
      }

   }

   private void c(byte var1, int var2) {
      c var3 = this.h();
      int var4 = this.f(var1);
      if (this.h(0 + var1, (byte)bh.a(var2, -128, 127)) && var3 != null) {
         int var5 = this.f(var1);
         var3.a(var1, (int)var5, 1);
         if (this.w(var1)) {
            var3.a(var1, (byte)0, var4, false);
            var3.a(var1, (byte)0, var5, true);
         }

         if (this.x(var1)) {
            var3.a(var1, (byte)2, var4, false);
            var3.a(var1, (byte)2, var5, true);
         }

         var3.a(var1, var4, this, true);
         var3.a(var1, var5, this, false);
         this.b(var1 == 0 ? 8192 : 16384, true);
         var3.b(var1 == 0 ? '耀' : 65536, true);
      }

   }

   private void b(int var1, boolean var2) {
      this.a(var1, true);
      if (var2) {
         for(c var3 = this.h(); var3 != null && (var3.h & 131072) == 0; var3 = var3.h()) {
            var3.a(131072, true);
         }
      }

   }

   private void l(c var1) {
      this.b(0, var1);
   }

   private void a(int var1, Object var2) {
      if (this.i == null) {
         this.i = new Object[4];
      }

      this.i[var1] = var2;
   }

   private void b(int var1, Object var2) {
      if (this.j == null) {
         if (var2 == null) {
            return;
         }

         this.j = new Object[4];
      }

      this.j[var1] = var2;
   }

   private void g(boolean var1) {
      if (var1) {
         for(c var2 = this; var2 != null; var2 = var2.h()) {
            var2.a(1048576, true);
         }
      } else {
         Object[] var6 = this.b();
         boolean var3 = false;
         int var4 = 0;

         for(int var5 = this.c(); var4 < var5; ++var4) {
            if (((c)var6[var4]).n(c)) {
               var3 = true;
               break;
            }
         }

         if (!var3) {
            this.a(1048576, false);
         }
      }

   }

   private void L() {
      this.h(this.I() ? this.h().p() : this.k());
   }

   private void h(boolean var1) {
      boolean var2 = var1 && this.l();
      if (this.p() != var2) {
         if (!var2) {
            this.x();
         }

         this.a(4096, var2);
         if (var2) {
            if (this.m() && this.I()) {
               this.a(this.h(), this);
            }

            this.x();
         } else {
            this.d(false);
         }

         this.B((byte)5);
      }

      Object[] var3 = this.b();
      int var4 = 0;

      for(int var5 = this.c(); var4 < var5; ++var4) {
         ((c)var3[var4]).h(var2);
      }

   }
}
