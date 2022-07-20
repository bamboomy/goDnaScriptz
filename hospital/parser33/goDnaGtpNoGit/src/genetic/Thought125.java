package genetic;
import java.util.ArrayList;
class Thought125 extends Thought{
private static ArrayList<Thought125> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 250.4095914069031;
private double fd1 = 656.0137897104621;
private Thought fo0 = null;
private Thought fo1 = null;
Thought125 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought125 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought125 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought125 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought125 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought125 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought125 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought125 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought125 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought125 instance = new Thought125 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought125 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought125 instance = new Thought125 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought125 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought125 instance = new Thought125 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought125 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought125 instance = new Thought125 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought125 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought125 instance = new Thought125 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought125 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought125 instance = new Thought125 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought125 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought125 instance = new Thought125 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought125 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought125 instance = new Thought125 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
    Output.points[2][3] -= fd1;
    double ld0 = 838.346190603184;
    Thought lo1 = Thought284.getInstance(ld0, fd0, fd1, ld0);
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    Output.points[2][4] -= fd1;
    boolean lb3 = true;
    Thought lo4 = Thought162.getInstance(lb3, fb0, fb1, lb2);

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
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    ab3 = !ab4;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    double ld1 = 703.4094855421761;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = !ab1;
    boolean lb3 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought282.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 650.0577061542014;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1);
}
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
    fb1 = ad3 < ad4;
    fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    boolean lb3 = true;
    lb2 = ad4 > fd0;

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
      ab2 = fo0.m2();
}
    ab3 = ad1 < ad2;
    ab4 = ad3 > ad4;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    Output.points[2][5] -= ad1;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        ad2 *= -1;
        Output.points[2][6] += ad3;
        Output.points[2][7] -= ad4;
        Output.points[2][8] -= fd0;
        ab4 = fb0 || fb1;
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo0.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ad1);
}
        ab1 = !ab2;
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
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[3][0] -= fd1;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    Thought lo1 = Thought312.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
    double ld2 = 895.5304289100505;
    fb0 = ld2 > fd0;
    fb1 = fd1 > ld2;
        boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb3, fb0, fb1);
}
    lb0 = !lb3;
    fd0 = fd1 + ld2;
    boolean lb4 = true;
    double ld5 = 631.3835770333038;
    lb4 = ld5 < fd0;
    fd1 *= -1;

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
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought229.getInstance(ao2, ao3, ao4, fo0);
    lb0 = fb0 && fb1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    lb0 = fb0 || fb1;
    Output.points[3][1] += ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      lb0 = fo1.m2();
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought293.getInstance(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad3 *= -1;

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
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    double ld0 = 632.2753944639179;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought10.getInstance(ld0, fd0, fd1, ld0);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought127.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    double ld3 = 530.2100654935292;
    ab1 = !ab2;
    boolean lb4 = false;
    ld3 = fd0 - fd1;
    Thought lo5 = Thought54.getInstance(ld0, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb4, ab1, ab2, ab3);
}
    Thought lo6 = Thought85.getInstance(ao4, fo0, fo1, ao1);
    ab4 = fb0 || fb1;
    double ld7 = 23.233905081215262;
if(ao2 != null){
      ao2.m3(ld0, ld3, ld7, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld0, ld3, ld7);
}
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(lb4, ab1, ab2, ab3);
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    Output.points[3][2] -= ad2;
    fb0 = ad3 < ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought191.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
    ad3 *= -1;
    ab2 = ab3 && ab4;
    boolean lb1 = false;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    double ld0 = 266.54601623686534;
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 < ld0;

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
    double ld0 = 865.9297542941725;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd1 < ld0;
    double ld1 = 171.2404609927078;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = ld1 > fd0;
    fd1 = ld0 - ld1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][3] += ad1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][4] -= ad2;
    fb1 = fb0 || fb1;
    ad3 *= -1;
    boolean lb0 = true;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    ad3 = ad4 - fd0;
    boolean lb2 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    double ld3 = 340.75408177618715;
if(fo1 != null){
      fo1.m1();
}
    lb1 = ad4 > fd0;
