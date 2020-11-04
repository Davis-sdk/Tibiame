public final class ae {
   static final int MBOOSTER_MAX_INSTANCES = 24;
   public long a;
   public long b;
   public String c;
   public boolean d;
   public short e;
   public String f;
   public String g;
   public int h;

   public ae() {
      this.b((byte)0, (byte)0);
   }

   public ae(String var1, int var2) {
      this.c = var1;
      this.h = var2;
   }

   public ae(String var1, int var2, short var3, String var4) {
      this.c = var1;
      this.h = var2;
      this.e = var3;
      this.f = var4;
   }

   public byte a() {
      switch(this.e >> 8) {
      case 10:
         return (byte)(this.e >> 1 & 1);
      default:
         throw bh.b(944985650, String.valueOf(this.e));
      }
   }

   public byte b() {
      switch(this.e >> 8) {
      case 10:
         return (byte)(this.e & 1);
      default:
         throw bh.b(944985650, String.valueOf(this.e));
      }
   }

   public ae a(long var1) {
      this.a = var1;
      return this;
   }

   public ae b(long var1) {
      this.b = var1;
      return this;
   }

   public ae a(String var1) {
      if (bh.a(var1) >= 1) {
         this.c = Character.toUpperCase(var1.charAt(0)) + var1.substring(1).toLowerCase();
      } else {
         this.c = null;
      }

      return this;
   }

   public ae a(boolean var1) {
      this.d = var1;
      return this;
   }

   public ae a(short var1) {
      this.e = var1;
      return this;
   }

   public ae b(String var1) {
      this.f = var1;
      return this;
   }

   public ae c(String var1) {
      this.g = var1;
      return this;
   }

   public ae a(int var1) {
      this.h = var1;
      return this;
   }

   public ae c() {
      return (new ae(this.c, this.h, this.e, this.f)).c(this.g).a(this.d).b(this.b).a(this.a);
   }

   public boolean a(ae var1) {
      return var1.c.equals(this.c) && var1.h == this.h;
   }

   public ae a(byte var1, byte var2) {
      this.e = (short)(var1 << 8 | var2);
      return this;
   }

   public ae b(byte var1, byte var2) {
      this.a((byte)10, (byte)((var2 << 1) + var1));
      return this;
   }

   public byte d() {
      if (bh.a(this.c) == 0) {
         return -1;
      } else if (bh.a(this.c) < 2) {
         return -2;
      } else if (bh.b(this.c.charAt(0), 65, 90)) {
         int var1 = 1;

         for(int var2 = this.c.length(); var1 < var2; ++var1) {
            char var3 = this.c.charAt(var1);
            if (!bh.b(var3, 97, 122) && !bh.b(var3, 65, 90)) {
               return -3;
            }
         }

         if (bh.a(this.f) == 0) {
            return -4;
         } else if (bh.a(this.f) < 6) {
            return -5;
         } else if (!bh.b(this.h, this.d ? 0 : 1, 999)) {
            return -6;
         } else {
            return 0;
         }
      } else {
         return -3;
      }
   }

   public byte e() {
      if (bh.a(this.c) == 0) {
         return -1;
      } else if (bh.a(this.c) < 2) {
         return -2;
      } else if (bh.b(this.c.charAt(0), 65, 90)) {
         int var1 = 1;

         int var2;
         char var3;
         for(var2 = this.c.length(); var1 < var2; ++var1) {
            var3 = this.c.charAt(var1);
            if (!bh.b(var3, 97, 122) && !bh.b(var3, 65, 90)) {
               return -3;
            }
         }

         if (bh.a(this.f) == 0) {
            return -4;
         } else {
            var1 = 0;

            for(var2 = this.f.length(); var1 < var2; ++var1) {
               var3 = this.f.charAt(var1);
               if (!bh.b(var3, 48, 57) && !bh.b(var3, 97, 122) && !bh.b(var3, 65, 90)) {
                  return -7;
               }
            }

            if (bh.a(this.f) < 6) {
               return -5;
            } else if (!bh.b(this.h, this.d ? 0 : 1, 999)) {
               return -6;
            } else {
               return 0;
            }
         }
      } else {
         return -3;
      }
   }
}
