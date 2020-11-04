import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class a extends ad {
   static final int MBOOSTER_MAX_INSTANCES = 3;
   public static final Object a = "";
   public static final Object b = "1";
   private final StringBuffer c = new StringBuffer(32);
   private final DataInputStream d;
   private final aj e = new aj(this, (bn)null);
   private final Object[] f;
   private byte g;
   private String h;
   private Object[] i;

   public a(InputStream var1, String var2) {
      this.d = new DataInputStream(this.e);
      DataInputStream var3 = new DataInputStream(var1);

      try {
         int var4 = var3.readUnsignedByte();
         int var6 = -1;

         int var7;
         for(var7 = 0; var7 < var4; ++var7) {
            byte var8 = var3.readByte();
            String var9 = bh.a(var3);
            if (var6 == -1 && (var2 == null || bh.a((Object)var9, var2))) {
               var6 = var7;
               this.g = var8;
               this.h = var9;
            }
         }

         if (var6 == -1) {
            throw bh.d(1161122899, var2);
         } else {
            int var5 = var3.readUnsignedShort();
            this.f = new Object[var5];

            do {
               if (var6-- <= 0) {
                  var3.readUnsignedShort();

                  for(var7 = 0; var7 < var5; ++var7) {
                     int var15 = var3.readUnsignedShort();
                     int var16 = var3.readShort() & 4095;
                     short var10 = var3.readShort();
                     if (var10 == -1) {
                        if (var3.readByte() != 0) {
                           throw bh.d(1163479623);
                        }

                        this.f[var16] = bh.a(var3);
                     } else {
                        byte[] var11 = new byte[var15 - 2];
                        var11[0] = (byte)(var10 >> 8);
                        var11[1] = (byte)var10;
                        bh.a(var3, var11, 2, var11.length - 2);
                        this.f[var16] = var11;
                     }
                  }

                  return;
               }

               var7 = var3.readUnsignedShort();
            } while(var3.skipBytes(var7) == var7);

            throw bh.d(1163221316);
         }
      } finally {
         var3.close();
      }
   }

   public String a(short var1, Object[] var2) {
      if (var1 == -1) {
         return "";
      } else {
         Object var3 = this.f[var1 & 4095];
         if (var3 instanceof String) {
            return (String)var3;
         } else if (var3 instanceof byte[]) {
            aj.a(this.e, (byte[])((byte[])var3));
            this.i = var2;

            try {
               int var5 = 0;

               for(int var6 = this.d.readUnsignedShort(); var5 < var6; ++var5) {
                  this.c.append(this.d());
               }
            } catch (IOException var10) {
               throw bh.a(1180321862, (Throwable)var10);
            } finally {
               this.i = null;
            }

            String var4 = this.c.toString();
            this.c.delete(0, this.c.capacity());
            return var4;
         } else {
            throw bh.a(1179071053);
         }
      }
   }

   public byte a() {
      return this.g;
   }

   public String b() {
      return this.h;
   }

   private static boolean a(int var0, Object var1, Object var2) {
      int var3;
      if (var1 instanceof String && var2 instanceof String) {
         var3 = ((String)var1).compareTo((String)var2);
      } else {
         var3 = bh.a(b(var1), b(var2));
      }

      boolean var4;
      if (var0 == 0) {
         var4 = var3 == 0;
      } else if (var0 == 1) {
         var4 = var3 != 0;
      } else if (var0 == 2) {
         var4 = var3 == 1;
      } else if (var0 == 3) {
         var4 = var3 >= 0;
      } else if (var0 == 4) {
         var4 = var3 == -1;
      } else {
         if (var0 != 5) {
            throw bh.b(876170074, String.valueOf(var0));
         }

         var4 = var3 <= 0;
      }

      return var4;
   }

   private static boolean a(Object var0) {
      if (var0 == null) {
         return false;
      } else if (var0 instanceof Boolean) {
         return (Boolean)var0;
      } else if (var0 instanceof Integer) {
         return (Integer)var0 != 0;
      } else {
         return var0 instanceof String && ((String)var0).length() > 0;
      }
   }

   private static int b(Object var0) {
      if (var0 == null) {
         return 0;
      } else if (var0 instanceof Boolean) {
         return (Boolean)var0 ? 1 : 0;
      } else if (var0 instanceof Integer) {
         return (Integer)var0;
      } else if (var0 instanceof String) {
         try {
            return Integer.parseInt((String)var0);
         } catch (NumberFormatException var2) {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private void c() {
      int var1 = this.d.readUnsignedByte();
      if (var1 == 0) {
         bh.a(this.d);
      } else if (var1 == 3) {
         this.d.readInt();
      } else if (var1 == 1) {
         this.d.readByte();
      } else if (var1 == 2) {
         boolean var2 = this.d.readBoolean();
         this.c();
         this.c();
         if (var2) {
            this.c();
         }
      } else if (var1 == 4) {
         this.d.readByte();
         this.c();
         this.c();
      } else {
         int var3;
         if (var1 == 5) {
            var3 = this.d.readUnsignedShort();

            while(var3-- > 0) {
               this.c();
            }
         } else {
            if (var1 != 6) {
               throw bh.d(826822216, String.valueOf(var1));
            }

            this.c();
            var3 = this.d.readUnsignedByte() << 1;

            while(var3-- > 0) {
               this.c();
            }

            if (this.d.readBoolean()) {
               this.c();
            }
         }
      }

   }

   private Object d() {
      int var1 = this.d.readUnsignedByte();
      Object var2;
      if (var1 == 0) {
         var2 = bh.a(this.d);
      } else if (var1 == 3) {
         var2 = bh.g(this.d.readInt());
      } else if (var1 == 1) {
         int var3 = this.d.readUnsignedByte();
         if (var3 >= this.i.length) {
            var2 = "#" + var3;
         } else if (this.i[var3] == null) {
            var2 = "";
         } else {
            var2 = this.i[var3];
         }
      } else if (var1 == 2) {
         boolean var7 = this.d.readBoolean();
         if (a(this.d())) {
            var2 = this.d();
            if (var7) {
               this.c();
            }
         } else if (var7) {
            this.c();
            var2 = this.d();
         } else {
            this.c();
            var2 = "";
         }
      } else if (var1 == 4) {
         var2 = bh.a(a(this.d.readByte(), this.d(), this.d()));
      } else {
         int var4;
         if (var1 == 5) {
            StringBuffer var8 = new StringBuffer(16);
            var4 = this.d.readUnsignedShort();

            while(var4-- > 0) {
               var8.append(this.d());
            }

            var2 = var8.toString();
         } else {
            if (var1 != 6) {
               throw bh.d(861419610, String.valueOf(var1));
            }

            Object var9 = this.d();
            var4 = this.d.readUnsignedByte();
            int var6 = -1;

            int var5;
            for(var5 = 0; var5 < var4; ++var5) {
               if (a(0, this.d(), var9)) {
                  var6 = var5;
                  break;
               }
            }

            ++var5;

            while(var5 < var4) {
               this.c();
               ++var5;
            }

            if (var6 == -1) {
               for(var5 = 0; var5 < var4; ++var5) {
                  this.c();
               }

               if (this.d.readBoolean()) {
                  var2 = this.d();
               } else {
                  var2 = "";
               }
            } else {
               for(var5 = 0; var5 < var6; ++var5) {
                  this.c();
               }

               var2 = this.d();
               ++var5;

               while(var5 < var4) {
                  this.c();
                  ++var5;
               }

               if (this.d.readBoolean()) {
                  this.c();
               }
            }
         }
      }

      return var2;
   }
}
