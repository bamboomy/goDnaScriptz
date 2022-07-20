package genetic;
import java.util.ArrayList;
class Thought179 extends Thought{
private static ArrayList<Thought179> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 383.157265321597;
private double fd1 = 167.84230811620532;
private Thought fo0 = null;
private Thought fo1 = null;
Thought179 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought179 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought179 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought179 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought179 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought179 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought179 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought179 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought179 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought179 instance = new Thought179 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought179 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought179 instance = new Thought179 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought179 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought179 instance = new Thought179 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought179 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought179 instance = new Thought179 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought179 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought179 instance = new Thought179 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought179 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought179 instance = new Thought179 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought179 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought179 instance = new Thought179 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought179 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought179 instance = new Thought179 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
    fd1 = fd0 + fd1;
    fb1 = !lb0;
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    fd0 *= -1;
    fb1 = fd1 > fd0;
            fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought310.getInstance();
if(fo0 != null){
      fd1 = fo0.m3(lb2, fb0, fb1, lb0);
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
    Thought lo0 = Thought71.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    Thought lo1 = Thought176.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
        fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    double ld3 = 341.69024394251693;
    double ld4 = 71.66111027444265;
if(fo1 != null){
      fb0 = fo1.m2();
}
    double ld5 = 164.65553663839285;
    double ld6 = 731.4765914222162;
    fb1 = lb2 && ab1;
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, ld5, ld6, fd0, lb7, ab1, ab2, ab3);
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
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 > fd1;
    double ld0 = 383.0051233592896;
    boolean lb1 = false;
        Thought lo2 = Thought143.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb1 = !lb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m2();
}
    ad4 = fd0 - fd1;
    fb0 = fb1 && lb1;
    fb0 = ld0 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
        fd1 *= -1;
    ld0 = ad1 + ad2;
    fb0 = ad3 < ad4;

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
    ab1 = ad2 > ad3;
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 258.87565854166166;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ld2 = ad1 - ad2;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    boolean lb3 = false;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb3 = fd0 > fd1;
    ld2 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb4 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    if (lb1) {
        ld2 = ad1 - ad2;
        lb3 = lb4 && ab1;
        boolean lb5 = false;
        ab1 = ad3 > ad4;
if(fo0 != null){
          ab2 = fo0.m2(fd0, fd1, ld2, ad1, ab3, ab4, fb0, fb1);
}
        lb5 = !lb0;
        ad2 *= -1;
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
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      fb1 = ao3.m2(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    Output.points[6][4] += fd1;
    fd0 *= -1;
    fb1 = !lb0;

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
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld0 = 711.3457990832269;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Output.points[6][5] -= ad3;
    fb0 = !fb1;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
    lb1 = fb0 && fb1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ad1, ad2);
}
    lb1 = !fb0;
    fb1 = ad3 < ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
    Thought lo2 = Thought272.getInstance();

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
      ao1.m1(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && ab1;
    fd1 *= -1;
    double ld0 = 849.9085486895084;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    double ld1 = 595.9788233335155;
    Output.points[6][6] += ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    double ld2 = 799.5904684582811;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld2 *= -1;
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ld0, ld1, ld2, fd0);
}
    double ld3 = 308.4928119108031;
    Thought lo4 = Thought19.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
    ld2 = ld3 - fd0;
    boolean lb5 = false;
    fd1 = ld0 - ld1;
    Thought lo6 = Thought247.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb5);
}
    ld2 *= -1;
    boolean lb7 = true;

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
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    ab3 = ad2 < ad3;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
        ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought156.getInstance();
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, ab1);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld3 = 169.95729353059238;
    boolean lb4 = true;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld3, ad1);
}
    lb4 = !ab1;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    boolean lb1 = false;
    fb0 = !fb1;
    Thought lo2 = Thought89.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    boolean lb3 = true;
    double ld4 = 163.37853291629602;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, fb1, lb0, lb1, lb3);
}
if(fo0 != null){
      fo0.m3(fd1, ld4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld4, fd0);
}
    boolean lb5 = true;
    boolean lb6 = false;
    fd1 = ld4 - fd0;
    fd1 = ld4 + fd0;
    fd1 = ld4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4);
}
if(fo1 != null){
      lb1 = fo1.m2();
}
    lb3 = lb5 || lb6;
    double ld7 = 772.0952456382024;

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
    fd1 *= -1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    lb1 = fd1 < fd0;
    if (ab1) {
        ab2 = !ab3;
        ab4 = fd1 < fd0;
        double ld2 = 967.1220336694106;
        } else if (fb0) {
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
        Thought lo3 = Thought115.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 - fd1;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        Thought lo4 = Thought131.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        boolean lb5 = false;
        Output.points[6][7] += fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb5 = fd1 > fd0;
        lb0 = lb1 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought4.getInstance(fo0, fo1, fo0, fo1);
    ad1 *= -1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    Thought lo2 = Thought353.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    double ld3 = 226.71894804714296;
    lb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    fd1 = ld3 - ad1;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3();
}
    Thought lo4 = Thought36.getInstance(lb1, fb0, fb1, lb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld3, fb1, lb1, fb0, fb1);
}
    Output.points[6][8] -= ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ld3, ad1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought346.getInstance(fo1, fo0, fo1, fo0);
    ab2 = ad2 < ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    Output.points[7][0] -= ad2;
    Thought lo1 = Thought203.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    Output.points[7][1] -= ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      ab1 = fo0.m2();
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb2, lb3, ab1);
}
    Thought lo4 = Thought237.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    boolean lb5 = true;
    fb0 = fb1 && lb2;
    Output.points[7][2] -= fd0;
    Thought lo6 = Thought201.getInstance(fo0, fo1, fo0, fo1, lb3, lb5, ab1, ab2);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        boolean lb7 = false;
    boolean lb8 = true;

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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 649.7476587268121;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought211.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0);
}
    Thought lo2 = Thought342.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
    fb0 = fb1 && fb0;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = ld0 > fd0;
    fb1 = fd1 < ld0;
    lb3 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb3);
}
    fb0 = fd0 > fd1;
    ld0 = fd0 + fd1;
    fb1 = lb3 || fb0;

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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    Output.points[7][3] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 || lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought279.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad3 = ao3.m3(fb1, lb0, lb1, fb0);
}
    boolean lb3 = false;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, lb3, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, lb3, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = ad3 > ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2();
}
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(lb1, lb3, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 34.99293646946057;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    ab3 = !ab4;
    boolean lb1 = false;
    ab4 = fd0 < fd1;
    fb0 = !fb1;
    Output.points[7][4] -= ld0;
    boolean lb2 = false;

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
if(ao1 != null){
      ao1.m3();
}
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
        ad4 = fd0 - fd1;
    boolean lb0 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought183.getInstance(ao4, fo0, fo1, ao1);
    Output.points[7][5] += fd0;
if(ao2 != null){
      ao2.m2(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    lb2 = ad3 < ad4;
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}

Thought.STACK_COUNTER++;
return lb4;
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
    Output.points[7][6] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb1 = fb0 || fb1;
    Output.points[7][7] -= fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = !lb1;
    Thought lo2 = Thought317.getInstance(fb0, fb1, lb0, lb1);

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = !fb0;
    Thought lo0 = Thought152.getInstance(fo0, fo1, fo0, fo1);
        fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
        fd1 = fd0 + fd1;
        Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][8] += ad1;
    Output.points[8][0] -= ad2;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought205.getInstance(fd1, ad1, ad2, ad3);
    double ld1 = 487.07622502879326;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
              fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[8][1] -= ld1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;

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
    double ld0 = 116.0050658308885;
if(fo0 != null){
      fo0.m1(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        double ld2 = 986.8270544680429;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
        ad4 = fd0 - fd1;
        ab1 = ld2 < ld0;
        Output.points[8][2] += ad1;
        Thought lo3 = Thought210.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        ab2 = !ab3;
        Thought lo4 = Thought338.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, ld0, ad1);
if(fo1 != null){
          fo1.m3();
}
        Thought lo5 = Thought242.getInstance(ab4, fb0, fb1, lb1);
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        ld2 *= -1;
        Thought lo6 = Thought368.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
        boolean lb7 = true;
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
    Output.points[8][3] -= fd0;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    double ld0 = 974.3430600808396;
    double ld1 = 421.7695427310629;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld0);
}
    ld1 = fd0 + fd1;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ld1, fd0, fd1);
}
if(ao3 != null){
      ao3.m2();
}
    ld0 = ld1 - fd0;
