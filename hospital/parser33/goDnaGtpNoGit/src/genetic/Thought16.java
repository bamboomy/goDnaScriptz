package genetic;
import java.util.ArrayList;
class Thought16 extends Thought{
private static ArrayList<Thought16> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 365.4722094603435;
private double fd1 = 356.834902027607;
private Thought fo0 = null;
private Thought fo1 = null;
Thought16 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought16 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought16 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    double ld0 = 462.55169336882244;
    double ld1 = 191.8066276941222;
    fb0 = ld1 < fd0;
        Thought lo2 = Thought203.getInstance(fd1, ld0, ld1, fd0);
        double ld3 = 765.2305884692905;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ld3);
}
        fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2();
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
    Output.points[2][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    Output.points[2][7] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
    double ld0 = 704.7341143986372;
    Output.points[2][8] += ad1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
        Thought lo1 = Thought316.getInstance(fo1, fo0, fo1, fo0);
        boolean lb2 = false;
        ld0 *= -1;
        fb0 = !fb1;
        Thought lo3 = Thought218.getInstance(ad1, ad2, ad3, ad4);
        fd0 *= -1;
        boolean lb4 = false;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        lb2 = lb4 || fb0;
        fb1 = lb2 && lb4;
        boolean lb5 = false;
        boolean lb6 = true;
        double ld7 = 410.0435599605036;
        lb5 = ld7 < ld0;
if(fo0 != null){
          ad1 = fo0.m3();
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
    ab2 = ad2 > ad3;
    boolean lb0 = false;
    ab2 = ad4 > fd0;
    Output.points[3][0] += fd1;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    ad1 *= -1;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    Output.points[3][1] -= ad4;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    fb1 = ad1 > ad2;
    ad3 *= -1;
    lb0 = ab1 || ab2;
    ad4 *= -1;
    ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    lb0 = !ab1;

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
    lb0 = fd0 < fd1;
    Output.points[3][2] -= fd0;
        fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 731.2761192916848;
    boolean lb2 = false;
    lb2 = !fb0;
    boolean lb3 = true;
    Thought lo4 = Thought63.getInstance();
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    Output.points[3][3] += fd0;
    fb0 = fd1 < ld1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb2, lb3);
}
    fd0 = fd1 + ld1;
    Thought lo5 = Thought294.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
    lb3 = fb0 || fb1;
    lb0 = fd1 < ld1;
if(ao1 != null){
      ao1.m3(fd0, fd1, ld1, fd0, lb2, lb3, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb2, lb3, fb0);
}
    double ld6 = 84.69102143172745;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fb1 = fd1 > ld1;
