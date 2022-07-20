package genetic;
import java.util.ArrayList;
class Thought265 extends Thought{
private static ArrayList<Thought265> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 818.9487944308811;
private double fd1 = 57.4630755488303;
private Thought fo0 = null;
private Thought fo1 = null;
Thought265 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought265 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought265 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought265 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought265 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought265 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought265 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought265 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought265 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought265 instance = new Thought265 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought265 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought265 instance = new Thought265 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought265 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought265 instance = new Thought265 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought265 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought265 instance = new Thought265 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought265 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought265 instance = new Thought265 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought265 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought265 instance = new Thought265 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought265 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought265 instance = new Thought265 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought265 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought265 instance = new Thought265 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    boolean lb1 = true;
    Thought lo2 = Thought363.getInstance(fo0, fo1, fo0, fo1);
    lb0 = fd0 > fd1;
    double ld3 = 449.77036577021545;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
    lb1 = fd1 > ld3;
    fb0 = fb1 && lb0;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = false;
    boolean lb5 = true;
    lb5 = fb0 && fb1;
    lb0 = lb1 && lb4;
    double ld6 = 946.4729796353586;
    lb5 = ld6 > fd0;
    fd1 = ld3 + ld6;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    lb4 = lb5 || fb0;

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
    ab2 = ab3 || ab4;
    fd0 *= -1;
    boolean lb0 = false;
    double ld1 = 345.17608243964514;
    boolean lb2 = true;
    Thought lo3 = Thought27.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, lb0, lb2, ab1, ab2);
}
    ld1 = fd0 - fd1;
    Thought lo4 = Thought329.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    lb0 = ld1 > fd0;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ld1, fd0, fd1);
}
    lb2 = lb5 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    double ld6 = 675.7804514429749;

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
if(fo0 != null){
      fo0.m3();
}
        ad2 *= -1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      ad3 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 < ad3;
    lb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 = fd0 - fd1;
    fb1 = lb0 && fb0;
    boolean lb1 = false;
    if (fb0) {
        double ld2 = 37.88621183189789;
        fb1 = ld2 > ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
        boolean lb3 = false;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
        lb3 = ad3 > ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, ad1);
}
        Thought lo4 = Thought236.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
        Thought lo5 = Thought315.getInstance();
if(fo0 != null){
          lb0 = fo0.m2(lb1, fb0, fb1, lb3);
}
        lb0 = !lb1;
        double ld6 = 806.6330687537314;
        } else if (fb1) {
        Output.points[4][2] += ad1;
        lb0 = lb1 || fb0;
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
    boolean lb0 = false;
    double ld1 = 405.26639693295675;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    Output.points[4][3] += ad3;
    ab2 = !ab3;
    Thought lo2 = Thought236.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    double ld3 = 390.96344883069264;
    ab4 = !fb0;
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 < ld3;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    boolean lb4 = false;
        double ld5 = 285.8838095073573;
    boolean lb6 = false;

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
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd1 *= -1;
    lb0 = fd0 > fd1;
        fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    Output.points[4][4] -= fd1;
    fd0 = fd1 + fd0;
        fb0 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
    fb0 = !fb1;
    lb0 = lb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || lb1;

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
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld0 = 12.1966229835015;
    Thought lo1 = Thought2.getInstance(fb0, fb1, fb0, fb1);
    Thought lo2 = Thought200.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    Thought lo3 = Thought248.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb0 = ao4.m2(fd1, ld0, ad1, ad2);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1();
}
    Thought lo4 = Thought162.getInstance(fb0, fb1, fb0, fb1);

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
    Output.points[4][5] -= fd1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        fd0 *= -1;
        ab2 = ab3 && ab4;
        Thought lo0 = Thought160.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        fd1 *= -1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        lb0 = lb1 || ab1;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ad4 = ao3.m3(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
    boolean lb2 = false;
    double ld3 = 567.4831665783987;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought77.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    double ld1 = 339.4481692982725;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb1 = ld1 > fd0;

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
          ab2 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[4][6] -= fd0;
    fb0 = !fb1;
        for(int i0=0; i0<10; i0++){
        ab1 = fd1 > fd0;
        Output.points[4][7] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
        double ld0 = 113.2999226247934;
        Output.points[4][8] += ld0;
        fd0 *= -1;
        if (ab1) {
            ab2 = fd1 < ld0;
            fd0 = fd1 + ld0;
            ab3 = ab4 || fb0;
            fb1 = fd0 < fd1;
}}
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[5][0] -= ad1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad2 = fo1.m3();
}
    fb1 = ad3 < ad4;
    double ld0 = 186.35638542195312;
    Thought lo1 = Thought34.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb1 = ad1 > ad2;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    Thought lo1 = Thought167.getInstance(ab3, ab4, fb0, fb1);
    double ld2 = 663.471235564123;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ld2 = ad1 - ad2;
    Output.points[5][1] -= ad3;
    boolean lb3 = false;
    lb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ad1, ad2, lb3, ab1, ab2, ab3);
}
    double ld4 = 540.3955213057945;
    if (ab4) {
        fb0 = fb1 && lb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = !fb1;
if(ao3 != null){
      ao3.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;

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
    Thought lo0 = Thought10.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    Output.points[5][2] -= fd1;
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb3 = true;
    Thought lo4 = Thought339.getInstance(lb2, lb3, fb0, fb1);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, lb2, lb3, fb0);
}
    ad1 = ad2 - ad3;
    double ld5 = 417.91759370206785;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, lb1, lb2, lb3);
}
    ld5 = ad1 - ad2;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb1, lb2, lb3);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    boolean lb6 = false;
    lb6 = !fb0;
    fb1 = ad3 > ad4;

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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fb0 = fd1 > fd0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    double ld0 = 129.25250895152433;
    double ld1 = 620.6877188294948;
    ld1 = fd0 + fd1;
