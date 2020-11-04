import java.io.IOException;

public final class at extends c implements bm, m {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private int a = -1;
   private int b;
   private volatile int c;
   private volatile int d;
   private volatile int e;
   private int f;
   private int g;
   private int h;
   private long i;
   private int j;
   private int k;
   private byte[] l;
   private bk m;
   private int[] n;
   private bc o;
   private int p;
   private int q;
   private boolean r;
   private int s;
   private bk t;
   private bk u;
   private bk v;
   private z w;
   private z x;
   private final int y = 12;
   private boolean z;
   private final int A = 32;
   private final int B = 5;
   private final int C = 20000;
   private long D = 0L;
   private byte[] E;
   private boolean F;
   private int G = 16777215;
   private int H = 16719904;
   private int I = 0;
   private bv J;

   public at() {
      super(false);
      this.e(true);
      this.b((byte)2);
      this.x = new z(9);
      this.w = new z(9);

      for(int var1 = 0; var1 < 9; ++var1) {
         this.w.a((Object)(new e()));
      }

      this.z = false;
   }

   public at a(int var1) {
      this.p = var1;
      this.k = var1 >> 1;
      this.c(this.q, var1);
      return this;
   }

   public at b(int var1) {
      this.q = var1;
      this.j = var1 >> 1;
      this.c(var1, this.p);
      return this;
   }

   public at a() {
      for(int var1 = 0; var1 < this.s; ++var1) {
         if (this.s(var1) == 4) {
            this.A(var1);
            this.g(var1, 3);
         }
      }

      return this;
   }

   public void a(Object var1, e var2) {
      if (var2.a == 6015) {
         synchronized(this) {
            this.J = (bv)var2.f(0);
            this.notifyAll();
         }

         this.F = true;
         this.r = true;
      } else if (var2.a == 4013) {
         this.a = var2.e(0);
         this.b = var2.e(1);
         this.c = var2.e(2);
         this.d = this.a;
         this.e = this.b;
         this.F = true;
         this.r = true;
         this.p(-1);
         this.z = false;
      } else if (var2.a == 4008) {
         byte var3 = var2.d(0);
         int var4 = ci.b(var3);
         int var5 = ci.c(var3);
         this.a += var4;
         this.b += var5;
         this.o.a(-var4, -var5);
         if (var3 == 0) {
            this.a(this.a - 4, this.b - 4, 9, 1, true);
            this.a(this.a - this.j, this.b - this.k, this.q, 1, false);
         } else if (var3 == 2) {
            this.a(this.a - 4, this.b + 4, 9, 1, true);
            this.a(this.a - this.j, this.b - this.k + this.p - 1, this.q, 1, false);
         } else if (var3 == 1) {
            this.a(this.a + 4, this.b - 4, 1, 9, true);
            this.a(this.a - this.j + this.q - 1, this.b - this.k, 1, this.p, false);
         } else if (var3 == 3) {
            this.a(this.a - 4, this.b - 4, 1, 9, true);
            this.a(this.a - this.j, this.b - this.k, 1, this.p, false);
         }

         this.x();
      } else if (var2.a != 4001 && var2.a != 4005) {
         if (var2.a == 4023) {
            int var7 = var2.e(0);
            if (var7 == 0) {
               --this.e;
            } else if (var7 == 1) {
               ++this.d;
            } else if (var7 == 2) {
               ++this.e;
            } else if (var7 == 3) {
               --this.d;
            }

            this.p(var7);
         } else if (var2.a == 4021) {
            this.b(var2);
            this.z = false;
         } else if (var2.a == 4022) {
            this.z = false;
         } else if (var2.a == 4025) {
            this.f = var2.e(0);
            this.g = var2.e(1);
            this.h = var2.d(0);
         }
      } else {
         this.x();
      }

   }

   public void a(e var1) {
      bk var5 = new bk(128);
      ay var2 = (ay)var1.f(0);
      bk var3 = (bk)var1.f(1);
      bk var4 = (bk)var1.f(2);

      while(true) {
         boolean var6 = !this.a(var2, var5, var3);
         boolean var7 = !a(var2, var4);
         if (var6 && var7) {
            if (!this.k()) {
               return;
            }

            try {
               this.b();
            } catch (NullPointerException var9) {
            }

            bh.f(250);
         }
      }
   }

