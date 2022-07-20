package genetic;
import java.util.ArrayList;
class Thought4 extends Thought{
private static ArrayList<Thought4> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 437.0528273886382;
private double fd1 = 13.744611355522606;
private Thought fo0 = null;
private Thought fo1 = null;
Thought4 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought4 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought4 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought4 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought4 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought4 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought4 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought4 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought4 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought4 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought4 instance = new Thought4 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4();
}
    double ld0 = 484.5899339732712;
    Output.points[6][1] += ld0;
    if (fb1) {
        fb0 = fd0 < fd1;
        fb1 = fb0 || fb1;
        fb0 = !fb1;
        fb0 = ld0 > fd0;
        Thought lo1 = Thought334.getInstance(fb1, fb0, fb1, fb0);
        fd1 = ld0 - fd0;
        fd1 = ld0 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ld0 > fd0;
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
        ld0 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo1.m3();
}
        lb2 = fb0 || fb1;
if(fo0 != null){
          lb2 = fo0.m2(fb0, fb1, lb2, fb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    lb0 = ab1 || ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (lb0) {
        ab1 = !ab2;
        boolean lb1 = true;
        boolean lb2 = false;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb1;
        Thought lo3 = Thought313.getInstance(fo1, fo0, fo1, fo0, lb2, lb0, ab1, ab2);
        Output.points[6][2] -= fd1;
        ab3 = !ab4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought39.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Output.points[6][3] += ad3;
    Thought lo1 = Thought176.getInstance();
    fb1 = ad4 < fd0;
    fb0 = fb1 || fb0;
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    Output.points[6][4] -= fd0;
    Output.points[6][5] -= fd1;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 = fd1 - ad1;
    boolean lb2 = true;
        ad2 = ad3 - ad4;
    Thought lo3 = Thought115.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought342.getInstance(fd0, fd1, ad1, ad2);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 + ad1;
    ab4 = fb0 || fb1;
    ad2 = ad3 + ad4;
    if (ab1) {
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
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
    fb1 = !fb0;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought95.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2();
}
        double ld1 = 428.38754240385833;
        fb1 = fb0 && fb1;
        boolean lb2 = false;
        Thought lo3 = Thought300.getInstance(lb2, fb0, fb1, lb2);
        ld1 *= -1;
        fd0 *= -1;
        fb0 = fb1 && lb2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
        Thought lo0 = Thought325.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Output.points[6][6] -= ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    ad4 *= -1;
    fb0 = !fb1;
    lb1 = fb0 || fb1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    Output.points[6][7] -= ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
    fd0 = fd1 + ad1;
    lb1 = ad2 < ad3;
    lb2 = ad4 < fd0;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd1 < fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought37.getInstance(ao3, ao4, fo0, fo1);
    ab2 = ab3 || ab4;
    fd0 *= -1;
    double ld1 = 324.85899550480434;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    boolean lb2 = false;
    fd1 = ld1 - fd0;
    fd1 *= -1;
    Thought lo3 = Thought301.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
    ab4 = fd0 > fd1;
    ld1 = fd0 + fd1;
    double ld4 = 736.1704899729544;
    ld1 *= -1;
    fb0 = !fb1;
    ld4 = fd0 - fd1;
    boolean lb5 = true;
    ld1 = ld4 - fd0;
    lb2 = lb5 || ab1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld6 = 39.580443320239866;
    Thought lo7 = Thought44.getInstance(ab2, ab3, ab4, fb0);
    double ld8 = 643.3185615538943;

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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    double ld1 = 376.7859465962473;
    boolean lb2 = false;
    Output.points[6][8] -= fd0;
    Thought lo3 = Thought352.getInstance(fd1, ld1, ad1, ad2, lb2, ab1, ab2, ab3);
    Thought lo4 = Thought200.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
    ad3 = ad4 + fd0;
    Output.points[7][0] -= fd1;
    double ld5 = 142.34682244553215;
    lb2 = ld1 > ld5;

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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought109.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    Thought lo1 = Thought279.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb1 = fb0 || fb1;
    double ld2 = 603.7554458267404;
    boolean lb3 = false;
    lb3 = fd0 > fd1;
    Thought lo4 = Thought362.getInstance();
    ld2 = fd0 + fd1;

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
    boolean lb0 = false;
    Thought lo1 = Thought23.getInstance(lb0, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    double ld3 = 343.23936520661516;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb2, ab1);
}
    Thought lo4 = Thought213.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld3, fd0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    Thought lo1 = Thought339.getInstance(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    boolean lb3 = true;
    Thought lo4 = Thought81.getInstance(fo1, fo0, fo1, fo0);
    boolean lb5 = false;
    lb3 = ad3 > ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
}
    double ld6 = 242.24926374329647;
    lb5 = fb0 || fb1;
    Output.points[7][1] -= ad2;
    lb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld6, ad1);
}
    boolean lb7 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo1 = fo0.m4(lb2, lb3, lb5, lb7);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld6, ad1, fb0, fb1, lb0, lb2);
}
        lb3 = lb5 || lb7;
        ad2 *= -1;
        boolean lb8 = false;
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
    ab1 = ad2 < ad3;
    ab2 = ad4 < fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m2();
}
    ab3 = ad4 < fd0;
    Thought lo0 = Thought70.getInstance(ab4, fb0, fb1, ab1);
    boolean lb1 = false;
    ab1 = fd1 < ad1;
    ad2 *= -1;
    Output.points[7][2] += ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    boolean lb2 = true;
    Thought lo3 = Thought133.getInstance(ad2, ad3, ad4, fd0, lb1, lb2, ab1, ab2);
    ab3 = !ab4;
    Output.points[7][3] += fd1;
    fb0 = fb1 && lb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld0 = 399.98684440535675;
    double ld1 = 534.3182947020241;
    boolean lb2 = false;
    lb2 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought327.getInstance(ld0, ld1, fd0, fd1);
    fb1 = ld0 < ld1;
    lb2 = !fb0;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
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
    if (fb1) {
        double ld0 = 714.4262157483342;
        double ld1 = 514.2955530126674;
if(ao2 != null){
          ao1 = ao2.m4();
}
        double ld2 = 851.7727704479091;
        Output.points[7][4] += ld0;
        Thought lo3 = Thought203.getInstance(fb0, fb1, fb0, fb1);
        fb0 = ld1 < ld2;
        boolean lb4 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb4, fb0);
}
if(ao3 != null){
          ao3.m3(fd0, fd1, ld0, ld1, fb1, lb4, fb0, fb1);
}
if(ao4 != null){
          lb4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb4, fb0);
}
        ld2 *= -1;
        Output.points[7][5] -= ad1;
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 *= -1;
    boolean lb0 = false;
    double ld1 = 741.6008246614757;
    ab4 = fb0 && fb1;
    lb0 = ab1 && ab2;
    fd0 *= -1;
    fd1 = ld1 - fd0;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4();
}
        fd1 = ld1 + fd0;
        fd1 = ld1 + fd0;
        ab2 = fd1 < ld1;
        boolean lb3 = false;
        ab2 = !ab3;
