package genetic;
import java.util.ArrayList;
class Thought335 extends Thought{
private static ArrayList<Thought335> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 244.36979515858806;
private double fd1 = 980.5128902373594;
private Thought fo0 = null;
private Thought fo1 = null;
Thought335 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought335 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought335 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought335 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought335 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought335 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought335 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought335 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought335 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought335 instance = new Thought335 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought335 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought335 instance = new Thought335 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought335 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought335 instance = new Thought335 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought335 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought335 instance = new Thought335 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought335 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought335 instance = new Thought335 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought335 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought335 instance = new Thought335 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought335 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought335 instance = new Thought335 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought335 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought335 instance = new Thought335 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
    Thought lo0 = Thought57.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 961.8350263260492;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld2 = 179.53542872209263;
    Thought lo3 = Thought273.getInstance(ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld4 = 378.38768155035336;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo5 = Thought275.getInstance(ld2, ld4, fd0, fd1);
    boolean lb6 = true;
    ld1 *= -1;
    fb0 = ld2 < ld4;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][4] -= fd1;
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought344.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    double ld1 = 167.58031335140154;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb2 = true;

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
    Thought lo0 = Thought9.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    if (fb1) {
        boolean lb1 = false;
        ad1 = ad2 - ad3;
        lb1 = ad4 > fd0;
        fd1 = ad1 + ad2;
        fb0 = fb1 && lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo2 = Thought125.getInstance(ad3, ad4, fd0, fd1);
        Output.points[8][5] += ad1;
        fb0 = ad2 > ad3;
        ad4 *= -1;
        fd0 = fd1 - ad1;
        fb1 = !lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        Thought lo3 = Thought382.getInstance();
        fb0 = !fb1;
        lb1 = !fb0;
        fb1 = ad1 < ad2;
        double ld4 = 823.7664311301503;
        Output.points[8][6] -= ad2;
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
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 466.79500655126577;
    double ld1 = 10.391451226556397;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb2);
}
    ab1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb2;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought154.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = fd0 + fd1;
    double ld1 = 566.4249680176356;
    ld1 = fd0 - fd1;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    Output.points[8][7] -= ad1;
    double ld1 = 336.07965558893386;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    boolean lb2 = false;
    fd0 = fd1 + ld1;
    ad1 *= -1;
    lb2 = ad2 < ad3;
    fb0 = ad4 > fd0;
    Thought lo3 = Thought265.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, fb1, lb0, lb2, fb0);
    ad3 = ad4 - fd0;
    fb1 = !lb0;
    lb2 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, ad1, ad2, fb1, lb0, lb2, fb0);
}
    if (fb1) {
        boolean lb4 = true;
        lb4 = lb0 || lb2;
        boolean lb5 = false;
        boolean lb6 = true;
        lb0 = !lb2;
        fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb4, lb5, lb6, lb0);
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab1 = !ab2;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb0 = true;
        fd0 *= -1;
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
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought319.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
if(ao2 != null){
      ab2 = ao2.m2();
}
    double ld1 = 99.18386336457806;
if(ao3 != null){
      ld1 = ao3.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought355.getInstance(fd0, fd1, ld1, ad1, fb1, ab1, ab2, ab3);
    double ld3 = 535.1550256468371;
        ab4 = fb0 || fb1;
        ad1 *= -1;
    boolean lb4 = false;
    lb4 = ad2 < ad3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
    fb0 = ld1 < ld3;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 1000.4388184498614;
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    double ld2 = 397.5774209673082;
    Output.points[8][8] -= ld2;
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 < fd1;
        ld1 = ld2 + fd0;
        fd1 = ld1 + ld2;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(ld1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    Thought lo1 = Thought179.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[0][0] += fd0;
    ab3 = !ab4;
    fd1 = fd0 + fd1;
    Output.points[0][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
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
    fb0 = ad2 > ad3;
    if (fb1) {
        boolean lb0 = false;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        fd0 = fd1 + ad1;
        double ld1 = 913.9768679707544;
        double ld2 = 428.8727112829412;
        ld2 = ad1 + ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        ad4 *= -1;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld3 = 778.0457106299401;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, ld2, ld3);
}
        ad1 = ad2 + ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
        boolean lb4 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ab3 = !ab4;
    Output.points[0][2] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought363.getInstance(fb0, fb1, lb0, ab1);
    ab2 = ad3 < ad4;
    boolean lb2 = true;
    ab2 = fd0 > fd1;
    Thought lo3 = Thought315.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb0, lb2, ab1, ab2);
}
    boolean lb4 = true;
    ab2 = ad3 > ad4;
    boolean lb5 = false;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    Output.points[0][3] -= fd0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3();
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought174.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    fb0 = ad1 > ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb1 = fd1 > ad1;
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
    ab2 = ab3 || ab4;
    Output.points[0][4] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Output.points[0][5] += fd0;
