public final class cp extends c implements af, bm {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final ce a = new ce(this);
   private Object b;
   private au c;
   private boolean d;

   public cp() {
      super(false);
   }

   public ce a() {
      return this.a;
   }

   public cp a(byte var1) {
      if (this.c(this, (byte)1, var1)) {
         this.a((au)this.b);
      }

      return this;
   }

   public cp b() {
      c var1 = this.b(this.c);
      if (var1 == null) {
         this.a.a((short)8007).a((Object)this.c).e();
      } else {
         this.a(var1, true);
      }

      return this;
   }

   public void a(Object var1, e var2) {
      if (var2.a == 8008) {
         this.a((c)var1, false);
      }

   }

   public void a(k var1, byte var2, int var3) {
      if (var2 == 1 || var2 == 2) {
         this.a((c)var1, false);
      }

   }

   protected void a(s var1) {
      this.c(this, (byte)0, 1);
      this.E();
   }

   protected boolean z(byte var1) {
      switch(var1) {
      case 0:
         this.a((int)-1);
         return true;
      case 2:
         this.a((int)1);
         return true;
      case 16:
         if (!this.d) {
            this.b();
            return true;
         }
         break;
      case 17:
         if (this.d) {
            this.a(this.b(this.c), false);
            return true;
         }
      }

      if (this.c(this, (byte)1, var1) && ((c)this.b).e() == 30) {
         this.a((au)this.b);
         this.b();
         return true;
      } else {
         return false;
      }
   }

   private static c a(c var0, c var1, int var2) {
      int var3 = var1.f((byte)0);

      for(int var4 = var1.f((byte)1) + var2; bh.b(var4 - var0.g((byte)1), 0, var0.h((byte)1) - 1); var4 += var2) {
         c var5 = var0.a(var3, var4);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   private static c a(c var0, int var1) {
      c var2 = var0.h();
      if (var2 == null) {
         return null;
      } else {
         c var3 = a(var2, var0, var1);
         if (var3 == null && !(var2 instanceof cp)) {
            var3 = a(var2, var1);
            if (var3 == null) {
               return null;
            }

            var3 = var3.a(var0.f((byte)0), var3.g((byte)1) + (var1 == -1 ? var3.h((byte)1) - 1 : 0));
         }

         return var3;
      }
   }

   private boolean a(c var1, byte var2, int var3) {
      switch(var2) {
      case 0:
         if (var1 instanceof au) {
            ((au)var1).a(var3 != 0);
         }
         break;
      case 1:
         if (var1 instanceof au && ((au)var1).a() == var3) {
            this.b = var1;
            return true;
         }
         break;
      case 2:
         if (var1.e() == var3) {
            this.b = var1;
            return true;
         }
      }

      return false;
   }

   private void a(au var1) {
      if (var1 != this.c) {
         if (this.c != null) {
            this.c(this.c).a((byte)0).a((int)0);
         }

         this.c = var1;
         if (this.c != null) {
            this.c(this.c).a((byte)1).a(16777215).s();
            this.a.a((short)8005).a((Object)this.c).e();
         }
      }

   }

   private void E() {
      if (!this.c(this, (byte)2, 30)) {
         throw bh.c(859910216);
      } else {
         au var1;
         do {
            var1 = (au)this.b;
            this.b = a(var1, -1);
         } while(this.b != null);

         this.a(var1);
      }
   }

   private void a(int var1) {
      boolean var2 = this.d;
      if (var2) {
         this.a(this.b(this.c), false);
      }

      au var4 = this.c;
      au var3 = (au)a(var4, var1);
      if (var3 == null) {
         do {
            var3 = (au)a(var4, -var1);
            if (var3 != null) {
               var4 = var3;
            }
         } while(var3 != null);

         this.a(var4);
      } else {
         this.a(var3);
      }

      if (var2) {
         c var5;
         if ((var5 = this.b(this.c)) != null) {
            this.a(var5, true);
         } else {
            this.d(true);
         }
      }

   }

   private c b(au var1) {
      return this.b(var1, (byte)2, 32) ? (c)this.b : null;
   }

   private b c(au var1) {
      if (!this.b(var1, (byte)2, 31)) {
         throw bh.c(860500808);
      } else {
         return (b)this.b;
      }
   }

   private void a(c var1, boolean var2) {
      this.d = var2;
      this.a.a((short)8006).a(var2).a((Object)this.c).a((Object)var1).e();
      if (var2) {
         this.c(this, (byte)0, 0);
         this.c.a(true);
         var1.d(true);
         if (var1 instanceof ch) {
            ((ch)var1).F().a(this);
         }

         if (var1 instanceof k) {
            ((k)var1).a(this);
         }
      } else {
         this.c(this, (byte)0, 1);
         this.d(true);
         if (var1 instanceof ch) {
            ((ch)var1).F().b((bm)this);
         }

         if (var1 instanceof k) {
            ((k)var1).b(this);
         }
      }

   }

   private boolean b(c var1, byte var2, int var3) {
      c var4 = var1.h();
      int var5 = var1.f((byte)1);
      int var6 = var1.f((byte)0) + 1;

      for(int var7 = var4.g((byte)0) + var4.h((byte)0) - 1; var6 <= var7; ++var6) {
         c var8 = var4.a(var6, var5);
         if (var8 != null && this.c(var8, var2, var3)) {
            return true;
         }
      }

      return false;
   }

   private boolean c(c var1, byte var2, int var3) {
      if (this.a(var1, var2, var3)) {
         return true;
      } else {
         int var4 = 0;

         for(int var5 = var1.c(); var4 < var5; ++var4) {
            if (this.c(var1.h(var4), var2, var3)) {
               return true;
            }
         }

         return false;
      }
   }
}
