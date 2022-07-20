package genetic;
import java.util.ArrayList;
class Thought106 extends Thought{
private static ArrayList<Thought106> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 607.9694959553525;
private double fd1 = 120.5631089195472;
private Thought fo0 = null;
private Thought fo1 = null;
Thought106 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought106 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought106 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought106 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought106 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought106 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought106 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought106 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought106 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought106 instance = new Thought106 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought106 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought106 instance = new Thought106 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought106 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought106 instance = new Thought106 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought106 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought106 instance = new Thought106 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought106 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought106 instance = new Thought106 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought106 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought106 instance = new Thought106 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought106 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought106 instance = new Thought106 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought106 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought106 instance = new Thought106 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        double ld0 = 459.3609459693145;
        fb0 = fb1 && fb0;
        for(int i1=0; i1<10; i1++){
            fb1 = !fb0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
            fb1 = fb0 || fb1;
            fb0 = fb1 || fb0;
if(fo0 != null){
              fo0.m2();
}
            boolean lb1 = false;
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
            ld0 = fd0 + fd1;
            ld0 = fd0 + fd1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    double ld1 = 906.4366931214178;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 || fb1;
    boolean lb2 = false;
if(fo0 != null){
      lb0 = fo0.m2(lb2, ab1, ab2, ab3);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Output.points[5][3] -= fd0;
    Thought lo0 = Thought313.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought200.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    Thought lo3 = Thought161.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 - fd0;

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
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Thought lo0 = Thought334.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    boolean lb1 = false;
    double ld2 = 574.786409364839;
    ld2 *= -1;
    double ld3 = 887.2140385496734;
if(fo0 != null){
      ld3 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, fb0, fb1, lb1, ab1);
}
    ld3 *= -1;
    ad1 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    ab2 = fd1 < ld2;
    Thought lo4 = Thought206.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3);
}
    ab3 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, ld3, ad1);
}
    ad2 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
        fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fd1 *= -1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[5][4] -= fd0;
    double ld0 = 918.7351606723399;
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
if(ao1 != null){
      ld0 = ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
    Thought lo1 = Thought315.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[5][5] -= ld0;
    Output.points[5][6] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
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
    boolean lb0 = false;
    lb0 = ad1 < ad2;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    Output.points[5][7] -= ad3;
    Output.points[5][8] += ad4;
    fb1 = fd0 > fd1;
    Output.points[6][0] -= ad1;
    ad2 = ad3 + ad4;

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
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    lb0 = lb1 && lb2;
    ab1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        boolean lb4 = false;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        lb2 = fd0 > fd1;
        double ld5 = 221.73607430034258;
        boolean lb6 = false;
        double ld7 = 981.668329486618;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ld5, ld7, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          lb2 = ao2.m2(ab1, ab2, ab3, ab4);
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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    double ld0 = 251.72620825622002;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
        fb0 = ad2 > ad3;
    boolean lb1 = true;
    double ld2 = 605.7475550894101;
    Thought lo3 = Thought390.getInstance(ad3, ad4, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld2, ad1, ad2);
}
    double ld4 = 110.7261439569867;
