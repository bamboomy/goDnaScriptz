package genetic;
import java.util.ArrayList;
class Thought345 extends Thought{
private static ArrayList<Thought345> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 46.22322197502332;
private double fd1 = 623.770691158857;
private Thought fo0 = null;
private Thought fo1 = null;
Thought345 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought345 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought345 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought345 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought345 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought345 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought345 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought345 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought345 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought345 instance = new Thought345 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought345 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought345 instance = new Thought345 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought345 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought345 instance = new Thought345 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought345 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought345 instance = new Thought345 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought345 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought345 instance = new Thought345 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought345 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought345 instance = new Thought345 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought345 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought345 instance = new Thought345 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought345 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought345 instance = new Thought345 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought388.getInstance(fo1, fo0, fo1, fo0);

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
    ab2 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, ab1, ab2, ab3);
}
    Output.points[1][7] += fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][8] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    Output.points[2][0] -= fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought61.getInstance();
    ad4 = fd0 + fd1;
    boolean lb1 = false;
    Output.points[2][1] -= ad1;
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    fd1 *= -1;
        ad1 = ad2 + ad3;
    boolean lb2 = true;
    Output.points[2][2] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought200.getInstance(ad1, ad2, ad3, ad4);
        fd0 = fd1 + ad1;
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
        double ld0 = 702.755201954873;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
    double ld1 = 344.9993158488003;
    ab3 = ad1 < ad2;
    ad3 = ad4 - fd0;
    ab4 = fb0 || fb1;
    fd1 *= -1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 > ad4;
    Output.points[2][3] += fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought343.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    Output.points[2][4] -= fd0;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fd0 > fd1;
    Output.points[2][5] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    Output.points[2][6] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    fb0 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
