package genetic;
import java.util.ArrayList;
class Thought25 extends Thought{
private static ArrayList<Thought25> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 643.2523272545407;
private double fd1 = 75.87450252272643;
private Thought fo0 = null;
private Thought fo1 = null;
Thought25 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought25 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought25 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought25 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought25 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought38.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    Thought lo2 = Thought101.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld3 = 483.87217508071257;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo4 = Thought107.getInstance(ld3, fd0, fd1, ld3, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld5 = 709.1764622131482;
    ld5 *= -1;
    fd0 *= -1;
    fb0 = fd1 < ld3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld5 = fo1.m3(fd0, fd1, ld3, ld5);
}
    boolean lb6 = true;

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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought56.getInstance();
    fd1 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb1 = true;
    lb1 = fd1 < fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && ab1;

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
    fb0 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
    Output.points[7][2] += fd1;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    if (ab1) {
        ad4 = fd0 - fd1;
        Thought lo0 = Thought349.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = ad1 > ad2;
        boolean lb1 = false;
        ad3 *= -1;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4);
}
        lb1 = ab1 && ab2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad3 *= -1;
if(fo0 != null){
          ad4 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
        ad4 = fd0 + fd1;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb1;
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
    Thought lo0 = Thought29.getInstance(ao1, ao2, ao3, ao4);
    double ld1 = 286.2694414584999;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld1;
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    fb1 = lb2 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought244.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
    fb0 = fd0 > fd1;
    ld1 = fd0 - fd1;
    boolean lb4 = true;
    ld1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb2, lb4);
}
    fb0 = fd0 < fd1;
    boolean lb5 = false;
    ld1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, lb4);
}
    lb5 = fb0 || fb1;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1);
}
    boolean lb6 = true;
    lb4 = !lb5;

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
    Thought lo0 = Thought39.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fd1 *= -1;
    Output.points[7][3] -= ad1;
    ad2 = ad3 + ad4;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld1 = 432.68643966502475;
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        double ld2 = 155.49695209550228;
        double ld3 = 890.1428914315503;
        fb1 = ld2 < ld3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        ad4 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(ld2, ld3, ld1, ad1, fb0, fb1, fb0, fb1);
}
        ad2 = ad3 - ad4;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fb0 || fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
    lb0 = fd1 < fd0;
    double ld1 = 52.62421301843478;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    boolean lb2 = true;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
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
    double ld0 = 420.070711357512;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought242.getInstance(ab2, ab3, ab4, fb0);
    boolean lb2 = false;
    fb0 = !fb1;
    Thought lo3 = Thought301.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + ad1;
    fb0 = !fb1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[7][4] -= ad3;
    lb2 = ad4 > fd0;
