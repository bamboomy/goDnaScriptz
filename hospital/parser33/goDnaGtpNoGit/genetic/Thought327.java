package genetic;
import java.util.ArrayList;
class Thought327 extends Thought{
private static ArrayList<Thought327> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 284.9550057674007;
private double fd1 = 79.2217491705195;
private Thought fo0 = null;
private Thought fo1 = null;
Thought327 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought327 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought327 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought327 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought327 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought327 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought327 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought327 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought327 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought327 instance = new Thought327 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought327 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought327 instance = new Thought327 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought327 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought327 instance = new Thought327 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought327 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought327 instance = new Thought327 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought327 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought327 instance = new Thought327 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought327 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought327 instance = new Thought327 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought327 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought327 instance = new Thought327 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought327 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought327 instance = new Thought327 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
    double ld0 = 207.11742277977152;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 653.2852604404405;
    ld0 = ld1 - fd0;
if(fo0 != null){
      fo0.m1(fd1, ld0, ld1, fd0);
}
    fb1 = fd1 > ld0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    Output.points[0][3] += ld1;
    lb2 = fd0 > fd1;
    boolean lb3 = false;

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
    Thought lo0 = Thought115.getInstance();
    fd0 *= -1;
    Output.points[0][4] += fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    Output.points[0][5] -= fd1;
    Thought lo2 = Thought374.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
    ab2 = fd1 < fd0;
    Thought lo3 = Thought228.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);

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
    Thought lo0 = Thought382.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[0][6] += ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad3 < ad4;
    fb1 = !fb0;
        fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 714.8223750887163;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb0 = !fb1;
    lb2 = !fb0;
    double ld3 = 819.4737370884836;
    fb1 = fd0 < fd1;

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
    ab1 = ab2 || ab3;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    ab4 = fb0 && fb1;
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = lb1 && ab1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd1 *= -1;
    lb0 = ad1 < ad2;
    lb1 = !lb2;
    ab1 = ab2 || ab3;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb2, ab1, ab2, ab3);
}
        boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought266.getInstance(ad2, ad3, ad4, fd0);
    Output.points[0][7] -= fd1;
    ad1 *= -1;
    lb0 = !lb1;
    Thought lo5 = Thought348.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    Output.points[0][8] += fd1;

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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought298.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    Output.points[1][0] -= fd0;
    fb0 = fb1 || lb1;
if(ao2 != null){
      lb2 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 && lb1;
    boolean lb3 = true;
    lb2 = !lb3;

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
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb0 = ad2 > ad3;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought151.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      lb0 = ao4.m2(ad4, fd0, fd1, ad1);
}
    Thought lo3 = Thought347.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    lb1 = fd1 < ad1;
    fb0 = !fb1;
    boolean lb4 = false;
if(ao3 != null){
      lb0 = ao3.m2();
}
    lb1 = lb4 || fb0;
if(ao4 != null){
      ao4.m1(fb1, lb0, lb1, lb4);
}
    fb0 = fb1 || lb0;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    lb1 = ad2 < ad3;
    lb4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, lb0, lb1, lb4, fb0);
}
    fb1 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        Output.points[1][1] += ad4;
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
    ab1 = ab2 || ab3;
        ab4 = !fb0;
    fd0 *= -1;
    fb1 = !ab1;
    Output.points[1][2] += fd1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought90.getInstance(ao2, ao3, ao4, fo0);
    double ld3 = 614.800625928265;
    boolean lb4 = true;
    lb4 = ld3 < fd0;
    fd1 = ld3 - fd0;
        boolean lb5 = true;
    boolean lb6 = false;
if(fo1 != null){
      fd1 = fo1.m3(ld3, fd0, fd1, ld3);
}
    fd0 = fd1 - ld3;
    Thought lo7 = Thought102.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
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
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    boolean lb0 = false;
    ab4 = ad3 < ad4;
    fd0 = fd1 + ad1;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Thought lo1 = Thought103.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
    ab3 = !ab4;
    boolean lb2 = false;
    ab4 = fd0 > fd1;
    ad1 = ad2 + ad3;
    double ld3 = 265.87320899545807;
    Thought lo4 = Thought135.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb2);
    Output.points[1][3] += ad3;
    boolean lb5 = false;
    ad4 = fd0 - fd1;
    lb5 = ld3 < ad1;
    boolean lb6 = true;
        double ld7 = 860.5415557338446;
    lb6 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd1, ld3, ld7, ad1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Thought lo1 = Thought49.getInstance();
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Thought lo2 = Thought371.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
    boolean lb3 = false;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    double ld4 = 750.4571064655709;
    Thought lo5 = Thought327.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, fd0);
}
    double ld6 = 300.52188721304793;
    Thought lo7 = Thought320.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld6);
    Thought lo8 = Thought226.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, lb3);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld4, ld6, fd0, lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fd1, ld4, ld6, fd0, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
    ld4 = ld6 - fd0;
    lb3 = fd1 < ld4;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 867.3624105363189;
    Thought lo1 = Thought204.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + ld0;
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    fd0 = fd1 - ld0;
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
    Thought lo2 = Thought127.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo0.m3();
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    Output.points[1][4] += ld0;
    double ld4 = 636.018578828437;
    ab4 = ld4 < fd0;
    Output.points[1][5] -= fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
    Thought lo0 = Thought242.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought341.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    boolean lb3 = false;
    ad2 *= -1;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    Thought lo4 = Thought246.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fd1, ad1, ad2, ad3, lb3, fb0, fb1, lb2);
}
    double ld5 = 940.8860204837282;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return lb3;
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
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 940.9082105368875;
    ab1 = ad1 > ad2;
