import java.io.IOException;
import java.util.Random;

public final class aq implements bm, m {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   public volatile boolean a;
   public volatile String b;
   public ce c;
   public volatile boolean d;
   public volatile y e;
   public e f;
   public e g;
   public volatile String h;
   public volatile String i;
   int j;
   String k;
   byte l;
   byte m;
   private final ae t;
   private final ad u;
   private final ay v;
   private volatile cb w;
   private bk x;
   private int y;
   private boolean z;
   private volatile y[] A;
   private volatile byte B;
   private volatile int C;
   private int D;
   private int E;
   private int F;
   private short G;
   private co H;
   private boolean I;
   private int J;
   private int K;
   private int L;
   private boolean M;
   private volatile int N;
   private boolean O = false;
   public static String n = null;
   private boolean P = false;
   public int o;
   public int[] p;
   public boolean[] q;
   public cd r;
   public int s;
   private boolean Q = false;

   public aq(co var1, ad var2, ae var3, boolean var4) {
      this.P = var4;
      this.H = var1;
      this.u = var2;
      this.t = var3;
      this.v = var1.c();
      this.c = new ce(this);
      this.N = -1;
      this.C = -1;
      this.E = 0;
      this.F = 0;
      this.I = false;
      this.j = Integer.MAX_VALUE;
   }

   public static y[] a() {
      return new y[]{new y("193.47.187.235", 110), new y("193.47.187.236", 110)};
   }

   public cb b() {
      return this.d ? this.w : null;
   }

   public boolean c() {
      synchronized(this) {
         return this.M;
      }
   }

   public aq a(int var1) {
      this.y = var1;
      return this;
   }

   public void d() {
      try {
         if (this.v != null && this.v.d()) {
            this.v.c();
         }
      } catch (IllegalStateException var3) {
         bh.a((byte)1, 1465139784, (Throwable)var3);
      } catch (IOException var4) {
         bh.a((byte)2, 1413890611, (Throwable)var4);
      }

      this.a = true;
      cb var1 = this.w;
      if (var1 != null) {
         var1.b();
      }

      this.e();
   }

   public void e() {
      synchronized(this) {
         this.M = false;
         this.notifyAll();
      }
   }

   public void f() {
      if (this.C != -1) {
         this.v.a((byte)3, this.C);
         this.C = -1;
      }

   }

   public void g() {
      try {
         if (this.A != null) {
            this.v.a(this.A);
         }
      } catch (IOException var2) {
         bh.a((byte)1, 876950088, (Throwable)var2);
      }

      if (this.B != 0) {
         this.v.a((byte)4, this.B);
      }

      this.A = null;
      this.B = 0;
   }

