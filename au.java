public final class au extends c {
   static final int MBOOSTER_MAX_INSTANCES = 24;
   private static final String[] a = bh.a("-,Á,Â,¿,À,0,1,2,3,4,5,6,7,8,9,#,*,L,R", ',');
   private boolean b;
   private byte c = -1;

   public au() {
      super(false);
   }

   public byte a() {
      return this.c;
   }

   public au a(byte var1) {
      if (var1 != this.c) {
         this.c = var1;
         this.x();
      }

      return this;
   }

   public au a(boolean var1) {
      if (var1 != this.b) {
         this.b = var1;
         this.x();
      }

      return this;
   }

   public static byte a(int var0) {
      for(int var1 = 0; var1 < a.length; ++var1) {
         if (a[var1].charAt(0) == (char)var0 && var1 > 0) {
            return (byte)(var1 - 1);
         }
      }

      return -1;
   }

   protected void a(s var1) {
      int var2 = this.b(0);

      for(int var3 = 1; var3 < a.length; ++var3) {
         var2 = Math.max(var2, this.b(var3));
      }

      this.c(var2 + 2, var1.a((byte)3, (byte)1) + 5);
   }

   protected void a(c var1) {
      super.a(var1);
      ((au)var1).a(this.b).a(this.c);
   }

   protected void b(s var1) {
      int var2 = this.u((byte)0);
      int var3 = this.u((byte)1);
      var1.c(this.b ? 0 : 10526880, 0, 0, var2, var3);
      if (this.b) {
         var1.a(8925952, 1, 1, var2 - 2, (int)(var3 - 2));
      }

      String var4 = a[this.c + 1];
      char var5 = var4.charAt(0);
      if (cg.b(var5)) {
         var1.b((short)var1.a(cg.a(var5)), var2 >> 1, var3 >> 1, 3);
      } else {
         var1.a((byte)(this.b ? 1 : 0), var4, this.b ? 16777215 : 10526880, var2 >> 1, var3 - 4, 17);
      }

      var1.b();
   }

   private int b(int var1) {
      s var2 = this.d();
      String var3 = a[var1];
      char var4 = var3.charAt(0);
      return cg.b(var4) ? var2.b(var2.a(cg.a(var4))) : var2.a((byte)0, (byte)1, (String)var3, 0, var3.length());
   }
}
