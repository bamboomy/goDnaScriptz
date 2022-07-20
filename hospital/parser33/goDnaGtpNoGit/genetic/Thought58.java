package genetic;
import java.util.ArrayList;
class Thought58 extends Thought{
private static ArrayList<Thought58> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 527.5604957318274;
private double fd1 = 323.5561436537293;
private Thought fo0 = null;
private Thought fo1 = null;
Thought58 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought58 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought58 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought58 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought58 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
    double ld0 = 798.8101728071248;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < ld0;
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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought170.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 && fb1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;

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
    fb0 = ad1 < ad2;
    boolean lb0 = false;
    double ld1 = 142.05933560551972;
    boolean lb2 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld1;
if(fo1 != null){
      lb2 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
        lb2 = ad1 > ad2;
        boolean lb3 = false;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
        ad1 *= -1;
if(fo1 != null){
          fo1.m1();
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(lb2, fb0, fb1, lb3);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, lb2, fb0, fb1, lb3);
}
        ad2 = ad3 + ad4;
if(fo1 != null){
          lb0 = fo1.m2(fd0, fd1, ld1, ad1, lb2, fb0, fb1, lb3);
}
        Output.points[6][4] -= ad2;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, lb0, lb2, fb0);
}
        boolean lb5 = true;
        boolean lb6 = false;
        Thought lo7 = Thought55.getInstance(fo0, fo1, fo0, fo1);
        lb2 = !fb0;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ld1);
}
        fb1 = lb3 || lb4;
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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought145.getInstance();
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    double ld2 = 140.72531244060687;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought376.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
    ab1 = fd0 > fd1;
    double ld4 = 976.8440720026371;
    ab2 = ld2 > ld4;
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        Thought lo5 = Thought250.getInstance(fo0, fo1, fo0, fo1);
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
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought302.getInstance();
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    lb1 = fd0 > fd1;
    double ld2 = 380.5813939439821;

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
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    fb0 = !fb1;
    fd1 = ad1 + ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb0 = fd1 > ad1;
        double ld1 = 32.949532949691985;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = ld1 > ad1;

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
    ab1 = ab2 && ab3;
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld0 = 795.5252986045975;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          fd0 = ao4.m3(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    ab3 = ld0 < fd0;
    boolean lb1 = true;
    double ld2 = 158.05500300757217;
    fd0 *= -1;
    Output.points[6][5] -= fd1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = ld2 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, ld2, fd0);
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
    Thought lo0 = Thought133.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = false;
        lb1 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb2);
}
    ab1 = ad2 < ad3;
    ab2 = !ab3;
    ad4 *= -1;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, ad1, ad2);
}
    Thought lo4 = Thought337.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
if(ao4 != null){
      ao3 = ao4.m4();
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
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    double ld0 = 882.1440987989023;
    boolean lb1 = false;
    fd0 *= -1;
    fd1 = ld0 - fd0;
    lb1 = fd1 < ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought206.getInstance(fo1, fo0, fo1, fo0);

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought88.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[6][6] += fd0;
    ab1 = !ab2;
    fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    Thought lo1 = Thought115.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    fd0 *= -1;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd0 *= -1;
    Thought lo2 = Thought276.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);

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
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 704.301065627506;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    if (fb0) {
        double ld1 = 96.09348692415725;
        fd0 = fd1 - ld1;
        fb1 = !fb0;
        ld0 = ad1 + ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
        Output.points[6][7] -= ld0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        ad1 = ad2 + ad3;
        fb1 = !fb0;
        boolean lb2 = false;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
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
    boolean lb0 = true;
    Output.points[6][8] += ad2;
    ab1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    if (fb1) {
        ad3 = ad4 - fd0;
        lb0 = fd1 < ad1;
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        fb1 = lb0 && ab1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][0] += fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld0 = 564.1862178514903;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 350.5684066375389;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought139.getInstance(ld1, fd0, fd1, ld0);
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(lb2, fb0, fb1, lb2);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    double ld4 = 113.32116494159611;
    Output.points[7][1] += ld0;
    ld1 *= -1;
    double ld5 = 506.10193255364004;
if(ao4 != null){
      ao4.m3(ld4, ld5, fd0, fd1, fb1, lb2, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        double ld1 = 201.84085503079032;
        double ld2 = 916.8545592192722;
        Output.points[7][2] += ad2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Thought lo3 = Thought178.getInstance(ad3, ad4, fd0, fd1);
        boolean lb4 = false;
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    double ld0 = 218.18200008601525;
    ab2 = ab3 && ab4;
    ld0 = fd0 + fd1;
    double ld1 = 543.2097461492319;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ld0 = ao4.m3(ld1, fd0, fd1, ld0);
}
    double ld2 = 565.1315093829943;
    fb0 = fb1 || ab1;
    ld1 = ld2 - fd0;
    fd1 = ld0 + ld1;
    Thought lo3 = Thought264.getInstance(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0);
    ab2 = ld1 < ld2;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
    ld0 = ld1 - ld2;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ld1, ld2, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld0;
    ab1 = ld1 < ld2;

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
    ab1 = ab2 && ab3;
    double ld0 = 110.25289005347285;
    ab4 = !fb0;
    fb1 = ad1 > ad2;
    ad3 *= -1;
    Thought lo1 = Thought59.getInstance(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    ad1 = ad2 + ad3;
    boolean lb2 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
    ab2 = !ab3;
    ab4 = ad1 > ad2;
    fb0 = !fb1;
    lb2 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Output.points[7][3] -= ld0;
    double ld3 = 600.5397553152759;
if(ao3 != null){
      ab3 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb2);
}
    Output.points[7][4] += ld3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ld3, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb2, ab1, ab2);
}
    ab3 = ab4 && fb0;
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought273.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    if (fb1) {
        double ld1 = 54.69139750932795;
        double ld2 = 798.3611679797651;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1);
}
        ld2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        boolean lb3 = true;
        Thought lo4 = Thought279.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb3, fb0, fb1, lb3);
        boolean lb5 = false;
        fd0 = fd1 - ld1;
        boolean lb6 = false;
        double ld7 = 359.45462815815216;
        ld2 *= -1;
