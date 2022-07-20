package genetic;
import java.util.ArrayList;
class Thought317 extends Thought{
private static ArrayList<Thought317> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 940.9411611683037;
private double fd1 = 753.6135349754393;
private Thought fo0 = null;
private Thought fo1 = null;
Thought317 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought317 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought317 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought317 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought317 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought317 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought317 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought317 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought317 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought317 instance = new Thought317 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought317 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought317 instance = new Thought317 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought317 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought317 instance = new Thought317 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought317 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought317 instance = new Thought317 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought317 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought317 instance = new Thought317 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought317 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought317 instance = new Thought317 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought317 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought317 instance = new Thought317 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought317 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought317 instance = new Thought317 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo1 = Thought310.getInstance();
    boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(lb0, lb2, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    boolean lb3 = true;
if(fo1 != null){
      lb2 = fo1.m2(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
    lb2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    boolean lb4 = true;
    lb2 = fd0 > fd1;
    lb3 = !lb4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld5 = 963.496812835345;
    fb0 = ld5 < fd0;
    fb1 = lb0 || lb2;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
        boolean lb1 = false;
    Output.points[2][3] -= fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    if (lb1) {
        ab1 = !ab2;
        fd1 = fd0 - fd1;
        fd0 *= -1;
        double ld2 = 876.4009433306273;
        Thought lo3 = Thought138.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    Output.points[2][4] += ad4;
    Thought lo0 = Thought96.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
        double ld1 = 147.19285693861863;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < ad1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld2 = 51.14889403906933;

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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[2][5] += ad2;
    ad3 = ad4 - fd0;
    ab2 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    double ld0 = 58.92736760594862;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    fb1 = !ab1;
    ad2 = ad3 - ad4;
    double ld1 = 242.4375474003711;
    boolean lb2 = false;
    Thought lo3 = Thought72.getInstance();
    Output.points[2][6] += ad4;
        boolean lb4 = false;
    lb4 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb2, lb4, ab1);
}
    double ld5 = 789.8324101033992;
    double ld6 = 856.1400718836669;

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought47.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
    fd0 *= -1;
    lb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
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
    double ld0 = 552.3532025500787;
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    ad3 *= -1;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fd0 < fd1;

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
    Output.points[2][7] += fd0;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    Output.points[2][8] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought301.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
    Thought lo3 = Thought272.getInstance(fd0, fd1, fd0, fd1);
    double ld4 = 697.7653457255436;
    boolean lb5 = false;
    ld4 *= -1;
    ab4 = fd0 > fd1;
    ld4 = fd0 + fd1;
    ld4 = fd0 + fd1;
    ld4 *= -1;
    fd0 = fd1 + ld4;

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
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        ab2 = ab3 && ab4;
        boolean lb0 = false;
        fd1 *= -1;
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
        }
    Thought lo1 = Thought337.getInstance();
    double ld2 = 946.1223099102369;
    ld2 = ad1 + ad2;
            double ld3 = 181.8682849754242;
    fb0 = ad2 > ad3;
if(ao2 != null){
      fb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    Output.points[3][0] -= ld3;
    boolean lb4 = true;
    ab4 = fb0 && fb1;
if(ao2 != null){
      lb4 = ao2.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    double ld5 = 850.30092154113;
    boolean lb6 = false;
    boolean lb7 = false;
    ab3 = ad4 < fd0;
    ab4 = !fb0;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 650.7724159148945;
    Thought lo2 = Thought273.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
    fd1 = ld1 + fd0;
    fb0 = fd1 < ld1;
    fb1 = lb0 || fb0;
    boolean lb3 = false;
    Thought lo4 = Thought55.getInstance();
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, lb3);
}
    fb0 = !fb1;
    fd0 *= -1;
    lb0 = lb3 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, lb3, fb0);
}
    Thought lo5 = Thought288.getInstance(ld1, fd0, fd1, ld1, fb1, lb0, lb3, fb0);
    fb1 = !lb0;
    Thought lo6 = Thought381.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
    fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld7 = 15.091840098407202;

