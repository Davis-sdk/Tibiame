import java.io.IOException;
import java.io.InputStream;

public abstract class ay {
   private final String[] a = new String[18];
   private cd[] b;

   protected ay() {
      String var1 = "2.13";
      this.a[1] = var1;
   }

   public final int a() {
      return cd.a(this.b);
   }

   public final int b() {
      return this.b == null ? 0 : this.b.length;
   }

   public final void a(cd var1) {
      int var3 = this.b();
      cd[] var2 = new cd[var3 + 1];
      if (var3 > 0) {
         System.arraycopy(this.b, 0, var2, 0, var3);
      }

      var2[var3] = var1;
      this.a(var2);
      this.b = var2;
   }

   public abstract void c();

   public abstract boolean d();

   public abstract void e();

   public abstract void a(ae var1);

   public final void a(int var1) {
      cd var2 = this.c(var1);
      if (var2 != null) {
         cd[] var3 = new cd[this.b() - 1];
         int var4 = 0;
         int var5 = 0;

         for(int var6 = this.b(); var4 < var6; ++var4) {
            cd var7 = this.b(var4);
            if (var7 != var2) {
               var3[var5++] = var7;
            }
         }

         this.a(var3);
         this.d(var1);
         this.b = var3;
      }

   }

   public abstract int f();

   public final boolean a(byte var1) {
      return this.b(var1) != 0;
   }

   public final InputStream a(int var1, String var2) {
      InputStream var3 = this.b(var1, var2);
      if (var3 == null) {
         throw bh.d(1446008644, (var1 == 0 ? "" : String.valueOf(var1) + '-') + var2);
      } else {
         return var3;
      }
   }

   public abstract InputStream b(int var1, String var2);

   public final int b(byte var1) {
      String var2 = this.c(var1);
      if (var2 == null) {
         return 0;
      } else {
         try {
            return Integer.parseInt(var2);
         } catch (NumberFormatException var4) {
            return 0;
         }
      }
   }

   public final cd b(int var1) {
      return this.b[var1];
   }

   public final cd c(int var1) {
      return cd.a(this.b, var1);
   }

   public final String c(byte var1) {
      String var2 = this.a[var1];
      if (var2 == "null") {
         return null;
      } else {
         if (var2 == null && !e(var1)) {
            try {
               var2 = this.d(var1);
            } catch (IOException var4) {
               bh.a((byte)2, 1481519194, (Throwable)var4);
               var2 = null;
            }
         }

         this.a[var1] = var2 == null ? "null" : var2;
         return var2;
      }
   }

   public final boolean b(cd var1) {
      cd var2 = this.c(var1.b);
      return var2 != null && var2.e >= var1.e;
   }

   public abstract y[] g();

   public abstract z h();

   public abstract boolean a(int var1, int var2, int var3, bk var4);

   public final void i() {
      this.b = this.k();
   }

   public abstract bk a(int var1, String var2, int var3);

   public abstract void j();

   public abstract void a(y[] var1);

   public abstract void b(ae var1);

   public abstract void a(bk var1, int var2, int var3, int var4);

   public final void a(byte var1, String var2) {
      this.a[var1] = var2 == null ? "null" : var2;
      if (!e(var1)) {
         try {
            this.b(var1, var2);
         } catch (IOException var4) {
            bh.a((byte)2, 1482111061, (Throwable)var4);
         }
      }

   }

   public final void a(byte var1, int var2) {
      this.a(var1, bh.h(var2));
   }

   public final void a(byte var1, boolean var2) {
      this.a(var1, bh.h(var2 ? 1 : 0));
   }

   protected abstract void d(int var1);

   protected abstract cd[] k();

   protected abstract String d(byte var1);

   protected abstract void a(cd[] var1);

   protected abstract void b(byte var1, String var2);

   private static boolean e(byte var0) {
      return var0 != 0 && var0 != 4 && var0 != 3 && var0 != 11 && var0 != 12 && var0 != 2 && var0 != 13 && var0 != 15 && var0 != 14 && var0 != 16 && var0 != 17;
   }
}
