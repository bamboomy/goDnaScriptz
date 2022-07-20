package genetic;
import java.util.ArrayList;
class Thought120 extends Thought{
private static ArrayList<Thought120> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 102.67543646321265;
private double fd1 = 298.94070695817845;
private Thought fo0 = null;
private Thought fo1 = null;
Thought120 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought120 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought120 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought120 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought120 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought120 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought120 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought120 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought120 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought120 instance = new Thought120 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought120 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought120 instance = new Thought120 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought120 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought120 instance = new Thought120 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought120 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought120 instance = new Thought120 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought120 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought120 instance = new Thought120 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought120 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought120 instance = new Thought120 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought120 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought120 instance = new Thought120 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought120 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought120 instance = new Thought120 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    double ld0 = 800.8108083194775;
    fd0 = fd1 - ld0;
    fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    if (fb1) {
        fb0 = ld0 < fd0;
        fb1 = !fb0;
        fb1 = fd1 < ld0;
        } else {
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
                  fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld0 *= -1;
        fb0 = fd0 < fd1;
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
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
    lb1 = ab1 && ab2;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[1][5] -= fd0;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, lb0);
}
    double ld4 = 918.3779933523208;
    lb1 = !lb3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(ld4, fd0, fd1, ld4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    Thought lo5 = Thought188.getInstance(fo1, fo0, fo1, fo0);
    double ld6 = 289.40077805234336;
        ab4 = fb0 || fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 < fd0;
        double ld0 = 114.46772996416185;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
        ad3 = ad4 - fd0;
        fd1 = ld0 - ad1;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld0, ad1, ad2, fb1, lb1, fb0, fb1);
}
        Output.points[1][6] -= ad3;
        lb1 = fb0 && fb1;
        Thought lo2 = Thought9.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
        ad4 = fd0 - fd1;
        fb0 = fb1 || lb1;
        double ld3 = 569.7281730493776;
        ld0 = ld3 + ad1;
        boolean lb4 = true;
        lb4 = ad2 > ad3;
        boolean lb5 = true;
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
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[1][7] -= ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    Output.points[1][8] -= ad4;
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, ab1, ab2);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought134.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
    double ld2 = 129.0799761206339;
    ab3 = !ab4;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[2][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb1 = !lb0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
    ad4 = fd0 - fd1;
    ld2 = ad1 - ad2;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought235.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    boolean lb2 = true;
    Output.points[2][1] -= fd0;
    Thought lo3 = Thought62.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
    Thought lo4 = Thought282.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
    fb0 = fb1 || lb1;
    lb2 = !fb0;
    fb1 = fd1 > fd0;

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
    double ld0 = 325.8235518310555;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    Thought lo1 = Thought33.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
    boolean lb2 = false;
if(ao1 != null){
      ad3 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(lb2, fb0, fb1, lb2);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, fb0, fb1, lb2, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
    Output.points[2][2] -= fd1;
    lb2 = ld0 < ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m3();
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
      ao2.m1(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought344.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought172.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
    double ld2 = 698.713508229922;
    Thought lo3 = Thought8.getInstance();
    fb1 = fd0 > fd1;
    double ld4 = 358.6575587325568;
    ld2 = ld4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought84.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = true;
    fd1 = ad1 + ad2;

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
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought158.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 148.06871215098772;
    fb0 = fd0 > fd1;
    ld2 *= -1;
    Thought lo3 = Thought164.getInstance(fb1, lb1, fb0, fb1);
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
}
    Output.points[2][3] -= fd1;
    boolean lb4 = false;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    boolean lb0 = true;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || ab1;
    fd1 = fd0 + fd1;
    double ld1 = 484.61533054980714;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought305.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld1;
    boolean lb3 = false;
    fb0 = fd0 > fd1;
    ld1 = fd0 + fd1;
    double ld4 = 412.61099076645996;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld4, fd0, fd1);
}
    Output.points[2][4] -= ld1;
    if (fb1) {
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
    double ld0 = 33.59158401534344;
    double ld1 = 588.0765035736041;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
    Output.points[2][5] += ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought284.getInstance(fb1, fb0, fb1, fb0);
    double ld3 = 36.72487640890222;
    fb1 = fb0 && fb1;
    ad4 *= -1;
    fd0 *= -1;
    fd1 = ld0 - ld1;
    fb0 = ld3 > ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ld3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought362.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - ld0;
    ld1 = ld3 - ad1;
    ad2 = ad3 - ad4;
        fb1 = fd0 > fd1;
    Output.points[2][6] += ld0;
if(fo0 != null){
      fb0 = fo0.m2(ld1, ld3, ad1, ad2);
}
    Thought lo5 = Thought397.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);

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
    if (ab1) {
if(fo1 != null){
          fo1.m2();
}
        ad1 *= -1;
        ab2 = ab3 || ab4;
        Output.points[2][7] -= ad2;
        double ld0 = 900.3683877695181;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
if(fo0 != null){
          fo0.m2(fd1, ld0, ad1, ad2, lb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        lb1 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        double ld2 = 600.0677466332473;
        Output.points[2][8] += ad2;
        boolean lb3 = false;
        fb0 = ad3 < ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ld0, ld2);
}
        lb1 = lb3 || ab1;
        Thought lo4 = Thought333.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        boolean lb5 = false;
        fd0 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought197.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 114.76264284104067;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought47.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Thought lo3 = Thought133.getInstance(ao2, ao3, ao4, fo0);
    ld1 = fd0 + fd1;
    double ld4 = 333.9559368140418;
if(fo1 != null){
      ld1 = fo1.m3(ld4, fd0, fd1, ld1);
}
    Output.points[3][0] += ld4;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb5 = false;
    Output.points[3][1] -= fd0;
    Output.points[3][2] += fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld1, ld4, fd0, fd1);
}
    if (lb5) {
        fb0 = fb1 && lb5;
        ld1 = ld4 + fd0;
        boolean lb6 = false;
        double ld7 = 455.5523144663071;
        fd0 = fd1 + ld7;
if(fo1 != null){
          lb5 = fo1.m2();
}
if(ao1 != null){
          ld1 = ao1.m3(fb0, fb1, lb6, lb5);
}
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
    Thought lo0 = Thought110.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
        Output.points[3][3] += ad1;
    Thought lo1 = Thought204.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought284.getInstance(ad2, ad3, ad4, fd0);
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
    ad3 *= -1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
    Thought lo0 = Thought138.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought278.getInstance();
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo2 = Thought199.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
        Output.points[3][4] += fd0;
    fd1 = ad1 - ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    double ld3 = 808.2950964719903;
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        Output.points[3][5] += ad4;
        fb0 = fb1 || ab1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        double ld4 = 470.6543878093995;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    Thought lo0 = Thought280.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    double ld1 = 412.16249805694684;
    fb0 = fd0 < fd1;
    Thought lo2 = Thought278.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 684.2131778812964;
    fd0 = fd1 + ld0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && ab1;
    ab2 = fd0 > fd1;
    ld0 = fd0 + fd1;
    ld0 *= -1;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
    ab2 = fd0 > fd1;
    boolean lb2 = true;
    Output.points[3][6] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3();
}
    ab2 = ab3 && ab4;

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
    ad1 *= -1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    double ld1 = 629.9173875999845;
    fd0 = fd1 + ld1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    ld1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    lb0 = fd1 < ld1;

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
    boolean lb0 = false;
    ab1 = !ab2;
    Thought lo1 = Thought209.getInstance(fo1, fo0, fo1, fo0);
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = ad4 < fd0;
    lb2 = ab1 && ab2;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, lb2, ab1, ab2);
}
        ab3 = fd0 > fd1;
    double ld3 = 686.4790305963876;
    ld3 *= -1;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3();
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      fd0 = ao3.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought176.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought137.getInstance(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
    Thought lo3 = Thought325.getInstance(ao2, ao3, ao4, fo0);
    boolean lb4 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    lb4 = !fb0;
    fb1 = lb0 && lb4;
    fb0 = fd0 < fd1;
        Thought lo5 = Thought313.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
    double ld6 = 788.9366143994241;
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb4, fb0, fb1);
}
    lb0 = ld6 > fd0;
    boolean lb7 = true;

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
    boolean lb0 = true;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought368.getInstance(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    Thought lo2 = Thought277.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld3 = 676.4842601747441;
    Thought lo4 = Thought240.getInstance(ad2, ad3, ad4, fd0);
    Thought lo5 = Thought350.getInstance(ao4, fo0, fo1, ao1, fd1, ld3, ad1, ad2);
    Thought lo6 = Thought69.getInstance();
if(ao2 != null){
      ao2.m3(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3, lb0, fb0, fb1, lb0);
}
    boolean lb7 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, lb7, fb0, fb1, lb0);
}
    fd0 = fd1 - ld3;
    lb7 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb7, fb0, fb1);
}
    boolean lb8 = true;
    lb0 = lb7 && lb8;
    fb0 = !fb1;
    double ld9 = 355.5250606596356;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[3][7] += ld9;
    lb0 = ad1 < ad2;
    lb7 = lb8 || fb0;
    boolean lb10 = true;

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
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought296.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought152.getInstance();
    fd1 = fd0 - fd1;
    Thought lo2 = Thought388.getInstance(ab4, fb0, fb1, ab1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld3 = 2.729275851634403;
    ld3 *= -1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      ab1 = fo1.m2(ld3, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought44.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld3, fd0);
}
    ab4 = fd1 > ld3;
    fb0 = fb1 || ab1;
    fd0 *= -1;
    Thought lo5 = Thought141.getInstance(fo1, ao1, ao2, ao3, fd1, ld3, fd0, fd1);
    Output.points[3][8] += ld3;
