package genetic;
import java.util.ArrayList;
class Thought203 extends Thought{
private static ArrayList<Thought203> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 631.075447576001;
private double fd1 = 817.6915269336326;
private Thought fo0 = null;
private Thought fo1 = null;
Thought203 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought203 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought203 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought203 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought203 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought203 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought203 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought203 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought203 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought203 instance = new Thought203 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought203 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought203 instance = new Thought203 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought203 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought203 instance = new Thought203 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought203 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought203 instance = new Thought203 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought203 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought203 instance = new Thought203 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought203 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought203 instance = new Thought203 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought203 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought203 instance = new Thought203 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought203 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought203 instance = new Thought203 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = fd0 < fd1;
    Thought lo2 = Thought178.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    lb1 = fb0 && fb1;
    Output.points[5][2] -= fd0;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 && fb1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    Thought lo0 = Thought144.getInstance();
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought384.getInstance(ab1, ab2, ab3, ab4);
    boolean lb2 = false;
    boolean lb3 = false;
    double ld4 = 911.5255202166497;
    ab3 = ab4 || fb0;
    fb1 = lb2 || lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld4, fd0, fd1, fb1, lb2, lb3, ab1);
}
    boolean lb5 = true;
    Thought lo6 = Thought254.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb3 = lb5 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld4);
}
    boolean lb7 = false;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
}
if(fo0 != null){
      fo0.m3();
}
    fd1 = ld4 + fd0;
    boolean lb8 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb2);
}
    boolean lb9 = true;

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
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought392.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld1 = 495.5227761405961;
    ld1 = ad1 - ad2;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought153.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    fb0 = fb1 || fb0;
    Output.points[5][3] -= ld1;
    double ld3 = 761.5811463073175;
    fb1 = ld3 < ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    fb1 = ad4 < fd0;

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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    double ld0 = 784.9384228306969;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought168.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    Thought lo2 = Thought274.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought219.getInstance(fd1, ld0, ad1, ad2);
    ad3 *= -1;
    ad4 *= -1;
    ab1 = fd0 > fd1;
    Output.points[5][4] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb4 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb4);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought229.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ad4 *= -1;

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
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m3();
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[5][5] -= fd0;
    Output.points[5][6] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld0 = 504.8832971930706;
    Thought lo1 = Thought323.getInstance(ao2, ao3, ao4, fo0);
    ld0 = fd0 - fd1;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    ld0 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      lb3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3();
}
if(ao1 != null){
      ao1.m2(fb0, fb1, lb2, lb3);
}
    fb0 = fd0 < fd1;
    fb1 = lb2 && lb3;
    ld0 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, lb3);
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
    fb0 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Output.points[5][7] += ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = fd1 < ad1;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    double ld1 = 722.710383693201;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    ad2 *= -1;
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}
    lb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, lb2, lb3, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2(ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
}
    fd1 = ld1 - ad1;
    lb0 = ad2 > ad3;
    lb2 = !lb3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
    lb3 = ad4 < fd0;

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
    double ld0 = 915.13860398577;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    double ld1 = 233.73352390207143;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        ld0 *= -1;
        ld1 = fd0 - fd1;
        fb0 = ld0 < ld1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
if(ao3 != null){
          fd0 = ao3.m3();
}
        Output.points[5][8] -= fd1;
        fb1 = ld0 < ld1;
        }
    ab1 = ab2 && ab3;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ab2 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ab3 = ad2 > ad3;
    ab4 = ad4 < fd0;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought281.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ab1 = ao4.m2();
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
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
    fd0 = fd1 + fd0;
    Output.points[6][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
        boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 282.5728917544789;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = ld1 > fd0;
    fd1 = ld1 - fd0;
    lb0 = fb0 || fb1;
        fd1 = ld1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb0, fb0, fb1, lb0);
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
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Output.points[6][1] -= fd0;
    double ld0 = 509.156121100975;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        double ld1 = 300.75136959545375;
    ab3 = ab4 && fb0;
    ld1 = fd0 - fd1;
    ld0 *= -1;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 = ld0 - ld1;
    fb1 = ab1 && ab2;
    double ld2 = 674.3285972634084;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld0);
}
    double ld3 = 329.07823068630836;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[6][2] += fd1;
    Output.points[6][3] += ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Output.points[6][4] -= fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought326.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fd0 = fd1 - ad1;
    Output.points[6][5] -= ad2;
    ad3 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = !lb1;

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
    boolean lb0 = false;
    lb0 = !ab1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought0.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fb1 = !lb0;
        fd1 = ad1 - ad2;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb2 = ad1 < ad2;
if(fo1 != null){
      fo1.m2();
}
        double ld3 = 634.286358460274;
