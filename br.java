public final class br extends Thread {
   static final int MBOOSTER_MAX_INSTANCES = 3;
   private final e a;
   private final m b;

   public br(m var1, boolean var2) {
      this(var1, var2, new e());
   }

   public br(m var1, boolean var2, e var3) {
      this.b = var1;
      this.a = var3;
      if (var2) {
         this.setPriority(9);
      }

   }

   public e a() {
      return this.a;
   }

   public void run() {
      try {
         this.b.a(this.a);
      } catch (Throwable var2) {
         bh.a((byte)2, 961754698, this.b.toString(), var2);
      }

   }
}
