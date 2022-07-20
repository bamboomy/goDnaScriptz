package genetic;
import java.util.ArrayList;
class Thought169 extends Thought{
private static ArrayList<Thought169> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 111.13441299501933;
private double fd1 = 969.8715981011892;
private Thought fo0 = null;
private Thought fo1 = null;
Thought169 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought169 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought169 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought169 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought169 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought169 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought169 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought169 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought169 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought169 instance = new Thought169 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought169 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought169 instance = new Thought169 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought169 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought169 instance = new Thought169 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought169 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought169 instance = new Thought169 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought169 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought169 instance = new Thought169 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought169 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought169 instance = new Thought169 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought169 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought169 instance = new Thought169 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought169 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought169 instance = new Thought169 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
        boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb0 = !lb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    fb1 = lb0 || lb1;
    double ld3 = 162.88418387602792;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3);
}
    lb2 = fb0 || fb1;
    boolean lb4 = true;
    lb0 = lb1 || lb2;
    double ld5 = 465.2480410888753;

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
    Thought lo0 = Thought40.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    Output.points[7][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    double ld2 = 938.3189316938114;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    fd1 *= -1;
    ld2 = fd0 - fd1;
    Output.points[7][1] -= ld2;

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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 262.2220580743709;
    Output.points[7][2] -= ad1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad3 = ad4 + fd0;
    Output.points[7][3] += fd1;
    fb0 = ld0 < ad1;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought288.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, lb3, fb0, fb1, lb2);
}
    lb3 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, lb3, fb0);
}
        Thought lo4 = Thought97.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb5 = true;
    Thought lo6 = Thought261.getInstance();
    fb0 = fd0 > fd1;
    Thought lo7 = Thought346.getInstance(fb1, lb2, lb3, lb5);
    fb0 = fb1 && lb2;
    Thought lo8 = Thought200.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb3, lb5, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, lb2, lb3, lb5, fb0);
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
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 744.4701019809887;
    Output.points[7][4] -= ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ld1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld1 + ad1;
    double ld2 = 4.781828055073402;
    ad1 *= -1;
    Thought lo3 = Thought390.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
    ab3 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    ab1 = ld2 > ad1;
    Output.points[7][5] += ad2;
    ab2 = ad3 < ad4;
    ab3 = fd0 > fd1;
    boolean lb4 = false;
    ab3 = ld1 > ld2;

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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Output.points[7][6] += fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fd0 *= -1;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought370.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 || lb0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[7][7] += fd0;
    fd1 *= -1;
    lb0 = fb0 && fb1;

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
    Output.points[7][8] += ad1;
    fb0 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 = fd0 + fd1;
    Output.points[8][0] += ad1;
    fb1 = ad2 > ad3;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought72.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ad1 = ao2.m3(lb2, fb0, fb1, lb0);
}
    lb2 = fb0 && fb1;
    lb0 = lb2 && fb0;
    fb1 = lb0 && lb2;
    Thought lo3 = Thought118.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
    boolean lb4 = false;
    lb4 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb2);
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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought251.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[8][1] += fd1;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    double ld1 = 169.19141948394403;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab2 = ao2.m2(ld1, fd0, fd1, ld1);
}
    if (ab3) {
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
        fd1 = ld1 - fd0;
        ab4 = fb0 && fb1;
        double ld2 = 28.501096097913013;
        boolean lb3 = true;
        fd0 *= -1;
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
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao2.m3();
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    Output.points[8][2] -= ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    double ld0 = 853.312110820966;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 + ld0;
    fb0 = ad1 > ad2;
    ad3 *= -1;
    if (fb1) {
        boolean lb2 = false;
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
    double ld0 = 678.7342175563234;
    Output.points[8][3] -= ld0;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        Output.points[8][4] -= fd1;
        fb0 = fb1 || fb0;
        double ld1 = 915.3600833757434;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
        double ld3 = 968.4863100038294;
        Thought lo4 = Thought188.getInstance(fo0, fo1, fo0, fo1, ld1, ld3, ld0, fd0, fb0, fb1, lb2, fb0);
if(fo0 != null){
          fd1 = fo0.m3(ld1, ld3, ld0, fd0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
        fb0 = fb1 && lb2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld1, ld3, ld0);
}
        Output.points[8][5] -= fd0;
        fb1 = fd1 < ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld0, fd0, fd1);
}
        ld1 = ld3 - ld0;
if(fo0 != null){
          fo0.m1();
}
if(fo0 != null){
          fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
        Thought lo5 = Thought32.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3, fb0, fb1, lb2, fb0);
        ld0 = fd0 - fd1;
