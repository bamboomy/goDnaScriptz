package genetic;
import java.util.ArrayList;
class Thought17 extends Thought{
private static ArrayList<Thought17> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 730.9132467136648;
private double fd1 = 823.927245601307;
private Thought fo0 = null;
private Thought fo1 = null;
Thought17 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought17 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought17 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought17 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought17 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[6][5] -= fd1;
    double ld0 = 121.1044809570664;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = fd0 > fd1;
    ld0 *= -1;
    boolean lb2 = false;
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = fd1 > ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
    lb2 = fd0 > fd1;
    Output.points[6][6] -= ld0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb3 = fd0 < fd1;
    boolean lb4 = false;

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
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
    boolean lb0 = true;
    Thought lo1 = Thought2.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab1 = ab2 && ab3;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 - fd0;
    ab4 = fd1 < fd0;
    Thought lo2 = Thought276.getInstance(fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
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
    Output.points[6][7] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 867.7919603139952;
    fb0 = fd0 < fd1;
    ld0 *= -1;
    Output.points[6][8] -= ad1;
    fb1 = ad2 > ad3;
    fb0 = fb1 || fb0;
    ad4 *= -1;
    fb1 = fd0 < fd1;
    ld0 = ad1 + ad2;

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
    ab1 = ad2 < ad3;
    double ld0 = 260.0930817667653;
    Thought lo1 = Thought132.getInstance(fo0, fo1, fo0, fo1);
    Thought lo2 = Thought74.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1();
}
    ab2 = ad4 > fd0;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    Output.points[7][0] += fd1;
    ab2 = ld0 < ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
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
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[7][1] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    boolean lb0 = false;

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
    ad1 *= -1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    fb0 = ad4 > fd0;
    fd1 *= -1;
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 919.4193487596241;
    Thought lo1 = Thought144.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought61.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    double ld3 = 452.28749107979894;
    boolean lb4 = true;
    lb4 = fb0 && fb1;
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb4 = ad4 > fd0;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo1.m3(ld3, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ld3 = ad1 - ad2;
    boolean lb5 = true;
    Thought lo6 = Thought153.getInstance();

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
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought8.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    Output.points[7][2] -= fd1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[7][3] -= fd0;
    double ld1 = 376.2717960998522;
    Thought lo2 = Thought389.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
    Output.points[7][4] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = fb0 && fb1;
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    Output.points[7][5] -= fd0;
    ab4 = fd1 > ld1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
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
        Thought lo0 = Thought75.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    ad1 *= -1;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || lb1;
    Thought lo2 = Thought266.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
    ab1 = ad1 > ad2;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ab1 = ad1 < ad2;
    Thought lo4 = Thought388.getInstance();
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    double ld5 = 368.7485795902338;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld5, ad1, ad2, lb1, lb3, ab1, ab2);
}
    boolean lb6 = false;
    ab2 = ad3 > ad4;
    fd0 = fd1 - ld5;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        lb1 = !lb3;
        double ld7 = 396.0636646415926;
        ad4 = fd0 - fd1;
if(ao1 != null){
          ld7 = ao1.m3(ao2, ao3, ao4, fo0, lb6, ab1, ab2, ab3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ld5 = fo1.m3(ad1, ad2, ad3, ad4);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    double ld0 = 565.1385790035761;
    fb1 = fb0 || fb1;
    double ld1 = 817.1657555678664;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
    ld0 *= -1;
    for(int i0=0; i0<10; i0++){
        lb2 = ld1 > fd0;
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb2, fb0, fb1);
}
        double ld3 = 979.3612475197366;
        fd0 = fd1 - ld3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
        double ld4 = 263.68099397694783;
        ld3 = ld4 - ld0;
        fb0 = fb1 && lb2;
        for(int i1=0; i1<10; i1++){
            boolean lb5 = false;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    fd1 *= -1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought218.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought223.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab3 = ab4 && fb0;
    fb1 = !lb0;
if(fo0 != null){
      lb1 = fo0.m2();
}
    ab1 = fd1 < fd0;
    fd1 *= -1;
    double ld4 = 284.6972479524237;
    boolean lb5 = true;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb6, ab1, ab2, ab3);
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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld0 = 575.2791850128023;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 347.6616988207431;
        boolean lb2 = false;
        double ld3 = 966.2796913041661;
        double ld4 = 208.45608706426447;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld3, ld4);
}
        double ld5 = 413.8622247052038;
        lb2 = ld5 > ld0;
