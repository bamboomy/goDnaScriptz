package genetic;
import java.util.ArrayList;
class Thought328 extends Thought{
private static ArrayList<Thought328> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 484.77560477413533;
private double fd1 = 313.1033638757233;
private Thought fo0 = null;
private Thought fo1 = null;
Thought328 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought328 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought328 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought328 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought328 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought328 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought328 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought328 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought328 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought328 instance = new Thought328 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought328 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought328 instance = new Thought328 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought328 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought328 instance = new Thought328 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought328 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought328 instance = new Thought328 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought328 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought328 instance = new Thought328 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought328 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought328 instance = new Thought328 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought328 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought328 instance = new Thought328 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought328 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought328 instance = new Thought328 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    double ld2 = 133.96791467578427;
    lb1 = fd0 > fd1;
    fb0 = ld2 > fd0;
    fd1 = ld2 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    Output.points[3][4] += fd0;
    fb1 = fd1 < ld2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    boolean lb3 = true;
    Thought lo4 = Thought370.getInstance(fo1, fo0, fo1, fo0);
    Output.points[3][5] += fd1;
    Output.points[3][6] += ld2;
    fd0 = fd1 + ld2;
    lb0 = fd0 > fd1;
    Thought lo5 = Thought24.getInstance(ld2, fd0, fd1, ld2);

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[3][7] -= fd0;
    fb0 = fb1 || lb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;

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
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ad2 *= -1;
    Output.points[3][8] += ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    Output.points[4][0] -= ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[4][1] += ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][2] -= ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        for(int i0=0; i0<10; i0++){
            Output.points[4][3] -= ad3;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            boolean lb0 = false;
            ab2 = ab3 && ab4;
            boolean lb1 = false;
if(fo0 != null){
              fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
            ab4 = fb0 || fb1;
            lb0 = ad2 < ad3;
            boolean lb2 = true;
}}
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
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    Output.points[4][4] -= fd0;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    lb1 = !fb0;
    double ld2 = 360.8080709773732;
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(fb1, lb0, lb1, fb0);
}
    fb1 = lb0 && lb1;
    fd1 = ld2 - fd0;
    fb0 = fd1 < ld2;
        fd0 = fd1 + ld2;
    fd0 *= -1;
    Output.points[4][5] -= fd1;
    fb1 = ld2 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Thought lo3 = Thought14.getInstance(ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - ld2;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 = ld2 - fd0;
    fd1 = ld2 - fd0;

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
    Output.points[4][6] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    fb1 = fb0 && fb1;
    double ld0 = 221.65845804470248;
    boolean lb1 = false;
    Thought lo2 = Thought364.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
if(ao3 != null){
      ao2 = ao3.m4();
}
        fd0 = fd1 - ld0;
    double ld3 = 907.1621771016281;

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
    ab1 = !ab2;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought218.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ab1 = !ab2;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb0, lb1, ab1, ab2);
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
    Output.points[4][7] += ad1;
    Output.points[4][8] += ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought134.getInstance(ad4, fd0, fd1, ad1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    boolean lb2 = false;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      lb1 = ao3.m2(ad4, fd0, fd1, ad1, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb2, ab1, ab2);
}
    Thought lo3 = Thought55.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ab3 = ab4 || fb0;
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;

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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    Output.points[5][0] += fd1;
    fb0 = fb1 || lb0;
    double ld1 = 53.476108810443534;
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb0 = fd0 < fd1;
    double ld2 = 39.39345747148185;
if(fo0 != null){
      ld1 = fo0.m3();
}
    fb1 = ld2 > fd0;
    lb0 = fb0 && fb1;
    lb0 = fd1 < ld1;
    Thought lo3 = Thought359.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
    ld1 = ld2 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
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
    fd1 = fd0 + fd1;
    Output.points[5][1] += fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb0 = ab1 && ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought366.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fd1 = fd0 + fd1;
    fb1 = lb0 || ab1;
