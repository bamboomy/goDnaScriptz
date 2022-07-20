package genetic;
import java.util.ArrayList;
class Thought239 extends Thought{
private static ArrayList<Thought239> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 131.51848914177387;
private double fd1 = 915.5670175464152;
private Thought fo0 = null;
private Thought fo1 = null;
Thought239 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought239 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought239 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought239 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought239 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought239 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought239 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought239 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought239 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought239 instance = new Thought239 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought239 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought239 instance = new Thought239 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought239 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought239 instance = new Thought239 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought239 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought239 instance = new Thought239 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought239 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought239 instance = new Thought239 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought239 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought239 instance = new Thought239 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought239 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought239 instance = new Thought239 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought239 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought239 instance = new Thought239 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 || fb1;
        lb0 = fb0 || fb1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
    ab1 = ab2 || ab3;
    Output.points[2][0] -= fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[2][1] -= fd0;
    Thought lo0 = Thought372.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = fd1 > fd0;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
    double ld1 = 502.75229855878206;

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
    Output.points[2][2] += ad1;
    fb1 = fb0 || fb1;
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    double ld0 = 568.5407664613224;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought189.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    Thought lo3 = Thought167.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        }
    ld0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought60.getInstance(ad1, ad2, ad3, ad4);
    fb1 = lb2 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    fb1 = lb2 && fb0;

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
      fo0.m3();
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(lb0, ab1, ab2, ab3);
}
    Output.points[2][3] += ad2;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    double ld1 = 87.86541287228222;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
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
    Thought lo0 = Thought282.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought244.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2();
}
    fb0 = !fb1;
    boolean lb3 = false;
    lb2 = lb3 || fb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    boolean lb0 = false;
        fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    lb0 = !fb0;
    Thought lo1 = Thought135.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Output.points[2][4] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
    Output.points[2][5] += fd0;
    Output.points[2][6] -= fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    Thought lo3 = Thought108.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    double ld4 = 954.1932896036851;
