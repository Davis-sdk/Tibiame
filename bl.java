import java.io.DataInputStream;
import java.io.IOException;

public final class bl extends h implements cl {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final c F;
   private final b G;
   private final c H;
   private final by I;
   private final ch J;
   private final b K;
   private final cm L;
   private final b M;
   private final bw N;
   private final ck O;
   private final ck P;
   private final ck Q;
   private final by R;
   private final b S;
   private final at T;
   private final cm U;
   private final c V;
   private final ck W;
   private final by X;
   private final b Y;
   private final c Z;
   private final w aa;
   private final b ab;
   private final by ac;
   private final c ad;

   public bl(ay var1) {
      h.u = true;
      this.b(true, true).a(true, true).c(true, true);

      x var2;
      try {
         var2 = (new x(new DataInputStream(var1.a((int)1, "ui128x128.dat")))).a((short)0, (ao)(new bf())).a((short)12, (c)super.a);
         this.b(var2.a());
      } catch (IOException var5) {
         throw bh.a(1262891846, (Throwable)var5);
      }

      this.a((byte)1, (c)var2.a((short)31).w().b(true));
      this.a((byte)0, (c)var2.a((short)32).w().b(true));
      this.a((byte)4, (c)var2.a((short)3).w().b(true));
      this.a((byte)2, (c)var2.a((short)58).w().b(true));
      this.a((byte)5, (c)var2.a((short)13).w().b(true));
      this.a((byte)6, (c)var2.a((short)50).w().b(true));
      this.a((byte)7, (c)var2.a((short)51).w().b(true));
      this.a(var2, (short)43, (short)57, (short)56, (short)55, (short)53, (short)54, (short)47, (short)48, (short)49, (short)45, (short)44, (short)46);
      this.a(var2, (short)33, (short)17, (short)15, (short)16, (short)11, (short)14, (short)10, (short)9);
      this.a((az)var2.a((short)67));
      this.a((cm)var2.a((short)21), (cm)var2.a((short)20), (cm)var2.a((short)22), (cm)var2.a((short)23));
      this.Q = (ck)var2.a((short)26);
      this.Q.a((cl)this);
      this.O = (ck)var2.a((short)24);
      this.O.a((cl)this);
      this.P = (ck)var2.a((short)25);
      this.P.a((cl)this);
      this.ad = var2.a((short)60);
      this.ad.a((cl)this);
      this.T = (at)var2.a((short)29);
      this.T.a((cl)this);
      this.F = var2.a((short)0);
      this.F.a((cl)this);
      this.G = (b)var2.a((short)1);
      this.G.a((cl)this);
      this.a(this.R = (by)var2.a((short)27).w(), false).a((af)this);
      this.S = (b)var2.a((short)28);
      this.S.a((cl)this);
      h.y = (b)var2.a((short)30);
      h.y.a((cl)this);
      this.N = (bw)var2.a((short)19);
      this.M = (b)var2.a((short)66);
      this.a(this.I = (by)var2.a((short)4), false).a((af)this);
      this.H = var2.a((short)2);
      this.K = (b)var2.a((short)6);
      (this.J = (ch)var2.a((short)5)).F().a(this);
      this.aa = new w(var2.a((short)35), var2.a((short)34));
      this.ab = (b)var2.a((short)41);
      this.Y = (b)var2.a((short)40);
      this.Y.a((cl)this);
      this.U = (cm)var2.a((short)36);
      this.U.a((af)this);
      byte[] var3 = new byte[9];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = (byte)(var4 + 5);
      }