if(fo1 != null){
          fo1.m2(ld7, fd0, fd1, ld1, lb5, lb6, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb5, lb6, fb0);
}
        fb1 = lb3 && lb5;
        ld2 = ld7 + fd0;
        fd1 = ld1 - ld2;
        boolean lb8 = false;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        lb6 = lb8 && fb0;
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
    Thought lo0 = Thought256.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[7][5] += fd1;
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought258.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    lb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Output.points[7][6] -= fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m3();
}
        ab2 = !ab3;
        ab4 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fb0 = fd1 < fd0;
        boolean lb3 = false;
        fb0 = fd1 < fd0;
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
    Output.points[7][7] -= ad1;
    Thought lo0 = Thought363.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought122.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ad1;
    Thought lo2 = Thought302.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    Thought lo3 = Thought395.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
}
        if (fb0) {
            fd0 *= -1;
            fd1 = ad1 - ad2;
            fb1 = fb0 || fb1;
            Thought lo4 = Thought164.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
            ad1 = ad2 - ad3;
}}
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
if(fo0 != null){
      fo0.m2();
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    if (lb0) {
        boolean lb1 = false;
if(fo1 != null){
          lb0 = fo1.m2(ab1, ab2, ab3, ab4);
}
        ad4 = fd0 + fd1;
        for(int i0=0; i0<10; i0++){
            double ld2 = 64.2821609228568;
            boolean lb3 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
              fo0 = fo1.m4(ad4, fd0, fd1, ld2, lb1, lb0, ab1, ab2);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
            boolean lb4 = false;
            Thought lo5 = Thought24.getInstance(fo1, fo0, fo1, fo0);
            ad1 = ad2 - ad3;
            Thought lo6 = Thought178.getInstance(ad4, fd0, fd1, ld2);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
            for(int i1=0; i1<10; i1++){
                fd0 *= -1;
                fd1 *= -1;
}}}
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
    fd1 = fd0 - fd1;
    Output.points[7][8] -= fd0;
    double ld0 = 270.9986374309407;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[8][0] += ld0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 + fd1;
        Thought lo1 = Thought60.getInstance(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(ao4 != null){
          fd0 = ao4.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
        ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    if (fb0) {
        fb1 = fb0 && fb1;
        for(int i0=0; i0<10; i0++){
            double ld0 = 130.1206562352303;
            ad1 = ad2 - ad3;
            Output.points[8][1] -= ad4;
if(fo1 != null){
              fo1.m1(fd0, fd1, ld0, ad1);
}
            ad2 *= -1;
            boolean lb1 = false;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
              lb1 = ao1.m2();
}
            double ld2 = 567.6738924859222;
if(ao3 != null){
              ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
            Thought lo3 = Thought233.getInstance(ao4, fo0, fo1, ao1, ld0, ld2, ad1, ad2, fb1, lb1, fb0, fb1);
            boolean lb4 = false;
            lb1 = ad3 < ad4;
            lb4 = fd0 < fd1;
if(ao3 != null){
              ao2 = ao3.m4(ld0, ld2, ad1, ad2, fb0, fb1, lb1, lb4);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb4);
}
            fb0 = fb1 || lb1;
            lb4 = !fb0;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
            for(int i1=0; i1<10; i1++){
                ad3 = ad4 + fd0;
                boolean lb5 = false;
                fb0 = fb1 && lb5;
                lb1 = fd1 < ld0;
}}}
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
    Thought lo0 = Thought21.getInstance(fd0, fd1, fd0, fd1);
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      fd1 = ao2.m3(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought137.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    fd0 = fd1 - fd0;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    lb2 = fd0 > fd1;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought38.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao1 != null){
      lb3 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    Output.points[8][2] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    ab1 = fd0 < fd1;

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
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Output.points[8][3] += ad3;
    Thought lo0 = Thought399.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Thought lo1 = Thought191.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
    Thought lo2 = Thought259.getInstance();
    ad4 *= -1;
    double ld3 = 975.8925483747205;
    ad4 *= -1;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld3, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ad2 < ad3;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld3, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought164.getInstance(ao4, fo0, fo1, ao1);

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
    Thought lo0 = Thought206.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought322.getInstance();
    double ld2 = 528.8020129588804;
    double ld3 = 15.201066440116165;
    Thought lo4 = Thought66.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = ld3 < fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ld3, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld2 + ld3;
    fd0 *= -1;

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
    Thought lo0 = Thought144.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    Output.points[8][4] += fd1;
    boolean lb1 = true;
    Thought lo2 = Thought203.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[8][5] += fd0;
    ab3 = !ab4;
    Thought lo4 = Thought111.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb5 = true;
    fd1 *= -1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    boolean lb6 = true;
    Thought lo7 = Thought92.getInstance(ab4, fb0, fb1, lb1);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, lb5, lb6, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo8 = Thought345.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, lb3, lb5);
    Thought lo9 = Thought313.getInstance(fo0, fo1, fo0, fo1);

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
    ad2 = ad3 + ad4;
    Output.points[8][6] -= fd0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m3();
}
    boolean lb1 = false;
    boolean lb2 = false;
    Output.points[8][7] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;
    ad3 *= -1;
    ad4 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, lb2, lb3, fb0);
}
    fb1 = lb0 || lb1;
    ad3 *= -1;
    boolean lb4 = true;
    ad4 = fd0 + fd1;
    lb2 = ad1 < ad2;
    Thought lo5 = Thought283.getInstance(ad3, ad4, fd0, fd1, lb3, lb4, fb0, fb1);
    lb0 = ad1 < ad2;
    Output.points[8][8] += ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, lb3, lb4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = ad4 < fd0;
    Thought lo6 = Thought47.getInstance(fd1, ad1, ad2, ad3);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
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
    boolean lb0 = true;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m3();
}
    Output.points[0][0] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ad4 *= -1;
    double ld1 = 631.5362655630307;
    double ld2 = 637.1360429141522;
    ad3 = ad4 + fd0;
    lb0 = fd1 < ld1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
    Thought lo3 = Thought335.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought55.getInstance(ld1, ld2, ad1, ad2);
    double ld5 = 604.2543183089826;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought315.getInstance();
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    Output.points[0][1] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld3 = 630.5122089232904;
    boolean lb4 = true;
