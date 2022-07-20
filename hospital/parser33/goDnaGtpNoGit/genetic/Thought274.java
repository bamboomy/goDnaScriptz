package genetic;
import java.util.ArrayList;
class Thought274 extends Thought{
private static ArrayList<Thought274> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 533.477582352067;
private double fd1 = 336.54244594201367;
private Thought fo0 = null;
private Thought fo1 = null;
Thought274 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought274 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought274 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought274 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought274 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought274 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought274 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought274 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought274 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought274 instance = new Thought274 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought274 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought274 instance = new Thought274 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought274 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought274 instance = new Thought274 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought274 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought274 instance = new Thought274 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought274 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought274 instance = new Thought274 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought274 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought274 instance = new Thought274 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought274 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought274 instance = new Thought274 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought274 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought274 instance = new Thought274 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 813.8206308279003;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought67.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 + fd1;
    Output.points[5][6] -= ld0;
    Thought lo2 = Thought109.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ld0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    double ld3 = 506.55957079342414;
    fb1 = ld0 > ld3;

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
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    for(int i0=0; i0<10; i0++){
        Output.points[5][7] += fd1;
        boolean lb0 = false;
        ab1 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
        double ld1 = 311.60618638282915;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
}
        boolean lb2 = false;
        Output.points[5][8] -= ld1;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ld1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, ab1);
}
        double ld3 = 887.3542081766768;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ld3 = fo1.m3(fd0, fd1, ld1, ld3);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld3, fd0);
}
        ab2 = ab3 && ab4;
        Output.points[6][0] -= fd1;
        ld1 = ld3 + fd0;
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo0 != null){
          fo0.m1(fb1, lb0, lb2, ab1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[6][1] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    if (fb0) {
        Thought lo0 = Thought2.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
        double ld1 = 456.5616569479827;
        fb1 = ld1 > ad1;
        double ld2 = 765.2909259167841;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 && fb1;
        Output.points[6][2] -= ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ad1);
}
        boolean lb3 = false;
        lb3 = ad2 > ad3;
        fb0 = fb1 && lb3;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[6][3] -= ad4;
        fb0 = fb1 && lb3;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
        fb1 = fd0 > fd1;
        boolean lb4 = true;
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
    Output.points[6][4] += ad1;
    ab1 = !ab2;
    ab3 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 176.4210171383229;
    fb1 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = !ab2;
    Thought lo1 = Thought220.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought77.getInstance(ad1, ad2, ad3, ad4);
    Thought lo3 = Thought157.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
    Thought lo4 = Thought107.getInstance();
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought335.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
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
      fb0 = ao2.m2();
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought270.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[6][5] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 196.87951560558366;
    Thought lo2 = Thought110.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought271.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo4 = Thought174.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
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
      ad2 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    fb0 = fd1 > ad1;
    Output.points[6][6] += ad2;
    fb1 = ad3 > ad4;
    Thought lo0 = Thought295.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 *= -1;
if(ao3 != null){
          ao3.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    if (fb1) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought111.getInstance(ao4, fo0, fo1, ao1);
        fb0 = ad4 > fd0;
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
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    Output.points[6][7] += fd0;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    Output.points[6][8] += fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab4 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
    double ld0 = 256.90666471676946;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab4 = fb0 && fb1;
    ab1 = ld0 > fd0;
    Thought lo1 = Thought112.getInstance(fd1, ld0, fd0, fd1);
    ab2 = ab3 || ab4;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    ad4 *= -1;
    boolean lb0 = false;
if(ao4 != null){
      ab3 = ao4.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        boolean lb1 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
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
    Thought lo0 = Thought328.getInstance();
    boolean lb1 = true;
    Thought lo2 = Thought174.getInstance(lb1, fb0, fb1, lb1);
    fb0 = fb1 || lb1;
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    fb0 = fd1 > fd0;
    boolean lb4 = false;
    double ld5 = 880.1180915134352;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld5, fd0);
}
    fd1 *= -1;
    fb1 = lb1 && lb3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld5);
}
    lb4 = fd0 > fd1;
    ld5 = fd0 + fd1;

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
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 156.16419558304958;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
        fd0 = fd1 - ld0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought341.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    Thought lo3 = Thought295.getInstance(ld0, fd0, fd1, ld0);

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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[7][0] -= ad2;
    double ld2 = 49.87860345036127;
    Thought lo3 = Thought51.getInstance();
    ad2 = ad3 - ad4;
    Output.points[7][1] -= fd0;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
    boolean lb4 = false;
    fd1 *= -1;
    ld2 = ad1 - ad2;
    fb0 = ad3 < ad4;
    Thought lo5 = Thought79.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, fb1, lb0, lb1, lb4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    lb4 = !fb0;
    fd1 = ld2 - ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb4);
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
    boolean lb0 = false;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    double ld2 = 983.0068148737504;
    Output.points[7][2] -= fd0;
    double ld3 = 947.9571857217878;
    lb0 = lb1 || ab1;
    Thought lo4 = Thought231.getInstance();
    Output.points[7][3] -= fd0;

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
    double ld0 = 414.04971881611453;
    Output.points[7][4] += fd0;
    Thought lo1 = Thought220.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = false;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
    ld0 *= -1;
    double ld3 = 920.7939239320508;
    ld3 = fd0 + fd1;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(ld0, ld3, fd0, fd1, lb2, fb0, fb1, lb2);
}
        fb0 = ld0 < ld3;
        fb1 = lb2 && fb0;
        double ld4 = 703.7388570756818;
        if (fb1) {
if(ao2 != null){
              lb2 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
            fb1 = ld3 < fd0;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m2();
}
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
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
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    if (ab3) {
        ab4 = fb0 && fb1;
        double ld0 = 764.9286938804694;
if(ao1 != null){
          ao1.m3();
}
if(ao2 != null){
          ao2.m2(ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
if(ao2 != null){
          ao2.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = !lb1;
        ab1 = ld0 < fd0;
        boolean lb2 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        double ld3 = 265.12833177312046;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[7][5] -= ad2;
    Thought lo0 = Thought15.getInstance(ad3, ad4, fd0, fd1);
    ad1 *= -1;
    ad2 *= -1;
    ab2 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    ab3 = ad4 < fd0;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    boolean lb2 = false;
    ab2 = !ab3;
    double ld3 = 440.3021000491056;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb1);
}
    fd0 = fd1 + ld3;
    lb2 = ab1 && ab2;
    ab3 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld3, ad1, ad2, ab4, fb0, fb1, lb1);
}
    lb2 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld3 = ad1 + ad2;
    ad3 *= -1;
    lb1 = !lb2;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Output.points[7][6] += fd1;
    Thought lo0 = Thought152.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[7][7] -= fd1;
    Output.points[7][8] -= fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    lb1 = fd1 < fd0;
    boolean lb2 = false;
    lb2 = fd1 < fd0;
    fb0 = fd1 > fd0;
    boolean lb3 = false;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought173.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    lb1 = fd1 < fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
    fb0 = ad1 > ad2;
    Thought lo0 = Thought61.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb1 = !fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    Thought lo1 = Thought189.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought77.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Thought lo3 = Thought57.getInstance(fo1, fo0, fo1, fo0);
    Output.points[8][0] += ad4;
    Thought lo4 = Thought281.getInstance(fd0, fd1, ad1, ad2);
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][1] -= ad1;
    Output.points[8][2] += ad2;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo5 = Thought240.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    boolean lb6 = true;
    ad1 = ad2 - ad3;
    Output.points[8][3] += ad4;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 633.0871666467082;
    double ld1 = 707.8128616124774;
    ld1 = ad1 - ad2;
    boolean lb2 = true;
    Thought lo3 = Thought265.getInstance(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    ld1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    Thought lo4 = Thought249.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1);
    fb0 = fb1 || lb2;
    ab1 = !ab2;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
    Thought lo5 = Thought200.getInstance(lb2, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    Thought lo6 = Thought276.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, lb2, ab1, ab2, ab3);

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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    fb0 = !fb1;
    Thought lo1 = Thought208.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought377.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    lb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    fb0 = fd0 < fd1;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb3);
}
    boolean lb4 = false;
    lb4 = fd0 > fd1;
    double ld5 = 544.1001806800682;
