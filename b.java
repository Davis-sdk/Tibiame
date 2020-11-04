public abstract class b extends c {
   protected int a = 0;
   private byte b = 0;

   protected b() {
      super(false);
   }

   public final b a(int var1) {
      if (this.a != var1) {
         this.a = var1;
         this.b(var1);
      }

      return this;
   }

   public final byte a() {
      return this.b;
   }

   public final b a(byte var1) {
      if (this.b != var1) {
         this.b = var1;
         this.c(var1);
      }

      return this;
   }

   public abstract String b();

   public boolean a(boolean var1) {
      String var2 = this.b();
      if (var2 == null) {
         return true;
      } else if (var1) {
         return var2.trim().length() == 0;
      } else {
         return var2.length() == 0;
      }
   }

   public abstract b a(String var1);

   protected void a(c var1) {
      super.a(var1);
      ((b)var1).a(this.b).a(this.a).a(this.b());
   }

   protected abstract void b(int var1);

   protected abstract void c(int var1);
}
