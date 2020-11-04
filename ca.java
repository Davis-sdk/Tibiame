import java.io.DataInputStream;
import java.io.IOException;

final class ca extends bx {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final cj a;
   private final bk b;

   ca(cj var1, bk var2) {
      this.a = var1;
      this.b = var2;
   }

   protected void a() {
      DataInputStream var1 = this.a.b();
      boolean var2 = false;

      try {
         while(true) {
            while(!this.c() && this.a.d()) {
               if (this.b.a((int)2, 250)) {
                  short var3;
                  try {
                     var3 = bh.a(var1.readShort());
                  } catch (IOException var10) {
                     if (!bh.a(var10)) {
                        var2 = true;
                        return;
                     }

                     return;
                  }

                  if (this.b.d() < var3) {
                     bh.a((byte)2, 1380406349, (String)String.valueOf(var3));
                     var2 = true;
                     return;
                  }

                  while(!this.b.a((int)var3, 250)) {
                     if (this.c() || !this.a.d()) {
                        return;
                     }
                  }

                  this.b.a((short)var3);

                  try {
                     this.b.a((DataInputStream)var1, var3);
                  } catch (IOException var9) {
                     bh.a((byte)2, 1196767031, (Throwable)var9);
                     var2 = true;
                     return;
                  }

                  this.b.b(var3 + 2);
               }
            }

            return;
         }
      } finally {
         this.a.a();

         while(!this.b.a((int)4, 0)) {
         }

         this.b.a((short)2);
         this.b.a((byte)3);
         this.b.a(!var2 && !this.a.e());
         this.b.b((int)4);
         if (bh.a((byte)0)) {
            bh.a((byte)0, 1197035609, (String)"In");
         }

      }
   }
}
