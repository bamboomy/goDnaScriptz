package genetic;
import java.util.ArrayList;
class Thought84 extends Thought{
private static ArrayList<Thought84> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 268.72595428313093;
private double fd1 = 358.13215463543776;
private Thought fo0 = null;
private Thought fo1 = null;
Thought84 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought84 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought84 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought84 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought84 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought84 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought84 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought84 instance = new Thought84 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    fd1 *= -1;
    Output.points[7][3] += fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
        fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        Output.points[7][5] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Output.points[7][6] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
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
    Thought lo0 = Thought347.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab2 = !ab3;
    boolean lb1 = true;
    Output.points[7][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, ab1, ab2);
}
    double ld3 = 354.3756706798466;
        double ld4 = 76.26301357091249;
    double ld5 = 945.1818962920046;
if(fo1 != null){
      fo1.m1(ld4, ld5, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo6 = Thought90.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[7][8] += ld3;

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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    double ld1 = 568.5654360143574;
    if (lb0) {
        } else {
        fb0 = !fb1;
        Thought lo2 = Thought163.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
if(fo1 != null){
          fo1.m3();
}
        ad2 *= -1;
        double ld3 = 326.6017643863092;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          ld3 = fo1.m3(ld1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        ad4 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        fb0 = fd1 > ld3;
        boolean lb4 = true;
        ld1 = ad1 + ad2;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    Output.points[8][0] -= fd1;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    Thought lo1 = Thought318.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ad1;
    Output.points[8][1] += ad2;
    Thought lo2 = Thought88.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    boolean lb3 = true;
    boolean lb4 = false;
        boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 304.3240370941932;
    Output.points[8][2] -= ld0;
    Output.points[8][3] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 136.93905121757655;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    Output.points[8][4] -= ld1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb2 = false;
    Output.points[8][5] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld1, fd0, fd1);
}
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1);
}
    fb0 = fb1 && lb2;
    boolean lb3 = false;
