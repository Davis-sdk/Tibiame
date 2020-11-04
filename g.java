import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class g {
   static final int MBOOSTER_MAX_INSTANCES = 6;
   private final bk a;
   private final String b;
   private final l c;
   private int d;
   private bk e;
   private boolean f;
   private int g;
   private RecordStore h;
   private boolean i;

   public g(String var1, int var2) {
      this.b = var1;
      this.c = new l(var2);
      this.a = new bk(8192);
      this.d = -1;
   }

   public int a() {
      this.g();
      return this.c.c();
   }

   public void b() {
      if (this.g == 1) {
         try {
            if (this.i) {
               this.i();
               this.i = false;
            }

            this.f();
         } finally {
            this.g = 0;
         }
      } else {
         --this.g;
      }

   }

   public g c() {
      this.e();

      try {
         this.f();
         String[] var1 = RecordStore.listRecordStores();
         int var2 = 0;

         for(int var3 = var1.length; var2 < var3; ++var2) {
            if (var1[var2].startsWith(this.b)) {
               RecordStore.deleteRecordStore(var1[var2]);
            }
         }

         this.c.a();
         this.f = false;
      } finally {
         this.b();
      }

      return this;
   }

   public g a(String var1) {
      this.e();

      try {
         int var2 = this.d(var1);
         if (var2 != -1) {
            this.d(var2).deleteRecord(b(var2));
            this.c.b(var1);
            this.i = true;
         }
      } finally {
         this.b();
      }

      return this;
   }

   public z d() {
      this.g();
      return this.c.b();
   }

   public bk b(String var1) {
      this.e();

      bk var8;
      try {
         int var2 = this.d(var1);
         RecordStore var3;
         if (var2 == -1) {
            var3 = null;
            return var3;
         }

         var3 = this.d(var2);
         int var4 = b(var2);
         int var5 = var3.getRecordSize(var4);
         bk var6;
         if (var5 > this.a.d()) {
            var6 = new bk(var5);
         } else {
            var6 = this.a;
         }

         var6.e();
         int var7 = var3.getRecord(var4, var6.a(), 0);
         if (var7 != var5) {
            throw new RecordStoreException(bh.b(859322423, var7 + " != " + var5, (String)null));
         }

         var6.e(var7);
         var8 = var6;
      } finally {
         this.b();
      }

      return var8;
   }

   public void e() {
      ++this.g;
   }

   public g c(String var1) {
      bk var2;
      if (this.e != null) {
         var2 = this.e;
         this.e = null;
      } else {
         var2 = this.a;
      }

      int var3 = var2.b();
      if (var3 > var2.d()) {
         throw new RecordStoreException(bh.b(894589013, var3 + ">" + var2.d(), (String)null));
      } else {
         this.e();

         try {
            int var4 = this.d(var1);
            if (var4 == -1) {
               this.a(var2, var1);
            } else {
               RecordStore var5 = this.d(var4);
               int var6 = b(var4);
               int var7 = var2.c() - var5.getRecordSize(var6);
               if (var7 <= 0 || var5.getSizeAvailable() >= var7 && var5.getSize() + var7 <= 30000) {
                  var5.setRecord(var6, var2.a(), 0, var2.c());
               } else {
                  var5.deleteRecord(var6);
                  this.a(var2, var1);
               }
            }
         } finally {
            this.b();
         }

         return this;
      }
   }

   public bk a(int var1) {
      if (var1 > this.a.d()) {
         this.e = new bk(var1);
         return this.e;
      } else {
         this.a.e();
         this.a.b();
         return this.a;
      }
   }

   private static int b(int var0) {
      return var0 & 16777215;
   }

   private void a(bk var1, String var2) {
      int var3 = var1.c();
      if (var3 > 30000) {
         bh.a((byte)2, 928593223, (String)(var2.substring(0, 1) + "-" + var2.substring(1) + " (" + (var3 + 1023) / 1024 + " Kb)"));
      } else {
         int var6 = this.c(var3);
         RecordStore var4 = this.d(var6);
         int var5 = var4.getNextRecordID();
         if ((var5 & -16777216) != 0) {
            throw new RecordStoreException(bh.b(1163019847, String.valueOf(var5), (String)null));
         } else if (var4.addRecord(var1.a(), 0, var3) != var5) {
            throw new RecordStoreException(bh.b(1177631065, (String)null, (String)null));
         } else {
            this.c.a(var2, bh.g(var6 | var5));
            this.i = true;
         }
      }
   }

   private void f() {
      if (this.h != null) {
         try {
            this.h.closeRecordStore();
         } catch (RecordStoreException var2) {
            bh.a((byte)2, 1145393754, (Throwable)var2);
         }

         this.h = null;
         this.d = -1;
      }

   }

   private void g() {
      if (!this.f) {
         this.h();
         this.f = true;
      }

   }

   private int d(String var1) {
      this.g();
      Integer var2 = (Integer)this.c.a(var1);
      return var2 == null ? -1 : var2;
   }

   private int c(int var1) {
      int var2 = 0;

      RecordStore var3;
      int var4;
      do {
         do {
            while(true) {
               ++var2;
               var3 = this.e(var2);
               var4 = var3.getNumRecords();
               if (var4 >= 16) {
                  continue;
               }
               break;
            }
         } while(var3.getSizeAvailable() < var1 + 128 && var4 > 0);
      } while(var4 > 0 && var3.getSize() + var1 + 128 > 30000);

      return var2 << 24;
   }

   private RecordStore d(int var1) {
      return this.e(var1 >>> 24);
   }

   private RecordStore e(int var1) {
      if (var1 == this.d) {
         return this.h;
      } else {
         if (this.h != null) {
            this.h.closeRecordStore();
            this.h = null;
         }

         String var2;
         if (var1 == 0) {
            var2 = this.b;
         } else {
            var2 = this.b + '-' + var1;
         }

         this.h = RecordStore.openRecordStore(var2, true);
         this.d = var1;
         return this.h;
      }
   }

   private void h() {
      this.c.a();
      this.e();

      try {
         RecordStore var1 = this.e(0);

         int var3;
         try {
            if (var1.getRecordSize(1) > 0) {
               var1.getRecord(1, this.a.a(), 0);
               this.a.e();
               int var2 = this.a.m();
               if (var2 == 255) {
                  var3 = 0;

                  for(int var12 = this.a.l(); var3 < var12; ++var3) {
                     String var13 = this.a.k();
                     int var6 = this.a.g();
                     this.c.a(var13, bh.g(var6));
                  }
               } else {
                  for(var3 = 0; var3 < var2; ++var3) {
                     String var4 = this.a.k();
                     int var5 = this.a.g();
                     this.c.a(var4, bh.g(var5));
                  }
               }
            }
         } catch (InvalidRecordIDException var10) {
            var3 = var1.addRecord(this.a.a(), 0, 0);
            if (var3 != 1) {
               throw new RecordStoreException(bh.b(1462850643, String.valueOf(var3), (String)null));
            }
         }
      } finally {
         this.b();
      }

   }

   private void i() {
      this.e();

      try {
         this.a.e();
         this.a.a((byte)-1);
         this.a.a((short)this.c.c());
         z var1 = this.c.b();

         for(int var2 = 0; var2 < var1.d(); ++var2) {
            String var3 = var1.b(var2).toString();
            int var4 = (Integer)this.c.a(var3);
            this.a.b(var3);
            this.a.h(var4);
         }

         this.e(0).setRecord(1, this.a.a(), 0, this.a.c());
      } finally {
         this.b();
      }
   }
}
