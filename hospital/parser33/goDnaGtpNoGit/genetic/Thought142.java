package genetic;
import java.util.ArrayList;
class Thought142 extends Thought{
private static ArrayList<Thought142> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 664.457894101552;
private double fd1 = 100.94768334547817;
private Thought fo0 = null;
private Thought fo1 = null;
Thought142 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought142 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought142 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought142 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought142 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought142 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought142 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought142 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought142 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought142 instance = new Thought142 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought142 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought142 instance = new Thought142 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought142 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought142 instance = new Thought142 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought142 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought142 instance = new Thought142 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought142 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought142 instance = new Thought142 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought142 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought142 instance = new Thought142 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought142 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought142 instance = new Thought142 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought142 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought142 instance = new Thought142 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[1][2] += fd0;
    Output.points[1][3] -= fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
        boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought246.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    boolean lb2 = false;
    fd0 *= -1;
    boolean lb3 = false;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought323.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = fd1 > fd0;
        ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
    boolean lb1 = true;
    fd0 *= -1;
    lb1 = fd1 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    fd0 *= -1;
    double ld3 = 898.4441365154182;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 849.589576621295;
if(fo0 != null){
      ld2 = fo0.m3(lb0, lb1, fb0, fb1);
}
    double ld3 = 90.73435717072634;
    Output.points[1][4] -= ld3;
    Output.points[1][5] -= ad1;
    ad2 = ad3 + ad4;
    if (lb0) {
        Thought lo4 = Thought42.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3, lb1, fb0, fb1, lb0);
        lb1 = !fb0;
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
    ab2 = ad1 < ad2;
    Thought lo0 = Thought159.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
    ab4 = ad4 < fd0;
    fb0 = fb1 || ab1;
    Thought lo1 = Thought211.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 + ad2;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb2, ab1, ab2);
}
    boolean lb3 = true;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, lb3, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab3 = fd1 > ad1;
    boolean lb4 = true;

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
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      ao4.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 781.6378176613368;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < fd0;
    Output.points[1][6] -= fd1;
    ld0 *= -1;
    fb0 = fd0 < fd1;
    boolean lb1 = true;
    boolean lb2 = true;
    Output.points[1][7] += ld0;

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
    ad2 *= -1;
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb0 = true;
        ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
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
    ab2 = fd1 < fd0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought88.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought206.getInstance(ao4, fo0, fo1, ao1);
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb3 = true;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fd1 *= -1;
    lb3 = ab1 && ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
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
    Thought lo0 = Thought206.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought239.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    double ld2 = 145.5926004499988;
    ab3 = ab4 && fb0;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb1 = ab1 && ab2;
    double ld3 = 343.0208706874087;
    Thought lo4 = Thought312.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ab3 = ao4.m2(ad4, fd0, fd1, ld2);
}
    boolean lb5 = false;
    Output.points[1][8] += ld3;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 402.30086493317094;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought391.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    boolean lb3 = false;
    fd0 = fd1 + ld1;
    lb3 = fb0 && fb1;
    fd0 *= -1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
    boolean lb0 = true;
    Thought lo1 = Thought116.getInstance(fd0, fd1, fd0, fd1);
    ab4 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = fd1 < fd0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb0);
}
    ab1 = fd1 < fd0;
    Thought lo2 = Thought20.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
    lb0 = fd1 > fd0;
    if (lb3) {
        ab1 = fd1 < fd0;
        Thought lo4 = Thought203.getInstance(fo0, fo1, fo0, fo1);
        ab2 = fd1 > fd0;
}
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[2][0] += ad4;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought54.getInstance();
    boolean lb1 = false;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb1, fb0);
}
    ad1 = ad2 + ad3;
    Thought lo2 = Thought33.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    double ld3 = 764.0198440058901;
    fb1 = !lb1;
    boolean lb4 = true;
    double ld5 = 103.16895027657318;
    lb4 = ad2 < ad3;
        Output.points[2][1] -= ad4;
    boolean lb6 = false;
    lb6 = fd0 > fd1;
    Thought lo7 = Thought91.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    lb0 = fd0 > fd1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    Output.points[2][2] += ad2;
    double ld2 = 430.3909041141316;
    boolean lb3 = false;
    lb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb3 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    boolean lb0 = true;
    boolean lb1 = true;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + fd0;
    lb0 = lb1 && lb2;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    double ld3 = 563.2152574641964;
    ld3 = fd0 - fd1;
    lb2 = fb0 || fb1;
    lb0 = lb1 && lb2;
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
        Output.points[2][3] += ld3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought156.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = !fb1;
        fb0 = !fb1;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        fb0 = ad1 < ad2;
        Thought lo1 = Thought102.getInstance(ad3, ad4, fd0, fd1);
        fb1 = fb0 || fb1;
        boolean lb2 = false;
        lb2 = ad1 < ad2;
        ad3 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
        fb0 = ad2 < ad3;
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb0 = fb1 && lb2;
if(ao3 != null){
          lb3 = ao3.m2(fb0, fb1, lb2, lb3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, lb2, lb3);
}
        fb0 = ad2 > ad3;
