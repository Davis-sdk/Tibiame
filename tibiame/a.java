package tibiame;

import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import net.rim.device.api.system.Application;
import net.rim.device.api.system.KeyListener;
import net.rim.device.api.ui.Keypad;

public final class a extends GameCanvas implements .m, KeyListener, .p {
   private int a;
   private Image b;
   private Image c;
   private final .bs d;
   private final Object e;
   private volatile boolean f;
   private .c g;
   private volatile boolean h;
   private volatile .c i;
   private boolean j;
   private boolean k;
   private final Main l;

   a(Main var1) {
      super(false);
      this.l = var1;
      this.a = 1;
      this.e = new Object();
      Application.getApplication().addKeyListener(this);
      this.d = new .bs(this);
   }

   public void a(.c var1) {
      this.i = var1;
   }

   public void a(.e var1) {
      try {
         int var5;
         for(var5 = 0; var5 < 4; ++var5) {
            this.setFullScreenMode(true);
            this.flushGraphics();
         }

         var5 = super.getWidth();
         int var6 = super.getHeight();
         if ((var5 < 960 || var6 < 640) && (var5 < 704 || var6 < 832)) {
            if (var5 >= 480 && var6 >= 320 || var5 >= 352 && var6 >= 416) {
               this.a = 2;
            }
         } else {
            this.a = 4;
         }

         .am var2 = new .am(Main.a(this.l), this, Main.b(this.l).numAlphaLevels());
         var2.j();
         this.g = new .c(this.l, var2, Main.c(this.l));
      } catch (Throwable var16) {
         .bh.a((byte)3, 1379353674, (Throwable)var16);
         return;
      }

      long var3 = System.currentTimeMillis();

      while(!this.g.A()) {
         int var8 = (int)(System.currentTimeMillis() - var3);
         if (var8 < 0) {
            var3 = System.currentTimeMillis();
            var8 = 0;
         }

         if (var8 >= 50) {
            var3 += (long)var8;

            try {
               if (!.ci.f) {
                  this.g.k(Math.min(var8, 750));
               }
            } catch (Throwable var15) {
               .bh.a((byte)2, 1347897160, (Throwable)var15);
            }
         } else {
            .bh.f(50 - var8);
         }

         if (this.g.A()) {
            break;
         }

         try {
            if (!.ci.f) {
               this.d.a(this.g);
            }
         } catch (Throwable var14) {
            .bh.a((byte)2, 1346720857, (Throwable)var14);
         }

         if (this.g.A()) {
            break;
         }

         if (this.i != null) {
            this.g.v().b(this.i);
            this.i = null;
            var3 = System.currentTimeMillis();
         }

         Boolean var17 = Main.d(this.l);
         if (var17 != null) {
            if (var17) {
               Main.e(this.l);
            } else {
               Main.b(this.l).setCurrent((Displayable)null);
            }
         }

         boolean var7;
         boolean var18;
         synchronized(this.e) {
            var18 = this.j;
            if (this.k) {
               var7 = true;
               this.k = false;
            } else {
               var7 = false;
            }
         }

         if (var7) {
            this.g.x();
         }

         if (var18) {
            try {
               this.g.u();
            } catch (Throwable var12) {
               .bh.a((byte)2, 1379153714, (Throwable)var12);
            }
         }

         if (this.f) {
            try {
               this.g.z();
            } catch (Throwable var11) {
               .bh.a((byte)2, 1398030657, (Throwable)var11);
            }
            break;
         }
      }

      this.g = null;
      this.l.a();
   }

   public void a() {
      this.f = true;
   }

   public void a(int var1, int var2, int var3, int var4) {
      if (this.b != null) {
         if (this.a > 1) {
            this.a(this.a);
         } else {
            Graphics var5 = super.getGraphics();
            var5.drawImage(this.b, 0, 0, 20);
         }
      }

      this.flushGraphics(0, 0, super.getWidth(), super.getHeight());
   }

