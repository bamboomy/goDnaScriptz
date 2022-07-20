package genetic;
import java.util.ArrayList;
class Thought318 extends Thought{
private static ArrayList<Thought318> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 912.6265830771227;
private double fd1 = 172.03677230469805;
private Thought fo0 = null;
private Thought fo1 = null;
Thought318 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought318 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought318 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought318 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought318 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought318 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought318 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought318 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought318 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought318 instance = new Thought318 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought318 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought318 instance = new Thought318 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought318 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought318 instance = new Thought318 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought318 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought318 instance = new Thought318 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought318 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought318 instance = new Thought318 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought318 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought318 instance = new Thought318 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought318 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought318 instance = new Thought318 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought318 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought318 instance = new Thought318 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought299.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fb0 || fb1;
        fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    Thought lo1 = Thought45.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought39.getInstance(fb0, fb1, fb0, fb1);
    double ld3 = 738.9178748512543;
    fb0 = fd0 > fd1;
    double ld4 = 480.5533542720649;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld3 < ld4;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, ld4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[6][4] -= fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (fb1) {
        Thought lo5 = Thought71.getInstance(ld3, ld4, fd0, fd1);
        Thought lo6 = Thought221.getInstance(fo0, fo1, fo0, fo1, ld3, ld4, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        ld3 *= -1;
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
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
    double ld0 = 203.91870249807639;
    fb0 = fb1 && ab1;
    ab2 = ld0 < fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Output.points[6][5] -= fd0;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought154.getInstance(fo0, fo1, fo0, fo1);
    fd1 = ld0 + fd0;
    fb1 = ab1 && ab2;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1);
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
    double ld0 = 726.6669919107948;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    double ld1 = 776.5868994528047;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 - fd0;
    fb0 = fd1 < ld0;
    fb1 = ld1 > ad1;
    fb0 = ad2 < ad3;
    Thought lo2 = Thought352.getInstance(fb1, fb0, fb1, fb0);
    Thought lo3 = Thought225.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[6][6] += ad4;
    fd0 = fd1 + ld0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = ld1 > ad1;
    ad2 *= -1;
    Thought lo4 = Thought109.getInstance(fo1, fo0, fo1, fo0);

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
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    double ld1 = 592.8589490765723;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo1.m2();
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    double ld2 = 435.0178434792273;
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld1;

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
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[6][7] -= fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    Thought lo2 = Thought37.getInstance();
if(ao4 != null){
      lb0 = ao4.m2(lb1, fb0, fb1, lb0);
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
    ad2 = ad3 - ad4;
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 || lb1;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb1 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb2 = ad4 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
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
    ab1 = fd1 > fd0;
    boolean lb0 = false;
    Thought lo1 = Thought51.getInstance();
    fd1 = fd0 + fd1;
    Output.points[6][8] -= fd0;
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    double ld2 = 689.88922608828;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb0, ab1);
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
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
    if (lb0) {
        lb1 = ab1 || ab2;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          ab3 = fo0.m2(fd0, fd1, ad1, ad2);
}
        ab4 = !fb0;
        ad3 = ad4 + fd0;
        Thought lo2 = Thought211.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
if(ao4 != null){
          ao4.m1();
}
        double ld3 = 855.9027844564837;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb0, lb1, ab1);
}
        boolean lb4 = false;
        boolean lb5 = true;
        lb1 = ld3 < ad1;
        ab1 = ad2 < ad3;
        ab2 = ab3 || ab4;
        boolean lb6 = true;
        Thought lo7 = Thought144.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld3, ab4, fb0, fb1, lb4);
