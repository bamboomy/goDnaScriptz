package genetic;
import java.util.ArrayList;
class Thought52 extends Thought{
private static ArrayList<Thought52> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 159.81306676430447;
private double fd1 = 251.27986453541385;
private Thought fo0 = null;
private Thought fo1 = null;
Thought52 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought52 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought52 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought52 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought52 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 318.97963047264506;
    ld0 = fd0 - fd1;
    double ld1 = 577.1531688477697;
    ld0 = ld1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld0 *= -1;
    Output.points[3][5] += ld1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought316.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    double ld0 = 483.3476657943262;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    ad1 *= -1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb1;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    Thought lo1 = Thought255.getInstance(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo2 = Thought213.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    lb0 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
    ab4 = fd1 < ad1;
    ad2 *= -1;
    double ld3 = 529.6859546215811;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2();
}
        fb0 = ad2 > ad3;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld0 = 67.03179633420986;
if(ao4 != null){
          ld0 = ao4.m3(fd0, fd1, ld0, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought0.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ld0 > fd0;
    fb1 = fd1 > ld0;
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    lb2 = !fb0;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought98.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, lb4, fb0, fb1, lb2);
    double ld6 = 164.97706596309928;
    Thought lo7 = Thought353.getInstance(fd0, fd1, ld0, ld6, lb3, lb4, fb0, fb1);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought155.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    ad1 = ad2 + ad3;
    Thought lo1 = Thought137.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    boolean lb3 = false;
    boolean lb4 = true;
    lb2 = lb3 || lb4;
    fd1 = ad1 + ad2;
    boolean lb5 = false;
    ad3 = ad4 + fd0;
    boolean lb6 = false;
    if (lb5) {
        double ld7 = 348.4485426894837;
        } else {
if(fo0 != null){
                  ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
        lb6 = fb0 || fb1;
if(ao4 != null){
          ao4.m1();
}
        Thought lo8 = Thought361.getInstance(lb2, lb3, lb4, lb5);
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, lb6, fb0, fb1, lb2);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][6] += fd1;
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought118.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      fd0 = ao4.m3(ab1, ab2, ab3, ab4);
}
    double ld1 = 771.3068287048724;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[3][7] += ad1;
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought328.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 *= -1;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    double ld1 = 915.2647432565869;
        boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb2 = !ab1;
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld1);
}
    ad1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Output.points[3][8] -= ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2();
}
        fd1 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    double ld0 = 927.6994633489948;
    boolean lb1 = true;
if(fo0 != null){
          fo0.m3(fb0, fb1, lb1, fb0);
}
    double ld2 = 802.3193020304118;
    fb1 = ld0 < ld2;
    lb1 = !fb0;
    fb1 = lb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    Thought lo3 = Thought181.getInstance(fd0, fd1, ld0, ld2, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(ld0, ld2, fd0, fd1);
}
    ld0 = ld2 - fd0;
    fd1 = ld0 + ld2;
    double ld4 = 652.3270993098213;
    fb1 = lb1 || fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab2 = fd1 > fd0;
    Thought lo1 = Thought375.getInstance(ab3, ab4, fb0, fb1);
    double ld2 = 789.4525655468027;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb3 = false;
    Thought lo4 = Thought241.getInstance(ld2, fd0, fd1, ld2, lb0, lb3, ab1, ab2);
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb3, ab1);
}

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    double ld1 = 145.95407834003674;
    lb0 = ad3 > ad4;
    double ld2 = 375.18532668717756;
if(fo0 != null){
      fo0.m1();
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab1 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought23.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    ab2 = !ab3;
    fd1 = ad1 + ad2;
    ab4 = !fb0;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        Thought lo3 = Thought348.getInstance(ad2, ad3, ad4, fd0);
        fd1 *= -1;
        lb0 = !lb2;
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 927.2714338899525;
    ld0 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ao3.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo1 = Thought170.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 > ld0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fd0 > fd1;
    fb1 = lb0 || lb1;
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought25.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
    fd0 = fd1 - ad1;
    double ld3 = 652.4391861231452;
    fb0 = !fb1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought152.getInstance(fd0, fd1, fd0, fd1);
    ab2 = ab3 || ab4;
    double ld1 = 223.5790907417584;
    boolean lb2 = false;
    ld1 = fd0 - fd1;
    double ld3 = 45.76795918251644;
    ab4 = fb0 && fb1;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ld3, fd0, fd1);
}
    ab1 = ab2 && ab3;
    ld1 *= -1;
    ld3 = fd0 - fd1;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought74.getInstance();
