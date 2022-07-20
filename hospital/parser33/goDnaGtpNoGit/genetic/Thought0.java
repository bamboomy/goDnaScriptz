package genetic;
import java.util.ArrayList;
class Thought0 extends Thought{
private static ArrayList<Thought0> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 931.6655922875123;
private double fd1 = 61.14556449488697;
private Thought fo0 = null;
private Thought fo1 = null;
Thought0 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought0 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought0 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought0 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought0 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought117.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    Output.points[0][0] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || fb0;
    boolean lb1 = false;
    Output.points[0][1] -= fd0;
    fb0 = !fb1;
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought200.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);

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
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    double ld1 = 919.9633970689159;
    fb0 = fb1 && lb0;
    ab1 = !ab2;
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 < ld1;
    Output.points[0][2] += fd0;

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[0][3] -= fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    Output.points[0][4] -= fd0;
    fb1 = fd1 < ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    double ld0 = 688.5216280980043;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 622.1648967071354;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ld1 = ad1 + ad2;
    Thought lo2 = Thought137.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
}
    fb0 = ad3 < ad4;

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
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    Output.points[0][5] += ad1;
    fb1 = !ab1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    double ld1 = 317.89011046125717;
    Output.points[0][6] += ld1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought259.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    double ld0 = 948.5609620234326;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = lb1 && fb0;
if(ao3 != null){
      fb1 = ao3.m2(ld0, fd0, fd1, ld0);
}
    boolean lb2 = false;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    lb1 = fd1 < ld0;

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
      ad2 = ao1.m3();
}
    Thought lo0 = Thought278.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = lb1 || fb0;
    Output.points[0][7] += ad1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought178.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);

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
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    double ld2 = 263.0744629764365;
    lb1 = !ab1;
    Output.points[0][8] -= fd0;
    ab2 = fd1 > ld2;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
    ab2 = !ab3;
    ab4 = ld2 > fd0;
    fb0 = fd1 > ld2;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab2 = ao4.m2(fd0, fd1, ld2, fd0);
}
    ab3 = !ab4;
    fd1 = ld2 + fd0;
    boolean lb3 = false;
    ab4 = fb0 || fb1;

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
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m1();
}
    Thought lo0 = Thought270.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Output.points[1][0] += ad1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought241.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 < ad2;
    Thought lo2 = Thought217.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    double ld3 = 455.3448366721515;
    ab1 = !ab2;
    ab3 = !ab4;
    fb0 = ad2 < ad3;
    boolean lb4 = true;
    fb0 = fb1 && lb4;
    ab1 = ab2 || ab3;
    Output.points[1][1] += ad4;
    fd0 *= -1;
    fd1 = ld3 + ad1;

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
    Output.points[1][2] += fd0;
    Thought lo0 = Thought162.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld1 = 676.8955288262956;
    fb0 = ld1 > fd0;
    boolean lb2 = true;
    Output.points[1][3] += fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