if(ao4 != null){
      ao4.m3();
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    boolean lb6 = true;
    ab1 = !ab2;
    Thought lo7 = Thought308.getInstance(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] -= ad1;
    Thought lo0 = Thought282.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld1 = 366.5330209714764;
    ld1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab3 = ao1.m2(ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
    fd0 = fd1 + ld1;
    ab3 = !ab4;
    fb0 = fb1 && lb2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld3 = 738.1732069794754;
if(ao3 != null){
      ao2 = ao3.m4();
}
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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought309.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + fd0;
    lb1 = lb2 || fb0;
    fd1 *= -1;
    Output.points[4][1] -= fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, lb1, lb2, fb0);
}
    Output.points[4][2] -= fd1;
    fb1 = !lb1;
    Thought lo3 = Thought249.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);

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
    fd0 *= -1;
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought370.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    ab2 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2();
}
    boolean lb4 = false;
    ab3 = ab4 || fb0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb2, lb3);
}
    fd0 = fd1 - fd0;
    lb4 = ab1 || ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought357.getInstance(fd1, fd0, fd1, fd0, lb0, lb2, lb3, lb4);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    if (lb2) {
        lb3 = !lb4;
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
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    ad2 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    ad3 = ad4 - fd0;
    lb0 = fd1 < ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = fd0 > fd1;
    lb0 = fb0 && fb1;
    ad1 = ad2 - ad3;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = ad2 > ad3;

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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ad4 < fd0;
    boolean lb0 = true;
    fd1 *= -1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    Output.points[4][3] += fd0;
    ab3 = !ab4;
    double ld1 = 808.1232015784511;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    Output.points[4][4] += ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = !ab1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo1.m3();
}
    Thought lo2 = Thought218.getInstance(ab2, ab3, ab4, fb0);
    double ld3 = 480.97277241485705;
    fb1 = lb0 && ab1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;

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
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    Thought lo1 = Thought153.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
        double ld2 = 879.9868783961386;
        Output.points[4][5] -= ld2;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
}
        lb0 = ld2 > fd0;
