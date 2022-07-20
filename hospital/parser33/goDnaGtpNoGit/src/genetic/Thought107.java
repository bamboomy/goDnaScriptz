package genetic;
import java.util.ArrayList;
class Thought107 extends Thought{
private static ArrayList<Thought107> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 252.5758185899516;
private double fd1 = 41.05002540640421;
private Thought fo0 = null;
private Thought fo1 = null;
Thought107 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought107 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought107 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought107 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought107 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought107 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought107 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought107 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought107 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought107 instance = new Thought107 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought107 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought107 instance = new Thought107 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought107 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought107 instance = new Thought107 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought107 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought107 instance = new Thought107 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought107 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought107 instance = new Thought107 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought107 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought107 instance = new Thought107 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought107 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought107 instance = new Thought107 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought107 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought107 instance = new Thought107 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
        fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Output.points[8][6] -= fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    Output.points[8][7] += fd1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought280.getInstance(fd0, fd1, fd0, fd1);

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    if (ab4) {
        double ld0 = 96.15331983262848;
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
        fb0 = ld0 > fd0;
        double ld1 = 494.53020326983244;
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
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
        fb1 = ad1 < ad2;
        ad3 = ad4 - fd0;
        fd1 *= -1;
        Thought lo1 = Thought77.getInstance();
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
        lb0 = ad2 > ad3;
        Thought lo2 = Thought226.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
        ad2 *= -1;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        lb0 = ad4 < fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb3 = false;
        Thought lo4 = Thought98.getInstance(fd1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        lb0 = ad2 > ad3;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo5 = Thought113.getInstance(fb0, fb1, lb3, lb0);
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
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought359.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    ab3 = ab4 || fb0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    lb0 = ad3 < ad4;
        if (lb2) {
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb2 = ab1 && ab2;
        Thought lo4 = Thought228.getInstance(ab3, ab4, fb0, fb1);
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb3, lb0, lb2, ab1);
}
        boolean lb5 = true;
        boolean lb6 = true;
        lb2 = ab1 && ab2;
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought336.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Output.points[8][8] -= fd1;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb1, fb0, fb1);
}
    lb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
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
    fb0 = fb1 && fb0;
    ad1 *= -1;
    fb1 = !fb0;
    fb1 = ad2 < ad3;
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = !lb0;
    ad4 = fd0 + fd1;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
    fb0 = fb1 || ab1;
    double ld0 = 596.7657054999258;
    double ld1 = 585.0429618627344;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo2 = Thought63.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld3 = 512.9340346368384;
    double ld4 = 380.2767200392166;
    ld1 = ld3 + ld4;
    boolean lb5 = false;
    boolean lb6 = true;
    boolean lb7 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, ld4, fd0, fd1);
}
    double ld8 = 985.4435015845371;
    double ld9 = 784.9298075838193;
    ab3 = ld0 < ld1;
    ab4 = fb0 || fb1;
