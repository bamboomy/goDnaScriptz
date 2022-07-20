package genetic;
import java.util.ArrayList;
class Thought322 extends Thought{
private static ArrayList<Thought322> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 127.91261264439498;
private double fd1 = 642.2211321434173;
private Thought fo0 = null;
private Thought fo1 = null;
Thought322 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought322 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought322 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought322 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought322 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought322 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought322 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought322 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought322 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought322 instance = new Thought322 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought322 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought322 instance = new Thought322 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought322 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought322 instance = new Thought322 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought322 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought322 instance = new Thought322 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought322 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought322 instance = new Thought322 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought322 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought322 instance = new Thought322 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought322 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought322 instance = new Thought322 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought322 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought322 instance = new Thought322 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 465.4227664593464;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    double ld2 = 149.6309681718923;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb0, fb1, lb1, fb0);
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Output.points[2][6] += fd0;
    Thought lo0 = Thought285.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab3 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought110.getInstance();
    if (ab4) {
        fd1 *= -1;
        Thought lo2 = Thought65.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = !ab2;
        if (ab3) {
            fd1 = fd0 - fd1;
            ab4 = fd0 > fd1;
            double ld3 = 462.9340845078175;
            ld3 = fd0 - fd1;
            } else {
            fd0 = fd1 - fd0;
if(fo0 != null){
              fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
            boolean lb4 = false;
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
    Thought lo0 = Thought376.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    ad2 = ad3 + ad4;
    Output.points[2][7] += fd0;
    fb1 = !fb0;
    fd1 = ad1 - ad2;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld1 = 988.6018759621214;
    ad4 = fd0 + fd1;
    boolean lb2 = true;

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
      fo0.m2();
}
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    fb0 = fb1 || ab1;
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
    ab4 = fb0 && fb1;
    Output.points[2][8] += fd0;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    double ld1 = 679.219449039203;
    Thought lo2 = Thought270.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
    boolean lb3 = false;
    ab2 = ad4 > fd0;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, ad1, ad2, ad3);
}
    Thought lo5 = Thought177.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);

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
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    if (fb0) {
        Thought lo1 = Thought88.getInstance();
if(ao2 != null){
          ao2.m3(fb1, lb0, fb0, fb1);
}
        fd0 = fd1 + fd0;
        double ld2 = 285.87013662699655;
        Thought lo3 = Thought181.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
        Output.points[3][0] -= fd1;
        Output.points[3][1] -= ld2;
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
    Output.points[3][2] += ad2;
    boolean lb0 = false;
    fb0 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    Output.points[3][3] -= ad3;
    double ld1 = 49.77023885141708;
    Output.points[3][4] += ad3;
    ad4 = fd0 - fd1;
    fb0 = ld1 < ad1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, ad1, ad2);
}
    Thought lo2 = Thought254.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
        Thought lo3 = Thought293.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    double ld4 = 24.772066581180894;
    Output.points[3][5] += ld1;
    ld4 = ad1 - ad2;
    fb0 = ad3 > ad4;
if(ao4 != null){
      fb1 = ao4.m2(fd0, fd1, ld1, ld4, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    lb0 = fb0 || fb1;

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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought369.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[3][6] += fd1;
    ab2 = fd0 > fd1;
    ab3 = !ab4;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    double ld1 = 689.0587489162683;
    fb1 = !ab1;
    boolean lb2 = true;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb0, fb1, lb2, ab1);
}
    fd0 = fd1 - ld1;
    ab2 = fd0 > fd1;
    boolean lb3 = true;
    if (ab2) {
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
if(ao2 != null){
      ab1 = ao2.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    ab4 = fb0 || fb1;
if(ao3 != null){
      lb0 = ao3.m2();
}
    ad4 = fd0 - fd1;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    double ld2 = 794.6992560475247;
    lb1 = ad4 > fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ad1, ad2, lb3, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought320.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Thought lo5 = Thought42.getInstance(ad3, ad4, fd0, fd1);
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = false;
    double ld1 = 193.08363835202468;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    Output.points[3][7] += fd0;
    Thought lo2 = Thought224.getInstance(fb1, lb0, fb0, fb1);
    lb0 = fb0 || fb1;
    double ld3 = 10.901551654060858;
    boolean lb4 = false;
    double ld5 = 315.9979330873504;
    boolean lb6 = true;
    Output.points[3][8] -= ld5;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ld3, ld5, lb0, lb4, lb6, fb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, ld3, fb1, lb0, lb4, lb6);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb4);
}
    Output.points[4][0] += ld5;
    fd0 *= -1;
