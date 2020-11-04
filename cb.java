import java.io.DataInputStream;
import java.io.IOException;

public final class cb implements r {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   public static byte a = 1;
   short[] b;
   private final byte[] c;
   private final cj d;
   private final e e;
   private final e f;
   private final bk g;
   private final ce h;
   private final bk i;
   private final bx[] j;
   private boolean k;
   private short[] l;
   private int m;
   private ay n;
   private int o;
   private int p;

   public cb(cj var1, ay var2) {
      this.d = var1;
      this.p = 60000;
      this.c = new byte[256];
      this.j = new bx[2];
      this.e = new e();
      this.e.a(6, 3, 3);
      this.f = new e();
      this.f.a(1, 3, 0);
      this.i = new bk(2048);
      (this.j[0] = new bd(var1, this.i)).start();
      this.g = new bk(4096);
      (this.j[1] = new ca(var1, this.g)).start();
      this.h = new ce(this);
      this.n = var2;
   }

   public boolean a() {
      return this.d.d() || this.g.n() > 0;
   }

   public cb a(bm var1) {
      synchronized(this.h) {
         this.h.a(var1);
         return this;
      }
   }

   public void b() {
      this.g.o();
   }

   public void c() {
      this.b();
      this.d.a();
      int var1 = 0;

      for(int var2 = this.j.length; var1 < var2; ++var1) {
         this.j[var1].b();
      }

   }

   public q a(int var1) {
      int var2;
      int var4 = var2 = this.g.a(2, true, -1);
      if (var4 == -1) {
         return null;
      } else {
         q var3 = null;
         this.k = false;
         if (var4 > 0) {
            int var5 = this.o = this.g.l();
            var4 -= 2;
            if (var5 > var4) {
               this.a(2051688569, (String)null);
            }

            if (!this.k && this.o > 0) {
               int var6 = this.g.m();
               --this.o;
               switch(var6) {
               case 11:
                  int var8 = this.g.l();
                  this.o -= 2;
                  String var7;
                  if ((var7 = this.g()) != null) {
                     var3 = new q(var1, var7);
                  }
                  break;
               default:
                  this.g.c(3);
                  this.g.b(var2);
                  return null;
               }
            }

            var4 -= var5 - this.o;
         }

         this.g.f(var4);
         this.g.a(var2);
         return var3;
      }
   }