      this.U.a(var3);
      this.Z = var2.a((short)42);
      this.V = var2.a((short)37);
      this.a(this.X = (by)var2.a((short)39), true).a((af)this);
      this.W = (ck)var2.a((short)38);
      this.L = (cm)var2.a((short)8);
      this.L.a((cl)this.aa);
      this.L.h().w();
      this.L.a((af)this);
      this.ac = this.a((by)var2.a((short)52), true);
      this.ac.a((af)this);
      super.l = (ck)var2.a((short)63);
      super.l.a((cl)this);
      super.m = (ck)var2.a((short)62);
      super.m.a((cl)this);
      super.n = (ck)var2.a((short)59);
      super.n.a((cl)this);
      super.o = (ck)var2.a((short)61);
      super.o.a((cl)this);
      super.p.a((byte)1, (byte)2);
      super.p.a((int)40, (int)87, 0, 0);
      super.p.r(0).s(4).t(1).u(1);
      super.p.b(-2);
      super.t.b((c)super.p);
      super.q.a((byte)0, (byte)2);
      super.q.a((int)59, (int)87, 0, 0);
      super.q.r(1).s(4).t(4).u(1);
      super.q.b(-2);
      super.t.b((c)super.q);
      this.N.a(true);
   }

   public boolean F(byte var1) {
      return true;
   }

   public boolean T() {
      return this.N.E();
   }

   public void E(byte var1) {
      if (var1 == 0) {
         h.c(this.E(), 0);
      } else if (var1 == 1) {
         h.c(this.a((int)0), 0);
      } else if (var1 == 2) {
         h.c(this.T, 0);
      }

   }

   public void a(Object var1, e var2) {
      super.a(var1, var2);
      ci var3 = this.a();
      short var4 = this.a().f().a;
      byte var5;
      int var6;
      int var10;
      switch(var2.a) {
      case 4000:
         if (this.a((byte)4).d() == 0) {
            this.H.h((int)0).w();
         }

         this.H.b(this.a(var2).b((int)0, this.H.c()));
         this.H.t();

         do {
            c var14 = this.H.h((int)0);
            if (var14.q((byte)1) + var14.u((byte)1) > this.H.t((byte)1)) {
               break;
            }

            var14.w();
            this.H.d(0, Integer.MAX_VALUE);
         } while(this.H.c() > 0);

         for(int var15 = 0; var15 < this.H.c(); ++var15) {
            this.H.h(var15).b((int)0, var15);
         }

         this.H.d(0, Integer.MAX_VALUE);
         break;
      case 4002:
         ch var9;
         switch(var2.d(0)) {
         case 0:
         case 4:
            var9 = this.J;
            break;
         case 5:
            var9 = super.f;
            break;
         default:
            throw bh.c(1380275764);
         }

         var3.b(var9.b());
         break;
      case 4006:
         if (var2.c(0)) {
            h.b((c)this.S.a(this.g().a((short)1)), (int)0);
         } else if (bh.a((Object)this.S.b(), this.g().a((short)1))) {
            h.a((c)this.S, (int)0);
         }
         break;
      case 4007:
         if (var4 == 6015) {
            this.d(this.a(var2, false), 8000);
         } else if (var4 == 6003) {
            h.b((c)this.Z.v().b(this.a(var2, false)), (int)8000);
         }
         break;
      case 4010:
         this.f(var2);
         break;
      case 4011:
         this.L.a((int)var2.d(0), (short)this.d().c((short)(var2.d(1) * 256 + (var2.d(2) & 255))));
         break;
      case 4012:
         byte var8 = var2.d(0);
         cm var12 = this.a(var8, (short)var2.e(0));
         if (!var2.c(1) && !var12.p() && var4 == 6015) {
            h.b((c)var12, (int)5000);
         }

         if (ci.e((int)var8)) {
            this.U.a(var8 - 0, this.d().c((short)var2.e(0)));
         }
         break;
      case 4013:
         if ((this.N.b() || this.N.E()) && ci.g) {
            this.a().c((short)6015).a((Object)this.F()).e();
            this.N.F();
            ci.g = false;
         }
         break;
      case 4014:
         byte var13 = var2.d(0);
         if (this.I() && !var2.c(1)) {
            boolean var7 = var3.a((short)5004);
            switch(var13) {
            case 0:
               if (var7) {
                  h.b((c)this.Q, (int)8000);
               }
               break;
            case 1:
            default:
               throw bh.b(1263874126, String.valueOf(var13));
            case 2:
               if (var7) {
                  h.b((c)this.P, (int)8000);
               }
               break;
            case 3:
            case 4:
            case 5:
               h.b((c)this.ad, (int)8000);
               h.b((c)this.b(), (int)8000);
            }
         }
         break;
      case 4015:
         if (var3.a((short)5004)) {
            h.b((c)this.O, (int)8000);
         }
         break;
      case 4019:
         h.A = var2.c() - 2;
         h.B = 0;
         super.D = var2.g(0);
         h.C = new String[var2.c() - 1];

         for(var10 = 0; var10 < var2.c() - 1; ++var10) {
            h.C[var10] = var2.g(var10 + 1);
         }

         h.b((c)h.y.a(h.C[0]), (int)0);
         h.y.d(true);
         h.E = this.O();
         break;
      case 4024:
         var10 = var2.e(0);
         if (!var3.c().a()) {
            if ((var10 & 8) != 0) {
               h.b((c)super.m, (int)8000);
            }

            h.b((c)super.l, (int)4000);
            h.b((c)super.n, (int)4000);
            h.b((c)super.o, (int)4000);
         } else {
            if ((var10 & 8) != 0) {
               super.m.f((int)8000);
            }

            super.l.f((int)4000);
            super.n.f((int)4000);
            super.o.f((int)4000);
         }
         break;
      case 5000:
         var5 = var2.d(0);
         var6 = var2.e(0);
         if (var5 == 14) {
            this.d(var2);
         } else if (var5 == 17) {
            this.e(var2);
         } else if (ci.e(var5)) {
            if (var4 == 6015) {
               h.b((c)this.a((byte)var6, true).d(true), (int)0);
               h.b((c)this.G.a(this.g().a(ci.a(var5))), (int)0);
            } else if (b(var4)) {
               this.U.a(var6);
               h.b((c)this.U, (int)5000).d(true);
            }
         } else if (ci.d(var5)) {
            this.W();
            this.L.a(var6);
            this.L.d(true);
         }
         break;
      case 5001:
         var5 = ((e)var2.f(0)).d(0);
         if (ci.e(var5)) {
            if (var4 == 6015) {
               var6 = var2.c(0) ? 0 : 2000;
               h.a((c)this.G, (int)var6);
               h.a((c)this.b(), (int)var6);
               h.a((c)this.E(), (int)var6);
               h.a((c)this.a((int)0), (int)var6);
            } else if (b(var4)) {
               this.W();
            }
         }
         break;
      case 5002:
         var5 = var2.d(0);
         if (var5 != 0 && var5 != 1) {
            if (var5 == 6) {
               if (var3.c().a()) {
                  if (var2.c() > 1) {
                     super.d.b(this.ac.h());
                     h.a(var2, this.ac);
                     if (this.ac.G() > 1) {
                        var6 = this.ac.E() * 3 / 2;
                     } else {
                        var6 = this.ac.E() + 1;
                     }

                     this.ac.h().c((int)-1, var6);
                     this.ac.d(true);
                  } else {
                     this.ac.I();
                     this.ac.h().w();
                  }
               } else {
                  this.g(var2);
               }
            } else if (var5 == 2) {
               h.a(var2, this.I);
               this.I.s().d(true);
            } else if (var5 == 4) {
               c var11 = this.X.h();
               var11.c((int)0, 0);
               h.a(var2, this.X);
               this.X.d(true);
               if (var2.c() - 1 >= 3) {
                  var11.c((int)0, ((this.X.u((byte)1) << 1) + 2) / 3);
               }
            }
         } else {
            if (var5 == 1) {
               h.z = true;
            }

            this.g(var2);
         }
         break;
      case 5003:
         var5 = ((e)var2.f(0)).d(0);
         if (var5 != 0 && var5 != 1) {
            if (var5 == 6) {
               if (var3.c().a()) {
                  this.ac.d(false);
                  this.ac.I();
               } else {
                  this.R.I();
                  this.V();
               }
            } else if (var5 == 2) {
               this.I.I();
               h.b((c)this.H, (int)0);
            }
         } else {
            if (var5 == 1 && h.z) {
               h.z = false;
               h.a((c)h.y, (int)0);
            }

            this.R.I();
            this.V();
         }
         break;
      case 5005:
         var5 = var2.d(0);
         switch(var5) {
         case 0:
         case 4:
            this.a((e)var2, (b)null, (ch)this.J, (b)null);
            return;
         case 5:
            this.a(var2, super.g, super.f, super.h);
            return;
         default:
            return;
         }
      case 6001:
      case 6008:
         this.K.a(this.b(var2));
         h.b((c)this.H, (int)0);
         break;
      case 6003:
         this.a(this.c(var2), this.a(this.L, var2).h());
         break;
      case 6005:
         switch(var2.e(0)) {
         case 6001:
         case 6008:
            h.a((c)this.H, (int)0);
            h.a((c)this.J, (int)0);
            return;
         case 6002:
         case 6004:
         case 6005:
         case 6006:
         case 6007:
         case 6009:
         case 6011:
         case 6012:
         case 6013:
         default:
            return;
         case 6003:
            h.a((c)this.Z.v(), (int)0);
            return;
         case 6010:
            h.a((c)this.G, (int)0);
            h.a((c)this.b(), (int)0);
            h.a((c)this.E(), (int)0);
            h.a((c)this.a((int)0), (int)0);
            return;
         case 6014:
            h.a((c)this.M, (int)0);
            this.N.F();
            return;
         }
      case 6014:
         if (!this.a().d) {
            this.N.G();
         }

         h.a((c)this.M, (int)0);
         break;
      case 6015:
         this.X.I();
         this.K();
      }

   }

   public void a(c var1, byte var2) {
      if (var2 == 1) {
         h.e(var1).b(!var1.p());
      }

   }

   protected void a(String var1, short var2, boolean var3, boolean var4) {
      if (var1 == null) {
         h.a((c)this.M, (int)0);
         h.a((c)this.S, (int)0);
         h.a((c)this.Y, (int)0);
      } else {
         b var5 = this.U();
         var5.a(var1);
         if (var4) {
            h.a((c)var5, (int)0);
            var5.f((int)4000);
         } else {
            h.b((c)var5, (int)(var3 ? 5000 : 0));
         }
      }

   }

   protected void a(s var1) {
      this.Q.b(var1.a((int)14));
      this.O.b(var1.a((int)15));
      short var2 = var1.a((int)12);
      this.P.b(var2);
      this.W.b(var2);
      h.a((c)this.E(), (int)0);
      h.a((c)this.a((int)0), (int)0);
      h.a((c)this.T, (int)0);
      h.a((c)this.G, (int)0);
      h.a((c)this.S, (int)0);
      h.a((c)this.H, (int)0);
      h.a((c)this.J, (int)0);
      h.a((c)this.U, (int)0);
      h.a((c)this.Y, (int)0);
      h.a((c)this.Z, (int)0);
      h.b((c)this.ad, (int)10000);
      h.b((c)this.b(), (int)10000);
      h.b((c)this.Q, (int)10000);
      h.b((c)this.O, (int)10000);
      h.b((c)this.P, (int)10000);
      h.b((c)super.l, (int)10000);
      h.b((c)super.m, (int)10000);
      h.b((c)super.n, (int)10000);
      h.b((c)super.o, (int)10000);
   }

   private static boolean b(short var0) {
      return var0 == 6003;
   }

   private b U() {
      b var1;
      switch(this.a().f().a) {
      case 6001:
      case 6004:
      case 6007:
      case 6008:
      case 6009:
      case 6010:
      case 6011:
      case 6012:
      case 6015:
         var1 = this.S;
         break;
      case 6002:
      case 6014:
         var1 = this.M;
         break;
      case 6003:
         var1 = this.Y;
         break;
      case 6005:
      case 6006:
      case 6013:
      default:
         throw bh.c(942691634, String.valueOf(this.a().f().a));
      }

      return var1;
   }

   private void V() {
      h.a((c)this.F.v(), (int)0);
   }

   private void W() {
      h.a((c)this.Y, (int)0);
      h.a((c)this.Z, (int)0);
      h.a((c)this.U, (int)0);
   }

   private void d(c var1, int var2) {
      h.b(this.F.v().b(var1), var2);
   }

   private void a(String var1, c var2) {
      this.W();
      this.ab.a(var1);
      if (var2 != null) {
         this.V.v().b(var2);
         h.b((c)var2, (int)0);
      }

   }

   private void g(e var1) {
      h.a(var1, this.R);
      this.d(this.R, 0);
      if (!h.z) {
         this.R.d(true);
      }

   }

   protected void M() {
      this.R.d(true);
   }

   protected void N() {
      if (this.R.k()) {
         h.a((c)this.R, (int)0);
      }

   }
}
