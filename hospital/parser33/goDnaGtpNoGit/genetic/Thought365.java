package genetic;
import java.util.ArrayList;
class Thought365 extends Thought{
private static ArrayList<Thought365> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 94.49296590853287;
private double fd1 = 422.7788189225958;
private Thought fo0 = null;
private Thought fo1 = null;
Thought365 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought365 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought365 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought365 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought365 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought365 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought365 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought365 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought365 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought365 instance = new Thought365 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought365 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought365 instance = new Thought365 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought365 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought365 instance = new Thought365 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought365 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought365 instance = new Thought365 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought365 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought365 instance = new Thought365 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought365 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought365 instance = new Thought365 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought365 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought365 instance = new Thought365 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought365 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought365 instance = new Thought365 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
        Output.points[1][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[1][2] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought102.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
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
    ab1 = fd1 > fd0;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[1][3] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    double ld1 = 479.71986067917527;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought0.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
    Thought lo3 = Thought167.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = ld1 > fd0;
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    ab4 = fb0 || fb1;
    lb0 = lb4 && ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    double ld0 = 254.5480265254612;
    boolean lb1 = true;
    Output.points[1][4] += ld0;
    boolean lb2 = false;
    Thought lo3 = Thought49.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought322.getInstance(fd0, fd1, ld0, ad1, lb1, lb2, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld5 = 204.87198831186535;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        double ld6 = 305.2466403733607;
    fd0 = fd1 + ld0;
    lb1 = ld5 < ld6;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(lb2, fb0, fb1, lb1);
}
    lb2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld5, ld6, ad1, fb0, fb1, lb1, lb2);
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
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 + ad2;
    ab1 = !ab2;
    ad3 *= -1;
    double ld0 = 738.7451244946096;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    boolean lb1 = true;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;

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
        boolean lb1 = true;
    lb0 = !lb1;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ao3.m3(fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought112.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    boolean lb3 = false;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb0, lb1, lb3, fb0);
}
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          fd0 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb1, lb3, lb4);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    Output.points[1][5] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb3, lb4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    lb0 = !lb1;

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
    if (fb0) {
        Output.points[1][6] += ad2;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
        fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
        fd1 = ad1 - ad2;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        Output.points[1][7] += fd0;
        } else {
        fb0 = fb1 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        ad4 *= -1;
        boolean lb0 = true;
        Thought lo1 = Thought393.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
        Thought lo2 = Thought134.getInstance(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
        lb0 = !fb0;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd0 < fd1;
    Output.points[1][8] -= fd0;
    Thought lo0 = Thought353.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought56.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld2 = 237.38514518740328;
    ab2 = ld2 < fd0;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    fd1 = ld2 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1, fb1, lb3, ab1, ab2);
}
    ld2 = fd0 + fd1;
    ab3 = ab4 || fb0;
    fb1 = !lb3;
        ab1 = ab2 && ab3;
    ld2 = fd0 + fd1;
    Thought lo4 = Thought290.getInstance(ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb3);
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo5 = Thought250.getInstance(fd0, fd1, ld2, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
    Output.points[2][0] += ld2;
    fd0 = fd1 + ld2;

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
      ao1 = ao2.m4();
}
    Thought lo0 = Thought241.getInstance(ab1, ab2, ab3, ab4);
    Thought lo1 = Thought185.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    fd1 *= -1;
    Thought lo2 = Thought106.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    double ld3 = 345.20233548556394;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(ld3, ad1, ad2, ad3);
}
    ab1 = !ab2;
    boolean lb4 = false;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Output.points[2][1] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m2();
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 683.5918423012533;
    ld0 = fd0 - fd1;

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
    Thought lo0 = Thought34.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought332.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    Output.points[2][2] += fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
}
        ab1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[2][3] += fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (ab3) {
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought110.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought210.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    lb1 = ad4 < fd0;

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
    ab1 = ad2 > ad3;
    double ld0 = 6.602418387549906;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    fd1 = ld0 - ad1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 853.5688650666308;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(ao4 != null){
      lb1 = ao4.m2();
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(lb3, lb1, fb0, fb1);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = !lb0;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 302.4542502210699;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought79.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3);
}
    lb0 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
}
    boolean lb3 = false;
    lb3 = ad3 > ad4;
    Thought lo4 = Thought247.getInstance();
    fb0 = fd0 > fd1;
    boolean lb5 = true;
    ld1 *= -1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb3, lb5, fb0);
}
    Thought lo6 = Thought50.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, lb3, lb5);
    fb0 = fb1 || lb0;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, lb3, lb5, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb0, lb3, lb5, fb0);
}
    fb1 = lb0 || lb3;
        boolean lb7 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab2 = !ab3;
    Output.points[2][4] += fd1;
    ab4 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Output.points[2][5] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = !lb1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    double ld3 = 37.51266246414358;
    ld3 *= -1;
    lb2 = ab1 || ab2;
    fd0 = fd1 - ld3;
    fd0 = fd1 + ld3;
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;
    Output.points[2][6] += ld3;
    boolean lb4 = false;
    Thought lo5 = Thought41.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0);
    double ld6 = 879.114452554017;
    double ld7 = 150.04330589574553;
    Output.points[2][7] += ld7;
    Thought lo8 = Thought15.getInstance();

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
    boolean lb0 = true;
    ab1 = ad2 > ad3;
    ab2 = ab3 || ab4;
    ad4 *= -1;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    Thought lo1 = Thought213.getInstance(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought294.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = !fb0;
    ad2 = ad3 + ad4;
    double ld3 = 309.2177145707566;
    fb1 = lb0 && ab1;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    ld3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, ld3, ad1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
    Output.points[2][8] += ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[3][0] += fd0;
    fd1 = ld3 + ad1;
    double ld4 = 18.637699388444997;

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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 297.99738116517443;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
    fb0 = fd0 > fd1;
    ld0 *= -1;
    double ld1 = 664.3804678897304;
    Output.points[3][1] += ld1;
    fb1 = fb0 || fb1;
    boolean lb2 = false;

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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought17.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        lb0 = fd1 > fd0;
        Thought lo4 = Thought347.getInstance();
        fd1 *= -1;
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
    fb0 = ad2 < ad3;
        ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought29.getInstance(fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
    Output.points[3][2] += ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 || fb0;
    Output.points[3][3] += ad2;
    boolean lb1 = false;
    ad3 = ad4 - fd0;
    double ld2 = 523.9351454529564;
    fd0 *= -1;
    fb0 = fd1 < ld2;
    ad1 *= -1;
    fb1 = lb1 || fb0;
    ad2 *= -1;
    double ld3 = 667.3763847292868;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Output.points[3][4] -= ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    Output.points[3][5] += ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought370.getInstance();

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
    Thought lo0 = Thought302.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 634.0905705786829;
    fb1 = !fb0;
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    ld1 *= -1;
    fb1 = lb2 && fb0;
    fb1 = fd0 > fd1;
    lb2 = fb0 || fb1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
    Output.points[3][6] -= fd0;
    Thought lo4 = Thought136.getInstance(ao1, ao2, ao3, ao4);
    fd1 = ld1 - fd0;
    lb3 = fd1 > ld1;
    Thought lo5 = Thought31.getInstance(fd0, fd1, ld1, fd0);
    double ld6 = 929.3607072481906;
    fb0 = !fb1;
    Output.points[3][7] += fd0;
    Thought lo7 = Thought65.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, ld6, fd0);
if(ao3 != null){
      fd1 = ao3.m3();
}
    lb2 = ld1 > ld6;
if(fo0 != null){
      ao4 = fo0.m4(lb3, fb0, fb1, lb2);
}
    lb3 = fd0 > fd1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld6, fd0, fd1, lb2, lb3, fb0, fb1);
}
    boolean lb8 = true;
    boolean lb9 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fb1 && fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        boolean lb0 = true;
        double ld1 = 621.8374416658174;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
        Thought lo2 = Thought284.getInstance(fd1, ld1, ad1, ad2);
        ad3 = ad4 + fd0;
        fd1 = ld1 - ad1;
        boolean lb3 = true;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 = ld1 + ad1;
        ad2 = ad3 + ad4;
        lb0 = fd0 > fd1;
