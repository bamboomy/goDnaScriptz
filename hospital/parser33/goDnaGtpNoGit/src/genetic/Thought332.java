package genetic;
import java.util.ArrayList;
class Thought332 extends Thought{
private static ArrayList<Thought332> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 799.4637155255411;
private double fd1 = 30.238211832321138;
private Thought fo0 = null;
private Thought fo1 = null;
Thought332 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought332 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought332 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought332 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought332 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought332 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought332 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought332 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought332 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought332 instance = new Thought332 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought332 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought332 instance = new Thought332 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought332 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought332 instance = new Thought332 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought332 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought332 instance = new Thought332 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought332 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought332 instance = new Thought332 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought332 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought332 instance = new Thought332 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought332 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought332 instance = new Thought332 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought332 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought332 instance = new Thought332 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;

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
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fb1 = ab1 || ab2;
    fd0 *= -1;
    double ld0 = 843.3086718040742;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ld0;
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought255.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ld0 > fd0;
    ab4 = fb0 || fb1;

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
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought370.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m2(lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought399.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
    double ld4 = 786.2673184980915;
if(fo0 != null){
      lb1 = fo0.m2(ld4, ad1, ad2, ad3, lb2, fb0, fb1, lb1);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    double ld5 = 307.52979125068737;
    boolean lb6 = false;
    ad4 *= -1;
    fd0 = fd1 - ld4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = ld5 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, ld5, ad1, ad2, ad3);
}
    ad4 *= -1;
    lb6 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld7 = 619.8680033300766;
    ad4 = fd0 + fd1;

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
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought38.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    ab2 = ad4 < fd0;
    double ld1 = 539.6882759482057;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 323.14127855469087;
    double ld4 = 797.8532041970935;
    Output.points[8][4] -= ad3;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ld1);
}
    boolean lb5 = true;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld4, ad1, ad2);
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1();
}
    lb0 = !fb0;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    Output.points[8][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    lb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
        lb0 = lb1 || fb0;
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
    ad2 *= -1;
    Thought lo0 = Thought94.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    Output.points[8][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb0 = fb1 || fb0;
    double ld1 = 617.6643176679469;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo2 = Thought129.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);

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
    fd1 = fd0 - fd1;
    Thought lo0 = Thought102.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought166.getInstance(fo0, fo1, ao1, ao2);
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld3 = 980.9385227812251;
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    Thought lo5 = Thought323.getInstance(fo1, ao1, ao2, ao3, fd1, ld3, fd0, fd1, ab4, fb0, fb1, lb2);
if(ao4 != null){
      ao4.m2(ld3, fd0, fd1, ld3, lb4, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb4);
}
    boolean lb6 = true;
    lb6 = ab1 || ab2;
    Thought lo7 = Thought382.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ao2.m2(ld3, fd0, fd1, ld3);
}
    double ld8 = 874.8454796195936;
    Output.points[8][7] += ld8;
    fd0 = fd1 + ld3;
    ld8 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, ld8, fd0, fd1);
}
    double ld9 = 347.5637345498799;
    ab3 = ab4 && fb0;

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
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m3();
}
    Thought lo0 = Thought96.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
    ab1 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    double ld2 = 68.10691464605506;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, lb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fd0 *= -1;
    Thought lo0 = Thought124.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    if (fb0) {
        double ld1 = 198.30974367701893;
        fd0 *= -1;
        fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2();
}
        fb0 = fd1 < ld1;
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
    ab1 = ab2 && ab3;
    double ld0 = 336.3004692356477;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    Output.points[8][8] -= fd0;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld0, fd0);
}
    Output.points[0][0] -= fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ld0 = fd0 - fd1;
    boolean lb2 = false;
    boolean lb3 = true;
    double ld4 = 19.50988267998803;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, ab1, ab2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
    ld0 = ld4 - fd0;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Output.points[0][1] += ad3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld0 = 573.4912702928585;
