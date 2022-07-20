package genetic;
import java.util.ArrayList;
class Thought305 extends Thought{
private static ArrayList<Thought305> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 356.2504182974171;
private double fd1 = 921.4321953604302;
private Thought fo0 = null;
private Thought fo1 = null;
Thought305 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought305 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought305 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought305 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought305 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought305 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought305 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought305 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought305 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought305 instance = new Thought305 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought305 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought305 instance = new Thought305 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought305 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought305 instance = new Thought305 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought305 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought305 instance = new Thought305 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought305 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought305 instance = new Thought305 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought305 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought305 instance = new Thought305 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought305 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought305 instance = new Thought305 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought305 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought305 instance = new Thought305 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd1 *= -1;
    Thought lo0 = Thought43.getInstance();
    fb1 = !fb0;
    double ld1 = 593.5423562876417;
    ld1 *= -1;

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
    fd1 *= -1;
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Output.points[8][7] -= fd1;
    Output.points[8][8] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought146.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Output.points[0][0] += fd1;
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    fd0 = fd1 + fd0;
    ab3 = ab4 || fb0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;

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
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    Thought lo0 = Thought133.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    double ld1 = 307.42169429288043;
    Thought lo2 = Thought323.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought214.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = false;
    double ld5 = 518.2438215897297;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb6 = false;
    fd0 = fd1 + ld1;
    ld5 = ad1 - ad2;
    ad3 *= -1;
    lb4 = !lb6;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld5, ad1, ad2);
}
    fb0 = !fb1;
    ad3 = ad4 + fd0;
    lb4 = lb6 && fb0;
    Thought lo7 = Thought62.getInstance();
    fb1 = lb4 || lb6;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb4, lb6, fb0);
}
    fb1 = !lb4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld5, ad1, lb6, fb0, fb1, lb4);
}
    boolean lb8 = true;
    lb6 = !lb8;
    fb0 = fb1 && lb4;

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
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    Thought lo0 = Thought45.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    lb1 = ab1 || ab2;
    double ld2 = 687.6664715669186;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb3 = false;
    fd0 = fd1 - ld2;
    ab3 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
    ab4 = ad4 > fd0;
    fd1 *= -1;
    ld2 = ad1 - ad2;
    Thought lo4 = Thought245.getInstance(fb0, fb1, lb1, lb3);
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    double ld5 = 577.2230145863189;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb3, ab1, ab2);
}
    boolean lb6 = true;
    boolean lb7 = false;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld5, ad1, ad2, ab1, ab2, ab3, ab4);
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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought81.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought9.getInstance();
    fd0 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    lb0 = fb0 && fb1;

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
    double ld0 = 739.7994047911781;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought115.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
    Thought lo2 = Thought22.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
if(fo1 != null){
      ld0 = fo1.m3();
}
    boolean lb3 = true;
    Thought lo4 = Thought35.getInstance(ab3, ab4, fb0, fb1);
    lb3 = ab1 || ab2;
    ab3 = !ab4;
    double ld5 = 951.1869508310081;
    fb0 = ld5 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, ld5, fd0, fb1, lb3, ab1, ab2);
}
if(fo1 != null){
          ab3 = fo1.m2(fd1, ld0, ld5, fd0, ab4, fb0, fb1, lb3);
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
    ad2 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[0][1] -= ad3;
    boolean lb0 = false;
        ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m3();
}
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    double ld2 = 208.99969025969935;
    fd0 *= -1;