if(ao3 != null){
      ab1 = ao3.m2();
}
    boolean lb2 = true;
    Output.points[5][3] += ld0;
    ld1 = fd0 + fd1;
    ld0 = ld1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + ld1;
    Thought lo3 = Thought396.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1, fb0, fb1, lb2, ab1);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb2, lb4, ab1);
}
    ab2 = !ab3;
    double ld5 = 414.7345207832192;
    Thought lo6 = Thought101.getInstance(fo0, fo1, ao1, ao2);
    double ld7 = 193.83004878124407;
    ld5 = ld7 + fd0;
    for(int i0=0; i0<10; i0++){
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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
        boolean lb0 = true;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ab1 = !ab2;
    double ld1 = 10.63684410794041;
    boolean lb2 = true;
    double ld3 = 512.1991654105635;
if(ao2 != null){
      ab2 = ao2.m2();
}
    boolean lb4 = false;
    ld1 = ld3 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
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
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[5][4] -= fd0;
    fd1 *= -1;
    double ld2 = 306.53919786532003;

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
    ab1 = ab2 || ab3;
    fd1 = fd0 - fd1;
    double ld0 = 695.9531878148625;
    ab4 = ld0 < fd0;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 < ld0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb2 = false;
if(fo1 != null){
          fd0 = fo1.m3(ab4, fb0, fb1, lb2);
}
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb3, lb1, ab1, ab2);
}
        ld0 *= -1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Output.points[5][5] -= ld0;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought127.getInstance(fd1, ad1, ad2, ad3);
    Thought lo1 = Thought266.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    Thought lo2 = Thought248.getInstance();
    boolean lb3 = false;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo1.m2(fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb3);
}
    boolean lb4 = true;
    boolean lb5 = false;
