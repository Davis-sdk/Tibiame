import java.io.IOException;
import java.util.NoSuchElementException;

public class ci implements bm, m, o, r {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   public static ci a;
   public static final byte[] b = new byte[]{1, 0, -1, 0, 1};
   private static final byte[] i = new byte[]{10, 11, 14, 13, 12, 15, 9};
   private final bi j;
   private final e k;
   private final short[] l = new short[16];
   private final byte[] m = new byte[2];
   private final byte[] n;
   private final an[][] o;
   private final z p = new z(16);
   private final z q = new z(2);
   private final z r;
   private final bo s;
   public final ay c;
   private final co t;
   private final e u;
   private final bq v;
   private boolean w;
   private cb x;
   private byte y;
   private boolean z;
   private y A;
   private e B;
   private e C;
   private boolean D;
   private String E;
   private String F;
   private short G;
   private boolean H;
   private int I;
   private int J;
   private int K;
   private int L;
   private j M;
   private ae N;
   private boolean O;
   private int P;
   private boolean Q;
   private volatile byte R;
   private int S;
   private int T;
   private boolean U;
   private String V;
   private bv W;
   private ad X;
   private an Y;
   public boolean d = false;
   public boolean e = false;
   private boolean Z = false;
   public static boolean f = false;
   public static boolean g = false;
   public static int h = 0;

   public ci(ad var1, co var2, bq var3) {
      this.q.a((Object)(new e()));
      this.q.a((Object)(new e()));
      this.r = new z(2);
      this.u = new e();
      this.u.a(0, 1, 32);
      this.k = new e();
      this.k.a(2, 1, 16);
      this.k.a((short)5004, (r)null);
      this.G = -1;
      this.X = var1;
      this.J = -1;
      this.K = -1;
      this.H = false;
      this.w = false;
      this.t = var2;
      this.c = var2.c();
      this.U = this.c.a((byte)14);
      an var4 = new an(-2, var1.a((short)0), -1);
      an var5 = new an(-2, var1.a((short)4157), 4);
      this.o = new an[6][];
      this.o[0] = new an[]{new an(49, var1.a((short)4154), 4)};
      this.o[1] = new an[]{new an(0, var1.a((short)4140), 5), new an(1, var1.a((short)4141), 6), new an(2, var1.a((short)4142), 7), new an(3, var1.a((short)4146), 8), new an(4, var1.a((short)4144), 9), new an(5, var1.a((short)4145), 10), new an(6, var1.a((short)4143), 11), new an(7, var1.a((short)4147), 12), new an(8, var1.a((short)4148), 13), new an(10, var1.a((short)4149), 14), new an(9, var1.a((short)4150), 15), new an(12, var1.a((short)4151), -1), new an(11, var1.a((short)22), 4), var4};
      this.Y = this.o[1][10];
      this.o[2] = new an[]{new an(91, var1.a((short)4135), 15), new an(93, var1.a((short)4136), 17), new an(92, var1.a((short)4137), 14), var4};
      this.o[3] = new an[]{new an(90, var1.a((short)4138), 15), new an(93, var1.a((short)4139), 17), var4};
      this.o[4] = new an[]{new an(60, var1.a((short)4155), 5), new an(61, var1.a((short)4156), 6), new an(63, var1.a((short)4159), 15), new an(62, var1.a((short)4158), 14), var5};
      this.o[5] = new an[]{new an(30, var1.a((short)4105), 5), new an(35, var1.a((short)4116), 6), new an(31, var1.a((short)4118), 7), new an(33, var1.a((short)4117), 8), new an(39, var1.a((short)4103), 9), var4};
      this.n = new byte[18];
      a = this;
      this.v = var3;
      this.v.a(this);
      this.j = new bi(this);
      this.s = new bo(this);
      this.v.b(this.p);
   }

   public void a() {
      this.o[1][10] = new an(94, this.X.a((short)4104), 15);
   }

   public cb b() {
      synchronized(this) {
         return this.x;
      }
   }

   public ci a(cb var1) {
      synchronized(this) {
         if (this.x != null) {
            this.x.b((bm)this);
            this.x.c();
         }

         this.x = var1;
         if (this.x != null) {
            this.x.a((bm)this);
         }

         return this;
      }
   }

   public bi c() {
      return this.j;
   }

   public bq d() {
      return this.v;
   }

   public final e e() {
      return this.k.a == 5004 ? null : this.k;
   }

   public final e f() {
      return this.u;
   }

   public final ci a(ae var1) {
      this.N = var1;
      return this;
   }

   public final ci a(y var1) {
      this.A = var1;
      return this;
   }

   public final ci a(e var1, e var2) {
      this.B = var1;
      this.C = var2;
      return this;
   }

   public final ci a(String var1) {
      this.V = var1;
      return this;
   }

   public static int a(int var0) {
      return (var0 - 0) % 3;
   }

   public static int b(int var0) {
      return (var0 - 0) / 3;
   }

