package tibiame;

import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.midlet.MIDlet;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
import net.rim.device.api.system.EventLogger;
import net.rim.device.api.ui.Keypad;

public class Main extends MIDlet implements .bp, .co, CommandListener, .m{
static final int MBOOSTER_MAX_INSTANCES=1;
public static long a=3830390889916145781L;
private final Command b;
private final Command c;
private final Display d;
private final Object e;
private final Object f;
private final tibiame.a g;
private final .ad h;
private final .ay i;
private Boolean j;
private volatile boolean k;
private Displayable l;

public Main(){
        EventLogger.register(a,"TibiaMeBBTest",2);
        .h.x=Keypad.getHardwareLayout()!=1364346180&&Keypad.getHardwareLayout()!=1364341300;
        this.f=new Object();
        this.e=new Object();
        this.d=Display.getDisplay(this);
        this.g=new tibiame.a(this);
        .bh.a((byte)0,.bh.b(this.getAppProperty("TibiaMe-Log-Trace")));
        .bh.a((.bp)this);
        this.i=new.bu();

        try{
        this.i.i();
        }catch(IOException var5){
        .bh.a((byte)2,1380996919,(Throwable)var5);
        }

        try{
        if(!this.i.a((byte)15)){
        this.i.a((byte)15,true);
        .cd[]var1=new.cd[this.i.b()];

        int var2;
        for(var2=0;var2<var1.length;++var2){
        var1[var2]=this.i.b(var2);
        }

        for(var2=var1.length-1;var2>=0;--var2){
        try{
        this.i.a(var1[var2].b);
        }catch(IOException var4){
        }
        }
        }
        }catch(Throwable var6){
        }

        this.h=(new.ag(this.i,this.e())).a((int)0,(String)"i18n-global.dat").a((int)4096,(String)"i18n-ingame.dat").a((int)8192,(String)"i18n-payment.dat");
        this.b=new Command(this.h.a((short)56),4,0);
        this.c=new Command(this.h.a((short)22),7,0);
        tibiame.a.a(this.g,(new.ba()).a(16777215).b(true,true).a(true,true).b((new.v(this.h.a((short)1),(byte)0,0)).b(true,true)));
        this.f();
        (new.br(this,true)).start();
        }

public static void a(String var0){
        EventLogger.logEvent(a,var0.getBytes(),0);
        }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getCommandType() == 7) {
         this.a();
      } else if (var1.getCommandType() != 4) {
         .bh.a((byte)2, 1380013111);
      }

      this.a((Displayable)null);
   }

   public final void a() {
      if (!this.k) {
         this.k = true;
         this.g.a();
         this.notifyDestroyed();
         .bh.b((.bp)this);
      }

   }

   public final void a(String var1, byte var2) {
      if (!this.k) {
         .ad var3 = this.h;
         Form var4;
         if (var3 == null) {
            var4 = new Form("TibiaME", new Item[]{new StringItem((String)null, var1, 0)});
         } else {
            byte var5;
            switch(var2) {
            case 0:
               var5 = 58;
               break;
            case 1:
               var5 = 59;
               break;
            case 2:
            default:
               var5 = 60;
               break;
            case 3:
               var5 = 61;
            }

            Item[] var6;
            if (var2 < 1) {
               var6 = new Item[]{new StringItem((String)null, var1, 0)};
            } else {
               StringItem var7 = new StringItem((String)null, "", 0);
               var7.setLayout(256);
               var6 = new Item[]{new StringItem((String)null, var1, 0), var7};
            }

            var4 = new Form(var3.a(var5), var6);
         }

         Command var8;
         if (var2 != 3) {
            var8 = this.b;
            if (var8 == null) {
               var8 = new Command("Ok2", 4, 0);
            }

            var4.addCommand(var8);
         }

         if (var2 != 0 && var2 != 1) {
            var8 = this.c;
            if (var8 == null) {
               var8 = new Command("Exit2", 7, 0);
            }

            var4.addCommand(var8);
         }

         var4.setCommandListener(this);
         this.a((Displayable)var4);
      }

   }

   public final void a(.e var1) {
      this.g.a((.c)(new .cn(this.i, 100)));
   }

   public final boolean b() {
      return true;
   }

   public final .ay c() {
      return this.i;
   }

   public final .cj a(.y var1) {
      this.a(false);

      .ai var2;
      try {
         var2 = new .ai(var1);
      } finally {
         this.a(true);
      }

      return var2;
   }

   public final boolean a(String var1, String var2) {
      this.a(false);

      try {
         b(var1, var2);
         this.a(true);
         return true;
      } catch (Exception var4) {
         this.a(true);
         return false;
      }
   }

   protected final void destroyApp(boolean var1) {
      this.a();
   }

   protected final void pauseApp() {
   }

   protected final void startApp() {
   }

   private static void b(String var0, String var1) {
      MessageConnection var3 = null;
      String var2 = "sms://" + var0;
      var3 = (MessageConnection)Connector.open(var2, 2);

      try {
         TextMessage var4 = (TextMessage)var3.newMessage("text");
         var4.setPayloadText(var1);
         var3.send(var4);
      } finally {
         if (var3 != null) {
            var3.close();
         }

      }

   }

   private Boolean d() {
      synchronized(this.f) {
         if (this.j != null) {
            Boolean var2 = this.j;
            this.j = null;
            this.f.notifyAll();
            return var2;
         } else {
            return null;
         }
      }
   }

   private String e() {
      String var1 = this.i.c((byte)0);
      if (var1 == null) {
         var1 = this.getAppProperty("TibiaMe-Language");
      }

      if (var1 == null) {
         var1 = System.getProperty("microedition.locale");
      }

      if (var1 != null) {
         var1 = var1.toLowerCase();
         if (var1.startsWith("en") || var1.startsWith("de") || var1.startsWith("ms") || var1.startsWith("pt")) {
            return var1.substring(0, 2);
         }
      }

      return var1.startsWith("id") ? "ms" : "en";
   }

   private void f() {
      Object var1;
      synchronized(this.e) {
         var1 = this.l == null ? this.g : this.l;
      }

      this.d.setCurrent((Displayable)var1);
   }

   private void a(Displayable var1) {
      synchronized(this.e) {
         if (var1 != null && tibiame.a.a(this.g)) {
            while(this.l != null) {
               try {
                  this.e.wait();
               } catch (InterruptedException var5) {
               }
            }
         }

         if (var1 == null) {
            var1 = this.g;
            this.l = null;
         } else {
            this.l = (Displayable)var1;
         }

         this.e.notifyAll();
      }

      this.d.setCurrent((Displayable)var1);
   }

   private void a(boolean var1) {
      synchronized(this.f) {
         this.j = .bh.a(var1);

         while(this.j != null) {
            try {
               this.f.wait();
            } catch (InterruptedException var5) {
            }
         }

      }
   }

   static .ay a(Main var0) {
      return var0.i;
   }

   static Display b(Main var0) {
      return var0.d;
   }

   static .ad c(Main var0) {
      return var0.h;
   }

   static Boolean d(Main var0) {
      return var0.d();
   }

   static void e(Main var0) {
      var0.f();
   }
}