if(fo1 != null){
      lb6 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    Thought lo7 = Thought392.getInstance(ld1, ld3, ld5, fd0);
    fd1 = ld1 + ld3;
    Thought lo8 = Thought90.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld1);

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
    Thought lo0 = Thought102.getInstance();
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 231.7527233085271;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, fb1, lb1, lb2, ab1);
}
        Thought lo4 = Thought22.getInstance(fd1, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
    boolean lb5 = true;

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
    double ld0 = 64.35936153682479;
    fb0 = ld0 < ad1;
    boolean lb1 = false;
    Output.points[4][1] -= ad2;
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 || lb1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 230.58477029796057;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld3, ad1);
}
    lb1 = ad2 > ad3;
    boolean lb5 = false;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fd0 = fd1 - ld0;
    Output.points[4][2] += ld3;
    lb2 = lb4 || lb5;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    lb4 = lb5 && fb0;
    ad1 *= -1;
    boolean lb6 = true;
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, lb1, lb2, lb4);
}
    double ld7 = 797.2998226150661;

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
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld0 = 772.5896150840011;
    fb0 = !fb1;
    double ld1 = 996.663287905894;
    ld1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, ad1, ad2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab1 = ld0 < ld1;

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
    fb0 = fd0 > fd1;
    boolean lb0 = true;
if(ao1 != null){
      fb0 = ao1.m2();
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
        fd0 = fd1 - fd0;
        double ld1 = 93.75176350837346;
        lb0 = fd0 > fd1;
        boolean lb2 = true;
if(ao2 != null){
          ao2.m3(lb0, fb0, fb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][3] -= ad1;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    boolean lb1 = true;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
    lb2 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2, lb0, lb1, lb2, fb0);
}
    boolean lb3 = true;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    ad1 = ad2 - ad3;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought362.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought263.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 || ab3;
    boolean lb3 = true;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    double ld4 = 80.15707561890423;
    if (lb2) {
        fd0 *= -1;
        boolean lb5 = true;
        lb2 = lb3 && ab1;
        fd1 *= -1;
        double ld6 = 674.7758029247635;
if(ao2 != null){
          ld6 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ld4 = fd0 + fd1;
        ld6 = ld4 - fd0;
        fd1 = ld6 - ld4;
        boolean lb7 = false;
        boolean lb8 = false;
        fd0 = fd1 - ld6;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    Output.points[4][4] += ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ab2 = ao3.m2();
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, ab1, ab2);
}
    Output.points[4][5] += ad1;
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    double ld1 = 856.3637211391807;
            ab2 = ab3 && ab4;
    Thought lo2 = Thought373.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad3 = ad4 - fd0;
    fb1 = !lb0;
    ab1 = ab2 || ab3;
    ab4 = fd1 < ld1;
    boolean lb3 = true;

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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought347.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        Thought lo1 = Thought101.getInstance();
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;

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
    boolean lb0 = false;
    ab1 = fd0 < fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, ab1, ab2);
}
    Output.points[4][6] -= fd1;
    ab3 = !ab4;
    boolean lb4 = true;
    ab4 = fb0 && fb1;
    boolean lb5 = true;
    lb0 = lb1 && lb2;
    boolean lb6 = false;
    Thought lo7 = Thought116.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    Thought lo8 = Thought369.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    boolean lb0 = false;
    fb0 = ad1 > ad2;
    boolean lb1 = false;
    fb0 = fb1 || lb0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = ad3 < ad4;
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    lb1 = !lb2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, lb1, lb2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    double ld0 = 934.4024044446122;
    ad1 *= -1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    boolean lb2 = true;
    fd1 = ld0 - ad1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 > ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld3 = 719.4758199456344;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, ad1, ad2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb1 = ld0 < ld3;
    ad1 = ad2 + ad3;

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
    double ld0 = 296.25470675967335;
    double ld1 = 802.8647929616897;
    double ld2 = 302.22305113251;
