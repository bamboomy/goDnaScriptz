package genetic;
import java.util.ArrayList;
class Thought341 extends Thought{
private static ArrayList<Thought341> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 755.4294325890228;
private double fd1 = 675.911201497868;
private Thought fo0 = null;
private Thought fo1 = null;
Thought341 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought341 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought341 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought341 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought341 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought341 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought341 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought341 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought341 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought341 instance = new Thought341 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought341 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought341 instance = new Thought341 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought341 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought341 instance = new Thought341 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought341 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought341 instance = new Thought341 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought341 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought341 instance = new Thought341 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought341 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought341 instance = new Thought341 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought341 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought341 instance = new Thought341 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought341 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought341 instance = new Thought341 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        fb1 = fb0 || fb1;
        fd1 = fd0 + fd1;
        Thought lo0 = Thought398.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fd0 = fo0.m3();
}
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
        Thought lo1 = Thought62.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        double ld2 = 313.6324352590741;
        Thought lo3 = Thought316.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        double ld4 = 534.1440468260747;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 && fb1;
        boolean lb5 = false;
        lb5 = fd0 < fd1;
        boolean lb6 = false;
        Output.points[6][0] -= ld2;
if(fo0 != null){
          fo0.m3(ld4, fd0, fd1, ld2);
}
if(fo1 != null){
          lb6 = fo1.m2(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld2);
}
if(fo0 != null){
          ld4 = fo0.m3();
}
        fb0 = fd0 < fd1;
        Output.points[6][1] -= ld2;
        fb1 = ld4 > fd0;
if(fo1 != null){
          fo1.m2(lb5, lb6, fb0, fb1);
}
        double ld7 = 586.5360015938613;
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
    boolean lb0 = true;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    ab2 = !ab3;
    fd1 = fd0 - fd1;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought27.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    Output.points[6][2] -= fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb2 = fo1.m2(lb3, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    boolean lb4 = false;

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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
        fd1 *= -1;
        fb1 = ad1 > ad2;
        fb0 = fb1 && fb0;
        Thought lo0 = Thought269.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld1 = 318.2748916852364;
        boolean lb2 = true;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        lb2 = ld1 < ad1;
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
    Thought lo0 = Thought326.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld1 = 747.1534679512612;
    ld1 = ad1 + ad2;

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
    Thought lo0 = Thought298.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld2 = 116.18088532959837;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 || lb1;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought377.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
    lb1 = fd0 < fd1;
    Thought lo4 = Thought331.getInstance(ld2, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
    fd0 *= -1;
    fb1 = lb1 || fb0;
    fd1 *= -1;
    ld2 = fd0 + fd1;
    fb1 = ld2 < fd0;

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
    ad1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    double ld0 = 352.57170093218565;
    Output.points[6][3] -= ad3;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought324.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[6][4] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[6][5] += fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, ab1, ab2);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab3 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 > fd0;
    fb0 = fb1 || lb0;
    double ld2 = 724.6291245083785;
    fd0 *= -1;
    ab1 = ab2 || ab3;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = fd0 < fd1;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = ad1 < ad2;
if(ao1 != null){
      ao1.m2(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    lb0 = lb1 || lb2;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought265.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ad2 = ad3 + ad4;
    lb0 = !lb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab4 = fb0 || fb1;
    lb0 = lb1 || lb2;
    Thought lo4 = Thought254.getInstance(fd0, fd1, ad1, ad2);

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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought313.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought26.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;

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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    fd1 = fd0 - fd1;
    ab3 = ab4 || fb0;
    fd0 = fd1 + fd0;
    fb1 = lb0 && ab1;
    boolean lb1 = false;
    ab1 = fd1 < fd0;
    Thought lo2 = Thought8.getInstance();
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought313.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
    boolean lb4 = true;
    Output.points[6][6] += fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought353.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad2 < ad3;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    double ld1 = 195.20098376112773;
    fb0 = ld1 < ad1;
    ad2 *= -1;
    fb1 = ad3 < ad4;
    Thought lo2 = Thought30.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld1;
    fb1 = !fb0;
    boolean lb3 = false;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
}
    Output.points[6][7] -= fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ld1 = ad1 + ad2;
    double ld4 = 280.3373986675015;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
        Output.points[6][8] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        ab2 = ad4 < fd0;
        ab3 = !ab4;
        double ld0 = 580.5969136946317;
        fd0 = fd1 + ld0;
        double ld1 = 901.1148921631988;
        boolean lb2 = false;
        double ld3 = 204.19309829303612;
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, ad1, ad2);
}
        ab3 = ad3 > ad4;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb5 = false;