Thought.STACK_COUNTER++;
return lb3;
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
    double ld1 = 669.6108824767665;
    ab1 = ab2 && ab3;
    ld1 *= -1;
    if (ab4) {
        fb0 = fd0 < fd1;
        double ld2 = 832.0579357986918;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld1, fd0, fd1);
}
        Thought lo3 = Thought113.getInstance();
        } else if (fb1) {
        boolean lb4 = false;
        Thought lo5 = Thought98.getInstance(lb4, lb0, ab1, ab2);
        ld1 = fd0 + fd1;
        ld1 *= -1;
        Thought lo6 = Thought27.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
        Thought lo7 = Thought280.getInstance(fd1, ld1, fd0, fd1, lb4, lb0, ab1, ab2);
        double ld8 = 902.3187040443114;
        ab3 = ld8 < ld1;
        boolean lb9 = true;
        Output.points[3][1] += fd0;
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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    fb0 = ad1 < ad2;
    double ld0 = 377.7726463192426;
    fb1 = fb0 || fb1;
    double ld1 = 946.4560424111532;
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
    ad4 *= -1;
    fb0 = fb1 || lb2;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
        boolean lb0 = false;
        }
    fb0 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb1 = false;
    Thought lo2 = Thought307.getInstance(fb0, fb1, lb1, ab1);

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought354.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    Output.points[3][2] -= fd1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought53.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    boolean lb3 = true;
    lb3 = fb0 && fb1;

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
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    double ld1 = 560.2384220031643;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld1;
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
    Output.points[3][3] += ad1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad2 = ad3 - ad4;
    Thought lo3 = Thought181.getInstance(lb0, lb2, fb0, fb1);
    lb0 = lb2 && fb0;
    fd0 = fd1 + ld1;
    boolean lb4 = true;
    boolean lb5 = true;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb5, lb6, fb0, fb1);
}
    Output.points[3][4] += fd0;
    fd1 = ld1 - ad1;
    double ld7 = 418.11377285359504;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, lb0, lb2, lb4, lb5);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, lb6, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo8 = Thought280.getInstance(ld1, ld7, ad1, ad2);

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
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought97.getInstance();
    ab4 = fb0 && fb1;
    ab1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fd1 *= -1;
    fd0 *= -1;
    fb1 = !ab1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    Output.points[3][5] += fd0;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought286.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = ab1 && ab2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ab2 = ab3 || ab4;
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld2 = 655.7368098484507;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m3(ad4, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
}
    Output.points[3][6] -= ad1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 368.56012861854555;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        fb0 = fb1 && lb2;
        ld1 = fd0 - fd1;
        lb0 = fb0 && fb1;
        lb2 = ld1 > fd0;
        lb0 = fb0 && fb1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    double ld0 = 607.4198275297124;
    double ld1 = 541.9132399677122;
