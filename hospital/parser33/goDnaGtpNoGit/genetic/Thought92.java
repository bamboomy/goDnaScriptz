package genetic;
import java.util.ArrayList;
class Thought92 extends Thought{
private static ArrayList<Thought92> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 475.9766525643852;
private double fd1 = 438.522049480733;
private Thought fo0 = null;
private Thought fo1 = null;
Thought92 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought92 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought92 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought92 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought92 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought92 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought92 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought92 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought92 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
        fb0 = fd0 > fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    Output.points[1][3] += fd0;
    fd1 = fd0 + fd1;
    if (lb1) {
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = lb0 || lb1;
        Output.points[1][4] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fd1 < fd0;
if(fo0 != null){
          fb1 = fo0.m2(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
        lb0 = fd1 < fd0;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
        double ld2 = 631.8858652446777;
        lb1 = fd0 > fd1;
        fb0 = fb1 && lb0;
        boolean lb3 = false;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    Thought lo1 = Thought168.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    double ld2 = 137.77545726872304;
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
    ld2 = fd0 - fd1;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      ld2 = fo1.m3();
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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    double ld0 = 76.7927752856742;
    ad1 *= -1;
    fb1 = fb0 && fb1;
    Output.points[1][5] += ad2;
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
    fb1 = fd1 > ld0;
    Thought lo1 = Thought327.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    Output.points[1][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 - ad1;
    Thought lo2 = Thought72.getInstance(ad2, ad3, ad4, fd0);
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3();
}
    Output.points[1][7] -= fd0;
    if (lb3) {
        fb0 = fd1 > ld0;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb4, lb3);
}
        double ld5 = 905.839555254298;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, lb4, lb3);
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
    Thought lo0 = Thought353.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    if (ab1) {
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        ad1 *= -1;
        double ld2 = 224.66374182373778;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 - fd1;
    fb1 = lb0 || lb1;
    Output.points[1][8] += fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    Output.points[2][0] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    Thought lo3 = Thought157.getInstance();
    fd0 *= -1;
    Thought lo4 = Thought49.getInstance(lb2, fb0, fb1, lb0);
    Thought lo5 = Thought49.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
    fd1 *= -1;
    lb0 = lb1 && lb2;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
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
    double ld0 = 71.93965898187678;
    fb0 = ld0 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    double ld1 = 718.074578969798;
    Thought lo2 = Thought40.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
    ad1 *= -1;
if(ao1 != null){
      ao1.m3();
}
    Thought lo3 = Thought159.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;

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
    ab1 = ab2 && ab3;
    double ld0 = 756.766692734808;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 < ld0;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    boolean lb1 = true;
if(ao2 != null){
      ao2.m1();
}
    lb1 = ld0 < fd0;
    double ld2 = 686.2171392640957;
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = ld0 > ld2;
    lb1 = fd0 < fd1;
    ld0 = ld2 + fd0;
    fd1 = ld0 - ld2;
    ab1 = !ab2;
        double ld3 = 146.1095692125946;
    ld3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;

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
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
        Output.points[2][1] -= ad2;
        double ld1 = 886.3402798832801;
        Thought lo2 = Thought18.getInstance(ao3, ao4, fo0, fo1);
        boolean lb3 = true;
        ad2 *= -1;
        ad3 = ad4 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld1, ad1, ad2);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    boolean lb0 = true;
        double ld1 = 464.9049827117679;
    lb0 = fd0 < fd1;

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
    fd0 = fd1 + fd0;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[2][2] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought303.getInstance();
    ab4 = fd1 < fd0;
    Thought lo1 = Thought142.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
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
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        Thought lo1 = Thought93.getInstance(fo1, fo0, fo1, fo0);
        Thought lo2 = Thought177.getInstance(ad3, ad4, fd0, fd1);
        double ld3 = 369.3492562785762;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
        fb1 = lb0 || fb0;
        double ld4 = 411.41552563885386;
        Thought lo5 = Thought387.getInstance(fb1, lb0, fb0, fb1);
        Thought lo6 = Thought195.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
        for(int i1=0; i1<10; i1++){
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
    ab1 = ad1 > ad2;
    ab2 = ab3 && ab4;
    ad3 *= -1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = ad3 < ad4;
    ab4 = fd0 < fd1;
    Thought lo1 = Thought30.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    double ld2 = 679.3408903768536;
    ld2 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought252.getInstance();
if(fo0 != null){
      ld2 = fo0.m3(fb1, lb0, ab1, ab2);
}
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(ld2, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 494.46507042932217;
    Output.points[2][3] += ld0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
    double ld2 = 133.01745228313132;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0);
}
    lb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m3();
}
    ld2 *= -1;
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld2, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    fd1 = ld0 + ld2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 972.5187757272928;
if(ao2 != null){
      ld0 = ao2.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
    ld0 = ad1 - ad2;
    boolean lb2 = true;
    double ld3 = 738.4960926740673;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ld3, ad1, ad2, ad3);
}
    lb2 = !fb0;

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
if(ao2 != null){
      ab1 = ao2.m2();
}
    ab2 = ab3 && ab4;
    double ld0 = 103.7119569155593;
    boolean lb1 = false;
    ab4 = fb0 || fb1;
    lb1 = ab1 || ab2;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ab4 = fb0 || fb1;
    Output.points[2][4] += fd1;
    lb1 = ld0 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = ld0 < fd0;
    Output.points[2][5] -= fd1;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3(ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    lb1 = ad1 > ad2;
    Thought lo2 = Thought373.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    lb0 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 397.92688320071005;
    fd0 = fd1 + ld0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    double ld1 = 247.09323114017894;
    Output.points[2][6] -= ld0;
    Output.points[2][7] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 740.9170362125326;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && lb1;
    boolean lb2 = false;
    lb2 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    double ld4 = 974.878928589605;
    ld4 = fd0 - fd1;

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
    ad2 = ad3 - ad4;
    double ld0 = 561.9813621918906;
    double ld1 = 194.59204614704535;
    ad3 = ad4 - fd0;
    double ld2 = 158.41070497547858;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    boolean lb3 = true;
    fb0 = fb1 && lb3;
    ld2 = ad1 + ad2;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought385.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = ab4 || fb0;
    boolean lb2 = true;
    Thought lo3 = Thought275.getInstance(fb0, fb1, lb1, lb2);
    boolean lb4 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb4, ab1, ab2, ab3);
}
    boolean lb5 = true;
    ab3 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ab4 = ad1 < ad2;

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
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld1 = 509.3626744826715;
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
        Output.points[2][8] += ld1;
        boolean lb2 = false;
        lb2 = lb0 || fb0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, fb1, lb2, lb0, fb0);
}
        } else {
        Thought lo3 = Thought259.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = fd0 < fd1;
        Thought lo4 = Thought167.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo0 = Thought278.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought62.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    Output.points[3][0] -= ad3;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        Thought lo2 = Thought329.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Output.points[3][1] += ad2;
        double ld3 = 394.92037638112055;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        Thought lo4 = Thought176.getInstance(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld5 = 267.54418628136443;
        Thought lo6 = Thought183.getInstance(fb0, fb1, fb0, fb1);
        Thought lo7 = Thought264.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(ld3, ld5, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        double ld8 = 315.66184778181486;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
        double ld9 = 299.9811273683187;
        Output.points[3][2] += ad1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
    boolean lb1 = false;
    Output.points[3][3] -= fd1;
    fd0 *= -1;
    lb0 = fd1 > fd0;
    Output.points[3][4] += fd1;
    lb1 = fd0 > fd1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    lb3 = fd0 > fd1;
    Thought lo4 = Thought344.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    lb1 = lb2 || lb3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    boolean lb5 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    double ld6 = 238.35418878056447;
    lb2 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ld6;
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
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ab1 = ab2 && ab3;
    double ld0 = 986.9935256023081;
if(ao2 != null){
      ad3 = ao2.m3();
}
    if (ab4) {
if(ao3 != null){
          fb0 = ao3.m2(fb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
        ad1 = ad2 - ad3;
        ab2 = ab3 || ab4;
if(ao3 != null){
          ao3.m3(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ad1 = ad2 - ad3;
        ab1 = !ab2;
        ab3 = ab4 && fb0;
if(ao3 != null){
          fb1 = ao3.m2(ad4, fd0, fd1, ld0);
}
        ab1 = ad1 > ad2;
        double ld1 = 91.09085515953917;
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
    fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    Output.points[3][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    Output.points[3][6] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought227.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);

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
    ab1 = !ab2;
    Thought lo0 = Thought195.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    ab1 = fd0 < fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought63.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb1;
    Output.points[3][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
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
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        fd0 = fd1 - ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought163.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
        boolean lb1 = true;
        double ld2 = 577.1974247811575;
        ad4 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        for(int i1=0; i1<10; i1++){
            lb1 = ad2 < ad3;
            double ld3 = 706.0518274859551;
            ad3 = ad4 + fd0;
if(fo1 != null){
              fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
            double ld4 = 4.60253854113129;
            fb1 = fd0 < fd1;
            boolean lb5 = true;
            boolean lb6 = true;
}}
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
    boolean lb0 = true;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ad4 = fd0 + fd1;
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
    boolean lb2 = true;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ad1 > ad2;
    ab2 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ab3 = !ab4;
    boolean lb4 = false;
    ad2 = ad3 - ad4;
    Thought lo5 = Thought303.getInstance(fd0, fd1, ad1, ad2);
    double ld6 = 790.3706381520022;
    boolean lb7 = false;

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
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        boolean lb0 = true;
        Thought lo1 = Thought331.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
        fb0 = fb1 || lb0;
if(fo0 != null){
          fb0 = fo0.m2();
}
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    lb0 = ad4 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, ad1, ad2, ad3);
}
    fb1 = !lb0;
    boolean lb1 = true;
    double ld2 = 501.1254301371995;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2);
}
    double ld3 = 195.15280244254734;
    lb1 = !fb0;
if(ao1 != null){
      ld3 = ao1.m3();
}
    fb1 = lb0 && lb1;
if(ao2 != null){
      ao2.m1(fb0, fb1, lb0, lb1);
}
    boolean lb4 = false;
    boolean lb5 = false;
    ad1 = ad2 - ad3;
    double ld6 = 404.6168394682012;
    lb4 = !lb5;
    Thought lo7 = Thought243.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
    lb4 = ld2 > ld3;
    lb5 = !fb0;
    boolean lb8 = false;
if(ao1 != null){
      fb0 = ao1.m2(ld6, ad1, ad2, ad3, fb1, lb0, lb1, lb4);
}
    ad4 *= -1;
    fd0 = fd1 + ld2;
    boolean lb9 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    fd1 *= -1;
    Thought lo0 = Thought266.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[3][8] -= fd1;
    Output.points[4][0] -= fd0;
    double ld1 = 306.5004046398413;
    Output.points[4][1] -= fd0;
    fd1 *= -1;
    ld1 *= -1;
    double ld2 = 479.6511325409153;
    ab2 = ld2 > fd0;
    fd1 = ld1 + ld2;
    Output.points[4][2] -= fd0;
    fd1 = ld1 + ld2;
    Thought lo3 = Thought181.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2);
    ab3 = !ab4;
    Output.points[4][3] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ad2 = ad3 - ad4;
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
    Thought lo0 = Thought53.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ad1 *= -1;
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    double ld1 = 988.0615342283421;
    ad1 = ad2 + ad3;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    ad4 *= -1;

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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    Thought lo1 = Thought25.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);

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
    Thought lo0 = Thought316.getInstance();
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 588.4142949935742;
    ld1 = fd0 - fd1;
    ld1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 + ld1;
    boolean lb2 = false;
    lb2 = !fb0;
    fd0 = fd1 + ld1;
    fb1 = fd0 > fd1;
    ld1 *= -1;
if(fo0 != null){
      fo0.m3(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
if(fo1 != null){
      fo1.m2(fd1, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
    ld1 = fd0 + fd1;
    lb2 = !fb0;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    Thought lo0 = Thought382.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought86.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Output.points[4][4] -= fd0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = !lb1;
    fd0 = fd1 - fd0;
    lb3 = !fb0;
    boolean lb4 = false;
    Thought lo5 = Thought42.getInstance(fd1, fd0, fd1, fd0);
        Thought lo6 = Thought335.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = !fb1;
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
}
