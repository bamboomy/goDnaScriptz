package genetic;
import java.util.ArrayList;
class Thought315 extends Thought{
private static ArrayList<Thought315> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 421.61122937443537;
private double fd1 = 632.8505611107313;
private Thought fo0 = null;
private Thought fo1 = null;
Thought315 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought315 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought315 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought315 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought315 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought315 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought315 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought315 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought315 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought315 instance = new Thought315 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought315 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought315 instance = new Thought315 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought315 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought315 instance = new Thought315 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought315 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought315 instance = new Thought315 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought315 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought315 instance = new Thought315 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought315 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought315 instance = new Thought315 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought315 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought315 instance = new Thought315 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought315 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought315 instance = new Thought315 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    Output.points[5][1] -= fd1;
    Thought lo1 = Thought99.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    double ld2 = 11.850285963876455;
    fb0 = ld2 > fd0;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
    Output.points[5][2] += fd0;
    fd1 = ld2 - fd0;
    fb1 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld3 = 915.9785621624011;
    double ld4 = 755.6243751585552;
    fb0 = ld3 > ld4;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
    ab2 = fd0 < fd1;
    Output.points[5][3] -= fd0;
    ab3 = ab4 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 > fd0;
    fb1 = lb0 || ab1;
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought37.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought53.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
        ad4 *= -1;
if(fo0 != null){
      fo0.m2();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fb1, lb0, fb0, fb1);
}
    double ld2 = 742.9713951148033;
    double ld3 = 2.72654002626174;
    Thought lo4 = Thought170.getInstance(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    ld2 *= -1;
    ld3 = ad1 + ad2;
    ad3 = ad4 + fd0;
    boolean lb5 = true;

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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought130.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[5][4] += ad1;
    Output.points[5][5] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    ab1 = !ab2;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
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
    fb1 = !fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(ao2 != null){
      lb0 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    double ld1 = 48.52038984294372;
    double ld2 = 476.512984191724;
    boolean lb3 = false;
    lb3 = !fb0;
    fb1 = !lb0;
    Thought lo4 = Thought256.getInstance(ao2, ao3, ao4, fo0);
    ld2 = fd0 + fd1;
    lb3 = ld1 < ld2;
    double ld5 = 366.7384184370679;
    fb0 = ld5 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, ld2, ld5);
}
    double ld6 = 475.222755680945;
    fb1 = ld6 < fd0;
    lb0 = fd1 < ld1;
        ld2 = ld5 + ld6;
    boolean lb7 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, ld2, ld5);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    Output.points[5][6] -= ad2;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought137.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    double ld1 = 787.0107807192624;

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
    ab1 = ab2 && ab3;
        ab4 = fd0 < fd1;
    boolean lb0 = false;
    Thought lo1 = Thought306.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    ab4 = !fb0;
    double ld2 = 540.412476425617;
    fb1 = lb0 || ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ld2 = fd0 + fd1;
    lb0 = ld2 < fd0;
    ab1 = ab2 || ab3;
    Thought lo3 = Thought161.getInstance();
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb0);
}
    ld2 *= -1;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = ad4 < fd0;
    if (ab4) {
        fb0 = fb1 && lb0;
        ab1 = ab2 || ab3;
        Output.points[5][7] += fd1;
        ad1 = ad2 - ad3;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
        fd0 = fd1 - ad1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        Thought lo1 = Thought114.getInstance(ad2, ad3, ad4, fd0);
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        fb1 = fd1 < ad1;
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
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    lb1 = fb0 || fb1;
    double ld2 = 460.57126638928236;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        fd1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb1 = lb0 || ab1;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
        fd1 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        lb0 = fd1 > fd0;
        ab1 = !ab2;
        Thought lo1 = Thought258.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
        double ld2 = 663.5958257355637;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb0, ab1, ab2);
}
        Thought lo4 = Thought2.getInstance(fo1, fo0, fo1, fo0);
}
Thought.STACK_COUNTER++;
return ab4;
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
    double ld0 = 7.397569817638594;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    Output.points[5][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    boolean lb1 = true;
    lb1 = ad3 < ad4;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !lb1;
        fb0 = !fb1;
    lb1 = fd0 < fd1;
    fb0 = fb1 && lb1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
    Thought lo3 = Thought43.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, lb1, lb2, fb0);
    if (fb1) {
        ad4 *= -1;
        lb1 = lb2 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ld0, ad1, lb1, lb2, fb0, fb1);
}
        lb1 = !lb2;
        } else {
        Thought lo4 = Thought373.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
        Thought lo5 = Thought96.getInstance(fo0, fo1, fo0, fo1);
        fb0 = ad2 > ad3;
        fb1 = lb1 || lb2;
if(fo0 != null){
          fb0 = fo0.m2(ad4, fd0, fd1, ld0);
}
        fb1 = !lb1;
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = ab1 || ab2;
    Output.points[6][0] -= fd0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    if (ab1) {
        ad3 *= -1;
        double ld0 = 13.426551568532824;
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
        if (ab3) {
if(fo0 != null){
              fo1 = fo0.m4(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
            if (ab2) {
                ab3 = ad4 > fd0;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
                fd1 = ld0 - ad1;
                double ld1 = 361.47120163833455;
if(fo1 != null){
                  ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
                  fo0.m3(ad2, ad3, ad4, fd0);
}
}}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    double ld0 = 188.5298744028391;
        fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
    Output.points[6][1] += fd0;
if(ao1 != null){
      fb1 = ao1.m2();
}
    fb0 = !fb1;
    fb0 = fd1 > ld0;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 + fd1;
    Thought lo0 = Thought189.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, lb1, lb2, fb0, fb1);
}

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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    double ld0 = 1000.7650538193014;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought337.getInstance(ld0, fd0, fd1, ld0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = true;
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, lb2, ab1);
}
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 - fd1;
        ab2 = ab3 && ab4;
        ld0 = fd0 - fd1;
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, lb2, ab1);
}
if(ao2 != null){
          ab2 = ao2.m2(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
        ld0 = fd0 + fd1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        ab4 = ld0 > fd0;
        fb0 = fd1 > ld0;
        boolean lb3 = true;
        fb0 = fb1 && lb3;
        double ld4 = 140.97465563883677;
        for(int i1=0; i1<10; i1++){
            boolean lb5 = true;
            boolean lb6 = true;
            lb6 = lb3 || lb2;
}}
Thought.STACK_COUNTER++;
return ab4;
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
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld0 = 660.3339906482516;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    boolean lb1 = false;
    Output.points[6][2] += fd1;
    fb0 = fb1 && lb1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return ab4;
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb0 = !fb1;
        Thought lo0 = Thought109.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Thought lo1 = Thought277.getInstance(fd1, fd0, fd1, fd0);
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        Thought lo3 = Thought192.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
        lb2 = fb0 || fb1;
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
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought179.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    Output.points[6][3] -= fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought43.getInstance(fd1, fd0, fd1, fd0);
    double ld2 = 301.4933408199756;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}

