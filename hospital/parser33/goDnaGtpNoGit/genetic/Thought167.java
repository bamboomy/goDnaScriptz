package genetic;
import java.util.ArrayList;
class Thought167 extends Thought{
private static ArrayList<Thought167> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 281.82691700491205;
private double fd1 = 869.5287641222576;
private Thought fo0 = null;
private Thought fo1 = null;
Thought167 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought167 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought167 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought167 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought167 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought167 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought167 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought167 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought167 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought167 instance = new Thought167 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought167 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought167 instance = new Thought167 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought167 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought167 instance = new Thought167 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought167 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought167 instance = new Thought167 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought167 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought167 instance = new Thought167 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought167 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought167 instance = new Thought167 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought167 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought167 instance = new Thought167 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought167 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought167 instance = new Thought167 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought287.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
        fd1 *= -1;
    Output.points[1][5] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    if (fb0) {
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
    double ld0 = 101.80947727492713;
    ab2 = ab3 && ab4;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    ab3 = !ab4;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ld0 < fd0;
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = false;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fd1 > ad1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, fb0);
}
    double ld1 = 218.94779612769918;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    double ld2 = 651.3707485466136;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb1 = lb0 && fb0;
    boolean lb3 = true;
    fd1 = ld1 - ld2;
    Thought lo4 = Thought224.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb0 = fb1 && lb0;
    fd0 *= -1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
    ab3 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
        Output.points[1][6] -= ad2;
    double ld2 = 371.4187133417401;
    ad2 *= -1;
    ad3 *= -1;
    ab4 = ad4 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld2, ad1, ad2, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 491.82251542165227;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought153.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, ld3, ad1);
if(fo0 != null){
      fo0.m2();
}
    ad2 = ad3 + ad4;
    Thought lo5 = Thought364.getInstance(lb0, lb1, ab1, ab2);
    ab3 = fd0 > fd1;
    Output.points[1][7] -= ld2;
    ld3 = ad1 - ad2;
    ad3 *= -1;
    ab4 = ad4 < fd0;
    fb0 = fd1 < ld2;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    Thought lo0 = Thought14.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
        fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
        fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought92.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought183.getInstance(fo1, ao1, ao2, ao3);
    Thought lo1 = Thought241.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    boolean lb3 = true;
    fd1 *= -1;
    Thought lo4 = Thought46.getInstance();
    lb2 = lb3 && ab1;
    fd0 *= -1;
if(ao3 != null){
          fd1 = ao3.m3(ab2, ab3, ab4, fb0);
}
    Output.points[1][8] -= fd0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb2, lb3, ab1, ab2);
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought178.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = fd0 < fd1;
        double ld1 = 667.6004277575225;
    ab2 = ab3 && ab4;
    Output.points[2][0] -= ld1;
    Output.points[2][1] -= ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb3 = true;
    double ld4 = 545.3413810787398;

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
    boolean lb0 = true;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[2][2] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb3 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = !lb1;
    boolean lb4 = false;
    lb2 = fd0 > fd1;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb0);
}
    lb1 = lb2 && lb3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb0);
}
    Thought lo5 = Thought278.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, lb3, lb4);
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    if (ab1) {
        ab2 = ab3 || ab4;
        boolean lb0 = true;
        Output.points[2][3] -= fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        ab4 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    Thought lo0 = Thought310.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 858.0751235892258;
    ld2 *= -1;
    fb0 = fb1 || lb1;
    double ld3 = 180.20385403374672;
    boolean lb4 = true;
    ld3 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld2);
}
    Thought lo5 = Thought245.getInstance(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
if(fo0 != null){
      lb4 = fo0.m2();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb4, fb0, fb1);
}
    ld2 = ld3 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, lb4, fb0, fb1);
}
    lb1 = !lb4;
    fb0 = fb1 || lb1;