if(fo0 != null){
      lb2 = fo0.m2(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld3, lb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought100.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
    fb1 = ad1 < ad2;
    double ld5 = 890.7234815863029;
    boolean lb6 = false;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    ad4 *= -1;
    fb0 = fb1 && ab1;
    ab2 = fd0 > fd1;
    Output.points[3][5] += ad1;
if(fo1 != null){
      fo1.m3();
}
    ab3 = !ab4;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    double ld0 = 314.5391894200279;
    ad1 = ad2 + ad3;
    boolean lb1 = false;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought210.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[3][6] += fd0;
    fd1 *= -1;
    double ld0 = 7.866514374667563;
    ld0 = fd0 - fd1;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[3][7] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Thought lo2 = Thought143.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
if(ao3 != null){
      lb1 = ao3.m2();
}
    fd1 = ld0 + fd0;
    boolean lb3 = false;
    fd1 = ld0 + fd0;
    double ld4 = 168.59062539882802;
    lb3 = fd0 > fd1;
    fb0 = fb1 && lb1;
    ld0 = ld4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(lb3, fb0, fb1, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ld4, fd0, lb3, fb0, fb1, lb1);
}
    fd1 = ld0 - ld4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ld4, lb3, fb0, fb1, lb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[3][8] += ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    Output.points[4][0] -= ad2;
if(ao1 != null){
      ao1.m3();
}
    fb1 = lb0 && fb0;
    Thought lo1 = Thought252.getInstance(fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    ad3 *= -1;
    lb0 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    Output.points[4][1] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    double ld2 = 768.4059795191185;
    ad1 = ad2 - ad3;

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = ab1 || ab2;
        fd1 = fd0 - fd1;
    boolean lb0 = true;
    fd0 *= -1;
    ab2 = fd1 > fd0;
    boolean lb1 = true;
    Thought lo2 = Thought198.getInstance(ao1, ao2, ao3, ao4);
    boolean lb3 = false;
    if (ab1) {
        for(int i0=0; i0<10; i0++){
            Thought lo4 = Thought107.getInstance(fd1, fd0, fd1, fd0);
            double ld5 = 439.33606713318505;
            ab2 = fd0 > fd1;
            double ld6 = 65.7420157783873;
            ld5 *= -1;
            ab3 = ab4 && fb0;
            ld6 = fd0 + fd1;
            boolean lb7 = true;
            ld5 *= -1;
            fb0 = fb1 && lb7;
            boolean lb8 = true;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
        boolean lb0 = true;
    Thought lo1 = Thought297.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ab3 = !ab4;
    Thought lo3 = Thought331.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 < ad1;
        boolean lb4 = false;
        ad2 = ad3 + ad4;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb4, lb0);
}
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          lb2 = fo1.m2(fd0, fd1, ad1, ad2);
}
        double ld5 = 699.3548102010327;
        ab1 = !ab2;
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          ab3 = fo1.m2();
}
if(ao1 != null){
          ao1.m3(ab4, fb0, fb1, lb4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld5, ad1, ad2, ad3, lb0, lb2, ab1, ab2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought279.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld1 = 7.934731143758366;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    ld1 *= -1;
    double ld3 = 765.1014517290685;
    ld3 = fd0 - fd1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld3, fd0, fd1);
}
    fb0 = ld1 > ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3);
}
    fb1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(lb4, lb2, fb0, fb1);
}
        lb4 = !lb2;
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 723.9569382757859;
    fd0 = fd1 - ld0;
    Output.points[4][2] += fd0;
    double ld1 = 133.57847512465034;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, ab4, fb0, fb1, lb2);
}
    ab1 = !ab2;
    double ld3 = 834.8877085068071;
    ld3 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld1, ld3);
}
        boolean lb5 = false;
        fd0 = fd1 - ld0;
        boolean lb6 = false;
        Output.points[4][3] += ld1;
        for(int i1=0; i1<10; i1++){
            Thought lo7 = Thought245.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0);
            ld1 = ld3 - fd0;
            double ld8 = 596.5117275226717;
            lb5 = lb6 && lb2;
if(fo0 != null){
              fd0 = fo0.m3();
}
            lb4 = ab1 && ab2;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    Output.points[4][4] += fd0;
    lb0 = fd1 < ad1;
    fb0 = !fb1;
    Output.points[4][5] -= ad2;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + ad1;

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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    double ld0 = 780.6594655242213;
    for(int i0=0; i0<10; i0++){
        double ld1 = 107.20437705127813;
        ad3 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought280.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    Thought lo1 = Thought108.getInstance();
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
          fo0.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought133.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] -= ad1;
    fb1 = !fb0;
    Output.points[4][7] += ad2;
    fb1 = ad3 > ad4;
    fb0 = fb1 && fb0;
    double ld0 = 434.5719458597192;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3();
}
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    double ld1 = 998.4699676322659;
    fb1 = ld1 < ad1;

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
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    double ld1 = 1000.3702791444264;
    ab1 = ab2 || ab3;
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
    ab4 = fd0 > fd1;
    fb0 = fb1 || lb0;
    ab1 = !ab2;
    double ld2 = 64.5572025086242;
    if (ab3) {
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    double ld0 = 414.693580820815;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought257.getInstance(ad4, fd0, fd1, ld0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Thought lo2 = Thought101.getInstance();
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = fd1 < ld0;
    boolean lb3 = false;
        ad1 = ad2 + ad3;
    if (ab2) {
        ad4 = fd0 - fd1;
        ld0 = ad1 - ad2;
        Thought lo4 = Thought118.getInstance(ab3, ab4, fb0, fb1);
        lb3 = ad3 < ad4;
        fd0 *= -1;
        fd1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb3, ab1);
}
        boolean lb5 = false;
        Output.points[4][8] -= ad1;
        ab1 = ab2 || ab3;
        ad2 = ad3 - ad4;
        ab4 = fd0 < fd1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought55.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[5][0] -= fd1;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = lb2 || fb0;
    boolean lb3 = false;
    double ld4 = 723.1198304069826;
    ld4 = fd0 + fd1;
    double ld5 = 678.9690023237705;
    Output.points[5][1] -= ld4;
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld4);
}
    Thought lo6 = Thought206.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld4);
