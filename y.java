public final class y {
   static final int MBOOSTER_MAX_INSTANCES = 10;
   public final String a;
   public final int b;

   public y(String var1) {
      int var2 = var1.indexOf(58);
      if (var2 == -1) {
         throw bh.b(942688824, var1);
      } else {
         this.a = var1.substring(0, var2);
         String var3 = var1.substring(var2 + 1);

         try {
            this.b = Integer.parseInt(var3);
         } catch (NumberFormatException var5) {
            throw bh.b(959792438, var3);
         }
      }
   }

   public y(String var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public String toString() {
      return this.a + ':' + this.b;
   }
}
