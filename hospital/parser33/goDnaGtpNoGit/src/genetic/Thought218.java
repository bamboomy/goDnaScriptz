package genetic;
import java.util.ArrayList;
class Thought218 extends Thought{
private static ArrayList<Thought218> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 386.94932909504126;
private double fd1 = 942.3443718977887;
private Thought fo0 = null;
private Thought fo1 = null;
Thought218 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought218 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought218 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought218 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought218 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought218 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought218 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought218 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought218 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought218 instance = new Thought218 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought218 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought218 instance = new Thought218 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought218 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought218 instance = new Thought218 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought218 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought218 instance = new Thought218 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought218 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought218 instance = new Thought218 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought218 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought218 instance = new Thought218 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought218 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought218 instance = new Thought218 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought218 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought218 instance = new Thought218 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    Thought lo1 = Thought55.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 910.1690893137105;
    fd0 = fd1 - ld2;
    fb0 = fd0 > fd1;
    ld2 *= -1;
    fb1 = lb0 || fb0;
    fd0 = fd1 + ld2;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;

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
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Output.points[2][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
        double ld0 = 702.6050748460809;
        ld0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
        fd1 = ld0 - ad1;
        boolean lb1 = true;
        fb0 = !fb1;
        boolean lb2 = false;
        Output.points[2][4] -= ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
        lb1 = lb2 && fb0;
        fb1 = lb1 || lb2;
        fb0 = fb1 || lb1;
if(fo0 != null){
          ad1 = fo0.m3();
}
        ad2 = ad3 + ad4;
if(fo1 != null){
          lb2 = fo1.m2(fb0, fb1, lb1, lb2);
}
        fb0 = !fb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          lb1 = fo1.m2(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
}
        fd1 = ld0 - ad1;
        lb2 = fb0 && fb1;
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
        boolean lb0 = false;
    lb0 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad1 > ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought251.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb0 = !ab1;
    ab2 = !ab3;
if(fo0 != null){
      ad1 = fo0.m3();
}
    Output.points[2][5] += ad2;
    ab4 = ad3 > ad4;
    fd0 *= -1;
    fb0 = !fb1;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought190.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought226.getInstance(fd1, ad1, ad2, ad3);

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
    double ld0 = 205.2919299402788;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      ao1.m1();
}
    fb0 = fd1 > ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    double ld1 = 554.3400049409998;
    Output.points[2][6] -= ld1;
    Thought lo2 = Thought37.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ld0 + ld1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld1, fd0);
}
    Thought lo3 = Thought51.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0);
    fd1 = ld0 - ld1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    boolean lb4 = true;
    lb4 = fb0 || fb1;

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
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought59.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb1 = true;
    lb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    if (fb1) {
if(fo1 != null){
          ad3 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
          ao1.m3(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb1 = fd1 < fd0;
    Thought lo2 = Thought117.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[2][7] -= fd1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, lb1, ab1);
}
        fd0 *= -1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld3 = 495.9589318374446;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld3, fd0);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1);
}
    ab4 = fb0 && fb1;

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
      ad1 = ao1.m3();
}
if(ao2 != null){
      ad2 = ao2.m3(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = !fb0;
    boolean lb1 = false;
    Thought lo2 = Thought134.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
    ab1 = ad1 > ad2;
    boolean lb3 = true;
if(ao1 != null){
      ao1.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    boolean lb4 = true;

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
    boolean lb0 = true;
    double ld1 = 572.0974874962725;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = fb0 && fb1;
    Thought lo3 = Thought305.getInstance(fd0, fd1, ld1, fd0);
    Thought lo4 = Thought10.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
    lb0 = !lb2;
if(fo0 != null){
      ld1 = fo0.m3();
}
    if (fb0) {
        fb1 = !lb0;
if(fo1 != null){
          fo1.m1(lb2, fb0, fb1, lb0);
}
        boolean lb5 = false;
        fd0 = fd1 + ld1;
        lb0 = fd0 > fd1;
        ld1 *= -1;
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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb0;
        double ld1 = 848.3335335296164;
        ab1 = fd0 > fd1;
        Output.points[2][8] -= ld1;
        boolean lb2 = true;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        Thought lo3 = Thought229.getInstance();
        Thought lo4 = Thought240.getInstance(lb0, lb2, ab1, ab2);
        Thought lo5 = Thought142.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
        lb0 = lb2 && ab1;
        Output.points[3][0] += ld1;
        }
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo6 = Thought174.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    double ld7 = 300.6016929381201;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld0 = 972.8217473555309;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    ld0 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    lb1 = ld0 < ad1;
        fb0 = ad2 > ad3;
    fb1 = lb1 && fb0;
    fb1 = lb1 && fb0;
    fb1 = ad4 > fd0;
    double ld2 = 946.9039608499348;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ld0, ld2);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    Output.points[3][1] += fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    Thought lo0 = Thought79.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought360.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ab2 = ab3 || ab4;
    ad4 = fd0 - fd1;
    fb0 = fb1 && lb2;
    Thought lo4 = Thought52.getInstance();
    lb3 = !ab1;
    ad1 = ad2 - ad3;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought39.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
    boolean lb2 = true;
    Output.points[3][2] += fd1;
    boolean lb3 = false;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
    lb0 = lb2 || lb3;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    double ld4 = 858.3687049688995;
    fd0 = fd1 - ld4;
    Output.points[3][3] -= fd0;
    Thought lo5 = Thought348.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb2);
    boolean lb6 = true;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    lb3 = lb6 && fb0;
    double ld7 = 439.8966782819883;
    ld4 *= -1;
    Thought lo8 = Thought348.getInstance(ld7, fd0, fd1, ld4);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ld7, fd0, fd1, ld4);
}
    lb0 = lb2 || lb3;
    ld7 *= -1;
    boolean lb9 = false;
    boolean lb10 = false;
    lb6 = lb9 || lb10;
    fd0 *= -1;

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
        fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 = fd0 + fd1;
    Thought lo0 = Thought356.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = ad1 < ad2;
    double ld2 = 340.10493213583646;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
        boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, ad1, ad2, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, lb3, fb0, fb1);
}
    boolean lb4 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld2);
}
    ad1 *= -1;
    Output.points[3][4] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2);
}
if(fo0 != null){
      lb1 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(lb3, lb4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, lb3, lb4, fb0);
}
    fd0 = fd1 + ld2;
    double ld5 = 927.795970185944;
    ld5 = ad1 + ad2;
    Thought lo6 = Thought358.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, lb3, lb4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb3);
}
    ld2 *= -1;
    lb4 = !fb0;

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
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    Thought lo1 = Thought231.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[3][5] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought176.getInstance(fo0, fo1, ao1, ao2);
    double ld4 = 215.7116714945705;
