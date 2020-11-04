import java.io.DataInputStream;

public final class x {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private final ao[] a;
   private final DataInputStream b;
   private final c[] c;

   public x(DataInputStream var1) {
      this.b = var1;
      if (var1.readInt() != 1447580249) {
         throw bh.d(1129984342);
      } else if (var1.readUnsignedByte() != 3) {
         throw bh.d(1146634553);
      } else {
         this.c = new c[var1.readUnsignedShort() + 1];
         this.a = new ao[var1.readUnsignedByte() + 1];
      }
   }

   public x a(short var1, ao var2) {
      this.a[var1] = var2;
      return this;
   }

   public x a(short var1, c var2) {
      this.c[var1] = var2;
      return this;
   }

   public c a(short var1) {
      c var2;
      if (var1 >= 0 && var1 < this.c.length && (var2 = this.c[var1]) != null) {
         return var2;
      } else {
         throw bh.b(945441347, String.valueOf(var1));
      }
   }

   public c a() {
      c var1;
      try {
         var1 = this.b();
      } finally {
         this.b.close();
      }

      return var1;
   }

   private static boolean a(int var0, int var1) {
      return (var0 & var1) == var1;
   }

   private c b() {
      c var4 = null;
      int var2 = this.b.readUnsignedShort();
      int var1 = this.b.readInt();
      if (a(var1, 262144)) {
         ao var5 = this.a[this.b.readUnsignedByte()];
         if (var5 == null) {
            throw bh.d(1160856909);
         }

         var4 = var5.a(this.b);
      }

      int var3 = a(var1, 1) ? this.b.readUnsignedShort() : -1;
      if (var4 == null) {
         if (var3 != -1 && this.c[var3] != null) {
            var4 = this.c[var3];
         } else {
            var4 = new c();
         }
      }

      if (var3 != -1 && this.c[var3] == null) {
         this.c[var3] = var4;
      }

      var4.c(a(var1, 2) ? this.b.readByte() & 255 : var4.r((byte)0), a(var1, 4) ? this.b.readByte() & 255 : var4.r((byte)1));
      var4.b(a(var1, 8) ? this.b.readByte() : var4.f((byte)0), a(var1, 16) ? this.b.readByte() : var4.f((byte)1));
      var4.a(a(var1, 32) ? this.b.readByte() : var4.e((byte)0), a(var1, 64) ? this.b.readByte() : var4.e((byte)1));
      var4.a(a(var1, 128) ? this.b.readByte() : var4.j((byte)0), a(var1, 256) ? this.b.readByte() : var4.j((byte)1), a(var1, 512) ? this.b.readByte() : var4.k((byte)0), a(var1, 1024) ? this.b.readByte() : var4.k((byte)1));
      var4.b(a(var1, 4096) ? this.b.readByte() & 255 : var4.n((byte)0), a(var1, 8192) ? this.b.readByte() & 255 : var4.n((byte)1), a(var1, 16384) ? this.b.readByte() & 255 : var4.o((byte)0), a(var1, 32768) ? this.b.readByte() & 255 : var4.o((byte)1));
      var4.e(a(var1, 65536) ? this.b.readByte() : var4.j());
      var4.d(a(var1, 131072) ? this.b.readUnsignedShort() : var4.e());
      var4.b(a(var2, 1));
      var4.c(a(var2, 4));
      var4.b(a(var2, 8), a(var2, 16));
      var4.c(a(var2, 128), a(var2, 256));
      var4.a(a(var2, 32), a(var2, 64));
      if (a(var1, 2048)) {
         int var7 = this.b.readUnsignedByte();
         var4.j(var7);
         var4.c(this.b.readByte(), this.b.readByte(), this.b.readByte(), this.b.readByte());

         for(int var6 = 0; var6 < var7; ++var6) {
            var4.b(this.b());
         }
      }

      return var4;
   }
}
