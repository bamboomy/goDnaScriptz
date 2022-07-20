package genetic;
import java.util.ArrayList;
class Thought272 extends Thought{
private static ArrayList<Thought272> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 73.2037741882716;
private double fd1 = 914.0727210845639;
private Thought fo0 = null;
private Thought fo1 = null;
Thought272 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought272 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought272 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought272 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought272 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought272 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought272 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought272 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought272 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought272 instance = new Thought272 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought272 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought272 instance = new Thought272 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought272 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought272 instance = new Thought272 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought272 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought272 instance = new Thought272 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought272 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought272 instance = new Thought272 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought272 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought272 instance = new Thought272 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought272 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought272 instance = new Thought272 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought272 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought272 instance = new Thought272 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    lb0 = fb0 && fb1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[8][8] -= fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
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
    Thought lo0 = Thought32.getInstance(fo0, fo1, fo0, fo1);
    ab1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought391.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[0][0] -= fd0;
        lb2 = !ab1;
    fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m1();
}
    boolean lb4 = false;
    fd0 *= -1;
    Thought lo5 = Thought304.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb6 = false;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    double ld7 = 188.30537319700406;
    fd0 *= -1;
    fd1 = ld7 + fd0;

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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought281.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    Thought lo2 = Thought257.getInstance(fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
        } else if (fb0) {
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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    Thought lo0 = Thought347.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld1 = 970.4165245857669;
if(fo1 != null){
      fo1.m3();
}
    Thought lo2 = Thought178.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought300.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fd0 = fd1 + ld1;
    ad1 = ad2 + ad3;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, ad1);
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
    if (fb0) {
        fd0 = fd1 - fd0;
        Output.points[0][1] -= fd1;
        double ld0 = 448.85797213933586;
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
        double ld1 = 941.7182922980129;
        fd0 = fd1 - ld0;
        Output.points[0][2] -= ld1;
        double ld2 = 79.44219506872258;
        Output.points[0][3] += ld2;
        Thought lo3 = Thought306.getInstance();
        boolean lb4 = true;
        lb4 = fd0 > fd1;
        Output.points[0][4] -= ld0;
        fb0 = fb1 || lb4;
        Output.points[0][5] += ld1;
        Thought lo5 = Thought270.getInstance(fb0, fb1, lb4, fb0);
if(fo1 != null){
          ld2 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1, fb1, lb4, fb0, fb1);
}
        double ld6 = 460.8356389732395;
        ld2 = ld6 + fd0;
        lb4 = fb0 && fb1;
        lb4 = fb0 && fb1;
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
    Thought lo0 = Thought205.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    fb1 = lb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m2();
}
    ad1 = ad2 + ad3;
    double ld2 = 772.9557760168291;
    fb1 = ad3 < ad4;
    boolean lb3 = false;
    fd0 = fd1 - ld2;
    Output.points[0][6] += ad1;
if(ao2 != null){
      ao2.m1(lb1, lb3, fb0, fb1);
}
    double ld4 = 983.0551278019793;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb1, lb3, fb0, fb1);
}
    double ld5 = 919.8467916775899;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, ld4, ld5, lb1, lb3, fb0, fb1);
}
    lb1 = lb3 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, lb3, fb0);
}
    Thought lo6 = Thought328.getInstance(ao4, fo0, fo1, ao1);

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
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab4 = !fb0;
    fb1 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo0 = Thought344.getInstance(ab2, ab3, ab4, fb0);
    if (fb1) {
        Output.points[0][7] -= fd0;
        boolean lb1 = false;
        fd1 = fd0 + fd1;
        lb1 = ab1 && ab2;
        double ld2 = 529.154195123385;
        Output.points[0][8] += ld2;
        ab3 = fd0 < fd1;
        boolean lb3 = false;
        ld2 = fd0 + fd1;
        boolean lb4 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld2, fd0, fd1, fb1, lb1, lb3, lb4);
}
        ab1 = ld2 > fd0;
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
    Output.points[1][0] -= ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ab4 = !fb0;
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;

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
        Output.points[1][1] += fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought387.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    fb0 = !fb1;
    Thought lo0 = Thought201.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought90.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 778.1658790768867;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    lb0 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld2 = 516.0979693291793;
    Thought lo3 = Thought359.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought33.getInstance();
