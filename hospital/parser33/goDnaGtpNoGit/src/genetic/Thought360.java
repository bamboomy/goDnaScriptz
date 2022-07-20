package genetic;
import java.util.ArrayList;
class Thought360 extends Thought{
private static ArrayList<Thought360> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 953.4081492454242;
private double fd1 = 136.60637357426234;
private Thought fo0 = null;
private Thought fo1 = null;
Thought360 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought360 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought360 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought360 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought360 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought360 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought360 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought360 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought360 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought360 instance = new Thought360 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought360 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought360 instance = new Thought360 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought360 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought360 instance = new Thought360 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought360 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought360 instance = new Thought360 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought360 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought360 instance = new Thought360 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought360 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought360 instance = new Thought360 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought360 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought360 instance = new Thought360 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought360 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought360 instance = new Thought360 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought170.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;

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
    Output.points[0][6] += fd1;
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    boolean lb1 = false;
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
    ab1 = fd1 > fd0;
    fd1 *= -1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    Output.points[0][7] += fd1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fb1, lb0, lb1, lb2);
}
        ab1 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
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
    Thought lo0 = Thought292.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        boolean lb2 = false;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[0][8] += fd1;
        lb2 = !fb0;
        fb1 = ad1 < ad2;
