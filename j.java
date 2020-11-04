public final class j extends aa {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private aa i;
   private aa j;
   public byte d;
   public byte e;
   public byte f;
   public byte g;
   private int k;
   private int l;
   private byte m;

   public j() {
      super(11, (byte)-1, false);
      this.a((byte)2, false);
   }

   public aa d() {
      return this.i;
   }

   public void a(aa var1) {
      this.i = var1;
   }

   public aa e() {
      return this.j;
   }

   public void b(aa var1) {
      this.j = var1;
   }

   public boolean f() {
      return this.c(4);
   }

   public void c(boolean var1) {
      this.a(4, var1);
   }

   public boolean g() {
      return this.c(8);
   }

   public void d(boolean var1) {
      this.a(8, var1);
   }

   public boolean h() {
      return !this.t() && this.j == null && !this.c(8);
   }

   public boolean a(byte var1) {
      switch(var1) {
      case 0:
         return this.d < super.a.a;
      case 1:
         return this.e < super.a.a;
      case 2:
         return this.f < super.a.a;
      case 3:
         return this.g < super.a.a;
      default:
         return true;
      }
   }

   public void a(int var1, int var2, byte var3) {
      this.k = var1;
      this.l = var2;
      this.m = var3;
   }

   public int i() {
      return this.k;
   }

   public int j() {
      return this.l;
   }

   public byte k() {
      return this.m;
   }

   public void a(byte var1, byte var2) {
      super.a(var1, var2);
      if (var1 < 0) {
         --this.e;
      } else if (var1 > 0) {
         --this.g;
      }

      if (var2 < 0) {
         --this.f;
      } else if (var2 > 0) {
         --this.d;
      }

   }

   public void b(byte var1) {
      super.b(var1);
      this.c(false);
      switch(var1) {
      case 0:
         --this.l;
         ++this.d;
         break;
      case 1:
         ++this.k;
         ++this.e;
         break;
      case 2:
         ++this.l;
         ++this.f;
         break;
      case 3:
         --this.k;
         ++this.g;
      }

      super.a.l();
   }

   public void b(int var1, int var2) {
      super.b(var1, var2);
      this.c(false);
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      super.a.l();
   }

   public void a(bv var1) {
      super.a(var1);
      this.b(var1.a(), var1.a());
   }
}
