package genetic;
import java.util.ArrayList;
class Thought149 extends Thought{
private static ArrayList<Thought149> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 272.8802236125741;
private double fd1 = 914.6327548638512;
private Thought fo0 = null;
private Thought fo1 = null;
Thought149 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought149 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought149 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought149 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought149 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought149 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought149 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought149 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought149 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought149 instance = new Thought149 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought149 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought149 instance = new Thought149 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought149 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought149 instance = new Thought149 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought149 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought149 instance = new Thought149 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought149 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought149 instance = new Thought149 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought149 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought149 instance = new Thought149 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought149 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought149 instance = new Thought149 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought149 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought149 instance = new Thought149 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought3.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    double ld1 = 728.1242919779887;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought190.getInstance(fo0, fo1, fo0, fo1);
    ld1 = fd0 + fd1;
    boolean lb3 = true;
    ld1 *= -1;
    double ld4 = 372.33555467364016;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 864.7867599482228;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 && fb1;
    Thought lo2 = Thought121.getInstance(lb0, ab1, ab2, ab3);
    Thought lo3 = Thought148.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
if(fo0 != null){
      ab1 = fo0.m2(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo4 = Thought291.getInstance(fo1, fo0, fo1, fo0);
    ld1 = fd0 - fd1;
    fb1 = !lb0;

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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld0 = 746.7374263173878;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought154.getInstance();
    fb1 = fb0 || fb1;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    Thought lo2 = Thought212.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fb1 = ld0 < ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought89.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd1 > ad1;
    Output.points[5][2] -= ad2;
    Thought lo1 = Thought334.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    Thought lo2 = Thought392.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo3 = Thought156.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2();
}
    ab4 = ad2 > ad3;
    double ld4 = 153.99373729247182;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ad3 < ad4;
    boolean lb5 = false;
    ab3 = !ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ad1, fb0, fb1, lb5, ab1);
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
        Thought lo0 = Thought262.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
        Thought lo1 = Thought335.getInstance(ao2, ao3, ao4, fo0);
    fd1 *= -1;
    fb0 = fb1 || fb0;
    Thought lo2 = Thought390.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    fd1 *= -1;
    fd0 *= -1;
    fb1 = !fb0;
    double ld3 = 796.6181878411256;
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb4 = false;
    fb0 = fd1 < ld3;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ld3, fd0, fd1, lb4, fb0, fb1, lb4);
}
if(ao1 != null){
      fo1 = ao1.m4(ld3, fd0, fd1, ld3, fb0, fb1, lb4, fb0);
}
    Thought lo5 = Thought155.getInstance(ao2, ao3, ao4, fo0, fb1, lb4, fb0, fb1);
    fd0 = fd1 - ld3;
    Thought lo6 = Thought206.getInstance(fo1, ao1, ao2, ao3);
    Thought lo7 = Thought332.getInstance(fd0, fd1, ld3, fd0);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld3);
}
    lb4 = fd0 > fd1;

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
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m1();
}
    Thought lo0 = Thought89.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    double ld1 = 57.43817792962349;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, fb0);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
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
    boolean lb0 = true;
    lb0 = !ab1;
    ab2 = fd1 > fd0;
    double ld1 = 700.1480150742927;
    ab3 = !ab4;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
