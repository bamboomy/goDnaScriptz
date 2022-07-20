package genetic;
import java.util.ArrayList;
class Thought340 extends Thought{
private static ArrayList<Thought340> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 19.253549018189396;
private double fd1 = 434.76732957613183;
private Thought fo0 = null;
private Thought fo1 = null;
Thought340 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought340 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought340 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought340 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought340 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought340 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought340 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought340 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought340 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought340 instance = new Thought340 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought340 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought340 instance = new Thought340 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought340 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought340 instance = new Thought340 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought340 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought340 instance = new Thought340 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought340 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought340 instance = new Thought340 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought340 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought340 instance = new Thought340 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought340 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought340 instance = new Thought340 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought340 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought340 instance = new Thought340 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought100.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb1;
    Output.points[1][1] += fd1;
    fb0 = fb1 && lb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Output.points[1][2] -= fd0;
    fb0 = !fb1;

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
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2();
}
    double ld1 = 342.5856872331567;
        ab4 = fb0 || fb1;
    lb0 = !ab1;
    fd0 *= -1;
    Thought lo2 = Thought7.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ld1 > fd0;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ld1 = fd0 + fd1;

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
    fb0 = ad1 > ad2;
    Thought lo0 = Thought70.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = ad3 < ad4;
    Thought lo1 = Thought267.getInstance(fo0, fo1, fo0, fo1);
    Output.points[1][3] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld3 = 275.86584057122656;
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
    double ld0 = 388.5546437161648;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    Output.points[1][4] += ad1;
    Thought lo1 = Thought102.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][5] -= ad2;
    fb0 = ad3 > ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
    boolean lb2 = false;
    double ld3 = 631.5981502560027;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought248.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, ab1);
}
    ld0 = ld3 + ad1;
    boolean lb5 = true;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo6 = Thought350.getInstance(ld0, ld3, ad1, ad2, fb0, fb1, lb2, lb5);
    ab1 = ad3 > ad4;
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fb1 = ld0 < ld3;
    boolean lb7 = false;
    lb2 = lb5 && lb7;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
    Thought lo0 = Thought295.getInstance(ao1, ao2, ao3, ao4);
    fb1 = fb0 || fb1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    lb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(ao1 != null){
      fd1 = ao1.m3();
}
    fd0 *= -1;
    lb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb2, fb0, fb1, lb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb2, fb0);
}
    fb1 = fd1 < fd0;
    double ld3 = 933.059203416006;
    fd0 = fd1 - ld3;
    lb1 = fd0 < fd1;
    double ld4 = 458.3282907402052;
    lb2 = !fb0;
    ld3 = ld4 + fd0;
    Thought lo5 = Thought108.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, lb2, fb0);
    boolean lb6 = true;
    fb0 = fb1 || lb1;
    fd1 = ld3 - ld4;
    lb2 = fd0 < fd1;
    lb6 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Output.points[1][6] -= fd1;
    ad1 *= -1;
    Thought lo0 = Thought176.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought5.getInstance();
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    fd1 *= -1;
        Output.points[1][7] -= ad1;
    Output.points[1][8] -= ad2;
    double ld3 = 919.3704848579894;
    double ld4 = 672.0414682725154;
    lb2 = !fb0;
    fb1 = lb2 || fb0;
    boolean lb5 = true;
    fb0 = fb1 || lb2;
    lb5 = fb0 || fb1;
    Thought lo6 = Thought18.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb2, lb5, fb0, fb1);
    lb2 = lb5 || fb0;
    fd0 *= -1;
    boolean lb7 = false;
    fb0 = fd1 > ld3;
    fb1 = !lb2;
    lb5 = !lb7;
if(fo1 != null){
      fo0 = fo1.m4(ld4, ad1, ad2, ad3, fb0, fb1, lb2, lb5);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb7, fb0, fb1, lb2);
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
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ab1 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought136.getInstance();
    boolean lb1 = false;
    double ld2 = 739.6269426452516;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb1, ab1);
}
    double ld3 = 761.8283338882694;
    fd0 *= -1;

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
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[2][0] -= fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && ab1;
        ad4 *= -1;
        ab2 = ab3 && ab4;
        fb0 = fb1 || ab1;
        ab2 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
        ad1 = ad2 - ad3;
        ab1 = ad4 > fd0;
        ab2 = fd1 > ad1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