   public boolean a(byte var1) {
      q var4;
      if ((var4 = this.a((int)0)) != null) {
         aq.n = var4.b;
      }

      int var2;
      int var3 = var2 = this.g.a(2, true, -1);
      if (var3 == -1) {
         return false;
      } else {
         this.k = false;

         try {
            while(var3 > 0) {
               int var5 = this.o = this.g.l();
               var3 -= 2;
               if (var5 > var3) {
                  this.a(1296389687, (String)null);
               }

               while(!this.k && this.o > 0) {
                  int var6 = this.g.m();
                  --this.o;
                  e var7;
                  if (var6 == 3) {
                     if (!this.c(827609668, 1)) {
                        continue;
                     }

                     var7 = this.h.a((short)8004).a(this.g.i() != 0);
                     --this.o;
                  } else {
                     int var10;
                     int var13;
                     byte var14;
                     int var26;
                     int var32;
                     int var33;
                     if (var1 == 0) {
                        int var27;
                        String var28;
                        switch(var6) {
                        case 15:
                           var7 = this.h.a((short)1007).b(this.g.f()).b(this.g.f()).a((Object)this.g()).b(this.g.l());
                           break;
                        case 20:
                           var7 = this.h.a((short)1003);
                           if (this.c(825249108, 2)) {
                              var7.b(this.g.f());
                              this.o -= 2;
                              var7.a((Object)this.g());
                              var7.a((Object)this.g());
                           }
                           break;
                        case 30:
                           var7 = this.h.a((short)1002);
                           if (this.c(809715033, 2)) {
                              var7.a(this.g.i());
                              var26 = this.g.m();
                              this.o -= 2;
                              if (var26 <= 0) {
                                 this.a(1769232973, (String)null);
                              } else {
                                 for(var27 = 0; var27 < var26; ++var27) {
                                    var28 = this.g();
                                    if (var28 == null || !this.c(809850181, 2)) {
                                       break;
                                    }

                                    var32 = this.g.l();
                                    this.o -= 2;
                                    var7.a((Object)(new y(var28, (short)var32)));
                                 }
                              }
                           }
                           break;
                        case 40:
                           var7 = this.h.a((short)1000);
                           if (this.c(843400781, 8)) {
                              var7.a(this.g.i());
                              var7.b(this.g.l());
                              var7.b(this.g.g());
                              var7.a(this.g.i());
                              this.o -= 8;
                              var7.a((Object)this.g());
                           }
                           break;
                        case 41:
                           var7 = this.h.a((short)1004);
                           var7.a((Object)this.g());
                           if (this.c(844649032, 4)) {
                              var7.b(this.g.g());
                              this.o -= 4;
                           }
                           break;
                        case 42:
                           var7 = this.h.a((short)1001);
                           if (this.c(875647032, 2)) {
                              var26 = this.g.l();
                              this.o -= 2;
                              if (var26 > 1024) {
                                 this.a(1211647060, (String)null);
                              } else {
                                 var7.a(var26);
                                 this.g.b(var7.a(), 0, var26);
                                 this.o -= var26;
                              }
                           }
                           break;
                        case 43:
                           var7 = this.h.a((short)1006);
                           break;
                        case 50:
                           var7 = this.h.a((short)1010);
                           byte var11;
                           byte var24;
                           cd[] var25;
                           if (this.c(1515804754, 1)) {
                              var24 = this.g.i();
                              --this.o;
                              if (this.c(1515077944, 8 * var24)) {
                                 var25 = new cd[var24];

                                 for(var10 = 0; var10 < var24; ++var10) {
                                    var11 = this.g.i();
                                    short var12 = this.g.f();
                                    var13 = this.g.g();
                                    var14 = this.g.i();
                                    this.o -= 8;
                                    var25[var10] = new cd(var11, var14, var13, var12);
                                 }

                                 var7.a((Object)var25);
                              }
                           }

                           if (this.c(1261520469, 1)) {
                              var24 = this.g.i();
                              --this.o;
                              if (this.c(1515077944, 7 * var24)) {
                                 var25 = new cd[var24];

                                 for(var10 = 0; var10 < var24; ++var10) {
                                    short var35 = this.g.f();
                                    var33 = this.g.g();
                                    var11 = this.g.i();
                                    this.o -= 7;
                                    var25[var10] = new cd(3, var11, var33, var35);
                                 }

                                 var7.a((Object)var25);
                              }
                           }

                           if (this.c(1261520470, 1)) {
                              var24 = this.g.i();
                              --this.o;
                              if (this.c(1515077945, 9 * var24)) {
                                 for(var27 = 0; var27 < var24; ++var27) {
                                    short var29 = this.g.f();
                                    var33 = this.g.g();
                                    var28 = this.g();
                                    this.o -= 6;
                                 }
                              }
                           }

                           if (this.c(1513698359, 1)) {
                              var24 = this.g.i();
                              --this.o;
                              if (this.c(1498961219, 6 * var24)) {
                                 for(var27 = 0; var27 < var24; ++var27) {
                                    short var30 = this.g.f();
                                    var32 = this.g.g();
                                    this.o -= 6;
                                    String var34 = this.g();
                                 }
                              }
                           }
                           break;
                        case 51:
                           var7 = this.h.a((short)1011);
                           if (this.c(1498952241, 6)) {
                              var7.b(this.g.f()).b(this.g.g()).a((Object)this.g());
                              this.o -= 6;
                           }
                           break;
                        case 100:
                           var7 = this.h.a((short)1005);
                           if (this.c(825380916, 2)) {
                              var7.b(this.g.f());
                              this.o -= 2;
                              String var8 = this.g();
                              if (var8 != null && this.c(827535672, 2)) {
                                 short var9 = this.g.f();
                                 this.o -= 2;
                                 var7.a((Object)(new y(var8, var9)));
                              }
                           }
                           break;
                        default:
                           this.a(962218041, String.valueOf(var6));
                        }
                     } else {
                        byte var15;
                        int var16;
                        byte var17;
                        byte var19;
                        int var38;
                        int var39;
                        byte var40;
                        byte var42;
                        label896:
                        switch(var6) {
                        case 1:
                           var26 = this.g.l();
                           aa.h = var26;
                           this.o -= 2;
                           continue;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 68:
                        case 69:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 113:
                        case 114:
                        case 116:
                        case 117:
                        case 118:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 144:
                        case 145:
                        case 146:
                        case 147:
                        case 148:
                        case 149:
                        case 158:
                        case 159:
                        case 163:
                        case 164:
                        case 165:
                        case 166:
                        case 167:
                        case 168:
                        case 175:
                        case 183:
                        case 185:
                        case 187:
                        case 189:
                        case 194:
                        case 195:
                        case 196:
                        case 197:
                        case 198:
                        case 199:
                        case 200:
                        case 201:
                        case 202:
                        case 203:
                        case 204:
                        case 205:
                        case 206:
                        case 207:
                        case 208:
                        case 209:
                        case 210:
                        case 211:
                        case 212:
                        case 213:
                        case 214:
                        case 215:
                        case 216:
                        case 217:
                        case 218:
                        case 219:
                        case 220:
                        case 221:
                        case 222:
                        case 223:
                        case 224:
                        case 225:
                        case 226:
                        case 227:
                        case 228:
                        case 229:
                        case 230:
                        case 231:
                        case 232:
                        case 233:
                        case 234:
                        case 235:
                        case 236:
                        case 237:
                        case 238:
                        case 239:
                        case 240:
                        case 241:
                        case 242:
                        case 243:
                        case 244:
                        case 245:
                        case 246:
                        case 247:
                        case 248:
                        case 249:
                        case 250:
                        case 251:
                        case 252:
                        case 253:
                        case 254:
                        default:
                           this.a(1146442546, String.valueOf(var6));
                           continue;
                        case 12:
                           var7 = this.h.a((short)2069);
                           byte var31 = this.g.i();
                           var7.a(var31);
                           --this.o;
                           var10 = 0;

                           while(true) {
                              if (var10 >= var31) {
                                 break label896;
                              }

                              var7.a((Object)this.g());
                              ++var10;
                           }
                        case 13:
                           var7 = this.h.a((short)2068);
                           this.a(var7);
                           var10 = this.g.m();
                           --this.o;
                           var7.b(var10);

                           for(var32 = 0; var32 < var10; ++var32) {
                              var7.b(this.g.f());
                              this.o -= 2;
                           }

                           var32 = this.g.m();
                           --this.o;
                           var7.b(var32);
                           var33 = 0;

                           while(true) {
                              if (var33 >= var32) {
                                 break label896;
                              }

                              byte var36 = this.g.i();
                              var7.a(var36);
                              var7.a(this.g.i());
                              var7.a(this.g.i());
                              this.o -= 3;
                              this.d(var36);
                              ++var33;
                           }
                        case 20:
                           var7 = this.h.a((short)2031);
                           break;
                        case 40:
                           var7 = this.h.a((short)2059);
                           var7.b(this.g.l()).b(this.g.l()).a(this.g.i());
                           this.o -= 5;
                           var33 = 0;

                           while(true) {
                              if (var33 >= 1024) {
                                 break label896;
                              }

                              var13 = this.g.m();
                              --this.o;
                              var7.b(var13);
                              var33 += (var13 >>> 4) + 1;
                           }
                        case 41:
                           var7 = this.h.a((short)2060);
                           var7.b(this.g.l()).b(this.g.l()).a(this.g.i());
                           this.o -= 5;
                           break;
                        case 51:
                           var7 = this.h.a((short)2032);
                           if (this.c(892680270, 3)) {
                              var7.b(this.g.l()).a(this.g.i());
                              this.o -= 3;
                           }
                           break;
                        case 60:
                           var7 = this.h.a((short)2049).a((Object)this.g()).a((Object)this.g()).a((Object)this.g());
                           break;
                        case 65:
                           var7 = this.h.a((short)2028).a((Object)this.g());
                           break;
                        case 66:
                           var7 = this.h.a((short)2006).a((Object)this.g()).a((Object)this.g()).a(this.g.i());
                           --this.o;
                           break;
                        case 67:
                           var7 = this.h.a((short)2007).a((Object)this.g()).a((Object)this.g());
                           break;
                        case 70:
                           var7 = this.h.a((short)2013);
                           if (this.c(1380996919, 4)) {
                              var7.b(this.g.g());
                              this.o -= 4;
                           }

                           var7.a((Object)this.g());
                           var7.a((Object)this.g());
                           var7.a(this.g.i());
                           --this.o;
                           break;
                        case 71:
                           var7 = this.h.a((short)2014).a((Object)this.g());
                           if (this.c(1094793043, 1)) {
                              var7.a(this.g.i());
                              --this.o;
                           }
                           break;
                        case 72:
                           var7 = this.h.a((short)2010).a((Object)this.g()).a((Object)this.g());
                           if (this.c(826430800, 3)) {
                              var7.b(this.g.l());
                              var7.a(this.g.i());
                              this.o -= 3;
                           }
                           break;
                        case 73:
                           var7 = this.h.a((short)2011).a((Object)this.g()).a((Object)this.g()).a((Object)this.g()).a((Object)this.g());
                           if (this.c(1163281221, 4)) {
                              var7.b(this.g.l());
                              this.o -= 2;
                              this.g.i();
                              --this.o;
                              var38 = this.g.l();
                              var7.b(var38);

                              for(this.o -= 2; var38 > 0; --this.o) {
                                 --var38;
                                 if (!this.c(1412650296, 4)) {
                                    break;
                                 }

                                 var7.b(this.g.g());
                                 this.o -= 4;
                                 var15 = this.g.i();
                                 var7.a(var15);
                                 --this.o;
                                 if (var15 == 3) {
                                    var17 = this.g.i();
                                    var7.a(this.g.i());
                                    var7.a(this.g.i());
                                    this.o -= 3;
                                    this.d(var17);
                                    var7.a((byte)(var17 >>> 1 & 7));
                                 } else {
                                    var7.a(this.g.i());
                                    var7.a(this.g.i());
                                    this.o -= 2;
                                    var7.a((byte)-1);
                                 }

                                 var7.a((Object)this.g());
                                 var7.a((Object)this.g());
                                 var7.a((Object)this.g());
                                 var7.a(this.g.i());
                              }
                           }
                           break;
                        case 74:
                           var7 = this.h.a((short)2012);
                           if (this.c(1414672474, 2)) {
                              var38 = this.g.l();
                              this.o -= 2;
                              var7.b(var38);

                              while(var38 > 0) {
                                 --var38;
                                 if (this.c(1431451731, 4)) {
                                    var7.b(this.g.g());
                                    this.o -= 4;
                                 }

                                 var7.a((Object)this.g());
                                 if (this.c(1463047514, 2)) {
                                    var7.a(this.g.i());
                                    var7.a(this.g.i());
                                    this.o -= 2;
                                 }
                              }
                           }
                           break;
                        case 75:
                           var7 = this.h.a((short)2000).a(this.g.i());
                           --this.o;
                           break;
                        case 76:
                           var7 = this.h.a((short)2050).a(this.g.i());
                           --this.o;
                           break;
                        case 100:
                           var7 = this.h.a((short)2019);
                           var38 = 0;

                           while(true) {
                              if (var38 >= 225) {
                                 break label896;
                              }

                              this.a(var7);
                              ++var38;
                           }
                        case 101:
                           System.gc();
                           var7 = this.c((byte)0);
                           break;
                        case 102:
                           System.gc();
                           var7 = this.c((byte)1);
                           break;
                        case 103:
                           System.gc();
                           var7 = this.c((byte)2);
                           break;
                        case 104:
                           System.gc();
                           var7 = this.c((byte)3);
                           break;
                        case 105:
                           var7 = this.h.a((short)2046);
                           if (this.c(960968534, 5)) {
                              var7.b(this.g.l()).b(this.g.l()).b(this.g.m());
                              this.o -= 5;
                           }
                           break;
                        case 110:
                           var7 = this.h.a((short)2043);
                           if (this.c(1094076230, 3)) {
                              var14 = this.g.i();
                              var7.a((byte)(var14 & 15)).a((byte)(var14 >> 4 & 15));
                              var15 = this.g.i();
                              var40 = this.g.i();
                              var7.a(var40);
                              var7.a(var15);
                              this.o -= 3;
                           }
                           break;
                        case 111:
                           var7 = this.h.a((short)2043);
                           if (this.c(1094796593, 1)) {
                              var14 = this.g.i();
                              var7.a((byte)(var14 & 15)).a((byte)(var14 >> 4 & 15)).a((byte)0);
                              --this.o;
                           }
                           break;
                        case 112:
                           var7 = this.h.a((short)2044);
                           var7.a(this.g.i());
                           this.a(var7);
                           var7.a(this.g.i());
                           this.o -= 2;
                           break;
                        case 115:
                           var7 = this.h.a((short)2036);
                           if (this.c(1095907418, 1)) {
                              var14 = this.g.i();
                              var7.a((byte)(var14 & 15)).a((byte)(var14 >> 4 & 15));
                              --this.o;
                           }

                           this.a(var7);
                           break;
                        case 119:
                           var7 = this.h.a((short)2039);
                           var7.a(this.g.i()).a(this.g.i());
                           this.o -= 2;
                           break;
                        case 120:
                           var7 = this.h.a((short)2037);
                           var7.a(this.g.i());
                           var14 = this.g.i();
                           var39 = this.g.l();
                           this.d(var14);
                           var7.a((byte)(var14 >>> 1 & 7));
                           var7.b(var39);
                           this.o -= 4;
                           break;
                        case 121:
                           var7 = this.b((byte)0);
                           break;
                        case 122:
                           var7 = this.b((byte)1);
                           break;
                        case 123:
                           var7 = this.b((byte)2);
                           break;
                        case 124:
                           var7 = this.b((byte)3);
                           break;
                        case 125:
                           var7 = this.h.a((short)2008);
                           if (this.c(1112692570, 1)) {
                              var7.a(this.g.i());
                              --this.o;
                           }
                           break;
                        case 126:
                           this.g.m();
                           --this.o;
                           var7 = this.c((int)3);
                           break;
                        case 127:
                           var7 = this.h.a((short)2042);
                           if (this.c(1161381716, 3)) {
                              var7.a(this.g.i());
                              var14 = this.g.i();
                              var7.a((byte)(var14 & 15)).a((byte)(var14 >> 4 & 15));
                              var7.a(this.g.i());
                              this.o -= 3;
                              var7.a((Object)this.g());
                              if (this.c(1194668104, 4)) {
                                 var7.a(this.g.i());
                                 var15 = this.g.i();
                                 var7.a((byte)(var15 >>> 1 & 7));
                                 var7.b(this.g.l());
                                 this.d(var15);
                                 this.o -= 4;
                              }
                           }
                           break;
                        case 128:
                           var7 = this.h.a((short)2045);
                           if (this.c(1195526965, 3)) {
                              var7.a(this.g.i());
                              var14 = this.g.i();
                              var7.a((byte)(var14 & 15)).a((byte)(var14 >> 4 & 15)).a(this.g.i());
                              this.o -= 3;
                           }
                           break;
                        case 129:
                           var7 = this.h.a((short)2033);
                           if (this.c(1195594834, 2)) {
                              var7.a(this.g.i()).a(this.g.i());
                              this.o -= 2;
                           }
                           break;
                        case 130:
                           var7 = this.h.a((short)2023);
                           if (this.c(1196313416, 2)) {
                              var14 = this.g.i();
                              var7.a((byte)(var14 & 15)).a((byte)(var14 >> 4 & 15)).a(this.g.i());
                              this.o -= 2;
                           }
                           break;
                        case 131:
                           var7 = this.h.a((short)2055);
                           if (this.c(1211316046, 2)) {
                              var14 = this.g.i();
                              var7.a((byte)(var14 & 15)).a((byte)(var14 >> 4 & 15)).a((byte)(this.g.m() - 1)).a((Object)this.g());
                              this.o -= 2;
                           }
                           break;
                        case 132:
                           var7 = this.h.a((short)2061);
                           var7.a(this.g.i()).a(this.g.i());
                           this.o -= 2;
                           break;
                        case 133:
                           var7 = this.h.a((short)2062);
                           var7.a(this.g.i());
                           --this.o;
                           break;
                        case 134:
                           var7 = this.h.a((short)2063).a(this.g.i());
                           --this.o;
                           break;
                        case 140:
                           var7 = this.h.a((short)2018);
                           if (this.c(1213612615, 32)) {
                              for(var38 = 0; var38 < 16; ++var38) {
                                 var15 = this.g.i();
                                 var40 = this.g.i();
                                 var7.a(var40);
                                 var7.a(var15);
                              }

                              this.o -= 32;
                           }
                           break;
                        case 141:
                           var7 = this.h.a((short)2041);
                           if (this.c(1244943669, 3)) {
                              var7.a((byte)(this.g.i() - 1));
                              var14 = this.g.i();
                              var15 = this.g.i();
                              var7.a(var15);
                              var7.a(var14);
                              this.o -= 3;
                           }
                           break;
                        case 142:
                           var7 = this.h.a((short)2041);
                           if (this.c(1261459267, 1)) {
                              var7.a((byte)(this.g.i() - 1)).a((byte)0);
                              --this.o;
                           }
                           break;
                        case 143:
                           var7 = this.h.a((short)2074);
                           if (this.c(1379093047, 9)) {
                              var7.a(this.g.i()).b(this.g.g()).b(this.g.g());
                              this.o -= 9;
                           }
                           break;
                        case 150:
                           var7 = this.h.a((short)2020);
                           if (this.c(1296190007, 13)) {
                              var7.b(this.g.m()).b(this.g.m()).b(this.g.g()).b(this.g.g()).b(this.g.m()).b(this.g.g()).b(this.g.l()).b(this.g.l());
                              this.o -= 19;
                           }
                           break;
                        case 151:
                           var7 = this.c((int)4);
                           break;
                        case 152:
                           var7 = this.c((int)5);
                           break;
                        case 153:
                           this.o -= 8;
                           var7 = this.h.a((short)2066).a((byte)1).b(this.g.g()).b(this.g.g());
                           break;
                        case 154:
                           var7 = this.c((int)0);
                           break;
                        case 155:
                           var7 = this.b((int)2);
                           break;
                        case 156:
                           var7 = this.h.a((short)2021);
                           var7.b(this.g.l());
                           this.o -= 2;
                           break;
                        case 157:
                           var7 = this.h.a((short)2064);
                           var7.b(this.g.f());
                           this.o -= 2;
                           break;
                        case 160:
                           var7 = this.h.a((short)2056);
                           if (this.c(1296712779, 3)) {
                              var14 = this.g.i();
                              var39 = this.g.l();
                              this.d(var14);
                              this.o -= 3;
                              var40 = (byte)(var14 >>> 1 & 7);
                              var7.b(var39);
                              var7.a(var40);
                           }
                           break;
                        case 161:
                           var7 = this.h.a((short)2057);
                           if (this.c(1513703472, 7)) {
                              var7.a(this.g.i());
                              --this.o;
                              var14 = this.g.i();
                              var7.a(var14);
                              --this.o;
                              if (var14 == 3) {
                                 var40 = this.g.i();
                                 var7.a(this.g.i());
                                 var7.a(this.g.i());
                                 this.o -= 3;
                                 this.d(var40);
                                 var7.a((byte)(var40 >>> 1 & 7));
                              } else {
                                 var7.a(this.g.i());
                                 var7.a(this.g.i());
                                 this.o -= 2;
                                 var7.a((byte)-1);
                              }

                              var7.a(this.g.i());
                              var7.b(this.g.l());
                              this.o -= 3;
                           }
                           break;
                        case 162:
                           var7 = this.h.a((short)2058);
                           if (this.c(1297757256, 4)) {
                              var7.a(this.g.i());
                              var7.a(this.g.i());
                              var7.b(this.g.l());
                              this.o -= 4;
                           }
                           break;
                        case 169:
                           (var7 = this.h.a((short)2004)).a((Object)this.g()).a((Object)this.g());
                           break;
                        case 170:
                           var7 = this.h.a((short)2053);
                           if (this.c(1297757256, 1)) {
                              var7.a(this.g.i());
                              --this.o;
                              var7.a((Object)this.g());
                           }
                           break;
                        case 171:
                           (var7 = this.h.a((short)2003)).a((Object)this.g()).a((Object)this.g());
                           break;
                        case 172:
                           var7 = this.h.a((short)2002);
                           if (this.c(1311846746, 1)) {
                              var38 = this.g.m();
                              --this.o;

                              for(var39 = 0; var39 < var38; ++var39) {
                                 var7.a((Object)this.g());
                              }
                           }
                           break;
                        case 173:
                           var7 = this.h.a((short)2025);
                           break;
                        case 174:
                           String var37 = this.g();
                           var7 = this.h.a((short)2054);
                           var7.a((Object)var37);
                           var15 = this.g.i();
                           --this.o;
                           var16 = 1;

                           while(true) {
                              if (var16 > var15) {
                                 break label896;
                              }

                              var7.a((Object)this.g());
                              ++var16;
                           }
                        case 176:
                           var7 = this.h.a((short)2026);
                           break;
                        case 177:
                           (var7 = this.h.a((short)2009)).a((Object)this.g());
                           var7.b(this.g.m());
                           --this.o;
                           var7.b(this.g.m());
                           --this.o;
                           var7.b(this.g.m());
                           --this.o;
                           var16 = this.g.m();
                           --this.o;
                           var7.b(var16);
                           if (this.c(1345336625, 2 * var16)) {
                              for(int var41 = 0; var41 < var16; ++var41) {
                                 var42 = this.g.i();
                                 var19 = this.g.i();
                                 this.o -= 2;
                                 var7.a(var19);
                                 var7.a(var42);
                              }
                           }
                           break;
                        case 178:
                           var7 = this.h.a((short)2040);
                           if (this.c(1346457653, 3)) {
                              var7.a((byte)(this.g.i() - 1));
                              var17 = this.g.i();
                              var42 = this.g.i();
                              var7.a(var42);
                              var7.a(var17);
                              this.o -= 3;
                           }
                           break;
                        case 179:
                           var7 = this.h.a((short)2040);
                           if (this.c(1347831345, 1)) {
                              var7.a((byte)(this.g.i() - 1)).a((byte)0);
                              --this.o;
                           }
                           break;
                        case 180:
                           (var7 = this.h.a((short)2022)).a((Object)this.g());
                           break;
                        case 181:
                           (var7 = this.h.a((short)2052)).a((Object)this.g());
                           break;
                        case 182:
                           var7 = this.h.a((short)2029);
                           if (this.c(1347962681, 3)) {
                              var17 = this.g.i();
                              var7.a(var17);
                              --this.o;
                              if (var17 == 3) {
                                 var19 = this.g.i();
                                 var7.a(this.g.i());
                                 var7.a(this.g.i());
                                 this.o -= 3;
                                 this.d(var19);
                                 var7.a((byte)(var19 >>> 1 & 7));
                              } else {
                                 var7.a(this.g.i());
                                 var7.a(this.g.i());
                                 this.o -= 2;
                                 var7.a((byte)-1);
                              }

                              var7.a((Object)this.g()).a((Object)this.g()).a((Object)this.g());
                           }
                           break;
                        case 184:
                           var7 = this.h.a((short)2070);
                           this.g();
                           var17 = this.g.i();
                           --this.o;
                           this.g.i();
                           this.g.i();
                           this.d(var17);

                           int var18;
                           int var20;
                           for(var18 = 0; var18 < 4; ++var18) {
                              var19 = this.g.i();
                              --this.o;

                              for(var20 = 0; var20 < var19; ++var20) {
                                 this.g.f();
                                 this.g.i();
                                 this.g.i();
                                 this.g.i();
                                 this.o -= 5;
                              }
                           }

                           var18 = 0;

                           while(true) {
                              if (var18 >= 5) {
                                 break label896;
                              }

                              var19 = this.g.i();
                              --this.o;

                              for(var20 = 0; var20 < var19; ++var20) {
                                 this.g.f();
                                 this.g.i();
                                 this.g.i();
                                 this.g.i();
                                 this.g.i();
                                 this.o -= 6;
                              }

                              ++var18;
                           }
                        case 186:
                           var7 = this.h.a((short)2035).a((Object)this.g());
                           break;
                        case 188:
                           var7 = this.h.a((short)2065).a(this.g.i());
                           --this.o;
                           break;
                        case 190:
                           var7 = this.h.a((short)2067).b(this.g.l()).b(this.g.l()).a(this.g.i()).a((Object)this.g());
                           this.o -= 5;
                           break;
                        case 191:
                           var7 = this.h.a((short)2071).a(this.g.i());
                           --this.o;
                           break;
                        case 192:
                           var7 = this.h.a((short)2072).a(this.g.i());
                           --this.o;
                           break;
                        case 193:
                           var7 = this.h.a((short)2073).a(this.g.i());
                           --this.o;
                           break;
                        case 255:
                        }
                     }
                     continue;
                  }

                  if (!this.k) {
                     var7.e();
                  }
               }

               var3 -= var5 - this.o;
            }
         } finally {
            if (var3 != 0) {
               this.a(844650056, (String)null);
            }

            this.g.f(var3);
            this.g.a(var2);
         }

         return true;
      }
   }

