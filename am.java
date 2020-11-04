import java.io.InputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import net.rim.device.api.ui.FontFamily;
import tibiame.Main;

public final class am extends ar {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   public Image[] a;
   public Image[] b;
   Graphics c;
   private final Font d;
   private final byte e;
   private final byte f;
   private final byte g;
   private final p h;
   private final Image i;
   private final Image[] j = new Image[2];
   private final int[] k = new int[2];
   private int l = 0;

   public am(ay var1, p var2, int var3) {
      super(var1);
      this.h = var2;
      this.c = var2.getGraphics();

      try {
         FontFamily var6 = FontFamily.forName("BBClarity");

         int var7;
         for(var7 = 10; !var6.isHeightSupported(var7) || var7 > 36; ++var7) {
         }

         net.rim.device.api.ui.Font.setDefaultFont(var6.getFont(0, var7));
         Main.a("FontFamily: " + var6.getName() + ", size: " + var7);
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      this.d = Font.getDefaultFont();
      this.d.getHeight();
      bb var4 = (new bb()).a(this.d).a("xXÄÖÜ0").d();
      this.e = (byte)(var4.a() - var4.b() + 2);
      var4.a("gjpqyß[]()#_").d().c();
      this.g = (byte)(var4.a() - var4.b() + 3);
      this.f = (byte)var4.b();
      int[] var5 = new int[1024];
      if (var3 >= 3) {
         Image var9 = a(var5);
         var9.getRGB(var5, 0, 1, 0, 0, 1, 1);
         if ((var5[0] & 16777215) == 0) {
            this.i = var9;
         } else {
            this.i = b(var5);
         }
      } else {
         this.i = b(var5);
      }

   }

   public bc a(int var1, int var2) {
      return new n(var1, var2);
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.c.setColor(var1);
      this.c.fillRect(var2, var3, var4, var5);
   }

   public void b(int var1, int var2, int var3, int var4, int var5) {
      this.c.setColor(var1);
      this.c.drawLine(var2, var3, var4, var5);
   }

   public void c(int var1, int var2, int var3, int var4, int var5) {
      this.c.setColor(var1);
      this.c.drawRect(var2, var3, var4 - 1, var5 - 1);
   }

   public void b(byte var1, char[] var2, int var3, int var4, int var5, int var6, int var7) {
      var7 -= this.f;
      this.c.setFont(this.d);
      if (var1 == 1) {
         this.c.setColor(0);
         this.c.drawChars(var2, var3, var4, var6 + 1, var7, 0);
         this.c.drawChars(var2, var3, var4, var6 + 2, var7 + 1, 0);
         this.c.drawChars(var2, var3, var4, var6 + 1, var7 + 2, 0);
         this.c.drawChars(var2, var3, var4, var6, var7 + 1, 0);
      }

      this.c.setColor(var5);
      this.c.drawChars(var2, var3, var4, var6 + 1, var7 + 1, 0);
   }

   public void a(byte var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      var7 -= this.f;
      this.c.setFont(this.d);
      if (var1 == 1) {
         this.c.setColor(0);
         this.c.drawSubstring(var2, var3, var4, var6 + 1, var7, 0);
         this.c.drawSubstring(var2, var3, var4, var6 + 2, var7 + 1, 0);
         this.c.drawSubstring(var2, var3, var4, var6 + 1, var7 + 2, 0);
         this.c.drawSubstring(var2, var3, var4, var6, var7 + 1, 0);
      }

      this.c.setColor(var5);
      this.c.drawSubstring(var2, var3, var4, var6 + 1, var7 + 1, 0);
   }

   public void a(int var1, int var2, int var3, int var4) {
      Image var5 = this.i;
      this.i();
      this.c.clipRect(var1, var2, var3, var4);
      int var6 = var1;
      int var7 = var1 + var3 - 1;

      for(int var8 = var2 + var4 - 1; var6 <= var7; var6 += 32) {
         for(int var9 = var2; var9 <= var8; var9 += 32) {
            this.c.drawImage(var5, var6, var9, 0);
         }
      }

      this.h();
   }

   public int e() {
      return Math.max(126, this.h.getHeight());
   }

   public int a(byte var1, byte var2, char[] var3, int var4, int var5) {
      return a(var1, var5, this.d.charsWidth(var3, var4, var5));
   }

   public int a(byte var1, byte var2, String var3, int var4, int var5) {
      return a(var1, var3.length(), this.d.substringWidth(var3, var4, var5));
   }

   public int a(byte var1, byte var2) {
      switch(var1) {
      case 2:
         return this.g;
      case 3:
         return this.e;
      default:
         throw bh.b(1160790615, String.valueOf(var1));
      }
   }

   public int f() {
      return Math.max(126, this.h.getWidth());
   }

   public al a(InputStream var1) {
      ah var2;
      try {
         var2 = new ah(Image.createImage(var1));
      } finally {
         var1.close();
      }

      return var2;
   }

   protected void c(int var1) {
      this.b[var1] = null;
      System.gc();
   }

   protected void a(int var1, int var2, int var3) {
      Image var4 = null;

      for(int var5 = 0; var5 < this.k.length; ++var5) {
         if (this.k[var5] == var3) {
            var4 = this.j[var5];
         }
      }

      if (var4 == null) {
         var4 = this.a(this.b[var3]);
         this.k[this.l] = var3;
         this.j[this.l] = var4;
         this.l = ++this.l % this.k.length;
      }

      this.c.drawImage(var4, var1, var2, 0);
   }

   protected void b(int var1, int var2, int var3) {
      this.c.drawImage(this.a[var3], var1, var2, 0);
   }

   protected void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      Image var7 = null;

      for(int var8 = 0; var8 < this.k.length; ++var8) {
         if (this.k[var8] == var3) {
            var7 = this.j[var8];
         }
      }

      if (var7 == null) {
         var7 = this.a(this.b[var3]);
         this.k[this.l] = var3;
         this.j[this.l] = var7;
         this.l = ++this.l % this.k.length;
      }

      this.c.drawRegion(var7, var4, var5, var6, var6, 0, var1, var2, 0);
   }

