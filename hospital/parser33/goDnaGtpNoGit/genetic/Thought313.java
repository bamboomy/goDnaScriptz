package genetic;
import java.util.ArrayList;
class Thought313 extends Thought{
private static ArrayList<Thought313> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 929.1119358755265;
private double fd1 = 80.95040590263575;
private Thought fo0 = null;
private Thought fo1 = null;
Thought313 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought313 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought313 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought313 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought313 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought313 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought313 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought313 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought313 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought313 instance = new Thought313 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought313 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought313 instance = new Thought313 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought313 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought313 instance = new Thought313 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought313 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought313 instance = new Thought313 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought313 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought313 instance = new Thought313 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought313 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought313 instance = new Thought313 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought313 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought313 instance = new Thought313 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought313 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought313 instance = new Thought313 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      fd1 = fo0.m3(lb3, fb0, fb1, lb0);
}
    double ld4 = 317.0221855932053;
    Thought lo5 = Thought259.getInstance(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, lb1, lb2, lb3, fb0);
    boolean lb6 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld4, fd0, lb0, lb1, lb2, lb3);
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    double ld1 = 117.40389609128972;
    if (ab4) {
        Output.points[6][0] -= fd0;
        boolean lb2 = true;
        ab4 = fd1 > ld1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        fd1 = ld1 + fd0;
        fb1 = fd1 > ld1;
        Output.points[6][1] += fd0;
        lb2 = lb0 && ab1;
        ab2 = fd1 < ld1;
        ab3 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
        ab4 = !fb0;
        fd0 = fd1 - ld1;
        fb1 = lb2 || lb0;
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
      fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[6][2] -= fd1;
    Thought lo0 = Thought347.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    double ld1 = 916.107944516084;
    ld1 = ad1 - ad2;
    boolean lb2 = false;
    ad3 = ad4 - fd0;
    double ld3 = 515.5740711902138;
    Thought lo4 = Thought396.getInstance(fo0, fo1, fo0, fo1);
    Output.points[6][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld3, ad1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld5 = 193.96380254166718;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld1;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    boolean lb6 = true;
    fb0 = ld3 > ld5;
    fb1 = lb2 || lb6;
    boolean lb7 = false;
    boolean lb8 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb7, lb8, fb0, fb1);
}
    double ld9 = 435.64778367992085;
    Thought lo10 = Thought68.getInstance(ad4, fd0, fd1, ld1, lb2, lb6, lb7, lb8);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb6);
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
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
    boolean lb0 = false;
    Thought lo1 = Thought296.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    ad1 *= -1;
    boolean lb2 = true;
            Thought lo3 = Thought91.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
}
    double ld4 = 719.3424850031045;
    ld4 = ad1 + ad2;
    double ld5 = 604.3877149612805;
    ab1 = ad2 < ad3;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld4, ab4, fb0, fb1, lb0);
}
    ld5 = ad1 + ad2;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought58.getInstance(ao2, ao3, ao4, fo0);
    Output.points[6][4] += fd0;
    Thought lo3 = Thought20.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    double ld4 = 778.7432552357108;
if(fo0 != null){
      lb1 = fo0.m2();
}
    fb0 = fb1 || lb0;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m3(lb1, lb5, fb0, fb1);
}
    Output.points[6][5] += ld4;
    Thought lo6 = Thought196.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld4, fd0, lb0, lb1, lb5, fb0);
    fb1 = lb0 && lb1;

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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 686.9280425841961;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ad1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    Output.points[6][6] += fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    if (fb0) {
        double ld1 = 595.8492932711374;
        ld1 = ld0 - ad1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought144.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
        fd1 *= -1;
        Output.points[6][7] += ld1;
        fb1 = fb0 && fb1;
        Thought lo3 = Thought359.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
        ad4 *= -1;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        boolean lb4 = true;
        fb0 = ld1 > ld0;
        Thought lo5 = Thought157.getInstance(fo0, fo1, ao1, ao2);
        } else {
        ad2 = ad3 - ad4;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
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
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m3();
}
    Output.points[6][8] += fd1;
    Thought lo0 = Thought112.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    fd0 *= -1;

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
        ab1 = ad2 > ad3;
    boolean lb0 = true;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;

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
    Thought lo0 = Thought15.getInstance();
    Output.points[7][0] -= fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3();
}
        fb0 = fb1 || lb1;
        fb0 = fb1 && lb1;
        double ld2 = 443.9339622978532;
        fd0 = fd1 - ld2;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, fb0);
}
        Thought lo3 = Thought74.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
