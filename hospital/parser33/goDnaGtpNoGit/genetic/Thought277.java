package genetic;
import java.util.ArrayList;
class Thought277 extends Thought{
private static ArrayList<Thought277> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 138.4635378797956;
private double fd1 = 359.2333039056466;
private Thought fo0 = null;
private Thought fo1 = null;
Thought277 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought277 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought277 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought277 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought277 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought277 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought277 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought277 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought277 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought277 instance = new Thought277 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought277 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought277 instance = new Thought277 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought277 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought277 instance = new Thought277 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought277 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought277 instance = new Thought277 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought277 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought277 instance = new Thought277 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought277 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought277 instance = new Thought277 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought277 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought277 instance = new Thought277 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought277 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought277 instance = new Thought277 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[8][6] -= fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    double ld1 = 730.4796001854335;
    ld1 = fd0 - fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    double ld3 = 263.3944452721706;
    lb2 = fb0 || fb1;
    Thought lo4 = Thought157.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      lb0 = fo1.m2(ld1, ld3, fd0, fd1);
}
    ld1 *= -1;
    Thought lo5 = Thought113.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1);
    double ld6 = 988.3021681547278;
    lb2 = fb0 && fb1;

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
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2();
}
    ab1 = !ab2;
    Thought lo1 = Thought49.getInstance(ab3, ab4, fb0, fb1);
    fd0 = fd1 - fd0;
    Output.points[8][7] += fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld2 = 923.591355895974;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2);
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
    fb0 = !fb1;
    Thought lo0 = Thought208.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m1();
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought209.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    boolean lb3 = false;
    lb1 = lb3 || fb0;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    double ld5 = 754.5483468324759;

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
    Thought lo0 = Thought66.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Output.points[8][8] += ad1;
    fb1 = !ab1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Output.points[0][0] -= ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;

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
    boolean lb1 = false;
    Output.points[0][1] += fd1;
    lb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < fd0;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb0 = fd0 > fd1;
    double ld4 = 390.4545851189532;
    Output.points[0][2] += ld4;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought383.getInstance();
    fb0 = fd0 < fd1;
if(ao1 != null){
      fb1 = ao1.m2(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[0][3] -= fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld2 = 313.98945294055875;
    boolean lb3 = true;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld2, ad1, ad2);
}
    boolean lb4 = false;
    lb3 = lb4 && fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
        ab3 = ab4 || fb0;
    Thought lo0 = Thought177.getInstance();
    Thought lo1 = Thought285.getInstance(fb1, ab1, ab2, ab3);
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fd0 *= -1;
    fb0 = !fb1;
    ab1 = fd1 > fd0;
    ab2 = ab3 || ab4;
    Thought lo2 = Thought334.getInstance(fo1, ao1, ao2, ao3);
    boolean lb3 = true;
    ab4 = !fb0;
    Output.points[0][4] += fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = lb3 && ab1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    boolean lb4 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought307.getInstance(ao4, fo0, fo1, ao1);
    ad3 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    lb1 = fd1 < ad1;
    double ld3 = 372.26452871417786;
    lb2 = !ab1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ab2 = ld3 > ad1;
    boolean lb4 = false;