if(ao2 != null){
      lb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    Output.points[0][2] += fd1;
    fb0 = ld2 > ad1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 > fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        lb0 = !fb0;
        fb1 = !lb0;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb0, fb0);
}
        fb1 = fd1 > fd0;
        Thought lo1 = Thought8.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
        fd1 = fd0 + fd1;
        fb0 = fb1 && lb0;
        Output.points[0][3] += fd0;
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
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
    double ld0 = 52.43470757221781;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    fd0 *= -1;
    fd1 = ld0 - fd0;
    ab3 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    ab4 = fd1 > ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Output.points[0][4] += ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 871.1337920544053;
    if (fb0) {
        Thought lo3 = Thought172.getInstance(fb1, lb1, ab1, ab2);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd1 *= -1;
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought140.getInstance(fo1, fo0, fo1, fo0);

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ad3 > ad4;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    double ld0 = 47.02668003268023;
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
        double ld1 = 256.09895333371776;
    Output.points[0][5] -= ad3;
    ab3 = !ab4;
    fb0 = ad4 < fd0;
    Thought lo2 = Thought63.getInstance(fo1, fo0, fo1, fo0);

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
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    Output.points[0][6] -= fd1;
        fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    fb0 = fd1 > fd0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought63.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
        fb1 = lb0 || fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    fd1 = ad1 - ad2;

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
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
    double ld0 = 11.875000190908299;
    Output.points[0][7] += fd0;
    ab4 = fd1 > ld0;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      fd1 = ao1.m3(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 750.9323334539293;
    boolean lb3 = false;
    Thought lo4 = Thought52.getInstance(ao2, ao3, ao4, fo0, lb1, lb3, ab1, ab2);
    ab3 = !ab4;
    boolean lb5 = true;
    Thought lo6 = Thought49.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m2(ld2, fd0, fd1, ld0);
}
    ld2 = fd0 + fd1;
    Thought lo7 = Thought273.getInstance(fo0, fo1, ao1, ao2, ld0, ld2, fd0, fd1);
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m3();
}
if(ao4 != null){
      ao4.m2(lb1, lb3, lb5, ab1);
}
    ab2 = ld0 > ld2;
    double ld8 = 656.9616821589909;
    ab3 = ld8 > fd0;
    ab4 = !fb0;
    double ld9 = 490.7013129346954;
    fb1 = lb1 || lb3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
    ab3 = ad3 > ad4;
    ab4 = fb0 && fb1;
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb0 = ao1.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    ab1 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Output.points[0][8] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2();
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    double ld0 = 83.16750731657436;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Output.points[1][0] += ld0;
    boolean lb1 = true;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fd1 = ld0 - fd0;
if(fo1 != null){
      ab2 = fo1.m2();
}
    fd1 *= -1;
    boolean lb2 = false;
    double ld3 = 756.9974274112437;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ld0 < ld3;
        lb1 = fd0 < fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
        boolean lb4 = false;
        Output.points[1][1] -= ld3;
        ab3 = !ab4;
        fb0 = fd0 < fd1;
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Output.points[1][2] -= fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
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
    Thought lo0 = Thought69.getInstance(ad1, ad2, ad3, ad4);
    ab1 = fd0 < fd1;
    ab2 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m3();
}
    Thought lo1 = Thought14.getInstance(ab3, ab4, fb0, fb1);
    ad2 = ad3 - ad4;
    boolean lb2 = false;
    Output.points[1][3] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb2);
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
    double ld0 = 769.7130906053575;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 593.1301631287417;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
    Output.points[1][4] += fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought147.getInstance(fd1, ld0, ld1, fd0);
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, ld1, fd0);
}
    fb0 = fd1 < ld0;
if(fo1 != null){
          fb1 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb2);
}
    double ld4 = 518.776988480712;
    boolean lb5 = true;
    lb5 = !fb0;
    fb1 = lb2 || lb5;
    Thought lo6 = Thought128.getInstance(ao3, ao4, fo0, fo1, ld1, ld4, fd0, fd1, fb0, fb1, lb2, lb5);
    ld0 = ld1 - ld4;
    fd0 = fd1 + ld0;