if(ao1 != null){
      ao1.m1();
}
    Thought lo3 = Thought186.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ld0 > ld1;
    boolean lb4 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0, lb4, fb0, fb1, lb4);
}
    ld1 = ld2 - fd0;
    fd1 = ld0 - ld1;
    fb0 = ld2 < fd0;
    fd1 = ld0 - ld1;
    boolean lb5 = true;
    boolean lb6 = true;
    lb6 = ld2 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld0, ld1, ld2, fd0, fb0, fb1, lb4, lb5);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb6, fb0, fb1, lb4);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ld1, ld2);
}
    fd0 = fd1 + ld0;
    ld1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0);
}
    boolean lb7 = false;
    if (lb5) {
        boolean lb8 = true;
        if (lb5) {
if(ao4 != null){
              ao3 = ao4.m4();
}
if(fo1 != null){
              fo0 = fo1.m4(lb6, lb7, fb0, fb1);
}
            Thought lo9 = Thought359.getInstance(ao1, ao2, ao3, ao4, ld1, ld2, fd0, fd1, lb8, lb4, lb5, lb6);
}}
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
      ao1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Output.points[4][7] -= fd1;
    Thought lo0 = Thought165.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    double ld1 = 865.1678142659343;
    double ld2 = 251.76271782365444;
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld3 = 831.450661172932;
    Thought lo4 = Thought74.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    double ld5 = 425.97360685050546;
    fb1 = ld1 > ld2;
    ld3 = ld5 - ad1;

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
    ab1 = fd0 < fd1;
    boolean lb0 = false;
        ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(ao2 != null){
      fd0 = ao2.m3();
}
    double ld2 = 297.4704626131474;
    double ld3 = 593.8311121020486;
    ld3 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld2, ld3, fd0, fd1, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(ld2, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld4 = 966.5955063314407;

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
        ad2 = ad3 - ad4;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        ab1 = ab2 && ab3;
        fd1 *= -1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
}
    fb1 = lb0 || lb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb2 = !fb0;
    fb1 = fd1 < fd0;
    boolean lb3 = false;
    lb0 = fd1 < fd0;

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
    ab2 = !ab3;
    ab4 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought223.getInstance(fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    double ld2 = 980.1767392116706;
    ab4 = !fb0;
    fb1 = !lb1;
    Thought lo3 = Thought356.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought62.getInstance(fo1, fo0, fo1, fo0);
    double ld5 = 323.76133220377056;
    Thought lo6 = Thought356.getInstance(ld5, fd0, fd1, ld2);
    double ld7 = 461.56634159103515;
    ld5 = ld7 - fd0;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 394.8821953569583;
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, lb1, lb2, lb3, fb0);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld0, fb1, lb1, lb2, lb3);
}
    boolean lb4 = false;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[4][8] += ad2;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    Output.points[5][0] += ad2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    fb0 = fb1 || lb0;
    lb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = fd1 > ad1;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought378.getInstance(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
    fd0 *= -1;
    ab4 = fd1 < ad1;
    double ld3 = 342.3189050440311;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;

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
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4();
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
    double ld0 = 314.7569281027966;
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ld0 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo1 = Thought121.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    ld0 = ad1 - ad2;
    fb0 = ad3 > ad4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ad1);
}
    fb1 = !fb0;
    ad2 = ad3 - ad4;
    boolean lb2 = true;

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
    boolean lb0 = false;
    Output.points[5][1] += fd1;
    fd0 = fd1 + fd0;
    double ld1 = 253.36449165893941;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
    double ld2 = 398.5401494952527;
    ld1 = ld2 - fd0;
    Output.points[5][2] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb3 = false;
    Output.points[5][3] -= ld1;
    Output.points[5][4] += ld2;
if(ao2 != null){
      ao2.m1(lb3, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    double ld4 = 867.8205853984385;
    fb0 = ld1 < ld2;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld4, fd0, fd1, ld1, lb0, lb3, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ld2, ld4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb0, lb3, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = lb0 || lb3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 || ab3;
    double ld5 = 645.4385877947785;
if(ao3 != null){
      ao2 = ao3.m4(ld1, ld2, ld4, ld5);
}
    fd0 *= -1;
    double ld6 = 843.8637110425723;

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
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    double ld0 = 926.6242321796304;
    if (fb1) {
if(ao2 != null){
          ao2.m1(ab1, ab2, ab3, ab4);
}
        ld0 *= -1;
        Output.points[5][5] += ad1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
        fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;

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
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought61.getInstance(fd0, fd1, fd0, fd1);
    double ld2 = 345.2421281697491;
    lb0 = ld2 > fd0;
    double ld3 = 319.6642570458126;
    fb0 = !fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
}
    boolean lb4 = false;
    boolean lb5 = true;
    ld2 = ld3 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb4, lb5, fb0, fb1);
}
    fd1 = ld2 + ld3;
    fd0 = fd1 - ld2;
    Thought lo6 = Thought151.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2, lb0, lb4, lb5, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld2, fb1, lb0, lb4, lb5);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb4);
}
    fd0 = fd1 + ld2;

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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][6] += fd1;
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought303.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    boolean lb2 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    Thought lo3 = Thought130.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    lb0 = fd1 > fd0;
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb0, lb2);
}
    fb0 = fd1 > fd0;
    Output.points[5][7] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    double ld4 = 717.7483309808194;
    ld4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld4, fb1, lb0, lb2, fb0);
}
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
}
