package genetic;
import java.util.ArrayList;
class Thought95 extends Thought{
private static ArrayList<Thought95> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 416.6664325398774;
private double fd1 = 1000.8802617468224;
private Thought fo0 = null;
private Thought fo1 = null;
Thought95 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought95 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought95 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought95 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought95 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought95 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought95 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought95 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought95 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought150.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[1][6] -= fd0;
        fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    if (ab3) {
        ab4 = fd1 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 + fd1;
        fb0 = fb1 && lb0;
        for(int i0=0; i0<10; i0++){
}}
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
      fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ad2 < ad3;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
        double ld1 = 816.2826440166137;

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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought124.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    if (ab2) {
        fd1 = ad1 - ad2;
        ad3 = ad4 - fd0;
        fd1 *= -1;
        boolean lb2 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        ad1 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Output.points[1][7] -= ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        boolean lb3 = false;
        lb2 = ad1 < ad2;
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        lb0 = ad1 > ad2;
        ad3 *= -1;
        Thought lo4 = Thought67.getInstance();
        Thought lo5 = Thought186.getInstance(ab1, ab2, ab3, ab4);
        fb0 = ad4 > fd0;
        fd1 *= -1;
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
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
        double ld0 = 800.34916875053;
    double ld1 = 520.3141003224838;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1);
}
    ld0 = ld1 - fd0;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 86.43193812082217;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    lb1 = !fb0;
            boolean lb2 = false;
    fb0 = fb1 && lb1;
    lb2 = ad4 > fd0;
    boolean lb3 = false;
    Thought lo4 = Thought136.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2, lb3, fb0, fb1, lb1);
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, lb2, lb3, fb0);
}
    Output.points[1][8] -= ad1;
    boolean lb5 = false;
    fb0 = !fb1;
    lb1 = ad2 > ad3;
    boolean lb6 = true;

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
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = fd1 < fd0;
    Output.points[2][0] -= fd1;
    fd0 *= -1;
    Output.points[2][1] -= fd1;
