package genetic;
import java.util.ArrayList;
class Thought193 extends Thought{
private static ArrayList<Thought193> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 80.51978886989662;
private double fd1 = 482.63231340399494;
private Thought fo0 = null;
private Thought fo1 = null;
Thought193 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought193 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought193 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought193 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought193 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought193 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought193 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought193 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought193 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought193 instance = new Thought193 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought193 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought193 instance = new Thought193 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought193 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought193 instance = new Thought193 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought193 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought193 instance = new Thought193 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought193 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought193 instance = new Thought193 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought193 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought193 instance = new Thought193 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought193 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought193 instance = new Thought193 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought193 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought193 instance = new Thought193 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 756.8874260636418;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    lb1 = !fb0;
    fd0 *= -1;
    fb1 = !lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1();
}
    Thought lo2 = Thought178.getInstance(fb0, fb1, lb1, fb0);
    boolean lb3 = true;
    fb0 = !fb1;
    fd0 *= -1;
    lb1 = lb3 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, lb1, lb3, fb0);
}
    boolean lb4 = true;
    Output.points[5][7] -= fd0;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb3);
}
    boolean lb5 = true;
    lb4 = !lb5;
    Thought lo6 = Thought203.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
    double ld7 = 517.9672865429769;
    lb4 = ld0 < ld7;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb5 = fo0.m2(fd0, fd1, ld0, ld7);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab1 = ab2 || ab3;
    Output.points[5][8] -= fd0;
    ab4 = fb0 || fb1;
    Output.points[6][0] -= fd1;
    Thought lo0 = Thought246.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[6][1] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought317.getInstance(fo1, fo0, fo1, fo0);
    Output.points[6][2] -= fd0;

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
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, lb1);
}
    lb2 = !fb0;

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
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    double ld0 = 182.83806777560702;
    ab3 = ad3 > ad4;
    ab4 = fd0 < fd1;
    fb0 = !fb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ld0 = ad1 + ad2;
    double ld1 = 843.832132311059;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][3] -= fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}
    Thought lo3 = Thought110.getInstance();
