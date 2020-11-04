import java.util.Random;

public final class bw extends c {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final Random a = new Random();
   private final long b = System.currentTimeMillis();
   private int c = 5;
   private int d;
   private int e;
   private int f;
   private int g;

   public bw() {
      super(false);
      this.b((byte)1);
   }

   public boolean a() {
      return this.g == 0 && this.f == 0;
   }

   public boolean b() {
      return this.g == 0 && this.f == this.e;
   }

   public boolean E() {
      return this.g != 0;
   }

   public bw a(int var1) {
      this.c = var1;
      this.x();
      return this;
   }

   public bw b(int var1) {
      this.d = var1;
      return this;
   }

   public bw c(int var1) {
      this.e = var1;
      return this;
   }

   public bw a(boolean var1) {
      this.g = 0;
      this.f = var1 ? 0 : this.e;
      return this;
   }

   public void F() {
      if (this.b()) {
         this.p(this.e);
         this.s();
         this.g = -1;
      } else if (!this.a()) {
         this.g = -1;
      }

   }

   public void G() {
      if (this.a()) {
         this.p(0);
         this.s();
         this.g = 1;
      } else if (!this.b()) {
         this.g = 1;
      }

   }

   protected void a(c var1) {
      super.a(var1);
      ((bw)var1).b(this.d).c(this.e).a(this.c);
   }

   protected void b(s var1) {
      if (this.b()) {
         var1.a(this.d, 0, 0, this.u((byte)0), (int)this.u((byte)1));
         var1.b();
      } else if (!this.a()) {
         this.a.setSeed(this.b);
         int var2 = this.e(0, 65535);

         for(int var3 = 0; var3 < this.u((byte)1); var3 += this.c) {
            for(int var4 = 0; var4 < this.u((byte)0); var4 += this.c) {
               if ((this.a.nextInt() & '\uffff') <= var2) {
                  var1.a(this.d, var4, var3, this.c, this.c);
               }
            }
         }

         var1.b();
      }

   }

   protected void o(int var1) {
      if (this.g != 0) {
         this.p(this.f + var1 * this.g);
         if (this.g == -1 && this.f == 0) {
            this.g = 0;
            this.b(false);
         }

         if (this.g == 1 && this.f == this.e) {
            this.g = 0;
         }
      }

   }

   int e(int var1, int var2) {
      return (var1 * (this.e - this.f) + var2 * this.f) / this.e;
   }

   private void p(int var1) {
      if (this.f != var1) {
         this.f = bh.a(var1, 0, this.e);
         this.x();
      }

   }
}
