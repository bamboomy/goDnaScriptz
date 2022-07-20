package genetic;
import java.util.ArrayList;
class Thought33 extends Thought{
private static ArrayList<Thought33> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 728.5037760080612;
private double fd1 = 581.6057440284957;
private Thought fo0 = null;
private Thought fo1 = null;
Thought33 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought33 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought33 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought33 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought33 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought300.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[5][6] += fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;

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
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    Output.points[5][7] -= fd1;
    ab4 = fb0 || fb1;
    ab1 = fd0 < fd1;
    boolean lb0 = true;
        fd0 = fd1 + fd0;
    Thought lo1 = Thought125.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1();
}
    boolean lb2 = false;
    boolean lb3 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    double ld4 = 880.3010382758882;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, lb2, lb3, ab1, ab2);
}
    ab3 = ld4 > fd0;
    Thought lo5 = Thought184.getInstance(fd1, ld4, fd0, fd1, ab4, fb0, fb1, lb0);
    ld4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, ab1, ab2);
}
    Thought lo6 = Thought393.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld4);
}
    boolean lb7 = false;

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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb1 = !fb0;
if(fo1 != null){
      ad3 = fo1.m3();
}
    double ld0 = 648.494125057986;
if(fo0 != null){
          ad3 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    if (fb1) {
        fb0 = fb1 && fb0;
        fb1 = !fb0;
        double ld1 = 39.336165835138075;
        Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fo1 = fo0.m4(ld1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad4 = fd0 + fd1;
        double ld3 = 415.7154776155592;
        fb1 = ld1 < ld3;
if(fo1 != null){
          ld0 = fo1.m3(ad1, ad2, ad3, ad4);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3);
}
        Thought lo4 = Thought330.getInstance();
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = ad4 < fd0;
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
    ab1 = ab2 && ab3;
    ab4 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 261.1701642888334;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 627.7775378197656;
if(fo0 != null){
      fo0.m3(fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 *= -1;
    ab3 = ld0 > ld1;
    Output.points[5][8] += ad1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = fd1 > ld0;
        ld1 *= -1;
if(fo0 != null){
          fo0.m1(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        boolean lb2 = false;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb3 = true;
        boolean lb4 = true;
        ab3 = ab4 && fb0;
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
    boolean lb0 = false;
    Thought lo1 = Thought254.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb2 = fb0 && fb1;
    lb0 = lb2 || fb0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    fd0 = fd1 - fd0;
    fb1 = lb0 && lb2;
    boolean lb3 = false;
if(ao2 != null){
      fd1 = ao2.m3(lb3, fb0, fb1, lb0);
}
    lb2 = lb3 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, lb2, lb3);
}
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb2, lb3);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb2);
}
    if (lb3) {
        fb0 = fd0 < fd1;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
        lb0 = lb2 && lb3;
        fd1 = fd0 - fd1;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || lb0;
        boolean lb4 = false;
        Output.points[6][0] += fd1;
        lb0 = fd0 < fd1;
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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad1 = ao4.m3(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    boolean lb0 = false;
    lb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought66.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought245.getInstance(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb3 = true;
    Output.points[6][1] += ad4;
    Thought lo4 = Thought217.getInstance(fd0, fd1, ad1, ad2);
    lb3 = ad3 < ad4;
    boolean lb5 = true;
    lb5 = fb0 && fb1;
    lb0 = lb3 || lb5;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || lb0;
    lb3 = lb5 && fb0;
if(ao3 != null){
      ad3 = ao3.m3();
}
        fb1 = ad4 > fd0;
    if (lb0) {
        fd1 *= -1;
        for(int i0=0; i0<10; i0++){
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
    double ld0 = 757.1973525687741;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd1 > ld0;
    fd0 *= -1;
    ab1 = fd1 > ld0;
    Thought lo1 = Thought27.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
    Output.points[6][2] += fd0;
    fb1 = ab1 || ab2;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0);
}
    if (ab3) {
        Thought lo2 = Thought317.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
        Output.points[6][3] -= ld0;
if(fo1 != null){
          fo1.m2();
}
        fd0 *= -1;
if(ao1 != null){
          ao1.m1(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb3 = false;
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
    Output.points[6][4] += ad1;
if(ao2 != null){
      ab2 = ao2.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought71.getInstance(ao3, ao4, fo0, fo1);
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    Thought lo1 = Thought238.getInstance();
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    ab1 = fd0 > fd1;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought132.getInstance(ab2, ab3, ab4, fb0);
    ad4 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb2, ab1, ab2, ab3);
}
    double ld4 = 258.44799649987397;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              lb2 = ao1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
              fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb2, ab1, ab2);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought199.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought112.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = true;
    fb0 = fd0 < fd1;
    fb1 = lb2 && fb0;
    fd0 = fd1 - fd0;
    boolean lb3 = true;
    double ld4 = 311.9886227630924;
    Thought lo5 = Thought204.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
    fd1 = ld4 + fd0;
    Thought lo6 = Thought290.getInstance();
if(fo0 != null){
      fo0.m3(fb0, fb1, lb2, lb3);
}
    boolean lb7 = false;
    lb7 = !fb0;
    fb1 = fd1 < ld4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, lb2, lb3, lb7, fb0);
}
    boolean lb8 = true;
    for(int i0=0; i0<10; i0++){
        fd1 = ld4 + fd0;
        boolean lb9 = false;
        boolean lb10 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld4, fd0, fd1, lb7, lb8, fb0, fb1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Thought lo0 = Thought318.getInstance(fo0, fo1, fo0, fo1);
    ab3 = !ab4;
    boolean lb1 = false;
    Thought lo2 = Thought27.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[6][5] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    boolean lb3 = true;

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
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
        boolean lb0 = true;
    Thought lo1 = Thought173.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought373.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo3 = Thought250.getInstance();
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    boolean lb4 = true;
    lb0 = !lb4;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb4, fb0, fb1, lb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 188.9309717059049;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 = ad1 - ad2;
    Output.points[6][6] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb1 = ad1 > ad2;
        double ld1 = 156.21397445289506;
        ad2 = ad3 + ad4;
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
    fb1 = fb0 && fb1;
    Thought lo0 = Thought108.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
        fb1 = fd1 < fd0;
        Thought lo1 = Thought368.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        fb0 = !fb1;
        boolean lb2 = false;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb2);
}
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        fd0 *= -1;
        fd1 = fd0 - fd1;
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 83.08714394474664;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Output.points[6][7] -= ad3;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    double ld1 = 90.14024157318917;
    ld0 = ld1 + ad1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ad2 = ad3 - ad4;
    boolean lb2 = true;
    fd0 = fd1 + ld0;
    lb2 = ld1 > ad1;
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    lb2 = fb0 || fb1;

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
    boolean lb0 = true;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
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
    ab1 = ab2 || ab3;
    double ld0 = 233.77340387667059;
    if (ab4) {
if(ao1 != null){
          ld0 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
        fd0 = fd1 - ld0;
        ab3 = ad1 > ad2;
if(fo1 != null){
          fo1.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        boolean lb1 = false;
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
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    double ld0 = 642.0064361194745;
    double ld1 = 587.4813818512068;
    ld0 = ld1 + fd0;
    fb1 = fd1 > ld0;
    fb0 = fb1 || fb0;
    Output.points[6][8] += ld1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
    fd1 = fd0 - fd1;
    ab2 = !ab3;
    fd0 = fd1 + fd0;
    ab4 = fd1 > fd0;
    fb0 = fb1 || ab1;
    ab2 = fd1 < fd0;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 && ab3;

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
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad4 *= -1;
        Thought lo0 = Thought253.getInstance(fb1, fb0, fb1, fb0);
        boolean lb1 = true;
        boolean lb2 = true;
        boolean lb3 = false;
        Output.points[7][0] += fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
          lb1 = fo0.m2(fd0, fd1, ad1, ad2, lb2, lb3, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought235.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
    fb0 = fb1 || lb0;
    lb1 = ad4 > fd0;
    Thought lo3 = Thought123.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      ad4 = fo1.m3();
}
    Thought lo4 = Thought210.getInstance(ab1, ab2, ab3, ab4);
    Thought lo5 = Thought397.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb6 = false;
    ab4 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    Output.points[7][1] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1);
}
    Thought lo7 = Thought200.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fd1 *= -1;
    Thought lo8 = Thought81.getInstance();
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(lb6, ab1, ab2, ab3);
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
    Output.points[7][2] -= fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 477.21322275664073;
    Output.points[7][3] += ld0;
    fd0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = ld0 > fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}

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
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 727.8429179027718;
    Thought lo1 = Thought366.getInstance(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    Thought lo3 = Thought384.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
    fb1 = lb2 || fb0;
    fb1 = lb2 || fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
        double ld5 = 83.81702002430787;
        fb0 = fb1 && lb4;
        boolean lb6 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        if (lb6) {
            double ld7 = 277.58191946784893;
            lb2 = !fb0;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][4] += fd1;
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
    Output.points[7][5] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
    ab2 = fd1 > fd0;
    Output.points[7][6] -= fd1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        ab3 = ab4 || fb0;
if(ao3 != null){
          fb1 = ao3.m2();
}
        fd0 = fd1 + fd0;
        ab1 = fd1 > fd0;
        Output.points[7][7] -= fd1;
        ab2 = ab3 && ab4;
        fb0 = !fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    ab2 = ab3 || ab4;
    double ld0 = 714.2933222913631;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    double ld1 = 144.14254553809803;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought222.getInstance(fd1, ld0, ld1, ad1, ab3, ab4, fb0, fb1);
    Output.points[7][8] -= ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        ad3 = ad4 + fd0;
        fd1 *= -1;
        fb1 = !ab1;
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought235.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < fd0;
        }
    fd1 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2();
}
    Thought lo2 = Thought4.getInstance(fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
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
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought231.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    double ld1 = 847.3462239069702;
    ld1 *= -1;
    boolean lb2 = true;
    ab1 = fd0 < fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ld1 < fd0;
if(fo1 != null){
      ab4 = fo1.m2(fd1, ld1, fd0, fd1);
}
    fb0 = ld1 > fd0;
    fb1 = fd1 < ld1;

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
    if (fb0) {
        if (fb1) {
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            } else {
            Thought lo0 = Thought344.getInstance();
            double ld1 = 374.7043251112082;
            boolean lb2 = true;
if(fo1 != null){
              fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
            fb0 = fd0 > fd1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
            lb2 = ad4 > fd0;
            fd1 *= -1;
                        Output.points[8][0] += ld1;
if(fo1 != null){
              fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
            fb1 = lb2 && fb0;
            fb1 = lb2 || fb0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
            for(int i0=0; i0<10; i0++){
                lb2 = fd0 < fd1;
                fb0 = ld1 > ad1;
                ad2 = ad3 - ad4;
                fb1 = fd0 > fd1;
}}}
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
    double ld0 = 591.1922940855864;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (ab1) {
        double ld1 = 595.1508655704596;
if(fo1 != null){
          ld1 = fo1.m3(ld0, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        Output.points[8][1] -= ld1;
        Output.points[8][2] -= ld0;
        ab2 = ab3 && ab4;
        fb0 = !fb1;
        Thought lo2 = Thought236.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        ab1 = fd0 < fd1;
        Output.points[8][3] += ld1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m3(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        } else if (ab3) {
        boolean lb3 = true;
        ad1 = ad2 + ad3;
        ab3 = !ab4;
        ad4 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, lb3, ab1, ab2);
}
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ld0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        lb3 = ab1 && ab2;
        boolean lb4 = true;
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
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    double ld0 = 3.0698513263631204;
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought240.getInstance(fb0, fb1, fb0, fb1);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ad2 *= -1;
    fb0 = ad3 > ad4;
    Output.points[8][4] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
    fb0 = fb1 && lb0;
    Thought lo2 = Thought303.getInstance();
    Output.points[8][5] += ad2;
if(ao4 != null){
      lb1 = ao4.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    boolean lb3 = true;
    fb0 = fb1 && lb0;
    Output.points[8][6] -= ad1;

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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    ab1 = fd1 > fd0;
    Thought lo0 = Thought136.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    Output.points[8][7] += fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        fb1 = fd0 < fd1;
        ab1 = ab2 && ab3;
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
      ao2.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    ab1 = ad3 < ad4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;
    Thought lo0 = Thought3.getInstance(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
    ab1 = !ab2;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
    boolean lb3 = true;
    ad4 = fd0 - fd1;
    double ld4 = 983.7015038694259;
    boolean lb5 = true;
    lb5 = !ab1;
    Thought lo6 = Thought282.getInstance(ld4, ad1, ad2, ad3);
    boolean lb7 = true;
    Output.points[8][8] -= ad4;
    fd0 *= -1;

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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3();
}
    double ld0 = 204.41182979238624;
        fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo2 = Thought40.getInstance(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 || fb1;
    Thought lo3 = Thought137.getInstance(fd0, fd1, ld0, fd0);
    Output.points[0][0] -= fd1;
    boolean lb4 = false;
    lb1 = lb4 || fb0;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, lb4, lb5);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb4);
}
    Output.points[0][1] += ld0;
    fd0 = fd1 + ld0;
    Output.points[0][2] -= fd0;
    boolean lb6 = false;

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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m1();
}
    fd1 = fd0 - fd1;
    double ld1 = 390.24855652663905;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
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
    Thought lo0 = Thought304.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought31.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    Output.points[0][3] -= fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
    Thought lo3 = Thought42.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought272.getInstance(fd0, fd1, fd0, fd1);
    Output.points[0][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 < fd0;
    fb1 = lb2 || fb0;
        Output.points[0][5] += fd1;
if(fo0 != null){
      fo0.m2(fb1, lb2, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
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
