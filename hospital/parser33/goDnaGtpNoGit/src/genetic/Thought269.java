package genetic;
import java.util.ArrayList;
class Thought269 extends Thought{
private static ArrayList<Thought269> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 410.1853992411769;
private double fd1 = 310.8811013551885;
private Thought fo0 = null;
private Thought fo1 = null;
Thought269 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought269 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought269 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought269 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought269 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought269 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought269 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought269 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought269 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought269 instance = new Thought269 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought269 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought269 instance = new Thought269 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought269 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought269 instance = new Thought269 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought269 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought269 instance = new Thought269 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought269 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought269 instance = new Thought269 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought269 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought269 instance = new Thought269 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought269 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought269 instance = new Thought269 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought269 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought269 instance = new Thought269 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 697.28213081464;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought347.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = ld0 > fd0;
    Thought lo2 = Thought58.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[8][7] += fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought86.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
    fb1 = fb0 && fb1;
    fd0 = fd1 - ld0;
    boolean lb4 = false;
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    double ld5 = 549.8822425710497;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld0;
    fb0 = fb1 && lb4;
    ld5 *= -1;
    Thought lo6 = Thought297.getInstance(fb0, fb1, lb4, fb0);
    fb1 = lb4 && fb0;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb0 = true;
    double ld1 = 263.9160621323463;
    ab1 = !ab2;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb2;
    ld1 = fd0 + fd1;
    ab1 = !ab2;
    Thought lo3 = Thought299.getInstance(fo0, fo1, fo0, fo1);
    ab3 = !ab4;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1);
}
    boolean lb4 = false;

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
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    double ld2 = 459.0828028584511;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
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
        ab2 = !ab3;
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ab2 = ab3 || ab4;
    ad3 *= -1;
    Output.points[8][8] -= ad4;
    fb0 = fd0 < fd1;
    ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(fo1 != null){
          fd1 = fo1.m3();
}
        fb0 = !fb1;
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo0 = fo1.m4(lb2, lb0, lb1, ab1);
}
        ab2 = ab3 || ab4;
        fb0 = ad4 > fd0;
        fb1 = fd1 > ad1;
        ad2 = ad3 + ad4;
        fd0 *= -1;
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
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought382.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    double ld1 = 290.9015807048148;
    fd0 *= -1;
    fb0 = fd1 > ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    fb0 = ad2 < ad3;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fd1 > ad1;
    fb1 = ad2 > ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought283.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][0] -= fd1;
    ab2 = !ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Output.points[0][1] -= fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought305.getInstance();
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    if (ab4) {
        fb0 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        Output.points[0][2] -= fd1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought231.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld1 = 885.6495002230681;
    Thought lo2 = Thought175.getInstance(ab1, ab2, ab3, ab4);
    boolean lb3 = false;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb3, ab1);
}
    boolean lb4 = false;
    ld1 *= -1;
    Output.points[0][3] += ad1;
    ab1 = !ab2;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, lb4, ab1, ab2);
}
    double ld5 = 667.0337491659687;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
    ab3 = ld1 < ld5;
    ad1 = ad2 - ad3;
    ab4 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ld5, ad1);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = lb3 && lb4;
if(ao3 != null){
      ao3.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb3, lb4, ab1, ab2);
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
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < fd0;
    fb1 = lb0 && fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
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
    ab2 = fd1 < fd0;
        boolean lb0 = true;
    ab2 = ab3 && ab4;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        Thought lo2 = Thought154.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        ab4 = !fb0;
        double ld3 = 244.86440236988608;
        ld3 = fd0 + fd1;
}
Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad2 < ad3;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
        ad1 *= -1;
        ad2 = ad3 - ad4;
        lb0 = fd0 < fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
        fb0 = ad2 < ad3;
        Output.points[0][4] -= ad4;
        fb1 = fd0 < fd1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        lb0 = fb0 || fb1;
        Thought lo1 = Thought53.getInstance(ad2, ad3, ad4, fd0);
        fd1 *= -1;
        lb0 = ad1 > ad2;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        ad1 *= -1;
