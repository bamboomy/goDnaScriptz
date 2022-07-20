package genetic;
import java.util.ArrayList;
class Thought177 extends Thought{
private static ArrayList<Thought177> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 724.3152382089087;
private double fd1 = 645.7141978090692;
private Thought fo0 = null;
private Thought fo1 = null;
Thought177 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought177 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought177 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought177 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought177 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought177 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought177 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought177 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought177 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought177 instance = new Thought177 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought177 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought177 instance = new Thought177 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought177 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought177 instance = new Thought177 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought177 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought177 instance = new Thought177 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought177 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought177 instance = new Thought177 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought177 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought177 instance = new Thought177 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought177 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought177 instance = new Thought177 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought177 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought177 instance = new Thought177 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought107.getInstance();
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo1 = Thought284.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    lb2 = fd1 > fd0;
    Thought lo3 = Thought111.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fb0 = !fb1;
    lb2 = fd0 > fd1;
    double ld4 = 478.02348129151613;
    ld4 = fd0 + fd1;
    Output.points[7][8] -= ld4;
    fd0 = fd1 + ld4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ld4 = fo0.m3();
}
    fd0 = fd1 - ld4;
    Output.points[8][0] -= fd0;
    fb0 = !fb1;
    lb2 = fd1 < ld4;

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
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    ab3 = fd0 > fd1;
    Thought lo0 = Thought230.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    lb2 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    double ld0 = 614.1934602306893;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought264.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought145.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought207.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
        double ld4 = 365.97169585288424;
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = true;
    lb5 = fb0 && fb1;
