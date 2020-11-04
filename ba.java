public final class ba extends c {
   static final int MBOOSTER_MAX_INSTANCES = 16;
   protected byte a;
   private int b = -1;
   private int c = -1;
   private byte d;

   public ba() {
      super(false);
      this.b();
   }

   public ba a(int var1) {
      if (this.b != var1) {
         this.b = var1;
         this.b();
         this.x();
      }

      return this;
   }

   public ba b(int var1) {
      if (this.a != var1) {
         this.a = (byte)var1;
         this.a();
         this.x();
      }

      return this;
   }

   public ba c(int var1) {
      this.c = var1;
      if (this.a != 0) {
         this.x();
      }

      return this;
   }

   public ba p(int var1) {
      if (this.d != var1) {
         this.d = (byte)var1;
         this.a();
         this.b();
         this.x();
      }

      return this;
   }

   protected void a(c var1) {
      super.a(var1);
      ((ba)var1).b(this.a).c(this.c).a(this.b).p(this.d);
   }

   protected void b(s var1) {
      int var2 = this.u((byte)0) - this.d;
      int var3 = this.u((byte)1) - this.d;
      if (this.b >= 0) {
         var1.a(this.b, 0, 0, var2, (int)(var3 + this.t((byte)1)));
      } else if (this.b == -2) {
         var1.a((int)0, 0, var2, var3);
      }

      if (this.a != 0) {
         if (this.a == 15) {
            var1.c(this.c, 0, 0, var2, var3);
         } else {
            if ((this.a & 1) != 0) {
               var1.b(this.c, 0, 0, 0, var3 - 1);
            }

            if ((this.a & 4) != 0) {
               var1.b(this.c, var2 - 1, 0, var2 - 1, var3 - 1);
            }

            if ((this.a & 2) != 0) {
               var1.b(this.c, 0, 0, var2 - 1, 0);
            }

            if ((this.a & 8) != 0) {
               var1.b(this.c, 0, var3 - 1, var2 - 1, var3 - 1);
            }
         }
      }

      if (this.d > 0) {
         var1.a((int)var2, this.d, this.d, var3);
         var1.a((int)this.d, var3, var2 - this.d, this.d);
      }

      if (h.z && this.h((int)0) == h.y) {
         var1.a(var1.a("ArrowDown"), this.i((byte)0) - 8, this.i((byte)1) - 6);
         if (h.B > 0) {
            var1.a(var1.a("ArrowUp"), this.i((byte)0) - 8, this.i((byte)1) - 11);
         }
      }

      var1.b();
   }

   private void a() {
      this.b((this.a & 1) == 0 ? 0 : 1, (this.a & 2) == 0 ? 0 : 1, ((this.a & 4) == 0 ? 0 : 1) + this.d, ((this.a & 8) == 0 ? 0 : 1) + this.d);
   }

   private void b() {
      this.e(this.d == 0 && this.b >= 0);
   }
}