if(fo0 != null){
          fb0 = fo0.m2();
}
        fb1 = ad2 < ad3;
        ad4 *= -1;
        fd0 = fd1 + ad1;
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
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 461.46091104126754;
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 - ld0;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
        double ld3 = 302.1122285770083;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    boolean lb4 = false;
    Output.points[0][5] -= ld3;
    Thought lo5 = Thought105.getInstance(fo1, fo0, fo1, fo0);
    ab3 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad4 = fo0.m3(ab4, fb0, fb1, lb1);
}
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, lb2, lb4, lb6, ab1);
}
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
        boolean lb1 = true;
        Thought lo2 = Thought88.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        lb0 = fd1 < fd0;
        fb0 = fd1 > fd0;
        fb1 = fd1 > fd0;
        fd1 *= -1;
        fd0 = fd1 - fd0;
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
    ad2 = ad3 - ad4;
    Output.points[0][6] -= fd0;
    fb1 = fd1 > ad1;
if(ao2 != null){
      ad2 = ao2.m3();
}
    Output.points[0][7] += ad3;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        ad1 *= -1;
        ad2 = ad3 - ad4;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            double ld0 = 308.7093812631837;
            double ld1 = 646.3585382084801;
            boolean lb2 = false;
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            ad1 *= -1;
            Thought lo3 = Thought322.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
              fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1);
}
if(ao4 != null){
              ad2 = ao4.m3();
}
            ad3 = ad4 + fd0;
            fb1 = lb2 && fb0;
            Thought lo4 = Thought201.getInstance(fb1, lb2, fb0, fb1);
}}
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
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    ab1 = ab2 && ab3;
    Output.points[0][8] += fd1;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        if (lb0) {
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, lb1, lb2, ab1, ab2);
}
            if (ab3) {
                Thought lo3 = Thought267.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
                  fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
                Thought lo4 = Thought270.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
                  fo1.m3();
}
                ab4 = !fb0;
}}}
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
    Thought lo0 = Thought20.getInstance(ab1, ab2, ab3, ab4);
    double ld1 = 557.0245352004849;
    boolean lb2 = true;
    boolean lb3 = true;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(ld1, ad1, ad2, ad3, lb2, lb3, ab1, ab2);
}
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    if (lb2) {
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        double ld4 = 966.5056025477083;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld4, ld1);
}
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        if (lb3) {
if(ao1 != null){
              ld4 = ao1.m3();
}
            ld1 *= -1;
if(ao3 != null){
              ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
              fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb2, lb3, ab1);
}
            Output.points[1][0] += fd0;
            fd1 *= -1;
