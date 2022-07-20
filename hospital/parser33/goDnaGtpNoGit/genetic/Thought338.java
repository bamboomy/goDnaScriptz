package genetic;
import java.util.ArrayList;
class Thought338 extends Thought{
private static ArrayList<Thought338> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 844.540537090077;
private double fd1 = 647.0393882703954;
private Thought fo0 = null;
private Thought fo1 = null;
Thought338 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought338 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought338 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought338 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought338 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought338 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought338 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought338 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought338 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought338 instance = new Thought338 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought338 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought338 instance = new Thought338 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought338 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought338 instance = new Thought338 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought338 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought338 instance = new Thought338 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought338 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought338 instance = new Thought338 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought338 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought338 instance = new Thought338 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought338 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought338 instance = new Thought338 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought338 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought338 instance = new Thought338 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought138.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought109.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    lb2 = fb0 || fb1;
    fd0 = fd1 - fd0;
    lb2 = fd1 > fd0;

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
    Thought lo0 = Thought104.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab2 = fd1 < fd0;
    Output.points[1][6] -= fd1;
    double ld1 = 905.8423452526678;
    Thought lo2 = Thought69.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    double ld3 = 550.8431557042553;
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld1, ld3, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = ld1 - ld3;

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
    lb0 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = ad2 < ad3;
    fb0 = !fb1;
    Thought lo1 = Thought278.getInstance(ad4, fd0, fd1, ad1);
    lb0 = fb0 && fb1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;

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
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        }
    Thought lo0 = Thought222.getInstance(fb1, ab1, ab2, ab3);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    for(int i1=0; i1<10; i1++){
        Thought lo1 = Thought186.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
        ab4 = fb0 || fb1;
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
    fd1 *= -1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        fb1 = fb0 || fb1;
        fb0 = fd1 < fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought130.getInstance();
        boolean lb1 = true;
        fd1 = fd0 - fd1;
        }
    fd0 *= -1;
    Thought lo2 = Thought151.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb3, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao1 != null){
      fd0 = ao1.m3();
}
    lb0 = fd1 > ad1;
    double ld1 = 18.377844614961486;
    Thought lo2 = Thought108.getInstance(fb0, fb1, lb0, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought9.getInstance(fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
    boolean lb4 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb4, fb0, fb1, lb0);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb4 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    fb1 = fd0 < fd1;
if(ao1 != null){
          ao1.m2(lb0, lb4, fb0, fb1);
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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought28.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    double ld1 = 920.2962459063423;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld2 = 785.3005450162806;
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab3 = ao1.m2(fd0, fd1, ld1, ld2);
}
    boolean lb3 = true;
    Output.points[1][7] -= fd0;
        ab3 = ab4 || fb0;
    fb1 = lb3 || ab1;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ld2, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld1 = ld2 + fd0;
    fd1 *= -1;
    boolean lb4 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb3);
}
    Output.points[1][8] += ld1;
    ld2 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld2, fd0, fd1, lb4, ab1, ab2, ab3);
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
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought333.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought236.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought110.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && lb0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || fb0;
    fd1 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought179.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    boolean lb4 = true;
    lb0 = fd0 < fd1;

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
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab4 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[2][0] += fd1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought249.getInstance(fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    ab2 = !ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (ab4) {
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > fd0;
        Thought lo1 = Thought137.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    double ld1 = 307.75521706264885;
    ad2 = ad3 + ad4;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[2][1] += ad1;
    ab1 = ad2 > ad3;
        for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
if(fo1 != null){
          fo1.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        boolean lb0 = true;
        ab3 = ab4 && fb0;
        fb1 = fd1 > ad1;
        ad2 *= -1;
        ad3 = ad4 - fd0;
        Thought lo1 = Thought200.getInstance();
        double ld2 = 259.0704658265562;
        double ld3 = 520.1898397177363;
        Output.points[2][2] += ad4;
if(fo1 != null){
          fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, ab4, fb0, fb1, lb0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][3] += fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
        if (fb1) {
        fb0 = !fb1;
        boolean lb0 = true;
        Thought lo1 = Thought262.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
        fd0 = fd1 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb2 = true;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb3 = true;
        boolean lb4 = false;
if(ao2 != null){
          ao1 = ao2.m4();
}
        } else {
        fd0 *= -1;
        fb1 = !fb0;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
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
    Thought lo0 = Thought164.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ad1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[2][4] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(ao2 != null){
      ao2.m3();
}
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    double ld3 = 435.56750803275537;
if(ao3 != null){
      ld3 = ao3.m3(lb1, lb2, fb0, fb1);
}
    lb1 = ad1 > ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb1);
}
    ld3 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao4.m3(fd1, ld3, ad1, ad2, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb1);
}
    ad3 = ad4 - fd0;
    boolean lb4 = true;
    fd1 = ld3 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb5 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ab1 = ao3.m2();
}
    fd0 *= -1;
        fd1 *= -1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought222.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
    Output.points[2][5] -= fd0;
    Thought lo2 = Thought6.getInstance(fo1, ao1, ao2, ao3);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Output.points[2][6] -= fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    if (ab3) {
        fd0 = fd1 - fd0;
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = fd0 + fd1;
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
    ab2 = ad1 < ad2;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
if(ao1 != null){
          ao1.m1(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    Thought lo1 = Thought102.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 + ad1;
    ab1 = ab2 || ab3;
    Output.points[2][7] += ad2;
    ab4 = fb0 || fb1;
    Thought lo2 = Thought83.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3();
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought135.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    Output.points[2][8] += fd1;
    fd0 *= -1;
    Thought lo2 = Thought3.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought352.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;

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
    Output.points[3][0] += fd1;
    Output.points[3][1] += fd0;
    boolean lb0 = false;
    Thought lo1 = Thought223.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo2 = Thought291.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || lb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought286.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
        for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
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
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    fb0 = fd1 < ad1;
    Output.points[3][2] -= ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
    boolean lb0 = false;
    fb0 = ad4 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[3][3] += fd1;

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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought291.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 527.1521078661705;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, ad1);
}
    Thought lo2 = Thought204.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
        if (ab4) {
if(fo1 != null){
              fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
            Output.points[3][4] += ld1;
            Output.points[3][5] += ad1;
            ab3 = ab4 || fb0;
}}
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought115.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(ao3 != null){
      lb1 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0);
}
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought250.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
if(ao3 != null){
      lb1 = ao3.m2();
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought214.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    Thought lo0 = Thought129.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought259.getInstance(fb1, fb0, fb1, fb0);
    Thought lo2 = Thought75.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 = ad1 - ad2;
    fb1 = fb0 && fb1;
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought353.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
    fd1 *= -1;
    Thought lo1 = Thought118.getInstance(fd0, fd1, fd0, fd1);
    ab3 = !ab4;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought296.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;

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
    boolean lb0 = false;
    ab1 = !ab2;
    ab3 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    double ld1 = 604.911585450954;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ld1 = ao4.m3(ab4, fb0, fb1, lb0);
}
    ab1 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        ab2 = ad3 > ad4;
        ab3 = ab4 || fb0;
        fb1 = fd0 > fd1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        ad4 *= -1;
        fd0 = fd1 - ld1;
        fb0 = fb1 || lb0;
        double ld2 = 358.5239670272575;
        ld1 = ad1 + ad2;
