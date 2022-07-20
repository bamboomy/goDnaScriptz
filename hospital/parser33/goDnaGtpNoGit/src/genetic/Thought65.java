package genetic;
import java.util.ArrayList;
class Thought65 extends Thought{
private static ArrayList<Thought65> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 160.96473911845933;
private double fd1 = 664.1555586132911;
private Thought fo0 = null;
private Thought fo1 = null;
Thought65 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought65 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought65 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought65 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought65 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    if (fb1) {
        Thought lo0 = Thought334.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        fd1 = fd0 - fd1;
        fb0 = !fb1;
        fb0 = !fb1;
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        fb1 = fd0 < fd1;
        Thought lo1 = Thought266.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fd0 = fd1 - fd0;
        boolean lb2 = true;
        fd1 = fd0 - fd1;
        lb2 = !fb0;
        Output.points[4][7] -= fd0;
        fb1 = lb2 && fb0;
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo0 = Thought249.getInstance(fd1, fd0, fd1, fd0);
    fb1 = !ab1;
    fd1 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && ab1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought361.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought200.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fb0 = !fb1;
    boolean lb2 = false;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    ad2 = ad3 + ad4;
    Thought lo3 = Thought80.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    fb1 = !lb2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    Thought lo4 = Thought305.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    double ld5 = 248.61775204952423;

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
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    double ld1 = 467.7184236255871;
    ab4 = !fb0;
    fb1 = ad3 > ad4;
    lb0 = fd0 > fd1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = ld1 < ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fb0, fb1, lb0, ab1);
}
        boolean lb2 = true;
        ad2 *= -1;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb2;
if(fo0 != null){
          fo0.m1(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
        lb0 = ab1 || ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, ad1, ad2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought276.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 *= -1;
    fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;

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
    ad2 = ad3 + ad4;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 *= -1;
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    lb0 = fb0 || fb1;
    double ld1 = 583.3761691147056;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
    double ld3 = 153.44867537911014;

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
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    Thought lo0 = Thought238.getInstance();
    ab4 = !fb0;
    fb1 = ab1 && ab2;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    ad3 = ad4 - fd0;
    double ld1 = 34.28312317713502;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    if (lb2) {
        fd0 = fd1 - ld1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab1 = ad1 > ad2;
        boolean lb3 = true;
        boolean lb4 = false;
        ad3 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ld1);
}
        lb2 = ab1 || ab2;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao3.m3();
}
if(ao4 != null){
          ao4.m3(ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd1, ld1, ad1, ad2, lb3, lb4, lb0, lb2);
}
        ab1 = ad3 < ad4;
        ab2 = ab3 || ab4;