if(fo1 != null){
          fb1 = fo1.m2(ld1, ld3, ld0, fd0, lb2, fb0, fb1, lb2);
}
        fb0 = fd1 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
        ld3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought337.getInstance();
    fd1 = fd0 + fd1;
    Thought lo1 = Thought326.getInstance(ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought36.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    ab3 = fd0 > fd1;
    Output.points[8][6] += fd0;
    ab4 = !fb0;
    Output.points[8][7] += fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;

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
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Thought lo0 = Thought1.getInstance(fd1, ad1, ad2, ad3);
    fb0 = !fb1;
    Thought lo1 = Thought19.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    double ld2 = 485.85095497046683;
if(fo0 != null){
      fo0.m3();
}
    Thought lo3 = Thought374.getInstance(fb0, fb1, fb0, fb1);
        fb0 = !fb1;
    fb0 = !fb1;
    ad1 = ad2 - ad3;

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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd1 *= -1;
    double ld0 = 974.1908278323847;
    ld0 *= -1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 *= -1;
    ad2 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld1 = 265.8791475090091;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2();
}
    ld1 *= -1;
    Thought lo2 = Thought231.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd0 > fd1;
    Thought lo3 = Thought370.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);

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
    ad2 = ad3 - ad4;
    double ld0 = 883.3940240232531;
    ad4 = fd0 - fd1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought233.getInstance(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    ad4 = fd0 - fd1;
    Thought lo2 = Thought252.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb3 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Thought lo4 = Thought130.getInstance(ld0, ad1, ad2, ad3);
    Output.points[8][8] += ad4;
    double ld5 = 711.8611441153358;
    fb0 = ad4 > fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld5, ad1);
}
    ad2 = ad3 + ad4;
    fb1 = lb3 && fb0;
    fb1 = lb3 && fb0;
    double ld6 = 836.9999898249848;
    ad4 = fd0 - fd1;

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
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought153.getInstance(ab2, ab3, ab4, fb0);
    Thought lo1 = Thought199.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    ab4 = !fb0;
    fb1 = fd1 > fd0;
    ab1 = !ab2;
    Thought lo2 = Thought342.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    fd1 *= -1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo3 = Thought98.getInstance();
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    double ld4 = 338.84022708143357;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld4 + fd0;

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
    ab1 = ad1 > ad2;
    ab2 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought108.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    ad3 = ad4 + fd0;
    ab1 = ab2 && ab3;
    ab4 = fd1 > ad1;
    double ld1 = 470.0612032526545;
    fb0 = fb1 || ab1;

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
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld0 = 778.0152513134025;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ld0 > fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 || lb1;
    boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = lb2 && lb3;
    double ld4 = 507.9489928057637;
if(fo1 != null){
      ld0 = fo1.m3(ld4, fd0, fd1, ld0);
}
    ld4 = fd0 + fd1;
    fb0 = ld0 < ld4;

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
    fd1 *= -1;
    Output.points[0][0] -= fd0;
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        ab4 = fb0 || fb1;
        ab1 = !ab2;
        Thought lo0 = Thought399.getInstance();
        fd1 = fd0 - fd1;
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
            Output.points[0][1] += fd0;
}}
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
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought255.getInstance(ad1, ad2, ad3, ad4);
        Thought lo1 = Thought67.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
        fb1 = fb0 && fb1;
        Output.points[0][2] += ad3;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m3(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        Thought lo2 = Thought322.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
        fb1 = ad2 < ad3;
        fb0 = fb1 && fb0;
        boolean lb3 = true;
        fb0 = fb1 || lb3;
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb3, fb0);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
}
        fd1 = ad1 + ad2;
        lb3 = ad3 > ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought271.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought389.getInstance();
    ab2 = !ab3;
    ad4 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 *= -1;
    ab3 = ad1 < ad2;
    ab4 = ad3 < ad4;
    boolean lb2 = true;
    Thought lo3 = Thought127.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb2);

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
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought62.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld1 = 10.259488703230424;
    double ld2 = 304.6156072662672;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought211.getInstance(ao2, ao3, ao4, fo0);
    fb0 = !fb1;
if(fo1 != null){
      ld1 = fo1.m3(ld2, fd0, fd1, ld1);
}
    boolean lb4 = false;
    double ld5 = 120.19683529209871;
if(ao1 != null){
      lb4 = ao1.m2(ao2, ao3, ao4, fo0, ld2, ld5, fd0, fd1);
}
    fb0 = ld1 < ld2;
    ld5 = fd0 - fd1;
    fb1 = lb4 && fb0;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
        ad2 = ad3 - ad4;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb0, lb1, lb2, fb0);
}
    boolean lb3 = false;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, lb2, lb3, fb0);
}
    Thought lo4 = Thought50.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, lb1, lb2);
    lb3 = fb0 || fb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      lb0 = ao4.m2(ad3, ad4, fd0, fd1);
}
    lb1 = ad1 > ad2;
    lb2 = ad3 < ad4;
