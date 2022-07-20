package genetic;
import java.util.ArrayList;
class Thought324 extends Thought{
private static ArrayList<Thought324> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 112.00862390454513;
private double fd1 = 872.3744865908321;
private Thought fo0 = null;
private Thought fo1 = null;
Thought324 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought324 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought324 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought324 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought324 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought324 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought324 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought324 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought324 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought324 instance = new Thought324 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought324 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought324 instance = new Thought324 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought324 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought324 instance = new Thought324 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought324 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought324 instance = new Thought324 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought324 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought324 instance = new Thought324 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought324 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought324 instance = new Thought324 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought324 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought324 instance = new Thought324 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought324 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought324 instance = new Thought324 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought89.getInstance(fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought254.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Output.points[1][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought186.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    boolean lb3 = false;
    Thought lo4 = Thought361.getInstance(fb0, fb1, lb3, fb0);
    fd1 = fd0 + fd1;
    Thought lo5 = Thought58.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb3, fb0, fb1);
    lb3 = fb0 && fb1;
    double ld6 = 275.6626458039283;
    double ld7 = 428.61988102200706;
    lb3 = !fb0;
    ld6 *= -1;
    fb1 = lb3 || fb0;
if(fo1 != null){
      ld7 = fo1.m3(fd0, fd1, ld6, ld7, fb1, lb3, fb0, fb1);
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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || ab1;
    Thought lo0 = Thought293.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought61.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab2 = fd0 > fd1;
    boolean lb2 = true;
    double ld3 = 19.850542696383073;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    Thought lo4 = Thought319.getInstance(lb2, ab1, ab2, ab3);
    ld3 = fd0 - fd1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb5 = true;
    double ld6 = 225.04260536353857;
    Thought lo7 = Thought274.getInstance(ld6, fd0, fd1, ld3, lb2, lb5, ab1, ab2);
    ab3 = ab4 && fb0;
    Output.points[1][4] += ld6;
    fd0 = fd1 + ld3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb2, lb5, ab1);
}
    double ld8 = 101.51922915409615;

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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ad1;
    Thought lo0 = Thought152.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 343.8827686983204;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 643.5767777527112;
    Thought lo1 = Thought317.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb2 = false;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 726.9687899055438;
    Thought lo4 = Thought317.getInstance(ad4, fd0, fd1, ld0);
    ab4 = !fb0;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(fb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld3, ad1, ab3, ab4, fb0, fb1);
}
        ad2 *= -1;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Output.points[1][5] -= ld0;
    fb1 = !lb2;
    Thought lo5 = Thought48.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = ld3 < ad1;
    ad2 *= -1;
    fb1 = lb2 && ab1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
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
      ao2.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought168.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1);
}
    lb1 = ad2 < ad3;
    Thought lo2 = Thought344.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      ad2 = fo1.m3();
}
    double ld3 = 833.6676157030215;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, lb1);
}
        Thought lo4 = Thought187.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
    Output.points[1][6] += fd1;

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
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    Output.points[1][7] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        }
    Thought lo1 = Thought253.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought300.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    double ld3 = 871.3553837375499;
if(ao3 != null){
      ao3.m1(ld3, fd0, fd1, ld3, ab4, fb0, fb1, lb0);
}
    Output.points[1][8] -= fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    ld3 = fd0 - fd1;
    boolean lb4 = true;
    ab4 = !fb0;

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    ab3 = ab4 || fb0;
    double ld2 = 598.7122795231663;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1);
}
    fb1 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
    Thought lo3 = Thought365.getInstance(lb0, lb1, ab1, ab2);
    ab3 = !ab4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, fb1, lb0, lb1, ab1);
}
    boolean lb4 = false;
    if (ab1) {
        ab2 = ab3 && ab4;
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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    boolean lb1 = false;
        lb1 = !fb0;
    double ld2 = 571.148514416032;
    ld2 *= -1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought287.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought136.getInstance(fd0, fd1, fd0, fd1);
    ab1 = fd0 < fd1;
    Thought lo2 = Thought122.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[2][0] += fd0;

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
    Thought lo0 = Thought271.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought309.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = !ab2;
    ab3 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    Output.points[2][1] += ad3;
    ab2 = ad4 > fd0;
    ab3 = fd1 < ad1;
    double ld0 = 64.53725859035318;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    ab4 = fd1 > ld0;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    Thought lo2 = Thought50.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
    ab4 = fb0 || fb1;
    Output.points[2][2] += ad1;
    lb1 = !ab1;
    ad2 = ad3 - ad4;
    ab2 = !ab3;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 && fb1;
if(ao4 != null){
          fd1 = ao4.m3(fb0, fb1, fb0, fb1);
}
        Output.points[2][3] += fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
        fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    double ld0 = 292.1309928143884;
if(fo1 != null){
      fo0 = fo1.m4();
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
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought74.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld1 = 516.5490619504872;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd1, ld1, ad1, ad2);
}
    Thought lo2 = Thought343.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);

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
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought138.getInstance(fb0, fb1, lb0, ab1);
    boolean lb2 = true;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Output.points[2][4] -= fd0;
    double ld3 = 418.2658311073068;
    fd0 = fd1 - ld3;
    double ld4 = 85.70067569674057;
