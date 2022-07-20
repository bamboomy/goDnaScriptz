package genetic;
import java.util.ArrayList;
class Thought46 extends Thought{
private static ArrayList<Thought46> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 0.5080907635059471;
private double fd1 = 477.4401583681411;
private Thought fo0 = null;
private Thought fo1 = null;
Thought46 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought46 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought46 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought46 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought46 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought46 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought46 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought46 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought46 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought46 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought46 instance = new Thought46 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
          fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld1 = 124.5685666198045;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    ld1 *= -1;
    Thought lo2 = Thought370.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo1.m3(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, lb3, lb0, fb0, fb1);
}
        double ld4 = 279.6837312490712;
        ld1 = fd0 + fd1;
        ld4 = ld1 - fd0;
        boolean lb5 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb6 = false;
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
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought381.getInstance();
    ab3 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    double ld0 = 626.4174305714137;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought237.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
    Thought lo3 = Thought71.getInstance(fd1, ld0, ad1, ad2, lb1, fb0, fb1, lb1);
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + ad1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    lb1 = !lb4;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
        ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
    double ld0 = 949.8664895402059;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    ld0 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    double ld1 = 552.3818847292388;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        Thought lo2 = Thought175.getInstance(fd0, fd1, ld0, ld1, ab4, fb0, fb1, ab1);
        }
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought399.getInstance(fo0, fo1, fo0, fo1);
    Output.points[2][2] += ad1;
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
}
if(fo0 != null){
          ab4 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;

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
    Output.points[2][3] -= fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        if (lb0) {
        fb0 = fd1 > fd0;
        fb1 = lb0 || fb0;
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
    Thought lo0 = Thought61.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
        boolean lb1 = false;
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought49.getInstance(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
    boolean lb3 = true;
    lb1 = !lb3;
    if (fb0) {
        boolean lb4 = false;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb4, lb1, lb3);
}
        fb0 = fb1 || lb4;
        lb1 = fd0 < fd1;
if(ao2 != null){
          lb3 = ao2.m2(ao3, ao4, fo0, fo1);
}
        ad1 = ad2 - ad3;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
        fb0 = ad2 > ad3;
        Thought lo5 = Thought202.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
        boolean lb6 = true;
        ad2 *= -1;
        double ld7 = 380.02702044025705;
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
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m1();
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
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
    Output.points[2][4] -= ad4;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    Output.points[2][5] += ad1;
    Thought lo0 = Thought299.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m2();
}
        Thought lo1 = Thought105.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
    ab4 = ad2 < ad3;
    boolean lb3 = true;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
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
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[2][6] -= fd1;
    fb0 = fb1 && lb0;
    Output.points[2][7] += fd0;
    fd1 *= -1;
    fb0 = fb1 || lb0;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld1 = 638.5322419164462;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[2][8] -= fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;

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
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ad4 > fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought365.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < ad1;
    Thought lo3 = Thought16.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought169.getInstance(ad4, fd0, fd1, ad1);
    lb1 = fb0 || fb1;
    lb0 = ad2 > ad3;

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
    ab1 = !ab2;
    ad2 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
    fb1 = ad1 > ad2;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
        ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ad1;
    Thought lo0 = Thought319.getInstance(ad2, ad3, ad4, fd0);

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
    fb0 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought265.getInstance();
    Output.points[3][0] += fd0;
    Output.points[3][1] += fd1;
    Output.points[3][2] -= fd0;
    fb1 = fd1 < fd0;
    boolean lb1 = false;
    lb1 = fd1 < fd0;
    fb0 = !fb1;
    lb1 = fd1 > fd0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    double ld3 = 233.0596601593224;
    lb2 = ld3 < fd0;
    double ld4 = 345.58379697432804;
    Output.points[3][3] += fd0;
    fd1 = ld3 + ld4;
    Output.points[3][4] += fd0;
    Thought lo5 = Thought371.getInstance(fb0, fb1, lb1, lb2);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld3, ld4, fd0, fb0, fb1, lb1, lb2);
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
    Output.points[3][5] += ad2;
    Thought lo0 = Thought215.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 828.3601311962295;
    Thought lo2 = Thought100.getInstance(fo1, ao1, ao2, ao3);
    boolean lb3 = true;
    double ld4 = 209.02782757077946;