if(ao2 != null){
      ao1 = ao2.m4(ld6, fd0, fd1, ld1);
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought331.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought148.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
    fb0 = ad3 > ad4;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = true;
    fd1 *= -1;
    fb0 = fb1 || lb2;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4);
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
    fd0 = fd1 - fd0;
        Output.points[3][4] -= fd1;
    for(int i0=0; i0<10; i0++){
        ab1 = fd0 < fd1;
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        ab3 = fd0 < fd1;
        ab4 = !fb0;
        fb1 = fd0 < fd1;
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              fo1 = ao1.m4();
}
if(ao3 != null){
              ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 384.7251695736774;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    boolean lb1 = false;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb2 = true;
    fd1 = ld0 + ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought88.getInstance(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
    Output.points[3][5] += ad4;
    fd0 = fd1 - ld0;
    Thought lo4 = Thought286.getInstance();
    ab2 = ab3 && ab4;
    Thought lo5 = Thought126.getInstance(fb0, fb1, lb1, lb2);
    ad1 = ad2 + ad3;
    Thought lo6 = Thought165.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    ad1 *= -1;
    boolean lb7 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 + ad1;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, lb7, ab1, ab2, ab3);
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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 49.45713362840215;
    fb0 = ld0 > fd0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    Thought lo2 = Thought134.getInstance();
    boolean lb3 = false;
    Thought lo4 = Thought34.getInstance(lb3, fb0, fb1, lb1);
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb1, lb3, fb0);
}
    Output.points[3][6] += ld0;
    fb1 = lb1 && lb3;
    boolean lb5 = false;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Output.points[3][7] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    Thought lo1 = Thought69.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought164.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    fd0 *= -1;
    lb0 = lb3 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb3;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought56.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought159.getInstance();
    ad3 = ad4 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought12.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb2 = true;
    boolean lb3 = true;
    ab1 = ad4 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    if (ab2) {
        ab3 = ab4 && fb0;
        double ld4 = 651.8381810262425;
if(fo1 != null){
          ad3 = fo1.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
    Output.points[3][8] += fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        } else {
        boolean lb0 = true;
        Thought lo1 = Thought325.getInstance(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        Output.points[4][0] += fd1;
        boolean lb2 = false;
        double ld3 = 57.64144017091755;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld3);
}
        lb2 = fb0 && fb1;
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
    fb1 = ad2 > ad3;
    boolean lb0 = false;
    lb0 = ad4 > fd0;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    if (fb1) {
        ad4 *= -1;
        if (lb0) {
            fd0 = fd1 + ad1;
            fb0 = !fb1;
            ad2 = ad3 + ad4;
            Thought lo1 = Thought274.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
if(ao4 != null){
              ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
}}
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
        fd0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought287.getInstance(fo1, ao1, ao2, ao3);
    Thought lo1 = Thought161.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    double ld2 = 487.77569411225596;
    boolean lb3 = true;
if(ao4 != null){
      ao4.m1();
}
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, lb3);
}
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought265.getInstance(fd0, fd1, ld2, fd0, lb3, ab1, ab2, ab3);
    fd1 = ld2 - fd0;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld2, fd0, fd1);
}
    lb3 = !lb5;
    boolean lb6 = true;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
    lb6 = ab1 && ab2;
    fd1 = ld2 - fd0;
    double ld7 = 262.5534446382742;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 897.1431604474006;
    ld0 = ad1 + ad2;
    if (ab1) {
        for(int i0=0; i0<10; i0++){
            Thought lo1 = Thought224.getInstance(ab2, ab3, ab4, fb0);
            boolean lb2 = false;
            Output.points[4][1] -= ad3;
            ad4 *= -1;
            fd0 = fd1 - ld0;
            ad1 *= -1;
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
}
            ab2 = ab3 && ab4;
            Thought lo3 = Thought222.getInstance(fd1, ld0, ad1, ad2, fb0, fb1, lb2, ab1);
            ad3 = ad4 - fd0;
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
            fb1 = fd1 > ld0;
            ad1 = ad2 - ad3;
if(ao1 != null){
              ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, ld0, ad1);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
              lb2 = ao2.m2();
}
            double ld4 = 616.5748575346105;
            ab1 = ab2 || ab3;
            Output.points[4][2] -= fd0;
if(ao4 != null){
              ao3 = ao4.m4(ab4, fb0, fb1, lb2);
}
            boolean lb5 = false;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld4, ld0, ad1, lb5, ab1, ab2, ab3);
}
if(fo1 != null){
              fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
}
}}
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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought124.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    Thought lo1 = Thought392.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = false;
    Thought lo3 = Thought169.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb4 = fb0 || fb1;
if(fo0 != null){
          fd1 = fo0.m3(lb2, lb4, fb0, fb1);
}
        lb2 = lb4 || fb0;
        double ld5 = 494.11468687397985;
        Output.points[4][3] -= ld5;
        fd0 = fd1 - ld5;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld5, fd0, fb1, lb2, lb4, fb0);
}
        double ld6 = 663.2148785976353;
        boolean lb7 = false;
        fb0 = fd0 > fd1;
        fb1 = lb7 || lb2;
        lb4 = ld5 < ld6;
        fd0 *= -1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    Thought lo1 = Thought52.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld2 = 864.9195274326989;
    lb0 = fd0 < fd1;
    ld2 = fd0 + fd1;
    ld2 *= -1;
    fd0 = fd1 - ld2;
    Thought lo3 = Thought144.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = false;

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
    fb1 = !fb0;
    ad1 = ad2 + ad3;
        boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    Output.points[4][4] -= ad2;
    fb1 = ad3 < ad4;
    Thought lo1 = Thought44.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = fb0 && fb1;
    Thought lo2 = Thought200.getInstance(lb0, fb0, fb1, lb0);

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    boolean lb0 = true;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    lb0 = lb1 || ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
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
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m2();
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    double ld1 = 739.9800715854568;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought356.getInstance(fb0, fb1, lb0, fb0);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = ld1 > fd0;
    fd1 = ld1 - fd0;
    fd1 = ld1 - fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;

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
    Output.points[4][5] += ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1();
}
    fb0 = fd0 > fd1;
    fb1 = ad1 < ad2;
    ad3 *= -1;
    boolean lb0 = true;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
