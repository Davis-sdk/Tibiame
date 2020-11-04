import java.util.NoSuchElementException;

public abstract class h extends c implements af, bm, bq {
   protected final by a;
   protected final b[] b;
   protected final by c;
   protected c d;
   protected b e;
   protected ch f;
   protected b g;
   protected b h;
   protected w i;
   protected b j;
   protected b k;
   protected ck l;
   protected ck m;
   protected ck n;
   protected ck o;
   private final z[] F = new z[8];
   private ci G;
   private int H;
   private cm I;
   private cm J;
   private cm[] K;
   protected bz p;
   protected bz q;
   private ch L;
   private f M;
   private f N;
   private b O;
   private b P;
   private c Q;
   protected bj r;
   protected bj s;
   protected az t;
   public static boolean u = false;
   private byte R = 0;
   private byte S = 0;
   private int T = -1;
   private int U = 300000;
   private int V = -1;
   private int W = -1;
   protected int v = 0;
   protected int w = 0;
   public static boolean x = false;
   public static b y;
   public static boolean z = false;
   protected static int A = 0;
   public static int B = 0;
   protected static String[] C = null;
   protected String D = "";
   public static int E = 0;

   protected h() {
      super(false);
      this.F[0] = new z(16);
      this.F[1] = new z(2);
      this.F[2] = new z(8);
      this.F[4] = new z(6);
      this.F[5] = new z(20);
      this.F[6] = new z(13);
      this.F[7] = new z(13);
      this.a((by)(this.c = new by()), (byte)6);
      this.b((by)(this.a = new by()), (byte)5);
      this.d = new c();
      this.k = new v();
      this.b = new v[3];
      this.b[0] = new v();
      this.b[1] = new v();
      this.b[2] = new v();
      this.g = new ak();
      this.h = new ak();
      this.f = new ch();
      this.j = new ak();
      this.e = new v();
      this.K = new cm[2];
      this.p = new bz((byte)101);
      this.p.a((af)this);
      this.q = new bz((byte)102);
      this.q.a((af)this);
      this.e(true);
      this.b((byte)1);
   }

   public final ci a() {
      return this.G;
   }

   public cm b() {
      return this.I;
   }

   public cm E() {
      return this.J;
   }

   public static c e(c var0) {
      c var1;
      for(var1 = var0; var1 != null && !(var1 instanceof ba); var1 = var1.h()) {
      }

      if (var1 == null) {
         throw bh.b(1263226180);
      } else {
         return var1;
      }
   }

   public static void a(c var0, int var1) {
      if (var1 == 0) {
         c var2 = e(var0.f((int)0));
         var2.b(false);
      } else if (var0.p()) {
         var0.f(var1);
      }

   }

   public static void a(e var0, by var1) {
      var1.s(var0.c() - 1);

      for(int var2 = 0; var2 < var0.c() - 1; ++var2) {
         an var3 = (an)var0.f(var2 + 1);
         var1.a(var2, 0, bh.g(var3.a));
         if (var3.a != -1) {
            var1.a(var2, var3.a);
         }

         if (var3.b == -2) {
            var1.a(var2, (byte)1, true);
         }

         if (var3.b == -1) {
            var1.a(var2, (byte)2, true);
         }

         var1.a(var2, 1, var3.c);
         var1.a(var2, 2, var3);
      }

      var1.f(true);
      var1.a(var0.e(0));
   }

   public static void a(int var0, f var1) {
      switch(var0) {
      case -1:
         var1.h().b(false);
         break;
      case 0:
         var1.a((short)53).s();
         break;
      case 1:
         var1.a((short)54).s();
         break;
      case 2:
         var1.a((short)56).s();
         break;
      case 3:
         var1.a((short)55).s();
         break;
      case 4:
         var1.a((short)4106).s();
         break;
      case 5:
         var1.a((short)4152).s();
         break;
      case 6:
         var1.a((short)22).s();
         break;
      default:
         throw bh.b(1096103992, String.valueOf(var0));
      }

   }

