package genetic;
import java.util.ArrayList;
class Thought90 extends Thought{
private static ArrayList<Thought90> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 739.9870291990388;
private double fd1 = 957.2684747433261;
private Thought fo0 = null;
private Thought fo1 = null;
Thought90 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought90 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought90 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought90 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought90 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 915.7476671639185;
    fb1 = fb0 || fb1;
    Output.points[2][5] += fd0;
    fb0 = fb1 || fb0;
    double ld1 = 393.3402408210387;
    fb1 = fb0 && fb1;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
    ld1 *= -1;
    double ld2 = 781.3437090979062;
    fb1 = fb0 && fb1;
    double ld3 = 346.71854684151765;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought236.getInstance(ld0, ld1, ld2, ld3, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[2][6] -= ld0;

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
    Thought lo0 = Thought75.getInstance(fo1, fo0, fo1, fo0);
    Output.points[2][7] += fd1;
    ab1 = !ab2;
    Output.points[2][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
    fb0 = fd1 > fd0;
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, lb1, lb2);
}
    boolean lb3 = true;
    lb3 = !ab1;
    Output.points[3][0] -= fd1;
    boolean lb4 = false;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    lb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb3, lb4, ab1, ab2);
}
    Output.points[3][1] += fd0;

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
    fb0 = fb1 && fb0;
    Output.points[3][2] += ad2;
    double ld0 = 849.6874399079046;
    Thought lo1 = Thought241.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought345.getInstance(lb2, fb0, fb1, lb2);
    double ld4 = 63.83404418767932;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;

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
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    if (lb0) {
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
        ab2 = ab3 && ab4;
        fb0 = fd0 < fd1;
        ad1 = ad2 + ad3;
        ad4 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        lb0 = ad1 < ad2;
if(fo0 != null){
          fo0.m3();
}
        ad3 *= -1;
if(fo1 != null){
          ad4 = fo1.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb0;
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
    Thought lo0 = Thought314.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought234.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    Thought lo2 = Thought369.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb3, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb1, lb3, fb0, fb1);
}
    if (lb3) {
        double ld4 = 805.6891963228354;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ld4 = fd0 - fd1;
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
    fb1 = ad1 > ad2;
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb1 = !fb0;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
        ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao4.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    boolean lb0 = true;
    Output.points[3][3] -= fd0;
    Output.points[3][4] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld2 = 247.2191528357754;
    fb0 = fb1 || lb0;
    ld2 *= -1;
    Output.points[3][5] -= ad1;

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
      ao1.m2(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(ao1 != null){
      ao1.m3();
}
    fd1 *= -1;
    ab1 = !ab2;
    boolean lb0 = false;
    Thought lo1 = Thought74.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[3][6] -= fd0;
    double ld2 = 941.4758580742181;
    fd0 = fd1 - ld2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    Output.points[3][7] += fd0;
    fd1 *= -1;
    double ld3 = 912.2462175215859;
    Output.points[3][8] += ld2;
    Output.points[4][0] -= ld3;
    fd0 = fd1 - ld2;
    ld3 = fd0 + fd1;
    ld2 = ld3 + fd0;

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
    for(int i0=0; i0<10; i0++){
        ab1 = ad2 > ad3;
        boolean lb0 = true;
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m3(ad4, fd0, fd1, ad1);
}
        }
    Thought lo1 = Thought393.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    ab3 = fd1 < ad1;
    ab4 = fb0 || fb1;
    Thought lo2 = Thought52.getInstance();
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    double ld3 = 562.573477181419;
    Output.points[4][1] += ad1;
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld3, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought314.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[4][2] -= fd1;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
if(fo1 != null){
      ab1 = fo1.m2();
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
        double ld0 = 256.24668756583924;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fb0 = fb1 && ab1;
    Thought lo1 = Thought266.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    ab2 = !ab3;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 658.1608549138328;
    boolean lb3 = false;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, ab1);
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
    Thought lo0 = Thought144.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = true;
    double ld2 = 290.53713469904153;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3);
}
    fb0 = fb1 || lb1;
    ad4 = fd0 + fd1;
    ld2 *= -1;
    if (fb0) {
        double ld3 = 49.23119405224265;
        fb1 = lb1 || fb0;
        boolean lb4 = false;
        double ld5 = 295.3911883390718;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, ld2, ad1, ad2);
}
        fb0 = fb1 && lb4;
