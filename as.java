public final class as extends c implements bm {
   static final int MBOOSTER_MAX_INSTANCES = 3;
   private int a;
   private int b;
   private int c;
   private int d = 125;
   private byte e;
   private byte f;
   private int g;
   private byte h;

   public as() {
      super(false);
      this.b(-1);
      this.a((int)-1);
      this.b((byte)2);
   }

   public as a(int var1) {
      this.a = var1;
      return this;
   }

   public as b(int var1) {
      this.b = var1;
      return this;
   }

   public as c(int var1) {
      this.d = var1;
      return this;
   }

   public as a(byte var1) {
      this.e = var1;
      return this;
   }

   public as C(byte var1) {
      this.f = var1;
      return this;
   }

   public as p(int var1) {
      if (var1 <= 0 || var1 >= 100) {
         this.c = var1;
      }

      this.g = var1;
      this.x();
      return this;
   }

   public as D(byte var1) {
      this.h = var1;
      return this;
   }

   public void a(Object var1, e var2) {
      if (var2.a == 4014 && var2.d(0) == this.f) {
         this.g = var2.e(0);
         if (this.g > this.c && this.f == 3) {
            this.c = this.g;
         }

         this.x();
      } else if (var2.a == 4018 && this.f == 5 && h.u) {
         if (var2.e(0) > 0) {
            this.b = 8750469;
         } else {
            this.b = 4210943;
         }
      }

   }

   protected void a(c var1) {
      super.a(var1);
      ((as)var1).C(this.f).b(this.b).a(this.a).a(this.e).D(this.h);
   }

   protected void b(s var1) {
      int var2 = this.c;
      int var3;
      int var4;
      int var5;
      int var6;
      if (this.e == 0) {
         var5 = bh.a(0, this.u((byte)0), var2, 100);
         if (var5 == 0 && var2 > 0) {
            var5 = 1;
         }

         var3 = this.h == 0 ? 0 : this.u((byte)0) - var5;
         var4 = 0;
         var6 = this.u((byte)1);
      } else {
         var6 = bh.a(0, this.u((byte)1), var2, 100);
         if (var6 == 0 && var2 > 0) {
            var6 = 1;
         }

         var4 = this.h == 0 ? 0 : this.u((byte)1) - var6;
         var3 = 0;
         var5 = this.u((byte)0);
      }

      if (this.a != -1) {
         if (var3 > 0) {
            var1.a(this.a, 0, 0, var3, (int)this.u((byte)1));
         }

         if (var4 > 0) {
            var1.a(this.a, var3, 0, var5, (int)var4);
         }

         if (var3 + var5 < this.u((byte)0)) {
            var1.a(this.a, var3 + var5, 0, this.u((byte)0) - var3 - var5, (int)this.u((byte)1));
         }

         if (var4 + var6 < this.u((byte)1)) {
            var1.a(this.a, var3, var4 + var6, var5, this.u((byte)1) - var4 - var6);
         }
      }

      if (this.b != -1) {
         var1.a(this.b, var3, var4, var5, var6);
      }

      var1.b();
   }

   protected void o(int var1) {
      int var2 = this.d * var1 / 1000;
      int var3 = this.g - this.c;
      if (var3 != 0) {
         this.c += bh.a(var3 + bh.e(var3) >> 1, -var2, var2);
         this.x();
      }

   }
}