if(fo0 != null){
          fo0.m1(ab3, ab4, fb0, fb1);
}
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
        boolean lb0 = true;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    double ld2 = 123.06680141012055;
if(ao2 != null){
      ld2 = ao2.m3(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 < ld2;
    fb0 = !fb1;
        Thought lo3 = Thought51.getInstance(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        lb0 = lb1 || fb0;
    fd1 = ld2 - fd0;
    fb1 = fd1 > ld2;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld2, fd0);
}
    fd1 *= -1;
    ld2 = fd0 + fd1;
    double ld4 = 197.15170076959302;
    Output.points[7][0] -= ld2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld2);
}
    ld4 = fd0 + fd1;
    ld2 = ld4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[7][1] -= fd1;
    ld2 = ld4 + fd0;

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
    Thought lo0 = Thought289.getInstance(fb1, fb0, fb1, fb0);
    Output.points[7][2] += ad2;
    fb1 = ad3 < ad4;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought65.getInstance(fo1, ao1, ao2, ao3);
    double ld2 = 62.17514907627256;
    boolean lb3 = true;
    lb3 = ad4 < fd0;

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
    ab1 = !ab2;
    Thought lo0 = Thought322.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    ab1 = !ab2;
    ab3 = !ab4;
    Output.points[7][3] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
    Thought lo3 = Thought145.getInstance(fb0, fb1, lb1, lb2);
    fd0 = fd1 + fd0;
    boolean lb4 = true;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb4, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    lb2 = lb4 && ab1;
    Thought lo5 = Thought165.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fb1 = !lb1;
    Output.points[7][4] += fd0;
    Thought lo6 = Thought137.getInstance(fd1, fd0, fd1, fd0);
    double ld7 = 894.8190031299705;
    fd0 = fd1 - ld7;
    lb2 = lb4 || ab1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld7, fd0);
}
    Output.points[7][5] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    if (ab2) {
if(ao3 != null){
          ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
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
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    double ld1 = 453.1505875667264;
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1);
}
if(ao3 != null){
      ao3.m2();
}
    lb0 = lb2 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb0, lb2, ab1, ab2);
}
    double ld3 = 766.5450606527647;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld3, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        Output.points[7][6] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo0 = Thought338.getInstance(fb1, fb0, fb1, fb0);
        Thought lo1 = Thought264.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        Thought lo2 = Thought79.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        fb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fb0 = fd1 < fd0;
        } else {
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        Output.points[7][7] -= fd1;
        boolean lb3 = true;
        fd0 *= -1;
        lb3 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld4 = 683.4346924625615;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1);
}
        boolean lb5 = true;
        boolean lb6 = false;
        lb3 = lb5 && lb6;
        fb0 = fb1 && lb3;
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
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[7][8] -= fd1;
    fb1 = fd0 > fd1;
    boolean lb1 = true;
        lb0 = lb1 || ab1;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;

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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought186.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = ad1 > ad2;
        fb0 = !fb1;
        fb0 = !fb1;
        fb0 = fb1 || fb0;
        ad3 *= -1;
        double ld1 = 995.3724965620283;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][0] -= ad2;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 + fd0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    double ld0 = 390.6296642204341;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ab3 = ab4 && fb0;
    double ld1 = 594.8130952733089;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      ld1 = fo1.m3(ab1, ab2, ab3, ab4);
}
        fb0 = ad1 > ad2;
        ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld2 = 429.69954043752324;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
        fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[8][1] += fd0;
    lb0 = fd1 > fd0;
