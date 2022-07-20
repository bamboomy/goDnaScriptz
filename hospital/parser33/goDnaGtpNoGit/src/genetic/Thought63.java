package genetic;
import java.util.ArrayList;
class Thought63 extends Thought{
private static ArrayList<Thought63> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 3.023560408585915;
private double fd1 = 598.8538880650649;
private Thought fo0 = null;
private Thought fo1 = null;
Thought63 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought63 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought63 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought63 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought63 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 546.9811671375908;
    double ld1 = 983.073643660996;
    fb0 = fb1 && fb0;
    double ld2 = 471.6141207739105;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 537.7803338211718;
    boolean lb4 = false;
    Thought lo5 = Thought250.getInstance(ld0, ld1, ld2, ld3);
    Output.points[6][1] += fd0;
    boolean lb6 = false;
    lb4 = lb6 || fb0;
    fb1 = fd1 < ld0;

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
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought103.getInstance();
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb0 = !fb1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    if (ab1) {
        Thought lo1 = Thought378.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
        fd0 = fd1 + fd0;
        fb1 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
        boolean lb2 = false;
        ab4 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, ab1);
}
        } else {
        boolean lb3 = false;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 209.9892165214989;
    Thought lo1 = Thought169.getInstance(ld0, ad1, ad2, ad3);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3();
}
    ad1 = ad2 + ad3;
    boolean lb2 = true;
    boolean lb3 = false;
    Thought lo4 = Thought285.getInstance(lb3, fb0, fb1, lb2);
    lb3 = fb0 && fb1;
    ad4 = fd0 - fd1;
    lb2 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
}
    fb0 = fb1 && lb2;
    Output.points[6][2] -= ad4;
    Thought lo5 = Thought384.getInstance(fd0, fd1, ld0, ad1, lb3, fb0, fb1, lb2);

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
    ab2 = ad1 < ad2;
    ab3 = ab4 || fb0;
    Output.points[6][3] -= ad3;
    ad4 *= -1;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    Thought lo0 = Thought30.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 + ad3;
if(fo0 != null){
      ab2 = fo0.m2(ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought73.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought233.getInstance(ab3, ab4, fb0, fb1);
    Output.points[6][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought308.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    double ld4 = 703.9210437502409;
    boolean lb5 = true;
    boolean lb6 = true;
    lb6 = !ab1;
    Thought lo7 = Thought291.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld4);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ld4;
    ab3 = ab4 || fb0;
    ad1 = ad2 - ad3;

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
    boolean lb0 = false;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    fd0 *= -1;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 || fb1;
    Output.points[6][5] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[6][6] -= fd0;
    Output.points[6][7] += fd1;
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = fd0 > fd1;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        double ld0 = 662.585756713189;
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
    Thought lo0 = Thought1.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    double ld1 = 609.9634031493223;
    Output.points[6][8] += ld1;
    fd0 *= -1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 && ab1;
    ab2 = ld1 < fd0;
    double ld2 = 159.94606422809335;
if(ao3 != null){
      fd0 = ao3.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, ld2, fd0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      fd1 = ao4.m3(ld1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb3, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld4 = 196.76064004962288;

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
    ab2 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    Output.points[7][0] -= ad1;
    ab3 = !ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
    double ld0 = 56.02118602985847;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    ad1 = ad2 + ad3;
    boolean lb2 = true;
    double ld3 = 781.0773645236925;
    Thought lo4 = Thought149.getInstance(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 - fd0;
    double ld5 = 206.81306608431674;
    boolean lb6 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ld3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld5, ad1, ad2, ad3);
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
    fd0 *= -1;
    Thought lo0 = Thought369.getInstance();
    double ld1 = 57.6163052662232;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ld1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = ld1 + fd0;
    fb1 = fb0 || fb1;
    fd1 = ld1 + fd0;
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb2 = false;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought317.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought196.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought173.getInstance(fd1, fd0, fd1, fd0);
    double ld3 = 305.68498617081093;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    double ld4 = 161.09525976310707;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[7][1] += fd0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ld3 > ld4;
    ab1 = ab2 || ab3;
    boolean lb5 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, ld4, fd0, ab3, ab4, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 < ad3;
    double ld0 = 251.13697047226984;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
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
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 || fb1;
        ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Output.points[7][2] -= ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb0 = ad3 < ad4;
    double ld1 = 618.9653389244083;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
    Output.points[7][3] -= ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought353.getInstance(fd0, fd1, fd0, fd1);
    Thought lo2 = Thought283.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m1(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
        boolean lb3 = false;
    lb3 = fb0 && fb1;
    Thought lo4 = Thought198.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb3, fb0, fb1);
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, lb0, lb3, fb0, fb1);
}
    boolean lb5 = true;
    lb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, lb5, fb0, fb1);
}
    Thought lo6 = Thought106.getInstance(ao2, ao3, ao4, fo0);
    boolean lb7 = false;

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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    lb0 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    Thought lo1 = Thought306.getInstance();
    double ld2 = 404.3700783560779;

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
    Thought lo0 = Thought40.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fd0 *= -1;
    fb0 = fb1 || ab1;
    Thought lo1 = Thought100.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    double ld2 = 634.1948041442126;
    Thought lo3 = Thought307.getInstance(fo1, ao1, ao2, ao3);
    fb1 = fd0 < fd1;
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(ld2, fd0, fd1, ld2);
}
    lb4 = ab1 || ab2;

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
    ab1 = ad2 < ad3;
    boolean lb0 = true;
    if (ab1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
        ab2 = !ab3;
        ad2 = ad3 - ad4;
        ab4 = fb0 && fb1;
        Thought lo1 = Thought371.getInstance();
        lb0 = ab1 || ab2;
        ab3 = fd0 > fd1;
        ab4 = fb0 && fb1;
if(ao2 != null){
          ao2.m3(lb0, ab1, ab2, ab3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
        ab1 = !ab2;
if(ao3 != null){
          fd0 = ao3.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        } else if (lb0) {
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
        if (fb0) {
            boolean lb2 = false;
            fb0 = !fb1;
if(ao3 != null){
              ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
            ad4 = fd0 + fd1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
            Output.points[7][4] += fd0;
if(fo0 != null){
              ao4 = fo0.m4();
}
            lb2 = fd1 > ad1;
if(fo1 != null){
              fo1.m2(lb0, ab1, ab2, ab3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    double ld0 = 107.34594194976326;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
    double ld1 = 547.8483578176398;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    Output.points[7][5] -= fd1;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return ld0;
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Output.points[7][6] -= fd0;
    Output.points[7][7] += fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = lb0 || ab1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = lb0 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    if (ab4) {
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        boolean lb2 = false;
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
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb0 = ad1 < ad2;
        double ld0 = 957.9888853692046;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    fb0 = fd1 > ld0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld1 = 845.4453338415642;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
    ab4 = fb0 && fb1;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    ad1 = ad2 - ad3;
if(fo0 != null){
      lb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
    boolean lb3 = false;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo4 = Thought362.getInstance();
    Thought lo5 = Thought126.getInstance(lb1, lb2, lb3, ab1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    Output.points[7][8] -= fd1;
    Thought lo0 = Thought195.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 793.2733254778501;
    fd0 = fd1 + ld1;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - ld1;
    lb2 = !fb0;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
    fb1 = lb2 && fb0;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb2 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb2, fb0, fb1);
}
    fd1 = ld1 - fd0;
    lb2 = fb0 && fb1;
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;

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
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    fb1 = fb0 && fb1;
    ad1 *= -1;
    fb0 = fb1 || fb0;
    double ld0 = 191.90143708695106;
    Thought lo1 = Thought321.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    boolean lb2 = false;
    Thought lo3 = Thought367.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought225.getInstance();
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
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
    ab1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    Thought lo0 = Thought375.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = !ab4;
    ad3 *= -1;
    fb0 = fb1 || ab1;
    Output.points[8][0] += ad4;
    boolean lb1 = false;
if(ao3 != null){
      ao3.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought143.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
    Output.points[8][1] += ad1;
    ab3 = ad2 > ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld3 = 510.59811495242866;
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ld3);
}
        if (ab4) {
        ad1 = ad2 - ad3;
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    lb1 = fb0 && fb1;
    lb1 = !fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb2);
}
    double ld3 = 816.5438541356358;
    fd0 = fd1 + ld3;
    boolean lb4 = false;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb4, lb5, fb0, fb1);
}
    lb1 = fd1 > ld3;
    boolean lb6 = false;
    boolean lb7 = true;

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
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb0);
}
    double ld2 = 659.2962491785718;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
}
    double ld3 = 796.687205955231;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
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
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m2();
}
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
        fd1 = ad1 + ad2;
        double ld0 = 230.47353757722948;
        fb0 = fb1 && fb0;
        ad2 = ad3 - ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
        double ld1 = 943.4874624432246;
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    Thought lo0 = Thought78.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
          fo1.m1();
}
    double ld1 = 502.8370741134611;