if(fo1 != null){
      fb1 = fo1.m2(lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
    ld0 = ld1 + ad1;
    ad2 *= -1;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[6][4] += fd0;
    fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    double ld2 = 712.2607019089385;
    fd0 = fd1 + ld2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    Thought lo3 = Thought340.getInstance(ao4, fo0, fo1, ao1);
    if (fb1) {
        lb0 = fd0 < fd1;
        lb1 = ld2 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld2, fd0, fd1);
}
        ld2 = fd0 - fd1;
        Thought lo4 = Thought196.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
        } else if (fb0) {
        fb1 = fd0 > fd1;
        boolean lb5 = false;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m1(lb5, lb0, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, fb1, lb5, lb0, lb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought383.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    ad3 = ad4 - fd0;
    double ld1 = 158.031377799206;
    Output.points[6][5] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ld1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
        ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = ab1 && ab2;
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought278.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    boolean lb1 = true;

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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    ab2 = !ab3;
    fd1 = ad1 + ad2;
    ab4 = fb0 && fb1;
    Output.points[6][6] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ad1 = ao1.m3();
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought273.getInstance(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    Thought lo3 = Thought18.getInstance(ao3, ao4, fo0, fo1);
    ad2 = ad3 - ad4;
    Output.points[6][7] += fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought303.getInstance(lb1, fb0, fb1, lb0);
    double ld3 = 726.1424018358961;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + ld3;

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
      fo0.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd1 *= -1;
    if (ab2) {
        ab3 = fd0 > fd1;
        fd0 = fd1 - fd0;
        boolean lb0 = true;
        boolean lb1 = true;
        ab2 = fd1 < fd0;
        ab3 = !ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        Thought lo2 = Thought245.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        boolean lb3 = false;
        fd0 = fd1 - fd0;
        Thought lo4 = Thought302.getInstance();
        boolean lb5 = true;
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        lb3 = !lb5;
if(fo1 != null){
          fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, lb3, lb5, ab1, ab2);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        boolean lb6 = true;
        Thought lo7 = Thought160.getInstance(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    double ld0 = 259.367271932527;
    boolean lb1 = false;
    boolean lb2 = false;
    ld0 = ad1 - ad2;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    ld0 = ad1 - ad2;
    boolean lb3 = true;
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, lb1, lb2);
}
    ad4 = fd0 - fd1;
    ld0 *= -1;
    ad1 = ad2 - ad3;
    double ld4 = 368.8249664638153;
    ad3 = ad4 + fd0;
    boolean lb5 = true;
    double ld6 = 689.5468541581469;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ad3 *= -1;
    ab3 = ab4 || fb0;
    Thought lo0 = Thought375.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
    Thought lo1 = Thought170.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[6][8] += fd1;
    Output.points[7][0] += ad1;
    ab1 = !ab2;
    ab3 = ad2 < ad3;
    ab4 = ad4 < fd0;
    Thought lo2 = Thought189.getInstance();
    fb0 = fd1 > ad1;

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
    Thought lo0 = Thought26.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    double ld2 = 363.2199234844625;
    fd0 = fd1 + ld2;
    fd0 = fd1 - ld2;
    fd0 = fd1 + ld2;
    fb1 = lb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought91.getInstance(fd0, fd1, ld2, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
    ld2 = fd0 - fd1;
if(ao1 != null){
      ld2 = ao1.m3();
}
    Output.points[7][1] += fd0;
    if (lb1) {
        Thought lo4 = Thought192.getInstance(fb0, fb1, lb1, fb0);
        double ld5 = 910.4306150439471;
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
    ad1 *= -1;
    fb0 = fb1 && fb0;
    double ld0 = 332.0359013325941;
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Output.points[7][2] += ld0;
    fb0 = fb1 || fb0;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    double ld1 = 313.23170589378043;
    fb1 = ad1 > ad2;
    fb0 = !fb1;
    Output.points[7][3] += ad3;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ld1 = ao2.m3(ad1, ad2, ad3, ad4);
}
    double ld3 = 493.54718708095305;

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[7][4] += fd0;
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought116.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld3 = 429.4686372961417;
    boolean lb4 = true;
    ld3 *= -1;
    lb2 = fd0 > fd1;
    ld3 *= -1;
    double ld5 = 180.99556606397567;
    boolean lb6 = false;
        boolean lb7 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb0 = false;
    Thought lo1 = Thought332.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 159.33077667801987;
    ld2 *= -1;
    Thought lo3 = Thought388.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
    ab3 = fd0 > fd1;
    ld2 *= -1;
    double ld4 = 621.0550615688121;
    ld4 *= -1;
    ab4 = ad1 < ad2;
    double ld5 = 699.2964725387145;

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
        for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        boolean lb1 = true;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
        Thought lo2 = Thought118.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        lb0 = fd1 < fd0;
        boolean lb3 = false;
        double ld4 = 383.0436817877066;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
}
        boolean lb5 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb1 = lb3 && lb5;
        fb0 = fd1 > ld4;
        Thought lo6 = Thought258.getInstance(fb1, lb0, lb1, lb3);
        lb5 = fd0 < fd1;
        ld4 = fd0 - fd1;
if(fo0 != null){
          ld4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, fb0, fb1, lb0, lb1);
}
        lb3 = lb5 || fb0;
if(fo1 != null){
          fo1.m3(fd1, ld4, fd0, fd1, fb1, lb0, lb1, lb3);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        lb1 = lb3 || lb5;
        Thought lo7 = Thought0.getInstance(ld4, fd0, fd1, ld4);
        fd0 = fd1 + ld4;
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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought222.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    Output.points[7][5] += fd1;
    ab4 = fd0 > fd1;
    fb0 = fd0 < fd1;
    Thought lo2 = Thought371.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    double ld3 = 349.9266644570437;
    ab3 = ld3 > fd0;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought286.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought362.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld2 = 52.23311288719411;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ld2;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    if (fb0) {
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ad2 = ad3 + ad4;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld2, ad1, ad2);
}
        fb1 = lb3 && fb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        ld2 = ad1 - ad2;
        Thought lo4 = Thought2.getInstance();
        boolean lb5 = true;
        fb0 = fb1 || lb5;
        Thought lo6 = Thought7.getInstance(lb3, fb0, fb1, lb5);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb5);
}
        boolean lb7 = false;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    Output.points[7][6] -= fd0;
    fd1 = ad1 - ad2;
    double ld0 = 33.3306366527458;