if(ao1 != null){
      lb4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
}
    fd1 = ld3 - fd0;
    fb0 = fd1 < ld3;
    fb1 = lb1 && lb2;
    lb4 = !fb0;
    fb1 = lb1 || lb2;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3();
}
    lb4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb1, lb2, lb4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld3, fd0, fd1, fb0, fb1, lb1, lb2);
}
    ld3 = fd0 - fd1;

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        boolean lb0 = false;
        boolean lb1 = true;
        Thought lo2 = Thought258.getInstance(fd1, ad1, ad2, ad3);
        lb1 = fb0 || fb1;
        boolean lb3 = true;
        } else {
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
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Output.points[0][2] += fd1;
    double ld0 = 24.444224852721057;
    ab3 = ab4 || fb0;
    if (fb1) {
        Output.points[0][3] += ld0;
        ab1 = !ab2;
if(ao2 != null){
          ao2.m1();
}
if(ao3 != null){
          ao3.m2(ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
        Thought lo2 = Thought31.getInstance(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
        ld0 = fd0 - fd1;
        ab1 = ab2 || ab3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
        boolean lb3 = true;
        ld0 *= -1;
        lb3 = ab1 || ab2;
        ab3 = fd0 < fd1;
        Thought lo4 = Thought276.getInstance(ao3, ao4, fo0, fo1);
        ld0 = fd0 - fd1;
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
    ab2 = ab3 || ab4;
    Thought lo0 = Thought98.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = true;
    fd0 *= -1;
    ab4 = fb0 || fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(ao1 != null){
      ad4 = ao1.m3();
}
if(ao2 != null){
      lb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    double ld2 = 416.4615925873148;
    ad4 = fd0 - fd1;

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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought143.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    Thought lo1 = Thought286.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 354.9241242507991;
    fb0 = !fb1;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought223.getInstance(fb0, fb1, fb0, fb1);
    ld0 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
        fb1 = !fb0;
    Thought lo0 = Thought290.getInstance(fd1, fd0, fd1, fd0);
    fb1 = !fb0;
    double ld1 = 758.1193700768247;
    boolean lb2 = false;
    fb0 = fb1 && lb2;
        fb0 = fd0 > fd1;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
    fd0 *= -1;
    double ld3 = 379.743229658295;
    fb1 = !lb2;
    Thought lo4 = Thought56.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
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
}