if(ao1 != null){
      ao1.m1(fd1, ld0, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
    ab2 = fd0 < fd1;
    ab3 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || ab1;
    Output.points[7][5] -= fd1;
    double ld0 = 895.3517309863286;
    ab2 = ld0 < fd0;
    double ld1 = 277.23463890467514;
    fd0 = fd1 - ld0;
if(fo0 != null){
      ab3 = fo0.m2(ld1, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    ld1 *= -1;
    boolean lb2 = true;
    if (ab3) {
        fd0 = fd1 - ld0;
        Thought lo3 = Thought6.getInstance();
if(fo1 != null){
          ld1 = fo1.m3(ab4, fb0, fb1, lb2);
}
        boolean lb4 = false;
        lb2 = ab1 || ab2;
        boolean lb5 = false;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
        fd0 = fd1 - ld0;
        lb4 = ld1 < fd0;
        fd1 *= -1;
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
    ad1 *= -1;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought148.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
        fb1 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;

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
      fo1.m1();
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought11.getInstance(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 285.2850727081886;
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
    double ld3 = 248.11688829714194;
    lb2 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld3, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo0.m1(ld0, ld3, fd0, fd1, fb0, fb1, lb1, lb2);
}
    fb0 = !fb1;
    boolean lb4 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, lb2, lb4, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    ad1 *= -1;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = ad1 > ad2;
    Thought lo0 = Thought184.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    Thought lo1 = Thought75.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    double ld2 = 556.6793493910179;
    fb0 = !fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb3 = true;
if(ao3 != null){
      ld2 = ao3.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld2;
    lb3 = !fb0;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4();
}
}
Thought.STACK_COUNTER++;
return lb3;
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
      ao1.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
    Output.points[7][6] += fd1;
    ab3 = ab4 || fb0;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Output.points[7][7] -= fd1;
    lb1 = ab1 || ab2;
    boolean lb2 = true;
    ab2 = !ab3;
if(ao3 != null){
      fd0 = ao3.m3();
}
    boolean lb3 = true;
if(ao4 != null){
      ab3 = ao4.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb1, lb2, lb3, ab1);
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    double ld4 = 603.1638767089897;
    lb2 = ld4 > fd0;
if(fo0 != null){
      lb3 = fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought310.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    Output.points[7][8] -= ad1;
    Thought lo1 = Thought142.getInstance();
    fb0 = fb1 || ab1;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    boolean lb2 = false;
    Thought lo3 = Thought235.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought257.getInstance(fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb2);
}
    Thought lo5 = Thought351.getInstance(fo0, fo1, ao1, ao2);
    fd0 = fd1 - ad1;
        double ld6 = 934.0450518663106;

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought300.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab3 = fd1 < fd0;

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
    Output.points[8][0] -= ad1;
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
    Output.points[8][1] -= fd0;
    boolean lb0 = false;
    fb0 = fd1 < ad1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb0;
    lb1 = fb0 && fb1;
    double ld2 = 895.0294678382959;
if(fo0 != null){
      ad1 = fo0.m3(lb0, lb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, ld2, ad1, ad2, fb1, lb0, lb1, lb3);
}
    double ld4 = 180.8074050021685;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 187.66083095445452;
    ad3 = ad4 + fd0;
    fb1 = ab1 && ab2;
    Output.points[8][2] += fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
    Thought lo2 = Thought92.getInstance(ad4, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
    ad1 = ad2 - ad3;

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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld2 = 389.4456968138396;
    lb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
    double ld3 = 165.364204484879;
    fd0 = fd1 + ld2;
    fb1 = lb0 && lb1;

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
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    boolean lb1 = true;
    boolean lb2 = true;
if(ao1 != null){
      ad4 = ao1.m3();
}
    Thought lo3 = Thought348.getInstance(lb0, lb1, lb2, fb0);
    double ld4 = 923.716961129787;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld4, fb1, lb0, lb1, lb2);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ld4, fb1, lb0, lb1, lb2);
}
    ad1 = ad2 + ad3;
    fb0 = fb1 || lb0;
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, lb2, lb5, fb0);
}
    fb1 = ad4 > fd0;
    lb0 = lb1 && lb2;
        lb5 = fd1 < ld4;
    fb0 = ad1 < ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo6 = Thought63.getInstance(ad3, ad4, fd0, fd1);
    boolean lb7 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
          ao3.m2();
}
    ld4 = ad1 + ad2;
    ad3 = ad4 - fd0;

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
    fd0 *= -1;
    double ld0 = 623.638631871813;
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
    Output.points[8][3] += fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = !ab4;
    Thought lo1 = Thought293.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fb0 = fb1 && ab1;