if(ao3 != null){
      ao3.m3(ld4, fd0, fd1, ld4);
}
    double ld5 = 379.78399438314494;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    Output.points[3][6] -= ad2;
    if (ab2) {
        ab3 = ab4 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        fb1 = !ab1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
        boolean lb0 = false;
        double ld1 = 235.28632586745064;
        boolean lb2 = true;
        Thought lo3 = Thought97.getInstance(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
        ad2 = ad3 - ad4;
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
            boolean lb4 = false;
            ab3 = ab4 && fb0;
            fb1 = lb4 && lb0;
            double ld5 = 133.54344049606922;
            lb2 = ad4 < fd0;
            ab1 = !ab2;
            ab3 = fd1 < ld5;
            double ld6 = 87.49908707586425;
            boolean lb7 = false;
            ld6 = ld1 - ad1;
if(fo1 != null){
              fo1.m1(ad2, ad3, ad4, fd0);
}
}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought187.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fb1 || lb0;
    double ld2 = 230.27861983249625;
    fb0 = fd0 < fd1;
    ld2 *= -1;
    Thought lo3 = Thought34.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    Output.points[3][7] += fd0;
    lb0 = fb0 && fb1;
    if (lb0) {
        fb0 = !fb1;
        lb0 = !fb0;
        boolean lb4 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb4, lb0);
}
        fb0 = ld2 < fd0;
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
        Output.points[3][8] += fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought117.getInstance(fd0, fd1, fd0, fd1);
    ab3 = ab4 || fb0;
    boolean lb1 = true;
    boolean lb2 = true;
    double ld3 = 151.17432443860434;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
    fb0 = fb1 && lb1;
    lb2 = fd0 > fd1;
    ld3 *= -1;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, fb1, lb1, lb2, ab1);
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
    fb1 = !fb0;
    fb1 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    if (fb0) {
        boolean lb0 = false;
        fb0 = ad1 > ad2;
        ad3 = ad4 + fd0;
        fd1 *= -1;
        ad1 = ad2 + ad3;
        ad4 *= -1;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        fb0 = fb1 && lb0;
        Output.points[4][0] -= fd0;
        Output.points[4][1] -= fd1;
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
      fo0.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ab2 = ad4 < fd0;
    double ld1 = 101.44931309217618;
    ab3 = fd0 > fd1;
    ld1 = ad1 - ad2;
    Output.points[4][2] += ad3;
    double ld2 = 310.4991415108778;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      ad3 = fo0.m3(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 - fd1;
    Thought lo3 = Thought0.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, ad1, ad2, fb1, ab1, ab2, ab3);
    ab4 = ad3 > ad4;
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    boolean lb4 = true;
if(fo1 != null){
          ab3 = fo1.m2(fd0, fd1, ld1, ld2, ab4, fb0, fb1, lb4);
}
    ad1 = ad2 + ad3;
    Thought lo5 = Thought31.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld1, ld2, ad1, ad2);
}
    double ld6 = 434.3251433071498;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[4][3] += fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought317.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    lb0 = !fb0;
    Output.points[4][4] -= ad3;
    fb1 = ad4 > fd0;
    lb0 = fd1 > ad1;
        double ld1 = 653.1956374742658;
    Output.points[4][5] += ad1;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ad2 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      ao1.m3(ld1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    if (lb0) {
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
        double ld2 = 643.7029230688539;
        lb0 = fb0 && fb1;
        ad3 = ad4 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld2, ld1, ad1);
}
        lb0 = ad2 > ad3;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fd1 *= -1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        lb0 = fd0 > fd1;
        ab1 = ab2 || ab3;
        Thought lo1 = Thought332.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Output.points[4][6] -= fd0;
