package genetic;
import java.util.ArrayList;
class Thought103 extends Thought{
private static ArrayList<Thought103> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 691.0030304804496;
private double fd1 = 501.3999952338687;
private Thought fo0 = null;
private Thought fo1 = null;
Thought103 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought103 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought103 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought103 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought103 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought103 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought103 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought103 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought103 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought103 instance = new Thought103 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought103 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought103 instance = new Thought103 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought103 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought103 instance = new Thought103 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought103 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought103 instance = new Thought103 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought103 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought103 instance = new Thought103 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought103 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought103 instance = new Thought103 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought103 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought103 instance = new Thought103 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought103 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought103 instance = new Thought103 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
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
      fo1.m1(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[2][0] -= fd0;
    ab3 = !ab4;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = fd1 > fd0;
    boolean lb0 = false;
    Output.points[2][1] -= fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;

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
    Output.points[2][2] -= ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = ad1 > ad2;
    Thought lo1 = Thought141.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    Output.points[2][3] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ad3 > ad4;
    Output.points[2][4] -= fd0;
    Output.points[2][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
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
    Thought lo0 = Thought266.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought90.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 > ad4;
    Thought lo2 = Thought106.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + ad1;
    Output.points[2][6] += ad2;
    boolean lb3 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    double ld4 = 763.332483858035;
    ab1 = ab2 && ab3;
    ad3 *= -1;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb3, ab1, ab2);
}
    ab3 = ad1 > ad2;
    boolean lb5 = false;
    ad3 = ad4 - fd0;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    if (fb0) {
        fb1 = fb0 || fb1;
        boolean lb0 = true;
        boolean lb1 = false;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        lb0 = fd0 > fd1;
        double ld2 = 369.560912391836;
        lb1 = !fb0;
        fb1 = ld2 < fd0;
        Output.points[2][7] += fd1;
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
        lb1 = ld2 < fd0;
        } else if (fb0) {
        fb1 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fb1 = fo0.m2();
}
        fb0 = fb1 && fb0;
        Thought lo3 = Thought322.getInstance(fb1, fb0, fb1, fb0);
        fd0 = fd1 - fd0;
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
    fb1 = fb0 || fb1;
    Output.points[2][8] -= ad2;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
        double ld0 = 716.4407570137618;
        Output.points[3][0] += ad2;
        boolean lb1 = false;
        boolean lb2 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb1);
}
if(ao2 != null){
          ld0 = ao2.m3(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
}
        Output.points[3][1] += fd0;
        Thought lo3 = Thought90.getInstance(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
        lb2 = fd1 > ld0;
        fb0 = fb1 && lb1;
        boolean lb4 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        boolean lb5 = true;
        lb2 = lb4 || lb5;
if(ao1 != null){
          fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
        double ld6 = 655.4022950747028;
        ad1 = ad2 - ad3;
if(ao1 != null){
          ao1.m1();
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb1, lb2, lb4);
}
        ad4 = fd0 - fd1;
        boolean lb7 = true;
        boolean lb8 = false;
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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fd0 *= -1;
    Output.points[3][2] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    double ld1 = 105.78594342513162;
    ld1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    ab1 = ld1 < fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[3][3] += fd1;
    Output.points[3][4] += ld1;

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
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab3 = ad4 > fd0;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
    ab4 = fb0 && fb1;
    ab1 = ad3 > ad4;
    double ld0 = 153.32274041137347;
    ab2 = ad4 < fd0;
    fd1 = ld0 - ad1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 313.0873663600584;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought314.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        double ld3 = 897.0862821709768;
        boolean lb4 = false;
        lb4 = ld0 > fd0;
        Output.points[3][5] += fd1;
        }
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
        fb0 = fb1 && lb2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    boolean lb5 = false;
    lb5 = fb0 && fb1;
        lb2 = lb5 && fb0;
if(fo1 != null){
      fo1.m2();
}
    double ld6 = 595.6757554160704;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb5, fb0, fb1);
}
    lb2 = lb5 || fb0;
    ld0 = ld6 + fd0;

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
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 925.2128646370718;
    ab4 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
        ab4 = fb0 || fb1;
    Thought lo1 = Thought185.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 12.464677661366538;
