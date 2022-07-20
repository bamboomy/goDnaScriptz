package genetic;
import java.util.ArrayList;
class Thought96 extends Thought{
private static ArrayList<Thought96> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 516.5243403506453;
private double fd1 = 733.059976706251;
private Thought fo0 = null;
private Thought fo1 = null;
Thought96 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought96 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought96 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought96 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought96 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought288.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought110.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    double ld3 = 805.8767718716348;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0, fb1, lb2, fb0, fb1);
}
    boolean lb4 = false;
    double ld5 = 584.1087107267223;
    boolean lb6 = false;
    boolean lb7 = true;
    lb2 = !lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb6, lb7, fb0, fb1);
}
    lb2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[4][1] -= ld3;
    double ld8 = 681.9955565132449;
if(fo0 != null){
      fo1 = fo0.m4(ld5, ld8, fd0, fd1);
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
    ab2 = ab3 && ab4;
    double ld0 = 450.6403926549457;
    Output.points[4][2] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 + fd0;
        fd1 = ld0 - fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
        ab3 = fd1 < ld0;
        Thought lo1 = Thought152.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
        }
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    boolean lb2 = false;
    for(int i1=0; i1<10; i1++){
        double ld3 = 393.5154951779521;
        Output.points[4][3] -= ld3;
        Thought lo4 = Thought319.getInstance(fo0, fo1, fo0, fo1);
        ab3 = ld0 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld3, ld0, fd0);
}
        boolean lb5 = false;
        fd1 *= -1;
        Output.points[4][4] += ld3;
        ld0 = fd0 - fd1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad2 = fo0.m3(lb0, fb0, fb1, lb0);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
        fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought341.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 694.0416396462604;
    Thought lo2 = Thought31.getInstance(ad4, fd0, fd1, ld1);
    fb1 = ab1 || ab2;
    ad1 = ad2 + ad3;
    double ld3 = 51.69584020614628;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld4 = 623.0913789271693;
if(fo1 != null){
      fo1.m3();
}
    ab3 = ld1 < ld3;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ld4 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ld1 + ld3;
if(fo1 != null){
      ab2 = fo1.m2(ld4, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
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
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fb1 = lb0 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
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
    fb1 = ad1 > ad2;
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought156.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    fb1 = fb0 && fb1;
    fd0 = fd1 - ad1;
    boolean lb1 = false;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    fb1 = ad2 > ad3;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, lb1, lb2, fb0, fb1);
}
    ad2 *= -1;
    lb1 = !lb2;
    ad3 *= -1;
    Thought lo3 = Thought275.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb2);
    double ld4 = 831.4098893009267;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1);
}
    boolean lb5 = false;

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
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought265.getInstance();
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab1 = fd1 < fd0;
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    double ld3 = 269.80380882965204;
    boolean lb4 = false;
    ab3 = fd0 > fd1;
if(ao1 != null){
      ld3 = ao1.m3(fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = ld3 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, lb4, ab1, ab2);
}
    fd1 = ld3 - fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = false;
        fd1 = ld3 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld3, fd0, fd1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 492.6278385566406;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    ab1 = fd1 > ld0;
    ab2 = ab3 && ab4;
        fb0 = fb1 || ab1;
    boolean lb1 = false;
    double ld2 = 875.6032529206567;
    boolean lb3 = false;
if(ao3 != null){
      lb3 = ao3.m2(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3, fb0, fb1, lb1, lb3);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb3);
}
    double ld4 = 458.0793436905458;

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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    Thought lo1 = Thought348.getInstance(fd0, fd1, fd0, fd1);
    Output.points[4][5] += fd0;
    fb0 = !fb1;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb2 = true;
    boolean lb3 = true;
    fd1 *= -1;
    lb2 = fd0 > fd1;

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
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought221.getInstance(fo0, fo1, fo0, fo1);
        boolean lb1 = false;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || lb1;
        double ld2 = 247.62531494473853;
        }
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    boolean lb4 = false;
    ab1 = fd1 > fd0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, lb4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb3, lb4);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb4);
}
        Thought lo5 = Thought41.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
if(fo0 != null){
      fo0.m2();
}
    Thought lo0 = Thought58.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought287.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought231.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb3 = false;
    ad4 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fb0 && fb1;
    boolean lb3 = true;
    Output.points[4][6] -= ad1;
    boolean lb4 = true;
    lb0 = lb1 && lb2;
    boolean lb5 = true;
    lb3 = !lb4;
    lb5 = ad2 < ad3;

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
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    Output.points[4][7] += fd1;
    fd0 = fd1 + fd0;
    if (lb0) {
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb1, lb0, fb0, fb1);
}
        if (lb1) {
if(ao3 != null){
              lb0 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb0);
}
            Thought lo2 = Thought384.getInstance(ao2, ao3, ao4, fo0);
            Output.points[4][8] -= fd1;
            fb0 = fd0 < fd1;
