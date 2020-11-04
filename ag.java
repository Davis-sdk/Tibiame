import java.io.IOException;
import java.io.InputStream;

public final class ag extends ad {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final String[] a;
   private final String b;
   private final ad[] c;
   private final ay d;
   private byte e;

   public ag(ay var1, String var2) {
      this.d = var1;
      this.b = var2;
      this.a = new String[16];
      this.c = new ad[16];
   }

   public ag a(int var1, String var2) {
      this.a[a(var1)] = var2;
      return this;
   }

   public String a(short var1, Object[] var2) {
      try {
         return var1 == -1 ? "" : this.b(var1).a(var1, var2);
      } catch (IOException var4) {
         bh.a((byte)2, 860575834, (Throwable)var4);
         return "[" + var1 + ']';
      }
   }

   public byte a() {
      return this.e;
   }

   public String b() {
      return this.b;
   }

   private static int a(int var0) {
      return (var0 & '\uf000') >>> 12;
   }

   private ad b(int var1) {
      Object var2 = this.c[var1];
      if (var2 == null) {
         String var3 = this.a[var1];
         InputStream var4 = this.d.b((int)1, var3);
         if (var4 == null) {
            var4 = this.d.a((int)0, var3);
         }

         this.c[var1] = (ad)(var2 = new a(var4, this.b));
         this.e = ((ad)var2).a();
      }

      return (ad)var2;
   }

   private ad b(short var1) {
      return this.b(a(var1));
   }
}
