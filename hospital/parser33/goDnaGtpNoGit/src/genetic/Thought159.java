package genetic;
import java.util.ArrayList;
class Thought159 extends Thought{
private static ArrayList<Thought159> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 200.60991302975523;
private double fd1 = 21.35258103560417;
private Thought fo0 = null;
private Thought fo1 = null;
Thought159 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought159 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought159 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought159 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought159 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought159 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought159 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought159 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought159 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought159 instance = new Thought159 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought159 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought159 instance = new Thought159 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought159 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought159 instance = new Thought159 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought159 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought159 instance = new Thought159 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought159 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought159 instance = new Thought159 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought159 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought159 instance = new Thought159 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought159 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought159 instance = new Thought159 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought159 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought159 instance = new Thought159 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[3][1] -= fd1;

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
    ab1 = fd0 < fd1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    double ld1 = 946.434873223456;
    Output.points[3][2] += fd0;
    ab3 = !ab4;
    fd1 *= -1;
    if (fb0) {
        Output.points[3][3] += ld1;
        fb1 = !lb0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 > ld1;
        fd0 = fd1 - ld1;
        Output.points[3][4] -= fd0;
        fd1 = ld1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
        boolean lb2 = false;
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
    ad1 *= -1;
    double ld0 = 940.9832803227348;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought260.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 303.8684332137758;
    fb0 = ad4 < fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - ld2;

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
    ad1 *= -1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought325.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = ad2 < ad3;
    double ld1 = 380.5251258399992;
    double ld2 = 513.2740341463945;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld2, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    boolean lb4 = true;
        ab3 = ab4 || fb0;
    fb1 = lb3 && lb4;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd1 = ld1 + ld2;
    double ld5 = 268.98222309232597;
    lb3 = lb4 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ld5, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    Output.points[3][5] += fd1;
    boolean lb1 = false;
    lb0 = fd0 > fd1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    boolean lb4 = true;
    boolean lb5 = false;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      lb1 = ao4.m2();
}
if(fo0 != null){
      fo0.m1(lb2, lb3, lb4, lb5);
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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought139.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    lb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    boolean lb2 = false;
    if (lb2) {
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
        fb0 = fd1 < ad1;
        Output.points[3][6] += ad2;
        ad3 = ad4 - fd0;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        fb1 = lb1 && lb2;
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
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3();
}
    Thought lo2 = Thought137.getInstance(fb0, fb1, lb0, lb1);
    Thought lo3 = Thought157.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    ab1 = fd1 > fd0;
    Output.points[3][7] += fd1;
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
    Output.points[3][8] -= fd0;
    lb1 = fd1 < fd0;
    Thought lo4 = Thought23.getInstance();
    ab1 = !ab2;
    double ld5 = 566.056970282378;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
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
    boolean lb0 = false;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, lb0, lb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld2 = 172.03451386092772;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld2);
}
    Thought lo3 = Thought305.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad1 *= -1;
    double ld4 = 392.0246835050514;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    Output.points[4][0] -= fd0;
    lb1 = ab1 && ab2;

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
    fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought179.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, fd0, fd1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = ab4 || fb0;
    double ld0 = 934.1948345413814;
