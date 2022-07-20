package genetic;
import java.util.ArrayList;
class Thought69 extends Thought{
private static ArrayList<Thought69> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 925.7376593257867;
private double fd1 = 125.88945243027597;
private Thought fo0 = null;
private Thought fo1 = null;
Thought69 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought69 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought69 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought69 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought69 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought69 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought69 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought69 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought69 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][6] += fd1;
            fb1 = fb0 && fb1;
    if (fb0) {
        fb1 = fd0 < fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 + fd1;
        fb0 = !fb1;
        fd0 *= -1;
        boolean lb0 = false;
        Output.points[7][7] -= fd1;
        lb0 = fb0 || fb1;
        lb0 = !fb0;
        boolean lb1 = false;
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
    double ld0 = 973.5642994167608;
    boolean lb1 = false;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    boolean lb2 = true;
    lb1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb2 = !ab1;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    double ld4 = 891.7562596751296;

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
    fb1 = ad1 < ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought360.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    Output.points[7][8] -= ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought199.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 *= -1;
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld2 = 749.5207878898772;
    double ld3 = 974.5785121705727;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    boolean lb0 = true;
    Output.points[8][0] -= fd0;
    double ld1 = 659.6420429434072;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought373.getInstance();
    if (ab2) {
        ab3 = ld1 < ad1;
        ab4 = ad2 < ad3;
        double ld3 = 800.1780126443638;
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
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    Thought lo1 = Thought365.getInstance(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;
    boolean lb2 = false;
    fb0 = !fb1;
    lb0 = lb2 && fb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao2.m3();
}
    fb1 = fd1 < ad1;
if(ao3 != null){
      ao3.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought238.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    double ld1 = 112.61408924008188;

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
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    Thought lo1 = Thought318.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    double ld2 = 148.32930354828432;
    boolean lb3 = true;
    lb3 = ab1 || ab2;
    fd0 = fd1 - ld2;
    fd0 = fd1 - ld2;
    ab3 = fd0 > fd1;
    Output.points[8][1] -= ld2;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[8][2] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ld2 = ao4.m3(fd0, fd1, ld2, fd0);
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
    Output.points[8][3] += ad1;
        ab1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[8][4] -= ad1;
    boolean lb0 = true;
    Thought lo1 = Thought102.getInstance(ab4, fb0, fb1, lb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        }
    fb1 = lb0 || ab1;
    ab2 = ad3 > ad4;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
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
    fd1 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    Output.points[8][5] -= fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[8][6] += fd1;
    double ld0 = 402.8926391798174;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    double ld1 = 858.3388907467142;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
    fd1 *= -1;
    ld0 = ld1 + fd0;
    ab2 = fd1 > ld0;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0);
}
    ab1 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;

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
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    Thought lo0 = Thought349.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought79.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
        ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;

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
    ad1 *= -1;
    ab2 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought112.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
    fb0 = fb1 && ab1;
    Output.points[8][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    ab4 = ad4 > fd0;
    fd1 *= -1;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought52.getInstance(fb1, lb1, ab1, ab2);
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        Thought lo3 = Thought232.getInstance(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
    Thought lo4 = Thought203.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought302.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    Thought lo6 = Thought309.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    ab4 = fd1 < ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    lb0 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    if (lb0) {
        double ld2 = 157.4773281862083;
        boolean lb3 = true;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought258.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought133.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    if (lb2) {
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
        fb1 = fd1 > ad1;
        lb2 = fb0 || fb1;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          lb2 = fo0.m2();
}
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, lb2, fb0);
}
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
        Thought lo3 = Thought344.getInstance(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
        fd0 *= -1;
        fb0 = fb1 || lb2;
        fd1 *= -1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
}
        double ld4 = 400.5751981901057;
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
    ab1 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 && ab4;
    Thought lo0 = Thought89.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      ab4 = ao1.m2();
}
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb1);
}
    lb2 = fd0 < fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    double ld4 = 591.0574529904542;
    Thought lo5 = Thought238.getInstance(ao4, fo0, fo1, ao1, lb2, lb3, ab1, ab2);
    fd0 = fd1 + ld4;
    boolean lb6 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    double ld7 = 959.8339330397229;
if(ao2 != null){
      ao1 = ao2.m4(ld4, ld7, fd0, fd1);
}
    ab2 = ab3 || ab4;

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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought248.getInstance();
    Output.points[8][8] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
    Output.points[0][0] += ad3;
    ab2 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought376.getInstance(ad3, ad4, fd0, fd1);
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought31.getInstance();
    ab2 = fd0 < fd1;
    boolean lb4 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[0][1] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought384.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
    double ld1 = 519.8336386900294;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        fb0 = fd0 < fd1;
        if (fb1) {
            ld1 = fd0 - fd1;
            double ld3 = 392.6548674750509;
            ld3 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ld1, fd0, fd1, ld3);
}
            Thought lo4 = Thought334.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld3);
if(fo1 != null){
              fo0 = fo1.m4();
}
            lb2 = fb0 && fb1;
            ld1 = fd0 - fd1;
