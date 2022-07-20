package genetic;
import java.util.ArrayList;
class Thought240 extends Thought{
private static ArrayList<Thought240> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 246.77806709041192;
private double fd1 = 471.5894347875142;
private Thought fo0 = null;
private Thought fo1 = null;
Thought240 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought240 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought240 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought240 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought240 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought240 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought240 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought240 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought240 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought240 instance = new Thought240 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought240 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought240 instance = new Thought240 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought240 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought240 instance = new Thought240 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought240 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought240 instance = new Thought240 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought240 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought240 instance = new Thought240 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought240 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought240 instance = new Thought240 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought240 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought240 instance = new Thought240 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought240 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought240 instance = new Thought240 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    lb0 = fd1 < fd0;
    boolean lb1 = true;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
        fb0 = fd1 < fd0;
    fb1 = !lb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought366.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    lb1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = lb0 || lb1;
        boolean lb3 = true;
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
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        ab4 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
        fd1 = fd0 + fd1;
        fd0 *= -1;
        Output.points[5][4] += fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought149.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
    Thought lo1 = Thought177.getInstance(fo1, fo0, fo1, fo0);
    ad4 = fd0 - fd1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo0.m1();
}
    boolean lb2 = true;
    double ld3 = 183.16810629605996;
    ad1 = ad2 - ad3;
    boolean lb4 = true;
if(fo1 != null){
      lb2 = fo1.m2(lb4, fb0, fb1, lb2);
}
    lb4 = ad4 < fd0;
    fb0 = fd1 > ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb2, lb4, fb0);
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
      fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > ad1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2();
}
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    double ld1 = 173.3016656151816;
        ld1 = fd0 - fd1;
    boolean lb2 = true;
        ld1 *= -1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    lb2 = ld1 < fd0;

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
    double ld0 = 74.79622430168412;
    ld0 *= -1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    double ld1 = 661.4930714228079;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought370.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 *= -1;
    boolean lb3 = true;
    fb0 = ld1 > ad1;
    double ld4 = 526.5734120346834;
    ad1 *= -1;
    fb1 = lb3 || fb0;
    double ld5 = 203.70700798855668;
    double ld6 = 920.9617481418354;
    boolean lb7 = true;
    boolean lb8 = false;
    ld6 = ad1 + ad2;

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
    Output.points[5][5] -= fd1;
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 615.3946141116512;
    ld0 *= -1;
    Thought lo1 = Thought398.getInstance(ao1, ao2, ao3, ao4);
    fb1 = fd0 > fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    lb2 = fd0 > fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      ab1 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(fd0, fd1, ld0, fd0, fb0, fb1, lb2, ab1);
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ld0, fd0, fd1, ld0);
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
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    double ld3 = 525.4893146524647;
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4, lb0, lb1, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought191.getInstance(fo0, fo1, ao1, ao2);
    fb1 = lb0 && lb1;
