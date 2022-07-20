package genetic;
import java.util.ArrayList;
class Thought146 extends Thought{
private static ArrayList<Thought146> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 946.1056472590499;
private double fd1 = 461.2789570109491;
private Thought fo0 = null;
private Thought fo1 = null;
Thought146 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought146 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought146 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought146 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought146 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought146 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought146 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought146 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought146 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought146 instance = new Thought146 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought146 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought146 instance = new Thought146 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought146 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought146 instance = new Thought146 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought146 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought146 instance = new Thought146 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought146 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought146 instance = new Thought146 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought146 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought146 instance = new Thought146 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought146 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought146 instance = new Thought146 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought146 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought146 instance = new Thought146 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    if (fb1) {
        } else if (fb0) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
        fd1 *= -1;
        boolean lb0 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < fd0;
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought118.getInstance(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
    Thought lo3 = Thought94.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
    boolean lb4 = true;
    ab3 = ab4 || fb0;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    double ld6 = 413.9892113394765;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld6, fd0, fd1, ld6);
}
    fd0 = fd1 - ld6;
    fd0 = fd1 + ld6;
    fd0 = fd1 + ld6;

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
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought48.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought392.getInstance(fo0, fo1, fo0, fo1);

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
    fd0 = fd1 - ad1;
    Thought lo0 = Thought303.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Output.points[3][3] += fd1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2();
}
    Thought lo2 = Thought391.getInstance(ab4, fb0, fb1, lb1);
    Thought lo3 = Thought290.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
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
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
    lb1 = !fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought40.getInstance();
if(ao4 != null){
      ao4.m3(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought246.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb1, fb0);
    Output.points[3][4] -= fd0;
    boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && lb0;

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
    fb1 = fb0 || fb1;
    Output.points[3][5] += ad2;
    double ld0 = 273.2548056849019;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    double ld1 = 644.4637023541734;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ad1);
}
    fb1 = fb0 || fb1;
        ad2 *= -1;
    fb0 = !fb1;
    double ld2 = 26.925299733682458;
    Thought lo3 = Thought147.getInstance();
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    ld0 = ld1 + ld2;
    fb0 = fb1 || fb0;
    fb1 = !fb0;

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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    lb0 = fd1 > fd0;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
    Output.points[3][6] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(lb0, ab1, ab2, ab3);
}
    double ld1 = 627.7761234473696;
    ld1 = fd0 - fd1;

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    double ld0 = 160.71157427374214;
    Thought lo1 = Thought113.getInstance(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
    double ld2 = 166.88583284752391;
    Thought lo3 = Thought24.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
    boolean lb4 = false;
    Thought lo5 = Thought373.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m2(ld2, ad1, ad2, ad3);
}
    Thought lo6 = Thought55.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
    ab1 = !ab2;
if(ao2 != null){
      ao2.m2();
}
    Output.points[3][7] -= ld2;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    Thought lo7 = Thought206.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);
    Thought lo8 = Thought209.getInstance(fd0, fd1, ld0, ld2, ab4, fb0, fb1, lb4);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Thought lo9 = Thought340.getInstance(ao2, ao3, ao4, fo0);
    fb0 = ad1 < ad2;
    Thought lo10 = Thought344.getInstance(ad3, ad4, fd0, fd1);
    Output.points[3][8] += ld0;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    fb1 = ld2 > ad1;
if(fo1 != null){
      fo0 = fo1.m4();
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 913.7454051097576;
    Thought lo1 = Thought383.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought318.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    boolean lb3 = false;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb4 = fb0 && fb1;
if(fo1 != null){
      ld0 = fo1.m3(lb3, lb4, fb0, fb1);
}
    boolean lb5 = false;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb3, lb4, lb5, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0, fb1, lb3, lb4, lb5);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb6, fb0, fb1, lb3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo7 = Thought54.getInstance(fd1, ld0, fd0, fd1);
    boolean lb8 = true;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Output.points[4][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = !ab1;
    Output.points[4][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    lb0 = !ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Output.points[4][2] += ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    double ld1 = 198.5130785511288;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought271.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 - ad3;
    lb0 = ad4 < fd0;
    boolean lb3 = false;
    Output.points[4][3] -= fd1;
    lb3 = ld1 < ad1;
    fb0 = !fb1;
    lb0 = lb3 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought191.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
    ad3 = ad4 - fd0;
    fb1 = lb0 || lb3;
    if (fb0) {
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
    ad1 *= -1;
    Thought lo0 = Thought325.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        double ld2 = 35.410672302765235;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld3 = 796.7981715104095;
if(fo0 != null){
          fb1 = fo0.m2(lb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        lb1 = fd0 > fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2, ab1, ab2, ab3, ab4);
}
        boolean lb4 = false;
        ab4 = ad3 < ad4;
        boolean lb5 = false;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld2, ld3, ab4, fb0, fb1, lb4);
}
        ad1 *= -1;
}
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
    fb0 = !fb1;
    boolean lb0 = false;
    Thought lo1 = Thought255.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
    fd1 *= -1;
    boolean lb2 = false;
    lb2 = fd0 < fd1;
    fb0 = fb1 || lb0;
    Thought lo3 = Thought216.getInstance(fo1, ao1, ao2, ao3);
    lb2 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    lb0 = fb0 && fb1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = ab1 && ab2;
    boolean lb0 = true;
    double ld1 = 660.8734887151337;
    fd0 *= -1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
    Output.points[4][4] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1);
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
    ad2 = ad3 - ad4;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Output.points[4][5] -= ad3;
    boolean lb1 = false;
    Output.points[4][6] -= ad4;
