package genetic;
import java.util.ArrayList;
class Thought259 extends Thought{
private static ArrayList<Thought259> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 799.5242819986651;
private double fd1 = 917.9636783959475;
private Thought fo0 = null;
private Thought fo1 = null;
Thought259 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought259 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought259 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought259 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought259 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought259 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought259 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought259 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought259 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought259 instance = new Thought259 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought259 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought259 instance = new Thought259 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought259 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought259 instance = new Thought259 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought259 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought259 instance = new Thought259 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought259 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought259 instance = new Thought259 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought259 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought259 instance = new Thought259 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought259 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought259 instance = new Thought259 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought259 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought259 instance = new Thought259 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld0 = 991.5539841453285;
    fb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
    fb0 = fb1 && fb0;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb1 = fd1 < ld0;
if(fo0 != null){
      fo0.m2();
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
    double ld2 = 737.5148496083997;
    lb1 = !fb0;
    fb1 = lb1 || fb0;
    double ld3 = 927.8054153023585;
    Thought lo4 = Thought247.getInstance(ld0, ld2, ld3, fd0, fb1, lb1, fb0, fb1);
        boolean lb5 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb5, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 *= -1;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought1.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought249.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    ab4 = fb0 && fb1;

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
    fb0 = ad2 > ad3;
    fb1 = fb0 || fb1;
    fb0 = ad4 < fd0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 936.6938473846963;
    fb1 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0);
}
    fb1 = ad1 < ad2;
    double ld1 = 338.6498037050915;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ld0 < ld1;
    Thought lo2 = Thought366.getInstance();
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = ad2 > ad3;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab4 = ad1 > ad2;
    Thought lo0 = Thought360.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    Thought lo1 = Thought137.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    ad2 *= -1;
    Output.points[8][1] -= ad3;
    fb0 = fb1 && ab1;
    Thought lo2 = Thought32.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    Thought lo3 = Thought248.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    Thought lo4 = Thought293.getInstance();
    ab2 = !ab3;
    Thought lo5 = Thought10.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    Thought lo6 = Thought67.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    fd1 *= -1;

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
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    Thought lo0 = Thought66.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[8][2] -= fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    double ld1 = 841.0685433164159;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fd1 = ld1 + fd0;
    fb1 = fb0 && fb1;
    boolean lb2 = true;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    double ld1 = 232.0804430094395;
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld2 = 168.00817560623494;
    double ld3 = 936.6499391607912;
    fb0 = ad2 > ad3;
    boolean lb4 = false;
    boolean lb5 = false;
    Thought lo6 = Thought235.getInstance(lb5, fb0, fb1, lb0);
    ad4 = fd0 + fd1;
    ld1 = ld2 - ld3;
    Output.points[8][3] += ad1;
    lb4 = lb5 && fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb0, lb4, lb5);
}
if(ao4 != null){
      fd1 = ao4.m3(ld1, ld2, ld3, ad1, fb0, fb1, lb0, lb4);
}
    lb5 = ad2 > ad3;
    ad4 = fd0 + fd1;
    boolean lb7 = true;
    lb7 = fb0 && fb1;
    lb0 = ld1 < ld2;

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
    Output.points[8][4] -= fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    if (ab3) {
        ab4 = fd1 < fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb0 = true;
        ab4 = fd1 > fd0;
        boolean lb1 = false;
        boolean lb2 = false;
        ab3 = !ab4;
        double ld3 = 984.43489935595;
        fb0 = fd0 < fd1;
        ld3 *= -1;
        fb1 = lb0 && lb1;
        boolean lb4 = false;
        lb2 = lb4 || ab1;
        ab2 = !ab3;
        ab4 = !fb0;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld3, fd0);
}
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb1 = lb0 || lb1;
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
    ab1 = ab2 || ab3;
    Output.points[8][5] -= ad2;
    boolean lb0 = false;
    Thought lo1 = Thought22.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Output.points[8][6] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    if (ab1) {
        fd1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
        fb1 = lb0 && ab1;
        double ld2 = 334.7946976494663;
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
    Thought lo0 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
    double ld1 = 96.3933502639733;
    double ld2 = 499.30531159910157;
    boolean lb3 = false;
    ld1 *= -1;
if(fo1 != null){
          lb3 = fo1.m2(fb0, fb1, lb3, fb0);
}
    Output.points[8][7] += ld2;
    boolean lb4 = true;
    fb0 = fb1 || lb3;
    boolean lb5 = false;
    boolean lb6 = true;
    fd0 = fd1 + ld1;
    Thought lo7 = Thought360.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1, lb4, lb5, lb6, fb0);
    fb1 = lb3 && lb4;
    lb5 = ld2 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, fd0, lb6, fb0, fb1, lb3);
}
    lb4 = lb5 || lb6;
    fb0 = !fb1;
    boolean lb8 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb3, lb4, lb5, lb6);
}
    lb8 = fb0 || fb1;
    lb3 = fd1 > ld1;
    ld2 = fd0 - fd1;
    lb4 = ld1 < ld2;