if(ao4 != null){
      ld4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ld4, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld3, ld4, fb1, lb0, lb2, ab1);
}
    ab2 = ab3 || ab4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought139.getInstance(fo1, ao1, ao2, ao3);
    ad2 = ad3 - ad4;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3);
}
    ab4 = fb0 && fb1;
    lb0 = !lb1;
    double ld3 = 258.4439993236435;
    boolean lb4 = true;
    boolean lb5 = true;
    lb4 = ad3 < ad4;
    Thought lo6 = Thought35.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ad1);
    boolean lb7 = true;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fd1 > fd0;
    fb1 = !lb0;
    lb1 = fb0 && fb1;
    lb0 = fd1 > fd0;
    lb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
    lb1 = fd1 < fd0;
    Output.points[2][5] -= fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    double ld0 = 879.8513234641418;
        Thought lo1 = Thought305.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    double ld2 = 917.4338574906731;
    boolean lb3 = true;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    ld2 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        }
    boolean lb4 = true;
    fb0 = !fb1;
    ld0 = ld2 + fd0;
    lb3 = lb4 || ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld0 + ld2;
    for(int i1=0; i1<10; i1++){
if(fo1 != null){
          fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
        fb1 = lb3 || lb4;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb3;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld2, fd0, fd1, lb4, ab1, ab2, ab3);
}
        ld0 = ld2 - fd0;
        double ld5 = 391.13322271187224;
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 458.6969351988343;
    ld0 = ad1 - ad2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    double ld2 = 556.8077708910188;
    lb1 = fb0 || fb1;
    if (lb1) {
if(fo0 != null){
          ld0 = fo0.m3(ld2, ad1, ad2, ad3);
}
        ad4 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
        ad1 *= -1;
        } else if (fb0) {
        fb1 = lb1 || fb0;
if(fo0 != null){
          ad2 = fo0.m3();
}
        fb1 = lb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
        boolean lb3 = false;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1, lb3, lb1, fb0, fb1);
}
        Thought lo4 = Thought391.getInstance(ad2, ad3, ad4, fd0, lb3, lb1, fb0, fb1);
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb1, fb0, fb1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought106.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m2();
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    double ld1 = 549.5922198073489;
    ab2 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    Output.points[2][6] -= ad1;
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb2 = ab1 || ab2;
    ab3 = !ab4;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    Thought lo3 = Thought356.getInstance(ld1, ad1, ad2, ad3);
    lb2 = !ab1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
        if (fb1) {
        double ld0 = 409.8216608693964;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
        Output.points[2][7] += fd1;
        Output.points[2][8] += ld0;
        Thought lo1 = Thought275.getInstance();
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m1(fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought397.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
        Thought lo3 = Thought79.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Thought lo4 = Thought383.getInstance(ld0, fd0, fd1, ld0);
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        double ld5 = 879.6827792337455;
        Thought lo6 = Thought263.getInstance(fb1, fb0, fb1, fb0);
        double ld7 = 970.7952581953732;
        fb1 = !fb0;
        fb1 = ld7 > fd0;
        fb0 = fb1 || fb0;
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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 675.2043591385534;
    ld1 *= -1;
    double ld2 = 867.5012692531005;
    Thought lo3 = Thought343.getInstance();
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
    ld2 = fd0 + fd1;
    Thought lo6 = Thought346.getInstance(ao3, ao4, fo0, fo1, ld1, ld2, fd0, fd1, fb0, fb1, lb0, lb4);
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld2, fd0, fd1, lb5, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    lb4 = ld1 < ld2;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    lb5 = !ab1;
    fd1 = ld1 - ld2;

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
    Thought lo0 = Thought92.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    ab1 = ab2 || ab3;
    boolean lb1 = true;
    Thought lo2 = Thought149.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m2();
}
    boolean lb3 = false;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    if (ab2) {
if(ao2 != null){
          ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb1, lb3, ab1, ab2);
}
        ab3 = !ab4;
        double ld4 = 612.2273651248139;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb3);
}
        Output.points[3][0] -= ld4;
        Output.points[3][1] -= ad1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        if (fb0) {
            Output.points[3][2] += ad2;
            fb1 = lb1 && lb3;
            ab1 = ad3 > ad4;
            fd0 = fd1 + ld4;
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
    boolean lb0 = false;
    fd0 *= -1;
    fd1 *= -1;
    double ld1 = 158.1704371943678;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld1);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 95.14741989666484;
        double ld3 = 213.82997788578928;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld1, fd0, fd1);
}
        fb1 = !lb0;
        boolean lb4 = false;