   public static c a(c var0, String var1, int var2, String var3, String var4, short var5) {
      c var6;
      if (var1 != null && (var6 = var0.g((int)20)) != null) {
         ((b)var6).a(var1);
      }

      if (var2 != 0 && (var6 = var0.g((int)21)) != null) {
         ((b)var6).a(bh.h(var2));
      }

      if (var3 != null && (var6 = var0.g((int)22)) != null) {
         ((b)var6).a(var3);
      }

      if (var4 != null && (var6 = var0.g((int)23)) != null) {
         ((b)var6).a(var4);
      }

      if (var5 != -1 && (var6 = var0.g((int)24)) != null) {
         ((ck)var6).b(var5);
      }

      return var0;
   }

   public static c b(c var0, int var1) {
      var0.s().f(var1);
      return var0;
   }

   public static void a(ch var0) {
      if (var0.E() == 0) {
         var0.p(1);
      } else if (var0.E() == 1) {
         var0.p(3);
      } else if (var0.E() == 3) {
         var0.p(2);
      } else if (var0.E() == 2) {
         var0.p(0);
      }

   }

   public static void c(c var0, int var1) {
      if (var0.p()) {
         a((c)var0, (int)0);
      } else {
         b(var0, var1);
      }

   }

   public final z a(byte var1) {
      return this.F[var1];
   }

   public cm a(int var1) {
      return this.K[var1];
   }

   public final c C(byte var1) {
      z var2 = this.a(var1);
      if (var2.d() == 0) {
         throw bh.a(1295594032, bh.h(var1));
      } else {
         try {
            return (c)var2.c();
         } catch (NoSuchElementException var4) {
            throw bh.a(1196438342, bh.h(var1));
         }
      }
   }

   public final void a(byte var1, c var2) {
      c.a(this.F[var1], var2);
   }

   public byte b(int var1) {
      return au.a(var1);
   }

   public final String a(short var1) {
      return this.g().a(var1);
   }

   public final String a(short var1, Object[] var2) {
      return this.g().a(var1, var2);
   }

   public final bv F() {
      return this.t.a();
   }

   public boolean G() {
      return this.A();
   }

   public void H() {
      this.z();
   }

   public boolean a(boolean var1) {
      Object var2;
      if (!this.G.b((short)6011) && !this.G.b((short)6010)) {
         if (!this.G.b((short)6012)) {
            return false;
         }

         var2 = this.j;
      } else {
         var2 = this.c;
      }

      if (var1 && var2 != null) {
         return !((c)var2).d((byte)1);
      } else {
         return !((c)var2).c((byte)1);
      }
   }

   public final boolean D(byte var1) {
      return this.a(var1, false).p();
   }

   public boolean I() {
      return this.t.p();
   }

   public final boolean J() {
      switch(this.G.f().a) {
      case 6010:
      case 6011:
         return this.c.c((byte)1) || this.c.d((byte)1);
      case 6012:
         return this.j.c((byte)1) || this.j.d((byte)1);
      default:
         return false;
      }
   }

   public boolean c(char var1) {
      return this.a(var1);
   }

   public final void b(z var1) {
      b(var1, this);
   }

   public final void a(ci var1) {
      this.G = var1;
   }

   public void K() {
      this.t.f((int)0);
      this.t.s();
      if (y.b() == null) {
         a((c)y, (int)0);
      }

      if (this.d.p()) {
         this.P();
      }

      this.S();
   }