Thought.STACK_COUNTER++;
return lb4;
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
    Output.points[2][4] -= ad2;
    ab1 = ab2 || ab3;
    ad3 = ad4 - fd0;
    ab4 = fb0 && fb1;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb0 = true;
    ad1 = ad2 + ad3;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ad4 < fd0;
    double ld1 = 738.4968108374493;
    fd0 *= -1;
    double ld2 = 744.4336033217215;
    for(int i0=0; i0<10; i0++){
        double ld3 = 78.25227566236521;
        ad4 *= -1;
        lb0 = fd0 > fd1;
if(fo1 != null){
          ab1 = fo1.m2(ld3, ld1, ld2, ad1);
}
        boolean lb4 = true;
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
    Output.points[2][5] += fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought238.getInstance();
    fb1 = fb0 && fb1;
    Thought lo1 = Thought74.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought384.getInstance(ao4, fo0, fo1, ao1);
    double ld3 = 97.9891298113297;
    fb1 = ld3 > ad1;
    boolean lb4 = true;
    double ld5 = 0.6450529778575567;
    double ld6 = 872.8753640637059;
    lb4 = ld6 > ad1;

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
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = lb1 && lb2;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought20.getInstance();
if(ao4 != null){
      ao4.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
    Thought lo4 = Thought332.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb2, ab1, ab2);
}
    fd1 = fd0 - fd1;
    Thought lo5 = Thought116.getInstance(ao4, fo0, fo1, ao1);
    Output.points[2][6] -= fd0;
    Thought lo6 = Thought377.getInstance(fd1, fd0, fd1, fd0);
    ab3 = fd1 > fd0;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo7 = Thought311.getInstance();
        fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
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
    ab2 = ab3 && ab4;
    fb0 = ad1 < ad2;
    double ld0 = 5.072155636113334;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ld0 = ad1 - ad2;
    ab4 = ad3 < ad4;
    boolean lb1 = true;
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ld0, ad1);
}
    lb1 = ab1 && ab2;
    double ld2 = 475.39919490377605;
    Output.points[2][7] += ad1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab3 = fd1 > ld0;
if(ao2 != null){
      ab4 = ao2.m2();
}
    fb0 = fb1 || lb1;
    ld2 = ad1 - ad2;
    ab1 = ad3 < ad4;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    if (fb0) {
if(ao4 != null){
          ao3 = ao4.m4(fb1, lb1, ab1, ab2);
}
        double ld3 = 453.2074725360374;
        boolean lb4 = true;
        ld3 = ld0 + ld2;
        ab2 = ad1 > ad2;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought226.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought94.getInstance(fd1, fd0, fd1, fd0);
    double ld2 = 144.05349728170242;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
    Thought lo3 = Thought230.getInstance(fb0, fb1, fb0, fb1);
    fd1 *= -1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought169.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd1 > ld2;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    double ld5 = 568.8481186945703;

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
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
    Output.points[2][8] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = fd1 > fd0;
    double ld0 = 89.21353563587596;
    ab4 = fd0 > fd1;
    double ld1 = 80.35941557655597;
    fb0 = ld0 > ld1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    Output.points[3][0] -= ld1;
    double ld2 = 998.1530724411398;
    ab4 = ld2 > fd0;

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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[3][1] += ad1;
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought342.getInstance();
    Output.points[3][2] += ad1;
    fb0 = !fb1;
    double ld1 = 66.85165967844479;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    Thought lo2 = Thought234.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ab3 = ad3 < ad4;
    ab4 = !fb0;
    double ld0 = 430.0634798308421;
    double ld1 = 436.6678509792371;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = ld0 > ld1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    ld1 = ad1 + ad2;
    double ld2 = 679.9631394929852;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 997.4433504878729;
    Output.points[3][3] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
    double ld1 = 12.47262474519311;
    boolean lb2 = false;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0);
}
    fb0 = fb1 && lb2;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ld1 = ao3.m3(fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1, lb2, fb0, fb1, lb2);
}
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
}
    Output.points[3][4] -= fd0;
    Output.points[3][5] -= fd1;
    ld0 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, ld1, fd0, fd1);
}
    Output.points[3][6] += ld0;
    ld1 *= -1;

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
    Thought lo0 = Thought14.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fb1 = fd1 > ad1;
    if (fb0) {
        ad2 = ad3 - ad4;
        double ld1 = 272.45339829663754;
        fb1 = fb0 && fb1;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        fb0 = ad4 > fd0;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
        ad3 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
}
        fb0 = !fb1;
        lb2 = fb0 && fb1;
        lb2 = ad1 > ad2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb3 = true;
        ad3 = ad4 + fd0;
        fd1 = ld1 + ad1;
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
        Output.points[3][7] -= fd1;
        lb3 = ld1 > ad1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