Thought.STACK_COUNTER++;
return ld2;
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
    Thought lo0 = Thought134.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    boolean lb2 = true;
    fd0 = fd1 - ad1;
    lb2 = ad2 < ad3;
    Output.points[6][4] += ad4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb1, lb2, fb0);
}
        boolean lb3 = false;
    boolean lb4 = false;
    lb4 = !fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 886.6078061971083;
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
    Output.points[6][5] += ad1;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    Thought lo2 = Thought35.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    Output.points[6][6] += fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd1 > ld0;
    lb1 = ab1 && ab2;
    Output.points[6][7] += ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][8] -= fd0;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    double ld1 = 809.76535996812;
        fd0 = fd1 - ld1;
    double ld2 = 302.0237400150985;
    ld2 = fd0 - fd1;
    lb0 = ld1 > ld2;
    fb0 = !fb1;
    Thought lo3 = Thought396.getInstance(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
    fb0 = fd0 < fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = ld1 > ld2;
    boolean lb4 = true;
    double ld5 = 961.1475801511816;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(ld5, fd0, fd1, ld1);
}
    ld2 = ld5 - fd0;
    fd1 = ld1 + ld2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld5, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m1();
}
    fb0 = ld2 < ld5;

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
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
    Output.points[7][0] -= fd1;
    boolean lb2 = false;
    lb0 = lb1 || lb2;
    Output.points[7][1] -= ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought216.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb1, lb2, fb0);
    if (fb1) {
if(ao1 != null){
          lb0 = ao1.m2(fd0, fd1, ad1, ad2, lb1, lb2, fb0, fb1);
}
        lb0 = ad3 < ad4;
        fd0 = fd1 + ad1;
        } else if (lb1) {
        lb2 = !fb0;
        boolean lb4 = true;
        boolean lb5 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        boolean lb0 = false;
        ab1 = fd0 > fd1;
        boolean lb1 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd0 *= -1;
        fb1 = lb0 || lb1;
        ab1 = fd1 > fd0;
if(ao2 != null){
          ao2.m2(fd1, fd0, fd1, fd0);
}
        double ld2 = 992.7866049946767;
        fd0 = fd1 - ld2;
        Output.points[7][2] -= fd0;
        fd1 = ld2 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
        lb0 = lb1 && ab1;
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
        lb0 = !lb1;
        fd0 *= -1;
        fd1 *= -1;
        ab1 = ab2 || ab3;
        ab4 = ld2 < fd0;
        fd1 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 71.35996591679579;
    ab1 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab4 = fb0 || fb1;
    ab1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ab2 = ld0 > ad1;
    ad2 *= -1;

Thought.STACK_COUNTER++;
return ad3;
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
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    double ld0 = 522.7845954742294;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Thought lo1 = Thought167.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    Output.points[7][3] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fd0 < fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        double ld2 = 641.7710280711528;
        ld2 = ld0 + fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld2, ld0, fd0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ld0, fd0);
}
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
    double ld0 = 830.4670075637445;
    boolean lb1 = true;
    fd0 *= -1;
    Thought lo2 = Thought56.getInstance(fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
    if (ab4) {
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
        ab2 = !ab3;
        boolean lb3 = true;
        fd0 *= -1;
        Thought lo4 = Thought219.getInstance(fo0, fo1, fo0, fo1);
        fd1 *= -1;
        ld0 = fd0 + fd1;
        for(int i0=0; i0<10; i0++){
}}
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
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought296.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 663.6342100175151;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld1;
    fb1 = fb0 || fb1;
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
          ad1 = fo0.m3();
}
if(fo1 != null){
          ad2 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        ad4 *= -1;
        double ld2 = 425.7353785336206;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
}
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
    double ld0 = 57.42769347284973;
    ab2 = ad1 > ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ab4 = fb0 || fb1;
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought381.getInstance();
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    ld0 = ad1 + ad2;
    Thought lo2 = Thought93.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    Thought lo3 = Thought110.getInstance(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ad4 > fd0;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought182.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb1, fb0);
}
        Output.points[7][4] -= fd1;
    fb1 = lb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Output.points[7][5] -= fd0;
    fd1 *= -1;
    boolean lb2 = true;
    boolean lb3 = true;
    lb1 = fd0 < fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld0 = 233.3436597279324;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    if (fb0) {
        fd1 *= -1;
        ld0 *= -1;
        } else if (fb1) {
        ad1 = ad2 - ad3;
        fb0 = !fb1;
        boolean lb1 = true;
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ld0, ad1);
}
        Output.points[7][6] += ad2;
        lb1 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        Thought lo2 = Thought231.getInstance();
        ld0 = ad1 + ad2;
