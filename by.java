import java.util.NoSuchElementException;

public final class by extends c implements k {
   static final int MBOOSTER_MAX_INSTANCES = 16;
   private short a;
   private short b;
   private int c;
   private Object[] d;
   private int e;
   private int f;
   private z g;
   private byte[] h;
   private int i;
   private int j;
   private ck k;
   private short[] l;
   private int[] m;
   private byte[] n;
   private int[] o;
   private int p;
   private boolean q;
   private z r;
   private int s;
   private boolean t;
   private int u;
   private int v;
   private boolean w;

   public by() {
      super(false);
      this.b((byte)1);
      this.s = -2;
   }

   public int b() {
      if (this.l == null) {
         throw bh.c(1380275760);
      } else {
         int var1 = this.L();
         int var2 = 0;

         for(int var3 = 0; var3 < this.u; ++var3) {
            var2 += this.l[var3];
         }

         var2 += this.t((byte)1);
         return (var2 + var1 - 1) / var1 + 1;
      }
   }

   public void b(int var1) {
      if (this.l == null) {
         throw bh.c(1380275760);
      } else {
         int var2 = this.L();
         int var3 = bh.a(var2 * (var1 - 1), 0, this.v - var2);
         int var4 = 0;

         int var5;
         for(var5 = var3; var4 < this.e && var5 >= this.l[var4]; ++var4) {
            var5 -= this.l[var4];
         }

         this.x(var4);

         for(var5 = 0; var5 < this.u; ++var5) {
            var3 -= this.l[var5];
         }

         this.d(0, var3);
      }
   }

