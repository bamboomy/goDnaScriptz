package genetic;
import java.util.ArrayList;
class Thought227 extends Thought{
private static ArrayList<Thought227> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 794.0371070745026;
private double fd1 = 477.9130433745172;
private Thought fo0 = null;
private Thought fo1 = null;
Thought227 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought227 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought227 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought227 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought227 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought227 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought227 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought227 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought227 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought227 instance = new Thought227 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought227 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought227 instance = new Thought227 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought227 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought227 instance = new Thought227 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought227 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought227 instance = new Thought227 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought227 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought227 instance = new Thought227 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought227 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought227 instance = new Thought227 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought227 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought227 instance = new Thought227 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought227 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought227 instance = new Thought227 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb1 = !fb0;
        }
    double ld0 = 478.29442719539077;
    Output.points[6][8] -= fd0;
    fb1 = !fb0;
    Output.points[7][0] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
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
    Thought lo0 = Thought115.getInstance();
    fd1 *= -1;
    ab2 = fd0 > fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, ab1);
}
    double ld2 = 800.1511701748924;
        ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = fd1 < ld2;
    boolean lb3 = true;
    boolean lb4 = true;
    lb3 = !lb4;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb4 = fd0 > fd1;
    ld2 *= -1;

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
    boolean lb0 = false;
        fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, fb0);
}
        fb1 = ad2 > ad3;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
        fd1 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    lb0 = lb1 && lb2;
    boolean lb4 = false;
    Output.points[7][1] += ad1;
    lb3 = lb4 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb1 = lb0 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad4 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(lb2, lb3, lb4, fb0);
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ab4 = ad4 > fd0;
    double ld0 = 521.5689750487411;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Output.points[7][2] -= ad1;
    boolean lb1 = true;
    ab2 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    double ld0 = 123.07225832078491;
    Thought lo1 = Thought221.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Output.points[7][3] += fd1;
    ld0 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
        ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fb0 = fd1 < ad1;
    fb1 = !fb0;
    Thought lo0 = Thought248.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao2.m2();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    Thought lo1 = Thought265.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    Output.points[7][4] += ad1;
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;
    boolean lb2 = true;
    ad4 = fd0 - fd1;

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
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Output.points[7][5] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
        fd1 *= -1;
if(ao2 != null){
      ab4 = ao2.m2();
}
if(ao3 != null){
      ao3.m3(fb0, fb1, lb0, ab1);
}
        ab2 = fd0 > fd1;

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
    ab2 = !ab3;
    ad1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    double ld2 = 636.1904371900739;
    Output.points[7][6] -= fd0;
