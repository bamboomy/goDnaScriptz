package genetic;
import java.util.ArrayList;
class Thought117 extends Thought{
private static ArrayList<Thought117> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 727.6960442687242;
private double fd1 = 593.3793370355145;
private Thought fo0 = null;
private Thought fo1 = null;
Thought117 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought117 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought117 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought117 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought117 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought117 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought117 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought117 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought117 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought117 instance = new Thought117 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought117 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought117 instance = new Thought117 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought117 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought117 instance = new Thought117 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought117 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought117 instance = new Thought117 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought117 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought117 instance = new Thought117 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought117 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought117 instance = new Thought117 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought117 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought117 instance = new Thought117 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought117 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought117 instance = new Thought117 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = !fb0;
    Output.points[0][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld1 = 951.7272036839847;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ld1 < fd0;
    double ld2 = 578.379778757687;
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb0 = fo0.m2(ld1, ld2, fd0, fd1);
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
    boolean lb0 = false;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    Thought lo2 = Thought21.getInstance(lb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    ab4 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
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
    boolean lb0 = true;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    lb0 = !fb0;
    ad3 = ad4 + fd0;
    Output.points[0][3] -= fd1;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    ad4 *= -1;
    double ld2 = 806.4665980870815;
    Thought lo3 = Thought62.getInstance();
    Thought lo4 = Thought69.getInstance(fb0, fb1, lb0, lb1);
    fb0 = !fb1;
    Output.points[0][4] += ad4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
        Thought lo5 = Thought286.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
        ld2 *= -1;
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad4 = fd0 + fd1;
        ld2 *= -1;
        lb0 = ad1 > ad2;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo1.m2(fd1, ld2, ad1, ad2);
}
        boolean lb6 = false;
        double ld7 = 233.2651139038812;
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
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = !ab4;
    Output.points[0][5] += fd1;
    Thought lo0 = Thought132.getInstance(fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Output.points[0][6] -= ad3;
    double ld1 = 744.982994119285;
    ad3 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
    Thought lo4 = Thought383.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    lb2 = lb3 && ab1;
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 < ld1;
    ad1 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;

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
      ao1.m3(fd0, fd1, fd0, fd1);
}
        fb1 = !fb0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    Thought lo2 = Thought226.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    if (lb1) {
        fb0 = fd0 > fd1;
        Thought lo3 = Thought99.getInstance();
        fd0 = fd1 + fd0;
        Thought lo4 = Thought93.getInstance(fb1, lb0, lb1, fb0);
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought242.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    fb1 = !fb0;
    fd1 = ad1 - ad2;
    fb1 = fb0 && fb1;
    if (fb0) {
        ad3 *= -1;
if(fo1 != null){
          fo1.m2(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 - ad4;
        double ld1 = 544.7878860384772;
        fb1 = !fb0;
        fb1 = ad4 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
}
        fb0 = !fb1;
        boolean lb2 = true;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(lb2, fb0, fb1, lb2);
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
    double ld0 = 716.1444984212635;
    fd0 *= -1;
        boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fd1 > ld0;
    ab1 = fd0 < fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ld0 - fd0;
    fb1 = fd1 > ld0;
    boolean lb3 = true;
    boolean lb4 = false;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0, lb2, lb3, lb4, ab1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld0;

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
    Output.points[0][7] += ad2;
    boolean lb0 = true;
    lb0 = ad3 > ad4;
    Output.points[0][8] -= fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    lb0 = fd0 < fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 870.1852352043638;
        ad4 = fd0 + fd1;
        boolean lb3 = true;
if(ao3 != null){
          ao3.m1();
}
if(fo0 != null){
          ao4 = fo0.m4(lb0, lb1, ab1, ab2);
}
        boolean lb4 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ld2, fb1, lb3, lb4, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
}
        ad1 = ad2 - ad3;
        ab4 = ad4 > fd0;
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
    fd0 = fd1 + fd0;
        Output.points[1][0] -= fd1;
    double ld0 = 720.9454534926468;
    fb0 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1);
}
        boolean lb1 = false;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb1, fb0);
}
    fb1 = ld0 < fd0;

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
    ab2 = fd0 > fd1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    Output.points[1][1] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[1][2] += fd0;
    double ld1 = 546.5817636529509;
    fb1 = lb0 && ab1;
    fd0 *= -1;
    Thought lo2 = Thought329.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = fd1 < ld1;
    lb0 = ab1 && ab2;
    boolean lb3 = false;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
    Thought lo5 = Thought11.getInstance(fd0, fd1, ld1, fd0);
    Thought lo6 = Thought335.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
    Thought lo7 = Thought236.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb8 = true;
    fb0 = fb1 && lb0;
    boolean lb9 = false;
    ld1 = fd0 - fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb3, lb4, lb8, lb9);
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
    Output.points[1][3] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought234.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought163.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
    double ld2 = 11.122127250911706;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb0 = true;
