package genetic;
import java.util.ArrayList;
class Thought399 extends Thought{
private static ArrayList<Thought399> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 158.97522193394465;
private double fd1 = 642.48101301696;
private Thought fo0 = null;
private Thought fo1 = null;
Thought399 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought399 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought399 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought399 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought399 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought399 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought399 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought399 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought399 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought399 instance = new Thought399 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought399 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought399 instance = new Thought399 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought399 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought399 instance = new Thought399 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought399 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought399 instance = new Thought399 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought399 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought399 instance = new Thought399 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought399 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought399 instance = new Thought399 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought399 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought399 instance = new Thought399 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought399 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought399 instance = new Thought399 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 463.2894437884781;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    double ld1 = 584.8221912690026;
    double ld2 = 464.6211279519691;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ld1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = ld2 < fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      ld0 = fo1.m3(ld1, ld2, fd0, fd1, fb0, fb1, lb3, fb0);
}
    Thought lo4 = Thought175.getInstance(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ld1, ld2, fd0, fd1);
}
    Thought lo5 = Thought357.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, ld2, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
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
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought260.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    fd0 = fd1 - fd0;
if(fo0 != null){
      ab3 = fo0.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought196.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab2 = ab3 && ab4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3();
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
    fb0 = ad1 < ad2;
    Output.points[4][2] -= ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[4][3] -= fd1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    lb0 = lb1 || fb0;
    Thought lo2 = Thought298.getInstance(ad4, fd0, fd1, ad1);
    fb1 = lb0 || lb1;

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
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
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
    fd0 = fd1 + fd0;
    double ld0 = 145.13170877099842;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 81.3051277751736;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    ld0 = ld1 + fd0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
    double ld2 = 191.36762525862636;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, ld2, fd0);
}
    double ld3 = 904.6256850938042;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ld2);
}
if(ao4 != null){
      ld3 = ao4.m3();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, ld1, ld2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ld3, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 = ld2 + ld3;
    fb1 = fd0 < fd1;
    Thought lo4 = Thought390.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);

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
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought280.getInstance();
    double ld2 = 436.9621060550358;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = ad1 > ad2;
    lb0 = ad3 > ad4;
    fb0 = !fb1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    fd0 = fd1 + ld2;

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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
        fd0 *= -1;
        ab1 = fd1 < fd0;
        Thought lo0 = Thought87.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        ab3 = ab4 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ab2 || ab3;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
    Output.points[4][4] += ad4;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = !fb0;
if(ao3 != null){
      ao3.m1(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    boolean lb1 = true;
    Output.points[4][5] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
}
    if (fb1) {
        lb0 = lb1 || lb2;
        fd0 *= -1;
        fb0 = fb1 || lb0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
        if (lb0) {
            double ld3 = 641.8864501746297;
            double ld4 = 897.9504323624162;
            lb1 = lb2 || fb0;
}}
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought348.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought132.getInstance(fd1, fd0, fd1, fd0);
    double ld2 = 223.66350636815704;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    boolean lb3 = true;
    double ld4 = 624.1753551095951;
    ab4 = ld2 > ld4;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, ab1);
}
    Output.points[4][6] -= fd0;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ld4, fd0, fb0, fb1, lb3, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fd1, ld2, ld4, fd0, ab3, ab4, fb0, fb1);
}
    lb3 = fd1 < ld2;
    ld4 = fd0 + fd1;
    Thought lo5 = Thought327.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld2 *= -1;
