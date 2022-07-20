package genetic;
import java.util.ArrayList;
class Thought144 extends Thought{
private static ArrayList<Thought144> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 299.62304978418643;
private double fd1 = 326.17477773665064;
private Thought fo0 = null;
private Thought fo1 = null;
Thought144 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought144 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought144 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought144 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought144 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought144 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought144 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought144 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought144 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought144 instance = new Thought144 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought144 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought144 instance = new Thought144 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought144 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought144 instance = new Thought144 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought144 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought144 instance = new Thought144 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought144 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought144 instance = new Thought144 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought144 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought144 instance = new Thought144 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought144 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought144 instance = new Thought144 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought144 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought144 instance = new Thought144 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 55.22032063669614;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
    double ld1 = 371.8022727677768;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    boolean lb3 = true;
    ld1 *= -1;
    boolean lb4 = true;
    boolean lb5 = false;
if(fo0 != null){
      lb3 = fo0.m2(lb4, lb5, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, lb2, lb3, lb4, lb5);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
        ld1 = fd0 + fd1;
    lb4 = lb5 || fb0;
    Thought lo6 = Thought78.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, lb3, lb4);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb5 = fb0 && fb1;
    ld0 = ld1 + fd0;
    fd1 = ld0 - ld1;

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
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    if (ab4) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
        boolean lb3 = false;
        double ld4 = 5.5142693715574636;
        double ld5 = 247.4397929659138;
        lb1 = !lb2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ab1 = fo0.m2(ld4, ld5, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ld5, fd0, fd1);
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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3();
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    fb1 = fb0 || fb1;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = ad4 > fd0;
        fd1 = ad1 - ad2;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought332.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = false;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Output.points[7][3] -= fd1;
    boolean lb2 = false;
    lb1 = ad1 < ad2;
    double ld3 = 243.6453331343545;
    lb2 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab3 = fd1 < ld3;
    Thought lo4 = Thought34.getInstance();
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(ab4, fb0, fb1, lb1);
}
    boolean lb5 = true;
    Thought lo6 = Thought364.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb2, lb5, ab1, ab2);
    Output.points[7][4] -= ld3;
    ab3 = ad1 > ad2;
    ad3 = ad4 + fd0;
    boolean lb7 = true;
    double ld8 = 113.8999618049898;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, ld8, ad1, ab3, ab4, fb0, fb1);
}
    double ld9 = 406.76002559961705;
    for(int i0=0; i0<10; i0++){
        double ld10 = 638.5950729596519;
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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo0 = Thought137.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    boolean lb2 = false;
if(ao1 != null){
      lb2 = ao1.m2(fb0, fb1, lb1, lb2);
}
    fd1 = fd0 - fd1;
    boolean lb3 = false;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(ao1 != null){
      lb3 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    fd0 *= -1;
    Thought lo4 = Thought165.getInstance(ao2, ao3, ao4, fo0, lb3, fb0, fb1, lb1);
    lb2 = lb3 && fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    Thought lo0 = Thought181.getInstance();
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
        ad1 *= -1;
        ad2 = ad3 - ad4;
        double ld2 = 647.076211329429;
        lb1 = !fb0;
        Output.points[7][5] -= ad4;
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
if(ao4 != null){
          ao4.m1(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        fd0 = fd1 + fd0;
        fd1 *= -1;
        double ld0 = 841.6156465242678;
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
        ld0 = fd0 - fd1;
        double ld1 = 558.0437177653547;
if(ao3 != null){
          ld0 = ao3.m3(ld1, fd0, fd1, ld0);
}
if(ao4 != null){
          ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
        ab3 = fd0 < fd1;
        boolean lb2 = false;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    double ld0 = 713.1757297350238;
    ad3 *= -1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    double ld1 = 292.1097184958962;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, ad1, ad2);
}
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    boolean lb3 = false;
    lb3 = ab1 && ab2;
if(ao3 != null){
      ao3.m2(ab3, ab4, fb0, fb1);
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
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 293.0800401860005;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    double ld2 = 871.5667768411535;
    lb0 = ld1 < ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + ld1;
    fb1 = lb0 && fb0;
    fb1 = ld2 > fd0;
    Thought lo3 = Thought280.getInstance(fo1, fo0, fo1, fo0);
    lb0 = fb0 && fb1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1);
}
    Thought lo4 = Thought362.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
    Thought lo5 = Thought66.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    ld1 = ld2 - fd0;

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought397.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    double ld1 = 60.176611038684506;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    ld1 = fd0 - fd1;
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    ld1 = fd0 + fd1;
    fb0 = fb1 || ab1;
    ld1 = fd0 + fd1;

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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 775.3515581384854;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    fb0 = !fb1;
    lb1 = ld0 < ad1;
    fb0 = fb1 || lb1;
    ad2 = ad3 + ad4;

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
    Thought lo0 = Thought379.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    ab1 = fd1 > ad1;
    ad2 = ad3 - ad4;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][6] += fd0;
    fd1 *= -1;
    double ld0 = 31.909727274905702;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        ld0 *= -1;
        boolean lb1 = true;
        lb1 = fb0 || fb1;
        lb1 = !fb0;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
          ao1.m2();
}
        fb1 = !lb1;
        }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    fb1 = fb0 || fb1;
    double ld2 = 150.11240342780704;
    fb0 = ld2 > fd0;
    fd1 = ld0 + ld2;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2, fb0, fb1, lb3, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[7][7] += fd0;
    Thought lo0 = Thought94.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fd1 < ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        fb1 = !fb0;
