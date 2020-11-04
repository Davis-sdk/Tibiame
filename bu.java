import java.io.InputStream;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public final class bu extends ay implements ap {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   InputStream a;
   private final bk b = new bk(129);
   private final g c = new g("ResourceFiles", 16);
   private final g d = new g("Characters", 20);
   private final g e = new g("LoginServers", 6);
   private final Object f = new Object();
   private final g g = new g("PackInfo", 10);
   private final g h = new g("Properties", 18);
   private z i;
   private y[] j;
   private String k;
   private boolean l;
   private boolean m;

   public int a(Object var1, Object var2) {
      ae var3 = (ae)var1;
      ae var4 = (ae)var2;
      int var5 = var3.c.compareTo(var4.c);
      if (var5 == 0) {
         var5 = bh.a(var3.h, var4.h);
      }

      return var5;
   }

   public void c() {
      synchronized(this.c) {
         if (this.k == null) {
            throw bh.c(1379354199);
         } else {
            try {
               this.c.c(this.k);
            } catch (RecordStoreException var8) {
               throw bh.b(1498297924, (Throwable)var8);
            } finally {
               this.k = null;
            }

         }
      }
   }

   public void e() {
      synchronized(this.c) {
         try {
            if (this.m) {
               this.l = true;
               this.m = false;
            }

            this.c.b();
         } catch (RecordStoreException var4) {
            throw bh.b(1499024213, (Throwable)var4);
         }

      }
   }

   public void a(ae var1) {
      synchronized(this.d) {
         this.i.d(var1);
         String var3 = var1.g;
         if (var3 != null) {
            try {
               this.d.a(var3);
            } catch (RecordStoreException var6) {
               throw bh.b(1179662147, (Throwable)var6);
            }
         }

      }
   }

   public int f() {
      int var1 = 0;

      try {
         RecordStore var2 = null;

         try {
            var2 = RecordStore.openRecordStore("a", true);
            var1 = var2.getSizeAvailable();
         } finally {
            if (var2 != null) {
               var2.closeRecordStore();
               RecordStore.deleteRecordStore("a");
            }

         }
      } catch (RecordStoreException var7) {
      }

      return var1;
   }

   public InputStream b(int var1, String var2) {
      if (var2 == null) {
         throw bh.b(1213484628);
      } else {
         synchronized(this.c) {
            while(this.a != null) {
               try {
                  this.c.wait();
               } catch (InterruptedException var8) {
               }
            }

            if (bh.a((byte)0)) {
               bh.a((byte)0, 1481459534, (String)var2);
            }

            bk var4;
            try {
               var4 = this.c.b((var1 == 0 ? "" : String.valueOf(var1)) + var2);
            } catch (RecordStoreException var7) {
               throw bh.b(1145127512, (Throwable)var7);
            }

            if (var4 == null) {
               InputStream var5 = var2.getClass().getResourceAsStream('/' + var2);
               return var5 == null ? null : new ac(this, var5);
            } else {
               return new u(this, var4.a(), var4.c());
            }
         }
      }
   }

   public y[] g() {
      synchronized(this.e) {
         if (this.j == null) {
            try {
               this.e.e();

               try {
                  this.j = new y[this.e.a()];
                  z var2 = this.e.d();

                  for(int var3 = 0; var3 < var2.d(); ++var3) {
                     bk var4 = this.e.b((String)var2.b(var3));
                     byte var5 = var4.i();
                     if (var5 != 1) {
                        bh.a((byte)1, 909718326, (String)String.valueOf(var5));
                        this.e.c();
                        Object var6 = null;
                        return (y[])var6;
                     }

                     this.j[var3] = new y(var4.k(), var4.l());
                  }

                  return this.j;
               } finally {
                  this.e.b();
               }
            } catch (RecordStoreException var13) {
               throw bh.b(1213093704, (Throwable)var13);
            }
         } else {
            return this.j;
         }
      }
   }

   public z h() {
      synchronized(this.d) {
         if (this.i == null) {
            try {
               this.d.e();

               try {
                  this.i = new z(this.d.a());
                  z var2 = this.d.d();

                  for(int var3 = 0; var3 < var2.d(); ++var3) {
                     String var4 = (String)var2.b(var3);
                     bk var5 = this.d.b(var4);
                     byte var8 = var5.i();
                     if (var8 != 2) {
                        bh.a((byte)1, 909723703, (String)String.valueOf(var8));
                        this.d.c();
                        Object var12 = null;
                        return (z)var12;
                     }

                     String var6 = var5.k();
                     int var7 = var5.l();
                     ae var11 = (new ae(var6, var7)).b(var5.h());
                     byte var9 = var5.i();
                     byte var10 = var5.i();
                     if (var9 == 10) {
                        var11.a(var9, var10);
                     } else {
                        var11.b(var9, var10);
                     }

                     var11.c(var4);
                     this.i.a((Object)var11);
                  }

                  this.i.a((ap)this);
                  return this.i;
               } finally {
                  this.d.b();
               }
            } catch (RecordStoreException var19) {
               throw bh.b(1212432715, (Throwable)var19);
            }
         } else {
            return this.i;
         }
      }
   }

   public boolean a(int var1, int var2, int var3, bk var4) {
      synchronized(this.f) {
         String var7 = a(var1, var2, var3);
         boolean var8 = false;

         boolean var12;
         try {
            RecordStore var6 = RecordStore.openRecordStore(var7, false);

            try {
               int var9 = (var2 << 2 & 12) + (var1 & 3) + 1;

               int var10;
               try {
                  var10 = var6.getRecord(var9, this.b.a(), 0);
                  this.b.e();
               } catch (InvalidRecordIDException var20) {
                  bh.a((byte)1, 944265815, (Throwable)var20);
                  var8 = true;
                  var12 = false;
                  return var12;
               }

               if (var10 <= 0) {
                  boolean var25 = false;
                  return var25;
               }

               byte var11 = this.b.i();
               if (var11 == 3) {
                  if (var10 != 129) {
                     throw bh.d(1094933077, String.valueOf(var10));
                  }

                  this.b.b((bk)var4, 128);
                  var12 = true;
                  return var12;
               }

               bh.a((byte)1, 927150425, (String)String.valueOf(var11));
               var8 = true;
               var12 = false;
            } finally {
               var6.closeRecordStore();
               if (var8) {
                  RecordStore.deleteRecordStore(var7);
               }

            }
         } catch (RecordStoreNotFoundException var22) {
            return false;
         } catch (RecordStoreException var23) {
            throw bh.b(1211445558, (Throwable)var23);
         }

         return var12;
      }
   }

   public bk a(int var1, String var2, int var3) {
      synchronized(this.c) {
         if (this.k != null) {
            throw bh.c(1379354199);
         } else {
            this.k = var1 + var2;
            return this.c.a(var3);
         }
      }
   }

   public boolean d() {
      return this.k != null;
   }

   public void j() {
      synchronized(this.c) {
         this.c.e();
      }
   }

   public void a(y[] var1) {
      synchronized(this.e) {
         this.j = var1;

         try {
            this.e.e();

            try {
               z var3 = this.e.d();

               int var4;
               for(var4 = 0; var4 < var3.d(); ++var4) {
                  this.e.a((String)var3.b(var4));
               }

               var4 = 0;

               for(int var5 = var1.length; var4 < var5; ++var4) {
                  this.e.a(0).a((byte)1).b(var1[var4].a).a((short)var1[var4].b);
                  this.e.c(bh.h(var4));
               }

            } finally {
               this.e.b();
            }
         } catch (RecordStoreException var12) {
            throw bh.b(1213680971, (Throwable)var12);
         }
      }
   }

   public void b(ae var1) {
      synchronized(this.d) {
         try {
            this.d.e();

            try {
               this.h();
               int var4 = 0;

               for(int var5 = this.i.d(); var4 < var5; ++var4) {
                  ae var6 = (ae)this.i.b(var4);
                  if (var6.a(var1)) {
                     var1.c(var6.g);
                     break;
                  }
               }

               String var3 = var1.g;
               if (var3 == null) {
                  while(true) {
                     if (this.i.d() < 20) {
                        var3 = var1.c + '-' + var1.h;
                        var1.c(var3);
                        this.i.a((Object)var1);
                        this.i.a((ap)this);
                        break;
                     }

                     var4 = 0;
                     ae var17 = (ae)this.i.b(var4);
                     int var18 = 1;

                     for(int var7 = this.i.d(); var18 < var7; ++var18) {
                        ae var8 = (ae)this.i.b(var18);
                        if (var8.b < var17.b) {
                           var17 = var8;
                           var4 = var18;
                        }
                     }

                     this.d.a(var17.g);
                     this.i.c(var4);
                  }
               }

               this.d.a(0).a((byte)2).b(var1.c).a((short)var1.h).a(var1.b).a((byte)(var1.e >> 8)).a((byte)var1.e).a(var1.a);
               this.d.c(var3);
            } finally {
               this.d.b();
            }
         } catch (RecordStoreException var15) {
            throw bh.b(1213553219, (Throwable)var15);
         }

      }
   }

   public void a(bk var1, int var2, int var3, int var4) {
      synchronized(this.f) {
         String var7 = a(var2, var3, var4);
         boolean var8 = false;

         try {
            RecordStore var6 = RecordStore.openRecordStore(var7, true);

            try {
               if (var6.getNumRecords() == 0) {
                  for(int var10 = 1; var10 <= 16; ++var10) {
                     if (var6.addRecord(this.b.a(), 0, 0) != var10) {
                        bh.a((byte)1, 960715354);
                        var8 = true;
                        return;
                     }
                  }
               }

               int var9 = (var3 << 2 & 12) + (var2 & 3) + 1;
               this.b.e().a((byte)3).a((bk)var1, 128);

               try {
                  var6.setRecord(var9, this.b.a(), 0, this.b.c());
               } catch (InvalidRecordIDException var17) {
                  bh.a((byte)1, 944198214, (Throwable)var17);
                  var8 = true;
               }
            } finally {
               var6.closeRecordStore();
               if (var8) {
                  RecordStore.deleteRecordStore(var7);
               }

            }
         } catch (RecordStoreException var19) {
            bh.a((byte)1, 1213220178, (Throwable)var19);
         }

      }
   }

   protected void d(int var1) {
      synchronized(this.c) {
         try {
            String var3 = String.valueOf(var1);
            z var4 = this.c.d();

            for(int var5 = 0; var5 < var4.d(); ++var5) {
               String var6 = (String)var4.b(var5);
               if (var6.length() <= var3.length()) {
                  throw bh.b(1465209923, "File name too short: " + var6 + " - " + var3);
               }

               if (var6.startsWith(var3) && !Character.isDigit(var6.charAt(var3.length()))) {
                  this.c.a(var6);
               }
            }
         } catch (RecordStoreException var8) {
            throw bh.b(1163407669, (Throwable)var8);
         }

      }
   }

   protected cd[] k() {
      cd[] var1 = null;
      synchronized(this.g) {
         try {
            this.g.e();

            try {
               z var3 = this.g.d();

               for(int var4 = 0; var4 < var3.d(); ++var4) {
                  String var5 = (String)var3.b(var4);
                  bk var6 = this.g.b(var5);
                  byte var7 = var6.i();
                  var1 = new cd[var7];

                  for(int var8 = 0; var8 < var7; ++var8) {
                     byte var9 = var6.i();
                     byte var10 = var6.i();
                     var6.k();
                     int var11 = var6.f() & '\uffff';
                     byte var12 = var6.i();
                     var1[var8] = new cd(var9, var12, var11, var10);
                  }
               }
            } finally {
               this.g.b();
            }
         } catch (RecordStoreException var19) {
            throw bh.b(1212432715, (Throwable)var19);
         }
      }

      this.b(var1);
      return var1;
   }

   protected String d(byte var1) {
      synchronized(this.h) {
         bk var4;
         try {
            var4 = this.h.b(bh.h(var1));
         } catch (RecordStoreException var7) {
            throw bh.b(1196245301, (Throwable)var7);
         }

         String var2 = var4 == null ? null : var4.k();
         return var2;
      }
   }

   protected void a(cd[] var1) {
      synchronized(this.g) {
         try {
            this.g.e();

            try {
               bk var3 = this.g.a(0);
               var3.a((byte)var1.length);

               for(int var4 = 0; var4 < var1.length; ++var4) {
                  var3.a((byte)var1[var4].b);
                  var3.a((byte)var1[var4].e);
                  var3.b(var1[var4].a);
                  var3.a((short)var1[var4].d);
                  var3.a((byte)var1[var4].c);
               }

               this.g.c("packinfo");
            } finally {
               this.g.b();
            }
         } catch (RecordStoreException var11) {
            throw bh.b(1213553219, (Throwable)var11);
         }
      }
   }

   protected void b(byte var1, String var2) {
      synchronized(this.h) {
         bk var4 = this.h.a(0);
         if (var2 != null) {
            var4.b(var2);
         }

         try {
            this.h.c(bh.h(var1));
         } catch (RecordStoreException var7) {
            throw bh.b(1213617459, (Throwable)var7);
         }

      }
   }

   void l() {
      synchronized(this.c) {
         if (bh.a((byte)0)) {
            bh.a((byte)0, 1498109786, (String)"close");
         }

         this.a = null;
         this.c.notifyAll();
      }
   }

   private static String a(int var0, int var1, int var2) {
      return "Minimap" + (var0 >> 2) + '-' + (var1 >> 2) + '-' + var2;
   }

   private void b(cd[] var1) {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            for(int var3 = var2 + 1; var3 < var1.length; ++var3) {
               if (var1[var2].b > var1[var3].b) {
                  cd var4 = var1[var2];
                  var1[var2] = var1[var3];
                  var1[var3] = var4;
               }
            }
         }
      }

   }
}
