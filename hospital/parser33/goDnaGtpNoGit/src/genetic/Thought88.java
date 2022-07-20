package genetic;
import java.util.ArrayList;
class Thought88 extends Thought{
private static ArrayList<Thought88> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 252.7548620750284;
private double fd1 = 253.23837318561047;
private Thought fo0 = null;
private Thought fo1 = null;
Thought88 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought88 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought88 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought88 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought88 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought88 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought88 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought88 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought88 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought88 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought88 instance = new Thought88 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought265.getInstance(fo0, fo1, fo0, fo1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = lb0 || fb0;
        fb1 = fd0 < fd1;
if(fo0 != null){
          lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fd0 > fd1;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb2);
}
        Thought lo3 = Thought85.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb2);
        lb0 = fb0 || fb1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb4 = false;
        double ld5 = 952.2132248699833;
        double ld6 = 561.9559345565192;
if(fo0 != null){
          fo1 = fo0.m4(ld6, fd0, fd1, ld5);
}
        ld6 = fd0 + fd1;
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        ab4 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
        Thought lo1 = Thought133.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 116.66499669529374;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 - ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought190.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
    fb0 = ad1 > ad2;
        fb1 = ad3 < ad4;
    Thought lo2 = Thought77.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);

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
    ab1 = ab2 || ab3;
    ad2 = ad3 + ad4;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
        Thought lo0 = Thought61.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 + ad3;
    Output.points[4][2] += ad4;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought274.getInstance(fb0, fb1, ab1, ab2);
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
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
    double ld0 = 286.8420171529616;
if(ao1 != null){
      ao1.m1(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    lb1 = ld0 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 - fd0;
    if (fb1) {
        lb1 = fd1 > ld0;
        fd0 = fd1 + ld0;
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 + ld0;
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1);
}
            fb0 = fb1 || lb1;
            fb0 = fb1 || lb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
        Thought lo1 = Thought94.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 < ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
        ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
if(fo1 != null){
      lb0 = fo1.m2();
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    lb0 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[4][3] -= fd1;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(ad4, fd0, fd1, ad1);
}
    if (lb0) {
        boolean lb2 = false;
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
    double ld0 = 243.6177002071831;
    ab2 = fd0 > fd1;
    boolean lb1 = false;
    ab2 = ab3 && ab4;
    ld0 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb1 = !lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = fd1 < ld0;
    double ld2 = 259.1582392693638;
    ld2 = fd0 - fd1;
    ld0 *= -1;
    ld2 *= -1;
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2, lb1, ab1, ab2, ab3);
}
    double ld3 = 110.9252577507336;
if(fo0 != null){
      ao4 = fo0.m4(ld3, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 + ad1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought207.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    Output.points[4][4] += ad1;
    if (fb0) {
        fb1 = lb0 || ab1;
        ad2 = ad3 + ad4;
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
        ab2 = fd0 < fd1;
        ad1 *= -1;
        Thought lo2 = Thought250.getInstance(fo0, fo1, ao1, ao2);
        boolean lb3 = true;
        ad2 *= -1;
        ab2 = ab3 || ab4;
        fb0 = fb1 || lb3;
        boolean lb4 = false;
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
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (fb0) {
        fd1 *= -1;
        fd0 = fd1 - fd0;
        Thought lo0 = Thought331.getInstance();
        Output.points[4][5] += fd1;
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    double ld0 = 736.9468202466416;
    ab3 = ld0 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought120.getInstance(fo1, fo0, fo1, fo0);
    ab2 = fd1 < ld0;
    double ld2 = 200.42916374048184;
    ab3 = ld2 > fd0;
    fd1 *= -1;
    ld0 = ld2 + fd0;
    ab4 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld0, ld2, ab2, ab3, ab4, fb0);
}
    double ld3 = 426.74305700312243;
        fb1 = ld3 > fd0;
    fd1 = ld0 + ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ld3 = fd0 - fd1;
    fb0 = !fb1;
    Thought lo4 = Thought242.getInstance(fo1, fo0, fo1, fo0);

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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Output.points[4][6] += ad3;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3();
}
    double ld1 = 523.4125319388622;
    fb0 = ad3 > ad4;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb2, fb0);
}
    Output.points[4][7] -= fd0;

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
    ad1 *= -1;
    Output.points[4][8] -= ad2;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought237.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
        Output.points[5][0] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        Output.points[5][1] -= fd1;
        if (ab1) {
            Output.points[5][2] -= ad1;
            ad2 *= -1;
            ad3 = ad4 + fd0;
            ab2 = fd1 < ad1;
            Output.points[5][3] -= ad2;
            } else {
            ab3 = ad3 > ad4;
            boolean lb1 = true;
            ab3 = ab4 && fb0;
            boolean lb2 = true;
            fd0 = fd1 + ad1;
            fb0 = ad2 > ad3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 876.8755752873797;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
        fb0 = fb1 || fb0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
        double ld1 = 839.7272591541085;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ld0 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, ld1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb2);
}
        lb3 = fb0 || fb1;
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
    fb1 = ad1 > ad2;
    Thought lo0 = Thought243.getInstance(ao1, ao2, ao3, ao4);
    Output.points[5][4] -= ad3;
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;

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
    Thought lo0 = Thought341.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    Thought lo1 = Thought187.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab2 = ab3 || ab4;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    double ld3 = 890.569524186023;
    fd0 = fd1 + ld3;
    ab4 = fb0 || fb1;
    fd0 = fd1 + ld3;
    double ld4 = 553.7098110377484;
    boolean lb5 = false;
    lb2 = ld4 < fd0;
    boolean lb6 = false;
    Thought lo7 = Thought192.getInstance();