if(fo0 != null){
      ao4 = fo0.m4(ld1, ld4, ad1, ad2);
}
    Thought lo5 = Thought57.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
    boolean lb6 = true;
    boolean lb7 = false;
    Thought lo8 = Thought6.getInstance();
    Thought lo9 = Thought99.getInstance(lb6, lb7, fb0, fb1);
    boolean lb10 = true;
    Thought lo11 = Thought321.getInstance(ao4, fo0, fo1, ao1, ld1, ld4, ad1, ad2, lb3, lb6, lb7, lb10);

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
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    boolean lb1 = true;
    lb0 = !lb1;
    Output.points[3][6] -= fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Output.points[3][7] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[3][8] += fd0;
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    lb1 = ab1 || ab2;
    ab3 = fd1 > fd0;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4();
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
    ab1 = !ab2;
if(ao2 != null){
      ad2 = ao2.m3(ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    double ld0 = 230.00740230293738;
    double ld1 = 868.5087862567733;
    Thought lo2 = Thought184.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ld1, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ad1 = ao2.m3();
}
    ad2 *= -1;
    Thought lo3 = Thought191.getInstance(fb0, fb1, ab1, ab2);
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Output.points[4][0] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao4.m3(fd0, fd1, ld0, ld1);
}
    ad1 *= -1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}
    fb1 = ld1 < ad1;
if(fo0 != null){
      ao4 = fo0.m4();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    double ld0 = 211.7328954501715;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought390.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
    Thought lo2 = Thought204.getInstance(ld0, fd0, fd1, ld0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
        fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    ld0 = fd0 + fd1;
    Thought lo3 = Thought360.getInstance();
    fb1 = ld0 > fd0;

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
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    double ld0 = 393.12401202865544;
    ld0 *= -1;
        Output.points[4][1] += fd0;
    ab2 = fd1 < ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld1 = 77.84978598094872;
    ld0 *= -1;
    Output.points[4][2] += ld1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;

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
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    Thought lo0 = Thought11.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    boolean lb1 = false;
    ad4 = fd0 - fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    double ld2 = 650.6177698007596;
    ld2 *= -1;
    Output.points[4][3] -= ad1;
    double ld3 = 531.8137877537084;
    boolean lb4 = true;
    lb4 = ad1 > ad2;
    Thought lo5 = Thought144.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    Output.points[4][4] += ld2;
    ld3 = ad1 - ad2;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, lb1, lb4, ab1);
}
    double ld6 = 57.84934303166474;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ld2 = ld3 + ld6;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(ao4 != null){
      lb0 = ao4.m2(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[4][5] -= fd0;
    Output.points[4][6] -= fd1;
        Thought lo1 = Thought386.getInstance(ao4, fo0, fo1, ao1);
    lb0 = fb0 && fb1;
    boolean lb2 = false;
    double ld3 = 192.31057399697735;

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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0);
}
    lb0 = fd1 > ad1;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    Thought lo2 = Thought38.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought366.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
    fb0 = fd0 > fd1;
    ad1 = ad2 - ad3;
    double ld4 = 817.1717394397525;
        ad3 = ad4 + fd0;
    fb1 = lb0 && lb1;
    fb0 = fd1 > ld4;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
    Thought lo5 = Thought40.getInstance(ao2, ao3, ao4, fo0);
    boolean lb6 = true;
    Output.points[4][7] -= fd1;
    fb0 = fb1 && lb0;
    lb1 = lb6 && fb0;
    ld4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3();
}
    fd1 *= -1;
    double ld0 = 819.1228954764065;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    ld0 = fd0 + fd1;
    Thought lo2 = Thought398.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 *= -1;
    Thought lo3 = Thought256.getInstance(ao2, ao3, ao4, fo0, fb1, lb1, ab1, ab2);
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo4 = Thought4.getInstance(fd1, ld0, fd0, fd1);
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1();
}
    boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4(lb1, lb5, ab1, ab2);
}
    Thought lo6 = Thought259.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
    fd1 = ld0 + fd0;
    Output.points[4][8] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0, lb1, lb5, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb7 = true;
        fd1 = ld0 + fd0;
        fd1 = ld0 - fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
    ab2 = !ab3;
    ad4 *= -1;
    fd0 *= -1;
    ab4 = fb0 && fb1;
    Output.points[5][0] += fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = ad4 > fd0;
        fd1 = ad1 + ad2;
    double ld2 = 247.241778100476;
    lb1 = ab1 && ab2;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld2, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        ad3 = ad4 - fd0;
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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    boolean lb0 = false;
    double ld1 = 570.399196598968;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb1 = lb0 || fb0;
    double ld2 = 828.1558208656714;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld2 = fd0 - fd1;
