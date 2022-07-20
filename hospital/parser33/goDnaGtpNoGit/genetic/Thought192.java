package genetic;
import java.util.ArrayList;
class Thought192 extends Thought{
private static ArrayList<Thought192> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 964.9114795600701;
private double fd1 = 13.865330045007196;
private Thought fo0 = null;
private Thought fo1 = null;
Thought192 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought192 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought192 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought192 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought192 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought192 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought192 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought192 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought192 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought192 instance = new Thought192 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought192 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought192 instance = new Thought192 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought192 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought192 instance = new Thought192 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought192 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought192 instance = new Thought192 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought192 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought192 instance = new Thought192 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought192 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought192 instance = new Thought192 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought192 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought192 instance = new Thought192 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought192 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought192 instance = new Thought192 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    Output.points[2][2] -= fd1;
    fd0 = fd1 + fd0;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 0.8574004785640462;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > fd0;
    Thought lo1 = Thought360.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd1 < ld0;

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
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought211.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
          ad4 = fo1.m3();
}
        fb1 = !fb0;
        fb1 = fb0 || fb1;
        double ld1 = 400.48235942519227;
        ad4 *= -1;
        fd0 = fd1 - ld1;
        Thought lo2 = Thought148.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + ld1;
        fb0 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        double ld3 = 691.6868459591626;
        fb0 = !fb1;
        ld1 *= -1;
        fb0 = ld3 > ad1;
        Output.points[2][3] -= ad2;
        ad3 *= -1;
        boolean lb4 = false;
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
    double ld0 = 100.16487445185098;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = ab2 || ab3;
        Output.points[2][4] += ad1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ad2 = ad3 + ad4;
        ab4 = !fb0;
        fb1 = ab1 || ab2;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ld0, ad1);
}
        ab1 = ab2 && ab3;
        double ld1 = 257.73563445715564;
        ab4 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        double ld2 = 624.4299289316482;
        ld1 *= -1;
if(fo1 != null){
          fo1.m1();
}
        ld2 *= -1;
        double ld3 = 336.61078380885414;
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
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought344.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    lb1 = fb0 || fb1;

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
      ad2 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld0 = 45.182479618892536;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        fb0 = fb1 && fb0;
        boolean lb1 = true;
        Thought lo2 = Thought362.getInstance();
        ld0 = ad1 - ad2;
        fb0 = ad3 < ad4;
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
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    double ld1 = 849.4957309207936;
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought59.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    fd0 = fd1 - ld1;
    lb0 = fd0 > fd1;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb3 = true;
    double ld4 = 452.906553187502;
    ab3 = ld1 > ld4;
    fd0 *= -1;
    ab4 = fb0 || fb1;
    fd1 *= -1;
    lb0 = ld1 < ld4;

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
    ab2 = !ab3;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = ad4 > fd0;
    Output.points[2][5] += fd1;
    boolean lb0 = false;
    Thought lo1 = Thought366.getInstance(ab4, fb0, fb1, lb0);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    double ld2 = 462.8438450640981;
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ld2, fb1, lb0, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ab3 = ad4 > fd0;
    ab4 = fb0 || fb1;
    Thought lo3 = Thought188.getInstance(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
        boolean lb4 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
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
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    Output.points[2][6] += fd0;
    boolean lb1 = true;
    boolean lb2 = true;
    lb0 = fd1 < fd0;
    lb1 = fd1 < fd0;
    lb2 = fd1 < fd0;

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2();
}
    ab4 = !fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