if(fo0 != null){
          ab4 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        ad4 = fd0 - fd1;
        Output.points[2][1] += ad1;
        ab3 = ad2 > ad3;
        ad4 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
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
    Thought lo0 = Thought242.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought42.getInstance();
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb2 = true;
    Output.points[2][2] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fd1 > fd0;
    Output.points[2][3] -= fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    double ld3 = 492.2259795150166;
    fb0 = ld3 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    lb2 = fd1 < ld3;
    fb0 = !fb1;
    fd0 *= -1;

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
    Thought lo0 = Thought191.getInstance(fo1, fo0, fo1, fo0);
    if (ab2) {
        fd0 = fd1 + fd0;
        Output.points[2][4] -= fd1;
        boolean lb1 = false;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        ab1 = fd1 < fd0;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        ab2 = ab3 || ab4;
        fd1 = fd0 + fd1;
        Thought lo3 = Thought338.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        boolean lb4 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = ad4 > fd0;
    double ld0 = 442.99763378153665;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Output.points[2][5] += fd0;
    fd1 = ld0 - ad1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ld0 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    lb1 = fb0 || fb1;
    lb1 = !fb0;
    ad3 *= -1;
    ad4 *= -1;
    if (fb1) {
        if (lb1) {
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
          fo1 = fo0.m4();
}
    boolean lb0 = true;
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[2][6] -= fd1;
if(fo1 != null){
      lb0 = fo1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    Output.points[2][7] += ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;

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
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo1 = Thought167.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought227.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
    Output.points[2][8] += fd1;
    fd0 *= -1;
    lb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        lb3 = fd0 < fd1;
        Thought lo4 = Thought25.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        Thought lo5 = Thought358.getInstance();
        fb0 = fd0 > fd1;
if(ao2 != null){
          fd0 = ao2.m3(fb1, lb0, lb3, fb0);
}
        fb1 = lb0 || lb3;
        for(int i1=0; i1<10; i1++){
            fb0 = fd1 > fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    Thought lo0 = Thought267.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
    Thought lo2 = Thought313.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
    fb1 = !lb1;
    fb0 = fb1 || lb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && lb1;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
        fb1 = !lb1;
    Thought lo3 = Thought260.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    ad3 = ad4 - fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    lb1 = ad4 > fd0;
    Output.points[3][0] -= fd1;
    Output.points[3][1] += ad1;

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
    ab1 = ab2 || ab3;
    double ld0 = 597.1548163680116;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld0 - fd0;
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    lb1 = fd1 < ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
    double ld3 = 169.84318617193873;
    ld3 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[3][2] -= ld0;
    boolean lb4 = true;
if(ao4 != null){
      ld3 = ao4.m3(fd0, fd1, ld0, ld3);
}
    fd0 = fd1 - ld0;
    ld3 *= -1;
    Thought lo5 = Thought63.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld3);
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao3.m1();
}
    boolean lb6 = false;
    boolean lb7 = true;

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
    ad1 = ad2 - ad3;
    ab2 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = !fb1;
    ab1 = !ab2;
if(ao3 != null){
      ao3.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    ab1 = !ab2;
    ab3 = ad1 > ad2;
    if (ab4) {
        Output.points[3][3] -= ad3;
        fb0 = ad4 > fd0;
        boolean lb0 = true;
        Output.points[3][4] -= fd1;
        boolean lb1 = true;
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
        boolean lb2 = false;
        boolean lb3 = false;
        Output.points[3][5] += ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m2(ad3, ad4, fd0, fd1);
}
        Output.points[3][6] -= ad1;
        Output.points[3][7] -= ad2;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 300.03492441347436;
    fb0 = ld0 > fd0;
    Thought lo1 = Thought396.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
    fb1 = ld0 > fd0;
    double ld2 = 985.701253246857;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 + ld0;
    ld2 = fd0 + fd1;
    double ld3 = 90.14591287783836;
if(fo0 != null){
      ld0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = ld2 > ld3;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
    boolean lb4 = true;
    boolean lb5 = false;
    if (lb5) {
        boolean lb6 = false;
        ld2 = ld3 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld2, ld3, lb5, fb0, fb1, lb6);
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
    Output.points[3][8] -= fd0;
    ab2 = !ab3;
    Thought lo0 = Thought289.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
    double ld1 = 939.2147345720521;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fb0 = fb1 && ab1;
    boolean lb2 = false;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = lb2 || ab1;
    ab2 = fd1 < ld1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        ad2 = ad3 - ad4;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = fd0 < fd1;
        ad1 *= -1;
        Thought lo0 = Thought353.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] += ad1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 120.0414154083604;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    double ld2 = 400.66200825176094;
if(fo0 != null){
      ld0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    double ld3 = 391.3327143187742;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
    boolean lb4 = true;
    double ld5 = 903.5312489860669;
    Output.points[4][1] -= ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, lb4, ab1, ab2, ab3);
}
    Thought lo6 = Thought197.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld2 *= -1;
if(fo0 != null){
      lb4 = fo0.m2(ld3, ld5, ad1, ad2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
        fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
    double ld1 = 313.6367261156593;
    double ld2 = 723.7875917237814;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m1(ld2, fd0, fd1, ld1);
}
    ld2 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ld1, ld2, fd0, fd1);
}
    Output.points[4][2] += ld1;
    Thought lo3 = Thought81.getInstance();
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, fb0, fb1);
}
    ld2 = fd0 + fd1;
    ld1 = ld2 + fd0;
    lb0 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld1, ld2, fd0, fb0, fb1, lb0, fb0);
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
    Output.points[4][3] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd1 = ad1 + ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    Thought lo0 = Thought192.getInstance(ao3, ao4, fo0, fo1);
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
        ad3 = ad4 + fd0;
        fb1 = !fb0;
        Output.points[4][4] -= fd1;
        fb1 = ad1 > ad2;
        fb0 = ad3 < ad4;
        fd0 = fd1 - ad1;
        fb1 = fb0 || fb1;
        ad2 *= -1;
        fb0 = ad3 > ad4;
        fb1 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ad1;
        ad2 = ad3 - ad4;
        double ld1 = 613.3331090525488;
        fb0 = !fb1;
        ad4 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        double ld0 = 861.0080882688654;
        fb1 = ab1 && ab2;
        fd0 *= -1;
        if (ab3) {
            ab4 = fb0 || fb1;
            boolean lb1 = false;
            Thought lo2 = Thought375.getInstance();
            boolean lb3 = true;
            double ld4 = 212.05454880026028;
            lb1 = !lb3;
            fd0 = fd1 + ld4;
            ab1 = ld0 > fd0;
            ab2 = !ab3;
if(ao1 != null){
              ab4 = ao1.m2(fb0, fb1, lb1, lb3);
}
            Output.points[4][5] += fd1;
            Thought lo5 = Thought299.getInstance(ao2, ao3, ao4, fo0, ld4, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
              fb0 = fo1.m2(ld4, ld0, fd0, fd1, fb1, lb1, lb3, ab1);
}
if(ao1 != null){
              ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    if (ab1) {
if(ao2 != null){
          ao2.m1(ad2, ad3, ad4, fd0);
}
        ab2 = ab3 && ab4;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        fb0 = ad4 > fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
        ab4 = fd1 < ad1;
        fb0 = ad2 < ad3;
        fb1 = ad4 > fd0;
        } else {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        ad4 = fd0 - fd1;
        fb0 = !fb1;
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        boolean lb0 = false;
        fd0 = fd1 - ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
        ad2 = ad3 + ad4;
        ab1 = fd0 < fd1;
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
    fb0 = fd1 < fd0;
    double ld0 = 233.23891422368487;
    Thought lo1 = Thought57.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought370.getInstance(fd0, fd1, ld0, fd0);
    fb1 = !fb0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb3 = false;
    fb0 = ld0 > fd0;
    fd1 = ld0 + fd0;
    Output.points[4][6] += fd1;
    Thought lo4 = Thought133.getInstance();
    for(int i0=0; i0<10; i0++){
        fb1 = ld0 > fd0;
        Thought lo5 = Thought384.getInstance(lb3, fb0, fb1, lb3);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb3, fb0);
}
        double ld6 = 864.9988179410012;
        ld6 *= -1;
        boolean lb7 = false;
if(fo1 != null){
          fb0 = fo1.m2(ld0, fd0, fd1, ld6, fb1, lb7, lb3, fb0);
}
        boolean lb8 = false;
        boolean lb9 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb7);
}
if(fo0 != null){
          lb8 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(ld0, fd0, fd1, ld6);
}
        boolean lb10 = true;
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
    boolean lb0 = true;
    boolean lb1 = true;
        double ld2 = 820.4549067936457;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld3 = 417.4532936982957;
    boolean lb4 = false;
    lb0 = lb1 && lb4;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, fb0, fb1, lb0, lb1);
}
        lb4 = fd0 < fd1;