if(fo0 != null){
          fo0.m1(lb0, fb0, fb1, lb0);
}
        ld1 *= -1;
        Thought lo3 = Thought245.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
        fb1 = !lb0;
if(fo1 != null){
          fo1.m1(ld2, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb4, lb0);
}
        Thought lo5 = Thought177.getInstance(fo0, fo1, fo0, fo1);
        Output.points[5][1] -= ld2;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ld1, ld2);
}
        fb1 = lb4 || lb0;
        boolean lb6 = false;
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
    double ld0 = 59.86701025629596;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    ab2 = ab3 || ab4;
    boolean lb1 = true;
    ab4 = fd1 < ld0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m1();
}
    boolean lb2 = true;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    double ld1 = 566.653858403339;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
    ad2 = ad3 + ad4;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought201.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ad1 < ad2;
    ab4 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    double ld1 = 704.4479107259331;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ld1;
    fb1 = ab1 && ab2;
        Output.points[5][2] -= ad1;
        ad2 *= -1;
    double ld2 = 300.3640931520409;
    boolean lb3 = true;
    boolean lb4 = false;
if(fo0 != null){
          ab1 = fo0.m2();
}
    ab2 = ab3 || ab4;

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
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[5][3] += fd0;
    if (fb1) {
        fb0 = fd1 < fd0;
        fd1 *= -1;
        fb1 = fb0 && fb1;
        fb0 = fd0 < fd1;
        fb1 = fb0 || fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought387.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fb0 = fd1 < fd0;
        boolean lb1 = true;
        fb0 = fb1 && lb1;
        fd1 = fd0 + fd1;
        fb0 = fd0 > fd1;
        fb1 = !lb1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
        fd0 *= -1;
        fd1 = fd0 - fd1;
        Thought lo2 = Thought188.getInstance();
        double ld3 = 715.4836404157709;
        ld3 = fd0 - fd1;
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
    ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought122.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    fb0 = ad2 > ad3;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld1 = 382.5703220531815;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fd1 < fd0;
    fb1 = ab1 && ab2;
    fd1 *= -1;
    Thought lo0 = Thought10.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    if (ab2) {
        fd1 *= -1;
if(ao2 != null){
          fd0 = ao2.m3();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ab2, ab3, ab4, fb0);
}
    double ld0 = 662.4161506042232;
    boolean lb1 = true;
    fb0 = ad2 > ad3;
    fb1 = lb1 || ab1;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
    fd0 *= -1;
    fd1 *= -1;
        ab4 = !fb0;
    double ld2 = 125.30290035728864;
    ld0 = ld2 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;

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
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
        fb0 = !fb1;
    double ld0 = 633.9497916361843;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld1 = 485.7071501220722;
    fb0 = ld1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld0, ld1, fd0);
}
    fb0 = fb1 || fb0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought59.getInstance();
    Thought lo1 = Thought380.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought357.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    Thought lo4 = Thought42.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
        fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb2 = fd1 < fd0;
    double ld5 = 254.67225669648732;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    fb0 = fb1 || lb2;
    fb0 = ld5 > fd0;
    double ld6 = 659.5369521058925;
    boolean lb7 = false;
    double ld8 = 749.20916136273;

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
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        double ld2 = 842.5665669569388;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought345.getInstance(fd0, fd1, ld2, fd0);
    double ld4 = 433.56426605761266;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld4);
}
    lb0 = fd0 < fd1;
    ld2 *= -1;
if(fo0 != null){
      ld4 = fo0.m3();
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