if(ao4 != null){
          ad3 = ao4.m3(ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
        ld1 = ad1 + ad2;
        Output.points[3][6] += ad3;
        ad4 *= -1;
        fb0 = fb1 || lb0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought321.getInstance(fd1, fd0, fd1, fd0);
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    if (fb0) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        boolean lb1 = true;
        lb1 = fd1 < fd0;
        Thought lo2 = Thought334.getInstance(fb0, fb1, lb1, fb0);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
        fb0 = fd0 < fd1;
        Output.points[3][7] -= fd0;
        Thought lo3 = Thought302.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
        lb1 = fd1 > fd0;
        fd1 *= -1;
        fb0 = !fb1;
        double ld4 = 149.49268632851417;
        lb1 = fb0 || fb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          lb1 = fo1.m2(ld4, fd0, fd1, ld4);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought98.getInstance();
    boolean lb1 = true;
    Thought lo2 = Thought111.getInstance(ab1, ab2, ab3, ab4);
    Thought lo3 = Thought122.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld4 = 948.3279447982098;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld4, fd0, fd1);
}
    ab4 = ld4 < fd0;
    double ld5 = 982.6056543362371;
    fb0 = !fb1;
    boolean lb6 = true;
    fd0 = fd1 + ld4;
    ld5 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ld5, fd0, fd1);
}
    ld4 *= -1;
    ld5 = fd0 - fd1;