   public void a(Object var1, e var2) {
      int var8;
      switch(var2.a) {
      case 4003:
         this.H = var2.e(0);
         this.a(var2.g(0), this.G.f().a, var2.c(0), var2.c(1));
         break;
      case 4004:
         if (var2.e(0) == this.H) {
            this.a((String)null, this.G.f().a, false, false);
         }
         break;
      case 4014:
         switch(var2.d(0)) {
         case 4:
            this.w = var2.e(0);
            return;
         case 5:
            this.v = var2.e(0);
            return;
         default:
            return;
         }
      case 4020:
         y.a((String)null);
         break;
      case 4024:
         var8 = var2.e(0);
         if ((var8 & 1) != 0) {
            this.l.b(this.d().a((int)17));
         } else if ((var8 & 4) != 0) {
            this.l.b(this.d().a((int)18));
         } else if ((var8 & 2) != 0) {
            this.l.b(this.d().a((int)19));
         } else {
            this.l.b((short)-1);
         }

         if ((var8 & 8) != 0) {
            this.m.b(this.d().a((int)20));
         } else {
            this.m.b((short)-1);
         }

         if ((var8 & 16) != 0) {
            if (this.T < 0) {
               this.T = this.U;
            }
         } else {
            this.T = -1;
         }

         if ((var8 & 32) != 0) {
         }

         if ((var8 & 64) != 0 && (var8 & 128) != 0) {
            this.o.b(this.d().a((int)23));
         } else if ((var8 & 64) != 0) {
            this.o.b(this.d().a((int)22));
         } else if ((var8 & 128) != 0) {
            this.o.b(this.d().a((int)21));
         } else {
            this.o.b((short)-1);
         }

         if ((var8 & 256) != 0) {
            this.n.b(this.d().a((int)24));
         } else {
            this.n.b((short)-1);
         }
         break;
      case 4028:
         byte var9 = var2.d(0);
         int var10 = var2.e(0);
         int var11 = var2.e(1);
         if (var9 == 1) {
            this.V = var11 * 1000;
         } else if (var9 == 2) {
            this.W = var11 * 1000;
         }
         break;
      case 5000:
         if (var2.d(0) == 16) {
            this.P.a(var2.g(0));
            a((int)2, (f)this.M);
            a((int)3, (f)this.N);
            this.a.s(var2.c() - 1);
            int var14 = 0;

            for(var8 = var2.c() - 1; var14 < var8; ++var14) {
               this.a.a(var14, 0, var2.g(var14 + 1));
            }

            this.a.f(false);
            this.a.d(true);
            this.a.a(var2.e(0));
            this.O.b(false);
            this.L.b(false);
         }
         break;
      case 5005:
         byte var7 = var2.d(0);
         if (var7 == 1 || var7 == 3 || var7 == 2) {
            this.a(this.L, var7);
            this.O.b(false);
            this.a.b(false);
            this.P.a(var2.g(0));
            this.L.a(var2.g(1));
            this.L.d(true);
            a((int)-1, (f)this.M);
            a((int)-1, (f)this.N);
         }
         break;
      case 5006:
         e var13 = (e)var2.f(0);
         switch(var13.d(0)) {
         case 1:
         case 2:
         case 3:
            this.U();
            return;
         case 4:
         default:
            return;
         case 5:
            this.f.d(false);
            return;
         }
      case 6003:
         this.R();
         break;
      case 6004:
         this.P.a(var2.g(0));
         this.O.a(var2.g(1)).d(true);
         this.O.d(0, 0);
         this.a.b(false);
         this.L.b(false);
         a(var2.e(0), this.M);
         a(var2.e(1), this.N);
         break;
      case 6005:
         switch(var2.e(0)) {
         case 6004:
            this.U();
            return;
         case 6005:
         case 6006:
         case 6007:
         case 6008:
         case 6013:
         default:
            return;
         case 6009:
         case 6010:
         case 6011:
         case 6012:
            if (!this.G.c().b()) {
               this.P();
            }

            return;
         case 6014:
            this.P();
            return;
         }
      case 6009:
         this.P();
         this.k.a(var2.g(0));
         this.a((String)null, true);
         this.i.a();
         this.i.a(false, false);
         this.d.b(this.f.h());
         this.d.s();
         this.R();
         break;
      case 6010:
         byte var12 = this.G.f().d(1);
         if (var12 == 0) {
            this.J.b(true);
            this.J.s();
         } else if (var12 == 1) {
            this.I.b(true);
            this.I.s();
            this.K[0].b(true);
            this.K[0].s();
            this.K[1].b(true);
            this.K[1].s();
         }
         break;
      case 6011:
         this.P();
         int var3 = var2.e(2);
         this.c.c(var2.c(2) ? 12285713 : -2);
         this.k.a(var2.g(0));
         this.i.a();
         this.i.a(var2.c(0), var2.c(1));
         this.b[0].a(var2.g(2));
         this.b[1].a((var3 & 512) == 0 ? "" : var2.g(3));
         this.b[2].a((var3 & 1024) == 0 ? "" : var2.g(4));
         if (!this.b[0].a(true) || !this.b[1].a(true) || !this.b[2].a(true)) {
            this.d.b(this.b[0].h());
         }

         this.d.b(this.c.b((int)0, 2));
         z var4;
         if ((var3 & 256) != 0) {
            var4 = this.a((byte)7);
            this.c.a(var4, var4.a());
            this.b[0].a((int)24, (int)0, 0, 0);
         } else {
            var4 = this.a((byte)6);
            this.c.a(var4, var4.a());
            this.b[0].a((int)0, (int)0, 0, 0);
         }

         this.c.s(var2.e(1));
         int var5 = 0;

         for(int var6 = var2.e(1); var5 < var6; ++var5) {
            this.c.a(var5, 0, new Integer(this.d().a((short)var2.d(var5 * 6 + 4), (short)(var2.d(var5 * 6 + 5) & 255), (short)var2.d(var5 * 6 + 6))));
            this.c.a(var5, 1, var2.g(var5 * 3 + 5));
            this.c.a(var5, 2, (var3 & 1024) == 0 ? "" : var2.g(var5 * 3 + 7));
            this.c.a(var5, 3, (var3 & 512) == 0 ? "" : var2.g(var5 * 3 + 6));
            this.c.a(var5, 4, bh.g(var2.e(var5 + 3)));
            this.c.a(var5, 5, bh.g(var2.d(var5 * 6 + 8)));
         }

         this.c.f(true);
         this.a(var2.g(1), this.c.t().p((byte)1) > 0 || var2.c(1));
         this.d.s();
         this.R();
         break;
      case 6012:
         this.P();
         this.k.a(var2.g(0));
         this.i.a();
         this.i.a(var2.c(0), var2.c(1));
         this.d.b((c)this.j);
         this.j.a(var2.g(1));
         this.a((String)null, this.j.t().p((byte)1) > 0 || var2.c(1));
         this.d.s();
         this.R();
         break;
      case 8008:
         this.G.b(var2.c(0) ? var2.g(0) : null);
      }

   }

