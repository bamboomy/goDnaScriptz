package genetic;
import java.util.ArrayList;
class Thought97 extends Thought{
private static ArrayList<Thought97> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 269.25986770208425;
private double fd1 = 441.6183019326287;
private Thought fo0 = null;
private Thought fo1 = null;
Thought97 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought97 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought97 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought97 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought97 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought97 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought97 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought97 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought97 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    double ld0 = 508.7250100442849;
    double ld1 = 682.0737716283775;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld0, ld1);
}
    double ld2 = 755.9828160689702;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
    ld1 = ld2 - fd0;
    boolean lb3 = false;
    fd1 = ld0 + ld1;
    ld2 *= -1;
    Thought lo4 = Thought240.getInstance();
    fd0 = fd1 - ld0;
    lb3 = !fb0;

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
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    double ld1 = 188.45807435634856;
    Output.points[7][2] -= ld1;
    Output.points[7][3] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;

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
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    fb0 = fb1 && fb0;
    double ld0 = 310.19992856354696;
    Output.points[7][4] -= ad1;
    Thought lo1 = Thought110.getInstance();
if(fo0 != null){
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = !fb1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    ld0 = ad1 - ad2;
    fb1 = lb2 || fb0;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 - ad1;
        fb1 = lb2 && fb0;
        ad2 = ad3 + ad4;
        fd0 *= -1;
        fb1 = fd1 > ld0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          lb2 = fo1.m2(ad1, ad2, ad3, ad4);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
    ab1 = ad1 > ad2;
    boolean lb1 = true;
    Thought lo2 = Thought390.getInstance();
    if (ab1) {
        ab2 = !ab3;
        Thought lo3 = Thought305.getInstance(ab4, fb0, fb1, lb0);
        Thought lo4 = Thought22.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
        Output.points[7][5] += ad1;
        ad2 *= -1;
if(fo0 != null){
          fo0.m1(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
        ad1 = ad2 - ad3;
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
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
    fb0 = fd1 > fd0;
    Thought lo0 = Thought315.getInstance(ao1, ao2, ao3, ao4);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought183.getInstance();
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    Output.points[7][6] += fd0;
    double ld2 = 347.5452385117159;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld2;
    double ld3 = 638.1656062490142;
if(ao2 != null){
      ao1 = ao2.m4(ld3, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = ld3 < fd0;
    fd1 = ld2 - ld3;

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
    fb1 = fb0 || fb1;
    ad1 *= -1;
    Output.points[7][7] += ad2;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        ad3 *= -1;
        fb1 = !fb0;
        ad4 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Thought lo0 = Thought367.getInstance(ad1, ad2, ad3, ad4);
        fb1 = fd0 < fd1;
        ad1 = ad2 + ad3;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m1();
}
        Thought lo1 = Thought107.getInstance(fb0, fb1, fb0, fb1);
        fb0 = ad2 < ad3;
        Output.points[7][8] -= ad4;
        fb1 = fd0 > fd1;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fb1 = !ab1;
    if (ab2) {
        ab3 = ab4 && fb0;
        boolean lb0 = false;
        double ld1 = 400.33456567709527;
        fd0 = fd1 + ld1;
        fd0 = fd1 - ld1;
        fb0 = fd0 < fd1;
        fb1 = lb0 || ab1;
if(ao2 != null){
          ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        ab2 = fd0 > fd1;
if(ao1 != null){
          ld1 = ao1.m3(fd0, fd1, ld1, fd0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld1 = 492.29005542700565;
if(ao2 != null){
      ab2 = ao2.m2();
}
    ab3 = ad4 > fd0;
    ab4 = fb0 || fb1;
    Output.points[8][0] -= fd1;
    boolean lb2 = false;
    Thought lo3 = Thought303.getInstance(lb0, lb2, ab1, ab2);
    ld1 *= -1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    boolean lb4 = false;
    Thought lo5 = Thought200.getInstance(fd0, fd1, ld1, ad1, lb2, lb4, ab1, ab2);

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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 675.8945756237541;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
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
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    if (ab2) {
        Output.points[8][1] -= fd0;
        for(int i0=0; i0<10; i0++){
            double ld0 = 144.181355971408;
            }
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        Thought lo1 = Thought108.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
        boolean lb2 = false;
        boolean lb3 = true;
        fd1 = fd0 - fd1;
        ab1 = fd0 < fd1;
        ab2 = fd0 > fd1;
if(fo1 != null){
          ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
        boolean lb4 = false;
        Thought lo5 = Thought305.getInstance(fo0, fo1, fo0, fo1, lb3, lb4, ab1, ab2);
        Thought lo6 = Thought274.getInstance(fo0, fo1, fo0, fo1);
        fd0 *= -1;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fb1 = !lb2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Output.points[8][2] += fd0;
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
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
        boolean lb0 = false;
if(fo1 != null){
      ad4 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = ad3 < ad4;
    Thought lo1 = Thought317.getInstance(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);

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
    Thought lo0 = Thought20.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    boolean lb1 = false;
    ab1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = !lb1;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    double ld2 = 257.58700336801365;
    ab1 = ab2 || ab3;
    ab4 = ad2 > ad3;
    double ld3 = 458.29569342892404;
    Thought lo4 = Thought120.getInstance();
    boolean lb5 = false;
    ad3 = ad4 - fd0;
    ab4 = fb0 || fb1;
    lb1 = fd1 < ld2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
        double ld0 = 858.294198738628;
        Thought lo1 = Thought353.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
        fb1 = fd1 > ld0;
        fd0 = fd1 - ld0;
        Thought lo2 = Thought215.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
        Thought lo3 = Thought351.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
        boolean lb4 = true;
        fd1 *= -1;
if(fo1 != null){
          lb4 = fo1.m2(ao1, ao2, ao3, ao4);
}
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
        lb4 = !fb0;
        fd0 = fd1 - ld0;
        Output.points[8][3] += fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
        boolean lb5 = false;
if(ao2 != null){
          ao1 = ao2.m4();
}
        Output.points[8][4] += ld0;
if(ao3 != null){
          ao3.m1(fb0, fb1, lb4, lb5);
}
        double ld6 = 418.6435148877654;
        boolean lb7 = true;
        ld6 = fd0 - fd1;
        ld0 *= -1;
        lb7 = !fb0;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    double ld0 = 50.637972482151234;
    Output.points[8][5] += ld0;
    Output.points[8][6] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    double ld1 = 527.1706468562483;
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1);
}
    boolean lb2 = true;
    ld0 = ld1 - ad1;
    ad2 *= -1;
    lb2 = ad3 < ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    lb2 = fb0 && fb1;
    lb2 = fd0 < fd1;
    Thought lo3 = Thought193.getInstance();
    ld0 = ld1 - ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
    Thought lo4 = Thought215.getInstance(fb1, lb2, fb0, fb1);
    ld0 *= -1;

Thought.STACK_COUNTER++;
return lb2;
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
    ab2 = ab3 && ab4;
    fd1 *= -1;
    fb0 = fb1 && ab1;
        ab2 = ab3 || ab4;
    Thought lo0 = Thought172.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao2.m2();
}
        if (ab3) {
if(ao3 != null){
              ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
              ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
            ab2 = fd1 > fd0;
if(ao4 != null){
              ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
            ab1 = ab2 || ab3;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
            fd1 = fd0 + fd1;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    lb0 = ad2 < ad3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    double ld1 = 326.9025926071698;
    ab1 = ad1 < ad2;
    Output.points[8][7] += ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
    ab2 = fd0 < fd1;
if(ao3 != null){
      ld1 = ao3.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(fd1, ld1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ab2 = ad3 > ad4;
    Output.points[8][8] += fd0;

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
    fb0 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || fb0;
        double ld0 = 961.95312251624;
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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    boolean lb0 = true;
        ab4 = fb0 && fb1;
    boolean lb1 = false;
    lb0 = fd0 > fd1;
    Thought lo2 = Thought78.getInstance(lb1, ab1, ab2, ab3);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    Thought lo3 = Thought88.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 < ad2;
    double ld0 = 445.70753736225316;
    boolean lb1 = false;
    Output.points[0][0] += ad2;
    fb0 = !fb1;
if(fo1 != null){
      lb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ld0 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
        ld0 = ad1 - ad2;
    double ld3 = 958.9989559124231;
    lb1 = lb2 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb1, lb2, fb0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld3, ad1, fb0, fb1, lb1, lb2);
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
    ab1 = !ab2;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought390.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld3 = 679.2610760615898;
if(fo1 != null){
      fo0 = fo1.m4();
}
        double ld4 = 461.233566245545;
if(fo0 != null){
      lb1 = fo0.m2(lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb5 = true;
    ad3 = ad4 + fd0;
    lb1 = lb2 || lb5;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    double ld1 = 579.2027977659561;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought44.getInstance(ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m2();
}
    Thought lo1 = Thought382.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought396.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    double ld4 = 939.9672511889044;
    Thought lo5 = Thought380.getInstance(ao3, ao4, fo0, fo1, ld4, ad1, ad2, ad3);
        Output.points[0][1] += ad4;
    Output.points[0][2] += fd0;
    fb0 = fd1 < ld4;
    double ld6 = 878.4621887826925;
    fb1 = ld6 > ad1;

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
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 330.6292192553443;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought399.getInstance(ao4, fo0, fo1, ao1);
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb0 = fb1 || lb2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;
    ld0 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    fd1 = ld0 - fd0;
    fb0 = !fb1;
    double ld4 = 804.2148624505874;
    fd0 = fd1 - ld0;
    lb2 = !lb3;
    Thought lo5 = Thought270.getInstance(ld4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);

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
    double ld0 = 266.388317647687;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Output.points[0][3] -= ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought141.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    boolean lb3 = false;
    lb3 = fd1 < ld0;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb3);
}
    fd1 = ld0 + ad1;
    ab1 = !ab2;
    ad2 = ad3 - ad4;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2);
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
    double ld0 = 13.419200556190097;
    boolean lb1 = true;
    lb1 = ld0 < fd0;
    boolean lb2 = true;
    lb2 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought398.getInstance(fb0, fb1, lb1, lb2);
    fb0 = !fb1;
    lb1 = !lb2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb1, lb2, fb0);
}
        double ld4 = 15.576070520842528;
    fb1 = !lb1;
    lb2 = ld0 > ld4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ld4, lb1, lb2, fb0, fb1);
}
    boolean lb5 = true;
    boolean lb6 = true;
    Thought lo7 = Thought185.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, lb5, lb6);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
    double ld0 = 694.8312305068265;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    ab1 = fd1 > ld0;
    ab2 = fd0 < fd1;
        double ld1 = 280.0077112460394;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    double ld2 = 121.84959334890272;
    boolean lb3 = false;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ld1 = ld2 - fd0;

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
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        if (fb0) {
            boolean lb1 = false;
}}
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
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    double ld0 = 900.9127268138475;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 < fd0;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
        ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Output.points[0][4] += ad4;
    Output.points[0][5] -= fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, ad1, ad2);
}
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld2 = 959.3371919931091;
        fb0 = ad2 < ad3;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
        ad4 = fd0 + fd1;
        ab3 = ab4 && fb0;
        Thought lo3 = Thought23.getInstance(fo1, fo0, fo1, fo0, ld2, ld0, ad1, ad2, fb1, lb1, ab1, ab2);
        boolean lb4 = true;
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
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
    boolean lb0 = false;
    boolean lb1 = true;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
    fb0 = fd1 > fd0;
    double ld2 = 452.1022092751151;
    Thought lo3 = Thought49.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld2, fd0);
}
    Output.points[0][6] -= fd1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
}
        lb1 = fd0 < fd1;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fb0 = fb1 || lb0;
        lb1 = !fb0;
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
    fb1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought232.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    if (fb1) {
        fb0 = fd0 < fd1;
        boolean lb1 = true;
        fb0 = ad1 < ad2;
        fb1 = !lb1;
        boolean lb2 = false;
        ad3 = ad4 - fd0;
        lb2 = fb0 && fb1;
        boolean lb3 = false;
        lb1 = fd1 > ad1;
        Thought lo4 = Thought173.getInstance(ao2, ao3, ao4, fo0, lb2, lb3, fb0, fb1);
        Output.points[0][7] += ad2;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
        double ld5 = 214.8091195989443;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld5, ad1, ad2, ad3);
}
if(ao1 != null){
          ao1.m2();
}
        ad4 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(lb1, lb2, lb3, fb0);
}
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
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought74.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb2 = true;

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
    double ld0 = 27.544362167110673;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
    boolean lb1 = false;
    Thought lo2 = Thought19.getInstance();
    double ld3 = 862.4700874249484;