   public Graphics getGraphics() {
      if (this.b == null) {
         this.b = Image.createImage(this.getWidth(), this.getHeight());
      }

      Main.a("offscrW=" + this.b.getWidth() + ", offscrH=" + this.b.getHeight());
      return this.b.getGraphics();
   }

   public int getWidth() {
      return super.getWidth() / this.a;
   }

   public int getHeight() {
      return super.getHeight() / this.a;
   }

   private void a(int var1) {
      int var2 = var1 / 2;
      int var3 = this.b.getWidth();
      int var4 = this.b.getHeight();
      int var5 = var3 * var1;
      int var6 = var4 * var1;
      byte var7 = 20;
      if (this.c == null || this.c.getWidth() != var5) {
         this.c = Image.createImage(var5, var4);
      }

      Graphics var8 = this.c.getGraphics();

      for(int var9 = 0; var9 < var5; ++var9) {
         var8.setClip(var9, 0, 1, var4);
         var8.drawImage(this.b, var9 - (var9 >> var2), 0, var7);
      }

      Graphics var11 = super.getGraphics();

      for(int var10 = 0; var10 < var6; ++var10) {
         var11.setClip(0, var10, var5, 1);
         var11.drawImage(this.c, 0, var10 - (var10 >> var2), var7);
      }

   }

   protected void hideNotify() {
      this.a(false);
   }

   protected void keyPressed(int var1) {
      if (!.ci.f) {
         int var2 = this.getGameAction(var1);
         if (this.d.a) {
            this.d.a(var1, var2);
         } else if (var1 < 7 && var2 != 0) {
            this.d.a(0, var2);
         }
      }

   }

   protected void keyReleased(int var1) {
      if (!.ci.f) {
         int var2 = this.getGameAction(var1);
         if (this.d.a) {
            this.d.b(var1, var2);
         } else if (var1 < 7 && var2 != 0) {
            this.d.b(0, var2);
         }
      }

   }

   public boolean keyDown(int var1, int var2) {
      if (!.ci.f) {
         int var3 = Keypad.key(var1);
         int var4 = Keypad.status(var1);
         if (var3 == 4098 && (var4 == 1 || var4 == 16)) {
            return false;
         }

         if ((!this.d.a || var3 == 4098 || var3 == 27) && var3 != 17 && var3 != 18) {
            this.d.a(var1, 0);
            return true;
         }
      }

      return false;
   }

   public boolean keyUp(int var1, int var2) {
      if (!.ci.f && !this.d.a) {
         int var3 = Keypad.key(var1);
         int var4 = Keypad.status(var1);
         if (var3 == 4098 && (var4 == 1 || var4 == 16)) {
            return false;
         }

         if ((!this.d.a || var3 == 4098 || var3 == 27) && var3 != 17 && var3 != 18) {
            this.d.b(var1, 0);
            return true;
         }
      }

      return false;
   }

   public boolean keyStatus(int var1, int var2) {
      return false;
   }

   public boolean keyRepeat(int var1, int var2) {
      return false;
   }

   public boolean keyChar(char var1, int var2, int var3) {
      return false;
   }

   protected void showNotify() {
      if (!this.h) {
         this.h = true;
         (new .br(this, false)).start();
      }

      this.a(true);
   }

   public boolean b() {
      .c var1 = this.g.h((int)0);
      if (var1 instanceof .cn) {
         .cn var2 = (.cn)var1;
         return var2.b() ? .ci.a.a((short)5005) : var2.a();
      } else {
         return false;
      }
   }

   private void a(boolean var1) {
      synchronized(this.e) {
         if (this.j != var1) {
            this.j = var1;
            this.k = true;
         }

      }
   }

   static .c a(tibiame.a var0, .c var1) {
      return var0.i = var1;
   }

   static boolean a(tibiame.a var0) {
      return var0.h;
   }
}
