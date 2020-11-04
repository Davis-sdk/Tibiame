import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class cn extends c implements af, bm, cl, m {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   protected b[] a = null;
   protected z b = null;
   protected c c;
   protected boolean d;
   protected cp e;
   protected c f;
   protected bg g;
   protected ch h;
   protected ch i;
   protected c j;
   protected c k;
   protected by l;
   protected c m;
   protected f n;
   protected c o;
   protected bg p;
   protected ch q;
   protected boolean r;
   protected f s;
   protected int t;
   protected b u;
   protected as v;
   protected f w;
   protected b x;
   protected b y;
   protected c z;
   protected ae A;
   protected b B;
   protected c C;
   protected volatile c D;
   protected aq E;
   protected cp F;
   protected c G;
   protected c H;
   protected cp I;
   protected c J;
   protected bg K;
   protected bg L;
   protected bg M;
   protected ay N;
   protected byte O;
   protected bw P;
   private final int Q;
   private al R;
   private al S;
   private byte T;
   private volatile boolean U = false;
   private boolean V = false;

   public cn(ay var1, int var2) {
      super(false);
      this.Q = var2;
      this.b(true, true).c(true, true).a(true, true);

      x var3;
      try {
         InputStream var4 = var1.b((int)2, "ui-main.dat");
         if (var4 == null) {
            var4 = var1.a((int)0, "ui-main.dat");
         }

         DataInputStream var5 = new DataInputStream(var4);

         try {
            var3 = (new x(var5)).a((short)0, (ao)(new bf())).a((short)48, (c)this);
            var3.a();
         } finally {
            var5.close();
         }
      } catch (IOException var10) {
         throw bh.a(827998529, (Throwable)var10);
      }

      this.H = var3.a((short)42).w();
      this.I = (cp)var3.a((short)43);
      this.I.a().a(this);
      this.J = var3.a((short)45);
      this.K = (bg)var3.a((short)41);
      this.K.a(new short[]{29, 28, 27, 26});
      this.L = (bg)var3.a((short)39);
      this.L.a(new short[]{31, 30});
      this.M = (bg)var3.a((short)40);
      this.M.a(new short[]{31, 30});
      this.P = (bw)var3.a((short)47).w();
      this.G = var3.a((short)35).w();
      this.F = (cp)var3.a((short)38);
      this.F.a().a(this);
      this.F.a((cl)(new w(var3.a((short)37), var3.a((short)36))));
      this.c = var3.a((short)0).w();
      this.a = new b[2];
      this.a[0] = (b)var3.a((short)3);
      this.a[1] = (b)var3.a((short)4);
      this.a[1].a((cl)(new w(var3.a((short)2), var3.a((short)1))));
      this.C = var3.a((short)31).w();
      this.B = (b)var3.a((short)34);
      this.B.a((cl)(new w(var3.a((short)33), var3.a((short)32))));
      this.o = var3.a((short)5).w();
      this.n = (f)var3.a((short)15);
      this.e = (cp)var3.a((short)6);
      this.e.a().a(this);
      var3.a((short)9).a((cl)(new w(var3.a((short)8), var3.a((short)7))));
      this.j = var3.a((short)13);
      this.k = var3.a((short)14);
      this.f = this.j.h();
      this.j.w();
      this.p = (bg)var3.a((short)16);
      this.p.a(new short[]{38, 39});
      this.g = (bg)var3.a((short)10);
      this.g.a(new short[]{40, 41});
      this.h = (ch)var3.a((short)11);
      this.i = (ch)var3.a((short)12);
      this.q = (ch)var3.a((short)17);
      this.q.F().a(this);
      this.x = (b)var3.a((short)29);
      this.x.a((cl)(new w(var3.a((short)24), var3.a((short)23))));
      this.z = this.x.h().h().w();
      this.y = (b)var3.a((short)30);
      this.s = (f)var3.a((short)25);
      this.w = (f)var3.a((short)28);
      this.v = (as)var3.a((short)27);
      this.u = (b)var3.a((short)26);
      this.m = var3.a((short)18).w();
      this.l = (by)var3.a((short)19);
      this.l.a((cl)(new w(var3.a((short)21), var3.a((short)20))));
      this.b = new z(20);
      this.l.a((af)this);
      c.a(this.b, var3.a((short)22).w());
      this.l.a(this.b, this.b.a());
      this.l.t(3).a(0, 24, (byte)2).a(1, 20, (byte)1);
      this.l.r(2).a(0, (byte)1, 20, 1, 0).a(1, (byte)2, 20, 16777215, 8925952);
      this.b((byte)1);
   }

   public boolean a() {
      return this.U;
   }

   public boolean b() {
      return this.V;
   }

   public void a(Object var1, e var2) {
      ad var3 = this.g();
      switch(var2.a) {
      case 8000:
         var3.a((short)4147);
         var3.a((short)8196);
         break;
      case 8001:
         this.y.a(var3.a((short)18));
         this.x.s();
         s var6 = this.d();
         var6.j();
         break;
      case 8002:
         int var5 = var2.e(0);
         if (var5 > 100) {
            var5 = 100;
         }

         this.v.p(var5);
         this.u.a(var5 + " %");
         this.y.a(var3.a((short)62));
         this.y.x();
         break;
      case 8003:
         this.v.p(0);
         this.u.a("0 %");
         this.v.s();
         this.y.a(var3.a((short)62));
      case 8004:
      case 8005:
      default:
         break;
      case 8006:
         if (!var2.c(0) && var2.f(1) == this.q && a(this.q.b())) {
            this.G();
         }

         this.U = var2.c(0);
         break;
      case 8007:
         au var4 = (au)var2.f(0);
         switch(this.O) {
         case 2:
            switch(var4.a()) {
            case 4:
               this.r();
               return;
            case 5:
               this.L();
               return;
            case 6:
               this.E();
               return;
            case 7:
               this.K();
               return;
            case 8:
               this.J();
               return;
            }
         case 3:
         case 5:
         case 6:
         case 8:
         case 10:
         default:
            return;
         case 4:
            switch(var4.a()) {
            case 11:
               this.Q();
               return;
            case 13:
               this.H();
               return;
            case 17:
               this.M();
               return;
            default:
               return;
            }
         case 7:
         case 9:
            switch(var4.a()) {
            case 10:
               this.a(var3.a((short)20), var3.a((short)50), 6);
               return;
            case 11:
               this.Q();
               return;
            case 12:
            case 14:
            case 15:
            case 16:
            default:
               return;
            case 13:
               this.H();
               return;
            case 17:
               this.E();
               if (this.O == 9) {
                  this.M();
               }

               return;
            }
         case 11:
            switch(var4.a()) {
            case 8:
               this.I();
               return;
            case 17:
               this.M();
               return;
            default:
               return;
            }
         }
      case 8008:
         if (var1 == this.q && a(var2.g(0))) {
            this.G();
         }
         break;
      case 8009:
         if (var1 == this.q && a(this.q.b())) {
            this.q.a((String)null);
         }
      }

   }

   public void a(e var1) {
      ay var4 = this.i().c();
      byte var5 = 40;
      Object var2;
      if (this.u((byte)0) > this.u((byte)1) && this.u((byte)0) >= 240 && this.u((byte)1) >= 160) {
         if (this.u((byte)0) >= 240 + var5 && this.u((byte)1) >= 160 + var5) {
            ci.h = var5;
         }

         var2 = new ab(var4);
      } else if (this.u((byte)0) >= 176 && this.u((byte)1) >= 208) {
         if (this.u((byte)0) >= 176 + var5 || this.u((byte)1) >= 208 + var5) {
            ci.h = var5;
         }

         var2 = new cf(var4);
      } else {
         if (this.u((byte)0) >= 128 + var5 || this.u((byte)1) >= 128 + var5) {
            ci.h = var5;
         }

         var2 = new bl(var4);
      }

      ci var3 = new ci(this.g(), this.i(), (bq)var2);
      var3.a((cb)var1.f(2)).a((ae)var1.f(1)).a((y)var1.f(3)).a((e)var1.f(4), (e)var1.f(5));
      if (var1.g(0) != null) {
         var3.a(var1.g(0));
      }

      this.D = (c)var2;
      if (bh.a((byte)0)) {
         bh.a((byte)0, 1177761608, (String)"InGame");
      }

   }

   public void a(k var1, byte var2, int var3) {
      switch(this.O) {
      case 4:
         if (var2 == 1) {
            var1.a(var3);
         }
         break;
      case 8:
         if (var2 == 1) {
            this.a((byte)7);
            if (this.O == 7) {
               this.h.a(this.A.c);
               this.i.a(this.A.f);
               this.q.a(String.valueOf(this.A.h));
            }
         } else if (var2 == 2) {
            this.M();
         }
      }

   }

   public void a(c var1, byte var2) {
      if (var1 instanceof h && var2 == 2) {
         this.V = false;
         this.M();
      }

   }

   protected void y(byte var1) {
      if (this.O == 0 && var1 == 1) {
         if (this.T == 1) {
            this.P.G();
         }

         if (this.T == 3) {
            this.N();
            this.M();
         }
      }

   }

   protected void a(s var1) {
      this.N = this.i().c();

      try {
         this.R = var1.a(this.N.a((int)1, "Presents.png"));
         this.S = var1.a(this.N.a((int)1, var1.f() < 176 ? "TitleSmall.png" : "TitleBig.png"));
      } catch (Throwable var3) {
         if (!(var3 instanceof IOException)) {
            bh.a((byte)1, 911487317, (Throwable)var3);
         }

         this.R = null;
         this.S = null;
         System.gc();
         this.T = 3;
         this.O = 0;
         this.f((int)1);
         return;
      }

      this.P();
   }

   protected void b(s var1) {
      if (this.O == 0) {
         this.d(var1);
      }

   }

   protected boolean z(byte var1) {
      if (this.r) {
         this.a((int)var1);
      } else {
         boolean var2 = var1 == 16;
         boolean var3 = var1 == 17;
         switch(this.O) {
         case 0:
            this.N();
            this.M();
            return true;
         case 1:
            if (var1 == 17 || var1 == 16) {
               this.a((byte)4);
            }
            break;
         case 3:
         case 10:
            if (var2 || var3) {
               this.M();
               return true;
            }
         }
      }

      return false;
   }

   protected void o(int var1) {
      switch(this.O) {
      case 0:
         this.R();
         break;
      case 5:
         if (this.E != null) {
            if (this.E.c()) {
               this.a(this.g().a((short)16), this.E.h, 1);
               this.O = 6;
            } else if (this.E.a) {
               this.M();
               this.a(this.g().a((short)18), this.E.b, 1);
               this.E = null;
            } else if (this.E.d) {
               this.a(this.g().a((short)18), this.g().a((short)1), 0);
               this.A.a(false);
               br var2 = new br(this, true);
               var2.a().a((Object)this.E.i).a((Object)this.A).a((Object)this.E.b()).a((Object)this.E.e).a((Object)this.E.f).a((Object)this.E.g);
               var2.start();
               this.E = null;
            }
         }

         if (this.D != null) {
            this.F();
            this.v();
            this.b(this.D);
            this.D.d(true);
            this.D.a((cl)this);
            this.D = null;
            this.V = true;
         }
      }

   }

   protected static boolean a(String var0) {
      if (bh.a(var0) == 0) {
         return true;
      } else {
         try {
            int var1 = Integer.parseInt(var0);
            return !bh.b(var1, 1, 999);
         } catch (NumberFormatException var2) {
            return true;
         }
      }
   }

   protected void E() {
      z var1;
      try {
         var1 = this.N.h();
      } catch (IOException var3) {
         bh.a((byte)2, 1479757366, (Throwable)var3);
         var1 = null;
      }

      if (bh.a(var1) == 0) {
         this.a((byte)9);
      } else {
         this.b(var1);
      }

   }

   protected void F() {
      this.z.w();
      this.r = false;
   }

   protected void G() {
      this.q.a(this.d ? this.g().a((short)19) : null);
   }

   protected void H() {
   }

   protected void I() {
      boolean var1 = false;
      switch(this.M.E()) {
      case 30:
         var1 = false;
         break;
      case 31:
         var1 = true;
      }

      this.N.a((byte)16, var1);
      boolean var2 = false;
      switch(this.L.E()) {
      case 30:
         var2 = false;
         break;
      case 31:
         var2 = true;
      }

      this.N.a((byte)14, var2);
      String var3 = null;
      switch(this.K.E()) {
      case 26:
         var3 = "pt";
         break;
      case 27:
         var3 = "ms";
         break;
      case 28:
         var3 = "de";
         break;
      case 29:
         var3 = "en";
      }

      String var4 = this.N.c((byte)0);
      if (var4 == null) {
         var4 = this.g().b();
      }

      if (!var3.equals(var4)) {
         this.N.a((byte)0, var3);
         this.a(this.g().a((short)35), this.g().a((short)25), 1);
      } else {
         this.M();
      }

   }

   protected void J() {
      ad var5 = this.g();
      String var6 = var5.a((short)24);
      this.a[0].a(var6);
      this.a[1].a(this.N.c((byte)1) + "\n" + var5.a((short)37) + "\n");
      this.v();
      this.b(this.c);
      this.a[1].d(true);
      this.O = 3;
   }

   protected void K() {
      String var1 = this.N.c((byte)0);
      if (var1 == null) {
         var1 = this.g().b();
      }

      if (var1.equals("en")) {
         this.K.p(0);
      } else if (var1.equals("de")) {
         this.K.p(1);
      } else if (var1.equals("ms")) {
         this.K.p(2);
      } else if (var1.equals("pt")) {
         this.K.p(3);
      }

      boolean var2 = true;
      if (this.N.c((byte)14) != null) {
         var2 = this.N.a((byte)14);
      }

      if (var2) {
         this.L.p(0);
      } else {
         this.L.p(1);
      }

      boolean var3 = true;
      if (this.N.c((byte)16) != null) {
         var3 = this.N.a((byte)16);
      }

      if (var3) {
         this.M.p(0);
      } else {
         this.M.p(1);
      }

      this.v();
      this.b(this.H);
      this.I.s();
      this.I.d(true);
      this.I.a((byte)5);
      this.I.b();
      this.O = 11;
   }

   protected void b(z var1) {
      s var2 = this.d();
      Object[] var3 = new Object[2];
      this.v();
      this.b(this.m);
      this.l.a(0);
      this.l.s(var1.d() + 1);
      int var4 = 0;

      for(int var5 = var1.d(); var4 < var5; ++var4) {
         ae var6 = (ae)var1.b(var4);
         this.l.a(var4, 0, bh.g(var2.a((short)var6.e, (byte)2, (byte)0)));
         var3[0] = var6.c;
         var3[1] = bh.g(var6.h);
         this.l.a(var4, 1, this.g().a((short)57, (Object[])var3));
         this.l.a(var4, 2, var6);
      }

      this.l.a(var1.d(), 0, bh.g(var2.c((byte)0, (byte)2)));
      this.l.a(var1.d(), 1, this.g().a((short)21));
      this.l.f(false);
      this.l.d(true);
      this.O = 8;
   }

   protected void a(String var1, String var2, int var3) {
      this.y.a(var1);
      this.x.a(var2);
      this.t = var3;
      if ((var3 & 2) != 0) {
         this.s.a((short)53).s();
      } else if ((var3 & 1) != 0) {
         this.s.a((short)56).s();
      } else {
         this.s.h().b(false);
      }

      if ((var3 & 4) != 0) {
         this.w.a((short)54).s();
      } else if ((var3 & 8) != 0) {
         this.w.a((short)55).s();
      } else {
         this.w.h().b(false);
      }

      this.b(this.z);
      this.x.d(true);
      this.r = true;
   }

   protected void L() {
      this.B.a(this.g().a((short)51));
      this.v();
      this.b(this.C);
      this.C.s();
      this.B.d(true);
      this.O = 1;
   }

   protected void M() {
      this.v();
      this.U = false;
      this.b(this.G);
      this.F.d(true);
      this.O = 2;
   }

   protected void N() {
      this.R = null;
      this.S = null;
      this.P.w();
      this.P = null;
      System.gc();
   }

   private void a(int var1) {
      boolean var2 = (this.t & 1) != 0 && var1 == 16;
      boolean var3 = (this.t & 8) != 0 && var1 == 17;
      boolean var4 = (this.t & 2) != 0 && var1 == 16;
      boolean var5 = (this.t & 4) != 0 && var1 == 17;
      switch(this.O) {
      case 1:
         if (var1 == 17 || var1 == 16) {
            this.a((byte)4);
         }
         break;
      case 2:
         if (var2) {
            this.F();
            this.F.d(true);
         }
      case 3:
      case 8:
      case 10:
      default:
         break;
      case 4:
      case 7:
      case 9:
         if (var2) {
            this.F();
            this.e.d(true);
            this.e.b();
         }

         if (var5) {
            this.F();
            this.e.d(true);
         }

         if (var4) {
            try {
               this.N.a((ae)this.l.p(2));
            } catch (IOException var7) {
               bh.a((byte)2, 1479882032, (Throwable)var7);
            }

            this.E();
         }
         break;
      case 5:
         if (var3) {
            this.E.d();
            this.E = null;
            this.M();
            this.a(this.g().a((short)18), this.g().a((short)15), 1);
         }
         break;
      case 6:
         if (var2) {
            this.a(this.g().a((short)18), this.g().a((short)17), 8);
            this.E.e();
            this.O = 5;
         }
         break;
      case 11:
         this.F();
         this.M();
      }

   }

   protected void O() {
      this.E = (new aq(this.i(), this.g(), this.A, false)).a(this.Q);
      this.E.c.a(this);
      (new br(this.E, true)).start();
   }

   private void d(s var1) {
      switch(this.T) {
      case 0:
      case 1:
         if (this.R != null) {
            var1.a(16777215, 0, 0, this.u((byte)0), (int)this.u((byte)1));
            this.R.a(var1, this.u((byte)0) - this.R.b() >> 1, this.u((byte)1) - this.R.a_() >> 1);
         }
         break;
      case 2:
      case 3:
         if (this.S != null) {
            var1.a(0, 0, 0, this.u((byte)0), (int)this.u((byte)1));
            this.S.a(var1, this.u((byte)0) - this.S.b() >> 1, this.u((byte)1) - this.S.a_() >> 1);
         }
      }

      var1.b();
   }

   private void a(byte var1) {
      byte var2;
      boolean var3;
      boolean var4;
      byte var5;
      switch(var1) {
      case 4:
         this.A = (new ae()).b(System.currentTimeMillis()).a(true);
         var2 = 47;
         var3 = true;
         var4 = false;
         this.d = true;
         var5 = 5;
         this.q.a(this.g().a((short)19));
         this.p.p(0);
         this.g.p(0);
         break;
      case 7:
      case 9:
         if (var1 == 7) {
            this.A = (ae)this.l.p(2);
            if (this.A != null) {
               this.A = this.A.c();
            }
         } else {
            this.A = null;
         }

         if (this.A == null) {
            this.A = (new ae()).b(System.currentTimeMillis());
            var4 = false;
            var5 = 5;
            var1 = 9;
         } else {
            var4 = true;
            var5 = 6;
         }

         var2 = 48;
         var3 = false;
         this.d = false;
         break;
      default:
         throw bh.b(1415066958, String.valueOf(var1));
      }

      this.h.a((String)null);
      this.h.p(0);
      this.i.a((String)null);
      this.G();
      this.n.a(var2);
      if (var3) {
         this.f.b(this.j);
      } else {
         this.f.d(this.j);
      }

      if (var4) {
         this.f.b(this.k);
      } else {
         this.f.d(this.k);
      }

      this.v();
      this.b(this.o);
      this.o.s();
      this.e.d(true);
      this.e.a(var5).b();
      this.O = var1;
   }

   private void P() {
      this.v();
      this.b((c)this.P);
      this.T = 0;
      this.P.a(false).F();
      this.d(true);
      this.O = 0;
   }

   private boolean Q() {
      System.gc();
      this.A.a(this.h.b()).b(this.i.b()).a(a(this.q.b()) ? 0 : Integer.parseInt(this.q.b()));
      byte var1;
      if (this.A.d) {
         byte var2 = 0;
         byte var3 = 0;
         switch(this.p.E()) {
         case 38:
            var3 = 0;
            break;
         case 39:
            var3 = 1;
         }

         switch(this.g.E()) {
         case 40:
            var2 = 0;
            break;
         case 41:
            var2 = 1;
         }

         this.A.b(var3, var2);
         this.A.b(System.currentTimeMillis());
         if ((var1 = this.A.e()) == 0) {
            this.O = 5;
            this.a(this.g().a((short)18), this.g().a((short)17), 8);
            this.O();
         }
      } else if ((var1 = this.A.d()) == 0) {
         this.O = 5;
         this.a(this.g().a((short)18), this.g().a((short)17), 8);
         this.O();
      }

      if (var1 != 0) {
         byte var4;
         byte var5;
         switch(var1) {
         case -7:
            var4 = 11;
            var5 = 6;
            break;
         case -6:
            var4 = 8;
            var5 = 7;
            break;
         case -5:
            var4 = 9;
            var5 = 6;
            break;
         case -4:
            var4 = 10;
            var5 = 6;
            break;
         case -3:
            var4 = 12;
            var5 = 5;
            break;
         case -2:
            var4 = 13;
            var5 = 5;
            break;
         case -1:
            var4 = 14;
            var5 = 5;
            break;
         default:
            bh.a((byte)1, 1113213490, (String)String.valueOf(var1));
            var4 = -1;
            var5 = -1;
         }

         this.h.a(this.A.c);
         this.a(this.g().a((short)18), this.g().a(var4), 1);
         this.e.a(var5);
      }

      return true;
   }

   private void R() {
      if (this.T == 0 && this.P.a()) {
         this.T = 1;
         this.f((int)3000);
      }

      if (this.T == 1 && this.P.b()) {
         this.T = 2;
         this.P.F();
      }

      if (this.T == 2 && this.P.a()) {
         this.T = 3;
         this.f((int)5000);
      }

   }
}
