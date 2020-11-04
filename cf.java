import java.io.DataInputStream;
import java.io.IOException;

public final class cf extends h implements cl {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final b G;
   private final b H;
   private final c I;
   private final by J;
   private final ch K;
   private final b L;
   private final c M;
   private final b N;
   private final by O;
   private final b P;
   private final b Q;
   private final c R;
   private final at S;
   private final cm T;
   private final bw U;
   private final c V;
   private final b W;
   private final w X;
   private int Y = -1;
   private int Z;
   private int aa;
   private String ab;
   private boolean ac;
   private c ad;
   public static bj F;

   public cf(ay var1) {
      this.b(true, true).a(true, true).c(true, true);
      this.O = this.a(new by(), true);
      this.O.a((af)this);
      this.O.c(true, true).a((byte)1, (byte)1);
      (this.P = (new ak()).a(8925952)).b(true, true).c(true, true);

      x var2;
      try {
         var2 = (new x(new DataInputStream(var1.a((int)1, "ui176x208.dat")))).a((short)0, (ao)(new bf())).a((short)11, (c)super.a);
         this.b(var2.a());
      } catch (IOException var4) {
         throw bh.a(1498960693, (Throwable)var4);
      }

      this.a((byte)1, (c)var2.a((short)30).w().b(true));
      this.a((byte)0, (c)var2.a((short)27).w().b(true));
      this.a((byte)4, (c)var2.a((short)3).w().b(true));
      this.a((byte)2, (c)var2.a((short)50).w().b(true));
      this.a((byte)5, (c)var2.a((short)12).w().b(true));
      this.a((byte)6, (c)var2.a((short)43).w().b(true));
      this.a((byte)7, (c)var2.a((short)44).w().b(true));
      this.a(var2, (short)36, (short)49, (short)48, (short)47, (short)45, (short)46, (short)40, (short)41, (short)42, (short)38, (short)37, (short)39);
      this.a(var2, (short)31, (short)16, (short)14, (short)15, (short)10, (short)13, (short)9, (short)8);
      this.a((az)var2.a((short)60));
      this.a((cm)var2.a((short)1), (cm)var2.a((short)0), (cm)var2.a((short)17), (cm)var2.a((short)18));
      this.G = (b)var2.a((short)21);
      this.G.a((cl)this);
      h.y = (b)var2.a((short)29);
      h.y.a((cl)this);
      this.H = (b)var2.a((short)59);
      this.V = var2.a((short)34);
      this.W = (b)var2.a((short)35);
      this.T = (cm)var2.a((short)7);
      this.T.a((af)this);
      this.U = (bw)var2.a((short)20);
      this.R = var2.a((short)55).w();
      this.Q = (b)var2.a((short)54).w();
      this.N = (b)var2.a((short)26);
      this.S = (at)var2.a((short)28);
      this.M = var2.a((short)25);
      this.M.a((cl)this);
      this.I = var2.a((short)2);
      this.J = this.a((by)var2.a((short)4), true);
      this.J.a((af)this);
      this.L = (b)var2.a((short)6);
      this.K = (ch)var2.a((short)5);
      this.K.F().a(this);
      super.l = (ck)var2.a((short)56);
      super.l.s();
      super.m = (ck)var2.a((short)53);
      super.m.s();
      super.n = (ck)var2.a((short)51);
      super.n.s();
      super.o = (ck)var2.a((short)52);
      super.o.s();
      super.r = (bj)var2.a((short)23);
      super.s = (bj)var2.a((short)24);
      super.p.a((byte)1, (byte)2);
      super.p.a((int)4, (int)0, 0, 4);
      super.t.h().b((c)super.p);
      super.q.a((byte)2, (byte)2);
      super.q.a((int)0, (int)0, 4, 4);
      super.t.h().b((c)super.q);
      this.X = new w(var2.a((short)33), var2.a((short)32));
      this.T.a((cl)this.X);
      this.T.w();
      this.M.b(this.R);
   }

   public boolean F(byte var1) {
      if (var1 == 0) {
         return !this.E().p();
      } else if (var1 == 1) {
         return !this.a((int)0).p();
      } else {
         return var1 == 2 && !this.S.p();
      }
   }