   public cb b(bm var1) {
      synchronized(var1) {
         this.h.b(var1);
         return this;
      }
   }

   public boolean d() {
      long var1 = System.currentTimeMillis();

      do {
         if (this.g.b(2, 250)) {
            return true;
         }
      } while(this.a() && System.currentTimeMillis() - var1 < (long)this.p);

      return false;
   }

   public e a(short var1) {
      return this.e.a(var1, this);
   }

   public e b(short var1) {
      return this.f.a(var1, this);
   }

   public synchronized void b(e var1) {
      switch(var1.a) {
      case 3001:
         this.a(152, (byte)var1.d(0));
         break;
      case 3002:
         this.a(140, (byte)var1.d(0));
         break;
      case 3003:
         this.b(bk.a(var1.g(0)), 69).b(var1.g(0));
         this.e();
         break;
      case 3004:
      case 3005:
      case 3007:
      case 3011:
      case 3013:
      case 3015:
      case 3021:
      case 3028:
      case 3029:
      case 3033:
      case 3034:
      case 3035:
      case 3036:
      case 3037:
      case 3041:
      case 3043:
      case 3044:
      case 3046:
      case 3051:
      default:
         throw bh.b(1194735960, String.valueOf(var1.a));
      case 3006:
         this.b(bk.a(var1.g(0)) + 2 + bk.a(var1.g(1)) + bk.a(var1.g(2)), 66).b(var1.g(0)).a(var1.d(0)).a(var1.d(1)).b(var1.g(1)).b(var1.g(2));
         break;
      case 3008:
         this.f();
         bk var4 = this.b(10 + var1.d(0) * 3 + bk.a(var1.g(0)) + bk.a(var1.g(1)) + bk.a(var1.g(2)), 13).b(var1.g(0)).h(var1.e(0)).h(var1.e(1)).b(var1.g(1)).b(var1.g(2));
         byte var5 = var1.d(0);
         var4.a(var5);

         for(int var7 = 0; var7 < var5; ++var7) {
            var4.a(var1.d(1 + var7));
            var4.a((short)var1.e(2 + var7));
         }

         var4.a(var1.d(1 + var5));
         this.e();
         break;
      case 3009:
         this.a(111, (byte)((byte)(var1.d(0) + 1)));
         break;
      case 3010:
         this.a(160, (byte)a(var1.d(0), (int)var1.d(1)));
         break;
      case 3012:
         this.a(110, (byte)((byte)(var1.d(0) + 1)));
         break;
      case 3014:
         byte var6;
         switch(var1.d(0)) {
         case 0:
            var6 = 100;
            break;
         case 1:
            var6 = 101;
            break;
         case 2:
            var6 = 102;
            break;
         case 3:
            var6 = 103;
            break;
         default:
            return;
         }

         this.d((int)var6);
         break;
      case 3016:
         this.b(9 + bk.a(var1.g(0)), 74).h(var1.e(0)).b(var1.g(0)).h(var1.e(1)).a(var1.d(0));
         this.e();
         break;
      case 3017:
         this.a(154, (byte)var1.d(0));
         break;
      case 3018:
         this.d((int)153);
         break;
      case 3019:
         this.d((int)161);
         break;
      case 3020:
         this.b(12 + bk.a(var1.g(0)), 71).h(var1.e(0)).b(var1.g(0)).h(var1.e(1)).h(var1.e(2));
         this.e();
         break;
      case 3022:
         this.a(131, (byte)((byte)(var1.d(0) + 1)));
         break;
      case 3023:
         this.a(130, (byte)a(var1.d(0), (int)var1.d(1)));
         break;
      case 3024:
         this.b(4 + bk.a(var1.g(0)), 73).h(var1.e(0)).b(var1.g(0));
         this.e();
         break;
      case 3025:
         this.b(8 + bk.a(var1.g(0)), 70).h(var1.e(0)).b(var1.g(0)).h(var1.e(1));
         this.e();
         break;
      case 3026:
         this.b(bk.a(var1.g(0)) + bk.a(var1.g(1)) + 8, 72).h(var1.e(0)).b(var1.g(0)).h(var1.e(1)).b(var1.g(1));
         this.e();
         break;
      case 3027:
         this.b(bk.a(var1.g(0)) + 4, 65).b(var1.g(0)).a((short)var1.e(0)).a((short)var1.e(1));
         this.e();
         break;
      case 3030:
         this.d((int)30);
         break;
      case 3031:
         this.d((int)20);
         break;
      case 3032:
         this.a(164, (byte)(var1.d(0) + 1), (byte)(var1.d(1) + 1));
         break;
      case 3038:
         this.b(bk.a(var1.g(0)) + 1, 60).b(var1.g(0)).a(var1.d(0));
         this.e();
         break;
      case 3039:
         this.d((int)31);
         break;
      case 3040:
         this.a(165, (byte)(var1.d(0) + 1), (byte)(var1.d(1) + 1));
         break;
      case 3042:
         if (var1.g(0) == null) {
            this.b(bk.a(var1.g(1)), 150).b(var1.g(1));
            this.e();
         } else {
            this.b(bk.a(var1.g(0)) + bk.a(var1.g(1)), 151).b(var1.g(0)).b(var1.g(1));
            this.e();
         }
         break;
      case 3045:
         this.a(120, (byte)((byte)(var1.d(0) + 1)));
         break;
      case 3047:
         byte var2 = var1.d(0);
         this.b(3, 12);
         this.i.a(var2);
         this.i.a((byte)20);
         this.i.a((byte)1);
         this.e();
         break;
      case 3048:
         byte var3 = var1.d(0);
         this.b(1, 13);
         this.i.a(var3);
         this.e();
         break;
      case 3049:
         this.d((int)14);
         break;
      case 3050:
         this.a(169, (byte)var1.d(0));
         break;
      case 3052:
         this.b(2, 17).a((short)var1.e(0));
         this.e();
         break;
      case 3053:
         this.a(18, (byte)var1.d(0));
         break;
      case 3054:
         this.b(2, 19).a((byte)20).a((byte)1);
         this.e();
         break;
      case 3055:
         this.b(bk.a(var1.g(0)), 14).b(var1.g(0));
         this.e();
         break;
      case 3056:
         this.d((int)15);
         break;
      case 3057:
         this.b(2, 16).a((short)var1.e(0));
         this.e();
         break;
      case 3058:
         this.b(10 + bk.a(var1.g(0)) + bk.a(var1.g(1)) + bk.a(var1.g(2)), 12).b(var1.g(0)).h(var1.e(0)).h(var1.e(1)).b(var1.g(1)).b(var1.g(2)).a((byte)(var1.d(0) + 1)).a((byte)(var1.d(1) + 1));
         this.e();
         break;
      case 3059:
         this.b(7, 40).a((short)var1.e(0)).a((short)var1.e(1)).a(var1.d(0)).a((short)var1.e(2));
         this.e();
         break;
      case 3060:
         this.b(7 + bk.a(var1.g(0)) + bk.a((String)var1.g(1), 50), 3).a(var1.d(0)).b(var1.g(0)).a(var1.d(1)).a((short)var1.e(0)).a(var1.d(2)).b((String)var1.g(1), 50).a((short)var1.e(1));
         this.e();
         break;
      case 3061:
         this.b(bk.a(var1.g(0)), 21).b(var1.g(0));
         this.e();
         break;
      case 3062:
         this.b(8, 22).a((short)var1.e(0)).a((short)var1.e(1)).a((short)var1.e(2)).a((short)var1.e(3));
         this.e();
         break;
      case 3063:
         this.b(5 + bk.a(var1.g(0)) + bk.a((String)var1.g(1), 50), 3).a(var1.d(0)).b(var1.g(0)).a(var1.d(1)).a((short)var1.e(0)).a(var1.d(2)).b((String)var1.g(1), 50);
         this.e();
      }

   }

