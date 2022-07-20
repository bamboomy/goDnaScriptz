package genetic;
import java.util.ArrayList;
class Thought300 extends Thought{
private static ArrayList<Thought300> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 730.048159797003;
private double fd1 = 839.8512199894535;
private Thought fo0 = null;
private Thought fo1 = null;
Thought300 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought300 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought300 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought300 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought300 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought300 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought300 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought300 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought300 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought300 instance = new Thought300 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought300 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought300 instance = new Thought300 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought300 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought300 instance = new Thought300 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought300 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought300 instance = new Thought300 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought300 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought300 instance = new Thought300 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought300 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought300 instance = new Thought300 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought300 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought300 instance = new Thought300 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought300 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought300 instance = new Thought300 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    Thought lo0 = Thought263.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Output.points[1][2] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    if (fb0) {
        double ld1 = 944.1178978787007;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - ld1;
        fd0 = fd1 + ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Output.points[1][3] -= ld1;
        fb0 = fb1 || fb0;
        Thought lo2 = Thought209.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
        fd0 = fd1 + ld1;
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
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = fd1 > fd0;
    double ld0 = 837.806298161634;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1();
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    Thought lo2 = Thought297.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    Thought lo3 = Thought177.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
if(fo0 != null){
      fo0.m2();
}
    lb1 = fd0 > fd1;
    boolean lb4 = false;
    Thought lo5 = Thought244.getInstance(lb4, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb6 = true;
    fd1 = ld0 + fd0;
    for(int i0=0; i0<10; i0++){
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad2 = fo0.m3(fb1, lb0, fb0, fb1);
}
    ad3 = ad4 + fd0;

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
    Thought lo0 = Thought12.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought127.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2);
}
    fb1 = !lb2;
    ad3 *= -1;
    ad4 *= -1;
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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2();
}
    Thought lo1 = Thought201.getInstance(fb0, fb1, lb0, fb0);
    Thought lo2 = Thought124.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    fd0 = fd1 + fd0;
    Thought lo3 = Thought332.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fb0 = fb1 && lb0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    double ld4 = 973.9240668599699;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo5 = Thought328.getInstance(fb0, fb1, lb0, fb0);
    fd0 = fd1 + ld4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld4, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(ld4, fd0, fd1, ld4, lb0, fb0, fb1, lb0);
}
    double ld6 = 286.77669944675887;
    ld6 = fd0 - fd1;
    fb0 = fb1 && lb0;
    ld4 = ld6 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        boolean lb0 = true;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fd0 = fd1 - ad1;
        lb0 = !fb0;
        fb1 = lb0 || fb0;
if(fo1 != null){
          fo1.m1(fb1, lb0, fb0, fb1);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
        Output.points[1][4] += fd1;
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 + ad1;
        Thought lo1 = Thought128.getInstance(ao2, ao3, ao4, fo0);
        ad2 *= -1;
        ad3 = ad4 + fd0;
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
    boolean lb1 = false;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    Output.points[1][5] += fd0;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    lb0 = !lb1;
    double ld4 = 315.8398400877649;
    lb2 = ld4 < fd0;
    lb3 = !ab1;
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld4, fd0, fd1);
}
    boolean lb6 = false;

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
    ab2 = ab3 && ab4;
    ad1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m2();
}
    double ld0 = 690.3930845246133;
    boolean lb1 = false;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, lb1, ab1);
}
    Output.points[1][6] -= ld0;
    double ld2 = 515.6274230608188;
    ld2 = ad1 - ad2;
    Thought lo3 = Thought228.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = !lb1;
    boolean lb4 = false;
    ld0 = ld2 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb4, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    Thought lo1 = Thought14.getInstance(fb0, fb1, lb0, fb0);
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd1 = fd0 - fd1;
    fb1 = !ab1;
    double ld0 = 79.75393821711107;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
        fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    ab4 = !fb0;
    fb1 = !lb1;
    Thought lo2 = Thought185.getInstance(ld0, fd0, fd1, ld0);
    ab1 = fd0 > fd1;
    ab2 = ld0 < fd0;
    fd1 = ld0 + fd0;
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    double ld0 = 134.83280805996887;
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
    boolean lb1 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
    lb1 = fb0 || fb1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(lb1, fb0, fb1, lb1);
}
    fd1 = ld0 + ad1;
    boolean lb2 = true;
    ad2 = ad3 - ad4;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, lb2, lb3, fb0, fb1);
}
    ad2 *= -1;
    lb1 = lb2 && lb3;
    Output.points[1][7] -= ad3;
    boolean lb4 = true;
    boolean lb5 = false;
    ad4 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ad1, lb4, lb5, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, lb3, lb4);
}
    lb5 = ad2 < ad3;
    ad4 = fd0 + fd1;
    boolean lb6 = false;