if(ao1 != null){
      ld1 = ao1.m3(ld4, fd0, fd1, ld0, fb0, fb1, lb2, lb5);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought101.getInstance(ad1, ad2, ad3, ad4);
    Thought lo2 = Thought239.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
    fb0 = !fb1;
    Output.points[1][5] += ad3;
if(ao4 != null){
      lb0 = ao4.m2();
}
    fb0 = ad4 > fd0;
    fb1 = lb0 && fb0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 37.03032264726769;
    Thought lo1 = Thought31.getInstance(fd0, fd1, ld0, fd0);
    fb1 = !ab1;
    ab2 = fd1 < ld0;
    ab3 = fd0 > fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    ab4 = !fb0;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd0 = ao2.m3(fb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought74.getInstance(fd0, fd1, ld0, fd0, lb2, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
}
    Thought lo4 = Thought90.getInstance(ao2, ao3, ao4, fo0);
    fd1 = ld0 + fd0;
    ab1 = ab2 && ab3;
    ab4 = fd1 > ld0;
    double ld5 = 811.8833995130158;
    fb0 = ld5 < fd0;

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
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    Output.points[1][6] += fd1;
    Thought lo0 = Thought244.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao2.m3();
}
    Thought lo1 = Thought73.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb4 = false;
    boolean lb5 = false;
    Thought lo6 = Thought78.getInstance(ad2, ad3, ad4, fd0);
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    boolean lb7 = true;
    ab3 = !ab4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 89.09070621714031;
    Thought lo1 = Thought348.getInstance();
    fb0 = fb1 && fb0;
    Thought lo2 = Thought217.getInstance(fb1, fb0, fb1, fb0);
        if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        double ld3 = 36.18342243372087;
if(fo0 != null){
          fb1 = fo0.m2(ld0, fd0, fd1, ld3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Thought lo4 = Thought340.getInstance(fo0, fo1, fo0, fo1);
        ld0 = fd0 + fd1;
        fb0 = ld3 > ld0;
        Thought lo5 = Thought100.getInstance(fd0, fd1, ld3, ld0);
        double ld6 = 91.0247209268175;
        ld0 = fd0 + fd1;
        double ld7 = 18.864806017944744;
        Output.points[1][7] -= ld3;
        fb1 = fb0 || fb1;
        fb0 = ld6 > ld7;
        fb1 = ld0 > fd0;
        fd1 *= -1;
        Thought lo8 = Thought4.getInstance(fo0, fo1, fo0, fo1, ld3, ld6, ld7, ld0);
        Output.points[1][8] += fd0;
        fb0 = fd1 > ld3;
        fb1 = fb0 || fb1;
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
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb0 = false;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
        fd0 *= -1;
        ab4 = fd1 < fd0;
        Output.points[2][0] -= fd1;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought290.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        Output.points[2][1] += fd0;
        if (ab4) {
            fb0 = !fb1;
            lb0 = fd1 > fd0;
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
            fd0 = fd1 - fd0;
}}
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
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fb1 = fd1 < ad1;
    Thought lo0 = Thought245.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought4.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
            fb0 = ad1 > ad2;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
    ad1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought199.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    fd1 = ad1 - ad2;
    ad3 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb5 = fb0 && fb1;
    fd1 = ad1 - ad2;

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
    ad1 *= -1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought257.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    double ld1 = 246.93150871579118;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld2 = 259.1432448352088;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb0 = ld1 > ld2;

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
    fb1 = fd1 < fd0;
    double ld0 = 506.23510453451826;
    boolean lb1 = true;
    Output.points[2][2] -= fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    lb1 = fd1 < ld0;
    fd0 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
    boolean lb2 = true;
if(ao1 != null){
      fd1 = ao1.m3();
}
    if (fb0) {
        Thought lo3 = Thought124.getInstance(fb1, lb1, lb2, fb0);
        fb1 = lb1 || lb2;
        ld0 = fd0 + fd1;
        fb0 = !fb1;
        boolean lb4 = false;
        lb4 = !lb1;
        ld0 *= -1;
        boolean lb5 = true;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, lb1, lb2, fb0, fb1);
}
        ld0 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0, lb4, lb5, lb1, lb2);
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
    double ld0 = 657.934442386299;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[2][3] += ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ad1);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    if (fb1) {
        fd1 *= -1;
        boolean lb1 = true;
if(ao2 != null){
          ld0 = ao2.m3();
}
        double ld2 = 447.06545837718124;
        if (lb1) {
if(ao3 != null){
              ld0 = ao3.m3(fb0, fb1, lb1, fb0);
}
if(ao4 != null){
              ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, ld2, ld0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
}
            fb1 = !lb1;
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2);
}
            Thought lo3 = Thought132.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld0);
}
            if (fb0) {
if(ao2 != null){
                  ao2.m2();
}
                ad1 = ad2 - ad3;
if(ao4 != null){
                  ao3 = ao4.m4(fb1, lb1, fb0, fb1);
}
}}}
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
    ab1 = !ab2;
    fd1 *= -1;
    ab3 = ab4 || fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    Output.points[2][4] -= fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought141.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Output.points[2][5] -= fd0;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}

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
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought98.getInstance(ad2, ad3, ad4, fd0);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    Output.points[2][6] += ad1;
    ab1 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, lb1, ab1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ab2 = !ab3;

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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[2][7] -= fd1;
    boolean lb0 = false;
    boolean lb1 = false;
    double ld2 = 919.2092303684602;
    lb0 = ld2 > fd0;
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
    Output.points[2][8] += fd1;
        boolean lb3 = false;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    fb0 = fd1 > ld2;
    Thought lo4 = Thought341.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
        fb1 = fd1 > ld2;
    double ld5 = 770.9552937769448;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[3][0] -= ld5;
if(fo0 != null){
      fo0.m2(lb0, lb1, lb3, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld5, lb0, lb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, ld5, fb1, lb0, lb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    lb3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    boolean lb0 = false;
    Thought lo1 = Thought215.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    double ld2 = 806.3452081966127;
    double ld3 = 990.3768302851287;
    ld3 = fd0 + fd1;
    Thought lo4 = Thought219.getInstance(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1, fb0, fb1, lb0, fb0);

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
    boolean lb0 = true;
    lb0 = !fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    double ld1 = 157.63378231983538;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fb1 = fd1 < ld1;
    Thought lo2 = Thought117.getInstance();
    double ld3 = 64.8761315374209;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    fb1 = ld3 > fd0;

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
