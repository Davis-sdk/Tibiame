public final class ak extends b {
   static final int MBOOSTER_MAX_INSTANCES = 10;
   public aw b;
   private byte c;
   private boolean d;
   private int e;
   private String f;

   public ak C(byte var1) {
      if (this.c != var1) {
         this.c = var1;
         if (this.b != null) {
            this.G();
         }
      }

      return this;
   }

   public String b() {
      return this.f;
   }

   public b a(String var1) {
      if (!bh.a((Object)this.f, var1)) {
         this.f = var1;
         if (this.k()) {
            this.H();
         }
      }

      return this;
   }

   protected void b(int var1) {
      if (this.b != null) {
         this.b.a(var1);
         this.x();
      }

   }

   protected void c(int var1) {
      if (this.b != null) {
         this.e = this.d().a((byte)2, (byte)this.a());
         this.b.a(this.d(), (byte)var1);
         this.F();
      }

   }

   protected void y(byte var1) {
      if (this.b != null) {
         int var2;
         if (var1 == 4) {
            var2 = this.u((byte)0);
            if (var2 > 0 && var2 != this.b.c()) {
               this.b.c(var2);
               this.G();
               this.d = true;
               if (h.z && this == h.y && this.b.a_() > 5) {
                  this.c(this.b.c(), this.b.a_() + 10);
               } else {
                  this.c(this.b.c(), this.b.a_());
               }
            } else {
               this.d = false;
            }
         }

         if (var1 == 6) {
            if (this.d) {
               var2 = this.u((byte)0);
               if (var2 < this.b.c()) {
                  this.b.c(var2);
                  this.G();
                  this.d = true;
                  if (h.z && this == h.y && this.b.a_() > 5) {
                     this.c(this.b.c(), this.b.a_() + 10);
                  } else {
                     this.c(this.b.c(), this.b.a_());
                  }
               } else {
                  this.d = false;
               }
            } else {
               this.F();
            }
         }
      }

   }

   protected void a(s var1) {
      this.H();
      this.e = var1.a((byte)2, (byte)this.a());
   }

   protected void a(c var1) {
      super.a(var1);
      ((ak)var1).C(this.c);
   }

   protected void C() {
      this.E();
   }

   protected void D() {
      this.a((String)null);
   }

   protected void b(s var1) {
      if (this.b != null) {
         this.b.a(var1, -this.b.d(), 0);
         var1.b();
      }

   }

   protected boolean z(byte var1) {
      int var2;
      switch(var1) {
      case 0:
         if (this.p((byte)1) > 0) {
            var2 = this.t((byte)1) % this.e;
            this.d(0, this.t((byte)1) - (var2 == 0 ? this.e : var2));
            if (this.t((byte)1) > 0) {
               return true;
            }
         }
         break;
      case 2:
         if (this.p((byte)1) > 0) {
            var2 = (this.t((byte)1) + this.u((byte)1)) % this.e;
            this.d(0, this.t((byte)1) + (var2 == 0 ? this.e : this.e - var2));
            if (this.t((byte)1) < this.p((byte)1)) {
               return true;
            }
         }
      }

      return false;
   }

   private void E() {
      if (this.b != null) {
         this.b.e();
         this.b = null;
         this.c((int)0, 0);
      }

   }

   private void F() {
      this.b.c(65535);
      this.G();
      this.d = true;
      if (h.z && this == h.y && this.b.a_() > 5) {
         this.c(this.b.c(), this.b.a_() + 10);
      } else {
         this.c(this.b.c(), this.b.a_());
      }

   }

   private void G() {
      int var1;
      switch(this.c) {
      case 1:
         var1 = this.b.b() >> 1;
         break;
      case 2:
         var1 = this.b.b();
         break;
      default:
         var1 = 0;
      }

      this.b.b(var1);
   }

   private void H() {
      this.E();
      if (this.f == null) {
         this.b = null;
         this.c((int)0, 0);
      } else {
         this.b = aw.a(this.f).a(this.d(), this.a()).a(super.a);
         this.F();
      }

   }
}
