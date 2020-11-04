import java.io.DataInputStream;
import java.io.IOException;

public final class ab extends h implements cl {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final b F;
   private final cm G;
   private final c H;
   private final b I;
   private final by J;
   private final bw K;
   private final c L;
   private final b M;
   private final b N;
   private final c O;
   private final c P;
   private final by Q;
   private final b R;
   private final ch S;
   private final w T;
   private final by U;
   private final by V;
   private final c W;
   private final c X;
   private final ak Y;
   private final bj Z;
   private int aa;
   private int ab;
   private int ac;
   private final String ad = "Hint";
   private final String ae = "You can use U, H, J, K to walk!";

   public ab(ay var1) {
      this.b(true, true).a(true, true).c(true, true);

      x var2;
      try {
         var2 = (new x(new DataInputStream(var1.a((int)1, "ui240x160.dat")))).a((short)0, (ao)(new bf())).a((short)15, (c)super.a);
         this.b(var2.a());
      } catch (IOException var4) {
         throw bh.a(1515077944, (Throwable)var4);
      }

      this.a((byte)1, (c)var2.a((short)34).w().b(true));
      this.a((byte)0, (c)var2.a((short)31).w().b(true));
      this.a((byte)4, (c)var2.a((short)6).w().b(true));
      this.a((byte)5, (c)var2.a((short)16).w().b(true));
      this.a((byte)6, (c)var2.a((short)47).w().b(true));
      this.a((byte)7, (c)var2.a((short)48).w().b(true));
      this.a(var2, (short)40, (short)54, (short)53, (short)52, (short)50, (short)51, (short)44, (short)45, (short)46, (short)42, (short)41, (short)43);
      this.a(var2, (short)35, (short)20, (short)18, (short)19, (short)14, (short)17, (short)13, (short)12);
      this.a((az)var2.a((short)64));
      this.a((cm)var2.a((short)1), (cm)var2.a((short)0), (cm)var2.a((short)21), (cm)var2.a((short)22));
      this.F = (b)var2.a((short)24);
      this.F.a((cl)this);
      this.G = (cm)var2.a((short)10);
      this.G.a((af)this);
      this.H = var2.a((short)38);
      this.I = (b)var2.a((short)39);
      this.J = this.a((by)var2.a((short)11), true);
      this.J.a((af)this);
      this.K = (bw)var2.a((short)23);
      this.L = var2.a((short)57);
      this.M = (b)var2.a((short)58);
      this.N = (b)var2.a((short)59);
      this.N.a((cl)this);
      this.O = (at)var2.a((short)32);
      this.P = var2.a((short)5);
      this.Q = this.a((by)var2.a((short)7), false);
      this.Q.a((af)this);
      this.R = (b)var2.a((short)9);
      this.S = (ch)var2.a((short)8);
      this.S.F().a(this);
      this.U = this.a((by)var2.a((short)49), true);
      this.U.a((af)this);
      this.V = this.a((by)var2.a((short)29), false);
      this.V.a((af)this);
      this.W = var2.a((short)4);
      this.X = var2.a((short)2);
      this.X.a((cl)this);
      this.Y = (ak)var2.a((short)3);
      this.Y.a((cl)this);
      this.Z = (bj)var2.a((short)28);
      super.r = (bj)var2.a((short)26);
      super.s = (bj)var2.a((short)27);
      super.p.a((byte)1, (byte)2);
      super.p.a((int)4, (int)0, 0, 4);
      super.p.r(3).s(0).t(1).u(3);
      super.t.h().b((c)super.p);
      super.q.a((byte)2, (byte)2);
      super.q.a((int)0, (int)0, 4, 4);
      super.q.r(4).s(0).t(1).u(3);
      super.t.h().b((c)super.q);
      super.l = (ck)var2.a((short)61);
      super.l.s();
      super.m = (ck)var2.a((short)60);
      super.m.s();
      super.n = (ck)var2.a((short)55);
      super.n.s();
      super.o = (ck)var2.a((short)56);
      super.o.s();
      h.y = (b)var2.a((short)33);
      h.y.a((cl)this);
      this.T = new w(var2.a((short)37), var2.a((short)36));
      this.G.a((cl)this.T);
      this.L.c((int)0, this.L.r((byte)1) + ci.h);
      c var3 = this.Z.h().h().h();
      var3.c((int)0, var3.r((byte)1) + ci.h);
   }