if(fo0 != null){
      ld4 = fo0.m3(fd0, fd1, ld2, ld4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld4);
}
if(fo0 != null){
      fb0 = fo0.m2();
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
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    Output.points[4][7] += fd1;
    fb1 = !fb0;
    fb1 = ad1 > ad2;
    Thought lo0 = Thought396.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    Thought lo2 = Thought288.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Output.points[4][8] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb1 = fb0 || fb1;

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
    if (ab2) {
        ad1 *= -1;
        if (ab3) {
            double ld0 = 690.1255498654568;
if(fo0 != null){
              fo1 = fo0.m4();
}
if(fo0 != null){
              fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
            Thought lo1 = Thought340.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo1 != null){
              fo1.m2(fd0, fd1, ld0, ad1, fb1, ab1, ab2, ab3);
}
            ab4 = fb0 || fb1;
            } else {
if(fo0 != null){
              ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
            fb0 = fb1 || ab1;
            Output.points[5][0] += ad4;
            ab2 = fd0 < fd1;
            boolean lb2 = false;
            ab2 = ad1 < ad2;
            ab3 = ab4 || fb0;
            fb1 = !lb2;
            ab1 = ad3 > ad4;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            fd0 = fd1 + ad1;
if(fo1 != null){
              fo1.m2(ad2, ad3, ad4, fd0);
}
            double ld3 = 672.8258612330434;
}}
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
    fd1 = fd0 - fd1;
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 970.0637947242457;
if(fo1 != null){
      fo1.m2();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
    fb0 = ld0 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
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
    if (fb1) {
        Thought lo0 = Thought64.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
        Thought lo1 = Thought2.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
        fb0 = !fb1;
        fb0 = fd0 < fd1;
        boolean lb2 = true;
        Thought lo3 = Thought398.getInstance(fo0, fo1, ao1, ao2);
        double ld4 = 22.611459539716627;
if(ao4 != null){
          ao3 = ao4.m4(ld4, ad1, ad2, ad3);
}
        boolean lb5 = true;
        lb5 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld4);
}
if(fo0 != null){
          fo0.m2();
}
if(ao1 != null){
          fo1 = ao1.m4(lb2, lb5, fb0, fb1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb2, lb5, fb0, fb1);
}
        lb2 = fd0 > fd1;
        boolean lb6 = true;
if(ao1 != null){
          ao1.m1(ld4, ad1, ad2, ad3, lb5, lb6, fb0, fb1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, lb2, lb5, lb6, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ld4, ad1);
}
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
    Output.points[5][1] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought128.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    double ld2 = 943.7791854570409;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld3 = 970.8016507736253;

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
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    ad2 *= -1;
    ab2 = ab3 || ab4;
    boolean lb1 = false;
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[5][2] += ad1;
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao4.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb0, lb1, lb2, ab1);
}
    double ld3 = 738.6650810884905;

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
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought196.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought378.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld4 = 382.93097856386794;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4);
}
    boolean lb5 = false;
if(fo0 != null){
      fo0.m2();
}
    double ld6 = 184.6605268537878;
