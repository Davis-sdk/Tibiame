public final class aw extends al {
   static final int MBOOSTER_MAX_INSTANCES = 10;
   private static final z a = new z(192);
   private short b;
   private short c;
   private int d;
   private short e;
   private int f;
   private byte g;
   private i[] h;
   private short i;
   private boolean j;
   private short k;

   aw(i[] var1) {
      this.h = var1;
      this.g = -1;
      this.k = -1;
      this.a(0);
      this.j = true;
   }

   public int c() {
      this.g();
      return this.c;
   }

   public int d() {
      this.g();
      return this.d;
   }

   public aw a(int var1) {
      this.f = var1;
      return this;
   }

   public aw b(int var1) {
      if (this.i != (short)var1) {
         this.i = (short)var1;
         this.j = true;
      }

      return this;
   }

   public aw c(int var1) {
      if (this.b() != var1) {
         this.k = (short)bh.a(var1, 0, 65535);
         this.j = true;
      }

      return this;
   }

   public static aw a(String var0) {
      synchronized(a) {
         char[] var6 = var0.toCharArray();

         int var7;
         for(var7 = 0; var7 < var6.length; ++var7) {
            if (var6[var7] == 26) {
               var6[var7] = '?';
            }
         }

         String var5 = "";

         for(var7 = 0; var7 < var6.length; ++var7) {
            var5 = var5 + var6[var7];
         }

         var5 = var5 + '\u0000';
         cg var2 = new cg(var5);

         int var4;
         while((var4 = var2.e()) != -1) {
            switch(var4) {
            case 1:
               a.a((Object)i.h());
               break;
            case 2:
               a.a((Object)i.g());
               break;
            case 3:
               a.a((Object)i.a(var5, var2.c(), var2.b()));
               break;
            case 4:
               a.a((Object)i.c(cg.a(var5.charAt(var2.c()))));
               break;
            default:
               throw bh.b(1311912526, String.valueOf(var4));
            }
         }

         i[] var3 = new i[a.d()];
         a.a((Object[])var3);
         a.b();
         return new aw(var3);
      }
   }

   public aw a(s var1, byte var2) {
      if (this.g != var2) {
         this.g = var2;
         int var3 = 0;

         for(int var4 = this.h.length; var3 < var4; ++var3) {
            this.h[var3].a(var1, var2);
         }

         this.j = true;
      }

      return this;
   }

   public void e() {
      if (!this.f()) {
         int var1 = 0;

         for(int var2 = this.h.length; var1 < var2; ++var1) {
            this.h[var1].k();
         }

         this.h = null;
      }

   }

   public boolean f() {
      return this.h == null;
   }

   public void a(s var1, int var2, int var3) {
      this.g();
      int var4 = 0;

      for(int var5 = this.h.length; var4 < var5; ++var4) {
         if (!this.h[var4].f()) {
            this.h[var4].a(var1, var2, var3, this.g, this.f);
         }
      }

   }

   public int a_() {
      this.g();
      return this.b;
   }

   public int b() {
      return this.k & '\uffff';
   }

   private int a(int var1, int var2, int var3, int var4) {
      int var5 = bh.a(this.i - (var4 >>> 1), 0, this.b() - var4);
      this.d = (short)Math.min(this.d, var5);
      int var6 = 0;

      int var8;
      for(var8 = var1; var8 <= var2; ++var8) {
         var6 = Math.max(var6, this.h[var8].a());
      }

      if (this.e == -1) {
         this.e = (short)(var3 + var6);
      }

      int var7 = 0;

      for(var8 = var1; var8 <= var2; ++var8) {
         i var9 = this.h[var8];
         var9.a(var9.d() + var5);
         var9.b(var3 + var6 - var9.a());
         var7 = Math.max(var7, var9.e() + var9.b());
      }

      return var7 - var3;
   }

   private void g() {
      if (this.j) {
         this.d = this.b();
         this.e = -1;
         this.c = 0;
         this.b = 0;

         int var3;
         for(int var1 = 0; var1 < this.h.length; var1 = var3 + 1) {
            while(var1 < this.h.length && this.h[var1].f()) {
               ++var1;
            }

            if (var1 == this.h.length) {
               break;
            }

            var3 = var1;

            int var2;
            for(var2 = 0; var3 < this.h.length; ++var3) {
               i var4 = this.h[var3];
               if (var4.j() || var2 > 0 && var2 + var4.c() > this.b()) {
                  if (var3 > var1 && !this.h[var3 - 1].i() && !this.h[var3].j()) {
                     --var3;
                  }
                  break;
               }

               var4.a(var2);
               var2 += Math.min(this.b(), var4.c());
            }

            if (var3 > var1) {
               --var3;
            }

            for(int var5 = var3; var5 > var1 && this.h[var5].f(); --var5) {
               var2 -= this.h[var5].c();
            }

            this.c = (short)Math.max(this.c, var2);
            this.b += (short)this.a(var1, var3, this.b, var2);
         }

         this.j = false;
      }

   }
}