   public void a(Object var1, e var2) {
      int var8;
      int var16;
      int var25;
      switch(var2.a) {
      case 1000:
         if (this.y > 0) {
            bh.f(this.y);
         }

         if (!this.a) {
            this.G = (short)var2.e(0);
            this.l = var2.d(0);
            this.k = String.valueOf(this.l);
            this.m = var2.d(1);
            this.D = this.K = var2.e(1);
            this.J = 0;

            try {
               this.v.j();
               this.z = true;
               this.v.a((int)this.l);
               if (this.E == 0) {
                  this.c.a((short)8003).e();
               }
            } catch (IOException var22) {
               bh.a((byte)2, 809713985, (Throwable)var22);
               this.a(this.u.a((short)63));
            }
         }
         break;
      case 1001:
         if (this.y > 0) {
            bh.f(this.y);
         }

         if (!this.a) {
            var8 = var2.b();
            this.x.a(var2.a(), 0, var8);
            this.L -= var8;
            if (this.L <= 0) {
               try {
                  this.v.c();
               } catch (IOException var20) {
                  bh.a((byte)2, 1381314615, (Throwable)var20);
                  this.a(this.u.a((short)63));
               }

               this.x = null;
               System.gc();
            }

            this.K -= var8;
            if (this.K <= 0) {
               if (!this.i()) {
                  return;
               }

               cd var27 = new cd(this.l, this.m, this.D, this.G);

               try {
                  this.v.a(var27);
               } catch (IOException var19) {
                  bh.a((byte)2, 1313690679, (Throwable)var19);
               }

               if (this.y > 0) {
                  bh.f(this.y);
               }
            } else {
               var25 = 100 - this.K * 100 / this.D;
               if (var25 != this.J) {
                  this.J = var25;
                  this.c.a((short)8002).b(a(var25, this.E, this.F)).e();
               }
            }
         }
         break;
      case 1002:
         y[] var7 = new y[var2.c()];
         var8 = 0;

         for(var25 = var7.length; var8 < var25; ++var8) {
            var7[var8] = (y)var2.f(var8);
         }

         this.A = var7;
         this.B = var2.d(0);
         break;
      case 1003:
         int var4 = var2.e(0);
         String var5 = var2.g(1);
         String var6 = var2.g(0) + "\n" + var5;
         if (var4 != this.n()) {
            this.h = var6;
            this.C = var4;
         } else if (var5.length() != 0) {
            this.h = var5;
         }

         this.w.a((short)3053).a(this.m()).e();
         this.w.a((short)3057).b(this.t.h).e();
         break;
      case 1004:
         if (this.y > 0) {
            bh.f(this.y);
         }

         if (!this.a) {
            this.L = var2.e(0);
            String var24 = var2.g(0);
            if (var24.startsWith("dictionary")) {
               var24 = "dictionary.dat";
            }

            try {
               this.x = this.v.a(this.l, var24, this.L);
            } catch (IOException var21) {
               bh.a((byte)2, 1498825784, (Throwable)var21);
               this.a(this.u.a((short)63));
            }
         }
         break;
      case 1005:
         if (this.k != null) {
            this.c.a((short)8001).e();
         }

         this.N = var2.e(0);
         this.e = (y)var2.f(0);
         this.I = true;
         break;
      case 1006:
         ++this.E;
         this.c.a((short)8002).b(a(0, this.E, this.F)).e();
         var8 = -1;

         for(var25 = 0; var25 < this.q.length; ++var25) {
            if (!this.q[var25]) {
               var8 = var25;
               break;
            }
         }

         if (var8 >= 0) {
            this.q[var8] = true;
            var25 = this.p[var8];
            this.b(var25);
         } else {
            e var26 = this.w.a((short)3052).b(this.t.h);
            var26.e();
         }
         break;
      case 1007:
         int var18 = var2.e(1);
         if (this.t.h != 0) {
            throw bh.a(1346849625, "got world " + this.t.h + ", expected 0");
         }

         this.t.h = var18;
         break;
      case 1010:
         cd[] var9 = (cd[])((cd[])var2.f(0));
         cd[] var10 = (cd[])((cd[])var2.f(1));
         this.o = cd.b(var10, cd.a(var10)).e;
         cd[] var11 = this.a(var9, var10);
         this.s = cd.a(var11);
         int var12 = 0;

         for(int var13 = 0; var13 < this.v.b(); ++var13) {
            if (var12 < this.v.b(var13).c) {
               var12 = this.v.b(var13).c;
            }
         }

         if (this.s < var12) {
            this.s = var12;
         }

         boolean var28 = false;
         this.r = this.v.c((int)3);
         if (this.r == null || this.r.e != this.o) {
            var28 = true;
         }

         int var14 = var11.length;
         if (var28) {
            ++var14;
         }

         if (this.Q) {
            ++var14;
         }

         this.p = new int[var14];
         this.q = new boolean[var14];
         int var15 = 0;
         if (var28) {
            this.p[var15++] = 3;
         }

         if (this.Q) {
            this.p[var15++] = 1;
         }

         for(var16 = 0; var16 < var11.length; ++var16) {
            this.p[var15++] = var11[var16].b;
         }

         this.F = var14;
         if (this.F > 0) {
            this.q[0] = true;
            this.b(this.p[0]);
         } else {
            e var29 = this.w.a((short)3052).b(this.t.h);
            var29.e();
         }
         break;
      case 1011:
         var16 = var2.e(0);
         cd var17 = this.v.c((int)1);
         if (var17 == null || var17.e < var16) {
            this.Q = true;
         }

         this.w.a((short)3054).e();
         break;
      case 2056:
         ((cb)var1).b((bm)this);

         try {
            if (this.N != -1) {
               this.t.a(this.N);
            }

            this.v.b(this.t.a((short)var2.e(0)).b(System.currentTimeMillis()));
         } catch (IOException var23) {
            bh.a((byte)1, 1112035888, (Throwable)var23);
         }

         this.N = -1;
         break;
      case 2069:
         byte var3 = var2.d(0);
         if (var3 == 0) {
            this.w.a((short)3008).a(this.g).e();
            this.O = true;
         } else {
            this.a(this.u.a((short)3));
         }
         break;
      case 8004:
         if (!var2.c(0)) {
            this.a(this.u.a((short)6));
         }
      }

   }

