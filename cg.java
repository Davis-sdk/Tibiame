public final class cg {
   static final int MBOOSTER_MAX_INSTANCES = 2;
   private int a;
   private int b;
   private char[] c;
   private int d;
   private int e;
   private String f;

   public cg(String var1) {
      this.a(var1);
   }

   public cg() {
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.a - this.b;
   }

   public int c() {
      return this.b;
   }

   public static int a(char var0) {
      int var1;
      if (var0 >= 129 && var0 <= 142) {
         var1 = var0 - 129;
         if (var1 >= 0 && var1 <= 13) {
            return var1;
         } else {
            throw bh.b(1196314680, String.valueOf(var0));
         }
      } else {
         var1 = c(var0);
         return var1;
      }
   }

   private static int c(char var0) {
      switch(var0) {
      case '\u008f':
         return 25;
      case '\u0090':
         return 26;
      case '\u0091':
         return 27;
      case '¼':
         return 12;
      case '¾':
         return 14;
      case '¿':
         return 15;
      default:
         return -1;
      }
   }

   public static boolean b(char var0) {
      return var0 >= 129 && var0 <= 142 || c(var0) != -1;
   }

   public void d() {
      this.c = null;
      this.f = null;
   }

   public int e() {
      if (this.f == null && this.c == null) {
         this.b = this.a = 0;
         return -1;
      } else {
         this.b = this.a;

         do {
            char var1 = this.f();
            if (var1 == 0) {
               if (this.b < this.a) {
                  return 3;
               }

               this.d();
               return -1;
            }

            if (d(var1)) {
               if (this.b < this.a) {
                  return 3;
               }

               do {
                  ++this.a;
               } while(d(this.f()));

               return 1;
            }

            if (var1 == '\r' || var1 == '\n') {
               if (this.b < this.a) {
                  return 3;
               } else {
                  ++this.a;
                  if (var1 == '\r' && this.f() == '\n') {
                     ++this.a;
                  }

                  return 2;
               }
            }

            if (b(var1)) {
               if (this.b < this.a) {
                  return 3;
               }

               ++this.a;
               return 4;
            }

            ++this.a;
         } while(this.a - this.b < 21);

         return 3;
      }
   }

   public void a(String var1) {
      this.f = var1;
      this.c = null;
      this.b = this.a = 0;
   }

   public void a(char[] var1, int var2, int var3) {
      this.c = var1;
      this.e = var2;
      this.d = var3;
      this.f = null;
      this.b = this.a = 0;
   }

   private static boolean d(char var0) {
      return var0 == ' ' || var0 == '\t';
   }

   private char f() {
      if (this.f != null) {
         return this.a == this.f.length() ? '\u0000' : this.f.charAt(this.a);
      } else {
         return this.a == this.d ? '\u0000' : this.c[this.e + this.a];
      }
   }
}