if(ao3 != null){
      fb1 = ao3.m2();
}
if(ao4 != null){
      ao4.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
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
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 + ad2;
    ab3 = !ab4;
    Thought lo0 = Thought262.getInstance(ao4, fo0, fo1, ao1);
    Thought lo1 = Thought123.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
        Thought lo2 = Thought350.getInstance();
if(ao2 != null){
      fb0 = ao2.m2(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
        if (fb0) {
if(ao2 != null){
              ao2.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
              ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
              ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
}}
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
    Output.points[0][6] += fd0;
    Output.points[0][7] += fd1;
    double ld0 = 388.09088362241704;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Output.points[0][8] -= fd0;
    fb0 = fd1 > ld0;
    fb1 = lb1 || fb0;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}
        fb1 = !lb1;
    Output.points[1][0] += fd0;

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
    fd0 *= -1;
    boolean lb0 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
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
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Output.points[1][1] += ad3;
    double ld0 = 94.40828812370067;
    fb1 = fb0 || fb1;
    double ld1 = 965.2049249252074;
if(fo1 != null){
      fo0 = fo1.m4();
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
              ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    if (ab1) {
if(fo1 != null){
          ab2 = fo1.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        ab1 = ad3 < ad4;
        ab2 = fd0 < fd1;
        ad1 *= -1;
        Output.points[1][2] -= ad2;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        Output.points[1][3] -= ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[1][4] += ad4;
        ab1 = fd0 > fd1;
        ab2 = ab3 && ab4;
        fb0 = fb1 && ab1;
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4);
}
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, lb0, ab1);
}
        Thought lo1 = Thought149.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
          fb1 = fo1.m2(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
        double ld2 = 151.6151206086232;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    Output.points[1][5] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought58.getInstance();
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[1][6] -= fd1;
    Thought lo2 = Thought123.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    boolean lb3 = false;
    double ld4 = 970.491777085955;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb3, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo5 = Thought299.getInstance(ld4, fd0, fd1, ld4);
    fd0 = fd1 - ld4;
    fd0 = fd1 + ld4;
    Thought lo6 = Thought296.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld4, fd0);
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ld4 + fd0;
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
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fd1 < ad1;
    ad2 *= -1;
    Output.points[1][7] += ad3;
    ad4 *= -1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fd0 = fd1 - ad1;
        fb0 = fb1 && lb0;
    if (fb0) {
        fb1 = !lb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = !ab2;
    boolean lb1 = false;
    Thought lo2 = Thought25.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    double ld3 = 321.0661218518296;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
    fd1 *= -1;
    ld3 = fd0 - fd1;
    Output.points[1][8] -= ld3;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3);
}
    lb0 = lb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = !ab3;
    fd0 = fd1 - ld3;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0, lb1, ab1, ab2, ab3);
}
    Output.points[2][0] -= fd1;

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
      ab2 = ao2.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[2][1] -= fd1;
    Output.points[2][2] += ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought347.getInstance(fd0, fd1, ad1, ad2);
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
if(ao2 != null){
      lb2 = ao2.m2();
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    double ld1 = 606.8340008667362;
    Thought lo2 = Thought279.getInstance(fb0, fb1, lb0, fb0);
    Thought lo3 = Thought213.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    Output.points[2][3] += fd1;
    boolean lb4 = false;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    double ld1 = 276.1612640525784;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    Thought lo2 = Thought84.getInstance(fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld1 = fd0 - fd1;
    double ld3 = 818.5339338821345;
    fb1 = ld1 > ld3;
    double ld4 = 153.48116279615883;
    Thought lo5 = Thought33.getInstance(ld4, fd0, fd1, ld1, lb0, ab1, ab2, ab3);

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
    ad2 *= -1;
    fb0 = !fb1;
    Thought lo0 = Thought310.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 647.0272466507429;
    double ld4 = 60.51174104709016;
    ad3 = ad4 + fd0;
    fd1 = ld3 - ld4;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
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
    Thought lo0 = Thought293.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    fd1 = ad1 + ad2;
    ab1 = ad3 > ad4;
    Output.points[2][4] -= fd0;
    fd1 = ad1 - ad2;
    Thought lo2 = Thought298.getInstance();
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
}
    Output.points[2][5] += ad4;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    ab1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    Output.points[2][6] += ad4;
    Thought lo3 = Thought3.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
if(fo1 != null){
          ad3 = fo1.m3();
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[2][7] -= fd1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    double ld1 = 162.68192486281512;
    boolean lb2 = false;
    ld1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb0, lb2, fb0, fb1);
}
    lb0 = !lb2;
    boolean lb3 = true;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
        lb3 = fb0 && fb1;
        double ld4 = 450.5758472567499;
        boolean lb5 = true;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][8] += ad1;
    Output.points[3][0] -= ad2;
    boolean lb0 = false;
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    double ld2 = 78.19745975360065;
    boolean lb3 = true;
    Thought lo4 = Thought228.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, lb1, lb3, fb0);
    Thought lo5 = Thought173.getInstance(ld2, ad1, ad2, ad3, fb1, lb0, lb1, lb3);
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ld2 + ad1;

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
    double ld0 = 382.0059310463327;