if(ao1 != null){
      ao1.m2();
}
    lb0 = !lb1;
    fd0 = fd1 - ad1;
    boolean lb2 = true;
    lb2 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fb1 = lb0 && lb1;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
        ad2 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought320.getInstance(ao3, ao4, fo0, fo1);
    ab4 = ad3 < ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 && lb0;
    lb1 = ad2 > ad3;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 144.43542229746484;
    Thought lo1 = Thought32.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    Thought lo2 = Thought148.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ld0;
    Thought lo3 = Thought366.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;

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
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought164.getInstance(ab2, ab3, ab4, fb0);
    Thought lo1 = Thought46.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    Thought lo2 = Thought203.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 || fb1;
    double ld3 = 54.29036919786059;
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0);
}
    Thought lo4 = Thought317.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
    ab1 = ld3 < fd0;
    Output.points[4][7] -= fd1;
    ld3 = fd0 - fd1;
    ab2 = ld3 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld5 = 877.6437566133538;
    ab3 = fd0 < fd1;
        ab4 = !fb0;
    double ld6 = 923.8799556457624;
    fb1 = ld3 > ld5;
    boolean lb7 = false;
    Thought lo8 = Thought179.getInstance(lb7, ab1, ab2, ab3);
    ab4 = fb0 || fb1;

Thought.STACK_COUNTER++;
return ld6;
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
    Thought lo0 = Thought354.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    ad4 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb2 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 634.5656644713912;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = !ab1;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ld0 = ad1 - ad2;

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
    fd0 = fd1 - fd0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fd1 < fd0;
    fb0 = !fb1;
    Thought lo1 = Thought232.getInstance();
if(ao3 != null){
      lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought352.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;

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
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 < ad1;
    boolean lb0 = false;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought127.getInstance();
if(fo1 != null){
          fo1.m3(fb1, lb0, fb0, fb1);
}
        double ld2 = 914.7007808044981;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        double ld3 = 278.09964962980007;
        lb0 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(ld3, ad1, ad2, ad3);
}
        }
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    boolean lb4 = true;
    Thought lo5 = Thought150.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    double ld6 = 776.0040429832306;

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
    boolean lb0 = true;
    Output.points[4][8] += fd0;
if(ao1 != null){
      ao1.m1();
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    double ld2 = 213.33721867516905;
    ab3 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - ld2;

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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    double ld1 = 548.7109333513677;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    Output.points[5][0] += ad4;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, ld1, ad1);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || lb0;
    fd1 *= -1;
    Output.points[5][1] += ld1;
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[5][2] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, lb0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought354.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;

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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 348.4084066869136;
    ab1 = ld2 < fd0;
    fd1 = ld2 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 || ab4;
    ld2 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought291.getInstance(fd0, fd1, ld2, fd0, fb1, lb0, lb1, ab1);
    ab2 = fd1 < ld2;
    ab3 = ab4 || fb0;
    double ld4 = 930.5872162348081;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = ld4 > fd0;

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
    fb1 = !fb0;
    Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 559.3143232494216;
    boolean lb2 = false;
    double ld3 = 188.42241406861476;
if(fo1 != null){
          fo1.m1(ld3, ad1, ad2, ad3);
}
    Thought lo4 = Thought366.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
    double ld5 = 146.78554377575117;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
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
    ab1 = ad2 < ad3;
    ab2 = ab3 && ab4;
    double ld0 = 438.93128221877737;
    ad3 *= -1;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought105.getInstance(fo0, fo1, fo0, fo1);
    ab2 = !ab3;
    boolean lb2 = true;
    double ld3 = 236.07143398443378;
    ab3 = ld0 > ld3;
    ad1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0);
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
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought68.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    Output.points[5][3] += fd1;
    lb0 = fb0 || fb1;

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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    fb0 = fb1 && lb0;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld2 = 820.5792167771455;
    double ld3 = 815.34443632646;
    double ld4 = 657.1516836571009;
if(ao1 != null){
      ao1.m3(ld2, ld3, ld4, ad1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    double ld0 = 856.4901488654631;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Output.points[5][4] += fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd1 = ao3.m3(ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
    if (ab1) {
        fd0 = fd1 + ld0;
        fd0 = fd1 - ld0;
        if (ab2) {
            boolean lb1 = false;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
            if (fb1) {
if(ao4 != null){
                  ao4.m2(fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
}
                ab4 = fb0 || fb1;
                Output.points[5][5] += ld0;
                lb1 = fd0 < fd1;
                double ld2 = 758.6733174065251;
if(fo0 != null){
                  fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
                fb0 = ld2 < ld0;
if(fo0 != null){
                  ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
                  fb1 = ao4.m2(fd0, fd1, ld2, ld0);
}
                double ld3 = 222.87974924500475;
                Output.points[5][6] += ld0;
}}}
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
    ab2 = !ab3;
    boolean lb0 = true;
    Thought lo1 = Thought375.getInstance();
    ab3 = !ab4;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, ab1);
}
    double ld2 = 990.5585838267525;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought178.getInstance(ad4, fd0, fd1, ld2, fb1, lb0, ab1, ab2);
    boolean lb4 = false;
    boolean lb5 = true;
    if (ab1) {
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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
        Output.points[5][7] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[5][8] -= fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
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
if(fo1 != null){
          fb0 = fo1.m2();
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
        fd1 = fd0 - fd1;
if(fo0 != null){
          lb1 = fo0.m2(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    Thought lo2 = Thought398.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Output.points[6][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - fd0;
    Output.points[6][1] -= fd1;
    fb0 = fd0 > fd1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 35.88249122024922;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    double ld2 = 425.004320249329;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1);
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
