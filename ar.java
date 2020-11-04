import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class ar implements s {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private static final byte[] a = new byte[]{5, 9, 20};
   private final ay b;
   private final av c;
   private ax d;
   private ax[] e;
   private int f;
   private ax g;
   private String[] h;
   private int i;
   private volatile boolean j;
   private volatile boolean k;
   private short[] l;
   private String[] m;
   private short[] n;
   private int o;
   private short[] p;
   private ax q;
   private int r;
   private int s;
   private int t;

   protected ar(ay var1) {
      this.b = var1;
      this.e = new ax[32];
      int var2 = 0;

      for(int var3 = this.e.length; var2 < var3; ++var2) {
         this.e[var2] = new ax();
      }

      this.f = -1;
      this.d = new ax();
      this.g = new ax();
      this.q = new ax();
      this.c = new av(2084);
      this.i = 6;
   }

   public void a() {
      this.r = (int)(System.currentTimeMillis() / 1000L % 65535L);
      if (this.r < 0) {
         this.r += 65535;
      }

      if (this.k) {
         this.k = false;
         this.m();
      }

      this.a((int)0, (int)0, (byte)0);
      this.d.a(0, 0, this.f(), this.e());
      this.a(this.d, (byte)1);
   }

   public final boolean a(int var1, int var2, int var3, int var4, byte var5) {
      return this.a(this.q.a(var1, var2, var3, var4), var5);
   }

   public final boolean a(ax var1, byte var2) {
      if (var2 == 0) {
         this.d.c(var1);
      } else {
         this.d.a(var1);
      }

      if (this.d.a()) {
         return false;
      } else {
         this.b(this.d);
         return true;
      }
   }

   public abstract bc a(int var1, int var2);

   public final void b() {
      this.g.b(this.q.a(this.d.a + this.s, this.d.c + this.t, this.d.d(), this.d.b()));
   }

   public abstract void a(int var1, int var2, int var3, int var4, int var5);

   public abstract void b(int var1, int var2, int var3, int var4, int var5);

   public abstract void c(int var1, int var2, int var3, int var4, int var5);

   public final void a(short var1, int var2, int var3, int var4) {
      if (var4 == 0) {
         this.b(var1, var2, var3);
      } else {
         this.b(var1, c(var2, this.b(var1), var4), c(var3, this.a(var1), 0, var4));
      }

   }

   public final void b(short var1, int var2, int var3, int var4) {
      if (var4 == 0) {
         this.a(var1, var2, var3);
      } else {
         this.a(var1, c(var2, this.b(var1), var4), c(var3, this.a(var1), 0, var4));
      }

   }

   public void b(short var1, int var2, int var3) {
      if (var1 != -1) {
         if (var1 >= 0) {
            int var8 = var1 << 2;
            int var4 = this.p[var8++] & '\uffff';
            int var5 = (this.p[var8++] & '\uffff') * var4;
            int var6 = (this.p[var8++] & '\uffff') * var4;
            int var7 = this.p[var8] & '\uffff';
            int var9 = (var7 << 1) + 1;
            if (this.n[var9] == -1) {
               this.i(var7);
            } else {
               this.n[var9] = (short)this.r;
            }

            this.a(var2, var3, var7, var5, var6, var4);
         } else {
            this.a(var2, var3, -var1 - 2);
         }

      }
   }

   public void a(short var1, int var2, int var3) {
      if (var1 != -1) {
         if (var1 >= 0) {
            int var8 = var1 << 2;
            int var4 = this.p[var8++] & '\uffff';
            int var5 = (this.p[var8++] & '\uffff') * var4;
            int var6 = (this.p[var8++] & '\uffff') * var4;
            int var7 = this.p[var8] & '\uffff';
            int var9 = (var7 << 1) + 1;
            if (this.n[var9] == -1) {
               this.i(var7);
            } else {
               this.n[var9] = (short)this.r;
            }

            this.b(var2, var3, var7, var5, var6, var4);
         } else {
            this.b(var2, var3, -var1 - 2);
         }

      }
   }

   public abstract void b(byte var1, char[] var2, int var3, int var4, int var5, int var6, int var7);

   public abstract void a(byte var1, String var2, int var3, int var4, int var5, int var6, int var7);

   public final void a(byte var1, String var2, int var3, int var4, int var5) {
      this.a(var1, (String)var2, 0, var2.length(), var3, var4, var5);
   }

   public final void a(byte var1, String var2, int var3, int var4, int var5, int var6) {
      if (var6 == 0) {
         this.a(var1, (String)var2, 0, var2.length(), var3, var4, var5);
      } else {
         this.a(var1, (String)var2, 0, var2.length(), var3, c(var4, this.a((byte)0, (byte)var1, (String)var2, 0, var2.length()), var6), c(var5, this.a((byte)2, (byte)var1), this.a((byte)3, (byte)var1), var6));
      }

   }

   public final void a(byte var1, char[] var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = this.b((byte)3, (byte)var1);
      int var9 = var3;
      int var10 = var3;

      while(true) {
         while(var10 >= var3 + var4 || cg.b(var2[var10])) {
            if (var10 > var9) {
               this.b(var1, var2, var9, var10 - var9, var5, var6, var7);
               var6 += this.a((byte)1, (byte)var1, (char[])var2, var9, var10 - var9);
            }

            if (var10 >= var3 + var4) {
               return;
            }

            short var11 = this.a(cg.a(var2[var10]));
            ++var6;
            this.b((short)var11, var6, var7 + var8, 8);
            ++var6;
            var6 += this.b(var11);
            ++var10;
            var9 = var10;
         }

         ++var10;
      }
   }

   public abstract void a(int var1, int var2, int var3, int var4);

   public final void c() {
      if (!this.g.a()) {
         this.a(this.g);
         this.g.c();
      }

   }

   public final ax d() {
      return this.d;
   }

   public abstract int e();

   public final int a(short var1) {
      if (var1 == -1) {
         return 1;
      } else {
         return var1 >= 0 ? this.p[var1 << 2] : this.d(-var1 - 2);
      }
   }

   public final int b(short var1) {
      if (var1 == -1) {
         return 1;
      } else {
         return var1 >= 0 ? this.p[var1 << 2] : this.e(-var1 - 2);
      }
   }

   public abstract int a(byte var1, byte var2, char[] var3, int var4, int var5);

   public abstract int a(byte var1, byte var2, String var3, int var4, int var5);

   public abstract int a(byte var1, byte var2);

   public final int a(byte var1, char[] var2, int var3, int var4) {
      int var5 = 0;
      int var6 = var3;
      int var7 = var3;

      while(true) {
         while(var7 >= var3 + var4 || cg.b(var2[var7])) {
            if (var7 > var6) {
               var5 += this.a((byte)1, (byte)var1, (char[])var2, var6, var7 - var6);
            }

            if (var7 >= var3 + var4) {
               return var5;
            }

            var5 += 2;
            var5 += this.b(this.a(cg.a(var2[var7])));
            ++var7;
            var6 = var7;
         }

         ++var7;
      }
   }

   public final int a(byte var1, String var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;

      while(true) {
         while(var5 >= var2.length() || cg.b(var2.charAt(var5))) {
            if (var5 > var4) {
               var3 += this.a((byte)1, (byte)var1, (String)var2, var4, var5 - var4);
            }

            if (var5 >= var2.length()) {
               return var3;
            }

            var3 += 2;
            var3 += this.b(this.a(cg.a(var2.charAt(var5))));
            ++var5;
            var4 = var5;
         }

         ++var5;
      }
   }

   public final int b(byte var1, byte var2) {
      return this.a(var1, var2);
   }

   public abstract int f();

   public final boolean b(int var1, int var2, int var3, int var4) {
      return this.d.d(this.q.a(var1, var2, var3, var4));
   }

   public final boolean g() {
      if (this.j) {
         this.j = false;
         return true;
      } else {
         return false;
      }
   }

   public abstract al a(InputStream var1);

   public final s h() {
      if (this.f < 0) {
         throw bh.a(1481781832);
      } else {
         this.b(this.d.a(this.e[this.f]));
         --this.f;
         return this;
      }
   }

   public s i() {
      if (this.f + 1 >= 32) {
         throw bh.a(1296128564);
      } else {
         ++this.f;
         this.e[this.f].a(this.d);
         return this;
      }
   }

   public final void j() {
      this.k = true;
   }

   public short a(short var1, byte var2, byte var3) {
      byte var4 = this.a((byte)(var1 >> 8));
      if (var4 == -1) {
         return -1;
      } else {
         int var6 = var4 * 9 + 2;
         int var5 = this.l[var6] + 3 * (((var1 & 255) - 1 << 2 & 1020) + var2) + var3;
         return var5 >= this.l[var6 + 1] ? -1 : (short)var5;
      }
   }

   public short c(byte var1, byte var2) {
      byte var3 = this.a((byte)2);
      if (var3 == -1) {
         return -1;
      } else {
         int var5 = var3 * 9 + 4;
         int var4 = this.l[var5] + (var1 << 2 & 1020) + (var2 & 255);
         return var4 >= this.l[var5 + 1] ? -1 : (short)var4;
      }
   }

   public short a(String var1) {
      if (var1 != null && this.h != null) {
         for(int var2 = 0; var2 < this.h.length; ++var2) {
            if (var1.equals(this.h[var2])) {
               return (short)(-var2 - 2);
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public short c(short var1) {
      byte var2 = this.a((byte)(var1 >> 8));
      if (var2 == -1) {
         return -1;
      } else {
         int var4 = var2 * 9 + 3;
         int var3 = this.l[var4] + (var1 & 255) - 1;
         return var3 >= this.l[var4 + 1] ? -1 : (short)var3;
      }
   }

   public short a(int var1) {
      if (var1 < 0) {
         return -1;
      } else {
         byte var2 = this.a((byte)1);
         if (var2 == -1) {
            return -1;
         } else {
            int var4 = var2 * 9 + 5;
            int var3 = this.l[var4] + (var1 & 255);
            return var3 >= this.l[var4 + 1] ? -1 : (short)var3;
         }
      }
   }

   public short b(int var1) {
      if (var1 < 0) {
         return -1;
      } else {
         byte var2 = this.a((byte)2);
         if (var2 == -1) {
            return -1;
         } else {
            int var4 = var2 * 9 + 7;
            int var3 = this.l[var4] + (var1 & 255);
            return var3 >= this.l[var4 + 1] ? -1 : (short)var3;
         }
      }
   }

   public short f(int var1) {
      if (var1 < 0) {
         return -1;
      } else {
         byte var2 = this.a((byte)2);
         if (var2 == -1) {
            return -1;
         } else {
            int var4 = var2 * 9 + 6;
            int var3 = this.l[var4] + (var1 & 255) - 1;
            return var3 >= this.l[var4 + 1] ? -1 : (short)var3;
         }
      }
   }

   public short d(short var1) {
      byte var2 = this.a((byte)(var1 >> 8));
      if (var2 == -1) {
         return -1;
      } else {
         int var4 = var2 * 9 + 1;
         int var3 = this.l[var4] + (var1 & 255) - 1;
         return var3 >= this.l[var4 + 1] ? -1 : (short)var3;
      }
   }

   public final void a(int var1, int var2, byte var3) {
      if (var3 == 0) {
         var1 -= this.s;
         var2 -= this.t;
      }

      this.c(var1, var2);
      this.s += var1;
      this.t += var2;
      this.d.a(this.d.a - var1, this.d.c - var2, this.d.d(), this.d.b());
   }

   protected abstract void c(int var1);

   protected abstract void a(int var1, int var2, int var3);

   protected abstract void b(int var1, int var2, int var3);

   protected abstract void a(int var1, int var2, int var3, int var4, int var5, int var6);

   protected abstract void b(int var1, int var2, int var3, int var4, int var5, int var6);

   protected abstract void a(ax var1);

   protected abstract int d(int var1);

   protected abstract int e(int var1);

   protected abstract void b(int var1, int var2);

   protected abstract void a(int var1, int var2, byte[] var3, int var4, int var5);

   protected abstract void b(ax var1);

   protected abstract void c(int var1, int var2);

   private static int c(int var0, int var1, int var2) {
      int var3;
      if ((var2 & 4) != 0) {
         var3 = var0 - var1 + 1;
      } else if ((var2 & 1) != 0) {
         var3 = var0 - (var1 >> 1);
      } else {
         var3 = var0;
      }

      return var3;
   }

   private static int c(int var0, int var1, int var2, int var3) {
      int var4;
      if ((var3 & 8) != 0) {
         var4 = var0 - var1 + 1;
      } else if ((var3 & 2) != 0) {
         var4 = var0 - (var1 >> 1);
      } else if ((var3 & 16) != 0) {
         var4 = var0 - var2;
      } else if ((var3 & 32) != 0) {
         var4 = var0 - (var2 >>> 1);
      } else {
         var4 = var0;
      }

      return var4;
   }

   private static byte g(int var0) {
      switch(var0) {
      case 0:
         return 2;
      case 1:
      default:
         throw bh.b(844313163, String.valueOf(var0));
      case 2:
         return 1;
      case 3:
         return 3;
      case 4:
         return 4;
      case 5:
         return 5;
      case 6:
         return 6;
      case 7:
         return 7;
      }
   }

   private static int d(int var0, int var1) {
      for(int var2 = 0; var2 < a.length; ++var2) {
         int var3 = a[var2] & 255;
         if (var3 == var0 && var3 == var1) {
            return var2;
         }
      }

      throw bh.a(1246905941);
   }

   private byte a(byte var1) {
      for(int var2 = 0; var2 < this.l.length; var2 += 9) {
         if (this.l[var2 + 0] == var1) {
            return (byte)(var2 / 9);
         }
      }

      return -1;
   }

   private int h(int var1) {
      if (var1 < this.r) {
         return this.r - var1;
      } else {
         return var1 == this.r ? 0 : '\uffff' - var1 + this.r;
      }
   }

   private void k() {
      InputStream var1 = this.b.b((int)1, "images.dat");
      if (var1 == null) {
         this.h = null;
         this.b((int)0, (int)0);
      } else {
         DataInputStream var2 = new DataInputStream(var1);

         try {
            int var3 = var2.readUnsignedByte();
            int[] var4 = new int[var3];
            this.h = new String[var3];
            this.b((int)0, (int)var3);

            int var5;
            for(var5 = 0; var5 < var3; ++var5) {
               String var6 = bh.a(var2);
               var4[var5] = var2.readUnsignedShort();
               this.h[var5] = var6;
            }

            for(var5 = 0; var5 < var3; ++var5) {
               this.c.a(var2);
               this.a((int)0, (int)var5, (byte[])this.c.a(), 0, this.c.b());
            }
         } finally {
            var2.close();
         }
      }

   }

   private void i(int var1) {
      try {
         int var5;
         while(this.o >= this.i) {
            var5 = -1;
            boolean var6 = false;
            int var7 = 0;
            int var8 = 0;

            for(int var9 = this.n.length / 2; var8 < var9; ++var8) {
               int var10 = this.n[var8 * 2 + 1] & '\uffff';
               if (var10 != 65535) {
                  int var11 = this.h(var10);
                  if (var5 == -1 || var11 > var7) {
                     var5 = var8;
                     var7 = var11;
                  }
               }
            }

            if (var7 <= 8) {
               ++this.i;
            } else {
               this.c(var5);
               this.n[var5 * 2 + 1] = -1;
               --this.o;
            }
         }

         char var3 = this.m[var1].charAt(0);
         String var4 = this.m[var1].substring(1);
         InputStream var2 = this.b.a((int)var3, var4);

         try {
            var5 = this.n[var1 * 2] & '\uffff';

            while(true) {
               if (var5 <= 0) {
                  this.c.a(var2);
                  break;
               }

               var5 -= (int)var2.skip((long)var5);
            }
         } finally {
            var2.close();
         }

         this.a((int)1, (int)var1, (byte[])this.c.a(), 0, this.c.b());
         this.n[var1 * 2 + 1] = (short)this.r;
         ++this.o;
         if (bh.a((byte)0)) {
            bh.a((byte)0, 1261786436, (String)(String.valueOf(var1) + '+'));
         }

      } catch (IOException var16) {
         throw bh.a(1346580811, (Throwable)var16);
      }
   }

   private void l() {
      int var1 = this.b.b();
      this.l = new short[var1 * 9];
      short[][] var2 = new short[var1][];
      String[][] var3 = new String[var1][];
      short[][] var4 = new short[var1][];
      short var5 = 0;
      int var6 = 0;

      int var7;
      int var8;
      for(var7 = 0; var7 < var1; ++var7) {
         var8 = var7 * 9;
         byte var9 = (byte)this.b.b(var7).b;
         this.l[var8 + 0] = (short)var9;
         InputStream var10 = this.b.b(this.b.b(var7).b, "sprites.dat");
         int var12;
         if (var10 == null) {
            for(var12 = 1; var12 < 9; ++var12) {
               this.l[var8 + var12] = var5;
            }
         } else {
            DataInputStream var11 = new DataInputStream(var10);

            try {
               int var13 = 0;

               int var15;
               for(int var14 = var11.readUnsignedByte(); var13 < var14; ++var13) {
                  var15 = var11.readUnsignedByte();
                  int var16 = var11.readUnsignedShort();
                  this.l[var8 + g(var15)] = (short)var16;
               }

               for(var13 = 1; var13 < 9; ++var13) {
                  short var21 = this.l[var8 + var13];
                  this.l[var8 + var13] = var5;
                  var5 += var21;
               }

               var2[var7] = new short[(this.l[var8 + 9 - 1] - this.l[var8 + 0 + 1]) * 4];
               var12 = var11.readUnsignedByte();
               var6 += var12;
               var3[var7] = new String[var12];
               var4[var7] = new short[var12 * 2];

               for(var13 = 0; var13 < var12; ++var13) {
                  String var22 = bh.a(var11);
                  var15 = var11.readUnsignedShort();
                  var3[var7][var13] = (char)var9 + var22;
                  var4[var7][var13 * 2] = (short)var15;
                  var4[var7][var13 * 2 + 1] = -1;
                  this.a(var11, var7, var2[var7], var6 - var12 + var13);
               }
            } finally {
               var11.close();
            }
         }
      }

      if (this.l.length > 0) {
         this.p = new short[this.l[this.l.length - 1] * 4];
         var7 = 0;

         for(var8 = 0; var7 < var2.length; ++var7) {
            if (var2[var7] != null) {
               System.arraycopy(var2[var7], 0, this.p, var8, var2[var7].length);
               var8 += var2[var7].length;
            }
         }

         this.m = new String[var6];
         this.n = new short[var6 * 2];
         var7 = 0;

         for(var8 = 0; var7 < var3.length; ++var7) {
            if (var3[var7] != null) {
               int var20 = var3[var7].length;
               System.arraycopy(var3[var7], 0, this.m, var8, var20);
               System.arraycopy(var4[var7], 0, this.n, var8 * 2, var20 * 2);
               var8 += var20;
            }
         }
      } else {
         this.p = null;
         this.m = null;
         this.n = null;
      }

      this.b((int)1, (int)var6);
   }

   private void a(DataInputStream var1, int var2, short[] var3, int var4) {
      int var5 = var1.readByte() & 255;
      int var6 = d(var1.readByte() & 255, var1.readByte() & 255);
      int var7 = var1.readByte() & 255;
      int var8 = a[var6] & 255;
      int var10 = 0;
      int var9 = 0;

      for(int var11 = 0; var11 < var5; ++var11) {
         int var12 = var1.readUnsignedByte();
         int var13 = var1.readUnsignedByte();

         for(int var14 = 0; var14 < var13; ++var14) {
            int var15 = var1.readUnsignedShort();
            int var16 = var1.readUnsignedByte();

            for(int var17 = 0; var17 < var16; ++var17) {
               int var18 = var2 * 9 + g(var12);
               int var19 = this.l[var18] + var15;
               if (var19 >= this.l[var18 + 1]) {
                  throw bh.a(1160918599);
               }

               int var20 = (var19 - this.l[var2 * 9 + 0 + 1]) * 4;
               var3[var20++] = (short)var8;
               var3[var20++] = (short)var10;
               var3[var20++] = (short)var9;
               var3[var20] = (short)var4;
               ++var15;
               ++var10;
               if (var10 >= var7) {
                  var10 = 0;
                  ++var9;
               }
            }
         }
      }

   }

   private void m() {
      this.r = 0;

      try {
         this.l();
      } catch (IOException var3) {
         bh.a(910842433, (Throwable)var3);
      }

      try {
         this.k();
         this.j = true;
      } catch (IOException var2) {
         bh.a(1195721287, (Throwable)var2);
      }

   }

   public short a(short var1, short var2, short var3) {
      if (var1 == 0) {
         return -1;
      } else {
         try {
            byte var4 = this.a((byte)var3);
            boolean var6 = true;
            int var5;
            short var8;
            switch(var1) {
            case 1:
               var5 = var4 * 9 + 1;
               var8 = (short)(this.l[var5] + (var2 & 255) - 1);
               break;
            case 2:
               var5 = var4 * 9 + 3;
               var8 = (short)(this.l[var5] + var2 - 1);
               break;
            case 3:
               var5 = var4 * 9 + 2;
               var8 = (short)(this.l[var5] + 3 * (((var2 & 255) - 1 << 2 & 1020) + 2) + 0);
               break;
            case 4:
               var8 = this.f(var2);
               break;
            case 5:
               var8 = this.c((byte)((byte)var2), (byte)2);
               break;
            default:
               var8 = -1;
            }

            return var8;
         } catch (Exception var7) {
            return -1;
         }
      }
   }
}
