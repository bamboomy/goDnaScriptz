package genetic;
import java.util.ArrayList;
class Thought356 extends Thought{
private static ArrayList<Thought356> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 15.435449459041571;
private double fd1 = 382.1116166033054;
private Thought fo0 = null;
private Thought fo1 = null;
Thought356 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought356 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought356 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought356 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought356 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought356 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought356 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought356 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought356 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought356 instance = new Thought356 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought356 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought356 instance = new Thought356 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought356 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought356 instance = new Thought356 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought356 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought356 instance = new Thought356 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought356 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought356 instance = new Thought356 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought356 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought356 instance = new Thought356 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought356 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought356 instance = new Thought356 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought356 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought356 instance = new Thought356 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[4][0] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fb1 = lb0 || fb0;
        fb1 = lb0 && fb0;
        fb1 = fd1 > fd0;
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
    ab1 = fd1 > fd0;
    Thought lo0 = Thought362.getInstance();
    Thought lo1 = Thought385.getInstance(ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    double ld2 = 193.44722488967273;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    double ld3 = 328.0797662710379;
    double ld4 = 141.9470578124323;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld3 *= -1;
    ab3 = ld4 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, ld4, fd0);
}
    Output.points[4][1] -= fd1;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, ld3, ld4, fd0);
}
    double ld6 = 790.5563174421266;
    fd0 = fd1 + ld2;
    ld3 = ld4 + ld6;

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
    ad1 = ad2 - ad3;
    fb1 = !fb0;
    fb1 = !fb0;
    ad4 *= -1;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    Output.points[4][2] += fd0;
    double ld1 = 548.6555520742724;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ld1 = ad1 + ad2;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
    boolean lb0 = false;
    ab1 = fd1 < ad1;
    ad2 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
    ab4 = !fb0;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
    double ld1 = 948.1594703343304;

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
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    Output.points[4][3] -= fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4();
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
    double ld0 = 887.246458130677;
    fb1 = !fb0;