if(fo0 != null){
      lb3 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && lb0;
    lb1 = lb2 && lb3;
if(ao4 != null){
      ao4.m1();
}
    ad3 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, lb2);
}
    lb3 = fb0 || fb1;
    Output.points[0][3] += ad4;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb0, lb1, lb2, lb3);
}
    double ld5 = 907.1485307007124;

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
    Thought lo0 = Thought52.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
    Thought lo2 = Thought396.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
    fd1 *= -1;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    boolean lb3 = false;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    boolean lb5 = false;
    ab3 = ab4 && fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    boolean lb6 = false;
    fd0 = fd1 - fd0;
    Thought lo7 = Thought242.getInstance();
    Thought lo8 = Thought101.getInstance(fb0, fb1, lb1, lb3);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb4, lb5, lb6, ab1);
}
    ab2 = ab3 && ab4;
    double ld9 = 542.1548650192622;
    boolean lb10 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld9, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb3, lb4, lb5, lb6);
}
    lb10 = ab1 || ab2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
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
    Output.points[0][4] -= ad1;
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought74.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
    lb0 = ab1 && ab2;
    ab3 = !ab4;
    boolean lb2 = false;
    double ld3 = 332.63140090804814;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad3 = ao4.m3(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3, lb2, ab1, ab2, ab3);
}
    Output.points[0][5] += ad1;
    ab4 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
}
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
    double ld4 = 284.2127303850528;
    Thought lo5 = Thought383.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
    lb2 = !ab1;

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
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought82.getInstance(fo0, fo1, fo0, fo1);
        double ld1 = 719.584607673284;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
        Thought lo2 = Thought222.getInstance();
if(fo1 != null){
          fo1.m2(fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        ld1 = fd0 + fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        ld1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
        fb0 = !fb1;
        if (fb0) {
            boolean lb3 = true;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
              fb0 = fo1.m2();
}
            fb1 = ld1 < fd0;
if(fo1 != null){
              fo0 = fo1.m4(lb3, fb0, fb1, lb3);
}
            Output.points[0][6] += fd1;
            ld1 = fd0 + fd1;
            fb0 = ld1 < fd0;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb3, fb0, fb1);
}
            Thought lo4 = Thought225.getInstance(ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb3);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    double ld1 = 708.9806224080208;
    double ld2 = 151.48999652240414;
    Output.points[0][7] += ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
if(fo1 != null){
      ab3 = fo1.m2(ld2, fd0, fd1, ld1);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd0 < fd1;
    boolean lb4 = false;
    ld1 = ld2 + fd0;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb0);
}
    boolean lb5 = false;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    if (fb0) {
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = fd1 < ad1;
        fb1 = ad2 > ad3;
        boolean lb0 = true;
        ad4 = fd0 - fd1;
        boolean lb1 = false;
        ad1 *= -1;
        ad2 = ad3 - ad4;
        fd0 *= -1;
        Thought lo2 = Thought36.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = true;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    lb0 = ad4 < fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
    double ld0 = 742.6806432518542;
    boolean lb1 = true;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    lb1 = fd1 > ld0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld2 = 334.8221605944729;
    ld2 = fd0 + fd1;
    boolean lb3 = false;
    ld0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld0);
}
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld2);
}
    fd0 = fd1 - ld0;
        ld2 = fd0 - fd1;
    double ld4 = 535.9668687640674;
if(ao1 != null){
      ao1.m2();
}
    boolean lb5 = true;
    double ld6 = 757.8477455132396;
    lb3 = ld0 > ld2;
    lb5 = ld4 < ld6;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, lb3);
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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    lb0 = fd0 > fd1;
    Output.points[0][8] += ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    double ld1 = 968.6084345665989;
    boolean lb2 = true;
    double ld3 = 603.6335596807608;
    fb0 = fb1 || lb0;
    lb2 = !fb0;
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld3);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    Thought lo4 = Thought389.getInstance(lb0, lb2, fb0, fb1);

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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        if (fb0) {
            fb1 = fd0 > fd1;
            ab1 = fd0 > fd1;
            fd0 = fd1 + fd0;
if(ao1 != null){
              fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
            ab2 = ab3 || ab4;
            Thought lo0 = Thought105.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
            Thought lo1 = Thought89.getInstance();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ad1 *= -1;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
    fb1 = lb0 && ab1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    lb0 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao2.m1(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 && ab3;
        fd0 = fd1 - ad1;
        if (ab4) {
            Output.points[1][0] += ad2;
if(ao2 != null){
              ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
            boolean lb1 = false;
if(ao2 != null){
              ao1 = ao2.m4(ad4, fd0, fd1, ad1);
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
    Thought lo0 = Thought337.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    Output.points[1][1] += fd0;
    boolean lb1 = true;
    fb0 = !fb1;
    boolean lb2 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    lb1 = fd1 < fd0;
    Thought lo4 = Thought353.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(lb2, lb3, fb0, fb1);
}
    Thought lo5 = Thought227.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);

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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought196.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought187.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought267.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb4, fb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[1][2] -= fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought245.getInstance();
    fb0 = !fb1;
    lb0 = lb1 || fb0;
        Output.points[1][3] -= fd1;
    Output.points[1][4] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
    boolean lb4 = false;
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