if(ao1 != null){
          ao1.m1(fb1, lb2, lb3, fb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, fb1, lb2, lb3, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    boolean lb0 = false;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought155.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld2 = 500.28791078052006;
    Thought lo3 = Thought362.getInstance();
    fd0 = fd1 - ld2;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, ab1, ab2);
}
    ab3 = fd1 < ld2;
    ab4 = fb0 || fb1;
    fd0 *= -1;
    lb0 = !ab1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2, fb1, lb0, ab1, ab2);
}
    Output.points[3][8] += fd0;
    fd1 = ld2 - fd0;
    ab3 = !ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(ld2, fd0, fd1, ld2);
}
    fd0 *= -1;
    ab2 = fd1 < ld2;
    ab3 = ab4 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0);
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
    ab1 = ab2 && ab3;
    double ld0 = 456.4149404714936;
    ld0 = ad1 + ad2;
    ab4 = !fb0;
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ao2.m1(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ld0 = ad1 - ad2;
        ad3 = ad4 - fd0;
    boolean lb1 = false;
    lb1 = !ab1;
    Thought lo2 = Thought214.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought325.getInstance(fd1, ld0, ad1, ad2);
    ad3 = ad4 - fd0;

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
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought33.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    if (fb0) {
        fd1 *= -1;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          fo0.m1(fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought175.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 > fd0;
        Thought lo2 = Thought160.getInstance();
        fb1 = fb0 || fb1;
        } else if (fb0) {
        Output.points[4][0] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        fb0 = fb1 || fb0;
        fb1 = fd0 > fd1;
        fb0 = !fb1;
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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld0 = 335.5816208108772;
    if (fb1) {
        ab1 = ld0 < fd0;
        Output.points[4][1] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        double ld1 = 49.82153389278392;
        double ld2 = 229.04641289613352;
if(fo0 != null){
          fo0.m2(ld1, ld2, ld0, fd0);
}
        ab2 = fd1 < ld1;
        } else {
        if (ab3) {
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought391.getInstance();
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
    fb1 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = !fb0;
    fb1 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[4][2] += fd1;
    fb0 = ad1 > ad2;
    Output.points[4][3] -= ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Output.points[4][4] -= fd1;
    fb1 = !fb0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    if (ab2) {
        ab3 = fd0 > fd1;
        boolean lb0 = true;
        ab3 = ab4 || fb0;
        Thought lo1 = Thought21.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
        boolean lb2 = false;
        boolean lb3 = false;
        ad1 *= -1;
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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
    double ld2 = 186.47096633113546;
    lb1 = fb0 && fb1;
    fd0 *= -1;
    Output.points[4][5] -= fd1;
    boolean lb3 = false;
    Thought lo4 = Thought4.getInstance(ao2, ao3, ao4, fo0);
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(ld2, fd0, fd1, ld2);
}
    lb0 = lb1 || lb3;
    fd0 = fd1 + ld2;
    fb0 = fb1 && lb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
    boolean lb5 = true;
if(fo1 != null){
      fo1.m1();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought331.getInstance(fb1, fb0, fb1, fb0);
    ad1 *= -1;
    Thought lo1 = Thought378.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < ad1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    ad2 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    ad3 *= -1;
    ad4 = fd0 + fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 899.9001028708219;
    if (ab4) {
        fd0 *= -1;
if(ao1 != null){
          fd1 = ao1.m3();
}
        ld0 = fd0 + fd1;
if(ao2 != null){
          ao2.m1(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
        ab2 = !ab3;
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
    boolean lb0 = true;
    boolean lb1 = true;
    Thought lo2 = Thought1.getInstance(ao2, ao3, ao4, fo0, lb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
        ad1 *= -1;
    Output.points[4][6] += ad2;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought389.getInstance(fd1, ad1, ad2, ad3);
    Output.points[4][7] += ad4;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo0 != null){
      lb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    ad1 = ad2 - ad3;
    boolean lb4 = true;
    ad4 = fd0 - fd1;
        Output.points[4][8] += ad1;
    lb1 = !lb4;
    double ld5 = 214.99217895945793;

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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    fd1 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
    double ld2 = 390.8468952979631;
    ld2 = fd0 - fd1;

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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought244.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 322.77255152179225;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought81.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = ld1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo3 = Thought283.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fb0 = fd1 < ld1;
    boolean lb4 = false;
    fb0 = fd0 > fd1;
    fb1 = lb4 || fb0;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    boolean lb5 = true;
    fb0 = fb1 && lb4;
    fd1 = ld1 + fd0;
    boolean lb6 = true;
    double ld7 = 823.605362643641;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ld7 = fo0.m3();
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - fd0;
        boolean lb0 = false;

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
