import java.io.IOException;
import java.io.OutputStream;

final class bd extends bx {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final cj a;
   private final bk b;

   bd(cj var1, bk var2) {
      this.a = var1;
      this.b = var2;
   }

   protected void a() {
      try {
         while(true) {
            int var1;
            while(true) {
               if (this.c() || !this.a.d()) {
                  return;
               }

               if ((var1 = this.b.a(3, true, 250)) != -1) {
                  try {
                     if (!this.a.d()) {
                        break;
                     }

                     OutputStream var2 = this.a.c();
                     if (var2 != null) {
                        this.b.a(var2, var1);
                        var2.flush();
                     }
                     break;
                  } catch (IOException var6) {
                     if (!bh.a(var6)) {
                        bh.a((byte)2, 1196970839, (Throwable)var6);
                        return;
                     }

                     return;
                  }
               }
            }

            this.b.a(var1);
         }
      } finally {
         if (bh.a((byte)0)) {
            bh.a((byte)0, 1211385685, (String)"Out");
         }

      }
   }
}