Thought.STACK_COUNTER++;
return lb5;
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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        ab2 = !ab3;
        ab4 = fb0 && fb1;
        ab1 = fd1 > fd0;
        ab2 = fd1 < fd0;
        fd1 = fd0 + fd1;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Output.points[8][8] -= fd0;
        boolean lb0 = true;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        lb1 = !ab1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = !lb0;
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
    boolean lb0 = true;
    lb0 = !fb0;
    boolean lb1 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad2 < ad3;
    boolean lb2 = false;
    ad4 = fd0 - fd1;
    Output.points[0][0] += ad1;
    Output.points[0][1] += ad2;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          lb3 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2, lb0, lb1, lb2, lb3);
}
        ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        if (lb2) {
if(fo1 != null){
              fo1.m3(fd0, fd1, ad1, ad2);
}
            ad3 *= -1;
            ad4 = fd0 - fd1;
if(fo0 != null){
              lb3 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
            fd0 = fd1 - ad1;
            } else {
if(fo1 != null){
              fo1.m2();
}
}}
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
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Thought lo1 = Thought55.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
    boolean lb2 = true;
    ab4 = fb0 && fb1;
    Thought lo3 = Thought18.getInstance(ad1, ad2, ad3, ad4, lb0, lb2, ab1, ab2);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 + ad2;
    lb0 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    lb2 = ab1 && ab2;
    ab3 = ab4 && fb0;
    Thought lo4 = Thought77.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ad2 *= -1;
    ad3 = ad4 + fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || lb2;
        boolean lb5 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[0][2] += fd1;
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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;

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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb0 = true;
    Thought lo1 = Thought255.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 + ad4;
    Output.points[0][3] += fd0;
    fd1 = ad1 + ad2;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    fb1 = lb0 || fb0;
    fb1 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4();
}
    lb0 = ad3 > ad4;
    Thought lo2 = Thought267.getInstance(fb0, fb1, lb0, fb0);
    fb1 = !lb0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 < fd0;
if(ao4 != null){
      ao4.m1(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought379.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
    double ld4 = 252.67325883552633;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb5 = false;
    Thought lo6 = Thought271.getInstance(ad3, ad4, fd0, fd1);
    double ld7 = 295.5014254127147;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        ab3 = fd0 < fd1;
        fd0 = fd1 + fd0;
        Thought lo2 = Thought60.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        double ld3 = 3.8109194320283586;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab4 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(lb1, lb0, ab1, ab2);
}
        fd0 = fd1 + ld3;
        boolean lb4 = true;
        Output.points[0][4] += fd0;
        double ld5 = 235.56863483857583;
        fd0 *= -1;
        Output.points[0][5] -= fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, ld5, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 && lb4;
        lb0 = ld3 > ld5;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m2(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    Thought lo1 = Thought381.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
    ab1 = ab2 || ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    Thought lo2 = Thought310.getInstance(ad3, ad4, fd0, fd1);
    double ld3 = 514.6511524697154;
    Thought lo4 = Thought90.getInstance(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3);
    boolean lb5 = true;
if(ao4 != null){
      ad4 = ao4.m3();
}
    fd0 *= -1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(fb1, lb0, lb5, ab1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld3, ad1, ad2, ab3, ab4, fb0, fb1);
}
        double ld6 = 672.3119080383044;
        boolean lb7 = false;
        ad2 = ad3 - ad4;
        boolean lb8 = true;
        lb7 = lb8 || lb0;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
            fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 658.5420025649883;
    boolean lb1 = true;
    fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought35.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
    boolean lb3 = true;
    double ld4 = 807.5276192589846;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld4, fd0, fd1, lb1, lb3, fb0, fb1);
}
    Thought lo5 = Thought372.getInstance(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
    double ld6 = 335.3272330039514;
    boolean lb7 = true;
    Output.points[0][6] -= ld0;
    ld4 *= -1;
    Thought lo8 = Thought336.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return ld6;
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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld0 = 783.4845447201549;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ab2 && ab3;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
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
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][7] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fd1 *= -1;
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[0][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
        lb0 = ad2 < ad3;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 220.6152297221271;
    Thought lo1 = Thought138.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + ld0;
    Thought lo2 = Thought32.getInstance(fd0, fd1, ld0, fd0);
    fd1 = ld0 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = !fb1;
    double ld3 = 627.4199115572284;
    boolean lb4 = true;
    fd0 = fd1 - ld0;
if(ao1 != null){
      fo1 = ao1.m4(lb4, fb0, fb1, lb4);
}
    if (fb0) {
        fb1 = !lb4;
        fb0 = fb1 && lb4;
        fb0 = ld3 < fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb0 = lb1 || lb2;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb1, lb2, fb0);
}
    Thought lo3 = Thought0.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
    Thought lo4 = Thought31.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
    lb2 = !fb0;

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
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    double ld1 = 421.0198951561645;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
    ld1 = fd0 - fd1;
    ld1 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    double ld2 = 20.346831878113687;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought163.getInstance(ld1, ld2, fd0, fd1);
    ab1 = ld1 < ld2;
    fd0 = fd1 + ld1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao1 != null){
      ab1 = ao1.m2();
}
    ad2 *= -1;
    ab2 = ab3 && ab4;
    double ld0 = 764.7140238683243;
    double ld1 = 886.418584453126;
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought13.getInstance(fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ad4 *= -1;
    fd0 *= -1;
    Output.points[1][0] -= fd1;
    ld0 *= -1;
    boolean lb3 = true;
    ab3 = ab4 && fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    lb3 = ab1 && ab2;
if(ao2 != null){
      ao2.m3(ld1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    double ld4 = 539.5019172291436;
    Thought lo5 = Thought47.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, ld4, ad1);
    Output.points[1][1] += ad2;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}

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
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
}
    boolean lb4 = true;
    boolean lb5 = true;
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb0);
}
    Output.points[1][2] -= fd0;
    Output.points[1][3] -= fd1;
    Thought lo6 = Thought226.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo7 = Thought29.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    boolean lb8 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = lb2 && lb3;
    lb4 = lb5 && lb8;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought122.getInstance(ab2, ab3, ab4, fb0);
        boolean lb1 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        double ld3 = 816.0786373369389;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab4 = !fb0;
        fd0 *= -1;
        fb1 = lb1 || lb2;
        fd1 = ld3 - fd0;
        ab1 = !ab2;
        ab3 = !ab4;
        fd1 = ld3 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld3, fd0, fd1);
}
        ld3 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
        boolean lb4 = false;
        ld3 = fd0 + fd1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought8.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 190.3664705783223;
    fb0 = ad3 < ad4;
    fd0 = fd1 + ld1;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, ad1, ad2, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought156.getInstance(ad3, ad4, fd0, fd1);
    boolean lb4 = true;
    lb2 = lb4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = false;
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, lb2, lb4);
}
    lb5 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb4);
}
if(fo1 != null){
      lb5 = fo1.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb2, lb4);
}
    ad2 = ad3 + ad4;
    boolean lb6 = false;
    lb5 = fd0 > fd1;
    lb6 = ld1 < ad1;
    Output.points[1][4] += ad2;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld0 = 270.0669797347218;
    fb0 = ld0 < ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = !ab1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    ad3 *= -1;
    Output.points[1][5] += ad4;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    double ld3 = 449.24361589536187;
    ad1 *= -1;
    boolean lb4 = true;
    lb4 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    ld3 = ad1 - ad2;
    boolean lb5 = false;

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
    fb1 = !fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    fd0 *= -1;
    lb1 = fb0 && fb1;
    lb0 = fd1 > fd0;
    lb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
    boolean lb2 = true;
    lb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m1();
}
    double ld3 = 100.82444424006324;
    ld3 = fd0 + fd1;
    lb2 = ld3 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld3, lb2, fb0, fb1, lb0);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld3, fd0, fd1, lb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought274.getInstance(fo0, fo1, ao1, ao2, lb0, lb1, lb2, fb0);