if(fo1 != null){
          fd1 = fo1.m3(lb1, fb0, fb1, lb0);
}
        lb1 = !fb0;
        fb1 = !lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld2, ad1, lb1, fb0, fb1, lb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought297.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought285.getInstance(ad1, ad2, ad3, ad4);
    Output.points[1][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought21.getInstance();
    ab4 = ad4 < fd0;
    fb0 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought336.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    ab2 = fd1 < ad1;
    double ld4 = 547.890690675664;
    Thought lo5 = Thought379.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld4;
    ad1 = ad2 - ad3;
    fb1 = ab1 || ab2;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    boolean lb6 = true;
    boolean lb7 = true;
    fd1 = ld4 - ad1;

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
    double ld0 = 437.6472440465514;
    if (fb1) {
        boolean lb1 = true;
        lb1 = fb0 && fb1;
        ld0 *= -1;
        fd0 = fd1 - ld0;
        double ld2 = 500.95903559352183;
        lb1 = fb0 && fb1;
        lb1 = fb0 || fb1;
        Output.points[1][3] -= ld0;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Output.points[1][4] -= fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
    Thought lo0 = Thought55.getInstance();
    fb0 = fd1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    double ld1 = 685.1287828198149;

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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    lb0 = !ab1;
    fd1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = fd0 < fd1;
    double ld2 = 512.7176267968372;
    boolean lb3 = false;
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0);
}
    lb1 = !lb3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
    ab1 = ab2 || ab3;
    Thought lo4 = Thought252.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
    boolean lb5 = true;
    boolean lb6 = true;
    ld2 = fd0 + fd1;

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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    ab2 = !ab3;

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
    double ld0 = 314.14376377220304;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 376.0062416522915;
    Output.points[1][5] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
    Output.points[1][6] += ld1;
    Output.points[1][7] += fd0;
    fd1 *= -1;
    double ld2 = 860.345994437854;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, ld2, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 *= -1;
    fb1 = fb0 || fb1;
    double ld3 = 736.2569280434637;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, ld2, ld3, fd0, fb0, fb1, fb0, fb1);
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
    Thought lo0 = Thought399.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    Output.points[1][8] -= fd1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    Thought lo2 = Thought294.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb3 = true;

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
    fb1 = !fb0;
    double ld0 = 352.2692198932789;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    double ld1 = 45.32443829456433;
    Thought lo2 = Thought53.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Output.points[2][0] += ld0;
    ld1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld0);
}
    fb0 = ld1 > ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought198.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
    double ld3 = 942.410272480466;
    Thought lo4 = Thought361.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);

Thought.STACK_COUNTER++;
return ld3;
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
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    lb0 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought381.getInstance(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
    lb1 = !lb2;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb2 = ao3.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    double ld4 = 709.8419818678452;
if(ao4 != null){
      ld4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld4, fd0);
}
    fd1 = ld4 + fd0;
    lb1 = fd1 > ld4;
    lb2 = fd0 < fd1;
