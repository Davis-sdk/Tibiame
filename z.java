import java.util.NoSuchElementException;

public final class z {
   static final int MBOOSTER_MAX_INSTANCES = 32;
   public Object[] a;
   private short b;

   public z(int var1) {
      this.a = new Object[var1];
   }

   public void a(Object var1) {
      if (this.b == (short)this.a.length) {
         this.d(Math.max(this.b + 1, this.a.length * 3 >> 1));
      }

      Object[] var10000 = this.a;
      short var10003 = this.b;
      this.b = (short)(var10003 + 1);
      var10000[var10003] = var1;
   }

   public int a() {
      return this.a.length;
   }

   public void b() {
      for(int var1 = 0; var1 < this.b; ++var1) {
         this.a[var1] = null;
      }

      this.b = 0;
   }

   public boolean b(Object var1) {
      for(int var2 = 0; var2 < this.b; ++var2) {
         if (this.a[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public void a(int var1) {
      if (var1 > this.a.length) {
         this.d(var1);
      }

   }

   public Object b(int var1) {
      return this.a[var1];
   }

   public int c(Object var1) {
      for(int var2 = 0; var2 < this.b; ++var2) {
         if (this.a[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public boolean d(Object var1) {
      for(int var2 = 0; var2 < this.b; ++var2) {
         if (this.a[var2] == var1) {
            this.c(var2);
            return true;
         }
      }

      return false;
   }

   public Object c(int var1) {
      Object var2 = this.a[var1];
      if (var1 == this.b - 1) {
         this.a[var1] = null;
      } else {
         System.arraycopy(this.a, var1 + 1, this.a, var1, this.b - var1 - 1);
      }

      --this.b;
      return var2;
   }

   public Object c() {
      if (this.b == 0) {
         throw new NoSuchElementException(bh.b(892949331, (String)null, (String)null));
      } else {
         --this.b;
         Object var1 = this.a[this.b];
         this.a[this.b] = null;
         return var1;
      }
   }

   public void a(int var1, Object var2) {
      this.a[var1] = var2;
   }

   public int d() {
      return this.b & '\uffff';
   }

   public void a(ap var1) {
      bh.a(this.a, 0, this.b, var1);
   }

   public Object[] a(Object[] var1) {
      System.arraycopy(this.a, 0, var1, 0, this.b);
      return var1;
   }

   private void d(int var1) {
      Object[] var2 = new Object[var1];
      System.arraycopy(this.a, 0, var2, 0, this.a.length);
      this.a = var2;
   }
}