if(fo1 != null){
              fo1.m3(fd0, fd1, fd0, fd1);
}
            fb1 = fd0 < fd1;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
            Thought lo3 = Thought375.getInstance();
if(ao1 != null){
              fd0 = ao1.m3(lb1, lb0, fb0, fb1);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, lb0, fb0, fb1);
}
            lb1 = lb0 && fb0;
            } else {
if(ao3 != null){
              ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb0, fb0);
}
}}
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
    fb1 = !fb0;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    ad2 *= -1;
    ad3 *= -1;
    double ld1 = 18.60557601671098;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ld1 = ad1 + ad2;
    lb0 = fb0 || fb1;
        lb0 = ad3 > ad4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao2.m1();
}
    fb0 = fb1 || lb0;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1, fb0, fb1, lb0, lb2);
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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb1 = false;
    Thought lo2 = Thought9.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld3 = 283.07282017699754;
    ld3 *= -1;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao3.m3(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Output.points[5][0] += fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;
    fb1 = fd1 < ad1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = ab4 && fb0;
    ad1 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;

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
    fd1 *= -1;
    boolean lb0 = false;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = fd1 > fd0;
    double ld1 = 640.0267815289765;
    boolean lb2 = true;
    lb2 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
    double ld3 = 940.2396419724615;
    fb1 = ld1 > ld3;
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 > fd1;
        Thought lo4 = Thought23.getInstance(fo0, fo1, fo0, fo1, ld1, ld3, fd0, fd1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2();
}
    boolean lb0 = false;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    if (fb1) {
        fd1 *= -1;
        double ld1 = 485.0731334872395;
if(fo1 != null){
          fo1.m1(lb0, ab1, ab2, ab3);
}
        ld1 *= -1;
        ab4 = fb0 || fb1;
        fd0 = fd1 + ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
}
        ab4 = fd1 > ld1;
        fd0 *= -1;
        Output.points[5][1] -= fd1;
        boolean lb2 = true;
        } else {
        fb0 = fd0 > fd1;
        fb1 = fd0 > fd1;
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
    double ld0 = 580.001940497238;
    double ld1 = 353.04157722038354;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld2 = 790.9769253398391;
    fb1 = ad3 > ad4;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld0;
    double ld4 = 389.84803589991066;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(ld1, ld2, ld4, ad1);
}
    boolean lb5 = true;
    boolean lb6 = false;
    lb3 = ad2 > ad3;
    if (lb5) {
if(fo0 != null){
          lb6 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
        fb1 = ld1 < ld2;
if(fo1 != null){
          fo0 = fo1.m4(lb3, lb5, lb6, fb0);
}
        ld4 *= -1;
        Thought lo7 = Thought136.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb3, lb5, lb6);
        fd0 = fd1 - ld0;
        ld1 = ld2 - ld4;
        ad1 = ad2 - ad3;
        fb0 = fb1 || lb3;
        ad4 = fd0 - fd1;
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
    ad2 *= -1;
    Thought lo0 = Thought162.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 21.003264600184117;
if(fo0 != null){
          fo0.m2();
}
        Output.points[5][2] -= ad3;
        Thought lo2 = Thought2.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        Output.points[5][3] -= fd1;
        fb1 = ab1 || ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo3 = Thought38.getInstance(ad1, ad2, ad3, ad4);
        fd0 = fd1 - ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought264.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 || fb0;
    fd1 = fd0 + fd1;
    double ld3 = 701.4107521153127;
if(fo1 != null){
      ld3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Output.points[5][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3);
}
    fb1 = lb1 || lb2;
    double ld4 = 190.73426175333543;
    Output.points[5][5] -= ld4;
    fd0 = fd1 + ld3;
    fb0 = fb1 || lb1;
    boolean lb5 = true;
    boolean lb6 = false;
if(ao1 != null){
      ld4 = ao1.m3();
}
    lb2 = fd0 > fd1;
    double ld7 = 752.0871488608104;
if(ao2 != null){
      ao2.m3(lb5, lb6, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 *= -1;
    lb0 = lb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    double ld2 = 488.02916539156945;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    double ld3 = 244.63512242739296;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb0 = !lb1;
    boolean lb4 = true;
    lb4 = ad4 < fd0;
if(fo1 != null){
      fo1.m2(fd1, ld2, ld3, ad1);
}
    ad2 = ad3 - ad4;
    double ld5 = 354.34056575632377;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
    ld3 = ld5 - ad1;
    boolean lb6 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
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
    ab1 = ab2 && ab3;
    if (ab4) {
        boolean lb0 = true;
        Thought lo1 = Thought43.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
        ab1 = ab2 && ab3;
        fd1 = fd0 - fd1;
        Output.points[5][6] += fd0;
        double ld2 = 471.1299711871079;
        } else if (fb0) {
        fd1 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - ad1;
    Output.points[5][7] -= ad2;
    Thought lo2 = Thought93.getInstance(ad3, ad4, fd0, fd1);
    Thought lo3 = Thought1.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
    boolean lb4 = false;
    fd0 *= -1;
    fd1 *= -1;
    lb1 = !lb4;
if(ao4 != null){
      ao4.m1();
}
    boolean lb5 = false;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(lb5, ab1, ab2, ab3);
}
    Output.points[5][8] -= ad4;
    double ld6 = 870.6031976826741;
    Thought lo7 = Thought48.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld6, ab4, fb0, fb1, lb0);
    lb1 = ad1 < ad2;
    ad3 = ad4 - fd0;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld0 = 18.795531823473333;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Output.points[6][0] -= fd0;
    double ld1 = 470.48787806478225;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        lb0 = ad3 > ad4;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        }
    Thought lo1 = Thought291.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 350.1912960421781;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    Output.points[6][1] -= ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ld2 + ad1;
    Output.points[6][2] += ad2;
    ad3 = ad4 - fd0;
    fd1 = ld2 - ad1;

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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fd0 *= -1;
    Thought lo0 = Thought245.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    if (ab1) {
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
        double ld1 = 448.2930602431288;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 > ld1;
        ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb2 = false;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
        ab3 = ab4 || fb0;
if(fo1 != null){
          fb1 = fo1.m2();
}
        for(int i0=0; i0<10; i0++){
}}
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
    double ld0 = 51.863582257835986;
    ld0 *= -1;
    Output.points[6][3] -= fd0;
    double ld1 = 977.5871182622898;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ld0 = ld1 - fd0;
    Thought lo2 = Thought210.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = !fb0;
    fb1 = ld0 > ld1;
    boolean lb3 = true;
    Output.points[6][4] -= fd0;
    Thought lo4 = Thought188.getInstance(fd1, ld0, ld1, fd0);
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0);
}
if(ao2 != null){
      ao2.m1();
}
    Thought lo5 = Thought120.getInstance(fb0, fb1, lb3, fb0);
    Thought lo6 = Thought21.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0, fb1, lb3, fb0, fb1);
