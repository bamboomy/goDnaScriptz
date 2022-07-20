package genetic;
import java.util.ArrayList;
class Thought156 extends Thought{
private static ArrayList<Thought156> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 399.4536966010938;
private double fd1 = 176.55218685550645;
private Thought fo0 = null;
private Thought fo1 = null;
Thought156 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought156 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought156 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought156 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought156 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought156 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought156 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought156 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought156 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought156 instance = new Thought156 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought156 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought156 instance = new Thought156 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought156 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought156 instance = new Thought156 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought156 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought156 instance = new Thought156 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought156 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought156 instance = new Thought156 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought156 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought156 instance = new Thought156 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought156 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought156 instance = new Thought156 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought156 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought156 instance = new Thought156 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    double ld0 = 29.535588154372288;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + ld0;
    boolean lb1 = true;
    Thought lo2 = Thought142.getInstance(fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb3 = true;
    lb3 = fb0 && fb1;
    boolean lb4 = false;
    boolean lb5 = false;
    lb1 = lb3 || lb4;
    lb5 = ld0 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
}
    lb4 = lb5 && fb0;

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
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 191.69397467858465;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab1 = !ab2;
    Thought lo2 = Thought182.getInstance();
    Thought lo3 = Thought215.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought254.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, ab1);
    ld0 = fd0 + fd1;
    ld0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
    boolean lb5 = true;
    lb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    lb5 = ab1 && ab2;
    Thought lo6 = Thought385.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld7 = 201.60486849511875;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        fb0 = ad4 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Output.points[2][3] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought243.getInstance(fo1, fo0, fo1, fo0);
    Output.points[2][4] += ad1;
    double ld1 = 433.7088998742949;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    double ld2 = 515.8652695897754;
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
        double ld3 = 348.74539965243827;
    boolean lb4 = false;
    lb4 = fb0 || fb1;
    Thought lo5 = Thought86.getInstance(lb4, fb0, fb1, lb4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb4, fb0);
}
    Thought lo6 = Thought75.getInstance(ld1, ld2, ld3, ad1, fb1, lb4, fb0, fb1);
    Output.points[2][5] += ad2;

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
    ab1 = ad2 > ad3;
    if (ab2) {
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(ad1, ad2, ad3, ad4);
}
        ab1 = ab2 && ab3;
        Thought lo0 = Thought0.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo1.m1(ab1, ab2, ab3, ab4);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 917.4625844055425;
    ld0 = fd0 + fd1;
    fb1 = ld0 > fd0;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
    for(int i0=0; i0<10; i0++){
        double ld1 = 115.7610389835468;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        Output.points[2][6] += fd0;
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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 640.7766684843525;
    if (lb0) {
        boolean lb2 = false;
        Thought lo3 = Thought361.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
        ad1 = ad2 - ad3;
if(ao2 != null){
          lb0 = ao2.m2();
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb2, lb0);
}
        Output.points[2][7] += ad4;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1, fb0, fb1, lb2, lb0);
}
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb2, lb0, fb0);
}
        if (fb1) {
            lb2 = lb0 || fb0;
            fb1 = lb2 || lb0;
            double ld4 = 73.91786569297285;
            double ld5 = 209.1659492104036;
            boolean lb6 = false;
            lb0 = fb0 || fb1;
            ad4 *= -1;
if(fo1 != null){
              fo1.m2(ao1, ao2, ao3, ao4, lb6, lb2, lb0, fb0);
}
            } else if (lb2) {
            boolean lb7 = false;
            Thought lo8 = Thought93.getInstance(fo0, fo1, ao1, ao2);
}}
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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    Output.points[2][8] -= fd1;
    boolean lb2 = false;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    boolean lb3 = true;
    lb0 = lb1 && lb2;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    lb3 = ab1 || ab2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        ab3 = ab4 && fb0;
    fd1 *= -1;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - fd0;
    lb2 = fd1 > fd0;
    Thought lo4 = Thought328.getInstance(fo1, ao1, ao2, ao3, lb3, ab1, ab2, ab3);

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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought216.getInstance(fd0, fd1, ad1, ad2);
    ad3 *= -1;
    ad4 = fd0 + fd1;
    Output.points[3][0] -= ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ab2 = ab3 || ab4;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab4 = fb0 || fb1;
    lb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb1, lb2);
}
    ab1 = ad4 < fd0;

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
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought253.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought264.getInstance();
    Output.points[3][1] += fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    boolean lb3 = true;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    double ld0 = 480.7177400567435;
    ld0 = fd0 + fd1;
    Output.points[3][2] += ld0;
    if (fb1) {
        ab1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + ld0;
        for(int i0=0; i0<10; i0++){
            fb1 = fd0 < fd1;
            ab1 = ab2 || ab3;
            Thought lo1 = Thought220.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
              fo0.m3();
}
            fd1 *= -1;
            ab2 = ld0 > fd0;
            ab3 = fd1 > ld0;
if(fo1 != null){
              fd0 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
              ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
            ab4 = fd1 > ld0;
            fd0 = fd1 + ld0;
            for(int i1=0; i1<10; i1++){
                Output.points[3][3] -= fd0;
                boolean lb2 = true;
                ab4 = fb0 || fb1;
}}}
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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    Output.points[3][4] += ad1;
    boolean lb0 = true;
    double ld1 = 740.9749210304793;
    ad1 = ad2 - ad3;
    lb0 = fb0 && fb1;
    double ld2 = 365.93895357481824;
    lb0 = fb0 || fb1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    ad4 = fd0 + fd1;
    ld1 = ld2 - ad1;

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
    Thought lo0 = Thought132.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    Thought lo3 = Thought220.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ab4 = fb0 && fb1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
        lb1 = fd0 < fd1;
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought92.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 641.7342216256965;
    ld1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    double ld3 = 978.9752329501359;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ld3);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld3);
}
    Output.points[3][5] -= fd0;
    fb0 = fd1 > ld1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m1(fb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
if(ao1 != null){
      ld3 = ao1.m3(fd0, fd1, ld1, ld3, fb0, fb1, lb2, fb0);
}
    Output.points[3][6] += fd0;
    fd1 = ld1 - ld3;
    boolean lb4 = true;
    fb0 = !fb1;
    Output.points[3][7] += fd0;
    Thought lo5 = Thought26.getInstance(ao2, ao3, ao4, fo0, lb2, lb4, fb0, fb1);
    Thought lo6 = Thought32.getInstance(fo1, ao1, ao2, ao3);

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
    fb1 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 = ad3 - ad4;
    fb0 = !fb1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    Output.points[3][8] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    if (lb0) {
        if (fb0) {
            double ld1 = 808.0352248277782;
            fb1 = lb0 || fb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] -= fd1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought368.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = !ab1;
    Thought lo2 = Thought245.getInstance(fd0, fd1, fd0, fd1);
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2();
}
    fb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        if (fb0) {
if(fo1 != null){
              fb1 = fo1.m2(lb3, lb1, ab1, ab2);
}
            ab3 = ab4 || fb0;
            fd1 = fd0 + fd1;
if(ao1 != null){
              ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb3, lb1, ab1);
}
            ab2 = !ab3;
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb3);
}
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
    Output.points[4][1] -= ad1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    boolean lb0 = false;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    if (fb0) {
        fb1 = lb0 && lb1;
        boolean lb2 = false;
        Thought lo3 = Thought222.getInstance(ad3, ad4, fd0, fd1);
        lb1 = ab1 || ab2;
        ad1 *= -1;
        ad2 = ad3 - ad4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
        ab3 = ad3 < ad4;
        Thought lo4 = Thought212.getInstance();
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
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    if (fb0) {
        Output.points[4][2] -= fd0;
        Thought lo1 = Thought285.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
        lb0 = fb0 && fb1;
        Output.points[4][3] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + fd0;
        } else if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld3 = 287.5213124945278;
        lb0 = !fb0;
        Thought lo4 = Thought303.getInstance(fb1, lb2, lb0, fb0);
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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 || fb1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb1, lb2, lb3);
}
    Thought lo4 = Thought299.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    lb3 = ab1 && ab2;
    ab3 = ab4 || fb0;
    Thought lo5 = Thought132.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);

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
    fb1 = ad1 < ad2;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 + fd0;
    Thought lo0 = Thought28.getInstance(fd1, ad1, ad2, ad3);
    boolean lb1 = false;
    lb1 = ad4 < fd0;
    fb0 = !fb1;
    Thought lo2 = Thought338.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    lb1 = ad4 > fd0;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    double ld3 = 134.41090568060247;
    lb1 = ad4 > fd0;
    boolean lb4 = true;
    if (lb4) {
        boolean lb5 = false;
        lb4 = !fb0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought150.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    ad1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought124.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[4][4] += ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;

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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    double ld0 = 16.2853073282607;
    Output.points[4][5] += fd0;
    fd1 = ld0 - fd0;
    boolean lb1 = true;
    fb0 = fd1 < ld0;
    Output.points[4][6] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    ld0 = fd0 - fd1;
    fb1 = !lb1;
    ld0 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > ld0;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || lb1;
    double ld2 = 246.9353918815096;
    fb0 = fb1 || lb1;

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
    Thought lo0 = Thought140.getInstance(ad2, ad3, ad4, fd0);
    Thought lo1 = Thought271.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    fb1 = !fb0;
    Output.points[4][7] += ad1;
    Output.points[4][8] += ad2;
    fb1 = fb0 && fb1;
    double ld2 = 726.0734241231897;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Output.points[5][0] -= ad2;
    ad3 = ad4 - fd0;
    if (fb1) {
        fd1 *= -1;
        boolean lb3 = false;
        ld2 = ad1 + ad2;
        ad3 = ad4 + fd0;
        boolean lb4 = false;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2, lb3, lb4, fb0, fb1);
}
        boolean lb5 = true;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb3, lb4, lb5, fb0);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought263.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
        double ld1 = 53.352450206769525;
    boolean lb2 = false;
    double ld3 = 547.9626108643455;
    ab4 = ld3 > fd0;
    fb0 = fb1 && lb2;
    fd1 = ld1 + ld3;
    ab1 = ab2 && ab3;
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld3);
}
    boolean lb5 = true;
    boolean lb6 = false;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[5][1] -= ld1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld1, fb1, lb2, lb4, lb5);
}
if(ao4 != null){
      ao4.m3(ld3, fd0, fd1, ld1, lb6, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    ad3 *= -1;
    double ld1 = 352.22169334872143;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 + fd0;
    fd1 = ld1 + ad1;
    fb1 = lb0 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0);
}
    double ld2 = 482.48096365061275;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, ld2, ad1);
}
    Thought lo3 = Thought109.getInstance();
    double ld4 = 754.3031853721538;
    Thought lo5 = Thought246.getInstance(ab3, ab4, fb0, fb1);
    ad1 *= -1;
    lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fb1 = ad2 > ad3;
    lb0 = ad4 > fd0;
    boolean lb6 = false;
    fd1 = ld1 + ld2;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld4, ad1, ad2, ad3, lb6, ab1, ab2, ab3);
}
    boolean lb7 = true;
    ad4 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    double ld0 = 726.8425227206582;
        fb1 = fb0 && fb1;
    boolean lb1 = true;
    lb1 = ld0 > fd0;
    fb0 = !fb1;
    fd1 = ld0 + fd0;

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
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought206.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought116.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
    fd1 = fd0 - fd1;

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
      fo1 = fo0.m4();
}
        boolean lb0 = true;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    lb0 = !fb0;
    fb1 = fd0 < fd1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 411.1543436471642;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought5.getInstance();
    boolean lb3 = false;
    fb0 = fd1 > ld1;
    fb1 = !lb0;
