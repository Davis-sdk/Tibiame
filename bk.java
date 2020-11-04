import java.io.DataInputStream;
import java.io.OutputStream;

public final class bk {
   static final int MBOOSTER_MAX_INSTANCES = 16;
   private final byte[] a;
   private final int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;

   public bk(int var1) {
      int var2;
      for(var2 = 2; var2 < var1; var2 <<= 1) {
      }

      this.a = new byte[var2];
      this.b = var2 - 1;
      this.e = this.h = 0;
      this.g = var1;
   }

   public final byte[] a() {
      return this.a;
   }

   public final int b() {
      int var1 = this.i;
      this.i = 0;
      return var1;
   }

   public final int c() {
      return this.j;
   }

   public static int a(String var0) {
      int var1 = var0.length() + 1;
      if (var1 >= 256) {
         var1 += 2;
      }

      return var1;
   }

   public static int a(String var0, int var1) {
      if (var0.length() > var1) {
         var0 = var0.substring(0, var1);
      }

      return a(var0);
   }

   public bk a(int var1) {
      synchronized(this) {
         this.g += var1;
         this.notifyAll();
         return this;
      }
   }

   public bk b(int var1) {
      synchronized(this) {
         this.f += var1;
         this.notifyAll();
         return this;
      }
   }

   public final int d() {
      return this.a.length;
   }

   public final bk e() {
      this.e = this.h = 0;
      this.j = 0;
      return this;
   }

   public final bk a(byte var1, int var2) {
      int var3 = this.a.length - this.h;
      if (var2 > var3) {
         bh.a(this.a, this.h, var3, var1);
         bh.a((byte[])this.a, 0, var2 - var3, (byte)var1);
      } else {
         bh.a(this.a, this.h, var2, var1);
      }

      this.h = this.h + var2 & this.b;
      this.i += var2;
      this.j += var2;
      return this;
   }

   public final short f() {
      return (short)(this.q() & 255 | this.q() << 8);
   }

   public final int g() {
      return this.q() & 255 | this.q() << 8 & '\uff00' | this.q() << 16 & 16711680 | this.q() << 24;
   }

   public final long h() {
      return (long)this.q() << 56 & -72057594037927936L | (long)this.q() << 48 & 71776119061217280L | (long)this.q() << 40 & 280375465082880L | (long)this.q() << 32 & 1095216660480L | (long)(this.q() << 24 & -16777216) | (long)(this.q() << 16 & 16711680) | (long)(this.q() << 8 & '\uff00') | (long)(this.q() & 255);
   }

   public final byte i() {
      return this.q();
   }

   public final int j() {
      if (this.d == 0) {
         this.c = this.q();
      }

      int var1 = this.c & 1 << this.d;
      this.d = this.d + 1 & 7;
      return var1 == 0 ? 0 : 1;
   }

   public final bk a(DataInputStream var1, int var2) {
      int var3 = this.a.length - this.h;
      if (var2 > var3) {
         bh.a(var1, this.a, this.h, var3);
         bh.a(var1, this.a, 0, var2 - var3);
      } else {
         bh.a(var1, this.a, this.h, var2);
      }

      this.h = this.h + var2 & this.b;
      this.i += var2;
      this.j += var2;
      return this;
   }

   public final bk a(byte[] var1, int var2, int var3) {
      int var4 = this.a.length - this.h;
      if (var3 > var4) {
         System.arraycopy(var1, var2, this.a, this.h, var4);
         System.arraycopy(var1, var2 + var4, this.a, 0, var3 - var4);
      } else {
         System.arraycopy(var1, var2, this.a, this.h, var3);
      }

      this.h = this.h + var3 & this.b;
      this.i += var3;
      this.j += var3;
      return this;
   }

   public final bk a(bk var1, int var2) {
      while(var2 > 0) {
         int var3 = Math.min(var2, this.a.length - this.h);
         var1.b(this.a, this.h, var3);
         this.h = this.h + var3 & this.b;
         this.j += var3;
         var2 -= var3;
      }

      return this;
   }

   public final String k() {
      int var1 = this.m();
      if (var1 == 255) {
         var1 = this.l();
      }

      if (this.e + var1 > this.a.length) {
         byte[] var3 = new byte[var1];
         this.b(var3, 0, var3.length);
         return bh.a((byte[])var3, 0, (int)var3.length);
      } else {
         String var2 = bh.a(this.a, this.e, var1);
         this.e = this.e + var1 & this.b;
         return var2;
      }
   }

   public final int l() {
      return (this.q() & 255 | this.q() << 8) & '\uffff';
   }

   public final int m() {
      return this.q() & 255;
   }