if(ao4 != null){
      ao4.m2(lb2, fb0, fb1, lb2);
}
    fd1 *= -1;
    Thought lo3 = Thought256.getInstance(fo0, fo1, ao1, ao2, ld0, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
    Output.points[8][4] -= ld0;

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
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    Output.points[8][5] -= ad2;
    fb1 = lb0 && fb0;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad4 = ao4.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
    boolean lb2 = false;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    lb2 = fb0 || fb1;
    double ld3 = 23.23842598771916;
        ad4 = fd0 + fd1;
    double ld4 = 691.4378229611323;

Thought.STACK_COUNTER++;
return ld3;
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
    ab4 = fd1 < fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    lb2 = !ab1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb4 = !ab1;
    fd0 *= -1;
    Thought lo5 = Thought123.getInstance(ab2, ab3, ab4, fb0);
    Thought lo6 = Thought63.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, lb3, lb4, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
        lb1 = lb2 || lb3;
    Thought lo7 = Thought143.getInstance(ao1, ao2, ao3, ao4);

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
    ad1 = ad2 + ad3;
    Output.points[8][6] += ad4;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought176.getInstance(ad2, ad3, ad4, fd0);
    Output.points[8][7] += fd1;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 < ad1;
    Thought lo1 = Thought243.getInstance();
    ab2 = ad2 > ad3;
    double ld2 = 507.57640933721405;

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
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    Thought lo1 = Thought120.getInstance(fb0, fb1, lb0, fb0);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    double ld2 = 559.7146788223308;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = ld2 - fd0;
    fd1 = ld2 - fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb3 = !fb0;
    ld2 = fd0 + fd1;
    ld2 *= -1;
    Thought lo4 = Thought320.getInstance(fd0, fd1, ld2, fd0);
    fb1 = lb0 && lb3;
    fd1 = ld2 + fd0;

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
    Thought lo0 = Thought183.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    Output.points[8][8] -= fd0;
    fd1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought70.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Output.points[0][0] += ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld1 = 740.5789147189682;
    Output.points[0][1] += ad3;
    ad4 *= -1;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought262.getInstance();
    Thought lo3 = Thought303.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = ad1 < ad2;
    fb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ld1 > ad1;
    double ld4 = 113.52549126464716;
    double ld5 = 381.93297708547794;
if(fo1 != null){
      fo1.m1(ld5, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;

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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
    ab2 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    Output.points[0][2] -= fd1;
    boolean lb1 = false;
    Thought lo2 = Thought74.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
        ad1 = ad2 - ad3;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = lb3 || ab1;
    ab2 = ad4 < fd0;
    ab3 = ab4 && fb0;
    fb1 = lb0 || lb1;
    fd1 = ad1 + ad2;
    Output.points[0][3] -= ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb4 = true;
    lb3 = fd0 > fd1;
    boolean lb5 = false;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
        Thought lo0 = Thought380.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;

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
    boolean lb0 = false;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    ad4 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    Output.points[0][4] += ad3;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        Thought lo2 = Thought107.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
        fd0 = fd1 + ad1;
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought109.getInstance(ao1, ao2, ao3, ao4);
    Output.points[0][5] -= fd1;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    Output.points[0][6] -= fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
    lb2 = ab1 && ab2;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = !lb2;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    Thought lo3 = Thought304.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, lb2, ab1);
    Output.points[0][7] -= fd0;

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
    Thought lo0 = Thought162.getInstance(ao1, ao2, ao3, ao4);
        ad2 = ad3 + ad4;
    boolean lb1 = false;
    double ld2 = 686.0945820929819;
    ab3 = ad4 > fd0;
    ab4 = !fb0;
    fb1 = fd1 > ld2;
if(fo0 != null){
      lb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought19.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ad1);
    ab1 = ab2 || ab3;
if(ao4 != null){
      ad2 = ao4.m3();
}
    boolean lb4 = false;
    ab3 = ad3 < ad4;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m1(fb1, lb1, lb4, ab1);
}
    boolean lb5 = false;
    fd0 *= -1;
    Thought lo6 = Thought341.getInstance(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
    fb0 = ad3 > ad4;
if(ao4 != null){
      ao4.m1(fd0, fd1, ld2, ad1, fb1, lb1, lb4, lb5);
}
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
    ld2 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo0 = Thought112.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 654.278673597405;
    Output.points[0][8] += fd0;
    Thought lo2 = Thought176.getInstance(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 - fd1;
    fb1 = fb0 && fb1;

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
    Thought lo0 = Thought21.getInstance(fd0, fd1, fd0, fd1);
    Output.points[1][0] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
        fb1 = fd0 < fd1;
    double ld1 = 179.52103932166966;
    Output.points[1][1] += ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    ld1 = fd0 - fd1;
    Output.points[1][2] -= ld1;
    fd0 = fd1 + ld1;
    fb1 = fb0 && fb1;
    double ld2 = 351.8853841371961;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0);
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
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought3.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        Output.points[1][3] += fd0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought199.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][4] += fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
    Output.points[1][5] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;

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