   private static byte a(int var0, int var1) {
      return (byte)(var1 << 4 & 240 | var0 & 15);
   }

   private bk b(int var1, int var2) {
      this.m = var1 + 3;

      while(!this.i.a(this.m, this.p)) {
      }

      return this.i.a((short)(var1 + 1)).a((byte)var2);
   }

   private void a(int var1, String var2) {
      bh.a((byte)2, var1, (String)var2);
      this.k = true;
   }

   private boolean c(int var1, int var2) {
      if (this.k) {
         return false;
      } else if (this.o < var2) {
         this.a(var1, (String)null);
         return false;
      } else {
         return true;
      }
   }

   private void e() {
      this.i.b(this.m);
   }

   private e b(byte var1) {
      if (this.c(1414805830, 1)) {
         --this.o;
         return this.h.a((short)2027).a(this.g.i()).a(var1);
      } else {
         return null;
      }
   }

   private e c(byte var1) {
      e var2 = this.h.a((short)2034).b(var1);

      for(int var3 = 0; var3 < 15; ++var3) {
         this.a(var2);
      }

      return var2;
   }

   private e b(int var1) {
      if (this.c(1431122995, 4)) {
         this.o -= 4;
         return this.h.a((short)2047).a((byte)var1).b(this.g.g());
      } else {
         return null;
      }
   }