if(ao3 != null){
      ao3.m3();
}
    lb1 = !ab1;
    double ld3 = 443.6931499266;
    ab2 = fd0 > fd1;
    Thought lo4 = Thought180.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld3, ad1, ad2, lb0, lb1, ab1, ab2);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    boolean lb5 = true;
    ld2 = ld3 + ad1;
    ad2 *= -1;
    boolean lb6 = true;
    Thought lo7 = Thought45.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = ld2 > ld3;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, lb1, lb5);
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought112.getInstance();
    fd0 = fd1 + fd0;
    Thought lo1 = Thought43.getInstance(fb0, fb1, fb0, fb1);
    if (fb0) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought153.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        boolean lb3 = true;
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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 878.0392162487911;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    ld0 = fd0 + fd1;
    fb0 = ld0 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = !fb1;
    Output.points[7][7] += fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = ab1 || ab2;
    double ld2 = 572.7138183382843;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[7][8] += ad1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        Output.points[8][0] += ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + ad1;
        fb0 = ad2 < ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ad1;
        ad2 = ad3 - ad4;
        boolean lb0 = false;
        fb0 = fb1 || lb0;
        boolean lb1 = false;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Output.points[8][1] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
        fd0 = fd1 - ad1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    ab1 = ab2 || ab3;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    fd1 = ad1 + ad2;
    boolean lb1 = false;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Output.points[8][2] += fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    double ld0 = 327.1039080217893;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
    Output.points[8][3] += fd0;
    fb0 = fd1 > ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    fb1 = ld0 < fd0;
    if (lb1) {
        Output.points[8][4] -= fd1;
if(ao3 != null){
          ld0 = ao3.m3();
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
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    Output.points[8][5] -= ad4;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought317.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      fb1 = ao3.m2(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Thought lo0 = Thought313.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[8][6] -= fd1;
    fd0 = fd1 + fd0;
    double ld1 = 212.85983239100818;
    fb0 = fb1 && ab1;
    if (ab2) {
        fd0 = fd1 + ld1;
        Thought lo2 = Thought261.getInstance(ab3, ab4, fb0, fb1);
        ab1 = fd0 < fd1;
        boolean lb3 = false;
        double ld4 = 395.3861189263795;
        ab1 = ab2 && ab3;
        for(int i0=0; i0<10; i0++){
            ld4 = ld1 + fd0;
            fd1 *= -1;
            Output.points[8][7] -= ld4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = false;
    ad3 *= -1;
    ab1 = !ab2;
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 < ad1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld1 = 973.2098737211214;
    ab4 = fb0 || fb1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld1);
}
    lb0 = ad1 < ad2;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 513.7770007358386;
    double ld1 = 611.9822242990585;
    fb0 = ld1 > fd0;
    fb1 = !fb0;
    fd1 = ld0 - ld1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    Output.points[8][8] -= ld0;
    Output.points[0][0] += ld1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought263.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    fb0 = fb1 || lb3;
    fb0 = fd1 > ld0;
    for(int i0=0; i0<10; i0++){
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 851.6311540925792;
    ld2 = fd0 - fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    double ld0 = 681.9556198344989;
    fb1 = fb0 || fb1;
    ad4 *= -1;
    fb0 = fd0 > fd1;
    ld0 *= -1;
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fd1 = ld0 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[0][1] += fd1;
    fb1 = ld0 > ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought287.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    ab4 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = lb0 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 45.658686034893556;
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
    boolean lb2 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    lb1 = !lb2;
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    ld0 = fd0 + fd1;

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
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought53.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb1 = false;
    fb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    double ld2 = 237.24287775074498;
    Thought lo3 = Thought265.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld2;
    fb1 = ad1 < ad2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    Thought lo1 = Thought257.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    double ld0 = 730.5029065196359;
    fd0 = fd1 - ld0;
    ab2 = ab3 || ab4;
    if (fb0) {
        boolean lb1 = false;
        fb0 = ad1 > ad2;
        fb1 = lb1 || ab1;
        ab2 = ad3 < ad4;
        ab3 = !ab4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = fb1 || lb1;
        fd0 *= -1;
        ab1 = fd1 < ld0;
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
        ab2 = fd1 < ld0;
        ad1 *= -1;
        ab3 = ad2 < ad3;
        ad4 *= -1;
        } else if (fb0) {
        fb1 = ab1 || ab2;
        boolean lb2 = true;
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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought325.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = !fb0;
    Output.points[0][2] += fd0;
    Thought lo1 = Thought87.getInstance();
    Thought lo2 = Thought338.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
        boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[0][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb3);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb3);
}
    lb4 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
}
    fd1 *= -1;
    lb3 = !lb4;
    Thought lo5 = Thought251.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(lb0, ab1, ab2, ab3);
}
    if (ab4) {
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
            fd0 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
            }
        boolean lb1 = false;
        lb1 = fd1 < fd0;
        lb0 = ab1 || ab2;
        ab3 = fd1 > fd0;
        Output.points[0][4] += fd1;
        Output.points[0][5] -= fd0;
        ab4 = !fb0;
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    if (fb0) {
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        boolean lb1 = true;
        Thought lo2 = Thought358.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd1 *= -1;
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
        } else if (fb1) {
if(fo1 != null){
          fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        ad4 = fd0 + fd1;
        ad1 = ad2 - ad3;
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
    if (ab2) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab3 = ab4 && fb0;
        fb1 = ad2 > ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought116.getInstance();
        ab1 = fd1 < ad1;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
        Output.points[0][6] -= ad2;
        boolean lb2 = false;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
        } else if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
        Thought lo3 = Thought269.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
    double ld0 = 773.3345087355412;
    double ld1 = 131.53959276222068;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = ld0 > ld1;
    Output.points[0][7] -= fd0;
if(ao1 != null){
      ao1.m1();
}
    fd1 = ld0 - ld1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = ld0 > ld1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
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
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    lb0 = !fb0;
    for(int i0=0; i0<10; i0++){
        Output.points[0][8] -= ad3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
          ao4.m3();
}
if(fo0 != null){
          fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
        ad2 = ad3 - ad4;
        boolean lb1 = false;
        fd0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb1);
}
        lb0 = ad2 < ad3;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 806.1642817197927;
    ab1 = fd0 < fd1;
    ab2 = ld1 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    boolean lb2 = false;
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, lb0);
}
    Thought lo3 = Thought71.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
    lb2 = ab1 || ab2;
    fd1 = ld1 - fd0;

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
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    double ld1 = 621.2759576599423;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
    ab4 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    lb0 = ab1 || ab2;
    ab3 = ad2 < ad3;
    ab4 = fb0 || fb1;
    if (lb0) {
        boolean lb2 = false;
if(ao3 != null){
          ao3.m2(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb2);
}
        ad1 *= -1;
        boolean lb3 = true;
if(ao4 != null){
          lb3 = ao4.m2(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
        double ld4 = 297.6438601655551;
        ab4 = fd0 > fd1;
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
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
        boolean lb1 = false;
    lb0 = fd0 > fd1;
    boolean lb2 = false;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 618.403683967319;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    boolean lb2 = false;
        ld0 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
}
    fb0 = ld0 < fd0;
    Output.points[1][0] -= fd1;
    ld0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 586.7797648416379;
    ld0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 478.0608313486853;
        fb1 = ld0 > ld1;
    double ld2 = 535.1261700656804;
    Output.points[1][1] -= ld2;
    fd0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ld1, ld2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;

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
