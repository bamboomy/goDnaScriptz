package genetic;
import java.util.ArrayList;
class Thought361 extends Thought{
private static ArrayList<Thought361> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 552.0635364658867;
private double fd1 = 455.6522921288384;
private Thought fo0 = null;
private Thought fo1 = null;
Thought361 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought361 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought361 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought361 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought361 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought361 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought361 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought361 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought361 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought361 instance = new Thought361 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought361 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought361 instance = new Thought361 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought361 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought361 instance = new Thought361 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought361 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought361 instance = new Thought361 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought361 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought361 instance = new Thought361 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought361 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought361 instance = new Thought361 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought361 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought361 instance = new Thought361 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought361 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought361 instance = new Thought361 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought345.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[3][6] += fd0;
    fb0 = fd1 < fd0;
    Thought lo2 = Thought215.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo3 = Thought392.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
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
    ab1 = fd1 > fd0;
    Thought lo0 = Thought206.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        Output.points[3][7] -= fd0;
        fb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
        fb1 = !lb1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo2 = Thought335.getInstance(fd1, fd0, fd1, fd0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
    lb0 = lb1 || lb2;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab3 = ab4 || fb0;
    ad4 *= -1;
    Output.points[3][8] -= fd0;
    fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab1 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        fb1 = !ab1;
        Thought lo0 = Thought259.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
        double ld1 = 228.06763482055428;
        fb1 = !ab1;
        ld1 = ad1 + ad2;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        double ld2 = 633.289198871503;
        ab1 = ab2 || ab3;
        Output.points[4][0] += ad3;
        boolean lb3 = true;
        ab3 = ad4 < fd0;
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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    double ld1 = 496.0284631423582;
    boolean lb2 = false;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(lb0, lb2, fb0, fb1);
}
    lb0 = lb2 || fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    Thought lo3 = Thought394.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
    ld1 = fd0 + fd1;
    fb0 = ld1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
        boolean lb5 = true;
        Thought lo6 = Thought282.getInstance(fo1, ao1, ao2, ao3);
        fd1 = ld1 - fd0;
        if (lb0) {
            lb2 = fb0 && fb1;
            lb4 = lb5 && lb0;
            lb2 = fb0 || fb1;
if(ao4 != null){
              lb4 = ao4.m2(fd1, ld1, fd0, fd1);
}
            lb5 = ld1 < fd0;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3();
}
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    boolean lb0 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
    double ld1 = 263.337908349778;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ld1 = ad1 + ad2;
    Output.points[4][1] -= ad3;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
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
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought195.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
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
      ao2.m2(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought360.getInstance();
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    ad1 *= -1;
    fb0 = ad2 > ad3;
    boolean lb2 = false;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    lb2 = ab1 || ab2;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    double ld3 = 787.8105193882582;
if(ao4 != null){
      ao3 = ao4.m4(ld3, ad1, ad2, ad3);
}
    Thought lo4 = Thought271.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld3);
        fb1 = lb0 && lb2;

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
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought227.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
        boolean lb2 = true;
        fb0 = !fb1;
        boolean lb3 = true;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    fd1 = fd0 - fd1;
    Output.points[4][2] += fd0;
    fb0 = !fb1;
    fd1 *= -1;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    double ld1 = 762.078850709061;
    lb0 = fd0 < fd1;
    Output.points[4][3] -= ld1;
    Thought lo2 = Thought374.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    double ld3 = 332.386389319938;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
    ld1 = ld3 - fd0;
    Thought lo4 = Thought304.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ld3, fd0, fb0, fb1, lb0, ab1);
    if (ab2) {
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Thought lo0 = Thought26.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo1 = Thought294.getInstance(fb1, fb0, fb1, fb0);
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        double ld1 = 418.62410322602665;
        boolean lb2 = false;
        Output.points[4][4] += ad2;
        if (lb2) {
            Output.points[4][5] -= ad3;
            ad4 = fd0 - fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            lb0 = ab1 || ab2;
            Thought lo3 = Thought90.getInstance(ld1, ad1, ad2, ad3);
            ab3 = ab4 || fb0;
            boolean lb4 = false;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
            Output.points[4][6] -= ad1;
            fb0 = fb1 || lb4;
            } else {
            Output.points[4][7] -= ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1();
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought246.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = lb0 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        fb0 = !fb1;
        lb0 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        if (fb0) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad3 *= -1;
    ad4 *= -1;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    Output.points[4][8] += ad1;
    fb1 = ad2 > ad3;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    Output.points[5][0] += ad2;
if(ao2 != null){
      ao2.m2();
}
    lb1 = ad3 > ad4;
    fb0 = fd0 < fd1;
        ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought281.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
    lb1 = !lb2;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought315.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 || lb0;
    ab1 = !ab2;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(ab2, ab3, ab4, fb0);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought351.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought268.getInstance(ad4, fd0, fd1, ad1);
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 < ad3;
        Thought lo3 = Thought350.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    fb1 = fd0 < fd1;
        lb0 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    double ld1 = 969.5056663029899;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought350.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
    Thought lo3 = Thought305.getInstance(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);

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
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        }
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    for(int i1=0; i1<10; i1++){
        fd1 *= -1;
        lb1 = fd0 > fd1;
        lb2 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        }
    fb0 = fd0 > fd1;
    double ld3 = 593.2617580630173;
    boolean lb4 = true;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    Thought lo1 = Thought143.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    lb0 = fb0 || fb1;
    ad2 *= -1;
if(fo1 != null){
      fo1.m2();
}
    ad3 *= -1;
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought138.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    double ld1 = 195.26168242589654;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    ad1 *= -1;
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;
    fb1 = ab1 || ab2;
    boolean lb2 = true;
    ab2 = fd1 > ld1;
    ad1 *= -1;
    double ld3 = 76.62716040153508;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb2;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(ld1, ld3, ad1, ad2);
}
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][1] -= ld3;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld5 = 763.2634337708649;
    Thought lo6 = Thought108.getInstance(fo0, fo1, fo0, fo1, ld5, ad1, ad2, ad3, fb0, fb1, lb2, lb4);
    double ld7 = 608.4725303208367;
