package genetic;
import java.util.ArrayList;
class Thought199 extends Thought{
private static ArrayList<Thought199> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 755.8057477350974;
private double fd1 = 547.4535841335852;
private Thought fo0 = null;
private Thought fo1 = null;
Thought199 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought199 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought199 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought199 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought199 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought199 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought199 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought199 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought199 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought199 instance = new Thought199 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought199 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought199 instance = new Thought199 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought199 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought199 instance = new Thought199 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought199 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought199 instance = new Thought199 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought199 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought199 instance = new Thought199 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought199 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought199 instance = new Thought199 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought199 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought199 instance = new Thought199 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought199 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought199 instance = new Thought199 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[1][7] += fd0;
    double ld0 = 330.8964417624039;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    if (fb1) {
        lb1 = fd1 < ld0;
        fd0 *= -1;
if(fo1 != null){
          fo1.m1(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
        Output.points[1][8] -= ld0;
        fb1 = lb1 && fb0;
        boolean lb2 = false;
        Thought lo3 = Thought9.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb1);
        Output.points[2][0] -= fd0;
        fb0 = fd1 > ld0;
        fb1 = fd0 < fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fd0 *= -1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, ab1);
}
    fd1 *= -1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought155.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb3 = false;
    fd1 = fd0 + fd1;
    Thought lo4 = Thought254.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[2][1] -= fd0;
    ab4 = fd1 > fd0;
    fd1 *= -1;
    Thought lo5 = Thought276.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb6 = true;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, lb1, lb3);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 295.36171901466287;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    Output.points[2][2] -= ad1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    lb1 = ad3 > ad4;
    boolean lb2 = false;
    lb2 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
    lb3 = ad2 > ad3;
    ad4 = fd0 - fd1;
    fb0 = ld0 < ad1;
    boolean lb4 = false;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Thought lo5 = Thought266.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, lb1, lb2, lb3);

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
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought102.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 + fd0;
    fb0 = fb1 || ab1;
    ab2 = fd1 > ad1;
    boolean lb1 = false;
    double ld2 = 454.2060041964616;
    Thought lo3 = Thought337.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
}
    boolean lb4 = true;
    ab2 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb4, ab1, ab2);
}
    ab3 = ab4 || fb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 646.7679702529326;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ld0 = fd0 - fd1;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fb1 = fd0 < fd1;
    ld0 *= -1;
    fd0 = fd1 - ld0;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought235.getInstance();

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
    fb1 = !fb0;
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    Thought lo0 = Thought98.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
    lb1 = ad1 < ad2;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    lb2 = fb0 && fb1;
    lb1 = !lb2;
    boolean lb3 = true;
    lb3 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    lb1 = lb2 && lb3;
    ad2 = ad3 + ad4;
if(ao4 != null){
      fb0 = ao4.m2();
}
if(fo0 != null){
      fo0.m3(fb1, lb1, lb2, lb3);
}
    fd0 = fd1 - ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = !fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = fd1 < fd0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    fb0 = fb1 || lb0;
    Output.points[2][3] -= fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(lb1, lb2, lb3, ab1);
}
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld4 = 357.7490919448016;
    lb0 = lb1 || lb2;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    boolean lb1 = true;
    ab2 = ad2 > ad3;
    ab3 = ad4 < fd0;
    ab4 = fb0 && fb1;
    fd1 = ad1 - ad2;
    lb0 = lb1 || ab1;
    ab2 = ad3 < ad4;
    Thought lo2 = Thought183.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
if(ao1 != null){
      ao1.m3();
}
    boolean lb3 = false;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    double ld4 = 488.5650765891483;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld4, ad1, fb1, lb0, lb1, lb3);
}
if(ao4 != null){
          ao4.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    lb1 = lb3 || ab1;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = !fb0;
    Thought lo0 = Thought289.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 887.4315526653755;
    fd0 = fd1 - ld1;
    fd0 *= -1;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 80.72594692632377;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ld0 > fd0;
    double ld1 = 557.728013495949;
    Thought lo2 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
    fd0 = fd1 - ld0;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    if (ab4) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
        ld1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ld0 = ld1 - fd0;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo1.m3(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0, fb0, fb1, ab1, ab2);
}
        boolean lb3 = false;
        } else if (ab3) {
        fd1 = ld0 - ld1;
        Output.points[2][4] -= fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    Output.points[2][5] += ad1;
    Thought lo1 = Thought381.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
        double ld2 = 547.5429800218882;
    boolean lb3 = true;
    Output.points[2][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
}
    fd1 = ld2 + ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ad1);
}
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    Thought lo4 = Thought170.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    boolean lb5 = false;
    fb0 = ld2 > ad1;
    fb1 = !lb0;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    Thought lo1 = Thought395.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
        ab2 = ad3 < ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    Output.points[2][7] -= fd0;
    fb0 = fb1 && lb0;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought63.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    lb0 = fd1 < fd0;

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
    fb0 = !fb1;
    fb0 = ad2 < ad3;
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2();
}
    Thought lo0 = Thought212.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld1 = 768.1553787541229;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought190.getInstance(ao4, fo0, fo1, ao1);
    fb1 = fd1 > ld1;
    fb0 = !fb1;
    Thought lo3 = Thought50.getInstance(ad1, ad2, ad3, ad4);
    Thought lo4 = Thought23.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
    boolean lb5 = false;