if(ao3 != null){
      lb2 = ao3.m2(fd0, fd1, ld3, ad1);
}
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        }
    Output.points[5][6] -= ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ad1);
}
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    Thought lo1 = Thought143.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    double ld2 = 37.98426762902852;
    fb1 = ld2 > fd0;
    fd1 *= -1;
    Output.points[5][7] += ld2;
    Output.points[5][8] -= fd0;
    lb0 = fd1 > ld2;
    fd0 *= -1;
    Thought lo3 = Thought24.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 > fd0;
        Output.points[6][0] -= fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 + fd1;
        Thought lo2 = Thought398.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
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
    ad1 = ad2 + ad3;
    ad4 *= -1;
        Thought lo0 = Thought269.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought211.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought54.getInstance();
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Output.points[6][1] -= fd1;
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;

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
    ad1 = ad2 + ad3;
    double ld0 = 65.58006528382674;
    ab2 = ab3 && ab4;
    double ld1 = 350.91808630938937;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ad1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab3 = fd1 > ld0;
    double ld2 = 565.0311028921031;
    double ld3 = 432.48463173843135;
        Thought lo4 = Thought141.getInstance();
    ab4 = ld1 < ld2;
    fb0 = ld3 < ad1;
    fb1 = ad2 < ad3;
    double ld5 = 12.788674947155382;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Output.points[6][2] += ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ld1 > ld2;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m2(ld3, ld5, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb6 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    double ld7 = 970.2951392010356;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    if (fb0) {
        fb1 = !fb0;
        double ld0 = 674.4638851764261;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
        ld0 *= -1;
        fb1 = fd0 > fd1;
        fb0 = !fb1;
        boolean lb1 = false;
        ld0 = fd0 + fd1;
if(ao1 != null){
          ao1.m2();
}
if(ao2 != null){
          ld0 = ao2.m3(lb1, fb0, fb1, lb1);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
        Thought lo2 = Thought330.getInstance(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        boolean lb3 = false;
        fd0 = fd1 - ld0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
        lb3 = fd1 < ld0;
        } else {
        if (fb0) {
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = ad4 > fd0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        ad4 *= -1;
if(ao3 != null){
          fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fb1 = fb0 || fb1;
        fd0 = fd1 - ad1;
        double ld0 = 886.304945359515;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
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
    Thought lo0 = Thought46.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1();
}
    Thought lo2 = Thought311.getInstance(ab4, fb0, fb1, lb1);
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    boolean lb3 = true;
    boolean lb4 = false;
    Output.points[6][3] += fd0;
    ab2 = !ab3;
    fd1 = fd0 - fd1;
    ab4 = fd0 < fd1;
    fb0 = fb1 || lb1;
    Thought lo5 = Thought280.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb3, lb4, ab1, ab2);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb6 = false;
            fd0 = fd1 - fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        lb1 = !lb3;
if(fo1 != null){
          lb4 = fo1.m2(ao1, ao2, ao3, ao4, lb6, ab1, ab2, ab3);
}
        boolean lb7 = false;
        Output.points[6][4] += fd0;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
        double ld8 = 629.1556846968463;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld8, fd0);
}
}
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
    Thought lo0 = Thought376.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    double ld1 = 145.58765605077483;
    fb0 = fb1 && ab1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ld1 = ad1 + ad2;
    boolean lb2 = false;
    lb2 = ad3 < ad4;
    Output.points[6][5] += fd0;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, ab1, ab2, ab3);
}
    Output.points[6][6] += fd1;

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
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    Thought lo1 = Thought194.getInstance(fo1, fo0, fo1, fo0);
    lb0 = !fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought198.getInstance(fd1, fd0, fd1, fd0);
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld3 = 550.0106827335748;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = ld3 - fd0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fd1 = fo0.m3(ld3, fd0, fd1, ld3, fb0, fb1, lb0, fb0);
}
    double ld4 = 840.3332425939357;
    Output.points[6][7] += ld4;

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
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    Output.points[6][8] += fd1;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
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
    ad2 *= -1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    fd0 *= -1;
    Thought lo1 = Thought295.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    Output.points[7][0] += ad4;
    Output.points[7][1] -= fd0;
    double ld2 = 388.0319237861399;
    boolean lb3 = true;
    Output.points[7][2] += fd0;
    lb0 = lb3 && fb0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[7][3] += ld2;
    double ld4 = 167.3692729581824;
if(fo0 != null){
      ld4 = fo0.m3(fb1, lb0, lb3, fb0);
}
    boolean lb5 = true;
    fb0 = ad1 > ad2;
    double ld6 = 854.8114727822084;

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
    double ld0 = 757.4538825978177;
    Output.points[7][4] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 934.5215360097424;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - ld0;
    ab4 = fb0 && fb1;
    ld1 *= -1;
    boolean lb2 = false;
    lb2 = !ab1;
    boolean lb3 = false;
    if (ab1) {
        ab2 = !ab3;
        ab4 = ad1 > ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb2, lb3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    if (fb0) {
if(ao2 != null){
          fd0 = ao2.m3();
}
if(ao3 != null){
          ao3.m3(fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > fd0;
        if (fb0) {
            boolean lb0 = false;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
            boolean lb1 = true;
            fd1 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;
    Output.points[7][5] += ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 > ad1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    double ld1 = 458.22989387286157;
    fd0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    double ld3 = 678.6355003768646;
    ab4 = fb0 && fb1;
    fd0 *= -1;
    fd1 = ld1 + ld3;
    Thought lo4 = Thought231.getInstance(fd0, fd1, ld1, ld3);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld3);
}
if(ao3 != null){
      ao3.m1();
}
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb2, ab1, ab2);
}
    double ld5 = 177.40304789249325;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ld5, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    Thought lo6 = Thought264.getInstance(ld3, ld5, fd0, fd1, lb2, ab1, ab2, ab3);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Output.points[7][6] -= fd0;
    ab2 = !ab3;
    ab4 = fd1 > ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    double ld0 = 879.9488732838008;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld1 = 211.11418510586643;
    ab3 = ld1 < ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, ld1, ad1);
}
    Thought lo3 = Thought168.getInstance();
    ad2 = ad3 + ad4;
    ab3 = fd0 < fd1;
    Output.points[7][7] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb2);
}
    ab1 = ld1 > ad1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