   public final void a(k var1, byte var2, int var3) {
      if (var2 == 2) {
         if (!this.T()) {
            this.G.a((int)-1, false);
         }
      } else if (var2 == 1 && !this.T()) {
         int var4 = 0;
         if (this.G.a((short)5002)) {
            var4 = var3;
         } else if (this.G.a((short)5000)) {
            switch(this.G.e().d(0)) {
            case 6:
            case 8:
            case 14:
            case 16:
               var4 = var3;
               break;
            default:
               var4 = this.a((cm)var1);
            }
         }

         var1.a();
         this.G.a(var4, false);
      }

   }

   protected boolean z(byte var1) {
      if (z) {
         if (var1 == 2) {
            if (B < A) {
               b((c)y.a(C[++B]), (int)0);
               E = this.O();
            } else if (A == B) {
               a((c)y, (int)0);
               this.M();
            }
         } else if (var1 == 0) {
            if (B > 0 && y.b() != null) {
               b((c)y.a(C[--B]), (int)0);
               E = this.O();
            }
         } else if (var1 == 17 && z) {
            z = false;
            a((c)y, (int)0);
            this.N();
            this.t.d(true);
            this.G.a((int)-1, false);
            return true;
         }
      }

      return this.T() || this.G.l((int)var1);
   }

   public static void L() {
      if (y.b() != null) {
         b((c)y.a(C[B]), (int)0);
         y.d(true);
      }

   }

   protected void M() {
   }

   protected void N() {
   }

   protected boolean A(byte var1) {
      return this.G.m((int)var1);
   }

   protected boolean b(char var1) {
      return this.T() || this.G.a(var1);
   }