if(ao2 != null){
      lb0 = ao2.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(lb2, ab1, ab2, ab3);
}
    ld1 *= -1;
    fd0 = fd1 - ld1;
    ab4 = !fb0;
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, lb0, lb2, ab1, ab2);
}
    double ld3 = 201.92237320326518;
    boolean lb4 = false;
    fd0 *= -1;
    fd1 = ld1 - ld3;
    ab2 = ab3 && ab4;

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
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab4 = fb0 && fb1;
if(ao2 != null){
          fd1 = ao2.m3(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
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
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    double ld0 = 768.9133535716929;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought393.getInstance();
    boolean lb2 = true;
    Thought lo3 = Thought170.getInstance(fb0, fb1, lb2, fb0);
    fb1 = lb2 && fb0;
    boolean lb4 = true;
    double ld5 = 436.86870300671234;
    fb0 = fb1 || lb2;
    lb4 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld5, fd0, lb2, lb4, fb0, fb1);
}
    Output.points[5][3] -= fd1;
    lb2 = ld0 > ld5;
    lb4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld5, fb1, lb2, lb4, fb0);
}
    fb1 = lb2 || lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb4);
}
    Thought lo6 = Thought169.getInstance(fo1, fo0, fo1, fo0);

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
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        Thought lo0 = Thought316.getInstance(fd0, fd1, fd0, fd1);
        Output.points[5][4] += fd0;
        double ld1 = 590.7470459955985;
        boolean lb2 = false;
        boolean lb3 = false;
        boolean lb4 = false;
        fd0 *= -1;
        double ld5 = 962.606511870323;
        ab3 = ab4 || fb0;
        fb1 = fd0 > fd1;
        boolean lb6 = true;
        ld1 *= -1;
        double ld7 = 730.728271719405;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, ld7, fd0, fd1);
}
        lb2 = lb3 && lb4;
        double ld8 = 892.6314868380124;
        boolean lb9 = true;
        ld1 *= -1;
}
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
    Thought lo0 = Thought276.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought261.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
        Thought lo2 = Thought380.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo1.m1();
}
    Output.points[5][5] -= ad2;
    Thought lo3 = Thought144.getInstance(fb1, fb0, fb1, fb0);
    double ld4 = 83.93660184946803;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb5 = true;
    Thought lo6 = Thought190.getInstance(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb5);
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo7 = Thought129.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ad1);
}
    double ld8 = 509.2401828262252;

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
      ad1 = fo1.m3();
}
    Thought lo0 = Thought56.getInstance(ab1, ab2, ab3, ab4);
    Thought lo1 = Thought89.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    Output.points[5][6] += fd1;
    Thought lo3 = Thought185.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    Output.points[5][7] -= ad1;
    boolean lb4 = true;
    boolean lb5 = false;
    double ld6 = 793.9254274197526;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 + fd0;
    fd1 = ld6 - ad1;
    lb2 = !lb4;
    boolean lb7 = true;
    Output.points[5][8] -= ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m3(fd1, ld6, ad1, ad2);
}
    if (lb5) {
if(fo1 != null){
          lb7 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld6 = ad1 + ad2;
        ab1 = !ab2;
}
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
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought150.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[6][0] += fd0;
    fb1 = fd1 < fd0;
    Thought lo2 = Thought38.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    lb0 = fd0 < fd1;
    Thought lo3 = Thought79.getInstance(fb0, fb1, lb0, fb0);
    double ld4 = 795.2979219163245;
    fb1 = lb0 && fb0;
    Thought lo5 = Thought229.getInstance(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld4, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb1 = lb0 || fb0;
    boolean lb6 = false;
    fb0 = ld4 < fd0;
    fd1 = ld4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld4, fd0, fd1, ld4);
}
    Thought lo7 = Thought394.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld4, fd0);
    fb1 = !lb0;

Thought.STACK_COUNTER++;
return lb6;
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    fb1 = fb0 || fb1;
    fb0 = ad3 < ad4;
if(ao4 != null){
      fd0 = ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    double ld0 = 58.098785759903876;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
        boolean lb1 = true;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought114.getInstance(ld0, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3);
}
    double ld3 = 505.49814324121456;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ld3, ad1, fb0, fb1, lb1, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought217.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought88.getInstance(ao2, ao3, ao4, fo0);
    ab3 = fd1 < fd0;
    ab4 = !fb0;
    Output.points[6][1] += fd1;
        fb1 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab1 = ab2 || ab3;
    Output.points[6][2] -= fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    Output.points[6][3] -= ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    Output.points[6][4] -= fd1;
