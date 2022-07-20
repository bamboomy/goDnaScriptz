package genetic;
import java.util.ArrayList;
class Thought323 extends Thought{
private static ArrayList<Thought323> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 359.4808057645092;
private double fd1 = 818.8298231999206;
private Thought fo0 = null;
private Thought fo1 = null;
Thought323 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought323 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought323 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought323 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought323 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought323 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought323 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought323 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought323 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought323 instance = new Thought323 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought323 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought323 instance = new Thought323 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought323 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought323 instance = new Thought323 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought323 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought323 instance = new Thought323 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought323 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought323 instance = new Thought323 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought323 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought323 instance = new Thought323 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought323 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought323 instance = new Thought323 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought323 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought323 instance = new Thought323 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    if (fb1) {
        } else {
        Output.points[5][8] -= fd1;
        Thought lo0 = Thought62.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        Output.points[6][0] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought395.getInstance();
        Thought lo2 = Thought224.getInstance(fb0, fb1, fb0, fb1);
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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2();
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    Output.points[6][1] -= fd1;
    Output.points[6][2] -= fd0;
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    lb1 = ab1 && ab2;
    fd0 = fd1 + fd0;
    double ld2 = 560.5766964651931;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    double ld3 = 418.64512603985713;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2, lb0, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ld3 = fd0 + fd1;
    ld2 = ld3 - fd0;

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
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought287.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought173.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fb0 = ad2 < ad3;
    fb1 = !lb1;
    boolean lb3 = true;
    Thought lo4 = Thought386.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    lb3 = ad3 < ad4;
    boolean lb5 = true;
    lb5 = fb0 || fb1;

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
        Output.points[6][3] -= ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought220.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[6][4] -= ad3;
if(fo0 != null){
      ad4 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        double ld1 = 777.422712646019;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
    ad2 *= -1;
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    double ld2 = 128.9275055474673;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
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
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        Output.points[6][5] -= fd1;
        fd0 *= -1;
if(ao1 != null){
          fd1 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        }
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    double ld1 = 44.132780164256275;
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao3.m2(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought355.getInstance(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
    Output.points[6][6] -= ld1;
    fb0 = fd0 < fd1;

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
    ad1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3();
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    Output.points[6][7] -= ad4;
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    double ld2 = 245.92608354222722;
if(ao4 != null){
      lb0 = ao4.m2(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought307.getInstance(fo0, fo1, ao1, ao2);
    Output.points[6][8] -= fd0;
    Thought lo5 = Thought150.getInstance(fd1, ld2, ad1, ad2);
    ad3 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2);
}
if(ao2 != null){
      lb3 = ao2.m2();
}
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
      fb1 = ao3.m2(lb0, lb1, lb3, fb0);
}
    fd1 = ld2 + ad1;
    fb1 = ad2 > ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, lb0, lb1, lb3, fb0);
}
    fb1 = ad1 < ad2;

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
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld0 = 589.7398051698291;
    ld0 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 *= -1;
if(ao4 != null){
      ao4.m1(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ad1 *= -1;
    Thought lo0 = Thought371.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb0 = false;
    Thought lo1 = Thought293.getInstance();
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought206.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[7][0] += fd1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb3 = fb0 || fb1;
    Thought lo4 = Thought78.getInstance(lb0, lb3, fb0, fb1);
    boolean lb5 = true;
    lb0 = lb3 || lb5;

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
    fd0 *= -1;
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 182.24584319635923;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    double ld1 = 328.9203511142449;
    ld1 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    Output.points[7][1] -= fd0;
    fd1 = ld0 + ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;

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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Thought lo1 = Thought34.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    double ld2 = 333.7407884425355;
    Output.points[7][2] -= ad3;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    lb0 = ad4 < fd0;
    double ld4 = 103.57396149472268;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    lb3 = ld2 < ld4;
    fb0 = fb1 || lb0;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb5, fb0, fb1, lb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb3, lb5, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, ld2, ld4, ad1, lb3, lb5, fb0, fb1);
}
    lb0 = lb3 || lb5;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
}
    lb5 = fb0 && fb1;
    lb0 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
    ab3 = fd1 < ad1;
    double ld0 = 554.7045106699983;
    Output.points[7][3] += ad1;
    Thought lo1 = Thought74.getInstance(ad2, ad3, ad4, fd0);
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    Output.points[7][4] += ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = true;
    fb0 = fb1 || lb2;
    ld0 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb2 && ab1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 99.22960396011659;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    if (fb0) {
        fd1 *= -1;
if(ao1 != null){
          ld0 = ao1.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
        for(int i0=0; i0<10; i0++){
            double ld2 = 492.7923629975775;
            boolean lb3 = true;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
            ld2 *= -1;
            boolean lb4 = true;
if(ao1 != null){
              lb1 = ao1.m2(ld0, fd0, fd1, ld2);
}
            if (fb0) {
                if (fb1) {
                    Output.points[7][5] += ld0;
                    lb3 = fd0 > fd1;
}}}}
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
    double ld0 = 107.64709447018662;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 903.5134289298021;
        fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    ad1 *= -1;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
    double ld3 = 808.9194690240591;
    if (fb1) {
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3);
}
        lb2 = !fb0;
        fb1 = lb2 || fb0;
if(fo0 != null){
          ao4 = fo0.m4(ad1, ad2, ad3, ad4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Output.points[7][6] += fd1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought167.getInstance(ao2, ao3, ao4, fo0);
    ad2 *= -1;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
    Output.points[7][7] -= ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2();
}
    double ld2 = 244.15501140376398;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, ab1);
}
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
    fd1 *= -1;
    ld2 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb1 = ao3.m2(fd0, fd1, ld2, ad1);
}
    Output.points[7][8] -= ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    ld2 = ad1 - ad2;

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
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought213.getInstance();
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
    fd1 *= -1;
    Output.points[8][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
    Thought lo3 = Thought109.getInstance(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
    lb2 = fb0 && fb1;
    double ld4 = 187.07561966542983;
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
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
    fd0 *= -1;
    ab1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab1 = !ab2;
    boolean lb0 = true;
    fd0 *= -1;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3();
}
    Thought lo0 = Thought389.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    Thought lo1 = Thought64.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    double ld2 = 149.0570052900073;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld2, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld2 = ad1 + ad2;
    Thought lo3 = Thought129.getInstance();
    Output.points[8][1] -= ad3;
    Output.points[8][2] -= ad4;

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
    ab1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = fd1 < ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd1 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    boolean lb2 = true;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb3 = true;

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
    Thought lo0 = Thought252.getInstance();
    Output.points[8][3] += fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 207.85002577547382;
    Thought lo2 = Thought258.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    double ld3 = 373.21092864351465;
    double ld4 = 733.6857972065292;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    boolean lb5 = false;

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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m1();
}
    Output.points[8][4] -= ad3;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    Output.points[8][5] += ad4;
    double ld0 = 869.0479496660088;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        }
    Output.points[8][6] += fd0;
    lb1 = fd1 < ld0;
    Output.points[8][7] += ad1;
    ad2 *= -1;
    fb0 = !fb1;

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
    fd0 *= -1;
    ab2 = !ab3;
    double ld0 = 276.0047134646233;
    boolean lb1 = false;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1);
}
    boolean lb2 = true;
    ld0 *= -1;
    double ld3 = 269.80036924532806;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = !ab4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        Output.points[8][8] -= fd1;
        ad1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fb1 = ao2.m2(ad2, ad3, ad4, fd0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought15.getInstance();
    Output.points[0][0] -= fd0;
    Output.points[0][1] -= fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought236.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    double ld3 = 64.39665308066537;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    lb0 = ld3 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Thought lo4 = Thought132.getInstance(fo1, fo0, fo1, fo0);
    boolean lb5 = false;
    lb0 = lb5 && fb0;
    fb1 = lb0 && lb5;
    fd1 = ld3 + fd0;
if(fo1 != null){
      fo1.m3(fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
    fb1 = lb0 && lb5;

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
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought333.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, lb4, ab1);
}
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
    Thought lo5 = Thought243.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Thought lo6 = Thought179.getInstance();
if(fo1 != null){
      fo1.m1(fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = fd1 < fd0;
    lb2 = !lb4;
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad2 > ad3;
    fb0 = fb1 && fb0;
    double ld0 = 818.0932736506746;
    Output.points[0][2] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    Thought lo1 = Thought202.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo0.m3();
}
    Thought lo2 = Thought67.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought178.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ld0 = ad1 + ad2;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
    ld0 *= -1;
    ad1 = ad2 + ad3;
    Thought lo4 = Thought134.getInstance(ad4, fd0, fd1, ld0);
    ad1 *= -1;

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
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Thought lo0 = Thought208.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    ab2 = !ab3;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Output.points[0][3] += fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    Output.points[0][4] -= fd1;
    fb1 = fb0 || fb1;
    double ld0 = 728.6733604657863;
    ld0 = fd0 + fd1;
    double ld1 = 831.625447863854;
    ld0 *= -1;
    ld1 = fd0 - fd1;
    ld0 = ld1 - fd0;
    fb0 = fb1 || fb0;
    Thought lo2 = Thought165.getInstance(fo1, ao1, ao2, ao3);
        Output.points[0][5] += fd1;
    if (fb1) {
        Thought lo3 = Thought284.getInstance(ld0, ld1, fd0, fd1);
        Thought lo4 = Thought357.getInstance(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1);
        ld0 = ld1 - fd0;
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
    Output.points[0][6] += ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = ad3 < ad4;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Output.points[0][7] -= ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought201.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);

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
    if (ab1) {
        ab2 = fd1 < fd0;
        fd1 = fd0 - fd1;
        boolean lb0 = false;
        double ld1 = 659.6781509172397;
        double ld2 = 796.071891404419;
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb0;
        Output.points[0][8] -= ld1;
        Thought lo3 = Thought358.getInstance();
        double ld4 = 712.2864725097041;
        ab1 = ab2 && ab3;
        ld2 *= -1;
        ld4 *= -1;
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    double ld0 = 242.66928877692328;
    Thought lo1 = Thought386.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    Output.points[1][0] -= ld0;
    ab4 = !fb0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    Output.points[1][1] += fd0;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2();
}
    Thought lo1 = Thought332.getInstance(fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    Thought lo3 = Thought183.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[1][2] += fd0;
    lb0 = fd1 > fd0;
        double ld4 = 669.682267740038;
    lb2 = fd0 > fd1;
    fb0 = ld4 > fd0;
    fb1 = lb0 || lb2;
    fb0 = fd1 < ld4;
    fb1 = !lb0;

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
    boolean lb0 = true;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fb1 = lb0 || fb0;
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought106.getInstance(fd0, fd1, fd0, fd1);
    lb1 = fd0 > fd1;
    lb2 = fd0 > fd1;
    boolean lb4 = true;
    Thought lo5 = Thought96.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
          lb4 = fo0.m2();
}
    Thought lo6 = Thought119.getInstance(fb0, fb1, lb0, lb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, lb4);
}
    fb0 = fd1 < fd0;
    Thought lo7 = Thought71.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    double ld8 = 804.9097327253095;
    lb4 = fd0 > fd1;
    ld8 = fd0 - fd1;

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
    double ld0 = 579.7756747064818;
    boolean lb1 = true;
    lb1 = !fb0;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        fb1 = !lb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    lb1 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    fd0 *= -1;
    fb1 = fd1 > ld0;

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
