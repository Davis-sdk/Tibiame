public final class i {
   static final int MBOOSTER_MAX_INSTANCES = 100;
   private static final z a = new z(32);
   private byte b;
   private byte c;
   private short d = -1;
   private String e;
   private byte f;
   private short g;
   private short h;

   private i() {
   }

   public int a() {
      return this.b & 255;
   }

   public int b() {
      return this.c & 255;
   }

   public int c() {
      return this.f & 255;
   }

   public int d() {
      return this.g & '\uffff';
   }

   public void a(int var1) {
      this.g = (short)var1;
   }

   public int e() {
      return this.h & '\uffff';
   }

   public void b(int var1) {
      this.h = (short)var1;
   }

   public boolean f() {
      return this.e == null && this.d == -1 || this.e == "\n";
   }

   public static i g() {
      i var0 = l();
      var0.e = "\n";
      var0.d = 0;
      return var0;
   }

   public static i c(int var0) {
      i var1 = l();
      var1.d = (short)(-var0 - 2);
      var1.b = var1.c;
      return var1;
   }

   public static i a(String var0, int var1, int var2) {
      i var3 = l();
      if (var1 < 1024 && var2 < 64) {
         var3.e = var0;
         var3.a(var1, var2);
      } else {
         var3.e = var0.substring(var1, var1 + var2);
         var3.d = 0;
      }

      return var3;
   }

   public static i h() {
      i var0 = l();
      var0.f = 4;
      return var0;
   }

   public void a(s var1, int var2, int var3, byte var4, int var5) {
      if (this.e != null) {
         if (var1.b(this.d() + var2, this.e() + var3, this.c(), this.b())) {
            if (this.d == 0) {
               var1.a(var4, this.e, var5, this.d() + var2, this.e() + var3);
            } else {
               var1.a(var4, this.e, this.n(), this.m(), var5, this.d() + var2, this.e() + var3);
            }
         }
      } else if (this.d != -1) {
         this.a(var1);
         var1.a(this.d, this.d() + var2, this.e() + var3);
      }

   }

   public boolean i() {
      return this.e != "\n" && (this.e != null || this.d == -1);
   }

   public boolean j() {
      return this.e == "\n";
   }

   void k() {
      this.g = this.h = 0;
      this.f = this.c = this.b = 0;
      this.e = null;
      this.d = -1;
      if (a.d() < a.a()) {
         a.a((Object)this);
      }

   }

   void a(s var1, byte var2) {
      if (this.e != null) {
         this.f = (byte)var1.a((byte)0, var2, (String)this.e, this.n(), this.m());
         this.c = (byte)var1.a((byte)2, (byte)var2);
         this.b = (byte)var1.a((byte)3, (byte)var2);
      } else if (this.d != -1) {
         this.a(var1);
         this.f = (byte)var1.b(this.d);
         this.c = (byte)var1.a(this.d);
         this.b = (byte)(this.c - 1);
      }

   }

   private static i l() {
      return a.d() > 0 ? (i)a.c() : new i();
   }

   private void a(s var1) {
      if (this.d < 0) {
         this.d = var1.a(-this.d - 2);
      }

   }

   private void a(int var1, int var2) {
      this.d = (short)((var1 & 1023) << 6 | var2 & 63);
   }

   private int m() {
      return this.d & 63;
   }

   private int n() {
      return this.d >> 6 & 1023;
   }

   static {
      int var0 = 0;

      for(int var1 = a.a(); var0 < var1; ++var0) {
         a.a((Object)(new i()));
      }

   }
}