if(fo0 != null){
              fo0.m1(lb2, fb0, fb1, lb2);
}
            ld3 = ld1 - fd0;
            Thought lo5 = Thought297.getInstance(fo1, fo0, fo1, fo0, fd1, ld3, ld1, fd0, fb0, fb1, lb2, fb0);
            fd1 = ld3 + ld1;
            Thought lo6 = Thought363.getInstance(fd0, fd1, ld3, ld1, fb1, lb2, fb0, fb1);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    lb0 = lb1 || ab1;
    fd0 *= -1;
    ab2 = ab3 || ab4;
    Thought lo2 = Thought208.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[0][2] -= fd1;
    Output.points[0][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    lb0 = !lb1;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    Output.points[0][4] -= fd0;
    Output.points[0][5] += fd1;

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
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought86.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    fb0 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    lb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
    Output.points[0][6] -= fd1;
    lb1 = ad1 > ad2;
    boolean lb2 = true;
    ad3 *= -1;
    lb2 = fb0 || fb1;

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
    Thought lo0 = Thought0.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1();
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
}
    ad4 = fd0 - fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[0][7] -= fd1;
        lb0 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        boolean lb1 = true;
        fb0 = fb1 || lb1;
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && lb1;
        if (lb0) {
            Thought lo2 = Thought224.getInstance();
if(ao3 != null){
              ao2 = ao3.m4(fb0, fb1, lb1, lb0);
}
            fb0 = !fb1;
            double ld3 = 540.238238359685;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3, lb1, lb0, fb0, fb1);
}
if(fo0 != null){
              ao4 = fo0.m4(fd0, fd1, ld3, fd0, lb1, lb0, fb0, fb1);
}
            Thought lo4 = Thought337.getInstance(fo1, ao1, ao2, ao3, lb1, lb0, fb0, fb1);
if(ao4 != null){
              fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
            ld3 = fd0 + fd1;
            boolean lb5 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      lb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    fb0 = !fb1;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    fb1 = ad4 > fd0;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m1(lb0, lb1, lb2, fb0);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
    fb0 = fb1 && lb0;

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
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    double ld0 = 98.76062142320008;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought35.getInstance(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
    fd1 *= -1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
        ab1 = !ab2;

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
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = ad2 < ad3;
        lb1 = !ab1;
    ab2 = ad4 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo3 = Thought153.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][8] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought234.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    for(int i0=0; i0<10; i0++){
        Output.points[1][0] -= fd0;
        }
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 505.4372033504753;
    lb0 = fd0 > fd1;
    ld2 = fd0 - fd1;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 176.93529683599488;
if(fo1 != null){
      ld0 = fo1.m3();
}
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < ld0;
    fd0 = fd1 - ld0;
    ab2 = fd0 > fd1;
    ab3 = ld0 < fd0;
    ab4 = !fb0;
    Thought lo1 = Thought278.getInstance(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = ld0 > fd0;
    boolean lb2 = false;
    fd1 *= -1;
    ld0 *= -1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Output.points[1][1] += ad3;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo0.m1(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo0.m1();
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
if(fo0 != null){
      ad2 = fo0.m3(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    Thought lo0 = Thought310.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    Output.points[1][2] += ad4;
    fd0 *= -1;
    ab3 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought71.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ab1 || ab2;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
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
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1();
}
if(ao1 != null){
          lb0 = ao1.m2(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
        fb0 = fd1 > fd0;
        Thought lo2 = Thought177.getInstance(ao2, ao3, ao4, fo0, fb1, lb1, lb0, fb0);
        fb1 = lb1 && lb0;
        boolean lb3 = true;
        lb0 = fd1 < fd0;
        double ld4 = 606.8211334831446;
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
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[1][3] += fd1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
if(ao4 != null){
      ao4.m3(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 > ad4;
    Output.points[1][4] += fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
        fd1 *= -1;
if(fo1 != null){
          lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
        boolean lb1 = false;
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4);
}
        lb0 = fb0 && fb1;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
            Thought lo2 = Thought161.getInstance();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
if(ao2 != null){
      lb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    Thought lo2 = Thought119.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    double ld3 = 472.61840586995197;
    lb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    lb0 = ld3 < fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    lb1 = !ab1;
    fd1 *= -1;
    boolean lb4 = false;
    ab1 = ab2 || ab3;
    ab4 = ld3 < fd0;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld3, fd0, fd1);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3);
}
    fd0 = fd1 - ld3;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb5 = false;
    lb1 = fd1 > ld3;

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
      ao2.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    Thought lo0 = Thought188.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    Output.points[1][5] += fd0;
    Thought lo2 = Thought377.getInstance(fd1, ad1, ad2, ad3);
    boolean lb3 = true;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb4 = true;
if(fo1 != null){
      lb1 = fo1.m2();
}
if(ao1 != null){
      fd1 = ao1.m3(lb3, lb4, ab1, ab2);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, lb1, lb3, lb4, ab1);
}
    boolean lb5 = true;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    Output.points[1][6] += ad3;
    ab1 = !ab2;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought19.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought100.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
              fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[1][7] -= fd1;
    fb1 = lb2 && fb0;
    double ld3 = 24.116391599341462;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(lb2, fb0, fb1, lb2);
}
    ld3 = fd0 + fd1;
    fb0 = ld3 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
if(fo1 != null){
      fo1.m1(ld3, fd0, fd1, ld3, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld0 = 190.40003294054304;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    double ld1 = 170.46162464422142;
if(fo0 != null){
      ld0 = fo0.m3();
}
    fb1 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > ld0;
    Thought lo2 = Thought205.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
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
    Thought lo0 = Thought136.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
        boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[1][8] -= fd0;
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
