public final class ch extends b {
   static final int MBOOSTER_MAX_INSTANCES = 6;
   private static final String[] b;
   private static final String[] c;
   private static final String[] d;
   private final ce e;
   private boolean f;
   private boolean g;
   private int h;
   private int i;
   private int j;
   private boolean k = true;
   private int l;
   private char[] m;
   private int n = -1;
   private int o;
   private int p;
   private int q;
   private boolean r;
   private int s;
   private cg t;
   private int u;
   private boolean v;
   private boolean w;
   private char[] x;
   private int y;

   public ch() {
      this.p(0);
      this.e = new ce(this);
      this.b((byte)1);
   }

   public int E() {
      return this.p;
   }

   public ch p(int var1) {
      if (this.p != var1) {
         this.p = var1;
         this.j = 750;
         if (this.k()) {
            this.l(true);
            this.x();
         }
      }

      return this;
   }

   public ch q(int var1) {
      if (this.m == null) {
         this.m = bh.a((char[])(new char[var1]), 0, var1, (char)' ');
      } else if (this.m.length < var1) {
         this.m = bh.a(this.m, var1 - this.m.length, ' ');
      }

      if (this.x == null) {
         this.x = bh.a((char[])(new char[var1]), 0, var1, (char)' ');
      } else if (this.x.length < var1) {
         this.x = bh.a(this.x, var1 - this.x.length, ' ');
      }

      this.u = var1;
      return this;
   }

   public ch f(boolean var1) {
      if (this.v != var1) {
         this.v = var1;
         this.t = var1 ? new cg() : null;
      }

      return this;
   }

   public ce F() {
      return this.e;
   }

   public ch r(int var1) {
      if (var1 != this.y) {
         this.y = var1;
         this.K();
      }

      return this;
   }

   public ch g(boolean var1) {
      if (this.f != var1) {
         this.f = var1;
         if (!var1) {
            this.t(Integer.MAX_VALUE);
         }
      }

      return this;
   }

   public ch h(boolean var1) {
      this.g = var1;
      return this;
   }

   public ch i(boolean var1) {
      if (this.w != var1) {
         this.w = var1;
         this.x();
      }

      return this;
   }

   public String b() {
      return new String(this.x, 0, this.s);
   }

   public b a(String var1) {
      if (var1 != null && this.x != null) {
         this.s = Math.min(var1.length(), this.x.length);
         var1.getChars(0, this.s, this.x, 0);
         if (this.w) {
            bh.a((char[])this.m, 0, this.s, (char)'*');
         } else {
            System.arraycopy(this.x, 0, this.m, 0, this.s);
         }
      } else {
         this.s = 0;
      }

      this.d(0, 0);
      this.t(this.s);
      this.K();
      this.J();
      this.x();
      return this;
   }

   protected void b(int var1) {
      this.x();
   }

   protected void c(int var1) {
      this.x();
   }

   protected void y(byte var1) {
      if (var1 == 0 && this.n()) {
         this.e.a((short)8009).e();
         this.I();
      }

      if (var1 == 4) {
         this.J();
         this.I();
      }

      if (var1 == 1) {
         this.k(false);
      }

   }

   protected void a(s var1) {
      this.h = this.s;
      this.K();
      this.J();
      this.q = 3000;
   }

   protected void a(c var1) {
      super.a(var1);
      ((ch)var1).g(this.f).h(this.g).p(this.p).q(this.u).i(this.w);
   }

   protected void b(s var1) {
      byte var2 = this.a();
      boolean var3 = this.k && this.n();
      var1.a((int)2, (int)0, (byte)1);
      if (this.v) {
         int var6 = 0;
         int var4 = 0;
         this.t.a(this.m, 0, this.s);

         int var5;
         do {
            var5 = this.t.e();
            if (var5 != 2 && var5 != -1) {
               if (this.s(var4)) {
                  if (var4 <= this.t.c()) {
                     this.a(var6++, var4, this.t.c() - var4, var2, super.a, var3);
                  }

                  var4 = this.t.c();
               }
            } else {
               if (var4 <= this.t.c()) {
                  this.a(var6++, var4, this.t.c() - var4, var2, super.a, var3);
               }

               var4 = this.t.a();
            }
         } while(var5 != -1);
      } else {
         this.a(0, 0, this.s, var2, super.a, var3);
      }

      var1.a((int)-2, (int)0, (byte)1);
      if (this.r) {
         var1.a((byte)1, b[this.p], 16777215, this.u((byte)0) + this.t((byte)0), 0, 4);
      }

      var1.b();
   }