if(fo0 != null){
      fo0.m1();
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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
        boolean lb0 = false;
    fb0 = fb1 || lb0;
    Output.points[7][7] += fd0;
    double ld1 = 429.5736861970501;
    fd0 = fd1 - ld1;
    fb0 = fd0 > fd1;
    boolean lb2 = false;
    fb0 = ld1 > fd0;
    double ld3 = 191.8340124381248;
    Thought lo4 = Thought135.getInstance(fd0, fd1, ld1, ld3, fb1, lb0, lb2, fb0);
    fd0 = fd1 + ld1;
    for(int i0=0; i0<10; i0++){
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[7][8] += ad4;
    fd0 = fd1 + ad1;
        boolean lb0 = false;
    Thought lo1 = Thought291.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    double ld2 = 793.5135888728086;
    ad1 = ad2 + ad3;
    fb1 = lb0 && fb0;
    Output.points[8][0] += ad4;
    fb1 = !lb0;
    Thought lo3 = Thought245.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ad1);
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld2 = fo1.m3(fb1, lb0, fb0, fb1);
}
    Output.points[8][1] += ad1;
    boolean lb4 = false;
    ad2 *= -1;
    boolean lb5 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
    double ld0 = 352.8338330410244;
    ld0 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought28.getInstance(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
    fd1 = ld0 + fd0;
    ab1 = !ab2;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ld0 > fd0;
    boolean lb2 = false;
    ab1 = fd1 < ld0;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought216.getInstance(ld0, fd0, fd1, ld0);
    Thought lo4 = Thought254.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
    lb2 = !ab1;
    ab2 = fd1 < ld0;
    ab3 = ab4 && fb0;

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
    ab1 = ad1 < ad2;
    ad3 *= -1;
    ab2 = ad4 > fd0;
    fd1 = ad1 - ad2;
if(ao1 != null){
      ao1.m3();
}
    ab3 = ad3 > ad4;
    fd0 *= -1;
    Output.points[8][2] -= fd1;
    boolean lb0 = true;
    double ld1 = 690.5814847509107;
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, lb0);
}
    ld1 *= -1;
    ad1 = ad2 + ad3;
    ab1 = ad4 > fd0;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ad3 *= -1;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought152.getInstance(ao3, ao4, fo0, fo1);
    ad1 *= -1;

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
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought45.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought238.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought159.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
        fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb3, fb0);
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
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    Thought lo0 = Thought14.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought329.getInstance(fo1, fo0, fo1, fo0);
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    ab1 = fd1 < fd0;
    Thought lo3 = Thought70.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab2 = !ab3;
    fd1 = fd0 + fd1;
    ab4 = !fb0;
    Output.points[8][3] += fd0;
    Thought lo4 = Thought146.getInstance();
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb5 = true;

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
    fb0 = fb1 || fb0;
    ad2 *= -1;
    Thought lo0 = Thought75.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    double ld1 = 138.78519648690886;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld2 = 857.7155782867484;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = ld1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought128.getInstance(ld1, ld2, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ld1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(lb3, fb0, fb1, lb3);
}
    fb0 = fb1 || lb3;
    fb0 = fb1 || lb3;
    fb0 = ld2 < ad1;
    ad2 = ad3 - ad4;
    fb1 = lb3 && fb0;
    fb1 = !lb3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb1, lb3, fb0, fb1);
}
    Thought lo5 = Thought250.getInstance(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb3);
    Output.points[8][4] += fd0;

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
    Thought lo0 = Thought53.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Output.points[8][5] -= ad2;
    double ld1 = 870.7605319237085;
    ad2 *= -1;
    ab3 = ab4 && fb0;
    double ld2 = 453.4481475416485;
    Output.points[8][6] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
    double ld3 = 871.9921154548196;
    fb1 = ld2 > ld3;
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, ld2, ab4, fb0, fb1, ab1);
}
        ld3 = ad1 - ad2;
        Thought lo4 = Thought49.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
        ab1 = ld1 < ld2;
        ab2 = ab3 && ab4;
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
    double ld0 = 498.40218525598726;
    Thought lo1 = Thought159.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = ld0 < fd0;
    fb1 = fd1 > ld0;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb2);
}
    fd1 = ld0 + fd0;

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
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
}
    lb0 = ad2 > ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
    ad4 *= -1;
    fd0 *= -1;
    fd1 *= -1;

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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    fd0 = fd1 - fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
    Thought lo0 = Thought390.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
    lb1 = !ab1;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
    boolean lb2 = true;

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
    ab2 = !ab3;
    boolean lb0 = false;
    boolean lb1 = true;
    ab2 = ad1 < ad2;
    boolean lb2 = true;
    ad3 *= -1;
    ab2 = ad4 > fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab4 = fb0 || fb1;
    boolean lb3 = false;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    if (lb0) {
        ad4 = fd0 - fd1;
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
    fb0 = fb1 || lb0;
    Output.points[8][7] += fd0;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
        fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !fb0;
if(fo0 != null){
      fo0.m2(fb1, lb0, lb1, fb0);
}
    fb1 = lb0 && lb1;
    Thought lo2 = Thought281.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    double ld3 = 781.9292274843777;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 389.49468043078804;
    boolean lb1 = false;
    fd0 *= -1;
    Thought lo2 = Thought206.getInstance(lb1, fb0, fb1, lb1);
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    double ld3 = 198.02787080755925;
    fb0 = fd0 < fd1;
    Thought lo4 = Thought139.getInstance(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1, fb1, lb1, fb0, fb1);

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
    Thought lo0 = Thought15.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    double ld1 = 356.53156958766016;
    fb1 = fb0 && fb1;
    Output.points[8][8] -= ld1;
    fd0 = fd1 + ld1;
    Output.points[0][0] -= fd0;
    fb0 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    ld1 = fd0 + fd1;
    Output.points[0][1] -= ld1;

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
