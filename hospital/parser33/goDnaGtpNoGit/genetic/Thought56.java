package genetic;
import java.util.ArrayList;
class Thought56 extends Thought{
private static ArrayList<Thought56> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 315.33332951645707;
private double fd1 = 666.7565724426429;
private Thought fo0 = null;
private Thought fo1 = null;
Thought56 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought56 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought56 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought56 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought56 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 327.4645088024932;
    fb0 = fb1 && fb0;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    ld0 *= -1;
    boolean lb1 = true;
    fd0 *= -1;
    fb0 = !fb1;
    lb1 = fb0 || fb1;
    fd1 *= -1;
    ld0 *= -1;
    lb1 = fd0 < fd1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    ld0 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought247.getInstance(lb1, lb2, fb0, fb1);
        double ld4 = 682.2431619322333;
        ld4 = ld0 - fd0;
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
    ab1 = fd0 < fd1;
    Output.points[7][6] -= fd0;
    ab2 = !ab3;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[7][7] -= fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
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
    double ld0 = 387.22525773015144;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought202.getInstance(ld0, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought196.getInstance(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
    ad3 *= -1;
    Output.points[7][8] += ad4;
    fb1 = fb0 || fb1;
    boolean lb3 = false;

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
    Output.points[8][0] += ad2;
    double ld0 = 606.6599667620186;
    ab1 = ab2 || ab3;
    Output.points[8][1] -= ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m1(fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ab4 = ad1 > ad2;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought243.getInstance();
    ab4 = !fb0;
    fd1 *= -1;

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
    fb1 = fb0 || fb1;
    Thought lo0 = Thought329.getInstance(fb0, fb1, fb0, fb1);
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    fb1 = !lb1;
    Output.points[8][2] += fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
    double ld2 = 128.66907521383342;
    fb1 = !lb1;
    Thought lo3 = Thought385.getInstance(fo1, ao1, ao2, ao3);
    boolean lb4 = false;
if(ao4 != null){
      ao4.m2(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
    lb4 = !fb0;
    fd1 = ld2 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb1 = ld2 > fd0;
    Output.points[8][3] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(lb4, fb0, fb1, lb1);
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
    fb1 = ad1 < ad2;
    double ld0 = 758.3639177098164;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fd1 = ld0 - ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    fb0 = fb1 || lb1;
    ld0 *= -1;
    Output.points[8][4] -= ad1;
    Output.points[8][5] += ad2;
    fb0 = !fb1;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ld0 = ad1 - ad2;
    fb0 = !fb1;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
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
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
    double ld0 = 261.8005198841138;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    double ld1 = 781.3777525648446;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
}
    boolean lb2 = false;
if(ao1 != null){
      ld0 = ao1.m3();
}
    ab4 = ld1 > fd0;
    double ld3 = 237.99594176352778;
    Thought lo4 = Thought317.getInstance(fb0, fb1, lb2, ab1);
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ld3, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
    double ld5 = 22.851707406811364;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
    ld3 = ld5 - fd0;

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
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    if (fb0) {
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
        Output.points[8][6] -= ad2;
        ad3 = ad4 - fd0;
        } else if (ab1) {
        fd1 = ad1 + ad2;
        double ld0 = 177.77281890997074;
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
        boolean lb1 = true;
if(ao1 != null){
          fo1 = ao1.m4();
}
        ab1 = ld0 > ad1;
        ad2 *= -1;
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
    Thought lo0 = Thought241.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, lb3, fb0);
}
    Thought lo4 = Thought313.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, lb2, lb3);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb1, lb2, lb3);
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
    ab1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought166.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought207.getInstance(lb0, fb0, fb1, lb0);
    Thought lo2 = Thought18.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 < ad4;
    fb0 = !fb1;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb3, fb0, fb1);
}
    Thought lo4 = Thought116.getInstance(fo0, fo1, fo0, fo1);
    Thought lo5 = Thought124.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    lb3 = !fb0;
    Thought lo6 = Thought18.getInstance();
    Output.points[8][7] += ad4;
    fb1 = lb0 && lb3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb3);
}
    Thought lo7 = Thought341.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb3);
    double ld8 = 886.5654573367209;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb3);
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
    ad1 = ad2 + ad3;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ad4 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld0 = 180.71490136877972;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ab1 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    ab2 = ad1 > ad2;
    Output.points[8][8] += ad3;
    Thought lo1 = Thought274.getInstance();
    ad4 = fd0 + fd1;
    double ld2 = 819.392957577507;
    ld0 = ld2 + ad1;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    ab2 = !ab3;
        ad2 *= -1;
    Output.points[0][0] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}

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
    double ld0 = 881.4456040306279;
    fd0 *= -1;
    double ld1 = 825.8415382395565;
    fb0 = fd0 < fd1;
    double ld2 = 758.5271755711536;
    boolean lb3 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, ld1, ld2, fd0, fb0, fb1, lb3, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, ld0, ld1, ld2, lb3, fb0, fb1, lb3);
}
    fd0 = fd1 + ld0;
    Thought lo4 = Thought378.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb3, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(ld2, fd0, fd1, ld0);
}
    ld1 = ld2 + fd0;
    fb1 = !lb3;
    Output.points[0][1] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld1, ld2, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    Thought lo5 = Thought288.getInstance(fb0, fb1, lb3, fb0);
    fb1 = lb3 && fb0;
        boolean lb6 = false;
    fb0 = ld0 > ld1;
    fb1 = lb3 && lb6;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0, fb1, lb3, lb6, fb0);
}
    Output.points[0][2] += ld1;