Thought.STACK_COUNTER++;
return lb6;
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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    ab3 = ab4 || fb0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ad1 *= -1;

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
    fb1 = fb0 && fb1;
    Thought lo0 = Thought365.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    Output.points[1][8] -= fd1;
    Output.points[2][0] += fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    double ld1 = 122.6462535359706;
    if (fb1) {
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
}
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        } else if (fb0) {
if(ao1 != null){
          fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
        boolean lb3 = false;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb3, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, fd0, fb1, lb3, fb0, fb1);
}
        lb3 = fd1 > ld1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb3, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
        boolean lb4 = false;
        lb3 = fd0 < fd1;
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
    fb0 = ad1 < ad2;
    Output.points[2][1] -= ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
        Thought lo0 = Thought298.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    fb1 = ad1 > ad2;
    double ld1 = 984.4852660539166;
    Thought lo2 = Thought330.getInstance();
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, lb3, fb0, fb1, lb3);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld1, fb0, fb1, lb3, fb0);
}
    fb1 = !lb3;

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
    double ld0 = 119.13349606301168;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    ab1 = ld0 > fd0;
    ab2 = fd1 < ld0;
    Thought lo2 = Thought174.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    lb1 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb1;
    fd1 *= -1;
    Output.points[2][2] += ld0;
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    double ld3 = 523.6118538184662;
    boolean lb4 = true;
if(ao1 != null){
      lb4 = ao1.m2();
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ld0 *= -1;
    if (lb1) {
        ld3 *= -1;
        Thought lo5 = Thought350.getInstance(lb4, ab1, ab2, ab3);
        ab4 = fd0 < fd1;
        boolean lb6 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    lb0 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
        lb1 = ab1 && ab2;
        ab3 = fd0 > fd1;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
            boolean lb2 = true;
            fd0 = fd1 + ad1;
}}
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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
    Output.points[2][3] += fd0;
    fb0 = !fb1;
    lb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    lb1 = !ab1;
    ab2 = ab3 && ab4;
    double ld2 = 214.72245536245848;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
        Thought lo3 = Thought85.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
    ab1 = ab2 && ab3;
    Output.points[2][4] += fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    double ld4 = 821.74581964606;
    lb1 = ab1 && ab2;
    ld4 *= -1;
    boolean lb5 = false;
    fd0 = fd1 + ld2;
    boolean lb6 = true;
    ab1 = ab2 || ab3;
    ld4 = fd0 - fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2();
}
    fb0 = !fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought0.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought193.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          lb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        boolean lb3 = false;
        lb0 = fd0 < fd1;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        }
    double ld0 = 309.2811857946864;
    double ld1 = 802.096356951166;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld0, ld1, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    boolean lb2 = false;
    lb2 = ad1 > ad2;
    ab1 = ad3 < ad4;
    Thought lo3 = Thought219.getInstance();
    Thought lo4 = Thought382.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, lb2, ab1, ab2);
}
    ab3 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
}
    Thought lo5 = Thought307.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    boolean lb6 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
    ab4 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = true;
    lb1 = !lb2;

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
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought389.getInstance(ao2, ao3, ao4, fo0);
    fb1 = !fb0;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought300.getInstance(ad4, fd0, fd1, ad1);
    boolean lb2 = false;
    if (fb0) {
        fb1 = ad2 > ad3;
if(fo1 != null){
          lb2 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
        fb0 = !fb1;
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao2 != null){
          ao1 = ao2.m4(lb3, lb2, fb0, fb1);
}
        lb3 = lb2 && fb0;
        fb1 = ad2 > ad3;
        ad4 = fd0 + fd1;
if(ao3 != null){
          lb3 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb3);
}
if(ao2 != null){
          lb2 = ao2.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb3, lb2);
}
        ad3 *= -1;
        ad4 *= -1;
        boolean lb4 = false;