if(fo0 != null){
          fo0.m1();
}
        for(int i0=0; i0<10; i0++){
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
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought269.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld1 = 671.2347963302014;
    boolean lb2 = false;
    Thought lo3 = Thought30.getInstance(fo0, fo1, fo0, fo1);
    Output.points[4][3] -= ad3;
    Thought lo4 = Thought156.getInstance(ad4, fd0, fd1, ld1);
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb5 = false;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb5);
}
    ab1 = ld1 < ad1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb2;
    boolean lb6 = false;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb5, lb6, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb5, lb6, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = fd0 > fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    double ld0 = 271.4394150116318;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo1 = Thought117.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1);
}
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = !fb0;

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
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    Thought lo1 = Thought20.getInstance();
    boolean lb2 = true;
if(ao2 != null){
      ao2.m2(lb0, lb2, fb0, fb1);
}
    boolean lb3 = true;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb0, lb2, lb3, fb0);
}
    double ld4 = 305.97598561921734;
    Thought lo5 = Thought274.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, lb2, lb3);
    double ld6 = 385.86059050720473;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb3 = fo1.m2(ld4, ld6, ad1, ad2);
}
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        boolean lb7 = false;
        boolean lb8 = false;
        lb3 = ld4 < ld6;
        Thought lo9 = Thought49.getInstance();
if(ao1 != null){
          ao1.m2(fb0, fb1, lb7, lb8);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb2, lb3, fb0);
}
        fd0 = fd1 + ld4;
        ld6 *= -1;