if(ao3 != null){
      fb0 = ao3.m2();
}
        fb1 = lb0 && lb1;
    lb2 = ld4 > fd0;
        boolean lb5 = true;
    fd1 = ld4 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(lb5, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld4, lb2, lb5, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fd0, fd1, ld4, fd0, lb1, lb2, lb5, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    Thought lo1 = Thought201.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        if (lb0) {
            double ld2 = 395.3690701000758;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            ld2 *= -1;
            double ld3 = 177.32293173997743;
            fb0 = fb1 || lb0;
            Thought lo4 = Thought349.getInstance(ld3, ad1, ad2, ad3);
            fb0 = fb1 && lb0;
            double ld5 = 538.7965549463645;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
            ld2 = ld3 + ld5;
            fb0 = fb1 || lb0;
            ad1 = ad2 + ad3;
            ad4 = fd0 + fd1;
if(fo0 != null){
              fo0.m1();
}
if(ao1 != null){
              fo1 = ao1.m4(fb0, fb1, lb0, fb0);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
    double ld1 = 36.23729798907706;
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1);
}
    Output.points[2][1] += fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
    Output.points[2][2] -= ld1;
if(ao4 != null){
      fd0 = ao4.m3();
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
    Output.points[2][3] += ad1;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ad2 < ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    double ld0 = 634.9840655717001;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought254.getInstance(ao2, ao3, ao4, fo0);
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ld0, ad1, ad2, ad3);
}
    ad4 *= -1;
    Thought lo2 = Thought14.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1);
    Thought lo3 = Thought318.getInstance();
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ad3 = ad4 + fd0;
    fd1 = ld0 - ad1;
    Thought lo4 = Thought388.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);

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
    Thought lo0 = Thought229.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb1;
    fb0 = !fb1;
    lb1 = fd1 > fd0;
    fb0 = !fb1;
    Thought lo2 = Thought7.getInstance();
    boolean lb3 = false;
    lb1 = lb3 || fb0;
        fd1 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Output.points[2][4] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 714.6431038787651;
    fd0 *= -1;
    fb1 = fd1 < ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = ab1 && ab2;
    ab3 = !ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought34.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
    double ld3 = 309.91222983713106;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
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
    double ld0 = 981.5326644468495;
if(fo0 != null){
      fb0 = fo0.m2(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    double ld1 = 501.51783861244706;
        if (fb0) {
        fb1 = !fb0;
        boolean lb2 = true;
        double ld3 = 324.1902023766928;
        ld1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
        boolean lb4 = true;
        ad3 = ad4 + fd0;
        fd1 = ld3 - ld0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb1, lb2, lb4, fb0);
}
        ad4 = fd0 + fd1;
        ld3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld1, ad1, ad2, fb1, lb2, lb4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, lb4, fb0);
}
        Thought lo5 = Thought174.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld3, ld0, ld1, ad1);
}
        fb1 = lb2 && lb4;
        boolean lb6 = false;
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
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2();
}
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    ad4 = fd0 - fd1;
    lb1 = ab1 || ab2;
    Thought lo2 = Thought71.getInstance(ab3, ab4, fb0, fb1);
    lb0 = ad1 > ad2;
    lb1 = ad3 > ad4;
    boolean lb3 = true;
    double ld4 = 142.20298694134448;
    lb3 = !ab1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    double ld5 = 460.5599543636872;
    ad1 *= -1;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb3);
}
    ld4 = ld5 - ad1;
    double ld6 = 977.1557744933497;

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
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = !fb1;
    double ld0 = 425.75824431369284;
    fb0 = fb1 || fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought124.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fb1 = fd1 > ad1;
    Thought lo1 = Thought222.getInstance();
    fb0 = fb1 || fb0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
    double ld3 = 202.2699774946969;
if(fo1 != null){
      lb2 = fo1.m2(ld3, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
    ad4 = fd0 - fd1;

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[2][5] -= fd1;
    Output.points[2][6] -= fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought248.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = ab1 || ab2;
    ab3 = fd1 < fd0;
    ab4 = fd1 > fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb1);
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 393.30028835297816;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab1 = ao3.m2(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    Thought lo1 = Thought269.getInstance();

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
    Thought lo0 = Thought201.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 795.9369278564682;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld2 = 635.8758905003126;
    ld2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld2);
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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
        Thought lo0 = Thought252.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 || fb1;
    boolean lb2 = false;
    lb1 = lb2 || fb0;
    fb1 = lb1 || lb2;

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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
    double ld1 = 879.5985750202888;
    lb0 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    Output.points[2][7] -= fd0;
    lb0 = fb0 && fb1;
    boolean lb2 = true;
    fd1 *= -1;
    lb0 = lb2 || fb0;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    ld1 *= -1;
    fd0 *= -1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    lb3 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    double ld4 = 126.48266822747118;
    lb3 = ld1 < ld4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb2, lb3);
}
    Output.points[2][8] += fd0;
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
}