   public int a(int var1, boolean var2, int var3) {
      synchronized(this) {
         if (this.f < var1 && var3 >= 0) {
            try {
               this.wait((long)var3);
            } catch (InterruptedException var7) {
               return -1;
            }
         }

         if (this.f < var1) {
            return -1;
         } else if (var2) {
            int var5 = this.f;
            this.f = 0;
            return var5;
         } else {
            this.f -= var1;
            return var1;
         }
      }
   }

   public boolean a(int var1, int var2) {
      synchronized(this) {
         if (this.g < var1 && var2 >= 0) {
            try {
               this.wait((long)var2);
            } catch (InterruptedException var6) {
               return false;
            }
         }

         if (this.g < var1) {
            return false;
         } else {
            this.g -= var1;
            return true;
         }
      }
   }

   public final bk c(int var1) {
      this.e = this.e + this.a.length - var1 & this.b;
      return this;
   }

   public final bk d(int var1) {
      this.e = var1;
      return this;
   }

   public final bk e(int var1) {
      this.h = var1;
      this.j = var1;
      return this;
   }

   public final bk f(int var1) {
      this.e = this.e + var1 & this.b;
      return this;
   }

   public final int n() {
      synchronized(this) {
         return this.f;
      }
   }

   public boolean b(int var1, int var2) {
      synchronized(this) {
         if (this.f < var1 && var2 >= 0) {
            try {
               this.wait((long)var2);
            } catch (InterruptedException var6) {
               return false;
            }
         }

         return this.f >= var1;
      }
   }

   public bk o() {
      synchronized(this) {
         this.notifyAll();
         return this;
      }
   }

   public final boolean p() {
      return this.d == 0;
   }

   public final bk a(short var1) {
      this.b((byte)var1);
      var1 = (short)(var1 >>> 8);
      this.b((byte)var1);
      return this;
   }

   public final bk g(int var1) {
      this.b((byte)(var1 >> 24 & 255));
      this.b((byte)(var1 >> 16 & 255));
      this.b((byte)(var1 >> 8 & 255));
      this.b((byte)(var1 & 255));
      return this;
   }

   public final bk h(int var1) {
      this.b((byte)var1);
      var1 >>>= 8;
      this.b((byte)var1);
      var1 >>>= 8;
      this.b((byte)var1);
      var1 >>>= 8;
      this.b((byte)var1);
      return this;
   }

   public final bk a(long var1) {
      this.b((byte)((int)(var1 >> 56 & 255L)));
      this.b((byte)((int)(var1 >> 48 & 255L)));
      this.b((byte)((int)(var1 >> 40 & 255L)));
      this.b((byte)((int)(var1 >> 32 & 255L)));
      this.b((byte)((int)(var1 >> 24 & 255L)));
      this.b((byte)((int)(var1 >> 16 & 255L)));
      this.b((byte)((int)(var1 >> 8 & 255L)));
      this.b((byte)((int)(var1 & 255L)));
      return this;
   }

   public final bk a(byte var1) {
      this.b(var1);
      return this;
   }

   public final bk a(boolean var1) {
      this.a((byte)(var1 ? -1 : 0));
      return this;
   }

   public final bk b(String var1, int var2) {
      return var1.length() > var2 ? this.b(var1.substring(0, var2)) : this.b(var1);
   }

   public final bk b(String var1) {
      if (var1.length() >= 255) {
         this.b((byte)-1);
         this.a((short)var1.length());
      } else {
         this.b((byte)var1.length());
      }

      int var2 = 0;

      for(int var3 = var1.length(); var2 < var3; ++var2) {
         this.b((byte)var1.charAt(var2));
      }

      return this;
   }

   public final bk a(OutputStream var1, int var2) {
      if (this.e + var2 > this.a.length) {
         int var3 = this.a.length - this.e;
         var1.write(this.a, this.e, var3);
         var1.write(this.a, 0, var2 - var3);
      } else {
         var1.write(this.a, this.e, var2);
      }

      this.e = this.e + var2 & this.b;
      return this;
   }

   public final bk b(byte[] var1, int var2, int var3) {
      if (this.e + var3 > this.a.length) {
         int var4 = this.a.length - this.e;
         System.arraycopy(this.a, this.e, var1, var2, var4);
         System.arraycopy(this.a, 0, var1, var2 + var4, var3 - var4);
      } else {
         System.arraycopy(this.a, this.e, var1, var2, var3);
      }

      this.e = this.e + var3 & this.b;
      return this;
   }

   public final bk b(bk var1, int var2) {
      var1.a(this, var2);
      return this;
   }

   private byte q() {
      byte var1 = this.a[this.e];
      this.e = this.e + 1 & this.b;
      this.d = 0;
      return var1;
   }

   private void b(byte var1) {
      this.a[this.h] = var1;
      this.h = this.h + 1 & this.b;
      ++this.i;
      ++this.j;
   }
}
