package genetic;
import java.util.ArrayList;
class Thought76 extends Thought{
private static ArrayList<Thought76> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 291.5614175154422;
private double fd1 = 334.88618543239215;
private Thought fo0 = null;
private Thought fo1 = null;
Thought76 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought76 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought76 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought76 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought76 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought76 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought76 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought76 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought76 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought76 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought76 instance = new Thought76 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[5][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd1 *= -1;
    Output.points[5][8] -= fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
    boolean lb1 = true;
    double ld2 = 587.2809573117811;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
    Output.points[6][0] -= ld2;

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
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    ab1 = !ab2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
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
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
        double ld0 = 664.6700810141157;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ad3 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought342.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, lb1, fb0);
}
    boolean lb3 = false;
    fb0 = !fb1;
    ad3 *= -1;

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
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    if (ab1) {
        ad1 *= -1;
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld0 = 848.9061303025826;
        boolean lb1 = false;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought240.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fd1 > fd0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        fd1 = fd0 - fd1;
        boolean lb2 = true;
        } else {
        Output.points[6][1] += fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        boolean lb3 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb3);
}
        Thought lo4 = Thought24.getInstance(ao3, ao4, fo0, fo1);
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fd1 *= -1;
        fb0 = !fb1;
        Thought lo5 = Thought33.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2();
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao2 != null){
      lb1 = ao2.m2(lb2, fb0, fb1, lb0);
}
    lb1 = lb2 || fb0;
    ad1 = ad2 - ad3;
    double ld3 = 166.07771957741707;
    fb1 = lb0 && lb1;
    ad3 *= -1;
    double ld4 = 365.52766970310915;
    ad3 = ad4 - fd0;
    lb2 = fd1 < ld3;
    Thought lo5 = Thought40.getInstance(ao3, ao4, fo0, fo1, ld4, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
    ad4 = fd0 + fd1;
    Thought lo6 = Thought354.getInstance(ld3, ld4, ad1, ad2, lb2, fb0, fb1, lb0);
    double ld7 = 194.44990550261366;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld3);
}
    boolean lb8 = true;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, ld4, ld7, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad3 = ao4.m3(lb2, lb8, fb0, fb1);
}
    lb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld3, ld4, ld7, lb1, lb2, lb8, fb0);
}
    Thought lo9 = Thought296.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, lb1, lb2);
    lb8 = fb0 || fb1;

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
    boolean lb0 = true;
    lb0 = !ab1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
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
    ab1 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ad4 *= -1;
    ab4 = fd0 > fd1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    boolean lb0 = false;
