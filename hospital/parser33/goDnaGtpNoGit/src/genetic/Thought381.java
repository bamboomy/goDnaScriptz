package genetic;
import java.util.ArrayList;
class Thought381 extends Thought{
private static ArrayList<Thought381> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 261.2114726235488;
private double fd1 = 366.8511916789164;
private Thought fo0 = null;
private Thought fo1 = null;
Thought381 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought381 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought381 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought381 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought381 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought381 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought381 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought381 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought381 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought381 instance = new Thought381 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought381 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought381 instance = new Thought381 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought381 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought381 instance = new Thought381 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought381 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought381 instance = new Thought381 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought381 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought381 instance = new Thought381 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought381 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought381 instance = new Thought381 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought381 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought381 instance = new Thought381 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought381 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought381 instance = new Thought381 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    double ld3 = 222.2528693856296;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld4 = 155.0959004922363;
if(fo1 != null){
      lb0 = fo1.m2(lb1, lb2, fb0, fb1);
}
    boolean lb5 = false;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld3, lb2, lb5, fb0, fb1);
}
    ld4 *= -1;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, ld4, lb2, lb5, fb0, fb1);
}
    lb0 = lb1 || lb2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb0);
}
    Thought lo6 = Thought398.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    lb1 = !lb2;
if(fo1 != null){
      lb5 = fo1.m2(ld3, ld4, fd0, fd1);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld3);
}
    ld4 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
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
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    ab2 = ab3 && ab4;
    fd0 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld1 = 762.3067210124053;
    double ld2 = 745.0912230641784;
    fb1 = ld2 < fd0;
    Output.points[5][1] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb3 = false;

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
    ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    fb1 = fb0 && fb1;
        Output.points[5][2] += ad2;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m3();
}
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = ad3 < ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    double ld1 = 608.5468937248654;
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
    Output.points[5][3] -= ad2;
    ab2 = ab3 || ab4;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 < ad4;
    Thought lo0 = Thought238.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    ab3 = fd0 > fd1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought340.getInstance(ad4, fd0, fd1, ad1);
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    Output.points[5][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, ab1, ab2, ab3);
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
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    boolean lb1 = false;
    double ld2 = 144.21120806950634;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
    double ld3 = 484.5386122186945;
if(ao2 != null){
      lb1 = ao2.m2();
}
    ld2 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought179.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 957.6952775022779;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb2);
}
    if (fb0) {
        fb1 = ad4 > fd0;
        fd1 = ld1 - ad1;
        lb2 = ad2 > ad3;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
        fb0 = fb1 && lb2;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
        ad1 = ad2 - ad3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(ao1 != null){
          ao1.m1();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb2, fb0);
}
        ad1 = ad2 + ad3;
        double ld3 = 31.581306158692477;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
        lb2 = ld3 < ld1;
        ad1 *= -1;
        ad2 = ad3 - ad4;
        boolean lb4 = true;
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
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Thought lo0 = Thought300.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    Thought lo1 = Thought13.getInstance(ao2, ao3, ao4, fo0);
        ab4 = !fb0;
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      lb2 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb2, ab1);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;

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
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = ad4 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    double ld1 = 6.10038537020575;
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ad3 = ao3.m3(lb0, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
    Thought lo2 = Thought171.getInstance(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = false;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb3;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo6 = Thought230.getInstance(ad3, ad4, fd0, fd1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    double ld7 = 951.7288649768186;
if(ao1 != null){
      ad4 = ao1.m3(lb4, lb5, ab1, ab2);
}
    Thought lo8 = Thought306.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld7, ab3, ab4, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        lb0 = !lb3;
        ad1 *= -1;
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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought147.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb1;
    fb0 = fd1 > fd0;
    Output.points[5][5] -= fd1;
    fb1 = lb1 && fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[5][6] += fd1;
    Output.points[5][7] -= fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[5][8] += fd0;
        ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fd1 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
    fb1 = !fb0;
    double ld0 = 877.4180024134812;
    boolean lb1 = true;
    Thought lo2 = Thought218.getInstance(fb0, fb1, lb1, fb0);
    fb1 = !lb1;
    fb0 = fd0 > fd1;
    fb1 = lb1 && fb0;
    fb1 = ld0 < ad1;
    ad2 *= -1;
    lb1 = ad3 > ad4;
    fb0 = fd0 > fd1;
    double ld3 = 767.8433820151513;
    Output.points[6][0] -= ld0;
    double ld4 = 644.9774594054154;
    fb1 = ld3 < ld4;
    lb1 = !fb0;
    fb1 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    ld3 = ld4 - ad1;
    boolean lb5 = false;
    lb5 = fb0 && fb1;

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
    double ld0 = 819.4923410574386;
    ab2 = !ab3;
    ab4 = !fb0;
    Output.points[6][1] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    ld0 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought298.getInstance(fo1, fo0, fo1, fo0);
    ad4 = fd0 + fd1;
if(fo1 != null){
      ab3 = fo1.m2(ld0, ad1, ad2, ad3);
}
    Thought lo2 = Thought316.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 = ad1 + ad2;
    fb1 = ab1 && ab2;
    boolean lb3 = true;

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
    double ld0 = 128.4436109589611;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    double ld2 = 6.995633206227368;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = ld2 < fd0;
    lb1 = fd1 < ld0;
    fb0 = ld2 > fd0;
    boolean lb3 = false;
    boolean lb4 = false;
    fd1 = ld0 - ld2;
if(fo0 != null){
      lb4 = fo0.m2(fd0, fd1, ld0, ld2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Output.points[6][2] += ad1;
    fb1 = !fb0;
    Thought lo0 = Thought326.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    double ld1 = 591.6262034744827;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = !fb0;
    fd0 = fd1 - ld1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 && ab3;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 873.7054561033813;
    ab4 = fd0 > fd1;
    Thought lo1 = Thought299.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
    double ld2 = 418.7448550326546;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb3);
}
    boolean lb4 = true;
    lb4 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
if(fo0 != null){
          ld2 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2, fb1, lb3, lb4, ab1);
}
        Thought lo5 = Thought281.getInstance(fd0, fd1, ld0, ld2, ab2, ab3, ab4, fb0);
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
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    double ld1 = 651.0629280419672;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb2, ab1, ab2);
}
    ab3 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld3 = 863.5463428776469;
    boolean lb4 = false;