if(ao4 != null){
      ab1 = ao4.m2();
}
    ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    double ld1 = 921.4986787982922;
    Thought lo2 = Thought200.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fd1 > ld1;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    boolean lb4 = true;
    boolean lb5 = false;
    lb3 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo6 = Thought300.getInstance(lb4, lb5, ab1, ab2);
    for(int i0=0; i0<10; i0++){
        fd1 = ld1 + ad1;
        ab3 = ad2 > ad3;
}
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
    Thought lo0 = Thought330.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Output.points[6][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought204.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    double ld3 = 596.2212763700842;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo0 = Thought256.getInstance();
    fd1 = fd0 + fd1;
    Thought lo1 = Thought252.getInstance(ab4, fb0, fb1, ab1);
    Output.points[6][6] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    fd1 *= -1;
    Thought lo3 = Thought153.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, ab1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld4 = 570.7220798396395;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld4);
}
    Output.points[6][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1);
}
    Thought lo5 = Thought192.getInstance();
    Thought lo6 = Thought303.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, fb1, lb2, ab1, ab2);
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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[6][8] -= fd0;
        fd1 *= -1;
    Output.points[7][0] += ad1;
    if (fb1) {
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought251.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        fb0 = !fb1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        double ld1 = 777.2934500035786;
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = ld1 < ad1;
if(fo0 != null){
          fo0.m2(fb1, fb0, fb1, fb0);
}
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
    ab2 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 < ad4;
    ab2 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    double ld2 = 446.9678762309119;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2();
}
    Output.points[7][1] -= fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = false;
    Thought lo1 = Thought142.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);

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
    double ld0 = 544.1749285228254;
    boolean lb1 = true;
if(ao1 != null){
          fb0 = ao1.m2();
}
    Output.points[7][2] -= ld0;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    Output.points[7][3] -= fd0;
    double ld2 = 531.663507365334;
    fb1 = lb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    lb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    ld2 = ad1 + ad2;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
}
    boolean lb3 = false;
    Output.points[7][4] -= ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld0, ld2, ad1);
}
    ad2 *= -1;
    lb1 = !lb3;
    ad3 = ad4 - fd0;
    fb0 = fb1 && lb1;
    Thought lo4 = Thought136.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, ld2, ad1);
    boolean lb5 = true;

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
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Output.points[7][5] += fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought18.getInstance();
if(ao3 != null){
      ao3.m3(fb0, fb1, lb0, lb1);
}
    ab1 = !ab2;
    fd1 = fd0 - fd1;
    fd0 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[7][6] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    Output.points[7][7] += ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo2 = Thought284.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 - fd0;
    Thought lo3 = Thought377.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);

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
    double ld0 = 629.1221465975248;
    double ld1 = 933.9722523770872;
    ld0 = ld1 - fd0;
    double ld2 = 63.44884770706882;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    double ld3 = 471.214540370483;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, ld3, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, ld2, fb0, fb1, fb0, fb1);
}
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);
}
    fb1 = ld3 > fd0;
    boolean lb5 = false;
    Output.points[7][8] += fd1;
    ld0 = ld1 - ld2;
    boolean lb6 = true;
    ld3 *= -1;
    Output.points[8][0] += fd0;
    if (lb4) {
        fd1 = ld0 + ld1;
        lb5 = ld2 < ld3;
        fd0 *= -1;
        fd1 = ld0 + ld1;
        Output.points[8][1] += ld2;
        double ld7 = 510.0744587956283;
if(fo0 != null){
          ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
        lb6 = fb0 && fb1;
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
        fd0 *= -1;
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    Thought lo2 = Thought296.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    lb1 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
    double ld3 = 725.1982617279999;
    Thought lo4 = Thought158.getInstance(ab4, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb1, ab1, ab2, ab3);
}
    double ld5 = 739.8295834943366;
    ab4 = !fb0;
    fd0 = fd1 - ld3;

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        boolean lb0 = true;
        double ld1 = 340.93371078468977;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
        double ld3 = 381.8951859252286;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad3 *= -1;
if(fo1 != null){
          fo1.m2(ad4, fd0, fd1, ld1);
}
        ld3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo0.m3();
}
        fb1 = ld1 < ld3;
        lb0 = lb2 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(lb0, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb2, fb0, fb1);
}
        lb0 = lb2 && fb0;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, ld3, ad1, fb1, lb0, lb2, fb0);
}
        double ld4 = 144.84595525063745;
        fb1 = lb0 && lb2;
        }
    boolean lb5 = true;
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb5, fb0);
}
    fb1 = ad4 < fd0;

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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ab2 = ad2 < ad3;
    ad4 = fd0 - fd1;
    Output.points[8][2] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    ab3 = ab4 && fb0;
    Output.points[8][3] -= ad3;
    fb1 = ab1 || ab2;
    ab3 = ad4 > fd0;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
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
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[8][4] -= fd0;
        Thought lo0 = Thought104.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        Thought lo1 = Thought129.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3);
}
        fb0 = !fb1;
        boolean lb2 = true;
