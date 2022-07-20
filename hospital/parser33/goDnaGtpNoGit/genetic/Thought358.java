package genetic;
import java.util.ArrayList;
class Thought358 extends Thought{
private static ArrayList<Thought358> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 733.5046403223296;
private double fd1 = 893.4138931313005;
private Thought fo0 = null;
private Thought fo1 = null;
Thought358 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought358 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought358 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought358 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought358 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought358 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought358 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought358 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought358 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought358 instance = new Thought358 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought358 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought358 instance = new Thought358 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought358 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought358 instance = new Thought358 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought358 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought358 instance = new Thought358 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought358 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought358 instance = new Thought358 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought358 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought358 instance = new Thought358 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought358 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought358 instance = new Thought358 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought358 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought358 instance = new Thought358 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
    Thought lo0 = Thought58.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[2][8] -= fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    Thought lo3 = Thought239.getInstance(fd1, fd0, fd1, fd0);
    Thought lo4 = Thought246.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    lb5 = fd1 < fd0;
    Output.points[3][0] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, lb2);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb1);
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
    double ld0 = 81.08149632875482;
    Thought lo1 = Thought194.getInstance(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    double ld3 = 190.27120541457208;
    ab2 = ab3 && ab4;
    ld0 *= -1;
    double ld4 = 553.7651443303743;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld3, ld4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld3, ld4, fd0, ab2, ab3, ab4, fb0);
}
    double ld5 = 971.7847509187536;
    double ld6 = 346.43866735131184;
    Thought lo7 = Thought358.getInstance(ld6, fd0, fd1, ld0, fb1, lb2, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb2 = ab1 || ab2;
    ab3 = ld3 > ld4;
if(fo0 != null){
      ld5 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = ld6 < fd0;
    fb0 = fb1 && lb2;

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought96.getInstance();
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
        boolean lb3 = true;
        fd1 = ad1 - ad2;
        lb2 = fb0 && fb1;
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
    Output.points[3][1] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    ab1 = fd1 > ad1;
    double ld0 = 621.3954902208985;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    Output.points[3][2] += ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ad1, fb1, lb1, lb2, ab1);
}
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        ab2 = ab3 || ab4;
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
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Thought lo0 = Thought114.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought41.getInstance(fo1, ao1, ao2, ao3);
    Output.points[3][3] -= fd0;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4();
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
    double ld0 = 831.7077929608242;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = !fb0;
    fb1 = lb1 && fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    ad1 = ad2 - ad3;
    fb1 = lb1 && fb0;
    boolean lb2 = false;
    ad4 = fd0 - fd1;
    double ld3 = 358.40802064350765;
    fb0 = !fb1;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb2 = ld0 < ld3;
    Output.points[3][4] += ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld3, ad1, ad2);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        lb1 = ld0 < ld3;
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
if(ao2 != null){
      ao2.m2();
}
    boolean lb0 = false;
if(ao3 != null){
      fd0 = ao3.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 *= -1;
    double ld1 = 542.7829063981889;
    ld1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 > fd1;
    boolean lb2 = true;
    ld1 = fd0 + fd1;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    boolean lb3 = false;
    lb2 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    lb3 = fd0 < fd1;
if(ao4 != null){
      ao4.m2(ld1, fd0, fd1, ld1);
}
    if (ab1) {
        ab2 = fd0 > fd1;
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
    Thought lo1 = Thought367.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
    lb2 = ab1 && ab2;
    ab3 = ad4 < fd0;
    ab4 = fd1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    double ld3 = 23.25169753183231;
    fb0 = fb1 && lb0;
    ad4 = fd0 + fd1;
    lb2 = ab1 && ab2;
    ld3 = ad1 + ad2;
    ab3 = ad3 > ad4;
    fd0 = fd1 + ld3;
    ad1 = ad2 - ad3;
    Thought lo4 = Thought308.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb2 = ab1 && ab2;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought36.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought99.getInstance();
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    double ld3 = 48.375989901589826;
    Output.points[3][5] += ld3;
    Output.points[3][6] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, lb2, fb0, fb1, lb2);
}
    ld3 *= -1;
    fb0 = fb1 && lb2;
    double ld4 = 65.27425982796527;
    boolean lb5 = false;
if(fo0 != null){
      ld4 = fo0.m3(fd0, fd1, ld3, ld4, lb5, fb0, fb1, lb2);
}
    Thought lo6 = Thought385.getInstance(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb2);
    double ld7 = 960.840872295389;
    double ld8 = 741.2842591442203;