if(fo1 != null){
      fo1.m2(lb3, fb0, fb1, lb0);
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Output.points[5][2] -= ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    Output.points[5][3] += ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld1 = 578.4716031242438;
    ab2 = ad4 < fd0;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ab2 = !ab3;
    boolean lb2 = true;
    ab3 = fd1 > ld1;
    ab4 = fb0 && fb1;
    ad1 = ad2 + ad3;
    boolean lb3 = false;

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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought163.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
        ad3 *= -1;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    Thought lo1 = Thought386.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);

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
    ab1 = !ab2;
    boolean lb0 = true;
    fd0 *= -1;
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    Output.points[5][4] -= fd1;
    Thought lo2 = Thought293.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
    boolean lb3 = true;
    fb0 = fd0 > fd1;
    Output.points[5][5] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb3);
}
    ab1 = fd1 > fd0;

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
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 *= -1;
    ab1 = ab2 && ab3;
        boolean lb0 = true;
    ab3 = ab4 || fb0;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
    ab1 = ad1 < ad2;
    Output.points[5][6] -= ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
    ad2 = ad3 + ad4;

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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb0 = fo1.m2();
}
    fb0 = fd1 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fd1 = fd0 + fd1;
    Thought lo1 = Thought59.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    Thought lo3 = Thought74.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought308.getInstance();
        fd0 = fd1 + fd0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought341.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought81.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][7] -= fd1;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 759.4796302137827;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1();
}
    boolean lb3 = false;
    fb0 = fb1 && lb3;
    Output.points[5][8] -= ld2;
    fd0 = fd1 + ld2;
    double ld4 = 537.6734535623823;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, fb0);
}
    ld4 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld2, ld4, fd0, fd1, fb1, lb3, fb0, fb1);
}
if(fo0 != null){
      ld2 = fo0.m3(ld4, fd0, fd1, ld2, lb3, fb0, fb1, lb3);
}
    ld4 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fb1 = !lb3;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought200.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
        boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    boolean lb2 = false;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought160.getInstance(lb1, lb2, fb0, fb1);

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