if(fo1 != null){
      lb5 = fo1.m2();
}
if(ao1 != null){
      ao1.m2(fb0, fb1, lb5, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb5, fb0, fb1);
}
    fd1 = ld1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb5, fb0, fb1, lb5);
}
    fd1 = ld1 - ad1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb5, fb0);
}
    fb1 = ad2 < ad3;
    Thought lo6 = Thought70.getInstance(ao2, ao3, ao4, fo0);

Thought.STACK_COUNTER++;
return lb5;
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, ab1, ab2);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
    ab4 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    fd0 *= -1;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = lb2 || ab1;
    Thought lo3 = Thought147.getInstance(ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    if (ab4) {
if(ao1 != null){
          fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
        double ld0 = 175.36175834177618;
        fb1 = ad4 < fd0;
        if (ab1) {
            } else {
            ab2 = ab3 || ab4;
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
            fd1 = ld0 - ad1;
            ad2 = ad3 - ad4;
            fd0 = fd1 + ld0;
            if (ab3) {
                boolean lb1 = false;
if(ao2 != null){
                  ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
                ab3 = ab4 || fb0;
                ad1 = ad2 - ad3;
if(ao1 != null){
                  ao1.m2(ad4, fd0, fd1, ld0);
}
}}}
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
    fb1 = fb0 || fb1;
    fd1 *= -1;
    fb0 = !fb1;
    fd0 *= -1;
    double ld0 = 669.7023689039903;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    fb1 = fb0 && fb1;
    Output.points[2][8] -= fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 < ld0;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    Thought lo1 = Thought88.getInstance();
    double ld2 = 574.4660330337289;
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
        ld2 = fd0 + fd1;
        Thought lo3 = Thought200.getInstance(fb0, fb1, fb0, fb1);
        boolean lb4 = true;
        Thought lo5 = Thought261.getInstance(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, lb4, fb0, fb1, lb4);
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld2, fd0, fd1, fb0, fb1, lb4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb4, fb0, fb1);
}
if(fo1 != null){
          lb4 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ld0 *= -1;
        if (fb0) {
}}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][0] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    double ld1 = 998.3684297146707;
    lb0 = ab1 || ab2;
    Thought lo2 = Thought166.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought5.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        fd1 = ld1 - fd0;
        lb0 = !ab1;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ld1 = fo1.m3(fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd1 = ld1 - fd0;
        boolean lb4 = true;
        fd1 *= -1;
if(fo1 != null){
          fo1.m1(ld1, fd0, fd1, ld1);
}
        if (lb0) {
            ab1 = fd0 > fd1;
            ld1 = fd0 + fd1;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
              fo1 = fo0.m4();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    Thought lo0 = Thought168.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought280.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2();
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    double ld0 = 681.8510858859007;
    Output.points[3][1] += ld0;
    ab2 = ab3 || ab4;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;

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
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld0 = 990.9157052541024;
    Thought lo1 = Thought165.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
    fd1 *= -1;
    ld0 *= -1;
    fb1 = fb0 && fb1;
    boolean lb2 = true;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb2 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(lb2, fb0, fb1, lb2);
}
    fd0 = fd1 + ld0;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
    boolean lb3 = false;
    boolean lb4 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, lb4, fb0, fb1, lb2);
}
    boolean lb5 = false;
    fd0 *= -1;
    double ld6 = 473.39681658569486;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, ld6, lb3, lb4, lb5, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb2, lb3, lb4, lb5);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    double ld0 = 745.1601107331122;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2);
}
if(ao3 != null){
          fb0 = ao3.m2();
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        ad3 *= -1;
        Output.points[3][2] += ad4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = ad2 < ad3;
if(fo1 != null){
          fo1.m1(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        double ld1 = 885.8709369595189;
        fb1 = ld0 > ad1;
        boolean lb2 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    lb1 = !lb2;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
          ao1 = ao2.m4();
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought313.getInstance(fo1, ao1, ao2, ao3, lb1, lb2, ab1, ab2);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1);
}
    boolean lb4 = false;
    double ld5 = 586.7696439781363;
    ab2 = ld5 < ad1;
    ad2 *= -1;
    boolean lb6 = true;
    boolean lb7 = true;
    boolean lb8 = false;
    ad3 = ad4 - fd0;
    boolean lb9 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld5, ad1, ad2);
}
if(ao3 != null){
      lb8 = ao3.m2();
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought287.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    double ld1 = 278.0740952076191;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 768.8065667032619;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ld0 = fo1.m3(ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
        fd0 = fd1 - ld0;
        fd0 = fd1 - ld0;
        ab4 = fd0 < fd1;
        Thought lo2 = Thought72.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
        Thought lo3 = Thought369.getInstance(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
        boolean lb4 = true;
        fb0 = fb1 && lb1;
        double ld5 = 341.9490856529587;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb4, ab1, ab2, ab3);
}
        boolean lb6 = true;
        if (ab3) {
            double ld7 = 684.8974332305575;
if(fo1 != null){
              ld5 = fo1.m3(fo0, fo1, fo0, fo1);
}
            ab4 = fb0 && fb1;
            boolean lb8 = false;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld7, ld0);
}
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld7);
}
if(fo0 != null){
              fo1 = fo0.m4();
}
            ld0 *= -1;
            ld5 = fd0 + fd1;
            ld7 = ld0 - ld5;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    double ld0 = 714.4661527920571;
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    lb1 = ad4 < fd0;
    fd1 *= -1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought232.getInstance(ad3, ad4, fd0, fd1);

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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 175.77146190281957;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought51.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought44.getInstance(fb1, ab1, ab2, ab3);
    double ld3 = 495.2078834309371;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
        ab1 = !ab2;
        double ld4 = 305.2784265865268;
        Thought lo5 = Thought300.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
        fd0 = fd1 + ld4;
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
    Output.points[3][3] -= fd1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought163.getInstance(ao1, ao2, ao3, ao4);
    Output.points[3][4] -= fd0;
    double ld1 = 161.3286316718418;
    fd0 *= -1;
    fb1 = !fb0;
    fb1 = fd1 > ld1;
    fb0 = !fb1;
    boolean lb2 = true;
    double ld3 = 952.0240990179288;
    lb2 = fb0 && fb1;
    lb2 = ld3 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, ld3, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb4 = false;
    lb2 = lb4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ld1, ld3, fd0, fd1);
}
    boolean lb5 = true;
    lb2 = !lb4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb6 = true;
    boolean lb7 = false;
    Output.points[3][5] += ld1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 903.7398947484576;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, fb0, fb1);
}
    lb0 = ad1 > ad2;
    ad3 *= -1;
    ad4 *= -1;
    lb1 = fb0 || fb1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2, lb0, lb1, fb0, fb1);
}
    lb0 = ad3 > ad4;
    lb1 = fb0 || fb1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld2, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    Output.points[3][6] += ad4;
    Thought lo3 = Thought299.getInstance(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
    fd0 *= -1;
    double ld4 = 581.602727892476;
    double ld5 = 85.4976587552442;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    lb0 = !lb1;
    ad4 = fd0 + fd1;
if(ao4 != null){
      fb0 = ao4.m2(ld2, ld4, ld5, ad1);
}
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    boolean lb6 = false;
    fd1 = ld2 - ld4;
    ld5 *= -1;

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
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = lb1 && ab1;
    fd1 = fd0 - fd1;
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    lb1 = !lb2;
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    double ld4 = 252.748627295006;
if(fo1 != null){
      ld4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[3][7] += fd1;
if(fo0 != null){
      ld4 = fo0.m3(fd0, fd1, ld4, fd0, fb1, lb0, lb1, lb2);
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
    Thought lo0 = Thought370.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb0 = fb1 || lb1;
    ad3 = ad4 + fd0;
    boolean lb2 = true;
    Thought lo3 = Thought225.getInstance(lb2, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, lb2, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    lb2 = fd1 < ad1;
    Thought lo4 = Thought302.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    boolean lb5 = true;

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
      fo0.m2();
}
    fb0 = fd1 > fd0;
    double ld0 = 116.5782149726893;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[3][8] += fd1;
    boolean lb1 = false;
    lb1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
        boolean lb2 = false;
    boolean lb3 = false;
    ld0 = fd0 - fd1;
    lb2 = lb3 && fb0;
        Thought lo4 = Thought92.getInstance(fo0, fo1, fo0, fo1);
    Output.points[4][0] -= ld0;
    fb1 = !lb1;
    lb2 = !lb3;
    fb0 = !fb1;

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
    fd1 *= -1;
    boolean lb0 = false;
    lb0 = !fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought195.getInstance(fb1, lb0, fb0, fb1);
    boolean lb2 = true;
    Output.points[4][1] -= fd1;

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
    fd0 *= -1;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
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
}