if(fo0 != null){
      ad2 = fo0.m3(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    fd1 = ld3 + ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    double ld4 = 961.8163149283118;

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
    fb0 = fb1 && fb0;
    double ld0 = 748.0556872228434;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m3(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    fd1 = ld0 - fd0;
    for(int i0=0; i0<10; i0++){
        lb2 = !fb0;
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    Thought lo0 = Thought118.getInstance();
    fd1 *= -1;
    double ld1 = 977.9010778398771;
    Thought lo2 = Thought338.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    ld1 *= -1;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        Thought lo3 = Thought213.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld1, ad1, ad2);
}
        fb1 = ad3 < ad4;
        fb0 = fd0 < fd1;
        boolean lb4 = false;
        for(int i1=0; i1<10; i1++){
}}
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[6][6] -= fd0;
    fd1 *= -1;
    Thought lo0 = Thought199.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    double ld1 = 636.9055224268881;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld1;
    ab3 = ab4 || fb0;
    double ld2 = 63.90067320174589;
    double ld3 = 538.3111235273695;
    ld2 *= -1;
    double ld4 = 676.397654113477;
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ld4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      ld1 = fo1.m3(ld2, ld3, ld4, fd0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld1, ld2, ld3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab2 = ab3 || ab4;
    Thought lo5 = Thought178.getInstance(fb0, fb1, ab1, ab2);
        ab3 = ld4 > fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    double ld0 = 680.3055520775212;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
    ad3 = ad4 + fd0;
    fd1 = ld0 + ad1;

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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought192.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought370.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought24.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        boolean lb3 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought31.getInstance(fb0, fb1, lb3, fb0);

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
    Output.points[6][7] -= fd0;
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fd0 > fd1;
        Output.points[6][8] += fd0;
        Thought lo1 = Thought10.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
        boolean lb2 = true;
        ab1 = ab2 && ab3;
        boolean lb3 = false;
        ab3 = fd1 > fd0;
        Output.points[7][0] -= fd1;
        ab4 = fd0 > fd1;
        boolean lb4 = true;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        lb3 = lb4 || lb0;
        ab1 = !ab2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
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
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb1) {
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought37.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
        fb1 = ad1 < ad2;
        fb0 = ad3 < ad4;
        fd0 = fd1 - ad1;
        boolean lb1 = false;
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
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
    fb1 = ab1 && ab2;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3();
}
    Thought lo3 = Thought241.getInstance(lb2, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fd1 = fd0 + fd1;
    double ld0 = 919.7665525298072;
if(ao2 != null){
      fb0 = ao2.m2(ld0, fd0, fd1, ld0);
}
    Output.points[7][1] -= fd0;
    double ld1 = 189.61641236389073;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld0 = ld1 + fd0;
    fb0 = fd1 > ld0;
if(ao4 != null){
      ao4.m2(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Output.points[7][2] -= ld1;

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
    fb1 = fb0 || fb1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb0 = lb1 && fb0;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    double ld1 = 80.22311276196423;
    boolean lb2 = true;
    Thought lo3 = Thought9.getInstance(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb2, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    lb0 = lb2 || ab1;
    ab2 = ld1 > fd0;
    ab3 = !ab4;

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
    ab1 = ab2 || ab3;
    ad1 *= -1;
    ab4 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 || ab1;
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought331.getInstance();
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    Output.points[7][3] += ad3;
    Output.points[7][4] += ad4;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
    fd1 *= -1;

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
    double ld0 = 671.1618183487182;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought226.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    lb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
    fd1 *= -1;
    boolean lb4 = true;
    lb2 = ld0 < fd0;
    fd1 *= -1;
    lb4 = fb0 || fb1;
    boolean lb5 = false;
    double ld6 = 693.4999607093599;

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
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Output.points[7][5] -= fd0;
    fd1 = fd0 - fd1;
    double ld0 = 472.18490256505055;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
        ld0 *= -1;
        fd0 *= -1;
        ab4 = fd1 < ld0;
        fd0 = fd1 - ld0;
        fb0 = fd0 > fd1;
        fb1 = lb1 && ab1;
        ab2 = !ab3;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(ld0, fd0, fd1, ld0);
}
        fd0 = fd1 - ld0;
        Output.points[7][6] -= fd0;
        ab4 = fd1 < ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb1) {
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        double ld1 = 340.3467091751366;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
        Output.points[7][7] += ad1;
        Thought lo2 = Thought89.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        Thought lo3 = Thought168.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
        ad3 = ad4 - fd0;
        lb0 = fd1 > ld1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb4 = false;
if(fo1 != null){
          fo1.m3(lb4, fb0, fb1, lb0);
}
        ad1 *= -1;
        lb4 = !fb0;
        Thought lo5 = Thought136.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, lb4, fb0);
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
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought297.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
    double ld2 = 0.5473255031111851;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, ld2, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought144.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[7][8] -= fd1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld3 = 332.1122947470401;
    fb0 = !fb1;
    lb0 = !lb2;
    double ld4 = 198.0556246650291;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fd1 < ad1;
    fb0 = ad2 < ad3;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought263.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
    fb0 = fd1 < ad1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
        lb0 = lb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
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
    fd1 *= -1;
    Thought lo0 = Thought61.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    boolean lb1 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    ab1 = fd1 < fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;

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
    Thought lo0 = Thought52.getInstance(ao1, ao2, ao3, ao4);
    double ld1 = 481.11254099937935;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
    Thought lo2 = Thought95.getInstance();
    ab1 = !ab2;
    double ld3 = 397.55453096562223;
if(ao1 != null){
      ad1 = ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao1 != null){
      ab2 = ao1.m2(fd1, ld1, ld3, ad1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        boolean lb4 = false;
    Thought lo5 = Thought7.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo6 = Thought89.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, ld3, ad1);

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][0] += fd0;
    Thought lo0 = Thought169.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fd1 *= -1;
    boolean lb2 = false;
    Output.points[8][1] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
    boolean lb3 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld4 = 672.4726139216702;
    lb3 = fb0 && fb1;
    ld4 = fd0 + fd1;
    boolean lb5 = true;
if(fo0 != null){
      fo0.m1(ld4, fd0, fd1, ld4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb6 = true;
    lb1 = ld4 < fd0;
    Output.points[8][2] += fd1;

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
      fo0.m2(fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += fd0;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb0 = lb1 || lb2;
    fb0 = fd0 > fd1;
    double ld3 = 573.5069449571151;
    ld3 *= -1;
    Thought lo4 = Thought75.getInstance(fd0, fd1, ld3, fd0, fb1, lb0, lb1, lb2);
    fb0 = fb1 && lb0;
    Output.points[8][4] -= fd1;
    ld3 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = fd1 > ld3;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0);
}
        Output.points[8][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
    fd0 = fd1 + ld3;
    Output.points[8][6] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
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
