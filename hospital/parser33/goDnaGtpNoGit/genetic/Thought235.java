package genetic;
import java.util.ArrayList;
class Thought235 extends Thought{
private static ArrayList<Thought235> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 108.53202688304096;
private double fd1 = 533.221056985982;
private Thought fo0 = null;
private Thought fo1 = null;
Thought235 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought235 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought235 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought235 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought235 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought235 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought235 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought235 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought235 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought235 instance = new Thought235 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought235 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought235 instance = new Thought235 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought235 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought235 instance = new Thought235 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought235 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought235 instance = new Thought235 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought235 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought235 instance = new Thought235 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought235 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought235 instance = new Thought235 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought235 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought235 instance = new Thought235 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought235 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought235 instance = new Thought235 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
        fb0 = !fb1;
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld2 = 524.218359419099;
    double ld3 = 331.7128825596106;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = fb0 && fb1;

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
    ab1 = !ab2;
    double ld0 = 929.291921741933;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought40.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, lb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    boolean lb3 = true;
    double ld4 = 466.0231872334238;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb1);
}
    boolean lb5 = false;
    Thought lo6 = Thought263.getInstance(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld0, lb3, lb5, ab1, ab2);

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
    Thought lo0 = Thought230.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld1 = 804.6325602672373;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    lb2 = fd0 > fd1;

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
    Output.points[8][2] += ad1;
    Thought lo0 = Thought319.getInstance(ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    ad2 *= -1;
    double ld2 = 384.3510626481191;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought1.getInstance(ld2, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ad4 = fd0 - fd1;
    ab3 = ab4 && fb0;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld2 *= -1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[8][3] += fd1;
    Thought lo5 = Thought29.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
    fb0 = !fb1;
    boolean lb6 = false;
    Output.points[8][4] -= ad4;
    double ld7 = 895.9187413051455;
if(fo0 != null){
      fo0.m2();
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
    double ld0 = 146.63593973315963;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;
    fb0 = fd1 > ld0;
    Thought lo1 = Thought300.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fd1 = ld0 + fd0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Output.points[8][5] -= fd0;
    fb0 = fd1 > ld0;
    double ld2 = 46.57251997453523;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ld2 = fd0 + fd1;
    fb1 = ld0 < ld2;
    if (fb0) {
        Thought lo3 = Thought51.getInstance(fd0, fd1, ld0, ld2);
        Thought lo4 = Thought158.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld2);
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
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 934.3350106811774;
    fb1 = fb0 && fb1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    ld0 = ad1 - ad2;
    fb0 = ad3 < ad4;
    Thought lo1 = Thought154.getInstance(fd0, fd1, ld0, ad1);
    Output.points[8][6] += ad2;
    Thought lo2 = Thought257.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
    Thought lo3 = Thought21.getInstance();
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb4 = false;
    lb4 = !fb0;
    ld0 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, lb4, fb0, fb1);
}
    Thought lo5 = Thought136.getInstance(ad1, ad2, ad3, ad4, lb4, fb0, fb1, lb4);
    fd0 = fd1 - ld0;
    fb0 = fb1 || lb4;
    ad1 = ad2 + ad3;
    ad4 *= -1;

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
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought230.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld1 = 676.0015770630026;
if(ao2 != null){
      ld1 = ao2.m3(fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    ad3 = ad4 - fd0;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m2();
}
    Output.points[8][7] -= ad4;
        fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    lb0 = ad2 > ad3;
if(ao4 != null){
      ad4 = ao4.m3(lb1, lb2, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        lb0 = lb1 && lb2;
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
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    double ld0 = 529.2068716568768;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 772.2446292430742;
    boolean lb2 = false;
    double ld3 = 964.9180364012948;
    fb0 = fb1 || lb2;
    ld3 *= -1;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
}
    fb1 = ld3 < fd0;
    lb2 = fb0 && fb1;
    boolean lb4 = true;
    Thought lo5 = Thought297.getInstance(fo1, fo0, fo1, fo0, lb2, lb4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb6 = true;

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
    ab2 = fd0 > fd1;
    double ld0 = 771.400380755615;
if(fo1 != null){
      fo1.m3(ld0, fd0, fd1, ld0);
}
    double ld1 = 774.2365037819699;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    ld1 = fd0 + fd1;
    boolean lb2 = true;
    ld0 = ld1 - fd0;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld3 = 121.35341170334274;
    fd0 = fd1 + ld0;
    boolean lb4 = false;
    Thought lo5 = Thought338.getInstance(ab4, fb0, fb1, lb2);
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, lb4, ab1, ab2, ab3);
}
    Output.points[8][8] += ld1;

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
      fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    Output.points[0][0] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[0][1] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    fb1 = ad4 > fd0;
    fd1 *= -1;
    double ld0 = 244.77283278219585;
    double ld1 = 457.7182705168833;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;

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
        ab2 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb0 = true;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
        Output.points[0][2] -= fd1;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
        ab1 = !ab2;
        ab3 = ab4 && fb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);
}
        ab2 = ab3 && ab4;
        ad4 = fd0 - fd1;
        fb0 = !fb1;
        Thought lo2 = Thought216.getInstance(fo0, fo1, fo0, fo1);
        ad1 = ad2 + ad3;
        double ld3 = 577.7738232293588;
        boolean lb4 = true;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ld3);
}
        Output.points[0][3] -= ad1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(ao4 != null){
      fd0 = ao4.m3(fb0, fb1, fb0, fb1);
}
    Output.points[0][4] -= fd1;
    double ld0 = 523.8207853520739;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < fd0;
    fb0 = fd1 > ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[0][5] += fd0;
    fb1 = fd1 < ld0;
    fb0 = fd0 < fd1;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb1 = true;
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
        fb1 = !fb0;
    boolean lb0 = true;
    Thought lo1 = Thought143.getInstance(ad1, ad2, ad3, ad4);
        fb0 = fd0 > fd1;
    Thought lo2 = Thought240.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    double ld3 = 307.46188860392624;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    boolean lb3 = true;
    lb2 = fd1 > fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb3, ab1, ab2, ab3);
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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought129.getInstance(ad2, ad3, ad4, fd0);
    lb0 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb3 = true;