if(fo0 != null){
      fo0.m1();
}
        fb0 = ld5 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb1, lb2, lb3);
}
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld4, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      ld5 = fo1.m3(fd0, fd1, ld4, ld5, lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
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
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    ab3 = !ab4;
    fb0 = !fb1;
    lb0 = fd1 > fd0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab3 = ab4 || fb0;
    double ld1 = 445.4391994151283;
    ld1 *= -1;

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
    double ld0 = 566.5300570065405;
    fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 970.9779085266352;
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ld1, ld0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 || fb0;
        boolean lb2 = true;
if(fo0 != null){
          fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld3 = 365.2981867793766;
        double ld4 = 280.1215372196057;
        fb1 = !lb2;
        Thought lo5 = Thought128.getInstance(fb0, fb1, lb2, fb0);
        double ld6 = 33.566419251712695;
        Output.points[5][2] += ad1;
        double ld7 = 972.920138214508;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
}
        lb2 = fd0 < fd1;
        double ld8 = 790.1391560698486;
        ld1 *= -1;
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
    ab2 = ab3 || ab4;
    fb0 = ad2 < ad3;
    fb1 = !ab1;
    ab2 = ad4 > fd0;
if(fo0 != null){
      ab3 = fo0.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = ad4 > fd0;
    ab2 = !ab3;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ad1 *= -1;
    ab1 = !ab2;

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
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 269.2319252076669;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought6.getInstance();
if(ao2 != null){
      fd1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought197.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        boolean lb3 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb3, fb0);
}
        double ld4 = 175.84263749719725;
        double ld5 = 398.2381364977036;
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fb1 = lb3 && fb0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld4, ld5);
}
        fb1 = ld0 > fd0;
        fd1 = ld4 + ld5;
        ld0 = fd0 - fd1;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ld4, ld5, ld0, fd0);
}
        double ld6 = 995.2034531762615;
        lb3 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4();
}
        boolean lb7 = false;
        fb0 = fb1 || lb3;
if(fo0 != null){
          lb7 = fo0.m2(fb0, fb1, lb3, lb7);
}
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
    fb0 = ad2 > ad3;
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = lb1 || lb2;
    ad3 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, lb1, lb2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Output.points[5][3] -= fd1;
    Thought lo0 = Thought127.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    double ld3 = 596.5685364155092;
    ld3 = fd0 - fd1;
    double ld4 = 267.33191823165595;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld3, ld4, fd0, fd1);
}
    Output.points[5][4] += ld3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab4 = ld4 > fd0;
    fb0 = fb1 || lb1;
if(ao3 != null){
      ao2 = ao3.m4(lb2, ab1, ab2, ab3);
}
    ab4 = fd1 < ld3;
    ld4 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld3, ld4, fd0, fb0, fb1, lb1, lb2);
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
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought106.getInstance(ao3, ao4, fo0, fo1);
    boolean lb1 = false;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    Output.points[5][5] += ad2;
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        lb2 = ab1 || ab2;
        ab3 = ab4 && fb0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Output.points[5][6] -= ad4;
        fd0 *= -1;
        Thought lo3 = Thought28.getInstance(fb1, lb1, lb2, ab1);
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Output.points[5][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    double ld0 = 223.81848674758984;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought333.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = ld0 < fd0;
    fb0 = fd1 > ld0;
    Output.points[5][8] -= fd0;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought294.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought206.getInstance();
    fb0 = fd1 > fd0;
    double ld3 = 306.4215360870238;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(ld3, fd0, fd1, ld3, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ld3;
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
    Output.points[6][0] += ld3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      ld3 = fo0.m3();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
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
    double ld0 = 37.29226215510967;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
    Thought lo2 = Thought111.getInstance(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
    fb0 = fb1 || lb1;
    boolean lb3 = true;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb1);
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
