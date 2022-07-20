package genetic;
import java.util.ArrayList;
class Thought357 extends Thought{
private static ArrayList<Thought357> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 563.1177320684857;
private double fd1 = 569.9014457619742;
private Thought fo0 = null;
private Thought fo1 = null;
Thought357 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought357 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought357 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought357 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought357 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought357 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought357 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought357 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought357 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought357 instance = new Thought357 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought357 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought357 instance = new Thought357 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought357 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought357 instance = new Thought357 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought357 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought357 instance = new Thought357 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought357 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought357 instance = new Thought357 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought357 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought357 instance = new Thought357 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought357 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought357 instance = new Thought357 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought357 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought357 instance = new Thought357 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 196.63304719710547;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && fb0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    fb1 = !fb0;
    fd1 = ld0 + fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    Output.points[8][2] += fd1;
    ld0 *= -1;
    fd0 = fd1 + ld0;

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
      fo0 = fo1.m4();
}
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    double ld1 = 325.8256955679726;
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought322.getInstance(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    Thought lo3 = Thought65.getInstance(fo1, fo0, fo1, fo0);
    ab4 = !fb0;
    Output.points[8][3] -= ld1;
    Thought lo4 = Thought383.getInstance(fd0, fd1, ld1, fd0);
    boolean lb5 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, lb5);
}
    boolean lb6 = true;
    double ld7 = 40.905226385936885;
    fd0 = fd1 - ld1;
    ld7 = fd0 + fd1;
    ld1 = ld7 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld7, fd0, lb6, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(ld1, ld7, fd0, fd1, lb0, lb5, lb6, ab1);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = fb0 || fb1;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought61.getInstance();
    Thought lo2 = Thought314.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    double ld3 = 158.71668260411545;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3);
}
    double ld4 = 918.8271840330895;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld3 = ld4 - ad1;
    Output.points[8][4] -= ad2;

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
      fo0.m1();
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Thought lo0 = Thought207.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[8][5] -= ad4;
    double ld1 = 611.767832218859;
    ab3 = ad4 > fd0;
    Thought lo2 = Thought89.getInstance(fd1, ld1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    ld1 *= -1;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, ab1);
}
    Output.points[8][6] -= ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld1 = ad1 + ad2;
    boolean lb3 = true;

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
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought128.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought395.getInstance();
if(ao3 != null){
      ao3.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    Output.points[8][7] -= fd0;
    fd1 *= -1;
    boolean lb3 = true;
    Output.points[8][8] -= fd0;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    fb0 = !fb1;
    lb2 = fd0 > fd1;
    lb3 = fb0 && fb1;
    Thought lo4 = Thought191.getInstance(fo0, fo1, ao1, ao2, lb2, lb3, fb0, fb1);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb5 = true;
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fb0 = fb1 || fb0;
    fd1 = ad1 - ad2;
    Thought lo0 = Thought50.getInstance();
    ad3 *= -1;
    boolean lb1 = true;
    ad4 *= -1;
    double ld2 = 23.326618391005795;
    Thought lo3 = Thought330.getInstance(fb0, fb1, lb1, fb0);
    ad4 = fd0 + fd1;
    ld2 = ad1 + ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(ld2, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    Thought lo4 = Thought388.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[0][0] += ld2;

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
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
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
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    fb0 = fb1 && ab1;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Output.points[0][1] -= fd0;
    Thought lo0 = Thought288.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
    ab2 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought359.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
    Thought lo3 = Thought388.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        lb1 = ab1 && ab2;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 *= -1;
    Thought lo0 = Thought2.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Output.points[0][2] += fd0;
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    double ld1 = 929.3496622208526;
    fb0 = fb1 || fb0;

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
            boolean lb0 = false;
    lb0 = ab1 && ab2;
    Thought lo1 = Thought48.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Thought lo2 = Thought198.getInstance(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = fd1 < fd0;
    Output.points[0][3] += fd1;
if(fo1 != null){
      fo1.m3(fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    ab3 = ab4 || fb0;
    Output.points[0][4] -= fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought318.getInstance(fo0, fo1, fo0, fo1);
    fb1 = lb0 || fb0;
    Output.points[0][5] -= ad3;
    Output.points[0][6] -= ad4;
    Output.points[0][7] -= fd0;
    fd1 *= -1;
    Thought lo2 = Thought379.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
    Thought lo3 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    Output.points[0][8] -= ad1;
if(fo0 != null){
      fo0.m3();
}
    if (fb1) {
        boolean lb4 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought98.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ad1;
    Thought lo1 = Thought351.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);

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
    Thought lo0 = Thought169.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    lb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fb1 = lb1 || fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = lb1 || fb0;
    Thought lo2 = Thought222.getInstance(fb1, lb1, fb0, fb1);
    double ld3 = 937.1578904584344;
    lb1 = fb0 && fb1;
    double ld4 = 150.50904886701505;
    ld3 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld3, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ld4, fd0, fd1, ld3, fb1, lb1, fb0, fb1);
}
    ld4 = fd0 + fd1;
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, lb5, fb0, fb1);
}
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb6 = true;
if(fo1 != null){
      fo1.m1(ld4, fd0, fd1, ld3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][0] += ad2;
    fb1 = ad3 < ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
}
        ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        fb1 = ad3 > ad4;
        double ld0 = 137.29915129104324;
        fb0 = ad4 < fd0;
        fd1 = ld0 - ad1;
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
if(ao2 != null){
          fb1 = ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb1 = false;
        fd1 *= -1;
        double ld2 = 569.3492898114874;
        lb1 = ld0 > ld2;
        Output.points[1][1] -= ad1;
        fb0 = fb1 && lb1;
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
    Output.points[1][2] += fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 209.30244237721962;
    double ld1 = 820.1243106443611;
    boolean lb2 = true;
    ld1 = fd0 + fd1;
    fb0 = ld0 < ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
    Output.points[1][3] -= fd0;
    fb1 = lb2 && ab1;
    double ld3 = 946.8394204384538;
    boolean lb4 = true;
    Output.points[1][4] += fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought127.getInstance();
        ab1 = ab2 || ab3;
        boolean lb6 = true;
if(ao2 != null){
          ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
    Thought lo0 = Thought166.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought201.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought236.getInstance(ao4, fo0, fo1, ao1);
    fd0 = fd1 + ad1;
    boolean lb3 = true;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    double ld4 = 179.00434766442993;
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[1][5] -= fd0;
        boolean lb0 = false;
    fd1 = fd0 + fd1;
    Output.points[1][6] += fd0;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 && lb1;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    double ld3 = 466.1796736251025;
    double ld4 = 585.9675944510892;
    lb0 = !lb1;
    Thought lo5 = Thought268.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought123.getInstance(ld4, fd0, fd1, ld3);
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld4);
}
if(fo0 != null){
      fo0.m2();
}
    lb2 = fd0 < fd1;

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
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        double ld0 = 99.86944456935822;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
        }
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    double ld2 = 330.6821321569221;
        ab3 = ld2 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1, ab4, fb0, fb1, ab1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    lb1 = ad2 > ad3;
    Thought lo2 = Thought181.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || lb0;
    Thought lo3 = Thought294.getInstance(ad4, fd0, fd1, ad1);
    Thought lo4 = Thought1.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    boolean lb5 = true;
    Thought lo6 = Thought180.getInstance();
    fd1 = ad1 + ad2;
    lb1 = !lb5;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, lb5);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb5, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb5, fb0, fb1);
}
    fd1 = ad1 + ad2;
    Thought lo7 = Thought154.getInstance(fo0, fo1, fo0, fo1);
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    Thought lo8 = Thought3.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(lb1, lb5, fb0, fb1);
}
    double ld9 = 755.9151662835707;
    ld9 *= -1;
    boolean lb10 = true;

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
    ab1 = ab2 || ab3;
    boolean lb0 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    if (ab3) {
        if (ab4) {
            fb0 = fb1 || lb0;
}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought384.getInstance();
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    lb1 = fd1 < fd0;
    Thought lo2 = Thought146.getInstance(fb0, fb1, lb1, fb0);
    double ld3 = 215.64076557718286;
    fb1 = lb1 || fb0;
    fd0 = fd1 - ld3;
    for(int i0=0; i0<10; i0++){
        double ld4 = 350.4039538778492;
        fb1 = ld3 > fd0;
        Thought lo5 = Thought22.getInstance(ao2, ao3, ao4, fo0, fd1, ld4, ld3, fd0, lb1, fb0, fb1, lb1);
        boolean lb6 = true;
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
    double ld0 = 916.9088531050309;
    Thought lo1 = Thought207.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    Thought lo3 = Thought298.getInstance(ao2, ao3, ao4, fo0, fb1, lb2, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld0 = ad1 - ad2;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
    Output.points[1][7] -= ad4;
if(ao1 != null){
      fd0 = ao1.m3();
}
    double ld5 = 106.41667815736383;
    Output.points[1][8] -= fd0;
    double ld6 = 214.16112728434499;
if(ao2 != null){
      lb2 = ao2.m2(lb4, fb0, fb1, lb2);
}
    lb4 = fb0 || fb1;
    lb2 = fd0 < fd1;
    if (lb4) {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    double ld0 = 576.5368736516009;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought59.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    double ld2 = 937.4076631535274;
    boolean lb3 = true;
    lb3 = fd0 < fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo4 = Thought45.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ld2 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ld2, fd0, fd1, fb1, lb3, ab1, ab2);
}
    double ld5 = 779.0138911729086;
    ab3 = ld0 < ld2;

Thought.STACK_COUNTER++;
return ld5;
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
    ab1 = ab2 && ab3;
    Output.points[2][0] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ad1 > ad2;
    boolean lb1 = true;
    Thought lo2 = Thought155.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = lb0 && lb1;
    ab1 = fd0 > fd1;
if(ao1 != null){
      ad1 = ao1.m3();
}
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = ad1 < ad2;
    Thought lo3 = Thought83.getInstance(ad3, ad4, fd0, fd1);
    lb0 = lb1 && ab1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    if (fb0) {
        Output.points[2][1] -= fd1;
        boolean lb0 = false;
        fb0 = !fb1;
        Thought lo1 = Thought208.getInstance(lb0, fb0, fb1, lb0);
        fb0 = fd0 > fd1;
        fb1 = lb0 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought390.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    double ld1 = 760.5457834748727;
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld2 = 617.3258009451675;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1);
}
    ld1 = ld2 - fd0;
    Thought lo3 = Thought35.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld2, fd0);
