public abstract class be extends c {
   protected short a = -1;
   private int b;
   private int c = 8799237;

   protected be() {
      super(false);
   }

   public final be a(int var1) {
      if (this.b != var1) {
         this.b = var1;
         if (this.k()) {
            this.a();
            this.x();
         }
      }

      return this;
   }

   protected void a(s var1) {
      this.a();
   }

   protected void a(c var1) {
      super.a(var1);
      ((be)var1).a(this.b);
   }

   protected final void b(s var1) {
      if (this.b == 0) {
         if (this.a != -1) {
            var1.a(this.a, this.u((byte)0) - var1.b(this.a) >> 1, this.u((byte)1) - var1.a(this.a) >> 1);
         }
      } else if (this.b == 2) {
         if (this.a != -1) {
            var1.a((short)this.a, (int)0, (int)0);
         }
      } else if (this.b == 1) {
         if (this.a == -1) {
            ax var2 = var1.d();
            var1.a(this.c, var2.a, var2.c, var2.d(), (int)var2.b());
         } else {
            int var6 = var1.b(this.a);
            int var7 = var1.a(this.a);
            ax var8 = var1.d();
            int var11 = var8.a / var6 * var6;
            int var3 = var8.c / var7 * var7;
            short var4 = var8.b;
            short var5 = var8.d;

            for(int var9 = var3; var9 <= var5; var9 += var7) {
               for(int var10 = var11; var10 <= var4; var10 += var6) {
                  var1.a(this.a, var10, var9);
               }
            }
         }
      }

      var1.b();
   }

   protected final void a(short var1) {
      if (this.a != var1) {
         this.a = var1;
         if (this.k()) {
            this.a();
            this.x();
         }
      }

   }

   private void a() {
      if (this.b == 2) {
         this.c(this.d().b(this.a), this.d().a(this.a));
      }

   }
}