if(ao1 != null){
          fb1 = ao1.m2();
}
        ad3 = ad4 - fd0;
        fd1 = ad1 - ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    ab4 = fd1 < fd0;
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;

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
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    fb0 = fb1 || ab1;
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = !ab1;
    boolean lb2 = false;
    Thought lo3 = Thought65.getInstance(ad1, ad2, ad3, ad4);
    double ld4 = 449.0098754532459;
    ab1 = ad4 > fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(ao1 != null){
          ld4 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        Thought lo5 = Thought216.getInstance();
        Thought lo6 = Thought342.getInstance(ab2, ab3, ab4, fb0);
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld4, ad1, fb1, lb0, lb1, lb2);
}
            Thought lo7 = Thought362.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
              fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought273.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought392.getInstance();
    Thought lo2 = Thought45.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought247.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought365.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 940.3552675699881;
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 18.21541581416268;
    double ld1 = 894.7756137865723;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb2 = false;
    double ld3 = 208.7378303173886;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[7][8] -= ld3;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ld0);
}
    fb1 = ld1 > ld3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo4 = Thought150.getInstance();
    Thought lo5 = Thought250.getInstance(lb2, fb0, fb1, lb2);

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
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought252.getInstance();
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, ab1, ab2);
}
    Output.points[8][0] += fd0;
    Thought lo1 = Thought325.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    ad4 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    double ld0 = 314.45133851050883;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;

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
    fb0 = fb1 && fb0;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    double ld1 = 954.2477990107012;
    double ld2 = 226.85394853371056;

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
    boolean lb0 = false;
    double ld1 = 153.66246534655042;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo2 = Thought142.getInstance(fd0, fd1, ld1, fd0, fb1, lb0, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    Thought lo3 = Thought149.getInstance(fo0, fo1, ao1, ao2);
    Thought lo4 = Thought334.getInstance(ld1, fd0, fd1, ld1);
    lb0 = ab1 && ab2;
    ab3 = fd0 < fd1;
    Thought lo5 = Thought118.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
        boolean lb6 = false;
    boolean lb7 = true;
    fd0 = fd1 + ld1;
    ab2 = fd0 < fd1;
    ld1 *= -1;
    fd0 = fd1 - ld1;
    ab3 = !ab4;

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
    ab2 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = !ab4;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought278.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = ad1 < ad2;
    Output.points[8][1] -= ad3;
    double ld2 = 727.4735821996734;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb3);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 802.20379241808;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    lb1 = fd1 > ld0;
    Output.points[8][2] -= fd0;
    Output.points[8][3] += fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m2();
}
    Thought lo2 = Thought51.getInstance(fb1, lb1, fb0, fb1);
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    double ld3 = 599.9213987411395;

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
    double ld0 = 918.8764244753941;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fb1 = !ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought7.getInstance(fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    ld0 = fd0 + fd1;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = ab4 || fb0;
    double ld2 = 487.9099546703522;
    Thought lo3 = Thought226.getInstance(fb1, ab1, ab2, ab3);

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought373.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    double ld2 = 510.4234693234036;
    fb0 = !fb1;
    lb1 = !fb0;
    Thought lo3 = Thought108.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
    fd0 *= -1;

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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        ab1 = fd0 > fd1;
        boolean lb0 = true;
        boolean lb1 = false;
        lb1 = ad1 < ad2;
        ab1 = ad3 < ad4;
        ab2 = fd0 < fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        ab3 = fd1 > ad1;
if(fo1 != null){
          ad2 = fo1.m3();
}
        ab4 = ad3 > ad4;
if(fo0 != null){
          fo0.m1(fb0, fb1, lb0, lb1);
}
        ab1 = fd0 < fd1;
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
        boolean lb2 = true;
        Output.points[8][4] += fd0;
        lb2 = ab1 && ab2;
        fd1 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 861.4445858182335;
    boolean lb1 = false;
    ld0 = fd0 - fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
        lb1 = ld0 < fd0;
    fd1 = ld0 - fd0;
    fb0 = fb1 || lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && lb1;
    double ld2 = 425.2967962192984;

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
    fb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fd1, ad1, ad2, ad3);
}
    double ld0 = 16.44852333507766;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
    double ld1 = 194.3539766218086;
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    ld0 = ld1 - ad1;
    ad2 = ad3 - ad4;
    double ld2 = 621.9156784344578;