if(fo1 != null){
      ld7 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb5 = fb0 || fb1;
    lb2 = !lb5;
    ld8 *= -1;
    fb0 = !fb1;
    fd0 = fd1 - ld3;
if(fo0 != null){
      fo0.m1(ld4, ld7, ld8, fd0);
}
    lb2 = lb5 || fb0;

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
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        boolean lb0 = true;
        double ld1 = 758.0597636713774;
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
        }
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought231.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fd0 *= -1;

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
    fb1 = !fb0;
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought300.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb0 = fb1 || fb0;
    fb1 = ad3 > ad4;
    double ld1 = 185.46439837428818;
    boolean lb2 = false;
    lb2 = ad4 < fd0;
    Thought lo3 = Thought24.getInstance();
if(fo1 != null){
      fo1.m2(fb0, fb1, lb2, fb0);
}
    fd1 *= -1;
    fb1 = !lb2;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;
    lb2 = fd0 < fd1;
    ld1 = ad1 + ad2;

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
    boolean lb0 = false;
    lb0 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    double ld1 = 155.28890676802644;
    double ld2 = 890.583822797292;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 688.9146410089327;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 > ld0;
    fb1 = !fb0;
    double ld1 = 883.3763770290461;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[3][7] += ld1;
    boolean lb2 = true;
    fb0 = fd0 > fd1;
    ld0 = ld1 + fd0;
    Thought lo3 = Thought204.getInstance(fb1, lb2, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld1, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    if (fb0) {
if(ao4 != null){
          fb1 = ao4.m2(fd1, ld0, ld1, fd0, lb2, fb0, fb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought130.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    ad2 = ad3 + ad4;
    fd0 *= -1;
        fd1 = ad1 + ad2;
    boolean lb1 = false;
if(fo0 != null){
          lb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought180.getInstance(ad3, ad4, fd0, fd1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    fd1 = ad1 + ad2;
    fb0 = !fb1;
    ad3 *= -1;
if(ao4 != null){
      lb1 = ao4.m2(fb0, fb1, lb1, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    Thought lo3 = Thought271.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb4 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, lb2, lb4, ab1, ab2);
}
    ab3 = !ab4;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
        Thought lo5 = Thought48.getInstance();
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + fd0;
    lb2 = fd1 < fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fb0 = ao1.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad4 = fd0 + fd1;
        ab2 = ab3 && ab4;
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
        fb0 = !fb1;
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        boolean lb0 = true;
        ab1 = ab2 && ab3;
if(ao2 != null){
          ao2.m1();
}
        double ld1 = 877.9831757474572;
        for(int i1=0; i1<10; i1++){
            ad3 *= -1;
            ad4 = fd0 + fd1;
if(ao3 != null){
              ab4 = ao3.m2(fb0, fb1, lb0, ab1);
}
            double ld2 = 656.8080008210419;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought256.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    double ld2 = 150.8728862433168;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;
    ld2 *= -1;
    double ld3 = 201.414095307374;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 181.02966703166678;
    fd0 = fd1 + ld0;
    Output.points[3][8] -= fd0;
    fb1 = fd1 > ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        double ld1 = 514.1150927838315;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    ld1 = fd0 + fd1;
    fb0 = ld0 < ld1;

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
    double ld0 = 474.2129625546608;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    fb1 = ld0 < ad1;
    Thought lo2 = Thought160.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought347.getInstance(lb1, fb0, fb1, lb1);
    Thought lo4 = Thought126.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, lb1, fb0);
    boolean lb5 = true;
    ad3 *= -1;
    boolean lb6 = true;
    double ld7 = 219.93083349280832;
if(fo1 != null){
      lb6 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb5);
}
    lb6 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb5, lb6, fb0);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ab3 = ab4 || fb0;
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    Thought lo0 = Thought330.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
      ad4 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
        ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;

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
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought141.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought170.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = fd1 > fd0;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = !fb1;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    double ld0 = 585.632500543527;
    Output.points[4][0] -= ad4;
    Thought lo1 = Thought241.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ld0;
    double ld2 = 870.4674807849534;
    double ld3 = 588.8085486412665;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ld2 = ld3 - ad1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, ld2, ld3);
}
    Output.points[4][1] -= ad1;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought263.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, ld2, ld3, lb5, fb0, fb1, lb5);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb5, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld2, ld3);
}
    lb5 = fb0 && fb1;
    double ld6 = 647.640667123067;
if(ao2 != null){
      lb5 = ao2.m2();
}

