package genetic;
import java.util.ArrayList;
class Thought53 extends Thought{
private static ArrayList<Thought53> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 41.757688062483524;
private double fd1 = 410.02951351770275;
private Thought fo0 = null;
private Thought fo1 = null;
Thought53 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought53 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought53 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought53 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought53 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    Output.points[6][0] -= fd0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    if (lb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought42.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = ab1 && ab2;
    Output.points[6][1] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    double ld1 = 491.6641361034639;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought280.getInstance(ad3, ad4, fd0, fd1);
    fb1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        double ld1 = 14.13580162087654;
        double ld2 = 804.1851129219903;
        Thought lo3 = Thought39.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        Output.points[6][2] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld2, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Thought lo4 = Thought19.getInstance(fo0, fo1, fo0, fo1);
        Thought lo5 = Thought181.getInstance(ad3, ad4, fd0, fd1);
        fb0 = ld1 < ld2;
        ad1 *= -1;
        fb1 = !fb0;
        fb1 = fb0 && fb1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, ad1, ad2, fb1, fb0, fb1, fb0);
}
        boolean lb6 = true;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ld1, fb0, fb1, lb6, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb6, fb0, fb1);
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
    ab1 = ad2 < ad3;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ab2 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2();
}
    ad2 = ad3 + ad4;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
        Thought lo0 = Thought35.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb1 = false;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Output.points[6][3] -= fd0;
    Thought lo2 = Thought252.getInstance(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Thought lo3 = Thought369.getInstance(ao1, ao2, ao3, ao4);
    fd0 *= -1;
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;

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
      ao1.m1(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    fb0 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao3 != null){
      ao3.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 > ad1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    double ld0 = 404.46865879750385;
    Thought lo1 = Thought206.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld0;
    fb0 = ad1 < ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    Thought lo2 = Thought379.getInstance(ao3, ao4, fo0, fo1);
    fb0 = fd1 < ld0;

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
    ab2 = ab3 && ab4;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    if (fb0) {
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 > fd0;
        ab1 = !ab2;
        fd1 = fd0 + fd1;
        Thought lo0 = Thought376.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
        fd0 = fd1 - fd0;
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
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[6][4] += ad1;
    fb1 = ab1 && ab2;
    boolean lb0 = false;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    ab4 = fb0 || fb1;
if(ao2 != null){
      lb0 = ao2.m2();
}
    lb1 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought85.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
    ad3 = ad4 + fd0;
    Thought lo3 = Thought212.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
    lb1 = !ab1;
    ad4 = fd0 - fd1;

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
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    double ld0 = 524.5489930902338;
        fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    Thought lo2 = Thought120.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    double ld3 = 156.2700839690562;
    fb0 = fd0 > fd1;
    double ld4 = 945.9270384313443;

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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 110.47926745882293;
    double ld2 = 96.82960426581819;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ld1 *= -1;
    ab1 = ab2 || ab3;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1, ab4, fb0, fb1, lb0);
}
    double ld3 = 462.6789049081845;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought270.getInstance(ld2, ld3, fd0, fd1);
    lb0 = !ab1;
    boolean lb5 = false;
    ld1 = ld2 + ld3;
    Thought lo6 = Thought10.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
    boolean lb7 = true;
    lb7 = ab1 || ab2;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    boolean lb0 = true;
    lb0 = ad3 > ad4;
    fb0 = fd0 < fd1;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = ad3 < ad4;
        fd0 *= -1;
    boolean lb1 = true;
    fb0 = fb1 && lb0;
    Output.points[6][5] += fd1;
    Thought lo2 = Thought120.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    Output.points[6][6] -= ad1;
    boolean lb3 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab4 = ad3 < ad4;
    double ld1 = 542.5879280964638;
    Output.points[6][7] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought188.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb0);
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    if (lb0) {
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && lb0;
if(fo0 != null){
          ab1 = fo0.m2(ad1, ad2, ad3, ad4);
}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        for(int i1=0; i1<10; i1++){
            Thought lo1 = Thought199.getInstance();
if(ao2 != null){
              ao2.m1(lb0, fb0, fb1, lb0);
}
            fb0 = !fb1;
            boolean lb2 = true;
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, lb0, fb0, fb1);
}
            Output.points[6][8] += fd0;
            lb2 = fd1 < fd0;
            for(int i2=0; i2<10; i2++){
                double ld3 = 934.4615203490945;
                boolean lb4 = false;
                Output.points[7][0] -= fd0;
                double ld5 = 138.72285699853936;
                double ld6 = 407.4418452060389;
                ld6 = fd0 + fd1;
                for(int i3=0; i3<10; i3++){
}}}}
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
    double ld0 = 940.5073623825105;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Output.points[7][1] -= ad4;
    Output.points[7][2] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3);
}
    fb1 = fb0 || fb1;
    Thought lo1 = Thought150.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
    double ld2 = 588.1654308206315;
    fb0 = fb1 && fb0;
    Output.points[7][3] += ld2;
    double ld3 = 417.1708799998704;
    Thought lo4 = Thought150.getInstance();