   private e c(int var1) {
      if (this.c(1430606658, 1)) {
         --this.o;
         return this.h.a((short)2047).a((byte)var1).b(this.g.m());
      } else {
         return null;
      }
   }

   private void f() {
      try {
         DataInputStream var1 = new DataInputStream(this.n.a((int)3, "dictionary.dat"));

         try {
            short var2 = (short)(var1.readByte() & 255 | var1.readByte() << 8);
            this.l = new short[var2];

            int var3;
            for(var3 = 0; var3 < var2; ++var3) {
               byte var4 = var1.readByte();
               byte var5 = var1.readByte();
               this.l[var3] = (short)(var4 << 8 | (short)(var5 & 255));
            }

            this.b = new short[var2 * 2];

            for(var3 = 0; var3 < var2 * 2 - 2; var3 += 2) {
               this.b[var3] = (short)(var1.readByte() & 255 | var1.readByte() << 8);
               this.b[var3 + 1] = (short)(var1.readByte() & 255 | var1.readByte() << 8);
            }
         } finally {
            var1.close();
         }

      } catch (IOException var10) {
         throw bh.a(1261646660, (Throwable)var10);
      }
   }

   private void d(int var1) {
      this.b(0, var1);
      this.e();
   }

   private void a(int var1, byte var2) {
      this.b(1, var1).a(var2);
      this.e();
   }