if(ao2 != null){
      ld5 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld5, fd0, fb0, fb1, lb0, lb3);
}
    lb4 = !fb0;
if(ao1 != null){
      ao1.m3(fd1, ld5, fd0, fd1, fb1, lb0, lb3, lb4);
}
    Output.points[8][4] += ld5;
    double ld6 = 914.4181267548084;
    fb0 = fb1 || lb0;
        ld6 = fd0 + fd1;
    lb3 = ld5 > ld6;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    double ld1 = 430.2014615004964;
    ad2 *= -1;
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1);
}
    double ld2 = 38.628058415666494;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld1, ld2, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Output.points[8][5] -= fd1;
    ld1 = ld2 + ad1;
    Output.points[8][6] += ad2;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 = ad4 + fd0;
    lb0 = fd1 > ld1;
    fb0 = ld2 < ad1;
    double ld3 = 528.2064108000901;
    Thought lo4 = Thought113.getInstance(fb1, lb0, fb0, fb1);
    lb0 = ad1 > ad2;
    double ld5 = 26.270532119829614;
    fb0 = fb1 || lb0;
    boolean lb6 = true;

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
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld1 = 720.8785948066923;
    double ld2 = 790.3998834114652;
    lb0 = ld1 > ld2;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd1 < ld1;