if(fo1 != null){
      ab1 = fo1.m2(ld0, ld2, fd0, fd1);
}
    boolean lb3 = true;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1);
}
    ld0 = ld2 + fd0;
    fd1 *= -1;
    Output.points[3][6] -= ld0;
    if (ab2) {
        ld2 = fd0 - fd1;
        ld0 = ld2 + fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld4 = 132.0146906681709;
        ab3 = !ab4;
        Thought lo5 = Thought46.getInstance(fb0, fb1, lb3, ab1);
        fd0 = fd1 + ld4;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    Thought lo1 = Thought280.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    double ld2 = 786.8441346778151;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Output.points[3][7] += fd0;
    boolean lb3 = true;
        double ld4 = 608.7746079341493;
    lb0 = !lb3;
    fd0 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, ld4, ad1);
}
    boolean lb5 = true;
    Output.points[3][8] -= ad2;
    Thought lo6 = Thought98.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      ld2 = fo1.m3();
}
    ld4 = ad1 + ad2;
    ad3 = ad4 - fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 242.07827508564134;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fb1 = ab1 || ab2;
    fd1 = ld0 + ad1;
    Output.points[4][0] += ad2;
    Output.points[4][1] += ad3;
    Thought lo1 = Thought316.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    ad1 = ad2 + ad3;
    Thought lo2 = Thought306.getInstance(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);

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
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Output.points[4][2] -= fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 764.5149175768657;
        double ld1 = 247.04808881599945;
    Output.points[4][3] += ld1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
    fd0 = fd1 + ld0;
    boolean lb2 = false;
    Output.points[4][4] += ld1;
    double ld3 = 376.1578049279006;
    fb0 = fb1 && lb2;
    Thought lo4 = Thought139.getInstance();
if(ao3 != null){
      ao3.m1(fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    double ld5 = 487.8980047707941;
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2, ld5, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 *= -1;
    double ld0 = 62.50764633834562;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    Output.points[4][5] += ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    double ld1 = 690.6267199831371;
    fb1 = !fb0;
    fb1 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld0, ld1);
}
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
    Thought lo2 = Thought278.getInstance();
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought184.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb4 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ld1);
}
if(ao2 != null){
      lb4 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m2();
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
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
        fb1 = fd1 < fd0;
        ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    Output.points[4][6] += fd1;
    boolean lb0 = true;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
    double ld1 = 370.773867496842;
    lb0 = !ab1;
    ld1 = fd0 - fd1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = ld1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
    ab1 = ld1 < fd0;
    Thought lo2 = Thought118.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
    ld1 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ao3.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    Thought lo0 = Thought343.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    double ld1 = 759.6007122173969;
    fb1 = !fb0;
    Thought lo2 = Thought146.getInstance();
    fd0 = fd1 - ld1;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb3, fb0);
}
    fd1 *= -1;
    ld1 *= -1;
    Output.points[4][7] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb3, fb0, fb1);
}
    fd0 = fd1 - ld1;
    Output.points[4][8] -= fd0;
    Output.points[5][0] -= fd1;
    Output.points[5][1] -= ld1;
    boolean lb4 = false;
    boolean lb5 = true;
    lb3 = fd0 > fd1;
    lb4 = lb5 && fb0;
    fb1 = ld1 < fd0;
    lb3 = fd1 > ld1;
    Thought lo6 = Thought86.getInstance(fd0, fd1, ld1, fd0, lb4, lb5, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb3, lb4, lb5, fb0);
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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        ab3 = !ab4;
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought112.getInstance();
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    Thought lo2 = Thought9.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
    ab3 = !ab4;
    double ld3 = 951.2920890433867;
    fb0 = !fb1;
    Output.points[5][2] -= fd0;
    fd1 *= -1;
    lb0 = !ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}