if(ao2 != null){
      ad1 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought0.getInstance(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
    if (fb1) {
        ad3 *= -1;
        fb0 = fb1 || fb0;
        Thought lo2 = Thought365.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
        fd0 *= -1;
        double ld3 = 802.5689386745094;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld3, ld0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb1 = fb0 && fb1;
        fd0 = fd1 + ld3;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ld0 = ad1 - ad2;
        boolean lb4 = false;
        boolean lb5 = false;
        lb4 = ad3 < ad4;
        lb5 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb4, lb5);
}
        double ld6 = 381.4136159854872;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought250.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 || fb1;
    ab1 = fd1 < fd0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(ao1 != null){
      ao1.m2();
}
    double ld2 = 251.32661402499062;
if(ao3 != null){
      ao2 = ao3.m4(lb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought80.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb1);
    fd0 *= -1;
    boolean lb4 = true;
    lb4 = ab1 || ab2;
    Thought lo5 = Thought316.getInstance(fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
    lb1 = ld2 > fd0;
    double ld6 = 721.0828165561388;
    lb4 = fd0 > fd1;
    double ld7 = 215.78546876907126;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ld2 > ld6;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    lb0 = ad3 < ad4;
    Thought lo1 = Thought314.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
if(ao1 != null){
      ab1 = ao1.m2();
}
if(ao2 != null){
      ad3 = ao2.m3(ab2, ab3, ab4, fb0);
}
    Output.points[4][4] -= ad4;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    lb0 = lb2 || ab1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb0, lb2, ab1, ab2);
}
    ab3 = !ab4;
    double ld3 = 130.97745136248187;
    fb0 = ad2 < ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, lb0, lb2, ab1);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld3 = ao2.m3(ad1, ad2, ad3, ad4);
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    Output.points[4][5] += fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(lb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
    Thought lo4 = Thought261.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
    boolean lb5 = true;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb6 = true;
    boolean lb7 = false;
    double ld8 = 47.82209361927531;
if(fo0 != null){
      fo1 = fo0.m4(ld8, fd0, fd1, ld8);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        lb0 = fd1 > fd0;
        ab1 = !ab2;
        boolean lb1 = true;
        Output.points[4][6] -= fd1;
        for(int i1=0; i1<10; i1++){
            ab2 = fd0 < fd1;
            fd0 = fd1 - fd0;
            boolean lb2 = false;
            ab2 = fd1 > fd0;
if(fo1 != null){
              ab3 = fo1.m2();
}
            ab4 = fb0 || fb1;
            boolean lb3 = true;
            lb2 = fd1 < fd0;
if(fo1 != null){
              fo0 = fo1.m4(lb3, lb0, lb1, ab1);
}
            ab2 = fd1 > fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought135.getInstance(fd0, fd1, ad1, ad2);
    Thought lo1 = Thought376.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
    Thought lo2 = Thought136.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb3);
}
    ad1 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
        boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 - fd0;
    ab3 = ab4 && fb0;
    fb1 = lb0 || lb1;

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
    Output.points[4][7] -= fd1;
    double ld0 = 780.5218641489652;
if(ao2 != null){
      ld0 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Output.points[4][8] -= fd0;
    fb0 = fd1 > ld0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought369.getInstance(fd1, ld0, fd0, fd1);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb0 = fd1 < ld0;
    double ld2 = 766.8354499193193;
    fb1 = fb0 || fb1;
    Output.points[5][0] += ld2;
if(fo1 != null){
      fo1.m1();
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
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought28.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought109.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
        Thought lo2 = Thought230.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
        fd0 = fd1 + ad1;
        Output.points[5][1] -= ad2;
        fb0 = !fb1;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ad3 = ao3.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(fb1, fb0, fb1, fb0);
}
        boolean lb3 = false;
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
    fd0 = fd1 - fd0;
    ab1 = !ab2;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 324.336537386586;
    boolean lb1 = true;
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
        lb1 = ab1 || ab2;
        Output.points[5][2] += fd0;
if(ao1 != null){
          ab3 = ao1.m2();
}
        ab4 = fb0 && fb1;
        lb1 = !ab1;
if(ao2 != null){
          ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
        fd1 *= -1;
        ld0 = ad1 + ad2;
        if (lb1) {
            if (ab1) {
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
                fb1 = lb1 || ab1;
                ab2 = !ab3;
                double ld2 = 564.0616315386495;
                } else if (ab4) {
if(ao4 != null){
                  ao3 = ao4.m4(ld0, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
                ab2 = ad4 > fd0;
                ab3 = fd1 < ld0;
if(fo0 != null){
                  ad1 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
                boolean lb3 = false;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought103.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = false;
    fd0 *= -1;
    lb1 = fb0 && fb1;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[5][3] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld2 = 218.06852618578688;
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb1);
}
    lb3 = !fb0;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought98.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb1, lb1, lb3, fb0);
        fb1 = lb1 && lb3;
        fb0 = ld2 < fd0;
        fb1 = fd1 > ld2;
        fd0 *= -1;
        boolean lb5 = true;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fd1, ld2, fd0, fd1, lb5, lb1, lb3, fb0);
}
            fb1 = !lb5;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            lb5 = !lb1;
            ld2 = fd0 - fd1;
if(fo1 != null){
              fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
}}
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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought331.getInstance();
    double ld1 = 566.7843558194305;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
    boolean lb3 = false;
    ld1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
    lb2 = fd1 < ld1;

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
    fb1 = ad1 < ad2;
    ad3 *= -1;
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 589.5812032487814;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 || fb1;
    boolean lb2 = true;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    boolean lb4 = true;
    double ld5 = 90.78749015982365;
    lb2 = lb3 || lb4;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m1();
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    Thought lo1 = Thought349.getInstance(ab3, ab4, fb0, fb1);
    lb0 = ad2 < ad3;
    ad4 *= -1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
    Thought lo2 = Thought17.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    ab2 = ad1 < ad2;
    ab3 = ab4 || fb0;
    ad3 = ad4 - fd0;

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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    double ld1 = 448.52909349571706;
    if (fb0) {
        fd0 = fd1 + ld1;
        Output.points[5][4] -= fd0;
        fb1 = !lb0;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
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
    fb0 = ad2 > ad3;
    Thought lo0 = Thought263.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Thought lo1 = Thought168.getInstance();
    Thought lo2 = Thought129.getInstance(fb0, fb1, fb0, fb1);
    fb0 = ad4 > fd0;
    Thought lo3 = Thought30.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    fb1 = ad4 > fd0;
    fd1 = ad1 - ad2;
    Thought lo4 = Thought396.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    if (fb0) {
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        double ld5 = 817.8338954046607;
        double ld6 = 38.635580032289994;
        fb1 = ld5 < ld6;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
        fb1 = ad1 > ad2;
        ad3 *= -1;
if(ao3 != null){
          ad4 = ao3.m3(fd0, fd1, ld5, ld6);
}
        } else {
        Thought lo7 = Thought171.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
if(ao2 != null){
          fb0 = ao2.m2();
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
    fd1 *= -1;
    boolean lb0 = true;
    double ld1 = 696.6770434977689;
if(ao1 != null){
      ao1.m2(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb0;
    boolean lb2 = true;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, lb2, ab1, ab2, ab3);
}
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, lb2, lb3, ab1, ab2);
}
if(ao2 != null){
          ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        Output.points[5][5] -= fd0;
        fd1 *= -1;
        boolean lb4 = false;
        ld1 = fd0 + fd1;
        ab2 = ab3 && ab4;
        ld1 = fd0 + fd1;
        fb0 = fb1 && lb4;
        double ld5 = 640.3441768635392;
        }
    lb2 = lb3 && ab1;
    ld1 = fd0 + fd1;
    Thought lo6 = Thought177.getInstance(ld1, fd0, fd1, ld1);
    double ld7 = 55.028983617490894;

Thought.STACK_COUNTER++;
return ld7;
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
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought65.getInstance();
    fd1 *= -1;
    ab1 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought83.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ab4 = ad4 > fd0;
    fb0 = fb1 && ab1;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld2 = 122.31172526701106;
    Output.points[5][6] += fd0;
if(ao1 != null){
      ab4 = ao1.m2(fd1, ld2, ad1, ad2);
}
    Output.points[5][7] += ad3;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2);
}
if(ao2 != null){
              ao1 = ao2.m4();
}
            ad1 = ad2 + ad3;
            fb0 = ad4 < fd0;
            fd1 = ld2 - ad1;
if(ao3 != null){
              fb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
            fb0 = !fb1;
            ab1 = ad2 > ad3;
            ab2 = ab3 && ab4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
    double ld0 = 269.6119896629795;
    Thought lo1 = Thought95.getInstance(fd0, fd1, ld0, fd0);
    Thought lo2 = Thought299.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo0 != null){
      ld0 = fo0.m3();
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 + fd1;
    Thought lo3 = Thought199.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    if (fb1) {
        for(int i0=0; i0<10; i0++){
            Output.points[5][8] += fd0;
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
            ld0 = fd0 - fd1;
            boolean lb4 = false;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            ld0 = fd0 + fd1;
            ld0 = fd0 - fd1;
            lb4 = fb0 && fb1;
            ld0 = fd0 + fd1;
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = !lb1;
    Output.points[6][0] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Output.points[6][1] += fd1;
    boolean lb2 = true;
    lb2 = ab1 || ab2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;

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
    Output.points[6][2] += ad1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[6][3] += ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    ad1 *= -1;
    ad2 *= -1;
    Thought lo1 = Thought179.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    Output.points[6][4] += ad1;
    double ld2 = 88.62353897393012;

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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    Thought lo1 = Thought32.getInstance();
    ad3 = ad4 - fd0;

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
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 902.9706697650133;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, lb3, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = ld2 > fd0;
if(ao4 != null){
      lb0 = ao4.m2(fd1, ld2, fd0, fd1);
}
    Output.points[6][5] += ld2;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
}
if(ao4 != null){
      ao4.m2();
}
    lb1 = fd1 < ld2;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb0);
}
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0, lb3, fb0, fb1, lb0);
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
    fb1 = fb0 || fb1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = ad3 < ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[6][6] -= fd1;
    fb1 = ad1 < ad2;

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
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
        Output.points[6][7] += fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    double ld2 = 958.1683404152836;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
    lb0 = lb1 && ab1;
    ld2 = fd0 + fd1;
