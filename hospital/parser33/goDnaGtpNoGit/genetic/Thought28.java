package genetic;
import java.util.ArrayList;
class Thought28 extends Thought{
private static ArrayList<Thought28> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 529.414421365153;
private double fd1 = 308.6687578604209;
private Thought fo0 = null;
private Thought fo1 = null;
Thought28 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought28 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought28 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought28 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought28 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        double ld0 = 733.8176943609894;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        fd0 *= -1;
        fb0 = fd1 < ld0;
        fb1 = fd0 < fd1;
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
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb1 = ab1 || ab2;
    double ld2 = 516.7431391872502;
    Output.points[6][8] += ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    ab3 = fd1 < ld2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought16.getInstance(ab4, fb0, fb1, lb0);
    Thought lo4 = Thought321.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb1, ab1, ab2, ab3);
    fd1 = ld2 + fd0;
    fd1 *= -1;
    Thought lo5 = Thought147.getInstance(ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
    double ld6 = 185.44835712974222;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
    lb0 = ld6 > fd0;
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = !lb7;
    boolean lb8 = true;

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
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    if (fb0) {
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fb1 = fd1 > ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo1 = Thought258.getInstance(lb0, fb0, fb1, lb0);
        fb0 = !fb1;
        Output.points[7][0] -= fd0;
        fd1 = ad1 - ad2;
        Thought lo2 = Thought192.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
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
    boolean lb0 = false;
    ab1 = ad1 > ad2;
    if (ab2) {
        ab3 = ad3 > ad4;
        ab4 = fd0 < fd1;
        fb0 = fb1 || lb0;
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
        fd0 = fd1 + ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        } else {
        ad2 *= -1;
        Thought lo1 = Thought83.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fo0.m1(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        Output.points[7][1] += fd1;
        double ld2 = 753.1298436981094;
        fb0 = fb1 || lb0;
        ab1 = ab2 || ab3;
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
if(ao1 != null){
      ao1.m1();
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo0 = Thought213.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Thought lo1 = Thought395.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld2 = 206.1107866084111;
    fb1 = fd0 < fd1;
    Output.points[7][2] -= ld2;
if(ao1 != null){
      ao1.m1(fd0, fd1, ld2, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb3 = true;
    ld2 *= -1;
    boolean lb4 = true;
    double ld5 = 435.1840934837556;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 266.999001914399;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = ld0 < ad1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
    Thought lo1 = Thought183.getInstance();
    Output.points[7][3] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = !fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    boolean lb2 = false;
    Thought lo3 = Thought29.getInstance(fd0, fd1, ld0, ad1, lb2, fb0, fb1, lb2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb4 = true;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fb0 = fb1 || lb2;

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
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab4 = fb0 || fb1;
    Thought lo0 = Thought110.getInstance(ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    fd0 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
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
if(ao1 != null){
      ab2 = ao1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    ab1 = ab2 || ab3;
    Thought lo1 = Thought37.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 *= -1;

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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Output.points[7][4] -= fd0;
    double ld0 = 281.681743150413;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    Thought lo1 = Thought151.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - ld0;

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
    Output.points[7][5] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    ab1 = fd0 < fd1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb2 = false;
    boolean lb3 = true;
    double ld4 = 6.783550127412299;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought254.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
        boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    lb1 = ad3 < ad4;
    boolean lb2 = true;
    double ld3 = 2.8879226653636896;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ad1, lb2, fb0, fb1, lb1);
}
    Thought lo4 = Thought61.getInstance(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
    double ld5 = 676.311984461273;
    fd0 = fd1 + ld3;
if(fo0 != null){
      ld5 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][6] -= ad1;
    ad2 *= -1;
    lb2 = fb0 && fb1;

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
    Output.points[7][7] += ad1;
    ab2 = !ab3;
    ab4 = ad2 < ad3;
    fb0 = fb1 || ab1;
    Thought lo0 = Thought218.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
    ab2 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    ab3 = ad3 < ad4;
    double ld1 = 699.424563656721;
    double ld2 = 405.92128752526844;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    boolean lb0 = true;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    lb0 = !lb1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ao3.m2(fb1, lb0, lb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fd0 = fd1 + fd0;
    Output.points[7][8] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, lb1, fb0);
}
    fd0 *= -1;
    fb1 = !lb0;
    Thought lo2 = Thought342.getInstance(ao4, fo0, fo1, ao1);
    Thought lo3 = Thought217.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought51.getInstance();
    lb1 = fd1 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, lb1, fb0);
}
    boolean lb5 = false;

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
    fb0 = fb1 || fb0;
    double ld0 = 508.23829445306166;
    fb1 = ad1 < ad2;
    ad3 *= -1;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ld0 = ad1 + ad2;
    Thought lo1 = Thought4.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = false;
if(ao2 != null){
      ao2.m2(fb0, fb1, lb2, fb0);
}
    fd0 = fd1 + ld0;
    ad1 = ad2 - ad3;
    fb1 = lb2 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought178.getInstance(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    lb2 = fd0 < fd1;
        fb0 = fb1 && lb2;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
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
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought147.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    fd0 = fd1 - fd0;
    ab3 = !ab4;
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    double ld2 = 67.56634799054765;
    ab1 = ld2 < fd0;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd1 = ao3.m3(ld2, fd0, fd1, ld2);
}
        ab2 = fd0 > fd1;
        ld2 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2);
}
        ab3 = fd0 < fd1;
        boolean lb3 = true;
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          ld2 = fo1.m3(ab3, ab4, fb0, fb1);
}
        lb3 = lb1 || ab1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ld2, fd0, fd1, ld2, fb1, lb3, lb1, ab1);
}
        fd0 *= -1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fd1 = ld2 - fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        boolean lb4 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 *= -1;
    ad1 *= -1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    fd1 = ad1 - ad2;

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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = fb0 && fb1;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fd1 > fd0;
        fb1 = fd1 > fd0;
if(fo0 != null){
          fo0.m1(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        } else {
        double ld0 = 384.1081020887522;
if(fo1 != null){
          fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          fd1 = fo0.m3(fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    double ld0 = 943.6878900632107;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - fd0;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
    boolean lb1 = true;
    double ld2 = 283.4041441181958;
    ab3 = ab4 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(ld2, fd0, fd1, ld0);
}
    fb1 = ld2 > fd0;
    fd1 = ld0 - ld2;
    fd0 = fd1 - ld0;
    ld2 = fd0 - fd1;
    ld0 = ld2 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3();
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    double ld2 = 260.88573168716295;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = lb1 || fb0;
    double ld3 = 767.2642319813248;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    double ld0 = 805.6787862737514;
    ab3 = ad2 < ad3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
    double ld1 = 959.769244522841;
    Output.points[8][0] -= ld0;
    Thought lo2 = Thought310.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
    lb0 = !lb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought296.getInstance();
    for(int i0=0; i0<10; i0++){
        double ld3 = 244.87744485783014;
        ld3 = fd0 - fd1;
        fb0 = fb1 && lb0;
        lb1 = !fb0;
if(ao2 != null){
          ao2.m1(fb1, lb0, lb1, fb0);
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
    double ld0 = 531.7109779266749;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld1 = 285.3096825605616;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ld1 - ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought118.getInstance();
    fd1 = ld0 + ld1;
if(ao3 != null){
          fb0 = ao3.m2(fb1, fb0, fb1, fb0);
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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    Output.points[8][1] -= fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    ab2 = !ab3;
    Output.points[8][2] -= fd1;
    ab4 = fb0 && fb1;
    lb0 = !lb1;

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
    ad2 *= -1;
    ad3 = ad4 + fd0;
    if (ab1) {
        ab2 = fd1 > ad1;
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 906.7179664229152;
if(fo0 != null){
      ld0 = fo0.m3();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought240.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    double ld3 = 243.4861564643731;
    for(int i0=0; i0<10; i0++){
        double ld4 = 468.76307559045415;
if(fo0 != null){
          ld3 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[8][3] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld4, ld0, ld3);
}
        boolean lb5 = false;
        }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld3, fd0);
}
    fb1 = !lb2;

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
      fd1 = fo1.m3();
}
    double ld0 = 825.3752593936745;
    ab2 = ld0 > fd0;
    Thought lo1 = Thought358.getInstance(ab3, ab4, fb0, fb1);
    fd1 = ld0 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
    if (fb0) {
        fd0 = fd1 - ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
        Output.points[8][4] -= fd1;
if(fo1 != null){
          fo1.m3();
}
        fb1 = ab1 || ab2;
        ld0 = fd0 + fd1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 191.10344988747482;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld1 = 415.9020466404877;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = ld0 > ld1;
    lb2 = ad1 < ad2;
    double ld3 = 710.5914790698748;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    double ld4 = 913.6674013248577;
    boolean lb5 = true;
    Thought lo6 = Thought193.getInstance(ad4, fd0, fd1, ld0);
    ld1 = ld3 - ld4;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, ab1, ab2);
}
    Output.points[8][5] += ad2;
    double ld2 = 770.3279384185295;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
if(fo1 != null){
          fo1.m1(fd1, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
        for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought112.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld2);
}
        ad1 = ad2 + ad3;
        Thought lo4 = Thought83.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
        ab2 = ad1 < ad2;
        if (ab3) {
            Thought lo5 = Thought140.getInstance();
            ab4 = ad3 > ad4;
            boolean lb6 = true;
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
    double ld0 = 188.28554911703432;
        for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        fd0 = fd1 + ld0;
        fd0 = fd1 + ld0;
if(ao1 != null){
          ao1.m1(lb1, fb0, fb1, lb1);
}
        double ld2 = 169.60633670190984;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
}
        double ld3 = 112.12073906402487;
        fb1 = !lb1;
        ld3 = ld0 + fd0;
        fb0 = fd1 < ld2;
        Output.points[8][6] += ld3;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
if(ao3 != null){
          ld3 = ao3.m3(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
}
        fb0 = fb1 && lb1;
        Thought lo4 = Thought356.getInstance(ao2, ao3, ao4, fo0);
        Thought lo5 = Thought367.getInstance(ld0, fd0, fd1, ld2);
        ld3 = ld0 - fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          ao1.m2();
}
        Thought lo0 = Thought213.getInstance(fb0, fb1, fb0, fb1);
        fb0 = fd0 < fd1;
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = ad1 + ad2;
        double ld1 = 273.6830319559294;
        Thought lo2 = Thought169.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb3, fb0);
}
        fb1 = fd1 < ld1;
        lb3 = !fb0;
        Thought lo4 = Thought137.getInstance(ao1, ao2, ao3, ao4);
        fb1 = ad1 < ad2;
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
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ab3 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
if(ao2 != null){
          ao2.m1(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ad2 > ad3;
    Thought lo0 = Thought169.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    double ld1 = 8.433143355473863;
    ad1 *= -1;
    fb0 = ad2 < ad3;
    fb1 = !ab1;
    ad4 *= -1;
    ab2 = !ab3;
    boolean lb2 = false;
    Output.points[8][7] -= fd0;
    fd1 = ld1 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld1;
    ab3 = ad1 < ad2;
    Thought lo3 = Thought70.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
    boolean lb4 = true;
    Output.points[8][8] += ld1;
    ad1 *= -1;
if(ao4 != null){
      lb4 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    boolean lb5 = true;
    boolean lb6 = true;
    ab3 = !ab4;
    boolean lb7 = true;
    double ld8 = 783.3176447610158;
    boolean lb9 = true;
    boolean lb10 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    fd0 *= -1;
    fd1 *= -1;
    lb1 = !fb0;
    boolean lb2 = false;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = fd0 < fd1;
    boolean lb4 = true;
    lb1 = lb2 && lb3;
    fd0 = fd1 + fd0;
    lb4 = fb0 && fb1;

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
    fb0 = fb1 && fb0;
        Thought lo0 = Thought131.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;

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
      fd1 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought250.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought264.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    Thought lo2 = Thought383.getInstance();
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb3, fb0, fb1);
}
    boolean lb4 = false;
    fd1 = fd0 + fd1;
    lb3 = lb4 || fb0;
    fb1 = lb3 && lb4;

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