if(fo1 != null){
      ld1 = fo1.m3();
}
    boolean lb2 = false;
    ab4 = fb0 && fb1;
    fd0 = fd1 + ld0;
    ld1 = fd0 - fd1;
    Thought lo3 = Thought391.getInstance(lb2, ab1, ab2, ab3);
    ld0 = ld1 - fd0;
    Output.points[3][7] += fd1;
    Thought lo4 = Thought44.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, ab4, fb0, fb1, lb2);
    Thought lo5 = Thought211.getInstance(ld0, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
    ld0 *= -1;
    Output.points[3][8] += ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad3 *= -1;
    boolean lb1 = true;
    ad4 = fd0 - fd1;

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
    double ld0 = 634.1095111218735;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Thought lo1 = Thought250.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
    boolean lb2 = true;
    ab1 = ad3 < ad4;
    boolean lb3 = false;
    fd0 *= -1;
    boolean lb4 = true;
    boolean lb5 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb6 = false;
        lb3 = !lb4;
        Thought lo7 = Thought64.getInstance();
        Output.points[4][0] -= fd1;
        boolean lb8 = false;
        ld0 *= -1;
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo0.m3(lb4, lb5, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
        lb6 = !lb8;
        double ld9 = 350.590587016061;
        lb2 = !lb3;
        for(int i1=0; i1<10; i1++){
            lb4 = lb5 || ab1;
            double ld10 = 866.9898592404276;
}}
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
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        Output.points[4][1] -= fd0;
        fb1 = lb0 || fb0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
        fd0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
        Thought lo1 = Thought362.getInstance(ao1, ao2, ao3, ao4);
        fd1 = fd0 - fd1;
        fb0 = fb1 || lb0;
        double ld2 = 280.3345388496191;
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
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    Output.points[4][2] -= ad3;
    ad4 = fd0 - fd1;
    fb0 = ad1 > ad2;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao3 != null){
      lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    Thought lo1 = Thought36.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab2 = fd0 < fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought103.getInstance();
    Output.points[4][3] -= fd1;
    double ld1 = 807.5766463037774;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    double ld2 = 10.015990703425214;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ld2, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb3 = true;
    ld1 = ld2 + fd0;
    ab1 = !ab2;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, ld2, fd0);
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
    Output.points[4][4] -= ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ad4 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = ab1 && ab2;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad2 = ad3 + ad4;
    ab3 = !ab4;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
    if (ab4) {
        boolean lb1 = true;
        ab4 = fb0 && fb1;
        double ld2 = 304.7304299165928;
        ad2 = ad3 - ad4;
        lb1 = fd0 > fd1;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb0 = ab1 && ab2;
        ab3 = ab4 && fb0;
        } else {
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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    double ld1 = 677.896506578645;
    fd0 *= -1;
    Thought lo2 = Thought222.getInstance(lb0, fb0, fb1, lb0);
    fd1 = ld1 + fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > ld1;
        fb1 = lb0 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
        Thought lo3 = Thought48.getInstance(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        ld1 = fd0 - fd1;
        ld1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + ld1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
        fb1 = lb0 && fb0;
        Output.points[4][5] += ld1;
        boolean lb4 = false;
        Thought lo5 = Thought18.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
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
    double ld0 = 209.76768378112797;
if(fo0 != null){
      ld0 = fo0.m3();
}
    fd0 = fd1 + ld0;
    ab1 = ab2 || ab3;
    Output.points[4][6] += fd0;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought59.getInstance(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
    Output.points[4][7] -= fd1;
    ld0 *= -1;
    boolean lb2 = true;
    Thought lo3 = Thought240.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    double ld4 = 582.3270980468525;
    ld4 *= -1;
    lb2 = fd0 < fd1;
    ab1 = ld0 > ld4;
    fd0 = fd1 - ld0;
    ab2 = !ab3;
    ab4 = ld4 < fd0;
    boolean lb5 = true;
    fd1 *= -1;

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
    ad1 *= -1;
    Thought lo0 = Thought326.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    if (fb1) {
        double ld1 = 265.89554830397964;
        fb0 = fd0 < fd1;
        boolean lb2 = true;
        Thought lo3 = Thought4.getInstance();
        fb0 = ld1 < ad1;
        double ld4 = 430.62319253254583;
        fb1 = !lb2;
        Thought lo5 = Thought366.getInstance(fb0, fb1, lb2, fb0);
        fb1 = ad1 > ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
        fb0 = !fb1;
        Output.points[4][8] -= ld4;
        lb2 = fb0 || fb1;
        double ld6 = 98.22905945201609;
        ld6 *= -1;
        } else if (fb0) {
        Thought lo7 = Thought42.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
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
    ad2 *= -1;
    boolean lb0 = false;
    ab1 = ad3 < ad4;
    Thought lo1 = Thought48.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[5][0] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = !ab4;
    double ld2 = 145.94102780590225;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;

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
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb0 = lb1 || fb0;
    Thought lo2 = Thought396.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 < fd0;
    Thought lo3 = Thought213.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
    fb0 = fb1 && lb0;
    double ld4 = 228.0261989150728;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld4, fd0, fd1);
}
    boolean lb5 = true;
    Output.points[5][1] -= ld4;

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
    fb0 = ad2 > ad3;
    Output.points[5][2] -= ad4;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    ad1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[5][3] += fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought135.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = !fb0;
    Output.points[5][4] -= ad3;
    ad4 *= -1;
    Output.points[5][5] -= fd0;
    Output.points[5][6] -= fd1;
    fb1 = ad1 < ad2;
    double ld1 = 680.3754657214594;
    ad2 = ad3 + ad4;

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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[5][7] -= fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    Output.points[5][8] += fd0;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought12.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    double ld1 = 854.2128711270382;
    fd0 = fd1 + ld1;
    fb0 = fb1 && ab1;
    boolean lb2 = false;

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
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    double ld1 = 417.30037863298935;
    Thought lo2 = Thought377.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;
    boolean lb3 = true;
    double ld4 = 864.346743129323;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ld4, ad1, ad2);
}
    double ld5 = 103.87713787530457;

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
    double ld0 = 793.0549578391166;
        Thought lo1 = Thought273.getInstance();
    double ld2 = 834.6718273059352;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 = ld2 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought76.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    ld0 = ld2 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 + ld2;
    fd0 = fd1 - ld0;
    Thought lo4 = Thought124.getInstance(ld2, fd0, fd1, ld0);
        boolean lb5 = false;
    Thought lo6 = Thought366.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
    boolean lb7 = true;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb5, lb7, fb0, fb1);
}
    lb5 = lb7 && fb0;

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
    Thought lo0 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    Thought lo1 = Thought347.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Thought lo2 = Thought104.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    Thought lo3 = Thought195.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo4 = Thought145.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo5 = Thought119.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb6 = true;
    fb0 = !fb1;
    lb6 = fb0 || fb1;
    Output.points[6][0] += fd1;
    boolean lb7 = true;

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
    Thought lo0 = Thought113.getInstance(fo0, fo1, fo0, fo1);
    Output.points[6][1] -= fd0;
    fb0 = !fb1;
    Thought lo1 = Thought70.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    Output.points[6][2] -= fd0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld2 = 409.16577034101635;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2, fb1, lb3, fb0, fb1);
}
    Output.points[6][3] += fd0;
    fd1 = ld2 + fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
    fb0 = fb1 || lb3;

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
