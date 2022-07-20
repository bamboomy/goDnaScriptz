package genetic;
import java.util.ArrayList;
class Thought285 extends Thought{
private static ArrayList<Thought285> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 896.0933283671869;
private double fd1 = 13.019363298004398;
private Thought fo0 = null;
private Thought fo1 = null;
Thought285 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought285 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought285 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought285 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought285 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought285 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought285 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought285 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought285 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought285 instance = new Thought285 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought285 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought285 instance = new Thought285 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought285 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought285 instance = new Thought285 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought285 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought285 instance = new Thought285 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought285 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought285 instance = new Thought285 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought285 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought285 instance = new Thought285 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought285 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought285 instance = new Thought285 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought285 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought285 instance = new Thought285 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld0 = 194.92088975071272;
    if (fb1) {
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        fb1 = fb0 || fb1;
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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = true;
    Thought lo1 = Thought48.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
    double ld2 = 657.1126514898041;
    Thought lo3 = Thought135.getInstance(ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
    ab1 = ab2 || ab3;
    double ld4 = 348.08825734998516;
    boolean lb5 = true;
    boolean lb6 = false;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb7 = true;
    Thought lo8 = Thought179.getInstance(fd0, fd1, ld2, ld4);
    Thought lo9 = Thought140.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld4);
    Output.points[2][0] -= fd0;
    fb0 = fb1 && lb0;
    fd1 *= -1;
    lb5 = lb6 && lb7;

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
    double ld0 = 707.9990467505986;
    boolean lb1 = false;
    lb1 = !fb0;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought66.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    lb1 = fb0 || fb1;

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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab1 = !ab2;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 430.4474667576082;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    double ld2 = 963.8226747758227;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 - ad4;
    fb1 = lb1 || ab1;
    ab2 = fd0 < fd1;
    double ld3 = 451.1165729777719;
    double ld4 = 440.62236735894203;
    ab3 = ld0 < ld2;
    ld3 = ld4 + ad1;
    boolean lb5 = true;
    ad2 *= -1;
    ab3 = ad3 > ad4;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ld0, ld2);
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
    fb0 = fd0 < fd1;
    Thought lo0 = Thought163.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3();
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought329.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fd1 *= -1;
    fb0 = fb1 || lb1;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    lb1 = !fb0;
    fb1 = lb1 && fb0;
if(ao4 != null){
      fb1 = ao4.m2(fd0, fd1, fd0, fd1);
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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Output.points[2][1] -= fd1;
if(ao1 != null){
      fb1 = ao1.m2();
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought256.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
        ad3 = ad4 - fd0;
        Thought lo1 = Thought19.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
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
    Output.points[2][2] -= fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought110.getInstance(ao2, ao3, ao4, fo0);
    Output.points[2][3] += fd1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
        Thought lo1 = Thought122.getInstance(fb0, fb1, ab1, ab2);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    ab1 = !ab2;
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    double ld2 = 965.5052820766325;
    fb1 = ld2 > fd0;
    fd1 *= -1;
    Thought lo3 = Thought221.getInstance(ao3, ao4, fo0, fo1);
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought246.getInstance(ld2, fd0, fd1, ld2);
        fd0 = fd1 - ld2;
        boolean lb5 = false;
        lb5 = ab1 || ab2;
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
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought139.getInstance();
    ad1 = ad2 + ad3;
    ab1 = ad4 < fd0;
    Thought lo1 = Thought265.getInstance(ab2, ab3, ab4, fb0);
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, lb2, ab1, ab2);
}
    double ld3 = 414.63056158091075;
    Output.points[2][4] += ad3;
    ab3 = ad4 > fd0;
    Output.points[2][5] -= fd1;
    ab4 = ld3 < ad1;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
}
    Thought lo5 = Thought304.getInstance(fo1, ao1, ao2, ao3, lb4, ab1, ab2, ab3);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ld3, ad1, ad2, ad3);
}
    double ld6 = 136.82461783891515;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
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
      fo0 = fo1.m4();
}
    double ld0 = 685.2398225521952;
    Output.points[2][6] += ld0;
    double ld1 = 393.36391918387835;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
    boolean lb2 = true;
    double ld3 = 603.0561181416329;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    lb2 = ld1 < ld3;
    fd0 *= -1;
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb2);
}
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld0 = ld1 + ld3;
    Thought lo5 = Thought38.getInstance(fd0, fd1, ld0, ld1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
        double ld0 = 810.1624121064789;
    ab3 = ab4 && fb0;
    fb1 = ld0 < fd0;
    ab1 = fd1 > ld0;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    lb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, ab1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        double ld0 = 709.3831271709892;
        ld0 = ad1 - ad2;
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        ad3 = ad4 - fd0;
        }
    Thought lo1 = Thought380.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    double ld2 = 890.7522378568838;
    ad4 = fd0 - fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
    ld2 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    for(int i1=0; i1<10; i1++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m2();
}
        boolean lb4 = false;
        ad4 *= -1;
        if (fb0) {
if(fo1 != null){
              fo0 = fo1.m4(fb1, lb4, lb3, fb0);
}
            fb1 = lb4 || lb3;
            fd0 = fd1 - ld2;
            double ld5 = 245.03229678444086;
            fb0 = fb1 && lb4;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ad4 = fd0 - fd1;
    ab3 = ad1 < ad2;
    Output.points[2][7] -= ad3;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad4 *= -1;
    lb0 = fd0 > fd1;
    boolean lb2 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb3 = true;
    lb2 = lb3 && ab1;
        ab2 = ab3 || ab4;
    boolean lb4 = true;
    ab4 = fd1 > ad1;
    Thought lo5 = Thought66.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo0.m3();
}
    for(int i0=0; i0<10; i0++){
        double ld6 = 83.81145516713961;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 58.554206749550545;
    boolean lb1 = true;
    Output.points[2][8] += fd0;
    lb1 = fb0 && fb1;
    double ld2 = 846.2402166798364;
    fd0 = fd1 - ld0;
    lb1 = fb0 || fb1;
    boolean lb3 = true;
if(ao2 != null){
      lb1 = ao2.m2(lb3, fb0, fb1, lb1);
}
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld2, lb3, fb0, fb1, lb1);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, ld2, lb3, fb0, fb1, lb1);
}
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb3);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb1 = fd1 < ad1;
    double ld0 = 421.18035661170916;
        ad1 *= -1;
    Thought lo1 = Thought315.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 = ld0 + ad1;
    fb0 = ad2 < ad3;

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
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fb0 = ao1.m2();
}
    Thought lo0 = Thought383.getInstance(fb1, ab1, ab2, ab3);
    Output.points[3][0] -= fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
        fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;

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
    ab2 = ab3 || ab4;
        fb0 = fb1 && ab1;
    ad1 *= -1;
    ab2 = ab3 || ab4;
    double ld0 = 447.2777301154102;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    fb0 = !fb1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo1.m1();
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    double ld0 = 484.4484056047533;
    Thought lo1 = Thought201.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    ld0 *= -1;
    fb0 = !fb1;
    double ld2 = 664.4130147406761;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 38.12243068238812;
    double ld4 = 86.86417611316735;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    fd1 *= -1;
    Output.points[3][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    Thought lo0 = Thought179.getInstance(ab2, ab3, ab4, fb0);
    Thought lo1 = Thought299.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
    boolean lb3 = true;

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
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    if (fb0) {
        boolean lb0 = true;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = fd0 < fd1;
        lb0 = fb0 || fb1;
        double ld1 = 662.5149508030395;
        ld1 *= -1;
        lb0 = fb0 || fb1;
        Thought lo2 = Thought343.getInstance(fo0, fo1, fo0, fo1);
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
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought248.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ab4 = ad1 < ad2;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ad3 < ad4;
    boolean lb1 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
        double ld0 = 918.6787623299582;
    fb1 = ld0 > fd0;
    double ld1 = 737.5446809199182;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    ld0 = ld1 + fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0);
}
    Output.points[3][2] += fd1;
    fb1 = !fb0;