   protected void o(int var1) {
      if (this.T >= 0) {
         this.T += var1;
         if (this.T >= this.U) {
            this.a(this.g().a((short)4096), this.G.f().a, true, false);
            this.T = 0;
         }
      }

      if (this.r != null && this.s != null) {
         ++this.R;
         if (this.R > 10) {
            if (this.w <= 25) {
               this.r.b(!this.r.l());
            } else if (!this.r.l()) {
               this.r.b(true);
            }

            if (this.v <= 25) {
               this.s.b(!this.s.l());
            } else if (!this.s.l()) {
               this.s.b(true);
            }

            this.R = 0;
         }
      }

      if (this.V > 0) {
         this.V -= var1;
      }

      if (this.W > 0) {
         this.W -= var1;
      }

      if (this.o != null) {
         ++this.S;
         if (this.S > 40) {
            if ((this.V < 0 || this.V > 300000) && (this.W < 0 || this.W > 300000)) {
               if (!this.o.l()) {
                  this.o.b(true);
               }
            } else {
               this.o.b(!this.o.l());
            }

            this.S = 0;
         }
      }

      if (z) {
         E -= var1;
         if (E <= 0) {
            if (B < A) {
               ++B;
            }

            E = this.O();

            try {
               if (y.p()) {
                  b((c)y.a(C[B]), (int)0);
               }
            } catch (Exception var3) {
            }
         }
      }

      this.G.g(var1);
   }

   protected int O() {
      try {
         return C[B].length() * 250 + 2000;
      } catch (Exception var2) {
         return 2000;
      }
   }

   protected final by a(by var1, boolean var2) {
      var1.t(3).a(0, 10, (byte)4).a(1, 11, (byte)1).a((z)this.a((byte)0), 8).a(true);
      if (var2) {
         var1.r(2).a(0, (byte)1, 11, 1, 0).a(1, (byte)2, 11, 16777215, 0);
      } else {
         var1.r(2).a(0, (byte)1, 11, 1, 1).a(1, (byte)2, 11, 16777215, 16777215);
      }

      var1.b(true, true).a(true, true);
      return var1;
   }

   protected final c a(e var1) {
      return a(this.C((byte)4), var1.g(0) + ':', 0, (String)null, var1.g(1), (short)-1);
   }

   protected final String b(e var1) {
      String var2;
      if (var1.a == 6001) {
         var2 = var1.g(0);
         if (var2 == null) {
            return null;
         }
      } else {
         var2 = null;
      }

      return this.g().a((short)4127, (Object)(var2 != null ? ' ' + var2 : ""));
   }

   protected final cm a(cm var1, e var2) {
      s var3 = this.d();
      int var4 = var2.e(1);
      int var5 = var2.e(2);
      int var6 = var2.e(3);
      byte var7 = 7;
      boolean var8 = true;
      if ((var4 & 1) != 0) {
         var7 = 7;
      } else if ((var4 & 2) != 0) {
         var7 = 5;
      } else if ((var4 & 4) != 0) {
         var7 = 5;
      }

      boolean var9 = var6 % var7 != 0;
      int var13 = var6 / var7 + (var9 ? 1 : 0);
      var1.q(var7);
      var1.p(var13);
      int var10 = 0;
      int var11 = 0;

      for(int var12 = var2.b(); var11 < var12; var11 += 2) {
         var1.a(var10, var3.c((short)(var2.d(var11) * 256 + (var2.d(var11 + 1) & 255))));
         ++var10;
      }

      var1.v(var5);
      return var1;
   }

   protected final String c(e var1) {
      int var2 = var1.e(1);
      String var3;
      if ((var2 & 1) != 0) {
         var3 = var1.g(0) + " (" + var1.e(0) + ")";
      } else {
         var3 = var1.g(0);
      }

      return var3;
   }

   protected final c a(e var1, boolean var2) {
      String var3 = var2 ? var1.g(2).replace('\n', ' ') : var1.g(2);
      return a(this.C((byte)1), var1.g(0), 0, var1.g(1), var3, (short)-1);
   }

   protected final byte a(cm var1) {
      int var2;
      if (var1 == this.I) {
         var2 = 9;
      } else if (var1 == this.K[0]) {
         var2 = ci.a(false, 0, var1.G());
      } else if (var1 == this.K[1]) {
         var2 = ci.a(false, 1, var1.G());
      } else if (var1 == this.p) {
         var2 = var1.l() ? 100 : -1;
      } else if (var1 == this.q) {
         var2 = var1.l() ? 101 : -1;
      } else {
         var2 = ci.a(true, var1.F(), var1.G());
      }

      return (byte)var2;
   }

