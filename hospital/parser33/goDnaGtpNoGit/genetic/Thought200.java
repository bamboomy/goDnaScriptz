package genetic;
import java.util.ArrayList;
class Thought200 extends Thought{
private static ArrayList<Thought200> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 678.8421470099397;
private double fd1 = 611.2354756561956;
private Thought fo0 = null;
private Thought fo1 = null;
Thought200 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought200 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought200 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought200 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought200 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought200 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought200 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought200 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought200 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought200 instance = new Thought200 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought200 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought200 instance = new Thought200 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought200 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought200 instance = new Thought200 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought200 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought200 instance = new Thought200 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought200 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought200 instance = new Thought200 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought200 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought200 instance = new Thought200 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought200 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought200 instance = new Thought200 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought200 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought200 instance = new Thought200 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[4][2] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    Output.points[4][3] -= fd1;
    double ld0 = 431.0426922225274;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 813.2829861133362;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    Output.points[4][4] += ld1;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    ld1 *= -1;

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
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    boolean lb0 = false;
    ab4 = !fb0;
    fd0 = fd1 + fd0;
    double ld1 = 484.4147342559015;
    fb1 = fd0 > fd1;
    boolean lb2 = false;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(lb0, lb2, ab1, ab2);
}
    boolean lb3 = false;
        ab2 = ab3 && ab4;
    Output.points[4][5] -= ld1;
    fd0 = fd1 - ld1;
    fd0 *= -1;
    Thought lo4 = Thought55.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
    lb3 = !ab1;
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb2, lb3);
}
    double ld5 = 47.21691061920292;

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
    Thought lo0 = Thought399.getInstance(fo1, fo0, fo1, fo0);
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m3();
}
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 43.054630208561015;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb2 = false;
    fd1 = ld1 - ad1;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[4][6] += ad2;
    lb2 = ad3 > ad4;

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
    Thought lo0 = Thought83.getInstance(ad2, ad3, ad4, fd0);
    Thought lo1 = Thought28.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ab2 = ab3 && ab4;
    fb0 = ad4 > fd0;
    Thought lo2 = Thought204.getInstance();
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought131.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
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
    if (fb0) {
        fd1 = fd0 - fd1;
        fb1 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd0 *= -1;
if(ao4 != null){
          ao4.m3(fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
        double ld1 = 935.6517448727956;
        Output.points[4][7] -= ld1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          lb0 = fo0.m2(fd0, fd1, ld1, fd0);
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
    Output.points[4][8] += ad1;
    fb1 = fb0 || fb1;
    if (fb0) {
        ad2 = ad3 - ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        ad3 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
        fb0 = fb1 || lb0;
        fb0 = ad4 > fd0;
        Thought lo1 = Thought177.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
        lb0 = fb0 || fb1;
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        fd1 *= -1;
        lb0 = ad1 > ad2;
        fb0 = ad3 < ad4;
        fd0 = fd1 + ad1;
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
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
    fd1 = fd0 + fd1;
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2();
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    double ld1 = 497.7408338030909;
    ab4 = !fb0;
    fd0 *= -1;
    Thought lo2 = Thought47.getInstance(fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
    ld1 = fd0 + fd1;
    ab3 = ld1 > fd0;
    boolean lb3 = true;
    ab3 = fd1 > ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      lb3 = ao2.m2(fd0, fd1, ld1, fd0);
}
    ab1 = fd1 < ld1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[5][0] += fd1;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought354.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    ab4 = ad2 < ad3;
    Thought lo1 = Thought120.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    Output.points[5][1] += ad2;
    boolean lb2 = true;
        ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = !ab2;
if(ao2 != null){
      ao2.m2(fd1, ad1, ad2, ad3);
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Output.points[5][2] -= ad3;

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
    boolean lb0 = false;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = fd0 < fd1;

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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    for(int i0=0; i0<10; i0++){
        Output.points[5][3] += fd0;
        fb0 = fb1 && ab1;
        ab2 = fd1 > fd0;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        Output.points[5][4] += fd1;
if(fo1 != null){
          fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 745.8790410871718;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    Thought lo3 = Thought155.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      ad2 = fo0.m3(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
    Output.points[5][5] += ad4;
    Output.points[5][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    lb1 = ab1 || ab2;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought333.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought376.getInstance(fo0, fo1, ao1, ao2);
    boolean lb2 = true;
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo3 = Thought108.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    fb1 = lb2 && fb0;
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fd0 < fd1;

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
    if (fb1) {
        double ld0 = 876.4228357564299;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        boolean lb2 = false;
        lb1 = lb2 && fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb1, lb2, fb0);
}
        boolean lb3 = true;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld0, ad1, ad2, fb0, fb1, lb1, lb2);
}
        ad3 = ad4 + fd0;
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
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[5][7] += fd0;
    Output.points[5][8] += fd1;
    fd0 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld2 = 525.5491342254224;
    fb0 = !fb1;
    Thought lo3 = Thought247.getInstance(ld2, fd0, fd1, ld2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd1 = ao2.m3(lb0, lb1, lb4, ab1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ad1 = ad2 - ad3;
    ab4 = !fb0;
    fb1 = ad4 < fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
        fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought103.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
    ad3 = ad4 - fd0;
    Thought lo1 = Thought58.getInstance(fo1, ao1, ao2, ao3);
    boolean lb2 = false;
    ab1 = fd1 > ad1;
if(ao4 != null){
      ab2 = ao4.m2(ad2, ad3, ad4, fd0);
}
    double ld3 = 452.6829676032251;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld3, ad1);
}
    ad2 = ad3 + ad4;
    ab4 = fb0 || fb1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo4 = Thought119.getInstance(lb2, ab1, ab2, ab3);
    fd1 = ld3 + ad1;
    ad2 = ad3 - ad4;

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
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld2 = 334.25883992802983;
    fd0 = fd1 + ld2;

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
    Thought lo0 = Thought130.getInstance();
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    if (ab3) {
if(fo0 != null){
          ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
        ab1 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Output.points[6][0] += fd1;
        boolean lb1 = false;
        Thought lo2 = Thought8.getInstance(fd0, fd1, fd0, fd1);
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
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    lb1 = !lb2;
    ad1 = ad2 - ad3;
    boolean lb3 = true;
if(fo1 != null){
      ad4 = fo1.m3(lb3, fb0, fb1, lb0);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
}
    lb0 = !lb1;
    fd1 = ad1 - ad2;
    if (lb2) {
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb0);
}
        if (lb1) {
            ad2 = ad3 - ad4;
            lb2 = lb3 && fb0;
            fd0 *= -1;
            fd1 *= -1;
}}
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought278.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ad1 - ad2;
    Output.points[6][1] -= ad3;
    Output.points[6][2] += ad4;
    ab3 = !ab4;
    fb0 = !fb1;
    double ld1 = 811.311154410655;
    Thought lo2 = Thought208.getInstance(ad4, fd0, fd1, ld1);

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
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = fb0 && fb1;
    double ld0 = 699.0029356883293;
if(ao3 != null){
      ao3.m1(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought200.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    boolean lb1 = true;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo2 = Thought366.getInstance(lb0, lb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    fb1 = lb0 || lb1;
    fb0 = fb1 && lb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        double ld0 = 278.8622688098884;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    if (lb1) {
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
          ao1.m2();
}
        double ld2 = 234.05554687410813;
        Thought lo3 = Thought170.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
          ld2 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld2, fb1, lb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld2, fb1, lb1, ab1, ab2);
}
        ld0 = fd0 + fd1;
        ab3 = !ab4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
        ab3 = !ab4;
        fb0 = !fb1;
        ld2 = ld0 - fd0;
        lb1 = !ab1;
        fd1 = ld2 + ld0;
        ab2 = fd0 < fd1;
        if (ab3) {
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought95.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
        fd0 *= -1;
        ab2 = ab3 || ab4;
        fb0 = fd1 < ad1;
        boolean lb1 = false;
        ad2 = ad3 - ad4;
if(ao1 != null){
          fd0 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb1, ab1);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 973.0808479031549;
    Output.points[6][3] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    Thought lo3 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    lb2 = fb0 || fb1;
    lb1 = fd1 > ld0;
    lb2 = fb0 && fb1;
        fd0 = fd1 + ld0;
    Thought lo4 = Thought16.getInstance();
if(fo0 != null){
      fo0.m3(lb1, lb2, fb0, fb1);
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
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
    Output.points[6][4] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    lb0 = fd0 < fd1;
    double ld1 = 478.35395966409743;
if(fo0 != null){
      ab1 = fo0.m2(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb0, lb2, lb3, lb4);
}
    lb5 = fd0 > fd1;

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
    fb1 = !fb0;
    Output.points[6][5] += ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought95.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    lb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = lb1 || fb0;
    ad4 *= -1;
        boolean lb2 = true;
    boolean lb3 = true;
    Thought lo4 = Thought281.getInstance();
    fd0 *= -1;

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
    Thought lo0 = Thought279.getInstance(ab1, ab2, ab3, ab4);
    boolean lb1 = true;
    ab4 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought331.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab2 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought134.getInstance(fb1, lb1, lb3, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb1, lb3, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad1 < ad2;
if(fo0 != null){
      lb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    lb3 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo5 = Thought292.getInstance();
    ab3 = fd0 < fd1;
    ad1 *= -1;
    ad2 *= -1;
    ab4 = ad3 > ad4;

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
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought266.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    Thought lo2 = Thought356.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || lb1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      lb1 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(lb3, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb1);
}
    lb3 = fb0 || fb1;

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
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ad4 = ao4.m3(fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - ad1;
        }
    Thought lo0 = Thought72.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);

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
    Thought lo0 = Thought37.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 10.053971431596423;
    boolean lb2 = true;
    boolean lb3 = true;
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    fd0 *= -1;
    ab3 = !ab4;
    double ld4 = 323.638463658993;
    fd0 *= -1;
    Output.points[6][6] += fd1;
    boolean lb5 = true;
    double ld6 = 92.03529861382468;
    ld1 = ld4 + ld6;
    Thought lo7 = Thought7.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld4, lb3, lb5, ab1, ab2);
}
    if (ab3) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought84.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Output.points[6][7] += ad2;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    Output.points[6][8] += ad1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
    fd1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
}
    double ld2 = 460.8794284723087;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
    ab3 = ad4 < fd0;
    boolean lb3 = true;
    ab3 = fd1 < ld2;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    double ld4 = 326.74989776361105;
    double ld5 = 424.1167591433294;
    Thought lo6 = Thought145.getInstance(ao4, fo0, fo1, ao1);

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
    fd1 *= -1;
    double ld0 = 42.216896612344804;
    Thought lo1 = Thought307.getInstance(ld0, fd0, fd1, ld0);
    Thought lo2 = Thought355.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo0.m3();
}
    Output.points[7][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ld0 = fd0 + fd1;
    double ld3 = 224.51147174494338;
    ld0 = ld3 + fd0;
    fb1 = fd1 < ld0;

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
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        fb0 = fd1 < fd0;
    Thought lo2 = Thought40.getInstance(fb1, lb0, lb1, fb0);
    double ld3 = 854.1738042423298;
    fd0 = fd1 - ld3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb0, lb1, fb0, fb1);
}
    Thought lo4 = Thought7.getInstance(fd1, ld3, fd0, fd1, lb0, lb1, fb0, fb1);
    ld3 *= -1;
        boolean lb5 = false;
    fd0 = fd1 - ld3;
    Thought lo6 = Thought133.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, lb5, fb0);
    fd0 = fd1 - ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld3, fd0);
}
        fd1 = ld3 + fd0;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
        Thought lo2 = Thought253.getInstance(lb1, fb0, fb1, lb0);
    lb1 = fb0 || fb1;
    fd0 *= -1;
    double ld3 = 899.6298277814121;
    lb0 = fd0 < fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - ld3;
    fd0 = fd1 - ld3;
    Output.points[7][1] -= fd0;
    fd1 = ld3 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ld3, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ld3 = fd0 + fd1;
    Thought lo4 = Thought251.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0);
}
    Thought lo5 = Thought326.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    boolean lb6 = true;

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
