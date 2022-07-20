package genetic;
import java.util.ArrayList;
class Thought43 extends Thought{
private static ArrayList<Thought43> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 152.52598085900073;
private double fd1 = 315.9167325119317;
private Thought fo0 = null;
private Thought fo1 = null;
Thought43 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought43 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought43 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought43 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought43 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    double ld1 = 212.0278030081427;
    lb0 = fb0 || fb1;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb2, fb0, fb1);
}
    lb0 = lb2 && fb0;
    fb1 = fd1 > ld1;
    Thought lo3 = Thought391.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
    boolean lb4 = true;
    Output.points[1][0] -= fd1;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, lb0, lb2, lb4, fb0);
}
    fb1 = fd0 > fd1;
    double ld5 = 858.4045567144389;
    double ld6 = 66.74996711019382;
    lb0 = ld1 < ld5;
    lb2 = !lb4;
    double ld7 = 980.5467281331005;
    fb0 = ld6 > ld7;

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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought350.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought375.getInstance(ab4, fb0, fb1, ab1);
    double ld2 = 309.21763281154676;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd0 *= -1;

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
    ad1 = ad2 + ad3;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[1][1] += ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    lb0 = !ab1;
    Thought lo1 = Thought363.getInstance();
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought200.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
        boolean lb3 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb0);
}
        ab1 = !ab2;
        fd1 = ad1 - ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ab3 = ab4 && fb0;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ad1, ad2);
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
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = fb0 && fb1;
    lb0 = fd1 > fd0;
    Output.points[1][2] += fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m3(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fd1 = fd0 + fd1;
    Output.points[1][3] += fd0;

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
    if (fb1) {
        boolean lb0 = true;
        lb0 = fb0 || fb1;
        ad2 *= -1;
        lb0 = fb0 || fb1;
        Thought lo1 = Thought130.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
        fb0 = ad3 > ad4;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb3 = true;
        fd0 = fd1 - ad1;
if(fo0 != null){
          lb3 = fo0.m2(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        ad3 = ad4 - fd0;
        } else {
        Output.points[1][4] += fd1;
        ad1 *= -1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
        fb1 = !fb0;
        fd1 *= -1;
        ad1 *= -1;
if(fo0 != null){
          ad2 = fo0.m3();
}
        fb1 = ad3 < ad4;
        if (fb0) {
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    double ld0 = 333.8418196019565;
    ld0 = fd0 - fd1;
    boolean lb1 = false;
if(ao4 != null){
      ao4.m2(ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    Output.points[1][5] += fd0;
    fd1 *= -1;
    ab4 = fb0 || fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought286.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    fd0 *= -1;
    double ld1 = 58.213183649129654;
    double ld2 = 132.77173965437171;
    ab1 = ad4 > fd0;
    fd1 *= -1;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        ab1 = ld1 < ld2;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][6] += fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought90.getInstance(fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld2 = 770.5840040938616;
    lb0 = ld2 > fd0;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought234.getInstance(fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
    Thought lo4 = Thought87.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 87.75971164280922;
    ab1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab2 = ab3 || ab4;
    Thought lo1 = Thought135.getInstance();
    fd0 *= -1;
    Thought lo2 = Thought193.getInstance(fb0, fb1, ab1, ab2);
    Thought lo3 = Thought2.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ab1 = fo0.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought344.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    Output.points[1][7] += ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb1);
}
    ad1 = ad2 + ad3;
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
    boolean lb3 = false;
    boolean lb4 = false;
    ad2 = ad3 - ad4;
    Thought lo5 = Thought337.getInstance(fo0, fo1, fo0, fo1);
    lb4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
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
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ad2 *= -1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    boolean lb0 = true;
    double ld1 = 611.3522427616311;
    fb0 = fb1 || lb0;

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
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[1][8] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[2][0] -= fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    Output.points[2][1] += fd1;
    fb1 = fd0 > fd1;
        boolean lb0 = true;
    fd0 = fd1 + fd0;
    Output.points[2][2] -= fd1;
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[2][3] += fd1;
    fd0 = fd1 - fd0;

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
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought299.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Output.points[2][4] -= fd1;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld1 = 959.4534090527056;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought89.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld1);
}
    boolean lb3 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
          ld1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    lb3 = fd0 < fd1;

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
    boolean lb0 = true;
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(lb0, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, lb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && lb0;
    lb1 = !ab1;
    ab2 = ad4 > fd0;
    fd1 *= -1;
    ab3 = !ab4;
    Thought lo2 = Thought219.getInstance(fb0, fb1, lb0, lb1);
    ab1 = !ab2;
    Thought lo3 = Thought253.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought231.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = fd1 < fd0;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    boolean lb2 = false;

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
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
    Output.points[2][5] += fd1;
    Thought lo0 = Thought213.getInstance(fd0, fd1, fd0, fd1);
    ab1 = fd0 > fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = lb3 && ab1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[2][6] -= fd0;
    fb1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
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
    Thought lo0 = Thought29.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 495.73765801472445;
    fb0 = ld1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, ad1, ad2, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
        Output.points[2][7] += ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + ld1;
        } else {
        fb0 = fb1 && lb2;
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
    Thought lo0 = Thought234.getInstance(ad1, ad2, ad3, ad4);
    ab2 = ab3 || ab4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2();
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb1);
}
    ab1 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought302.getInstance(fd0, fd1, ad1, ad2, fb1, lb1, ab1, ab2);
    ab3 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought150.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought308.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    double ld3 = 295.34785526017095;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m2(fd1, ld3, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb4 = false;
    ld3 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(ld3, fd0, fd1, ld3);
}
    Output.points[2][8] += fd0;
    fd1 = ld3 + fd0;
    if (lb4) {
        Thought lo5 = Thought386.getInstance(ao1, ao2, ao3, ao4, fd1, ld3, fd0, fd1);
        boolean lb6 = false;
        lb4 = !fb0;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    ad2 = ad3 + ad4;
    fb1 = lb0 || lb1;
    Thought lo2 = Thought216.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
    fb0 = fb1 && lb0;
    lb1 = fd0 < fd1;
    Thought lo3 = Thought44.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld4 = 4.395294890352134;
    fb1 = lb0 && lb1;
    boolean lb5 = true;
    Output.points[3][0] += ld4;
    Thought lo6 = Thought92.getInstance(lb5, fb0, fb1, lb0);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, lb5, fb0, fb1);
}
    Thought lo7 = Thought277.getInstance(fd0, fd1, ld4, ad1, lb0, lb1, lb5, fb0);

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = !ab1;
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought353.getInstance(ab4, fb0, fb1, lb0);
    fd0 *= -1;
    Thought lo2 = Thought146.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb3 = false;
    double ld4 = 196.4757727118041;
    Thought lo5 = Thought20.getInstance(fd0, fd1, ld4, fd0, ab4, fb0, fb1, lb0);
    double ld6 = 292.574896981579;
    fd0 = fd1 - ld4;
    Thought lo7 = Thought17.getInstance(ao2, ao3, ao4, fo0, lb3, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    ld6 = fd0 - fd1;
    ld4 = ld6 - fd0;
    fd1 = ld4 + ld6;
    Thought lo8 = Thought289.getInstance(fo1, ao1, ao2, ao3);
    lb0 = lb3 || ab1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld4, ld6, fd0);
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
    double ld0 = 618.5513044332725;
    ad1 = ad2 - ad3;
    if (ab2) {
        double ld1 = 318.5394946803671;
        boolean lb2 = false;
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
        Thought lo3 = Thought219.getInstance();
        boolean lb4 = false;
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb2;
if(fo1 != null){
          fo1.m3(lb4, ab1, ab2, ab3);
}
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought191.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    fd1 = fd0 + fd1;
    boolean lb3 = false;
    lb1 = lb3 && fb0;
    fb1 = lb0 || lb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought183.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb0);
}
    boolean lb5 = false;
    lb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, lb5, fb0, fb1);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, lb3, lb5);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 - fd1;
        boolean lb6 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
    Thought lo1 = Thought309.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought380.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Thought lo3 = Thought92.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought242.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb5 = false;
    lb0 = lb5 || ab1;
    Output.points[3][1] += fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo6 = Thought10.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, lb5, ab1);
    fd1 *= -1;
    Output.points[3][2] += fd0;
    fd1 = fd0 - fd1;
    boolean lb7 = false;
    boolean lb8 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb8, ab1, ab2, ab3);
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
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
    double ld0 = 679.4912522575323;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    Thought lo1 = Thought282.getInstance();
    Output.points[3][3] += ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ld0 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = fd1 > ld0;
        ad1 = ad2 + ad3;
        ad4 *= -1;
        Output.points[3][4] -= fd0;
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo1.m2(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
        double ld2 = 525.7166673639299;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        Thought lo3 = Thought166.getInstance(fo1, fo0, fo1, fo0);
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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    ad4 *= -1;
    if (ab3) {
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
        fd1 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 983.5649877839974;
    fb0 = fb1 || fb0;
    ld0 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(ao3 != null){
      ao3.m3();
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
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
    fb0 = ad1 < ad2;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    double ld1 = 138.46716741386618;
    Output.points[3][5] += ad3;
    boolean lb2 = true;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      lb0 = ao3.m2(lb2, fb0, fb1, lb0);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, ld1, ad1, lb2, fb0, fb1, lb0);
}
    ad2 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought145.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
    boolean lb2 = true;
    Output.points[3][6] += fd0;
    double ld3 = 984.9231536237957;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + ld3;
    fd0 *= -1;
    fd1 = ld3 - fd0;
    Thought lo4 = Thought348.getInstance(fd1, ld3, fd0, fd1);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        ab2 = !ab3;
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          fd0 = ao1.m3();
}
        fb0 = !fb1;
        ab1 = ab2 && ab3;
        boolean lb0 = false;
        Thought lo1 = Thought16.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
        Thought lo2 = Thought311.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
        fb0 = fb1 || lb0;
        boolean lb3 = false;
if(ao1 != null){
          ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ad1);
}
        Thought lo4 = Thought209.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
        } else if (ab2) {
        Output.points[3][7] -= fd1;
        boolean lb5 = false;
        ab2 = ab3 && ab4;
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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    lb0 = fb0 && fb1;
    lb0 = fd0 > fd1;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 || lb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        Thought lo2 = Thought266.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought372.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;

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
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
          fb0 = fo0.m2();
}
    fb1 = fb0 && fb1;
    double ld0 = 744.4142716734151;
    boolean lb1 = true;
if(fo1 != null){
      ld0 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    Output.points[3][8] -= ld0;
    Thought lo2 = Thought255.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = false;
    fd0 = fd1 + ld0;
    lb3 = fd0 > fd1;
    boolean lb4 = true;
    ld0 = fd0 - fd1;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    lb5 = fb0 && fb1;
    Thought lo6 = Thought354.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb3, lb4, lb5);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb3);
}
        Output.points[4][0] += ld0;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0, lb4, lb5, fb0, fb1);
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
