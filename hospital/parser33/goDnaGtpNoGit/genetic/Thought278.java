package genetic;
import java.util.ArrayList;
class Thought278 extends Thought{
private static ArrayList<Thought278> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 966.3240077391133;
private double fd1 = 783.6271623824173;
private Thought fo0 = null;
private Thought fo1 = null;
Thought278 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought278 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought278 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought278 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought278 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought278 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought278 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought278 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought278 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought278 instance = new Thought278 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought278 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought278 instance = new Thought278 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought278 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought278 instance = new Thought278 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought278 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought278 instance = new Thought278 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought278 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought278 instance = new Thought278 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought278 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought278 instance = new Thought278 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought278 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought278 instance = new Thought278 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought278 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought278 instance = new Thought278 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought144.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 *= -1;
    lb1 = lb2 && fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
    fb1 = !lb1;
    lb2 = fb0 || fb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    lb0 = !ab1;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    lb0 = fd1 < fd0;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
if(fo1 != null){
      ab4 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought283.getInstance(fb0, fb1, lb0, ab1);
    Thought lo3 = Thought98.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought162.getInstance(fo0, fo1, fo0, fo1);

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
    fb0 = fb1 || fb0;
    double ld0 = 799.2355290595896;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought270.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    fb1 = fb0 || fb1;
    ld0 = ad1 - ad2;
    boolean lb2 = true;
    lb2 = ad3 > ad4;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought186.getInstance(fb0, fb1, lb2, fb0);
    fb1 = lb2 && fb0;
    Thought lo4 = Thought169.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, lb2, lb5, fb0, fb1);
}
    boolean lb6 = false;
    Output.points[3][0] -= ad2;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[3][1] += ad2;
    fb0 = ad3 < ad4;
    fb1 = ab1 && ab2;
    fd0 = fd1 + ad1;
    ab3 = ab4 && fb0;
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ab1 = !ab2;
    double ld0 = 635.4572797893969;
    ab3 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    double ld1 = 928.4276353191013;
    double ld2 = 753.9607795042888;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought112.getInstance(ao2, ao3, ao4, fo0);
    boolean lb4 = false;
    Thought lo5 = Thought74.getInstance(ld2, fd0, fd1, ld1);
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld2);
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
    double ld0 = 661.9353368628742;
    fb1 = ld0 < ad1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    Output.points[3][2] += ad2;
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    fb0 = fd1 > ld0;
if(ao2 != null){
      ad1 = ao2.m3(fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought29.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ad1, ad2, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    lb1 = fd1 < ld0;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ld0;
    lb1 = ad1 > ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && lb1;

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
    ab2 = ab3 && ab4;
        double ld0 = 481.5930616056748;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - ld0;
if(ao4 != null){
      fb0 = ao4.m2(fb1, ab1, ab2, ab3);
}
    double ld1 = 0.11317526419780188;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ld1 = fd0 - fd1;
    ab2 = !ab3;
    boolean lb2 = false;
        Thought lo3 = Thought156.getInstance(ld0, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb4 = false;
    ab3 = ld1 > fd0;
if(ao3 != null){
      ao3.m2(fd1, ld0, ld1, fd0);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld1, fd0);
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
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = fd1 < ad1;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = ad2 < ad3;
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
    double ld0 = 915.98596053474;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    fd1 *= -1;
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    ld0 = ad1 + ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[3][3] -= ad4;
    boolean lb1 = false;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        boolean lb0 = true;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought163.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    Thought lo3 = Thought379.getInstance();
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    boolean lb4 = true;
    fd1 *= -1;
    boolean lb5 = false;
    double ld6 = 735.4172741999121;
    lb4 = ld6 < fd0;
    fd1 = ld6 + fd0;
    double ld7 = 717.3144065093353;
    boolean lb8 = true;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !lb2;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[3][4] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
    ab1 = ab2 && ab3;
    Thought lo3 = Thought392.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;

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
    if (fb0) {
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought62.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 = fd1 + ad1;
        ad2 *= -1;
        double ld1 = 887.9606337046681;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
        fb0 = fb1 && lb2;
        Output.points[3][5] += ad2;
        if (fb0) {
            Thought lo3 = Thought153.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
            ld1 = ad1 - ad2;
            } else {
if(fo0 != null){
              fo0.m3(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
            ld1 = ad1 - ad2;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            ad3 = ad4 - fd0;
if(fo1 != null){
              fd1 = fo1.m3(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
            fb1 = !lb2;
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
    ab1 = ab2 || ab3;
    double ld0 = 811.0195037747635;
    ab4 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 *= -1;
        ab2 = ab3 || ab4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought123.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    fd0 = fd1 + ld0;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    ad1 = ad2 - ad3;
    fb1 = !ab1;
    ab2 = ab3 || ab4;

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
    Thought lo0 = Thought71.getInstance(ao1, ao2, ao3, ao4);
        double ld1 = 380.27404032027954;
    fb1 = !fb0;
    ld1 *= -1;
    boolean lb2 = false;
        fd0 *= -1;
    Output.points[3][6] += fd1;
    boolean lb3 = false;
    ld1 *= -1;
    boolean lb4 = false;
    Output.points[3][7] -= fd0;
    lb3 = !lb4;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    double ld0 = 900.4953935532301;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[3][8] += ld0;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        lb1 = lb2 || fb0;
        fb1 = lb1 && lb2;
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ad1, lb1, lb2, fb0, fb1);
}
        ad2 = ad3 + ad4;
        Output.points[4][0] += fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fd0 = fd1 + fd0;
    double ld0 = 105.21171157410807;
    boolean lb1 = true;
    double ld2 = 187.45977478633762;
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, ab1);
}
    Output.points[4][1] += fd0;
    Thought lo3 = Thought14.getInstance(fo1, ao1, ao2, ao3);
    Output.points[4][2] += fd1;
    ld0 *= -1;
    ld2 *= -1;
if(ao4 != null){
      ao4.m1(fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld2);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    ld2 = fd0 - fd1;
    double ld4 = 782.7631854103995;
    boolean lb5 = false;
    ld0 = ld2 - ld4;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld2, lb5, ab1, ab2, ab3);
}
    boolean lb6 = false;
    double ld7 = 946.5277598343947;
if(ao1 != null){
      ab3 = ao1.m2(ld4, ld7, fd0, fd1, ab4, fb0, fb1, lb1);
}
    double ld8 = 855.1001692486628;
if(ao2 != null){
      lb5 = ao2.m2(ao3, ao4, fo0, fo1, lb6, ab1, ab2, ab3);
}
    boolean lb9 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    Output.points[4][3] += ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[4][4] -= fd0;
    boolean lb0 = false;
    fd1 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
    Thought lo2 = Thought103.getInstance(fo0, fo1, ao1, ao2);
    boolean lb3 = true;
    ab1 = ab2 || ab3;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    ab4 = ad4 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, lb1, lb3);
}
    Thought lo4 = Thought67.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    double ld0 = 875.7145038459448;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought26.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
        fb0 = fb1 && fb0;
        }
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = false;
    double ld4 = 100.47037748529581;
    ld4 = fd0 - fd1;
    Output.points[4][5] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb2);
}
    for(int i1=0; i1<10; i1++){
        ld4 = fd0 - fd1;
        lb3 = ld0 < ld4;
        fd0 *= -1;
        fb0 = !fb1;
        boolean lb5 = false;
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
    ab1 = fd0 > fd1;
    Output.points[4][6] -= fd0;
    fd1 *= -1;
    Thought lo0 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    Output.points[4][7] += fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;
    ab1 = ab2 || ab3;
    Thought lo3 = Thought55.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
if(fo1 != null){
      ad1 = fo1.m3();
}
    Output.points[4][8] += ad2;
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought30.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;

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
    boolean lb0 = false;
    Output.points[5][0] += ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = ad2 < ad3;
    ab1 = !ab2;
    ad4 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 && fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought236.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought238.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Output.points[5][1] -= fd1;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    Output.points[5][2] -= fd0;
    boolean lb2 = true;
    Thought lo3 = Thought282.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        double ld5 = 542.4283789569273;
        Output.points[5][3] -= fd0;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ld5, fd0, fd1);
}
        lb4 = ld5 < fd0;
        fb0 = fb1 && lb2;
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
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[5][4] -= fd1;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
if(ao3 != null){
      lb0 = ao3.m2();
}
    lb1 = fb0 || fb1;
    lb0 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        ad3 = ad4 + fd0;
        Output.points[5][5] += fd1;
        double ld3 = 809.4707100296889;
