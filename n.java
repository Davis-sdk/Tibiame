import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

final class n extends bc {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private int c;
   private Graphics[] d = new Graphics[2];
   private Image[] e = new Image[2];

   n(int var1, int var2) {
      super(var1, var2);
      int var3 = 0;

      for(int var4 = this.e.length; var3 < var4; ++var3) {
         this.e[var3] = Image.createImage(var1, var2);
         this.d[var3] = this.e[var3].getGraphics();
         this.d[var3].setClip(0, 0, var1, var2);
      }

   }

   public void a(int var1) {
      this.d[this.c].setColor(var1);
      this.d[this.c].fillRect(0, 0, super.b, super.a);
   }

   public void a(s var1, int var2, int var3) {
      ((am)var1).c.drawImage(this.e[this.c], var2, var3, 0);
   }

   public void a(int var1, int var2, int var3) {
      this.d[this.c].setColor(var1);
      this.d[this.c].fillRect(var2, var3, 1, 1);
   }

   public void a(int var1, int var2) {
      if (var1 != 0 || var2 != 0) {
         int var3 = 1 - this.c;
         this.d[var3].drawImage(this.e[this.c], var1, var2, 0);
         this.c = var3;
      }

   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.d[this.c].setColor(var1);
      this.d[this.c].fillRect(var2, var3, var4, var5);
   }

   protected void a() {
      this.e = null;
      this.d = null;
   }
}