if(ao3 != null){
          fb0 = ao3.m2(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        fd1 *= -1;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        lb0 = fd1 > fd0;
        fd1 *= -1;
        ab1 = fd0 < fd1;
        fd0 = fd1 + fd0;
        ab2 = ab3 || ab4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Output.points[4][7] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    lb0 = !ab1;
    fd0 = fd1 + ad1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, ab1, ab2);
}
    boolean lb1 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    lb1 = ab1 || ab2;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought383.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought134.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    fb0 = fd1 > fd0;
    boolean lb3 = false;

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
    ab1 = fd1 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[4][8] += fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 974.5298253951333;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    ld1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    ld1 *= -1;
    boolean lb2 = false;
    fd0 *= -1;
    fd1 = ld1 + fd0;
    boolean lb3 = true;
    lb2 = fd1 > ld1;
    lb3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            lb0 = lb2 || lb3;
}}
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
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 945.0249915280393;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;
    Thought lo3 = Thought186.getInstance(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    lb0 = !lb2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb0, fb1, lb0, lb2);
}
    ad3 = ad4 + fd0;
    double ld4 = 462.32365625413513;
    fb0 = !fb1;
    fd0 = fd1 + ld1;
    double ld5 = 642.2346132816635;
    ld4 = ld5 - ad1;
if(fo0 != null){
      lb0 = fo0.m2(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
    Thought lo6 = Thought338.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
    if (lb2) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
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
    ab1 = !ab2;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 503.00621901988563;
    fd0 = fd1 - ld0;
    ad1 = ad2 - ad3;
    ab3 = ad4 > fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    fb0 = !fb1;
    boolean lb1 = false;
    lb1 = !ab1;
    boolean lb2 = true;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao2 != null){
      ao2.m2();
}
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(lb1, lb2, fb0, fb1);
}
    lb0 = lb1 || lb2;
    boolean lb3 = false;
    fd0 *= -1;
    lb3 = fb0 && fb1;
    fd1 *= -1;
    double ld4 = 933.6580885636062;
    lb0 = lb1 && lb2;
    lb3 = fb0 || fb1;
    lb0 = !lb1;
    lb2 = lb3 && fb0;
    ld4 = fd0 - fd1;

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
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][0] += fd1;
    ad1 *= -1;
    fb1 = ad2 < ad3;
    boolean lb0 = false;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb0 = fd0 > fd1;
    fb0 = ad1 < ad2;
    fb1 = !lb0;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    Output.points[5][1] -= fd0;
    Output.points[5][2] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[5][3] += fd0;
    Thought lo1 = Thought274.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    double ld2 = 800.6187441594591;
    fb1 = lb0 || ab1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought32.getInstance(ad3, ad4, fd0, fd1);
    ad1 *= -1;
    ab2 = ad2 > ad3;
    ad4 *= -1;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    ad1 = ad2 + ad3;
    ab1 = ad4 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought12.getInstance();
    Thought lo2 = Thought328.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    ab1 = ad1 < ad2;
    ab2 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[5][4] -= ad1;
    fb0 = !fb1;

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
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
        fd0 *= -1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    double ld1 = 526.0500508711357;
    fb0 = ld1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld2 = 489.1068912508463;
    fb1 = !lb0;
    fb0 = !fb1;
    ld1 *= -1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    double ld1 = 6.213962401162422;
    lb0 = fd0 > fd1;
if(fo1 != null){
      ld1 = fo1.m3();
}
    fd0 = fd1 + ld1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought308.getInstance(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
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
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 || lb0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
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