if(ao3 != null){
      ao2 = ao3.m4(lb1, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
    boolean lb4 = false;
    ab3 = ab4 || fb0;
    fb1 = lb1 && lb4;
    fd1 *= -1;
    ld0 = ld3 + ad1;
        ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb4);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fd1 = ld0 - ld3;
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;

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
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought271.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    double ld3 = 226.52903492342898;
    double ld4 = 598.6678361978472;
if(fo1 != null){
      fo1.m2();
}
    Thought lo5 = Thought185.getInstance(lb0, lb2, fb0, fb1);
    Thought lo6 = Thought243.getInstance(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld3, lb0, lb2, fb0, fb1);
    double ld7 = 529.6101806966306;
if(fo1 != null){
      fo0 = fo1.m4(ld4, ld7, fd0, fd1, lb0, lb2, fb0, fb1);
}
    boolean lb8 = false;
    double ld9 = 736.0321797959689;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, lb8, fb0);
}
    ld3 = ld4 + ld7;

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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    Thought lo2 = Thought338.getInstance();
if(fo0 != null){
      fo0.m1(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = lb1 && fb0;
    fb1 = lb1 || fb0;

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
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    lb0 = fb0 || fb1;
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = fd1 < fd0;
    Output.points[0][8] -= fd1;
    lb1 = lb2 || fb0;
    fb1 = fd0 > fd1;
    lb0 = !lb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    Output.points[1][0] += fd1;
    lb1 = lb2 && fb0;
    Output.points[1][1] -= fd0;
    boolean lb3 = false;
    boolean lb4 = true;

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