if(ao2 != null){
      ab2 = ao2.m2(ad2, ad3, ad4, fd0);
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
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        lb0 = fb0 || fb1;
    fd0 = fd1 - fd0;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought106.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    boolean lb3 = true;
        Thought lo4 = Thought62.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
    Output.points[6][2] -= fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo5 = Thought320.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, lb6, fb0);
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
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 < fd0;
    boolean lb1 = false;
    ab1 = !ab2;
    ab3 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    double ld2 = 930.8551349901371;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought88.getInstance(fd0, fd1, ld2, fd0);
    Output.points[6][3] += fd1;
    fb0 = ld2 > fd0;
    if (fb1) {
        lb0 = fd1 > ld2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
        boolean lb4 = true;
        Thought lo5 = Thought196.getInstance();
        } else if (lb1) {
        boolean lb6 = false;
        Output.points[6][4] -= fd1;
        double ld7 = 783.1317020574613;
        Output.points[6][5] += ld7;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    fb0 = ad1 < ad2;
    fb1 = !fb0;
    ad3 = ad4 + fd0;
    Output.points[6][6] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    double ld0 = 894.8487683629983;
    fd0 = fd1 + ld0;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb1 = true;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    ab1 = !ab2;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m2();
}
    fb1 = fd0 > fd1;
    lb0 = ad1 > ad2;

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
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    Output.points[6][7] -= fd0;
    double ld1 = 457.54643674234615;
    fb0 = fb1 && lb0;
    fd0 = fd1 - ld1;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
    Thought lo3 = Thought213.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb2);
}
    fd0 *= -1;
    fb0 = fd1 < ld1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - ld1;
    boolean lb4 = false;
    boolean lb5 = false;
    lb0 = lb2 && lb4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
    double ld0 = 678.4781912094743;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    fb0 = ld0 < ad1;
    boolean lb1 = false;
    boolean lb2 = false;
    ad2 *= -1;
    double ld3 = 644.6933724251928;

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
    boolean lb0 = false;
    Thought lo1 = Thought159.getInstance(lb0, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought260.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo3 = Thought262.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Output.points[6][8] += fd0;
    lb0 = fd1 < fd0;
    fd1 *= -1;
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    Output.points[7][0] += fd1;
    boolean lb4 = false;
    Output.points[7][1] += fd0;
    double ld5 = 885.4028352685411;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab1 = ab2 || ab3;
    double ld0 = 525.0867207534167;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    Output.points[7][2] += ad2;
    double ld1 = 864.8730191218694;
    ab2 = ad2 < ad3;
    Thought lo2 = Thought38.getInstance(ao2, ao3, ao4, fo0);
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
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
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = lb2 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1();
}
    Output.points[7][3] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(lb2, fb0, fb1, lb0);
}
        Thought lo3 = Thought390.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
    fd1 = fd0 + fd1;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    lb0 = fd0 < fd1;
    boolean lb4 = false;
    boolean lb5 = true;
    Thought lo6 = Thought304.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, lb4, lb5);

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
    fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
    double ld0 = 52.21095410532012;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo1 = Thought79.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 784.2740016797164;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 > ld2;
        }
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    Thought lo3 = Thought391.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + ld0;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab4 = !fb0;
    ld0 = fd0 - fd1;
    boolean lb4 = true;
    fb0 = !fb1;
    lb4 = ld0 < fd0;

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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = true;
    double ld2 = 675.7979553225061;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, lb1, fb0, fb1, lb0);
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
    ad2 *= -1;
    boolean lb0 = true;
    ab1 = ad3 < ad4;
    double ld1 = 1000.3299216173415;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    double ld2 = 237.69987783347253;
    boolean lb3 = true;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 || ab4;
    Output.points[7][4] -= fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, ad1, ad2);
}
        Thought lo4 = Thought105.getInstance();
    boolean lb5 = false;
    lb5 = ab1 && ab2;
    boolean lb6 = true;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    boolean lb7 = true;
    boolean lb8 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb8, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, ad1, ad2, ab4, fb0, fb1, lb0);
}
    lb3 = lb5 && lb6;
    lb7 = lb8 && ab1;

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
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld0 = 447.7615898534126;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought224.getInstance();
    Output.points[7][5] -= ld0;
    fb1 = fd0 > fd1;
    fb0 = ld0 < fd0;
    fb1 = !fb0;
    Output.points[7][6] -= fd1;
    ld0 *= -1;
    double ld2 = 564.0107619596217;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought342.getInstance(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Output.points[7][7] -= ld2;

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
    Thought lo0 = Thought83.getInstance(ao2, ao3, ao4, fo0);
    fb0 = ad2 < ad3;
    double ld1 = 51.37261148146379;
    fb1 = fb0 || fb1;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld1, ad1, ad2);
}
    fb1 = fb0 || fb1;
    boolean lb2 = true;
    Output.points[7][8] -= ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[8][0] -= ad1;
    lb2 = !fb0;
    fb1 = lb2 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb2, fb0, fb1);
}
    lb2 = ad2 < ad3;
    Thought lo3 = Thought48.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
if(ao3 != null){
      ao3.m2(ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
}
    fd0 *= -1;
    Output.points[8][1] -= fd1;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
    fb0 = ad1 > ad2;
    Thought lo4 = Thought99.getInstance(ao3, ao4, fo0, fo1);
    fb1 = lb2 && fb0;
    fb1 = lb2 && fb0;
    boolean lb5 = false;

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
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought141.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld1 = 609.6613446445684;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[8][2] += ld1;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    Thought lo2 = Thought264.getInstance(fb0, fb1, ab1, ab2);
    Thought lo3 = Thought325.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = ld1 < fd0;
    fb1 = !ab1;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ad3 = ao4.m3();
}
    ab1 = !ab2;
    Output.points[8][3] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    double ld1 = 760.7297038011701;
    for(int i0=0; i0<10; i0++){
        ab3 = ad4 < fd0;
        boolean lb2 = false;
if(ao1 != null){
          ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
          lb0 = fo1.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb2, lb0, ab1);
}
        ab2 = ab3 || ab4;
        boolean lb3 = false;
        ld1 *= -1;
        Output.points[8][4] -= ad1;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
}
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        ab3 = !ab4;
        Output.points[8][5] += fd1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
}
        fb0 = ad4 < fd0;