if(ao4 != null){
          ad4 = ao4.m3(fd0, fd1, ad1, ad2, fb1, lb2, lb3, fb0);
}
        double ld4 = 609.9721420199162;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fb1, lb2, lb3, fb0);
}
        Output.points[2][4] += ad2;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
        boolean lb5 = true;
        boolean lb6 = false;
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
    Output.points[2][5] -= fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    lb0 = ab1 && ab2;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    boolean lb2 = true;
if(ao1 != null){
      ab1 = ao1.m2();
}
    Output.points[2][6] += fd1;
    Thought lo3 = Thought289.getInstance(ab2, ab3, ab4, fb0);
    double ld4 = 564.7887333990834;
    Thought lo5 = Thought309.getInstance(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld4, fb1, lb0, lb1, lb2);
    Thought lo6 = Thought59.getInstance(fd0, fd1, ld4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, lb2, ab1, ab2);
}
    double ld7 = 757.6551555000539;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld4, ld7);
}
    Thought lo8 = Thought259.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld4, ld7);
    Thought lo9 = Thought321.getInstance();
    fd0 *= -1;
    double ld10 = 117.83458947481307;
    fd0 = fd1 + ld4;
    double ld11 = 795.3865946057738;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    ld7 = ld10 + ld11;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld4, ld7, ld10, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      ld11 = fo1.m3(fd0, fd1, ld4, ld7, ab3, ab4, fb0, fb1);
}

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    double ld1 = 825.4292752293013;
    ab1 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld1 *= -1;
    boolean lb2 = false;
    ab1 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m3();
}
    ab2 = ld1 > ad1;
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, lb2, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
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
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 54.37562547564399;
    fb0 = ld0 < fd0;
    fb1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        lb1 = fb0 || fb1;
        double ld2 = 512.8186997077257;
        Thought lo3 = Thought116.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld0);
if(fo1 != null){
          lb1 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
        double ld4 = 781.5346388149329;
        double ld5 = 933.2427263992131;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld5, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
        lb1 = fb0 || fb1;
        lb1 = !fb0;
        }
    boolean lb6 = true;
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb6);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, lb6, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 *= -1;
    ab1 = fd0 > fd1;
    double ld1 = 306.3939208809748;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought369.getInstance();
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
    boolean lb3 = false;
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
    boolean lb4 = false;
    boolean lb5 = true;

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
      fo1.m3(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 625.9378499625651;
    ab2 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 - ad1;
        }
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ad4 > fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought53.getInstance(fd1, ld0, ad1, ad2);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 518.4744525672783;

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
        fb0 = !fb1;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
    boolean lb0 = true;
    double ld1 = 150.4839297597776;
    fb0 = ld1 > fd0;
if(ao1 != null){
      ao1.m3(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = ld1 > fd0;
    fb0 = fd1 > ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought302.getInstance();
    fd0 *= -1;
    double ld3 = 229.26130300673842;

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
    ad2 *= -1;
    ad3 *= -1;
    Thought lo0 = Thought397.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    Thought lo1 = Thought226.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    Output.points[2][7] += ad1;
    double ld2 = 246.7406161010857;
    fb1 = fb0 || fb1;
    boolean lb3 = true;
    lb3 = ad1 < ad2;
        ad3 *= -1;
    ad4 = fd0 + fd1;
    ld2 = ad1 - ad2;

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
    Thought lo0 = Thought216.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought166.getInstance();
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, ab1, ab2, ab3);
}
    double ld2 = 593.0872383972878;
    ab4 = ld2 > fd0;
    Thought lo3 = Thought200.getInstance(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1, fb0, fb1, ab1, ab2);
    Thought lo4 = Thought187.getInstance(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
    ab1 = fd0 > fd1;
    if (ab2) {
        for(int i0=0; i0<10; i0++){
            ab3 = !ab4;
            boolean lb5 = true;
            ab4 = ld2 < fd0;
if(fo1 != null){
              fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb5, ab1);
}
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3);
}
            ab2 = ab3 || ab4;
