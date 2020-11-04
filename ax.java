public final class ax {
   static final int MBOOSTER_MAX_INSTANCES = 64;
   public short a;
   public short b;
   public short c;
   public short d;

   public ax() {
      this.b = this.d = -1;
   }

   public boolean a() {
      return this.a > this.b || this.c > this.d;
   }

   public ax a(ax var1) {
      this.a = var1.a;
      this.c = var1.c;
      this.b = var1.b;
      this.d = var1.d;
      return this;
   }

   public ax b(ax var1) {
      if (this.a()) {
         this.a(var1);
      } else if (!var1.a()) {
         this.a = (short)Math.min(this.a, var1.a);
         this.c = (short)Math.min(this.c, var1.c);
         this.b = (short)Math.max(this.b, var1.b);
         this.d = (short)Math.max(this.d, var1.d);
      }

      return this;
   }

   public int b() {
      return this.d - this.c + 1;
   }

   public ax c(ax var1) {
      this.a = (short)Math.max(this.a, var1.a);
      this.c = (short)Math.max(this.c, var1.c);
      this.b = (short)Math.min(this.b, var1.b);
      this.d = (short)Math.min(this.d, var1.d);
      return this;
   }

   public boolean d(ax var1) {
      return Math.max(this.a, var1.a) <= Math.min(this.b, var1.b) && Math.max(this.c, var1.c) <= Math.min(this.d, var1.d);
   }

   public void c() {
      this.b = (short)(this.a - 1);
      this.d = (short)(this.c - 1);
   }

   public ax a(int var1, int var2, int var3, int var4) {
      this.a = (short)var1;
      this.c = (short)var2;
      this.b = (short)(var1 + Math.max(0, var3) - 1);
      this.d = (short)(var2 + Math.max(0, var4) - 1);
      return this;
   }

   public int d() {
      return this.b - this.a + 1;
   }
}
