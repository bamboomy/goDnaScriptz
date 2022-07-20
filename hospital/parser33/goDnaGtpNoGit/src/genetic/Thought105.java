package genetic;
import java.util.ArrayList;
class Thought105 extends Thought{
private static ArrayList<Thought105> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 463.5437145941572;
private double fd1 = 416.5721693501034;
private Thought fo0 = null;
private Thought fo1 = null;
Thought105 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought105 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought105 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought105 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought105 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought105 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought105 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought105 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought105 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought105 instance = new Thought105 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought105 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought105 instance = new Thought105 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought105 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought105 instance = new Thought105 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought105 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought105 instance = new Thought105 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought105 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought105 instance = new Thought105 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought105 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought105 instance = new Thought105 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought105 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought105 instance = new Thought105 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought105 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought105 instance = new Thought105 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        Thought lo1 = Thought236.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
        Thought lo2 = Thought181.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb3 = false;
if(fo1 != null){
          fo1.m2(fb0, fb1, lb3, lb0);
}
        fb0 = fb1 && lb3;
        boolean lb4 = true;
        boolean lb5 = false;
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
    ab2 = !ab3;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought266.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought202.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ab1 || ab2;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb2, ab1, ab2);
}
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
    fd1 *= -1;
    ab1 = fd0 < fd1;

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
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought220.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    boolean lb2 = true;
if(fo1 != null){
      ad2 = fo1.m3();
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(lb2, lb3, fb0, fb1);
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
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought138.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
    double ld2 = 888.0518538531073;
    Thought lo3 = Thought222.getInstance(fo1, fo0, fo1, fo0);
    Output.points[1][4] -= ld2;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
}
    ab1 = ad2 > ad3;
    Thought lo4 = Thought53.getInstance();
    boolean lb5 = true;
    ab1 = ab2 || ab3;

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
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    double ld1 = 937.6306447396526;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    double ld2 = 862.4456250201281;
    ld1 *= -1;
    Thought lo3 = Thought308.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ld2, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    lb0 = ld2 > fd0;
    if (fb0) {
        if (fb1) {
            fd1 *= -1;
            double ld4 = 882.8892213198153;
if(ao3 != null){
              lb0 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1);
}
            boolean lb5 = true;
            fb0 = !fb1;
            lb5 = lb0 || fb0;
if(ao1 != null){
              ao1.m2(ld4, ld1, ld2, fd0);
}
            fb1 = fd1 < ld4;
            for(int i0=0; i0<10; i0++){
                lb5 = ld1 > ld2;
}}}
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
    ad2 = ad3 - ad4;
    fd0 *= -1;
    double ld0 = 930.5067434931773;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 + fd0;
    double ld1 = 409.0228147155803;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld2 = 676.0632394332995;
    Thought lo3 = Thought57.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 && fb1;
    Output.points[1][5] -= ad4;
    boolean lb4 = true;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab3 = fd0 < fd1;
    Thought lo0 = Thought72.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought52.getInstance();
    Output.points[1][6] += fd0;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[1][7] -= fd1;
    Output.points[1][8] += fd0;

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
    Output.points[2][0] += ad2;