if(fo0 != null){
      ab4 = fo0.m2();
}
    Output.points[2][2] += fd1;
    ld1 = ld2 + fd0;

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
    double ld0 = 940.1676088831773;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    double ld2 = 453.84326699882;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ld2 > ad1;
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
        fd1 = ld0 + ld2;
        Output.points[2][3] -= ad1;
        fb1 = lb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
        lb1 = fd1 < ld0;
        fb0 = ld2 > ad1;
        fb1 = ad2 > ad3;
        lb1 = ad4 < fd0;
        fb0 = fd1 > ld0;
        fb1 = ld2 < ad1;
        lb1 = !fb0;
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
    ab1 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        ab2 = ad4 > fd0;
        Thought lo0 = Thought338.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
        ab1 = fd1 > ad1;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m1(fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
        ab1 = ad2 > ad3;
        Thought lo2 = Thought119.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
        ad2 = ad3 + ad4;
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
    fd0 = fd1 - fd0;
    if (fb0) {
        fd1 *= -1;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
        double ld0 = 116.68640913456392;
        Thought lo1 = Thought385.getInstance(ld0, fd0, fd1, ld0);
        Output.points[2][4] -= fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
          ao1.m2();
}
        } else if (fb0) {
        fb1 = !fb0;
        double ld2 = 484.37124453635226;
        Output.points[2][5] -= ld2;
        Output.points[2][6] -= fd0;
        fb1 = fb0 || fb1;
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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 823.5519642125594;
    fb1 = ad2 > ad3;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    double ld2 = 701.2247726791313;
    fb0 = !fb1;

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
    ab2 = !ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
        fd0 = fd1 + fd0;
    double ld0 = 685.7350588751757;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
        fb0 = !fb1;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    lb1 = ab1 && ab2;
    double ld2 = 389.76696932967656;
    boolean lb3 = false;
    ab2 = !ab3;

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
    double ld0 = 647.4178097170594;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld0 *= -1;
    ad1 *= -1;
        ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        double ld1 = 397.4142755046943;
if(fo0 != null){
          ao4 = fo0.m4(ld1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        ab1 = ab2 && ab3;
        ad3 *= -1;
        for(int i0=0; i0<10; i0++){
            boolean lb2 = true;
            ad4 = fd0 - fd1;
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
            lb2 = !ab1;
            boolean lb3 = true;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            boolean lb4 = false;
}}
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
    lb0 = !fb0;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
        lb2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    lb2 = fd1 > fd0;
    boolean lb3 = false;
    lb3 = fd1 > fd0;
        fb0 = fb1 && lb0;
    boolean lb4 = false;
    double ld5 = 445.9261083062003;
    fd0 *= -1;
    fd1 *= -1;
    ld5 = fd0 - fd1;
    Output.points[2][7] -= ld5;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld5, fd0, lb1, lb2, lb3, lb4);
}
if(fo1 != null){
      fd1 = fo1.m3(ld5, fd0, fd1, ld5, fb0, fb1, lb0, lb1);
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
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
        double ld1 = 203.79508892716254;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    double ld2 = 346.7220335258239;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    Thought lo3 = Thought13.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fd1 > ld1;
    ld2 = fd0 + fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    ld2 = fd0 - fd1;
    ld1 = ld2 - fd0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 || fb0;
    fb1 = fd1 < fd0;
    lb0 = !lb1;

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
