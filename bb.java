import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

final class bb {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private Graphics a;
   private Image b;
   private int c;
   private int d;
   private int[] e;

   public int a() {
      return this.c - 4;
   }

   public int b() {
      return this.d - 4;
   }

   public bb a(char var1) {
      this.a.drawChar(var1, 4, 4, 0);
      return this;
   }

   public bb a(String var1) {
      int var2 = 0;

      for(int var3 = var1.length(); var2 < var3; ++var2) {
         this.a(var1.charAt(var2));
      }

      return this;
   }

   public bb a(Font var1) {
      byte var2 = 32;
      this.b = Image.createImage(var2, var2);
      this.a = this.b.getGraphics();
      this.a.setFont(var1);
      this.e = new int[var2];
      this.e();
      return this;
   }

   public bb c() {
      this.b = null;
      this.a = null;
      this.e = null;
      return this;
   }

   public bb d() {
      int var1 = this.b.getWidth();
      int var2 = this.b.getHeight();
      this.d = 0;

      int var3;
      label38:
      do {
         this.b.getRGB(this.e, 0, var1, 0, this.d, var1, 1);

         for(var3 = 0; var3 < var1; ++var3) {
            if ((this.e[var3] & 16777215) == 0) {
               break label38;
            }
         }

         ++this.d;
      } while(this.d < var2);

      this.c = var2 - 1;

      do {
         this.b.getRGB(this.e, 0, var1, 0, this.c, var1, 1);

         for(var3 = 0; var3 < var1; ++var3) {
            if ((this.e[var3] & 16777215) == 0) {
               return this;
            }
         }

         --this.c;
      } while(this.c >= 0);

      return this;
   }

   public bb e() {
      this.a.setColor(16777215);
      this.a.fillRect(0, 0, this.b.getWidth(), this.b.getHeight());
      this.a.setColor(0);
      return this;
   }
}