Thought.STACK_COUNTER++;
return ld3;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    Output.points[5][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
    boolean lb0 = false;
    Output.points[5][4] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = lb2 || ab1;
    fd1 *= -1;
    Thought lo3 = Thought338.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    boolean lb4 = false;
    boolean lb5 = false;
    double ld6 = 86.77422389171234;
    ad4 = fd0 + fd1;
    boolean lb7 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb5, lb7, ab1, ab2);
}
    boolean lb8 = true;
    ab2 = ld6 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    lb0 = !lb1;
        lb2 = ld6 < ad1;
    ad2 *= -1;
    lb4 = lb5 && lb7;

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
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Thought lo0 = Thought41.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(lb1, fb0, fb1, lb1);
}
    if (fb0) {
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
        lb1 = fd0 > fd1;
        Thought lo2 = Thought365.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
        boolean lb3 = true;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb3, lb1);
}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought317.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
    Thought lo1 = Thought273.getInstance();
    fd0 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    double ld3 = 919.1333355005694;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ad1, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab1 = ab2 || ab3;
    fd1 = fd0 - fd1;
    Output.points[5][5] += fd0;
    fd1 *= -1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 181.8635430842211;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
if(ao4 != null){
      ao4.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought118.getInstance(ad4, fd0, fd1, ad1);
    Thought lo2 = Thought235.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    boolean lb3 = true;
    lb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
    lb3 = ab1 && ab2;
    Output.points[5][6] += fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    Thought lo4 = Thought43.getInstance(ab3, ab4, fb0, fb1);
    lb0 = ad1 > ad2;
    Output.points[5][7] -= ad3;
    lb3 = ad4 < fd0;

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
    if (fb0) {
        fb1 = fb0 && fb1;
        fb0 = fd0 < fd1;
        fb1 = !fb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
        } else {
        fd1 = fd0 + fd1;
        boolean lb0 = true;
        boolean lb1 = true;
        boolean lb2 = true;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
        lb0 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        Output.points[5][8] -= fd1;
        }
    Thought lo0 = Thought8.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld1 = 579.8281367796768;
if(fo1 != null){
      ab1 = fo1.m2(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought177.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd0 > fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ad1;
    fb0 = !fb1;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld1 = 284.2525246348945;
        Thought lo2 = Thought314.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    boolean lb3 = true;
    lb3 = fb0 && fb1;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
}
    fd0 = fd1 - ld1;
    boolean lb5 = false;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;

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
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    double ld1 = 631.475870319811;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    Thought lo2 = Thought15.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
    double ld3 = 648.1751033387549;
if(fo0 != null){
      ld3 = fo0.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought152.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao1 != null){
      ao1.m2();
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    double ld2 = 760.9672710915991;
    boolean lb3 = true;
    Thought lo4 = Thought42.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, lb3, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, fd0, lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb0);
}
    lb3 = fb0 || fb1;
    double ld5 = 33.83793642189893;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    lb0 = lb3 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, ld5, fd0);
}
    double ld6 = 428.5299978094451;
    boolean lb7 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld5);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb1 = ao2.m2();
}
        }
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[6][0] += ad4;
    Output.points[6][1] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[6][2] -= ad2;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
    ab2 = fd1 > fd0;
    double ld0 = 586.4660346179969;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao1 != null){
      ao1.m2(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
    ld0 *= -1;

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
    ab2 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ad4 > fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought144.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    Output.points[6][3] -= ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m2();
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
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Thought lo0 = Thought389.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    double ld2 = 714.5153856127332;
    lb1 = fb0 && fb1;
    lb1 = fd0 < fd1;
    Thought lo3 = Thought373.getInstance(ld2, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    fd1 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
    lb1 = !lb4;
    double ld5 = 130.69607761618315;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld5, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld5, fd0, fd1);
}
    Output.points[6][4] -= ld2;
    fb1 = ld5 > fd0;
        lb1 = lb4 || fb0;
    fd1 = ld2 - ld5;
    Output.points[6][5] += fd0;
    fb1 = lb1 || lb4;

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
    fd1 = fd0 + fd1;
        fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 517.0180940906911;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Output.points[6][6] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought208.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ld0 > fd0;
    double ld2 = 379.80626494568173;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
}
    fb0 = fd0 > fd1;
        fb1 = fb0 || fb1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
        fb0 = fb1 && fb0;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 800.7834291309225;
    Thought lo3 = Thought140.getInstance(ld2, fd0, fd1, ld2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    double ld4 = 18.54607692277969;
    fd0 = fd1 - ld2;
    lb0 = lb1 || fb0;

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
