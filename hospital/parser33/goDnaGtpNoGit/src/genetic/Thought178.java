package genetic;
import java.util.ArrayList;
class Thought178 extends Thought{
private static ArrayList<Thought178> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 683.8128097126988;
private double fd1 = 485.41778586117164;
private Thought fo0 = null;
private Thought fo1 = null;
Thought178 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought178 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought178 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought178 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought178 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought178 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought178 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought178 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought178 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought178 instance = new Thought178 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought178 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought178 instance = new Thought178 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought178 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought178 instance = new Thought178 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought178 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought178 instance = new Thought178 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought178 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought178 instance = new Thought178 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought178 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought178 instance = new Thought178 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought178 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought178 instance = new Thought178 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought178 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought178 instance = new Thought178 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    double ld0 = 245.0467539328775;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    double ld2 = 104.27646442222414;
    double ld3 = 714.3345001151175;
    fb1 = lb1 && fb0;
if(fo0 != null){
      fo0.m2(ld3, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    lb1 = ld2 > ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld2, ld3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld3);
}
    fd0 = fd1 - ld0;
    ld2 *= -1;
if(fo0 != null){
      ld3 = fo0.m3();
}
    boolean lb4 = true;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, lb4);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld2, ld3, fd0, lb4, fb0, fb1, lb1);
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
    Thought lo0 = Thought268.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought66.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    Thought lo2 = Thought338.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[2][6] -= fd1;
    ab3 = fd0 > fd1;
    double ld3 = 261.33601403835166;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    Thought lo4 = Thought160.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    boolean lb5 = true;
    boolean lb6 = true;
    lb6 = fd0 < fd1;
    ld3 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb5, lb6);
}
    fd1 = ld3 - fd0;
    fd1 = ld3 - fd0;
    fd1 = ld3 - fd0;

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
    double ld0 = 135.42056033908023;
    double ld1 = 438.54280373554536;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    ld0 = ld1 + ad1;
    fb0 = fb1 || lb2;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        Thought lo3 = Thought75.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2);
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(ld1, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
    Output.points[2][7] -= ad4;

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
    Output.points[2][8] += ad1;
    Thought lo0 = Thought356.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    double ld1 = 188.6491774111561;
    ad1 = ad2 - ad3;
    double ld2 = 818.4142559512774;
    Thought lo3 = Thought21.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = true;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld2);
}
    fb1 = lb4 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = lb4 && ab1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
        Thought lo5 = Thought348.getInstance(ad1, ad2, ad3, ad4, fb1, lb4, ab1, ab2);
        boolean lb6 = false;
        boolean lb7 = true;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    double ld0 = 668.3098118878409;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0);
}
    boolean lb2 = false;
    lb1 = lb2 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    double ld3 = 555.7178534020176;
    ld0 = ld3 - fd0;
    Thought lo4 = Thought300.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb1, lb2, fb0);
}
    fb1 = fd1 < ld0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
    ld3 = fd0 + fd1;
    ld0 *= -1;
    ld3 *= -1;

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
    Thought lo0 = Thought254.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 261.48913076761426;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1);
}
    fb1 = !fb0;
    Thought lo2 = Thought160.getInstance();
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb3 = true;
    double ld4 = 87.84879375762978;
    Thought lo5 = Thought365.getInstance(ao4, fo0, fo1, ao1, ld4, ad1, ad2, ad3, fb0, fb1, lb3, fb0);
    Output.points[3][0] -= ad4;
    boolean lb6 = false;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, ld4, ad1, fb0, fb1, lb3, lb6);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 || lb3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb6, fb0, fb1, lb3);
}
    fd0 = fd1 + ld1;
    lb6 = !fb0;
    Thought lo7 = Thought125.getInstance(ao3, ao4, fo0, fo1);
    Thought lo8 = Thought91.getInstance(ld4, ad1, ad2, ad3);
    fb1 = !lb3;

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
    ab2 = fd1 < fd0;
    ab3 = ab4 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = !ab2;
        Thought lo0 = Thought132.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    Thought lo1 = Thought19.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb2 = false;
    Thought lo3 = Thought99.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    lb2 = !ab1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    double ld4 = 645.6733996867382;
    ab2 = ld4 > fd0;
    Thought lo5 = Thought308.getInstance();

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
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
if(ao1 != null){
          ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        Thought lo0 = Thought33.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
        boolean lb1 = true;
        lb1 = ab1 && ab2;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
        ab3 = ad4 > fd0;
if(fo1 != null){
          ab4 = fo1.m2();
}
if(ao1 != null){
          fd1 = ao1.m3(fb0, fb1, lb1, ab1);
}
        Output.points[3][1] -= ad1;
        ab2 = ab3 && ab4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        Output.points[3][2] += ad4;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
        fd0 = fd1 - ad1;
        double ld2 = 648.4122092648389;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ad1 = ad2 + ad3;
        Thought lo3 = Thought263.getInstance(ad4, fd0, fd1, ld2);
        Thought lo4 = Thought359.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
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
      fb1 = fo0.m2();
}
    Output.points[3][3] -= fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought170.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    double ld1 = 798.735447852143;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[3][4] += fd1;
    for(int i0=0; i0<10; i0++){
        ld1 = fd0 - fd1;
        fb0 = ld1 > fd0;
        fd1 = ld1 + fd0;
        fd1 = ld1 - fd0;
        Output.points[3][5] -= fd1;
        Thought lo2 = Thought352.getInstance(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
        fd0 = fd1 + ld1;
        fd0 = fd1 + ld1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought121.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    lb2 = !lb3;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    Thought lo4 = Thought126.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Output.points[3][6] += fd0;
    boolean lb5 = false;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb2, lb3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb5, ab1, ab2, ab3);
}
    double ld6 = 98.16823396396859;