if(ao3 != null){
      ld3 = ao3.m3(ao4, fo0, fo1, ao1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = ad2 < ad3;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao3 != null){
      lb1 = ao3.m2(fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought43.getInstance(fd0, fd1, ad1, ad2, lb1, lb2, fb0, fb1);
        lb0 = ad3 > ad4;
        Output.points[1][6] -= fd0;
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
        fd1 *= -1;
        lb1 = ad1 < ad2;
        boolean lb4 = false;
        double ld5 = 929.4976179270876;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought66.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb1 = ab1 || ab2;
    if (ab3) {
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        Thought lo2 = Thought254.getInstance();
        fb0 = !fb1;
if(fo1 != null){
          fo1.m3(lb1, ab1, ab2, ab3);
}
        Thought lo3 = Thought274.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 14.953949092051264;
    ld1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    boolean lb3 = true;
    boolean lb4 = false;
    ad4 = fd0 + fd1;
    Thought lo5 = Thought64.getInstance(ao3, ao4, fo0, fo1);
    lb2 = ld1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ld1 + ad1;
    ad2 = ad3 - ad4;
    boolean lb6 = false;
    lb3 = lb4 && lb6;
    ab1 = !ab2;
    fd0 = fd1 + ld1;
    ab3 = !ab4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m1();
}
    Output.points[1][7] += fd0;
if(ao3 != null){
      ao3.m2(fb1, lb0, lb2, lb3);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, lb4, lb6, ab1, ab2);
}
    ad4 *= -1;
    Output.points[1][8] -= fd0;
    Output.points[2][0] -= fd1;
    for(int i0=0; i0<10; i0++){
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 *= -1;
    double ld1 = 591.678911884502;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought224.getInstance(fo1, fo0, fo1, fo0);
    Output.points[2][1] += ld1;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    lb2 = fb0 || fb1;
    boolean lb4 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    double ld5 = 54.139287710548984;
    lb0 = ld1 > ld5;
    lb2 = fd0 < fd1;
if(fo1 != null){
      ld1 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(lb4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld1, lb2, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld5, fd0, fd1, ld1, lb0, lb2, lb4, fb0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought62.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
    boolean lb1 = true;
        fd0 *= -1;
    lb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;

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
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought361.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;

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