if(ao4 != null){
          ao4.m3(ad1, ad2, ad3, ad4, lb5, lb6, lb0, lb1);
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
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought331.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought286.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    lb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      lb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    Output.points[7][0] -= fd0;
    fb0 = fb1 && lb1;
    Output.points[7][1] += fd1;

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
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    Output.points[7][2] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Output.points[7][3] += fd1;
    fb1 = fd0 < fd1;
    Output.points[7][4] -= fd0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m3();
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld0 = 15.126201850638365;
    Output.points[7][5] += ad2;
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought167.getInstance(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 200.89966453208697;
    double ld1 = 68.23511969967612;
    Thought lo2 = Thought198.getInstance(ld0, ld1, ad1, ad2);
    ab1 = ab2 || ab3;
    Thought lo3 = Thought313.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m1();
}
    ld0 = ld1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld4 = 185.30881598021273;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, ld4, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Output.points[7][6] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 && fb1;
    ad3 = ad4 + fd0;
        ab1 = fd1 > ld0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld4, ad1, ad2);
}
    fb0 = fb1 || ab1;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought380.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    double ld1 = 845.152243961055;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo2 = Thought112.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld1;
    fb1 = fb0 && fb1;

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
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought83.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
    fb0 = ad3 < ad4;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = !fb1;
    double ld1 = 529.640203561764;
if(ao4 != null){
      ad4 = ao4.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo2 = Thought140.getInstance(fd1, ld1, ad1, ad2);
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
    Output.points[7][7] += ad1;
    fb1 = ad2 < ad3;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought232.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    boolean lb2 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 278.42981162216313;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    fb0 = fb1 && ab1;
    double ld1 = 711.5442331713472;
    boolean lb2 = false;
    double ld3 = 326.20067512034836;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb4 = true;
if(ao4 != null){
      ab4 = ao4.m2(fd1, ld0, ld1, ld3, fb0, fb1, lb2, lb4);
}
    Output.points[7][8] += ad1;
    boolean lb5 = false;
    lb5 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb2 = lb4 && lb5;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld0, ld1);
}
    ld3 = ad1 - ad2;
    ad3 = ad4 + fd0;
    boolean lb7 = true;