if(ao4 != null){
      lb5 = ao4.m2();
}
    ld3 = ld4 - ld8;

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
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    ad2 = ad3 + ad4;
    Output.points[0][0] += fd0;
    ab1 = !ab2;
    fd1 = ad1 - ad2;
    Thought lo1 = Thought99.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought316.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
    fd0 *= -1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb0 = fd1 < ad1;
    ab1 = ab2 && ab3;
    Thought lo3 = Thought283.getInstance(ao1, ao2, ao3, ao4);
    ad2 = ad3 + ad4;
    ab4 = fd0 > fd1;

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
    Thought lo0 = Thought268.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    Output.points[0][1] += fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb1 = fd1 > fd0;
        Thought lo1 = Thought194.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        fb0 = fd1 > fd0;
        fb1 = fb0 && fb1;
        fd1 = fd0 - fd1;
        Thought lo2 = Thought390.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        fb0 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Output.points[0][2] += fd1;
        fb1 = fb0 && fb1;
        fd0 = fd1 + fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb3 = true;
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
      fd0 = fo0.m3();
}
    Output.points[0][3] += fd1;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought314.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    Output.points[0][4] += fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    if (fb1) {
        ab1 = fd0 > fd1;
        ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab4 = fd0 > fd1;
        fb0 = !fb1;
        boolean lb1 = true;
        fd0 = fd1 + fd0;
        lb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m2(ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought8.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        } else if (ab1) {
        ab2 = !ab3;
        fd0 = fd1 - fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][5] += ad2;
    fb0 = ad3 < ad4;
    Output.points[0][6] -= fd0;
    fd1 *= -1;
    ad1 *= -1;
        fb1 = fb0 && fb1;
    Output.points[0][7] += ad2;
    fb0 = ad3 < ad4;
    Thought lo0 = Thought305.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    Output.points[0][8] -= ad3;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
    fd1 = ad1 + ad2;
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ad3 > ad4;
    Thought lo1 = Thought397.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
        ad2 = ad3 + ad4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo0 = Thought296.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
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
    double ld0 = 727.411198284293;
    Thought lo1 = Thought178.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
        ad3 = ad4 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fb1 = fd1 > ld0;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
    lb2 = ad4 > fd0;

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    Output.points[1][0] += fd0;
    ab1 = ab2 && ab3;
    ab4 = fd1 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(ao2 != null){
      ab4 = ao2.m2();
}
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    lb1 = !ab1;
    ab2 = ab3 && ab4;
    double ld2 = 830.5414683100893;
    ld2 = fd0 + fd1;
    boolean lb3 = true;
if(ao3 != null){
      ao3.m2(ab4, fb0, fb1, lb0);
}
    ld2 = fd0 + fd1;
    lb1 = ld2 > fd0;
    fd1 *= -1;
if(ao4 != null){
      lb3 = ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb3, ab1, ab2, ab3);
}
    double ld4 = 819.171824300591;
    Thought lo5 = Thought329.getInstance(ao3, ao4, fo0, fo1);

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
    Output.points[1][1] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ab2 = ad3 < ad4;
    Thought lo0 = Thought234.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
    ab3 = !ab4;
    Thought lo1 = Thought90.getInstance();
    double ld2 = 128.23088345642563;
    boolean lb3 = true;
    if (ab4) {
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
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    double ld0 = 590.8736199475248;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
    double ld1 = 29.237756198332832;
    ld0 = ld1 - fd0;
    double ld2 = 826.7301272920593;
    fd0 *= -1;
    Thought lo3 = Thought140.getInstance();
    fb1 = fd1 > ld0;
    Thought lo4 = Thought196.getInstance(fb0, fb1, fb0, fb1);
    double ld5 = 830.9149215657256;

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
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought358.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[1][2] -= fd0;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought149.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb1;
    boolean lb3 = true;
    boolean lb4 = true;
    lb3 = fd1 > fd0;
    lb4 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    Thought lo5 = Thought307.getInstance(ab3, ab4, fb0, fb1);
    lb1 = lb3 || lb4;
    boolean lb6 = true;
    lb6 = ab1 && ab2;
    Output.points[1][3] -= fd1;

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
    Thought lo0 = Thought201.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ad1;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        ad2 = ad3 + ad4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Output.points[1][4] -= fd1;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m1();
}
        fb1 = ad4 < fd0;
        fb0 = fd1 > ad1;
        fb1 = !fb0;
