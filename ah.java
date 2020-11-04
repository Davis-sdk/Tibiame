import javax.microedition.lcdui.Image;

final class ah extends al {
   static final int MBOOSTER_MAX_INSTANCES = 2;
   private final Image a;

   ah(Image var1) {
      this.a = var1;
   }

   public void a(s var1, int var2, int var3) {
      ((am)var1).c.drawImage(this.a, var2, var3, 0);
   }

   public int a_() {
      return this.a.getHeight();
   }

   public int b() {
      return this.a.getWidth();
   }
}