if(ao1 != null){
      ao1.m1();
}
    Output.points[6][8] += ld2;
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, fb1, lb0, lb1, ab1);
}
if(ao3 != null){
      ld2 = ao3.m3(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
    double ld3 = 175.88990061587114;
    fb1 = lb0 || lb1;
    fd0 = fd1 - ld2;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    Output.points[7][0] += ad4;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Thought lo1 = Thought342.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        fb0 = ad3 < ad4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
          ao1.m1();
}
        Output.points[7][1] += ad3;
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb0, ab1, ab2);
}
        ad4 = fd0 - fd1;
        double ld2 = 343.9081935215175;
        ab3 = ld2 < ad1;
        ad2 = ad3 + ad4;
        fd0 = fd1 + ld2;
        ab4 = ad1 > ad2;
        boolean lb3 = true;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
        lb3 = ld2 > ad1;
        ad2 = ad3 + ad4;
        double ld4 = 862.9457281227906;
        }
    fd1 *= -1;
    ad1 *= -1;
    for(int i1=0; i1<10; i1++){
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
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought338.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 59.93200311956982;
    fb0 = !fb1;
    fb0 = !fb1;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    double ld3 = 180.56762205988252;
    Output.points[7][2] -= ld1;
    Output.points[7][3] += ld3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld3, lb2, fb0, fb1, lb2);
}
    fd0 = fd1 - ld1;
    ld3 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    boolean lb4 = false;
        fb0 = !fb1;
    boolean lb5 = false;
    lb2 = lb4 || lb5;

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
    Thought lo0 = Thought294.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought141.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Output.points[7][4] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Output.points[7][5] -= fd1;
    Output.points[7][6] -= fd0;
    Thought lo2 = Thought59.getInstance(fb1, fb0, fb1, fb0);
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb3, fb0, fb1);
}
    Output.points[7][7] += fd0;

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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
    Output.points[7][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    double ld1 = 793.8784488829191;
    Output.points[8][0] -= ld1;
    boolean lb2 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
}
    Output.points[8][1] += fd1;

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