if(fo1 != null){
      ab2 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    Output.points[1][6] -= fd1;
if(fo0 != null){
      fo0.m1();
}
    lb0 = ab1 || ab2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought335.getInstance(fb0, fb1, fb0, fb1);
    fd0 *= -1;
        fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld1 = 515.1846780420046;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        double ld2 = 4.467439054353558;
        ld2 *= -1;
        boolean lb3 = true;
if(ao2 != null){
          ao2.m2(ld1, fd0, fd1, ld2);
}
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
    Thought lo0 = Thought261.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo1 != null){
          fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    fb0 = ad1 > ad2;
    fb1 = !fb0;
    fb1 = ad3 < ad4;
    fb0 = !fb1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought14.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
    fb1 = !lb1;
    boolean lb3 = false;
    double ld4 = 553.7424387365656;
    lb3 = fb0 || fb1;

Thought.STACK_COUNTER++;
return lb1;
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
    boolean lb0 = false;
    ab1 = fd0 < fd1;
    Thought lo1 = Thought201.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, lb2, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          lb2 = fo0.m2(fo1, ao1, ao2, ao3);
}
    if (lb3) {
        lb4 = ab1 || ab2;
if(ao4 != null){
          ao4.m1(fd1, fd0, fd1, fd0);
}
        double ld5 = 22.1893272219938;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld5, fd0);
}
        ab3 = ab4 && fb0;
        Thought lo6 = Thought325.getInstance();
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought224.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && ab1;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
    Output.points[1][7] += ad1;
    Thought lo1 = Thought249.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    if (ab2) {
        ab3 = ad1 < ad2;
if(ao1 != null){
          ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
        boolean lb2 = true;
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb2);
}
        ab1 = fd0 > fd1;
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    double ld1 = 70.94064561940769;
    ld1 = fd0 + fd1;
    fb0 = ld1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    double ld2 = 654.3403031380699;
    double ld3 = 202.53811706982913;
    Thought lo4 = Thought360.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, ld3, fd0);
    fb1 = lb0 || fb0;
    fb1 = fd1 > ld1;
    boolean lb5 = false;
    ld2 = ld3 + fd0;
    boolean lb6 = false;
    fd1 = ld1 - ld2;
    Thought lo7 = Thought198.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb5, lb6, fb0);
}
    Output.points[1][8] += ld3;
    Thought lo8 = Thought217.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb1, lb0, lb5, lb6);
    if (fb0) {
if(fo1 != null){
          fo1.m3(ld3, fd0, fd1, ld1, fb1, lb0, lb5, lb6);
}
        fb0 = fb1 || lb0;
        Thought lo9 = Thought124.getInstance(fo0, fo1, fo0, fo1, lb5, lb6, fb0, fb1);
        lb0 = ld2 < ld3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb5 = fd0 < fd1;
        Thought lo10 = Thought154.getInstance(ld1, ld2, ld3, fd0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    double ld0 = 75.46502879440935;
if(fo0 != null){
      ab2 = fo0.m2();
}
    fd0 = fd1 + ld0;
    boolean lb1 = true;
    Output.points[2][0] += fd0;
    ab2 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought214.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ad1;
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
    ab1 = ad2 < ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    lb0 = ad1 < ad2;
    boolean lb1 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[2][1] += ad2;
    double ld2 = 719.8718841255586;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld2 - ad1;
    boolean lb3 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][2] += fd1;
    fb0 = !fb1;
        fb0 = fd0 > fd1;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fd0 = fd1 + fd0;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
        } else {
if(ao2 != null){
          ao2.m3(fd0, fd1, fd0, fd1);
}
        fb1 = fb0 && fb1;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        Output.points[2][3] += fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb0 = true;
        Thought lo1 = Thought49.getInstance(lb0, fb0, fb1, lb0);
        fd0 *= -1;
        Thought lo2 = Thought61.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
        fb1 = fd1 > fd0;
        Thought lo3 = Thought117.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = lb0 || fb0;
}
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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2);
}
    double ld0 = 695.7366774864029;
    fb0 = fb1 && fb0;
    ad2 = ad3 - ad4;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    fb0 = !fb1;
