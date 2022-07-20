package genetic;
import java.util.ArrayList;
class Thought93 extends Thought{
private static ArrayList<Thought93> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 693.3643223550622;
private double fd1 = 83.80825030484671;
private Thought fo0 = null;
private Thought fo1 = null;
Thought93 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought93 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought93 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought93 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought93 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought93 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought93 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought93 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought93 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought93 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought93 instance = new Thought93 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 341.93728904320545;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought132.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
        fb1 = !lb1;
    fb0 = fd1 < ld0;
    fb1 = fd0 < fd1;
    boolean lb3 = true;
    Thought lo4 = Thought368.getInstance(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
    lb1 = ld0 > fd0;
        fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;
    ld0 = fd0 - fd1;

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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought179.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3();
}
    ab2 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
            Thought lo1 = Thought98.getInstance(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    if (fb0) {
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        Thought lo0 = Thought122.getInstance();
        fb0 = ad3 < ad4;
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        boolean lb1 = false;
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
    ab2 = !ab3;
    ad2 = ad3 - ad4;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = ad3 < ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad3 = fo1.m3();
}
    boolean lb1 = true;
    boolean lb2 = true;
    double ld3 = 702.305368628907;
    Thought lo4 = Thought367.getInstance(ab2, ab3, ab4, fb0);
    Thought lo5 = Thought262.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4(ld3, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
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
    fd0 *= -1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought330.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    lb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    Output.points[4][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb1, fb0, fb1);
}
    lb1 = fd1 > fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought376.getInstance(ao2, ao3, ao4, fo0);
    boolean lb3 = false;
    fd1 *= -1;
    boolean lb4 = true;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[4][6] += fd0;

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
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    Thought lo0 = Thought199.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought42.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb0 = ao3.m2(ad4, fd0, fd1, ad1);
}
    Thought lo2 = Thought353.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
    Output.points[4][7] -= fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    Thought lo3 = Thought220.getInstance();
    double ld4 = 834.7612731597059;
    fb1 = ld4 > ad1;
    boolean lb5 = true;
    ad2 = ad3 - ad4;
if(ao2 != null){
      lb5 = ao2.m2(fb0, fb1, lb5, fb0);
}
    Thought lo6 = Thought153.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld4, ad1, fb1, lb5, fb0, fb1);
    lb5 = ad2 > ad3;

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
    Output.points[4][8] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought370.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    Output.points[5][0] -= fd1;
    Thought lo1 = Thought231.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fd0 > fd1;
    Output.points[5][1] += fd0;
    Output.points[5][2] += fd1;
    double ld2 = 583.8508386657045;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    boolean lb3 = false;
    boolean lb4 = false;
    ab1 = !ab2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld2;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, fd0, fd1, lb3, lb4, ab1, ab2);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb6 = true;
    lb3 = fd0 < fd1;
    Thought lo7 = Thought16.getInstance(ld2, fd0, fd1, ld2);
    Thought lo8 = Thought299.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);

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
    double ld0 = 704.6018912946703;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought217.getInstance();
    Thought lo2 = Thought362.getInstance(fb0, fb1, ab1, ab2);
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        ab1 = ad4 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought144.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
        ad3 = ad4 + fd0;
        double ld4 = 471.38900475860504;
        fd0 = fd1 + ld4;
        ab4 = !fb0;
        boolean lb5 = true;
if(ao2 != null){
          ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        fb0 = fb1 || lb5;
        ad1 = ad2 - ad3;
        ad4 *= -1;
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        boolean lb6 = false;
        fd0 = fd1 - ld4;
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
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    double ld2 = 325.941931327722;
    boolean lb3 = true;
    Output.points[5][3] -= ld2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    double ld4 = 449.7885429672902;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld4, fd0, fd1);
}
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = false;
    ld4 = fd0 + fd1;
    ld2 = ld4 - fd0;
    boolean lb6 = false;
if(fo0 != null){
      lb0 = fo0.m2(lb1, lb3, lb5, lb6);
}
    boolean lb7 = true;

Thought.STACK_COUNTER++;
return lb7;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[5][4] -= fd1;
    Thought lo0 = Thought199.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, ab1, ab2);
}
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
    boolean lb0 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    ad4 *= -1;
    lb0 = lb1 && fb0;
    boolean lb2 = true;
    boolean lb3 = true;
    Thought lo4 = Thought289.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    double ld5 = 271.5374576402264;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    lb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought329.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo0 != null){
      ad3 = fo0.m3();
}
    ab1 = ad4 < fd0;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    fb0 = !fb1;
    lb0 = !lb2;
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    Thought lo3 = Thought165.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo4 = Thought27.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    boolean lb5 = false;
    double ld6 = 861.7765693626799;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        }
    lb0 = ad2 < ad3;

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
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    double ld0 = 202.47306233707405;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fd1 < ld0;
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        fb0 = fb1 && lb1;
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
    fb0 = ad1 > ad2;
    Thought lo0 = Thought379.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fb0 = ad1 > ad2;
    fb1 = lb1 && fb0;
    fb1 = lb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 - fd1;
    fb1 = ad1 > ad2;
    lb1 = ad3 > ad4;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[5][5] += fd1;
    double ld0 = 470.87096321819473;
    double ld1 = 893.8999201717536;
    double ld2 = 945.6780115739632;
    ab4 = ld0 < ld1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && ab1;
    ld2 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought117.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
        fb1 = lb3 && ab1;
    ab2 = ld0 > ld1;

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
    double ld0 = 643.036805265354;
    double ld1 = 105.01719343370836;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought118.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb3 = false;
    ab3 = ld1 > ad1;
    ad2 = ad3 + ad4;
    ab4 = fb0 && fb1;
    Output.points[5][6] += fd0;
    fd1 *= -1;
    lb3 = !ab1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab2 = !ab3;
    ab4 = ld0 > ld1;
    double ld4 = 955.4356329423063;
    fb0 = fb1 && lb3;
        ld4 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ld1 + ld4;
    double ld5 = 740.2736601196301;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld5, ad1, ad2, ad3);
}
    ab1 = ab2 && ab3;
    double ld6 = 827.5993006873093;