if(fo0 != null){
          ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    boolean lb0 = true;
    Output.points[2][7] -= fd1;
    Thought lo1 = Thought181.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && lb0;
if(fo1 != null){
      ab1 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    Output.points[2][8] += fd1;

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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    double ld0 = 77.31679033084146;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[3][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = fb0 && fb1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
    Output.points[3][1] -= ad4;
    lb1 = lb2 && fb0;
    fb1 = lb1 || lb2;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    Output.points[3][2] += ad3;
    if (ab3) {
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ad2 *= -1;
        ab3 = ab4 || fb0;
        boolean lb0 = true;
        boolean lb1 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    Output.points[3][3] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
    fb0 = fb1 || fb0;
    double ld0 = 637.4072717342654;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
    fb0 = ld0 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = true;
        boolean lb4 = true;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[3][4] -= ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld0);
}
    Thought lo5 = Thought134.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld0;

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
    double ld0 = 170.2162626547673;
    Output.points[3][5] -= fd0;
    fd1 = ld0 + fd0;
    ab1 = !ab2;
if(ao2 != null){
      fd1 = ao2.m3();
}
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
    double ld2 = 414.69687827195895;
if(fo0 != null){
      fb0 = fo0.m2(ld2, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb1, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
    double ld0 = 72.18516798051488;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    boolean lb1 = false;
    ld0 = ad1 - ad2;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb1 = ao3.m2(lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    ab1 = !ab2;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    double ld1 = 79.79723952975448;
    Output.points[3][6] += fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    Output.points[3][7] += ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[3][8] -= fd0;
if(fo1 != null){
      fo1.m3(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    fb1 = !lb0;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought280.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
    fd1 = ld1 - fd0;

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
if(fo0 != null){
      fd0 = fo0.m3();
}
    double ld0 = 705.7227481394123;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ld0 > fd0;
    ab2 = ab3 || ab4;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
    boolean lb2 = true;
    lb2 = fd1 > ld0;
    ab1 = fd0 > fd1;
    ld0 = fd0 + fd1;

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
    Output.points[4][0] -= ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    double ld0 = 363.06692890258546;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    double ld1 = 258.9022712108749;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought173.getInstance();
    ld0 *= -1;
    double ld3 = 746.8842707998851;
    fb1 = ld1 > ld3;
    Thought lo4 = Thought323.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Output.points[4][1] += fd0;
    fb0 = fb1 && fb0;
    boolean lb5 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ld1, ld3, fb1, lb5, fb0, fb1);
}
    lb5 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb5);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 132.37322006857744;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab2 = !ab3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[4][2] += ad3;
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb0);
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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 48.80747172855623;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    Output.points[4][3] -= ld1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ld1;
    lb0 = !fb0;
    Thought lo2 = Thought334.getInstance(fd0, fd1, ld1, fd0);
    Thought lo3 = Thought95.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
    fb1 = lb0 || fb0;
if(fo0 != null){
      fb1 = fo0.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    Output.points[4][4] += ad1;
        Output.points[4][5] -= ad2;
    boolean lb0 = false;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m2(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb0 = !fb0;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    fb1 = lb0 || fb0;
    boolean lb1 = true;
    Thought lo2 = Thought39.getInstance(ad3, ad4, fd0, fd1);
    double ld3 = 407.0721613048948;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld3, ad1, ad2, ad3);
}
if(ao2 != null){
      fb0 = ao2.m2();
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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    double ld0 = 432.57087927502744;
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought127.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
        fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
if(ao1 != null){
      fb0 = ao1.m2(ld0, fd0, fd1, ld0);
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
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 48.61976054063241;
    boolean lb1 = true;
    boolean lb2 = true;
    Output.points[4][6] += fd0;
    Thought lo3 = Thought264.getInstance();
    Thought lo4 = Thought273.getInstance(lb1, lb2, ab1, ab2);
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb1, lb1, lb2, ab1);
}
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        lb1 = lb2 || ab1;
        } else {
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Thought lo5 = Thought367.getInstance(ao1, ao2, ao3, ao4);
        double ld6 = 923.3726571032702;
        fb1 = lb1 && lb2;
        ld6 = ld0 + ad1;
        Thought lo7 = Thought250.getInstance(ad2, ad3, ad4, fd0);
        fd1 = ld6 + ld0;
        ab1 = ab2 && ab3;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought125.getInstance();
    Thought lo1 = Thought210.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    Thought lo2 = Thought122.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Thought lo3 = Thought7.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = false;

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
    fd0 *= -1;
    Output.points[4][7] += fd1;
    Output.points[4][8] += fd0;
    boolean lb0 = false;
    lb0 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[5][0] += fd1;
    ab2 = !ab3;
    Output.points[5][1] += fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2();
}
    boolean lb1 = false;
    ab4 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    boolean lb2 = false;

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
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought94.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought111.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Thought lo2 = Thought11.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
          fb0 = fo1.m2();
}
    Thought lo3 = Thought149.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo4 = Thought364.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    double ld5 = 827.1751542858462;
    fb0 = ld5 > ad1;

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
    ab2 = ad1 < ad2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought321.getInstance(ab2, ab3, ab4, fb0);
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ab2 = ab3 && ab4;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    fd0 *= -1;
    double ld1 = 91.12802374222692;
    Output.points[5][2] -= fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    ld1 *= -1;

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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
        fd1 *= -1;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[5][3] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab3 = !ab4;
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    fd0 *= -1;
    double ld1 = 366.3700501799075;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld1;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought350.getInstance(fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
    double ld3 = 948.5724740902511;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab1 = fd0 > fd1;
    ab2 = ld1 < ld3;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld1, ld3, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, ld3, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m1(ab3, ab4, fb0, fb1);
}
        fd1 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    ab4 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought308.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = ad3 > ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[5][4] += fd0;
    lb0 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd1, ad1, ad2, ad3);
}
    double ld2 = 612.1725705927927;
    Thought lo3 = Thought66.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);

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
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd0 > fd1;
    double ld0 = 859.6741923410029;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought44.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    ld0 *= -1;
    Thought lo2 = Thought113.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd0 < fd1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    Output.points[5][5] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    Thought lo1 = Thought109.getInstance(fd0, fd1, fd0, fd1);
    lb0 = fd0 < fd1;
    boolean lb2 = true;
    Output.points[5][6] += fd0;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought132.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