if(fo0 != null){
      ad3 = fo0.m3(ab4, fb0, fb1, ab1);
}
    ad4 *= -1;
    ab2 = !ab3;

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
    Thought lo1 = Thought301.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fb1 = fd1 > fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb2 = false;
    Thought lo3 = Thought231.getInstance(fo1, ao1, ao2, ao3, lb0, lb2, fb0, fb1);
    lb0 = lb2 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = lb0 && lb2;
    boolean lb4 = false;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1);
}
    lb4 = fb0 && fb1;
    double ld5 = 61.3460809010088;
        Thought lo6 = Thought175.getInstance(fo0, fo1, ao1, ao2, ld5, fd0, fd1, ld5);
    lb0 = fd0 > fd1;
    ld5 *= -1;
    lb2 = fd0 > fd1;
    ld5 = fd0 + fd1;
if(ao3 != null){
      ao3.m1();
}
if(fo0 != null){
      ao4 = fo0.m4(lb4, fb0, fb1, lb0);
}
    if (lb2) {
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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 > ad1;
    Output.points[8][2] -= ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    double ld0 = 724.9277029763944;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 407.9371264826397;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    double ld2 = 840.5341569636165;
    double ld3 = 415.3449437882593;
    fb0 = ld1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ld3 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    fb1 = !fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought299.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
        double ld1 = 356.318599671302;
    ab2 = ab3 && ab4;
    if (fb0) {
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
        boolean lb2 = false;
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
    Output.points[8][3] -= ad2;
    double ld0 = 343.8070494004965;
    ad2 = ad3 + ad4;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        Output.points[8][4] -= ad3;
        ab3 = ab4 || fb0;
        ad4 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        } else {
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
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1();
}
    Thought lo0 = Thought298.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld1 = 513.4367104640004;
        boolean lb2 = true;
    ld1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    ld1 = fd0 - fd1;
    fb0 = fb1 || lb2;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought346.getInstance(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
    lb2 = fd0 > fd1;
    ld1 *= -1;
    fb0 = fb1 && lb2;
        Thought lo4 = Thought250.getInstance(fo1, fo0, fo1, fo0);
    Output.points[8][5] -= fd0;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
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
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    double ld0 = 254.2706714999447;
    Output.points[8][6] += fd0;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    double ld2 = 842.5733580871383;
    lb1 = fb0 || fb1;
    boolean lb3 = true;
    double ld4 = 853.0961858763379;

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
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[8][7] -= fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;

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