   public int E() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.e; ++var2) {
         var1 = Math.max(var1, this.l[var2]);
      }

      return var1;
   }

   public int F() {
      if (this.l == null) {
         throw bh.c(1380275760);
      } else {
         return (this.v + this.u((byte)1) - 1) / this.u((byte)1);
      }
   }

   public int G() {
      return this.e;
   }

   public void c(int var1) {
      this.s = var1;
   }

   public int H() {
      int var1 = this.u;

      do {
         c var2 = this.v(var1);
         if (var2 == null) {
            return 0;
         }

         if (var2.q((byte)1) + var2.u((byte)1) - this.t((byte)1) > 0) {
            return var1;
         }

         ++var1;
      } while(var1 <= this.K());

      throw bh.a(1297500746);
   }

   public by a(boolean var1) {
      if (this.t != var1) {
         this.t = var1;
         if (var1) {
            this.k = new ck();
            this.k.a((int)2).a((byte)1, (byte)0).e((int)1);
            if (this.k()) {
               this.k.b(this.d().a("Hand"));
            }
         } else {
            this.k.z();
            this.k = null;
         }
      }

      return this;
   }

   public by I() {
      this.v();
      this.d = null;
      this.l = null;
      this.n = null;
      this.h = null;
      return this;
   }

   public by f(boolean var1) {
      if (var1) {
         c var2 = this.v(0);
         this.l = new short[this.e];
         this.v = 0;
         this.q = true;

         for(int var3 = 0; var3 < this.e; ++var3) {
            this.a(var2, var3);
            var2.t();
            int var4 = var2.u((byte)1);
            this.l[var3] = (short)var4;
            this.v += var4;
            if (var3 > 0 && this.q && this.l[var3 - 1] != (short)var4) {
               this.q = false;
            }
         }
      }

      for(int var5 = 0; var5 < this.f; ++var5) {
         this.a(this.v(var5), var5);
         this.a(var5, false);
      }

      this.i = this.e - 1;
      this.w(1);
      if (this.u == 0) {
         this.d(0, 0);
      }

      return this;
   }

   public Object e(int var1, int var2) {
      return this.d[var1 * this.c + var2];
   }

   public Object p(int var1) {
      return this.e(this.i, var1);
   }

   public void q(int var1) {
      if (this.e > 0) {
         this.x(var1);
         this.d(0, Integer.MAX_VALUE);
         this.u(var1);
      }

   }

   public by r(int var1) {
      this.m = new int[var1 << 2];
      return this;
   }

   public by s(int var1) {
      this.e = var1;
      this.d = new Object[var1 * this.c];
      this.v();
      this.f = Math.min(this.e, this.p);
      this.j(this.f + (this.k == null ? 0 : 1));
      this.c(0, 0, 1, this.f);

      for(int var2 = 0; var2 < this.f; ++var2) {
         c var3;
         try {
            var3 = (c)this.g.c();
         } catch (NoSuchElementException var5) {
            throw bh.a(1261979206, (Throwable)var5);
         }

         var3.b((int)1, var2);
         this.b(var3);
      }

      if (this.k != null) {
         this.b((c)this.k);
      }

      this.u = 0;
      this.i = 0;
      this.n = null;
      this.h = null;
      return this;
   }

   public by t(int var1) {
      this.c = var1;
      this.o = new int[var1 << 1];
      this.d = null;
      return this;
   }

   public by a(int var1, int var2, Object var3) {
      this.d[var1 * this.c + var2] = var3;
      return this;
   }

   public by a(z var1, int var2) {
      this.p = var2;
      this.g = var1;
      return this;
   }

   public by a(int var1, byte var2, int var3, int var4, int var5) {
      this.m[var1 << 2] = var2;
      this.m[(var1 << 2) + 1] = var3;
      this.m[(var1 << 2) + 2] = var4;
      this.m[(var1 << 2) + 3] = var5;
      return this;
   }

   public by g(boolean var1) {
      this.w = var1;
      return this;
   }

   public by a(int var1, int var2, byte var3) {
      this.o[var1 << 1] = var2;
      this.o[(var1 << 1) + 1] = var3;
      return this;
   }

   public by a(int var1, byte var2, boolean var3) {
      if (this.h == null) {
         this.h = new byte[this.e];
      }

      byte[] var10000;
      if (var3) {
         var10000 = this.h;
         var10000[var1] |= var2;
      } else {
         var10000 = this.h;
         var10000[var1] &= (byte)(~var2);
      }

      return this;
   }

   public by a(int var1, byte var2) {
      if (this.n == null) {
         this.n = new byte[this.e];
         int var3 = 0;

         for(int var4 = this.n.length; var3 < var4; ++var3) {
            this.n[var3] = -1;
         }
      }

      this.n[var1] = var2;
      return this;
   }

   public void a(af var1) {
      if (this.r == null) {
         this.r = new z(3);
      }

      this.r.a((Object)var1);
   }

   public void a() {
   }

   public int J() {
      return this.i;
   }

   public void a(int var1) {
      if (this.e != 0) {
         var1 = bh.b(var1, this.e);
         if (this.k != null) {
            this.k.b((int)0, var1);
         }

         if (this.i != var1) {
            if (var1 > this.K()) {
               this.x(var1 - this.f + 1);
            } else if (var1 < this.u) {
               this.x(var1);
            }

            if (this.M()) {
               this.a(this.i, false);
               this.a(var1, true);
            }

            this.i = var1;
            this.u(var1);
            this.a((byte)0, (int)var1);
         }

      }
   }

   public void b(af var1) {
      if (this.r != null && this.r.d(var1) && this.r.d() == 0) {
         this.r = null;
      }

   }

   public boolean c(byte var1) {
      return this.K() < this.e - 1 || super.c(var1);
   }

   public boolean d(byte var1) {
      return this.u > 0 || super.d(var1);
   }

   protected void y(byte var1) {
      if (var1 == 0) {
         this.a(this.i, this.M());
         if (this.k != null) {
            this.k.b(this.n());
         }

         int var2 = this.u;

         for(int var3 = this.K(); var2 <= var3; ++var2) {
            c var4 = this.v(var2);
            if (var4 != null) {
               au var5 = (au)var4.g((int)10);
               if (var5 != null) {
                  var5.a(this.n());
               }
            }
         }
      }

   }

   protected void a(s var1) {
      if (this.k != null) {
         this.k.b(var1.a("Hand"));
      }

      this.b = var1.a("ArrowUp");
      this.a = var1.a("ArrowDown");
      this.u(this.i);
      this.a(this.i, this.M());
   }

   protected void a(c var1) {
      super.a(var1);
      ((by)var1).a(this.t);
   }

   protected void b(s var1) {
      int var2;
      if (this.t) {
         var2 = this.t((byte)1);
         if (this.d((byte)1)) {
            var1.a((short)this.b, (int)1, (int)(var2 + 1));
         }

         if (this.c((byte)1)) {
            var1.b((short)this.a, 1, var2 + this.u((byte)1) - 1, 8);
         }

         var1.b();
      }

      if (this.s != -2) {
         var2 = this.u;

         for(int var3 = this.K(); var2 < var3; ++var2) {
            c var4 = this.v(var2);
            if (var4 != null) {
               int var5 = var4.q((byte)1) + var4.u((byte)1);
               var1.b(this.s, 0, var5, this.u((byte)0), var5);
            }
         }
      }

   }

   protected boolean z(byte var1) {
      if (this.n != null) {
         for(int var2 = 0; var2 < this.e; ++var2) {
            if (this.n[var2] == var1) {
               this.a(var2);
               this.a((byte)1, (int)var2);
               return true;
            }
         }
      }

      if (var1 == 0) {
         if (h.z && this.i == 0) {
            h.L();
         } else {
            this.w(-1);
         }

         return true;
      } else if (var1 == 2) {
         this.w(1);
         return true;
      } else if (var1 == 16) {
         if (h.z) {
            h.z = false;
         }

         if (this.h != null && (this.h[this.i] & 1) != 0) {
            this.a((byte)2, (int)0);
         } else {
            this.a((byte)1, (int)this.i);
         }

         return true;
      } else if (var1 == 17) {
         if (h.z) {
            h.z = false;
         }

         this.a((byte)2, (int)0);
         return true;
      } else {
         return false;
      }
   }

   protected void o(int var1) {
      if (this.k != null && this.n() && (this.j += var1) >= 350) {
         this.j %= 350;
         int var2 = 1 - this.k.j((byte)0);
         this.k.a((int)var2, (int)0, -var2, 0);
      }

   }

   private static int a(Object var0) {
      if (var0 instanceof Byte) {
         return (Byte)var0;
      } else if (var0 instanceof Short) {
         return (Short)var0;
      } else if (var0 instanceof Integer) {
         return (Integer)var0;
      } else {
         return var0 instanceof Long ? (int)(Long)var0 : 0;
      }
   }

   private void a(c var1, int var2) {
      int var3 = var2 * this.c;

      for(int var4 = 0; var4 < this.c; ++var4) {
         c var5 = var1.g(this.o[var4 << 1]);
         if (var5 != null) {
            Object var6 = this.d[var3 + var4];
            if (this.o[(var4 << 1) + 1] == 2) {
               ((ck)var5).b(((Integer)var6).shortValue());
            } else if (this.o[(var4 << 1) + 1] == 1) {
               ((b)var5).a((String)var6);
            } else if (this.o[(var4 << 1) + 1] == 3) {
               ((b)var5).a(String.valueOf(a(var6)));
            } else if (this.o[(var4 << 1) + 1] == 4) {
               ((au)var5).a((byte)a(var6)).a(this.n());
            }
         }
      }

   }

   private void u(int var1) {
      c var2 = this.v(var1);
      if (var2 != null) {
         var2.s();
      }

   }

   private void a(byte var1, int var2) {
      if (this.r != null) {
         int var3 = 0;

         for(int var4 = this.r.d(); var3 < var4; ++var3) {
            ((af)this.r.b(var3)).a(this, var1, var2);
         }
      }

   }

   private int K() {
      return this.u + this.f - 1;
   }

   private c v(int var1) {
      return this.a((int)1, (int)var1);
   }

   private int L() {
      int var1 = this.u((byte)1);
      if (this.q && this.l.length > 0) {
         var1 = Math.min(this.f * this.l[0], var1);
      }

      return var1;
   }

   private void w(int var1) {
      if (this.e > 0) {
         int var2 = this.i;

         do {
            var2 = bh.b(var2 + var1, this.e);
         } while(this.h != null && (this.h[var2] & 2) != 0);

         this.a(var2);
      }

   }

   private void x(int var1) {
      var1 = bh.a(var1, 0, this.e - this.f);
      if (var1 != this.u) {
         int var2 = Math.max(this.u, var1);
         int var3 = Math.min(this.K(), var1 + this.f - 1);
         int var4;
         int var5;
         int var6;
         if (var2 <= var3) {
            if (var1 < this.u) {
               var4 = var1;
               var5 = var3 + 1;
            } else {
               var4 = var3 + 1;
               var5 = this.u;
            }

            var6 = this.f - var3 + var2 - 1;
         } else {
            var4 = var1;
            var5 = this.u;
            var6 = this.f;
         }

         for(int var7 = 0; var7 < var6; ++var7) {
            int var9 = var5 + var7;
            int var10 = var4 + var7;
            c var8 = this.v(var9);
            var8.b((int)1, var10);
            this.a(var8, var10);
            this.a(var10, this.i == var10 && this.M());
         }

         this.u = var1;
         this.y();
      }

   }

   private boolean M() {
      return this.n() || this.k != null;
   }

   private void a(int var1, boolean var2) {
      c var3 = this.v(var1);
      if (var3 != null && this.m != null) {
         int var4 = 0;

         int var5;
         for(var5 = this.m.length; var4 < var5; var4 += 4) {
            c var6 = var3.g(this.m[var4 + 1]);
            if (var6 != null) {
               if (this.m[var4] == 1) {
                  ((b)var6).a((byte)(var2 ? this.m[var4 + 2] : this.m[var4 + 3]));
               } else if (this.m[var4] == 2) {
                  ((b)var6).a(var2 ? this.m[var4 + 2] : this.m[var4 + 3]);
               } else if (this.m[var4] == 3) {
                  ((ba)var6).a(var2 ? this.m[var4 + 2] : this.m[var4 + 3]);
               }
            }
         }

         if (this.w && this.c >= 6) {
            Object var8 = this.e(var1, 5);
            var5 = (Integer)var8;
            if (var5 != 0) {
               int var9 = 16777215;
               if ((var5 & 1) != 0 && (var5 & 2) != 0) {
                  var9 = 12632256;
               }

               if ((var5 & 1) != 0) {
                  var9 = 12995072;
               } else if ((var5 & 2) != 0) {
                  var9 = 10526880;
               }

               c var7 = var3.g((int)40);
               if (var7 != null) {
                  ((b)var7).a(var9);
               }

               var7 = var3.g((int)42);
               if (var7 != null) {
                  ((b)var7).a(var9);
               }
            }
         }
      }

   }
}
