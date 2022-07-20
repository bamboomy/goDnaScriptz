package genetic;
import java.util.ArrayList;
class Thought12 extends Thought{
private static ArrayList<Thought12> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 397.80168846052936;
private double fd1 = 694.1736829138252;
private Thought fo0 = null;
private Thought fo1 = null;
Thought12 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought12 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought12 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought12 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought12 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[6][5] -= fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 663.4486057986517;
    lb0 = fd0 < fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    double ld3 = 681.5222116165946;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1);
}
if(fo1 != null){
      lb2 = fo1.m2();
}
    Thought lo4 = Thought199.getInstance(fb0, fb1, lb0, lb2);
    ld3 = fd0 + fd1;

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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought355.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 && ab2;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    boolean lb4 = true;
    fd1 = fd0 - fd1;
    lb3 = fd0 < fd1;
    lb4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, lb3, lb4);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought16.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        double ld2 = 15.162399449580715;
        Thought lo3 = Thought12.getInstance(fd0, fd1, ld2, ad1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ld2 + ad1;
        fb1 = !lb1;
        ad2 = ad3 - ad4;
        } else if (fb0) {
        fd1 = ad1 - ad2;
        ad3 *= -1;
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
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ad1;
    Output.points[6][6] += ad2;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    ab2 = fd0 < fd1;
    Thought lo1 = Thought140.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
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
    Output.points[6][7] += fd0;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    double ld0 = 541.16673194231;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[6][8] -= fd1;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    double ld2 = 476.8403154517662;
if(ao1 != null){
      ld0 = ao1.m3(ld2, fd0, fd1, ld0);
}
    Output.points[7][0] -= ld2;
    fb0 = fd0 < fd1;
    ld0 = ld2 + fd0;
    fd1 = ld0 + ld2;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0);
}
if(ao1 != null){
      ld2 = ao1.m3();
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd0 = ao2.m3(lb1, fb0, fb1, lb1);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ld2, fd0, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
          lb1 = ao2.m2(fd1, ld0, ld2, fd0, fb0, fb1, lb1, fb0);
}
        Thought lo3 = Thought354.getInstance(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
        lb1 = !fb0;
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
    Output.points[7][1] += ad2;
        Thought lo0 = Thought120.getInstance(ao1, ao2, ao3, ao4);
    ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    double ld2 = 426.6329378495251;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
    ad4 = fd0 - fd1;
    boolean lb3 = true;
    ld2 = ad1 + ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb1, lb3, fb0);
}
    fb1 = lb1 && lb3;
    ld2 = ad1 + ad2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 922.8897747615124;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought335.getInstance(ao3, ao4, fo0, fo1);
    Output.points[7][2] += ld0;
    fd0 *= -1;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    fb0 = fd1 < ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    fb1 = !ab1;
        Thought lo2 = Thought61.getInstance(fd0, fd1, ld0, fd0);
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        fd1 = ld0 - fd0;
        ab1 = fd1 < ld0;
        ab2 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
        boolean lb4 = true;
        ab2 = fd0 < fd1;
        if (ab3) {
            ab4 = fb0 || fb1;
            Output.points[7][3] += ld0;
}}
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
    Thought lo0 = Thought354.getInstance();
    ab1 = ad2 > ad3;
    ab2 = ab3 && ab4;
    fb0 = ad4 > fd0;
    fb1 = !ab1;
        ab2 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    ab3 = ab4 && fb0;
    boolean lb1 = true;
    Thought lo2 = Thought315.getInstance(fb0, fb1, lb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought24.getInstance(fd1, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
    boolean lb4 = false;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    lb4 = ad2 > ad3;
    ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    double ld0 = 402.87638557202877;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2();
}
    double ld2 = 149.3920895870565;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb3, fb0, fb1);
}
    ld0 = ld2 + fd0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0, lb3, fb0, fb1, lb1);
}
    boolean lb4 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, fd0, fd1, lb3, lb4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, lb3, lb4, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld0);
}
    boolean lb5 = true;

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
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 981.6851718872267;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
    double ld2 = 844.6295165349323;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld2 *= -1;
    lb1 = ab1 || ab2;
    fd0 *= -1;
    ab3 = fd1 < ld0;
