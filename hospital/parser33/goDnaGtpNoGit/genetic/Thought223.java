package genetic;
import java.util.ArrayList;
class Thought223 extends Thought{
private static ArrayList<Thought223> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 698.0593083430223;
private double fd1 = 459.14917311188873;
private Thought fo0 = null;
private Thought fo1 = null;
Thought223 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought223 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought223 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought223 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought223 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought223 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought223 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought223 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought223 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought223 instance = new Thought223 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought223 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought223 instance = new Thought223 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought223 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought223 instance = new Thought223 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought223 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought223 instance = new Thought223 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought223 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought223 instance = new Thought223 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought223 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought223 instance = new Thought223 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought223 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought223 instance = new Thought223 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought223 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought223 instance = new Thought223 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    fd0 *= -1;
    Thought lo1 = Thought365.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld2 = 964.6734543142826;

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
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    Thought lo1 = Thought199.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb2 = true;
    boolean lb3 = false;
    lb2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb3 = fd1 < fd0;
    Output.points[0][8] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        ab3 = fd1 < fd0;
        ab4 = fd1 > fd0;
        fb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, lb2, lb3, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || lb2;
        fd1 *= -1;
        boolean lb4 = false;
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought315.getInstance(lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, lb1, lb3, fb0);
}
    Output.points[1][0] -= fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, lb3, fb0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      lb1 = fo0.m2(lb3, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, lb1, lb3, lb4);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
}
    Output.points[1][1] += ad2;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;
    lb1 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    lb4 = lb5 || fb0;

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
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = !ab2;
        ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !ab1;
    double ld0 = 468.9899301310991;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb1 = false;
    ad2 *= -1;
    ad3 *= -1;
    Thought lo2 = Thought243.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = fd0 > fd1;
    double ld3 = 940.3157899666046;
    ld0 = ld3 - ad1;
    boolean lb4 = false;
    double ld5 = 741.0331148505406;

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
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    Thought lo1 = Thought325.getInstance(fd0, fd1, fd0, fd1);
    Thought lo2 = Thought45.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    Thought lo3 = Thought391.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
    double ld4 = 483.2421072141908;
    ld4 = fd0 - fd1;
    double ld5 = 413.4236867240962;
    ld4 = ld5 - fd0;
    if (fb1) {
        if (lb0) {
            fd1 = ld4 - ld5;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = !fb1;
        ad2 = ad3 - ad4;
        Thought lo0 = Thought73.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
        boolean lb1 = false;
        lb1 = fb0 || fb1;
        lb1 = fb0 || fb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
        ad3 = ad4 + fd0;
        Output.points[1][2] -= fd1;
        boolean lb2 = false;
        boolean lb3 = true;
        lb2 = ad1 > ad2;
        lb3 = fb0 || fb1;
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2);
}
        ad4 *= -1;
if(ao3 != null){
          ao3.m3(fd0, fd1, ad1, ad2);
}
        lb1 = lb2 || lb3;
        double ld4 = 708.176511946231;
        Thought lo5 = Thought392.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
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
      fd0 = ao2.m3();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m1(ab2, ab3, ab4, fb0);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        boolean lb0 = false;
        fd0 = fd1 - fd0;
