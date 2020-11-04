import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

public final class bh {
   public static final Boolean a = new Boolean(false);
   public static final Boolean b = new Boolean(true);
   private static final byte[] c;
   private static final char[] d;
   private static final Integer[] e;
   private static final z f = new z(3);
   private static final boolean[] g = new boolean[4];
   private static final String[] h;
   private static final String[] i = new String[]{"k", "M", "G"};

   private bh() {
   }

   public static String a(long var0, int var2) {
      try {
         String var3 = Long.toString(var0);
         int var4 = var3.length();
         int var5 = var4 - var2;
         if (var5 > 0) {
            int var6;
            for(var6 = var5 / 3; var6 >= i.length; --var6) {
            }

            var3 = var3.substring(0, var4 - (var6 + 1) * 3) + i[var6];
         }

         return var3;
      } catch (Exception var7) {
         throw a(1514881844, (Throwable)var7);
      }
   }

   public static void a(bp var0) {
      synchronized(f) {
         f.a((Object)var0);
      }
   }

   public static int a(int var0, int var1, int var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   public static int a(int var0, int var1) {
      if (var0 < var1) {
         return -1;
      } else {
         return var0 > var1 ? 1 : 0;
      }
   }

   public static boolean a(Object var0, Object var1) {
      if (var0 != null && var1 != null) {
         return var0.equals(var1);
      } else {
         return var0 == null && var1 == null;
      }
   }

   public static Error a(int var0) {
      return a(var0, (String)null);
   }

   public static Error a(int var0, String var1) {
      return new Error(b(var0, var1, (String)null));
   }

   public static Error a(int var0, Throwable var1) {
      return var1 == null ? new Error(b(var0, (String)null, (String)null)) : new Error(a(var0, (String)null, (Throwable)var1));
   }

   public static Error a(int var0, Throwable var1, String var2) {
      return var1 == null ? new Error(b(var0, var2, (String)null)) : new Error(a(var0, var2, var1));
   }

   public static short[] a(short[] var0, int var1, int var2) {
      short[] var3;
      if (var0 == null) {
         var3 = new short[var1 + var2];
      } else {
         var3 = new short[var0.length + var1 + var2];
         System.arraycopy(var0, 0, var3, var1, var0.length);
      }

      return var3;
   }

   public static char[] a(char[] var0, int var1, char var2) {
      char[] var3 = new char[var0.length + var1];
      System.arraycopy(var0, 0, var3, 0, var0.length);
      int var4 = var0.length;

      for(int var5 = var3.length; var4 < var5; ++var4) {
         var3[var4] = var2;
      }

      return var3;
   }

   public static byte[] a(byte[] var0, int var1, int var2, byte var3) {
      int var4 = var1;

      for(int var5 = var2 == -1 ? var0.length : var1 + var2; var4 < var5; ++var4) {
         var0[var4] = var3;
      }

      return var0;
   }

   public static char[] a(char[] var0, int var1, int var2, char var3) {
      int var4 = var1;

      for(int var5 = var2 == -1 ? var0.length : var1 + var2; var4 < var5; ++var4) {
         var0[var4] = var3;
      }

      return var0;
   }

   public static IllegalArgumentException b(int var0) {
      return new IllegalArgumentException(b(var0, (String)null, (String)null));
   }

   public static IllegalArgumentException b(int var0, String var1) {
      return new IllegalArgumentException(b(var0, var1, (String)null));
   }

   public static IllegalStateException c(int var0) {
      return new IllegalStateException(b(var0, (String)null, (String)null));
   }

   public static IllegalStateException c(int var0, String var1) {
      return new IllegalStateException(b(var0, var1, (String)null));
   }

   public static int a(Object[] var0, Object var1) {
      int var2 = 0;

      for(int var3 = var0.length; var2 < var3; ++var2) {
         if (a(var0[var2], var1)) {
            return var2;
         }
      }

      return -1;
   }

   public static boolean b(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      return var0 + var2 * (var1 - var0) / var3;
   }

   public static IOException d(int var0) {
      return new IOException(b(var0, (String)null, (String)null));
   }

   public static IOException a(int var0, String var1, String var2) {
      return new IOException(b(var0, var1, var2));
   }

   public static IOException d(int var0, String var1) {
      return new IOException(b(var0, var1, (String)null));
   }

   public static IOException b(int var0, Throwable var1) {
      return new IOException(a(var0, (String)null, (Throwable)var1));
   }

   public static boolean a(IOException var0) {
      if (var0 instanceof EOFException) {
         return true;
      } else if (var0 instanceof InterruptedIOException) {
         return true;
      } else {
         String var1 = var0.getMessage();
         if (var1 != null) {
            if (var1.indexOf("closed") != -1) {
               return true;
            }

            if (var1.indexOf("failed") != -1) {
               return true;
            }

            if (var1.indexOf("reset") != -1) {
               return true;
            }

            if (var1.indexOf("read from socket") != -1) {
               return true;
            }

            if (var1.indexOf("Not connected") != -1) {
               return true;
            }
         }

         return false;
      }
   }

   public static int a(String var0) {
      return var0 == null ? 0 : var0.length();
   }

   public static int a(Object[] var0) {
      return var0 == null ? 0 : var0.length;
   }

   public static int a(z var0) {
      return var0 == null ? 0 : var0.d();
   }

   public static void a(byte var0, int var1) {
      a(var0, var1, (String)null);
   }

   public static void a(byte var0, int var1, String var2) {
      if (g[var0]) {
         a(b(var1, var2, (String)null), var0);
      }

   }

   public static void a(byte var0, int var1, Throwable var2) {
      if (g[var0]) {
         String var3;
         if (var2 == null) {
            var3 = b(var1, (String)null, (String)null);
         } else {
            var3 = a(var1, (String)null, (Throwable)var2);
         }

         a(var3, var0);
      }

   }

   public static void a(byte var0, int var1, String var2, Throwable var3) {
      if (g[var0]) {
         String var4;
         if (var3 == null) {
            var4 = b(var1, var2, (String)null);
         } else {
            var4 = a(var1, var2, var3);
         }

         a(var4, var0);
      }

   }

   public static boolean a(byte var0) {
      return g[var0];
   }

   public static String a(byte[] var0, int var1, int var2) {
      int var4;
      if (var2 >= 256) {
         char[] var3 = new char[var2];

         for(var4 = 0; var4 < var2; ++var4) {
            var3[var4] = (char)(var0[var4 + var1] & 255);
         }

         return new String(var3, 0, var2);
      } else {
         synchronized(c) {
            for(var4 = 0; var4 < var2; ++var4) {
               d[var4] = (char)(var0[var4 + var1] & 255);
            }

            return new String(d, 0, var2);
         }
      }
   }

   public static void a(InputStream var0, byte[] var1, int var2, int var3) {
      do {
         int var4;
         try {
            var4 = var0.read(var1, var2, var3);
         } catch (Throwable var6) {
            var4 = 0;
         }

         if (var4 == -1) {
            throw new EOFException(b(1465535304, (String)null, (String)null));
         }

         var2 += var4;
         var3 -= var4;
      } while(var3 > 0);

   }

   public static String a(DataInputStream var0) {
      synchronized(c) {
         int var2 = var0.readUnsignedShort();
         int var3 = var0.readUnsignedShort();
         byte[] var4 = var3 > c.length ? new byte[var3] : c;
         char[] var5 = var2 > d.length ? new char[var2] : d;
         a(var0, var4, 0, var3);
         int var7 = 0;

         int var6;
         int var8;
         for(var6 = 0; var7 < var3; var5[var6++] = (char)var8) {
            var8 = var4[var7] & 255;
            if (var8 > 127) {
               break;
            }

            ++var7;
         }

         while(var7 < var3) {
            var8 = var4[var7] & 255;
            byte var9;
            switch(var8 >> 4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
               ++var7;
               var5[var6++] = (char)var8;
               break;
            case 8:
            case 9:
            case 10:
            case 11:
            default:
               throw d(1447179833);
            case 12:
            case 13:
               var7 += 2;
               if (var7 > var3) {
                  throw d(1413761607);
               }

               var9 = var4[var7 - 1];
               if ((var9 & 192) != 128) {
                  throw d(1429287251);
               }

               var5[var6++] = (char)((var8 & 31) << 6 | var9 & 63);
               break;
            case 14:
               var7 += 3;
               if (var7 > var3) {
                  throw d(1429821268);
               }

               var9 = var4[var7 - 2];
               byte var10 = var4[var7 - 1];
               if ((var9 & 192) != 128 || (var10 & 192) != 128) {
                  throw d(1431980886);
               }

               var5[var6++] = (char)((var8 & 15) << 12 | (var9 & 63) << 6 | var10 & 63);
            }
         }

         return new String(var5, 0, var6);
      }
   }

   public static void b(bp var0) {
      synchronized(f) {
         f.d(var0);
      }
   }

   public static void a(byte var0, boolean var1) {
      g[var0] = var1;
   }

   public static int e(int var0) {
      return var0 == 0 ? 0 : (var0 > 0 ? 1 : -1);
   }

   public static void f(int var0) {
      try {
         Thread.sleep((long)var0);
      } catch (InterruptedException var2) {
      }

   }

   public static void a(Object[] var0, int var1, int var2, ap var3) {
      int var4 = var1 + 1;
      int var5 = var1 + var2;

      while(var4 < var5) {
         if (var3.a(var0[var4], var0[var4 - 1]) < 0) {
            Object var6 = var0[var4];
            var0[var4] = var0[var4 - 1];
            var0[var4 - 1] = var6;
            if (var4 > var1 + 1) {
               --var4;
            }
         } else {
            ++var4;
         }
      }

   }

   public static String[] a(String var0, char var1) {
      int var5 = 0;

      int var3;
      for(var3 = 0; var5 != -1; ++var3) {
         var5 = var0.indexOf(var1, var5 + 1);
      }

      String[] var2 = new String[var3];
      var5 = -1;
      int var6 = 0;

      do {
         int var4 = var5 + 1;
         var5 = var0.indexOf(var1, var4);
         if (var5 == -1) {
            var5 = var0.length();
         }

         var2[var6] = var0.substring(var4, var5);
         ++var6;
      } while(var6 < var3);

      return var2;
   }

   public static short a(short var0) {
      return (short)(var0 << 8 | var0 >> 8 & 255);
   }

   public static Boolean a(boolean var0) {
      return var0 ? b : a;
   }

   public static boolean b(String var0) {
      return var0 != null && "true".equals(var0.toLowerCase());
   }

   public static Integer g(int var0) {
      if (var0 >= 0 && var0 < e.length) {
         Integer var1 = e[var0];
         if (var1 == null) {
            var1 = e[var0] = new Integer(var0);
         }

         return var1;
      } else {
         return new Integer(var0);
      }
   }

   public static String h(int var0) {
      if (var0 >= 0 && var0 < h.length) {
         String var1 = h[var0];
         if (var1 == null) {
            var1 = h[var0] = String.valueOf(var0);
         }

         return var1;
      } else {
         return String.valueOf(var0);
      }
   }

   public static String b(int var0, String var1, String var2) {
      StringBuffer var3 = new StringBuffer(32);
      if (var2 == null) {
         var3.append("1:");
         var3.append(i(var0));
         var3.append("-=-");
         if (var1 != null) {
            var3.append('\n');
            var3.append("1:");
            var3.append(var1);
         }
      } else {
         int var4 = var2.indexOf("-=-");
         if (var4 == -1) {
            throw b(961229877, var2);
         }

         int var5;
         try {
            var5 = Integer.parseInt(var2.substring(0, var2.indexOf(58))) + 1;
         } catch (Throwable var7) {
            throw b(1094992449, var2);
         }

         var3.append(var5);
         var3.append(':');
         var3.append(i(var0));
         var3.append("->");
         var3.append(var2.substring(0, var4));
         var3.append("-=-");
         if (var1 != null) {
            var3.append('\n');
            var3.append(var5);
            var3.append(':');
            var3.append(var1);
         }

         if (var2.length() > var4 + "-=-".length()) {
            var3.append(var2.substring(var4 + "-=-".length()));
         }
      }

      return var3.toString();
   }

   public static String a(int var0, String var1, Throwable var2) {
      String var3;
      if (var2.getMessage() != null && var2.getMessage().indexOf("-=-") != -1) {
         var3 = b(var0, var2.getClass().getName(), var2.getMessage());
      } else {
         var3 = b(var0, var2.getClass().getName() + (var2.getMessage() != null ? '[' + var2.getMessage() + ']' : "") + (var1 != null ? ", " + var1 : ""), (String)null);
      }

      System.err.println(">>> Util.traceError");
      System.err.println(var3);
      System.err.println("- - - - - -");
      var2.printStackTrace();
      System.err.println("<<< Util.traceError");
      return var3;
   }

   public static int b(int var0, int var1) {
      int var2 = var0 % var1;
      if (var2 < 0) {
         var2 += var1;
      }

      return var2;
   }

   private static String i(int var0) {
      char[] var1 = new char[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         var1[var2] = (char)(var0 >>> 24);
         var0 <<= 8;
      }

      return new String(var1);
   }

   private static void a(String var0, byte var1) {
      bp[] var2;
      synchronized(f) {
         var2 = new bp[f.d()];
         f.a((Object[])var2);
      }

      for(int var3 = 0; var3 < var2.length; ++var3) {
         try {
            var2[var3].a(var0, var1);
         } catch (Throwable var5) {
            var5.printStackTrace();
         }
      }

   }

   static {
      a((byte)1, false);
      a((byte)2, true);
      a((byte)3, true);
      e = new Integer[101];
      h = new String[32];
      c = new byte[256];
      d = new char[256];
   }
}