Thought.STACK_COUNTER++;
return ld6;
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
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    double ld1 = 328.8476035572859;
    double ld2 = 20.838903866360223;
    double ld3 = 807.8453001475165;
    ld1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ld2, ld3, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld2, ld3, fd0);
}
        fd1 = ld1 + ld2;
    ab1 = ld3 < fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      ao4.m3(ab2, ab3, ab4, fb0);
}
    double ld4 = 395.97907001218033;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && ab1;
        ld1 *= -1;
        ab2 = !ab3;
        ab4 = ld2 > ld3;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Output.points[4][2] -= ad2;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought71.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
    ad1 = ad2 + ad3;
    double ld1 = 988.0805485407428;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1);
}
        ld1 = ad1 + ad2;
        double ld2 = 874.4785760771018;
        fb1 = ab1 || ab2;
        ad2 *= -1;
        double ld3 = 435.0455742033973;
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    lb0 = lb1 || lb2;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    Thought lo3 = Thought176.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
    lb0 = !lb1;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought131.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    double ld1 = 656.6294991184723;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought151.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    ld1 *= -1;
    ab4 = fb0 && fb1;
    Thought lo3 = Thought55.getInstance(fo1, fo0, fo1, fo0);
    ab1 = ab2 && ab3;
    Thought lo4 = Thought109.getInstance(fd0, fd1, ld1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    Thought lo5 = Thought103.getInstance();
    ld1 = fd0 - fd1;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    Thought lo6 = Thought189.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
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
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Output.points[4][3] -= ad1;
    double ld0 = 814.1783430403018;
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    Output.points[4][4] += ad4;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;

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
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = ad3 < ad4;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought303.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought319.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    ad1 *= -1;
    Thought lo2 = Thought250.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Thought lo4 = Thought282.getInstance(fd1, ad1, ad2, ad3);

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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    lb0 = lb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[4][5] += fd0;
if(ao3 != null){
      lb0 = ao3.m2(lb1, fb0, fb1, lb0);
}
    double ld2 = 114.28430004810272;
    double ld3 = 327.39224279884667;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
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
    ad2 *= -1;
    Thought lo0 = Thought1.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    ad1 = ad2 - ad3;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
        ad3 = ad4 - fd0;
    Thought lo1 = Thought384.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      fb1 = ao3.m2(lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
    lb3 = ad4 < fd0;
    fb0 = fd1 < ad1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb2, lb3, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb1, lb2, lb3, fb0);
}
    fb1 = lb2 || lb3;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
if(ao2 != null){
      ab2 = ao2.m2();
}
if(ao3 != null){
      ao3.m1(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    Thought lo0 = Thought372.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = fd0 < fd1;
    double ld1 = 628.1104264048977;
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    ld1 = fd0 - fd1;
    fb0 = ld1 > fd0;
    fd1 = ld1 - fd0;
    fb1 = !lb2;
    Output.points[4][6] += fd1;

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
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought117.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
        Thought lo1 = Thought219.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
          ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
        double ld2 = 492.4845990750049;
        double ld3 = 192.04721900857865;
        ad2 = ad3 + ad4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ld3);
}
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo1.m1();
}
        ab1 = ab2 || ab3;
        ad1 = ad2 - ad3;
        ab4 = ad4 > fd0;
        boolean lb4 = true;
if(ao1 != null){
          fd1 = ao1.m3(ab4, fb0, fb1, lb4);
}
        ab1 = !ab2;
        ld2 *= -1;
        boolean lb5 = true;
        double ld6 = 67.60201655773493;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    double ld2 = 405.08495769367715;
    Thought lo3 = Thought186.getInstance(fo0, fo1, fo0, fo1);
    lb1 = !fb0;
    boolean lb4 = true;
    fb0 = ld2 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 - fd0;
    fb1 = lb0 && lb1;
    Thought lo5 = Thought65.getInstance();
    lb4 = fb0 && fb1;
    double ld6 = 437.579077530229;
    lb0 = !lb1;
    lb4 = fd0 < fd1;
    ld2 *= -1;
if(fo1 != null){
      ld6 = fo1.m3(fb0, fb1, lb0, lb1);
}
    lb4 = fd0 > fd1;
        Output.points[4][7] += ld2;
if(fo0 != null){
      ld6 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld6, fb0, fb1, lb0, lb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][8] -= fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    double ld1 = 566.6878266081585;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    Thought lo2 = Thought236.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + ld1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0);
}
    boolean lb3 = false;
    fb0 = fd1 < ld1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = fd1 < ld1;

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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[5][0] += fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[5][1] -= fd1;
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;

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