if(fo0 != null){
      fo0.m1(lb5, lb6, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ld3, ld4, fd0, ab3, ab4, fb0, fb1);
}
    lb2 = fd1 < ld3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    double ld1 = 78.13175192282344;
    boolean lb2 = true;
    ab3 = ab4 && fb0;
    Thought lo3 = Thought319.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, fb1, lb0, lb2, ab1);
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought235.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
        double ld5 = 803.7156928759172;
        Thought lo6 = Thought30.getInstance(ao3, ao4, fo0, fo1, fb1, lb0, lb2, ab1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m1(ad4, fd0, fd1, ld5);
}
        ld1 = ad1 - ad2;
        ab2 = ad3 > ad4;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld5, ld1);
}
        double ld7 = 604.3814078428301;
        ab3 = ab4 || fb0;
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
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought376.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fd0 *= -1;
    fb0 = fb1 && lb0;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    boolean lb3 = true;
            fd1 *= -1;
    Thought lo4 = Thought24.getInstance(fo1, fo0, fo1, fo0);
    double ld5 = 213.1134353360643;
if(fo1 != null){
      lb2 = fo1.m2(ld5, fd0, fd1, ld5);
}
    double ld6 = 562.2415321930744;
    ld6 = fd0 + fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = !ab1;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        Thought lo0 = Thought294.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
        fb1 = ab1 || ab2;
        ab3 = !ab4;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        boolean lb1 = false;
        ab4 = !fb0;
        fb1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        Output.points[5][5] -= fd0;
        lb1 = fd1 < fd0;
        if (ab1) {
if(fo0 != null){
              fo0.m2();
}
if(fo1 != null){
              ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
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
    fb0 = ad1 > ad2;
    ad3 *= -1;
    Output.points[5][6] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
        fb0 = !fb1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought176.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    Output.points[5][7] += ad1;
    ad2 *= -1;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    Output.points[5][8] += ad3;
    ab3 = ab4 || fb0;

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
    double ld0 = 969.4070640286285;
    fb1 = ld0 < fd0;
if(ao1 != null){
      ao1.m1(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought91.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    Output.points[6][0] -= fd1;
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb4 = false;
        lb2 = ld0 > fd0;
if(ao3 != null){
      lb3 = ao3.m2(lb4, fb0, fb1, lb2);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, lb3, lb4, fb0, fb1);
}
    lb2 = lb3 && lb4;
if(ao3 != null){
      ld0 = ao3.m3(fd0, fd1, ld0, fd0, fb0, fb1, lb2, lb3);
}
    Thought lo5 = Thought240.getInstance(ao4, fo0, fo1, ao1, lb4, fb0, fb1, lb2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    double ld0 = 570.2166249082896;
    boolean lb1 = false;
    double ld2 = 560.9036984129526;
    Output.points[6][1] += ad2;
    Output.points[6][2] += ad3;
    ad4 = fd0 + fd1;
    ld0 = ld2 - ad1;
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    boolean lb3 = false;
    lb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    lb3 = ld0 > ld2;
    fb0 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(fb1, lb1, lb3, fb0);
}
    fb1 = lb1 && lb3;
    fb0 = ad4 > fd0;
    Thought lo4 = Thought262.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, ld2, ad1, fb1, lb1, lb3, fb0);
    ad2 = ad3 - ad4;
    Thought lo5 = Thought317.getInstance(fd0, fd1, ld0, ld2, fb1, lb1, lb3, fb0);
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb1, lb3, fb0);
}
    ad2 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
        fd1 = fd0 - fd1;
    boolean lb0 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ad1 = ao3.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought239.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[6][3] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb1 = false;
        double ld2 = 486.1802534613193;
    ab4 = fb0 || fb1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, ab4, fb0, fb1, lb1);
}
    Thought lo3 = Thought202.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = ld2 > ad1;
        fb1 = ad2 < ad3;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Output.points[6][4] -= fd1;
    double ld0 = 442.8640273843847;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[6][5] += fd0;
    fd1 = ld0 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fd1, ld0, fd0, fd1);
}
        double ld1 = 518.5424161930331;
        ld1 = ld0 + fd0;
        double ld2 = 733.1763177687504;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld0);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m2();
}
        boolean lb3 = false;
        boolean lb4 = false;
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
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = ab2 || ab3;
    double ld1 = 735.1373893107594;
    ab4 = ld1 < fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb2 = true;
    Output.points[6][6] += fd1;
    ld1 = fd0 - fd1;

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
    fb0 = ad1 < ad2;
    boolean lb0 = true;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > ad1;
    fb0 = fb1 || lb0;
    double ld1 = 764.4645269032528;
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd1 = ld1 - ad1;
            boolean lb2 = true;
    ad2 *= -1;
    lb2 = !fb0;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 || lb2;
    Thought lo3 = Thought352.getInstance(ad4, fd0, fd1, ld1);
        fb0 = ad1 > ad2;
    fb1 = lb0 && lb2;
    Thought lo4 = Thought145.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = true;
    ld1 *= -1;
    lb5 = !fb0;

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
    lb0 = ab1 || ab2;
    ab3 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
    double ld1 = 433.6537245664175;
    ab1 = !ab2;
    ld1 = ad1 - ad2;
    Output.points[6][7] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb0, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    if (lb2) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo3 = Thought82.getInstance(ab4, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    if (fb1) {
        fb0 = fd1 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
        fb1 = fd1 < fd0;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
    boolean lb0 = true;
    lb0 = !fb0;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ad3 = ao4.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ad2 *= -1;
        boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
}
    double ld2 = 962.2645792234825;
    boolean lb3 = true;
    ld2 = ad1 - ad2;
    double ld4 = 154.04583908065112;
    boolean lb5 = false;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld6 = 471.26374329930803;
    double ld7 = 827.7997908525027;
    Output.points[6][8] -= ld7;

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
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought326.getInstance();
    fd0 = fd1 - fd0;
    lb0 = lb1 && ab1;
    Output.points[7][0] -= fd1;
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    double ld3 = 532.1091540140961;
    boolean lb4 = false;
    fb0 = ld3 < fd0;
    boolean lb5 = true;
    fb0 = fb1 || lb0;
    fd1 = ld3 - fd0;
    fd1 *= -1;
    double ld6 = 103.23155908293222;
    Thought lo7 = Thought170.getInstance(ao4, fo0, fo1, ao1, ld3, ld6, fd0, fd1, lb1, lb4, lb5, ab1);

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
    Output.points[7][1] -= ad1;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    fb0 = fb1 && ab1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo0 = Thought170.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
if(fo0 != null){
      ad2 = fo0.m3();
}
    ab2 = ad3 < ad4;

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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought6.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = lb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    Output.points[7][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    double ld2 = 452.7528357004163;
    ld2 = fd0 - fd1;
    lb1 = fb0 || fb1;
    Thought lo3 = Thought243.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
    fd0 *= -1;
    fd1 = ld2 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    lb1 = ld2 < fd0;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
    Output.points[7][3] += fd1;
    Thought lo0 = Thought284.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;

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
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    Output.points[7][4] -= fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    fb0 = fb1 && lb0;
    Thought lo3 = Thought366.getInstance(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
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