if(fo0 != null){
      ab1 = fo0.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld1 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    if (lb0) {
        Thought lo1 = Thought219.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        Output.points[5][2] -= fd1;
        double ld2 = 947.6115405222799;
        boolean lb3 = false;
        boolean lb4 = false;
        lb0 = ld2 > fd0;
        fb0 = fd1 > ld2;
        fd0 = fd1 + ld2;
        fd0 = fd1 - ld2;
        fd0 = fd1 - ld2;
        } else {
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
        fd1 = fd0 + fd1;
        Thought lo5 = Thought156.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
        double ld6 = 268.9213724030434;
        double ld7 = 970.4129121968288;
        Thought lo8 = Thought286.getInstance(ld6, ld7, fd0, fd1, lb0, fb0, fb1, lb0);
        ld6 *= -1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        ld7 = fd0 - fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    double ld0 = 746.8452334611057;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
if(ao2 != null){
      fd0 = ao2.m3();
}
    lb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    lb1 = lb2 && fb0;
    fb1 = lb1 && lb2;
    fd1 = ld0 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ad1, ad2, fb1, lb1, lb2, fb0);
}
    boolean lb3 = false;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, lb1, lb2, lb3, fb0);
}
        boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(ld0, ad1, ad2, ad3);
}
    Thought lo5 = Thought105.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
    fb0 = fb1 || lb1;
if(ao3 != null){
      lb2 = ao3.m2();
}
    ad1 *= -1;
    lb3 = ad2 < ad3;

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
    Output.points[5][3] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab2 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    double ld2 = 98.01524056287873;
    fd0 = fd1 + ld2;
    fd0 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb1, lb3, ab1);
}
    boolean lb4 = false;
    fd1 = ld2 + fd0;
        ab1 = fd1 < ld2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    double ld5 = 213.15008074223587;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld5, fd0, fd1, ld2, fb1, lb0, lb1, lb3);
}
if(ao3 != null){
      ao3.m2(ld5, fd0, fd1, ld2, lb4, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb0, lb1, lb3, lb4);
}