if(ao3 != null){
      fb0 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld0 = 633.64721840471;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought318.getInstance(fo0, fo1, ao1, ao2);
    Thought lo4 = Thought397.getInstance(fd1, ld0, ad1, ad2);
    Thought lo5 = Thought340.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    Thought lo6 = Thought98.getInstance();
    double ld7 = 683.8156358567954;
if(ao1 != null){
      ao1.m3(fb0, fb1, lb1, lb2);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, ld7, ad1, ad2, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 || lb1;
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m1(fd1, ld0, ld7, ad1, lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
    fb1 = ad2 > ad3;
    lb1 = lb2 && fb0;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    if (fb0) {
        fb1 = fd1 < fd0;
        fd1 *= -1;
        lb0 = !ab1;
        fd0 *= -1;
        fd1 = fd0 + fd1;
        ab2 = ab3 || ab4;
        Thought lo1 = Thought97.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        Thought lo3 = Thought117.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        ab4 = fb0 || fb1;
        fd1 *= -1;
if(fo0 != null){
          lb2 = fo0.m2();
}
        fd0 *= -1;
if(fo1 != null){
          fo1.m2(lb0, ab1, ab2, ab3);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
        double ld4 = 125.47365768721787;
        fd0 = fd1 + ld4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
        double ld5 = 662.9130885078957;
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
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Thought lo1 = Thought301.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    double ld2 = 781.1196631934041;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, lb0, ab1);
}
    ld2 = ad1 - ad2;
    ab2 = ab3 && ab4;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Output.points[2][7] -= ld2;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > fd0;
    Thought lo2 = Thought28.getInstance(fd1, fd0, fd1, fd0);
    double ld3 = 237.08287980732374;
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
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
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    Output.points[2][8] += fd0;
    fd1 *= -1;
    Output.points[3][0] += fd0;
    fd1 *= -1;
    Thought lo0 = Thought109.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 769.057283710413;
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    ld1 = fd0 + fd1;
    Thought lo2 = Thought196.getInstance(ld1, fd0, fd1, ld1);
    fd0 *= -1;
    Thought lo3 = Thought24.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
    ab4 = ld1 < fd0;
    fd1 = ld1 - fd0;

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
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Output.points[3][1] += ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb0 = !fb1;
    ad3 *= -1;
    Thought lo0 = Thought271.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought87.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought324.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    lb1 = ad4 < fd0;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb4 = false;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ad1;
    lb2 = lb3 || lb4;
    Thought lo5 = Thought263.getInstance(ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
    double ld6 = 220.75016173324778;
    boolean lb7 = true;
    ab4 = fb0 || fb1;
    lb1 = ad4 < fd0;
    lb2 = lb3 && lb4;
    lb7 = fd1 > ld6;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        Thought lo8 = Thought299.getInstance(fd0, fd1, ld6, ad1, fb0, fb1, lb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[3][2] += fd0;
    double ld1 = 375.4010645932093;
    fd0 = fd1 - ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    lb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1);
}
    fb0 = fd0 > fd1;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    Output.points[3][3] += fd1;
if(ao1 != null){
      ao1.m3();
}
    ld1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fb1, lb0, fb0, fb1);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        Thought lo1 = Thought300.getInstance(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
        Thought lo2 = Thought289.getInstance(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
        Output.points[3][4] -= ad2;
        Thought lo3 = Thought98.getInstance(ao4, fo0, fo1, ao1);
        boolean lb4 = false;
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
        ab1 = ab2 || ab3;
    Thought lo0 = Thought138.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought199.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab4 = !fb0;
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ao1.m1(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    fd0 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb2, ab1, ab2);
}
    ab3 = !ab4;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    lb2 = !ab1;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Output.points[3][5] -= fd1;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m1();
}
    for(int i0=0; i0<10; i0++){
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab2 = ad2 < ad3;
    Thought lo0 = Thought238.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    ad3 = ad4 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab1 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
          ao2.m1();
}
if(ao4 != null){
          ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ad1 *= -1;
        ad2 = ad3 - ad4;
        ab4 = fb0 || fb1;
        fd0 = fd1 - ad1;
        ab1 = ad2 < ad3;
        ad4 = fd0 + fd1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought332.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        Output.points[3][6] -= fd0;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo0.m3();
}
        boolean lb1 = true;
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, lb1, fb0);
}
        Thought lo2 = Thought348.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 || ab2;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[3][7] -= fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1();
}
    Thought lo1 = Thought97.getInstance(fb0, fb1, lb0, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought83.getInstance(fd1, fd0, fd1, fd0, lb0, lb2, ab1, ab2);
    Thought lo4 = Thought8.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb5 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    double ld0 = 551.9378102688927;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought54.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    if (fb0) {
        boolean lb2 = false;
        fb0 = fb1 || lb2;
        fb0 = ad4 > fd0;
        fb1 = lb2 || fb0;
        Thought lo3 = Thought324.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
        boolean lb4 = true;
        fd1 *= -1;
        double ld5 = 19.11201361460491;
        ld5 = ld0 + ad1;
        ad2 = ad3 + ad4;
        fd0 = fd1 - ld5;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
        lb2 = lb4 || lb6;
        ad4 *= -1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[3][8] -= ad2;
if(fo0 != null){
          fo0.m2(ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        for(int i0=0; i0<10; i0++){
            Thought lo0 = Thought42.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
            fb0 = !fb1;
            Output.points[4][0] += ad1;
            ad2 *= -1;
            ad3 = ad4 - fd0;
if(fo0 != null){
              fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
            fb0 = fb1 || ab1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
            ad4 = fd0 + fd1;
            fb1 = ad1 > ad2;
            boolean lb1 = true;
if(fo1 != null){
              lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
}}
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
    Output.points[4][1] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    if (fb1) {
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = fb0 && fb1;
if(ao1 != null){
          fd0 = ao1.m3();
}
        fb0 = !fb1;
if(ao2 != null){
          ao2.m2(fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[4][2] -= fd0;
    boolean lb0 = false;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0);
}
    fb1 = lb0 || fb0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    lb0 = ad1 > ad2;
    ad3 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
    double ld1 = 206.63507755421352;
    double ld2 = 969.9546058052897;
    fb1 = lb0 && fb0;
    ad3 *= -1;

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
    fd0 = fd1 - fd0;
if(ao2 != null){
          ab1 = ao2.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = !ab1;
    Thought lo0 = Thought284.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought393.getInstance(ao1, ao2, ao3, ao4);
    boolean lb4 = true;
    ab3 = ab4 || fb0;
    fb1 = !lb1;

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
    Thought lo0 = Thought139.getInstance(ad2, ad3, ad4, fd0);
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
        double ld1 = 74.05141264005853;
        ab2 = ab3 || ab4;
        fb0 = ad3 > ad4;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd0 = fd1 - ld1;
if(ao3 != null){
          ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
        ab4 = ad1 > ad2;
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, ld1, ad1, ad2, fb0, fb1, ab1, ab2);
}
        boolean lb2 = false;
if(ao3 != null){
          ab2 = ao3.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb2 = ld1 < ad1;
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        fb1 = lb2 && ab1;
        ad2 = ad3 - ad4;
        fd0 = fd1 - ld1;
        ab2 = !ab3;
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        double ld3 = 243.34288291416223;
        ad3 = ad4 - fd0;
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    Thought lo1 = Thought221.getInstance();
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb2, fb0, fb1);
}
    if (lb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
        Thought lo3 = Thought323.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
                  fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        Output.points[4][3] += fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m3(fb0, fb1, lb0, lb2);
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[4][4] += fd0;
    Thought lo0 = Thought170.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    ab4 = !fb0;
    Output.points[4][5] -= fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought270.getInstance(fo0, fo1, fo0, fo1);

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
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fd0 = fd1 + ad1;
    fb1 = !lb0;
    ad2 = ad3 - ad4;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought178.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 410.62559251251116;
    ad4 = fd0 + fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 - ad4;
    ab2 = fd0 > fd1;
    Thought lo1 = Thought60.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    Thought lo2 = Thought137.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Output.points[4][6] -= ld0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb3 = true;
    ab3 = fd0 < fd1;
    boolean lb4 = true;
    ld0 = ad1 + ad2;

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
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Output.points[4][7] -= fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
        fb0 = fb1 && lb0;
        double ld1 = 518.886347449253;
        fb0 = !fb1;
        fd0 = fd1 - ld1;
        Thought lo2 = Thought77.getInstance(fo1, ao1, ao2, ao3);
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
    fb0 = ad2 < ad3;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ad1 = ao3.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought186.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = ad4 < fd0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fb0 = fd1 > ad1;
    Output.points[4][8] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fb1 = !lb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = true;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, lb1, lb2, lb3, fb0);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 *= -1;
    Thought lo1 = Thought147.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld2 = 411.5943559198867;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
    ld2 = fd0 + fd1;

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
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[5][0] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab4 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    Thought lo0 = Thought395.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    Output.points[5][1] -= fd1;
if(ao1 != null){
      ad1 = ao1.m3();
}
    fb1 = !ab1;

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
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 496.34739478155115;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 289.22217968891647;
    ld1 *= -1;
    Output.points[5][2] -= fd0;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;

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
    double ld0 = 595.4233726477233;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb1;
    Thought lo2 = Thought236.getInstance(ld0, fd0, fd1, ld0);
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    double ld3 = 14.688998956687813;
    fd0 = fd1 - ld0;
    ld3 = fd0 - fd1;
    fb0 = ld0 > ld3;
    fb1 = lb1 || fb0;
    fd0 = fd1 + ld0;
    Output.points[5][3] -= ld3;
    fb1 = lb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Output.points[5][4] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    fb1 = !lb1;
    fb0 = ld0 < ld3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld3, fb1, lb1, fb0, fb1);
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
    Thought lo0 = Thought147.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    double ld1 = 69.43937625556809;
    fb1 = ld1 < fd0;
    fb0 = !fb1;
    fd1 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    Output.points[5][5] += ld1;
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