if(ao3 != null){
          ao3.m2(lb1, fb0, fb1, lb1);
}
        ad3 *= -1;
        ad4 = fd0 - fd1;
        double ld3 = 795.3686324693399;
        ld3 *= -1;
}
Thought.STACK_COUNTER++;
return ao4;
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
    boolean lb0 = false;
    ab1 = fd1 > fd0;
        Thought lo1 = Thought158.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought253.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
    boolean lb3 = true;
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    Output.points[7][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld4 = 699.1595613579532;
    ab1 = ab2 && ab3;
    double ld5 = 242.61589307264137;
    boolean lb6 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld5, fd0, fd1, ld4);
}
    boolean lb7 = false;

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
    Output.points[7][8] += ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought269.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
        fd1 = ad1 - ad2;
        ab3 = ad3 < ad4;
        if (ab4) {
            boolean lb1 = true;
            Output.points[8][0] += fd0;
            ab4 = !fb0;
}}
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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd1 *= -1;
            fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought242.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3();
}
        Output.points[8][1] += fd0;
    lb1 = fd1 < fd0;
    Thought lo2 = Thought61.getInstance(fb0, fb1, lb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    Output.points[8][2] -= fd1;

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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought357.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      lb1 = fo0.m2();
}
        lb2 = !fb0;
if(fo1 != null){
          fo1.m2(fb1, lb1, lb2, fb0);
}
    boolean lb3 = true;

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
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld1 = 114.35394129878095;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    boolean lb2 = false;
    lb0 = lb2 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb2, fb0, fb1);
}
    lb0 = lb2 && fb0;
    double ld3 = 513.4711012897841;
    double ld4 = 831.8216516386116;
    ld1 = ld3 + ld4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 || lb2;

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