if(ao2 != null){
      ab2 = ao2.m2();
}
    boolean lb2 = false;
    Thought lo3 = Thought2.getInstance(ab2, ab3, ab4, fb0);
    boolean lb4 = false;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, lb2, lb4, ab1);
}
    Output.points[8][4] += fd1;
    Thought lo5 = Thought79.getInstance(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, lb2, lb4, ab1);
}
    Output.points[8][5] -= fd0;
    double ld6 = 888.1642889530107;
    ab2 = fd0 < fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ad2 *= -1;
        ad3 = ad4 + fd0;
    Output.points[8][6] -= fd1;
    ad1 = ad2 + ad3;
    ab4 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = ab1 && ab2;
    boolean lb0 = true;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    ab2 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m2();
}
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    if (ab2) {
        Thought lo1 = Thought325.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo0 = Thought170.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1();
}
    lb1 = fb0 || fb1;
    double ld2 = 104.47131513960821;
    double ld3 = 734.2433947205304;
    lb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1, fb0, fb1, lb1, lb4);
}
if(fo0 != null){
      fb0 = fo0.m2(ld2, ld3, fd0, fd1, fb1, lb1, lb4, fb0);
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
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought68.getInstance(fo0, fo1, fo0, fo1);
    ab2 = fd1 > fd0;
    Output.points[8][7] -= fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = fd1 > fd0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    fb1 = !fb0;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[8][8] += ad4;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
    ab3 = ab4 || fb0;
    Output.points[0][0] += ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    Output.points[0][1] += ad2;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3();
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought323.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);

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
    double ld0 = 996.8807771250508;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought121.getInstance(fd0, fd1, ld0, fd0);
    fd1 *= -1;
    double ld2 = 731.3749108408591;
    boolean lb3 = false;
    fb0 = fb1 || lb3;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld2, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      lb3 = ao3.m2(fb0, fb1, lb3, fb0);
}
        boolean lb4 = true;
    ld0 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0, fb0, fb1, lb3, lb4);
}
        double ld5 = 808.0250363678047;
if(ao4 != null){
      ao3 = ao4.m4(ld2, ld5, fd0, fd1, fb0, fb1, lb3, lb4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb3, lb4);
}
    fb0 = ld0 < ld2;
    ld5 = fd0 - fd1;
    fb1 = ld0 > ld2;
    boolean lb6 = true;
    lb3 = !lb4;

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
    Thought lo0 = Thought73.getInstance(ao2, ao3, ao4, fo0);
    Output.points[0][2] -= ad1;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    lb1 = ad2 > ad3;
    Output.points[0][3] -= ad4;
    boolean lb2 = true;
    fd0 *= -1;
    lb2 = fd1 > ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    double ld0 = 680.1799664341106;
    boolean lb1 = true;
    Thought lo2 = Thought156.getInstance();
    ab1 = fd0 < fd1;
if(ao2 != null){
      ld0 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    ab4 = !fb0;
    fb1 = !lb1;
    Thought lo3 = Thought271.getInstance(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo4 = Thought213.getInstance(ld0, fd0, fd1, ld0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ab2 = ao3.m2();
}
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    Thought lo2 = Thought114.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
        fd0 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    lb1 = ab1 || ab2;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    if (ab2) {
        ab3 = ab4 && fb0;
        fb1 = ad2 < ad3;
if(ao1 != null){
          ao1.m3();
}
if(ao2 != null){
          ad4 = ao2.m3(lb0, lb1, lb3, ab1);
}
        fd0 = fd1 - ad1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ad1 + ad2;
if(ao3 != null){
          ao3.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb3);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        boolean lb4 = false;
        Output.points[0][4] += ad1;
        ad2 *= -1;
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
    fd0 = fd1 + fd0;
    double ld0 = 735.5579370566304;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought385.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld2 = 53.65083529893067;
    ld2 = fd0 + fd1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[0][5] -= ld0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(ld2, fd0, fd1, ld0);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
    Thought lo3 = Thought241.getInstance();
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
        fb0 = !fb1;
    Thought lo4 = Thought93.getInstance(fb0, fb1, fb0, fb1);
    ld0 = ld2 - fd0;

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
    Output.points[0][6] -= fd0;
    Thought lo0 = Thought220.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought8.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought288.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2();
}
    Output.points[0][7] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
    double ld0 = 404.1515350907333;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought7.getInstance(ld0, fd0, fd1, ld0);
    Thought lo2 = Thought278.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb3 = false;
    Output.points[0][8] -= ld0;
    fb0 = fd0 > fd1;
    boolean lb4 = true;
    boolean lb5 = false;
    lb5 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb3, lb4, lb5, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb3, lb4, lb5);
}
    boolean lb6 = true;
    Output.points[1][0] += fd0;
    boolean lb7 = false;
    boolean lb8 = true;
    lb6 = lb7 || lb8;
    Thought lo9 = Thought76.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb3, lb4);
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, lb5, lb6, lb7, lb8);
}
        fb0 = fb1 || lb3;

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
