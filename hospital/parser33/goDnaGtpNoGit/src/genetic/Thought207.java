package genetic;
import java.util.ArrayList;
class Thought207 extends Thought{
private static ArrayList<Thought207> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 135.3904491259499;
private double fd1 = 951.0566673927611;
private Thought fo0 = null;
private Thought fo1 = null;
Thought207 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought207 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought207 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought207 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought207 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought207 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought207 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought207 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought207 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought207 instance = new Thought207 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought207 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought207 instance = new Thought207 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought207 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought207 instance = new Thought207 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought207 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought207 instance = new Thought207 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought207 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought207 instance = new Thought207 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought207 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought207 instance = new Thought207 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought207 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought207 instance = new Thought207 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought207 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought207 instance = new Thought207 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 256.9848311041969;
    Thought lo1 = Thought341.getInstance(ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    ld0 = fd0 - fd1;
    fb1 = ld0 > fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[8][1] -= ld0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
    boolean lb3 = false;
    fb0 = fd1 > ld0;
    fb1 = lb2 || lb3;
    boolean lb4 = true;
    fd0 = fd1 + ld0;
    lb4 = fb0 || fb1;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;

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
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought242.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[8][2] -= fd0;
    Output.points[8][3] -= fd1;
    ab3 = !ab4;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
    if (lb1) {
        boolean lb2 = false;
if(fo1 != null){
          lb1 = fo1.m2();
}
if(fo0 != null){
          fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb2, lb1, ab1);
}
        ab2 = !ab3;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
    boolean lb0 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[8][4] += ad2;
    boolean lb1 = false;
    fb0 = fb1 && lb0;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    lb1 = lb2 && fb0;
    Thought lo3 = Thought311.getInstance(fb1, lb0, lb1, lb2);
    fb0 = !fb1;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
    Output.points[8][5] -= fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab2 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 640.746766666976;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought328.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ld0 - ad1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld0 - ad1;
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    lb2 = ab1 && ab2;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought365.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    if (fb0) {
        } else {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        double ld1 = 26.09687786456848;
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
    double ld0 = 168.60966689365623;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][6] -= ad3;

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
    if (ab2) {
        Thought lo0 = Thought339.getInstance(ab3, ab4, fb0, fb1);
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
        Output.points[8][7] -= fd0;
        fb0 = fb1 || ab1;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought112.getInstance(ao1, ao2, ao3, ao4);
        fd0 = fd1 + fd0;
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
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    ab1 = ad1 > ad2;
    boolean lb0 = true;
    Thought lo1 = Thought301.getInstance();
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        boolean lb2 = false;
        Output.points[8][8] += ad3;
if(fo0 != null){
          lb2 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
        Thought lo3 = Thought112.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
        boolean lb4 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb4, lb0, ab1, ab2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m1(fd1, ad1, ad2, ad3);
}
        ab3 = ab4 || fb0;
        ad4 = fd0 - fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
        Thought lo5 = Thought19.getInstance();
        fd1 *= -1;
        ad1 *= -1;
        fb1 = lb2 && lb4;
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
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought13.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        boolean lb1 = false;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        fb1 = lb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2();
}
        double ld2 = 805.9702520239433;
        lb1 = fb0 && fb1;
        lb1 = ld2 < fd0;
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
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought96.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought92.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][0] -= fd0;
    fb1 = fd1 > fd0;
    Thought lo3 = Thought225.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    lb2 = fd0 > fd1;
    ab1 = ab2 || ab3;

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
if(fo0 != null){
      ad1 = fo0.m3();
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    Output.points[0][1] += ad4;
    boolean lb1 = true;
    double ld2 = 539.2258337206367;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
    lb0 = ad1 < ad2;
    Output.points[0][2] -= ad3;
        Thought lo3 = Thought159.getInstance(ad4, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
    Thought lo4 = Thought15.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    lb1 = fb0 && fb1;
    Thought lo5 = Thought358.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      lb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo6 = Thought16.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
    Thought lo7 = Thought11.getInstance();
    if (lb1) {
        fb0 = fb1 && lb0;
        lb1 = !fb0;
        boolean lb8 = false;
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb8, lb0, lb1);
}
        fb0 = ad2 > ad3;
        boolean lb9 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    double ld1 = 741.5072346449792;
    ab1 = ad4 < fd0;
if(fo0 != null){
      ab2 = fo0.m2(fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
    lb0 = ad4 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld1;
    fb1 = lb0 || ab1;
    boolean lb2 = true;
    ab1 = !ab2;
    double ld3 = 882.275387992655;
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    lb2 = ab1 && ab2;
    Thought lo4 = Thought386.getInstance(fo0, fo1, fo0, fo1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought139.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb1 = fd1 > fd0;
    boolean lb2 = false;
    lb2 = fd1 < fd0;
    Thought lo3 = Thought357.getInstance(fb0, fb1, lb1, lb2);
    fb0 = fb1 && lb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    fb1 = !fb0;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    ad2 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 > ad4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
          ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
        Thought lo1 = Thought339.getInstance();
        fb1 = ad2 > ad3;
        Thought lo2 = Thought399.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
        fd1 *= -1;
        boolean lb3 = false;
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
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
    ab1 = fd0 < fd1;
    Thought lo0 = Thought199.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m2();
}
    ab2 = fd0 < fd1;
    if (ab3) {
if(ao2 != null){
          ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
        ab2 = ab3 && ab4;
        fd0 = fd1 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
        Output.points[0][3] += fd0;
        fd1 = fd0 - fd1;
        Thought lo2 = Thought342.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fb1 = !lb1;
        boolean lb3 = true;
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        } else {
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = true;
    lb0 = ad2 > ad3;
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    Output.points[0][4] -= ad4;
        boolean lb2 = false;
    ab2 = ab3 || ab4;
    Output.points[0][5] += fd0;
    boolean lb3 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    ab4 = fb0 && fb1;
    lb0 = lb1 && lb2;
    lb3 = fd1 > ad1;
    ad2 *= -1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, lb2, lb3, ab1);
}
    ab2 = !ab3;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    lb1 = !lb2;
    double ld4 = 860.1729112023328;
    Output.points[0][6] -= ad1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        Output.points[0][7] += fd1;
        boolean lb1 = true;
        fd0 = fd1 + fd0;
        lb1 = fd1 < fd0;
        boolean lb2 = true;
        Output.points[0][8] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        }
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo3 = Thought73.getInstance(fb1, fb0, fb1, fb0);
    fd1 *= -1;
    double ld4 = 804.2580522570821;
    Thought lo5 = Thought85.getInstance(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld4;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    for(int i1=0; i1<10; i1++){
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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 734.1200455767291;
    ab4 = ld0 > fd0;
    double ld1 = 734.6798867653384;
    fb0 = fd0 < fd1;
    ld0 = ld1 + fd0;
    fd1 = ld0 + ld1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ld1);
}
    Thought lo2 = Thought187.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2();
}
    boolean lb4 = true;
if(fo0 != null){
      fd0 = fo0.m3(lb4, ab1, ab2, ab3);
}
    fd1 = ld0 - ld1;

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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    lb0 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb1 = !lb2;
if(fo1 != null){
          fo1.m3();
}
    boolean lb3 = true;
    if (lb3) {
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
        boolean lb4 = false;
        double ld5 = 753.8350554391412;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld5, ad1, lb2, lb3, fb0, fb1);
}
        lb4 = !lb0;
        double ld6 = 185.9900625733747;
        lb1 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, lb0, lb1, lb2);
}
        lb3 = fb0 && fb1;
        ld5 = ld6 + ad1;
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
    ab1 = ad1 < ad2;
    ab2 = !ab3;
    ab4 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    ad1 *= -1;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ad1 < ad2;
    ab1 = ad3 > ad4;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    Thought lo0 = Thought293.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
    ad4 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ad1, ad2);
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
    if (fb1) {
        fb0 = fd1 > fd0;
        fb1 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb0 = false;
        lb0 = fb0 || fb1;
        lb0 = fb0 && fb1;
        fd1 = fd0 + fd1;
        double ld1 = 64.51137581732672;
if(ao3 != null){
          lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
        Thought lo2 = Thought279.getInstance(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
        double ld3 = 177.70531018350655;
if(ao2 != null){
          ld3 = ao2.m3(fd0, fd1, ld1, ld3, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
        Output.points[1][0] -= fd0;
        boolean lb4 = true;
        Thought lo5 = Thought152.getInstance(ao2, ao3, ao4, fo0);
        boolean lb6 = false;
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
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought337.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld1 = 988.0970733191281;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    if (fb0) {
        boolean lb2 = false;
        Thought lo3 = Thought131.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1, fb0, fb1, lb2, fb0);
if(ao3 != null){
          fb1 = ao3.m2(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
        fb0 = fd1 > ld1;
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fb1, lb2, fb0, fb1);
}
        double ld4 = 599.4776630634191;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          lb2 = fo0.m2(fo1, ao1, ao2, ao3, ld4, ld1, ad1, ad2);
}
        Thought lo5 = Thought59.getInstance();
        fb0 = !fb1;
        ad3 = ad4 + fd0;
if(ao4 != null){
          fd1 = ao4.m3(lb2, fb0, fb1, lb2);
}
        boolean lb6 = false;
        Thought lo7 = Thought328.getInstance(fo0, fo1, ao1, ao2, ld4, ld1, ad1, ad2, lb6, fb0, fb1, lb2);
        boolean lb8 = false;
        ad3 *= -1;
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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    double ld1 = 815.5404864855377;
    fd0 = fd1 - ld1;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    double ld2 = 700.1319607157974;
    Thought lo3 = Thought247.getInstance(ld1, ld2, fd0, fd1, ab4, fb0, fb1, lb0);

Thought.STACK_COUNTER++;
return ld1;
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
    ab2 = !ab3;
    double ld0 = 495.0750998930863;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    ab3 = fd0 < fd1;
        ld0 *= -1;
    double ld2 = 647.0556260733391;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1(ld2, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ld2 *= -1;
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad1 = ao3.m3(ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    Output.points[1][1] += ad2;
    lb1 = ad3 < ad4;
    Thought lo5 = Thought342.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld2, lb3, lb4, ab1, ab2);
    ab3 = ad1 > ad2;
    Thought lo6 = Thought163.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
    boolean lb7 = false;
    lb3 = lb4 && lb7;

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        boolean lb0 = true;
    lb0 = !fb0;
    double ld1 = 35.726628746586854;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
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
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        double ld1 = 483.42299832725;
        lb0 = ld1 > fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb0;
        ld1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
        Output.points[1][2] -= fd0;
        boolean lb2 = false;
        fd1 = ld1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        ab1 = ab2 && ab3;
        Thought lo3 = Thought291.getInstance(ld1, fd0, fd1, ld1);
        double ld4 = 26.888336161079167;
        ab4 = ld4 > fd0;
        Thought lo5 = Thought19.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ld4, fd0);
        fd1 *= -1;
        boolean lb6 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ld1 = ld4 - fd0;
        fd1 = ld1 - ld4;
        boolean lb7 = true;
        fd0 = fd1 - ld1;
        Thought lo8 = Thought367.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld1, lb2, lb6, lb7, lb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    boolean lb0 = true;
    double ld1 = 931.200713141084;
    for(int i0=0; i0<10; i0++){
        lb0 = ad2 < ad3;
if(fo0 != null){
          fo0.m3(fb0, fb1, lb0, fb0);
}
        }
    ad4 = fd0 - fd1;

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
    ab1 = ad1 > ad2;
    double ld0 = 267.20397301116;
    ad2 = ad3 - ad4;
    ab2 = fd0 > fd1;
    ab3 = ld0 < ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld0;
    ab3 = ad1 > ad2;
if(fo1 != null){
      ab4 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    double ld1 = 490.39767389616634;
    ab3 = ab4 || fb0;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ld1 = ad1 + ad2;
    ab4 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[1][3] += ld0;
    double ld3 = 206.12591929110073;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, ad1, ad2);
}
    Output.points[1][4] += ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld4 = 361.8768455584049;
    boolean lb5 = false;
    boolean lb6 = true;

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
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    fb0 = !fb1;
    double ld2 = 901.8833447410495;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, fb0, fb1);
}
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
    lb0 = lb1 || fb0;
    fb1 = ld2 < fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, lb0, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 644.5131067443315;
        Output.points[1][5] += ld3;
if(ao3 != null){
          lb0 = ao3.m2(ld2, fd0, fd1, ld3, lb1, fb0, fb1, lb0);
}
        lb1 = ld2 > fd0;
        double ld4 = 679.1122355648487;
        fd0 *= -1;
        Thought lo5 = Thought23.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
        Thought lo6 = Thought38.getInstance(ao2, ao3, ao4, fo0);
        double ld7 = 828.3900445638833;
        fd0 *= -1;
        double ld8 = 381.04370783721384;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld3, ld4);
}
        fb0 = fb1 || lb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld7, ld8, ld2, fd0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought370.getInstance();
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    Output.points[1][6] += ad2;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb2, fb0);
}
    double ld3 = 837.6058269137059;