if(ao4 != null){
          ao4.m2(lb0, lb1, fb0, fb1);
}
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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    Thought lo0 = Thought328.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
    ab4 = fd1 < fd0;
    fb0 = fb1 && ab1;
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 499.7215917022322;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
        ld3 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
}
if(fo1 != null){
          ab3 = fo1.m2();
}
        ab4 = fb0 || fb1;
        lb4 = fd1 < ld3;
        Thought lo5 = Thought374.getInstance(lb1, lb2, ab1, ab2);
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0, ab3, ab4, fb0, fb1);
}
        }
    Output.points[5][6] -= fd1;
    ld3 = fd0 + fd1;
    if (lb1) {
if(fo1 != null){
          ld3 = fo1.m3(fd0, fd1, ld3, fd0, lb2, ab1, ab2, ab3);
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
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ad1 *= -1;
    ab4 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab2 = !ab3;
        for(int i1=0; i1<10; i1++){
            ad4 *= -1;
            fd0 = fd1 + ad1;
            ab4 = !fb0;
            fb1 = ad2 < ad3;
            lb0 = !ab1;
if(ao1 != null){
              ao1.m2(ad4, fd0, fd1, ad1);
}
            ab2 = ad2 > ad3;
if(ao2 != null){
              ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
            double ld1 = 707.6242185417436;
            ab3 = !ab4;
if(ao1 != null){
              ao1.m3();
}
            fb0 = ad1 > ad2;
if(ao2 != null){
              ad3 = ao2.m3(fb1, lb0, ab1, ab2);
}
            ab3 = ab4 || fb0;
            boolean lb2 = false;
            ad4 = fd0 + fd1;
            fb0 = fb1 || lb2;
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
    Thought lo1 = Thought200.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fd0 *= -1;
    double ld2 = 322.0868118462724;
    for(int i0=0; i0<10; i0++){
        }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    fb1 = lb0 && fb0;
    fb1 = fd1 < ld2;
    boolean lb3 = true;

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
    ab1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 *= -1;
    if (fb0) {
        fb1 = fd1 > fd0;
        ab1 = ab2 && ab3;
        fd1 = fd0 + fd1;
        ab4 = fd0 < fd1;
if(fo0 != null){
          fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
        ab4 = fd0 > fd1;
        fb0 = !fb1;
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
        Thought lo1 = Thought264.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = fd0 < fd1;
        Thought lo2 = Thought315.getInstance(fb1, lb0, ab1, ab2);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
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
    double ld0 = 486.8315481341296;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
    double ld2 = 110.9132164425645;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought326.getInstance(ld2, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2);
}
if(fo1 != null){
      lb3 = fo1.m2();
}
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb1);
}
    lb3 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld2, ad1, ad2, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
}
    lb1 = ad3 < ad4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo5 = Thought199.getInstance(ld2, ad1, ad2, ad3);
    if (lb3) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
        for(int i0=0; i0<10; i0++){
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
      fo0.m3();
}
    ad2 *= -1;
    Thought lo0 = Thought264.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought359.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    ab1 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
    double ld2 = 665.254787179963;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    lb3 = ab1 && ab2;
    Thought lo4 = Thought42.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, ad1, ad2);
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        Thought lo6 = Thought322.getInstance();

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
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[5][7] += fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    double ld0 = 225.6009454779906;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb1 = fb0 || fb1;
        fb0 = fd0 < fd1;
if(fo0 != null){
          ao4 = fo0.m4(ld0, fd0, fd1, ld0);
}
        fd0 = fd1 - ld0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
        double ld1 = 742.3821079732594;
        Output.points[5][8] += fd0;
        fd1 *= -1;
        double ld2 = 771.8505368731904;
        ld1 *= -1;
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
    fb1 = fb0 && fb1;
    ad2 *= -1;
if(ao1 != null){
      ao1.m3();
}
    Output.points[6][0] -= ad3;
    fb0 = ad4 > fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ad1;
    Thought lo0 = Thought269.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought298.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    double ld2 = 817.1342736067903;
    ld2 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld3 = 731.9728562313692;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, ld3, ad1);
}
if(ao2 != null){
      ao2.m3();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = ad2 < ad3;
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ad4 *= -1;
    fb0 = fb1 && fb0;

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
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought306.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        ab4 = fd0 > fd1;
        fb0 = fb1 || ab1;
        if (ab2) {
            ab3 = ab4 && fb0;
            Thought lo1 = Thought309.getInstance(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
            fd0 = fd1 - fd0;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
            boolean lb2 = false;
            double ld3 = 34.04787960493149;
            double ld4 = 743.1904506599923;
if(ao4 != null){
              ab3 = ao4.m2(ld4, fd0, fd1, ld3);
}
            ab4 = fb0 && fb1;
if(fo0 != null){
              ld4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld3, ld4);
}
            fd0 *= -1;
            lb2 = ab1 && ab2;
            ab3 = ab4 && fb0;
            fb1 = fd1 > ld3;
            } else if (ab1) {
            fd1 *= -1;
            boolean lb5 = true;
            fd0 = fd1 + fd0;
}}
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
    ab2 = ab3 && ab4;
    double ld0 = 134.97907239360495;
