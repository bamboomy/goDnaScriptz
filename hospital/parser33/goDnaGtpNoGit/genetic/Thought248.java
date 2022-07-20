package genetic;
import java.util.ArrayList;
class Thought248 extends Thought{
private static ArrayList<Thought248> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 377.19215283761844;
private double fd1 = 814.7061896011409;
private Thought fo0 = null;
private Thought fo1 = null;
Thought248 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought248 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought248 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought248 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought248 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought248 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought248 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought248 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought248 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought248 instance = new Thought248 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought248 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought248 instance = new Thought248 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought248 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought248 instance = new Thought248 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought248 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought248 instance = new Thought248 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought248 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought248 instance = new Thought248 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought248 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought248 instance = new Thought248 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought248 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought248 instance = new Thought248 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought248 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought248 instance = new Thought248 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought202.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    Output.points[6][1] += fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2();
}
    fb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
    Thought lo1 = Thought179.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    Output.points[6][2] += fd0;
    Thought lo2 = Thought367.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld3 = 845.5999972302111;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    ab2 = !ab3;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought183.getInstance();
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought335.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);

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
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = false;
        ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
        if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
        fb1 = !lb0;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        double ld1 = 642.9722071935136;
        Thought lo2 = Thought296.getInstance();
if(fo1 != null){
          ad1 = fo1.m3(lb0, fb0, fb1, lb0);
}
        ad2 = ad3 - ad4;
        fd0 = fd1 + ld1;
        fb0 = !fb1;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
        fd0 *= -1;
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
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought261.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    fd1 = ad1 + ad2;
    if (ab4) {
        Output.points[6][3] += ad3;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        } else if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 - ad4;
        ab1 = fd0 > fd1;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
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
    double ld0 = 866.0613268415862;
    Output.points[6][4] += fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    fb0 = ld0 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 975.400009547762;
    Output.points[6][5] -= ld1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought211.getInstance(fo0, fo1, ao1, ao2);
    fd1 = ld0 - ld1;
    fb1 = !fb0;
    fd0 = fd1 - ld0;
    double ld3 = 325.59448936730445;
    ld1 = ld3 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ld0, ld1, ld3, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, ld1, ld3, fd0);
}
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fd1 < ld0;
    ld1 = ld3 - fd0;
    fb0 = fd1 > ld0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
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
    fb1 = fb0 && fb1;
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    double ld1 = 435.33165544712523;
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Thought lo2 = Thought304.getInstance(ld1, ad1, ad2, ad3);
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        Output.points[6][6] -= ad2;
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
    ab2 = fd1 < fd0;
    Thought lo0 = Thought325.getInstance(ab3, ab4, fb0, fb1);
    Thought lo1 = Thought256.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Output.points[6][7] -= fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
          fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    double ld2 = 542.2879196063642;
        Output.points[6][8] += fd0;
    ab2 = fd1 < ld2;
    ab3 = fd0 > fd1;
    ld2 *= -1;
    ab4 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
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
    Output.points[7][0] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    double ld0 = 457.3265836023413;
if(ao2 != null){
      ao2.m2();
}
    Output.points[7][1] += ld0;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought237.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[7][2] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
    ld0 *= -1;
    ab1 = !ab2;

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
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
        boolean lb2 = true;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb3 = false;
        Output.points[7][3] -= fd0;
