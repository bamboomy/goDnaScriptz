package genetic;
import java.util.ArrayList;
class Thought389 extends Thought{
private static ArrayList<Thought389> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 777.5964215699144;
private double fd1 = 215.5173600725127;
private Thought fo0 = null;
private Thought fo1 = null;
Thought389 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought389 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought389 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought389 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought389 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought389 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought389 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought389 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought389 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought389 instance = new Thought389 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought389 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought389 instance = new Thought389 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought389 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought389 instance = new Thought389 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought389 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought389 instance = new Thought389 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought389 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought389 instance = new Thought389 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought389 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought389 instance = new Thought389 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought389 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought389 instance = new Thought389 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought389 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought389 instance = new Thought389 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m2();
}
    if (fb1) {
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
        Output.points[6][5] -= fd1;
        double ld0 = 674.6020438717488;
        Output.points[6][6] += ld0;
        fd0 *= -1;
        fb0 = fd1 > ld0;
        double ld1 = 28.366837898914454;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld1, fd0, fd1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    ab1 = fd0 > fd1;
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    double ld0 = 230.97730420399446;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    double ld1 = 428.09099535120356;
    ld0 *= -1;
    Thought lo2 = Thought383.getInstance(ld1, fd0, fd1, ld0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    fb1 = ab1 || ab2;
    Thought lo3 = Thought349.getInstance();
    ld1 *= -1;
    ab3 = fd0 < fd1;
    ab4 = ld0 < ld1;

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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought236.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 554.4920782738305;
    boolean lb3 = true;
    ad1 *= -1;
    ad2 *= -1;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, lb3, lb4, fb0);
}
    Output.points[6][7] += ld2;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, lb3, lb4);
}
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    if (fb0) {
        double ld3 = 909.7094034002466;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld3);
}
        ad1 = ad2 + ad3;
        boolean lb4 = false;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1);
}
        Thought lo5 = Thought246.getInstance();
        double ld6 = 42.09217461496032;
        ad1 = ad2 - ad3;
        fb0 = fb1 || lb4;
        lb0 = ad4 > fd0;
        Thought lo7 = Thought46.getInstance(lb1, lb2, ab1, ab2);
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld6, ad1, ad2, ab3, ab4, fb0, fb1);
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
    Thought lo0 = Thought129.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[6][8] += fd0;
    Thought lo1 = Thought292.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    lb2 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    lb2 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb1 = ao3.m2(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb2, lb3, fb0);
}
    Output.points[7][0] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought43.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = true;