if(ao1 != null){
      fd1 = ao1.m3(ld0, ld1, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb3, fb0);
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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    fb1 = ad1 > ad2;
    ad3 *= -1;
    ad4 *= -1;
    fb0 = !fb1;
    Output.points[6][5] += fd0;
    fb0 = !fb1;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    lb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Thought lo1 = Thought70.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
    Thought lo2 = Thought312.getInstance();
    fb0 = ad4 > fd0;
    Thought lo3 = Thought339.getInstance(fb1, lb0, fb0, fb1);

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
    Thought lo0 = Thought132.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab3 = !ab4;
    double ld1 = 651.1709248977246;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ld1 < fd0;
    ab1 = !ab2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
if(ao4 != null){
      ld1 = ao4.m3(fd0, fd1, ld1, fd0);
}
    ab2 = ab3 && ab4;
    Thought lo3 = Thought263.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab4 = ld1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb2, lb4, ab1);
}
    ab2 = !ab3;
    fd1 = ld1 - fd0;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought33.getInstance(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ad4 = fd0 - fd1;
    Output.points[6][6] += ad1;
    double ld1 = 469.48684169506305;
    ab4 = fb0 || fb1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
}
        ab4 = !fb0;
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    boolean lb3 = true;
    fd1 = ld1 + ad1;
    lb2 = ad2 < ad3;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    lb3 = ab1 && ab2;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    double ld0 = 398.8891802028891;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    double ld1 = 560.8114869464912;
    ld1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = !fb1;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    lb2 = !fb0;
    double ld3 = 186.9398461918753;
    Output.points[6][7] += fd0;
    Thought lo4 = Thought10.getInstance(fb1, lb2, fb0, fb1);
    fd1 = ld0 - ld1;
    lb2 = fb0 || fb1;
    double ld5 = 619.5082882454996;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld3, ld5, fd0, fd1, lb2, fb0, fb1, lb2);
}
    ld0 = ld1 + ld3;
    ld5 = fd0 - fd1;
    Thought lo6 = Thought173.getInstance(ld0, ld1, ld3, ld5, fb0, fb1, lb2, fb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 602.8009633561566;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 528.0167740778755;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    Output.points[6][8] -= ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
    ld0 *= -1;
    fb0 = ld1 < fd0;
    fb1 = lb2 || fb0;

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
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo0 = Thought290.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    double ld2 = 635.8843375187996;
        fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    Output.points[7][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][1] += ld2;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    fd0 = fd1 + ld2;
    Thought lo4 = Thought108.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb3, fb0, fb1);
}
    fd0 = fd1 + ld2;
    lb1 = fd0 < fd1;

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