if(ao3 != null){
      ad4 = ao3.m3(ab1, ab2, ab3, ab4);
}
    double ld4 = 504.5486232174416;
    fb0 = ad4 < fd0;
    Thought lo5 = Thought65.getInstance(ao4, fo0, fo1, ao1, fd1, ld4, ad1, ad2, fb1, lb0, lb2, lb3);
if(ao2 != null){
      ab1 = ao2.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
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
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld0 = 196.8592248622141;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought285.getInstance(fd1, ld0, fd0, fd1);
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    double ld4 = 749.7485716040964;
    fb0 = fb1 && lb2;
    Thought lo5 = Thought57.getInstance();
    boolean lb6 = true;
    lb3 = !lb6;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb2, lb3);
}
    lb6 = fb0 || fb1;
    lb2 = !lb3;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4, lb6, fb0, fb1, lb2);
}
    lb3 = lb6 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld4, fd0, fb1, lb2, lb3, lb6);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, lb3, lb6);
}
        fd1 = ld0 + ld4;
    fd0 = fd1 + ld0;
    fb0 = fb1 || lb2;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    if (fb0) {
        fb1 = fd0 < fd1;
        double ld0 = 920.1295656751208;
        ld0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
        if (ab4) {
if(fo0 != null){
              fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
            ab4 = fd0 < fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            Output.points[0][6] += ld0;
            Thought lo1 = Thought291.getInstance(fd0, fd1, ld0, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought42.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    double ld2 = 390.15665578250747;
    lb0 = fb0 && fb1;

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
    ab1 = ad2 > ad3;
    double ld0 = 934.2891834561618;
    ab2 = ad3 > ad4;
    double ld1 = 305.7480044651622;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought120.getInstance(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
    ab4 = ld1 > ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Thought lo3 = Thought364.getInstance(fo0, fo1, fo0, fo1);
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ld0;
    ld1 = ad1 - ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[0][7] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(ld0, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ad3 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 758.6045533835099;
    Output.points[0][8] -= fd0;
    fd1 = ld0 - fd0;
    double ld1 = 599.4345624400241;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb2 = false;

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
        Thought lo0 = Thought168.getInstance();
    ad4 *= -1;
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld1 = 105.43018749789668;
    if (fb1) {
if(ao4 != null){
          ad2 = ao4.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        double ld2 = 37.09587166862294;
        ld2 = ld1 + ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
        } else {
        double ld3 = 475.8216894938234;
        boolean lb4 = false;
        Output.points[1][0] += ad3;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        lb4 = fb0 && fb1;
        lb4 = fb0 || fb1;
        lb4 = ad4 > fd0;
        fb0 = !fb1;
        double ld5 = 89.18303556446574;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    lb0 = ab1 && ab2;
    boolean lb1 = false;
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    Thought lo2 = Thought269.getInstance();
    Output.points[1][1] += fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
    ab1 = !ab2;
    fd1 *= -1;
    ab3 = ab4 && fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
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
    Thought lo0 = Thought397.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    Thought lo1 = Thought7.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    if (ab1) {
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
        ad2 = ad3 + ad4;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
        double ld2 = 699.8992174418792;
if(fo0 != null){
          ad3 = fo0.m3();
}
        double ld3 = 746.8812772647988;
if(fo1 != null){
          fo1.m1(ab3, ab4, fb0, fb1);
}
        ad3 = ad4 + fd0;
        ab1 = !ab2;
        boolean lb4 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ld3, ad1, ab2, ab3, ab4, fb0);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    Output.points[1][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[1][3] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo1 = Thought345.getInstance(fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    Thought lo2 = Thought53.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    double ld3 = 640.926912571159;
    Thought lo4 = Thought182.getInstance(fo1, fo0, fo1, fo0);

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    boolean lb0 = true;
    Output.points[1][4] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought193.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    double ld2 = 272.1160307653343;
    ab2 = ld2 < fd0;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = fb0 || fb1;
    double ld3 = 473.34059351589;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(lb0, ab1, ab2, ab3);
}
    Thought lo4 = Thought312.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, ld3, fd0, ab4, fb0, fb1, lb0);
    ab1 = ab2 && ab3;
    double ld5 = 551.5116606923891;
    fd0 *= -1;
    ab4 = fd1 > ld2;

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
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Thought lo0 = Thought54.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought196.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb3 = true;
    if (fb0) {
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo1.m1();
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
        double ld1 = 216.72614238306875;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought251.getInstance(fo1, fo0, fo1, fo0);

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
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    Output.points[1][5] += fd1;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    boolean lb0 = true;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      fd0 = ao3.m3(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    fd0 *= -1;

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
    Output.points[1][6] -= ad2;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[1][7] += ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = ad3 < ad4;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought153.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(ao1 != null){
      lb1 = ao1.m2(fb0, fb1, lb1, fb0);
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
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    if (ab4) {
        Output.points[1][8] -= fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fb0 = fb1 && lb0;
        Thought lo2 = Thought125.getInstance(ao2, ao3, ao4, fo0, lb1, ab1, ab2, ab3);
if(fo1 != null){
          ab4 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
        fd0 = fd1 - fd0;
        fb0 = !fb1;
        Thought lo3 = Thought154.getInstance(lb0, lb1, ab1, ab2);
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
        lb1 = !ab1;
        Output.points[2][0] -= fd1;
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
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab2 = fd1 > ad1;
    Output.points[2][1] -= ad2;
if(fo1 != null){
      ab3 = fo1.m2(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought151.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    double ld1 = 705.8785119886123;
    ab4 = fb0 || fb1;
    Thought lo2 = Thought44.getInstance();
    Thought lo3 = Thought255.getInstance(ab1, ab2, ab3, ab4);
    if (fb0) {
        boolean lb4 = false;
        fb0 = !fb1;
        lb4 = !ab1;
        boolean lb5 = true;
        ab1 = ab2 && ab3;
        ab4 = ad4 > fd0;
        boolean lb6 = false;
        fd1 = ld1 + ad1;
        boolean lb7 = true;
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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought181.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 123.9348857495935;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    Output.points[2][2] -= fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
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
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb0 = false;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    lb0 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    double ld1 = 995.8192429227199;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld0 = 70.48102042479636;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    fd1 *= -1;
    double ld1 = 717.9868244614116;
    ld0 = ld1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    ld0 = ld1 + fd0;
    fd1 *= -1;
    ld0 = ld1 + fd0;
    lb2 = fd1 < ld0;
    Thought lo3 = Thought140.getInstance(ld1, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
    ld1 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, lb4, fb0);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ld1 < fd0;
    fd1 = ld0 + ld1;
    boolean lb5 = false;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb4, lb5, fb0);
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