if(ao4 != null){
      lb3 = ao4.m2();
}
    ld0 = ld1 + fd0;

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
    Output.points[8][6] -= ad2;
    boolean lb0 = false;
    lb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    double ld1 = 882.6704766192822;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    lb0 = lb2 && fb0;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;

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
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    if (fb0) {
        Thought lo1 = Thought19.getInstance();
        fd1 = fd0 - fd1;
if(ao1 != null){
          ao1.m2(fb1, lb0, ab1, ab2);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
        Thought lo0 = Thought35.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    ab2 = ab3 && ab4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought261.getInstance(fd1, ad1, ad2, ad3);
    fb1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    lb1 = ab1 && ab2;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought250.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo1 = Thought326.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    Thought lo2 = Thought181.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb3 = true;
    boolean lb4 = true;
    lb3 = !lb4;
    boolean lb5 = false;
        Thought lo6 = Thought3.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
    fd1 *= -1;
    lb5 = fb0 || fb1;
    lb3 = !lb4;
    boolean lb7 = false;
    lb5 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb7 = !fb0;
    fb1 = lb3 || lb4;

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
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    ab2 = fd0 > fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Output.points[8][7] -= fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    fd0 *= -1;
    Output.points[8][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought128.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 710.3575886226685;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 904.2651322614829;
        Output.points[0][0] -= ad1;
    double ld2 = 387.66338845348685;
    Thought lo3 = Thought149.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, ld2, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fb1 = fb0 || fb1;
    boolean lb4 = false;
    fd1 = ld0 - ld1;
    Thought lo5 = Thought163.getInstance(fo1, fo0, fo1, fo0);
    double ld6 = 341.72042886674103;
    boolean lb7 = true;
    double ld8 = 32.832089213588766;
if(fo1 != null){
      ld2 = fo1.m3(ld6, ld8, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}

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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Output.points[0][1] += ad2;
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    double ld0 = 755.9249322388142;
    Thought lo1 = Thought104.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought150.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m2();
}
    Thought lo3 = Thought192.getInstance(ab1, ab2, ab3, ab4);
        Output.points[0][2] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
    ab3 = ab4 || fb0;

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
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought207.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought166.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Output.points[0][3] += fd0;
    Thought lo2 = Thought336.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Output.points[0][4] += fd1;
    Thought lo3 = Thought239.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb4 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 < fd1;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = false;
    double ld2 = 105.31354651309195;
    ad4 = fd0 - fd1;
    lb1 = ld2 > ad1;
if(ao4 != null){
      ao4.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
if(ao4 != null){
      ao4.m1(fd1, ld2, ad1, ad2, fb1, lb0, lb1, fb0);
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought6.getInstance(fd0, fd1, ld2, ad1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = !ab3;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
    ab1 = fd0 > fd1;
    double ld0 = 776.2700590939986;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ld0 = fd0 - fd1;
    ab1 = ld0 < fd0;
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1);
}
    fb0 = !fb1;
    double ld1 = 356.685431272092;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1);
}
    ab1 = ld0 > ld1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !ab1;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    ld1 = fd0 + fd1;
    fb1 = ld0 < ld1;
    fd0 = fd1 + ld0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab2 = !ab3;
    ab4 = !fb0;
    Output.points[0][5] -= ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    if (ab4) {
        } else if (fb0) {
        ad3 *= -1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
        ad4 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
        boolean lb1 = true;
if(fo0 != null){
          ao4 = fo0.m4();
}
if(ao1 != null){
          fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb1, lb0, ab1);
}
        ad1 *= -1;
        boolean lb2 = false;
        ab1 = ad2 < ad3;
        ad4 = fd0 + fd1;
        ab2 = ad1 < ad2;
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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
    lb0 = fd1 < fd0;
    fd1 *= -1;
    double ld1 = 300.9262420007342;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld1 + fd0;
    fd1 *= -1;

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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      lb0 = fo1.m2(lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought249.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    fd0 *= -1;
    boolean lb3 = false;
    lb1 = !lb3;
    fd1 = fd0 - fd1;
    Thought lo4 = Thought194.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab4 = fb0 && fb1;
    Thought lo5 = Thought359.getInstance();
    boolean lb6 = true;
    fd0 *= -1;
    Thought lo7 = Thought112.getInstance(lb0, lb1, lb3, lb6);

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
    Output.points[0][6] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 < ad1;
    double ld1 = 215.33868646018246;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    fd0 *= -1;
    lb3 = fd1 > ld1;
    ad1 = ad2 + ad3;
    fb0 = !fb1;

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
    Output.points[0][7] += ad2;
    Output.points[0][8] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    if (fb0) {
        double ld1 = 607.6028525183577;
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
        boolean lb3 = false;
        double ld4 = 249.11951911029067;
        boolean lb5 = true;
        boolean lb6 = false;
        ab2 = ab3 || ab4;
        ad3 = ad4 + fd0;
        fd1 = ld1 + ld4;
        Thought lo7 = Thought185.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
          fb0 = fo1.m2();
}
        fb1 = lb2 || lb3;
        lb5 = lb6 && lb0;
        ab1 = fd0 < fd1;
        Thought lo8 = Thought316.getInstance(ab2, ab3, ab4, fb0);
        fb1 = ld1 > ld4;
        lb2 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb3, lb5, lb6, lb0);
}
        Thought lo9 = Thought196.getInstance(ld1, ld4, ad1, ad2, ab1, ab2, ab3, ab4);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
        double ld0 = 232.42544878855776;
        fb0 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
        fd0 = fd1 - ld0;
        fb1 = fd0 < fd1;
        fb0 = ld0 > fd0;
if(ao2 != null){
          fd1 = ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
        ld0 *= -1;
        fb1 = fb0 || fb1;
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
    fb0 = ad1 < ad2;
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought280.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Output.points[1][0] += fd0;
    fb1 = fd1 < ad1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb1 = true;
    lb1 = fb0 || fb1;
    double ld2 = 154.21514261464694;
        Thought lo3 = Thought219.getInstance(ad3, ad4, fd0, fd1);
    lb1 = fb0 || fb1;
        boolean lb4 = false;
    lb1 = !lb4;
    Output.points[1][1] -= ld2;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb5 = false;
    double ld6 = 482.93044184712716;
    ld2 = ld6 - ad1;
    Thought lo7 = Thought185.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1();
}
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao4 != null){
          ao4.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab3 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4();
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
    ad2 = ad3 - ad4;
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    double ld0 = 110.04529198293002;
    ld0 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
        ad1 *= -1;
        ab2 = ab3 || ab4;
        fb0 = ad2 > ad3;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Output.points[1][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
    double ld1 = 954.8466505780211;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
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
    Thought lo0 = Thought148.getInstance();
    boolean lb1 = true;
    double ld2 = 104.02745854993127;
    boolean lb3 = true;
    lb1 = fd0 < fd1;
    lb3 = ab1 && ab2;
    ld2 = fd0 + fd1;
    ab3 = ab4 && fb0;
    fb1 = lb1 || lb3;
if(fo1 != null){
      ld2 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb1, lb3);
}
    ab1 = !ab2;
    boolean lb4 = true;
    Thought lo5 = Thought132.getInstance(fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb3, lb4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    double ld3 = 358.2675270195066;
    double ld4 = 314.32776292196127;
    ld4 = ad1 - ad2;
    ad3 *= -1;
    ad4 *= -1;
    fd0 *= -1;
    fd1 = ld3 - ld4;
    boolean lb5 = true;
    lb1 = lb2 || lb5;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, lb1, lb2, lb5, fb0);
}
    Output.points[1][3] += fd0;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Output.points[1][4] += ad2;
    Thought lo0 = Thought85.getInstance(fo0, fo1, fo0, fo1);
    Output.points[1][5] -= ad3;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
    lb2 = ad1 < ad2;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    double ld3 = 196.34572149438398;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
    Thought lo4 = Thought39.getInstance();
    Thought lo5 = Thought250.getInstance(ab1, ab2, ab3, ab4);

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
    Thought lo0 = Thought120.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
        fd1 *= -1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    Output.points[1][6] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought157.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
    double ld2 = 109.09976776833086;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
        double ld3 = 849.9512981292244;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld2, ld3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld3);
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
    boolean lb0 = false;
    Output.points[1][7] += ad1;
