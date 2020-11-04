public final class e {
   static final int MBOOSTER_MAX_INSTANCES = 44;
   public short a;
   private int b;
   private byte[] c;
   private int d;
   private int[] e;
   private r f;
   private int g;
   private Object[] h;

   public e() {
   }

   public e(short var1) {
      this.a(var1, (r)null);
   }

   public byte[] a() {
      return this.c;
   }

   public int b() {
      return this.b;
   }

   public e a(int var1) {
      this.a(var1, this.d, this.g);
      this.b = var1;
      return this;
   }

   public int c() {
      return this.g;
   }

   public e a(boolean var1) {
      this.a((byte)(var1 ? -1 : 0));
      return this;
   }

   public e a(byte var1) {
      this.a(this.b + 1, this.d, this.g);
      this.c[this.b++] = var1;
      return this;
   }

   public e b(int var1) {
      this.a(this.b, this.d + 1, this.g);
      this.e[this.d++] = var1;
      return this;
   }

   public e a(Object var1) {
      this.a(this.b, this.d, this.g + 1);
      this.h[this.g++] = var1;
      return this;
   }

   public e d() {
      int var1 = 0;

      for(int var2 = this.g; var1 < var2; ++var1) {
         this.h[var1] = null;
      }

      this.b = this.d = this.g = 0;
      return this;
   }

   public e a(e var1) {
      this.a(var1.b, var1.d, var1.g);
      if ((this.b = var1.b) > 0) {
         System.arraycopy(var1.c, 0, this.c, 0, var1.b);
      }

      if ((this.d = var1.d) > 0) {
         System.arraycopy(var1.e, 0, this.e, 0, var1.d);
      }

      if ((this.g = var1.g) > 0) {
         System.arraycopy(var1.h, 0, this.h, 0, var1.g);
      }

      return this;
   }

   public e a(int var1, int var2, int var3) {
      if (var1 > 0 && this.c == null) {
         this.c = new byte[var1];
      }

      if (var2 > 0 && this.e == null) {
         this.e = new int[var2];
      }

      if (var3 > 0 && this.h == null) {
         this.h = new Object[var3];
      }

      if (this.c != null && this.c.length < var1) {
         byte[] var4 = new byte[var1];
         System.arraycopy(this.c, 0, var4, 0, this.c.length);
         this.c = var4;
      }

      if (this.e != null && this.e.length < var2) {
         int[] var5 = new int[var2];
         System.arraycopy(this.e, 0, var5, 0, this.e.length);
         this.e = var5;
      }

      if (this.h != null && this.h.length < var3) {
         Object[] var6 = new Object[var3];
         System.arraycopy(this.h, 0, var6, 0, this.h.length);
         this.h = var6;
      }

      return this;
   }

   public boolean c(int var1) {
      return this.d(var1) != 0;
   }

   public byte d(int var1) {
      return this.c != null && var1 >= 0 && var1 < this.b ? this.c[var1] : 0;
   }

   public int e(int var1) {
      return this.e != null && var1 >= 0 && var1 < this.d ? this.e[var1] : 0;
   }

   public Object f(int var1) {
      return this.h != null && var1 >= 0 && var1 < this.g ? this.h[var1] : null;
   }

   public String g(int var1) {
      return (String)this.f(var1);
   }

   public e a(short var1, r var2) {
      this.f = var2;
      this.a = var1;
      this.d();
      return this;
   }

   public e e() {
      this.f.b(this);
      return this;
   }

   public e a(int var1, byte var2) {
      this.c[var1] = var2;
      return this;
   }
}