if(ao2 != null){
      ab3 = ao2.m2(ad4, fd0, fd1, ld1);
}
    ld3 *= -1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ld1 = ld3 + ad1;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ld1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb2);
}
    boolean lb5 = false;
    lb4 = lb5 && ab1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    Output.points[6][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = !lb0;
    double ld1 = 205.09147630348448;
    fd0 *= -1;
if(fo0 != null){
          fo0.m2(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ld1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb0 = fb0 || fb1;
    fd1 = ld1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(ld1, fd0, fd1, ld1);
}
        Output.points[6][4] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    Thought lo0 = Thought302.getInstance();
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
            boolean lb1 = false;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0);
}
            boolean lb2 = true;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
            fd0 = fd1 + fd0;
            fb0 = !fb1;
            boolean lb3 = false;
if(fo0 != null){
              fo0.m3();
}
            boolean lb4 = true;
            fd1 *= -1;
            lb1 = fd0 > fd1;
            lb2 = !lb3;
if(fo1 != null){
              fo1.m3(lb4, ab1, ab2, ab3);
}
            fd0 = fd1 + fd0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
            Thought lo5 = Thought30.getInstance(fd1, fd0, fd1, fd0, lb2, lb3, lb4, ab1);
            Output.points[6][5] += fd1;
if(fo0 != null){
              ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    fb0 = !fb1;
    fb0 = ad2 > ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    Thought lo1 = Thought176.getInstance();
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = ad1 > ad2;
    fb0 = ad3 < ad4;
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    Output.points[6][6] += ad3;
    lb0 = lb2 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
    ad4 = fd0 - fd1;
    Output.points[6][7] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    ab2 = ab3 || ab4;
    Output.points[6][8] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ad4 = fo0.m3();
}
        fb1 = ab1 && ab2;
        boolean lb0 = false;
        ab2 = fd0 < fd1;
if(fo1 != null){
          ad1 = fo1.m3(ab3, ab4, fb0, fb1);
}
        lb0 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fd1 = ad1 - ad2;
        fb1 = ad3 < ad4;
        lb0 = fd0 > fd1;
        boolean lb1 = false;
        lb1 = ad1 < ad2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    Output.points[7][0] += fd0;
if(ao4 != null){
      ao4.m3();
}
        Thought lo1 = Thought214.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    Output.points[7][1] -= fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought268.getInstance(ao1, ao2, ao3, ao4);
    fd0 *= -1;
    lb0 = fd1 > fd0;
    fd1 *= -1;

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
    fb1 = fb0 && fb1;
    ad2 *= -1;
    fb0 = fb1 || fb0;
    double ld0 = 642.0289325497374;
        ad2 *= -1;
    fb1 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, ad1);
}
        }
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    ld0 = ad1 - ad2;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought22.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fb0 = ad1 > ad2;
    double ld2 = 270.9940895120301;