if(fo1 != null){
      fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < ld0;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    ab3 = ab4 && fb0;
    fd0 = fd1 - ld0;
    fb1 = !lb1;
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    boolean lb3 = false;
    lb1 = ld0 > fd0;
    boolean lb4 = false;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    lb0 = ad4 < fd0;
    Thought lo2 = Thought141.getInstance();
    double ld3 = 787.1950546170049;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
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
    Thought lo0 = Thought117.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    double ld1 = 664.4244749007321;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought123.getInstance(fo1, fo0, fo1, fo0);
        Thought lo3 = Thought193.getInstance(ad4, fd0, fd1, ld1);
    Output.points[4][1] += ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        ab4 = fb0 && fb1;
        fd0 = fd1 + ld1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        if (ab1) {
if(fo1 != null){
              fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
            boolean lb4 = true;
            fb0 = fb1 || lb4;
            ad1 *= -1;
            ab1 = ad2 < ad3;
            if (ab2) {
}}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Output.points[4][2] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought137.getInstance(ao3, ao4, fo0, fo1, lb0, lb1, lb2, fb0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        Output.points[4][3] -= fd0;
    Output.points[4][4] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, lb1, lb2);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
    Output.points[4][5] += fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    ad1 *= -1;
    Thought lo0 = Thought251.getInstance(ad2, ad3, ad4, fd0);
    double ld1 = 971.7298053358871;
    fb0 = fd0 < fd1;
    Output.points[4][6] -= ld1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    ld1 *= -1;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
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
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought94.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    ab4 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = ab1 && ab2;
if(fo1 != null){
          ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    ab4 = fd0 > fd1;
    boolean lb3 = true;
    fd0 *= -1;
    boolean lb4 = true;
    if (ab3) {
        Thought lo5 = Thought171.getInstance();
        ab4 = !fb0;
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
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    ad2 *= -1;
    Output.points[4][7] -= ad3;
    Thought lo0 = Thought57.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    fb1 = ad2 > ad3;
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought50.getInstance(ad4, fd0, fd1, ad1, lb1, lb2, lb3, lb4);
    ab1 = ab2 && ab3;
    ab4 = ad2 > ad3;
    double ld6 = 789.7919828705631;
    boolean lb7 = false;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb2);
}
    lb3 = ad3 > ad4;
        Thought lo8 = Thought298.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m2(fd0, fd1, ld6, ad1);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    boolean lb9 = false;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld6, ad1, ad2, ad3);
}
    lb4 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld6 - ad1;
    double ld10 = 89.95902931574213;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    double ld1 = 39.63193331675724;
    fb1 = fd0 > fd1;
    Output.points[4][8] -= ld1;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = ld1 > fd0;
    boolean lb2 = true;
    lb2 = fd1 > ld1;
    boolean lb3 = true;
    Thought lo4 = Thought178.getInstance(fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
    fd1 = ld1 - fd0;
    Thought lo5 = Thought84.getInstance(fo0, fo1, fo0, fo1);
    double ld6 = 844.9433514332369;
    lb0 = fd0 > fd1;
    ld1 = ld6 - fd0;
    lb2 = lb3 || fb0;

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
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    double ld1 = 648.9034052147665;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    ab3 = ld1 < fd0;
    boolean lb2 = false;
    double ld3 = 780.1136483818437;
    boolean lb4 = true;
    Output.points[5][0] += fd0;
    Thought lo5 = Thought95.getInstance(fd1, ld1, ld3, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb2, lb4);
}
    ab1 = ab2 && ab3;

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
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    fb1 = !fb0;
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb0 = ad1 > ad2;
    lb1 = ad3 > ad4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought31.getInstance();
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought165.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
    Output.points[5][1] -= fd0;

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
    ab2 = !ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 74.63816358289598;
    ld0 *= -1;
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb1 = false;
    if (lb1) {
        Thought lo2 = Thought201.getInstance();
if(fo0 != null){
          ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
        fb0 = ad2 < ad3;
        double ld3 = 118.75277641518916;
        fb1 = ad3 < ad4;
        Thought lo4 = Thought327.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld0, lb1, ab1, ab2, ab3);
        ad1 = ad2 - ad3;
        for(int i0=0; i0<10; i0++){
            Thought lo5 = Thought96.getInstance(ad4, fd0, fd1, ld3, ab4, fb0, fb1, lb1);
            ld0 *= -1;
            ad1 = ad2 + ad3;
            boolean lb6 = true;
            boolean lb7 = false;
            double ld8 = 31.28732099903537;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, lb7, lb1, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought36.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[5][2] -= fd1;
    Output.points[5][3] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[5][4] += fd0;
    double ld1 = 385.1090888311001;
    fd0 = fd1 + ld1;
    double ld2 = 987.7735637983678;
    ld2 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fb0 || fb1;
    ld1 = ld2 + fd0;
    boolean lb3 = false;
if(ao2 != null){
      ao2.m2(lb3, fb0, fb1, lb3);
}
    Output.points[5][5] += fd1;
    ld1 = ld2 + fd0;
    Thought lo4 = Thought275.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ld2, fd0, fb0, fb1, lb3, fb0);
    boolean lb5 = false;
    boolean lb6 = false;
    Thought lo7 = Thought102.getInstance(fd1, ld1, ld2, fd0, lb6, fb0, fb1, lb3);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, lb5, lb6, fb0, fb1);
}
    lb3 = fd1 > ld1;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2);
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
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd0 < fd1;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(lb0, lb1, fb0, fb1);
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
    ab1 = fd0 < fd1;
    ab2 = !ab3;
    Output.points[5][6] -= fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought6.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    double ld2 = 899.6516851961145;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld2 - fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        }
    fd1 = ld2 - fd0;
    fb1 = fd1 < ld2;
    fd0 = fd1 - ld2;
    Thought lo4 = Thought364.getInstance(ao2, ao3, ao4, fo0, lb1, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    ld2 = fd0 + fd1;
    ab1 = ab2 && ab3;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m2(ld2, fd0, fd1, ld2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
    Thought lo6 = Thought94.getInstance(ab4, fb0, fb1, lb1);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2, lb5, ab1, ab2, ab3);
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
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    ab1 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ad1 = ad2 - ad3;
    ab4 = ad4 > fd0;
    fb0 = fb1 && lb0;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo1 = Thought110.getInstance(ad3, ad4, fd0, fd1);
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, ab1, ab2, ab3);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought353.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    Output.points[5][7] += fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 974.0634238067354;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought104.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 > ld1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought220.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 < fd0;
    boolean lb4 = false;
    if (fb0) {
        Thought lo5 = Thought99.getInstance(fo1, fo0, fo1, fo0);
        } else if (fb1) {
        fd1 *= -1;
        lb4 = ld1 > fd0;
        if (fb0) {
}}
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
        boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 908.8145164026406;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
    ab1 = fd1 > ld1;
    Output.points[5][8] -= fd0;
    ab2 = fd1 < ld1;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    double ld2 = 165.2555977819458;
    lb0 = !ab1;
    Thought lo3 = Thought29.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
    fb1 = lb0 || ab1;
    boolean lb4 = true;
    Output.points[6][0] += ld2;
    Output.points[6][1] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb4);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld5 = 281.7751382495164;

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
    fb1 = !fb0;
    fb1 = ad1 < ad2;
    Output.points[6][2] -= ad3;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb1 = fd0 > fd1;
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
if(fo1 != null){
      fo1.m1();
}
    ab1 = ad1 > ad2;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought309.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 580.2311207972703;
        ab2 = ab3 || ab4;
    ld1 = ad1 - ad2;
    fb0 = fb1 || ab1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
    ab2 = !ab3;
    ab4 = ad1 > ad2;
    fb0 = fb1 || ab1;
    if (ab2) {
        ab3 = !ab4;
        boolean lb2 = true;
        ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
        if (ab4) {
if(fo0 != null){
              fo0.m3();
}
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, lb2, ab1);
}
}}
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
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fd1 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    lb1 = fb0 && fb1;
    lb0 = fd1 < fd0;
    Output.points[6][3] += fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
        Thought lo3 = Thought236.getInstance(ao2, ao3, ao4, fo0);
        boolean lb4 = false;
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        lb2 = lb4 || lb0;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          fd0 = ao2.m3(lb1, fb0, fb1, lb2);
}
        boolean lb5 = false;
        lb4 = fd1 > fd0;
        boolean lb6 = true;
        fd1 = fd0 - fd1;
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
    ad1 *= -1;
    fb0 = ad2 < ad3;
    fb1 = fb0 || fb1;
    ad4 = fd0 - fd1;
        Thought lo0 = Thought192.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || fb0;
    ad4 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao4.m2();
}
    boolean lb1 = true;
    lb1 = ad1 > ad2;

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
    fd0 = fd1 - fd0;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
            ab1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    double ld0 = 520.9123999557534;
    Thought lo1 = Thought51.getInstance(fo0, fo1, ao1, ao2);

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
    Output.points[6][4] += ad2;
    ab2 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ab3 = ad3 > ad4;
    ab4 = fd0 > fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
        boolean lb0 = true;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought191.getInstance();
    fb1 = ad1 < ad2;
    Output.points[6][5] += ad3;
