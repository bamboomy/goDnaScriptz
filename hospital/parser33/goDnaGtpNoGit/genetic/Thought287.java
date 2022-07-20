package genetic;
import java.util.ArrayList;
class Thought287 extends Thought{
private static ArrayList<Thought287> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 790.53906121526;
private double fd1 = 246.9169382013797;
private Thought fo0 = null;
private Thought fo1 = null;
Thought287 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought287 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought287 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought287 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought287 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought287 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought287 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought287 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought287 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought287 instance = new Thought287 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought287 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought287 instance = new Thought287 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought287 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought287 instance = new Thought287 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought287 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought287 instance = new Thought287 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought287 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought287 instance = new Thought287 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought287 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought287 instance = new Thought287 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought287 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought287 instance = new Thought287 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought287 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought287 instance = new Thought287 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought126.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought314.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    Thought lo2 = Thought207.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    boolean lb3 = false;
    double ld4 = 618.1221839247617;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld4, fb0, fb1, lb3, fb0);
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
    double ld0 = 60.94121151605378;
    if (ab1) {
        double ld1 = 68.20110803098612;
        double ld2 = 678.7575060785553;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = ld2 > ld0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        ab1 = fd0 > fd1;
        double ld3 = 962.3609830657699;
        ab2 = ld1 > ld2;
if(fo0 != null){
          ld3 = fo0.m3(ld0, fd0, fd1, ld1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld2, ld3, ld0, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab3 = !ab4;
if(fo0 != null){
          fd1 = fo0.m3(fb0, fb1, ab1, ab2);
}
        ab3 = ld1 > ld2;
        Output.points[8][4] -= ld3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
        boolean lb4 = true;
        Thought lo5 = Thought95.getInstance(ld2, ld3, ld0, fd0, ab1, ab2, ab3, ab4);
        fb0 = fd1 < ld1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, lb4, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld2, ld3, ld0, fd0);
}
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ld2, ld3);
}
        double ld6 = 892.7819408501549;
        ab4 = fb0 && fb1;
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
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought379.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[8][5] -= fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld1 = 492.7682156812742;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought311.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad3 = fo1.m3(lb4, fb0, fb1, lb2);
}
    Thought lo5 = Thought292.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb4, fb0, fb1, lb2);
    ad1 = ad2 + ad3;
if(fo0 != null){
      lb4 = fo0.m2(ad4, fd0, fd1, ld1, fb0, fb1, lb2, lb4);
}
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb2);
}
    boolean lb6 = true;
    Output.points[8][6] += ad1;

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
    ad1 = ad2 - ad3;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
        ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    if (ab3) {
        boolean lb1 = true;
        Thought lo2 = Thought280.getInstance(ab3, ab4, fb0, fb1);
        if (lb1) {
            lb0 = ad2 < ad3;
            ab1 = !ab2;
if(fo0 != null){
              ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 809.6376810604197;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    Output.points[8][7] += fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    if (fb1) {
        boolean lb1 = true;
        lb1 = fd1 < ld0;
        fb0 = fb1 && lb1;
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
    ad2 = ad3 - ad4;
    double ld0 = 468.63362044234555;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
        ad1 *= -1;
        fb1 = lb1 || fb0;
        boolean lb2 = false;
        ad2 *= -1;
        ad3 = ad4 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, ad1, ad2, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb2);
}
        fb0 = fb1 || lb1;
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2);
}
        ad4 = fd0 - fd1;
        boolean lb3 = true;
        lb2 = lb3 || fb0;
        fb1 = lb1 || lb2;
