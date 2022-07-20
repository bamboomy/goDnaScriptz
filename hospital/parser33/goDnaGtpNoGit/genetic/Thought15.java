package genetic;
import java.util.ArrayList;
class Thought15 extends Thought{
private static ArrayList<Thought15> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 451.3806400945513;
private double fd1 = 269.9478832931421;
private Thought fo0 = null;
private Thought fo1 = null;
Thought15 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought15 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought15 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought15 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought15 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m1(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    fd0 *= -1;
    lb0 = lb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    boolean lb2 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    double ld3 = 118.20078495016665;
    lb2 = ld3 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, lb1, lb2, fb0, fb1);
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
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought265.getInstance(fd1, fd0, fd1, fd0);
        ab4 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb1 = false;
    fb0 = !fb1;
    fd1 *= -1;
    boolean lb2 = false;
    lb1 = lb2 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
}
    Thought lo3 = Thought306.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);

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
    fb0 = ad1 < ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought349.getInstance(fo1, fo0, fo1, fo0);
    lb0 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 459.51127671831347;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
        ad3 = ad4 + fd0;
    fb1 = !lb0;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 322.729328360514;
    ld0 = ad1 + ad2;
    ad3 *= -1;
    double ld1 = 213.33177055765438;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 *= -1;
        boolean lb2 = true;
    ld1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ld0 - ld1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
          fo1 = fo0.m4(ld1, ad1, ad2, ad3, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, ad1);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb0 = !fb1;
    boolean lb4 = false;
    boolean lb5 = false;
    Output.points[8][3] += fd1;
    lb2 = ld0 > ld1;
    lb3 = lb4 && lb5;

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
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought356.getInstance();
    Output.points[8][4] += fd1;
    double ld1 = 428.24951288928673;
    ld1 = fd0 - fd1;