if(ao4 != null){
          ao4.m3(fd1, fd0, fd1, fd0);
}
        lb2 = fd1 < fd0;
        fb0 = fb1 || lb2;
        Thought lo3 = Thought253.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
if(ao3 != null){
          fd1 = ao3.m3();
}
if(ao4 != null){
          ao4.m1(fb0, fb1, lb2, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 620.6720731412461;
    Output.points[8][5] -= fd0;
    if (fb0) {
        fb1 = fd1 < ld0;
        if (fb0) {
            Thought lo1 = Thought47.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            ad1 = ad2 - ad3;
            ad4 = fd0 - fd1;
if(ao3 != null){
              ao2 = ao3.m4(ld0, ad1, ad2, ad3);
}
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
              ao3.m1();
}
if(fo0 != null){
              ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
            ad1 *= -1;
            boolean lb2 = false;
            ad2 = ad3 - ad4;
            fd0 *= -1;
            Output.points[8][6] -= fd1;
            ld0 = ad1 + ad2;
            boolean lb3 = true;
            lb3 = fb0 && fb1;
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb2, lb3, fb0, fb1);
}
            Thought lo4 = Thought131.getInstance(ld0, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
            ad4 = fd0 - fd1;
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
    Output.points[8][7] -= fd0;
    boolean lb0 = true;
    double ld1 = 600.1542792284795;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought18.getInstance(fd0, fd1, ld1, fd0);
        boolean lb3 = false;
    fd1 *= -1;
    boolean lb4 = false;
    ab3 = ld1 > fd0;

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
    ab1 = ab2 || ab3;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ad2 = ao2.m3();
}
    boolean lb1 = true;
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
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
    fb1 = fb0 && fb1;
    Output.points[8][8] -= fd1;
    fb0 = fb1 && fb0;
        fb1 = fb0 || fb1;
    Output.points[0][0] -= fd0;
    boolean lb0 = true;
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
    Output.points[0][1] -= fd1;
    double ld1 = 61.061620263793415;
    boolean lb2 = false;
    lb0 = ld1 < fd0;
    lb2 = fd1 > ld1;

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
    fb0 = fd1 < fd0;
if(fo1 != null){
          fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    fb0 = fd1 < fd0;
    fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought327.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    double ld2 = 908.0734840806603;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ld2 = fd0 + fd1;
    ld2 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 193.20152068344828;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    lb1 = fd1 < ld0;
    fb0 = fd0 < fd1;
    fb1 = !lb1;
    fb0 = ld0 < fd0;
    fb1 = !lb1;
    fd1 = ld0 + fd0;
    fb0 = fb1 || lb1;
    fb0 = !fb1;
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
}
