package genetic;
import java.util.ArrayList;
class Thought370 extends Thought{
private static ArrayList<Thought370> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 57.002303046702224;
private double fd1 = 773.4475382897205;
private Thought fo0 = null;
private Thought fo1 = null;
Thought370 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought370 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought370 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought370 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought370 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought370 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought370 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought370 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought370 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought370 instance = new Thought370 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought370 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought370 instance = new Thought370 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought370 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought370 instance = new Thought370 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought370 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought370 instance = new Thought370 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought370 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought370 instance = new Thought370 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought370 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought370 instance = new Thought370 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought370 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought370 instance = new Thought370 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought370 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought370 instance = new Thought370 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld1 = 844.5516931192933;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(lb0, lb2, lb3, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    boolean lb5 = true;
if(fo1 != null){
      lb3 = fo1.m2(ld1, fd0, fd1, ld1, lb4, lb5, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, lb3, lb4);
}
    Thought lo6 = Thought392.getInstance(fo0, fo1, fo0, fo1);
    lb5 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    Thought lo7 = Thought43.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
    lb0 = fd0 > fd1;
    Thought lo8 = Thought82.getInstance();
    lb2 = lb3 || lb4;
    ld1 = fd0 - fd1;
    Thought lo9 = Thought85.getInstance(lb5, fb0, fb1, lb0);
    lb2 = !lb3;
    lb4 = lb5 && fb0;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, lb2, lb3);
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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
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
    fb0 = ad2 > ad3;
    fb1 = ad4 < fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad3 = ad4 - fd0;
    lb0 = fd1 < ad1;

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
    ab2 = ab3 || ab4;
    boolean lb0 = true;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    double ld1 = 584.0429088529634;
    ab4 = fb0 || fb1;
    Output.points[8][7] -= ad3;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = !lb2;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb2, ab1, ab2);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought111.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld3 = 683.740608120856;
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    double ld4 = 866.6360654948612;
    Output.points[8][8] -= ld3;
    ld4 *= -1;
    Output.points[0][0] += fd0;
    Output.points[0][1] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld4, fd0, fd1);
}
    lb2 = ld3 > ld4;
    fd0 = fd1 + ld3;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][2] += ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[0][3] += ad2;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    if (lb1) {
if(fo1 != null){
          fo1.m1();
}
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
          ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
        fb0 = fb1 || lb0;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
        Output.points[0][4] += fd1;
        ad1 = ad2 + ad3;
        lb1 = !fb0;
        fb1 = lb0 && lb1;
        fb0 = fb1 || lb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        lb1 = !fb0;
        fb1 = ad4 > fd0;
        lb0 = !lb1;
if(ao3 != null){
          fb0 = ao3.m2(fd1, ad1, ad2, ad3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought111.getInstance();
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    Output.points[0][5] -= fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = !fb0;
if(ao3 != null){
          ao3.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 < fd0;
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
    Thought lo0 = Thought336.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1();
}
    boolean lb1 = true;
    double ld2 = 940.3543706233223;
    Thought lo3 = Thought14.getInstance(ab2, ab3, ab4, fb0);
    fb1 = lb1 && ab1;
    ab2 = fd0 < fd1;
    ab3 = ld2 < ad1;
    Output.points[0][6] -= ad2;
    ad3 *= -1;
    double ld4 = 630.6796677682155;
    Output.points[0][7] -= ad3;
    ad4 = fd0 - fd1;
    ld2 = ld4 - ad1;
    if (ab4) {
        Thought lo5 = Thought67.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
        ab2 = !ab3;
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld2, ld4, ad1, ab4, fb0, fb1, lb1);
}
        Output.points[0][8] += ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
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
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    double ld1 = 211.09594910939836;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought55.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    Thought lo1 = Thought335.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
    fd1 *= -1;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought33.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      lb0 = fo1.m2();
}
    ab1 = fd0 < fd1;
    Thought lo3 = Thought133.getInstance(ab2, ab3, ab4, fb0);
    double ld4 = 27.252173042062996;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb5, ab1, ab2);
}
    fd1 = ld4 + fd0;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 < ad2;
    boolean lb0 = true;
    Thought lo1 = Thought30.getInstance(ad3, ad4, fd0, fd1);
    ad1 *= -1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought232.getInstance();
    Thought lo3 = Thought268.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
    fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
    boolean lb0 = true;
    Thought lo1 = Thought389.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
    if (fb0) {
        Thought lo2 = Thought9.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
          ad2 = fo1.m3();
}
        fb1 = lb0 || ab1;
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
        boolean lb3 = false;
        ad3 = ad4 + fd0;
        lb3 = lb0 || ab1;
        Thought lo4 = Thought85.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
        fb1 = !lb3;
        lb0 = !ab1;
        Output.points[1][0] -= ad4;
        fd0 = fd1 - ad1;
        Thought lo5 = Thought399.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
        Output.points[1][1] += fd1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb3, lb0, ab1);
}
        double ld6 = 266.94988423235134;
        ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m3();
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 548.8839933945549;
    double ld1 = 46.28023034400034;
    fb0 = ld0 < ld1;
    fb1 = !fb0;
    Thought lo2 = Thought130.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought181.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
    boolean lb4 = true;
    Output.points[1][2] += fd1;
    boolean lb5 = false;
    ld0 = ld1 + fd0;
    lb4 = !lb5;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo6 = Thought360.getInstance(fd1, ld0, ld1, fd0);
    fd1 = ld0 + ld1;
    fb0 = fd0 > fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
}
    ld0 = ld1 + fd0;
    fd1 *= -1;
    ld0 = ld1 - fd0;
    lb4 = lb5 && fb0;
    fd1 = ld0 - ld1;
