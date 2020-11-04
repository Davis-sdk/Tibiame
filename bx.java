public class bx extends Thread {
   static final int MBOOSTER_MAX_INSTANCES = 2;
   private boolean a;

   protected bx() {
   }

   public final void b() {
      synchronized(this) {
         if (!this.a) {
            this.a = true;
            this.d();
         }

      }
   }

   public final void run() {
      try {
         this.a();
      } catch (Throwable var2) {
         bh.a((byte)2, 961698125, this.toString(), var2);
      }

   }

   protected void a() {
   }

   protected final boolean c() {
      synchronized(this) {
         return this.a;
      }
   }

   protected void d() {
   }
}