if(fo1 != null){
      ld2 = fo1.m3(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought293.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m1(ld2, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    ld2 *= -1;
    boolean lb4 = true;
    double ld5 = 858.3253928000618;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ld5 = fo0.m3(fd0, fd1, ld0, ld2);
}
    Thought lo6 = Thought82.getInstance(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld0);
    ab4 = fb0 && fb1;
    ld2 = ld5 - fd0;
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = lb4 && lb7;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 458.2164866744827;
    fb0 = ld0 > ad1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 406.98514237289595;
    Thought lo2 = Thought67.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    fb1 = !fb0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = false;
    double ld5 = 380.5297093671877;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
        boolean lb1 = true;
        ad4 = fd0 + fd1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(ad1, ad2, ad3, ad4);
}
        double ld2 = 481.2158862998723;
        boolean lb3 = false;
        boolean lb4 = true;
        lb4 = !ab1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
        Output.points[7][4] += ad1;
if(fo0 != null){
          ab2 = fo0.m2();
}
        ab3 = ab4 && fb0;
        Thought lo5 = Thought364.getInstance(fb1, lb0, lb1, lb3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought62.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    double ld1 = 34.45090163102591;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld2 = 512.7973755976941;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld1, ld2);
}
    Output.points[7][5] += fd0;
    Thought lo3 = Thought297.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, ld2, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld1 - ld2;
    boolean lb4 = true;

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
    boolean lb0 = true;
    lb0 = ad1 < ad2;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    Output.points[7][6] -= ad3;
    ad4 = fd0 - fd1;
    fb0 = ad1 < ad2;
    boolean lb1 = true;
    Thought lo2 = Thought318.getInstance(fb0, fb1, lb0, lb1);
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    lb1 = !fb0;
    fb1 = lb0 && lb1;
    fb0 = ad3 > ad4;
    fb1 = lb0 || lb1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld1 = 53.091209239866735;
    boolean lb2 = true;
    Thought lo3 = Thought95.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo4 = Thought368.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 - ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    fd1 = ld1 + fd0;
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1, lb5, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld1);
}
    Output.points[7][7] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
        Thought lo6 = Thought4.getInstance(lb2, lb5, ab1, ab2);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;

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
    ad1 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd1 > ad1;
    ab1 = ab2 || ab3;
    Output.points[7][8] += ad2;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 - fd0;
    Output.points[8][0] -= fd1;
    ab2 = ad1 < ad2;
    ad3 *= -1;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    ab3 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab4 = ad3 < ad4;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, ab1, ab2);
}
    fd1 *= -1;
    boolean lb1 = false;
    ad1 *= -1;
    double ld2 = 654.4451416018736;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    Output.points[8][1] += fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;

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
    Thought lo0 = Thought388.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    if (fb0) {
        fb1 = ab1 || ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1);
}
        ab3 = fd0 > fd1;
        fd0 *= -1;
        ab4 = fd1 < fd0;
        if (fb0) {
            fd1 *= -1;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
            fb1 = fd0 > fd1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
    Output.points[8][2] -= fd0;
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought331.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    ad4 *= -1;
    fd0 *= -1;
    double ld1 = 484.7655307141889;
    fb1 = !fb0;
    fd0 = fd1 + ld1;
    fb1 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ld1 - ad1;
    fb0 = fb1 && fb0;

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
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought333.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
    ab3 = ab4 || fb0;
    ad2 = ad3 - ad4;
    Output.points[8][4] += fd0;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;

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
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
}
    if (lb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        Thought lo2 = Thought162.getInstance();
        if (fb0) {
            fb1 = fd1 > fd0;
            lb0 = lb1 && fb0;
            fd1 = fd0 - fd1;
            boolean lb3 = true;
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
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb0 = false;
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    Output.points[8][5] += ad3;
    Thought lo1 = Thought379.getInstance(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    lb0 = fd1 > ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    boolean lb2 = true;
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = fd0 > fd1;
    boolean lb0 = false;
    Thought lo1 = Thought370.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    ab1 = fd1 < fd0;
    if (ab2) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fd1 *= -1;
        ab3 = ab4 && fb0;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fb1 = lb0 && ab1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2();
}
    Output.points[8][6] += ad1;
    boolean lb1 = true;
    ad2 *= -1;
if(ao3 != null){
      lb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    Thought lo2 = Thought338.getInstance(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld3 = 816.0210189978991;
    boolean lb4 = true;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld3, ad1);
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
    double ld0 = 185.0677970357937;
    Thought lo1 = Thought43.getInstance();
    Output.points[8][7] -= fd0;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(lb2, fb0, fb1, lb2);
}
    fb0 = fd1 < ld0;
    fd0 *= -1;
    boolean lb3 = true;
    double ld4 = 794.5979972308911;
    fb0 = fd0 > fd1;
    boolean lb5 = false;
    boolean lb6 = true;
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld4, fd0, fd1, lb6, lb7, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(ld4, fd0, fd1, ld0, lb2, lb3, lb5, lb6);
}
    ld4 = fd0 + fd1;
    double ld8 = 886.1098402113587;
    ld0 = ld4 + ld8;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb7, fb0, fb1, lb2);
}
    lb3 = fd0 > fd1;
    ld0 = ld4 + ld8;
    lb5 = fd0 < fd1;

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
    boolean lb0 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][8] -= fd0;
    Output.points[0][0] += fd1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    Thought lo2 = Thought112.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld3 = 739.6350928101086;
    if (fb0) {
        double ld4 = 640.9281093025888;
        boolean lb5 = true;
        double ld6 = 103.95932089527943;
        fb0 = ld4 < ld6;
        fb1 = lb5 && lb0;
        boolean lb7 = false;
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
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (lb0) {
        Output.points[0][1] -= fd1;
        boolean lb2 = true;
        lb0 = lb1 || fb0;
        ad1 = ad2 - ad3;
if(fo0 != null){
          fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ad3 = ad4 + fd0;
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    if (fb0) {
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
    fd0 *= -1;
    boolean lb0 = true;
    if (fb0) {
        Thought lo1 = Thought295.getInstance();
        Output.points[0][2] += fd1;
        Output.points[0][3] += fd0;
if(ao2 != null){
          fb1 = ao2.m2(lb0, fb0, fb1, lb0);
}
        boolean lb2 = false;
        lb0 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb2, lb0, fb0, fb1);
}
if(ao3 != null){
          lb2 = ao3.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb2);
}
        boolean lb3 = false;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        lb3 = fd1 < fd0;
        boolean lb4 = false;
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              lb4 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
              ao3.m3(fd1, fd0, fd1, fd0);
}
            lb0 = fb0 || fb1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
            fd1 *= -1;
            for(int i1=0; i1<10; i1++){
if(fo0 != null){
                  ao4 = fo0.m4();
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 475.7697157953599;
    double ld1 = 889.2724967040987;
    double ld2 = 291.8712622223452;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > ld1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 = ld2 - ad1;
    ad2 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ld0 > ld1;
    fb1 = ld2 > ad1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo3 = Thought82.getInstance();

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - fd0;
    fb1 = ab1 || ab2;
    ab3 = fd1 > fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought376.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought347.getInstance(ao2, ao3, ao4, fo0);
    double ld2 = 874.5615616352709;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0);
}
    boolean lb3 = false;
    fd1 = ld2 - fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought7.getInstance(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m2();
}
    boolean lb0 = false;
    ab4 = !fb0;
    ad2 *= -1;
    fb1 = !lb0;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought47.getInstance(ab4, fb0, fb1, lb0);
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, fb1, lb0, lb2, ab1);
}
    ab2 = ab3 && ab4;
    Output.points[0][4] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
    ab1 = ad1 < ad2;
    ab2 = ab3 && ab4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 + fd0;
    fb1 = lb0 || lb2;
    ab1 = fd1 < ad1;
    ab2 = ad2 > ad3;
    Thought lo3 = Thought395.getInstance(ad4, fd0, fd1, ad1);
    boolean lb4 = true;
    boolean lb5 = true;
    ad2 = ad3 - ad4;

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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought115.getInstance(fb1, fb0, fb1, fb0);
    Output.points[0][5] -= fd1;
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought93.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    Output.points[0][6] -= fd1;
    boolean lb3 = false;
    Output.points[0][7] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb4 = false;
    lb3 = lb4 && fb0;
    double ld5 = 519.7960996325633;
    boolean lb6 = false;
    double ld7 = 761.9732931337107;
    fb0 = ld5 > ld7;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld5, ld7, fd0);
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
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb1, lb2, fb0);
}
    fb1 = fd0 < fd1;
        Output.points[0][8] -= fd0;
    fd1 = fd0 - fd1;
    Output.points[1][0] += fd0;
    lb0 = fd1 < fd0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
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
    Output.points[1][1] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    double ld0 = 412.49264833853283;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2();
}
    fb0 = !fb1;
        ld0 *= -1;
    lb1 = fd0 > fd1;

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