   public boolean F(byte var1) {
      if (var1 == 0) {
         return !this.E().p();
      } else if (var1 == 1) {
         return !this.a((int)0).p();
      } else {
         return var1 == 2;
      }
   }

   public boolean T() {
      return this.K.E();
   }

   public void E(byte var1) {
      if (var1 == 0) {
         this.E().s();
         this.a((int)0).b(false);
         this.a((int)1).b(false);
      } else if (var1 == 1) {
         this.a((int)0).s();
         this.a((int)1).s();
         this.E().b(false);
      } else if (var1 == 2) {
         if (!this.O.p()) {
            this.O.s();
            h.a((c)this.L, (int)0);
         } else {
            this.L.s();
            h.a((c)this.O, (int)0);
         }
      }

   }

   public void a(c var1, byte var2) {
      if (var2 == 1) {
         if (var1 == this.N) {
            this.U();
            return;
         }

         h.e(var1).b(!var1.p());
      }

   }

   protected void a(String var1, short var2, boolean var3, boolean var4) {
      if (var1 == null) {
         h.a((c)this.F, (int)0);
      } else {
         this.F.a(var1);
         if (var4) {
            this.F.h().b(false);
            this.F.f((int)4000);
         } else {
            this.F.s().f(var3 ? 5000 : 0);
         }
      }

   }

   protected void M() {
      this.V.d(true);
   }

   protected void N() {
      if (this.V.k()) {
         h.a((c)this.V, (int)0);
      }

   }

   public void a(Object var1, e var2) {
      super.a(var1, var2);
      byte var3;
      int var5;
      switch(var2.a) {
      case 4000:
         this.h(var2);
         break;
      case 4002:
         var3 = var2.d(0);
         switch(var3) {
         case 0:
         case 4:
            this.a().b(this.S.b());
            return;
         case 5:
            this.a().b(super.f.b());
            return;
         default:
            return;
         }
      case 4006:
         if (var2.c(0)) {
            this.F.a(this.g().a((short)1)).s().f((int)0);
         } else if (bh.a((Object)this.F.b(), this.g().a((short)1))) {
            this.F.h().b(false);
         }
         break;
      case 4007:
         h.b((c)this.X.v().b(this.a(var2, false)), (int)4000);
         break;
      case 4009:
         if (h.x && this.aa > 0 && this.aa < 5) {
            this.M.a("Hint");
            this.N.a("You can use U, H, J, K to walk!");
            this.N.f(this.aa > 1 ? 10000 : 20000);
         }
         break;
      case 4010:
         this.f(var2);
         break;
      case 4011:
         this.G.a((int)var2.d(0), (short)this.d().c((short)(var2.d(1) * 256 + (var2.d(2) & 255))));
         break;
      case 4012:
         this.a(var2.d(0), (short)var2.e(0));
         break;
      case 4013:
         if ((this.K.b() || this.K.E()) && ci.g) {
            this.a().c((short)6015).a((Object)this.F()).e();
            this.K.F();
            ci.g = false;
         }
         break;
      case 4014:
         switch(var2.d(0)) {
         case 0:
            this.aa = var2.e(0);
            break;
         case 2:
            this.ab = var2.e(0);
         }

         this.U();
         break;
      case 4015:
         this.ac = var2.e(0);
         this.U();
         break;
      case 4018:
         if (var2.e(0) > 0) {
            this.Z.a("ManaCooldownBar");
         } else {
            this.Z.a("ManaBar");
         }
         break;
      case 4019:
         h.A = var2.c() - 2;
         h.B = 0;
         super.D = var2.g(0);
         h.C = new String[var2.c() - 1];

         for(var5 = 0; var5 < var2.c() - 1; ++var5) {
            h.C[var5] = var2.g(var5 + 1);
         }

         h.b((c)h.y.a(h.C[0]), (int)0);
         h.y.d(true);
         h.E = this.O();
         break;
      case 5000:
         this.i(var2);
         break;
      case 5002:
         var3 = var2.d(0);
         int var4 = var2.e(0);
         switch(var3) {
         case 0:
            for(var5 = 1; var5 < var2.c(); ++var5) {
               an var6 = (an)var2.f(var5);
               if (var6.b == 5) {
                  var6.c = this.O.p() ? this.g().a((short)4130) : this.g().a((short)4145);
                  break;
               }
            }

            h.a((c)this.X, (int)0);
            h.a(var2, this.V);
            h.b((c)this.V, (int)0);
            this.V.d(true);
            return;
         case 1:
            h.z = true;
            h.a(var2, this.V);
            h.b((c)this.V, (int)0);
            return;
         case 2:
            h.a(var2, this.Q);
            this.Q.s().d(true);
            return;
         case 3:
         case 5:
         default:
            return;
         case 4:
            h.a(var2, this.J);
            this.J.d(true);
            return;
         case 6:
            this.g(var2);
            return;
         }
      case 5003:
         var3 = ((e)var2.f(0)).d(0);
         switch(var3) {
         case 0:
            this.V.I();
            h.a((c)this.V, (int)0);
            return;
         case 1:
            if (h.z) {
               h.z = false;
               h.a((c)h.y, (int)0);
            }

            h.a((c)this.V, (int)0);
            return;
         case 2:
            this.Q.I();
            h.b((c)this.P, (int)0);
            return;
         case 3:
         case 5:
         default:
            return;
         case 4:
            this.J.d(false);
            return;
         case 6:
            if (this.a().c().a()) {
               this.U.d(false);
               this.U.I();
            } else {
               this.V.I();
               h.a((c)this.V, (int)0);
            }

            return;
         }
      case 5005:
         var3 = var2.d(0);
         switch(var3) {
         case 0:
         case 4:
            this.a((e)var2, (b)null, (ch)this.S, (b)null);
            return;
         case 5:
            this.a(var2, super.g, super.f, super.h);
            return;
         default:
            return;
         }
      case 6001:
      case 6008:
         this.R.a(this.b(var2));
         h.b((c)this.P, (int)0);
         break;
      case 6003:
         h.a((c)super.t, (int)0);
         this.a(this.G, var2);
         this.I.a(this.c(var2));
         this.H.s();
         break;
      case 6005:
         switch(var2.e(0)) {
         case 6001:
         case 6008:
            h.a((c)this.P, (int)0);
            h.a((c)this.S, (int)0);
            return;
         case 6014:
            this.K.F();
            h.a((c)this.F, (int)0);
            return;
         default:
            return;
         }
      case 6014:
         this.d(true);
         if (!this.a().d) {
            this.K.G();
         }
         break;
      case 6015:
         this.K();
         this.d(true);
         if (this.H.p()) {
            h.a((c)this.H, (int)0);
         }

         if (this.F.b() == null) {
            h.a((c)this.F, (int)0);
         }
      }

   }