if(fo1 != null){
          ab3 = fo1.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        ab4 = !fb0;
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo1.m1(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
        Thought lo1 = Thought50.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        boolean lb2 = false;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          ad4 = fo0.m3(ab3, ab4, fb0, fb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    double ld2 = 934.4143747067126;
    fd0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fd1, ld2, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
    ld2 = fd0 + fd1;
    boolean lb3 = true;
    lb1 = lb3 || fb0;
    ld2 = fd0 + fd1;
    Thought lo4 = Thought90.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, lb1, lb3);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(ld2, fd0, fd1, ld2);
}
        fb0 = fd0 > fd1;
    Thought lo5 = Thought55.getInstance(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2);
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb6 = true;

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
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    Output.points[1][4] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    Output.points[1][5] -= fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought179.getInstance(ad1, ad2, ad3, ad4);
    Thought lo3 = Thought259.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    fd0 *= -1;
    ab3 = ab4 || fb0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m1();
}
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
        ab3 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
        fd0 = fd1 + fd0;
        double ld0 = 352.0955541788607;
        fd0 = fd1 + ld0;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        double ld1 = 45.71760241605118;
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
    if (ab1) {
        ab2 = ab3 && ab4;
if(ao2 != null){
          ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought292.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
        Thought lo1 = Thought380.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
        for(int i0=0; i0<10; i0++){
            ad4 = fd0 - fd1;
            boolean lb2 = true;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
            Output.points[1][6] -= fd0;
            for(int i1=0; i1<10; i1++){
                lb2 = fd1 > ad1;
                ab1 = ad2 < ad3;
                ab2 = ab3 && ab4;
                double ld3 = 314.21988852696546;
                ad3 = ad4 - fd0;
if(ao1 != null){
                  fo1 = ao1.m4();
}
                fb0 = fd1 < ld3;
if(ao2 != null){
                  ao2.m1(fb1, lb2, ab1, ab2);
}
                ad1 *= -1;
                ab3 = ab4 && fb0;
                double ld4 = 238.84571153124958;
}}}
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
    boolean lb0 = false;
    boolean lb1 = false;
    if (lb1) {
        Output.points[1][7] -= fd0;
        fb0 = fb1 && lb0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
        Output.points[1][8] += fd0;
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        double ld3 = 980.9131798566642;
        lb2 = lb0 || lb1;
        ld3 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[2][0] -= ld3;
        fd0 *= -1;
        fd1 = ld3 - fd0;
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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    Thought lo0 = Thought1.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    boolean lb2 = false;
    boolean lb3 = true;
    fd1 *= -1;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, lb2, lb3);
}
    lb4 = ab1 && ab2;
    fd0 *= -1;
    boolean lb5 = true;
    Output.points[2][1] -= fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb2, lb3);
}
    lb4 = !lb5;
    ab1 = fd1 < fd0;
    boolean lb6 = false;
    boolean lb7 = true;
    lb7 = fd1 < fd0;

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
    fb1 = ad1 < ad2;
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought361.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
    lb0 = !fb0;
    Thought lo2 = Thought139.getInstance();
    fb1 = lb0 || fb0;
    ad4 *= -1;
    fb1 = fd0 < fd1;
    lb0 = !fb0;
    boolean lb3 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb3, fb0, fb1);
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
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    double ld0 = 798.4358817663817;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
    ab1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
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
if(ao1 != null){
      ao1.m2();
}
    if (fb1) {
if(ao2 != null){
          fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        Thought lo0 = Thought145.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
        fb0 = !fb1;
        boolean lb1 = false;
        fd0 = fd1 - fd0;
        Thought lo2 = Thought175.getInstance(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
        fd1 = fd0 - fd1;
        fb0 = fd0 < fd1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
        fd0 *= -1;
        lb1 = fd1 > fd0;
        boolean lb3 = false;
        Thought lo4 = Thought350.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
        Output.points[2][2] += fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    double ld0 = 168.75715755114274;
    Output.points[2][3] -= ad1;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought90.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    if (fb0) {
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ld0);
}
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ld0 + ad1;
        Thought lo2 = Thought284.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        double ld3 = 494.71167406935524;
        boolean lb4 = false;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb4, fb0);
}
        fd0 = fd1 - ld3;
        fb1 = lb4 || fb0;