if(fo0 != null){
          ad3 = fo0.m3(fb0, fb1, fb0, fb1);
}
        ad4 = fd0 - fd1;
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
    ab2 = ad1 > ad2;
    ab3 = !ab4;
            ad3 = ad4 - fd0;
    fb0 = fd1 > ad1;
    Thought lo0 = Thought67.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    double ld1 = 767.5364987734442;
    double ld2 = 644.791625350397;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ld2 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[0][2] -= fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
    fb0 = fb1 && lb0;
    if (fb0) {
        fb1 = fd1 > fd0;
        boolean lb1 = true;
if(ao1 != null){
          ao1.m3(fd1, fd0, fd1, fd0);
}
        double ld2 = 400.5436227449792;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3();
}
    boolean lb0 = false;
    Thought lo1 = Thought344.getInstance(fb0, fb1, lb0, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought45.getInstance(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
        Thought lo3 = Thought142.getInstance(ao2, ao3, ao4, fo0);
        ad2 = ad3 - ad4;
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
    Output.points[0][3] -= fd0;
    Thought lo0 = Thought280.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    Thought lo2 = Thought32.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        lb1 = fd1 < fd0;
        fd1 = fd0 - fd1;
        lb3 = ab1 || ab2;
        double ld4 = 830.3501148429233;
if(fo1 != null){
          ld4 = fo1.m3();
}
if(ao1 != null){
          ab3 = ao1.m2(ab4, fb0, fb1, lb1);
}
if(ao2 != null){
          lb3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld4, fd0, ab1, ab2, ab3, ab4);
}
        boolean lb5 = true;
        Output.points[0][4] += fd1;
        ld4 = fd0 + fd1;
if(ao1 != null){
          ao1.m1(ld4, fd0, fd1, ld4, ab4, fb0, fb1, lb5);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 160.11383892442618;
        ab1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fd1 = ld0 + ad1;
    Output.points[0][5] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    fb1 = ab1 && ab2;
    boolean lb1 = true;
    Thought lo2 = Thought87.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][6] += fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        lb0 = fd0 > fd1;
        fb0 = fb1 && lb0;
        Thought lo1 = Thought296.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
        fb1 = lb0 && fb0;
        fd0 *= -1;
        fd1 = fd0 + fd1;
        Thought lo2 = Thought382.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        fb0 = fd0 > fd1;
        fb1 = fd0 > fd1;
        Thought lo3 = Thought350.getInstance(fo1, fo0, fo1, fo0);
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    lb0 = ab1 && ab2;
    Thought lo1 = Thought357.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = true;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb2, ab1, ab2);
}
    double ld3 = 722.2276043005678;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3, ab4, fb0, fb1, lb0);
}
    boolean lb4 = false;
    boolean lb5 = false;

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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo0.m2();
}
    fd0 *= -1;
    boolean lb1 = false;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
    lb0 = lb1 && lb2;
    boolean lb3 = false;
    Thought lo4 = Thought208.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
    boolean lb5 = true;
    lb1 = lb2 || lb3;
    lb5 = !fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    double ld0 = 857.7562103133831;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    Output.points[0][7] -= ad3;
    lb2 = ad4 < fd0;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m1(fd1, ld0, ad1, ad2);
}
    double ld3 = 887.3489263483375;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld3, ad1);
}
    Output.points[0][8] -= ad2;
    Thought lo4 = Thought205.getInstance();
    Thought lo5 = Thought161.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
}
    double ld6 = 76.7126649819467;
    boolean lb7 = false;
    boolean lb8 = false;

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
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought261.getInstance(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought99.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb0 = !fb0;
    Thought lo3 = Thought309.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    boolean lb4 = false;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    boolean lb5 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(lb0, lb4, lb5, fb0);
}
    fb1 = lb0 || lb4;

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
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    Thought lo1 = Thought121.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    double ld2 = 903.731477406298;
    ad4 *= -1;
    lb0 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 380.670514614146;
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, ld3, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb4 = false;
    ld2 *= -1;
    lb4 = ld3 < ad1;
    ad2 *= -1;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb4);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought397.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ab1 = ao2.m2();
}
    ab2 = fd0 < fd1;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    double ld1 = 877.7888925183804;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m1(fb0, fb1, lb2, ab1);
}
        ld1 = fd0 - fd1;
        for(int i1=0; i1<10; i1++){
}}
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
    Thought lo0 = Thought69.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, ab1, ab2, ab3);
}
    Output.points[1][0] += ad4;
    fd0 = fd1 - ad1;
    ab4 = ad2 < ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought97.getInstance(ad1, ad2, ad3, ad4);
    double ld3 = 940.1279400334673;
    boolean lb4 = false;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld5 = 401.11227431557256;
    ad1 *= -1;
    if (ab2) {
        ab3 = ab4 && fb0;
        for(int i0=0; i0<10; i0++){
            boolean lb6 = false;
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    if (lb0) {
        fb0 = fb1 && lb0;
        fb0 = fb1 || lb0;
        fb0 = fd1 < fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        fd1 = fd0 + fd1;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb0, fb0, fb1);
}
        double ld2 = 495.4500600542009;
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    double ld1 = 406.42380806785116;
    Output.points[1][1] += ld1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 98.3926711424171;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld2, ld1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld1);
}
        double ld3 = 709.2005187965094;