if(ao2 != null){
          ao2.m1();
}
if(ao3 != null){
      ad2 = ao3.m3(ab2, ab3, ab4, fb0);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought232.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Output.points[0][5] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought61.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Thought lo2 = Thought139.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
    boolean lb0 = true;
    Output.points[0][6] -= fd0;
    ab1 = ab2 || ab3;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (ab3) {
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        Output.points[0][7] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        Thought lo2 = Thought335.getInstance();
        ab4 = !fb0;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb3, lb0);
}
        lb1 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
        fb1 = fd1 < fd0;
        boolean lb4 = true;
        Output.points[0][8] += fd1;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought293.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    if (fb1) {
        fb0 = fb1 && fb0;
        fd1 = ad1 + ad2;
        ad3 *= -1;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
        fb1 = ad3 > ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        double ld1 = 764.6179315302016;
        ad2 *= -1;
if(fo0 != null){
          fb0 = fo0.m2();
}
        boolean lb2 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought225.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[1][0] -= ad1;
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ab1 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ad1;
        ab2 = ab3 || ab4;
        fb0 = !fb1;
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        fb1 = ad2 > ad3;
        ab1 = ad4 > fd0;
        Thought lo1 = Thought97.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
        Thought lo2 = Thought138.getInstance();
        Thought lo3 = Thought137.getInstance(ab2, ab3, ab4, fb0);
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
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    double ld0 = 348.37361361276476;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Output.points[1][1] -= fd0;
    Output.points[1][2] += fd1;
    double ld1 = 0.12449332999477214;
    fb0 = fb1 || fb0;
    double ld2 = 105.26946648449008;
    Thought lo3 = Thought362.getInstance(ao4, fo0, fo1, ao1);
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ld0, ld1, ld2, fd0);
}
    Thought lo4 = Thought13.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ld2);
if(ao1 != null){
      fd0 = ao1.m3();
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought4.getInstance(ao4, fo0, fo1, ao1);
    fb1 = fb0 && fb1;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought295.getInstance();
    boolean lb3 = true;
    double ld4 = 952.7341095387865;
    double ld5 = 203.55651058181903;
if(ao4 != null){
      ao3 = ao4.m4(lb3, fb0, fb1, lb1);
}
    ad1 *= -1;
    Thought lo6 = Thought33.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb1);
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld4, ld5, ad1, lb3, fb0, fb1, lb1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb0 = true;
        lb0 = fd0 > fd1;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao2.m2();
}
        fd0 = fd1 - fd0;