if(ao2 != null){
          ld0 = ao2.m3(ad1, ad2, ad3, ad4, fb1, lb4, fb0, fb1);
}
        lb4 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, fb0, fb1, lb4);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
        Output.points[2][4] += fd1;
if(ao2 != null){
          ao2.m3(ld3, ld0, ad1, ad2);
}
        fb0 = fb1 && lb4;
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
    ab2 = !ab3;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought5.getInstance();
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought296.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    ab1 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    fb1 = ab1 && ab2;

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
    double ld1 = 977.6938114196397;
if(ao1 != null){
      ld1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      lb0 = ao2.m2(ab1, ab2, ab3, ab4);
}
    double ld2 = 243.23396885272464;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld1, ld2, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ad3 *= -1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    ld2 = ad1 + ad2;
    Thought lo3 = Thought288.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 + fd0;
    lb0 = ab1 || ab2;
    ab3 = fd1 > ld1;
    ab4 = ld2 > ad1;
    ad2 *= -1;
    boolean lb4 = true;
if(ao1 != null){
      ab4 = ao1.m2(ad3, ad4, fd0, fd1);
}
    ld1 *= -1;

Thought.STACK_COUNTER++;
return ld2;
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
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    Thought lo0 = Thought329.getInstance();
    if (fb1) {
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        boolean lb1 = false;
        Thought lo2 = Thought284.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
        Thought lo3 = Thought115.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
        fd0 = fd1 + fd0;
        boolean lb4 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb4);
}
        fb0 = fb1 || lb1;
if(fo1 != null){
          lb4 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
        fb1 = lb1 && lb4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
if(fo0 != null){
          fo0.m1(fb0, fb1, lb1, lb4);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb4);
}
        fb0 = !fb1;
if(fo1 != null){
          lb1 = fo1.m2(fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb1);
}
        lb4 = fd1 < fd0;
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
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[2][5] += fd0;
    ab2 = !ab3;
    Output.points[2][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
    Thought lo0 = Thought189.getInstance(fb0, fb1, ab1, ab2);
    ab3 = !ab4;
    fd0 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 - fd1;
    Output.points[2][7] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    Output.points[2][8] -= fd0;
    Thought lo1 = Thought170.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld2 = 229.1601040865306;

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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    fb0 = ad1 < ad2;
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
    boolean lb1 = false;
    double ld2 = 978.9532643151806;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    fb0 = fd1 > ld2;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
    double ld3 = 63.19201093359187;
    double ld4 = 944.8948233707977;
    fb1 = ad4 > fd0;
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
    Output.points[3][0] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
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
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        Output.points[3][1] -= ad4;
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
        fd0 = fd1 - ad1;
        ab1 = ad2 < ad3;
        ab2 = ad4 > fd0;
        Thought lo0 = Thought78.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Output.points[3][2] += fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    lb0 = lb1 || fb0;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 *= -1;
    double ld0 = 785.6315945838095;
    Output.points[3][3] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao2.m1(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Output.points[3][4] -= ad3;
    ad4 = fd0 + fd1;
    double ld1 = 58.138556932547026;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    double ld1 = 96.6692610142874;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1);
}
    double ld2 = 99.45703339070887;
    fb1 = lb0 || ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld1);
}
    Thought lo3 = Thought46.getInstance();
    ld2 = fd0 - fd1;

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
      ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Output.points[3][5] += ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fd0 = fd1 + ad1;
if(ao2 != null){
          ao2.m2(ad2, ad3, ad4, fd0);
}
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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    Output.points[3][6] += fd1;
    Thought lo0 = Thought331.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, fb0);
}
    Output.points[3][7] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;

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
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    double ld0 = 835.9388626456406;
    boolean lb1 = true;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    fb1 = lb1 && fb0;
    double ld2 = 347.89679368977363;
    fb1 = lb1 && fb0;
    double ld3 = 49.33277936486794;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ld3, fd0);
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fd0 > fd1;
    fd0 *= -1;
    Output.points[3][8] += fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    lb0 = fd1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;

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