if(ao2 != null){
      ao2.m2();
}
    Thought lo1 = Thought103.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
    fb0 = fd1 < fd0;
    double ld2 = 492.14591386190733;
    fd0 = fd1 + ld2;
    fb1 = lb0 || fb0;
    Output.points[8][2] -= fd0;
    fb1 = fd1 < ld2;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 *= -1;
    fb0 = ad3 < ad4;
    fb1 = lb0 && fb0;
    fb1 = fd0 < fd1;
    lb0 = ad1 < ad2;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
    Output.points[8][3] += ad2;

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
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2();
}
    boolean lb1 = false;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
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
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    fb1 = !ab1;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd1 > ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 406.30512193425375;
if(ao1 != null){
      ao1.m1();
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    double ld2 = 878.353296080185;
    ld0 = ld2 + ad1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
    fd1 = ld0 - ld2;
    ab2 = ab3 && ab4;
    Output.points[8][4] -= ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    Thought lo3 = Thought376.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld0 = ao2.m3(ld2, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ld2 = ao3.m3();
}
if(ao4 != null){
      ao4.m1(lb1, ab1, ab2, ab3);
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
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[8][5] += fd0;
    fd1 *= -1;
    fb1 = lb0 || lb1;
    boolean lb3 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
    ab1 = ab2 && ab3;
        ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2();
}
    Output.points[8][6] -= fd1;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    Thought lo1 = Thought29.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    boolean lb2 = false;
    lb0 = fd0 < fd1;
    Thought lo3 = Thought247.getInstance(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought59.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
        fb1 = ad4 > fd0;
    fb0 = fb1 || fb0;
    Output.points[8][7] += fd1;
    Thought lo1 = Thought153.getInstance();
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought348.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    boolean lb3 = false;
    fb0 = !fb1;
    Thought lo4 = Thought284.getInstance(ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb3);

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
    double ld0 = 90.22471048006713;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought166.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ab1 && ab2;
    ad1 = ad2 - ad3;
        Output.points[8][8] += ad4;
    Output.points[0][0] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
    Output.points[0][1] += ad4;
    Thought lo2 = Thought86.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 *= -1;
    Thought lo4 = Thought26.getInstance(ab2, ab3, ab4, fb0);
    ad3 = ad4 - fd0;
    Thought lo5 = Thought69.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, lb3, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    ab4 = ld0 < ad1;
    fb0 = !fb1;
    lb3 = ab1 || ab2;
    ab3 = !ab4;
    ad2 *= -1;
    Output.points[0][2] += ad3;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
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
    fd0 = fd1 + fd0;
    double ld0 = 607.3975889002149;
    Output.points[0][3] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
    fb1 = ld0 < fd0;
    if (fb0) {
        fb1 = fd1 > ld0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
        Thought lo1 = Thought11.getInstance();
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo0.m1(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
        Output.points[0][4] -= ld0;
        boolean lb2 = true;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
if(fo1 != null){
          fo1.m3();
}
        ld0 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb2, fb0);
}
        Thought lo3 = Thought142.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
        lb2 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb1, lb2, fb0, fb1);
}
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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 *= -1;
    Thought lo0 = Thought25.getInstance(fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
    fb1 = !fb0;
    Output.points[0][5] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought168.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);

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
    Output.points[0][6] -= fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Output.points[0][7] -= fd1;
    ab4 = !fb0;
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao1 != null){
      ab1 = ao1.m2();
}
    boolean lb1 = false;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    double ld2 = 723.3451193783773;
    boolean lb3 = false;
    ld2 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
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
    Thought lo0 = Thought298.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = ad2 < ad3;
    ad4 *= -1;
    ab4 = fb0 || fb1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
        Thought lo1 = Thought122.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    ad1 *= -1;
    ad2 *= -1;
if(ao4 != null){
          ao4.m1(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;

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
    fb0 = !fb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    Output.points[0][8] -= fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought26.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
        Thought lo2 = Thought107.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    fd1 *= -1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb0 = !lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][0] -= fd0;
    Output.points[1][1] -= fd1;
if(fo1 != null){
      fo1.m3();
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
}