if(fo0 != null){
      ld2 = fo0.m3(ld3, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld6 = 326.72122479665813;
    Thought lo7 = Thought227.getInstance(ld2, ld3, ld6, fd0);
    double ld8 = 985.1982998365777;
    lb1 = fd0 > fd1;
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ld3, ld6, ld8);
}
    Thought lo9 = Thought283.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb5, ab1, ab2, ab3);
}
    fd0 *= -1;
    double ld10 = 399.9371794410604;
    fd0 *= -1;
    ab4 = fd1 < ld2;

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
    for(int i0=0; i0<10; i0++){
        double ld0 = 747.0913215988668;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fb1 = fd0 < fd1;
        ld0 *= -1;
        ad1 *= -1;
        Output.points[4][7] += ad2;
if(fo0 != null){
          fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        Output.points[4][8] -= ld0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        Output.points[5][0] += ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
        Thought lo1 = Thought242.getInstance();
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
        Output.points[5][1] -= ad4;
        fd0 *= -1;
        boolean lb2 = true;
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
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(ab2, ab3, ab4, fb0);
}
    Output.points[5][2] += fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    fb0 = fd1 < ad1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
        fd1 = ad1 + ad2;
        ad3 *= -1;
        Thought lo0 = Thought193.getInstance(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
        ad2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad3 = ad4 + fd0;
        fd1 = ad1 + ad2;
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
    double ld0 = 943.056300218237;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought235.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
    double ld2 = 882.0533076023805;
    Output.points[5][3] -= fd0;
    fd1 *= -1;
    fb1 = ld0 < ld2;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
    Output.points[5][4] += ld2;

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
    Thought lo0 = Thought301.getInstance();
    boolean lb1 = false;
    Output.points[5][5] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, fb0);
}
    fb1 = ad2 < ad3;
    lb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao4.m1();
}
    if (fb0) {
        fb1 = !lb1;
if(fo1 != null){
          fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
}
        lb2 = !fb0;
if(ao1 != null){
          fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb1, lb1, lb2, fb0);
}
        fd0 *= -1;
        if (fb1) {
if(ao2 != null){
              ao2.m3(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    double ld0 = 476.66911992448587;
    boolean lb1 = true;
    double ld2 = 892.2186289279562;
    ab4 = fb0 || fb1;
    ld0 = ld2 - fd0;
    lb1 = fd1 > ld0;
    ld2 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ld0 = ld2 + fd0;
if(ao1 != null){
      ab4 = ao1.m2(fd1, ld0, ld2, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ld2, fd0);
}
    Output.points[5][6] += fd1;
    fb0 = !fb1;
    boolean lb3 = false;
    ld0 = ld2 + fd0;

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
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
        ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 = ad3 + ad4;
    ab3 = fd0 > fd1;
    boolean lb0 = false;
    Output.points[5][7] -= ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    Output.points[5][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought29.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3();
}
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Thought lo2 = Thought340.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought180.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
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
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought185.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    lb1 = lb2 || fb0;
    fd1 *= -1;
    Thought lo3 = Thought100.getInstance(fd0, fd1, fd0, fd1);
    Thought lo4 = Thought37.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);

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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1();
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 172.6222204735947;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fb1 = ld0 < fd0;
    boolean lb1 = false;

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