if(ao4 != null){
      ao3 = ao4.m4();
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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[5][7] += fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld1 = 921.8455435698527;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought145.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo3 = Thought190.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fd0 = fd1 + ld1;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0, fb0, fb1, lb4, fb0);
}
    boolean lb5 = true;
    fb0 = fd1 > ld1;
    fd0 = fd1 + ld1;
    fb1 = fd0 < fd1;

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
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Output.points[5][8] -= fd0;
        fb1 = fd1 < fd0;
    Thought lo0 = Thought334.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(lb1, ab1, ab2, ab3);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[6][0] -= fd1;
    double ld0 = 428.73037530378656;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[6][1] -= fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0);

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
    ab2 = ad1 < ad2;
if(fo1 != null){
      ab3 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    Output.points[6][2] -= fd1;
    fb0 = fb1 && ab1;
    ad1 = ad2 + ad3;
    ab2 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    double ld0 = 524.369708536539;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;

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
    fd0 *= -1;
        fd1 = fd0 - fd1;
    Thought lo0 = Thought348.getInstance(ao2, ao3, ao4, fo0);
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
        double ld1 = 196.6388041558908;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb2 = true;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb1 = fd1 < ad1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought152.getInstance();

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
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ab1, ab2, ab3, ab4);
}
    Output.points[6][3] += fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        ab3 = fd1 > fd0;
        fd1 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        double ld2 = 813.914077628225;
if(ao3 != null){
          ao3.m2(ld2, fd0, fd1, ld2);
}
        Thought lo3 = Thought85.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0);
        boolean lb4 = true;
        Output.points[6][4] += fd1;
        ld2 = fd0 + fd1;
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
if(ao2 != null){
      ad2 = ao2.m3();
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ad3 < ad4;
    lb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - ad1;
if(ao4 != null){
      ab3 = ao4.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought65.getInstance(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
    Thought lo3 = Thought362.getInstance(ao3, ao4, fo0, fo1);
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        Output.points[6][5] -= fd1;
        lb0 = lb1 && ab1;
        Output.points[6][6] += ad1;
        double ld4 = 27.332661876890064;
        ab2 = ab3 || ab4;
if(ao1 != null){
          fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld4, ad1);
}
        Output.points[6][7] += ad2;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb1 = lb0 && lb1;
        ab1 = ab2 || ab3;
        boolean lb5 = true;
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
    boolean lb0 = true;
    Output.points[6][8] -= fd0;
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = fd1 < fd0;
    lb2 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, lb2);
}
    Output.points[7][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
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
    ab1 = fd0 < fd1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 541.0873046390238;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ld0 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;

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
    Thought lo0 = Thought28.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought26.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        lb2 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        for(int i1=0; i1<10; i1++){
            lb2 = fb0 || fb1;
            fd0 *= -1;
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
    ad2 *= -1;
    double ld0 = 776.409375713436;
    boolean lb1 = false;
    Thought lo2 = Thought258.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
    double ld3 = 818.9064771777452;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, lb4, ab1, ab2, ab3);
}
    ab4 = ld0 > ld3;
    ad1 = ad2 + ad3;
    double ld5 = 527.2848686444984;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb4);
}
    ab1 = ab2 && ab3;
    double ld6 = 773.9621841748616;
    Thought lo7 = Thought310.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld5, ld6, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    boolean lb8 = true;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld3, ld5, ld6, ad1, lb4, lb8, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb4, lb8, ab1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 222.8398173573711;
    double ld1 = 257.970873828169;
    fb0 = fb1 && fb0;
    ld1 = fd0 + fd1;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ld0 = ao1.m3(ld1, fd0, fd1, ld0);
}
    boolean lb2 = true;
    Thought lo3 = Thought95.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0);
        boolean lb4 = false;
    lb2 = lb4 && fb0;
    fb1 = lb2 && lb4;
    fb0 = ld1 < fd0;
    boolean lb5 = true;
    fd1 = ld0 - ld1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
    ld1 = fd0 - fd1;
    boolean lb6 = true;

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
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld0 = 371.688158219578;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(fd1, ld0, ad1, ad2);
}
    Thought lo1 = Thought238.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;

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
    ab1 = fd0 > fd1;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought36.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    lb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought206.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);

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
    boolean lb0 = true;
    lb0 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 *= -1;
    ad3 *= -1;
    ab1 = !ab2;
    ad4 = fd0 + fd1;
    ab3 = ab4 || fb0;
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ao2.m3(fb1, lb0, ab1, ab2);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought272.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought46.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
    fb0 = fd1 < fd0;
    Thought lo3 = Thought252.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
      fo0 = fo1.m4();
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought38.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb4 = false;
    boolean lb5 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    lb5 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb0 = lb1 || lb2;
if(fo0 != null){
      lb4 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(lb5, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, lb4, lb5);
}
    fd1 = fd0 + fd1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Output.points[7][1] -= fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    Output.points[7][2] += fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