if(fo1 != null){
      lb5 = fo1.m2(fb0, fb1, lb0, lb2);
}
    double ld7 = 919.8061279482896;
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0, ld6, ld7, fd0, fd1, fb0, fb1, lb0, lb2);
}
    ld4 = ld6 + ld7;
    lb5 = fd0 < fd1;

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
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    double ld1 = 923.6365009701119;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fb0 = !fb1;

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
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad3 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb0 = fb1 || fb0;
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
if(fo1 != null){
          ad4 = fo1.m3(fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    double ld1 = 668.1337161791208;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought349.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
    ab3 = !ab4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, ad1, fb0, fb1, lb0, ab1);
}
    boolean lb3 = true;
    boolean lb4 = true;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    lb0 = fb0 && fb1;
    Thought lo1 = Thought354.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[5][3] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb2 = false;

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
    boolean lb0 = false;
    ad1 *= -1;
    lb0 = fb0 || fb1;
    ad2 = ad3 + ad4;
    lb0 = fb0 || fb1;
    fd0 = fd1 + ad1;
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
    Output.points[5][4] += ad2;
    double ld1 = 883.8925772863903;
    double ld2 = 687.9486876442254;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(fd0, fd1, ld1, ld2, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;

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
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    Thought lo0 = Thought298.getInstance(fo1, ao1, ao2, ao3);
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
    if (ab4) {
        Thought lo1 = Thought254.getInstance(fd1, fd0, fd1, fd0);
        fb0 = fd1 > fd0;
        fb1 = ab1 || ab2;
        Thought lo2 = Thought214.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
        ab3 = fd1 < fd0;
        fd1 = fd0 - fd1;
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 + fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
        ab1 = ab2 && ab3;
        boolean lb1 = true;
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb1, lb0, ab1, ab2);
}
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 645.4726978719699;
    Thought lo1 = Thought147.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    double ld2 = 664.1365082926857;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
    fb1 = fd0 < fd1;
    Thought lo3 = Thought141.getInstance();
    fb0 = ld0 < ld2;
    fb1 = fb0 || fb1;
    Thought lo4 = Thought132.getInstance(fb0, fb1, fb0, fb1);
    double ld5 = 842.3760472638028;
    ld5 = fd0 - fd1;
    Thought lo6 = Thought108.getInstance(fo0, fo1, fo0, fo1, ld0, ld2, ld5, fd0, fb0, fb1, fb0, fb1);
    Output.points[5][5] -= fd1;
    fb0 = fb1 && fb0;
    ld0 = ld2 + ld5;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ld2, fb0, fb1, fb0, fb1);
}
    ld5 = fd0 + fd1;
    if (fb0) {
        Thought lo7 = Thought65.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
        Output.points[5][6] += ld0;
        fb1 = ld2 > ld5;
        Output.points[5][7] += fd0;
        Thought lo8 = Thought50.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld0, ld2, ld5);
}
        Thought lo9 = Thought364.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
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
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb0 = false;
    boolean lb1 = false;
    Output.points[5][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    Output.points[6][0] += fd1;
    fd0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    double ld3 = 292.32850734847545;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0, lb0, lb1, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = ld3 - fd0;
    boolean lb4 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ld3, fd0, fd1, ld3);
}
    double ld5 = 792.2539273941196;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = lb1 || lb2;
    ld5 = fd0 - fd1;
        boolean lb6 = false;

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
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fb0 = fd1 > ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    double ld0 = 63.02504837773618;
    double ld1 = 126.77818295397114;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[6][1] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[6][2] += ld0;
    ld1 *= -1;
        Thought lo2 = Thought54.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought383.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);

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
    Thought lo0 = Thought209.getInstance(fo0, fo1, fo0, fo1);
    ab1 = !ab2;
    boolean lb1 = false;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 && lb1;
    ad3 = ad4 + fd0;
    ab1 = fd1 < ad1;
    ab2 = !ab3;
    if (ab4) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fb0 = fd1 < ad1;
        ad2 = ad3 + ad4;
        fb1 = !lb1;
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
    double ld0 = 669.1069405782098;
    double ld1 = 803.542210507458;
    double ld2 = 582.6774339300007;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought197.getInstance(fb1, fb0, fb1, fb0);
    ld0 = ld1 + ld2;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ld2, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ld1, ld2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ad1 + ad2;
    Output.points[6][3] += ad3;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 > ad4;
    boolean lb1 = false;
    Output.points[6][4] -= fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    double ld3 = 898.1028736258495;
    fb1 = lb0 || lb1;
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[6][5] -= fd1;
    double ld0 = 528.8164727680025;
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    Output.points[6][6] += ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb2 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][7] += ad1;
    ab2 = ad2 > ad3;
    ab3 = ad4 < fd0;
    Thought lo0 = Thought235.getInstance(ab4, fb0, fb1, ab1);
    double ld1 = 656.5178273104805;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    ab3 = ab4 || fb0;
    fb1 = fd1 > ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo3 = Thought7.getInstance(ao3, ao4, fo0, fo1);

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
    boolean lb0 = false;
    Thought lo1 = Thought138.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    double ld2 = 699.119581871628;
    fd0 = fd1 + ld2;
    fb0 = fb1 && lb0;
    boolean lb3 = true;
    lb3 = !fb0;
    double ld4 = 29.434157140600043;
    Thought lo5 = Thought17.getInstance(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld2, fb1, lb0, lb3, fb0);
    ld4 *= -1;
    fd0 *= -1;
    boolean lb6 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought53.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    Thought lo3 = Thought247.getInstance(fd1, fd0, fd1, fd0);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
    lb2 = !fb0;
    fb1 = lb1 && lb2;
    fb0 = fb1 || lb1;
    double ld4 = 78.86254548512592;
if(fo1 != null){
      fo1.m1(ld4, fd0, fd1, ld4, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld4;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld4, fd0, fd1);
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
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    fd0 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    double ld1 = 974.1005125088301;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
        double ld2 = 293.49517129604754;
    ld2 *= -1;
    Output.points[6][8] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][0] -= ld1;
    fb0 = fb1 && lb0;

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
