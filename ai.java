import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import net.rim.device.api.system.CoverageInfo;
import net.rim.device.api.system.EventLogger;
import net.rim.device.api.system.WLANInfo;
import tibiame.Main;

public final class ai implements cj {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private boolean a;
   private DataInputStream b;
   private OutputStream c;
   private SocketConnection d;

   public ai(y var1) {
      String var2 = "socket://" + var1.a + ':' + var1.b;
      if (CoverageInfo.getCoverageStatus() == 0) {
         EventLogger.logEvent(Main.a, "COVERAGE_NONE detected".getBytes(), 0);
      }

      try {
         boolean var3 = WLANInfo.getWLANState() == 4620;
         if (var3) {
            var2 = var2 + ";interface=wifi";
         } else if (CoverageInfo.isCoverageSufficient(1)) {
            var2 = var2 + ";deviceside=true";
         } else {
            String var4 = this.f();
            if (var4 != null) {
               var2 = var2 + ";ConnectionUID=" + var4;
            } else if (CoverageInfo.isCoverageSufficient(2)) {
               var2 = var2 + ";deviceside=false";
            } else {
               var2 = "socket://" + var1.a + ':' + var1.b;
            }
         }
      } catch (Exception var9) {
         throw bh.d(1515804754, var2 + ", " + var9);
      }

      try {
         EventLogger.logEvent(Main.a, ("trying " + var2).getBytes(), 0);
         this.d = (SocketConnection)Connector.open(var2, 3, false);
      } catch (ClassCastException var8) {
         try {
            EventLogger.logEvent(Main.a, "trying fallback".getBytes(), 0);
            this.d = (SocketConnection)Connector.open("socket://" + var1.a + ':' + var1.b, 3, false);
         } catch (ClassCastException var7) {
            EventLogger.logEvent(Main.a, "Connect failed".getBytes(), 0);
            throw bh.d(893539905, "Connect failed: " + var1);
         }
      }

      try {
         this.b = this.d.openDataInputStream();
      } catch (IOException var6) {
         this.a();
         this.a = true;
         bh.a((byte)1, 861296705, (Throwable)var6);
      }

      try {
         this.c = this.d.openOutputStream();
      } catch (IOException var5) {
         this.a();
         this.a = true;
         bh.a((byte)1, 878072388, (Throwable)var5);
      }

   }

   private String f() {
      return null;
   }

   public void a() {
      synchronized(this) {
         if (this.c != null) {
            try {
               this.c.close();
            } catch (IOException var32) {
               bh.a((byte)1, 893864533, (Throwable)var32);
               this.a = true;
            } finally {
               this.c = null;
            }
         }

         if (this.b != null) {
            try {
               this.b.close();
            } catch (IOException var30) {
               bh.a((byte)1, 878265392, (Throwable)var30);
               this.a = true;
            } finally {
               this.b = null;
            }
         }

         if (this.d != null) {
            try {
               this.d.close();
            } catch (IOException var28) {
               bh.a((byte)1, 1496859442, (Throwable)var28);
               this.a = true;
            } finally {
               this.d = null;
            }
         }

      }
   }

   public DataInputStream b() {
      synchronized(this) {
         return this.b;
      }
   }

   public OutputStream c() {
      synchronized(this) {
         return this.c;
      }
   }

   public boolean d() {
      synchronized(this) {
         return this.d != null;
      }
   }

   public boolean e() {
      synchronized(this) {
         return this.a;
      }
   }
}
