package genetic;
import java.util.ArrayList;
class Thought42 extends Thought{
private static ArrayList<Thought42> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 15.067334164026057;
private double fd1 = 709.0059648104367;
private Thought fo0 = null;
private Thought fo1 = null;
Thought42 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought42 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought42 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought42 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought42 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Output.points[6][7] += fd0;
    double ld0 = 773.4168806280907;
    Thought lo1 = Thought291.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd1 *= -1;
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;

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
    Output.points[6][8] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    double ld0 = 417.1764263315026;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + fd0;
    Output.points[7][0] += fd1;
    Thought lo1 = Thought281.getInstance(fo1, fo0, fo1, fo0);
    ld0 *= -1;

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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Output.points[7][1] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    lb0 = !fb0;
    double ld1 = 343.83266037937307;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    Output.points[7][2] -= ad4;
    double ld3 = 200.73929367913956;
    lb0 = ad4 > fd0;
    lb2 = fb0 && fb1;
    lb0 = !lb2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld3, ad1, ad2, fb0, fb1, lb0, lb2);
}
    ad3 = ad4 - fd0;

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
      fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    ab2 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
    if (ab3) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        } else if (ab4) {
if(fo0 != null){
          ad1 = fo0.m3();
}
        fb0 = fb1 && lb0;
        } else {
if(fo1 != null){
          ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
        Output.points[7][3] -= ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
        boolean lb1 = true;
if(fo1 != null){
          ab2 = fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
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
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        boolean lb0 = true;
        Output.points[7][4] += fd1;
        fb0 = fb1 || lb0;
        fb0 = fb1 || lb0;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
        }
    Thought lo1 = Thought199.getInstance(fo1, ao1, ao2, ao3);
    fd0 *= -1;
    fb0 = !fb1;
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    lb2 = fd0 < fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought170.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1();
}
if(ao1 != null){
      fo1 = ao1.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fd1 > ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb2, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, ad1, ad2, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb2, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fb1 = lb0 && lb2;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
        lb2 = !fb0;
    boolean lb3 = true;
    boolean lb4 = true;
    Thought lo5 = Thought211.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    double ld6 = 585.99251096105;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld6, lb2, lb3, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb2, lb3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb4, fb0, fb1, lb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb2 = fo1.m2(fd1, ld6, ad1, ad2);
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 && ab1;
    boolean lb0 = true;
    Thought lo1 = Thought397.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Output.points[7][5] -= fd0;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
        }
    fb1 = fd1 < fd0;
    Output.points[7][6] += fd1;
    boolean lb2 = true;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
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
    ab2 = ad1 < ad2;
    double ld0 = 522.0417802346228;
if(ao2 != null){
      ab3 = ao2.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    boolean lb1 = false;
    ab3 = ab4 || fb0;
    double ld2 = 957.8221037388571;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, ld2, ad1, ad2);
}
    ad3 = ad4 + fd0;
    lb1 = fd1 < ld0;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought171.getInstance();
    fb1 = fd1 < fd0;
    Output.points[7][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    double ld2 = 724.3575258252083;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ld2, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
        lb1 = !fb0;
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
    Thought lo0 = Thought255.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
        fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    Output.points[7][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought312.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    Thought lo3 = Thought257.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);

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
if(fo0 != null){
      fo0.m1();
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    lb0 = !lb1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    double ld2 = 102.60575366234502;
    lb1 = !fb0;
    fb1 = lb0 || lb1;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    double ld3 = 920.2786718830939;
    Thought lo4 = Thought295.getInstance(fo0, fo1, fo0, fo1);

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab2 = fo0.m2(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb1 = true;
    Output.points[8][0] += ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    double ld2 = 366.74846590866235;
    Thought lo3 = Thought35.getInstance(ab1, ab2, ab3, ab4);

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 < fd0;
    Output.points[8][1] += fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    double ld0 = 215.89194872809634;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + ld0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;

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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
    Output.points[8][2] += ad1;
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    Thought lo2 = Thought80.getInstance(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Output.points[8][3] -= fd1;
    ab2 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought92.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = false;
if(ao1 != null){
          fb0 = ao1.m2(fb1, lb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = fd1 < fd0;
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
    if (fb0) {
        fb1 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
        fb1 = lb1 || ab1;
        ab2 = fd1 < fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
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
    Thought lo0 = Thought207.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m2();
}
        ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        lb1 = fd0 < fd1;
        double ld2 = 385.0017830122999;
        ld2 = ad1 + ad2;
if(ao1 != null){
          ad3 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2, fb0, fb1, lb1, ab1);
}
        Thought lo3 = Thought90.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
        fd0 = fd1 + ld2;
        fb1 = lb1 || ab1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        ad1 *= -1;
        boolean lb4 = true;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        for(int i1=0; i1<10; i1++){
            ad2 = ad3 + ad4;
if(fo1 != null){
              fo1.m1(fd0, fd1, ld2, ad1);
}
            Thought lo5 = Thought169.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
            boolean lb6 = true;
if(fo1 != null){
              fo0 = fo1.m4();
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought369.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 && ab1;
    boolean lb1 = true;
    ab1 = fd0 > fd1;
    double ld2 = 235.67944455818312;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
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
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought236.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    Thought lo2 = Thought265.getInstance();
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = lb1 || fb0;
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
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
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    boolean lb0 = true;
        ad3 = ad4 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = lb0 && ab1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
        fd0 = fd1 + ad1;
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
        Output.points[8][4] += ad1;
        ab4 = fb0 && fb1;
        lb0 = ab1 || ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[8][5] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (fb0) {
        fb1 = fd1 < fd0;
        double ld0 = 512.2984335576122;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
        fd1 *= -1;
        fb0 = ld0 > fd0;
        Thought lo1 = Thought67.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
        fb1 = ld0 > fd0;
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
    Thought lo0 = Thought150.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    Thought lo2 = Thought306.getInstance(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
    fb0 = ad1 > ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    double ld3 = 986.6847855207591;
    lb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld3, ad1, ad2);
}
    lb1 = !fb0;
    Output.points[8][6] -= ad3;
    fb1 = ad4 < fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3);
}
    lb1 = !fb0;
if(ao3 != null){
      ao3.m2();
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
    fd1 *= -1;
    ab1 = !ab2;
if(ao2 != null){
      ao2.m3(ab3, ab4, fb0, fb1);
}
    Output.points[8][7] += fd0;
    Output.points[8][8] += fd1;
    Thought lo0 = Thought208.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        ab4 = fd0 < fd1;
        fb0 = fb1 && ab1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        ab2 = ab3 || ab4;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb0 = fb1 && ab1;
        double ld1 = 246.56962987238705;
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
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
    Output.points[0][0] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 629.9230146058981;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
            ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
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
    Thought lo0 = Thought25.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[0][1] += fd1;
    Thought lo1 = Thought85.getInstance();
    Thought lo2 = Thought190.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;

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
      fo0.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = !ab1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
        fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    if (fb1) {
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        ab1 = !ab2;
if(fo0 != null){
          fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        } else {
        Thought lo0 = Thought392.getInstance(fo1, fo0, fo1, fo0);
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
    Thought lo0 = Thought296.getInstance(ad2, ad3, ad4, fd0);
    Output.points[0][2] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    fb0 = !fb1;
    fd0 = fd1 + ad1;
    lb1 = ad2 > ad3;
    ad4 *= -1;
    Output.points[0][3] -= fd0;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(fo1 != null){
      lb1 = fo1.m2();
}
    lb2 = fb0 || fb1;
    boolean lb3 = true;
    fd1 = ad1 + ad2;
    lb1 = lb2 || lb3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, lb3, fb0);
}
    fd0 = fd1 + ad1;
    double ld4 = 695.2666464493869;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = lb1 || lb2;

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
    Output.points[0][4] -= ad2;
    ab1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3();
}
        ad3 = ad4 + fd0;
        boolean lb0 = false;
        Output.points[0][5] -= fd1;
if(fo1 != null){
          fo1.m1(ab1, ab2, ab3, ab4);
}
        ad1 = ad2 + ad3;
        Thought lo1 = Thought257.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
        double ld2 = 579.3536301575292;
        Thought lo3 = Thought302.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought309.getInstance();
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo1 = Thought215.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    fb0 = fb1 || lb2;

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
    fb1 = !fb0;
    boolean lb0 = false;
    double ld1 = 481.3527513394254;
    ad1 = ad2 - ad3;
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    Thought lo3 = Thought174.getInstance(ld1, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
    boolean lb4 = true;
    lb2 = lb4 || fb0;
    fb1 = lb0 && lb2;
    Output.points[0][6] += ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb4, fb0, fb1, lb0);
}
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fd1 = ld1 + ad1;
    boolean lb6 = false;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ad1);
}
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1);
}
if(ao3 != null){
      ad2 = ao3.m3();
}
if(ao4 != null){
      lb2 = ao4.m2(lb4, lb5, lb6, fb0);
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
    double ld0 = 272.5028932823181;
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = fd0 > fd1;
    double ld1 = 910.9464932550211;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought373.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[0][7] -= ld0;
    ab3 = ld1 > fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought243.getInstance();
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
    double ld1 = 315.8262347666147;
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought17.getInstance(ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
        ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 *= -1;
    boolean lb3 = false;
    fb0 = ld1 > ad1;
    boolean lb4 = false;
    ad2 = ad3 + ad4;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
        Output.points[0][8] -= ad2;
        fb1 = !lb3;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
        boolean lb5 = false;
if(ao1 != null){
          fo1 = ao1.m4();
}
        } else if (lb4) {
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
    Thought lo0 = Thought341.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    lb1 = !fb0;
    fb1 = lb1 && fb0;
    Thought lo2 = Thought392.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    boolean lb3 = false;
    fd1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought35.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    double ld1 = 967.7311877178715;
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    lb2 = ld1 > fd0;
    double ld3 = 549.3166581408412;
    fb0 = fd0 < fd1;
    ld1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1);
}
    lb2 = ld3 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    fb1 = fd1 < ld1;
    boolean lb4 = false;
    lb2 = lb4 && fb0;
    fb1 = ld3 < fd0;
    lb2 = fd1 > ld1;

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
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought113.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    double ld1 = 753.6189502349329;
    Thought lo2 = Thought272.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !fb0;
    Thought lo3 = Thought10.getInstance(fd0, fd1, ld1, fd0);
    fb1 = fb0 || fb1;
    fd1 = ld1 - fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    lb4 = fb0 || fb1;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
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