   private void U() {
      this.M.a(this.g().a((short)4130));
      String var1 = "\n";
      this.N.a('¾' + bh.a((long)this.aa, 8) + var1 + '¼' + bh.a((long)this.ab, 8) + var1 + '¿' + bh.a((long)this.ac, 8));
   }

   private void g(e var1) {
      if (this.a().c().a()) {
         if (var1.c() > 1) {
            super.d.b(this.U.h());
            super.d.d(true);
            h.a(var1, this.U);
            int var2;
            if (this.U.G() > 1) {
               var2 = this.U.E() * 3 / 2;
            } else {
               var2 = this.U.E() + 1;
            }

            this.U.h().c((int)-1, var2);
            this.U.d(true);
         } else {
            this.U.I();
            this.U.h().w();
         }
      } else {
         h.a(var1, this.V);
         h.b((c)this.V, (int)0);
         this.V.d(true);
      }

   }

   private void h(e var1) {
      if (this.a((byte)4).d() == 0) {
         this.P.h((int)0).w();
      }

      this.P.b(this.a(var1).b((int)0, this.P.c()));
      this.P.t();

      do {
         c var2 = this.P.h((int)0);
         if (var2.q((byte)1) + var2.u((byte)1) > this.P.t((byte)1)) {
            break;
         }

         var2.w();
         this.P.d(0, Integer.MAX_VALUE);
      } while(this.P.c() > 0);

      for(int var3 = 0; var3 < this.P.c(); ++var3) {
         this.P.h(var3).b((int)0, var3);
      }

      this.P.d(0, Integer.MAX_VALUE);
   }

   private void i(e var1) {
      int var2 = var1.e(0);
      byte var3 = var1.d(0);
      if (var3 == 14) {
         this.d(var1);
      } else if (var3 == 17) {
         this.e(var1);
      } else if (ci.e(var3)) {
         this.a((byte)var2, true).d(true);
      } else if (var3 == 8 || var3 == 6) {
         this.G.a(var2);
         this.G.d(true);
      }

   }
}