if(fo0 != null){
          fd0 = fo0.m3(lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, lb3, fb0, fb1, lb2);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 786.2262712459363;
    ld0 = fd0 - fd1;
    ab1 = ab2 || ab3;
    ld0 = fd0 + fd1;
    ab4 = ld0 > fd0;
    fb0 = fd1 < ld0;
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2();
}
    Thought lo2 = Thought43.getInstance(ab2, ab3, ab4, fb0);
    double ld3 = 552.4809552709161;
    Thought lo4 = Thought162.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
    ld3 *= -1;
    Output.points[1][4] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld3, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld0 - ld3;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Thought lo0 = Thought230.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    if (fb1) {
        boolean lb1 = true;
        if (lb1) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            boolean lb2 = true;
            } else if (fb0) {
            boolean lb3 = true;
            fb0 = fb1 && lb3;
if(fo1 != null){
              fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
            lb1 = fb0 && fb1;
            fd1 = ad1 - ad2;
            Output.points[1][5] += ad3;
            Output.points[1][6] -= ad4;
            lb3 = fd0 > fd1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
            double ld4 = 447.7466216720771;
            ad4 = fd0 - fd1;
if(fo1 != null){
              fo0 = fo1.m4(lb1, fb0, fb1, lb3);
}
            lb1 = fb0 || fb1;
            Output.points[1][7] += ld4;
if(fo0 != null){
              lb3 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb3);
}
            Thought lo5 = Thought382.getInstance(fd0, fd1, ld4, ad1, lb1, fb0, fb1, lb3);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb3);
}
            ad2 = ad3 - ad4;
            Thought lo6 = Thought55.getInstance(fo1, fo0, fo1, fo0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
if(fo0 != null){
      ad1 = fo0.m3();
}
    ab1 = ab2 || ab3;
    boolean lb2 = false;
    boolean lb3 = true;
    ad2 = ad3 + ad4;
    ab2 = fd0 < fd1;
    Thought lo4 = Thought178.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, lb1, lb2, lb3);
}
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        Output.points[1][8] += ad3;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought353.getInstance();
    double ld2 = 705.8466345967338;
    Output.points[2][0] -= ld2;
    fd0 = fd1 - ld2;
    fb0 = !fb1;
    fd0 *= -1;
    lb0 = fb0 || fb1;
    fd1 = ld2 + fd0;
    lb0 = fd1 < ld2;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb0, fb0, fb1);
}
    Output.points[2][1] += fd0;

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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = ad1 < ad2;
    fb1 = !fb0;
    fb1 = ad3 < ad4;
    boolean lb0 = false;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = !lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb2 = ao3.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
    fb0 = fb1 || lb0;
    lb1 = lb2 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, lb1, lb2);
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    lb2 = ad2 < ad3;

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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        lb0 = fd1 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
        fd0 = fd1 + fd0;
        ab2 = ab3 || ab4;
        fd1 *= -1;
        fb0 = fb1 && lb0;
        ab1 = fd0 < fd1;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
        ab3 = ab4 || fb0;
        double ld1 = 256.06682085910757;
        ld1 *= -1;
        fd0 *= -1;
        fb1 = !lb0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
        for(int i1=0; i1<10; i1++){
            ld1 = fd0 - fd1;
            ab1 = ld1 > fd0;
            fd1 = ld1 + fd0;
if(ao4 != null){
              fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
if(ao3 != null){
              fd0 = ao3.m3();
}
            ab2 = ab3 && ab4;
            fd1 *= -1;
            Output.points[2][2] -= ld1;
            Thought lo2 = Thought292.getInstance(fb0, fb1, lb0, ab1);
if(ao4 != null){
              fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
            fb1 = ld1 > fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 646.7368614215976;
    boolean lb1 = true;
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought185.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, ab1);
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    Output.points[2][3] -= fd0;
    lb1 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ad1, ad2);
}
    double ld3 = 380.2516364713105;
    Output.points[2][4] += ad2;
    ab3 = ad3 > ad4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld3);
}
if(ao2 != null){
      ad1 = ao2.m3();
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    Output.points[2][5] -= fd1;
    for(int i0=0; i0<10; i0++){
        double ld1 = 954.711873497917;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        for(int i1=0; i1<10; i1++){
            boolean lb2 = false;
            }
        fb0 = !fb1;
        lb0 = fd0 > fd1;
        Thought lo3 = Thought139.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fb0 = fo1.m2(ld1, fd0, fd1, ld1);
}
        fb1 = fd0 < fd1;
        lb0 = ld1 > fd0;
        fb0 = fd1 > ld1;
        double ld4 = 123.56041995888201;
if(fo0 != null){
          ld4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld4);
}
        fb1 = !lb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[2][6] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    ab2 = !ab3;
    double ld0 = 706.9544902678676;
    double ld1 = 498.2923755477413;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought380.getInstance(ld0, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    boolean lb4 = true;
    double ld5 = 909.8136245548679;
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 *= -1;
    Output.points[2][7] -= ld1;
    Thought lo6 = Thought139.getInstance(lb4, ab1, ab2, ab3);
    ab4 = ld5 < fd0;
    fd1 = ld0 - ld1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        Thought lo1 = Thought138.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
        fd0 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
        }
    Thought lo2 = Thought150.getInstance(fo0, fo1, fo0, fo1);
    double ld3 = 837.3449598201654;
    fb0 = fd0 > fd1;
        fb1 = ld3 < ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, ad1, ad2);
}
    Thought lo4 = Thought96.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ld3 = ad1 - ad2;
    boolean lb5 = false;
    lb5 = ad3 < ad4;
    fb0 = fd0 > fd1;
    fb1 = !lb5;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb5, fb0);
}
    ld3 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = true;
    Thought lo1 = Thought377.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    boolean lb2 = true;