if(ao2 != null){
      ab2 = ao2.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[2][1] -= ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought76.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought366.getInstance(ao1, ao2, ao3, ao4);
    fd0 *= -1;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb2 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          ab1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
        Output.points[2][2] -= ad2;
        ab2 = !ab3;
        ab4 = !fb0;
        ad3 = ad4 + fd0;
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
    boolean lb0 = false;
    Output.points[2][3] += fd1;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
    Output.points[2][4] += fd0;
    boolean lb1 = true;
    lb0 = !lb1;
    boolean lb2 = true;
    lb2 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 + fd0;

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
    ab1 = fd1 > fd0;
    double ld0 = 830.4695818169719;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    Thought lo1 = Thought368.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
    ld0 = fd0 + fd1;
    ab4 = fb0 && fb1;
    double ld2 = 941.0793010641919;
if(fo0 != null){
      ab1 = fo0.m2(ld0, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ld0 = ld2 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    fd1 = ld0 + ld2;

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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
          ad4 = fo0.m3();
}
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;

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
    ab2 = !ab3;
    ab4 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
    ab3 = !ab4;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought393.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    Thought lo2 = Thought95.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);

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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought317.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    double ld0 = 341.94990145050923;
    ld0 = ad1 + ad2;
    double ld1 = 266.3364605729222;
    boolean lb2 = true;
    double ld3 = 6.942179086494191;
if(ao4 != null){
      ao4.m2(lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    Thought lo4 = Thought161.getInstance(fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
if(fo0 != null){
      ld3 = fo0.m3(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
}
    Output.points[2][5] -= ad1;
    boolean lb5 = true;
    boolean lb6 = true;
    lb5 = !lb6;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, ld0, ld1);
}
    boolean lb7 = true;
    boolean lb8 = true;
    ld3 = ad1 + ad2;

Thought.STACK_COUNTER++;
return lb7;
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
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought255.getInstance();
    Thought lo1 = Thought116.getInstance(ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought253.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
        Thought lo3 = Thought234.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m1(fb0, fb1, ab1, ab2);
}
    Output.points[2][6] += fd0;

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
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought140.getInstance(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = fd0 < fd1;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    fb0 = fd1 < ad1;
    Output.points[2][7] += ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    double ld1 = 517.2314430289525;
    boolean lb2 = false;
        fb0 = ld1 < ad1;
    Thought lo3 = Thought184.getInstance(fb1, lb2, ab1, ab2);

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
    Thought lo0 = Thought96.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[2][8] += fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought115.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = fd0 > fd1;
        boolean lb2 = false;
if(fo0 != null){
          lb2 = fo0.m2(fd0, fd1, fd0, fd1);
}
        fb0 = !fb1;
        Output.points[3][0] -= fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        lb2 = fd0 > fd1;
        fd0 = fd1 + fd0;
        double ld3 = 989.0574800753227;
        fb0 = fd0 > fd1;
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
      fo0 = fo1.m4();
}
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought359.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][1] += fd0;
    Output.points[3][2] += fd1;
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;

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
    fb0 = fb1 || lb0;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought320.getInstance(fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
    lb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    double ld2 = 972.920748696921;
    Output.points[3][3] -= ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ad3 = ad4 - fd0;
    fb1 = fd1 > ld2;
    double ld3 = 597.7140831769328;
    lb0 = ld3 > ad1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    Thought lo1 = Thought361.getInstance();
    boolean lb2 = true;
    double ld3 = 11.389176593320688;
    ad2 = ad3 - ad4;
    Output.points[3][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb0 = lb2 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 630.8061139062099;
if(ao1 != null){
      ao1.m1(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought57.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought314.getInstance(fo1, ao1, ao2, ao3);
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought265.getInstance(fd0, fd1, ld0, fd0);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao3.m2();
}
    ld0 *= -1;
    fd0 = fd1 - ld0;
    double ld4 = 205.4364468068585;
    Thought lo5 = Thought265.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo6 = Thought381.getInstance(ld4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = ld4 > fd0;
        double ld7 = 777.9826373269988;
    Thought lo8 = Thought236.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    lb0 = lb1 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought269.getInstance();
    double ld3 = 958.4550775922066;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3, fb1, lb0, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        double ld4 = 556.5067469672996;
if(ao3 != null){
          ao3.m2(ld4, ld3, ad1, ad2, fb1, lb0, lb1, fb0);
}
        boolean lb5 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb5, lb0);
}
        lb1 = ad3 < ad4;
        Output.points[3][5] -= fd0;
        fb0 = !fb1;
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
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
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 < fd0;
if(ao2 != null){
          ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        ab2 = fd0 > fd1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        boolean lb1 = true;
        Thought lo2 = Thought28.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
        ab1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb1, ab1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}
    Output.points[3][6] += fd0;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    ad4 = fd0 - fd1;
    Output.points[3][7] -= ad1;
    ad2 *= -1;
    boolean lb1 = true;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = ad3 > ad4;
if(ao4 != null){
      ao4.m2(lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
}
    ad1 *= -1;
    Thought lo3 = Thought32.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought194.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[3][8] += fd0;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    lb2 = lb3 && fb0;
    fb1 = lb1 || lb2;
if(fo0 != null){
      lb3 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb1;
    fd0 = fd1 + fd0;
    lb2 = fd1 > fd0;
    lb3 = !fb0;

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
    fd1 *= -1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    double ld1 = 981.1969187412118;
    lb0 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    ab4 = fd1 < ld1;
    fd0 = fd1 - ld1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3();
}
        fd1 = ld1 - fd0;
        Thought lo2 = Thought171.getInstance(fb0, fb1, lb0, ab1);
        Thought lo3 = Thought273.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
        fb1 = lb0 && ab1;
        ab2 = ab3 || ab4;
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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought384.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    lb1 = !fb0;
    boolean lb2 = false;
    fb0 = ad4 < fd0;
    double ld3 = 748.0354813253967;
if(fo1 != null){
      fo1.m3();
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
    ad2 *= -1;
    double ld1 = 794.4806265335351;
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo2 = Thought319.getInstance(ab2, ab3, ab4, fb0);
    double ld3 = 277.8322859128312;
    Thought lo4 = Thought193.getInstance(fo1, fo0, fo1, fo0, ld1, ld3, ad1, ad2, fb1, lb0, ab1, ab2);
    boolean lb5 = false;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[4][0] += ld1;
    fb1 = ld3 < ad1;
    Thought lo6 = Thought202.getInstance(fo0, fo1, fo0, fo1, lb0, lb5, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ad2 < ad3;
    ab4 = fb0 || fb1;
    lb0 = ad4 > fd0;
    Thought lo7 = Thought334.getInstance(fd1, ld1, ld3, ad1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb5 = fd1 > ld1;
    boolean lb8 = true;
if(fo1 != null){
      ld3 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(lb8, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;

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
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought154.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    double ld2 = 144.64270259958153;
    fb1 = !lb1;
    boolean lb3 = false;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
}
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            if (fb1) {
if(ao2 != null){
                  ao1 = ao2.m4();
}
if(ao3 != null){
                  lb1 = ao3.m2(lb3, fb0, fb1, lb1);
}
                lb3 = fd0 > fd1;
                Output.points[4][1] -= ld2;
                fb0 = fd0 < fd1;
                Thought lo4 = Thought4.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, fb1, lb1, lb3, fb0);
if(ao3 != null){
                  ao2 = ao3.m4(fd0, fd1, ld2, fd0, fb1, lb1, lb3, fb0);
}
if(ao4 != null){
                  fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb1, lb3, fb0);
}
}}}
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
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    Thought lo0 = Thought95.getInstance(ao2, ao3, ao4, fo0);
    ad4 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    boolean lb1 = true;
    fd1 = ad1 - ad2;
    Thought lo2 = Thought379.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m3();
}
    boolean lb3 = false;
    boolean lb4 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought159.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought53.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    double ld2 = 662.5827483731745;
    if (ab1) {
        ab2 = ab3 && ab4;
        Output.points[4][2] -= fd0;
        Output.points[4][3] -= fd1;
        ld2 *= -1;
        fd0 = fd1 - ld2;
        boolean lb3 = false;
        Thought lo4 = Thought363.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb3);
        ab1 = fd0 > fd1;
        ab2 = ld2 > fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    Output.points[4][4] += ad1;
    boolean lb0 = true;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        ab3 = ad3 < ad4;
        boolean lb1 = false;
        fd0 *= -1;
        fd1 = ad1 - ad2;
        Thought lo2 = Thought265.getInstance(ao1, ao2, ao3, ao4);
        ad3 = ad4 + fd0;
        Output.points[4][5] -= fd1;
        Output.points[4][6] -= ad1;
        ab3 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        ab4 = fb0 && fb1;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[4][7] -= fd1;
    Output.points[4][8] -= fd0;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    double ld1 = 82.93876909937498;
    Output.points[5][0] -= fd0;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    lb0 = fd1 < ld1;
    Output.points[5][1] -= fd0;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 || fb0;
    Output.points[5][2] -= ld1;
    fb1 = !lb0;
    lb2 = !fb0;
    fb1 = lb0 || lb2;
    fd0 = fd1 - ld1;

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
    double ld0 = 729.4744423096183;
        fd0 *= -1;
    Thought lo1 = Thought210.getInstance(fo0, fo1, fo0, fo1);
    double ld2 = 575.9374474161181;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld2, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1);
}
    double ld3 = 932.953392303853;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = ld2 - ld3;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ld3, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    Thought lo4 = Thought177.getInstance(ld2, ld3, fd0, fd1, fb0, fb1, fb0, fb1);

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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 378.84343087090133;
    boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    lb1 = lb2 || fb0;
    double ld3 = 372.4384676420097;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld0);
}
    fb1 = !lb1;
    double ld4 = 26.89703600207893;
    ld3 = ld4 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld3, ld4);
}
    boolean lb5 = false;
    double ld6 = 222.84477198640727;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb5, fb0, fb1);
}
    boolean lb7 = false;
    double ld8 = 626.9287407815325;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ld6, ld8, fd0, fd1, lb2, lb5, lb7, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, ld4, ld6, fb1, lb1, lb2, lb5);
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