if(ao2 != null){
      ad2 = ao2.m3();
}
        Thought lo1 = Thought268.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought316.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
    Thought lo4 = Thought227.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
    Thought lo5 = Thought395.getInstance(ao1, ao2, ao3, ao4, fb1, lb2, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo6 = Thought128.getInstance(ad4, fd0, fd1, ld0);
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, lb2, fb0);
}
    boolean lb7 = true;
    fd1 *= -1;
    boolean lb8 = false;
    ld0 *= -1;

Thought.STACK_COUNTER++;
return ad1;
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
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    double ld1 = 608.972132877058;
    Thought lo2 = Thought349.getInstance(fd0, fd1, ld1, fd0);
    fb0 = fd1 < ld1;
    fd0 = fd1 + ld1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    double ld0 = 146.85245487687254;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = !ab2;
    double ld2 = 32.70537692887895;
    ab3 = ab4 && fb0;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb1, ab1, ab2);
}
    ld0 = ld2 + ad1;
    Thought lo3 = Thought294.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought42.getInstance(fd1, ld0, ld2, ad1, lb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        ab4 = fd0 > fd1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
        ab2 = !ab3;
        Thought lo5 = Thought365.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
          ao1 = ao2.m4(ld0, ld2, ad1, ad2);
}
        ab4 = ad3 > ad4;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld2);
}
        ad1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        for(int i1=0; i1<10; i1++){
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 > fd0;
        }
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    double ld0 = 361.16747122836455;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb2 = true;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    Output.points[2][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
        ab1 = !ab2;
    boolean lb0 = false;
    ab2 = fd0 > fd1;
    ab3 = !ab4;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought399.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    double ld1 = 348.4373808111292;
if(fo1 != null){
          ld1 = fo1.m3();
}
    lb0 = ad1 < ad2;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
    lb2 = fb0 && fb1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    double ld1 = 737.6306481961715;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ad4 *= -1;
    ab3 = !ab4;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
    lb0 = lb2 || ab1;
    Output.points[2][5] -= fd0;
    fd1 = ld1 + ad1;
    ab2 = ad2 < ad3;
    ab3 = ad4 < fd0;
    Thought lo3 = Thought296.getInstance(fd1, ld1, ad1, ad2);
    ab4 = !fb0;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought294.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    double ld1 = 187.53753894979164;
    fb0 = fd0 > fd1;
    fb1 = ld1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    ld1 *= -1;
    fd0 = fd1 + ld1;
    Output.points[2][6] -= fd0;
    Thought lo3 = Thought238.getInstance(ao2, ao3, ao4, fo0, fb1, lb2, fb0, fb1);
    lb2 = fb0 && fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    fb0 = fb1 && lb0;
    ad4 *= -1;
    fb0 = !fb1;
    if (lb0) {
        fb0 = !fb1;
        fd0 = fd1 + ad1;
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        lb0 = !fb0;
        ad3 = ad4 + fd0;
        fb1 = fd1 < ad1;
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
              ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
            ad1 = ad2 - ad3;
            lb0 = fb0 && fb1;
            Output.points[2][7] += ad4;
if(ao1 != null){
              fo1 = ao1.m4();
}
            fd0 = fd1 + ad1;
            ad2 *= -1;
            double ld1 = 723.0711678581861;
}}
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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        fd1 = fd0 - fd1;
        double ld0 = 267.0057342441364;
        boolean lb1 = false;
        ld0 = fd0 + fd1;
        boolean lb2 = false;
        ab2 = !ab3;
        Output.points[2][8] -= ld0;
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
        boolean lb3 = true;
        Thought lo4 = Thought180.getInstance(ao3, ao4, fo0, fo1, lb2, lb3, ab1, ab2);
if(ao1 != null){
          ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
        ld0 *= -1;
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 - ld0;
            }
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
        ab4 = fd0 > fd1;
        fb0 = !fb1;
        Thought lo5 = Thought44.getInstance();
        lb1 = lb2 || lb3;
        Output.points[3][0] -= ld0;
        ab1 = ab2 && ab3;
        fd0 *= -1;
        fd1 *= -1;
if(fo1 != null){
          ab4 = fo1.m2(fb0, fb1, lb1, lb2);
}
}
Thought.STACK_COUNTER++;
return ao1;
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
    boolean lb0 = false;
    double ld1 = 363.81197540982834;
    ld1 = ad1 + ad2;
    lb0 = ad3 < ad4;
    fd0 = fd1 - ld1;
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
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
    double ld0 = 380.5839613687616;
    Output.points[3][1] += fd0;
    fb1 = !fb0;
    fd1 = ld0 + fd0;
    boolean lb1 = true;
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[3][2] += fd1;
    fd0 *= -1;
        Thought lo0 = Thought176.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    double ld1 = 32.21965797940737;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    double ld2 = 783.1135739982864;
    fb1 = fb0 || fb1;

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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought169.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[3][3] += fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
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