if(ao4 != null){
          ao4.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb3, lb4);
}
        } else if (ab1) {
if(fo0 != null){
          ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        double ld5 = 396.60952933251315;
        lb0 = ad1 > ad2;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
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
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 854.9434792905952;
    fb0 = fb1 || fb0;
    boolean lb1 = false;

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
        double ld0 = 61.546292931209294;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought261.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    Output.points[4][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
        ab1 = !ab2;
    ab3 = fd0 > fd1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;

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
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought218.getInstance();
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    Output.points[5][0] -= ad4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought145.getInstance(ad1, ad2, ad3, ad4);
    Thought lo3 = Thought53.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought12.getInstance(fb1, lb1, fb0, fb1);
    lb1 = ad3 > ad4;
    boolean lb5 = true;
    fd0 *= -1;
    double ld6 = 200.4816179983239;
    fd0 = fd1 - ld6;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    Thought lo0 = Thought16.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    Output.points[5][1] += fd0;
        Thought lo2 = Thought217.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    lb1 = ad4 < fd0;
    ab1 = ab2 || ab3;
    Thought lo3 = Thought312.getInstance();

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
    fd1 = fd0 - fd1;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[5][2] += fd1;
    Thought lo0 = Thought213.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        double ld1 = 169.88724742515183;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao1 = ao2.m4(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
            fd0 = fd1 + ld1;
            boolean lb2 = false;
if(ao3 != null){
              fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
              ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
            for(int i2=0; i2<10; i2++){
                fb0 = fb1 && lb2;
                fb0 = ld1 > fd0;
if(ao4 != null){
                  ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
if(ao3 != null){
                  ld1 = ao3.m3();
}
                fd0 = fd1 + ld1;
                fd0 = fd1 - ld1;
}}}
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
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
if(ao4 != null){
          ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought280.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        Output.points[5][3] += fd0;
        boolean lb1 = true;
        fd1 = ad1 - ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fb1 = lb1 || fb0;
        fb1 = !lb1;
        boolean lb2 = false;
        lb2 = ad4 > fd0;
        fb0 = fd1 < ad1;
if(ao2 != null){
          ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 - ad3;
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
        fb1 = lb1 || lb2;
if(ao2 != null){
          fb0 = ao2.m2();
}
        fb1 = !lb1;
        lb2 = fb0 || fb1;
        Output.points[5][4] -= ad3;
        lb1 = ad4 < fd0;
if(ao3 != null){
          ao3.m3(lb2, fb0, fb1, lb1);
}
        fd1 = ad1 + ad2;
        lb2 = ad3 > ad4;
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
    ab2 = !ab3;
    Thought lo0 = Thought163.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    Thought lo1 = Thought330.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        fd0 = fd1 - ad1;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
        Output.points[5][5] += ad1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        boolean lb0 = false;
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
        ab2 = !ab3;
        ab4 = fd1 < ad1;
        ad2 = ad3 - ad4;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 90.67292438992362;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m3();
}
    boolean lb1 = true;
if(fo1 != null){
      ld0 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought350.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb1;
    fb0 = !fb1;
    boolean lb3 = true;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
    boolean lb1 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[5][6] -= ad1;
    Thought lo1 = Thought176.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 371.44101990689734;
    boolean lb3 = false;
    if (fb0) {
        } else if (fb1) {
        lb0 = ad1 > ad2;
        lb3 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        lb0 = ld2 < ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb0 = false;
    Output.points[5][7] -= ad2;
    ab1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    boolean lb1 = false;
    double ld2 = 172.07665504677993;
    ad4 = fd0 + fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, lb3, ab1, ab2, ab3);
}
    boolean lb4 = true;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, lb3, lb4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
    Output.points[5][8] += ad4;
    boolean lb0 = false;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    ad3 *= -1;
    lb0 = !fb0;
    ad4 = fd0 - fd1;
    Output.points[6][0] -= ad1;
    Output.points[6][1] += ad2;

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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought288.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    Thought lo1 = Thought268.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    double ld2 = 365.3274521524607;
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
    ab4 = ld2 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ld2 + fd0;
    fb0 = fd1 < ld2;
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought187.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, ab4, fb0, fb1, ab1);
    fd1 = ld2 + fd0;
    ab2 = fd1 > ld2;
    Thought lo4 = Thought396.getInstance(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
    boolean lb5 = false;
    Thought lo6 = Thought235.getInstance(ao3, ao4, fo0, fo1, lb5, ab1, ab2, ab3);
    ab4 = fd1 < ld2;
    boolean lb7 = true;
    Output.points[6][2] += fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld2, fd0, fd1);
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
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[6][3] -= fd1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 992.0916044494186;
if(ao4 != null){
      ao4.m1(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb2 = false;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2, lb0, lb2, ab1, ab2);
}
    boolean lb3 = false;
    ad3 = ad4 - fd0;
    ab2 = fd1 < ld1;
    ad1 *= -1;
    ab3 = ab4 || fb0;
    Thought lo4 = Thought144.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, lb2, lb3);

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
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = !fb0;
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = fd0 > fd1;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(lb2, fb0, fb1, lb0);
}
    lb1 = fd1 < fd0;
    lb2 = fd1 > fd0;
    double ld3 = 636.2410276718084;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, fb0, fb1, lb0, lb1);
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
    Thought lo0 = Thought59.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    for(int i0=0; i0<10; i0++){
        ab2 = fd1 > fd0;
if(fo1 != null){
          ab3 = fo1.m2();
}
if(fo0 != null){
          fd1 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
        ab3 = ab4 || fb0;
        boolean lb1 = false;
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
        ab2 = ab3 || ab4;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab3 = !ab4;
        fd0 *= -1;
        double ld2 = 206.12526340014333;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ld2, fd0);
}
        Thought lo3 = Thought188.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
        fb1 = lb1 || ab1;
        for(int i1=0; i1<10; i1++){
            boolean lb4 = false;
            ab1 = ab2 || ab3;
}}
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
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ad1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Output.points[6][4] += ad2;
    fb1 = ad3 > ad4;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fb1 = ad1 < ad2;
    double ld0 = 183.02684326709362;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld1 = 807.4018292401869;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    double ld0 = 754.8010345741457;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
        boolean lb1 = true;
        ld0 = ad1 + ad2;
        ab1 = !ab2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb2 = false;
        lb1 = !lb2;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
        ab1 = ad1 > ad2;
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
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought198.getInstance();
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought247.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        boolean lb2 = true;
    lb2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Output.points[6][5] -= fd0;
    Output.points[6][6] -= fd1;
    boolean lb3 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb2);
}
    lb3 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo4 = Thought64.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    lb2 = lb3 && fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2();
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
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = ad2 < ad3;
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
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
    ab2 = fd1 > fd0;
    double ld0 = 256.46597354215737;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    ab3 = !ab4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;

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
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
    ab3 = ab4 && fb0;
    Output.points[6][7] -= ad3;
    boolean lb0 = false;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought332.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    Output.points[6][8] += ad1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    Output.points[7][0] -= ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ad1);
}
    lb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    Thought lo2 = Thought110.getInstance();
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    fb0 = ad1 < ad2;
    double ld3 = 548.4239403488311;

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
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought174.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    double ld0 = 924.2258361356069;
    fb1 = fd0 < fd1;
    ld0 = fd0 + fd1;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    Thought lo2 = Thought78.getInstance(fb0, fb1, lb1, fb0);
    double ld3 = 0.8555033569997303;
    double ld4 = 231.1200267075994;
    boolean lb5 = true;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld3, ld4, fd0, fd1, fb0, fb1, lb1, lb5);
}
    boolean lb6 = false;
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld3, ld4, fd0, lb6, lb7, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb5, lb6, lb7);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld3, ld4, fd0);
}
    lb1 = fd1 < ld0;
    lb5 = lb6 && lb7;
    fb0 = !fb1;
    boolean lb8 = true;

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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m2();
}
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = !lb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo1 = Thought115.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    boolean lb2 = false;
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
}