if(ao2 != null){
      ld0 = ao2.m3();
}
    boolean lb2 = true;
    double ld3 = 41.2211964818092;
    boolean lb4 = false;
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(lb4, lb5, fb0, fb1);
}
    lb2 = ld1 < ld3;
    double ld6 = 998.1414972350407;
    Thought lo7 = Thought129.getInstance(fo0, fo1, ao1, ao2, ld6, fd0, fd1, ld0, lb4, lb5, fb0, fb1);
    lb2 = ld1 > ld3;
    boolean lb8 = true;
    lb4 = !lb5;
if(ao3 != null){
      ao3.m1(ld6, fd0, fd1, ld0, lb8, fb0, fb1, lb2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad4 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    boolean lb1 = true;
if(ao4 != null){
      ao4.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought93.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
    fb0 = fb1 || lb0;
    Output.points[3][3] -= ad2;
    lb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
    lb0 = lb1 && lb3;
    double ld4 = 600.7470032764887;
    ad1 = ad2 + ad3;
    double ld5 = 814.182474543196;
    boolean lb6 = false;
    ad3 = ad4 + fd0;

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
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab1 = !ab2;
        Thought lo0 = Thought187.getInstance();
        Output.points[3][4] += fd1;
        if (ab3) {
            fd0 = fd1 + fd0;
            double ld1 = 514.8560152392464;
if(ao1 != null){
              ao1.m2(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
              fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
            double ld2 = 61.901909601646295;
            } else {
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
            ab2 = fd0 < fd1;
            ab3 = ab4 || fb0;
            boolean lb3 = true;
            fb0 = !fb1;
            Thought lo4 = Thought136.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
              lb3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        double ld0 = 828.9776397617306;
        double ld1 = 211.25316783815663;
        Output.points[3][5] += ld1;
        ad1 *= -1;
        ab3 = !ab4;
if(ao1 != null){
          ad2 = ao1.m3();
}
        fb0 = !fb1;
        ab1 = ab2 && ab3;
        boolean lb2 = true;
        ad3 *= -1;
        boolean lb3 = false;
        boolean lb4 = true;
if(ao2 != null){
          ad4 = ao2.m3(ab1, ab2, ab3, ab4);
}
        } else if (ab2) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao3.m2(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
}
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
    if (fb0) {
        Thought lo0 = Thought1.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb1 = true;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        Output.points[3][6] += fd0;
        fb1 = !lb1;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = lb1 && fb0;
        fb1 = fd0 < fd1;
        Output.points[3][7] += fd0;
        Thought lo2 = Thought123.getInstance();
        lb1 = fb0 && fb1;
        fd1 = fd0 - fd1;
        Thought lo3 = Thought366.getInstance(lb1, fb0, fb1, lb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
        fb1 = !lb1;
        double ld4 = 311.10792054015855;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(ld4, fd0, fd1, ld4);
}
        fb1 = lb1 && fb0;
        fb1 = lb1 && fb0;
        Thought lo5 = Thought146.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    Thought lo1 = Thought99.getInstance(lb0, ab1, ab2, ab3);
    double ld2 = 512.3008423459287;
    ab4 = fb0 && fb1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought359.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, lb0, ab1);
    ab2 = !ab3;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;

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
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Thought lo0 = Thought40.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    Thought lo1 = Thought237.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;

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
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Output.points[3][8] -= fd1;
    double ld0 = 109.13612737734293;
    Output.points[4][0] += ld0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[4][1] -= ad1;
    double ld1 = 896.4388954538971;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
    Thought lo0 = Thought214.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        Output.points[4][2] += fd0;
        fd1 *= -1;
if(fo0 != null){
          fo0.m3();
}
        Thought lo1 = Thought125.getInstance(fb0, fb1, fb0, fb1);
        fd0 = fd1 + fd0;
        fd1 *= -1;
        fb0 = fd0 > fd1;
        double ld2 = 379.8694920521255;
        ld2 = fd0 + fd1;
        fb1 = !fb0;
        ld2 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ld2;
        fd0 = fd1 - ld2;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        fb0 = !fb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
        Thought lo0 = Thought54.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought177.getInstance(fo1, ao1, ao2, ao3);
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
    boolean lb3 = true;
    fb0 = fb1 && lb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    lb3 = fb0 && fb1;

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
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[4][3] += fd1;
    Output.points[4][4] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        if (ab4) {
            fb0 = fb1 && ab1;
            fd0 = fd1 + fd0;
            Thought lo0 = Thought73.getInstance(fd1, fd0, fd1, fd0);
            Output.points[4][5] -= fd1;
            double ld1 = 367.2399131146175;
}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
if(ao2 != null){
      ad1 = ao2.m3();
}
    boolean lb0 = false;
    boolean lb1 = true;
    ad2 *= -1;
    Thought lo2 = Thought186.getInstance(ab1, ab2, ab3, ab4);
        Output.points[4][6] -= ad3;
    double ld3 = 302.3429643155224;
    fb0 = fb1 || lb0;
    boolean lb4 = true;
    ad3 *= -1;

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
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
            Output.points[4][7] += fd1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
        lb1 = !fb0;
    fd0 *= -1;
    double ld2 = 921.1420767997515;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Output.points[4][8] += ld2;
    double ld3 = 978.3737963093939;
if(fo0 != null){
      fo0.m2(ld3, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
        double ld4 = 905.6373951300203;

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
    fd1 = fd0 + fd1;
    double ld0 = 700.5454150764937;
    fb1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    fd1 *= -1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    lb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
        ld0 *= -1;
    boolean lb2 = true;
    Output.points[5][0] -= fd0;
        fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    Output.points[5][1] -= fd1;
    Thought lo2 = Thought27.getInstance(lb1, fb0, fb1, lb0);
    lb1 = fb0 && fb1;
    fd0 *= -1;
    Output.points[5][2] += fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
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
