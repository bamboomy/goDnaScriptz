package genetic;
import java.util.ArrayList;
class Thought197 extends Thought{
private static ArrayList<Thought197> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 188.69002061135313;
private double fd1 = 671.6656380657203;
private Thought fo0 = null;
private Thought fo1 = null;
Thought197 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought197 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought197 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought197 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought197 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought197 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought197 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought197 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought197 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought197 instance = new Thought197 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought197 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought197 instance = new Thought197 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought197 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought197 instance = new Thought197 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought197 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought197 instance = new Thought197 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought197 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought197 instance = new Thought197 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought197 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought197 instance = new Thought197 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought197 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought197 instance = new Thought197 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought197 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought197 instance = new Thought197 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[1][7] += fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought1.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[1][8] -= fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo1 = Thought171.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb2 = false;
    lb2 = fd1 > fd0;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb2, fb0);
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Output.points[2][0] += fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    Thought lo1 = Thought62.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    lb0 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    double ld1 = 653.5906449005723;
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    Output.points[2][1] -= fd0;
    fd1 = ld1 - ad1;
    boolean lb2 = false;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ld1;
    Output.points[2][2] += ad1;
    lb0 = !lb2;
    Output.points[2][3] -= ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        fb1 = lb0 || lb2;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
        fb0 = !fb1;
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
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    boolean lb1 = true;
    ad4 *= -1;
    lb0 = !lb1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = lb0 || lb1;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    double ld3 = 831.7625362248382;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    lb2 = !ab1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought285.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld3);
}
    boolean lb5 = true;
    lb5 = ad1 > ad2;
    ab1 = ab2 || ab3;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    double ld0 = 687.2664907540346;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 431.7163006492894;
    fb1 = ld1 < fd0;
    fd1 *= -1;
    double ld2 = 710.9207587155446;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = ld0 > ld1;
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
    Thought lo0 = Thought332.getInstance(ao1, ao2, ao3, ao4);
    fb1 = !fb0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    Thought lo1 = Thought212.getInstance();
    Output.points[2][4] -= ad2;
    Thought lo2 = Thought73.getInstance(fb0, fb1, fb0, fb1);
    boolean lb3 = false;
    Output.points[2][5] -= ad3;
    double ld4 = 765.1434002308758;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld4, ad1, ad2, ad3, lb3, fb0, fb1, lb3);
}
    fb0 = fb1 || lb3;
    fb0 = fb1 && lb3;
    Output.points[2][6] += ad4;
    fb0 = fd0 > fd1;
    ld4 = ad1 + ad2;
    fb1 = !lb3;

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
    double ld0 = 845.7232962802217;
    Thought lo1 = Thought311.getInstance(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb2 = true;
    fd1 = ld0 + fd0;
    if (ab4) {
        fd1 = ld0 + fd0;
        fd1 = ld0 + fd0;
if(fo1 != null){
          fo1.m2(fd1, ld0, fd0, fd1);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd0 = fd1 + ld0;
if(ao2 != null){
          fd0 = ao2.m3(fb1, lb2, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fd1 = ld0 - fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, lb2, ab1, ab2);
}
        double ld3 = 66.24836435708004;
        if (ab3) {
            ab4 = !fb0;
            Thought lo4 = Thought366.getInstance(ld0, fd0, fd1, ld3, fb1, lb2, ab1, ab2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    Thought lo0 = Thought396.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    ad4 = fd0 + fd1;
    double ld1 = 221.6581877366035;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3);
}
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
    lb2 = ab1 && ab2;
    ab3 = !ab4;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        Output.points[2][7] -= ad1;
        lb2 = lb3 || ab1;
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
    fb1 = !fb0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fd1 > fd0;
    fb1 = lb0 || fb0;
    fb1 = fd1 > fd0;
    lb0 = fd1 > fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    double ld1 = 935.2687427050674;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought55.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    fb0 = ld1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
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
      fo1.m2();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    if (ab4) {
        } else {
        Thought lo0 = Thought323.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
        if (ab3) {
if(fo1 != null){
              ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
            Output.points[2][8] -= fd1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
            double ld1 = 728.2737106580892;
            ld1 *= -1;
            ab3 = fd0 < fd1;
            Thought lo2 = Thought219.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
if(fo1 != null){
              fo0 = fo1.m4();
}
            fd0 = fd1 - ld1;
            Output.points[3][0] += fd0;
            Output.points[3][1] += fd1;
            ld1 = fd0 - fd1;
            ab4 = fb0 || fb1;
            ld1 = fd0 + fd1;
            ab1 = ld1 < fd0;
if(fo0 != null){
              ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              fd0 = fo0.m3(fd1, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
}}
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
    ad1 *= -1;
    Thought lo0 = Thought7.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[3][2] += ad4;
    double ld1 = 796.9713075592797;
    ad4 *= -1;
    fb1 = fd0 < fd1;
    ld1 = ad1 - ad2;
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    lb2 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought141.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    ad2 *= -1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
            Thought lo0 = Thought287.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    ab1 = ab2 || ab3;
    boolean lb1 = true;
if(fo1 != null){
      ad1 = fo1.m3();
}
    Output.points[3][3] -= ad2;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    fb1 = lb1 && lb2;
    Thought lo3 = Thought324.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    ad2 *= -1;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    Output.points[3][4] -= fd1;

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
    fb0 = !fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    Output.points[3][5] += fd0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(ao1 != null){
          fd1 = ao1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    boolean lb1 = true;
    Output.points[3][6] += fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought14.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
        fb0 = fd1 < ad1;
        boolean lb1 = false;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        boolean lb2 = false;
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
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    if (fb1) {
        Output.points[3][7] -= fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        ab1 = ab2 || ab3;
if(ao1 != null){
          fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
        fd0 = fd1 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        Output.points[3][8] += fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = ad2 > ad3;
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    Thought lo0 = Thought73.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    ab4 = fb0 || fb1;
    double ld1 = 462.5809664051891;
    Output.points[4][0] -= fd0;
    boolean lb2 = true;
    fd1 = ld1 - ad1;
    boolean lb3 = true;
    boolean lb4 = false;
    lb2 = lb3 || lb4;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought11.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 884.0972405045611;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    ld1 = fd0 + fd1;
    ld1 *= -1;
    fd0 = fd1 - ld1;
    boolean lb3 = true;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld1 - fd0;
    boolean lb4 = true;
if(fo0 != null){
      lb3 = fo0.m2(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    boolean lb5 = true;
    Thought lo6 = Thought195.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb4, lb5, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb2, lb3, lb4, lb5);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, fb0, fb1, lb2, lb3);
}
    if (lb4) {
        double ld7 = 548.0427899260703;
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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    double ld1 = 2.1549366923336404;

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
    fb0 = ad2 > ad3;
    double ld0 = 202.87840524770175;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought90.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ld0);
}
    Output.points[4][1] -= ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb2 = true;
    Thought lo3 = Thought301.getInstance(fb0, fb1, lb2, fb0);
    fd1 = ld0 + ad1;
    fb1 = lb2 || fb0;
    ad2 = ad3 - ad4;
    Thought lo4 = Thought335.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, lb2, fb0, fb1);
    ad2 *= -1;
    double ld5 = 867.8208650560388;
    lb2 = ad2 > ad3;
    boolean lb6 = false;
    ad4 = fd0 + fd1;
    double ld7 = 609.5349698071445;
    Thought lo8 = Thought58.getInstance(ld0, ld5, ld7, ad1, lb6, fb0, fb1, lb2);
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
if(fo0 != null){
      lb6 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb6);
}

Thought.STACK_COUNTER++;
return ld5;
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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    ab1 = ab2 && ab3;
    fd1 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo0 = Thought42.getInstance(ab4, fb0, fb1, ab1);
    fd1 = ad1 - ad2;
    ab2 = ad3 < ad4;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 > ad4;
    Output.points[4][2] -= fd0;
    double ld1 = 179.52028447051958;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ad3 > ad4;
        ab2 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ld1 *= -1;
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
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Output.points[4][3] += fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    Thought lo0 = Thought104.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought190.getInstance();
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    Output.points[4][4] -= fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = fd1 < fd0;
    lb2 = !fb0;
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = true;
    lb4 = fd1 < fd0;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, lb5, fb0, fb1, lb2);
}
    lb3 = !lb4;
    lb5 = fb0 || fb1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb2, lb3, lb4, lb5);
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[4][5] += ad2;
    double ld0 = 334.8530594400427;
    double ld1 = 535.9393012014527;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        double ld2 = 585.9185572592008;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought150.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    double ld1 = 958.4484503132949;
    ld1 = fd0 + fd1;
    ab1 = ld1 > fd0;
if(ao1 != null){
      ab2 = ao1.m2(fd1, ld1, fd0, fd1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3();
}
    lb0 = !ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ad3 = ao3.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = ad4 > fd0;
    fd1 *= -1;

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
    double ld0 = 934.5383608508556;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 910.0453986414099;
    Output.points[4][6] -= ld0;
    fb0 = ld1 < fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
        ld0 = ld1 - fd0;
    Output.points[4][7] += fd1;
    Thought lo2 = Thought211.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    ld0 = ld1 - fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
    Thought lo4 = Thought182.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb1, lb3, fb0, fb1);
    boolean lb5 = false;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1, lb3, lb5, fb0, fb1);
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    Output.points[4][8] += fd1;
    ab4 = !fb0;
    fb1 = !lb0;
    Thought lo1 = Thought68.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    boolean lb3 = false;
    ab2 = ab3 || ab4;
    double ld4 = 929.7492040870064;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld4, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, lb3, ab1, ab2);
}
    fd1 = ld4 - fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb5 = false;
    fb0 = fd1 > ld4;
    boolean lb6 = false;

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
    ad2 *= -1;
    double ld0 = 877.0118564198957;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = true;
    Output.points[5][0] -= fd0;
    Thought lo2 = Thought297.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        fd1 *= -1;
        Thought lo4 = Thought51.getInstance(ld0, ad1, ad2, ad3);
        Thought lo5 = Thought207.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
        lb3 = lb1 && fb0;
        Thought lo6 = Thought134.getInstance();
        fb1 = ad1 < ad2;