   protected void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.c.drawRegion(this.b[var3], var4, var5, var6, var6, 0, var1, var2, 0);
   }

   private Image a(Image var1) {
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      int[] var4 = new int[var2 * var3];
      var1.getRGB(var4, 0, var2, 0, 0, var2, var3);

      for(int var5 = 0; var5 < var2 * var3; ++var5) {
         var4[var5] = this.g(var4[var5]);
      }

      Image var6 = Image.createRGBImage(var4, var2, var3, true);
      return var6;
   }

   private int g(int var1) {
      int var2 = (var1 & -16777216) >>> 24;
      int var3 = (var1 & 16711680) >>> 16;
      int var4 = (var1 & '\uff00') >>> 8;
      int var5 = var1 & 255;
      int var6 = var3 / 3 + var4 / 3 + var5 / 3;
      var6 = var6 / 2 + 64;
      return var2 << 24 | var6 << 16 | var6 << 8 | var6;
   }

   protected void a(ax var1) {
      this.h.a(var1.a, var1.c, var1.d(), var1.b());
   }

   protected int d(int var1) {
      return this.a[var1].getHeight();
   }

   protected int e(int var1) {
      return this.a[var1].getWidth();
   }

   protected void b(int var1, int var2) {
      int var3;
      switch(var1) {
      case 0:
         if (this.a != null) {
            for(var3 = 0; var3 < this.a.length; ++var3) {
               this.a[var3] = null;
            }

            this.a = null;
         }

         System.gc();
         this.a = new Image[var2];
         break;
      case 1:
         if (this.b != null) {
            for(var3 = 0; var3 < this.b.length; ++var3) {
               this.b[var3] = null;
            }

            this.b = null;
         }

         System.gc();
         this.b = new Image[var2];
         break;
      default:
         throw bh.b(1463043378, String.valueOf(var1));
      }

   }

   protected void a(int var1, int var2, byte[] var3, int var4, int var5) {
      Image var6 = Image.createImage(var3, var4, var5);
      switch(var1) {
      case 0:
         this.a[var2] = var6;
         break;
      case 1:
         this.b[var2] = var6;
         break;
      default:
         throw bh.b(1414936400, String.valueOf(var1));
      }

   }

   protected void b(ax var1) {
      this.c.setClip(var1.a, var1.c, var1.d(), var1.b());
   }

   protected void c(int var1, int var2) {
      if (var1 != 0 || var2 != 0) {
         this.c.translate(var1, var2);
      }

   }

   private static int a(byte var0, int var1, int var2) {
      if (var1 > 0) {
         if (var0 == 0) {
            var2 += 2;
         } else if (var0 == 1) {
            ++var2;
         }
      }

      return var2;
   }

   private static Image a(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = 2130706432;
      }

      return Image.createRGBImage(var0, 32, 32, true);
   }

   private static Image b(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = ((var1 >> 5) + (var1 & 31) & 1) == 0 ? -16777216 : 0;
      }

      return Image.createRGBImage(var0, 32, 32, true);
   }
}