if(fo0 != null){
          fd0 = fo0.m3(ab4, fb0, fb1, lb3);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, lb0, lb2, ab1, ab2);
}
        double ld4 = 745.7873822821941;
        Thought lo5 = Thought312.getInstance(ld4, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    if (fb0) {
        boolean lb0 = true;
        Thought lo1 = Thought164.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
        Thought lo2 = Thought258.getInstance(ad2, ad3, ad4, fd0);
        ab2 = !ab3;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
        double ld3 = 183.84309885474957;
        Output.points[7][6] += ad3;
if(ao4 != null){
          ao3 = ao4.m4();
}
        ad4 *= -1;
        Thought lo4 = Thought196.getInstance(ab4, fb0, fb1, lb0);
        Output.points[7][7] -= fd0;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[7][8] += fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb0 = fb0 || fb1;
        fd1 *= -1;
        if (lb0) {
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
            boolean lb1 = true;
            fb0 = !fb1;
if(fo1 != null){
              lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb1);
}
if(fo0 != null){
              fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][0] += fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    boolean lb1 = true;
    boolean lb2 = true;
    Thought lo3 = Thought48.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb1 = !fb0;
    fb1 = ad2 < ad3;
        ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Output.points[8][1] += fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought354.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    double ld1 = 293.7535360831678;
    double ld2 = 609.4148412275196;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    Output.points[8][2] -= fd1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought374.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      ad3 = fo1.m3();
}
    ad4 = fd0 + fd1;
    ab1 = ad1 > ad2;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    Output.points[8][3] += ad3;
    Output.points[8][4] -= ad4;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        Output.points[8][5] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
        ab2 = ad3 < ad4;
        ab3 = !ab4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought54.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m1();
}
    fb0 = fb1 || lb1;
    fd0 = fd1 - fd0;
    Output.points[8][6] += fd1;
    fb0 = fb1 || lb1;
    Output.points[8][7] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fd1 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
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
    fb1 = !fb0;
    Thought lo0 = Thought11.getInstance(ad2, ad3, ad4, fd0);
    fb1 = !fb0;
    fd1 *= -1;
    if (fb1) {
        fb0 = ad1 > ad2;
        boolean lb1 = false;
        ad3 *= -1;
        ad4 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld2 = 266.7705106414328;
        Thought lo3 = Thought228.getInstance();
        fb0 = ad4 > fd0;
        boolean lb4 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought233.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    Thought lo2 = Thought115.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, ab1);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb3 = false;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
    ad2 = ad3 + ad4;
    ab3 = fd0 > fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought147.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
    Output.points[8][8] -= ad2;
    ad3 = ad4 - fd0;
    if (ab4) {
        fb0 = fd1 > ad1;
        double ld2 = 714.248291285498;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        lb0 = !ab1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        fd0 = fd1 - ld2;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        ab2 = !ab3;
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
}
        ab4 = fb0 && fb1;