if(ao3 != null){
          fd1 = ao3.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
          ao3.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
        Thought lo1 = Thought88.getInstance(ao4, fo0, fo1, ao1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    ab1 = ad2 < ad3;
    Thought lo0 = Thought122.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
    if (fb1) {
        ad2 = ad3 + ad4;
        } else {
        Output.points[1][3] += fd0;
        Thought lo1 = Thought154.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(ao3 != null){
          ao3.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
        ad2 *= -1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        fb0 = fd0 < fd1;
        fb1 = !fb0;
        double ld0 = 363.06792918403227;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ld0;
        boolean lb1 = true;
        fd0 = fd1 - ld0;
        double ld2 = 239.14085225599976;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        ld2 = fd0 + fd1;
        fb1 = ld0 > ld2;
        Output.points[1][4] -= fd0;
        fd1 *= -1;
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
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[1][5] -= fd0;
    fd1 = fd0 + fd1;
        Thought lo0 = Thought348.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    double ld1 = 903.7659714089705;

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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb0 = false;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && lb0;
    ad2 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb1 = fo0.m2(lb2, fb0, fb1, lb0);
}
    Output.points[1][6] -= ad3;
    Output.points[1][7] += ad4;
    lb1 = fd0 > fd1;

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
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    fb0 = !fb1;
    double ld0 = 878.0111349001527;
    fd0 = fd1 + ld0;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd1 = ld0 - ad1;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = true;
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
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 537.0767982232337;
if(ao1 != null){
          lb0 = ao1.m2(lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
    fd0 = fd1 + ld2;
    boolean lb4 = false;
    Thought lo5 = Thought320.getInstance(fd0, fd1, ld2, fd0, lb1, lb3, lb4, fb0);
    Thought lo6 = Thought205.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, lb1, lb3);
    Thought lo7 = Thought81.getInstance(fo0, fo1, ao1, ao2);
    fd1 = ld2 + fd0;
    fd1 = ld2 + fd0;
    lb4 = fd1 > ld2;
    fb0 = fd0 > fd1;
    fb1 = ld2 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, fd0, fd1);
}
    Thought lo8 = Thought366.getInstance(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
if(ao3 != null){
      ao3.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought365.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought90.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      lb2 = fo0.m2(ad3, ad4, fd0, fd1);
}
    Output.points[1][8] += ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb3 = false;
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb3, lb4, fb0, fb1);
}
    lb2 = ad3 > ad4;
    fd0 = fd1 + ad1;
    lb3 = lb4 || fb0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb2, lb3, lb4);
}
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb4, fb0, fb1, lb2);
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb5 = true;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1();
}
    ad4 = fd0 + fd1;

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
    ab2 = fd1 < fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = ab1 || ab2;
    ab3 = fd1 > fd0;
    Thought lo1 = Thought292.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought67.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    double ld0 = 641.6247515164017;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        fd1 *= -1;
        lb1 = ld0 > fd0;
        Thought lo3 = Thought48.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
        fb0 = !fb1;
        double ld4 = 643.2173489929812;
        boolean lb5 = true;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2();
}
    boolean lb0 = true;
    double ld1 = 944.559395329336;
    ab3 = ab4 && fb0;
    double ld2 = 247.77472528753535;
    double ld3 = 669.8216163179463;
    fb1 = lb0 || ab1;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, ld3, fd0, fb1, lb0, ab1, ab2);
}
    double ld4 = 718.3880131213134;

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
    ad1 = ad2 + ad3;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought398.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}
    fb0 = !fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    Output.points[2][0] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
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
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    if (ab1) {
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
        fb1 = fd0 > fd1;
    Thought lo0 = Thought108.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        Output.points[2][1] -= fd0;
        Thought lo1 = Thought30.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            fb0 = !fb1;
            boolean lb2 = true;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
              fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
            Thought lo3 = Thought262.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
              fo1 = ao1.m4();
}
            }
        fb0 = fd1 > fd0;
        fb1 = fd1 > fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2(fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought52.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
        Thought lo1 = Thought362.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
        fb1 = !fb0;
        Thought lo2 = Thought169.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
        }
    double ld3 = 948.2123751395503;
    ad3 = ad4 - fd0;
    fb1 = fd1 < ld3;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb4 = false;
    ad1 = ad2 + ad3;
    fb0 = fb1 || lb4;
    fb0 = !fb1;
    lb4 = fb0 && fb1;
    lb4 = ad4 > fd0;
    double ld5 = 685.917243267578;
    Output.points[2][2] += fd0;
    fd1 = ld3 + ld5;

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
      ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Output.points[2][3] -= fd1;
if(ao3 != null){
      ao3.m3();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    double ld0 = 280.79342502890296;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[2][4] += fd0;
    Thought lo1 = Thought275.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
    Output.points[2][5] -= fd1;
    ab4 = fb0 || fb1;
    ab1 = ld0 < ad1;
    ab2 = ad2 > ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld2 = 641.4198466175666;
    ab3 = ad3 < ad4;
    ab4 = fd0 < fd1;
    Thought lo3 = Thought118.getInstance(ld0, ld2, ad1, ad2);
    double ld4 = 281.79064526311544;
    ad2 = ad3 + ad4;
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld2);
}
if(ao1 != null){
      ab2 = ao1.m2();
}
    ab3 = ld4 < ad1;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    double ld5 = 489.15312259350725;

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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = !lb0;
    Thought lo1 = Thought286.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    boolean lb2 = true;
    fd1 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;

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
    double ld0 = 27.08907785417801;
    Thought lo1 = Thought169.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    double ld3 = 98.38177823854029;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m1(ld0, ld3, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[2][6] += ld3;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld3);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[2][7] -= ld0;

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
    Output.points[2][8] += fd1;
    Thought lo0 = Thought178.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 *= -1;
    Thought lo3 = Thought10.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb2 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb1;
    lb2 = fd1 < fd0;
    boolean lb4 = false;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    lb4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = lb2 || lb4;
    lb5 = fd0 < fd1;

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