   public boolean T() {
      return this.U.E();
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
         this.S.s();
      }

   }

   public void a(Object var1, e var2) {
      super.a(var1, var2);
      ci var3 = this.a();
      boolean var9;
      switch(var2.a) {
      case 4000:
         byte var8 = 4;

         while(this.I.c() >= var8) {
            this.I.i((int)0);
         }

         for(int var11 = 0; var11 < this.I.c(); ++var11) {
            this.I.h(var11).b((int)0, var11);
         }

         this.I.b(this.a(var2).b((int)0, var8 - 1)).t().d(0, Integer.MAX_VALUE);
         break;
      case 4002:
         switch(var2.d(0)) {
         case 0:
         case 4:
            var3.b(this.K.b());
            return;
         default:
            return;
         }
      case 4006:
         if (var2.c(0)) {
            this.G.a(this.g().a((short)1)).s().f((int)0);
         } else if (bh.a((Object)this.G.b(), this.g().a((short)1))) {
            this.G.h().b(false);
         }
         break;
      case 4007:
         switch(var3.f().a) {
         case 6003:
         case 6015:
            this.h(var2);
            return;
         default:
            return;
         }
      case 4010:
         this.f(var2);
         break;
      case 4011:
         this.T.a((int)var2.d(0), (short)this.d().c((short)(var2.d(1) * 256 + (var2.d(2) & 255))));
         break;
      case 4012:
         this.a(var2.d(0), (short)var2.e(0));
         break;
      case 4013:
         if ((this.U.b() || this.U.E()) && ci.g) {
            this.a().c((short)6015).a((Object)this.F()).e();
            this.U.F();
            ci.g = false;
         }
         break;
      case 4014:
         switch(var2.d(0)) {
         case 0:
            this.aa = var2.e(0);
            var9 = true;
            break;
         case 2:
            this.Z = var2.e(0);
            var9 = true;
            break;
         default:
            var9 = false;
         }

         if (var9 && !var2.c(1)) {
            this.X();
         }
         break;
      case 4015:
         if (this.Y < 0) {
            this.W();
         }

         this.Y = var2.e(0);
         var9 = true;
         this.X();
         break;
      case 4017:
         h.a(this.K);
         break;
      case 4018:
         if (var2.e(0) > 0) {
            F.a("ManaCooldownBar");
         } else {
            F.a("ManaBar");
         }
         break;
      case 4019:
         h.A = var2.c() - 2;
         h.B = 0;
         super.D = var2.g(0);
         h.C = new String[var2.c() - 1];

         for(int var10 = 0; var10 < var2.c() - 1; ++var10) {
            h.C[var10] = var2.g(var10 + 1);
         }

         h.b((c)h.y.a(h.C[0]), (int)0);
         h.y.d(true);
         h.E = this.O();
         break;
      case 5000:
         int var4 = var2.e(0);
         byte var5 = var2.d(0);
         if (var5 == 14) {
            this.d(var2);
         } else if (var5 == 17) {
            this.e(var2);
         } else if (ci.e(var5)) {
            this.a((byte)var4, true).d(true);
            this.a((short)4161, this.g().a(ci.a(var5)));
         } else {
            if (var5 == 8 || var5 == 6) {
               this.T.a(var4);
               this.T.d(true);
            }

            this.a((short)4161, this.g().a(ci.a(var5)));
         }
         break;
      case 5001:
         if (var2.e(0) == 6015) {
            this.V();
         }
         break;
      case 5002:
         switch(var2.d(0)) {
         case 0:
         case 1:
         case 4:
         case 6:
            if (var2.d(0) == 1) {
               h.z = true;
            }

            this.g(var2);
            if (var2.d(0) == 1) {
               h.y.d(true);
            }

            return;
         case 2:
            h.a(var2, this.J);
            this.J.d(true);
            return;
         case 3:
         case 5:
         default:
            return;
         }
      case 5003:
         e var6 = (e)var2.f(0);
         switch(var6.d(0)) {
         case 0:
         case 1:
         case 4:
         case 5:
            if (var6.d(0) == 1 && h.z) {
               h.z = false;
               h.a((c)h.y, (int)0);
            }

            this.O.I();
            this.W();
            return;
         case 2:
            this.J.I();
            this.I.s();
            this.K.d(true);
            return;
         case 3:
         default:
            return;
         case 6:
            if (var3.c().a()) {
               this.O.d(false);
            } else {
               this.W();
            }

            return;
         }
      case 5005:
         byte var7 = var2.d(0);
         switch(var7) {
         case 0:
         case 4:
            this.a((e)var2, (b)null, (ch)this.K, (b)null);
            return;
         case 5:
            this.a(var2, super.g, super.f, super.h);
            return;
         default:
            return;
         }
      case 6001:
      case 6008:
         this.I.s();
         this.K.s();
         this.L.a(this.b(var2));
         break;
      case 6003:
         this.a(this.T, var2);
         this.W.a(this.c(var2));
         this.V.v().b((c)this.T).s();
         this.a(this.T, (byte)3);
         this.E().s();
         break;
      case 6005:
         switch(var2.e(0)) {
         case 6001:
         case 6008:
            this.K.a((String)null);
            this.W();
            return;
         case 6002:
         case 6004:
         case 6005:
         case 6006:
         case 6007:
         case 6013:
         default:
            return;
         case 6003:
            this.W();
            return;
         case 6009:
         case 6010:
         case 6011:
         case 6012:
            this.W();
            return;
         case 6014:
            this.U.F();
            this.H.h().b(false);
            return;
         }
      case 6014:
         this.d(true);
         if (!this.a().d) {
            this.U.G();
         }
         break;
      case 6015:
         this.K();
         this.d(true);
         if (this.G.b() == null) {
            h.a((c)this.G, (int)0);
         }
      }

   }

   protected void M() {
      this.O.d(true);
   }

   protected void N() {
      if (this.O.k()) {
         h.a((c)this.O, (int)0);
      }

   }

   public void a(c var1, byte var2) {
      if (var2 == 1) {
         if (var1 == this.M && var1.p()) {
            this.V();
         } else if (var1 == this.G) {
            if (this.G.p()) {
               this.G.h().b(false);
            } else {
               this.G.s();
            }
         }
      }

   }

   protected void a(String var1, short var2, boolean var3, boolean var4) {
      if (var1 == null) {
         this.V();
         this.G.f((int)0);
         this.G.h().b(false);
         this.H.h().b(false);
      } else {
         switch(var2) {
         case 6001:
         case 6002:
         case 6004:
         case 6007:
         case 6008:
         case 6009:
         case 6010:
         case 6011:
         case 6012:
         case 6015:
            this.G.a(var1);
            if (var4) {
               this.G.h().b(false);
               this.G.f((int)4000);
            } else {
               this.G.s().f(var3 ? 5000 : 0);
            }
            break;
         case 6003:
            this.a((short)4148, var1);
         case 6005:
         case 6006:
         case 6013:
         default:
            break;
         case 6014:
            this.H.a(var1).s();
         }
      }

   }

   protected void a(s var1) {
      this.E((byte)0);
      this.W();
   }

   protected boolean z(byte var1) {
      return !super.z(var1) && this.ad != null && this.ac && this.V();
   }

   private void U() {
      if (this.ad == null && this.M.c() > 0) {
         this.ad = this.M.h((int)0);
         this.ac = this.ad.n();
         this.ab = this.N.b();
      }

   }

   private boolean V() {
      if (this.ad != null) {
         this.M.v().b(this.ad);
         if (this.ac) {
            this.ad.d(true);
         }

         this.N.a(this.ab);
         this.ad = null;
         this.ab = null;
         return true;
      } else {
         return false;
      }
   }

   private void g(e var1) {
      this.ad = null;
      this.N.a(var1.g(0));
      h.a(var1, this.O);
      this.M.f((int)0).v().b((c)this.O);
      this.O.d(true);
   }

   private void a(short var1, String var2) {
      this.U();
      this.N.a(this.g().a(var1));
      this.M.v().b((c)this.P.a(var2));
      this.P.s();
      this.M.f((int)5000);
   }

   private void h(e var1) {
      this.U();
      this.N.a(this.g().a((short)4162));
      this.M.v().b(this.a(var1, false));
      this.M.s();
      if (this.M.p((byte)1) > 0) {
         this.M.v().b(this.a(var1, true));
      }

      this.M.f((int)5000);
   }

   private void W() {
      this.ad = null;
      this.N.a(this.g().a((short)4130));
      this.M.f((int)0).v();
      this.M.b(this.R);
      this.R.s();
      if (this.M.p((byte)0) > 0 || this.M.p((byte)1) > 0) {
         this.R.w();
         this.M.b((c)this.Q);
      }

   }

   private void X() {
      String var1 = this.g().a((short)4115, (Object[])(new Object[]{bh.g(this.aa).toString(), bh.g(this.Z).toString(), bh.g(this.Y).toString()}));
      this.Q.a(var1);
   }
}