if(ao3 != null){
              ao3.m2(ld4, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
            double ld5 = 799.4308137189701;
            fb1 = lb2 && lb3;
            boolean lb6 = true;
            lb3 = ab1 && ab2;
if(ao4 != null){
              ad2 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought5.getInstance();
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought189.getInstance(fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[1][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
    double ld3 = 378.56868059925955;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld3, fd0, fb1, lb2, fb0, fb1);
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
    Thought lo0 = Thought74.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought207.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && ab1;
    fd0 = fd1 - fd0;
    double ld2 = 857.2305648879536;
    Thought lo3 = Thought185.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab2 = ld2 > fd0;
    boolean lb4 = false;
    ab2 = fd1 > ld2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb4, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb4 = fo1.m2(fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[1][2] += ld2;
    Output.points[1][3] += fd0;
    fb0 = fd1 < ld2;
    fd0 = fd1 - ld2;
    boolean lb5 = false;
    fd0 = fd1 - ld2;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb4, lb5, ab1);
}
    fd0 = fd1 - ld2;
    boolean lb6 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        boolean lb0 = false;
        Thought lo1 = Thought15.getInstance();
        fb0 = !fb1;
if(fo0 != null){
          lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        }
    ad4 *= -1;
    fb1 = !fb0;
    Output.points[1][4] += fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld2 = 489.3124971548597;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[1][5] += ld2;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(lb3, fb0, fb1, lb3);
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
        ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        ab3 = !ab4;
        Output.points[1][6] -= fd0;
        double ld0 = 798.4650935162042;
        fb0 = fd0 < fd1;
        fb1 = ld0 > ad1;
        ab1 = ab2 && ab3;
        boolean lb1 = true;
        ab3 = ab4 || fb0;
        ad2 = ad3 - ad4;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ld0, ad1, lb1, ab1, ab2, ab3);
}
        ad2 = ad3 - ad4;
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought208.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought12.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought162.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    Output.points[1][7] -= fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[1][8] -= fd0;
    Output.points[2][0] -= fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    double ld3 = 487.0140980011179;
    fd0 = fd1 - ld3;
    fb0 = fd0 < fd1;
    fb1 = ld3 < fd0;
    fd1 = ld3 + fd0;

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
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3();
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    ad4 = fd0 - fd1;
    lb0 = fb0 || fb1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 > ad3;
    Thought lo1 = Thought336.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld2 = 405.29691842883926;
        ad1 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    boolean lb1 = true;
    double ld2 = 757.2790693381362;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought25.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    double ld1 = 474.7720548846914;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ad1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
    ab1 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad4 = ao3.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought189.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        ld1 = ad1 + ad2;
        Output.points[2][1] += ad3;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
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
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
        if (lb1) {
        fd1 = fd0 + fd1;
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
    Output.points[2][2] += fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought319.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      ab4 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought243.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    double ld4 = 899.7498473234975;
    lb1 = ld4 > fd0;

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
    fb1 = !fb0;
    fb1 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
            boolean lb0 = false;
            for(int i2=0; i2<10; i2++){
                Thought lo1 = Thought72.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
if(fo0 != null){
                  ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
                if (fb0) {
                    ad2 *= -1;
                    boolean lb2 = true;
if(fo1 != null){
                      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
                    Output.points[2][3] += ad1;
if(fo0 != null){
                      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
                    Thought lo3 = Thought53.getInstance();
if(fo1 != null){
                      fo1.m1(fb1, lb2, lb0, fb0);
}
if(fo0 != null){
                      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb2, lb0, fb0);
}
                    boolean lb4 = true;
if(fo1 != null){
                      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb4);
}
if(fo1 != null){
                      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb2);
}
                    double ld5 = 39.727284915062704;
                    Thought lo6 = Thought11.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
                      fo0.m3(ad4, fd0, fd1, ld5);
}
                    Output.points[2][4] -= ad1;
                    ad2 *= -1;
                    boolean lb7 = false;
if(fo1 != null){
                      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
}}}}
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
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2();
}
    ab1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought399.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 741.6758663259399;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, ad1, ad2);
}
    fb1 = ad3 > ad4;

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
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    Output.points[2][5] -= fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3();
}
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought215.getInstance(fb0, fb1, lb0, lb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
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
    double ld0 = 214.9575916219238;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > ad1;
    ad2 = ad3 - ad4;
        boolean lb1 = true;
    Thought lo2 = Thought332.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
    fb1 = lb1 || fb0;

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
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = ab1 && ab2;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld0 = 88.11299584971572;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, fd0);
}
    ab1 = fd1 < ld0;
    Thought lo1 = Thought399.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought50.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ld0;
    ab2 = ab3 || ab4;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    Thought lo3 = Thought69.getInstance(fd1, ld0, fd0, fd1);
    boolean lb4 = true;
    ab3 = ld0 > fd0;
    Thought lo5 = Thought22.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);

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
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        double ld1 = 566.2458766830416;
        double ld2 = 764.8465866314455;
        boolean lb3 = true;
if(ao1 != null){
          ld1 = ao1.m3();
}
if(ao2 != null){
          fb0 = ao2.m2(fb1, lb3, lb0, ab1);
}
        boolean lb4 = true;
        ab1 = ld2 < ad1;
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        }
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought58.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
    fd1 = ad1 - ad2;
    Output.points[2][6] -= ad3;
    double ld6 = 259.7028820160592;
    double ld7 = 376.11239468825227;
    Thought lo8 = Thought386.getInstance(ao1, ao2, ao3, ao4);

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
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought375.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought178.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 161.8120684753996;
    fd0 = fd1 + ld2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
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
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = fd1 > fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    lb1 = fd0 < fd1;
    double ld3 = 994.8116049703532;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = fb0 && fb1;
    ld3 *= -1;
    lb0 = lb1 && lb2;
    fd0 = fd1 - ld3;
    fd0 = fd1 - ld3;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    Thought lo0 = Thought196.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