   protected final cm a(byte var1, boolean var2) {
      if (ci.e((int)var1)) {
         if (var2) {
            this.J.e(ci.a((int)var1), ci.b((int)var1));
         }

         return this.J;
      } else if (ci.f((int)var1)) {
         cm var3 = this.K[ci.c((int)var1)];
         if (var2) {
            var3.e(0, ci.d((int)var1));
         }

         return var3;
      } else if (var1 == 9) {
         if (var2) {
            this.I.e(0, 0);
         }

         return this.I;
      } else {
         throw bh.b(926038091);
      }
   }

   protected final void P() {
      this.k.a((String)null);
      this.b[0].a((String)null);
      this.b[1].a((String)null);
      this.b[2].a((String)null);
      this.g.a((String)null);
      this.f.a((String)null);
      this.h.a((String)null);
      this.e.a((String)null);
      this.j.a((String)null);
      this.c.I();
      this.b[0].h().w();
      this.c.w();
      this.f.h().w();
      this.j.w();
      this.d.b(false);
   }

   public final int Q() {
      return this.c != null ? this.c.H() : -1;
   }

   protected final void R() {
      this.p.a(true);
      this.q.a(true);
   }

   protected final void S() {
      this.p.a(false);
      this.q.a(false);
   }

   protected final void d(e var1) {
      int var2 = var1.e(0);
      this.c.d(true);
      this.c.a(bh.a(var2, 0, this.c.G() - 1));
      this.c.q(this.c.J());
   }

   protected final void e(e var1) {
      int var2 = var1.e(0);
      byte var3 = var1.d(1);
      if (var3 == 0) {
         this.K[0].b(false);
         this.K[1].b(false);
         this.J.d(true);
         this.J.a(var2);
      } else {
         this.J.b(false);
         this.I.d(true);
         this.K[1].d(true);
         this.K[0].d(true);
         this.K[0].a(var2);
      }

   }

   protected final void a(e var1, b var2, ch var3, b var4) {
      if (var2 != null) {
         var2.a(var1.g(0));
      }

      if (var4 != null) {
         var4.a(var1.g(2));
      }

      this.a(var3, var1.d(0));
      var3.f((int)0);
      var3.a(var1.g(1));
      var3.s();
      var3.d(true);
   }

   protected final void a(x var1, short var2, short var3, short var4, short var5, short var6, short var7, short var8, short var9) {
      this.Q = var1.a(var2);
      this.P = (b)var1.a(var3);
      this.O = (b)var1.a(var4);
      this.L = (ch)var1.a(var5);
      this.M = (f)var1.a(var6);
      this.N = (f)var1.a(var7);
      w var10 = new w(var1.a(var8), var1.a(var9));
      this.O.a((cl)var10);
      this.a.a((cl)var10);
      this.L.a((cl)var10);
      this.L.F().a(this);
   }

   protected final void a(x var1, short var2, short var3, short var4, short var5, short var6, short var7, short var8, short var9, short var10, short var11, short var12, short var13) {
      this.j = (b)var1.a(var4);
      this.e = (b)var1.a(var13);
      this.d = var1.a(var2);
      this.k = (b)var1.a(var3);
      this.b[0] = (b)var1.a(var8);
      this.b[1] = (b)var1.a(var9);
      this.b[2] = (b)var1.a(var10);
      this.g = (b)var1.a(var5);
      this.f = (ch)var1.a(var6);
      this.h = (b)var1.a(var7);
      this.i = new w(var1.a(var11), var1.a(var12));
      this.f.F().a(this);
      this.f.a((cl)this.i);
      this.j.a((cl)this.i);
      this.c.a((cl)this.i);
      this.P();
   }

   protected final ch a(ch var1, byte var2) {
      boolean var3 = this.G.g(var2);
      boolean var4 = this.G.i(var2);
      int var5 = var3 ? 1 : 0;
      return var1.q(this.G.f(var2)).i(var3).p(this.G.j(var2) ? 2 : var5).f(var4).g(var4).h(!this.G.j(var2));
   }

