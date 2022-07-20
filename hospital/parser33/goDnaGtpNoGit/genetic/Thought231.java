package genetic;
import java.util.ArrayList;
class Thought231 extends Thought{
private static ArrayList<Thought231> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 969.6052174349572;
private double fd1 = 549.5600670905438;
private Thought fo0 = null;
private Thought fo1 = null;
Thought231 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought231 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought231 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought231 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought231 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought231 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought231 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought231 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought231 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought231 instance = new Thought231 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought231 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought231 instance = new Thought231 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought231 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought231 instance = new Thought231 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought231 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought231 instance = new Thought231 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought231 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought231 instance = new Thought231 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought231 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought231 instance = new Thought231 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought231 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought231 instance = new Thought231 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought231 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought231 instance = new Thought231 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 219.75995948825826;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought214.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought4.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd1 < ld0;
    Thought lo3 = Thought369.getInstance(fd0, fd1, ld0, fd0);

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
    ab2 = ab3 || ab4;
    Thought lo0 = Thought278.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    Thought lo2 = Thought106.getInstance(fb1, lb1, ab1, ab2);
    ab3 = ab4 && fb0;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Thought lo0 = Thought170.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought44.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    lb1 = fb0 || fb1;
    fd1 *= -1;
    Thought lo3 = Thought266.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3();
}
    if (lb1) {
        fd1 *= -1;
        fb0 = ad1 < ad2;
        ad3 = ad4 - fd0;
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
    ab1 = !ab2;
    ab3 = ad2 < ad3;
    Thought lo0 = Thought90.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad2 < ad3;
        ad4 = fd0 + fd1;
        boolean lb1 = false;
        boolean lb2 = false;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        boolean lb3 = true;
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        lb1 = ad4 > fd0;
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        }
    Thought lo5 = Thought25.getInstance();
    ab2 = !ab3;
    if (ab4) {
        Thought lo6 = Thought102.getInstance(fb0, fb1, ab1, ab2);
        ab3 = ab4 && fb0;
        ad2 = ad3 + ad4;
        fd0 = fd1 - ad1;
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
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    Thought lo1 = Thought156.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    double ld3 = 491.5686577672578;
        Thought lo4 = Thought129.getInstance();
    fd0 = fd1 + ld3;
    boolean lb5 = false;
    lb2 = lb5 && fb0;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    ad1 *= -1;
if(ao4 != null){
      ao4.m1(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    fb1 = ad3 < ad4;
    double ld1 = 194.0483089371578;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld1, ad1);
}
    ad2 *= -1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    lb0 = lb2 || fb0;
    fb1 = ld1 > ad1;
    boolean lb3 = false;

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
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
        ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought169.getInstance();
    double ld2 = 758.1965398676042;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + ld2;
    double ld3 = 384.21365719625936;

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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought89.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ab4 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && lb1;
    ab1 = ab2 || ab3;
    Thought lo2 = Thought9.getInstance(fd1, ad1, ad2, ad3);
    ab4 = fb0 || fb1;
    lb1 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab3 = ab4 || fb0;
    boolean lb3 = true;
    fb0 = fb1 || lb1;
    Output.points[3][2] += ad2;
if(ao1 != null){
      lb3 = ao1.m2();
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    double ld4 = 178.94700043823346;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld4, fb0, fb1, lb1, lb3);
}
if(ao3 != null){
      ao3.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought30.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 610.3038746822033;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
        fb1 = fd1 < ld2;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
        fd0 *= -1;
        fd1 = ld2 - fd0;
        fb1 = lb0 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
        boolean lb3 = true;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb3);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
        lb4 = lb0 && fb0;
        fb1 = lb3 && lb4;
        fd1 = ld2 - fd0;
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
        ab4 = fb0 || fb1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = true;
    ab4 = !fb0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    ad3 *= -1;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = ad1 - ad2;
    boolean lb0 = false;
    double ld1 = 573.5662248330499;
    fb0 = !fb1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fd1, ld1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought17.getInstance(fo0, fo1, fo0, fo1);
        Output.points[3][3] -= ad3;
    ad4 *= -1;
    fd0 *= -1;
    Thought lo3 = Thought6.getInstance(fd1, ld1, ad1, ad2);
    lb0 = !fb0;
    ad3 = ad4 - fd0;

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1();
}
    Thought lo0 = Thought335.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought308.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
        fb0 = fb1 && ab1;
        ab2 = !ab3;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        ab3 = ab4 || fb0;
        }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2();
}
    ab1 = ad2 < ad3;
    Output.points[3][4] += ad4;
    boolean lb3 = false;
    Thought lo4 = Thought134.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb2, lb3, ab1, ab2);
}
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ad1 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[3][5] += fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
    boolean lb2 = true;
    Output.points[3][6] -= fd1;

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
if(ao2 != null){
      ao2.m3();
}
        double ld0 = 104.03262034468412;
    ld0 *= -1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought2.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
    fb1 = lb1 || fb0;

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
    Output.points[3][7] -= fd1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 < fd0;
    double ld0 = 390.54598091191025;
    fb0 = fb1 || ab1;
    ab2 = fd0 > fd1;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      ab4 = ao1.m2();
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
if(ao2 != null){
          ao2.m1(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
        double ld1 = 522.1870019149237;
        ld1 = ld0 + fd0;
if(ao3 != null){
          fd1 = ao3.m3(ld1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
        Thought lo2 = Thought348.getInstance(ao4, fo0, fo1, ao1);
        ld1 *= -1;
        Output.points[3][8] += ld0;
        ab3 = fd0 < fd1;
        ab4 = ld1 < ld0;
        Output.points[4][0] += fd0;
        fb0 = fd1 > ld1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ab1 = ab2 && ab3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    ad1 *= -1;
    double ld1 = 299.15161813659716;
    ab3 = ab4 && fb0;
    fb1 = ad1 > ad2;
    double ld2 = 406.23631217710965;
    lb0 = !ab1;
    boolean lb3 = false;

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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    if (lb2) {
        } else {
        if (fb0) {
            fb1 = lb0 && lb1;
            lb2 = fd0 < fd1;
            Output.points[4][1] += fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
            if (fb0) {
                fb1 = fd1 < fd0;
if(fo1 != null){
                  fo0 = fo1.m4();
}
}}}
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
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        fd1 = fd0 + fd1;
        fd0 *= -1;
        ab1 = fd1 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb1 = true;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0);
}
        double ld2 = 193.1591097928727;
        double ld3 = 787.2954064500351;
        double ld4 = 484.81759989551284;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld3, ld4, fd0, fd1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 892.5438130991103;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought77.getInstance();
    fb1 = ld0 > ad1;
    ad2 = ad3 + ad4;
        double ld2 = 213.97176324454418;
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    boolean lb3 = true;
    Thought lo4 = Thought39.getInstance(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2, fb0, fb1, lb3, fb0);
    fb1 = lb3 || fb0;
    double ld5 = 344.9888256473839;
    Thought lo6 = Thought106.getInstance(ad2, ad3, ad4, fd0, fb1, lb3, fb0, fb1);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 426.443828656226;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    fd1 *= -1;
    ld1 = ad1 - ad2;
    Thought lo4 = Thought140.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);

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
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought135.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought189.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
    Output.points[4][2] += fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought381.getInstance();
        fd1 = ad1 + ad2;
        double ld1 = 695.7277112543777;
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought7.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        fb0 = fd1 > ld1;
if(fo0 != null){
          ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        double ld3 = 141.37449652077603;
        fb1 = fb0 || fb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
              fo1 = ao1.m4(ad4, fd0, fd1, ld1);
}
            fb0 = !fb1;
            fb0 = ld3 > ad1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
        fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
if(ao3 != null){
      fd1 = ao3.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld1 = 191.78640514271572;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
if(ao3 != null){
      lb0 = ao3.m2(ld1, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
}
    fd0 = fd1 - ld1;

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
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    Thought lo0 = Thought241.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
          ao2.m2();
}
    fb0 = fb1 && ab1;
    boolean lb1 = true;
if(ao3 != null){
      ad3 = ao3.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[4][3] -= ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
    ab3 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld2 = 7.096680821941779;
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld2, ad1);
}
    Output.points[4][4] += ad2;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Output.points[4][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought159.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
          fd1 = fo1.m3(lb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    lb1 = lb2 && lb3;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;

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
    boolean lb0 = false;
    double ld1 = 199.66405475952004;
    lb0 = ab1 && ab2;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 < ld1;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    Thought lo2 = Thought363.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;

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
    Thought lo0 = Thought82.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb2 = true;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[4][6] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 && fb0;
    Output.points[4][7] += fd1;
    fb1 = lb1 || lb2;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, lb1, lb2, fb0);
}
    fb1 = !lb1;
    lb2 = fb0 && fb1;
    lb1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 *= -1;

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
    Output.points[4][8] += ad2;
    ab2 = !ab3;
    double ld0 = 298.2005254514994;
    ad2 = ad3 + ad4;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    boolean lb1 = false;
    ab3 = ad2 < ad3;
    ab4 = fb0 || fb1;

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
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Thought lo1 = Thought216.getInstance();
if(ao1 != null){
      fd1 = ao1.m3(lb0, fb0, fb1, lb0);
}
    Output.points[5][0] -= fd0;
    boolean lb2 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;
    boolean lb4 = true;

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
    ad1 = ad2 - ad3;
    fb1 = !fb0;
    Output.points[5][1] -= ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought104.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 + fd1;
    Thought lo1 = Thought321.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    Output.points[5][2] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;

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
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    ab1 = !ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    double ld1 = 585.7219718979636;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad3 *= -1;
    Output.points[5][3] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    Thought lo2 = Thought64.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb0);
    ad2 = ad3 - ad4;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ad3 < ad4;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, ld1, ad1);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ld1 = ad1 + ad2;

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
      fo1 = fo0.m4();
}
    fd1 *= -1;
        fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Output.points[5][4] += fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 137.10145743003977;

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
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    Output.points[5][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    lb0 = !fb0;
    double ld1 = 253.87668643662005;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
    fd0 = fd1 - ld1;
        fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld2 = 308.0253364032396;
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fb0 = fd0 < fd1;
    ld1 = ld2 - fd0;

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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    Output.points[5][6] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 408.1352332296887;
    Thought lo2 = Thought271.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
    lb0 = !fb0;
    fb1 = fd1 < ld1;
if(fo0 != null){
      fo0.m2();
}
    lb0 = fb0 || fb1;
    double ld3 = 132.07312502961156;
    ld3 *= -1;
    Thought lo4 = Thought95.getInstance(lb0, fb0, fb1, lb0);
    boolean lb5 = true;

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