if(fo1 != null){
          fd1 = fo1.m3();
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought353.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 = fd0 - fd1;
    Output.points[8][6] += fd0;
    fb1 = lb0 || fb0;
    fb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    double ld2 = 797.0746395269429;
    boolean lb3 = true;
    boolean lb4 = true;
    double ld5 = 615.3573931592425;
    Thought lo6 = Thought371.getInstance(fo0, fo1, fo0, fo1);
    lb4 = fb0 || fb1;
    lb0 = lb3 && lb4;
    Thought lo7 = Thought55.getInstance(ld5, fd0, fd1, ld2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld2);
}
    fb0 = !fb1;

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
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        if (fb1) {
            ad2 *= -1;
            double ld0 = 590.1832103100045;
if(fo0 != null){
              fo0.m2();
}
if(fo1 != null){
              fo1.m3(fb0, fb1, fb0, fb1);
}
            ad2 *= -1;
            fb0 = ad3 < ad4;
            boolean lb1 = true;
            double ld2 = 38.16090763639418;
            Thought lo3 = Thought171.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
if(fo0 != null){
              fo0.m1(ld2, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
            Output.points[8][7] += ad4;
            lb1 = fd0 < fd1;
            fb0 = ld0 > ld2;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
              ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
            lb1 = fb0 && fb1;
            boolean lb4 = true;
            for(int i1=0; i1<10; i1++){
if(fo0 != null){
                  fo1 = fo0.m4(ad2, ad3, ad4, fd0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    Thought lo0 = Thought171.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
            fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;
    double ld1 = 933.1579587978631;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    double ld3 = 2.069704910946324;
    boolean lb4 = true;
        lb2 = ld1 > ld3;
    ad1 = ad2 - ad3;
    Output.points[8][8] -= ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3);
}
    lb4 = ad1 < ad2;
    ab1 = !ab2;

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
      fb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    if (fb0) {
        fb1 = fd0 > fd1;
        boolean lb0 = false;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad1 = ad2 - ad3;
        fb1 = fb0 && fb1;
        boolean lb0 = false;
if(ao2 != null){
          ao2.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        fb0 = fb1 || lb0;
        Thought lo1 = Thought73.getInstance();
        double ld2 = 738.0076820670546;
        Thought lo3 = Thought39.getInstance(fb0, fb1, lb0, fb0);
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, fb1, lb0, fb0, fb1);
}
}}
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
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    ab3 = !ab4;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = !fb0;
    fd0 *= -1;
    Output.points[0][0] += fd1;
    Thought lo1 = Thought139.getInstance(fd0, fd1, fd0, fd1);
    Thought lo2 = Thought111.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fb1 = fd0 > fd1;
    boolean lb3 = false;
        lb0 = lb3 || ab1;
    Output.points[0][1] += fd0;
    Thought lo4 = Thought196.getInstance();
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought181.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 *= -1;
    fb0 = fb1 && lb1;
    fd0 *= -1;
    double ld2 = 749.9632599568458;
    ab1 = ab2 || ab3;
    Thought lo3 = Thought222.getInstance(fd0, fd1, ld2, ad1);
    ad2 = ad3 + ad4;
    ab4 = fb0 && fb1;
    Thought lo4 = Thought121.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1);
    lb1 = ad2 < ad3;
    Output.points[0][2] -= ad4;
    fd0 = fd1 - ld2;
    double ld5 = 405.0999984655323;
if(fo1 != null){
      ld5 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
if(ao2 != null){
      ao2.m2(fd1, ld2, ld5, ad1, ab2, ab3, ab4, fb0);
}
        ad2 = ad3 - ad4;
    fd0 = fd1 + ld2;
    Output.points[0][3] += ld5;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    Output.points[0][4] -= fd0;
    fb0 = fd1 < fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought5.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo4 = Thought38.getInstance();
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, lb2);
}
    fb0 = fd1 > fd0;
    boolean lb5 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought137.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
        Output.points[0][5] += fd0;
    fb0 = !fb1;
    lb1 = fd1 > fd0;
    Thought lo2 = Thought145.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 481.76780063964276;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 - ld3;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld3, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 < ld3;
    fb1 = fd0 > fd1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
        double ld0 = 956.5664931761245;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    double ld2 = 142.57331925260902;
    double ld3 = 725.4896815844871;
    ld3 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, ld3, fd0);
}
    boolean lb4 = true;
    Thought lo5 = Thought120.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ld3);
    Output.points[0][6] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb1, lb4);
}
    fb0 = fb1 || lb1;
    lb4 = ld0 > ld2;
    Thought lo6 = Thought261.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, fb0, fb1, lb1, lb4);
    ld2 = ld3 - fd0;
    fd1 *= -1;
    fb0 = ld0 > ld2;
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld0, fb0, fb1, lb1, lb4);
}
    ld2 = ld3 + fd0;

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