if(fo0 != null){
          lb3 = fo0.m2(lb0, fb0, fb1, lb1);
}
        lb2 = lb3 && lb0;
        }
    boolean lb4 = true;
    if (lb4) {
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = ab1 && ab2;
    Thought lo0 = Thought86.getInstance(ab3, ab4, fb0, fb1);
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;

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
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[7][4] += fd0;
    fd1 *= -1;
    Thought lo0 = Thought270.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fb1 = fd1 > ad1;
    ad2 *= -1;
    Thought lo1 = Thought138.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought273.getInstance();
    ab1 = ad1 < ad2;
    ab2 = ad3 < ad4;
    Thought lo1 = Thought82.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
        Thought lo1 = Thought15.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
    fb0 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = !lb0;
    lb2 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Thought lo3 = Thought251.getInstance(fb1, lb0, lb2, fb0);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        lb0 = fd1 > fd0;
        }
    lb2 = fb0 || fb1;
    Output.points[7][5] -= fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    if (fb0) {
        fb1 = ad1 < ad2;
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
            ad1 *= -1;
            }
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        fb0 = fb1 && fb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[7][6] -= fd0;
    ab4 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought164.getInstance();
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
        boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
        ab4 = ad4 > fd0;
        fd1 *= -1;
        if (fb0) {
            double ld2 = 534.1080297866866;
            boolean lb3 = false;
            double ld4 = 163.1236151542127;
if(ao2 != null){
              ao2.m2(ld2, ld4, ad1, ad2, fb0, fb1, lb3, lb1);
}
if(ao3 != null){
              ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
            ad3 = ad4 - fd0;
            for(int i1=0; i1<10; i1++){
                fb1 = lb3 || lb1;
if(ao2 != null){
                  ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
                ab2 = ab3 && ab4;
if(ao2 != null){
                  ao1 = ao2.m4(fd1, ld2, ld4, ad1);
}
                fb0 = ad2 > ad3;
                boolean lb5 = false;
                ad4 = fd0 + fd1;
                double ld6 = 627.8037177602678;
}}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 || fb0;
    double ld1 = 993.9507784525152;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought274.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
    boolean lb3 = true;
    boolean lb4 = true;
    lb0 = fd0 > fd1;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    double ld5 = 51.36924790229075;
    boolean lb6 = true;
    lb4 = lb6 && fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld5, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
        Thought lo7 = Thought252.getInstance(lb3, lb4, lb6, fb0);
    ld1 = ld5 + fd0;
    fb1 = lb0 || lb3;

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
    if (ab2) {
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        } else {
        fb1 = fd0 < fd1;
        boolean lb0 = false;
if(fo1 != null){
                  fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
        for(int i0=0; i0<10; i0++){
            fd1 = fd0 - fd1;
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
            ab4 = fb0 || fb1;
if(fo0 != null){
              fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
            double ld1 = 408.3117873395739;
            lb0 = ab1 && ab2;
if(fo1 != null){
              fo1.m2();
}
            Thought lo2 = Thought119.getInstance(ab3, ab4, fb0, fb1);
            lb0 = !ab1;
            fd0 = fd1 + ld1;
            if (ab2) {
                Thought lo3 = Thought176.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}}}
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
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought73.getInstance(fd0, fd1, ad1, ad2);
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
    double ld2 = 874.86379797273;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        if (fb0) {
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
              fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
            fd1 *= -1;
if(ao1 != null){
              fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
            fb1 = fb0 && fb1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
              ao2.m2();
}
if(ao3 != null){
              fd1 = ao3.m3(fb0, fb1, fb0, fb1);
}
            fb0 = fb1 && fb0;
            if (fb1) {
                fb0 = fb1 && fb0;
if(ao4 != null){
                  fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
                fb1 = !fb0;
}}}
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    boolean lb1 = false;
    boolean lb2 = true;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    Thought lo3 = Thought47.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb0);
}
    Thought lo4 = Thought238.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
    lb0 = !lb1;
if(ao3 != null){
      lb2 = ao3.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    ad3 *= -1;
    ad4 *= -1;
    boolean lb5 = false;
    Thought lo6 = Thought172.getInstance(ao4, fo0, fo1, ao1, lb2, lb5, fb0, fb1);
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao1 != null){
      ab4 = ao1.m2();
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 *= -1;
    Output.points[7][7] += fd0;
if(ao2 != null){
      ao2.m2(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fd1 *= -1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    lb1 = fd0 > fd1;
    boolean lb2 = true;
    Thought lo3 = Thought25.getInstance(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
    double ld4 = 441.4963843612161;

Thought.STACK_COUNTER++;
return ld4;
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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    Output.points[7][8] -= fd0;
    fb0 = fd1 < ad1;
    Thought lo1 = Thought149.getInstance(ao1, ao2, ao3, ao4);
    double ld2 = 548.9683762501066;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    lb0 = fd0 < fd1;
    ld2 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 && ab3;
    ab4 = ad4 > fd0;
    if (fb0) {
        fb1 = lb0 && ab1;
if(ao1 != null){
          fd1 = ao1.m3(ab2, ab3, ab4, fb0);
}
        Output.points[8][0] += ld2;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        fb1 = !fb0;
        fb1 = fb0 || fb1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
          fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        Thought lo1 = Thought87.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
        fb0 = fb1 && lb0;
        fb0 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 + fd1;
        double ld2 = 445.7697367530069;
        ld2 = fd0 - fd1;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    double ld0 = 563.0079913747246;
    double ld1 = 346.7393282122173;
    boolean lb2 = false;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
    ld0 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo3 = Thought339.getInstance(fb1, lb2, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(ld1, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
    ld1 = fd0 - fd1;
    double ld4 = 512.7758501165054;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
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
    fb1 = fb0 && fb1;
    double ld0 = 102.80918103669302;
    double ld1 = 28.59588426937796;
    double ld2 = 698.2055864770656;
    ld1 = ld2 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    fb0 = fb1 && lb3;
    boolean lb4 = false;
    boolean lb5 = true;
    lb4 = lb5 || fb0;
    Output.points[8][1] += ld2;
    for(int i0=0; i0<10; i0++){
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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought251.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo1 != null){
      ad3 = fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
    Output.points[8][2] += ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || ab1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 783.4359186524907;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo1 = Thought34.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fb1 = fb0 && fb1;
    Output.points[8][3] += fd1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought21.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb2);
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, lb2, fb0, fb1);
}
    double ld4 = 800.7564151883241;
    lb2 = !fb0;
    ld0 = ld4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = ld0 < ld4;
    boolean lb5 = true;
    lb2 = lb5 || fb0;
    boolean lb6 = true;
    double ld7 = 930.6046822208845;
if(fo0 != null){
      ao4 = fo0.m4(ld7, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld4, ld7, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought235.getInstance();
    double ld2 = 423.4680828026852;
    double ld3 = 683.8901494126725;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    Thought lo4 = Thought8.getInstance(ao3, ao4, fo0, fo1, ld2, ld3, ad1, ad2, fb1, lb0, fb0, fb1);
    Thought lo5 = Thought296.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
        ld2 = ld3 + ad1;
    ad2 = ad3 - ad4;
        fb0 = fb1 || lb0;
    Thought lo6 = Thought322.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb7 = true;
    Output.points[8][4] += fd0;
    fd1 = ld2 + ld3;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
        fb0 = fd0 > fd1;
    Thought lo8 = Thought261.getInstance(fo1, ao1, ao2, ao3, ld2, ld3, ad1, ad2);
    ad3 *= -1;
    fb1 = ad4 < fd0;
    double ld9 = 542.1993542406391;
    fd0 = fd1 + ld2;

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
if(ao1 != null){
      ao1.m1();
}
    ab1 = ab2 && ab3;
    fd1 *= -1;
    ab4 = !fb0;
    fb1 = !ab1;
    ab2 = fd0 > fd1;
    Thought lo0 = Thought41.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = !ab1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought125.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    fd0 = fd1 - fd0;
    Thought lo2 = Thought103.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb3 = false;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo4 = Thought165.getInstance(ab3, ab4, fb0, fb1);

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
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    Output.points[8][5] += ad4;
    fd0 = fd1 + ad1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[8][6] -= fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought261.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
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
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Thought lo1 = Thought383.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    lb0 = !fb0;
    double ld2 = 805.8599770559297;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 < fd1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 913.0072583566036;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
        fb1 = !fb0;
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought59.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
    ld0 = fd0 + fd1;

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
    Thought lo0 = Thought29.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[8][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[8][8] += fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
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