   protected void a(s var1) {
      this.o = var1.a(this.q, this.p);
      this.o.a(0);
      byte var2 = 6;
      byte var3 = 6;
      this.f(var2, var3);
      this.e(var2, var3);
      (new br(this, false, (new e()).a((Object)this.i().c()).a((Object)this.t).a((Object)this.v))).start();
   }

   protected void C() {
      this.a();
      if (this.o != null) {
         this.o.c();
         this.o = null;
      }

      this.n = null;
      this.m = null;
      this.l = null;
      this.u = null;
      this.t = null;
      this.v = null;
   }

   protected void b(s var1) {
      if (this.E()) {
         this.o.a(var1, 0, 0);
      } else {
         var1.a(0, 0, 0, this.u((byte)0), (int)this.u((byte)1));
      }

      int var3;
      int var4;
      int var5;
      if (this.f != 0 && this.c == this.h) {
         int var2 = this.f - this.a;
         var3 = this.g - this.b;
         var4 = var2 > 0 ? var2 : -var2;
         var5 = var3 > 0 ? var3 : -var3;
         if (2 * var4 < this.q && 2 * var5 < this.p) {
            int var6 = this.j + var2;
            int var7 = this.k + var3;
            var1.c(this.H, var6 + 1, var7, 1, 1);
            var1.c(this.H, var6 - 1, var7, 1, 1);
            var1.c(this.H, var6, var7 + 1, 1, 1);
            var1.c(this.H, var6, var7 - 1, 1, 1);
         }
      }

      byte var8 = 16;
      var3 = this.a(this.a / var8, this.b / var8, this.c);
      var4 = this.b(var3, this.a % var8, this.b % var8);
      var5 = this.J.a(var4) & 16777215;
      if (var5 == 16777215) {
         this.G = 0;
      } else {
         this.G = 16777215;
      }

      var1.c(this.G, this.j + 1, this.k, 1, 1);
      var1.c(this.G, this.j - 1, this.k, 1, 1);
      var1.c(this.G, this.j, this.k + 1, 1, 1);
      var1.c(this.G, this.j, this.k - 1, 1, 1);
      var1.c(0, this.j + 1, this.k + 1, 1, 1);
      var1.c(0, this.j + 1, this.k - 1, 1, 1);
      var1.c(0, this.j - 1, this.k + 1, 1, 1);
      var1.c(0, this.j - 1, this.k - 1, 1, 1);
      var1.b();
   }

   protected void o(int var1) {
      if (this.E()) {
         if (this.F) {
            this.a(this.a - 4, this.b - 4, 9, 9, true);
            this.F = false;
         }

         if (this.r) {
            this.a(this.a - this.j, this.b - this.k, this.q, this.p, false);
            this.x();
            this.r = false;
         }

         for(int var2 = 0; var2 < 4 && this.F(); ++var2) {
         }
      }

      if (this.I + var1 >= 800) {
         this.I = 0;
         this.H = this.H == 16755200 ? 16776960 : 16755200;
         this.x();
      } else {
         this.I += var1;
      }

   }

   private synchronized boolean b() {
      if (!this.z) {
         int var1 = this.d >> 5;
         int var2 = this.e >> 5;
         int var3 = this.c;
         e var4 = null;

         while(true) {
            do {
               if (var4 != null || this.x.d() <= 0) {
                  if (var4 != null) {
                     this.z = true;
                     this.D = System.currentTimeMillis();
                     cb var5 = ci.a.b();
                     if (var5 != null) {
                        var5.b((short)3059).b(var4.e(0)).b(var4.e(1)).a(var4.d(0)).b(this.d(var4.e(2), var4.e(3), var4.e(4), var4.e(5))).e();
                        this.w.a((Object)var4);
                        return true;
                     }
                  }

                  return false;
               }

               var4 = (e)this.x.c(0);
               if (Math.abs(var4.e(0) - var1) > 1 || Math.abs(var4.e(1) - var2) > 1 || Math.abs(var4.d(0) - var3) > 0) {
                  this.w.a((Object)var4);
                  var4 = null;
               }

               var1 = this.a >> 5;
               var2 = this.b >> 5;
            } while(Math.abs(var4.e(0) - var1) <= 1 && Math.abs(var4.e(1) - var2) <= 1);

            this.w.a((Object)var4);
            var4 = null;
         }
      } else if (System.currentTimeMillis() - this.D > 20000L) {
         this.z = false;
      }

      return false;
   }