if(ao1 != null){
      fd1 = ao1.m3(lb0, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
        ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought280.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m3();
}
        double ld2 = 533.2350640100311;
        Thought lo3 = Thought341.getInstance(fb0, fb1, lb1, fb0);
        Thought lo4 = Thought162.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
        lb1 = fd1 > ld2;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
}
        }
    Thought lo5 = Thought282.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb6 = true;
    lb6 = fd0 > fd1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought339.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Output.points[4][0] += fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought174.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb2 = ab1 && ab2;
    double ld3 = 467.5484282036245;
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 747.3547722093208;
    Thought lo1 = Thought22.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = ld0 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
    fb1 = !fb0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 219.07657699666933;
    Output.points[4][1] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld1 = 158.84233200564415;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought204.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
    ad3 *= -1;
    ad4 *= -1;
    double ld3 = 993.0902037792126;
    ad4 *= -1;
    double ld4 = 492.49672842274816;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought132.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld3, ld4, ad1);
}
    boolean lb6 = false;
    Output.points[4][2] -= ad2;
    boolean lb7 = true;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb8 = false;
    ld0 *= -1;
    double ld9 = 509.8360797972118;
    double ld10 = 511.7733849509619;
if(fo1 != null){
      ab4 = fo1.m2();
}

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought395.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought271.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fb1 = !lb2;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb2, lb3);
}
    if (fb0) {
        fb1 = !lb2;
        double ld4 = 335.3491999105415;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Thought lo5 = Thought196.getInstance(ld4, fd0, fd1, ld4);
        lb3 = fd0 > fd1;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld4);
}
        boolean lb6 = true;
if(fo0 != null){
          ao4 = fo0.m4();
}
        lb3 = !fb0;
        fd0 *= -1;
if(fo1 != null){
          fo1.m2(fb1, lb6, lb2, lb3);
}
        fd1 = ld4 + fd0;
        Thought lo7 = Thought276.getInstance(ao1, ao2, ao3, ao4, fd1, ld4, fd0, fd1, fb0, fb1, lb6, lb2);
        lb3 = ld4 < fd0;
        Thought lo8 = Thought281.getInstance(fd1, ld4, fd0, fd1, fb0, fb1, lb6, lb2);
        } else {
        Thought lo9 = Thought348.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb2, lb3);
        for(int i0=0; i0<10; i0++){
}}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    Output.points[4][3] -= fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 = ad2 - ad3;
    lb0 = !fb0;
    double ld1 = 677.1439959969725;
if(ao4 != null){
      ad3 = ao4.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
    fd1 = ld1 + ad1;
    Thought lo3 = Thought12.getInstance(ao4, fo0, fo1, ao1);
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
    ad1 = ad2 - ad3;
    double ld4 = 633.894542769327;
    lb2 = ad3 < ad4;
    double ld5 = 535.9469038444894;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][4] -= fd1;
    boolean lb0 = true;
    Output.points[4][5] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought324.getInstance();
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(lb0, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb1 = lb0 && ab1;
    ab2 = !ab3;
if(ao4 != null){
      ab4 = ao4.m2(fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought154.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    ab2 = ab3 || ab4;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd0 *= -1;
    Thought lo2 = Thought222.getInstance(ab4, fb0, fb1, lb1);
    Output.points[4][6] -= fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
}
    Output.points[4][7] += ad4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[4][8] += fd0;
    lb1 = fd1 > ad1;
    ab1 = ad2 < ad3;
    Thought lo3 = Thought117.getInstance(fo1, ao1, ao2, ao3);
    ad4 = fd0 + fd1;
    Thought lo4 = Thought250.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    ab2 = ab3 || ab4;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][0] += fd0;
    Output.points[5][1] -= fd1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld0 = 212.40220088469155;
    fd0 = fd1 + ld0;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
    Thought lo1 = Thought165.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = fb0 && fb1;
    boolean lb3 = false;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = !ab3;
    fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
        double ld0 = 751.2931423199029;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    Output.points[5][2] -= fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    ab3 = ab4 || fb0;
    Thought lo1 = Thought325.getInstance(fb1, ab1, ab2, ab3);
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[5][3] -= fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    double ld0 = 471.1302033313037;
    fb0 = ad3 > ad4;
    Thought lo1 = Thought341.getInstance(fo0, fo1, fo0, fo1);
    double ld2 = 562.2524552156221;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    Output.points[5][4] += ad4;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought204.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1, fb1, fb0, fb1, fb0);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !ab1;
    double ld2 = 799.8273751434556;
    ab2 = ad4 < fd0;
    ab3 = fd1 > ld2;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb0 = ad2 < ad3;
    double ld3 = 85.31616128608711;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = !lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought141.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2();
}
    fb0 = fb1 || lb0;
    Output.points[5][5] -= fd1;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    Thought lo1 = Thought179.getInstance(fb0, fb1, lb0, fb0);
    boolean lb2 = false;
    fb0 = ad1 < ad2;
    boolean lb3 = true;
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, lb2, lb3);
}
if(ao1 != null){
          ao1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
}
    lb3 = ad1 > ad2;
    fb0 = ad3 > ad4;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb0, lb2, lb3, fb0);
}
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    lb0 = !lb2;
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought70.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    Output.points[5][6] -= fd1;
    Output.points[5][7] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    Thought lo1 = Thought119.getInstance();
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb2, ab1, ab2);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought270.getInstance();
    boolean lb3 = true;
    Output.points[5][8] += fd1;
        lb1 = fd0 > fd1;
    Thought lo4 = Thought30.getInstance(lb3, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    lb0 = lb1 && lb3;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought37.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3();
}
    Thought lo1 = Thought248.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 876.6034837089986;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fb1, lb0, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
