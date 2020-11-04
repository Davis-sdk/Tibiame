import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class bv {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final int b;
   private final byte[] c;
   private final s d;
   public final int a;
   private final short[] e;
   private final ay f;
   private final j g;
   private final int h;
   private final int i;
   private final int j;
   private final int k;
   private final d[] l;
   private boolean m;
   private int n;
   private int o;
   private byte[] p;
   private int[] q;
   private short[] r;
   private short[] s;
   private byte[] t;
   private int u = 0;
   private int v = 0;
   private int w;
   private int x;
   private byte y = -2;
   private byte z = 0;
   private int A = 0;
   private byte B = 0;
   private int C;
   private int D;
   private int E;
   private int F;
   private short G = -1;
   private int H;
   private int I;
   private byte J;
   private String K = null;

   public bv(s var1, ay var2, int var3, int var4, int var5) {
      if (var1 == null) {
         throw bh.b(944059703);
      } else if (var2 == null) {
         throw bh.b(1378898736);
      } else if ((var3 & 1) != 0 && (var4 & 1) != 0) {
         this.d = var1;
         this.f = var2;
         this.h = var3;
         this.j = var5;
         this.b = this.h >> 1;
         this.a = this.h - var4 >> 1;
         this.i = this.h * this.h;
         this.k = this.j >> 1;
         this.l = new d[151];
         this.g = new j();
         this.s = new short[this.h * this.h * 4];
         this.e = new short[this.h * this.h];
         this.c = new byte[this.h * this.h];
         this.n();
         this.o();
         this.p();
      } else {
         throw bh.b(861296723);
      }
   }

   public int a() {
      return this.b;
   }

   public j b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public int d() {
      return this.j;
   }

   public int e() {
      return this.k;
   }

   public int f() {
      return this.u;
   }

   public int g() {
      return this.w;
   }

   public int h() {
      return this.w + this.u - 1;
   }

   public int i() {
      return this.x;
   }

   public boolean j() {
      return this.e[this.g.r() * this.h + this.g.q()] != -1;
   }

   public void a(byte[] var1) {
      this.a(var1, 0, 0, 0, 1, this.i, true);
   }

   public void a(d var1) {
      this.l[var1.a() ? ++this.o : --this.n] = var1;
      var1.a(this);
   }

   public void a(byte var1) {
      for(int var2 = 0; var2 <= this.o; ++var2) {
         if (this.l[var2] instanceof aa && ((aa)this.l[var2]).m() == var1) {
            if (this.l[var2] != null) {
               this.l[var2].a(false);
            }
            break;
         }
      }

   }

   public aa b(byte var1) {
      int var3;
      for(var3 = 0; var3 <= this.o; ++var3) {
         if (this.l[var3] instanceof aa && ((aa)this.l[var3]).m() == var1) {
            return (aa)this.l[var3];
         }
      }

      aa var2;
      for(var3 = this.n; var3 < 151; ++var3) {
         if (this.l[var3] instanceof aa && ((aa)this.l[var3]).m() == var1) {
            var2 = (aa)this.l[var3];
            var2.a(true);
            return var2;
         }
      }

      var2 = new aa(var1, true);
      this.a((d)var2);
      return var2;
   }

   public int a(int var1) {
      return var1 >= 0 && var1 < this.q.length ? this.q[var1] : 0;
   }

   public int a(int var1, int var2) {
      int var3 = var2 * this.h + var1;
      if (var3 >= 0 && var3 < this.i) {
         var3 = (var3 << 2) + 3;
         int var4;
         if ((var4 = this.a(this.s[var3--])) != -1) {
            return var4;
         } else if ((var4 = this.a(this.s[var3--])) != -1) {
            return var4;
         } else if ((var4 = this.a(this.s[var3--])) != -1) {
            return var4;
         } else {
            return (var4 = this.a(this.s[var3])) != -1 ? var4 : 0;
         }
      } else {
         return 0;
      }
   }

   public byte b(int var1, int var2) {
      int var3 = var2 * this.h + var1 << 2;
      byte var4 = 0;

      for(int var5 = 0; var5 < 4; ++var5) {
         int var6 = this.b(this.s[var3++]);
         if (var6 != -1) {
            var4 = (byte)Math.max(var4, this.t[var6]);
         }
      }

      return var4;
   }

   public d c(int var1, int var2) {
      for(int var3 = this.o; var3 >= 0; --var3) {
         if (this.l[var3] != null && this.l[var3].a(var1, var2)) {
            return this.l[var3];
         }
      }

      return null;
   }

   public void k() {
      for(int var2 = 0; var2 <= this.o; ++var2) {
         if (this.l[var2] != null) {
            this.l[var2].b(false);
         }
      }

      int var1 = this.o + 1;
      if (var1 > 0) {
         System.arraycopy(this.l, 0, this.l, this.n - var1, var1);
         this.n -= var1;
      }

      this.o = -1;
   }

   public void b(d var1) {
      int var2 = 0;
      d var3 = this.l[var2];

      d var4;
      for(var4 = var1; var3 != var1 && var2 < this.l.length; var3 = this.l[var2]) {
         this.l[var2] = var4;
         var4 = var3;
         ++var2;
      }

      this.l[var2] = var4;
   }

   public void d(int var1, int var2) {
      int var3 = -this.g.o() - (this.j - var1 >> 1);
      int var4 = -this.g.p() - (this.j - var2 >> 1);
      this.w = -var3;
      this.x = -var4;
      this.u = var1;
      this.v = var2;
      this.d.a((int)var3, (int)var4, (byte)1);
      ax var9 = this.d.d();
      int var5 = Math.max(0, var9.a / this.j);
      int var6 = Math.max(0, var9.c / this.j);
      int var7 = Math.min(this.h - 1, var9.b / this.j);
      int var8 = Math.min(this.h - 1, var9.d / this.j);
      int var10 = this.h - var7 + var5 - 1;
      int var11 = var6 * this.h + var5;

      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      short var17;
      for(var12 = var6; var12 <= var8; var11 += var10) {
         var14 = var5 * this.j;
         var13 = var12 * this.j;

         for(var15 = var5; var15 <= var7; var14 += this.j) {
            var16 = var11 << 2;
            this.d.b((short)this.s[var16++], var14, var13, 0);
            var17 = this.s[var16++];
            if (var17 != -1) {
               this.d.b((short)var17, var14, var13, 0);
               var17 = this.s[var16++];
               if (var17 != -1) {
                  this.d.b((short)var17, var14, var13, 0);
                  var17 = this.s[var16];
                  if (var17 != -1) {
                     this.d.b((short)var17, var14, var13, 0);
                  }
               }
            }

            if (this.e[var11] != -1) {
               this.d.b((short)this.e[var11], var14, var13, 0);
            }

            ++var15;
            ++var11;
         }

         ++var12;
      }

      for(var12 = 0; var12 <= this.o; ++var12) {
         if (this.l[var12] instanceof aa) {
            aa var18 = (aa)this.l[var12];
            var14 = var18.q();
            var15 = var18.r();
            if (var14 >= 0 && var14 < this.h && var15 >= 0 && var15 < this.h) {
               ++this.c[var15 * this.h + var14];
            }
         }
      }

      for(var12 = 0; var12 <= this.o; ++var12) {
         if (this.l[var12] != null) {
            this.l[var12].a(this.d, (byte)0);
         }
      }

      var11 = var6 * this.h + var5;

      for(var12 = var6; var12 <= var8; var11 += var10) {
         var14 = var5 * this.j;
         var13 = var12 * this.j;

         for(var15 = var5; var15 <= var7; var14 += this.j) {
            var16 = var11 << 2;
            if (this.t[this.b(this.s[var16])] == 1) {
               this.d.b((short)this.s[var16], var14, var13, 0);
            }

            ++var16;
            var17 = this.s[var16];
            if (var17 != -1) {
               if (this.t[this.b(this.s[var16])] == 1) {
                  this.d.b((short)var17, var14, var13, 0);
               }

               ++var16;
               var17 = this.s[var16];
               if (var17 != -1) {
                  if (this.t[this.b(this.s[var16])] == 1) {
                     this.d.b((short)var17, var14, var13, 0);
                  }

                  ++var16;
                  var17 = this.s[var16];
                  if (var17 != -1 && this.t[this.b(this.s[var16])] == 1) {
                     this.d.b((short)var17, var14, var13, 0);
                  }
               }
            }

            ++var15;
            ++var11;
         }

         ++var12;
      }

      for(var12 = 0; var12 <= this.o; ++var12) {
         if (this.l[var12] != null) {
            this.l[var12].a(this.d, (byte)1);
            this.l[var12].a(this.d, (byte)2);
         }
      }

      var12 = 0;

      for(var13 = 0; var12 < this.h; ++var12) {
         for(var14 = 0; var14 < this.h; ++var13) {
            if (this.c[var13] > 1) {
               this.d.a(this.d.a((int)16), var14 * this.j + 15, var12 * this.j);
            }

            this.c[var13] = 0;
            ++var14;
         }
      }

      if (this.y != -2) {
         if (this.y == -1) {
            this.d.b((short)this.G, (this.E + this.g.q()) * this.j, (this.F + this.g.r()) * this.j, 0);
         } else {
            this.d.a(this.G, this.C + var9.a, this.D + var9.c);
         }
      }

      this.d.a((int)(-var3), (int)(-var4), (byte)1);
      this.d.b();
   }

   public void c(d var1) {
      int var2 = this.e(var1);
      if (var2 == this.o) {
         this.l[this.o--] = null;
      } else if (var2 < this.o) {
         this.l[var2] = this.l[this.o];
         this.l[this.o--] = null;
      } else if (var2 == this.n) {
         this.l[this.n++] = null;
      } else if (var2 > this.n) {
         this.l[var2] = this.l[this.n];
         this.l[this.n++] = null;
      }

   }

   public void a(int var1, int var2, short var3) {
      this.e[var2 * this.h + var1] = this.d.c(var3);
   }

   public void a(int var1, int var2, byte var3, String var4) {
      if (this.f.c((byte)16) == null || this.f.a((byte)16)) {
         this.H = var1;
         this.I = var2;
         this.J = var3;
         this.K = var4;
         this.z = 61;
         this.l();
      }

   }

   public void a(int var1, int var2, byte[] var3, int var4) {
      this.a(var3, var4, var1, var2, 0, 1, false);
   }

   public void a(byte var1, byte[] var2) {
      this.c(var1);
      switch(var1) {
      case 0:
         this.a(var2, 0, 0, 0, 1, this.h, true);
         break;
      case 1:
         this.a(var2, 0, this.h - 1, 0, this.h, this.h, true);
         break;
      case 2:
         this.a(var2, 0, 0, this.h - 1, 1, this.h, true);
         break;
      case 3:
         this.a(var2, 0, 0, 0, this.h, this.h, true);
         break;
      default:
         throw bh.a(1246179906);
      }

   }

   public void d(d var1) {
      this.c(var1);
      this.a(var1);
   }

   public void l() {
      String var1 = null;
      this.y = -2;
      if (this.H != 0 && this.u > 0) {
         int var2 = this.H - this.g.i();
         int var3 = var2 > 0 ? var2 : -var2;
         int var4 = this.I - this.g.j();
         int var5 = var4 > 0 ? var4 : -var4;
         int var6 = var3 + var5;
         int var7 = this.J - this.g.k();
         if (this.K != null && this.K.length() > 0) {
            var1 = ci.a.d().a((short)4102, new Object[]{this.K});
         } else {
            var1 = "";
         }

         if (var7 != 0) {
            var1 = var1 + "\n";
            var1 = var1 + ci.a.d().a((short)4101, new Object[]{var7 > 0 ? bh.g(var7) : bh.g(-var7)});
            var1 = var1 + ci.a.d().a((short)(var7 > 0 ? 4099 : 4100));
         }

         if (var2 < -3 && var4 < -3) {
            this.y = 7;
         } else if (var3 <= 3 && var4 < -3) {
            this.y = 0;
         } else if (var2 > 3 && var4 < -3) {
            this.y = 4;
         } else if (var2 < -3 && var5 <= 3) {
            this.y = 3;
         } else if (var3 <= 3 && var5 <= 3) {
            if (var7 == 0) {
               if (var6 < 2) {
                  this.y = -2;
                  this.H = this.I = this.J = 0;
                  this.K = null;
                  ci.a.c((short)4025).b(0).b(0).a((byte)0).a((Object)null).e();
                  var1 = ci.a.d().a((short)4097);
                  this.a(var1);
                  return;
               }

               this.y = -1;
            } else if (var2 < 0 && var4 < 0) {
               this.y = 7;
            } else if (var2 == 0 && var4 < 0) {
               this.y = 0;
            } else if (var2 > 0 && var4 < 0) {
               this.y = 4;
            } else if (var2 < 0 && var4 == 0) {
               this.y = 3;
            } else {
               if (var2 == 0 && var4 == 0) {
                  this.y = -2;
                  this.a(var1);
                  return;
               }

               if (var2 > 0 && var4 == 0) {
                  this.y = 1;
               } else if (var2 < 0 && var4 > 0) {
                  this.y = 6;
               } else if (var2 == 0 && var4 > 0) {
                  this.y = 2;
               } else if (var2 > 0 && var4 > 0) {
                  this.y = 5;
               }
            }
         } else if (var2 > 3 && var5 <= 3) {
            this.y = 1;
         } else if (var2 < -3 && var4 > 3) {
            this.y = 6;
         } else if (var3 <= 3 && var4 > 3) {
            this.y = 2;
         } else if (var2 > 3 && var4 > 3) {
            this.y = 5;
         }

         var1 = var1 + "\n";
         var1 = var1 + ci.a.d().a((short)4098, new Object[]{bh.g(var6)});
         ++this.z;
         if (this.z > 60 || Math.abs(this.A - var6) > 4 || this.g.k() != this.B) {
            this.a(var1);
         }

         int var11 = 0 + this.u / 2;
         int var12 = 0 + this.u - 12 - 2;
         int var13 = 0 + this.v / 2;
         int var14 = 0 + this.v - 12 - 2;
         int var15 = var14 - 25;
         switch(this.y) {
         case -1:
            this.E = var2;
            this.F = var4;
            this.G = this.d.a("DirectionTarget");
            break;
         case 0:
            this.C = var11;
            this.D = 2;
            this.G = this.d.a("DirectionNorth");
            break;
         case 1:
            this.C = var12;
            this.D = var13;
            this.G = this.d.a("DirectionEast");
            break;
         case 2:
            this.C = var11;
            this.D = var14;
            this.G = this.d.a("DirectionSouth");
            break;
         case 3:
            this.C = 2;
            this.D = var13;
            this.G = this.d.a("DirectionWest");
            break;
         case 4:
            this.C = var12;
            this.D = 2;
            this.G = this.d.a("DirectionNorthEast");
            break;
         case 5:
            this.C = var12;
            this.D = var15;
            this.G = this.d.a("DirectionSouthEast");
            break;
         case 6:
            this.C = 2;
            this.D = var15;
            this.G = this.d.a("DirectionSouthWest");
            break;
         case 7:
            this.C = 2;
            this.D = 2;
            this.G = this.d.a("DirectionNorthWest");
         }

         this.A = var6;
         this.B = this.g.k();
      }

   }

   private void a(String var1) {
      if (var1 != null) {
         ci.a.a(var1, true, false);
      }

      this.z = 0;
   }

   public void b(int var1) {
      for(int var2 = 0; var2 <= this.o; ++var2) {
         if (this.l[var2] != null) {
            this.l[var2].a(var1);
         }
      }

   }

   public void m() {
      int var1;
      for(var1 = 0; var1 <= this.o; ++var1) {
         if (this.l[var1] != null) {
            this.l[var1].b();
            this.l[var1] = null;
         }
      }

      for(var1 = this.n; var1 < 151; ++var1) {
         if (this.l[var1] != null) {
            this.l[var1].b();
            this.l[var1] = null;
         }
      }

      this.m = true;
   }

   private void n() {
      int var1;
      for(var1 = 0; var1 < 151; ++var1) {
         this.l[var1] = null;
      }

      this.o = -1;
      this.n = 151;

      for(var1 = 0; var1 < this.e.length; ++var1) {
         this.e[var1] = -1;
      }

      this.a((d)this.g);
   }

   private int a(short var1) {
      int var2 = this.b(var1);
      return var2 == -1 ? -1 : this.p[var2];
   }

   private int b(short var1) {
      int var2 = 0;
      int var3 = this.r.length;

      while(var2 < var3) {
         int var5 = var2 + var3 >> 1;
         short var4 = this.r[var5];
         if (var4 == var1) {
            return var5;
         }

         if (var1 < var4) {
            var3 = var5;
         } else {
            var2 = var5;
         }
      }

      return -1;
   }

   private int e(d var1) {
      int var2;
      for(var2 = 0; var2 <= this.o; ++var2) {
         if (this.l[var2] == var1) {
            return var2;
         }
      }

      for(var2 = this.n; var2 <= 151; ++var2) {
         if (this.l[var2] == var1) {
            return var2;
         }
      }

      throw bh.a(1245923128);
   }

   private void o() {
      int var1 = this.f.b();
      short[][] var2 = new short[var1][];
      byte[][] var3 = new byte[var1][];
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < var1; ++var5) {
         byte var6 = (byte)this.f.b(var5).b;

         try {
            InputStream var7 = this.f.b((int)var6, "minimap.dat");
            if (var7 != null) {
               DataInputStream var8 = new DataInputStream(var7);

               try {
                  this.q = new int[var8.readUnsignedByte()];
                  byte[] var9 = new byte[var8.readUnsignedByte()];
                  if (var8.readUnsignedByte() > 0) {
                     bh.a((byte)2, 1127495477, (String)String.valueOf(var6));
                  }

                  int var10;
                  for(var10 = 0; var10 < this.q.length; ++var10) {
                     this.q[var10] = var8.readInt();
                  }

                  var2[var5] = new short[var9.length];
                  var3[var5] = new byte[var9.length];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     short var11 = this.d.d((short)(var6 << 8 | var10 + 1));
                     if (var11 == -1) {
                        throw bh.a(1179802197, var6 + "-" + var10);
                     }

                     var2[var5][var10] = var11;
                     var3[var5][var10] = var8.readByte();
                  }

                  var4 += var9.length;
               } finally {
                  var8.close();
               }
            }
         } catch (IOException var16) {
            bh.a((byte)1, 945172790, var5 + "/" + var6, var16);
         }
      }

      this.r = new short[var4];
      this.p = new byte[var4];
      var5 = var2.length - 1;

      int var17;
      for(var17 = 0; var5 >= 0; --var5) {
         if (var2[var5] != null) {
            System.arraycopy(var2[var5], 0, this.r, var17, var2[var5].length);
            System.arraycopy(var3[var5], 0, this.p, var17, var3[var5].length);
            var17 += var2[var5].length;
         }
      }

      for(var5 = 0; var5 < this.r.length; ++var5) {
         for(var17 = var5 + 1; var17 < this.r.length; ++var17) {
            if (this.r[var5] > this.r[var17]) {
               short[] var10000 = this.r;
               var10000[var5] ^= this.r[var17];
               var10000 = this.r;
               var10000[var17] ^= this.r[var5];
               var10000 = this.r;
               var10000[var5] ^= this.r[var17];
               byte[] var18 = this.p;
               var18[var5] ^= this.p[var17];
               var18 = this.p;
               var18[var17] ^= this.p[var5];
               var18 = this.p;
               var18[var5] ^= this.p[var17];
            }
         }
      }

   }

   private void p() {
      byte[] var1 = new byte[]{1, 2, 3, 4};
      String[] var2 = new String[]{"drawlast.dat", "unpassable.dat", "shops.dat", "fadeout.dat"};
      int var3 = this.f.b();
      this.t = new byte[this.r.length];

      for(int var4 = 0; var4 < var3; ++var4) {
         byte var5 = (byte)this.f.b(var4).b;

         for(int var6 = 0; var6 < var1.length; ++var6) {
            try {
               InputStream var7 = this.f.b((int)var5, var2[var6]);
               if (var7 != null) {
                  DataInputStream var8 = new DataInputStream(var7);

                  try {
                     int var9 = var8.readUnsignedByte();

                     for(int var10 = 0; var10 < var9; ++var10) {
                        short var12 = (short)(var8.readByte() & 255);
                        short var13 = (short)(var5 << 8 | var12);
                        int var11 = this.b(this.d.d(var13));
                        if (var11 != -1) {
                           this.t[var11] = (byte)Math.max(this.t[var11], var1[var6]);
                        }
                     }
                  } finally {
                     var8.close();
                  }
               }
            } catch (IOException var18) {
               throw bh.b(1513108793, var5 + "/" + var2[var6]);
            }
         }
      }

   }

   private void c(byte var1) {
      byte var2 = ci.b[var1 + 1];
      byte var3 = ci.b[var1];
      int var4 = var3 * this.h + var2;
      int var5;
      if (var4 < 0) {
         var5 = this.h * this.h + var4;
         System.arraycopy(this.s, -var4 * 4, this.s, 0, var5 * 4);
         System.arraycopy(this.e, -var4, this.e, 0, var5);
      } else {
         var5 = this.h * this.h - var4;
         System.arraycopy(this.s, 0, this.s, var4 * 4, var5 * 4);
         System.arraycopy(this.e, 0, this.e, var4, var5);
      }

      int var6;
      for(var6 = 0; var6 <= this.o; ++var6) {
         if (this.l[var6] != null) {
            this.l[var6].a(var2, var3);
         }
      }

      for(var6 = 0; var6 <= this.o; ++var6) {
         if (this.l[var6] instanceof aa) {
            aa var7 = (aa)this.l[var6];
            if (var7.q() < 0 || var7.q() >= this.h || var7.r() < 0 || var7.r() >= this.h) {
               var7.a(false);
            }
         }
      }

   }

   private void a(byte[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var4 * this.h + var3 << 2;
      boolean var9 = false;
      int var10 = var2;

      for(int var11 = var1.length - 1; var10 < var11; var10 += 2) {
         short var12 = (short)(var1[var10] << 8 | (short)(var1[var10 + 1] & 255));
         if (var12 != 0) {
            if (!var9) {
               this.s[var8++] = this.d.d(var12);
               if ((var8 & 3) == 0) {
                  var9 = true;
               }
            }
         } else {
            while((var8 & 3) != 0) {
               this.s[var8++] = -1;
            }

            var9 = false;
            if (var7 && var8 > 0) {
               this.e[var8 - 1 >> 2] = -1;
            }

            var8 += var5 - 1 << 2;
            --var6;
            if (var6 <= 0 || var8 >= this.i << 2) {
               break;
            }
         }
      }

   }
}