if(ao1 != null){
      ao1.m3(lb0, fb0, fb1, lb0);
}
    double ld1 = 24.14915006038243;
        ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    double ld2 = 97.17005366202453;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, ld2, fb0, fb1, lb0, lb3);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] += fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    Output.points[4][7] += fd0;
    lb0 = ab1 && ab2;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    Output.points[4][8] -= fd1;
    double ld2 = 667.0820002331728;
    boolean lb3 = false;
    Output.points[5][0] += ld2;
    Output.points[5][1] += fd0;
    Output.points[5][2] -= fd1;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, fb1, lb0, lb1, lb3);
}
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, fd0, fd1, lb4, ab1, ab2, ab3);
}
    Output.points[5][3] -= ld2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
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
    Output.points[5][4] += ad1;
    double ld0 = 142.15123120507684;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 + ad3;
    boolean lb1 = true;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
          ao2.m1();
}
    boolean lb2 = false;
    fd1 = ld0 - ad1;
    ad2 *= -1;
    Thought lo3 = Thought213.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
}
    ld0 *= -1;
    ab3 = ad1 > ad2;
    boolean lb4 = false;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    lb1 = ad1 < ad2;
    lb2 = !lb4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought89.getInstance(ao4, fo0, fo1, ao1);

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
    fb1 = !fb0;
    fd0 *= -1;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought85.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
    Output.points[5][5] += fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
        fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
    double ld1 = 292.5792066070866;
    Thought lo2 = Thought271.getInstance();
    Output.points[5][6] += fd0;

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
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought188.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    boolean lb1 = true;
    boolean lb2 = false;

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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    if (lb0) {
        ad3 *= -1;
        if (ab1) {
            Output.points[5][7] -= ad4;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
            ab2 = ab3 && ab4;
            } else if (fb0) {
            fb1 = lb0 || ab1;
            Thought lo1 = Thought314.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo0 != null){
              fo1 = fo0.m4();
}
            ad1 = ad2 - ad3;
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
    fd1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    fb0 = !fb1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought168.getInstance(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
    double ld2 = 119.08474553871056;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld2;
        fd0 *= -1;
        fb1 = lb0 && fb0;
        Thought lo3 = Thought253.getInstance(fd1, ld2, fd0, fd1);
        double ld4 = 82.98722596740154;
        boolean lb5 = true;
        double ld6 = 165.0610032034126;
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld4, ld6, ld2, fd0);
}
if(ao2 != null){
          fd1 = ao2.m3();
}
        ld4 = ld6 + ld2;
        }
    lb0 = fb0 && fb1;

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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[5][8] += fd1;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought22.getInstance(fo0, fo1, ao1, ao2);
    boolean lb1 = true;
    Thought lo2 = Thought228.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    double ld3 = 370.1765441581133;
if(ao4 != null){
      ao3 = ao4.m4(lb1, fb0, fb1, lb1);
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
    Thought lo0 = Thought391.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Thought lo1 = Thought255.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    double ld2 = 784.5978145068443;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Output.points[6][0] += fd0;
    Thought lo3 = Thought359.getInstance(fd1, ld2, fd0, fd1);
    double ld4 = 840.8011062382592;
    double ld5 = 101.32261994431717;
    ld2 = ld4 + ld5;
    fd0 *= -1;
    double ld6 = 202.98468908688437;
    Thought lo7 = Thought146.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld4);
        for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        Thought lo8 = Thought87.getInstance();
        ab1 = ld5 < ld6;
if(ao4 != null){
          ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
        ab3 = fd0 < fd1;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ld2, ld4, ld5, ld6, ab4, fb0, fb1, ab1);
}
        }
    boolean lb9 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, ld4, ab1, ab2, ab3, ab4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought275.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
if(ao4 != null){
      ad3 = ao4.m3();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[6][1] += fd0;
    fb0 = fd1 > ad1;
    fb1 = !ab1;

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
    fb1 = fd1 < fd0;
    Thought lo0 = Thought38.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought214.getInstance();
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 || lb2;
    double ld3 = 725.2763123905108;
    fb0 = fb1 && lb2;
    ld3 *= -1;
    fd0 = fd1 + ld3;
    fb0 = fd0 < fd1;
    Thought lo4 = Thought156.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb1, lb2, fb0, fb1);
    Output.points[6][2] += fd0;
if(fo1 != null){
      lb2 = fo1.m2(fd1, ld3, fd0, fd1, fb0, fb1, lb2, fb0);
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
    Thought lo0 = Thought200.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought110.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = !lb2;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
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
    Output.points[6][3] -= fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought134.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    lb0 = lb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb1 = lb0 && lb1;
    fb0 = fd1 < fd0;
    boolean lb3 = true;
    fb0 = fb1 || lb0;
    Output.points[6][4] -= fd1;
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    boolean lb4 = false;
    Thought lo5 = Thought128.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, lb4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb3, lb4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
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
}