   protected final void f(e var1) {
      boolean var2 = var1.c(0);
      boolean var3 = var1.c(1);
      e var4 = this.G.f();
      switch(var4.a) {
      case 6010:
      case 6011:
         if (var3) {
            this.c.b(var2 ? this.c.F() : 0);
         } else {
            this.c.b(this.c.b() + (var2 ? 1 : -1));
         }
         break;
      case 6012:
         int var5 = var3 ? Integer.MAX_VALUE : this.j.u((byte)1);
         if (!var2) {
            var5 = -var5;
         }

         this.j.d(0, this.j.t((byte)1) + var5);
      }

   }

   protected final void a(cm var1, cm var2, cm var3, cm var4) {
      (this.J = var1).a((af)this);
      (this.I = var2).a((af)this);
      (this.K[0] = var3).a((af)this);
      (this.K[1] = var4).a((af)this);
      if (this instanceof cl) {
         cl var5 = (cl)this;
         this.J.a(var5);
         this.I.a(var5);
         this.K[0].a(var5);
         this.K[1].a(var5);
      }

      byte[] var7 = new byte[9];

      for(int var6 = 0; var6 < var7.length; ++var6) {
         var7[var6] = (byte)(var6 + 5);
      }

      this.J.a(var7);
      var7 = new byte[]{4};
      this.I.a(var7);
      var7 = new byte[]{5, 6, 7};
      this.K[0].a(var7);
      var7 = new byte[]{8, 9, 10};
      this.K[1].a(var7);
   }

   protected final void a(az var1) {
      this.t = var1;
   }

   protected abstract void a(String var1, short var2, boolean var3, boolean var4);

   protected final cm a(byte var1, short var2) {
      short var3 = this.d().c(var2);
      if (ci.e((int)var1)) {
         return this.J.a(ci.a((int)var1), ci.b((int)var1), var3);
      } else if (ci.f((int)var1)) {
         return this.K[ci.c((int)var1)].a(0, ci.d((int)var1), var3);
      } else if (var1 == 9) {
         return this.I.a(0, 0, var3);
      } else {
         throw bh.b(926038091);
      }
   }

   private static void b(z var0, c var1) {
      if (var1 instanceof bm) {
         var0.a((Object)var1);
      }

      int var2 = 0;

      for(int var3 = var1.c(); var2 < var3; ++var2) {
         b(var0, var1.h(var2));
      }

   }

   private void a(by var1, byte var2) {
      var1.t(6).a(0, 24, (byte)2).a(1, 40, (byte)1).a(2, 42, (byte)1).a(3, 41, (byte)1);
      var1.r(6).a(0, (byte)1, 40, 1, 0).a(1, (byte)2, 40, 16777215, 0).a(2, (byte)1, 42, 1, 0).a(3, (byte)2, 42, 16777215, 0);
      var1.a(4, (byte)1, 41, 1, 0).a(5, (byte)2, 41, 16777215, 0);
      z var3 = this.a(var2);
      var1.a(var3, var3.a());
      var1.b(true, true).c(false, true).a(true, true);
      var1.g(true);
      var1.a((af)this);
   }

   private void b(by var1, byte var2) {
      var1.t(1).a(0, 20, (byte)1);
      var1.r(4).a(0, (byte)1, 20, 1, 0).a(1, (byte)2, 20, 16777215, 0).a(2, (byte)1, 21, 1, 0).a(3, (byte)2, 21, 16777215, 0);
      z var3 = this.a(var2);
      var1.a(var3, var3.a());
      var1.b(true, true).c(false, true).a(true, true);
      var1.a((af)this);
   }

   private void U() {
      this.Q.b(false);
      this.O.a((String)null);
      this.L.a((String)null);
      this.a.I();
   }

   private void a(String var1, boolean var2) {
      boolean var3 = var1 == null || var1.length() == 0;
      if (var3 && !var2) {
         this.e.h().w();
      } else {
         this.d.b(this.e.h());
         this.e.a(var1);
         this.e.c((int)-1, this.k.r((byte)1));
      }

   }

   public abstract void E(byte var1);

   public abstract boolean T();

   public abstract boolean F(byte var1);
}
