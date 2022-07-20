package genetic;
import java.util.ArrayList;
class Thought263 extends Thought{
private static ArrayList<Thought263> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 649.5209755207455;
private double fd1 = 547.6683967359387;
private Thought fo0 = null;
private Thought fo1 = null;
Thought263 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought263 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought263 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought263 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought263 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought263 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought263 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought263 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought263 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought263 instance = new Thought263 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought263 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought263 instance = new Thought263 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought263 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought263 instance = new Thought263 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought263 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought263 instance = new Thought263 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought263 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought263 instance = new Thought263 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought263 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought263 instance = new Thought263 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought263 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought263 instance = new Thought263 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought263 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought263 instance = new Thought263 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 306.1273976109101;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    Thought lo1 = Thought180.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld2 = 376.51796444142826;
    Thought lo3 = Thought374.getInstance(ld2, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    boolean lb4 = true;
    double ld5 = 100.57441864497476;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);
}
    fb1 = lb4 || fb0;
    fb1 = ld2 > ld5;
    fd0 = fd1 - ld0;
        Thought lo6 = Thought216.getInstance(fo0, fo1, fo0, fo1);
    Thought lo7 = Thought135.getInstance(ld2, ld5, fd0, fd1);
    ld0 = ld2 - ld5;
    lb4 = !fb0;
    Thought lo8 = Thought304.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
    Thought lo9 = Thought227.getInstance();
if(fo0 != null){
      fo0.m3(fb1, lb4, fb0, fb1);
}
    ld5 = fd0 + fd1;

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
    Output.points[4][7] -= fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought84.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    Thought lo2 = Thought302.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    Thought lo3 = Thought28.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    fd0 = fd1 + fd0;
    double ld4 = 721.6225514041926;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ld4, fd0, ab2, ab3, ab4, fb0);
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
    boolean lb0 = true;
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = !fb0;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought239.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = false;
    fd0 *= -1;
    double ld3 = 880.8876381903584;
    Output.points[4][8] += fd0;
    fb0 = fd1 < ld3;
    boolean lb4 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb0;
    lb2 = lb4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb2, lb4, fb0);
}
    Thought lo5 = Thought393.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2, fb1, lb0, lb2, lb4);
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    Output.points[5][0] -= ad3;
    Output.points[5][1] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