Thought.STACK_COUNTER++;
return ld5;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    Thought lo1 = Thought177.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld2 = 417.6267273288011;
    boolean lb3 = true;
    Thought lo4 = Thought144.getInstance(lb0, lb3, ab1, ab2);
    double ld5 = 660.9970724296334;
    double ld6 = 709.3842420619576;
    ld6 = ad1 - ad2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ld2, ld5, ld6, ad1, lb3, ab1, ab2, ab3);
}
    boolean lb7 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    lb0 = ad2 < ad3;
    double ld8 = 944.2280968046626;
    if (lb3) {
        lb7 = ab1 && ab2;
        ab3 = ad3 > ad4;
        fd0 = fd1 + ld2;
        Thought lo9 = Thought139.getInstance(ao4, fo0, fo1, ao1);
        boolean lb10 = false;
        boolean lb11 = true;
        ld5 = ld6 - ld8;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    Thought lo2 = Thought136.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[5][4] += fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;

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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    Thought lo0 = Thought180.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    Output.points[5][5] += fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
    lb2 = fd1 < fd0;
    Thought lo3 = Thought40.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld4 = 426.1096442324509;
    fd0 = fd1 + ld4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld4, fd0);
}
    Output.points[5][6] += fd1;
    fb1 = lb1 || lb2;
    ld4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld4;

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
    double ld0 = 19.951935053270134;
    fb0 = !fb1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo1 != null){
      lb1 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
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
    ab3 = ab4 || fb0;
    Thought lo0 = Thought112.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    Output.points[5][7] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        boolean lb2 = true;
        lb1 = !lb2;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fd0 = fo0.m3();
}
        fd1 *= -1;
if(fo1 != null){
          ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
          ab1 = fo0.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 || lb2;
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    double ld0 = 609.3661383861495;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought344.getInstance(fo0, fo1, ao1, ao2);
    fb0 = fb1 || fb0;
    Thought lo2 = Thought53.getInstance(fd1, ld0, fd0, fd1);
        fb1 = ld0 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      fb0 = ao3.m2();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought43.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought72.getInstance(ao1, ao2, ao3, ao4);
    fb1 = fb0 || fb1;
    fd1 = ad1 + ad2;
    Thought lo2 = Thought357.getInstance(ad3, ad4, fd0, fd1);
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao4.m3();
}
    Thought lo3 = Thought214.getInstance(fb1, fb0, fb1, fb0);
    Thought lo4 = Thought215.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    ad2 = ad3 + ad4;
    Output.points[5][8] -= fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    boolean lb5 = false;
    fb0 = fb1 || lb5;
    ad4 *= -1;
    boolean lb6 = true;
    lb6 = fd0 > fd1;
    fb0 = ad1 < ad2;
    Thought lo7 = Thought189.getInstance(ad3, ad4, fd0, fd1, fb1, lb5, lb6, fb0);

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
    ab2 = !ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    Thought lo0 = Thought31.getInstance(ao1, ao2, ao3, ao4);
    double ld1 = 874.8217276228762;
    Thought lo2 = Thought131.getInstance(ld1, fd0, fd1, ld1);
    double ld3 = 699.3516569815275;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld1);
}
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ld3 > fd0;
    double ld4 = 415.27239830958723;
    fd0 = fd1 - ld1;
    ld3 = ld4 + fd0;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    fd1 *= -1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ld1, ld3, ld4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    boolean lb5 = false;

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
    Thought lo0 = Thought325.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo1 = Thought34.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
if(fo0 != null){
      ad2 = fo0.m3();
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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 172.47212834543842;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Output.points[6][0] -= ld0;

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
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 70.86033973698358;
        fd0 = fd1 + ld0;
    double ld1 = 266.6178621231243;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    double ld0 = 826.0058017942958;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
    ld0 = fd0 - fd1;

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
