package genetic;
import java.util.ArrayList;
class Thought343 extends Thought{
private static ArrayList<Thought343> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 152.51779122526835;
private double fd1 = 179.4633412443106;
private Thought fo0 = null;
private Thought fo1 = null;
Thought343 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought343 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought343 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought343 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought343 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought343 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought343 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought343 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought343 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought343 instance = new Thought343 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought343 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought343 instance = new Thought343 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought343 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought343 instance = new Thought343 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought343 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought343 instance = new Thought343 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought343 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought343 instance = new Thought343 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought343 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought343 instance = new Thought343 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought343 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought343 instance = new Thought343 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought343 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought343 instance = new Thought343 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 && fb0;
    fb1 = fd0 > fd1;
    lb0 = !fb0;
    double ld1 = 520.2169165249186;
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    double ld2 = 206.23804438634147;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
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
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
        Thought lo0 = Thought339.getInstance(ab1, ab2, ab3, ab4);
    boolean lb1 = true;
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = false;
    Output.points[5][0] += fd0;

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
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought345.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    ad4 *= -1;
        fd0 = fd1 + ad1;
    Thought lo2 = Thought392.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    boolean lb3 = true;
        fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    double ld4 = 737.1744747776957;
    lb3 = !fb0;
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 + ld4;
    fb1 = ad1 < ad2;
    lb1 = ad3 > ad4;
    lb3 = fd0 < fd1;
    boolean lb5 = false;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    double ld1 = 580.9179410985528;
    if (ab4) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
        fb1 = !lb0;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        double ld2 = 813.4826166609892;
        ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo3 = Thought288.getInstance(ad2, ad3, ad4, fd0);
        fd1 *= -1;
        double ld4 = 369.3878506249976;
        fb0 = ld2 > ld4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
        Output.points[5][1] += ad4;
        fb1 = lb0 && ab1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
        fd0 = fd1 - ld2;
        Thought lo5 = Thought277.getInstance(fo1, fo0, fo1, fo0, ld4, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
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
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    double ld0 = 538.3150814124241;
    fb1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought64.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
        fb0 = fd0 < fd1;
        fb1 = ld0 > fd0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fd1 = ld0 - fd0;
        fd1 = ld0 + fd0;
        boolean lb2 = true;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
        lb2 = ld0 < fd0;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao2 != null){
          ld0 = ao2.m3();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    Output.points[5][2] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = !fb1;
if(ao3 != null){
      ao3.m1(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao4 != null){
      lb0 = ao4.m2();
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    ab3 = ab4 && fb0;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    boolean lb4 = true;
    Thought lo5 = Thought196.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    ab3 = ab4 || fb0;
    double ld6 = 129.086955113761;
    boolean lb7 = false;

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
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad1 = ao4.m3(ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    Thought lo0 = Thought266.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    Output.points[5][3] -= ad1;
    ab3 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    Thought lo1 = Thought178.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = ad1 > ad2;
if(ao2 != null){
      ab1 = ao2.m2(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld2 = 523.8603394587507;
    fd0 *= -1;
    Thought lo3 = Thought29.getInstance(ab2, ab3, ab4, fb0);
    fd1 = ld2 + ad1;
    double ld4 = 981.8415466125914;
    ad1 *= -1;
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo5 = Thought218.getInstance(fo0, fo1, ao1, ao2, ld2, ld4, ad1, ad2, ab1, ab2, ab3, ab4);
    double ld6 = 160.81592763952665;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
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
    boolean lb0 = false;
    fd0 *= -1;
    boolean lb1 = false;
    fd1 *= -1;
    boolean lb2 = true;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[5][4] += fd1;
    lb2 = fd0 < fd1;
    boolean lb3 = true;
    Thought lo4 = Thought186.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    double ld5 = 411.5083961743946;
if(fo1 != null){
      fo1.m2();
}
    lb1 = ld5 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}
    fd1 = ld5 - fd0;
    fd1 = ld5 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld5, fd0, fd1, lb1, lb2, lb3, fb0);
}
    ld5 = fd0 + fd1;

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
    fd0 *= -1;
    double ld0 = 532.4064307092989;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        ab3 = !ab4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
          ld0 = fo0.m3();
}
        boolean lb2 = false;
        ab4 = fb0 && fb1;
        lb2 = fd0 > fd1;
if(fo1 != null){
          ld0 = fo1.m3(lb1, ab1, ab2, ab3);
}
        Output.points[5][5] -= fd0;
        fd1 *= -1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    boolean lb0 = true;
    Output.points[5][6] -= ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    Output.points[5][7] += ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought60.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;

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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought68.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
        fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    if (ab1) {
        Output.points[5][8] -= ad1;
        ab2 = !ab3;
        ad2 *= -1;
        ab4 = fb0 || fb1;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
        Output.points[6][0] += ad2;
        ad3 = ad4 + fd0;
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
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    lb0 = fb0 && fb1;
        boolean lb1 = true;
    Thought lo2 = Thought395.getInstance(lb0, lb1, fb0, fb1);
    if (lb0) {
        lb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
        boolean lb3 = false;
        Thought lo4 = Thought131.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb3);
        lb0 = fd0 > fd1;
        lb1 = !fb0;
        fb1 = lb3 && lb0;
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
    ad1 *= -1;
    fb1 = ad2 < ad3;
    fb0 = ad4 > fd0;
    Output.points[6][1] += fd1;
    fb1 = !fb0;
    double ld0 = 928.2130104228174;
if(ao2 != null){
      ao2.m1(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    lb1 = ld0 > ad1;
    fb0 = ad2 < ad3;

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    double ld0 = 933.0993793928336;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought212.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
if(ao1 != null){
      fd1 = ao1.m3();
}
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    double ld2 = 374.59682494698853;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
    Output.points[6][2] += fd1;
    double ld4 = 588.1090452251779;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    lb3 = ld2 > ld4;
    double ld5 = 485.63774780549113;
    ab1 = ld5 < fd0;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ld2, ld4);
}
    ld5 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld2, ld4);
}
    ab4 = ld5 < fd0;
    fb0 = fb1 && lb3;
if(ao4 != null){
      ao4.m1();
}
    double ld6 = 510.7642805850699;
    boolean lb7 = false;
    lb7 = ab1 && ab2;

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
    boolean lb0 = true;
    ab1 = !ab2;
if(ao1 != null){
      ad2 = ao1.m3(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought288.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
    ad1 = ad2 - ad3;
if(fo1 != null){
      ab4 = fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
        boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
        ad2 = ad3 - ad4;
        double ld3 = 863.4674393055578;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
        ad4 = fd0 - fd1;
        ld3 = ad1 - ad2;
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1);
}
        double ld4 = 964.7615520607088;
        lb0 = ld3 < ld4;
        lb2 = ad1 < ad2;
        Thought lo5 = Thought217.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
        Output.points[6][3] += ld3;
        double ld6 = 647.1659682842483;
        ab1 = !ab2;
        ab3 = !ab4;
        ld4 *= -1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fb0 = ld6 > ad1;
        fb1 = ad2 > ad3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[6][4] -= fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 343.6487306930175;
    fb1 = ld1 > fd0;
    lb0 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    Thought lo2 = Thought90.getInstance();
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = ld1 < fd0;
    Thought lo3 = Thought63.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - ld1;
    lb0 = !fb0;
    fb1 = lb0 && fb0;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m1();
}
        Thought lo0 = Thought166.getInstance(fb0, fb1, ab1, ab2);
    Output.points[6][5] += fd1;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo1 = Thought144.getInstance(fo0, fo1, fo0, fo1);

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
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought327.getInstance();
    boolean lb1 = false;
    Thought lo2 = Thought185.getInstance(lb1, fb0, fb1, lb1);

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = ab2 || ab3;
    ab4 = ad1 < ad2;
    double ld0 = 56.757394078614105;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
    double ld2 = 489.7931768242938;
    lb1 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
    ab1 = fd0 > fd1;
    boolean lb3 = false;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb1 = ld2 < ad1;
    lb3 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Thought lo0 = Thought365.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 577.3705956327263;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = !fb1;
    lb2 = fb0 || fb1;
    ld1 *= -1;

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
      ao2.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    ad1 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 = fd0 + fd1;
    boolean lb1 = true;
    boolean lb2 = false;
    ad1 *= -1;
    ad2 *= -1;
    Thought lo3 = Thought63.getInstance(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb0);
    ad3 = ad4 - fd0;
    Thought lo4 = Thought131.getInstance(ao1, ao2, ao3, ao4);
    Thought lo5 = Thought208.getInstance(fd1, ad1, ad2, ad3);
    Thought lo6 = Thought270.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao3.m3();
}
    Output.points[6][6] -= fd0;
if(ao4 != null){
      fd1 = ao4.m3(lb1, lb2, fb0, fb1);
}
    boolean lb7 = true;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb0, lb1, lb2, lb7);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao2 != null){
      ab4 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
    ab4 = fd1 < fd0;
    Thought lo0 = Thought95.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb1 = true;

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
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = fd1 < ad1;
    fb0 = ad2 > ad3;
    boolean lb1 = true;
    Thought lo2 = Thought126.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[6][7] -= fd1;
    boolean lb3 = false;

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
    boolean lb0 = true;
    double ld1 = 653.9324395802539;
    fd0 = fd1 - ld1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0);
}
    fb1 = fd1 > ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    lb0 = fd1 > ld1;
    fd0 *= -1;
    Thought lo2 = Thought327.getInstance();
    fb0 = !fb1;
    lb0 = fd1 < ld1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    ld1 = fd0 + fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    ld1 = fd0 - fd1;

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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Thought lo1 = Thought155.getInstance();
    ab1 = ab2 || ab3;
    Output.points[6][8] -= fd0;
    ab4 = !fb0;
    fb1 = !lb0;
    ab1 = fd1 < fd0;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
        boolean lb2 = false;
    double ld3 = 439.31977604907195;
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    fd1 = ld3 + fd0;
    Thought lo5 = Thought380.getInstance(fd1, ld3, fd0, fd1, lb2, lb4, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld3 = fd0 + fd1;
    boolean lb6 = false;
    lb0 = !lb2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb7 = false;

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
      fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb0 = true;
    lb0 = !fb0;
    boolean lb1 = false;
    Thought lo2 = Thought160.getInstance();
    if (fb0) {
        Thought lo3 = Thought52.getInstance(fb1, lb0, lb1, fb0);
        Thought lo4 = Thought294.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, lb1, fb0);
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        boolean lb0 = true;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab3 = fd0 > fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
    Thought lo2 = Thought104.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    Output.points[7][0] += fd0;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    Thought lo0 = Thought109.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought83.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        double ld2 = 577.5260718555497;
    fd0 = fd1 - ld2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought310.getInstance(fd0, fd1, ld2, fd0);
    fb1 = fd1 < ld2;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 || fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    Thought lo1 = Thought48.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought14.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    Output.points[7][1] += ad2;
    Thought lo3 = Thought141.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    lb0 = fb0 || fb1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    ad4 = fd0 - fd1;

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
    Output.points[7][2] += fd0;
    double ld0 = 283.52770926875155;
    ab1 = fd0 < fd1;
    if (ab2) {
        ld0 = fd0 + fd1;
        Output.points[7][3] += ld0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ab1 = ao2.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd0 = fd1 + ld0;
        ab4 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        for(int i0=0; i0<10; i0++){
        ab2 = ad1 < ad2;
        ab3 = ab4 || fb0;
        fb1 = !ab1;
        double ld0 = 577.2389523653147;
        ad2 *= -1;
if(ao1 != null){
          ad3 = ao1.m3();
}
        ab2 = ab3 || ab4;
if(ao2 != null){
          ad4 = ao2.m3(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
        double ld1 = 710.6858853888308;
        ab2 = ab3 && ab4;
        Thought lo2 = Thought230.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
        ab3 = !ab4;
        Output.points[7][4] -= ld0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = ld1 > ad1;
if(ao2 != null){
          ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
        Output.points[7][5] += ld0;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3);
}
        boolean lb3 = false;
if(ao2 != null){
          lb3 = ao2.m2();
}
        ab1 = ad4 < fd0;
        fd1 *= -1;
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
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    lb0 = !fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;

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
    fb0 = fd1 > fd0;
    double ld0 = 761.6623852918145;
    fd0 = fd1 + ld0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[7][6] += fd1;
    Thought lo1 = Thought144.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought0.getInstance(fo1, fo0, fo1, fo0);

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
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought81.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought68.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