   private short d(int var1, int var2, int var3, int var4) {
      return (short)(this.c(var1) + this.c(var2) + this.c(var3) + this.c(var4));
   }

   private short c(int var1) {
      byte var2 = 16;
      short var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var2; ++var5) {
            int var6 = this.b(var1, var4, var5);
            if (var6 != 0) {
               ++var3;
            }
         }
      }

      return var3;
   }

   private void p(int var1) {
      int var2 = this.d >> 5;
      int var3 = this.e >> 5;
      byte var4 = (byte)this.c;
      int var5;
      switch(var1) {
      case 0:
         var5 = (var3 << 5) + 32;
         if (var5 - this.b == 5) {
            this.a(var2 - 1, var3 - 1, var4);
            this.a(var2, var3 - 1, var4);
            this.a(var2 + 1, var3 - 1, var4);
         }
         break;
      case 1:
         var5 = var2 << 5;
         if (this.a - var5 == 5) {
            this.a(var2 + 1, var3 - 1, var4);
            this.a(var2 + 1, var3, var4);
            this.a(var2 + 1, var3 + 1, var4);
         }
         break;
      case 2:
         var5 = var3 << 5;
         if (this.b - var5 == 5) {
            this.a(var2 - 1, var3 + 1, var4);
            this.a(var2, var3 + 1, var4);
            this.a(var2 + 1, var3 + 1, var4);
         }
         break;
      case 3:
         var5 = (var2 << 5) + 32;
         if (var5 - this.a == 5) {
            this.a(var2 - 1, var3 - 1, var4);
            this.a(var2 - 1, var3, var4);
            this.a(var2 - 1, var3 + 1, var4);
         }
         break;
      default:
         this.a(var2 - 1, var3 - 1, var4);
         this.a(var2, var3 - 1, var4);
         this.a(var2 + 1, var3 - 1, var4);
         this.a(var2 - 1, var3, var4);
         this.a(var2, var3, var4);
         this.a(var2 + 1, var3, var4);
         this.a(var2 - 1, var3 + 1, var4);
         this.a(var2, var3 + 1, var4);
         this.a(var2 + 1, var3 + 1, var4);
      }

   }

   private void a(int var1, int var2, byte var3) {
      e var4;
      synchronized(this) {
         if (this.x.d() >= 12) {
            return;
         }

         if (this.w.d() > 0) {
            var4 = (e)this.w.c();
            var4.d();
         } else {
            var4 = new e();
         }
      }

      var4.b(var1).b(var2).a(var3);
      byte var5 = 16;

      for(int var6 = 0; var6 < 2; ++var6) {
         for(int var7 = 0; var7 < 2; ++var7) {
            int var8 = var6 * var5;
            int var9 = var7 * var5;
            var4.b(this.a((var1 << 5) + var8 >> 4, (var2 << 5) + var9 >> 4, (int)var3));
         }
      }

      synchronized(this) {
         this.x.a((Object)var4);
      }
   }

   private void b(e var1) {
      int var3 = var1.e(0);
      int var4 = var1.e(1);
      byte var5 = var1.d(0);
      if (this.E == null) {
         this.E = new byte[1024];
      }

      int var6 = 0;
      int var7 = 2;

      int var10;
      while(var6 < 1024) {
         int var8 = var1.e(var7++);
         byte var9 = (byte)((var8 >>> 4) + 1);
         if (var9 == 0) {
            break;
         }

         for(var10 = 0; var10 < var9; ++var10) {
            this.E[var6] = (byte)(var8 & 15);
            ++var6;
         }
      }

      for(int var11 = 0; var11 < 2; ++var11) {
         for(int var12 = 0; var12 < 2; ++var12) {
            int var13 = var11 * 16;
            int var14 = var12 * 16;
            var10 = this.a((var3 << 5) + var13 >> 4, (var4 << 5) + var14 >> 4, (int)var5);

            for(int var15 = 0; var15 < 16; ++var15) {
               for(int var16 = 0; var16 < 16; ++var16) {
                  byte var17 = this.E[(var16 + var14) * 32 + var15 + var13];
                  if (var17 != 0) {
                     this.f(var10, var15, var16, var17);
                  }
               }
            }

            this.g(var10, 4);
         }
      }

      this.r = true;
      this.x();
   }

   private static int a(byte[] var0, int var1, int var2, int var3) {
      return var0[var1 + ((var3 << 4) + var2 >> 1)] >> ((var2 & 1) == 0 ? 4 : 0) & 15;
   }

   private static boolean a(ay var0, bk var1) {
      if (var1.a(133, false, -1) != -1) {
         int var2 = var1.l();
         int var3 = var1.l();
         int var4 = var1.m();

         try {
            var0.a(var1, var2, var3, var4);
         } catch (IOException var9) {
            bh.a((byte)2, 1480931396, (Throwable)var9);
            var1.f(128);
         } finally {
            var1.a((int)133);
         }

         return true;
      } else {
         return false;
      }
   }

   private bk q(int var1) {
      return this.m.d(var1 << 7).e(var1 << 7);
   }

   private int a(int var1, int var2, int var3) {
      int var5 = Integer.MAX_VALUE;
      int var4 = -1;

      for(int var6 = 0; var6 < this.s; ++var6) {
         int var7 = this.s(var6);
         if (var7 == 0) {
            var5 = Integer.MIN_VALUE;
            var4 = var6;
         } else {
            if (this.t(var6) == var1 && this.u(var6) == var2 && this.v(var6) == var3) {
               return var6;
            }

            if ((var7 == 3 || var7 == 4) && !this.x(var6)) {
               int var8 = this.r(var6);
               if (var8 < var5) {
                  var4 = var6;
                  var5 = var8;
               }
            }
         }
      }

      if (var4 == -1) {
         bh.a((byte)1, 1380272967);
         return -1;
      } else {
         if (this.s(var4) == 4) {
            this.A(var4);
            this.g(var4, 3);
         }

         this.e(var4, var1, var2, var3);
         this.w(var4);
         this.y(var4);
         this.g(var4, 1);
         this.q(var4).a((byte)0, 128);
         return var4;
      }
   }

   private int r(int var1) {
      return this.n[var1 * 5 + 3];
   }

   private int s(int var1) {
      return this.n[var1 * 5 + 4];
   }

   private int t(int var1) {
      return this.n[var1 * 5];
   }

   private int u(int var1) {
      return this.n[var1 * 5 + 1];
   }

   private int v(int var1) {
      return this.n[var1 * 5 + 2];
   }

   private int b(int var1, int var2, int var3) {
      return a(this.l, var1 << 7, var2, var3);
   }

   private void w(int var1) {
      this.n[var1 * 5 + 3] = (int)(System.currentTimeMillis() - this.i);
   }

   private void e(int var1, int var2) {
      this.u = new bk(var1 * var2);
      this.v = new bk(133 * Math.max(var1, var2));
      this.t = new bk(6 * var1 * var2 << 1);
   }

   private void f(int var1, int var2) {
      this.i = System.currentTimeMillis();
      this.s = (var2 + 1) * (var1 + 1);
      this.n = new int[this.s * 5];
      this.m = new bk(this.s << 7);
      this.l = this.m.a();
   }

   private boolean x(int var1) {
      int var2 = this.t(var1);
      int var3 = this.u(var1);
      int var4 = this.v(var1);
      return var4 == this.c && bh.b(var2, this.a - this.j >> 4, this.a - this.j + this.q - 1 >> 4) && bh.b(var3, this.b - this.k >> 4, this.b - this.k + this.p - 1 >> 4);
   }

   private boolean E() {
      synchronized(this) {
         return this.J != null && this.a != -1;
      }
   }

   private void a(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1 >> 4;
      int var7 = var2 >> 4;
      int var8 = var1 + var3 - 1 >> 4;
      int var9 = var2 + var4 - 1 >> 4;

      for(int var10 = var7; var10 <= var9; ++var10) {
         for(int var11 = var6; var11 <= var8; ++var11) {
            int var12 = this.a(var11, var10, this.c);
            int var13 = Math.max(0, var1 - (var11 << 4));
            int var14 = Math.max(0, var2 - (var10 << 4));
            int var15 = Math.min(15, var1 + var3 - 1 - (var11 << 4)) - var13 + 1;
            int var16 = Math.min(15, var2 + var4 - 1 - (var10 << 4)) - var14 + 1;
            if (var12 == -1) {
               int var17 = (var11 << 4) + var13 - this.a + this.j;
               int var18 = (var10 << 4) + var14 - this.b + this.k;
               this.o.a(0, var17, var18, var15, var16);
            } else {
               if (var5) {
                  this.a(var12, var13, var14, var15, var16, true);
               }

               this.a(var12, var13, var14, var15, var16, false);
            }
         }
      }

   }

   private boolean a(ay var1, bk var2, bk var3) {
      if (var3.a(4, false, -1) != -1) {
         int var4 = var3.m();
         int var5 = var3.l();
         int var6 = var3.l();
         int var7 = var3.m();
         var3.a((int)4);

         try {
            var2.e();
            if (var1.a(var5, var6, var7, var2)) {
               byte[] var8 = var2.a();

               for(int var9 = 0; var9 < 16; ++var9) {
                  for(int var10 = 0; var10 < 16; ++var10) {
                     int var11 = a(var8, 0, var10, var9);
                     if (var11 != 0) {
                        this.f(var4, var10, var9, var11);
                     }
                  }
               }
            }

            this.z(var4);
         } catch (IOException var12) {
            bh.a((byte)2, 1479749943, (Throwable)var12);
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      bv var7;
      synchronized(this) {
         var7 = this.J;
      }

      boolean var20 = false;
      int var8 = this.t(var1);
      int var9 = this.u(var1);
      this.w(var1);
      int var10;
      int var11;
      int var18;
      int var19;
      if (var6) {
         var10 = this.a - var7.b().q();
         var11 = this.b - var7.b().r();
         var18 = var7.c();
         var19 = var7.c();
      } else {
         var10 = this.a - this.j;
         var11 = this.b - this.k;
         var18 = this.q;
         var19 = this.p;
      }

      int var12 = var8 << 4;
      int var13 = var9 << 4;
      int var14 = Math.max(var10, var12 + var2);
      int var15 = Math.max(var11, var13 + var3);
      int var16 = Math.min(var10 + var18, var12 + var2 + var4) - var14;
      int var17 = Math.min(var11 + var19, var13 + var3 + var5) - var15;
      if (var16 > 0 && var17 > 0) {
         int var21 = var14 - (var8 << 4);
         int var22 = var15 - (var9 << 4);
         int var23 = var14 - var10;
         int var24 = var15 - var11;

         for(int var25 = 0; var25 < var17; ++var25) {
            for(int var26 = 0; var26 < var16; ++var26) {
               int var28 = var21 + var26;
               int var29 = var22 + var25;
               int var27;
               if (var6) {
                  var27 = var7.a(var23 + var26, var24 + var25);
                  if (var27 != 0) {
                     if (var20) {
                        this.f(var1, var28, var29, var27);
                     } else if (this.b(var1, var28, var29) != var27) {
                        var20 = true;
                        this.f(var1, var28, var29, var27);
                     }
                  }
               } else {
                  var27 = this.b(var1, var28, var29);
                  this.o.a(var7.a(var27), var23 + var26, var24 + var25);
               }
            }
         }
      }

      if (var20) {
         this.g(var1, 4);
      }

   }

   private boolean F() {
      if (this.u.a(1, false, -1) != -1) {
         int var1 = this.u.m();
         this.u.a((int)1);
         if (this.v(var1) == this.c) {
            this.a(var1, 0, 0, 16, 16, false);
         }

         this.g(var1, 3);
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private void y(int var1) {
      while(!this.t.a((int)4, 0)) {
      }

      this.t.a((byte)var1).a((short)this.t(var1)).a((short)this.u(var1)).a((byte)this.v(var1));
      this.t.b((int)4);
   }

   private void z(int var1) {
      while(!this.u.a((int)1, 0)) {
      }

      this.u.a((byte)var1);
      this.u.b((int)1);
   }

   private void A(int var1) {
      while(!this.v.a((int)133, 0)) {
      }

      this.v.a((short)this.t(var1)).a((short)this.u(var1)).a((byte)this.v(var1)).a(this.l, var1 << 7, 128);
      this.v.b((int)133);
   }

   private void g(int var1, int var2) {
      this.n[var1 * 5 + 4] = var2;
   }

   private void e(int var1, int var2, int var3, int var4) {
      int var5 = var1 * 5;
      this.n[var5] = var2;
      this.n[var5 + 1] = var3;
      this.n[var5 + 2] = var4;
   }

   private void f(int var1, int var2, int var3, int var4) {
      int var5 = (var1 << 7) + ((var3 << 4) + var2 >> 1);
      if ((var2 & 1) == 0) {
         this.l[var5] = (byte)(this.l[var5] & 15 | var4 << 4 & 240);
      } else {
         this.l[var5] = (byte)(this.l[var5] & 240 | var4 & 15);
      }

   }
}