if(fo1 != null){
      ld4 = fo1.m3();
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
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought368.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought333.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    double ld3 = 444.8016880289135;
    Thought lo4 = Thought68.getInstance();

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
    Output.points[2][7] -= ad1;
    ab2 = ad2 > ad3;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    Thought lo1 = Thought362.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
    fb1 = lb0 || ab1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
    double ld2 = 89.6287749419468;
    fd0 = fd1 + ld2;
    Output.points[2][8] += ad1;
    boolean lb3 = true;
    boolean lb4 = false;
    ad2 = ad3 + ad4;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    ld2 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    double ld5 = 594.424388520989;
    for(int i0=0; i0<10; i0++){
        ld5 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld5);
}
if(ao1 != null){
          ao1.m2();
}
if(ao2 != null){
          ao2.m3(fb1, lb0, lb3, lb4);
}
        boolean lb6 = false;
        lb4 = ad1 > ad2;
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 934.4544195667123;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0);
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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought207.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    ab3 = ab4 && fb0;
    double ld2 = 820.1858312395434;
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo0.m2(fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    double ld3 = 532.4558227071905;
    double ld4 = 72.9048359836546;
    boolean lb5 = true;
    lb1 = ld4 > fd0;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m1(fd1, ld2, ld3, ld4, lb5, lb6, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb7 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb1 = lb5 && lb6;
    if (lb7) {
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 898.3549486344004;
    boolean lb1 = false;
    double ld2 = 850.7292012393244;
    fb0 = ld2 < ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fb1 = lb1 && fb0;
    fb1 = lb1 || fb0;
    fd1 = ld0 + ld2;
    boolean lb3 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[3][0] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld0 - ld2;
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb3, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2, lb1, lb3, fb0, fb1);
}
    Output.points[3][1] += ad3;
    lb1 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
}
    Output.points[3][2] -= ld2;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        fb0 = !fb1;
        double ld4 = 834.9469183653326;
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb1);
}
        boolean lb5 = false;
        lb1 = lb3 && fb0;
        fb1 = lb5 && lb1;
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
    ad2 = ad3 + ad4;
    double ld0 = 854.4282371015834;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ab2 = fo0.m2(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought147.getInstance(fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
    Thought lo2 = Thought257.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    Thought lo3 = Thought170.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    boolean lb0 = true;
    Output.points[3][3] += fd1;
    fd0 *= -1;
    boolean lb1 = false;
if(ao3 != null){
      lb1 = ao3.m2(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    lb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    double ld2 = 711.9719613097244;
    Thought lo3 = Thought289.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
    lb0 = fd0 < fd1;
    ld2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;

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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought395.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    if (fb1) {
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd1 = ad1 + ad2;
        fb0 = fb1 || fb0;
        fb1 = ad3 > ad4;
        Thought lo1 = Thought171.getInstance(fb0, fb1, fb0, fb1);
        boolean lb2 = false;
        lb2 = fb0 && fb1;
        fd0 = fd1 + ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
        fd1 = ad1 - ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
        Output.points[3][4] += ad1;
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
    ab2 = fd1 > fd0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought55.getInstance();
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought358.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    ab3 = ab4 || fb0;
    Output.points[3][5] += fd0;
    fb1 = fd1 > fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    boolean lb3 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo4 = Thought292.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = !fb0;
    fb1 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(lb0, lb3, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb0, lb3, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ab2 = ad4 < fd0;
if(ao2 != null){
      ao2.m1();
}
    double ld1 = 1.5420733475131572;
    ab3 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
    ld1 = ad1 + ad2;
    double ld3 = 896.0123626083367;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 + fd1;
    double ld0 = 918.7391117578908;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought240.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    double ld2 = 445.6969920546945;
    fd0 = fd1 + ld0;
    Thought lo3 = Thought391.getInstance();
    boolean lb4 = false;
    lb4 = fb0 || fb1;
    boolean lb5 = true;
    ld2 = fd0 + fd1;
    boolean lb6 = true;
    lb4 = ld0 < ld2;
        Output.points[3][6] -= fd0;
    Output.points[3][7] += fd1;

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
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    double ld0 = 503.5101329362997;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fb1 = lb1 && ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    lb1 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought144.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    boolean lb3 = true;
    ab2 = !ab3;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 || fb1;
    boolean lb4 = true;

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
    fb0 = fb1 && fb0;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        for(int i1=0; i1<10; i1++){
            ad4 = fd0 - fd1;
            fb1 = ad1 < ad2;
if(fo0 != null){
              lb0 = fo0.m2();
}
if(fo1 != null){
              ad3 = fo1.m3(fb0, fb1, lb0, fb0);
}
            fb1 = !lb0;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
            fb1 = ad2 < ad3;
if(fo0 != null){
              fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
            ad2 = ad3 + ad4;
            boolean lb1 = false;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
            lb0 = ad3 > ad4;
            fb0 = fb1 && lb1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    ab3 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld0 = 320.2032433544893;
    Thought lo1 = Thought88.getInstance();
    if (ab4) {
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
        double ld2 = 322.55314776530207;
        boolean lb3 = false;
        Thought lo4 = Thought354.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
        for(int i0=0; i0<10; i0++){
            Thought lo5 = Thought27.getInstance(fd1, ld2, ld0, ad1, fb1, lb3, ab1, ab2);
}}
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
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    boolean lb0 = false;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought143.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb0 = !fb0;
    boolean lb2 = true;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb2, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 && fb0;
    double ld3 = 459.8454664489494;
    boolean lb4 = false;
if(ao3 != null){
      ao3.m1(ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
}
    boolean lb5 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb4, lb5, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1();
}
    lb2 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought24.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, lb1, lb2, fb0, fb1);
}
    boolean lb4 = true;
    double ld5 = 922.6454780362884;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, lb1, lb2, lb4);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld5, ad1, ad2, ad3);
}
    boolean lb6 = true;
if(ao1 != null){
      lb6 = ao1.m2();
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(lb1, lb2, lb4, lb6);
}
    fb0 = !fb1;

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
    Output.points[3][8] -= fd1;
    double ld0 = 339.7241876663472;
    double ld1 = 730.4868601749562;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ld1, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ld1 *= -1;
    fb1 = fd0 < fd1;
    ld0 *= -1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = fd0 > fd1;
    ld0 = ld1 + fd0;
    fd1 = ld0 - ld1;
    fd0 = fd1 + ld0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1();
}
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
if(ao1 != null){
          fd0 = ao1.m3(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        ad4 = fd0 - fd1;
        double ld0 = 208.36098053450635;
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        Thought lo1 = Thought68.getInstance(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
        for(int i1=0; i1<10; i1++){
            boolean lb2 = true;
            ad4 = fd0 - fd1;
            ld0 = ad1 + ad2;
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
if(ao1 != null){
              ao1.m1(ao2, ao3, ao4, fo0);
}
            double ld3 = 661.8386120694369;
            ab1 = ad2 > ad3;
            for(int i2=0; i2<10; i2++){
if(fo1 != null){
                  ad4 = fo1.m3(fd0, fd1, ld3, ld0);
}
                Thought lo4 = Thought286.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo1 != null){
                  fo0 = fo1.m4();
}
if(ao2 != null){
                  ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ld0, fb1, lb2, ab1, ab2);
}
if(ao3 != null){
                  ao3.m1(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
                lb2 = fd0 > fd1;
                ld3 = ld0 - ad1;
}}}
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
    Thought lo0 = Thought128.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 828.9811077173836;
    fb1 = fd0 > fd1;
    Output.points[4][0] -= ld1;
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought166.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb2, fb0, fb1);

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
    double ld0 = 297.94375784178754;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    double ld1 = 27.898983218981414;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    Output.points[4][1] -= ld1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld0;
    Thought lo4 = Thought126.getInstance(ab2, ab3, ab4, fb0);
    ld1 = fd0 + fd1;
    ld0 *= -1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        ad1 *= -1;
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
        ad4 = fd0 - fd1;
        fb1 = fb0 || fb1;
        ad1 *= -1;
        double ld0 = 858.434916977054;
        fb0 = fb1 && fb0;
        ad1 = ad2 - ad3;
        fb1 = ad4 > fd0;
        boolean lb1 = false;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
        lb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb2 = false;
        Thought lo3 = Thought389.getInstance(lb1, lb2, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
        Output.points[4][2] += ad4;
        fd0 = fd1 + ld0;
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
    Output.points[4][3] -= ad2;
    ab1 = !ab2;
    ab3 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought38.getInstance(fo0, fo1, fo0, fo1);
    fd1 = ad1 - ad2;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[4][4] -= ad1;
    Output.points[4][5] -= ad2;
    boolean lb1 = false;
    Thought lo2 = Thought266.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
    Thought lo3 = Thought66.getInstance();
    boolean lb4 = false;
if(fo0 != null){
      ad4 = fo0.m3(lb1, lb4, ab1, ab2);
}
    fd0 *= -1;
    Output.points[4][6] += fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[4][7] += fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, lb4, ab1, ab2);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld0 = 659.3916317993177;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought109.getInstance(fd0, fd1, ld0, fd0);
    fd1 *= -1;
    ld0 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = true;
    if (lb2) {
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb1, lb2, fb0, fb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    fb0 = fb1 || fb0;
    double ld0 = 713.188006628843;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought287.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought127.getInstance(fd0, fd1, ld0, ad1);
    ad2 = ad3 + ad4;
    Thought lo3 = Thought360.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
if(ao4 != null){
      ao4.m1();
}
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fb1 = fd1 > ld0;

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
    Thought lo0 = Thought171.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
    Output.points[4][8] -= fd0;
    ab1 = fd1 > fd0;
    Output.points[5][0] -= fd1;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][1] += ad1;
    Thought lo0 = Thought122.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ad2 = ad3 - ad4;
    ab2 = !ab3;
    boolean lb1 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo2 = Thought302.getInstance(fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        ab3 = ab4 && fb0;
        fb1 = ad2 < ad3;
        double ld3 = 102.53817352559537;
        lb1 = !ab1;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        ld3 = ad1 + ad2;
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
    Thought lo0 = Thought371.getInstance();
        fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb1 = false;
    lb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 701.673408915828;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 > fd1;
    double ld1 = 877.0249950011557;
if(fo1 != null){
      fo1.m1();
}
        Output.points[5][2] += ld0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[5][3] -= ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    double ld2 = 479.18979541185615;
if(fo0 != null){
      fo0.m1(ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > ld1;
    fb1 = ld2 < fd0;
    fd1 = ld0 + ld1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ld2, fd0, fd1, ld0);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;

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
