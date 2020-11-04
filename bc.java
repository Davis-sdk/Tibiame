public abstract class bc extends al {
   protected final int a;
   protected final int b;
   private boolean c;

   protected bc(int var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public abstract void a(int var1);

   public abstract void a(int var1, int var2, int var3);

   public void a(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < var5; ++var6) {
         for(int var7 = 0; var7 < var4; ++var7) {
            this.a(var1, var7 + var2, var6 + var3);
         }
      }

   }

   public abstract void a(int var1, int var2);

   public final void c() {
      if (!this.c) {
         this.c = true;
         this.a();
      }

   }

   public final int a_() {
      return this.a;
   }

   public final int b() {
      return this.b;
   }

   protected void a() {
   }
}
