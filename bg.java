public final class bg extends f {
   static final int MBOOSTER_MAX_INSTANCES = 2;
   private short[] b;
   private int c;

   public bg a(short[] var1) {
      this.b = var1;
      if (var1 != null && var1.length != 0) {
         this.p(0);
      } else {
         this.a((short)-1);
      }

      return this;
   }

   public bg p(int var1) {
      var1 = bh.b(var1, this.b.length);
      this.c = var1;
      this.a(this.b[this.c]);
      return this;
   }

   protected boolean z(byte var1) {
      if (this.b != null && this.b.length > 0) {
         switch(var1) {
         case 1:
         case 16:
            this.p(this.c - 1);
            return true;
         case 3:
            this.p(this.c - 1);
            return true;
         }
      }

      return false;
   }
}