   private void a(int var1, byte var2, byte var3) {
      this.b(2, var1).a(var2).a(var3);
      this.e();
   }

   private void a(e var1) {
      short var2 = 0;

      while(true) {
         if (this.g.p()) {
            --this.o;
         }

         int var3 = this.g.j();
         var2 = this.b[(-var2 << 1) + var3];
         if (var2 >= 0) {
            byte var4 = (byte)(this.l[var2] >> 8);
            byte var5 = (byte)this.l[var2];
            this.e(var2);
            var1.a(var4);
            var1.a(var5);
            if (var4 + var5 == 0) {
               return;
            }

            var2 = 0;
         }
      }
   }

   private String g() {
      if (this.c(1462914353, 1)) {
         int var1 = this.g.m();
         --this.o;
         if (var1 == 255) {
            if (!this.c(1464022341, 2)) {
               return null;
            }

            var1 = this.g.l();
            this.o -= 2;
         }

         if (var1 == 0) {
            return "";
         }

         if (this.c(1465205313, var1)) {
            byte[] var2 = var1 > this.c.length ? new byte[var1] : this.c;
            this.g.b(var2, 0, var1);
            this.o -= var1;
            return bh.a((byte[])var2, 0, (int)var1);
         }
      }

      return null;
   }

   private void e(int var1) {
      if (var1 > 0) {
         short[] var10000 = this.l;
         var10000[var1] ^= this.l[var1 - 1];
         var10000 = this.l;
         var10000[var1 - 1] ^= this.l[var1];
         var10000 = this.l;
         var10000[var1] ^= this.l[var1 - 1];
      }

   }

   private void d(byte var1) {
      if ((var1 & 1) != 0) {
         for(int var2 = 0; var2 < 23; ++var2) {
            this.g.i();
            --this.o;
         }
      }

   }
}