if(ao1 != null){
      ao1.m2(ld2, fd0, fd1, ld0, fb1, lb3, lb6, fb0);
}
    Output.points[0][3] += ld1;
    ld2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb3, lb6, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    lb0 = ad2 < ad3;
    Thought lo1 = Thought35.getInstance(ao2, ao3, ao4, fo0);
    Thought lo2 = Thought288.getInstance(ad4, fd0, fd1, ad1);
    double ld3 = 117.5092101050098;
    Output.points[0][4] -= ad1;
    fb0 = fb1 && lb0;
    ad2 = ad3 + ad4;
    Thought lo4 = Thought232.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld3, ad1);
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = ad2 < ad3;
    Thought lo5 = Thought68.getInstance(fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 > ad4;
    fd0 = fd1 + ld3;
    fb0 = fb1 || lb0;
    double ld6 = 569.2684556796546;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    Output.points[0][5] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
    Thought lo1 = Thought49.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    boolean lb2 = false;
    Thought lo3 = Thought230.getInstance(fo1, ao1, ao2, ao3);
    boolean lb4 = false;
    lb4 = fd1 > fd0;
    boolean lb5 = false;
    boolean lb6 = false;
    lb5 = !lb6;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
        Thought lo7 = Thought287.getInstance();

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
if(ao1 != null){
      ad1 = ao1.m3(ab1, ab2, ab3, ab4);
}
    Output.points[0][6] -= ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < ad1;
    ab2 = !ab3;
    ab4 = ad2 > ad3;
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fb1 = ab1 && ab2;
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        if (ab3) {
            ab4 = fb0 || fb1;
if(ao2 != null){
              ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
            Thought lo0 = Thought233.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao2 != null){
              ao1 = ao2.m4();
}
            ab1 = ab2 && ab3;
            boolean lb1 = true;
            ab3 = ad4 > fd0;
            Thought lo2 = Thought74.getInstance(ab4, fb0, fb1, lb1);
            fd1 = ad1 + ad2;
if(ao3 != null){
              ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb0 = false;
    double ld1 = 12.421117265742973;
    Thought lo2 = Thought293.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    ld1 = fd0 - fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    Output.points[0][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (fb1) {
        lb0 = ld1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
        fd1 = ld1 - fd0;
        } else {
        fd1 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + ld1;
        Output.points[0][8] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][0] -= fd1;
    ab1 = ab2 || ab3;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[1][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
    boolean lb1 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    lb0 = fd0 > fd1;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
}
    ab3 = fd0 < fd1;
    boolean lb3 = true;

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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    double ld0 = 353.2301159715522;
    Thought lo1 = Thought72.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = false;
    lb2 = !fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = ad3 > ad4;
        lb2 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 325.33110318918546;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
    Thought lo1 = Thought210.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
    Thought lo2 = Thought326.getInstance();
    fd0 *= -1;
    fd1 = ld0 + ad1;
    ab1 = ad2 < ad3;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
    double ld3 = 535.6682413912002;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;

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
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[1][2] += fd0;
    if (fb1) {
        fb0 = !fb1;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb0 = false;
        lb0 = fb0 || fb1;
if(ao1 != null){
          lb0 = ao1.m2();
}
        fb0 = fb1 && lb0;
        Thought lo1 = Thought209.getInstance(fb0, fb1, lb0, fb0);
        fb1 = lb0 || fb0;
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
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
    fb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb0 = fd1 > ad1;
    Thought lo0 = Thought156.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    Output.points[1][3] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ad1;

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
    Thought lo0 = Thought300.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    Output.points[1][4] -= fd0;
    fb1 = !ab1;
    Output.points[1][5] -= fd1;
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    Output.points[1][6] += fd0;
    ab3 = !ab4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ao2.m2(fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    double ld1 = 133.23089311186698;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[1][7] -= ld1;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ab1 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    double ld0 = 207.87824240856017;
    ld0 = ad1 - ad2;
    Thought lo1 = Thought43.getInstance(fb1, ab1, ab2, ab3);
    ab4 = !fb0;

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
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0);
    if (fb1) {
        double ld1 = 531.3304258018942;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        fb0 = fd1 > ld1;
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        if (fb1) {
if(fo1 != null){
              fo1.m1();
}
            fb0 = fd0 > fd1;
if(fo0 != null){
              fo0.m1(fb1, fb0, fb1, fb0);
}
            ld1 *= -1;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo1 = Thought249.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
    ab4 = fb0 && fb1;
    double ld4 = 352.93558549048555;
    lb0 = lb2 && lb3;

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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        double ld0 = 169.4320482458586;
        Thought lo1 = Thought231.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = ad4 > fd0;
        fb0 = fb1 && fb0;
        if (fb1) {
            Thought lo2 = Thought161.getInstance(fd1, ld0, ad1, ad2);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
            ld0 = ad1 + ad2;
            ad3 = ad4 + fd0;
if(fo0 != null){
              fo0.m1();
}
if(fo1 != null){
              fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fo0.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld0 = 367.22258587248876;
    ab1 = ld0 > ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
    ad1 *= -1;
    ab1 = ab2 && ab3;
    Thought lo2 = Thought48.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought342.getInstance(fb1, lb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ld0, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1();
}
if(fo0 != null){
          fo0.m3(lb1, ab1, ab2, ab3);
}
        fd0 = fd1 - ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Thought lo0 = Thought228.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;

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
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        fd0 *= -1;
        fb1 = fd1 < ad1;
        fb0 = ad2 < ad3;
        Thought lo0 = Thought214.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
        Output.points[1][8] += ad2;
        ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo1 = Thought361.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        double ld2 = 576.5631083712087;
        boolean lb3 = false;
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb3, fb0);
}
        fd0 = fd1 + ld2;
        boolean lb4 = false;
        boolean lb5 = true;
        lb5 = ad1 > ad2;
        ad3 = ad4 - fd0;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb3, lb4, lb5);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
        fd1 = ld2 - ad1;
        fb1 = lb3 && lb4;
        ad2 = ad3 - ad4;
        lb5 = fd0 < fd1;
if(ao1 != null){
          fo1 = ao1.m4(ld2, ad1, ad2, ad3);
}
        fb0 = ad4 < fd0;
        fd1 = ld2 - ad1;
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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    ab2 = ab3 && ab4;
    fd1 *= -1;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 502.8414121063915;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, lb2, ab1);
}
        ld3 *= -1;
    ab2 = ab3 || ab4;
    fd0 = fd1 + ld3;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld3, fd0, fb1, lb0, lb1, lb2);
}
    double ld4 = 226.76576126441512;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought254.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = ad1 - ad2;
    ab3 = !ab4;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
    ad3 = ad4 - fd0;
    lb1 = lb2 || ab1;
    for(int i0=0; i0<10; i0++){
        Output.points[2][0] += fd1;
        }
    boolean lb3 = false;
    double ld4 = 801.3914819251671;
    ld4 = ad1 + ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    ld4 *= -1;
    ab1 = !ab2;
    ab3 = !ab4;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo1 = Thought324.getInstance(fb1, lb0, fb0, fb1);
    boolean lb2 = false;
    lb0 = lb2 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
    double ld3 = 474.68783456734104;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
    Output.points[2][1] -= fd0;
    Thought lo4 = Thought250.getInstance(fo0, fo1, fo0, fo1);
    fd1 = ld3 - fd0;
    fb1 = lb0 && lb2;
if(fo0 != null){
      fd1 = fo0.m3(ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
    double ld5 = 676.9070562100768;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb6 = true;
    boolean lb7 = true;
    fd0 = fd1 + ld3;
    lb7 = ld5 < fd0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 220.03825162442152;
    double ld1 = 693.4824608103175;
if(fo1 != null){
      fo1.m1(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    fb0 = ld0 > ld1;
    boolean lb3 = false;
    Output.points[2][2] -= fd0;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, fd0);
}
    lb3 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1();
}
    Output.points[2][3] += ld1;
    fd0 = fd1 + ld0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[2][4] -= fd0;
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought179.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;

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