if(fo1 != null){
      ad4 = fo1.m3(lb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fb0 = !fb1;

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
    Output.points[5][2] -= fd0;
    if (fb0) {
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        double ld0 = 140.99905547357707;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        } else if (fb0) {
        fd0 = fd1 + fd0;
        fd1 *= -1;
        boolean lb1 = false;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
        double ld2 = 250.34105252678503;
        boolean lb3 = true;
        } else if (fb0) {
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        double ld4 = 742.5289638006562;
        boolean lb5 = false;
        Thought lo6 = Thought294.getInstance();
        fb0 = !fb1;
if(fo1 != null){
          lb5 = fo1.m2(fb0, fb1, lb5, fb0);
}
        ld4 *= -1;
        fb1 = lb5 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld4, fd0, fb1, lb5, fb0, fb1);
}
        double ld7 = 772.6685978785011;
        boolean lb8 = true;
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
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    lb0 = ad4 < fd0;
    Thought lo1 = Thought304.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
    fb1 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fd1 *= -1;
    fb0 = ad1 > ad2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought388.getInstance(ad3, ad4, fd0, fd1);

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
    Output.points[5][3] -= fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb0 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    Output.points[5][4] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
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
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = !lb1;
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[5][5] += fd1;

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
    Output.points[5][6] -= fd0;
    fd1 = fd0 - fd1;
    if (fb1) {
        Thought lo0 = Thought386.getInstance();
        fb0 = !fb1;
        Thought lo1 = Thought252.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = false;
        fd0 = fd1 - fd0;
        lb2 = fb0 || fb1;
        lb2 = !fb0;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
        fd0 = fd1 + fd0;
        double ld3 = 637.8670008592975;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[5][7] -= fd0;
        fb0 = fb1 || lb2;
        Output.points[5][8] += fd1;
        ld3 *= -1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought177.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab1 = fo1.m2();
}
if(fo0 != null){
          fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
        Output.points[6][0] += fd1;
        fd0 = fd1 - fd0;
        Output.points[6][1] -= fd1;
        double ld1 = 700.6669036652086;
        fb1 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
        fd0 *= -1;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
        double ld2 = 541.8550660404205;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        }
    ab2 = fd1 < fd0;
    boolean lb3 = true;
    boolean lb4 = false;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo5 = Thought128.getInstance();

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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought364.getInstance(fb1, fb0, fb1, fb0);
    ad1 = ad2 - ad3;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Output.points[6][2] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought284.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    fb1 = !fb0;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    Output.points[6][3] += ad1;
    ad2 = ad3 - ad4;
    Output.points[6][4] += fd0;

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
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    boolean lb0 = false;
    fb0 = ad2 < ad3;
    fb1 = lb0 && ab1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
if(fo1 != null){
      ab1 = fo1.m2();
}
    boolean lb2 = true;
    ab1 = ad3 < ad4;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
    if (ab1) {
        Output.points[6][5] += ad4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        fb1 = ad3 < ad4;
        if (lb0) {
            Thought lo3 = Thought348.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
            Output.points[6][6] += fd0;
            ab3 = fd1 < ad1;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    Output.points[6][7] -= fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought208.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
        double ld1 = 393.4755174333655;
        Output.points[6][8] += fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
        ld1 = fd0 - fd1;
        ld1 = fd0 + fd1;
        fb0 = !fb1;
        lb2 = !fb0;
        fb1 = ld1 < fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2();
}
    Thought lo0 = Thought46.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad1 > ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld1 = 11.20746838867005;
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = false;
        fd0 = fd1 + ld1;
        lb2 = fb0 || fb1;
        lb2 = ad1 < ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought197.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao2.m3();
}
    boolean lb1 = false;
    if (ab1) {
        fd1 = fd0 + fd1;
        double ld2 = 98.69694795145683;
        ld2 = fd0 + fd1;
        ld2 *= -1;
        ab2 = fd0 > fd1;
if(ao3 != null){
          ao3.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
}
        Thought lo3 = Thought345.getInstance(fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb1);
        double ld4 = 506.0906487370373;
        boolean lb5 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld2, ld4, fd0);
}
        ab4 = fd1 < ld2;
        ld4 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld4, fd0, fd1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2();
}
    Thought lo0 = Thought247.getInstance(ab1, ab2, ab3, ab4);
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    ab2 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
    lb1 = ad3 < ad4;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb1, ab1);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld3 = 571.3571627653873;
    ad4 *= -1;
    Thought lo4 = Thought114.getInstance(fd0, fd1, ld3, ad1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    double ld5 = 332.23278403800487;
    boolean lb6 = true;
    lb6 = fd0 < fd1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought99.getInstance();
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
        boolean lb2 = false;
    lb1 = lb2 || fb0;
    Output.points[7][0] -= fd0;
    fb1 = fd1 > fd0;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
        Thought lo1 = Thought363.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    Thought lo2 = Thought225.getInstance(fd1, fd0, fd1, fd0);
    Output.points[7][1] += fd1;
        Thought lo3 = Thought113.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb4, ab1, ab2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;

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
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    double ld0 = 872.0984598294378;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    double ld1 = 959.3528564403298;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[7][2] -= ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    if (fb1) {
        boolean lb2 = true;
        boolean lb3 = false;
        lb2 = ld1 < ad1;
        lb3 = fb0 && fb1;
        lb2 = ad2 > ad3;
        double ld4 = 472.7229976471566;
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
    Thought lo0 = Thought68.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ab2 = ad3 < ad4;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought171.getInstance();
    boolean lb2 = true;
    fb0 = fb1 || lb2;
    double ld3 = 924.6461347974076;
    Thought lo4 = Thought58.getInstance(ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
    Thought lo5 = Thought199.getInstance(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, fb0, fb1, lb2, ab1);
    ad4 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld3, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][3] -= fd0;
    boolean lb7 = false;
    ab2 = !ab3;
        fd1 = ld3 - ad1;
    ad2 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          fd0 = ao3.m3();
}
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
    Output.points[7][4] -= fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      lb0 = ao4.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought90.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    Output.points[7][5] -= fd1;
    fd0 = fd1 - fd0;

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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3();
}
    Thought lo1 = Thought309.getInstance(lb0, fb0, fb1, lb0);
    fb0 = ad1 > ad2;
    ad3 *= -1;
    fb1 = ad4 > fd0;
    Output.points[7][6] -= fd1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    double ld2 = 225.25376958144602;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought66.getInstance(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo4 = Thought182.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2);
}
if(ao1 != null){
      ao1.m2();
}
    boolean lb5 = false;