if(ao1 != null){
      ao1.m2();
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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 903.0736390983155;
    Thought lo1 = Thought49.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    double ld2 = 756.7714216794552;
    fb1 = !fb0;
    boolean lb3 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
    fb1 = !lb3;
    double ld4 = 623.1539543135636;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld5 = 578.605306505642;
    ld2 *= -1;

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
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought99.getInstance(fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;

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
    double ld0 = 714.1256449793766;
    boolean lb1 = true;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb1 = lb1 || fb0;
    Thought lo2 = Thought171.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1();
}
    ld0 *= -1;
    boolean lb3 = false;
    double ld4 = 834.1295084897578;
    ld4 *= -1;
    fb0 = fb1 && lb1;
    ad1 *= -1;
    double ld5 = 928.0192780983692;
    Thought lo6 = Thought319.getInstance(lb3, fb0, fb1, lb1);
    lb3 = fb0 && fb1;
    boolean lb7 = false;
    ad1 = ad2 + ad3;
    Output.points[6][1] += ad4;
    lb1 = !lb3;

Thought.STACK_COUNTER++;
return lb7;
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
    double ld0 = 641.8658089988793;
    ab2 = ad1 < ad2;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld2 = 424.07819269900017;
if(fo0 != null){
      ld0 = fo0.m3(ld2, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
}
    double ld3 = 522.0836294818797;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 *= -1;
    Thought lo5 = Thought394.getInstance(ad4, fd0, fd1, ld0);
    Output.points[6][2] += ld2;
    boolean lb6 = false;
    lb1 = lb4 || lb6;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo7 = Thought373.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, fb1, lb1, lb4, lb6);
    Thought lo8 = Thought163.getInstance(ld3, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Output.points[6][3] += fd0;
    double ld1 = 680.6674024796882;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
    fb0 = ld1 < fd0;
    double ld2 = 584.8678437606164;
    fd0 = fd1 + ld1;

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
      ao1.m3();
}
    Thought lo0 = Thought245.getInstance(fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    boolean lb1 = true;
    ad3 *= -1;
    fb0 = fb1 || lb1;
    double ld2 = 652.5973004148659;
    fb0 = fb1 || lb1;

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
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao4 != null){
      fb1 = ao4.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    double ld0 = 368.75397893027514;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ld0 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    ab4 = ld0 > fd0;

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
    Thought lo0 = Thought96.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fd0 *= -1;
    Thought lo1 = Thought187.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    double ld2 = 808.7894138330971;
if(fo0 != null){
      ab3 = fo0.m2(ld2, ad1, ad2, ad3);
}
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    Output.points[6][4] += ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = !fb0;
    boolean lb3 = false;
    fb0 = !fb1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(lb3, ab1, ab2, ab3);
}
    Output.points[6][5] += fd1;
    ab4 = ld2 < ad1;
    fb0 = fb1 || lb3;
    ab1 = ad2 > ad3;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    lb3 = ab1 && ab2;
    ab3 = ad4 < fd0;

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
    Output.points[6][6] += fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought20.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    double ld1 = 507.0123413044075;
    double ld2 = 445.8385386034557;
    boolean lb3 = true;
    ld2 = fd0 - fd1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = !ab3;
    fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[6][7] -= fd1;
    double ld0 = 663.9518219756515;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Output.points[6][8] += fd0;
    ab3 = fd1 > ld0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
        Output.points[7][0] += ld0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2();
}
    lb2 = ld0 > fd0;
    ab1 = ab2 && ab3;
    fd1 = ld0 + fd0;

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
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    Thought lo0 = Thought200.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought44.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld2 = 904.4884173802519;
    fb1 = !fb0;
    Thought lo3 = Thought150.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    double ld0 = 408.3128268901709;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
    fb1 = ad1 > ad2;
    ab1 = !ab2;
    boolean lb1 = false;
    ab2 = ab3 && ab4;
    Thought lo2 = Thought133.getInstance(ad3, ad4, fd0, fd1);
    fb0 = !fb1;
    ld0 = ad1 + ad2;
    double ld3 = 934.4629640211972;
    Output.points[7][1] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb4 = false;
    ld0 *= -1;
    ld3 = ad1 - ad2;