if(ao2 != null){
      ld3 = ao2.m3(fb1, fb0, fb1, fb0);
}
    Thought lo5 = Thought227.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
    boolean lb6 = false;
if(ao2 != null){
      ao1 = ao2.m4(ld2, ld3, ad1, ad2, lb6, fb0, fb1, lb6);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb6, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb7 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      lb6 = ao4.m2(fo0, fo1, ao1, ao2, ld0, ld2, ld3, ad1);
}
if(ao3 != null){
      ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(lb7, fb0, fb1, lb6);
}
    boolean lb8 = false;

Thought.STACK_COUNTER++;
return lb7;
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
    Thought lo1 = Thought66.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
    ab4 = !fb0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought257.getInstance(fo1, ao1, ao2, ao3);
    Thought lo4 = Thought0.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fb1, lb0, lb2, ab1);
}
    Output.points[7][4] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
    boolean lb0 = true;
    ad2 *= -1;
    Thought lo1 = Thought70.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
    Thought lo2 = Thought89.getInstance(ao1, ao2, ao3, ao4);
    if (ab1) {
        } else {
        ab2 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        boolean lb3 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        boolean lb4 = false;
if(ao2 != null){
          ao1 = ao2.m4();
}
        double ld5 = 334.325174459417;
        Thought lo6 = Thought291.getInstance(ab1, ab2, ab3, ab4);
        fb0 = fb1 || lb3;
        Thought lo7 = Thought362.getInstance(ao3, ao4, fo0, fo1, ld5, ad1, ad2, ad3, lb4, lb0, ab1, ab2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 457.2314390880311;
    double ld1 = 31.00651078551335;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ld0 < ld1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
    fb0 = !fb1;
    Thought lo2 = Thought294.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
    ld0 *= -1;
    ld1 = fd0 + fd1;
    Output.points[7][5] += ld0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = ld0 < ld1;

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
    boolean lb0 = true;
    Thought lo1 = Thought104.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb2 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld3 = 397.74543161963373;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = lb2 || ab1;
if(fo0 != null){
      fd1 = fo0.m3(ld3, fd0, fd1, ld3);
}
    boolean lb4 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    ab1 = !ab2;
    Output.points[7][6] += fd1;
    boolean lb5 = true;
    double ld6 = 605.600910398179;
        ab2 = ld3 < ld6;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !lb0;
    boolean lb7 = true;
if(fo0 != null){
      fo0.m3(lb2, lb4, lb5, lb7);
}
    fd0 *= -1;

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
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    Output.points[7][7] -= ad1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    ad2 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
    Thought lo0 = Thought336.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][8] += fd0;

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
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ab1 = fo1.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Thought lo1 = Thought329.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 || ab4;
    if (fb0) {
if(fo0 != null){
          fo0.m3(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        double ld2 = 169.3519777606179;
        Thought lo3 = Thought6.getInstance(fd0, fd1, ld2, ad1, lb0, ab1, ab2, ab3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld0 = 637.6813713955244;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought234.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
    fb1 = ld0 > fd0;
    Output.points[8][0] -= fd1;
    fb0 = ld0 > fd0;
    Thought lo2 = Thought84.getInstance();
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought369.getInstance(ld0, fd0, fd1, ld0, lb3, fb0, fb1, lb3);
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 = ld0 - fd0;
    double ld5 = 8.766070726815759;
    fb0 = fd0 > fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    Thought lo1 = Thought157.getInstance();
if(ao3 != null){
      ao3.m1(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    ad2 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2();
}
    Thought lo2 = Thought233.getInstance(fb0, fb1, lb0, fb0);
    Output.points[8][1] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    lb0 = ad4 > fd0;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb3 = true;
    boolean lb4 = false;

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
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[8][2] += fd0;
    double ld0 = 730.8659149708836;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    double ld1 = 425.67631206358516;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ld0;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(ld1, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought156.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
    Thought lo3 = Thought76.getInstance(ao4, fo0, fo1, ao1);
    double ld4 = 423.3701691592416;
    boolean lb5 = false;
    double ld6 = 175.99396857782563;
    ab1 = ld1 > ld4;
    boolean lb7 = false;
    ld6 = fd0 + fd1;
    ab1 = ld0 > ld1;
if(ao3 != null){
      ao2 = ao3.m4(ld4, ld6, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, ld4, ld6);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    if (ab2) {
        double ld8 = 152.074226538244;
        ab3 = !ab4;
        fb0 = ld6 > fd0;
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
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought51.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    fd1 = ad1 - ad2;
    Thought lo1 = Thought147.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
    ad1 = ad2 + ad3;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    ab1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ad1 > ad2;

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
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = !fb0;
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    double ld2 = 962.2367839662512;
    fd0 = fd1 - ld2;
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fb0 = ld2 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
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
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    ab3 = ab4 || fb0;
    double ld0 = 980.1919373264035;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    Output.points[8][3] -= fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1();
}
    fd0 = fd1 + ld0;
    Thought lo2 = Thought119.getInstance(fb0, fb1, lb1, ab1);
    boolean lb3 = false;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb4 = true;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
    lb3 = lb4 && ab1;
    ab2 = ld0 < fd0;
    fd1 *= -1;
    ab3 = ab4 && fb0;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb3, lb4);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
    double ld5 = 873.285586001763;

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
    Thought lo0 = Thought28.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld1 = 797.956847874187;
    boolean lb2 = false;
    lb2 = ad3 < ad4;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fd1 > ld1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;
    fd0 = fd1 - ld1;
    lb2 = !fb0;
    ad1 = ad2 - ad3;

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
        ad1 = ad2 - ad3;
    ab1 = ab2 || ab3;
    Thought lo0 = Thought376.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    Thought lo1 = Thought151.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Output.points[8][4] += ad2;
    double ld2 = 332.7256590968636;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(ld2, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 - fd1;
    ld2 *= -1;

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
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    double ld0 = 134.35365047581072;
    boolean lb1 = true;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
    double ld2 = 928.1142527307887;
    fb0 = ld0 > ld2;
    fd0 = fd1 - ld0;
    fb1 = lb1 || fb0;
    boolean lb3 = true;
    Thought lo4 = Thought270.getInstance(fb0, fb1, lb1, lb3);
    Thought lo5 = Thought294.getInstance(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
if(fo1 != null){
      fb0 = fo1.m2(ld2, fd0, fd1, ld0, fb1, lb1, lb3, fb0);
}
    boolean lb6 = false;
    boolean lb7 = false;
    ld2 = fd0 - fd1;
    boolean lb8 = false;
    ld0 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    Thought lo0 = Thought355.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
    ad1 *= -1;
    Thought lo1 = Thought86.getInstance(ad2, ad3, ad4, fd0);
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
        Output.points[8][5] += ad4;
if(fo1 != null){
          fd0 = fo1.m3();
}
        boolean lb2 = true;
        boolean lb3 = true;
        lb2 = fd1 < ad1;
        lb3 = fb0 && fb1;
        ad2 *= -1;
        } else {
if(ao1 != null){
          ao1.m1(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fb0 = ad3 < ad4;
        fd0 *= -1;
        fb1 = fd1 < ad1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought179.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    double ld1 = 640.3354806503436;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    Thought lo2 = Thought104.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    ab3 = ab4 || fb0;
    fd0 = fd1 - ld1;
    boolean lb3 = true;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo5 = Thought151.getInstance(fb0, fb1, lb3, lb4);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb3, lb4);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd1 > ld1;

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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ad4 = ao1.m3();
}
    boolean lb1 = true;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    fb1 = lb0 || lb1;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
    fb0 = ad4 < fd0;
    fb1 = !lb0;
    lb1 = fd1 < ad1;
    boolean lb3 = false;
    boolean lb4 = false;

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
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[8][6] -= fd0;
    Output.points[8][7] -= fd1;
    boolean lb0 = true;
    Thought lo1 = Thought175.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;

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
    Thought lo0 = Thought96.getInstance();
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    boolean lb5 = true;
        lb3 = fd0 < fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 196.80696709171727;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    fb0 = fd1 > ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ld1 = fo0.m3();
}
    double ld2 = 476.5598829727478;
if(fo1 != null){
      ld2 = fo1.m3(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    lb0 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld1, ld2, fd0, fd1);
}
    Thought lo3 = Thought281.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    fb0 = ld1 > ld2;
    fd0 = fd1 + ld1;
    fb1 = ld2 < fd0;

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