if(ao4 != null){
              ld2 = ao4.m3(fd0, fd1, ld2, fd0);
}
            fd1 *= -1;
            double ld6 = 126.06098628803696;
            fb0 = ld6 > ld2;
            fb1 = !lb5;
            fd0 = fd1 - ld6;
            Thought lo7 = Thought228.getInstance(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld6);
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
    ad1 = ad2 + ad3;
    Output.points[2][8] -= ad4;
    Thought lo0 = Thought193.getInstance();
    ab2 = ab3 || ab4;
    fd0 *= -1;
    Output.points[3][0] -= fd1;
    double ld1 = 409.0837734004758;
    ld1 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought151.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    double ld3 = 315.9423682437584;
    ld1 *= -1;
    boolean lb4 = true;
if(ao1 != null){
      ab3 = ao1.m2(ld3, ad1, ad2, ad3, ab4, fb0, fb1, lb4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = ld1 > ld3;
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 286.4068635645609;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought143.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
    fd1 *= -1;
    boolean lb3 = true;
        fb0 = fb1 && lb1;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb1, lb3, fb0, fb1);
}
    fd0 = fd1 + ld0;
    Thought lo4 = Thought193.getInstance(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
    lb1 = fd0 < fd1;
    Output.points[3][1] -= ld0;
    boolean lb5 = true;
    lb3 = !lb5;

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
    double ld0 = 584.0321485002454;
    boolean lb1 = true;
    ab1 = fd0 > fd1;
            ld0 *= -1;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
    ab4 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 > ld0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld0 = fo0.m3(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;

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
    Thought lo0 = Thought40.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Thought lo1 = Thought35.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    double ld2 = 179.3705301202061;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld2;
    Output.points[3][2] += ad1;
    Output.points[3][3] -= ad2;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought255.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);

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
      ab2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    double ld0 = 520.0896387193019;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought231.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    ab1 = fd1 < ld0;
    Output.points[3][4] += ad1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    fd1 *= -1;
    ld0 = ad1 - ad2;
    boolean lb3 = true;
    ad3 = ad4 - fd0;
    fd1 = ld0 + ad1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3();
}
        ab1 = ad2 > ad3;
if(fo0 != null){
          ad4 = fo0.m3(ab2, ab3, ab4, fb0);
}
        fd0 *= -1;
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
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[3][5] += fd0;
    fd1 *= -1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought351.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    lb0 = !lb2;
    boolean lb4 = false;

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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    fb1 = ad1 < ad2;
if(ao4 != null){
      ao4.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        fd1 *= -1;
        boolean lb0 = true;
        double ld1 = 11.613927761048961;
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld2 = 898.6429414080637;
    boolean lb3 = true;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ld2 = ao1.m3(fd0, fd1, ld2, fd0);
}
    double ld4 = 922.0928711134798;
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld2, ld4, fd0);
}
    double ld5 = 289.955238852382;
    lb3 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = ab4 && fb0;
    Thought lo6 = Thought184.getInstance(fb1, lb0, lb1, lb3);
    Thought lo7 = Thought370.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld4, ab1, ab2, ab3, ab4);

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
    ab2 = !ab3;
    ab4 = ad1 > ad2;
    boolean lb0 = false;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    lb0 = lb1 && ab1;
    double ld2 = 806.4516280385583;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2);
}
    boolean lb4 = true;
    ad3 = ad4 - fd0;

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
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fd1 *= -1;
    Output.points[3][6] -= fd0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    Output.points[3][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought25.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought100.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    lb2 = !fb0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][8] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[4][0] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
    double ld0 = 484.2436777945686;
    ld0 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;

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
    fb0 = fd0 > fd1;
    Thought lo0 = Thought367.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 240.30381495958179;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought61.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !fb0;
    boolean lb3 = true;

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