if(ao3 != null){
      ao3.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ld2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
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
    fd1 *= -1;
    if (ab2) {
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 && ab4;
        boolean lb0 = true;
        boolean lb1 = true;
        ab3 = !ab4;
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        ab1 = ab2 && ab3;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
        boolean lb2 = true;
        boolean lb3 = true;
        lb1 = fd1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    ab1 = ad1 > ad2;
    Output.points[7][2] += ad3;
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    Thought lo1 = Thought55.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    ab4 = fb0 || fb1;
    Output.points[7][3] -= ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3();
}
    lb0 = !ab1;
    Output.points[7][4] += ad2;
    Thought lo2 = Thought198.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 356.0325825132934;
    double ld1 = 460.1599464232039;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld0;
    Output.points[7][5] += ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
        Output.points[7][6] += fd0;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            Thought lo3 = Thought23.getInstance();
            fb1 = fd1 > ld0;
if(fo1 != null){
              fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
            Thought lo4 = Thought57.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
            double ld5 = 137.59816411618428;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = ab1 || ab2;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought370.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
        double ld1 = 538.1535265903665;
    double ld2 = 461.18715173951125;
    ld1 *= -1;
    ld2 = fd0 - fd1;
    double ld3 = 953.1850811295825;
    ab1 = !ab2;
    Thought lo4 = Thought5.getInstance(ld1, ld2, ld3, fd0);
    ab3 = fd1 < ld1;
    ab4 = fb0 && fb1;
    ld2 *= -1;
    ld3 *= -1;
    boolean lb5 = false;
        boolean lb6 = false;
    boolean lb7 = false;
    Thought lo8 = Thought283.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][7] += ad1;
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    boolean lb1 = true;
        boolean lb2 = false;
    ad4 *= -1;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    lb1 = lb2 && fb0;
    double ld3 = 141.4717617271644;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, lb2);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1, lb1, lb2, fb0, fb1);
}
    ad2 = ad3 + ad4;
    Thought lo4 = Thought377.getInstance(fd0, fd1, ld3, ad1, lb0, lb1, lb2, fb0);
    fb1 = !lb0;
    lb1 = lb2 && fb0;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    ad3 *= -1;
    ad4 *= -1;
    double ld5 = 877.6467370510004;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld6 = 408.8775949866724;
    Output.points[7][8] += ad3;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld3);
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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 88.28392501256374;
    Thought lo1 = Thought310.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
        ad2 = ad3 + ad4;
    ab3 = fd0 < fd1;
    ab4 = ld0 < ad1;
    Thought lo2 = Thought6.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    fd1 *= -1;
    double ld3 = 161.54404192795735;
    fb1 = ab1 || ab2;
    boolean lb4 = false;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ld3, ad1, ad2, ad3);
}
    ad4 *= -1;
    boolean lb5 = false;
    lb4 = lb5 || ab1;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo6 = Thought243.getInstance(fb0, fb1, lb4, lb5);
    double ld7 = 948.6329060796213;

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
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb0, lb1, lb2, fb0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = lb0 && lb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld3 = 895.7089154034261;
    boolean lb4 = false;
    lb2 = lb4 && fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    boolean lb5 = false;
    Thought lo6 = Thought384.getInstance(lb0, lb1, lb2, lb4);
    Thought lo7 = Thought102.getInstance(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3, lb5, fb0, fb1, lb0);
    lb1 = lb2 || lb4;
    boolean lb8 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld3, fd0, lb5, lb8, fb0, fb1);
}
    boolean lb9 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 23.105416885467378;
    Thought lo1 = Thought83.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought368.getInstance(fo1, ao1, ao2, ao3);
    fb0 = ld0 < ad1;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    boolean lb4 = false;
    double ld5 = 466.90363852152024;
if(ao4 != null){
      ld0 = ao4.m3();
}
    ld5 *= -1;
    lb4 = fb0 || fb1;
if(fo0 != null){
      ad1 = fo0.m3(lb3, lb4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb3, lb4, fb0, fb1);
}
    lb3 = lb4 || fb0;
    fb1 = !lb3;
    lb4 = fb0 && fb1;
    lb3 = fd1 < ld0;
    lb4 = fb0 || fb1;
    lb3 = ld5 > ad1;

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
if(ao1 != null){
      ab2 = ao1.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought315.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || ab1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 *= -1;
    ab1 = ab2 || ab3;
    Thought lo2 = Thought298.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab4 = !fb0;
    fb1 = lb1 || ab1;
if(fo1 != null){
      fo1.m2();
}
    ab2 = ab3 || ab4;
    Thought lo3 = Thought149.getInstance(fb0, fb1, lb1, ab1);
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought286.getInstance(ao2, ao3, ao4, fo0, lb1, ab1, ab2, ab3);
    boolean lb5 = true;
    fd0 *= -1;
    boolean lb6 = true;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb7 = true;
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo8 = Thought320.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb9 = true;
    boolean lb10 = false;

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
    ad2 = ad3 + ad4;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ad2 > ad3;
    boolean lb0 = false;
    Thought lo1 = Thought330.getInstance(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
    boolean lb2 = true;
    Thought lo3 = Thought388.getInstance(ao3, ao4, fo0, fo1);
    Output.points[8][0] += ad4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ad2 = ao1.m3();
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought175.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb0, lb2, ab1, ab2);
        Thought lo5 = Thought223.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);

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
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought139.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fb0 = fd1 > fd0;
    fd1 *= -1;
    Output.points[8][1] += fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld1 = 958.0532608658298;
    fb0 = ld1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
        fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fb1 = !lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 291.0304051195303;
    fd0 = fd1 + ld2;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[8][2] += fd0;
    double ld4 = 675.2854564912325;
    Output.points[8][3] -= fd0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
        boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought72.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
    fb1 = fd1 > fd0;
    lb0 = lb1 && fb0;
    fb1 = lb0 && lb1;
    double ld3 = 995.8684862635536;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[8][4] -= fd1;

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