if(ao3 != null){
          ao2 = ao3.m4();
}
    fb0 = ad2 < ad3;
    Thought lo1 = Thought154.getInstance(fb1, lb0, fb0, fb1);
    Thought lo2 = Thought60.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
    ad2 = ad3 + ad4;
    fb0 = fb1 && lb0;
    Thought lo3 = Thought10.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    fb1 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 || fb1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
        fb1 = fd0 > fd1;
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
        Thought lo4 = Thought318.getInstance();
        lb0 = fb0 && fb1;
        ad3 = ad4 + fd0;
        if (lb0) {
            } else {
if(ao2 != null){
              fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
}}
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
    Thought lo0 = Thought8.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought221.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    boolean lb2 = false;
    fd1 *= -1;
    boolean lb3 = true;
    ab1 = ab2 || ab3;
    if (ab4) {
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, lb3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        ab1 = fd0 > fd1;
if(fo1 != null){
          ab2 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        Output.points[1][8] += fd0;
if(fo1 != null){
          fo1.m1();
}
        fd1 = fd0 + fd1;
        ab3 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(ab4, fb0, fb1, lb2);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
}
        ab4 = fd1 < fd0;
        fd1 = fd0 + fd1;
if(ao2 != null){
          fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, lb2, lb3, ab1);
}
        boolean lb4 = false;
        boolean lb5 = true;
        boolean lb6 = true;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb2, lb3, ab1, ab2);
}
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
    Thought lo0 = Thought290.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[2][0] -= fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo1.m1();
}
        fd1 = ad1 + ad2;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ab1 = ad1 > ad2;
        Output.points[2][1] += ad3;
        Output.points[2][2] -= ad4;
        ab2 = ab3 || ab4;
        fd0 = fd1 + ad1;
        Thought lo1 = Thought157.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
        Output.points[2][3] += fd1;
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
if(ao1 != null){
          ao1.m2(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        ad1 = ad2 - ad3;
        Thought lo2 = Thought224.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
          ab1 = fo1.m2();
}
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
    Thought lo0 = Thought42.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld1 = 559.495578291687;
    Thought lo2 = Thought213.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
    fb0 = !fb1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld4 = 622.3756748702717;
if(fo1 != null){
      fb0 = fo1.m2(ld4, fd0, fd1, ld1);
}
    Output.points[2][4] -= ld4;
    fd0 *= -1;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld4, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb3, lb5, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld4, fd0, lb3, lb5, fb0, fb1);
}
    boolean lb6 = true;
    lb3 = fd1 > ld1;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld1, lb5, lb6, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb5, lb6, fb0);
}
    ld4 *= -1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    Thought lo2 = Thought238.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    Thought lo3 = Thought204.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
        boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb6 = true;
    boolean lb7 = true;
    lb5 = !lb6;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    double ld0 = 970.5962134924285;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Output.points[2][5] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought158.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    ld0 = fd0 - fd1;
    fb1 = !fb0;
    ld0 = fd0 + fd1;
    double ld2 = 260.32718660016366;
    ld0 = ld2 + fd0;
    fd1 = ld0 + ld2;
    double ld3 = 196.40102331695172;
    ld3 = fd0 + fd1;
    fb1 = ld0 > ld2;
    ld3 = fd0 - fd1;
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
}