if(ao1 != null){
      ao1.m1(ld2, fd0, fd1, ld1);
}
    ld2 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1);
}
    ld2 = fd0 + fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    ld1 *= -1;
        fb1 = !lb0;

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
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = !ab2;
    ab3 = ad3 < ad4;
    Output.points[8][7] -= fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought320.getInstance();
    Output.points[8][8] -= ad3;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        fb0 = ad2 < ad3;
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought182.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
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
    fd1 *= -1;
    Output.points[0][0] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 358.2708224426513;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ab1 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab2 = !ab3;
    Output.points[0][1] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd0 < fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    fb0 = !fb1;

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 + ad3;
    Output.points[0][2] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - ad1;
    if (lb0) {
        for(int i0=0; i0<10; i0++){
            double ld1 = 686.8373946909749;
            Thought lo2 = Thought340.getInstance(fo1, fo0, fo1, fo0);
            ad1 = ad2 + ad3;
            ad4 = fd0 - fd1;
            }
        boolean lb3 = false;
        lb0 = fb0 && fb1;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
        lb3 = !lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4();
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    Output.points[0][3] += ad1;
    ad2 = ad3 - ad4;
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    Output.points[0][4] -= fd0;
    fd1 = ad1 + ad2;
    boolean lb0 = true;

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
    double ld0 = 126.62483586011157;
    ld0 = fd0 + fd1;
    boolean lb1 = false;
    Output.points[0][5] += ld0;
    fd0 = fd1 + ld0;
    boolean lb2 = true;
    double ld3 = 183.28273115039008;
    boolean lb4 = false;
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo6 = Thought226.getInstance(ld3, fd0, fd1, ld0);
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld7 = 403.9839389384416;
    ld3 = ld7 - fd0;
    boolean lb8 = false;
        lb4 = !lb5;
    Thought lo9 = Thought96.getInstance(lb8, fb0, fb1, lb1);
    lb2 = lb4 && lb5;
    fd1 = ld0 + ld3;
    lb8 = fb0 && fb1;

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
    double ld0 = 864.7280394820814;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 517.1530417085986;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld2 = 748.7453144687715;
    fb1 = fb0 && fb1;
    fb0 = ld1 < ld2;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought60.getInstance(ao2, ao3, ao4, fo0);
    double ld4 = 597.6728146419555;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[0][6] -= fd0;
    fd1 *= -1;
    if (ab1) {
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb0 = false;
if(ao4 != null){
          ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
        boolean lb1 = true;
if(fo0 != null){
          ab4 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fd0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
        Thought lo2 = Thought366.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
        double ld3 = 981.1574802055147;
if(fo0 != null){
          ao4 = fo0.m4();
}
        ab2 = !ab3;
        ab4 = !fb0;
        fd0 *= -1;
        fd1 = ld3 + fd0;
        Thought lo4 = Thought261.getInstance(fb1, lb0, lb1, ab1);
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
    ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought252.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    fd1 = ad1 + ad2;
    if (ab1) {
        boolean lb1 = true;
        } else if (ab2) {
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1);
}
        boolean lb2 = false;
        lb2 = !ab1;
        ad1 *= -1;
        ab2 = ab3 || ab4;
        } else {
        boolean lb3 = true;
        boolean lb4 = true;
        double ld5 = 473.14690265945404;
if(fo1 != null){
          ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          ld5 = fo0.m3();
}
if(ao1 != null){
          fo1 = ao1.m4(ab4, fb0, fb1, lb3);
}
        Thought lo6 = Thought324.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);
                fd0 = fd1 - ld5;
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb3);
}
}
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
    fb1 = !fb0;
        double ld0 = 656.4831567268682;
    Thought lo1 = Thought54.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Output.points[0][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1);
}
    Output.points[0][8] -= ld0;
    fb0 = fd0 > fd1;
    fb1 = lb2 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb2 && fb0;
    fb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
        fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    boolean lb4 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    Thought lo5 = Thought93.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);

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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2();
}
    fb1 = !fb0;
    Output.points[1][0] += fd0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought131.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    Output.points[1][1] += fd1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
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
    Output.points[1][2] -= fd0;
    double ld0 = 901.0022139200308;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    double ld1 = 960.6292077284088;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
    Output.points[1][3] += fd0;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought153.getInstance();
    double ld4 = 188.6055475732312;
    lb2 = !fb0;
        fb1 = lb2 && fb0;
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
}