if(ao3 != null){
          lb2 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb3, lb4);
}
        } else if (fb1) {
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      fd1 = ao4.m3(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought57.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    double ld1 = 128.069596512851;
if(ao3 != null){
      ao3.m2(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    double ld5 = 29.92919533677956;
if(ao4 != null){
      ld1 = ao4.m3(lb2, lb3, lb4, ab1);
}
    ld5 = fd0 - fd1;
    ab2 = ab3 && ab4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Output.points[2][5] += ad1;
    double ld0 = 499.2576423974442;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld0;
    ad1 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab2 = ao1.m2(ad2, ad3, ad4, fd0);
}
    ab3 = !ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb0 = ld0 > ad1;
    fb1 = ad2 < ad3;
if(ao1 != null){
      ao1.m3();
}
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
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
    Thought lo0 = Thought319.getInstance(fb0, fb1, fb0, fb1);
    Output.points[2][6] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought360.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    Output.points[2][7] += fd0;
    double ld2 = 942.6630430511105;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    lb3 = fb0 && fb1;
    double ld4 = 397.5190836311638;
if(fo1 != null){
      fo0 = fo1.m4();
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
    ab1 = !ab2;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought40.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Thought lo0 = Thought241.getInstance();
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought101.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
    boolean lb3 = true;
    boolean lb4 = true;
    Thought lo5 = Thought0.getInstance(fd1, ad1, ad2, ad3, lb3, lb4, fb0, fb1);
    ad4 = fd0 + fd1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb3, lb4, fb0);
}
    Thought lo6 = Thought104.getInstance(fo0, fo1, fo0, fo1);

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
    ab1 = ab2 || ab3;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ab4 = fb0 && fb1;
    Thought lo0 = Thought151.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo1 = Thought308.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    fd1 = ad1 + ad2;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        ad4 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        Thought lo3 = Thought112.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb2, ab1);
        ad2 *= -1;
        boolean lb4 = true;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        ad4 = fd0 - fd1;
        fb0 = fb1 && lb4;
        double ld5 = 711.8305708338575;
        double ld6 = 799.6299681393714;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(ld5, ld6, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
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
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    double ld0 = 679.3414640534243;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + ld0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought367.getInstance(fb0, fb1, fb0, fb1);
    Output.points[2][8] -= fd0;
    double ld2 = 62.59178759315986;
    boolean lb3 = true;
    double ld4 = 127.78184163794978;
    double ld5 = 789.5553299987122;
    double ld6 = 817.6914278622293;
    Thought lo7 = Thought288.getInstance(ao4, fo0, fo1, ao1, ld4, ld5, ld6, fd0, lb3, fb0, fb1, lb3);
if(ao2 != null){
      ao2.m1(fd1, ld0, ld2, ld4, fb0, fb1, lb3, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, lb3, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld5 = ld6 - fd0;
    lb3 = fd1 < ld0;
if(ao3 != null){
      ao2 = ao3.m4(ld2, ld4, ld5, ld6);
}
    Thought lo8 = Thought208.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld2);
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[3][0] += ld4;
    fb0 = !fb1;
    lb3 = fb0 || fb1;
    lb3 = ld5 < ld6;
    boolean lb9 = true;
    lb9 = !fb0;

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
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    Output.points[3][1] -= ad1;
    Output.points[3][2] += ad2;
    Thought lo1 = Thought97.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    boolean lb2 = false;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
                fd1 = ad1 + ad2;
    fb1 = lb0 && lb2;
    double ld3 = 925.8344236107122;
    double ld4 = 461.81691128466986;

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
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    double ld0 = 572.0397545677389;
    Thought lo1 = Thought312.getInstance(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
    double ld2 = 902.3908886801523;
    ab2 = ab3 && ab4;
    ad1 *= -1;
    fb0 = ad2 < ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;

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
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    boolean lb0 = false;
        Thought lo1 = Thought368.getInstance(lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    fd0 *= -1;
        Thought lo2 = Thought40.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
        double ld3 = 709.2608788111623;

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
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought25.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought186.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    lb2 = fd0 < fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb2);
}
    boolean lb4 = false;
    lb3 = !lb4;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb2, lb3, lb4);
}
    boolean lb5 = false;

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
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = lb0 && fb0;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    Thought lo2 = Thought228.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[3][3] += fd0;
if(fo0 != null){
      lb1 = fo0.m2(lb3, fb0, fb1, lb0);
}
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb3, lb4, fb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);
}
    Output.points[3][4] += fd0;
    Output.points[3][5] += fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb0);
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