if(fo0 != null){
      fo0.m3();
}
    ab2 = ab3 || ab4;
    fd0 *= -1;
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
          fd0 = fo1.m3(ab1, ab2, ab3, ab4);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Thought lo0 = Thought184.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    Output.points[5][2] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 781.2741763816452;
    fd0 *= -1;
    double ld4 = 830.8700226084959;
    Thought lo5 = Thought275.getInstance(fd0, fd1, ld3, ld4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld3;
        Thought lo6 = Thought310.getInstance();
    double ld7 = 502.3433383622949;
    double ld8 = 997.6764607942843;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
    Thought lo9 = Thought168.getInstance(fo1, fo0, fo1, fo0, ld4, ld7, ld8, ad1, lb2, fb0, fb1, lb1);
    Thought lo10 = Thought213.getInstance(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb0 = false;
        boolean lb1 = false;
        ab4 = !fb0;
        boolean lb2 = false;
        Output.points[5][3] -= ad2;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, lb1, lb2);
}
        Thought lo3 = Thought383.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
        fb0 = ad4 > fd0;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought106.getInstance(ao3, ao4, fo0, fo1);
    boolean lb1 = true;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
        lb1 = fb0 && fb1;
    Thought lo2 = Thought271.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    lb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb1);
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
    Output.points[5][4] += ad1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][5] += fd0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    Thought lo1 = Thought251.getInstance(fd1, ad1, ad2, ad3);
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    Output.points[5][6] -= ad2;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 834.6707057501038;
if(ao1 != null){
      ad4 = ao1.m3(lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fb0 = fb1 && lb0;
    Output.points[5][7] += fd1;
    double ld3 = 515.272081842468;

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
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    Thought lo1 = Thought253.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Output.points[5][8] += fd0;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb4 = false;
    boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      lb0 = ao2.m2(lb2, lb3, lb4, lb5);
}
    boolean lb6 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb6, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fb0 = fb1 || lb0;
    boolean lb7 = true;
    lb2 = fd0 > fd1;
    lb3 = lb4 && lb5;
        lb6 = fd0 > fd1;
    fd0 *= -1;
    Output.points[6][0] -= fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - ad1;
    boolean lb0 = false;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
    ad2 *= -1;
    ab3 = ab4 || fb0;
    Output.points[6][1] -= ad3;
    boolean lb1 = true;
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb0;

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
    double ld0 = 232.25253806608325;
    fb0 = !fb1;
    double ld1 = 675.8005112598953;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought101.getInstance(ld0, ld1, fd0, fd1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < ld1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    if (fb0) {
        fb1 = ld0 < ld1;
        boolean lb3 = true;
        Thought lo4 = Thought286.getInstance(fd0, fd1, ld0, ld1, lb3, fb0, fb1, lb3);
        double ld5 = 647.8631764140957;
        fb0 = fb1 || lb3;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = false;
    double ld1 = 139.84781341623997;
    if (lb0) {
        ld1 = fd0 + fd1;
        ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
        ab4 = fb0 && fb1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 917.7508911612705;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    ld0 = ad1 - ad2;
    Thought lo2 = Thought91.getInstance();
if(fo1 != null){
      fo1.m1(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    double ld3 = 139.60533508997142;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb4 = false;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld3, ad1, lb4, lb5, fb0, fb1);
}
    Thought lo6 = Thought131.getInstance(fo1, fo0, fo1, fo0, lb1, lb4, lb5, fb0);
    Output.points[6][2] += ad2;
    fb1 = lb1 || lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought287.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    boolean lb1 = false;
    Thought lo2 = Thought366.getInstance();
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    ad1 = ad2 + ad3;
    ab1 = !ab2;
    boolean lb3 = true;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    Thought lo4 = Thought18.getInstance(ad4, fd0, fd1, ad1, fb1, lb1, lb3, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
    fb0 = !fb1;
    lb1 = lb3 || lb5;
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb6 = false;
    boolean lb7 = true;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    ab4 = !fb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
        boolean lb0 = true;
    lb0 = fd1 > fd0;
    Thought lo1 = Thought11.getInstance(fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 - fd0;
if(ao1 != null){
          ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
        Output.points[6][3] -= fd1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld0 = 812.3945157964745;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[6][4] -= ad4;
if(ao4 != null){
      ao4.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      fb1 = ao4.m2(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 388.8162798086063;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
if(ao3 != null){
      ld0 = ao3.m3(fd0, fd1, ld0, fd0);
}
    Output.points[6][5] += fd1;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    ab4 = !fb0;
    Thought lo1 = Thought298.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);

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
    ab2 = ad1 > ad2;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m2();
}
    Thought lo0 = Thought5.getInstance(fb1, ab1, ab2, ab3);
    double ld1 = 518.0206664707762;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m2(ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
    ld1 = ad1 - ad2;

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][6] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    if (fb0) {
        fb1 = fb0 || fb1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = !fb0;
        fd0 *= -1;
        double ld0 = 71.81096016271253;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        } else if (fb1) {
        fb0 = fb1 || fb0;
        boolean lb1 = false;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
        boolean lb2 = false;
        fb0 = fd1 < fd0;
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
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    double ld0 = 709.4102916927615;
    Output.points[6][7] -= ld0;
    double ld1 = 572.8998298816998;
    boolean lb2 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0);
}
    boolean lb3 = false;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    ab3 = !ab4;
    fb0 = fb1 || lb2;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1();
}
    lb3 = fd0 > fd1;
    boolean lb5 = false;
    double ld6 = 702.757881700952;
    lb4 = lb5 || ab1;
    boolean lb7 = true;
    ld0 = ld1 + ld6;
    fd0 *= -1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb2);
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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 473.9683199334938;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd1 = ld1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 > ld1;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    lb0 = !fb0;
    boolean lb2 = false;
    Thought lo3 = Thought366.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2, fb1, lb0, lb2, fb0);
}
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    if (ab2) {
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        double ld1 = 120.56444473261877;
        ad1 *= -1;
if(fo0 != null){
          ad2 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Output.points[6][8] += fd1;
    fb1 = fb0 && fb1;
    if (fb0) {
if(ao1 != null){
          ao1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fb1 = fd1 < fd0;
        fd1 *= -1;
        fb0 = fd0 < fd1;
        boolean lb0 = false;
        } else if (fb1) {
        double ld1 = 194.37446692770897;
if(ao2 != null){
          ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
        fb0 = fb1 && fb0;
        fd1 = ld1 - fd0;
        fb1 = !fb0;
        fb1 = fd1 > ld1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb2 = false;
        lb2 = fd0 > fd1;
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
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
    Output.points[7][0] -= ad3;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought129.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 833.0490062167877;
    Thought lo2 = Thought180.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    ld1 = ad1 - ad2;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > ad1;
    fb1 = !fb0;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought122.getInstance(fo1, ao1, ao2, ao3);
    ad3 *= -1;

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
    Output.points[7][1] += fd0;
        ab2 = ab3 || ab4;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fb1 && lb0;
    fd0 *= -1;
    ab1 = fd1 > fd0;
    ab2 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = false;
    fd1 *= -1;
    ab2 = ab3 || ab4;
    if (fb0) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Output.points[7][2] -= ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        if (ab4) {
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2);
}
            ad4 = fd0 + fd1;
            Output.points[7][3] -= ad1;
if(ao4 != null){
              ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
}}
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
    fb0 = !fb1;
    Output.points[7][4] += fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = fd1 > fd0;
    fb0 = !fb1;
    double ld1 = 571.5958499676342;
    fd0 = fd1 + ld1;
    lb0 = !fb0;
    fb1 = fd0 > fd1;
    lb0 = ld1 < fd0;
    fb0 = !fb1;
        boolean lb2 = true;
    lb0 = !lb2;
    fb0 = fd1 > ld1;
if(fo1 != null){
      fo1.m1(fb1, lb0, lb2, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, lb2, fb0, fb1);
}
    fd0 = fd1 - ld1;
    lb0 = lb2 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
}
    lb0 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
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
    Thought lo0 = Thought42.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought14.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    Output.points[7][5] -= fd1;
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    boolean lb4 = true;
    lb3 = !lb4;
    fb0 = fb1 && lb2;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    lb3 = lb4 && fb0;

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
    double ld0 = 754.493807868001;
    Output.points[7][6] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
        fb0 = !fb1;
    Output.points[7][7] -= fd0;
    Output.points[7][8] += fd1;
    fb0 = ld0 > fd0;
    fd1 = ld0 - fd0;
    fb1 = !fb0;
    Thought lo1 = Thought308.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
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
}