if(fo1 != null){
      lb5 = fo1.m2(fb0, fb1, lb5, fb0);
}
    fb1 = lb5 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld4, ad1, ad2, fb1, lb5, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, lb5, fb0, fb1, lb5);
}
    Thought lo6 = Thought268.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb5, fb0);
    fb1 = ld4 > ad1;
    boolean lb7 = false;
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    ab2 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ab3 = ad2 < ad3;
        ad4 *= -1;
    boolean lb0 = true;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m2();
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    Thought lo1 = Thought191.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    Thought lo2 = Thought229.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
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
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    double ld0 = 178.18165321944534;
    Output.points[8][1] += fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fb0 = fb1 || fb0;
    double ld1 = 613.4615249683042;
    Thought lo2 = Thought285.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ad1 *= -1;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought8.getInstance(fo0, fo1, ao1, ao2, ld0, ld1, ad1, ad2);
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ld0 = ao3.m3();
}
    ld1 *= -1;
    Thought lo4 = Thought336.getInstance(fb0, fb1, fb0, fb1);
    boolean lb5 = true;
    boolean lb6 = true;
    lb5 = lb6 || fb0;

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
    boolean lb0 = false;
    Thought lo1 = Thought280.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
    lb2 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld3 = 22.59544943720975;
    ab3 = ld3 < fd0;
    fd1 = ld3 + fd0;
    fd1 = ld3 - fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m3(fd1, ld3, fd0, fd1);
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld3);
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao1 != null){
      ao1.m1();
}
    fb1 = !ab1;
    ab2 = !ab3;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        double ld0 = 578.3167911348665;
    ab1 = ab2 && ab3;

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Output.points[8][2] -= fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought85.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 572.9946671819448;
    fd0 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > fd0;
    Thought lo2 = Thought87.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
        Thought lo3 = Thought137.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab3 = fo1.m2(fd1, ld0, fd0, fd1);
}
    Output.points[8][3] += ld0;
    Thought lo4 = Thought170.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);

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
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought239.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
    Thought lo1 = Thought182.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ad4 > fd0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    boolean lb2 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    Thought lo0 = Thought119.getInstance(fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Output.points[8][4] -= ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ab4 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld2 = 484.23260586744476;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    boolean lb3 = true;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[8][5] += fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought218.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Output.points[8][6] -= fd1;
    fd0 = fd1 - fd0;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    Output.points[8][7] += fd1;
    fb1 = fb0 || fb1;
    fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ad3 = ao2.m3();
}
    fb0 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    double ld0 = 4.093210524238073;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    fb0 = fb1 || fb0;
    Output.points[8][8] -= ld0;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    fb1 = !fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    Output.points[0][0] += ld0;
    fb0 = !fb1;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao2.m3();
}
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought251.getInstance(fb0, fb1, ab1, ab2);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    Output.points[0][1] += fd0;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    lb0 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    lb1 = ad2 < ad3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab1 = ad4 < fd0;
    Output.points[0][2] -= fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 993.5152471013073;
    ld0 *= -1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
    double ld2 = 495.6609212275961;
    lb1 = !fb0;
    fb1 = ld2 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
    fd1 = ld0 - ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought133.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    Thought lo2 = Thought253.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3();
}
    Output.points[0][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
    Output.points[0][4] -= fd0;
    Output.points[0][5] += fd1;
    fd0 = fd1 - fd0;
    ab4 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fb1 = lb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
    Thought lo3 = Thought167.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
        fb1 = ad3 < ad4;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb0 = fb0 && fb1;
    lb0 = ad3 > ad4;
        boolean lb1 = true;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    lb1 = fb0 || fb1;
    double ld2 = 111.86758767290704;
    boolean lb3 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ad2 = ad3 + ad4;
    Output.points[0][6] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    double ld0 = 445.1339704372136;
    double ld1 = 276.02266001990915;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ad1, fb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    Thought lo3 = Thought241.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    lb2 = ab1 && ab2;
    ad2 = ad3 - ad4;

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
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    Output.points[0][7] -= fd1;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    double ld0 = 261.66043094391773;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
    if (fb1) {
        fd0 *= -1;
        boolean lb1 = true;
        Thought lo2 = Thought278.getInstance(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
        Output.points[0][8] += ld0;
        boolean lb3 = true;
        lb3 = fd0 > fd1;
        ld0 = fd0 - fd1;
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb3);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        boolean lb4 = false;
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
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ad3 = ao2.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    Output.points[1][0] += fd0;
        fb1 = fd1 < ad1;
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    Thought lo2 = Thought14.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
if(ao2 != null){
      ao2.m2();
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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    Output.points[1][1] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    double ld1 = 317.93359808084614;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
    boolean lb2 = true;

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
    double ld0 = 725.4200156002764;
    double ld1 = 925.5565860035579;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3);
}
    Output.points[1][2] += ad4;
    boolean lb2 = false;
    boolean lb3 = true;
    fd0 = fd1 + ld0;
    lb3 = ab1 || ab2;
    ab3 = ab4 || fb0;
    Output.points[1][3] += ld1;
    boolean lb4 = false;
if(ao2 != null){
      ad1 = ao2.m3();
}
    ad2 = ad3 + ad4;

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
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld1 = 846.1418192138692;
    lb0 = ld1 > fd0;
if(fo1 != null){
      fo1.m1(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 || lb0;
    Thought lo3 = Thought255.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld4 = 212.0270903012611;
    ld1 *= -1;
    lb2 = fb0 && fb1;
    boolean lb5 = false;
    ld4 *= -1;
    lb0 = lb2 && lb5;
    boolean lb6 = false;
    boolean lb7 = true;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld1);
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
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought39.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Output.points[1][4] += fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    ab2 = ab3 || ab4;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;

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
    fb0 = fb1 && fb0;
    Output.points[1][5] -= ad1;
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought399.getInstance();
    fb0 = ad1 < ad2;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    lb1 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    Output.points[1][6] -= fd0;
    lb1 = lb2 || fb0;
    fb1 = lb1 && lb2;

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
    double ld0 = 749.7330802426144;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought254.getInstance(fo1, fo0, fo1, fo0);
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    Thought lo2 = Thought6.getInstance(fd1, ld0, ad1, ad2);
    ab2 = ad3 > ad4;
    double ld3 = 995.5786179699733;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    ad4 *= -1;
    fd0 = fd1 + ld0;
    ld3 = ad1 + ad2;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 15.54732972715966;
    Output.points[1][7] += fd0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    if (fb0) {
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought55.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
          ao4.m2(fd1, ld0, fd0, fd1);
}
        Thought lo2 = Thought142.getInstance(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
if(ao4 != null){
          ao3 = ao4.m4();
}
        fd0 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb0 = fb1 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
        fb1 = fb0 || fb1;
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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ao1.m1();
}
    Thought lo0 = Thought349.getInstance(fb0, fb1, fb0, fb1);
    if (fb0) {
        fb1 = ad3 < ad4;
        double ld1 = 892.3643342534499;
        } else if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        Output.points[1][8] -= ad3;
if(ao2 != null){
          fb1 = ao2.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
        boolean lb2 = false;
        double ld3 = 764.2292216083335;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        lb2 = fb0 || fb1;
        Thought lo4 = Thought265.getInstance(ad1, ad2, ad3, ad4);
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
    ab1 = fd1 < fd0;
    ab2 = !ab3;
        fd1 = fd0 + fd1;
    Output.points[2][0] += fd0;
    Output.points[2][1] += fd1;
    double ld0 = 916.0956738054796;
    ld0 = fd0 - fd1;
    Output.points[2][2] -= ld0;
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb1 = false;
    ab4 = fd0 > fd1;
    fb0 = fb1 || lb1;
    ld0 = fd0 + fd1;

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
    ab2 = ad1 > ad2;
    Output.points[2][3] -= ad3;
    Output.points[2][4] += ad4;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 > ad2;
    ab3 = ab4 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ab3 = ad4 > fd0;
    double ld1 = 932.1312563376588;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought87.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab1 = ab2 && ab3;
    ad1 *= -1;
    if (ab4) {
if(ao4 != null){
          ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
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
    fd0 = fd1 + fd0;
    Output.points[2][5] += fd1;
    double ld0 = 7.1344552842470765;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = !fb0;
    fb1 = fd1 > ld0;
        fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
    fb1 = ld0 > fd0;
    Thought lo1 = Thought249.getInstance();
    fd1 = ld0 + fd0;
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;

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
    Thought lo0 = Thought64.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
        boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = !lb1;
    fb0 = fd1 > fd0;
    boolean lb2 = true;
        Thought lo3 = Thought357.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
    boolean lb4 = false;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb1);
}
    lb2 = lb4 && fb0;
    Thought lo5 = Thought20.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, lb2, lb4);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought183.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 || lb1;
    boolean lb7 = false;
    fd0 = fd1 - fd0;
    double ld8 = 515.6454811887495;
    lb2 = fd0 > fd1;

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
    fb0 = fd0 > fd1;
    Thought lo0 = Thought375.getInstance();
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Thought lo1 = Thought33.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    Thought lo2 = Thought31.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    lb3 = !fb0;
    fb1 = fd1 > fd0;
    lb3 = fb0 && fb1;
    Thought lo4 = Thought5.getInstance(fd1, fd0, fd1, fd0);
    lb3 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo5 = Thought106.getInstance();
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