if(ao1 != null){
          fo1 = ao1.m4();
}
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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    double ld0 = 937.8146059945535;
    double ld1 = 224.49683862188274;
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = ld1 > ad1;
if(ao2 != null){
          ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        fb0 = ld0 > ld1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
        Output.points[4][6] -= fd1;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, ld0, ld1, ad1, ad2);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = !ab2;
    double ld0 = 746.6512585792476;
    Thought lo1 = Thought137.getInstance();
    Output.points[4][7] -= ld0;
    boolean lb2 = false;
    ab2 = ab3 || ab4;
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb2, ab1);
}
    ab2 = !ab3;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, lb2, ab1);
}
    Thought lo3 = Thought3.getInstance(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);

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
    Output.points[4][8] -= ad1;
    ad2 = ad3 + ad4;
    double ld0 = 214.29045111663433;
    ab1 = ab2 && ab3;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
        Thought lo2 = Thought177.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    lb1 = ld0 > ad1;
    Output.points[5][0] += ad2;
    ab1 = ad3 > ad4;
    Thought lo3 = Thought235.getInstance(fo1, ao1, ao2, ao3);
    fd0 = fd1 + ld0;
    boolean lb4 = true;
    ab1 = ad1 > ad2;
    ab2 = ad3 > ad4;
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 712.4218071090048;
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Output.points[5][1] += fd0;
            boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = ld0 > fd0;

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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
    Thought lo1 = Thought39.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1();
}
    boolean lb3 = true;
        fd1 = fd0 - fd1;
    lb2 = fd0 < fd1;
    boolean lb4 = false;
    Output.points[5][2] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb3, lb4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, lb3, lb4, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb2, lb3);
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
    Thought lo0 = Thought275.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Output.points[5][3] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 291.3336265283984;
    double ld2 = 351.0545806588591;
    ld1 = ld2 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo3 = Thought220.getInstance(fb0, fb1, fb0, fb1);
    ld1 = ld2 - fd0;
    fb0 = fb1 || fb0;
    boolean lb4 = true;

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