if(fo0 != null){
      fo1 = fo0.m4(ld6, fd0, fd1, ld6, ab4, fb0, fb1, lb0);
}
    double ld7 = 372.4137136576047;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, lb5, ab1);
}
        ab2 = ld7 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld6, ld7, fd0, fd1);
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
    fb1 = ad1 < ad2;
    fb0 = ad3 < ad4;
    boolean lb0 = false;
    Output.points[3][7] -= fd0;
    boolean lb1 = false;
    lb1 = fd1 < ad1;
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    Thought lo3 = Thought70.getInstance();
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
    lb1 = !lb2;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
    double ld4 = 898.4048704996559;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ld4;
    double ld5 = 57.01642621377137;
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    ld5 = ad1 - ad2;
    lb1 = !lb2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought297.getInstance(ad1, ad2, ad3, ad4);
    double ld1 = 190.7345243763147;
    ab1 = !ab2;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo1.m3();
}
    Thought lo2 = Thought18.getInstance(ab3, ab4, fb0, fb1);
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld1;
        boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, ad1, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb3 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    Thought lo4 = Thought169.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ld1, ad1, ad2, ad3);
}
    Thought lo5 = Thought355.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb3 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb1, lb3, ab1, ab2);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab3 = fo0.m2(ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb3);
}
    Thought lo6 = Thought352.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb3;

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
        Thought lo0 = Thought188.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought248.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 913.8586759189351;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4();
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
    if (fb1) {
        Output.points[3][8] += ad2;
        fb0 = !fb1;
        fb0 = ad3 > ad4;
if(ao1 != null){
          ao1.m3(fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought311.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
        ad3 = ad4 - fd0;
        fb1 = fb0 && fb1;
        fb0 = fd1 < ad1;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        boolean lb2 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb1);
}
if(ao2 != null){
          lb2 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Thought lo3 = Thought335.getInstance(fd1, ad1, ad2, ad3);
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    double ld1 = 303.8730254299812;
if(fo1 != null){
      ld1 = fo1.m3();
}
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    Output.points[4][0] -= fd0;
if(ao3 != null){
      ab3 = ao3.m2(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought188.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ld1 = ao1.m3(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    Output.points[4][1] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    fb1 = !lb0;
    Thought lo3 = Thought211.getInstance();
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Output.points[4][2] += ld1;
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;

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
      ao1.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    Output.points[4][3] -= fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    boolean lb4 = false;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    boolean lb5 = true;
    lb0 = !lb1;
    double ld6 = 469.82134877300155;
    Output.points[4][4] += ld6;
    ad1 = ad2 + ad3;
    Thought lo7 = Thought281.getInstance();
    lb2 = lb3 || lb4;
    lb5 = ad4 > fd0;
    ab1 = !ab2;
    double ld8 = 488.2733538404398;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m1();
}
        ab1 = fd0 > fd1;
        Thought lo0 = Thought257.getInstance(ab2, ab3, ab4, fb0);
        fd0 *= -1;
        }
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb1 = ab1 || ab2;
    double ld1 = 886.5788339066181;
    ab3 = fd0 > fd1;
    ab4 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    double ld2 = 600.3859426821417;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = ad3 > ad4;
    double ld1 = 249.96170082811108;
    Output.points[4][5] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ad1, ad2);
}
    lb0 = ad3 > ad4;
    boolean lb2 = false;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb2 = fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
    Thought lo3 = Thought230.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
    boolean lb4 = true;
    Output.points[4][6] += ld1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb5 = true;
    lb2 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld1;
    lb4 = lb5 || fb0;

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
    ad1 = ad2 + ad3;
    ab2 = !ab3;
    Output.points[4][7] -= ad4;
    Thought lo0 = Thought277.getInstance();
    boolean lb1 = true;
    Thought lo2 = Thought198.getInstance(ab3, ab4, fb0, fb1);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, lb3, ab1, ab2);
}
    ad3 *= -1;
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb1 = ad4 < fd0;
    Thought lo4 = Thought134.getInstance(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
    boolean lb5 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    Output.points[4][8] += fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    Output.points[5][0] += fd0;
    fd1 = fd0 - fd1;
    Output.points[5][1] -= fd0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
        double ld0 = 223.86060644036542;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld1 = 743.9161178445013;
if(ao1 != null){
      ao1.m1(ld1, fd0, fd1, ld0);
}
    fb1 = !fb0;
    Thought lo2 = Thought176.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0);
    Output.points[5][2] -= ld1;
    Thought lo3 = Thought387.getInstance();
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    if (lb0) {
        } else {
        fb0 = fb1 || lb0;
        ad4 *= -1;
if(ao2 != null){
          ao2.m2(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
                  ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        fb0 = ad1 > ad2;
        Thought lo1 = Thought85.getInstance();
        ad3 = ad4 + fd0;
        fb1 = fd1 > ad1;
        double ld2 = 669.8917338699758;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo0 = Thought35.getInstance(ab2, ab3, ab4, fb0);
    Output.points[5][3] -= fd0;
    fb1 = fd1 < fd0;
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought97.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    Output.points[5][4] -= fd0;
    boolean lb1 = true;
    Thought lo2 = Thought167.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    Thought lo4 = Thought287.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
    boolean lb5 = false;
        ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m3(ab3, ab4, fb0, fb1);
}
    double ld7 = 442.20303045921605;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, lb3, lb5, lb6);
}
    ld7 = ad1 - ad2;
    ab1 = !ab2;
    ab3 = ad3 > ad4;
    fd0 = fd1 + ld7;
    ab4 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb3);
}
    ld7 = ad1 - ad2;
    double ld8 = 687.2663153954772;

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
    Thought lo0 = Thought106.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought45.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
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
    Output.points[5][5] += fd0;
    boolean lb0 = true;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    ab3 = fd0 < fd1;
    fd0 *= -1;
    ab4 = fb0 || fb1;
    boolean lb1 = true;
    fd1 *= -1;
    double ld2 = 340.0532155222333;
    lb0 = !lb1;
    ab1 = ld2 < fd0;
    ab2 = fd1 < ld2;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought389.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ld2 = fo1.m3(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
    double ld4 = 771.8295478055784;
    fd0 = fd1 + ld2;
    lb1 = !ab1;
    boolean lb5 = false;
    Thought lo6 = Thought267.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);

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
    boolean lb0 = true;
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 246.25482539746903;
        fb1 = ad4 < fd0;