if(fo1 != null){
      fo1.m3(fd1, ld0, ld1, ad1, fb0, fb1, lb2, lb4);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb5 = true;
    Output.points[7][8] -= ad2;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[8][0] += fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    double ld0 = 915.6543605750757;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld1 = 161.9563923777107;
    fd0 = fd1 + ld0;
    ld1 = fd0 - fd1;
    Output.points[8][1] -= ld0;
    fb1 = ld1 > fd0;
    boolean lb2 = true;
    fd1 *= -1;
    lb2 = ld0 > ld1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
}
    fd0 = fd1 - ld0;
    lb2 = ld1 > fd0;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, ld1, fd0, fb1, lb2, fb0, fb1);
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
    fd1 *= -1;
    double ld0 = 971.5395951420539;
    ab1 = ab2 || ab3;
    double ld1 = 508.3204011068051;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought47.getInstance(ld0, ld1, fd0, fd1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
    ab2 = !ab3;
if(fo1 != null){
          fo1.m1();
}
    Thought lo3 = Thought278.getInstance(ab4, fb0, fb1, ab1);
    boolean lb4 = true;
    ld0 *= -1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, ab4, fb0, fb1, lb4);
}
    ld1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
    Thought lo5 = Thought356.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb4, ab1);
    Output.points[8][2] += ld1;
    Output.points[8][3] -= fd0;
    ab2 = !ab3;
    Output.points[8][4] += fd1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb4;
    ld0 = ld1 - fd0;

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
    fb1 = fb0 || fb1;
    double ld0 = 975.7222651993984;
    Thought lo1 = Thought167.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = true;
    double ld3 = 685.5532520600691;
    lb2 = ad4 < fd0;
    fd1 = ld0 + ld3;
    fb0 = ad1 < ad2;
    double ld4 = 318.1563132470172;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = ld0 < ld3;
if(fo0 != null){
      lb2 = fo0.m2();
}
    ld4 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(fb0, fb1, lb2, fb0);
}
    boolean lb5 = false;
    fb0 = ad4 > fd0;
    Output.points[8][5] += fd1;
    ld0 *= -1;
    double ld6 = 546.5360061154489;
    boolean lb7 = false;
    ld3 = ld4 + ld6;
    fb0 = fb1 || lb2;
    Thought lo8 = Thought57.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb5, lb7, fb0, fb1);
    lb2 = fd0 > fd1;

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
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
    if (fb0) {
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        fb1 = ad3 > ad4;
        fd0 = fd1 + ad1;
        ab1 = ab2 || ab3;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    Thought lo2 = Thought88.getInstance(lb0, lb1, fb0, fb1);
    lb0 = lb1 || fb0;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    double ld3 = 448.4425927766797;
    Output.points[8][6] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ld3, fd0, fd1, ld3, lb0, lb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
    fd1 = ld3 + fd0;
    fd1 = ld3 + fd0;
    fd1 = ld3 + fd0;
    boolean lb4 = true;
    Thought lo5 = Thought146.getInstance(ao4, fo0, fo1, ao1);
        Output.points[8][7] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld3, fd0, fd1, ld3);
}
    Output.points[8][8] += fd0;
    lb1 = !lb4;
    fb0 = fd1 < ld3;
    fb1 = lb0 || lb1;
        lb4 = fb0 || fb1;
    Output.points[0][0] += fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ad2 *= -1;
    lb0 = ad3 > ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    lb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought17.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
    lb0 = ad3 < ad4;
    fd0 *= -1;
    lb1 = !fb0;

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
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought268.getInstance(ab2, ab3, ab4, fb0);
    Output.points[0][1] += fd0;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    double ld2 = 734.8750345622369;
    fd0 = fd1 + ld2;
        ab1 = fd0 < fd1;
    boolean lb3 = false;
    ab1 = ld2 > fd0;
    fd1 *= -1;
    boolean lb4 = false;
    ab1 = !ab2;
    Thought lo5 = Thought122.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    lb3 = lb4 || ab1;
    boolean lb6 = false;
    ab1 = ld2 > fd0;

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
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    Output.points[0][2] += ad1;
if(ao2 != null){
          ao2.m2(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    fd1 = ad1 - ad2;
    ab4 = ad3 > ad4;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought374.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}

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
    double ld0 = 500.3860726030765;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld0;
    double ld1 = 952.2642014177774;
    Thought lo2 = Thought280.getInstance(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              ld1 = fo1.m3(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    double ld3 = 570.2966111622103;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    ld0 = ld1 - ld3;
    fb0 = fd0 > fd1;
    ld0 = ld1 + ld3;

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
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb1 = true;
    lb1 = fb0 && fb1;
    fd1 *= -1;
    lb0 = !lb1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
    fd0 *= -1;
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    lb0 = fd0 < fd1;
    Output.points[0][3] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;
    lb1 = !lb2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought193.getInstance(fd0, fd1, fd0, fd1);

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