if(fo0 != null){
          fo0.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought195.getInstance(fo1, fo0, fo1, fo0, lb0, lb2, ab1, ab2);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    Thought lo4 = Thought193.getInstance(ad1, ad2, ad3, ad4);
    boolean lb5 = false;
    fd0 *= -1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    if (fb0) {
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(lb0, lb2, lb5, ab1);
}
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
        lb5 = ab1 && ab2;
        boolean lb6 = false;
        boolean lb7 = false;
        boolean lb8 = true;
        lb5 = ab1 || ab2;
        } else if (fb1) {
        lb0 = lb2 || lb5;
        Thought lo9 = Thought223.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld2 = 75.92401701693652;
    boolean lb3 = false;
        Output.points[2][8] += fd0;
    lb3 = fd1 < ld2;
    fb0 = fb1 || lb0;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ld2, fd0);
}
    boolean lb4 = false;
    Thought lo5 = Thought131.getInstance(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1);
    lb3 = lb4 || fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3();
}
    fb1 = ad3 > ad4;
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    ad1 *= -1;
    fb1 = !lb0;
    Output.points[3][0] -= ad2;
    fb0 = fb1 && lb0;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 > fd0;
    fd1 = ad1 - ad2;
    Output.points[3][1] += ad3;
    Output.points[3][2] += ad4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    lb0 = fd1 > ad1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought302.getInstance();
    double ld1 = 738.4213754528997;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    ld1 = fd0 + fd1;
    ld1 *= -1;
    Thought lo3 = Thought201.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, lb2, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 || ab3;
    ab4 = ld1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = fd1 < ld1;
    Thought lo4 = Thought168.getInstance(fd0, fd1, ld1, fd0);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    Output.points[3][3] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = ab4 || fb0;
    fb1 = lb2 || ab1;
if(ao4 != null){
      ao4.m1(ab2, ab3, ab4, fb0);
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
    Thought lo0 = Thought375.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 *= -1;
    Thought lo1 = Thought140.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    Output.points[3][4] -= ad1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    Output.points[3][5] -= ad2;
    ab4 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
        boolean lb2 = false;
        fd0 *= -1;
if(ao3 != null){
          fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
        lb2 = fd0 < fd1;
        boolean lb3 = true;
        ad1 *= -1;
        lb3 = ab1 && ab2;
        ab3 = !ab4;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        double ld0 = 510.6901726412123;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo0 != null){
          fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = fd0 > fd1;
        boolean lb1 = false;
if(fo0 != null){
          ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
        Thought lo2 = Thought225.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4();
}
        ld0 *= -1;
        fd0 = fd1 - ld0;
        if (lb1) {
            fd0 = fd1 + ld0;
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, lb1, fb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[3][6] -= fd1;
    fd0 = fd1 + fd0;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
        ab3 = ab4 || fb0;
    Thought lo1 = Thought109.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld2 = 880.656165676615;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0);
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
    boolean lb0 = true;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = ad2 < ad3;
    Output.points[3][7] += ad4;
    fd0 = fd1 - ad1;
    fb0 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(fb1, lb0, lb1, fb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][8] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    Output.points[4][0] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (ab2) {
        ab3 = ab4 && fb0;
        if (fb1) {
            ad4 = fd0 + fd1;
if(fo0 != null){
              fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
            for(int i0=0; i0<10; i0++){
                Thought lo0 = Thought326.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
                Output.points[4][1] -= ad3;
                ad4 *= -1;
                if (ab1) {
if(fo1 != null){
                      fo1.m2();
}
                    for(int i1=0; i1<10; i1++){
if(fo1 != null){
                          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
                        fd0 = fd1 + ad1;
                        boolean lb1 = true;
if(fo1 != null){
                          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
}}}}}
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
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Output.points[4][2] += fd1;
    Thought lo1 = Thought291.getInstance();
    fd0 *= -1;
    if (fb0) {
        fb1 = fd1 < fd0;
        } else {
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        boolean lb2 = true;
        lb0 = fb0 || fb1;
        lb2 = lb0 || fb0;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb2, lb0, fb0);
}
        fb1 = lb2 || lb0;
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb0);
}
        boolean lb3 = false;
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = fb1 && fb0;
    fb1 = ad3 > ad4;
    fb0 = fd0 < fd1;
    double ld0 = 814.883189260241;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad2 = ao4.m3(fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    fb0 = ad4 < fd0;
    double ld1 = 30.514179894679494;
    fd0 = fd1 - ld0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
    fb1 = ad4 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(ld0, ld1, ad1, ad2, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 *= -1;
    fd0 *= -1;
    lb0 = ab1 && ab2;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
        fd1 *= -1;
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[4][3] -= fd0;
    boolean lb1 = true;

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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    double ld0 = 810.300284383723;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld0 = ad1 - ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ld0);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
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
    double ld0 = 446.2300819320306;
    fb0 = fd0 > fd1;
    double ld1 = 930.1543353760969;
    double ld2 = 696.1599768377312;
    double ld3 = 548.031228441892;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld2, ld3, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld0, ld1, ld2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought258.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    Output.points[4][4] -= fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
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
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2();
}
        fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = !lb0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;

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