if(ao3 != null){
          ld0 = ao3.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    double ld1 = 184.55640383767167;
if(fo0 != null){
      ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
    ld1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought320.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[8][8] += ld1;
    ab2 = fd0 > fd1;
    Thought lo4 = Thought36.getInstance(ld1, fd0, fd1, ld1);
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = !fb1;
    Output.points[0][0] += ld1;
if(ao1 != null){
      fo1 = ao1.m4(lb0, lb3, ab1, ab2);
}
    fd0 = fd1 + ld1;
    ab3 = ab4 && fb0;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 490.3959070303467;
    fb1 = ab1 && ab2;
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought4.getInstance(ao3, ao4, fo0, fo1, fb1, lb1, ab1, ab2);
    ab3 = ad3 > ad4;
    fd0 = fd1 - ld0;
    ab4 = !fb0;
    fb1 = !lb1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
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
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought342.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    if (fb0) {
        fb1 = fd1 < fd0;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        boolean lb1 = false;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        fb1 = !lb0;
        ab1 = fd0 > fd1;
        ab2 = ab3 || ab4;
        fb0 = fb1 || lb0;
        double ld1 = 589.3966464230406;
        boolean lb2 = true;
        ld1 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought300.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    Output.points[0][1] += ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    ad3 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    if (fb1) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        if (fb0) {
            Thought lo1 = Thought397.getInstance();
            boolean lb2 = true;
            fb0 = !fb1;
            ad2 = ad3 - ad4;
            fd0 *= -1;
if(fo0 != null){
              fd1 = fo0.m3(lb2, fb0, fb1, lb2);
}
            fb0 = ad1 < ad2;
            ad3 = ad4 + fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || ab1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m1();
}
    ab2 = ab3 && ab4;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
    Thought lo0 = Thought256.getInstance(fo1, fo0, fo1, fo0);
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4();
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
    fb1 = fd1 > fd0;
    Output.points[0][2] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        double ld1 = 918.0587028571092;
    lb0 = fb0 || fb1;
    double ld2 = 555.0768784685044;
    boolean lb3 = false;
    Output.points[0][3] += ld1;
    boolean lb4 = true;
    ld2 = fd0 - fd1;
    lb0 = ld1 > ld2;
    for(int i0=0; i0<10; i0++){
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
    Output.points[0][4] -= ad4;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 119.32258927783573;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb1 = ld0 > ad1;
    Output.points[0][5] += ad2;
    fb0 = fb1 && fb0;
    fb1 = ad3 < ad4;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = fd1 > fd0;
    double ld0 = 477.2432692836243;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fb1 = !ab1;
    ab2 = fd1 < ld0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    fd1 = ld0 + fd0;
    ab3 = fd1 < ld0;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    boolean lb1 = false;

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
    boolean lb0 = true;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m2(lb0, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, lb2, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m2(fd1, ad1, ad2, ad3);
}
    ab2 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
          ab3 = ao4.m2();
}
    boolean lb3 = false;
if(fo0 != null){
      ad4 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought25.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
    ad2 *= -1;
    lb2 = !lb3;
    ab1 = ad3 < ad4;
    double ld5 = 754.1754078026955;
    ab2 = ad4 < fd0;
    double ld6 = 500.28925269888106;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    lb0 = fd0 < fd1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought87.getInstance();
    double ld3 = 218.31761514777494;
if(fo1 != null){
      ld3 = fo1.m3(fb0, fb1, lb0, lb1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb4, fb0, fb1, lb0);
}
    fd1 *= -1;
    lb1 = !lb4;
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    lb4 = fd0 > fd1;
    Thought lo5 = Thought135.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
    lb4 = fb0 || fb1;
    ld3 = fd0 + fd1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = !lb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld3, fd0);
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
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        ab2 = !ab3;
        ab4 = fd1 > fd0;
        fb0 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb1 = true;
        Output.points[0][6] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
        ab1 = !ab2;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[0][7] -= fd1;
    fb0 = fb1 || ab1;

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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    lb1 = fd1 > ad1;
    lb2 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || lb0;
    ad2 = ad3 + ad4;
    double ld3 = 159.3323136807039;
    ad4 *= -1;
if(fo1 != null){
      lb1 = fo1.m2();
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb4, fb0, fb1);
}
    double ld5 = 980.2731852200716;
    Thought lo6 = Thought110.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3, lb0, lb1, lb2, lb4);

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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    double ld0 = 734.6815031299303;
    double ld1 = 973.2995083156031;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 + ld1;
    Thought lo2 = Thought380.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    fb1 = ab1 && ab2;
    ab3 = !ab4;
if(fo0 != null){
      fo0.m2();
}
    fb0 = ad1 > ad2;
    boolean lb3 = true;
    ad3 *= -1;
    ad4 *= -1;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb3, ab1);
}
    fd0 = fd1 + ld0;
    ld1 = ad1 - ad2;
    ad3 *= -1;
    boolean lb4 = true;
    boolean lb5 = true;

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[0][8] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought84.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought202.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought125.getInstance();
    Thought lo3 = Thought125.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo4 = Thought159.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld5 = 230.41698845522097;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld5, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought199.getInstance();
    Output.points[1][0] -= fd1;
    fb0 = !fb1;
    Output.points[1][1] += ad1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[1][2] += ad2;
    Thought lo2 = Thought129.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    boolean lb3 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought365.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;

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
    if (ab1) {
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
        fb0 = !fb1;
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        ad1 *= -1;
        ad2 = ad3 - ad4;
        lb0 = !ab1;
        ab2 = ab3 && ab4;
        } else if (fb1) {
        double ld1 = 348.29506849347894;
        ab1 = ad4 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        double ld2 = 344.6861730704561;
        fd0 = fd1 - ld1;
        ld2 = ad1 - ad2;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld2, ad1, ad2);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        ad3 = ad4 - fd0;
        ab2 = ab3 && ab4;
        Output.points[1][3] += fd1;
        fb0 = fb1 && ab1;