if(ao1 != null){
      fd1 = ao1.m3();
}
    lb2 = lb3 || lb4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb2);
}
    lb3 = ad1 < ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb4, fb0, fb1, lb0);
}
    lb2 = ad2 > ad3;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2, lb3, lb4, fb0, fb1);
}
    lb0 = ad3 < ad4;
    lb2 = fd0 > fd1;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, lb3, lb4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo5 = Thought305.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    Thought lo6 = Thought125.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    double ld7 = 140.0952675809612;
    lb0 = ld7 < ad1;
    if (lb2) {
        lb3 = !lb4;
        fb0 = fb1 && lb0;
if(ao1 != null){
          ad2 = ao1.m3();
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
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;
    Thought lo0 = Thought283.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    ab1 = fd1 < fd0;
    Output.points[7][1] -= fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;

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
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    double ld0 = 494.80264041382026;
    ab2 = fd0 > fd1;
    Output.points[7][2] += ld0;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    Thought lo1 = Thought201.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    if (ab2) {
        boolean lb2 = true;
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = !lb2;
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
if(ao3 != null){
          ao3.m1(fd1, ld0, ad1, ad2, lb2, ab1, ab2, ab3);
}
        ab4 = ad3 < ad4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought286.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 412.01904620615886;
    fb1 = lb0 && lb1;
    fb0 = ld3 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
    boolean lb4 = false;
        Output.points[7][3] += fd1;

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
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    Output.points[7][4] -= fd0;
    fd1 = fd0 - fd1;

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
    Thought lo0 = Thought147.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fb1 = fo1.m2();
}
    fd0 = fd1 - ad1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    ad1 *= -1;
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
    double ld0 = 25.075544716805346;
    fb1 = ld0 > ad1;
    double ld1 = 231.62906376267765;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought395.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);

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
    fb1 = !fb0;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 < fd0;
    boolean lb0 = false;
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought258.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = fd0 > fd1;
    lb0 = fb0 && fb1;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    double ld2 = 549.5466169674809;
    Output.points[7][5] -= ld2;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(ld2, fd0, fd1, ld2);
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 - fd0;
        lb0 = lb3 || fb0;
    double ld4 = 276.40772242587894;
if(ao3 != null){
      ao3.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought321.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
if(ao1 != null){
      fb0 = ao1.m2(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        lb0 = ad4 < fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
    fd1 = fd0 + fd1;
    double ld1 = 324.4234261480929;
    fb0 = !fb1;
    ld1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld2 = 565.4802011671069;
    lb0 = !ab1;
    ab2 = ld1 > ld2;
if(ao4 != null){
      ao4.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld2, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld3 = 938.7926297479775;
    ld3 *= -1;

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
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    ab2 = ab3 && ab4;
    double ld1 = 73.39796965543611;
    Output.points[7][6] += ld1;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought131.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
    Thought lo3 = Thought334.getInstance();
    fb0 = ad1 > ad2;
    fb1 = !lb0;
    ad3 = ad4 + fd0;
    boolean lb4 = true;
    lb4 = !ab1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb4, ab1, ab2);
}
    boolean lb5 = false;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb4;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld1, ad1, lb5, ab1, ab2, ab3);
}

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    Output.points[7][7] += fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > fd0;
    lb1 = !fb0;
        fb1 = !lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = !lb1;

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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        for(int i1=0; i1<10; i1++){
            double ld0 = 219.590354945164;
            double ld1 = 954.9228649065727;
            ab1 = ab2 || ab3;
            ab4 = fb0 || fb1;
            double ld2 = 40.085831381916094;
            for(int i2=0; i2<10; i2++){
                for(int i3=0; i3<10; i3++){
                    double ld3 = 156.99615557486865;
                    ab1 = ld3 > ld0;
                    ab2 = ab3 || ab4;
                    if (fb0) {
                        double ld4 = 64.39073613550852;
if(fo0 != null){
                          fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, ld2, fd0);
}
if(fo0 != null){
                          fo1 = fo0.m4();
}
if(fo1 != null){
                          fd1 = fo1.m3(fb1, ab1, ab2, ab3);
}
                        boolean lb5 = false;
                        for(int i4=0; i4<10; i4++){
if(fo0 != null){
                              ld4 = fo0.m3(fo1, fo0, fo1, fo0, ld3, ld0, ld1, ld2, ab3, ab4, fb0, fb1);
}
                            fd0 = fd1 - ld4;
}}}}}}
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
        ad1 = ad2 - ad3;
    Thought lo0 = Thought335.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought273.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    double ld2 = 636.0227075151693;
    fb0 = ad1 > ad2;
    if (fb1) {
        ad3 *= -1;
        Output.points[7][8] += ad4;
        fd0 = fd1 - ld2;
        fb0 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld3 = 858.9587117699615;
        ad2 *= -1;
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
    boolean lb0 = true;
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought187.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb0;
    if (ab1) {
        boolean lb2 = false;
        ad4 = fd0 - fd1;
        double ld3 = 411.9546988118279;
        ld3 *= -1;
        ab1 = ad1 < ad2;
        ad3 = ad4 - fd0;
        ab2 = fd1 > ld3;
        ab3 = ab4 || fb0;
        ad1 = ad2 + ad3;
        fb1 = lb2 && lb0;
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
    Thought lo0 = Thought379.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld1 = 112.99311778463851;
    Thought lo2 = Thought3.getInstance(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought354.getInstance(fo1, ao1, ao2, ao3);
    fb0 = fd1 > ld1;
    Thought lo4 = Thought123.getInstance(fd0, fd1, ld1, fd0);
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb5, fb0, fb1, lb5);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb5, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0, fb1, lb5, fb0, fb1);
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
    fb0 = fb1 || fb0;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fb1 || fb0;
if(fo1 != null){
          ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
        Thought lo0 = Thought276.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
        fb1 = fb0 || fb1;
        fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fb0 = fb1 || fb0;
        } else if (fb1) {
        fb0 = fb1 || fb0;
        fb1 = fd0 > fd1;
        Output.points[8][0] -= ad1;
        fb0 = ad2 > ad3;
if(fo1 != null){
          fo1.m2(fb1, fb0, fb1, fb0);
}
        double ld1 = 195.11730351103992;
        fb1 = fb0 && fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought167.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    boolean lb2 = true;
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab3 = !ab4;
    fb0 = !fb1;
    lb0 = lb2 && lb3;
    ab1 = ab2 && ab3;
    boolean lb4 = true;
    double ld5 = 283.96118460164485;
    boolean lb6 = false;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    boolean lb7 = false;
    ld5 = fd0 - fd1;
    lb0 = lb2 && lb3;
    for(int i0=0; i0<10; i0++){
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
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought152.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    Output.points[8][1] += fd1;
    Thought lo1 = Thought365.getInstance();
    ab4 = fb0 && fb1;
    double ld2 = 40.875209720898674;
if(ao3 != null){
      ld2 = ao3.m3(ab1, ab2, ab3, ab4);
}
        boolean lb3 = true;
    Thought lo4 = Thought329.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb3);
    fd0 = fd1 + ld2;
    ad1 = ad2 - ad3;
    double ld5 = 690.9802395204778;
    Thought lo6 = Thought18.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    Thought lo7 = Thought202.getInstance(ao2, ao3, ao4, fo0, lb3, ab1, ab2, ab3);
    boolean lb8 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld2, ld5, ad1, ad2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 988.608750106493;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought283.getInstance();
    fb0 = fb1 || fb0;
    Output.points[8][2] += ld0;
    Thought lo2 = Thought129.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    double ld3 = 334.8196299041775;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo0 = Thought353.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought265.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld2 = 782.3313336236432;
    boolean lb3 = true;
    ld2 *= -1;
    Thought lo4 = Thought379.getInstance();
    fb0 = !fb1;
    fd0 = fd1 - ld2;
    Thought lo5 = Thought342.getInstance(lb3, ab1, ab2, ab3);
    ab4 = !fb0;
    boolean lb6 = false;
    fb0 = fb1 && lb3;

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
    double ld0 = 447.76635574519366;
    ad1 = ad2 + ad3;
    Output.points[8][3] += ad4;
    for(int i0=0; i0<10; i0++){
        double ld1 = 235.40352494371112;
        ad4 *= -1;
        fb1 = !fb0;
        fd0 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, ld0, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = ad2 < ad3;
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        ld0 *= -1;
        boolean lb2 = false;
        Thought lo3 = Thought313.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld0, ad1);
}
if(fo1 != null){
          fo1.m3();
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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    Thought lo1 = Thought211.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fd1 *= -1;
    Output.points[8][4] += ad1;
    ad2 = ad3 - ad4;
    fb1 = lb0 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad3 *= -1;

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
    double ld0 = 40.96625800274444;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = fd0 > fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    double ld0 = 633.6239406869482;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, ad1, ad2);
}
        ad3 *= -1;
        boolean lb1 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        ad1 = ad2 + ad3;
        for(int i1=0; i1<10; i1++){
            Output.points[8][5] += ad4;
if(ao4 != null){
              fd0 = ao4.m3(fb0, fb1, lb1, fb0);
}
            fb1 = !lb1;
            boolean lb2 = true;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2, lb1, fb0, fb1, lb2);
}
            Thought lo3 = Thought262.getInstance(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb2);
            double ld4 = 770.2817424516546;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb2);
}
            ld4 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
              ld0 = fo0.m3(ad1, ad2, ad3, ad4);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought136.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought322.getInstance();
    Thought lo2 = Thought350.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    ab1 = fd0 < fd1;
    fd0 *= -1;
        ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
    Thought lo3 = Thought305.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
        double ld4 = 624.6305144749691;
    ab2 = ab3 || ab4;
    Output.points[8][6] += fd0;
if(ao3 != null){
      ao3.m3(fd1, ld4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    if (ab3) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ab2 = ld4 < fd0;
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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought322.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    Thought lo2 = Thought114.getInstance(fb1, lb1, ab1, ab2);
    ad3 *= -1;
    boolean lb3 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    lb1 = lb3 && ab1;
    boolean lb4 = true;
    ab1 = ab2 && ab3;

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
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought186.getInstance();
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought169.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    double ld1 = 185.09380951198415;
        fd0 *= -1;
        fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld1;
        fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    double ld2 = 858.9739120809769;
    double ld3 = 998.7563242526368;
    fb1 = ld2 < ld3;
    Thought lo4 = Thought265.getInstance(fd0, fd1, ld1, ld2);
    fb0 = !fb1;
    ld3 = fd0 + fd1;
    fb0 = fb1 && fb0;
    Thought lo5 = Thought73.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, ld3, fd0);

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought247.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = lb0 && fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld2 = 288.44346998269424;
        fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 && fb1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
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