if(fo1 != null){
      ld4 = fo1.m3();
}
if(fo0 != null){
      ld5 = fo0.m3(lb1, lb6, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld5, fb1, lb1, lb6, ab1);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 + ld4;
if(fo0 != null){
      fo1 = fo0.m4(ld5, fd0, fd1, ld4, fb0, fb1, lb1, lb6);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 710.7226956459432;
    ld0 = ad1 - ad2;
    double ld1 = 777.3610553663449;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, ld0, ld1, ad1, fb1, fb0, fb1, fb0);
}
    double ld2 = 415.8638275598999;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb3 = true;
        if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
        ld2 *= -1;
if(fo0 != null){
          fb1 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(lb3, fb0, fb1, lb3);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(ld0, ld1, ld2, ad1, fb1, lb3, fb0, fb1);
}
        Thought lo4 = Thought399.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
        boolean lb5 = true;
        double ld6 = 380.5799882160999;
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 || ab3;
    Thought lo1 = Thought338.getInstance();
    ab4 = ad3 > ad4;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought216.getInstance(fb1, lb0, ab1, ab2);
    Thought lo3 = Thought235.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ab1 = ad4 > fd0;
    double ld4 = 978.7180787754276;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, ld4, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
}
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
        ab2 = fd0 < fd1;
        ld4 *= -1;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        Thought lo5 = Thought303.getInstance(fd0, fd1, ld4, ad1, fb1, lb0, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 662.4087032356563;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld0 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    double ld1 = 523.5571033210291;
    Output.points[3][8] -= ld0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ld1 = ao4.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 42.0847343852729;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
    ld1 *= -1;
    Thought lo2 = Thought259.getInstance(ao3, ao4, fo0, fo1);
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
    ld1 *= -1;

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
    ab1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought72.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 > fd0;
    Thought lo1 = Thought226.getInstance();
    ab1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
        fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[4][0] += ad1;
    Output.points[4][1] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[4][2] -= ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
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
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought106.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld1 = 679.9540468353846;
    fb0 = fb1 || fb0;
    Output.points[4][3] -= ld1;
    boolean lb2 = false;
    double ld3 = 195.63638160050158;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
    boolean lb4 = false;
    lb2 = lb4 || fb0;
    fb1 = !lb2;
    lb4 = !fb0;
    Output.points[4][4] -= ld3;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fb1 = fo1.m2(ld3, fd0, fd1, ld1, lb2, lb4, fb0, fb1);
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
        Thought lo0 = Thought278.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
        fd1 *= -1;
    fd0 = fd1 - fd0;
    Output.points[4][5] += fd1;
    fd0 = fd1 + fd0;
    Output.points[4][6] -= fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[4][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < fd0;
    boolean lb2 = false;

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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Output.points[4][8] -= fd1;
if(fo1 != null){
      fo1.m3();
}
    double ld0 = 627.6012874933708;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fb0 = fb1 && lb1;
    fb0 = fd0 < fd1;
    Output.points[5][0] += ld0;

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