if(ao1 != null){
      ab3 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    ab4 = fb0 || fb1;
    fd0 *= -1;
    Output.points[2][2] += fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought308.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fd1 *= -1;
    fb0 = fb1 && ab1;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
    ab1 = ad3 > ad4;
    ab2 = ab3 && ab4;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
    lb0 = !lb1;
if(ao2 != null){
      lb2 = ao2.m2(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought268.getInstance();

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
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought281.getInstance(lb0, fb0, fb1, lb0);
    Thought lo2 = Thought394.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 = fd1 + fd0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    Output.points[2][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    double ld0 = 735.1679127650428;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    double ld2 = 1000.5594380048158;
    ab4 = ld2 > fd0;
    if (fb0) {
        fd1 = ld0 + ld2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = !lb1;
        if (ab1) {
            Thought lo3 = Thought352.getInstance(fd0, fd1, ld0, ld2);
            Thought lo4 = Thought392.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
            ab2 = !ab3;
            ab4 = fd0 > fd1;
if(fo1 != null){
              fo1.m3();
}
            boolean lb5 = false;
            Output.points[2][4] -= ld0;
if(fo0 != null){
              ab4 = fo0.m2(fb0, fb1, lb5, lb1);
}
            ab1 = ab2 || ab3;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Output.points[2][5] += fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    fb1 = fb0 || fb1;
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;

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
    if (ab1) {
        ab2 = !ab3;
        ab4 = fb0 && fb1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        Output.points[2][6] -= ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fb1 = ao1.m2();
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Output.points[2][7] -= fd1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    Output.points[2][8] += fd0;
if(ao2 != null){
      ao2.m2(lb0, fb0, fb1, lb0);
}
    double ld1 = 333.1851837625405;
    fb0 = fd0 < fd1;
    ld1 = fd0 + fd1;
    fb1 = ld1 > fd0;
    lb0 = fd1 < ld1;
    fd0 = fd1 + ld1;
    boolean lb2 = false;
    lb2 = fd0 < fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb1, lb0, lb2, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[3][0] += ld1;

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
    fb1 = fb0 && fb1;
        fb0 = !fb1;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
        boolean lb1 = true;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
    Output.points[3][1] += fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[3][2] += fd1;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    double ld0 = 484.3273007170413;
    Output.points[3][3] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ld0 *= -1;
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    Thought lo1 = Thought247.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    Output.points[3][4] -= fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    ab4 = fd1 > ld0;
    fd0 = fd1 - ld0;

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
        ad2 = ad3 + ad4;
    double ld0 = 824.0789380363148;
    Thought lo1 = Thought230.getInstance(ao2, ao3, ao4, fo0);
    Thought lo2 = Thought77.getInstance(ad4, fd0, fd1, ld0);
    for(int i0=0; i0<10; i0++){
        Output.points[3][5] -= ad1;
        ab2 = ad2 < ad3;
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1);
}
if(fo0 != null){
          ad2 = fo0.m3();
}
        ab3 = !ab4;
        fb0 = fb1 || ab1;
        ab2 = ab3 || ab4;
if(fo1 != null){
          ad3 = fo1.m3(fb0, fb1, ab1, ab2);
}
        boolean lb3 = false;
        double ld4 = 649.1093719875142;
        ab2 = ad3 > ad4;
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
    Thought lo0 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought202.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    fd0 *= -1;
    double ld3 = 469.0667545892838;
    fd0 = fd1 + ld3;
    lb2 = fb0 || fb1;
    boolean lb4 = true;
    double ld5 = 917.2648308350334;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb4, fb0, fb1);
}
    boolean lb6 = false;
    double ld7 = 521.0453306459934;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld5, ld7, fd0, fd1, lb4, lb6, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 < fd0;
    fd1 *= -1;
    if (ab2) {
        boolean lb1 = false;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        if (ab1) {
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 598.3426720405231;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ad4 *= -1;
    double ld1 = 486.30937295096305;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = ad4 > fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd1 = ld0 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld2 = 526.2983401713741;
    ld2 = ad1 + ad2;
    fb1 = fb0 || fb1;
    ad3 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 = ld2 - ad1;
    double ld3 = 44.06407207074711;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        double ld4 = 961.5590863117998;
        ad3 = ad4 - fd0;
        fb1 = fb0 && fb1;
        fd1 = ld4 - ld0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad2 *= -1;
    double ld1 = 104.34509827150849;
    Thought lo2 = Thought177.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    fd1 = ld1 - ad1;
    Thought lo3 = Thought386.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    if (fb1) {
        fb0 = !fb1;
        Thought lo0 = Thought128.getInstance();
        fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
        fb1 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > fd0;
        fb0 = fd1 > fd0;
        } else if (fb1) {
        double ld1 = 949.6936183271793;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        ld1 *= -1;
        fd0 = fd1 - ld1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
        double ld2 = 403.99677626035924;
        double ld3 = 281.2318655870874;
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
        double ld4 = 708.8694803852649;
        fb0 = ld2 > ld3;
        fb1 = fb0 || fb1;
if(ao4 != null){
          fb0 = ao4.m2(ld4, fd0, fd1, ld1);
}
        fb1 = fb0 || fb1;
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
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
    double ld0 = 482.91215968913605;
if(fo1 != null){
      fo1.m1();
}
        fb0 = ad4 > fd0;
    double ld1 = 742.620346658422;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Output.points[3][6] += ld0;
    double ld2 = 871.7852927166498;
    fb0 = ld1 > ld2;

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
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;

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
    ab1 = ad1 > ad2;
    if (ab2) {
        boolean lb0 = true;
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb0;
        Thought lo1 = Thought249.getInstance();
        ad3 *= -1;
        Thought lo2 = Thought41.getInstance(ab1, ab2, ab3, ab4);
        ad4 = fd0 + fd1;
        fb0 = ad1 < ad2;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
        ab4 = ad1 < ad2;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
        ad1 = ad2 - ad3;
        boolean lb3 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
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
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        double ld0 = 185.4250491979989;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo1.m2();
}
        } else {
        fd0 *= -1;
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
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
    Thought lo0 = Thought142.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 *= -1;
    Thought lo2 = Thought223.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    lb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab4 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
        fd1 = fd0 - fd1;

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
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[3][7] -= ad4;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought176.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        boolean lb1 = false;
        ad3 = ad4 - fd0;
        boolean lb2 = false;
        lb2 = fd1 < ad1;
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        Thought lo3 = Thought346.getInstance();
        fb0 = !fb1;
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
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    Thought lo1 = Thought159.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
    ab3 = ab4 && fb0;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
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
    lb0 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld1 = 487.3606170075024;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    ld1 = fd0 + fd1;
    Thought lo2 = Thought254.getInstance(ao3, ao4, fo0, fo1);
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo5 = Thought69.getInstance(fb0, fb1, lb0, lb3);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, lb4, fb0, fb1, lb0);
}
    lb3 = !lb4;
    ld1 = fd0 - fd1;
    ld1 *= -1;
    double ld6 = 650.5572050423194;
    ld6 = fd0 + fd1;
    boolean lb7 = false;

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
    ad1 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 335.3184914611803;
    double ld4 = 516.4627283807603;
if(ao1 != null){
      lb1 = ao1.m2(ld4, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}
    boolean lb5 = false;
    lb1 = lb2 && lb5;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    ad4 *= -1;
    lb2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ld3, ld4, ad1, ad2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    double ld6 = 727.5958102220225;
    lb5 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    lb0 = !lb1;
if(ao3 != null){
      lb2 = ao3.m2(lb5, fb0, fb1, lb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    Output.points[3][8] += fd0;
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
        fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3();
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
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
    ab1 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[4][0] += ad4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
    ab2 = ad4 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 603.100079687831;
    double ld1 = 515.3296007538235;
    ab3 = !ab4;
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = ad3 > ad4;
    fd0 *= -1;
    fd1 = ld0 - ld1;
    ad1 *= -1;
    ab1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
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
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    double ld1 = 866.8846323976045;
    Thought lo2 = Thought145.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
    lb0 = !fb0;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m2();
}
    fb1 = lb0 && fb0;
    fb1 = !lb0;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
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
    fb0 = fd1 < fd0;
    Thought lo0 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    double ld1 = 34.69858442100588;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    double ld2 = 819.6228899568616;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ld1, ld2, fd0, fd1);
}
    ld1 = ld2 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    boolean lb3 = true;
    ld1 = ld2 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(lb3, fb0, fb1, lb3);
}
    fd1 *= -1;
    ld1 *= -1;
    double ld4 = 563.9834210874584;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld4, fd0, fd1, fb0, fb1, lb3, fb0);
}
    ld1 = ld2 - ld4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ld2, fb1, lb3, fb0, fb1);
}
    lb3 = fb0 && fb1;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought336.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = true;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
    boolean lb3 = true;
    lb2 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    lb3 = fb0 || fb1;
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
}