   public static int c(int var0) {
      if (var0 != 10 && var0 != 14 && var0 != 12) {
         if (var0 != 11 && var0 != 13 && var0 != 15) {
            throw bh.b(893668935);
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   public static int d(int var0) {
      if (var0 != 10 && var0 != 11) {
         if (var0 != 14 && var0 != 13) {
            if (var0 != 12 && var0 != 15) {
               throw bh.b(894910776);
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   public static byte a(boolean var0, int var1, int var2) {
      if (var0) {
         return (byte)(0 + var2 * 3 + var1);
      } else {
         int var3 = (var2 << 1) + var1;
         switch(var3) {
         case 0:
            return 10;
         case 1:
            return 11;
         case 2:
            return 14;
         case 3:
            return 13;
         case 4:
            return 12;
         case 5:
            return 15;
         default:
            throw bh.b(910307928);
         }
      }
   }

   public static short a(byte var0) {
      if (var0 != 6 && var0 != 7) {
         if (var0 != 8 && var0 != 9) {
            if (var0 == 0) {
               return 4140;
            } else if (var0 == 2) {
               return 4142;
            } else if (var0 == 1) {
               return 4141;
            } else {
               return (short)(var0 == 5 ? 4143 : -1);
            }
         } else {
            return 4156;
         }
      } else {
         return 4155;
      }
   }

   public static int b(byte var0) {
      return -b[var0 + 1];
   }

   public static int c(byte var0) {
      return -b[var0];
   }

   public static boolean e(int var0) {
      return bh.b(var0, 0, 8);
   }

   public static boolean d(byte var0) {
      return var0 == 6 || var0 == 8;
   }

   public static boolean f(int var0) {
      return !e(var0) && var0 != 9;
   }

   public static boolean e(byte var0) {
      return var0 == 1 || var0 == 2 || var0 == 5 || var0 == 0 || var0 == 7 || var0 == 9;
   }

   public final void g() {
      this.k();
      if (this.e() != null) {
         if (this.a((short)5005)) {
            this.b((String)null);
         } else {
            this.a((int)-1, true);
         }
      }

      switch(this.u.a) {
      case 6000:
      case 6001:
      case 6008:
         this.j();
         break;
      case 6003:
      case 6015:
         this.c((short)6014).e();
         this.j();
      }

   }

   public final void a(int var1, boolean var2) {
      this.k();
      if (this.a((short)5000) || this.a((short)5002)) {
         int var5 = this.a((short)5000) ? 5001 : 5003;
         e var3 = this.c((short)var5);
         var3.b(this.u.a).a((Object)(new e(this.k.a)).a(this.k)).a((Object)this.u);
         an var4 = this.k.a == 5002 && var1 != -1 ? (an)this.k.f(var1 + 1) : null;
         byte var6 = this.k.d(0);
         if (var1 == -1 || var4 != null && var4.b == -2) {
            this.k.a((short)5004, (r)null);
            var3.a(true);
            var3.e();
            if (var5 == 5003) {
               this.b(var6, var2);
            } else {
               this.m(var6);
            }

            this.c((short)4020).e();
         } else if (var4 != null) {
            this.k.a((short)5004, (r)null);
            var3.a(false);
            var3.e();
            this.a(var4, var6);
         } else {
            byte var7 = this.k.d(0);
            this.k.a((short)5004, (r)null);
            var3.a(false);
            var3.e();
            this.a(var1, var7);
         }

      }
   }

   public int f(byte var1) {
      if (var1 == 4) {
         return 10;
      } else if (var1 == 0) {
         return 40;
      } else if (var1 == 5 && this.u.a == 6009) {
         return this.u.e(1);
      } else if (var1 == 1) {
         return 100;
      } else if (var1 == 2) {
         return 32;
      } else if (var1 == 3) {
         return 16;
      } else {
         throw bh.b(910378058);
      }
   }

   public final boolean a(short var1) {
      return this.k.a == var1;
   }

   public final boolean b(short var1) {
      return this.u.a == var1;
   }

   public final boolean a(short var1, short var2) {
      return this.b(var1) && this.a(var2);
   }

   public final void b(String var1) {
      this.k();
      if (this.a((short)5005)) {
         this.E = var1;
         byte var3 = this.k.d(0);
         e var2 = this.c((short)5006);
         var2.a(var1 == null).b(this.u.a).a((Object)(new e(this.k.a)).a(this.k)).a((Object)this.u);
         this.k.a((short)5004, (r)null);
         var2.e();
         if (var1 != null) {
            this.a(var1, var3);
         } else {
            this.n(var3);
         }

         this.z = false;
      }
   }

   public final boolean g(byte var1) {
      return var1 == 2 || var1 == 5 && this.b((short)6009) && this.u.c(2);
   }

   public final boolean h(byte var1) {
      boolean var2 = this.n[var1] != 0;
      byte[] var10000 = this.n;
      var10000[var1] &= -3;
      return var2;
   }

   public final boolean i(byte var1) {
      return var1 == 5 && this.b((short)6009) && this.u.c(0) || var1 == 1;
   }

   public final boolean j(byte var1) {
      return var1 == 5 && this.b((short)6009) && this.u.c(1) || var1 == 3;
   }

   public void g(int var1) {
      if (this.W == null) {
         this.W = this.v.F();
         this.M = this.W.b();
      }

      if (this.v.G()) {
         this.a((cb)null);
      }

      boolean var2;
      if (this.R == 0) {
         this.s();
         if (!this.v.T()) {
            if (this.Q) {
               this.Q = false;
               this.b(this.u);
            }

            this.b().a((byte)1);
         }

         if (this.S > 0) {
            this.S -= var1;
            if (this.S <= 0) {
               this.S = 0;
               this.n();
            }
         }

         if (this.U && this.T > 0 && (this.T -= var1) <= 0) {
            this.h();
            return;
         }

         var2 = this.M.d == this.W.a || this.M.e == this.W.a || this.M.f == this.W.a || this.M.g == this.W.a;
         if (var2 != this.D && !this.M.t()) {
            this.D = var2;
            this.c((short)4006).a(this.D).e();
         }
      } else if ((this.R & 2) != 0) {
         while(!this.Z) {
            this.b().a((byte)1);
         }

         var2 = (this.R & 4) == 0;
         if (var2) {
            this.b().a((short)3038).a((Object)this.j.a).a((byte)0).e();
         } else {
            this.N.a(System.currentTimeMillis());

            try {
               this.c.b(this.N);
            } catch (IOException var4) {
               bh.a((byte)1, 1127625045, (Throwable)var4);
            }

            this.b().a((short)3038).a((Object)this.j.a).a((byte)1).e();
         }

         this.R = 0;
      }

      if (this.s.d) {
         bo var10000 = this.s;
         var10000.e -= var1;
         if (this.s.e <= 0) {
            this.s.e = 60000;
            this.a((short)8192, true, false);
         }
      }

   }

   public void h() {
      this.a((cb)null);
      this.v.H();
   }

   public boolean l(int var1) {
      short var2 = this.u.a;
      if (var2 == 6015 || var2 == 6001 || var2 == 6008) {
         byte[] var10000 = this.n;
         var10000[var1] = (byte)(var10000[var1] | 3);
      }

      switch(var2) {
      case 6001:
      case 6008:
         int var5 = var2 == 6001 ? 2 : 3;
         if (var1 == 16) {
            this.a((an)this.o[var5][0], (byte)2);
            return true;
         }

         an var4;
         if ((var4 = an.a(this.o[var5], (byte)var1)) != null) {
            this.a((an)var4, (byte)2);
            return true;
         }
      case 6002:
      case 6003:
      case 6005:
      case 6006:
      case 6013:
      default:
         break;
      case 6004:
         this.i(var1);
         return true;
      case 6007:
         if (var1 == 4 || var1 == 17) {
            this.m();
            return true;
         }
         break;
      case 6009:
      case 6010:
      case 6011:
      case 6012:
         if (var1 == 17 && this.k.a == 5004) {
            this.j.d();
         }
         break;
      case 6014:
         if (var1 == 4 || var1 == 17) {
            if (this.M.g()) {
               this.o();
            } else {
               this.t();
            }

            return true;
         }
         break;
      case 6015:
         if (var1 == 16) {
            if (this.e() == null) {
               this.q();
               return true;
            }
         } else {
            if (var1 == 4 || var1 == 17) {
               if (this.j.c()) {
                  this.j.d();
               } else {
                  this.t();
               }

               return true;
            }

            if (this.e() == null) {
               an var3;
               if ((var3 = an.a(this.o[1], (byte)var1)) != null) {
                  this.a((an)var3, (byte)0);
                  return true;
               }

               if ((var3 = an.a(this.o[5], (byte)var1)) != null) {
                  this.a((an)var3, (byte)0);
                  return true;
               }
            }
         }
      }

      return false;
   }

   public final boolean m(int var1) {
      if (this.w) {
         this.H = true;
         this.w = false;
      }

      byte[] var10000 = this.n;
      var10000[var1] &= -2;
      if ((this.u.a != 6015 || this.k.a != 5004) && this.u.a != 6001) {
         var10000 = this.n;
         var10000[var1] &= -3;
      }

      return false;
   }

   public final boolean a(char var1) {
      if (this.b((short)6015)) {
         this.c((short)6001).a((Object)null).e();
         this.v.c(var1);
         return true;
      } else {
         return false;
      }
   }

   public void a(Object var1, e var2) {
      this.j.a(var1, var2);
      this.s.a(var1, var2);
      aa var3;
      int var4;
      switch(var2.a) {
      case 2002:
         if (this.M.e() != null) {
            e var5 = this.a((short)4160, (byte)1, 0);

            for(var4 = 0; var4 < var2.c(); ++var4) {
               var5.a((Object)(new an(40 + var4, var2.g(var4), 5 + var4)));
            }

            var5.a((Object)this.o[0][0]).e();
         }
         break;
      case 2003:
         this.F = var2.g(0);
         this.a(this.M, true, false, this.F, var2.g(1));
         break;
      case 2004:
         this.F = var2.g(0);
         this.a(this.M, false, true, this.F, var2.g(1));
         break;
      case 2008:
         var3 = this.W.b(var2.d(0));
         this.W.a(var3.m());
         if (this.M.d() == var3) {
            this.M.a((aa)null);
         }

         this.c((short)4001).e();
         break;
      case 2009:
         this.c((short)6003).a(var2).e();
         break;
      case 2018:
         byte var6 = 0;

         for(var4 = 0; var4 < 32; var4 += 2) {
            this.b(var6, (short)(var2.d(var4) << 8 | var2.d(var4 + 1) & 255), true);
            ++var6;
         }

         return;
      case 2019:
         this.W.k();
         this.M.a(true);
         this.W.a(var2.a());
         this.j();
         this.k.a = 5004;
         if (this.j.a()) {
            this.j.d();
         }
         break;
      case 2020:
         this.a((int)4, (int)var2.e(0), true);
         this.a((int)5, (int)var2.e(1), true);
         this.a((int)0, (int)var2.e(4), true);
         this.a((int)2, (int)var2.e(5), true);
         this.c((short)4018).b(var2.e(6)).e();
         this.c((short)4015).b(var2.e(2)).b(var2.e(3)).e();
         this.c((short)4024).b(var2.e(7)).e();
         break;
      case 2021:
         this.c((short)4018).a(var2).e();
         break;
      case 2022:
         this.a(var2.g(0), true, false);
         break;
      case 2023:
         this.W.a((d)(new t((byte)(var2.d(2) - 1), var2.d(0), var2.d(1))));
         break;
      case 2025:
         if (this.M.e() != null) {
            this.a((int)-1, true);
         }
         break;
      case 2026:
         if (this.M.g()) {
            this.M.d(false);
            this.M.a((byte)2, false);
            this.j();
         }
         break;
      case 2027:
         var3 = this.W.b(var2.d(0));
         var3.b(var2.d(1));
         this.W.b(var3);
         var3.a(var2.d(1), false);
         this.c((short)4001).e();
         break;
      case 2029:
         this.c((short)4007).a(var2).e();
         break;
      case 2031:
         this.b().a((short)3030).e();
         break;
      case 2033:
         var3 = this.W.b(var2.d(0));
         var3.a(var2.d(1), true);
         break;
      case 2034:
         this.W.a((byte)var2.e(0), var2.a());
         this.c((short)4023).b(var2.e(0)).e();
         break;
      case 2036:
         this.W.a(var2.d(0), var2.d(1), var2.a(), 2);
         break;
      case 2037:
         aa var7 = this.W.b(var2.d(0));
         byte var8 = var7.s();
         var7.a(var8, var7.n(), (short)var2.e(0), var2.d(1));
         break;
      case 2039:
         this.W.b(var2.d(0)).c(var2.d(1));
         break;
      case 2040:
         this.a(var2.d(0), (short)(var2.d(1) << 8 | var2.d(2) & 255), false);
         break;
      case 2041:
         this.b(var2.d(0), (short)(var2.d(1) << 8 | var2.d(2) & 255), false);
         break;
      case 2042:
         var3 = this.W.b(var2.d(0));
         var3.b(var2.d(1), var2.d(2));
         this.W.b(var3);
         var3.a(var2.d(3), false);
         var3.a(var2.d(4), var2.g(0), (short)var2.e(0), var2.d(5));
         this.c((short)4001).e();
         break;
      case 2043:
         this.W.a(var2.d(0), var2.d(1), (short)(var2.d(2) << 8 | var2.d(3) & 255));
         this.c((short)4005).e();
         break;
      case 2045:
         var3 = this.W.b(var2.d(0));
         var3.b(var2.d(1), var2.d(2));
         this.W.b(var3);
         var3.a(var2.d(3), false);
         this.c((short)4001).e();
         break;
      case 2046:
         this.M.a(var2.e(0), var2.e(1), (byte)var2.e(2));
         this.c((short)4013).a(var2).e();
         this.b().a((short)3039).e();
         break;
      case 2047:
         this.a((int)var2.d(0), (int)var2.e(0), false);
         break;
      case 2052:
         this.a(var2.g(0), true, false);
         break;
      case 2053:
         var3 = this.W.b(var2.d(0));
         this.a(var3, false, false, var3.n(), var2.g(0));
         if (this.M.e() == var3) {
            this.M.u();
         }
         break;
      case 2054:
         if (this.M.e() != null) {
            this.c((short)4019).a(var2).e();
         }
         break;
      case 2055:
         this.W.a((d)(new bt(var2.g(0), var2.d(2), var2.d(0) * this.W.d() + this.W.e(), var2.d(1) * this.W.d())));
         break;
      case 2056:
         this.k();
         this.M.a((byte)1, this.N.c, (short)var2.e(0), var2.d(0));
         this.b(var2);
         break;
      case 2057:
         this.m[var2.d(0) - 101] = var2.d(5);
         this.c((short)4026).a(var2).e();
         break;
      case 2058:
         this.c((short)4027).a(var2).e();
         break;
      case 2059:
         this.c((short)4021).a(var2).e();
         break;
      case 2060:
         this.c((short)4022).a(var2).e();
         break;
      case 2063:
         this.M.a(var2.d(0), true);
         break;
      case 2064:
         this.c((short)4024).a(var2).e();
         break;
      case 2066:
         this.c((short)4015).b(var2.e(0)).b(var2.e(1)).e();
         break;
      case 2067:
         this.W.a(var2.e(0), var2.e(1), var2.d(0), var2.g(0));
         this.c((short)4025).a(var2).e();
         break;
      case 2068:
         this.x.a((short)3049).e();
         this.Z = true;
         break;
      case 2070:
         this.o();
         break;
      case 2074:
         this.c((short)4028).a(var2).e();
         break;
      case 8004:
         if (!this.b((short)6007) && (!this.b((short)6004) || this.u.d(0) != 7)) {
            if (!this.b((short)6002)) {
               this.c((short)6007).e();
               this.a((short)15, false, false);
               this.S = 4000;
               this.e = true;
            }
         } else {
            this.h();
         }
      }

   }

   public final e c(short var1) {
      e var2;
      switch(var1) {
      case 5000:
      case 5002:
      case 5005:
         var2 = this.k;
         break;
      case 6000:
      case 6001:
      case 6002:
      case 6003:
      case 6004:
      case 6007:
      case 6008:
      case 6009:
      case 6010:
      case 6011:
      case 6012:
      case 6014:
      case 6015:
         this.G = this.u.a;
         var2 = this.u;
         break;
      default:
         try {
            var2 = (e)this.q.c();
         } catch (NoSuchElementException var4) {
            throw bh.a(1177826105, (Throwable)var4);
         }

         this.r.a((Object)var2);
      }

      return var2.a(var1, this);
   }

   public final void b(e var1) {
      if (var1 == this.u && var1.a != 6010) {
         if (this.v.T()) {
            this.Q = true;
            return;
         }

         if (this.e() != null) {
            this.a((int)-1, true);
         }

         this.c((short)6005).b(this.G).e();
      }

      if (var1.a == 4002) {
         this.z = true;
      } else if (var1.a == 5005) {
         this.E = null;
      }

      int var2 = 0;

      for(int var3 = this.p.d(); var2 < var3; ++var2) {
         ((bm)this.p.b(var2)).a(this, var1);
      }

      if (var1.a == 6005) {
         switch(var1.e(0)) {
         case 6003:
            if (this.u.a != 6003) {
               this.o();
            }
            break;
         case 6004:
            this.y = 3;
            break;
         case 6014:
            this.S = 0;
         }
      } else if (var1.a == 6014) {
         this.S = 2000;
      } else if (var1.a == 6003) {
         this.j((int)0);
      } else if (var1.a == 6001) {
         this.a((short)-1, (byte)0, (String)null);
      } else if (var1.a == 6008) {
         this.a((short)-1, (byte)4, this.F);
      } else if (var1.a == 6002) {
         this.d = false;
         this.a((short)4133, false, false);
         this.S = 4000;
      } else if (var1.a == 6015) {
         if (this.O) {
            this.O = false;
            this.l();
         }

         if (this.V != null) {
            this.a((byte)2, (short)36, this.V, 2, -1);
            this.V = null;
         }
      } else if (var1.a == 6004) {
         this.y = var1.d(0);
      } else if (var1.a == 4024) {
         var2 = var1.e(0);
         if ((var2 & 32) != 0) {
            this.s.d = true;
            this.a();
         } else {
            this.s.d = false;
         }
      }

      if (this.r.b(var1)) {
         this.r.d(var1);
         this.q.a((Object)var1);
      }

   }

   public final void a(e var1) {
      this.R = 1;

      try {
         this.a((cb)null);
         this.Z = false;
         f = true;
         bh.f(7000);
         if ((this.R & 8) != 0) {
            return;
         }

         try {
            if (this.t.a(var1.g(0), var1.g(1))) {
               this.R = (byte)(this.R | 4);
            }
         } catch (Throwable var7) {
            bh.a((byte)2, 1448365363, (Throwable)var7);
         }

         if ((this.R & 8) == 0) {
            try {
               cb var2 = new cb(this.t.a(this.A), this.t.c());
               this.a(var2);
               if ((this.R & 8) != 0) {
                  this.a((cb)null);
                  return;
               }

               var2.a(this.B.a).a(this.B).e();
               var2.a(this.C.a).a(this.C).e();
               if (!var2.d() || var2.a((int)1) != null) {
                  this.a((cb)null);
               }

               this.j();
               f = false;
            } catch (Exception var8) {
            }

            return;
         }
      } finally {
         this.R = (byte)(this.R | 2);
         if ((this.R & 4) == 0) {
            this.a(this.X.a((short)8194), true, false);
         }

      }

   }

   protected final void h(int var1) {
      this.c((short)4004).b(var1).e();
   }

   protected final boolean a(byte var1, boolean var2) {
      if ((var1 == 0 || var1 == 1 || var1 == 2 || var1 == 5) && (this.m[0] != 0 || this.m[1] != 0)) {
         return true;
      } else if (var1 == 0) {
         if (!this.W.j()) {
            if (var2) {
               this.a((short)4120, true, false);
            }

            return false;
         } else {
            return true;
         }
      } else if (var1 != 1 && var1 != 2 && var1 != 5) {
         if (var1 != 6 && var1 != 7 && var1 != 8 && var1 != 9) {
            if (var1 == 16) {
               return true;
            } else {
               return var1 == 14 && this.b((short)6011);
            }
         } else {
            return this.b((short)6003);
         }
      } else {
         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.l[var3] != 0) {
               return true;
            }
         }

         return false;
      }
   }

   protected final e a(short var1, byte var2, int var3) {
      return this.a(this.v.a(var1), var2, var3);
   }

   protected final e a(String var1, byte var2, int var3) {
      return this.c((short)5002).a(var2).b(var3).a((Object)var1);
   }

   protected final void i(int var1) {
      boolean var3 = var1 == 17;
      boolean var5 = this.u.e(1) != -1;
      boolean var2 = var1 == 16 || var3 && !var5;
      boolean var4 = this.u.e(0) != -1;
      if (var2 && var4) {
         if (this.y == 2) {
            this.j();
         } else if (this.y == 7) {
            if (this.e) {
               this.h();
            } else {
               this.c((short)6007).e();
               this.a((short)1, false, false);
               this.S = 10000;
               this.b().a((short)3031).e();
               this.e = true;
            }
         }
      } else if (var3 && var5) {
         if (this.y == 9) {
            this.R = (byte)(this.R | 8);
            this.a((cb)null);
            this.a((byte)9, (short)4118, (short)1, -1, -1);
         } else if (this.y != 10 && this.y != 11) {
            if (this.y == 7) {
               this.j();
            }
         } else {
            this.j();
            this.m();
         }
      }

   }

   protected final void a(an var1, byte var2) {
      if (var2 == 6) {
         this.j.a(var1.b, false);
      } else if (var1.b == 0) {
         this.k((byte)0);
      } else if (var1.b == 1) {
         this.k((byte)1);
      } else if (var1.b == 2) {
         this.k((byte)2);
      } else if (var1.b == 3) {
         this.v.E((byte)0);
      } else if (var1.b == 4) {
         this.v.E((byte)1);
      } else if (var1.b == 5) {
         this.v.E((byte)2);
      } else if (var1.b == 6) {
         this.k((byte)5);
      } else if (var1.b == 7) {
         this.c((short)6001).a((Object)null).e();
      } else if (var1.b == 8) {
         this.c((short)6008).e();
      } else if (var1.b == 10) {
         this.j.e();
      } else if (var1.b == 9) {
         this.j.f();
      } else if (var1.b == 12) {
         this.j.g();
      } else if (var1.b == 11) {
         this.t();
      } else if (var1.b == 35) {
         this.l();
      } else if (var1.b == 94) {
         this.o[1][10] = this.Y;
         this.s.d = false;
         this.x.a((short)3025).b(0).a((Object)"").b(20).e();
      } else {
         String var3;
         if (var1.b == 91) {
            if (this.E == null) {
               this.c((short)4002).a((byte)0).e();
            }

            var3 = this.E.trim();
            if (var3.length() > 0) {
               String var4 = this.u.g(0);
               this.a(var4 == null ? this.M : null, false, false, this.M.n(), var3);
               this.b().a((short)3042).a((Object)var4).a((Object)var3).e();
            }

            this.a((short)-1, (byte)0, (String)null);
         } else if (var1.b == 90) {
            if (this.E == null) {
               this.c((short)4002).a((byte)4).e();
            }

            var3 = this.E.trim();
            if (var3.length() > 0) {
               this.c((short)6001).a((Object)var3).e();
            } else {
               this.a((short)-1, (byte)4, var3);
            }
         } else if (var1.b == 92) {
            if (this.E == null) {
               this.c((short)4002).a((byte)0).e();
            }

            this.c((short)4017).e();
            this.a((short)-1, (byte)0, this.E);
         } else if (var1.b == 93) {
            this.g();
         } else if (var1.b == 60) {
            this.k((byte)6);
         } else if (var1.b == 61) {
            this.k((byte)9);
         } else {
            byte var5;
            if (var1.b == 62) {
               if (this.u.a == 6003) {
                  var5 = (byte)(this.u.e(0) + 1);
                  this.x.a((short)3050).a(var5).e();
               }
            } else if (var1.b == 63) {
               if (this.u.a == 6003) {
                  var5 = (byte)(this.u.e(0) - 1);
                  this.x.a((short)3050).a(var5).e();
               }
            } else if (bh.b(var1.b, 40, 49)) {
               if (this.M.e() != null) {
                  this.M.e().u();
               }

               this.a(this.M, false, false, this.M.n(), var1.c);
               if (var1.b == 49) {
                  this.b().a((short)3017).a((byte)0).e();
                  e var6 = this.c((short)5003);
                  var6.b(this.u.a).a((Object)(new e(this.k.a)).a(this.k)).a((Object)this.u);
                  this.k.a((short)5004, (r)null);
                  var6.a(true);
                  var6.e();
                  this.a(this.M, false, false, this.M.n(), this.o[0][0].c);
                  this.M.b((aa)null);
               } else {
                  this.b().a((short)3017).a((byte)(var1.b - 40 + 1)).e();
                  this.i();
                  this.c((short)4020).e();
               }
            }
         }
      }

   }

   protected final void i() {
      this.a((e)this.a((short)4160, (byte)1, 0), (byte)0, 0).e();
   }

   protected final void j() {
      this.c((short)6015).a((Object)this.W).e();
      this.k.a((short)5004, (r)null);
   }

   protected final void k() {
      this.T = 300000;
   }

   protected void a(aa var1, boolean var2, boolean var3, String var4, String var5) {
      int var6;
      if (var2) {
         var6 = 16777215;
      } else if (var3) {
         var6 = 4259839;
      } else {
         var6 = 16776960;
      }

      if (var1 != null) {
         var1.a(var4 + ":\n" + var5, var6, (byte)2, 0);
      }

      this.c((short)4000).a((Object)var4).a((Object)var5).e();
   }

   protected final void a(byte var1, short var2, short var3, int var4, int var5) {
      this.a(var1, var2, this.v.a(var3), var4, var5);
   }

   protected final void a(byte var1, short var2, String var3, int var4, int var5) {
      this.a(var1, this.v.a(var2), var3, var4, var5);
   }

   protected final void a(byte var1, String var2, String var3, int var4, int var5) {
      this.s.a();
      this.c((short)6004).a(var1).b(var4).b(var5).a((Object)var2).a((Object)var3).e();
   }

   protected final int a(String var1, boolean var2, boolean var3) {
      ++this.L;
      int var4 = this.L;
      this.c((short)4003).a(var2).a(var3).b(var4).a((Object)var1).e();
      return var4;
   }

   protected final int a(short var1, boolean var2, boolean var3) {
      return this.a(this.v.a(var1), var2, var3);
   }

   protected final void l() {
      if (this.a((short)6015, (short)5004)) {
         String var1 = "";
         if (this.s.a == 0) {
            var1 = var1 + this.v.a((short)4114);
            var1 = var1 + "\n";
            switch(this.s.b) {
            case 0:
               var1 = var1 + this.v.a((short)4112);
               break;
            case 1:
               var1 = var1 + this.v.a((short)4111);
               break;
            case 2:
               var1 = var1 + this.v.a((short)4110);
            }
         } else {
            var1 = var1 + this.v.a((short)4113);
            var1 = var1 + "\n";
            if (this.s.b == 2) {
               var1 = var1 + this.v.a((short)4110);
               var1 = var1 + "\n";
               var1 = var1 + this.v.a((short)4107);
            } else {
               var1 = var1 + this.s.a + " ";
               var1 = var1 + (this.s.a == 1 ? this.v.a((short)4108) : this.v.a((short)4109));
               var1 = var1 + "\n";
               if (this.s.a > 10) {
                  var1 = var1 + this.v.a((short)4107);
               } else {
                  var1 = var1 + this.v.a((short)4111);
               }
            }
         }

         this.c((short)4009).a((Object)var1).e();
      } else {
         this.O = true;
      }

   }

   protected final void m() {
      this.a((byte)7, (short)49, (short)(this.b((short)6007) ? 4121 : 4122), 0, 1);
   }

   protected final void n() {
      if (this.u.a == 6014) {
         this.a((short)1, false, false);
      } else if (this.u.a == 6007 || this.u.a == 6002) {
         this.h();
      }

   }

   protected final void a(byte var1, short var2, boolean var3) {
      if (this.b((short)6003)) {
         this.u.a(var1 * 2, (byte)(var2 >> 8));
         this.u.a(var1 * 2 + 1, (byte)(var2 & 255));
      }

      this.c((short)4011).a(var1).a((byte)(var2 >> 8)).a((byte)(var2 & 255)).a(var3).e();
   }

   protected final void b(byte var1, short var2, boolean var3) {
      if (this.l[var1] != var2) {
         this.l[var1] = var2;
         this.c((short)4012).a(var1).a(var3).b(var2 & '\uffff').e();
      }

   }

   protected final void a(int var1, int var2, boolean var3) {
      if (var1 == 0) {
         this.I = var2;
      }

      this.c((short)4014).a((byte)var1).a(var3).b(var2).e();
      if (var1 == 4 && var2 <= 0) {
         this.r();
      }

   }

   void k(byte var1) {
      if (this.a(var1, true)) {
         e var2 = this.c((short)5000).a(var1);
         int var3 = 0;
         boolean var4;
         if (!e(var1)) {
            if (d(var1)) {
               var4 = var1 == 8;
               int var5 = 0;

               for(int var6 = this.u.b(); var5 < var6; var5 += 2) {
                  boolean var7 = this.u.d(var5) * 256 + this.u.d(var5 + 1) == 0;
                  if (var7 == var4) {
                     var3 = var5 / 2;
                     break;
                  }
               }
            }
         } else {
            var4 = var1 == 0 || var1 == 7;
            var3 = this.a(var4);
         }

         var2.b(var3).e();
      }

   }

   void o() {
      this.b().a((short)3019).e();
      if (this.M.g()) {
         this.M.b(this.W.a(), this.W.a() + 1);
         this.M.a((byte)2, false);
      }

   }

   private e a(e var1, byte var2, int var3) {
      int var4 = var3;

      for(int var5 = this.o[var2].length; var4 < var5; ++var4) {
         var1.a((Object)this.o[var2][var4]);
      }

      return var1;
   }

   private byte a(boolean var1) {
      byte var2 = -1;

      for(byte var3 = 0; var3 <= 8; ++var3) {
         boolean var4 = this.l[var3] == 0;
         if (var4 == var1) {
            var2 = var3;
            break;
         }
      }

      if (var2 == -1 || !this.v.D(var2) && !var1) {
         int var6 = 0;

         for(int var7 = i.length; var6 < var7; ++var6) {
            boolean var5 = this.l[i[var6]] == 0;
            if (this.v.D(i[var6]) && var5 == var1) {
               var2 = i[var6];
               break;
            }
         }
      }

      if (var2 == -1) {
         var2 = 0;
      }

      return var2;
   }

   private void l(byte var1) {
      if (this.M.h()) {
         g = false;
         this.k();
         int var2 = b(var1);
         int var3 = c(var1);
         int var4 = this.M.q() + var2;
         int var5 = this.M.r() + var3;
         if (!this.M.a(var1)) {
            return;
         }

         if (this.M.f() && this.M.l() != var1) {
            this.M.c(false);
         }

         this.M.a(var1, false);
         switch(this.W.b(var4, var5)) {
         case 2:
            if (!this.M.f()) {
               var4 = (this.W.c() >> 1) + var2;
               var5 = (this.W.c() >> 1) + var3;
               this.b().a((short)3023).a((byte)var4).a((byte)var5).e();
               this.M.c(true);
               this.a((short)4119, true, false);
            }

            return;
         case 3:
            this.b().a((short)3010).a((byte)var4).a((byte)var5).e();
            this.M.d(true);
            this.c((short)6014).e();
            this.M.b(var1);
            this.W.b(this.M);
            return;
         case 4:
            this.c((short)6014).e();
            this.k.a((short)5004, (r)null);
            g = true;
         default:
            aa var6;
            if ((var6 = (aa)this.W.c(var4, var5)) != null && var6.a()) {
               if (this.K == var6.m()) {
                  this.M.b(var1);
                  this.W.b(this.M);
                  this.b().a((short)3014).a(var1).e();
                  this.c((short)4008).a(var1).e();
                  this.K = -1;
                  return;
               }

               if (var6.s() == 3) {
                  if (this.M.e() != var6 && this.b((short)6015)) {
                     this.M.b(var6);
                     this.a(this.M, false, false, this.M.n(), this.v.a((short)4125));
                     this.b().a((short)3001).a(var6.m()).e();
                     this.K = var6.m();
                     this.i();
                  }

                  return;
               }

               if (var6.s() == 1 && this.H && this.J == var6.m()) {
                  this.M.b(var1);
                  this.W.b(this.M);
                  this.b().a((short)3014).a(var1).e();
                  this.c((short)4008).a(var1).e();
                  this.J = -1;
                  this.H = false;
                  this.w = false;
                  return;
               }

               if (this.M.d() != var6) {
                  this.M.a(var6);
                  this.b().a((short)3002).a(var6.m()).e();
                  this.J = var6.m();
                  this.w = true;
               }

               return;
            }

            if (this.M.f()) {
               this.M.c(false);
            }

            this.M.a((aa)null);
            this.M.b(var1);
            this.W.b(this.M);
            this.J = -1;
            this.K = -1;
            this.H = false;
            this.w = false;
            this.b().a((short)3014).a(var1).e();
            this.c((short)4008).a(var1).e();
         }
      }

   }

   private void r() {
      this.a((int)3, (int)0, true);
      this.a((int)5, (int)0, false);
      this.d = true;
      this.c((short)6014).e();
      this.c((short)6002).e();
   }

   private void m(byte var1) {
      if (var1 != 6 && var1 != 7 && var1 != 8 && var1 != 9) {
         if (var1 == 14) {
            this.j.b((int)-1);
         } else if (var1 == 17) {
            this.j.a((int)-1);
         }
      } else {
         this.j((int)0);
      }

   }

   private void b(byte var1, boolean var2) {
      if (var1 == 1) {
         if (!var2) {
            this.a(this.M, false, false, this.M.n(), this.o[0][0].c);
         }

         this.M.b((aa)null);
         this.b().a((short)3018).e();
      } else if (var1 == 4) {
         this.g();
      } else if (var1 == 2) {
         this.a((short)-1, (byte)(this.b((short)6001) ? 0 : 4), this.E);
      } else if (var1 == 6) {
         this.j.a(-1, var2);
      }

   }

   private void n(byte var1) {
      if (var1 != 0 && var1 != 4) {
         if (var1 == 5) {
            this.j.a((String)null);
         }
      } else {
         this.g();
      }

   }

   private void a(int var1, byte var2) {
      if (var2 != 16) {
         if (this.u.a == 6015) {
            short var3;
            if (var2 == 0) {
               var3 = 3012;
            } else if (var2 == 1) {
               var3 = 3045;
            } else if (var2 == 2) {
               var3 = 3009;
            } else {
               if (var2 != 5) {
                  return;
               }

               var3 = 3022;
            }

            if (var2 != 0 && var1 < this.l.length && this.l[var1] == 0) {
               this.a((short)4126, true, false);
            } else {
               this.b().a(var3).a((byte)var1).e();
            }
         } else if (this.u.a == 6003) {
            if (var2 == 6) {
               this.P = var1;
               this.k((byte)7);
            } else if (var2 == 7) {
               this.b().a((short)3032).a((byte)this.P).a((byte)var1).e();
               this.j((int)0);
            } else if (var2 == 9) {
               if (this.l[var1] == 0) {
                  this.j((int)0);
                  this.a((short)4126, true, false);
               } else {
                  this.P = var1;
                  this.k((byte)8);
               }
            } else if (var2 == 8) {
               this.b().a((short)3040).a((byte)this.P).a((byte)var1).e();
               this.j((int)0);
            }
         } else if (this.u.a == 6011) {
            if (var2 == 14) {
               this.j.b(var1);
            }
         } else if (this.u.a == 6010 && var2 == 17) {
            this.j.a(var1);
         }
      }

   }

   public byte p() {
      return !this.b((short)6010) ? -1 : this.u.d(0);
   }

   private void a(String var1, byte var2) {
      if (var2 != 0 && var2 != 4) {
         if (var2 != 5) {
            throw bh.c(1179858261, String.valueOf(var2));
         }

         this.j.a(var1);
      } else if (!this.z) {
         this.a((e)this.a((short)-1, (byte)2, 0), (byte)(var2 == 0 ? 2 : 3), var1.trim().length() > 0 ? 0 : 1).e();
      }

   }

   private void s() {
      boolean var1;
      if (this.u.a == 6015) {
         var1 = this.e() == null;
      } else {
         var1 = (this.u.a == 6001 || this.u.a == 6008) && (this.e() == null || this.a((short)5005));
      }

      if (var1) {
         boolean var2 = this.h((byte)3);
         boolean var3 = this.h((byte)1);
         boolean var4 = this.h((byte)0);
         boolean var5 = this.h((byte)2);
         if (var2) {
            this.l((byte)3);
         }

         if (var3) {
            this.l((byte)1);
         }

         if (var4) {
            this.l((byte)0);
         }

         if (var5) {
            this.l((byte)2);
         }
      }

   }

   private void j(int var1) {
      switch(this.u.a) {
      case 6003:
         this.a((e)this.a((short)4161, (byte)4, var1), (byte)4, 0).e();
      case 6004:
      case 6005:
      case 6006:
      case 6007:
      case 6008:
      default:
         break;
      case 6009:
      case 6010:
      case 6011:
      case 6012:
         this.j.c(var1).e();
      }

   }

   private void a(short var1, byte var2, String var3) {
      this.c((short)5005).a(var2).a((Object)this.v.a(var1)).a((Object)var3).e();
   }

   protected void q() {
      e var1 = this.a((short)4161, (byte)0, 0);
      if (this.a((byte)0, false)) {
         var1.a((Object)this.o[1][0]);
      }

      if (this.a((byte)1, false)) {
         var1.a((Object)this.o[1][1]);
      }

      if (this.a((byte)2, false)) {
         var1.a((Object)this.o[1][2]);
      }

      if (this.v.F((byte)0)) {
         var1.a((Object)this.o[1][3]);
      }

      if (this.v.F((byte)1)) {
         var1.a((Object)this.o[1][4]);
      }

      if (this.v.F((byte)2)) {
         var1.a((Object)this.o[1][5]);
      }

      if (this.a((byte)5, false)) {
         var1.a((Object)this.o[1][6]);
      }

      for(int var2 = 7; var2 <= 12; ++var2) {
         var1.a((Object)this.o[1][var2]);
      }

      var1.e();
   }

   private void t() {
      this.m();
   }
}