if(fo0 != null){
      lb4 = fo0.m2(ad2, ad3, ad4, fd0, lb5, fb0, fb1, lb3);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, lb5, fb0, fb1);
}
    double ld6 = 699.2873200720278;
    lb3 = !lb4;
    double ld7 = 286.54637735484164;
    boolean lb8 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb5 = fo1.m2(ld6, ld7, ad1, ad2);
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
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought332.getInstance(fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
    ad2 = ad3 + ad4;
    ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    boolean lb2 = false;
    boolean lb3 = true;
    fd0 *= -1;
    ab1 = fd1 > ad1;
    double ld4 = 6.5138681979201145;

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
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 494.87673054713827;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    Output.points[5][6] += ad1;
    ad2 *= -1;
    double ld2 = 773.653751021541;

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
    ab2 = fd0 > fd1;
    Thought lo0 = Thought110.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    boolean lb1 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought196.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    fd0 = fd1 - fd0;
    lb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - fd0;
    lb2 = !ab1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb4 = true;
    Thought lo5 = Thought271.getInstance(ab1, ab2, ab3, ab4);

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    lb1 = lb2 || ab1;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, lb2);
}
    Thought lo3 = Thought224.getInstance(ao2, ao3, ao4, fo0);
    boolean lb4 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    lb4 = ad2 < ad3;
    Thought lo5 = Thought110.getInstance(ad4, fd0, fd1, ad1);
    Thought lo6 = Thought305.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    if (fb0) {
        boolean lb0 = false;
if(fo1 != null){
          fb0 = fo1.m2();
}
        fb1 = lb0 && fb0;
if(fo0 != null){
          fo0.m2(fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
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
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought329.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(fo1 != null){
          ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
        double ld1 = 528.5525313302576;
        ld1 = fd0 + fd1;
        fb0 = fb1 || ab1;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        ab2 = fd1 < ld1;
        boolean lb2 = false;
        fd0 = fd1 - ld1;
        fd0 *= -1;
        fd1 *= -1;
        Thought lo3 = Thought385.getInstance();
        ab2 = !ab3;
        ld1 *= -1;
        Thought lo4 = Thought10.getInstance(ab4, fb0, fb1, lb2);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    Thought lo0 = Thought395.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought175.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    Thought lo2 = Thought257.getInstance();
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
    Thought lo3 = Thought89.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    ad3 *= -1;
    fb1 = !fb0;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought74.getInstance(ad1, ad2, ad3, ad4);

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
    double ld0 = 15.665833212127696;
    ld0 = ad1 + ad2;
    ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    lb1 = ab1 || ab2;
    ld0 *= -1;
    ab3 = ad1 < ad2;
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo1 != null){
      ad3 = fo1.m3(fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
        ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    ad2 *= -1;

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
    Thought lo0 = Thought230.getInstance();
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = !lb2;
    Thought lo3 = Thought65.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
    boolean lb4 = false;
    lb4 = fd0 > fd1;
    double ld5 = 562.9345068333647;
    boolean lb6 = true;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(lb6, fb0, fb1, lb1);
}
    boolean lb7 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld5, fd0, fd1, ld5, lb2, lb4, lb6, lb7);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld5, fd0, fb1, lb1, lb2, lb4);
}
    Output.points[5][7] += fd1;
    ld5 = fd0 - fd1;
    lb6 = lb7 && fb0;
    if (fb1) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][8] -= ad1;
    boolean lb0 = false;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
    double ld1 = 453.10537557169266;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = !lb0;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    double ld2 = 682.8528406479655;
if(fo1 != null){
      ld1 = fo1.m3();
}
    double ld3 = 654.0873327512086;
    fb0 = ld2 < ld3;
    fb1 = ad1 > ad2;
if(ao1 != null){
      lb0 = ao1.m2(fb0, fb1, lb0, fb0);
}
    if (fb1) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    double ld0 = 117.05396005334259;
    fb0 = ld0 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[6][0] += ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = !ab1;
    fd1 *= -1;
    ab2 = ld0 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
    ab2 = fd0 > fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    ld0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao1 != null){
          fo1 = ao1.m4(ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    Thought lo0 = Thought307.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought107.getInstance();
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    lb2 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb2);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    lb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
    fd0 *= -1;
    boolean lb2 = true;
    fb0 = fd1 > fd0;
    Output.points[6][1] += fd1;
    boolean lb3 = true;
    double ld4 = 640.8593249645301;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, lb2);
}
    double ld5 = 929.4725179746591;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld4, ld5, fd0, fd1, lb3, fb0, fb1, lb0);
}
    lb1 = lb2 || lb3;
    ld4 *= -1;
    ld5 = fd0 - fd1;
    boolean lb6 = false;
    ld4 = ld5 - fd0;
    lb6 = !fb0;
        fd1 = ld4 - ld5;
    Thought lo7 = Thought128.getInstance(fd0, fd1, ld4, ld5, fb1, lb0, lb1, lb2);
    Thought lo8 = Thought162.getInstance(fo1, fo0, fo1, fo0, lb3, lb6, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought42.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb1;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
    Thought lo3 = Thought18.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld4 = 539.0532464818231;
    double ld5 = 833.6653907792485;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld4, ld5, fd0, fd1);
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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought222.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb1 && fb0;
    double ld2 = 703.3088976752681;
        fb1 = lb1 || fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    double ld4 = 813.4370722482013;
    Output.points[6][2] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, ld4, fd0);
}
    double ld5 = 884.2409462697547;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb3);
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
