package genetic;
import java.util.ArrayList;
class Thought290 extends Thought{
private static ArrayList<Thought290> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 396.12616642075955;
private double fd1 = 671.4827181053429;
private Thought fo0 = null;
private Thought fo1 = null;
Thought290 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought290 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought290 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought290 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought290 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought290 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought290 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought290 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought290 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought290 instance = new Thought290 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought290 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought290 instance = new Thought290 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought290 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought290 instance = new Thought290 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought290 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought290 instance = new Thought290 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought290 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought290 instance = new Thought290 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought290 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought290 instance = new Thought290 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought290 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought290 instance = new Thought290 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought290 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought290 instance = new Thought290 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    Output.points[1][6] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
        boolean lb2 = false;
    lb2 = fd0 > fd1;
    boolean lb3 = false;
    lb3 = fd0 < fd1;
    Output.points[1][7] += fd0;
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought322.getInstance();
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb2 = fo0.m2(lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, lb3, fb0);
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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought357.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    boolean lb2 = false;
    lb2 = !ab1;
    ab2 = fd0 < fd1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    Thought lo0 = Thought63.getInstance();
    boolean lb1 = false;
    if (fb0) {
        fb1 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
        Output.points[1][8] += ad3;
        ad4 = fd0 - fd1;
        fb0 = fb1 && lb1;
        ad1 = ad2 - ad3;
        Thought lo2 = Thought294.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
        Thought lo3 = Thought274.getInstance(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
        lb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
        boolean lb4 = false;
        boolean lb5 = false;
        boolean lb6 = true;
if(fo0 != null){
          lb5 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
        fd0 = fd1 - ad1;
if(fo1 != null){
          lb6 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        double ld7 = 350.3245124298132;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo8 = Thought324.getInstance(lb1, fb0, fb1, lb4);
if(fo0 != null){
          lb5 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld7, ad1, lb6, lb1, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 907.4691302609075;
    Thought lo1 = Thought102.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    fd0 *= -1;
    ab3 = fd1 < ld0;
    double ld2 = 152.11921567533724;
    Output.points[2][0] += ld2;
    ab4 = !fb0;
    if (fb1) {
        ab1 = ad1 < ad2;
        Thought lo3 = Thought155.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2);
}
        ab2 = ad3 < ad4;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo1.m2();
}
        boolean lb4 = true;
        boolean lb5 = true;
        ab4 = fb0 || fb1;
        lb4 = fd0 > fd1;
        boolean lb6 = true;
        boolean lb7 = true;
if(fo1 != null){
          fo0 = fo1.m4(lb5, lb6, lb7, ab1);
}
        boolean lb8 = true;
        Output.points[2][1] -= ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ld2, fb0, fb1, lb4, lb5);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 778.9308165808955;
    Output.points[2][2] += ld0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
        Thought lo1 = Thought393.getInstance(fo1, ao1, ao2, ao3);
        fb1 = ld0 > fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 < ld0;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao4.m2(ld0, fd0, fd1, ld0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 *= -1;
    double ld0 = 311.70772224791705;
    ad4 *= -1;
    double ld1 = 435.970824466455;
    if (fb0) {
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        ld1 *= -1;
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
    ab1 = !ab2;
    Output.points[2][3] += fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 < fd0;
        ab1 = !ab2;
    fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;
    fb1 = lb0 || ab1;
    Output.points[2][4] += fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Output.points[2][5] += fd1;
    fd0 *= -1;
    double ld1 = 634.8357897442118;
    ab2 = ab3 && ab4;
    fd0 = fd1 + ld1;
    fb0 = fd0 > fd1;
    double ld2 = 735.8161228233283;

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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought156.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
    double ld1 = 417.03815114240433;
    Thought lo2 = Thought159.getInstance(fo0, fo1, ao1, ao2);
    ab2 = ab3 && ab4;
    fb0 = ad1 < ad2;
    Thought lo3 = Thought301.getInstance(ad3, ad4, fd0, fd1);
    boolean lb4 = false;
    if (fb0) {
        fb1 = lb4 && ab1;
        ld1 = ad1 + ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        ld1 = ad1 - ad2;
        ab2 = ab3 && ab4;
if(ao4 != null){
          ao3 = ao4.m4();
}
        } else if (fb0) {
        fb1 = lb4 && ab1;
        ab2 = ab3 && ab4;
        ad3 = ad4 - fd0;
        Thought lo5 = Thought373.getInstance(fb0, fb1, lb4, ab1);
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        ad3 *= -1;
        ad4 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4(ld1, ad1, ad2, ad3, fb1, lb4, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
        lb4 = !ab1;
        Output.points[2][6] -= ad4;
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
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[2][7] -= fd0;
    fd1 = fd0 - fd1;
    lb0 = lb1 || lb2;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought212.getInstance(fb1, lb0, lb1, lb2);
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
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
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && ab1;
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 710.9496284376721;
        Output.points[2][8] -= fd0;
        fd1 = ld0 - fd0;
        boolean lb1 = false;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb2 = true;
        ab2 = !ab3;
        ld0 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(ld0, fd0, fd1, ld0);
}
        ab4 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fo1.m3();
}
        }
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    fd0 *= -1;
    ab4 = fb0 || fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[3][0] -= ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        double ld0 = 890.7760958087173;
        double ld1 = 907.232373799521;
        fb0 = !fb1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
}
        ad3 = ad4 - fd0;
        for(int i0=0; i0<10; i0++){
            Output.points[3][1] += fd1;
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
    boolean lb0 = false;
    ad1 *= -1;
if(fo0 != null){
          fo0.m2();
}
    double ld1 = 658.4026045422248;
    ab1 = ab2 && ab3;
    boolean lb2 = true;
    ab3 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    ad3 *= -1;
    Thought lo3 = Thought310.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
    ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ld1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4();
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
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        Output.points[3][2] += fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        boolean lb0 = true;
        Thought lo1 = Thought251.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
        fd1 *= -1;
        lb0 = fd0 > fd1;
        Thought lo2 = Thought107.getInstance();
        Thought lo3 = Thought237.getInstance(fb0, fb1, lb0, fb0);
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 - fd0;
        boolean lb4 = true;
        Thought lo5 = Thought355.getInstance(fd1, fd0, fd1, fd0, lb0, lb4, fb0, fb1);
        }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    Output.points[3][3] += ad1;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < ad1;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = lb3 || fb0;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb0);
}
    boolean lb4 = true;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, lb1, lb2, lb3, lb4);
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
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
          ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld0 = 694.8984164600686;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ld0 = ao1.m3();
}
if(ao2 != null){
      ao2.m3(ab4, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
    double ld2 = 648.8437912781952;
    boolean lb3 = false;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought134.getInstance(ld2, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld0);
}
    fb1 = ld2 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ld2, fd0);
}
    boolean lb5 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3();
}
    Output.points[3][4] += ad3;
    ab2 = ab3 && ab4;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    Thought lo1 = Thought209.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    double ld2 = 509.40334683573366;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1, fb1, lb0, ab1, ab2);
}
    double ld3 = 924.8508614826727;
    double ld4 = 332.97862195458697;
    boolean lb5 = false;
