import java.io.IOException;

public class bf extends ao {
   static final int MBOOSTER_MAX_INSTANCES = 1;

   protected c a(byte var1) {
      Object var2;
      try {
         switch(var1) {
         case 0:
            var2 = new bj();
            break;
         case 1:
            var2 = new ck();
            break;
         case 2:
            var2 = new ba();
            break;
         case 3:
            var2 = new v();
            break;
         case 4:
            var2 = new ak();
            break;
         case 5:
            var2 = new ch();
            break;
         case 6:
            var2 = new f();
            break;
         case 7:
            var2 = new cc();
            break;
         case 8:
            var2 = new as();
            break;
         case 9:
            var2 = new az(15, 9, 20);
            break;
         case 10:
            var2 = new at();
            break;
         case 11:
            var2 = new bw();
            break;
         case 12:
            var2 = new by();
            break;
         case 13:
            var2 = new cm();
            break;
         case 14:
            var2 = new au();
            break;
         case 15:
            var2 = new cp();
            break;
         case 16:
            var2 = new bg();
            break;
         default:
            throw bh.d(1161970230, String.valueOf(var1));
         }
      } catch (IOException var11) {
         throw var11;
      } catch (Throwable var12) {
         throw bh.a(1128617808, String.valueOf(var1), bh.a(1262956867, (String)null, (Throwable)var12));
      }

      byte var3 = -1;

      try {
         for(var3 = this.e(); var3 != -1; var3 = this.e()) {
            ba var13;
            switch(var3) {
            case 0:
               ((c)var2).d(this.c());
               break;
            case 1:
               byte var6;
               switch(this.c()) {
               case 4:
                  var6 = 0;
                  break;
               case 5:
                  var6 = 1;
                  break;
               default:
                  throw ao.a();
               }

               try {
                  ((b)var2).a(var6);
                  break;
               } catch (Throwable var8) {
                  throw bh.a(1514489433, var8);
               }
            case 2:
               ((b)var2).a(this.c());
               break;
            case 3:
               ((b)var2).a(this.f());
               break;
            case 4:
               ((be)var2).a(this.c());
               break;
            case 5:
               String var5 = this.f();
               ((bj)var2).a(var5);
               if (var5.equals("ManaBar")) {
                  cf.F = (bj)var2;
               }
               break;
            case 6:
               ((c)var2).e(this.b());
               break;
            case 7:
               if (this.b()) {
                  var13 = (ba)var2;
                  var13.b(var13.a | 1);
               }
               break;
            case 8:
               if (this.b()) {
                  var13 = (ba)var2;
                  var13.b(var13.a | 2);
               }
               break;
            case 9:
               if (this.b()) {
                  var13 = (ba)var2;
                  var13.b(var13.a | 4);
               }
               break;
            case 10:
               if (this.b()) {
                  var13 = (ba)var2;
                  var13.b(var13.a | 8);
               }
               break;
            case 11:
               ((ba)var2).c(this.c());
               break;
            case 12:
               ((ba)var2).a(this.c());
               break;
            case 13:
               ((ba)var2).p(this.d());
               break;
            case 14:
               ((ak)var2).C((byte)this.c());
               break;
            case 15:
               ((ch)var2).q(this.d());
               break;
            case 16:
               ((ch)var2).p((byte)this.c());
               break;
            case 17:
               ((ch)var2).i(this.b());
               break;
            case 18:
               ((ch)var2).g(this.b());
               break;
            case 19:
               ((ch)var2).h(this.b());
               break;
            case 20:
               ((ch)var2).r(this.d());
               break;
            case 21:
               ((f)var2).a((short)this.c());
               break;
            case 22:
               ((cc)var2).C((byte)this.c());
               break;
            case 23:
               ((as)var2).C((byte)this.c());
               break;
            case 24:
               ((as)var2).b(this.c());
               break;
            case 25:
               ((as)var2).a(this.c());
               break;
            case 26:
               ((as)var2).a((byte)this.c());
               break;
            case 27:
               byte var4;
               switch(this.c()) {
               case 0:
                  var4 = 0;
                  break;
               case 1:
                  var4 = 0;
                  break;
               case 2:
                  var4 = 1;
                  break;
               case 3:
                  var4 = 1;
                  break;
               default:
                  throw ao.a();
               }

               ((as)var2).D(var4);
               break;
            case 28:
               ((as)var2).c(this.d());
               break;
            case 29:
               ((at)var2).b(this.d());
               break;
            case 30:
               ((at)var2).a(this.d());
               break;
            case 31:
               ((bw)var2).b(this.c());
               break;
            case 32:
               ((bw)var2).c(this.d());
               break;
            case 33:
               ((bw)var2).a(this.b());
               break;
            case 34:
               ((bw)var2).a(this.d());
               break;
            case 35:
               ((by)var2).a(this.b());
               break;
            case 36:
               ((cm)var2).q(this.d());
               break;
            case 37:
               ((cm)var2).p(this.d());
               break;
            case 38:
               ((cm)var2).c(this.d());
               break;
            case 39:
               ((cm)var2).a((Object)this.f());
               break;
            case 40:
               ((cm)var2).r(this.d());
               break;
            case 41:
               ((cm)var2).s(this.d());
               break;
            case 42:
               ((cm)var2).t(this.d());
               break;
            case 43:
               ((cm)var2).u(this.d());
               break;
            case 44:
               ((cm)var2).b(this.c());
               break;
            case 45:
               ((au)var2).a((byte)this.c());
               break;
            case 46:
               ((au)var2).a(this.b());
               break;
            default:
               throw bh.d(1263878992, String.valueOf(var3));
            }
         }

         return (c)var2;
      } catch (IOException var9) {
         throw var9;
      } catch (Throwable var10) {
         throw bh.a(1096309297, var2.getClass().getName() + ':' + var3, bh.a(1295332184, (String)null, (Throwable)var10));
      }
   }
}