if(fo0 != null){
          fo0.m1();
}
        lb0 = ld2 < ld3;
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo1.m1(fb0, fb1, lb4, lb0);
}
        Output.points[3][3] -= ld2;
        fb0 = fb1 || lb4;
        lb0 = ld3 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, fb0, fb1, lb4, lb0);
}
        Thought lo5 = Thought218.getInstance(ld1, fd0, fd1, ld2, fb0, fb1, lb4, lb0);
        ld3 *= -1;
        fb0 = !fb1;
        lb4 = lb0 && fb0;
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
    double ld0 = 861.7895108821784;
    Thought lo1 = Thought212.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought130.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    Thought lo3 = Thought362.getInstance();
    boolean lb4 = true;
    lb4 = ab1 || ab2;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb4, lb5, ab1);
}
    double ld6 = 811.9306817586853;
    boolean lb7 = false;
    Output.points[3][4] -= fd0;
    boolean lb8 = true;

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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    lb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m3();
}
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    ad2 = ad3 - ad4;
    boolean lb1 = false;

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
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        ab4 = ad4 > fd0;
        double ld1 = 253.3852390956325;
        fb0 = !fb1;
        Thought lo2 = Thought203.getInstance();
if(fo0 != null){
          fd0 = fo0.m3(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb0);
}
        ab1 = !ab2;
        ab3 = ad3 > ad4;
        double ld3 = 21.490122050345093;
        ab4 = fb0 || fb1;
        ad4 *= -1;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld1, ld3, lb0, ab1, ab2, ab3);
}
        boolean lb4 = false;
        ab3 = ab4 || fb0;
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
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    Thought lo2 = Thought398.getInstance();
    lb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
}
    Output.points[3][5] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought140.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    double ld4 = 183.8021755591615;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ld4;
        fb0 = fb1 && lb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
        fd0 *= -1;
if(ao4 != null){
          lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 215.73780968925217;
    double ld1 = 267.51253841268294;
    for(int i0=0; i0<10; i0++){
        }
    Thought lo2 = Thought86.getInstance(ld0, ld1, ad1, ad2);
    boolean lb3 = false;
    ad3 = ad4 + fd0;
    fd1 = ld0 + ld1;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb4 = true;
    double ld5 = 576.2225281532694;
    Output.points[3][6] -= ad4;
    fd0 = fd1 + ld0;
    ld1 = ld5 + ad1;
    boolean lb6 = true;
    ad2 = ad3 - ad4;
    double ld7 = 249.54984707459795;
    double ld8 = 291.5746765894399;

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
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought248.getInstance(ao4, fo0, fo1, ao1);
    Thought lo1 = Thought358.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought179.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Output.points[3][7] -= fd1;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
        fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    boolean lb0 = false;
    Thought lo1 = Thought202.getInstance(ab4, fb0, fb1, lb0);
    Thought lo2 = Thought387.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
    fd0 *= -1;
    lb0 = !lb3;
    ab1 = fd1 > ad1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    boolean lb4 = false;
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao4.m2();
}
    ab1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 713.7797140277064;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    fb1 = lb1 || fb0;
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    boolean lb2 = false;
    ld0 = fd0 - fd1;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Output.points[3][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb1, lb1, lb2, fb0);
}
    fb1 = lb1 || lb2;
    Output.points[4][0] -= fd1;
    Output.points[4][1] += ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
    Output.points[4][2] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought21.getInstance();
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    boolean lb3 = false;
    lb3 = fd0 > fd1;
    fb0 = fd0 > fd1;
    boolean lb4 = true;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    boolean lb2 = true;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = lb2 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb4 = true;
    double ld5 = 52.03565100438967;

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