if(ao1 != null){
      ld1 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    if (fb0) {
        fb1 = lb2 && fb0;
if(ao1 != null){
          fb1 = ao1.m2(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
        fb0 = fb1 || lb2;
        Output.points[8][5] += fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
        fb1 = !lb2;
        fd1 = ld1 - fd0;
        fb0 = fb1 || lb2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        double ld3 = 538.682033084638;
        fb0 = !fb1;
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
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
    fb0 = !fb1;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    Output.points[8][6] += ad2;
    Thought lo0 = Thought351.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
if(ao1 != null){
      ao1.m2();
}
    fb0 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;

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
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    fd0 *= -1;
    Output.points[8][7] += fd1;
    Thought lo0 = Thought56.getInstance(ao4, fo0, fo1, ao1);
    Output.points[8][8] -= fd0;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > fd0;

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
    ab2 = ab3 || ab4;
    double ld0 = 420.1385458804772;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
        Output.points[0][0] -= ld0;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld1 = 593.5162353358306;

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
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        ab2 = ab3 || ab4;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    double ld0 = 17.990730966085682;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    Output.points[0][1] -= ld0;
    boolean lb1 = false;
    Output.points[0][2] -= fd0;
    lb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    Output.points[0][3] -= ld0;
    Output.points[0][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    boolean lb2 = true;
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
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
    ad1 *= -1;
    fb1 = ad2 > ad3;
    if (fb0) {
        ad4 = fd0 + fd1;
        ad1 *= -1;
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 - ad1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        Output.points[0][5] -= fd1;
        boolean lb0 = true;
        double ld1 = 346.19447068604615;
        ld1 = ad1 + ad2;
        ad3 = ad4 + fd0;
        Thought lo2 = Thought188.getInstance(fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
    Thought lo0 = Thought8.getInstance(ad3, ad4, fd0, fd1);
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    ad3 *= -1;
    ab1 = ad4 < fd0;
    fd1 *= -1;
    ab2 = !ab3;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    double ld1 = 914.2547449003362;
    Output.points[0][6] += ld1;
    Thought lo2 = Thought186.getInstance(fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought312.getInstance(fd0, fd1, ld1, ad1, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought120.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    ad2 = ad3 + ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    Output.points[0][7] += fd1;
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb0, lb1);
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
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 300.1819265737513;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    double ld3 = 8.47789490264217;
    Thought lo4 = Thought42.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    double ld5 = 727.4611451084786;
    lb0 = lb2 || fb0;
    fb1 = !lb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld3);
}
    double ld6 = 365.87652489111775;
    lb2 = ld5 > ld6;

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
      fd0 = ao2.m3();
}
if(ao3 != null){
      fd1 = ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    ab3 = fd0 < fd1;
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao4.m3();
}
    ad3 = ad4 + fd0;
    lb0 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought44.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fd0 > fd1;
    Output.points[0][8] += ad1;
    lb0 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    double ld2 = 380.4331795204028;
    Thought lo3 = Thought293.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1);
if(fo1 != null){
      fo1.m3();
}
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    lb0 = ld2 > ad1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad2 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
          ab2 = ao1.m2(ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    fd1 *= -1;
    lb1 = fb0 && fb1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 > fd1;
        lb1 = lb2 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb1 = lb0 || lb1;
        fd0 *= -1;
        Thought lo3 = Thought255.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    fb0 = fb1 || ab1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Output.points[1][0] += fd1;
    Output.points[1][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;

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
        fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[1][2] -= ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m3();
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought115.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld1 = 646.1072072171235;
        fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = ad3 < ad4;
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought143.getInstance(fd0, fd1, ad1, ad2);
    Thought lo3 = Thought142.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
    double ld5 = 648.3153168896486;
    ld5 = ad1 + ad2;
    Thought lo6 = Thought383.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(ld5, ad1, ad2, ad3, lb4, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo7 = Thought256.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, lb4, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;

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
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    double ld1 = 69.11648396446482;
    Thought lo2 = Thought277.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb3 = false;
    Thought lo4 = Thought102.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && lb0;
    lb3 = !fb0;
    Output.points[1][3] -= fd1;
    fb1 = !lb0;
if(ao4 != null){
      ld1 = ao4.m3(fd0, fd1, ld1, fd0);
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
    ad1 = ad2 - ad3;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought67.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    Output.points[1][4] -= ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought386.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought23.getInstance();
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = !lb0;
    double ld1 = 291.3589157085344;
    for(int i0=0; i0<10; i0++){
        ab1 = fd0 > fd1;
        ld1 = fd0 + fd1;
        boolean lb2 = true;
        ld1 = fd0 + fd1;
        boolean lb3 = false;
        ld1 = fd0 - fd1;
        Output.points[1][5] += ld1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        double ld4 = 461.6925363543368;
        lb2 = ld1 > fd0;
        fd1 = ld4 + ld1;
        boolean lb5 = true;
        fd0 *= -1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        fd1 = ld4 - ld1;
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld4, ld1, fd0);
}
        lb3 = fd1 < ld4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 790.1059964622876;
    double ld1 = 639.7892361729447;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = ab2 || ab3;
if(ao4 != null){
      ld0 = ao4.m3(ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought1.getInstance(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    double ld3 = 126.56363664534372;
    ad3 *= -1;
    fb1 = !ab1;
    Output.points[1][6] -= ad4;
    fd0 *= -1;
    double ld4 = 106.55998436173104;
    if (ab2) {
        ab3 = fd0 > fd1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fd0 *= -1;
    Output.points[1][7] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
        lb0 = lb1 || fb0;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
    Thought lo0 = Thought249.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab4 = !fb0;
    fb1 = fd1 > fd0;
    Thought lo1 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought386.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    Thought lo0 = Thought20.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo0.m2();
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought26.getInstance(fb1, fb0, fb1, fb0);
    ad3 = ad4 - fd0;
    boolean lb2 = false;
    fd1 = ad1 - ad2;
    double ld3 = 501.16252876348534;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m3(ld3, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = lb0 || ab1;
    fd0 = fd1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab4 = !fb0;
    Thought lo1 = Thought76.getInstance();
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb0 = ad4 > fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought322.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        lb2 = fd0 > fd1;
        ab1 = ab2 && ab3;
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
    Output.points[1][8] += fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    double ld0 = 152.39157398530764;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = ld0 < fd0;
    fb0 = fd1 < ld0;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao2.m3();
}
    fd0 *= -1;
    Thought lo1 = Thought251.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    Thought lo2 = Thought29.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
              fb1 = ao1.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = !fb1;
    Output.points[2][0] += fd1;
    boolean lb3 = false;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    boolean lb0 = false;
if(ao2 != null){
      ad4 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao4.m2(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    double ld1 = 790.3115786516493;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fb0 = !fb1;
        double ld2 = 675.3470636612086;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld1 = 916.3528007798367;
    Thought lo2 = Thought193.getInstance();
    ab2 = fd0 < fd1;
    ld1 = fd0 + fd1;
    ab3 = ab4 && fb0;
if(ao1 != null){
      ao1.m3(fb1, lb0, ab1, ab2);
}
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    ld1 *= -1;
    fd0 *= -1;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    lb0 = !lb3;
    fd0 *= -1;
    boolean lb4 = true;
    fd1 = ld1 + fd0;
if(ao3 != null){
      lb4 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Output.points[2][1] += fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ld1 = fd0 + fd1;

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
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    double ld1 = 741.2951296391795;
    Thought lo2 = Thought80.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
    ab1 = ad1 > ad2;
    Thought lo3 = Thought360.getInstance();
    ad3 = ad4 + fd0;
    boolean lb4 = false;
    ab1 = fd1 > ld1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb4;
    ab1 = ad1 < ad2;
    ab2 = ab3 && ab4;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 383.1947941163397;
    fb0 = !fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb0 = !lb2;
    fd0 = fd1 - ld1;
    lb3 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
    fd0 = fd1 - ld1;
    Output.points[2][2] += fd0;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb2, lb3, fb0);
}
    Thought lo4 = Thought273.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, lb2, lb3);
    Thought lo5 = Thought280.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;

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
    Thought lo0 = Thought391.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb2 = true;
    lb2 = fd1 > fd0;
    fb0 = fd1 > fd0;
    boolean lb3 = true;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fd0 < fd1;

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
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[2][3] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[2][4] += fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    Output.points[2][5] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought17.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
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
}