if(ao1 != null){
      fb1 = ao1.m2();
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = fd1 < ad1;
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(ao1 != null){
      fo1 = ao1.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought162.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought55.getInstance(ao2, ao3, ao4, fo0, lb1, ab1, ab2, ab3);
        fd1 *= -1;
        boolean lb4 = false;
        ab3 = fd0 < fd1;
        double ld5 = 812.5445696683244;
        boolean lb6 = true;
if(fo1 != null){
          ld5 = fo1.m3(ao1, ao2, ao3, ao4);
}
        double ld7 = 532.3230558303094;
if(fo0 != null){
          fo0.m1(ld7, fd0, fd1, ld5);
}
        ab3 = ab4 && fb0;
        ld7 = fd0 + fd1;
        double ld8 = 212.2062998636525;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ld5, ld7, ld8, fd0);
}
        fd1 = ld5 - ld7;
        ld8 *= -1;
        boolean lb9 = true;
if(fo0 != null){
          fo0.m2();
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought299.getInstance(fb0, fb1, ab1, ab2);
    if (ab3) {
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
        Output.points[1][4] += ad1;
        boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
}
        boolean lb2 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
        ab1 = ab2 || ab3;
        Thought lo3 = Thought293.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
        boolean lb4 = true;
        ab3 = ab4 && fb0;
        fb1 = ad2 > ad3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    Thought lo1 = Thought36.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    Output.points[1][5] += fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb2 = fd0 > fd1;
    double ld3 = 859.6222780019948;
    ld3 = fd0 + fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][6] -= fd1;
    ab1 = fd0 < fd1;
    Thought lo0 = Thought92.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    double ld3 = 105.45518237623281;
    Thought lo4 = Thought21.getInstance(ld3, fd0, fd1, ld3);
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
    boolean lb5 = true;
    ab4 = fd1 < ld3;
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 + ld3;

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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 832.4038654774739;
    fb1 = fb0 || fb1;
    fb0 = ld0 > ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = ad4 < fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
    double ld2 = 918.7326158398986;
    boolean lb3 = true;
