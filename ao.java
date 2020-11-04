import java.io.DataInputStream;
import java.io.IOException;

public abstract class ao {
   private DataInputStream a;
   private int b;
   private int c;

   public final c a(DataInputStream var1) {
      this.a = var1;
      this.c = 0;

      c var3;
      try {
         byte var2 = var1.readByte();
         this.b = var1.readUnsignedByte();
         var3 = this.a(var2);
      } finally {
         this.a = null;
      }

      return var3;
   }

   protected static IOException a() {
      return bh.d(1129010485);
   }

   protected abstract c a(byte var1);

   protected final boolean b() {
      if (this.c != 1) {
         throw bh.c(1111048791);
      } else if (this.a.readByte() != 0) {
         throw a();
      } else {
         boolean var1 = this.a.readByte() != 0;
         this.c = 0;
         return var1;
      }
   }

   protected final int c() {
      if (this.c != 1) {
         throw bh.c(1112823386);
      } else if (this.a.readByte() != 3) {
         throw a();
      } else {
         int var1 = this.a.readInt();
         this.c = 0;
         return var1;
      }
   }

   protected final int d() {
      if (this.c != 1) {
         throw bh.c(1127238469);
      } else if (this.a.readByte() != 1) {
         throw a();
      } else {
         int var1 = this.a.readInt();
         this.c = 0;
         return var1;
      }
   }

   protected final byte e() {
      if (this.c != 0) {
         throw bh.c(1127632212);
      } else if (--this.b < 0) {
         return -1;
      } else {
         byte var1 = this.a.readByte();
         this.c = 1;
         return var1;
      }
   }

   protected final String f() {
      if (this.c != 1) {
         throw bh.c(1127762753);
      } else if (this.a.readByte() != 2) {
         throw a();
      } else {
         String var1 = bh.a(this.a);
         this.c = 0;
         return var1;
      }
   }
}