if(fo0 != null){
          lb0 = fo0.m2();
}
        ab1 = ld1 < fd0;
if(fo1 != null){
          ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
        lb0 = fd1 < ld2;
        Output.points[1][2] -= ld3;
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld0 = 255.44456062010585;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb1 = fd1 > ld0;
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
    double ld3 = 361.3576268813387;
    lb2 = fb0 || fb1;
    ad3 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb1 = lb2 || lb4;
    ad4 = fd0 + fd1;
        fb0 = ld0 > ld3;
    boolean lb5 = true;

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
    ab1 = !ab2;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought348.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought392.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb2 = ad1 < ad2;
if(fo1 != null){
      fo1.m1();
}
    ab1 = !ab2;
    ab3 = ad3 > ad4;
    boolean lb3 = false;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    boolean lb4 = false;
    double ld5 = 737.6468214646604;
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
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
    Output.points[1][3] -= fd0;
    fd1 *= -1;
    Thought lo0 = Thought263.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        lb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
        fd1 = fd0 + fd1;
    fb1 = !lb1;
    Thought lo2 = Thought214.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[1][4] += fd1;
    fb0 = fb1 || lb1;
        double ld3 = 944.8786052321221;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;

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
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    double ld1 = 821.3309434438241;
    Thought lo2 = Thought389.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    Thought lo3 = Thought341.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        fb0 = ld1 < ad1;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
        lb0 = ad2 > ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        for(int i1=0; i1<10; i1++){
            fd0 = fd1 - ld1;
            boolean lb4 = true;
            double ld5 = 48.00737035359409;
            double ld6 = 453.2139101778433;
            ld6 = ld1 + ad1;
            Thought lo7 = Thought355.getInstance();
            lb0 = ad2 > ad3;
            ad4 = fd0 + fd1;
            ld5 = ld6 + ld1;
            boolean lb8 = false;
            lb0 = ad1 > ad2;
            ad3 *= -1;
            fb0 = ad4 < fd0;
            fb1 = lb4 && lb8;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ab2 = ab3 && ab4;
    Output.points[1][5] += fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    Output.points[1][6] -= ad1;
    lb0 = lb1 && ab1;
    ad2 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
    fb1 = lb0 && lb1;
if(ao1 != null){
      ad4 = ao1.m3();
}
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
}
    ab1 = ad1 > ad2;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought242.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        Thought lo2 = Thought263.getInstance(fo1, fo0, fo1, fo0);
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought360.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
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
    Thought lo0 = Thought361.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    fb0 = fd0 > fd1;
    double ld2 = 444.5686372261893;
    fb1 = ld2 > fd0;
    lb1 = !fb0;
    Thought lo3 = Thought354.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
    fb1 = ld2 > fd0;
    fd1 = ld2 + fd0;
    lb1 = fd1 < ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][7] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
    lb1 = fd1 < ld2;

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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought122.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    lb0 = lb1 || fb0;
    fb1 = !lb0;
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb3 = false;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    lb3 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
    Output.points[1][8] -= fd0;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = lb3 && lb4;
    fb0 = fd1 > fd0;
    Thought lo5 = Thought245.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3();
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