if(fo0 != null){
      lb0 = fo0.m2(lb1, lb3, ab1, ab2);
}
    ad4 = fd0 + fd1;
    Thought lo4 = Thought138.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    Thought lo5 = Thought95.getInstance(ad4, fd0, fd1, ld2, lb0, lb1, lb3, ab1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    lb1 = !lb3;
    ab1 = !ab2;
    ab3 = !ab4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
        fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m2();
}
    boolean lb0 = true;
    Output.points[1][7] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;

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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    double ld0 = 719.5948043090746;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m3();
}
    fb1 = fb0 || fb1;
    fb0 = ad2 < ad3;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo1 = Thought12.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo2 = Thought303.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    double ld3 = 781.7156158157487;
    boolean lb4 = false;
    Output.points[1][8] += ad4;
    for(int i0=0; i0<10; i0++){
        lb4 = fb0 || fb1;
        lb4 = fd0 < fd1;
        Output.points[2][0] += ld0;
        boolean lb5 = true;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
        lb4 = fb0 || fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought162.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ab1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    Thought lo2 = Thought32.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    boolean lb3 = false;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        boolean lb0 = false;
        boolean lb1 = false;
        double ld2 = 964.0859312326318;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
        } else if (fb1) {
        ab1 = ad1 < ad2;
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        ab3 = !ab4;
        fd1 = ad1 - ad2;
if(ao1 != null){
          ad3 = ao1.m3();
}
if(ao2 != null){
          ad4 = ao2.m3(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao2.m1(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        double ld3 = 725.2837271656416;
        fb0 = ad1 < ad2;
        boolean lb4 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb4, ab1);
}
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
        boolean lb5 = true;
        Thought lo6 = Thought149.getInstance(ad3, ad4, fd0, fd1);
        ld3 *= -1;
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
    Output.points[2][1] -= fd0;
    fd1 *= -1;
    boolean lb0 = true;
    Output.points[2][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb2 = true;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    if (lb2) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        boolean lb3 = true;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
        fd1 = fd0 - fd1;
        double ld4 = 137.2383453414367;
        lb3 = ld4 < fd0;
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
    ab2 = !ab3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought195.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
    Thought lo2 = Thought116.getInstance(fd1, fd0, fd1, fd0);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1();
}
    double ld0 = 459.36714090398584;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    Thought lo1 = Thought307.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    boolean lb3 = true;
    Output.points[2][3] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb2);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    Output.points[2][4] += fd1;
    Thought lo0 = Thought357.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 - ad3;
    ab3 = !ab4;

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
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    Output.points[2][5] += fd1;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    double ld1 = 126.20570672830422;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            lb0 = fb0 || fb1;
            for(int i2=0; i2<10; i2++){
                ld1 = fd0 + fd1;
                Output.points[2][6] += ld1;
if(ao3 != null){
                  lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
                Thought lo2 = Thought199.getInstance(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
                lb0 = ld1 > fd0;
                boolean lb3 = false;
                double ld4 = 965.9477678234688;
                fd0 = fd1 + ld4;
if(ao3 != null){
                  ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb3);
}
                boolean lb5 = true;
                lb5 = ld1 > fd0;
                Output.points[2][7] += fd1;
                ld4 = ld1 + fd0;
}}}
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
    ad1 = ad2 - ad3;
    double ld0 = 570.0581574609997;
    ad3 = ad4 - fd0;
    fd1 = ld0 - ad1;
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fb0 = !fb1;
    fd1 *= -1;
    boolean lb1 = true;
    ld0 *= -1;
    ad1 = ad2 - ad3;
    boolean lb2 = true;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ad1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][8] -= fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought77.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, lb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought337.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    lb1 = fd1 < fd0;
    fd1 *= -1;

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
    ad1 = ad2 + ad3;
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    ab4 = ad4 < fd0;
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    fb1 = lb0 && ab1;
    Thought lo1 = Thought177.getInstance();
if(ao3 != null){
      ao3.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
    lb0 = ab1 && ab2;

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
    fb1 = fb0 || fb1;
    double ld0 = 591.0949375785167;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = fd0 < fd1;
    fb1 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought301.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
    fd1 *= -1;
        boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, lb3, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, lb3, fb0, fb1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, lb1, lb3, lb4, fb0);
}
    fb1 = lb1 || lb3;

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
    fb0 = !fb1;
    Output.points[3][0] -= fd0;
    Output.points[3][1] += fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld1 = 360.1321084369389;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m1();
}
        boolean lb2 = true;
    Output.points[3][2] += ld1;
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2(fb0, fb1, lb0, lb2);
}
    lb3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, lb3, fb0, fb1, lb0);
}
    Output.points[3][3] += ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    double ld0 = 882.0289322459337;
    fb1 = fb0 || fb1;
        fb0 = !fb1;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;

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