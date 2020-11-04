import net.rim.device.api.ui.Keypad;

public final class bs {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   public final boolean a;
   public final int b = 5000;
   public long c = -1L;
   private bk d;
   private tibiame.a e;

   public bs(tibiame.a var1) {
      this.e = var1;
      this.d = new bk(32);
      this.a = Keypad.getHardwareLayout() == 1364346180 || Keypad.getHardwareLayout() == 1364341300;
   }

   public void a(int var1, int var2) {
      byte var3 = this.a ? this.a(var1, var2, true) : this.b(var1, var2, true);
      if (var3 != -1) {
         this.a(var3, true);
      }

   }

   public void b(int var1, int var2) {
      byte var3 = this.a ? this.a(var1, var2, false) : this.b(var1, var2, false);
      if (var3 != -1) {
         this.a(var3, false);
      }

   }

   public void a(o var1) {
      int var2 = this.d.a(3, true, -1);

      while(var2 > 0) {
         switch(this.d.i()) {
         case 0:
            byte var7 = this.d.i();
            boolean var4 = this.d.i() != 0;
            this.d.a((int)3);
            var2 -= 3;

            try {
               if (var4) {
                  var1.l(var7);
               } else {
                  var1.m(var7);
               }
            } catch (Throwable var6) {
               bh.a((byte)2, 1295601753, (Throwable)var6);
            }
            break;
         case 1:
            char var3 = (char)this.d.f();
            this.d.a((int)3);
            var2 -= 3;
            var1.a(var3);
            break;
         default:
            throw bh.c(844707139);
         }
      }

   }

   private void a(char var1) {
      if (this.d.a((int)3, -1)) {
         this.d.a((byte)1);
         this.d.a((short)var1);
         this.d.b((int)3);
      }
   }

   private void a(byte var1, boolean var2) {
      if (this.d.a((int)3, -1)) {
         this.d.a((byte)0);
         this.d.a(var1);
         this.d.a((byte)(var2 ? -1 : 0));
         this.d.b((int)3);
      }
   }

   private byte b(int var1, int var2, boolean var3) {
      if (var2 != 0) {
         if (var2 == 8) {
            return 16;
         }

         if (var2 == 2) {
            return 3;
         }

         if (var2 == 5) {
            return 1;
         }

         if (var2 == 1) {
            return 0;
         }

         if (var2 == 6) {
            return 2;
         }
      } else {
         int var4 = Keypad.key(var1);
         int var5 = Keypad.status(var1);
         char var6 = Keypad.map(var1);
         if (var5 != 1 && var5 != 16) {
            if (!this.e.b() || !var3) {
               if (var4 == 85 || var4 == 84 || var4 == 79) {
                  return 0;
               }

               if (var4 == 72 || var4 == 86 || var4 == 78) {
                  return 3;
               }

               if (var4 == 74 || var4 == 71 || var4 == 76) {
                  return 2;
               }

               if (var4 == 75 || var4 == 66 || var4 == 77) {
                  return 1;
               }

               char var7 = Keypad.getAltedChar((char)var6);
               if (var7 >= '0' && var7 <= '9' || var7 == '#' || var7 == '*') {
                  var6 = var7;
               }
            }
         } else {
            var4 = Keypad.getAltedChar((char)var4);
         }

         if (var6 >= '0' && var6 <= '9' || var6 == '#' || var6 == '*') {
            if (!this.e.b()) {
               if (var6 == '#') {
                  return 14;
               }

               if (var6 == '*') {
                  return 15;
               }

               return (byte)(var6 - 48 + 4);
            }

            if (var3) {
               this.a((char)var6);
               return -1;
            }
         }

         if (var3) {
            if (var4 == 10 || var4 == 4098) {
               return 16;
            }

            if (var4 == 8 || var4 == 27) {
               return 17;
            }

            if (var6 >= ' ' && " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~°ÄÜÖäüöß".indexOf(var6) != -1) {
               this.a((char)var6);
               return -1;
            }
         }
      }

      return 17;
   }

   protected byte a(int var1, int var2, boolean var3) {
      int var4 = Keypad.key(var1);
      if (var4 != 10 && var4 != 4098) {
         if (var4 != 8 && var4 != 27) {
            if (var1 >= 48 && var1 <= 57) {
               return (byte)(var1 - 48 + 4);
            } else if (var1 == 35) {
               return 14;
            } else if (var1 == 42) {
               return 15;
            } else {
               if (var3) {
                  if (var1 == 8) {
                     return 17;
                  }

                  if (var1 == 10 || var1 == 13) {
                     return 16;
                  }

                  if (var1 > 32 && " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~°ÄÜÖäüöß".indexOf(var1) != -1) {
                     this.a((char)var1);
                     return -1;
                  }
               }

               if (var2 == 8) {
                  return 16;
               } else if (var2 == 2) {
                  return 3;
               } else if (var2 == 5) {
                  return 1;
               } else if (var2 == 1) {
                  return 0;
               } else if (var2 == 6) {
                  return 2;
               } else {
                  return 17;
               }
            }
         } else {
            return 17;
         }
      } else {
         return 16;
      }
   }
}