   public void a(e var1) {
      String var11 = System.getProperty("microedition.platform");
      if (var11 == null) {
         var11 = "tibiame_pc_213";
      }

      String var2 = this.k();
      int var3 = this.v.b((byte)11);
      int var4 = this.v.b((byte)12);
      short var7 = 213;
      byte var8 = 0;
      byte var5 = (byte)this.v.b((byte)9);
      byte var6 = (byte)this.v.b((byte)10);
      if (var5 == 0) {
         var5 = cb.a;
      }

      if (var6 == 0) {
         var6 = 29;
      }

      cj var9;
      q var10;
      if ((this.e = this.j()) == null) {
         var9 = this.a(this.l());
         if (this.a) {
            return;
         }

         if (var9 == null) {
            var9 = this.a(a());
            this.B = 0;
            this.v.a((byte)4, this.B);
         }

         if (this.a) {
            return;
         }

         if (var9 == null) {
            this.a(this.u.a((short)7));
            return;
         }

         this.w = (new cb(var9, this.v)).a((bm)this);

         label569: {
            try {
               this.w.a((short)3063).a(var6).a((Object)this.u.b()).a(var5).b(var7).a(var8).a((Object)var11).e();
               this.w.a((short)3062).b(0).b(0).b(0).b(0).e();
               if (this.t.h == 0) {
                  this.w.a((short)3056).e();
               }

               if (bh.a((byte)0)) {
                  bh.a((byte)0, 827603021);
               }

               if (!this.w.d()) {
                  this.a(this.u.a((short)6));
                  return;
               }

               if (!this.a) {
                  if ((var10 = this.w.a((int)0)) != null) {
                     this.a(var10.b);
                     return;
                  }

                  while(this.w.d()) {
                     this.w.a((byte)0);
                     this.h();
                     if (this.I || this.a || !this.w.a()) {
                        break label569;
                     }
                  }

                  this.a(this.u.a((short)6));
                  return;
               }
            } finally {
               this.w.c();
               this.w = null;

               try {
                  if (this.P) {
                     Thread.sleep(7000L);
                  }
               } catch (Exception var29) {
               }

            }

            return;
         }

         if (this.z || this.a) {
            try {
               this.v.a((int)this.l);
            } catch (IOException var33) {
               bh.a((byte)2, 1245133106, (Throwable)var33);
            }
         }

         if (this.a) {
            if (this.b == null) {
               this.a(this.u.a((short)6));
            }

            return;
         }

         this.g();
         this.f();
         if (this.e == null) {
            this.a(this.u.a((short)5));
            return;
         }

         if (this.h != null) {
            synchronized(this) {
               this.M = true;
            }
         }

         if (bh.a((byte)0)) {
            bh.a((byte)0, 1127306317);
         }

         synchronized(this) {
            while(this.M) {
               if (this.a) {
                  return;
               }

               try {
                  this.wait(250L);
               } catch (InterruptedException var31) {
               }
            }
         }
      }

      this.c.a((short)8000).e();

      try {
         var9 = this.a(this.e);
      } catch (SecurityException var30) {
         this.a(this.u.a((short)64));
         return;
      }

      if (this.a) {
         if (var9 != null) {
            var9.a();
         }

      } else if (var9 == null) {
         this.a(this.u.a((short)4));
      } else {
         this.w = new cb(var9, this.v);
         this.w.a((bm)this);
         this.f = (new e((short)3060)).a(var6).a((Object)this.u.b()).a(var5).b(var7).a(var8).a((Object)var11).b(this.H.b() ? 1 : 0);
         this.w.a((short)3060).a(this.f).e();
         this.g = (new e((short)3008)).a((Object)var2).b(var3).b(var4).a((Object)this.t.c).a((Object)this.t.f);
         this.g.a((byte)this.v.b());

         for(int var12 = 0; var12 < this.v.b(); ++var12) {
            this.g.a((byte)this.v.b(var12).b);
            this.g.b(this.v.b(var12).e);
         }

         this.g.a((byte)this.v.a());
         if (this.t.d) {
            e var36 = this.w.a((short)3058).a((Object)var2).b(var3).b(var4).a((Object)this.t.c).a((Object)this.t.f).a(this.t.b()).a(this.t.a());
            var36.e();
         } else {
            this.w.a((short)3008).a(this.g).e();
            this.O = true;
         }

         while(!this.O) {
            if (!this.w.d()) {
               this.a(this.u.a((short)4));
               this.w.c();
               this.w = null;
               return;
            }

            this.w.a((byte)1);
         }

         if (bh.a((byte)0)) {
            bh.a((byte)0, 860172353, (String)"GameComm");
         }

         if (!this.w.d()) {
            this.a(this.u.a((short)4));
            this.w.c();
            this.w = null;
         } else if (this.a) {
            this.w.c();
            this.w = null;
         } else if ((var10 = this.w.a((int)1)) != null) {
            this.a(var10.b);
            this.w.c();
            this.w = null;
         } else {
            if (this.t.d) {
               this.i = this.u.a((short)2, (Object[])(new Object[]{this.t.c, bh.g(this.N)}));
            }

            this.w.a((bm)this);
            this.k = null;
            this.x = null;
            System.gc();
            this.d = true;
            if (bh.a((byte)0)) {
               bh.a((byte)0, 1145582390, (String)"GameServer");
            }

         }
      }
   }

