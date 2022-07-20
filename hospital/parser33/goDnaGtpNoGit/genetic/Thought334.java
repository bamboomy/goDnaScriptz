package genetic;
import java.util.ArrayList;
class Thought334 extends Thought{
private static ArrayList<Thought334> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 153.04687069226728;
private double fd1 = 174.77238589069523;
private Thought fo0 = null;
private Thought fo1 = null;
Thought334 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought334 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought334 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought334 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought334 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought334 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought334 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought334 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought334 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought334 instance = new Thought334 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought334 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought334 instance = new Thought334 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought334 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought334 instance = new Thought334 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought334 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought334 instance = new Thought334 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought334 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought334 instance = new Thought334 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought334 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought334 instance = new Thought334 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought334 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought334 instance = new Thought334 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought334 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought334 instance = new Thought334 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fd1 *= -1;
    Thought lo1 = Thought275.getInstance();
    Output.points[5][3] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
    lb0 = fd1 < fd0;

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
    double ld0 = 0.7529955415271007;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 - fd1;
    Output.points[5][4] += ld0;
    double ld1 = 839.8778225673171;
    Output.points[5][5] -= ld1;
    Thought lo2 = Thought173.getInstance(fd0, fd1, ld0, ld1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;

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
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        boolean lb0 = true;
if(fo1 != null){
          lb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
        boolean lb1 = false;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        lb1 = ad1 < ad2;
if(fo1 != null){
          fb0 = fo1.m2();
}
        Output.points[5][6] += ad3;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
        double ld2 = 607.3000929847142;
        ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
        ad1 = ad2 - ad3;
        boolean lb3 = false;
        double ld4 = 939.2524748368359;
        ad3 = ad4 - fd0;
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
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb1, lb2, lb3, ab1);
}
    double ld4 = 456.1260747448735;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld5 = 672.353643835984;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld4;
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;

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
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought158.getInstance(ao2, ao3, ao4, fo0);
    Thought lo2 = Thought155.getInstance(ad1, ad2, ad3, ad4);
    if (lb0) {
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
        Thought lo3 = Thought163.getInstance();
        } else if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
        lb0 = !fb0;
        ad3 = ad4 + fd0;
        Output.points[5][7] -= fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
        ad4 = fd0 - fd1;
        ad1 = ad2 - ad3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = lb0 && fb0;
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m3();
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought339.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;

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
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab2 = ao1.m2(ad2, ad3, ad4, fd0);
}
    double ld0 = 938.7372634079151;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    Thought lo2 = Thought74.getInstance();
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    ab1 = fd1 < ld0;
    double ld3 = 783.6606109752313;
    ld3 *= -1;
    ab2 = ab3 && ab4;
    boolean lb4 = true;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld3, ad1, lb4, ab1, ab2, ab3);
}
    double ld5 = 356.41642382628913;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[5][8] -= ad1;
    lb4 = ab1 || ab2;

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
    Output.points[6][0] += fd0;
    Thought lo0 = Thought126.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = false;
    lb1 = !fb0;
    Thought lo2 = Thought73.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb1 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3();
}
    ab1 = fd0 < fd1;
    Thought lo2 = Thought235.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    boolean lb3 = true;
    ab2 = !ab3;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb3);
}
    ab1 = !ab2;
    fd0 = fd1 - fd0;

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
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought331.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ad2 < ad3;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld1 = 229.28261831023548;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 828.3620497524121;
    Output.points[6][1] += ad1;
    fb1 = ad2 > ad3;
    ab1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[6][2] += ld0;
    ad1 = ad2 - ad3;
    double ld1 = 769.9382084918456;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought269.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
    Output.points[6][3] -= ad1;

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
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    double ld0 = 221.6667596252123;
    boolean lb1 = false;
    Output.points[6][4] -= ld0;
    Output.points[6][5] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = ld0 - fd0;
    Thought lo2 = Thought131.getInstance(fd1, ld0, fd0, fd1);
    fb0 = !fb1;
    Thought lo3 = Thought218.getInstance(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
    lb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ld0 *= -1;
    Thought lo4 = Thought66.getInstance();
if(ao4 != null){
      ao4.m1(fb0, fb1, lb1, fb0);
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
    Output.points[6][6] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    if (fb0) {
        fb1 = fd0 < fd1;
if(ao1 != null){
          fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        Output.points[6][7] -= fd0;
        fb1 = fd1 > ad1;
        boolean lb0 = true;
        double ld1 = 900.6269762806405;
        Thought lo2 = Thought217.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb0 = ad1 > ad2;
        double ld3 = 39.717648432749556;
        fb1 = lb0 && fb0;
        fb1 = !lb0;
        fb0 = fb1 || lb0;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo1.m1(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, ld3, ad1);
}
        boolean lb4 = false;
        boolean lb5 = true;
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
    Thought lo0 = Thought63.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    fd0 *= -1;
    double ld2 = 681.7640915370347;
    double ld3 = 323.7594449402925;
    Thought lo4 = Thought95.getInstance(ld3, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
    ld3 = fd0 - fd1;
    double ld5 = 144.36880917246967;
    fb1 = lb1 && ab1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ld2 = ld3 + ld5;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[6][8] += fd0;

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
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1();
}
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(lb0, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    ab4 = fb0 || fb1;
    fd1 = ad1 + ad2;
    Output.points[7][0] -= ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    boolean lb3 = false;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb0 = false;
    Output.points[7][1] -= fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    lb0 = fd0 < fd1;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought66.getInstance(lb0, lb1, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    double ld3 = 399.00656618193057;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
    fd1 = ld3 + fd0;
    lb0 = !lb1;
    fd1 = ld3 + fd0;
    boolean lb4 = true;
    lb4 = fb0 || fb1;
    Thought lo5 = Thought137.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
    if (lb0) {
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought378.getInstance(ab2, ab3, ab4, fb0);
        }
    double ld1 = 975.4084845134604;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fd1, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    double ld2 = 861.1802223560535;
    ab1 = ab2 || ab3;
    ab4 = !fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        boolean lb1 = false;
        boolean lb2 = false;
        double ld3 = 663.1500819478008;
        ad2 *= -1;
        ad3 = ad4 - fd0;
        fd1 = ld3 + ad1;
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        }
    fb1 = !fb0;

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
    boolean lb0 = false;
    ab1 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    ab2 = fd0 < fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 220.53256424682257;
    ab1 = ld3 > ad1;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    double ld4 = 519.4534180866781;
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
        lb1 = !lb2;
        boolean lb5 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought121.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
        Thought lo1 = Thought228.getInstance(fo0, fo1, ao1, ao2);
        double ld2 = 688.4390562257445;
if(ao4 != null){
          ao3 = ao4.m4(ld2, fd0, fd1, ld2);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
if(ao1 != null){
          fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ld2 < fd0;
        for(int i1=0; i1<10; i1++){
            fd1 = ld2 + fd0;
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 628.3787256924535;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd0 = ao3.m3(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
        fb1 = !fb0;
        ld0 = ad1 - ad2;
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
    Output.points[7][3] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
        ab2 = fd1 < fd0;
    boolean lb0 = true;
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought324.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    lb0 = ab1 || ab2;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    double ld3 = 633.3209597351347;
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2);
}
    lb0 = lb2 || ab1;
if(ao3 != null){
      ab2 = ao3.m2(fd0, fd1, ld3, fd0);
}
    ab3 = ab4 && fb0;
    fd1 = ld3 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld3, fd0, fd1);
}
    Thought lo4 = Thought181.getInstance();
if(ao4 != null){
      fb1 = ao4.m2(lb0, lb2, ab1, ab2);
}
    ld3 = fd0 - fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = true;
    Output.points[7][4] += ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = ad1 > ad2;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;

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
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    Output.points[7][5] -= fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
        Thought lo2 = Thought285.getInstance(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        Output.points[7][6] += fd1;
        boolean lb3 = false;
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought328.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab4 = fd1 < fd0;
    fb0 = fb1 && ab1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2();
}
    Thought lo1 = Thought68.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    double ld2 = 85.92686732614509;
    fd0 = fd1 - ld2;
    double ld3 = 117.20875637698778;
    ab4 = fb0 || fb1;

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
    double ld0 = 944.399913754767;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    boolean lb1 = true;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[7][7] += ad4;
        Thought lo2 = Thought12.getInstance(fd0, fd1, ld0, ad1);
    double ld3 = 554.1195971992873;
    fb0 = !fb1;
    boolean lb4 = false;
        lb1 = !lb4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fd1 > ld0;

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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought266.getInstance(ab1, ab2, ab3, ab4);
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
    ab1 = !ab2;
    if (ab3) {
        ab4 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb0, lb2, ab1, ab2);
}
        boolean lb3 = false;
        ad2 *= -1;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        boolean lb4 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        boolean lb5 = true;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
        ab4 = ad2 < ad3;
        ad4 = fd0 - fd1;
        } else {
        Thought lo6 = Thought140.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 = fd1 + ad1;
                Output.points[7][8] -= ad2;
        if (lb2) {
if(fo0 != null){
              fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
            Thought lo7 = Thought54.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    Thought lo0 = Thought286.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb2 = false;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb1);
}
    boolean lb3 = false;
    Thought lo4 = Thought37.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb5 = true;

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
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        ad4 = fd0 - fd1;
        fb1 = ad1 < ad2;
        boolean lb0 = true;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
        ad1 = ad2 + ad3;
        boolean lb1 = true;
        fb0 = fb1 && lb0;
        double ld2 = 97.39225564049684;
        ad3 *= -1;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
        if (lb1) {
            double ld3 = 892.12747723003;
if(ao4 != null){
              ao3 = ao4.m4(ad4, fd0, fd1, ld3);
}
            ld2 = ad1 - ad2;
            ad3 = ad4 + fd0;
            for(int i1=0; i1<10; i1++){
if(fo1 != null){
                  fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld3, ld2, ad1);
}
                boolean lb4 = false;
if(fo0 != null){
                  ad2 = fo0.m3();
}
if(fo1 != null){
                  fo1.m1(lb1, fb0, fb1, lb4);
}
}}}
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
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = true;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 748.2735112498505;
        fd0 = fd1 + ld1;
        Output.points[8][0] -= fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ld1 = fd0 + fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
        ld1 = fd0 + fd1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        Thought lo2 = Thought184.getInstance(ld1, fd0, fd1, ld1);
        boolean lb3 = true;
        ab3 = !ab4;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ad3, ad4, fd0, fd1);
}
    double ld1 = 67.12808795444532;
    boolean lb2 = false;
    boolean lb3 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
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
    Thought lo1 = Thought271.getInstance();
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    lb0 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = !fb1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Output.points[8][1] += fd1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || lb1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 && fb1;
    boolean lb2 = true;
    Output.points[8][2] += fd0;

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
    double ld0 = 471.4930759294294;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought182.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    ld0 = fd0 - fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    Output.points[8][3] -= ld0;

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