if(ao3 != null){
      ao3.m2(lb0, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    double ld2 = 827.1518440432072;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ad1);
}
    Output.points[6][6] -= ad2;
if(ao3 != null){
      ao3.m3();
}
    Thought lo4 = Thought297.getInstance(fb1, lb0, lb3, ab1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought331.getInstance(ld2, ad1, ad2, ad3, fb1, lb0, lb3, ab1);
    ab2 = ab3 || ab4;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought18.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    Output.points[6][7] -= fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought200.getInstance();
    fb1 = fd0 < fd1;
    Thought lo2 = Thought332.getInstance(fb0, fb1, fb0, fb1);

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
    lb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Output.points[6][8] -= fd0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 938.6732480083137;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    double ld2 = 140.43698580521848;
    lb0 = fd0 > fd1;
    ld1 *= -1;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    lb0 = ld2 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
    Thought lo4 = Thought52.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, fd0);
}
    lb3 = fb0 || fb1;
    fd1 *= -1;
    lb0 = ld1 < ld2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
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
    fb1 = fd0 > fd1;
    double ld0 = 520.6470622520378;
    fb0 = !fb1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought36.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought218.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    fb0 = fb1 || fb0;
    ld0 = fd0 - fd1;
    Thought lo3 = Thought314.getInstance(fo1, fo0, fo1, fo0);
    ld0 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;

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