if(ao4 != null){
          ab3 = ao4.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 && ab3;
        for(int i1=0; i1<10; i1++){
            fd1 = fd0 - fd1;
            fd0 *= -1;
if(fo0 != null){
              fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
            ab1 = fd0 < fd1;
if(ao4 != null){
              fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
            fd1 = fd0 + fd1;
            ab2 = ab3 && ab4;
            boolean lb1 = false;
            boolean lb2 = false;
if(ao3 != null){
              fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
              ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
              fd1 = ao3.m3();
}
if(fo0 != null){
              ao4 = fo0.m4(ab4, fb0, fb1, lb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    double ld0 = 424.6930922232715;
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = ld0 > fd0;
    fb0 = fd1 > ld0;
    double ld3 = 796.3362314159713;
    Output.points[1][3] -= ld3;
    fd0 = fd1 - ld0;
    Output.points[1][4] += ld3;
    fd0 = fd1 + ld0;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld0;
    boolean lb4 = false;
    fb0 = fb1 && lb1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought352.getInstance(ab1, ab2, ab3, ab4);
    Output.points[1][5] -= fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
        fb1 = ab1 || ab2;
    boolean lb1 = false;
    Thought lo2 = Thought354.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    double ld3 = 845.4938370732832;
    ld3 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    ld3 = fd0 + fd1;
    fb1 = lb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb1;
    double ld4 = 63.33673838131236;
    boolean lb5 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought397.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought230.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    double ld3 = 441.41902082021767;
    fb0 = fb1 && lb1;
        ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb4 = false;
    lb4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ld3, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

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
    Thought lo0 = Thought44.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    boolean lb1 = true;
    lb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ad1;
    double ld2 = 982.859190857401;
    Thought lo3 = Thought67.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    boolean lb4 = false;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb1 = lb4 || ab1;
    boolean lb5 = true;
    ab1 = ad4 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[1][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[1][7] -= fd0;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
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
    Thought lo0 = Thought153.getInstance(ao2, ao3, ao4, fo0);
    Output.points[1][8] -= ad2;
    ad3 *= -1;
    ad4 *= -1;
    fb0 = fb1 || fb0;
        fb1 = fd0 > fd1;
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    lb1 = fd1 < ad1;
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = true;
    lb2 = lb3 && lb4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb5 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    Thought lo0 = Thought210.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    boolean lb1 = true;
    Output.points[2][0] += fd0;
if(ao2 != null){
      ab3 = ao2.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
    fd0 *= -1;
    Output.points[2][1] += fd1;
    fd0 *= -1;
        Thought lo2 = Thought242.getInstance(ao2, ao3, ao4, fo0);
    Thought lo3 = Thought280.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || lb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb4 = true;
    boolean lb5 = true;

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
    ab1 = ab2 && ab3;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought27.getInstance();
    fd0 *= -1;
    if (ab4) {
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ad4 = ao4.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
          ad1 = ao4.m3();
}
        Thought lo1 = Thought285.getInstance(ab3, ab4, fb0, fb1);
        } else {
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        boolean lb2 = true;
        Thought lo3 = Thought215.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
        Thought lo4 = Thought130.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb2);
        Output.points[2][2] -= ad4;
        boolean lb5 = false;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb5, ab1, ab2, ab3);
}
                double ld6 = 794.1023621908257;
        ab4 = fd0 < fd1;
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
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[2][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
        fb1 = fd0 > fd1;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || lb1;
    for(int i0=0; i0<10; i0++){
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
    Output.points[2][4] += fd1;
    Thought lo1 = Thought33.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld2 = 26.5740046343994;
if(fo0 != null){
      ld2 = fo0.m3();
}
    lb0 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
        double ld3 = 243.01204696647332;
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
    Output.points[2][5] -= ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[2][6] += ad1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = ad1 < ad2;
    fb1 = lb0 && fb0;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    Thought lo1 = Thought296.getInstance(fo0, fo1, fo0, fo1);

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
    ab1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    double ld0 = 619.5757181108044;
    double ld1 = 915.1193330568027;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    double ld0 = 60.253432488708754;
    Thought lo1 = Thought213.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    ld0 *= -1;
    lb2 = fd0 > fd1;
    double ld3 = 854.5127489349304;
    double ld4 = 487.749376296981;
    fb0 = fb1 && lb2;
    double ld5 = 667.9898142677313;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
    double ld6 = 125.59241571904214;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo7 = Thought173.getInstance(ld0, ld3, ld4, ld5);
if(ao1 != null){
      ld6 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld3);
}
    double ld8 = 862.9508945518127;
    fb1 = lb2 && fb0;
    boolean lb9 = true;

Thought.STACK_COUNTER++;
return ld4;
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
      fb0 = ao2.m2();
}
    Output.points[2][7] -= ad2;
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought95.getInstance(lb0, lb1, fb0, fb1);
    lb0 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    Thought lo3 = Thought133.getInstance(ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
    boolean lb4 = false;
    boolean lb5 = true;
    ad2 = ad3 - ad4;
    Output.points[2][8] += fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo6 = Thought35.getInstance(ao2, ao3, ao4, fo0, lb0, lb1, lb4, lb5);
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4);
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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    Output.points[3][0] += fd0;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[3][1] -= fd0;
    lb1 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        fd1 = fd0 + fd1;
        if (lb1) {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][2] -= ad2;
    ad3 = ad4 - fd0;
    ab2 = fd1 < ad1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 > ad1;
    Thought lo0 = Thought80.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab3 = ad1 < ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    double ld2 = 901.9002949535198;
    ab4 = ld2 > ad1;
    Thought lo3 = Thought337.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][3] += fd0;
    Thought lo0 = Thought222.getInstance();
    double ld1 = 51.959091313658966;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    Output.points[3][4] -= fd0;
    Thought lo2 = Thought21.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    fb0 = fb1 || lb3;
    Thought lo4 = Thought313.getInstance(fd0, fd1, ld1, fd0);
    fb0 = fb1 || lb3;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    Thought lo6 = Thought396.getInstance();
    Thought lo7 = Thought178.getInstance(lb5, fb0, fb1, lb3);
    lb5 = ld1 < fd0;
    if (fb0) {
        Thought lo8 = Thought137.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb3, lb5, fb0);
        fb1 = ld1 > fd0;
        lb3 = !lb5;
        boolean lb9 = true;
        lb5 = fd1 > ld1;
        fb0 = fd0 > fd1;
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    boolean lb1 = true;
    Thought lo2 = Thought235.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Output.points[3][5] -= fd1;
    boolean lb3 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(lb1, lb3, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    lb3 = ab1 && ab2;
    ab3 = !ab4;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb3, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fd1 *= -1;
        fd0 *= -1;
        fd1 *= -1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
    double ld0 = 973.8103585099399;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
    double ld1 = 603.4944362266151;
    fb0 = fb1 || fb0;
    double ld2 = 442.3625252673179;
    fb1 = fb0 || fb1;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = !fb1;
    fb0 = ld0 < ld1;
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        ld2 *= -1;
        boolean lb3 = false;
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    Thought lo2 = Thought286.getInstance();
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    Thought lo3 = Thought388.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb4 = true;
    Thought lo5 = Thought86.getInstance(fo0, fo1, fo0, fo1, lb1, lb4, ab1, ab2);

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    if (fb1) {
        fb0 = fd1 < fd0;
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        double ld0 = 856.5143239187211;
        fb1 = !fb0;
        fb1 = fb0 || fb1;
        fd0 = fd1 - ld0;
        Thought lo1 = Thought287.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
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
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao2.m2();
}
    ad3 *= -1;
    fb1 = fb0 || fb1;
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 < fd0;
    lb0 = !fb0;
if(ao3 != null){
      ao3.m2(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    lb0 = ad4 < fd0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought261.getInstance(fd1, ad1, ad2, ad3);
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3();
}
    lb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;

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
    Output.points[3][6] += fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd1 = fd0 + fd1;
    double ld0 = 50.00785989177123;
    Output.points[3][7] -= ld0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - fd0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fd1 = ld0 + fd0;
    boolean lb2 = false;
    fd1 = ld0 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb2 = !ab1;
if(ao1 != null){
      fd1 = ao1.m3(ld0, fd0, fd1, ld0);
}
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ab1 = ao2.m2();
}
    Thought lo4 = Thought274.getInstance(ab2, ab3, ab4, fb0);

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
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    double ld0 = 662.7206348423686;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
    Thought lo1 = Thought302.getInstance(ad3, ad4, fd0, fd1);
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fb1 = fd1 > ld0;
    Output.points[3][8] -= ad1;
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = ab4 || fb0;
    Thought lo2 = Thought12.getInstance(fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb3);
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought325.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
    Thought lo4 = Thought2.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd1 > fd0;
    boolean lb5 = true;
    fb0 = fb1 && lb0;
    double ld6 = 561.3824326236431;
    boolean lb7 = false;
    Output.points[4][0] -= fd0;
    boolean lb8 = true;
        Thought lo9 = Thought136.getInstance(fd1, ld6, fd0, fd1);
    boolean lb10 = false;
    double ld11 = 586.8584565297336;
    ld6 = ld11 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld6, ld11, fd0, fd1);
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
    fb1 = fb0 && fb1;
    Output.points[4][1] += fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    double ld1 = 40.79770187169906;
    Thought lo2 = Thought25.getInstance();
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fd1 = ld1 + fd0;
    fb1 = lb0 && fb0;
    double ld3 = 812.4931060938201;
    Output.points[4][2] -= fd0;
    double ld4 = 665.3773317487836;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld3, fb1, lb0, fb0, fb1);
}
    Thought lo5 = Thought372.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);

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
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
        boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][3] += fd0;
    Thought lo2 = Thought123.getInstance(lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    Output.points[4][4] += fd1;
    lb0 = lb1 && fb0;
    Output.points[4][5] -= fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;

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