if(fo1 != null){
      fo1.m1();
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb4, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    lb0 = lb1 || fb0;
    fb1 = lb0 || lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    Output.points[7][2] -= fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;

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
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[7][3] -= fd1;
    Thought lo0 = Thought263.getInstance();
    Output.points[7][4] += ad1;
if(ao2 != null){
      ao2.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    ab3 = fd0 < fd1;
    fd0 *= -1;
    boolean lb2 = false;
    fd1 *= -1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    lb2 = fd1 > fd0;
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo3 = Thought321.getInstance(ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    fb1 = lb0 && lb1;

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
        ad2 = ad3 + ad4;
    ab1 = !ab2;
    Output.points[7][5] -= fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought313.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    boolean lb1 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    boolean lb2 = true;
    boolean lb3 = true;
    lb3 = ad2 < ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb4 = true;
    double ld5 = 573.8710795384221;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld5;
        boolean lb6 = false;
        ad1 *= -1;
        Thought lo7 = Thought117.getInstance();
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
    double ld0 = 164.50457889506131;
    Output.points[7][6] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    fb0 = !fb1;
    boolean lb1 = false;
    Thought lo2 = Thought367.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    boolean lb3 = false;
    boolean lb4 = false;
    Output.points[7][7] -= fd0;
    fd1 = ld0 + fd0;

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
    Thought lo0 = Thought121.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    if (fb1) {
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        fd0 = fd1 - fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        ab1 = ab2 || ab3;
if(fo0 != null){
          fd0 = fo0.m3();
}
        Thought lo1 = Thought15.getInstance(ab4, fb0, fb1, ab1);
        Output.points[7][8] -= fd1;
        fd0 *= -1;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought305.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
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
    double ld0 = 876.3851060541213;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
    lb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought331.getInstance(fo1, fo0, fo1, fo0);
    fb1 = lb1 || ab1;
    fd0 *= -1;
    Output.points[8][0] += fd1;
    double ld3 = 94.61797445438883;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, ad1, ad2);
}
    Thought lo4 = Thought21.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld5 = 745.2509603687873;
    double ld6 = 694.7258839232582;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld1 = 936.1421535700747;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fb0 = !fb1;
    boolean lb2 = false;
    double ld3 = 821.8350822292997;
    boolean lb4 = true;
    lb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld3, fd0, fd1);
}
    ld1 *= -1;
    Output.points[8][1] -= ld3;
    lb2 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb5 = true;
    lb4 = ld1 > ld3;

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
            ad1 = ad2 + ad3;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought141.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    double ld1 = 650.7260871889421;
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[8][2] -= ad2;
    fb1 = ad3 < ad4;
    lb2 = fd0 < fd1;
if(ao2 != null){
      ld1 = ao2.m3(ad1, ad2, ad3, ad4);
}
    double ld3 = 294.0559137418455;
    fb0 = ad4 > fd0;
    double ld4 = 347.0135929471175;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld3);
}
    lb2 = fb0 && fb1;
    lb2 = fb0 || fb1;

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
    double ld0 = 934.198741024883;
    Thought lo1 = Thought132.getInstance();
    ld0 = fd0 + fd1;
    ab1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    ab2 = fd1 > ld0;
    ab3 = fd0 < fd1;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought226.getInstance(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought291.getInstance(ao2, ao3, ao4, fo0);
    ad1 *= -1;
    fb1 = !ab1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    double ld1 = 129.72672686824586;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
    boolean lb3 = false;
    double ld4 = 983.3198108683731;
    ad1 = ad2 - ad3;
    Thought lo5 = Thought277.getInstance();
if(ao1 != null){
      ao1.m3(lb3, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    double ld6 = 993.3937845125732;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb2, lb3, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, ld4, ld6, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, lb3, ab1, ab2);
}
    Thought lo7 = Thought288.getInstance(ao4, fo0, fo1, ao1);
    Thought lo8 = Thought211.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ld1 + ld4;
    boolean lb9 = false;

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
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    Thought lo1 = Thought97.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    double ld3 = 859.490139511779;
    fb1 = ld3 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, fd0, fd1, lb0, lb2, fb0, fb1);
}
        ld3 = fd0 + fd1;
    ld3 = fd0 - fd1;
    boolean lb4 = true;
    ld3 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb2, lb4, fb0);
}
    Output.points[8][3] -= fd0;
    Thought lo5 = Thought201.getInstance(fo0, fo1, fo0, fo1);
    double ld6 = 724.6556676421613;

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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 661.0425672316358;
        lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m1();
}
    lb0 = fb0 && fb1;
    Thought lo2 = Thought310.getInstance(lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    boolean lb3 = true;
    ld1 = fd0 - fd1;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
}
    double ld4 = 772.3034095717267;

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
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[8][4] += fd0;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
        fb1 = lb0 || lb1;
    Output.points[8][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
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
