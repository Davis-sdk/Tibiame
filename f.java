public class f extends v {
   static final int MBOOSTER_MAX_INSTANCES = 16;
   private short b = -1;

   public short E() {
      return this.b;
   }

   public f a(short var1) {
      if (this.b != var1) {
         this.b = var1;
         if (this.k()) {
            this.a(this.g().a(var1));
         }
      }

      return this;
   }

   protected void a(s var1) {
      this.a(this.g().a(this.b));
      super.a(var1);
   }

   protected void a(c var1) {
      super.a(var1);
      ((f)var1).a(this.b);
   }
}
