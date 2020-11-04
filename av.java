import java.io.DataInputStream;
import java.io.InputStream;

public final class av {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private static final int a;
   private static final byte[] b = new byte[17];
   private final bk c;
   private int d;

   public av(int var1) {
      this.c = new bk(var1);
   }

   public byte[] a() {
      return this.c.a();
   }

   public int b() {
      return this.d;
   }

   public void a(InputStream var1) {
      DataInputStream var2 = new DataInputStream(var1);
      int var3 = var2.readUnsignedByte() + 1;
      int var4 = var2.readUnsignedByte() + 1;
      byte var6 = var2.readByte();
      int var5 = var2.readUnsignedByte() + 1;
      int var13 = var2.readUnsignedByte();
      int[] var7 = new int[var5];
      int var14;
      int var15;
      if (var13 == 0) {
         var14 = 0;

         for(var15 = var7.length; var14 < var15; ++var14) {
            var7[var14] = var2.readUnsignedShort();
         }
      } else {
         if (var13 != 1) {
            throw bh.d(1162103637, String.valueOf(var13));
         }

         var14 = 0;

         for(var15 = var7.length; var14 < var15; ++var14) {
            var7[var14] = var2.readInt();
         }
      }

      int var8 = var2.readInt();
      int var9 = var2.readInt();
      int var10 = var2.readInt();
      int var11 = var2.readInt();
      int var12 = (var2.readShort() & '\uffff') + 1;
      this.d = 81 + (var5 << 2) + var12;
      if (this.d > this.c.d()) {
         throw bh.d(1179141968, String.valueOf(this.d));
      } else {
         this.c.e();
         this.c.a(-8552249625308161526L);
         this.c.g(b.length - 4);
         b[12] = var6;
         b[7] = (byte)var3;
         b[11] = (byte)var4;
         this.c.a(b, 0, b.length);
         this.c.g(var8);
         this.c.g(var5 * 3);
         this.c.g(1347179589);
         byte var16;
         if (var13 == 0) {
            for(var14 = 0; var14 < var5; ++var14) {
               var15 = var7[var14];
               var16 = (byte)(var15 >>> 7 & 248);
               this.c.a(var16);
               var16 = (byte)(var15 >>> 2 & 248);
               this.c.a(var16);
               var16 = (byte)(var15 << 3 & 248);
               this.c.a(var16);
            }
         } else {
            for(var14 = 0; var14 < var5; ++var14) {
               var15 = var7[var14];
               var16 = (byte)(var15 >>> 16 & 255);
               this.c.a(var16);
               var16 = (byte)(var15 >>> 8 & 255);
               this.c.a(var16);
               var16 = (byte)(var15 & 255);
               this.c.a(var16);
            }
         }

         this.c.g(var9);
         this.c.g(var5);
         this.c.g(1951551059);
         byte var17;
         if (var13 == 0) {
            for(var14 = 0; var14 < var5; ++var14) {
               var17 = (byte)((var7[var14] & '耀') == 0 ? 0 : 255);
               this.c.a(var17);
            }
         } else {
            for(var14 = 0; var14 < var5; ++var14) {
               var17 = (byte)(var7[var14] >>> 24);
               this.c.a(var17);
            }
         }

         this.c.g(var10);
         this.c.g(var12);
         this.c.g(1229209940);
         this.c.a(var2, var12);
         this.c.g(var11);
         this.c.g(0);
         this.c.g(1229278788);
         this.c.g(a);
      }
   }

   static {
      b[0] = 73;
      b[1] = 72;
      b[2] = 68;
      b[3] = 82;
      b[13] = 3;
      b[14] = 0;
      b[15] = 0;
      b[16] = 0;
      a = -1371381630;
   }
}