if(ao2 != null){
      lb5 = ao2.m2(fb0, fb1, lb0, lb5);
}
    ad3 = ad4 - fd0;
    fd1 = ld2 + ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, fb1, lb0, lb5, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = lb0 && lb5;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
        fd1 *= -1;
        ab3 = ab4 || fb0;
        double ld0 = 148.11469826791256;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
if(ao4 != null){
          ld0 = ao4.m3();
}
        boolean lb1 = true;
        fb0 = fd0 > fd1;
if(fo0 != null){
          ld0 = fo0.m3(fb1, lb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
        ab4 = fd1 > ld0;
        fb0 = fb1 || lb1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
        ld0 = fd0 - fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, ab1);
}
        ab2 = ab3 || ab4;
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
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    double ld0 = 802.2841070222132;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld1 = 708.6109143521624;

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
    Thought lo0 = Thought54.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[7][7] += fd0;
    Output.points[7][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[8][0] -= fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    if (fb0) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
        double ld2 = 60.24375885594465;
if(fo0 != null){
          fo0.m3(ld2, fd0, fd1, ld2);
}
        boolean lb3 = true;
        if (lb1) {
            fd0 *= -1;
            lb3 = fb0 && fb1;
            fd1 = ld2 + fd0;
            lb1 = lb3 || fb0;
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
    fd0 *= -1;
    Output.points[8][1] -= fd1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = fd1 > fd0;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4();
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
    Output.points[8][2] += ad2;
    Output.points[8][3] -= ad3;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = ad3 < ad4;
    Thought lo1 = Thought185.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    fd0 = fd1 + ad1;
    double ld2 = 90.42707670644565;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      lb0 = fo0.m2(ad4, fd0, fd1, ld2);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    ab3 = fd1 > ad1;

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
    double ld0 = 898.0996232957614;
    fd0 *= -1;
    fd1 *= -1;
    fb1 = ld0 > fd0;
    fb0 = fd1 > ld0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(ao1 != null){
      ao1.m2(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb1 = false;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    fb0 = !fb1;
    Output.points[8][4] += fd0;
    fd1 = ld0 + fd0;
    if (lb1) {
        Thought lo2 = Thought330.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
        double ld3 = 674.5530512256507;
if(ao3 != null){
          ao2 = ao3.m4(ld3, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
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
    fb0 = ad1 > ad2;
    Output.points[8][5] += ad3;
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
    double ld0 = 874.8085452171957;
    if (fb0) {
        fb1 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        ad2 *= -1;
        fb1 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
        if (fb1) {
if(ao3 != null){
              fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
            double ld1 = 679.0103141950461;
if(ao3 != null){
              ao2 = ao3.m4();
}
if(ao4 != null){
              ao4.m2(fb1, fb0, fb1, fb0);
}
            double ld2 = 809.519110732717;
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
              ao4.m1(fd1, ld1, ld2, ld0, fb1, fb0, fb1, fb0);
}
            Thought lo3 = Thought295.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
            } else if (fb1) {
            Output.points[8][6] += ad3;
            ad4 = fd0 - fd1;
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
              fb0 = ao2.m2(ld0, ad1, ad2, ad3);
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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    double ld0 = 111.93825931187452;
        fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;

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
    ab2 = !ab3;
    double ld0 = 159.27142648974615;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought68.getInstance(ld0, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        ld0 = ad1 - ad2;
        ad3 = ad4 + fd0;
if(ao1 != null){
          fo1 = ao1.m4();
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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought253.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld1 = 70.60931359553474;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = false;

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
    Output.points[8][7] += fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought53.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    double ld1 = 588.6453206993101;
    fd0 *= -1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Thought lo1 = Thought23.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    fd0 *= -1;
    Thought lo2 = Thought9.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    Thought lo3 = Thought9.getInstance();
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Output.points[8][8] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
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