if(ao1 != null){
      ao1.m3();
}
    ab1 = !ab2;
    if (ab3) {
        ab4 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
        Thought lo1 = Thought320.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb2 = false;
        fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ab4 = fb0 || fb1;
        boolean lb3 = true;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld0, fd0, fd1);
}
        Output.points[3][1] += ld0;
        boolean lb4 = true;
        for(int i0=0; i0<10; i0++){
            fd0 *= -1;
            fd1 *= -1;
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
            lb2 = lb3 || lb4;
if(fo0 != null){
              fd0 = fo0.m3();
}
            fd1 = ld0 + fd0;
if(fo1 != null){
              fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        ab1 = !ab2;
        double ld1 = 109.67885871305528;
        ld1 *= -1;
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        double ld2 = 460.2720508314867;
        lb0 = fd0 > fd1;
        ab1 = ld1 > ld2;
if(ao1 != null){
          ab2 = ao1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        boolean lb3 = false;
        double ld4 = 693.1800745213852;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb3, ab1, ab2);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        boolean lb5 = false;
        ab2 = ab3 && ab4;
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ld1, ld2);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ld4, ad1, ad2, ad3);
}
        Output.points[3][2] += ad4;
if(ao2 != null){
          fd0 = ao2.m3();
}
        fb0 = fd1 > ld1;
if(ao3 != null){
          ld2 = ao3.m3(fb1, lb0, lb3, lb5);
}
        }
    ab4 = fb0 || fb1;
    ab1 = !ab2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought52.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = lb2 && fb0;
    double ld3 = 78.05798814371906;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
    Thought lo4 = Thought92.getInstance(fo1, fo0, fo1, fo0);
    double ld5 = 68.71885842132163;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, ld5);
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
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    Output.points[3][3] -= fd0;
    fb0 = fd1 > fd0;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 600.982812048141;

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
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Output.points[3][4] += fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
        boolean lb0 = false;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    Output.points[3][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
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