if(ao1 != null){
          fb1 = ao1.m2(ad1, ad2, ad3, ad4, lb7, lb8, lb0, lb2);
}
if(ao2 != null){
          lb3 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb7, lb8);
}
        fd0 = fd1 - ld4;
        Thought lo10 = Thought63.getInstance(ao1, ao2, ao3, ao4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    fd1 *= -1;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought294.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought64.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Output.points[4][4] -= fd1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
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
    ab1 = ab2 && ab3;
    ab4 = ad2 < ad3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
        fb1 = ab1 && ab2;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb0 = fd1 > ad1;
    Thought lo1 = Thought113.getInstance(ab1, ab2, ab3, ab4);
    boolean lb2 = true;
    ad2 = ad3 - ad4;
    ab4 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb0, lb2, ab1, ab2);
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
    Output.points[4][5] += fd0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought332.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    Output.points[4][6] += fd0;
    boolean lb2 = false;
    Thought lo3 = Thought119.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    Output.points[4][7] += fd0;

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
      ab1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    lb1 = !ab1;
    ab2 = fd0 > fd1;
    fd0 *= -1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
        lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    Output.points[4][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought293.getInstance(fd0, fd1, fd0, fd1);

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
    Thought lo0 = Thought360.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought193.getInstance();
    Output.points[5][0] -= fd1;
    Thought lo2 = Thought81.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 461.5416081728871;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[5][1] += fd1;
    Thought lo4 = Thought129.getInstance();
    fb1 = !fb0;
    fb1 = ld3 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo5 = Thought122.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    double ld6 = 447.4973802538987;
    boolean lb7 = true;
    fd0 = fd1 + ld3;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    Thought lo0 = Thought334.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    boolean lb1 = true;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 - fd0;
    ab1 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Thought lo2 = Thought132.getInstance();
if(fo0 != null){
      ad1 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ad1 *= -1;
    ab3 = !ab4;
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ad1 = ad2 - ad3;

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
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
    lb0 = !lb1;
    Output.points[5][2] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    double ld2 = 169.69767454949775;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = fb0 || fb1;

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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought301.getInstance(fb0, fb1, fb0, fb1);
    Output.points[5][3] += ad4;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought275.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = ad3 > ad4;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
    Output.points[5][4] -= ad4;
    Thought lo3 = Thought290.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      ad3 = fo1.m3();
}
    lb2 = ad4 < fd0;
    boolean lb4 = true;
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb4, lb5, fb0, fb1);
}
    lb2 = !lb4;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb5, fb0, fb1, lb2);
}
    boolean lb6 = true;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, lb4, lb5, lb6, fb0);
}
    Thought lo7 = Thought10.getInstance(ao4, fo0, fo1, ao1, fb1, lb2, lb4, lb5);
    ad4 = fd0 + fd1;
    double ld8 = 994.3764218292814;
    lb6 = ld8 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    fd1 = fd0 - fd1;
    Output.points[5][5] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
            Output.points[5][6] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 *= -1;
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    double ld2 = 703.0577190739206;
    ld2 = fd0 + fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    Thought lo0 = Thought23.getInstance(ao2, ao3, ao4, fo0);
    double ld1 = 840.1038916123052;
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    ab1 = ab2 || ab3;
    double ld3 = 703.9669790771726;
    ab4 = ad1 > ad2;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ld3, ad1);
}
    fb1 = ad2 > ad3;
    ad4 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, ld3, ad1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3();
}
    Output.points[5][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 247.3829379490827;
    Thought lo1 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ld0 *= -1;
    fb1 = !fb0;
    Output.points[5][8] -= fd0;
    double ld2 = 302.1592686783877;
    boolean lb3 = false;
    boolean lb4 = true;
    double ld5 = 540.8217071370024;
    lb4 = fb0 || fb1;
if(fo1 != null){
      ld5 = fo1.m3(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld2);
}
    Thought lo6 = Thought246.getInstance(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld0);
if(fo1 != null){
      lb3 = fo1.m2();
}
    ld2 = ld5 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb4, fb0, fb1, lb3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld2, ld5, fd0, lb4, fb0, fb1, lb3);
}
    fd1 *= -1;
    lb4 = ld0 > ld2;

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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    Output.points[6][0] -= fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought31.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fd1 = fd0 + fd1;

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
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    Output.points[6][1] += ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 - ad1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    if (fb0) {
        fb1 = fd0 < fd1;
        Output.points[6][2] += ad1;
        Output.points[6][3] += ad2;
        ad3 = ad4 - fd0;
        boolean lb1 = false;
        lb1 = !lb0;
        fd1 = ad1 - ad2;
        if (fb0) {
if(fo1 != null){
              ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
            } else if (fb1) {
            for(int i0=0; i0<10; i0++){
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
                  fd1 = fo0.m3();
}
                ad1 = ad2 + ad3;
}}}
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
if(fo0 != null){
      ad2 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
    ab4 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    ab4 = fd1 < ad1;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    Thought lo1 = Thought230.getInstance(ad2, ad3, ad4, fd0);
    double ld2 = 498.1727296156727;
    ab4 = fd0 > fd1;
    ld2 = ad1 + ad2;
    Thought lo3 = Thought186.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);

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
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    Thought lo1 = Thought366.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    double ld2 = 474.32961360521625;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(ld2, fd0, fd1, ld2);
}
    Thought lo3 = Thought271.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
    lb0 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    boolean lb4 = true;

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
    Output.points[6][4] -= ad1;
    Thought lo0 = Thought165.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    double ld1 = 84.18320410896808;
    fb0 = fb1 && fb0;
    Thought lo2 = Thought167.getInstance(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = ad2 > ad3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = ad4 > fd0;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      fb0 = ao3.m2(fd1, ld1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
if(ao1 != null){
          fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
        Output.points[6][5] -= ad2;
        boolean lb3 = true;
        Output.points[6][6] += ad3;
        fb0 = ad4 < fd0;
        fd1 *= -1;
        fb1 = ld1 > ad1;
        Thought lo4 = Thought192.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab2 = !ab3;
    boolean lb0 = true;
    Output.points[6][7] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought187.getInstance(ao2, ao3, ao4, fo0);
    boolean lb2 = true;
    ab4 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fd0 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[6][8] -= ad2;
    ab2 = ad3 > ad4;
if(ao1 != null){
      ab3 = ao1.m2();
}
    Thought lo0 = Thought153.getInstance(ab4, fb0, fb1, ab1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
    boolean lb1 = false;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    boolean lb2 = true;
    lb1 = lb2 || ab1;
    ad4 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb1, lb2, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    ab3 = ad2 < ad3;
    ab4 = ad4 > fd0;
    fd1 = ad1 - ad2;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought197.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd1 > fd0;
    Thought lo1 = Thought113.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought276.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
    double ld4 = 783.1258558670835;
    fd0 *= -1;
    Thought lo5 = Thought35.getInstance(fd1, ld4, fd0, fd1, lb3, fb0, fb1, lb3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
    Thought lo6 = Thought284.getInstance(fo1, fo0, fo1, fo0);
    boolean lb7 = true;
if(fo1 != null){
      fb0 = fo1.m2(ld4, fd0, fd1, ld4);
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
    double ld0 = 725.7901070800958;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    double ld1 = 260.8675196329988;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld2 = 489.88901602784256;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ld1 = ld2 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, ld2, fd0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fd0 *= -1;
    double ld0 = 502.6268449627389;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    boolean lb1 = true;
    Output.points[7][0] += fd1;
    ld0 *= -1;
    fb0 = fd0 < fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m3();
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fb1, lb1, fb0, fb1);
}
    Output.points[7][1] -= ld0;
    boolean lb2 = false;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
        fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + ld0;
    lb1 = fd0 > fd1;
    boolean lb3 = false;
    lb2 = lb3 && fb0;
    Thought lo4 = Thought348.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);

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