if(fo1 != null){
          fb0 = fo1.m2();
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
    ab2 = ad2 < ad3;
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    ab2 = ad4 < fd0;
    boolean lb0 = false;
    double ld1 = 278.5947208666704;
    ab2 = !ab3;
    fd0 = fd1 + ld1;
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(ab4, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        boolean lb3 = true;
        fd1 *= -1;
        fb0 = fb1 && lb3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought394.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought78.getInstance(lb2, fb0, fb1, lb1);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    fd0 *= -1;
    boolean lb4 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
        fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought329.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd1 = ad1 + ad2;
        double ld1 = 198.2967304875198;
if(ao4 != null){
          ao4.m1(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        ad2 = ad3 + ad4;
        fb1 = !fb0;
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
    ab1 = fd1 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    if (fb0) {
        Output.points[7][6] -= fd1;
        Thought lo1 = Thought216.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
        boolean lb2 = false;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        fb1 = !lb2;
        Thought lo3 = Thought299.getInstance(fo0, fo1, ao1, ao2);
        fd0 *= -1;
        lb0 = ab1 && ab2;
        ab3 = ab4 && fb0;
        boolean lb4 = false;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        double ld5 = 16.861963661927046;
        ld5 *= -1;
        fd0 = fd1 - ld5;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld5, fd0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3();
}
    ab2 = ab3 || ab4;
    ad2 *= -1;
    fb0 = ad3 < ad4;
    fb1 = !ab1;
    fd0 = fd1 + ad1;
    ab2 = ad2 > ad3;
    Output.points[7][7] -= ad4;
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought183.getInstance(ao4, fo0, fo1, ao1);
    double ld1 = 266.6419669494443;
    fb1 = ab1 && ab2;
if(ao2 != null){
      ab3 = ao2.m2(ad2, ad3, ad4, fd0);
}
        ab4 = fd1 < ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && ab1;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 *= -1;
    ld1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[7][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 979.9164570585766;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, lb1, fb0);
}
        double ld2 = 546.3779332788235;
        fd0 = fd1 + ld2;
        ld0 = fd0 + fd1;
        if (fb1) {
if(fo1 != null){
              lb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
            boolean lb3 = false;
            fb0 = ld2 > ld0;
            fb1 = fd0 > fd1;
}}
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
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = fd1 > fd0;
    Output.points[8][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 837.8858769046759;
    fb0 = ld0 < fd0;
    Thought lo1 = Thought379.getInstance(fd1, ld0, fd0, fd1);
    if (fb1) {
        ld0 = fd0 + fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo1.m1();
}
if(fo0 != null){
          ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ld0 = fd0 - fd1;
        ab4 = fb0 || fb1;
        ab1 = ld0 > fd0;
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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought367.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    double ld1 = 211.31985604038846;
    boolean lb2 = false;
    if (fb0) {
        fb1 = ld1 > ad1;
        if (lb2) {
            ad2 *= -1;
            Thought lo3 = Thought101.getInstance(fo0, fo1, fo0, fo1);
            fb0 = fb1 || lb2;
            ad3 *= -1;
            fb0 = ad4 < fd0;
            boolean lb4 = true;
            Thought lo5 = Thought269.getInstance(fd1, ld1, ad1, ad2);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
            ld1 *= -1;
            Output.points[8][1] -= ad1;
            boolean lb6 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ad2 > ad3;
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Output.points[8][2] -= ad1;
    ab4 = fb0 || fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought313.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    if (fb1) {
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
        double ld1 = 665.4080471105033;
        if (fb0) {
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
            boolean lb2 = true;
            } else if (fb1) {
if(ao3 != null){
              ao2 = ao3.m4();
}
            fb0 = fb1 || fb0;
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
    Thought lo0 = Thought120.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 388.8790120826085;
        fb1 = ad1 < ad2;
    fb0 = fb1 && fb0;
    double ld2 = 786.3653259566462;
    fb1 = ad2 > ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ld1 = ld2 - ad1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Output.points[8][3] += fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 648.4084787396949;
    ab2 = !ab3;
    boolean lb1 = false;
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, ld0, fd0);
}
    ab4 = fb0 && fb1;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    ab1 = ab2 && ab3;
    boolean lb2 = false;
    boolean lb3 = true;
    ab2 = ld0 > fd0;
if(ao2 != null){
      ab3 = ao2.m2();
}
    ab4 = fb0 || fb1;
    lb1 = fd1 > ld0;
if(ao3 != null){
      fd0 = ao3.m3(lb2, lb3, ab1, ab2);
}
    fd1 *= -1;
    ab3 = !ab4;
    ld0 = fd0 - fd1;
    boolean lb4 = true;
    Output.points[8][4] += ld0;
    fd0 = fd1 - ld0;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    double ld0 = 254.32326022441893;
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    double ld1 = 943.8086789281411;
    Thought lo2 = Thought13.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(ad4, fd0, fd1, ld0);
}
    fb0 = ld1 > ad1;
    Thought lo3 = Thought242.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
    boolean lb4 = true;
    fb0 = fd1 > ld0;
    fb1 = ld1 < ad1;
    lb4 = ab1 && ab2;
    double ld5 = 521.5435169087823;

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
    fb1 = !fb0;
    Output.points[8][5] += fd0;
    if (fb1) {
if(fo1 != null){
          fd1 = fo1.m3();
}
if(fo0 != null){
          fo0.m3(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        boolean lb0 = true;
        Thought lo1 = Thought102.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fb1 = fd1 < fd0;
        lb0 = fb0 || fb1;
        Thought lo2 = Thought318.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
        boolean lb3 = false;
        double ld4 = 706.5144288524858;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
        fd0 = fd1 - ld4;
        boolean lb5 = false;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    Thought lo2 = Thought223.getInstance();
    ab4 = fb0 && fb1;
    lb0 = fd0 > fd1;
    if (lb1) {
        boolean lb3 = false;
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
    Output.points[8][6] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 849.2618498513235;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[8][7] -= fd0;
    Output.points[8][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld1 = 606.6243214621448;

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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    if (ab2) {
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          ab4 = fo1.m2();
}
        ad3 = ad4 - fd0;
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, ab1, ab2);
}
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          ab3 = fo1.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought246.getInstance(fo0, fo1, fo0, fo1);
        if (fb0) {
if(fo1 != null){
              fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
            double ld2 = 778.2880256504902;
if(fo1 != null){
              fb1 = fo1.m2();
}
if(fo1 != null){
              fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
            ad4 *= -1;
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab4, fb0, fb1, lb0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought31.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        boolean lb2 = true;
        Thought lo3 = Thought376.getInstance(fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
        lb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        Output.points[0][0] -= fd1;
        Output.points[0][1] += fd0;
        Output.points[0][2] -= fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          lb2 = fo0.m2();
}
        Thought lo4 = Thought258.getInstance(lb1, fb0, fb1, lb2);
        Output.points[0][3] += fd1;
        if (lb1) {
            boolean lb5 = true;
            lb1 = fb0 && fb1;
            fd0 = fd1 - fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought206.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought149.getInstance(fo1, ao1, ao2, ao3);
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
    Output.points[0][4] += ad2;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    ad1 = ad2 - ad3;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought347.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;
    fd1 = ad1 - ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, lb3, fb0, fb1, lb3);
}
    Thought lo4 = Thought116.getInstance(fo1, ao1, ao2, ao3);
    ad3 = ad4 - fd0;

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
    double ld0 = 918.1013424769543;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    double ld1 = 424.8441254819214;
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ld1, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0);
}
if(ao1 != null){
      ao1.m3();
}
    double ld3 = 578.9808398051216;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(ao2 != null){
      fd0 = ao2.m3(lb2, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ld3, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ld1, ld3, lb2, lb4, ab1, ab2);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
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
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld0 = 880.4584292026235;
if(ao2 != null){
      ab3 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
    double ld1 = 923.7266477446941;
    fb0 = ad2 > ad3;
    Thought lo2 = Thought172.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought339.getInstance(ad4, fd0, fd1, ld0);
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3);
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
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
    Thought lo0 = Thought222.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Output.points[0][5] += fd1;
    fb0 = fb1 || fb0;
    Output.points[0][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 586.6663751100156;
    Thought lo2 = Thought379.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = ld1 + fd0;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Output.points[0][7] -= fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
        fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 542.74030249948;
    lb0 = ld1 < fd0;
    fb0 = !fb1;
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
}
    fd1 = ld1 - fd0;

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
