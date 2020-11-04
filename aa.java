public class aa extends d {
   static final int MBOOSTER_MAX_INSTANCES = 100;
   public static int h = 1000;
   private String d;
   private aw e;
   private byte f;
   private boolean g;

   public void c(byte var1) {
      this.f = var1;
   }

   public aa(byte var1, boolean var2) {
      this(11, var1, var2);
   }

   aa(int var1, byte var2, boolean var3) {
      super(var1, 7);
      this.f = 0;
      super.b[2] = var2;
      this.a(16, var3);
      super.c[5] = -1;
   }

   public final byte l() {
      return super.b[1];
   }

   public final byte m() {
      return super.b[2];
   }

   public final String n() {
      return this.d;
   }

   public final int o() {
      int var2 = super.b[8] * super.a.d();
      short var1 = super.c[1];
      if (var1 != 0) {
         var2 += super.c[2] * var1 / super.c[0];
      }

      return var2;
   }

   public final int p() {
      int var2 = super.b[9] * super.a.d();
      short var1 = super.c[1];
      if (var1 != 0) {
         var2 += super.c[3] * var1 / super.c[0];
      }

      return var2;
   }

   public final int q() {
      return super.b[8];
   }

   public final int r() {
      return super.b[9];
   }

   public final byte s() {
      return super.b[10];
   }

   public final boolean t() {
      return super.c[1] > 0;
   }

   public final void u() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }

      if (this.c(16)) {
         super.b[7] = 1;
         if (super.b[10] == 3) {
            this.e = a(this.d, 16776960);
         } else if (super.b[10] == 4) {
            this.e = a(this.d, 16719904);
         } else if (super.b[10] == 1) {
            if (this.g) {
               this.e = a(this.d, 16719904);
            } else {
               this.e = a((String)this.d, (int)65280);
            }
         }
      }

      super.c[6] = 0;
   }

   public void b(byte var1) {
      int var2 = ci.b(var1);
      int var3 = ci.c(var1);
      this.a(super.b[8] + var2, super.b[9] + var3, h);
   }

   public void b(int var1, int var2) {
      this.a(var1, var2, 0);
   }

   public final void a(byte var1, boolean var2) {
      if (!this.t() || !var2) {
         super.b[1] = var1;
         super.c[5] = -1;
      }

      super.b[3] = var1;
   }

   public final void a(String var1, int var2, byte var3, int var4) {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }

      super.b[7] = var3;
      this.e = a(var1, var2);
      super.c[6] = (short)(var4 <= 0 ? 1250 + var1.length() * 85 : var4);
   }

   public final void a(byte var1, String var2, short var3, byte var4) {
      this.d = var2;
      this.g = var2.startsWith("GM-");
      super.b[10] = var1;
      super.b[6] = var4;
      super.c[4] = var3;
      super.c[5] = -1;
      this.u();
   }

   public void a(int var1) {
      super.a(var1);
      int var2 = (super.b[5] & 255) + var1;
      if (var2 >= 200) {
         super.b[5] = (byte)(var2 % 200);
         ++super.b[4];
         super.c[5] = -1;
      } else {
         super.b[5] = (byte)var2;
      }

      short[] var3;
      if (super.c[1] > 0) {
         if (Math.abs(super.c[2]) + Math.abs(super.c[3]) > super.a.d() + super.a.d()) {
            super.c[1] = 0;
         } else {
            var3 = super.c;
            var3[1] -= (short)var1;
            if (super.c[1] < 0) {
               super.c[1] = 0;
               this.a(super.b[3], false);
            }
         }
      }

      if (super.c[6] > 0) {
         var3 = super.c;
         var3[6] -= (short)var1;
         if (super.c[6] <= 0) {
            this.u();
         }
      }

   }

   public final boolean a(int var1, int var2) {
      return super.b[8] == (byte)var1 && super.b[9] == (byte)var2;
   }

   public void a(s var1, byte var2) {
      int var3 = this.o();
      int var4 = this.p();
      if (var1.b(var3, var4, super.a.d(), super.a.d())) {
         if (var2 == 0) {
            if (super.c[5] == -1) {
               this.a(var1);
            }

            var1.a(super.c[5], var3, var4);
            var1.a(var1.b(super.b[6] - 1), var3, var4);
         }

         if (this.e != null && super.b[7] == var2) {
            this.e.a(var1, (byte)1).c(super.a.f());
            int var5 = var3 + super.a.e();
            int var6 = this.e.c() >> 1;
            int var7 = var4 - this.e.a_();
            if (this.s() == 4) {
               --var7;
            }

            if (var5 - var6 >= super.a.g() && var5 + var6 <= super.a.h()) {
               int var8 = super.a.f() >> 1;
               this.e.b(var8).a(var1, var5 - var8, var7);
            } else {
               this.e.b(var5 - super.a.g()).a(var1, super.a.g(), Math.max(super.a.i(), var7));
            }
         }

         if (var2 == super.b[7] && this.s() == 4) {
            var1.c(0, var3 - 1, var4 - 3, super.a.d() + 2, 3);
            var1.c(65280, var3, var4 - 2, Math.max(bh.a(0, super.a.d(), this.f, 100), 1), 1);
         }
      }

   }

   public void a(byte var1, byte var2) {
      byte[] var10000 = super.b;
      var10000[8] += var1;
      var10000 = super.b;
      var10000[9] += var2;
   }

   protected void c() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }

   }

   protected final void a(int var1, int var2, int var3) {
      if (var3 > 0) {
         super.c[2] = (short)(this.o() - var1 * super.a.d());
         super.c[3] = (short)(this.p() - var2 * super.a.d());
         super.c[1] = (short)var3;
         super.c[0] = (short)var3;
      } else {
         super.c[1] = 0;
      }

      super.b[8] = (byte)var1;
      super.b[9] = (byte)var2;
   }

   private static aw a(String var0, int var1) {
      return aw.a(var0).a(var1);
   }

   private void a(s var1) {
      super.c[5] = var1.a(super.c[4], super.b[1], (byte)(this.t() ? (super.b[4] & 1) + 1 : 0));
   }
}