if(ao4 != null){
          ao4.m3();
}
        lb0 = ab1 || ab2;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    Output.points[0][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    if (fb1) {
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fd0 *= -1;
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fb1 = lb0 && fb0;
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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought261.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[0][1] += fd1;
    fb1 = lb1 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought136.getInstance(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
    fd0 *= -1;
    ab4 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fd0 > fd1;
    double ld3 = 713.2758322863609;
    ab1 = ld3 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld3, fd0, fd1, ld3);
}
    double ld4 = 528.0529398704365;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld3);
}
    double ld5 = 518.108936413543;
    ab2 = ld4 < ld5;
    fd0 *= -1;
    if (ab3) {
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
    double ld0 = 245.28145674247116;
    fb0 = fb1 || fb0;
    Output.points[0][2] -= ld0;
        ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - ad1;

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
    boolean lb0 = false;
    ab1 = ad1 < ad2;
    Thought lo1 = Thought235.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = !lb0;
    ab1 = ad1 < ad2;
    ab2 = ad3 > ad4;
        fd0 = fd1 + ad1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought250.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 *= -1;
    boolean lb3 = false;
    if (lb3) {
        Thought lo4 = Thought272.getInstance();
        if (ab1) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb1);
}
        lb0 = fd0 < fd1;
        boolean lb2 = false;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        lb1 = fd1 > fd0;
        } else if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        boolean lb3 = false;
        Thought lo4 = Thought281.getInstance();
        fb0 = !fb1;
        Thought lo5 = Thought221.getInstance(lb3, lb0, fb0, fb1);
        fd0 *= -1;
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 *= -1;
    fb0 = fd1 > ad1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
        boolean lb0 = false;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    boolean lb1 = false;

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
    double ld0 = 755.3323718466538;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought11.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao4 != null){
      fb1 = ao4.m2(fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
}
    Thought lo3 = Thought329.getInstance(fo0, fo1, ao1, ao2);

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
    ad1 *= -1;
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought192.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought152.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    ab3 = fd1 > ad1;
    Thought lo2 = Thought374.getInstance(ao2, ao3, ao4, fo0);
    double ld3 = 605.2359221628246;
    Thought lo4 = Thought345.getInstance(ad1, ad2, ad3, ad4);
    ab4 = !fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      ld3 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo5 = Thought147.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 - ld3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld3;
    ad1 *= -1;
    ab4 = ad2 < ad3;

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
    fb0 = !fb1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 > fd1;
    lb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = lb0 || lb1;
    fb0 = !fb1;
    Thought lo2 = Thought305.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
    lb0 = lb1 || fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && lb1;
    Thought lo3 = Thought22.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    lb0 = !lb1;

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
        fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fd0 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    Thought lo1 = Thought246.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(lb0, lb2, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb2, lb3, fb0);
}
    double ld4 = 702.16723744654;
    fb1 = lb0 && lb2;
    Thought lo5 = Thought399.getInstance(ld4, fd0, fd1, ld4, lb3, fb0, fb1, lb0);

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    double ld0 = 928.4649638405953;
    fb1 = ld0 > fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Output.points[0][3] += fd0;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 356.22377782255404;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0);
}
    fb1 = ld1 > fd0;

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
