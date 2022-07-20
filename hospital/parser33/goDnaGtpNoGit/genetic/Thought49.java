package genetic;
import java.util.ArrayList;
class Thought49 extends Thought{
private static ArrayList<Thought49> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 834.239967367495;
private double fd1 = 274.5415195570467;
private Thought fo0 = null;
private Thought fo1 = null;
Thought49 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought49 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought49 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought49 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought49 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought49 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought49 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought49 instance = new Thought49 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m2();
}
    fd0 = fd1 + fd0;
    if (fb0) {
        fb1 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + fd0;
        fb0 = !fb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
        fb1 = fb0 || fb1;
        Output.points[3][7] -= fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
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
    fd1 *= -1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought129.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    ab1 = !ab2;

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
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    boolean lb0 = true;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m2();
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought185.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;

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
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
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
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3();
}
    fd0 *= -1;
    double ld1 = 713.7819328158414;
    fb0 = fd0 > fd1;
    ld1 *= -1;
    fd0 = fd1 - ld1;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought374.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = ld1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
        fd1 = ld1 - fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = lb0 && fb0;
    fb1 = fd1 > ld1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, fd0, fd1);
}
    Thought lo3 = Thought392.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
    lb0 = fd0 < fd1;
    Output.points[3][8] -= ld1;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    double ld4 = 273.358913905546;

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
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    boolean lb0 = false;
    if (lb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          ad4 = ao1.m3(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
        boolean lb2 = false;
        ad4 = fd0 - fd1;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
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
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;
    ab4 = fb0 || fb1;
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    boolean lb0 = false;
    double ld1 = 382.9827123351654;
    boolean lb2 = false;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    double ld3 = 650.2297470715115;
    fd0 = fd1 + ld1;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 929.7210051810259;
    ad1 = ad2 - ad3;
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = ad4 > fd0;
    fb1 = fd1 > ld0;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fd1 = ld0 + ad1;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, fb0, fb1, lb1, ab1);
}
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 > fd1;
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld2 = 922.5899804376086;
    fb1 = ld2 > fd0;
    lb0 = fd1 < ld2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought346.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    Thought lo4 = Thought180.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, lb1, fb0, fb1, lb0);
    Thought lo5 = Thought135.getInstance(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
    Thought lo6 = Thought374.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    fd0 = fd1 - ld2;
    Thought lo7 = Thought396.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - ld2;
    Thought lo8 = Thought255.getInstance(fd0, fd1, ld2, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
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
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought112.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought285.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought186.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 > fd1;
    boolean lb3 = true;
    fb0 = fd0 > fd1;
    Thought lo4 = Thought85.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb5 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought67.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    boolean lb2 = true;
    boolean lb3 = true;
    double ld4 = 19.373302500619356;
    boolean lb5 = false;
    lb0 = lb2 && lb3;
if(fo0 != null){
      fo0.m3(ld4, ad1, ad2, ad3, lb5, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, lb3, lb5, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && lb2;
if(fo1 != null){
      lb3 = fo1.m2(ad4, fd0, fd1, ld4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo6 = Thought315.getInstance();
    lb5 = fb0 || fb1;
    lb0 = lb2 && lb3;
    fd0 = fd1 + ld4;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
        ad2 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought353.getInstance(lb0, lb1, ab1, ab2);
    Output.points[4][0] -= ad3;
    Thought lo3 = Thought347.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
}
    ab3 = !ab4;
    Thought lo4 = Thought135.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
    boolean lb5 = false;
    boolean lb6 = false;
    Thought lo7 = Thought277.getInstance(fo0, fo1, fo0, fo1);
    boolean lb8 = false;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 65.6902209457954;
        Thought lo1 = Thought151.getInstance();
if(ao1 != null){
          fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
        double ld2 = 294.8096563839879;
        boolean lb3 = false;
        ld2 *= -1;
        fb0 = fb1 && lb3;
        boolean lb4 = true;
        fd0 = fd1 + ld0;
        boolean lb5 = true;
        boolean lb6 = true;
if(ao2 != null){
          lb4 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0, lb5, lb6, fb0, fb1);
}
        Output.points[4][1] += ld2;
        boolean lb7 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
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
    Thought lo0 = Thought153.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought253.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[4][2] -= fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    ab4 = fb0 && fb1;
        boolean lb2 = false;

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
    boolean lb0 = true;
    double ld1 = 618.2220655576203;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ld1 = ad1 + ad2;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, lb2, ab1, ab2);
}
    boolean lb3 = false;
    ld1 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, lb2, lb3, ab1, ab2);
}
    fd1 = ld1 + ad1;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
    lb2 = lb3 || ab1;

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
    fb1 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought145.getInstance();
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld2 = 201.21927281572968;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb3, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, lb3, fb0, fb1);
}
    Output.points[4][3] -= fd1;
    Thought lo4 = Thought297.getInstance(ld2, fd0, fd1, ld2, lb0, lb3, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    ab1 = fd0 > fd1;
        ab2 = !ab3;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    boolean lb1 = true;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 *= -1;

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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    Output.points[4][4] -= ad3;
    double ld1 = 570.1385128246624;
    ad3 = ad4 - fd0;
    fb1 = fd1 < ld1;
    Thought lo2 = Thought362.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, ad1, ad2, ad3);
}
    Thought lo3 = Thought176.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
    if (fb0) {
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
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3();
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Thought lo0 = Thought97.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought224.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ab1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[4][5] -= fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[4][6] += ad4;
    ab3 = !ab4;
    Thought lo2 = Thought117.getInstance();
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ab1 = ad1 > ad2;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
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
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    Output.points[4][7] -= fd0;
    lb0 = fd1 < fd0;
    lb1 = !fb0;
    boolean lb2 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    lb2 = fb0 || fb1;
    boolean lb3 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;

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
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < ad1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb0 = ao3.m2(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought212.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad4 > fd0;
    Output.points[4][8] += fd1;
    fb1 = !lb0;
if(ao4 != null){
      ao4.m3(fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    lb3 = ad1 < ad2;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, lb0, lb2, lb3);
}
    ad3 = ad4 + fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld0 = 949.5310715488614;
    ld0 = fd0 + fd1;
    fb0 = fb1 || ab1;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought345.getInstance(ld0, fd0, fd1, ld0);
    if (ab2) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
        Thought lo2 = Thought97.getInstance();
if(ao2 != null){
          ao2.m1(ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
    ab3 = !ab4;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    double ld0 = 368.9186914938057;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[5][0] += fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    Thought lo1 = Thought144.getInstance(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);

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
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[5][1] -= fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Output.points[5][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    boolean lb1 = true;
    Thought lo2 = Thought19.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    lb1 = ab1 || ab2;
    fd1 = fd0 - fd1;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb3 = true;
        fb0 = fd1 < fd0;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fb1, lb3, lb0, lb1);
}
            ab1 = !ab2;
            boolean lb4 = true;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought383.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        double ld1 = 53.426213453997484;
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
    ab1 = !ab2;
    ad2 *= -1;
    Output.points[5][3] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld2 = 274.046325452301;
if(fo1 != null){
      fo0 = fo1.m4();
}
        Output.points[5][4] += ld2;

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
    double ld0 = 189.24171104830629;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought40.getInstance(fb0, fb1, fb0, fb1);
    Output.points[5][5] += fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    ld0 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought298.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = ld0 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
    lb3 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        lb3 = fd0 < fd1;
        fb0 = ld0 < fd0;
        Thought lo4 = Thought320.getInstance();
if(ao2 != null){
          ao2.m2(fb1, lb3, fb0, fb1);
}
        double ld5 = 418.526543626971;
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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 872.8742616595281;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb1);
}
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 *= -1;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld0, ad1);
}
    boolean lb3 = true;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
        Thought lo4 = Thought239.getInstance();
    ad2 *= -1;
        ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m2(lb2, lb3, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[5][6] += fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(ao2 != null){
          ao1 = ao2.m4();
}
    ab2 = fd0 < fd1;
    ab3 = fd0 < fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld2 = 115.49403509314202;
if(ao3 != null){
      ld2 = ao3.m3(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, lb0, lb1, ab1, ab2);
}
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld2 = fd0 - fd1;
    Thought lo4 = Thought353.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, lb1, lb3);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3();
}
    Thought lo0 = Thought56.getInstance(ab2, ab3, ab4, fb0);
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought241.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    boolean lb2 = true;
    fd1 = ad1 - ad2;
    Thought lo3 = Thought319.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = lb2 || ab1;
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
            Thought lo2 = Thought295.getInstance(lb1, fb0, fb1, lb0);
    fd1 *= -1;
    lb1 = fd0 < fd1;
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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought75.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought399.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Output.points[5][7] += fd1;
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    double ld3 = 345.51655357299825;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3);
}
    double ld4 = 136.52634875117985;
    double ld5 = 100.83947354972949;
    ld4 = ld5 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, ld4, ld5);
}
    fd0 = fd1 - ld3;
    boolean lb6 = true;
    Thought lo7 = Thought167.getInstance();
    fb0 = !fb1;
    Thought lo8 = Thought96.getInstance(lb2, lb6, fb0, fb1);
        boolean lb9 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld4, ld5, fd0, fd1, lb2, lb6, lb9, fb0);
}
    boolean lb10 = false;

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
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
        fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo0 = Thought318.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    Thought lo1 = Thought396.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb2 = true;
    fd0 = fd1 - fd0;

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