if(ao1 != null){
      ao1.m1(ld4, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Output.points[3][5] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb5, ab1);
}
    fd0 = fd1 - ld2;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    Output.points[3][6] -= fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought245.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3();
}
    Output.points[3][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 880.7225998632472;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    ld1 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = lb2 && fb0;
    fd1 *= -1;
    fb1 = !lb2;
    ld1 = fd0 - fd1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    Output.points[3][8] -= ld1;
    Thought lo4 = Thought98.getInstance();

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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fd1 < fd0;
    fb0 = fd1 < fd0;
    double ld1 = 220.52012309871495;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    lb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ad2 = ad3 - ad4;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought396.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought52.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    Thought lo3 = Thought47.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought138.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 501.51406331532445;
    ld0 *= -1;
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    ab3 = !ab4;
    double ld2 = 643.5848845507709;
    Output.points[4][0] -= ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    Thought lo3 = Thought145.getInstance();
if(fo1 != null){
      fo1.m2(fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
        Output.points[4][1] -= fd0;
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        boolean lb4 = false;
        fb0 = fb1 || lb4;
        fd1 *= -1;
        double ld5 = 233.08261815384168;
        ld5 *= -1;
if(fo1 != null){
          fo1.m3(ld0, ld2, ad1, ad2, lb1, ab1, ab2, ab3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    double ld1 = 389.5410808943647;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought366.getInstance(ld1, fd0, fd1, ld1);
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    boolean lb3 = false;
    fb0 = fd1 < ld1;
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      fb1 = ao2.m2(lb0, lb3, fb0, fb1);
}
    boolean lb4 = true;

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
        fb0 = ad1 < ad2;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(fd1, ad1, ad2, ad3);
}
        Thought lo0 = Thought59.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ab1 = ao2.m2();
}
    boolean lb1 = false;
    ab1 = fd1 < fd0;
    Thought lo2 = Thought51.getInstance(ab2, ab3, ab4, fb0);
    boolean lb3 = false;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb3);
}
    ab1 = !ab2;

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
    ad1 *= -1;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fd1 = ad1 + ad2;
    double ld0 = 694.5649673240293;
    ad2 *= -1;
    double ld1 = 53.702222439391875;
    fb1 = !ab1;
    Output.points[4][2] -= ad2;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab3 = ad4 > fd0;
    Thought lo2 = Thought75.getInstance(fd1, ld0, ld1, ad1);
    double ld3 = 327.33916603556713;
    ad1 = ad2 - ad3;

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
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;
    Thought lo0 = Thought359.getInstance(fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;

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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 169.31167937548219;
    fb1 = !ab1;
    ab2 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    Output.points[4][3] += fd0;
    lb1 = fd1 > ld0;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    Thought lo2 = Thought395.getInstance(fb0, fb1, lb1, ab1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo3 = Thought230.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    double ld0 = 383.9411248915459;
    fb0 = ad4 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld1 = 234.2938251238582;
    fb1 = fb0 && fb1;

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
    ad1 = ad2 + ad3;
    Output.points[4][4] += ad4;
    ab1 = fd0 > fd1;
    double ld0 = 46.69499236371734;
    ld0 = ad1 - ad2;
    Output.points[4][5] += ad3;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought320.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        double ld2 = 600.2841293667258;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m1();
}
    Thought lo0 = Thought179.getInstance(fb1, fb0, fb1, fb0);
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb1 = fb0 || fb1;
    lb1 = fd0 < fd1;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 238.4510855605035;
    ld0 *= -1;
    Output.points[4][6] -= fd0;
    fd1 *= -1;
    Output.points[4][7] += ld0;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought205.getInstance();
if(ao3 != null){
      ao3.m1(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought303.getInstance(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought88.getInstance(ao2, ao3, ao4, fo0);
    Output.points[4][8] -= fd1;
    ld0 *= -1;
    fb1 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
    ab2 = fd1 > ld0;
    fd0 *= -1;
    Output.points[5][0] -= fd1;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m3(fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    double ld4 = 689.6853551062221;
    ld0 = ld4 - fd0;

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
    Thought lo0 = Thought375.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ad1;
    Thought lo1 = Thought315.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
    boolean lb2 = true;
    Thought lo3 = Thought32.getInstance(fo0, fo1, ao1, ao2);
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    double ld4 = 290.4375248946274;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld4, ad1, fb1, lb2, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, lb2, ab1, ab2);
}
    Thought lo5 = Thought296.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld4 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld4, ad1);
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
    Thought lo0 = Thought103.getInstance();
    Output.points[5][1] += fd0;
    double ld1 = 855.9174949968564;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fd1 = ld1 + fd0;
        fb0 = fd1 > ld1;
    Thought lo3 = Thought373.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
    fd0 = fd1 + ld1;
    Output.points[5][2] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    Thought lo4 = Thought278.getInstance();
    fd1 = ld1 - fd0;
    double ld5 = 697.8572197755464;
    lb2 = fd0 < fd1;
    boolean lb6 = false;
    ld1 = ld5 + fd0;
    lb6 = fd1 > ld1;
    fb0 = ld5 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb2, lb6, fb0);
}
    fb1 = !lb2;

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
    double ld1 = 840.4279205760787;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = ld1 < fd0;
    fd1 *= -1;
    Output.points[5][3] += ld1;
    fd0 = fd1 + ld1;
    Thought lo2 = Thought8.getInstance(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
    boolean lb3 = false;
    Output.points[5][4] -= fd1;
    double ld4 = 375.94194097696254;
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld1);
}
    double ld5 = 725.5842051983632;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo0 = Thought155.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    Output.points[5][5] += fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    Thought lo1 = Thought300.getInstance(fo1, fo0, fo1, fo0);
    Output.points[5][6] += fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    Output.points[5][7] -= fd0;
        fb0 = fb1 || fb0;

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