if(fo1 != null){
          fd1 = fo1.m3(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 || ab2;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && ab1;
    Thought lo0 = Thought64.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;

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
    fb0 = !fb1;
    Thought lo0 = Thought81.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ad1;
    boolean lb1 = false;
    Thought lo2 = Thought388.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    double ld3 = 244.53063640616298;
    ld3 = ad1 - ad2;
    double ld4 = 403.5908682325702;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld3);
}
    Output.points[7][1] += ld4;
    double ld5 = 619.5007457155091;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ld3 = ld4 + ld5;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb0) {
        Output.points[7][2] -= ad1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
        boolean lb6 = false;
        boolean lb7 = false;
        ad2 = ad3 - ad4;
if(fo0 != null){
          lb6 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld4, lb7, lb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ld5, ad1, ad2, ad3, lb6, lb7, lb1, fb0);
}
        fb1 = ad4 > fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Output.points[7][3] -= ad1;
    Output.points[7][4] -= ad2;
    ad3 = ad4 + fd0;
    ab3 = fd1 < ad1;
    ab4 = ad2 < ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    ad2 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        double ld0 = 642.5207107953847;
if(ao1 != null){
          ld0 = ao1.m3();
}
if(ao2 != null){
          fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ld0;
        fb1 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
if(ao3 != null){
          fd1 = ao3.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
        fd0 *= -1;
        Thought lo2 = Thought355.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
        lb1 = fd1 > ld0;
        fd0 *= -1;
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
    Thought lo0 = Thought51.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > ad1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought117.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    boolean lb2 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab4 = fd0 < fd1;
    boolean lb2 = false;
    Output.points[7][5] += fd0;
    fd1 *= -1;
    boolean lb3 = true;
if(ao1 != null){
          ab3 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[7][6] += fd1;

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
    Output.points[7][7] -= ad1;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    ab3 = !ab4;
    Output.points[7][8] += ad2;
    Thought lo1 = Thought71.getInstance(fb0, fb1, lb0, ab1);
    double ld2 = 659.1558641687039;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld2, ad1, ad2, fb1, lb0, ab1, ab2);
}
    ab3 = ad3 < ad4;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 722.481980602558;
        lb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
        fd0 = fd1 - ld2;
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
    double ld0 = 727.0718982410873;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    Output.points[8][0] += ad4;
    Thought lo1 = Thought364.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
        if (fb0) {
        fd0 *= -1;
        Output.points[8][1] += fd1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    ad3 *= -1;
    boolean lb0 = false;
    double ld1 = 725.7440337794441;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    ab2 = ad2 > ad3;
if(fo1 != null){
          ab3 = fo1.m2();
}
    double ld2 = 755.191125576996;
    ad3 = ad4 - fd0;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    fd1 = ld1 - ld2;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
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
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Output.points[8][2] += fd0;
    fb1 = fd1 < fd0;
    Output.points[8][3] -= fd1;
    double ld0 = 729.1847794097889;
    double ld1 = 838.3432922413509;
    boolean lb2 = true;
    lb2 = !fb0;

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
    fb0 = ad2 < ad3;
    Output.points[8][4] += ad4;
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought300.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld1 = 663.9820320107567;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd0 > fd1;
    boolean lb0 = true;
    Output.points[8][5] -= fd0;
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    ab3 = !ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    if (lb0) {
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
        Output.points[8][6] += fd0;
        ab2 = fd1 > fd0;
        boolean lb1 = true;
        Thought lo2 = Thought396.getInstance(ao4, fo0, fo1, ao1);
        double ld3 = 825.3410086831456;
        double ld4 = 328.0183459841874;
        ab2 = ld4 > fd0;
if(ao2 != null){
          ao2.m3(fd1, ld3, ld4, fd0);
}
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld3, ld4, fd0);
}
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
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought86.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    double ld1 = 599.1321772655818;
    fb0 = fb1 || ab1;
    double ld2 = 736.9047516763507;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Output.points[8][7] -= ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = ld2 > ad1;
    Output.points[8][8] -= ad2;
    double ld3 = 981.8165173045943;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = !fb1;
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld1, ld2, ld3);
}
    boolean lb4 = true;
    ab1 = ad1 > ad2;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    double ld0 = 654.4224812257874;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    Thought lo1 = Thought56.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    Output.points[0][0] += ld0;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought166.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    Output.points[0][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    Output.points[0][2] += ld0;

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
    Thought lo0 = Thought262.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    Output.points[0][3] += fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1);
}
        if (ab2) {
            } else if (ab3) {
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
              fo0.m3();
}
            ab4 = fb0 || fb1;
            lb1 = ab1 && ab2;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought81.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    Output.points[0][4] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    fd1 = ad1 - ad2;
    double ld2 = 322.8779949234317;

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
    Thought lo0 = Thought308.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    Output.points[0][5] -= ad1;
    double ld1 = 236.80994917719553;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    Thought lo3 = Thought277.getInstance(lb2, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb2);
}
    ad4 *= -1;
    ab1 = ab2 && ab3;
    Thought lo4 = Thought129.getInstance(fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb2);
    boolean lb5 = false;
    lb5 = !ab1;
    Thought lo6 = Thought362.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    double ld7 = 554.7810032212283;
    boolean lb8 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
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
    fd0 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 747.3575557459357;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fd1 = ld0 - fd0;
    Output.points[0][6] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = ld0 < fd0;
    boolean lb2 = false;
    Thought lo3 = Thought47.getInstance(fd1, ld0, fd0, fd1);
    fb0 = fb1 && lb1;
    ld0 *= -1;
    lb2 = fd0 > fd1;
    ld0 = fd0 + fd1;
    fb0 = fb1 || lb1;
    lb2 = ld0 > fd0;
    Thought lo4 = Thought38.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