if(ao4 != null){
          ao3 = ao4.m4(lb3, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, lb3, fb0, fb1, lb0);
}
        Thought lo4 = Thought338.getInstance(ad4, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
if(ao4 != null){
          lb3 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb3);
}
        fb0 = fb1 || lb0;
        Output.points[3][8] += ad1;
        ad2 = ad3 + ad4;
        boolean lb5 = true;
        Thought lo6 = Thought73.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, ad1);
}
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    Thought lo0 = Thought0.getInstance();
if(ao1 != null){
      ao1.m1(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fd1 > fd0;
    ab1 = ab2 || ab3;
    double ld2 = 268.2251214455403;
    ab4 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab2 = ao2.m2(ld2, fd0, fd1, ld2);
}
    fd0 *= -1;
    Thought lo3 = Thought292.getInstance(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld2 = fd0 - fd1;
if(ao3 != null){
      ld2 = ao3.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, lb1, lb4, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb1);
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
    double ld0 = 700.6727601861328;
    double ld1 = 546.5416944368337;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld1, ad1, ad2, ad3);
}
    Output.points[4][0] -= ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought219.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    if (fb0) {
        fb1 = ab1 && ab2;
        fd0 *= -1;
        ab3 = ab4 && fb0;
        fb1 = ab1 || ab2;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    Output.points[4][1] += fd1;
    fd0 = fd1 - fd0;
    lb0 = fb0 || fb1;
    double ld1 = 269.7577624631149;
    Thought lo2 = Thought324.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);

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
    fd0 *= -1;
    Thought lo0 = Thought275.getInstance();
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 *= -1;
    ab4 = fd1 < fd0;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1, lb2, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    lb1 = lb2 && lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      lb2 = fo0.m2();
}
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
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
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    Output.points[4][2] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = lb0 || lb1;
    Output.points[4][3] -= ad4;
    Output.points[4][4] += fd0;

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
    ab1 = ad2 < ad3;
    double ld0 = 323.1042993298905;
    ab2 = ad3 < ad4;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = fd0 < fd1;
    Thought lo3 = Thought99.getInstance(ld0, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      lb2 = fo0.m2();
}
    Output.points[4][5] -= ad4;

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
      ao1.m1(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
}
    fb0 = !fb1;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
    Thought lo4 = Thought108.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, lb1, lb2);
    lb3 = fb0 || fb1;
    if (lb0) {
        lb1 = lb2 && lb3;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
        boolean lb5 = false;
        boolean lb6 = true;
        boolean lb7 = true;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0);
}
        lb2 = !lb3;
        boolean lb8 = false;
        lb3 = fb0 || fb1;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        boolean lb9 = false;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought356.getInstance(fb0, fb1, fb0, fb1);
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 > ad3;
        double ld1 = 775.165080790699;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld1 = ad1 - ad2;