if(fo0 != null){
          fo0.m2(fd1, ld1, ad1, ad2);
}
        lb0 = fb0 && fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        Output.points[5][6] -= ld1;
if(fo0 != null){
          ad1 = fo0.m3();
}
if(fo1 != null){
          fo1.m2(lb0, fb0, fb1, lb0);
}
        ad2 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        fb1 = ld1 < ad1;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought105.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m1();
}
    fb1 = ad2 < ad3;
    double ld1 = 177.63928842416982;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld2 = 765.8781995935263;
    Thought lo3 = Thought332.getInstance(ld1, ld2, ad1, ad2, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    fb1 = ab1 || ab2;
    Output.points[5][7] += ld1;

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
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 495.59777890742885;
    lb0 = fb0 && fb1;
    if (lb0) {
        ld1 = fd0 - fd1;
        boolean lb2 = true;
if(fo1 != null){
          fo1.m3();
}
        double ld3 = 305.7927035237945;
        lb0 = !fb0;
if(ao1 != null){
          ao1.m2(fb1, lb2, lb0, fb0);
}
        if (fb1) {
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, ld1, fd0, fd1, lb2, lb0, fb0, fb1);
}
if(ao2 != null){
              ao2.m2(ld3, ld1, fd0, fd1, lb2, lb0, fb0, fb1);
}
            lb2 = !lb0;
            ld3 = ld1 - fd0;
            boolean lb4 = false;
            lb0 = fb0 && fb1;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, lb2, lb0, fb0);
}
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1);
}
            double ld5 = 971.7510140133031;