if(fo0 != null){
          fo0.m2(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought239.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[1][4] += fd0;
    fb1 = fd1 > fd0;
    boolean lb2 = true;
    lb0 = lb2 && fb0;
    Thought lo3 = Thought160.getInstance();
    fb1 = fd1 < fd0;
    lb0 = lb2 || fb0;
    Output.points[1][5] -= fd1;
    fb1 = fd0 < fd1;

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
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought93.getInstance(fb0, fb1, ab1, ab2);
    Thought lo1 = Thought241.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
        fb0 = fb1 || ab1;
    ab2 = fd1 > fd0;

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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought336.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
    Output.points[1][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 || fb0;

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
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        fd1 = ad1 + ad2;
        ab2 = !ab3;
        Thought lo0 = Thought26.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
        ab2 = ad1 < ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
        Output.points[1][7] -= fd0;
        fd1 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        ad1 = ad2 + ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
        fb1 = ad3 > ad4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ab1 = fo0.m2();
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
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 679.9117367023664;
    Thought lo1 = Thought365.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought321.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    double ld0 = 377.49801835846864;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
    ld0 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
            Thought lo1 = Thought357.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
            ld0 *= -1;
            fb0 = ad1 < ad2;
if(ao1 != null){
              fb1 = ao1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
            ld0 = ad1 - ad2;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            } else {
            ad3 = ad4 + fd0;
            fd1 = ld0 + ad1;
            fb0 = ad2 < ad3;
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 344.6423066888554;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought394.getInstance(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb2 = true;
    Thought lo3 = Thought110.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, ab1, ab2, ab3);
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
    Thought lo0 = Thought244.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ad3 > ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    double ld1 = 357.87624130169786;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, ad1, ad2);
}
    ab4 = fb0 && fb1;
    ab1 = ad3 < ad4;
    ab2 = !ab3;
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought137.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    boolean lb3 = false;

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
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    Output.points[1][8] -= fd1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    Output.points[2][0] += fd1;
        lb0 = !lb1;
    fb0 = !fb1;

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
    Thought lo0 = Thought5.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = fd0 < fd1;
    boolean lb3 = false;
    lb2 = !lb3;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb2 = !lb3;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo4 = Thought322.getInstance(fb0, fb1, lb1, lb2);
    Thought lo5 = Thought282.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb1);
    fd0 = fd1 + fd0;
    lb2 = !lb3;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
    lb3 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld6 = 994.9107967312261;
    lb1 = fd0 > fd1;
    lb2 = ld6 < fd0;
        lb3 = fb0 || fb1;
    boolean lb7 = false;

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
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[2][1] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought72.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 744.9635024649536;
    fb1 = ld1 > fd0;
    fb0 = fd1 < ld1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
