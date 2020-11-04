public final class ce implements r {
   static final int MBOOSTER_MAX_INSTANCES = 10;
   private final z a;
   private final e[] b;
   private final boolean[] c;
   private final Object d;
   private bm[] e;

   public ce(Object var1) {
      this.d = var1;
      this.a = new z(3);
      this.b = new e[2];
      int var2 = 0;

      for(int var3 = this.b.length; var2 < var3; ++var2) {
         this.b[var2] = new e();
      }

      this.c = new boolean[this.b.length];
   }

   public ce a(bm var1) {
      synchronized(this.a) {
         if (!this.a.b(var1)) {
            this.a.a((Object)var1);
            this.e = null;
         }

         return this;
      }
   }

   public ce b(bm var1) {
      synchronized(this.a) {
         if (this.a.d(var1)) {
            this.e = null;
         }

         return this;
      }
   }

   public e a(short var1) {
      int var2 = 0;

      for(int var3 = this.b.length; var2 < var3; ++var2) {
         if (!this.c[var2]) {
            this.c[var2] = true;
            return this.b[var2].a(var1, this);
         }
      }

      throw bh.c(1430336843);
   }

   public void b(e var1) {
      int var3 = bh.a((Object[])this.b, var1);
      if (var3 == -1) {
         throw bh.b(1430930261);
      } else if (!this.c[var3]) {
         throw bh.c(1430665529);
      } else {
         bm[] var2;
         synchronized(this.a) {
            if (this.e == null) {
               this.e = new bm[this.a.d()];
               this.a.a((Object[])this.e);
            }

            var2 = this.e;
         }

         try {
            int var4 = 0;

            for(int var5 = var2.length; var4 < var5; ++var4) {
               try {
                  var2[var4].a(this.d, var1);
               } catch (Throwable var11) {
                  bh.a((byte)2, 1431192915, var2[var4].toString() + " (" + var1.a + ')', var11);
               }
            }
         } finally {
            this.c[var3] = false;
            var1.d();
         }

      }
   }
}