if(ao1 != null){
      ao1.m2();
}
    boolean lb1 = true;
        ab4 = !fb0;
    ad1 = ad2 + ad3;
    fb1 = lb1 || ab1;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1, fb1, lb1, ab1, ab2);
}
    Thought lo2 = Thought318.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    Thought lo3 = Thought232.getInstance(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo4 = Thought336.getInstance(fd1, ld0, ad1, ad2);
    ab4 = fb0 || fb1;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ab1 = ab2 && ab3;
    double ld5 = 639.4341189570558;
if(ao1 != null){
      fo1 = ao1.m4();
}
    for(int i0=0; i0<10; i0++){
        Output.points[6][1] -= ld0;
if(ao2 != null){
          ao2.m1(ab4, fb0, fb1, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld5, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        fb0 = ad4 < fd0;
        Output.points[6][2] -= fd1;
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
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    double ld0 = 691.3621395714574;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    double ld1 = 194.2128776611874;

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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    double ld1 = 867.1465861738297;
    boolean lb2 = false;
    lb0 = ld1 < fd0;
    fd1 *= -1;
    Thought lo3 = Thought159.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, lb2, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, lb4, fb0);
}
    double ld5 = 608.0181004068387;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought358.getInstance();
    boolean lb1 = false;
    fd0 *= -1;
    Output.points[6][3] -= fd1;
    double ld2 = 165.91882316889428;
    ld2 = fd0 + fd1;

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