if(fo0 != null){
          ad3 = fo0.m3(lb1, lb2, fb0, fb1);
}
        boolean lb3 = false;
        lb1 = ad4 > fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, lb2, lb3, fb0);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, lb2, lb3);
}
        Output.points[1][0] += ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        ad3 = ad4 + fd0;
        Output.points[1][1] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought301.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
    ab4 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = ad1 < ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
        ab4 = fd1 < ad1;
        ad2 *= -1;
        ad3 *= -1;
        boolean lb1 = false;
        ab4 = ad4 > fd0;
        Output.points[1][2] -= fd1;
        double ld2 = 618.8230560998072;
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
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought345.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld1 = 866.995955044564;
    fb1 = ld1 > fd0;
    Thought lo2 = Thought348.getInstance(fd1, ld1, fd0, fd1);
    Thought lo3 = Thought370.getInstance(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = !fb1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought19.getInstance(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ld1 = ao4.m3(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
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
    double ld0 = 45.50458186768529;
    fb0 = ld0 < ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 570.118631425249;
    ad1 *= -1;
    fb1 = ad2 > ad3;
    fb0 = ad4 < fd0;
    double ld2 = 746.9456614819873;
    double ld3 = 861.8338873214528;
    Thought lo4 = Thought46.getInstance(fo1, ao1, ao2, ao3);
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ld0);
}
    ld1 = ld2 - ld3;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao4.m3();
}
    boolean lb5 = false;
    lb5 = ld0 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb5, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld2, ld3, ad1, ad2, lb5, fb0, fb1, lb5);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb5, fb0);
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
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    double ld0 = 264.46330778535764;
    Thought lo1 = Thought315.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    ld0 = fd0 + fd1;
    Output.points[1][3] += ld0;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
    ld0 *= -1;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
        double ld2 = 297.22564133366666;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld2, ld0, fd0);
}
if(fo0 != null){
          ab1 = fo0.m2();
}
        ab2 = fd1 < ld2;
        boolean lb3 = false;
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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    boolean lb0 = true;
    ab4 = fb0 || fb1;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, lb1, lb2, ab1);
}
if(ao4 != null){
      ao4.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    Thought lo3 = Thought274.getInstance(fo0, fo1, ao1, ao2, lb1, lb2, ab1, ab2);
        ab3 = fd0 > fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab4 = ad2 < ad3;
    fb0 = !fb1;
    lb0 = ad4 > fd0;
    lb1 = fd1 < ad1;
    lb2 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    double ld4 = 204.69868618239792;

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
    Thought lo0 = Thought243.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought169.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    for(int i0=0; i0<10; i0++){
        Output.points[1][4] -= fd0;
        fd1 *= -1;
        fb0 = fd0 < fd1;
        Output.points[1][5] += fd0;
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    double ld0 = 883.0582205241358;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    double ld1 = 513.3691740673765;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;

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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fd0 *= -1;
    fb1 = fd1 > ad1;
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    double ld1 = 742.1012067313201;

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
    double ld0 = 171.97853737290174;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    double ld1 = 629.805295653513;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
    ab2 = ad1 > ad2;
    boolean lb3 = true;
    ab2 = ad3 < ad4;
    Output.points[1][6] += fd0;
    boolean lb4 = true;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = fd1 > ld0;
    lb3 = ld1 < ad1;
    Output.points[1][7] -= ad2;
    lb4 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    Thought lo5 = Thought127.getInstance();
    ab3 = ab4 || fb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought293.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    Output.points[1][8] += fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;

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
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought184.getInstance(ao1, ao2, ao3, ao4);
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    fd0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = false;
    fb0 = fd0 < fd1;
if(ao2 != null){
      fb1 = ao2.m2(lb1, lb2, fb0, fb1);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb1);
}
    double ld3 = 881.9819139201584;
    lb2 = !fb0;
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = false;
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
        lb4 = fb0 || fb1;
        for(int i1=0; i1<10; i1++){
            boolean lb6 = true;
if(ao1 != null){
              lb6 = ao1.m2(ad4, fd0, fd1, ld3);
}
            lb5 = lb1 || lb2;
if(ao2 != null){
              lb4 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    Output.points[2][0] += fd1;
    double ld0 = 834.1155922556535;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought201.getInstance();
    fb1 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    if (ab1) {
        fd0 *= -1;
        boolean lb2 = false;
        ab1 = fd1 < ld0;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ld0 + fd0;
        double ld3 = 175.54787823011918;
        fb1 = lb2 || ab1;
        ab2 = ab3 || ab4;
        fb0 = fb1 || lb2;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought94.getInstance(ao1, ao2, ao3, ao4);
    ab1 = ad1 > ad2;
if(fo0 != null){
      ab2 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    double ld1 = 718.1715520071166;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ld1 = ad1 - ad2;
    Thought lo2 = Thought332.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    double ld3 = 305.6662220783898;
    boolean lb4 = false;

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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2();
}
    Thought lo0 = Thought300.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    double ld1 = 843.2758736314465;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    lb2 = fd0 > fd1;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
}
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
    Thought lo3 = Thought192.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    boolean lb5 = true;

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
    for(int i0=0; i0<10; i0++){
        double ld0 = 632.8292638404289;
if(fo0 != null){
          fo0.m2();
}
        ld0 = fd0 - fd1;
if(fo1 != null){
          ld0 = fo1.m3(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        double ld1 = 582.4063144552968;
        Thought lo2 = Thought38.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
        ab1 = ab2 || ab3;
        Thought lo3 = Thought106.getInstance(ld1, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
        ab2 = !ab3;
        Output.points[2][1] += ld1;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = fd0 > fd1;
        double ld4 = 193.84572217262402;
        ab1 = ab2 || ab3;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb5 = true;
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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    double ld0 = 848.3911042195713;
if(fo1 != null){
      fb1 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        double ld1 = 689.5324822597722;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        Output.points[2][2] += fd0;
        fb1 = fd1 > ld1;
        fb0 = !fb1;
        ld0 = ad1 - ad2;
        Thought lo2 = Thought365.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
        Thought lo3 = Thought384.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        }
    ld0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
    double ld4 = 891.4718747248099;
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    ld0 = ld4 + ad1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    Output.points[2][3] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
        ab1 = ab2 && ab3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      ad1 = fo0.m3(ab3, ab4, fb0, fb1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    double ld0 = 718.1579970444026;
    ld0 = fd0 - fd1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
    ld0 *= -1;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought376.getInstance(fd0, fd1, ld0, fd0);
    fb0 = fd1 > ld0;
    fb1 = fb0 || fb1;
    double ld2 = 815.1989458147824;
    fb0 = !fb1;
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld2);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
if(ao3 != null){
      ad2 = ao3.m3(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > ad1;
    boolean lb2 = false;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought151.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    boolean lb4 = true;
    lb0 = ad2 > ad3;
    boolean lb5 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    boolean lb6 = true;
    double ld7 = 263.721534715733;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && ab1;
if(ao4 != null){
      ao4.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = ab1 || ab2;
        ab3 = fd0 < fd1;
        fd0 = fd1 + fd0;
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
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[2][4] += ad2;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        boolean lb1 = false;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          ab3 = ao2.m2();
}
        Output.points[2][5] += fd0;
        ab4 = !fb0;
        fd1 *= -1;
if(ao3 != null){
          ad1 = ao3.m3(fb1, lb1, lb0, ab1);
}
        ab2 = ad2 > ad3;
        Thought lo2 = Thought291.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
        double ld3 = 58.47745750613794;
        double ld4 = 584.9195665088639;
if(ao3 != null){
          ao2 = ao3.m4(ld4, ad1, ad2, ad3, lb1, lb0, ab1, ab2);
}
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        double ld5 = 668.5370808180883;
        Output.points[2][6] += ad4;
        boolean lb6 = false;
        lb1 = fd0 < fd1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought392.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought310.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb2 = false;
    lb2 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    Output.points[2][7] -= fd0;
    boolean lb3 = true;
    fd1 = fd0 - fd1;
    Output.points[2][8] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb2);
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
    if (ab2) {
        ab3 = fd0 < fd1;
        ab4 = fb0 || fb1;
        ab1 = fd0 < fd1;
        fd0 = fd1 - fd0;
        for(int i0=0; i0<10; i0++){
            boolean lb0 = true;
            for(int i1=0; i1<10; i1++){
                Output.points[3][0] += fd1;
                ab1 = fd0 < fd1;
}}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
    ad3 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought34.getInstance(ad4, fd0, fd1, ad1);
    Thought lo1 = Thought200.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fb1 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    Thought lo4 = Thought150.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo5 = Thought8.getInstance(fb0, fb1, lb2, lb3);
    fb0 = ad3 > ad4;
    boolean lb6 = false;
    double ld7 = 292.06547786325217;

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
    Output.points[3][1] -= ad1;
    boolean lb0 = true;
    double ld1 = 557.6663814090232;
    Thought lo2 = Thought359.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
        fd0 = fd1 + ld1;
    boolean lb3 = true;
    Thought lo4 = Thought253.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    double ld5 = 556.6684929097885;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
    ld5 = ad1 + ad2;

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
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    double ld0 = 245.66232073075008;
if(ao1 != null){
      fb0 = ao1.m2();
}
    double ld1 = 886.3238815136358;
    boolean lb2 = false;
    fb0 = fb1 || lb2;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb2, fb0, fb1);
}
    ld0 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
    for(int i0=0; i0<10; i0++){
        }
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ld1 = fd0 - fd1;
    fb0 = ld0 < ld1;
    Thought lo3 = Thought130.getInstance(fd0, fd1, ld0, ld1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);
}
    Thought lo4 = Thought373.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb2, fb0, fb1);
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
    if (lb0) {
        ad1 = ad2 - ad3;
        fb0 = fb1 && lb0;
        Thought lo1 = Thought308.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
        ad2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
        Thought lo2 = Thought253.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
        double ld3 = 498.6119806467329;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
        double ld4 = 391.5709233922507;
        ld3 *= -1;
if(ao4 != null){
          fb0 = ao4.m2(ld4, ad1, ad2, ad3);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld3);
}
if(ao4 != null){
          ao4.m3();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, ab1, ab2);
}
    Thought lo2 = Thought170.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb3, ab1);
}
    double ld4 = 522.4016240956427;
    Thought lo5 = Thought280.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld4, fd0, fd1);
}
    boolean lb6 = false;
    ld4 = fd0 + fd1;
    fb0 = fb1 && lb0;

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
if(ao1 != null){
          ad1 = ao1.m3();
}
    Thought lo0 = Thought200.getInstance(ab2, ab3, ab4, fb0);
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
        boolean lb1 = false;
        ab1 = ad1 < ad2;
        Thought lo2 = Thought330.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
if(ao3 != null){
          ab2 = ao3.m2();
}
        ab3 = !ab4;
        ad1 *= -1;
        Thought lo3 = Thought187.getInstance(fb0, fb1, lb1, ab1);
        boolean lb4 = false;
        boolean lb5 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb5, ab1, ab2, ab3);
}
        boolean lb6 = false;
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
    fd1 *= -1;
    Output.points[3][2] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
        boolean lb1 = false;
    Thought lo2 = Thought192.getInstance(fo1, fo0, fo1, fo0);
    double ld3 = 986.2071744929403;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
    lb1 = !fb0;
    ld3 *= -1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
        boolean lb0 = true;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[3][3] -= fd0;

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
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    Output.points[3][4] += fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb0 = !lb1;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, lb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 && fb0;
    fb1 = fd1 < fd0;
    boolean lb3 = false;
    lb0 = !lb1;
    Thought lo4 = Thought239.getInstance(fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, lb1, lb2, lb3);
}
    Thought lo5 = Thought220.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    double ld6 = 889.1358628292264;
    Output.points[3][5] += fd0;

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