if(ao1 != null){
      ao1.m1(ld3, ad1, ad2, ad3, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 || lb2;
    boolean lb4 = true;
    double ld5 = 127.12940874857982;
    boolean lb6 = true;
    lb4 = ad3 < ad4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb6, fb0, fb1, lb0);
}
    double ld7 = 559.4135358204832;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    lb2 = ad4 > fd0;
    fd1 = ld3 - ld5;
if(fo1 != null){
      ld7 = fo1.m3(ad1, ad2, ad3, ad4);
}
    Thought lo8 = Thought235.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld3, ld5);
    lb4 = lb6 && fb0;
    Thought lo9 = Thought288.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb2, lb4, lb6);
}
    boolean lb10 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld7, ad1, ad2, ad3, lb10, fb0, fb1, lb0);
}
    Thought lo11 = Thought115.getInstance(ad4, fd0, fd1, ld3, lb2, lb4, lb6, lb10);

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
    double ld0 = 801.7819262669009;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (fb0) {
        boolean lb1 = false;
        fb0 = !fb1;
        fd0 = fd1 - ld0;
        for(int i0=0; i0<10; i0++){
            boolean lb2 = false;
            fd0 = fd1 - ld0;
            boolean lb3 = false;
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
            }
        lb1 = fd1 < ld0;
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
          ao2.m2();
}
        ab2 = !ab3;
        ab4 = fd1 < ld0;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
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
    ad1 *= -1;
    Thought lo0 = Thought125.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < ad1;
        ad2 *= -1;
    fb1 = ad3 > ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    double ld1 = 438.605863154357;
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[1][7] -= ld1;
    fb1 = ad1 < ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ad3 *= -1;
    ab1 = ad4 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Output.points[1][8] -= fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ld1 > ad1;
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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        double ld1 = 589.9544308309122;
    boolean lb2 = true;
    boolean lb3 = false;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1, lb2, lb3, fb0, fb1);
}
    lb0 = lb2 && lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          fo0.m3();
}
        lb3 = fb0 || fb1;
    lb0 = fd1 < ld1;
if(fo1 != null){
      fd0 = fo1.m3(lb2, lb3, fb0, fb1);
}
    fd1 = ld1 - fd0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;

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
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
        boolean lb1 = true;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = lb0 || lb1;
    fd0 *= -1;
    Thought lo2 = Thought205.getInstance(fb0, fb1, lb0, lb1);
    boolean lb3 = true;
    lb3 = !fb0;
    Thought lo4 = Thought164.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb3);
    double ld5 = 216.26233051834154;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld5, fd0, fb0, fb1, lb0, lb1);
}
    lb3 = fb0 && fb1;
    double ld6 = 552.097750352433;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld5;
    Thought lo7 = Thought320.getInstance(ld6, fd0, fd1, ld5);
    boolean lb8 = true;
    fb0 = ld6 < fd0;
    boolean lb9 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld5, ld6, fd0);
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