if(ao3 != null){
          ao3.m1(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ld1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    double ld0 = 445.74287051206954;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4();
}
        }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(ao1 != null){
      ao1.m3(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Thought lo1 = Thought252.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    double ld2 = 180.62634622057345;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    ld2 = fd0 - fd1;
    double ld4 = 108.70069845012503;
if(fo1 != null){
      ab4 = fo1.m2(ld0, ld2, ld4, fd0, fb0, fb1, lb3, ab1);
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought355.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought291.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 + ad3;
    ab1 = ad4 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
    Output.points[4][6] -= fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    Output.points[4][7] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb2 || ab1;

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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[4][8] += fd1;
    Thought lo0 = Thought220.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    double ld1 = 164.25757843395544;
    double ld2 = 149.45710803815703;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb3 = ld1 > ld2;
    Output.points[5][0] += fd0;
    fd1 *= -1;
    fb0 = fb1 && lb3;
if(fo1 != null){
      fb0 = fo1.m2(ld1, ld2, fd0, fd1);
}
    fb1 = lb3 && fb0;
    boolean lb4 = true;
    double ld5 = 450.23473753328756;
    fb0 = !fb1;
    Thought lo6 = Thought55.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, ld5, fd0);

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
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2();
}
    Thought lo0 = Thought93.getInstance(fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    Thought lo2 = Thought321.getInstance(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    Output.points[5][1] -= fd1;
    boolean lb3 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought96.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb3 = fo1.m2();
}
        fd0 = fd1 - fd0;
        boolean lb5 = true;
    lb5 = fd1 > fd0;
    Thought lo6 = Thought68.getInstance(fb0, fb1, lb1, lb3);
    boolean lb7 = false;
    lb5 = lb7 && fb0;
    Thought lo8 = Thought31.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, lb3, lb5);
    Output.points[5][2] += fd1;

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
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[5][3] -= fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought345.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