if(ao2 != null){
              ao2.m2(fd0, fd1, ld5, ld3);
}
}}
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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[5][8] -= fd0;
    if (fb1) {
        } else {
if(ao1 != null){
          ao1.m3();
}
        if (fb0) {
            fb1 = fb0 && fb1;
            fb0 = fb1 && fb0;
            boolean lb0 = false;
            double ld1 = 930.3517938510173;
            Thought lo2 = Thought229.getInstance(fb0, fb1, lb0, fb0);
            fd0 = fd1 - ld1;
            ad1 = ad2 - ad3;
            fb1 = ad4 > fd0;
            boolean lb3 = true;
if(ao2 != null){
              lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, lb3, fb0, fb1, lb0);
}
            } else if (fb1) {
if(ao2 != null){
              ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
}}
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
    double ld0 = 858.8895355657396;
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
    boolean lb2 = false;
    ld0 *= -1;
    Thought lo3 = Thought256.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
if(ao1 != null){
      lb1 = ao1.m2();
}
    Output.points[6][0] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(lb2, ab1, ab2, ab3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 532.2193124545109;
    ab2 = ld0 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    double ld1 = 775.0238958863965;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    double ld2 = 79.48903708359991;
    ab3 = ld2 < ad1;
    ab4 = fb0 && fb1;
    ad2 = ad3 - ad4;
    ab1 = fd0 < fd1;
    Thought lo3 = Thought267.getInstance(ao2, ao3, ao4, fo0);
    ab2 = ab3 && ab4;
    fb0 = ld0 < ld1;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ad1, ad2, ad3);
}
    fb1 = !ab1;
    boolean lb4 = false;
    ab1 = ab2 && ab3;
    double ld5 = 963.056387099224;
        for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        ab4 = fb0 || fb1;
        fd1 *= -1;
}
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
    Thought lo0 = Thought272.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld1 = 675.5404158055962;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought32.getInstance();
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb3, fb0);
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    Thought lo2 = Thought285.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[6][1] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fb1, lb0, lb1, fb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = !lb0;
    Output.points[6][2] += fd1;
        Thought lo3 = Thought158.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 787.6509063633661;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    double ld1 = 857.8521112884123;
    fb0 = fb1 || fb0;
    Output.points[6][3] -= fd0;
        Thought lo2 = Thought37.getInstance();
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
}