if(ao1 != null){
      ao1.m2();
}
    fb0 = ld0 < fd0;

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
    Output.points[0][7] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Output.points[0][8] += ad2;
    fb1 = ad3 > ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Thought lo1 = Thought33.getInstance(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
    Thought lo2 = Thought232.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
    fd1 = ad1 + ad2;
    fb0 = fb1 && lb0;
    boolean lb4 = false;
    lb3 = lb4 && fb0;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad4 = fd0 + fd1;
    lb0 = ad1 > ad2;
    boolean lb5 = true;
    boolean lb6 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb3, lb4, lb5, lb6);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb0, lb3, lb4);
}
    lb5 = !lb6;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(ao4 != null){
      ab1 = ao4.m2(fd1, fd0, fd1, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][0] += ad2;
    double ld0 = 233.8161206413396;
    ab1 = ad2 > ad3;
    ab2 = ad4 < fd0;
    boolean lb1 = false;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = !fb1;
if(ao4 != null){
      ao4.m2(lb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    ab3 = fd1 < ld0;
    ab4 = ad1 < ad2;
    double ld3 = 626.0182669907456;
    ad2 = ad3 - ad4;
    Thought lo4 = Thought234.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld3, fb0, fb1, lb1, lb2);
    ab1 = !ab2;
    ab3 = !ab4;
if(ao3 != null){
      ao3.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + ld0;
    fb0 = ld3 > ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld3, ad1);
}
    for(int i0=0; i0<10; i0++){
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
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Thought lo0 = Thought250.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought56.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    double ld3 = 602.475154869359;
    Thought lo4 = Thought113.getInstance(fd0, fd1, ld3, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
    double ld5 = 821.6755720987954;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Output.points[1][1] += fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought280.getInstance();
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
        boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb1;
    fd0 *= -1;

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
        fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    lb1 = fb0 || fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    double ld3 = 512.541376146679;
    Thought lo4 = Thought191.getInstance(ld3, fd0, fd1, ld3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    Thought lo5 = Thought376.getInstance();
if(fo0 != null){
      fo0.m3(lb0, lb1, lb2, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