if(fo0 != null){
          ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ad1 *= -1;
        boolean lb1 = false;
        if (fb0) {
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
            fb1 = !lb1;
}}
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
    boolean lb0 = true;
    Thought lo1 = Thought44.getInstance();
    fd1 = ad1 + ad2;
    ab3 = ad3 > ad4;
    ab4 = fb0 || fb1;
    Thought lo2 = Thought203.getInstance(lb0, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
        double ld3 = 983.2610050974522;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
          fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 22.299287393297323;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
    Thought lo2 = Thought199.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    lb0 = ad2 < ad3;
    Output.points[1][5] -= ad4;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
    fb1 = lb0 && fb0;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        fd0 = fd1 - ad1;
        boolean lb2 = true;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        lb2 = ad2 > ad3;
        ad4 = fd0 + fd1;
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
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
        fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    double ld0 = 388.5175911120798;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m2(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    Thought lo1 = Thought27.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
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
    boolean lb0 = false;
    ab1 = !ab2;
    boolean lb1 = true;
    ab2 = ab3 && ab4;
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = true;
    ab2 = ab3 || ab4;
    ad1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    boolean lb5 = true;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb0 = ad1 > ad2;
if(ao2 != null){
      ao2.m1(lb1, lb2, lb3, lb4);
}
    ad3 = ad4 + fd0;
    Output.points[1][6] -= fd1;
    boolean lb6 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb5, lb6, ab1, ab2);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[1][7] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought192.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld3 = 801.2076056753394;
    double ld4 = 442.2103102217617;
    fb0 = fb1 && lb0;
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
}
    Thought lo5 = Thought35.getInstance(ld4, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    Thought lo6 = Thought124.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld3);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld3);
}
if(fo1 != null){
      ld4 = fo1.m3();
}
    boolean lb7 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb7, fb0, fb1, lb0);
}
    lb2 = fd0 < fd1;
    Output.points[1][8] += ld3;

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Output.points[2][0] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb0 = false;
        ab2 = ab3 || ab4;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
            fd1 *= -1;
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = ad2 > ad3;
    boolean lb3 = false;
    lb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb0);
}
    Output.points[2][1] -= ad2;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, lb2, lb3, lb4);
}
    boolean lb5 = false;
    ad1 = ad2 + ad3;
    Thought lo6 = Thought230.getInstance(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb7 = false;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ab1 = ab2 && ab3;
    Thought lo1 = Thought178.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m2();
}
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    lb2 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    boolean lb3 = false;
        Thought lo4 = Thought183.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    ab3 = !ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[2][2] += fd0;
    lb0 = !lb2;

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
    boolean lb0 = false;
if(ao1 != null){
      lb0 = ao1.m2();
}
    fd1 = fd0 + fd1;
    double ld1 = 232.73091477999085;
    fb0 = ld1 > fd0;
    Output.points[2][3] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
    ld1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[2][4] += fd1;
    ld1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought348.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
    fd0 = fd1 - ld1;
    lb0 = fd0 > fd1;
    ld1 *= -1;
    Output.points[2][5] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fd1 > ld1;
    boolean lb3 = true;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ld1, fd0);
}
    double ld4 = 750.957222873311;
    fb1 = !lb0;

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
    fb1 = fb0 && fb1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ad1 - ad2;
    Output.points[2][6] += ad3;
    boolean lb0 = false;
    lb0 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[2][7] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    Output.points[2][8] += fd0;
    lb0 = lb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought275.getInstance();
    Output.points[3][0] -= ad3;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        ab1 = !ab2;
        boolean lb0 = false;
        ab2 = fd0 > fd1;
        double ld1 = 602.5938728089977;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ld1 *= -1;
        boolean lb2 = false;
        ab2 = ab3 || ab4;
        fd0 *= -1;
        Thought lo3 = Thought189.getInstance(fb0, fb1, lb0, lb2);
        ab1 = ab2 || ab3;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab2 = ao2.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    double ld0 = 512.8345216001757;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    double ld1 = 621.4552733755405;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, ld0, ld1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ad3 < ad4;
    Output.points[3][1] += fd0;

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
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought82.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3();
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    boolean lb1 = true;
    fd1 *= -1;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought230.getInstance();
    boolean lb2 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(lb2, fb0, fb1, lb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    boolean lb1 = false;
    fb0 = !fb1;
    lb0 = fd1 < fd0;
    Thought lo2 = Thought198.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