Thought.STACK_COUNTER++;
return lb6;
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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb1 = false;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, lb0);
}
        fb0 = !fb1;
        fd0 *= -1;
        }
    lb0 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 320.8848137558799;
    boolean lb3 = true;
    fb0 = !fb1;
    lb0 = lb3 && fb0;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    Thought lo0 = Thought225.getInstance(fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[8][0] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    fd1 = fd0 + fd1;
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
    ad1 *= -1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 < fd0;
    fd1 *= -1;
    Thought lo1 = Thought328.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    boolean lb2 = false;
    fd0 *= -1;
    boolean lb3 = false;
    lb2 = fd1 > ad1;
    lb3 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Thought lo4 = Thought380.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought202.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fb1 || lb0;

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
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld0 = 710.237094435039;
    ab2 = !ab3;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ld0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        Thought lo3 = Thought37.getInstance(fo0, fo1, fo0, fo1);
        fd0 *= -1;
        fd1 = ld0 + ad1;
if(fo0 != null){
          lb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
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
    fb0 = fb1 || fb0;
    fd0 *= -1;
    boolean lb0 = true;
    Output.points[8][1] -= fd1;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = fd0 - fd1;
    boolean lb3 = true;
    lb2 = lb3 || fb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    double ld4 = 991.8973755716466;
    double ld5 = 635.6914534414976;
    fb1 = !lb0;
    lb1 = ld4 < ld5;
    lb2 = fd0 > fd1;
    double ld6 = 793.5586583561507;
    ld4 *= -1;
    lb3 = ld5 > ld6;

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
    double ld0 = 776.674006887167;
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        double ld1 = 543.1662840450048;
if(ao3 != null){
          ad3 = ao3.m3(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        ld0 = ad1 - ad2;
        double ld2 = 894.3155175424888;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
        Thought lo3 = Thought252.getInstance(ad2, ad3, ad4, fd0);
        Output.points[8][2] -= fd1;
        ld1 = ld2 + ld0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 995.5863235064627;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(ao1 != null){
      fb1 = ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 + fd0;
    boolean lb1 = true;
    double ld2 = 293.81528459769385;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ld2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
    Thought lo3 = Thought275.getInstance(ao3, ao4, fo0, fo1);
    fd0 = fd1 + ld0;
if(ao1 != null){
      ao1.m2(ld2, fd0, fd1, ld0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = ad1 > ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ab1 = ad4 > fd0;
        double ld2 = 887.9458918266373;
    boolean lb3 = true;
    boolean lb4 = true;
    lb4 = ab1 && ab2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
    ad2 = ad3 - ad4;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao2 != null){
      fd0 = ao2.m3(lb0, lb1, lb3, lb4);
}
    Output.points[8][3] -= fd1;
    ld2 = ad1 + ad2;
    double ld5 = 722.014571224185;
    ab1 = ab2 && ab3;
    Thought lo6 = Thought297.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld2, ld5, ad1, lb1, lb3, lb4, ab1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    Output.points[8][4] -= fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        fb0 = fd0 > fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought291.getInstance(fb0, fb1, lb0, fb0);
    boolean lb2 = false;
    fb0 = fb1 && lb0;
    Output.points[8][5] -= fd1;

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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    Output.points[8][6] -= fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    double ld1 = 10.58308347778937;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[8][7] -= ld1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ab4 = fb0 || fb1;
    lb0 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;

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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fd1 = ad1 + ad2;
    double ld1 = 40.2406820261826;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[8][8] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought346.getInstance(fb0, fb1, lb0, fb0);
    double ld3 = 546.6528535992101;
    boolean lb4 = true;
    fb0 = ld1 < ld3;
    fb1 = !lb0;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb4);
}
    fb0 = fd0 > fd1;
    ld1 = ld3 + ad1;
    fb1 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, ld3, lb0, lb4, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb4, fb0, fb1);
}
    lb0 = !lb4;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb5 = true;
    ad3 *= -1;
    Thought lo6 = Thought213.getInstance(ad4, fd0, fd1, ld1);

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
        lb0 = ad2 < ad3;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 = ad3 - ad4;
    ab2 = ab3 || ab4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought212.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought22.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
    Thought lo3 = Thought32.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    boolean lb4 = true;
    ad4 = fd0 - fd1;
    Output.points[0][0] += ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = ad2 < ad3;
        lb4 = !ab1;
    ab2 = ad4 > fd0;
    ab3 = fd1 < ad1;
    Thought lo5 = Thought195.getInstance(ad2, ad3, ad4, fd0);
    Thought lo6 = Thought282.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m1();
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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fb0 = fb1 || lb0;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought397.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    Thought lo0 = Thought103.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo1.m2();
}
    Output.points[0][1] -= ad2;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld1 = 536.0297228108648;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb2 = false;
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
    fd0 *= -1;
    fd1 = ld1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad3 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ad4, fd0, fd1, ld1);
}
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld3 = 791.7885588939351;

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
      fd1 = ao2.m3();
}
    ab2 = ab3 && ab4;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
        Thought lo0 = Thought137.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
        ab4 = fd1 > fd0;
        fb0 = fd1 > fd0;
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
        fd0 = fd1 + fd0;
        boolean lb2 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          fd1 = ao3.m3();
}
        ab4 = fd0 < fd1;
        fd0 *= -1;
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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
    double ld1 = 908.8150688171969;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    double ld2 = 667.7356973889738;
    ad4 *= -1;
    ab1 = fd0 < fd1;
    double ld3 = 945.7117707647509;
    ld1 = ld2 - ld3;
    ab2 = ad1 < ad2;
    double ld4 = 319.28963660589744;
    ab3 = ab4 && fb0;
    boolean lb5 = false;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Output.points[0][2] -= ld1;

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
    double ld0 = 919.7484201801411;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[0][3] -= fd1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
        boolean lb2 = true;
    fd1 *= -1;
    lb1 = lb2 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ld0 < fd0;
if(fo0 != null){
          lb1 = fo0.m2(lb2, fb0, fb1, lb1);
}
    lb2 = fd1 < ld0;
    fd0 = fd1 + ld0;
    Output.points[0][4] -= fd0;
    double ld3 = 800.8063558686;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3, fb0, fb1, lb1, lb2);
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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 509.7497684268265;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld1;
    double ld2 = 593.0265295456188;
    fb0 = ld2 < fd0;
    fd1 = ld1 + ld2;
    fb1 = !lb0;
    fb0 = fd0 > fd1;
if(fo0 != null){
      ld1 = fo0.m3(ld2, fd0, fd1, ld1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1);
}
    Thought lo4 = Thought129.getInstance();
    fb0 = fb1 && lb0;
if(fo1 != null){
      lb3 = fo1.m2(fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb1, lb0, lb3, fb0);
}
    ld2 = fd0 + fd1;

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
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[0][5] += fd0;
    Thought lo0 = Thought102.getInstance();
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
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