if(fo1 != null){
          ad3 = fo1.m3(lb3, lb1, fb0, fb1);
}
        Thought lo7 = Thought149.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb3, lb1, fb0, fb1);
        ad1 = ad2 - ad3;
        Thought lo8 = Thought392.getInstance(ad4, fd0, fd1, ld0, lb3, lb1, fb0, fb1);
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
    ad2 *= -1;
    ab1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = fd0 < fd1;
    Thought lo0 = Thought66.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought134.getInstance();
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    fb1 = fd0 < fd1;
    double ld2 = 318.7376055033834;
    Output.points[5][1] -= ld2;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 < ld2;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    Output.points[5][2] += fd0;
    fd1 = ld2 - ad1;
    ad2 = ad3 + ad4;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ad1, fb0, fb1, lb3, ab1);
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
    Thought lo0 = Thought299.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld1 = 919.4884941305852;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    fb0 = ld1 > fd0;
    boolean lb3 = true;
    fb0 = fd1 < ld1;
    fd0 = fd1 + ld1;
    fb1 = lb2 || lb3;
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m1();
}
    Thought lo4 = Thought53.getInstance(fb1, lb2, lb3, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb1, lb2, lb3, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0, fb1, lb2, lb3, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb2, lb3, fb0);
}
    double ld5 = 258.3005633531533;

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
    Thought lo0 = Thought357.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
    fb0 = !fb1;
    ad1 *= -1;
    lb1 = !fb0;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought200.getInstance();
    fb1 = lb1 && fb0;
    fb1 = ad4 > fd0;
    Output.points[5][3] -= fd1;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
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
    Thought lo0 = Thought117.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    double ld1 = 643.8493920362487;
    ab1 = ld1 < fd0;
    double ld2 = 5.377894369228065;
    ab2 = ab3 || ab4;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb3);
}
    double ld4 = 839.5044174798428;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought262.getInstance(ao1, ao2, ao3, ao4);
    Output.points[5][4] -= ad4;
    Thought lo1 = Thought221.getInstance(fd0, fd1, ad1, ad2);
    ab2 = ad3 < ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    Output.points[5][5] -= ad3;
    ad4 *= -1;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought211.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought190.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    boolean lb4 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 && lb4;
    ab1 = ab2 || ab3;

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
    Output.points[5][6] -= fd1;
    fb0 = fd0 > fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    Output.points[5][7] -= fd1;
    lb0 = lb1 && lb2;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld3 = 408.2755706647952;
    Output.points[5][8] += ld3;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1, lb1, lb2, fb0, fb1);
}
    boolean lb4 = true;
    ld3 = fd0 + fd1;
if(fo1 != null){
      lb0 = fo1.m2(ld3, fd0, fd1, ld3, lb1, lb2, lb4, fb0);
}
    fb1 = lb0 && lb1;
    Output.points[6][0] += fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb2, lb4, fb0, fb1);
}
    boolean lb5 = false;

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
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    double ld0 = 913.9422584268217;
    fb1 = fd0 < fd1;
    Thought lo1 = Thought119.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 715.1462412177448;
    fb0 = ld0 > ld2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld0;
    fb0 = ld2 > fd0;
    fd1 *= -1;
    boolean lb3 = true;
    Output.points[6][1] -= ld0;
if(fo0 != null){
      ld2 = fo0.m3(fb0, fb1, lb3, fb0);
}
    fb1 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2, fb1, lb3, fb0, fb1);
}
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][2] += fd0;

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
        fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    double ld0 = 758.2662711717467;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    Output.points[6][3] -= fd1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || lb1;

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