   protected boolean z(byte var1) {
      if (var1 == 16) {
         this.k(true);
         return true;
      } else if (var1 == 17) {
         if (this.s > 0) {
            this.j(true);
            this.f((int)1750);
         } else {
            this.k(false);
         }

         return true;
      } else {
         if (this.f) {
            if (var1 == 3) {
               return this.t(-1);
            }

            if (var1 == 1) {
               return this.t(1);
            }

            if (var1 == 0) {
               this.d(0, this.t((byte)1) - this.d().a((byte)2, (byte)this.a()));
               return true;
            }

            if (var1 == 2) {
               this.d(0, this.t((byte)1) + this.d().a((byte)2, (byte)this.a()));
               return true;
            }
         }

         if (var1 >= 4 && var1 <= 13) {
            this.l(false);
            int var2 = var1 - 4;
            if (this.p == 2) {
               if (this.s < this.u) {
                  if (this.n != -1) {
                     this.t(1);
                  }

                  this.c((char)(48 + var2));
                  this.t(1);
               }
            } else if (var2 == this.n) {
               this.o = (this.o + 1) % c[this.n].length();
               this.d(this.H()[this.n].charAt(this.o));
               this.j = 750;
            } else {
               if (this.n != -1) {
                  this.t(1);
               }

               if (this.s < this.u) {
                  this.o = 0;
                  this.c(this.H()[var2].charAt(this.o));
                  this.n = var2;
                  this.j = 750;
               } else {
                  this.n = -1;
               }
            }

            return true;
         } else if (var1 == 14 && this.g) {
            this.p((byte)((this.p + 1) % 4));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean A(byte var1) {
      if (var1 == 17) {
         this.f((int)0);
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(char var1) {
      if (this.s < this.u) {
         if (this.n != -1) {
            this.G();
            this.t(1);
         }

         this.c(var1);
         this.t(1);
      }

      return true;
   }

   protected void o(int var1) {
      if ((this.i -= var1) < 0) {
         this.i += 500;
         this.k = !this.k;
         if (this.n()) {
            this.x();
         }
      }

      if (this.q > 0) {
         this.q -= var1;
         if (this.q <= 0) {
            this.l(false);
         }
      }

      if (this.j > 0) {
         this.j -= var1;
         if (this.j <= 0) {
            this.G();
            this.t(1);
         }
      }

   }

   private void G() {
      this.n = -1;
      this.j = 0;
      this.I();
      this.x();
   }

   private String[] H() {
      if (this.p == 3) {
         return d;
      } else {
         return this.p != 0 || this.h != 0 && this.m[this.h - 1] != ' ' ? c : d;
      }
   }

   private void c(char var1) {
      if (this.h < this.s) {
         System.arraycopy(this.m, this.h, this.m, this.h + 1, this.s - this.h);
         System.arraycopy(this.x, this.h, this.x, this.h + 1, this.s - this.h);
      }

      this.m[this.h] = this.w ? 42 : var1;
      this.x[this.h] = var1;
      ++this.s;
      this.l(false);
      this.G();
      this.K();
   }

   private boolean s(int var1) {
      return this.d().a(this.a(), this.m, var1, this.t.a() - var1) >= this.u((byte)0) - 2 - 4;
   }

   private boolean t(int var1) {
      int var2 = bh.a(this.h + var1, 0, this.s);
      if (var2 != this.h) {
         this.h = var2;
         this.G();
         this.J();
         return true;
      } else {
         return false;
      }
   }

   private void a(int var1, int var2, int var3, byte var4, int var5, boolean var6) {
      s var7 = this.d();
      int var8 = var1 * var7.a((byte)2, (byte)var4);
      boolean var9;
      if (this.s == var2 + var3) {
         var9 = this.h >= var2 && this.h <= this.s;
      } else {
         var9 = this.h >= var2 && this.h < var2 + var3;
      }

      if (var9) {
         if (this.n == -1) {
            var7.a(var4, (char[])this.m, var2, var3, var5, 0, var8);
            if (var6) {
               var7.c(0, this.l, var8, 3, var7.b((byte)2, var4));
               var7.a(16777215, this.l + 1, var8 + 1, 1, (int)(var7.b((byte)2, var4) - 2));
            }
         } else {
            int var10 = this.h == var3 ? 4 : var7.a(var4, this.x, this.h, 1);
            if (var6) {
               var7.c(0, this.l - 2, var8, var10 + 3, var7.b((byte)2, var4));
               var7.a(16777215, this.l - 1, var8 + 1, var10 + 1, var7.b((byte)2, var4) - 2);
            }

            if (this.w) {
               var7.a(var4, (char[])this.m, var2, this.h, var5, 0, var8);
               var7.a(var4, (char[])this.x, this.h, 1, var5, this.l, var8);
               if (this.h + 1 < var3) {
                  var7.a(var4, this.m, this.h + 1, var3 - this.h - 1, var5, this.l + var10, var8);
               }
            } else {
               var7.a(var4, (char[])this.m, var2, var3, var5, 0, var8);
            }
         }
      } else {
         var7.a(var4, (char[])this.m, var2, var3, var5, 0, var8);
      }

   }

   private void j(boolean var1) {
      if (this.n == -1) {
         if (var1) {
            if (this.h > 0) {
               System.arraycopy(this.m, this.h, this.m, this.h - 1, this.s - this.h);
               System.arraycopy(this.x, this.h, this.x, this.h - 1, this.s - this.h);
               --this.s;
               this.t(-1);
            }
         } else if (this.h < this.s) {
            System.arraycopy(this.m, this.h + 1, this.m, this.h, this.s - this.h - 1);
            System.arraycopy(this.x, this.h + 1, this.x, this.h, this.s - this.h - 1);
            --this.s;
            this.x();
         }
      } else {
         System.arraycopy(this.m, this.h + 1, this.m, this.h, this.s - this.h - 1);
         System.arraycopy(this.x, this.h + 1, this.x, this.h, this.s - this.h - 1);
         --this.s;
         this.G();
      }

      this.l(false);
      this.K();
      this.J();
   }

   private void d(char var1) {
      this.m[this.h] = this.w ? 42 : var1;
      this.x[this.h] = var1;
      this.I();
      this.K();
      this.x();
   }

   private void k(boolean var1) {
      this.e.a((short)8008).a(var1).a((Object)this.b()).e();
   }

   private void l(boolean var1) {
      if (this.r != var1) {
         this.r = var1;
         this.q = var1 ? 3000 : 0;
         this.x();
      }

   }

   private void I() {
      if (!this.k) {
         this.k = true;
         this.x();
      }

      this.i = 500;
   }

   private void J() {
      if (this.k()) {
         s var1 = this.d();
         byte var2 = this.a();
         if (!this.v) {
            this.l = var1.a(var2, this.m, 0, this.h);
         } else {
            int var3 = 0;
            this.t.a(this.m, 0, this.s);

            int var4;
            do {
               var4 = this.t.e();
               if (var4 != 2 && var4 != -1) {
                  if (this.s(var3)) {
                     if (this.h >= var3 && this.h < this.t.c()) {
                        this.l = var1.a(var2, this.m, var3, this.h - var3);
                        break;
                     }

                     var3 = this.t.c();
                  }
               } else {
                  if (this.h >= var3 && this.h <= this.t.a()) {
                     this.l = var1.a(var2, this.m, var3, this.h - var3);
                     break;
                  }

                  var3 = this.t.a();
               }
            } while(var4 != -1);

            this.t.d();
         }

         this.d(Math.max(0, this.l + 4 - this.u((byte)0) + 1), Integer.MAX_VALUE);
         this.I();
      }

   }

   private void K() {
      if (this.k()) {
         byte var1 = this.a();
         s var2 = this.d();
         int var3;
         int var4;
         if (!this.v) {
            var3 = var2.a(var1, this.m, 0, this.s) + 4;
            var4 = var2.a((byte)2, (byte)var1);
         } else {
            int var5 = 0;
            var3 = 0;
            var4 = 1;
            this.t.a(this.m, 0, this.s);

            while(true) {
               int var6 = this.t.e();
               if (var6 != 2 && var6 != -1) {
                  if (this.s(var5)) {
                     if (var5 <= this.t.c()) {
                        var3 = Math.max(var3, var2.a((byte)0, var1, (char[])this.m, var5, this.t.c() - var5));
                     }

                     ++var4;
                     var5 = this.t.c();
                  }
               } else {
                  if (var5 <= this.t.c()) {
                     var3 = Math.max(var3, var2.a((byte)0, var1, (char[])this.m, var5, this.t.c() - var5));
                  }

                  if (var6 != -1) {
                     ++var4;
                  }

                  var5 = this.t.a();
               }

               if (var6 == -1) {
                  var4 *= var2.a((byte)2, (byte)var1);
                  break;
               }
            }
         }

         var3 = Math.max(var3, var2.a(var1, b[3]));
         var3 = Math.max(var3, var2.a(var1, "X") * this.y);
         var3 += 2;
         this.c(var3, var4);
      }

   }

   static {
      String var0 = " 0\n.,?!1@'-_():;&/%*#+<=>\"$[]{}\\~^|\nabc2ä\ndef3\nghi4\njkl5\nmno6ö\npqrs7ß\ntuv8ü\nwxyz9";
      c = bh.a(var0, '\n');
      d = bh.a(var0.toUpperCase(), '\n');
      b = bh.a("Abc\nabc\n123\nABC", '\n');
   }
}