if(ao1 != null){
      ad4 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    ld2 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + ld1;
    ld2 = ad1 + ad2;

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
    boolean lb0 = false;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = fd1 > fd0;
    boolean lb3 = false;
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    double ld4 = 962.2854032870631;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld4, fd0, fd1, ld4);
}
if(ao2 != null){
      ao2.m2();
}
    fd0 *= -1;
    double ld5 = 15.422802049224876;
        Thought lo6 = Thought279.getInstance(lb3, ab1, ab2, ab3);
    double ld7 = 690.4921234766816;
    boolean lb8 = false;

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    boolean lb0 = true;
    ab1 = !ab2;
    ab3 = !ab4;
    boolean lb1 = true;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    ab4 = fd1 > ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ad1 = ad2 - ad3;
    Thought lo2 = Thought23.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, lb1, ab1);
}
    boolean lb3 = false;
    ab1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    boolean lb4 = false;
    Thought lo5 = Thought154.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ab1 = ao4.m2(ad4, fd0, fd1, ad1);
}
    double ld6 = 655.6092179941456;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao4.m1();
}
    Thought lo7 = Thought342.getInstance(ab3, ab4, fb0, fb1);
    fd0 = fd1 + ld6;
    Thought lo8 = Thought187.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb0, lb1, lb3, lb4);
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld6, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;

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
    double ld0 = 245.45653272250357;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
    fb1 = !fb0;
    fb1 = !fb0;
    Thought lo1 = Thought365.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    Output.points[8][5] -= ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    Thought lo3 = Thought180.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    ld0 *= -1;
    Output.points[8][6] -= fd0;
    fb1 = !lb2;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought133.getInstance(fb0, fb1, lb2, fb0);
    boolean lb5 = false;
    Thought lo6 = Thought167.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb2, lb5);
    fb0 = fb1 || lb2;
    fd0 = fd1 - ld0;
    double ld7 = 119.24077603121559;
if(fo0 != null){
      lb5 = fo0.m2(ld7, fd0, fd1, ld0, fb0, fb1, lb2, lb5);
}
    boolean lb8 = false;
    Output.points[8][7] -= ld7;
    double ld9 = 230.31985863221277;
    ld9 = fd0 - fd1;
    Thought lo10 = Thought155.getInstance(fo1, fo0, fo1, fo0, lb8, fb0, fb1, lb2);

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
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][8] -= fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought363.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
    boolean lb0 = false;
    fd1 *= -1;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    lb1 = fd0 < fd1;
    lb2 = fb0 && fb1;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;

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