   private void b(int var1) {
      if (var1 == 1) {
         this.w.a((short)3061).a((Object)"j2me").e();
      } else {
         e var2;
         if (var1 == 3) {
            var2 = this.w.a((short)3048);
            var2.a((byte)this.s);
            var2.e();
         } else {
            var2 = this.w.a((short)3047);
            var2.a((byte)var1);
            var2.e();
         }
      }

   }

   private boolean h() {
      if (n != null) {
         this.a(n);
         n = null;
         return true;
      } else {
         return false;
      }
   }

   private static int a(int var0, int var1, int var2) {
      return var2 == 0 ? 0 : (var1 * 100 + var0) / var2;
   }

   private boolean i() {
      if (this.z) {
         try {
            this.v.e();
            this.z = false;
            return true;
         } catch (IOException var2) {
            bh.a((byte)2, 844253249, (Throwable)var2);
            this.a(this.u.a((short)63));
            return false;
         }
      } else {
         return true;
      }
   }

   private cj a(y var1) {
      try {
         return this.H.a(var1);
      } catch (IOException var3) {
         return null;
      }
   }

   private cj a(y[] var1) {
      int var2 = (int)System.currentTimeMillis();
      cj var3 = null;
      int var4 = 0;

      for(int var5 = var1.length; var4 < var5; ++var4) {
         y var6 = var1[bh.b(var2 + var4, var5)];
         if (this.a) {
            break;
         }

         try {
            var3 = this.a(var6);
         } catch (SecurityException var8) {
            this.a(this.u.a((short)64));
            break;
         }

         if (var3 != null) {
            break;
         }
      }

      return var3;
   }

   private cd[] a(cd[] var1, cd[] var2) {
      z var3 = new z(13);
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < var1.length; ++var5) {
         if (var1[var5].a()) {
            var4 += var1[var5].d;
         }
      }

      try {
         var1 = cd.b(var1);
         var5 = 0;

         for(int var6 = 0; var6 < var1.length; ++var6) {
            if (!var1[var6].b()) {
               cd var7 = cd.b(var2, var1[var6].c);
               if (var5 >= var4 && var1[var6].d + var5 + var7.d > this.v.f() / 100 * 90 || var1[var6].c > this.j) {
                  break;
               }

               if (this.v.c(var1[var6].b) != null) {
                  boolean var8 = this.v.b(var1[var6]);
                  if (var8) {
                     continue;
                  }

                  this.v.a(var1[var6].b);
               }

               if (var1[var6].a() || !this.P) {
                  var3.a((Object)var1[var6]);
                  var5 += var1[var6].d;
               }
            }
         }
      } catch (IOException var9) {
         throw bh.a(1196639560, (Throwable)var9);
      }

      return (cd[])((cd[])var3.a((Object[])(new cd[var3.d()])));
   }

   private void a(String var1) {
      this.d();
      this.b = var1;
   }

   private y j() {
      if (this.e != null) {
         return this.e;
      } else {
         String var1 = this.v.c((byte)6);
         return var1 != null ? new y(var1) : null;
      }
   }

   private String k() {
      String var1 = this.v.c((byte)17);
      byte var2 = 15;
      if (var1 == null || var1.length() < var2) {
         StringBuffer var3 = new StringBuffer(var2);
         Random var4 = new Random();

         for(int var5 = 0; var5 < var2; ++var5) {
            int var6 = Math.abs(var4.nextInt()) % 10;
            var3.append(bh.h(var6));
         }

         var1 = var3.toString();
         this.v.a((byte)17, var1);
      }

      return var1;
   }

   private y[] l() {
      String var1 = this.v.c((byte)5);
      y[] var2;
      if (var1 == null) {
         try {
            var2 = this.v.g();
         } catch (IOException var4) {
            bh.a((byte)2, 1446074712, (Throwable)var4);
            var2 = null;
         }

         if (bh.a((Object[])var2) == 0) {
            var2 = a();
         }
      } else {
         this.B = 0;
         var2 = new y[]{new y(var1)};
      }

      return var2;
   }

   private byte m() {
      return (byte)this.v.b((byte)4);
   }

   private int n() {
      return this.v.b((byte)3);
   }
}
