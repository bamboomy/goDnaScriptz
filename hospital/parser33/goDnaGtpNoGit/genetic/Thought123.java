package genetic;
import java.util.ArrayList;
class Thought123 extends Thought{
private static ArrayList<Thought123> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 234.49380904803664;
private double fd1 = 982.4661241758982;
private Thought fo0 = null;
private Thought fo1 = null;
Thought123 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought123 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought123 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought123 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought123 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought123 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought123 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought123 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought123 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought123 instance = new Thought123 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought123 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought123 instance = new Thought123 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought123 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought123 instance = new Thought123 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought123 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought123 instance = new Thought123 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought123 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought123 instance = new Thought123 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought123 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought123 instance = new Thought123 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought123 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought123 instance = new Thought123 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought123 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought123 instance = new Thought123 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought250.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld1 = 338.9889375319134;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(ld1, fd0, fd1, ld1);
}
    fb1 = fd0 < fd1;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
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
    double ld0 = 902.4580266846771;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld0 + fd0;
    boolean lb1 = true;
    double ld2 = 846.825760879145;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld2, fd0, lb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought53.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
    fd1 = ld0 - ld2;
    Thought lo4 = Thought168.getInstance(fo1, fo0, fo1, fo0);
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, fd0, fd1);
}
    Output.points[4][2] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
if(fo1 != null){
      ld2 = fo1.m3();
}
    boolean lb5 = false;
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
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
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought328.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    boolean lb2 = true;
    Output.points[4][3] += fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;

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
    double ld0 = 27.11408263894305;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
    ab2 = ab3 && ab4;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1();
}
    fd1 *= -1;
    double ld1 = 280.7357500008913;
        double ld2 = 531.5805234333893;
    ld0 = ld1 + ld2;
    Output.points[4][4] += ad1;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    double ld3 = 343.35410708027734;
    fb1 = ad1 > ad2;
    double ld4 = 567.559494577309;
    ab1 = !ab2;

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
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought264.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    Output.points[4][5] -= fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld2 = 522.5644176611986;
    ld2 *= -1;
    lb0 = fd0 < fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Output.points[4][6] += ad1;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    ad3 *= -1;
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    Thought lo2 = Thought324.getInstance(ao3, ao4, fo0, fo1);
    Output.points[4][7] += ad2;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld3 = 56.4046648966943;
    ad2 *= -1;
    boolean lb4 = true;
if(ao1 != null){
      ao1.m1();
}
    lb1 = lb4 && fb0;
    Output.points[4][8] -= ad3;

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
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought274.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    double ld1 = 940.4580118793416;
    ab3 = ab4 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought180.getInstance(ao2, ao3, ao4, fo0);
    ld1 = fd0 - fd1;
    Thought lo3 = Thought5.getInstance(ld1, fd0, fd1, ld1);
    boolean lb4 = false;
    fb0 = fd0 < fd1;
    double ld5 = 705.4837023422648;

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
        ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld0 = 876.5018215209623;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = ad4 > fd0;
if(ao4 != null){
      ab4 = ao4.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = fd1 > ld0;
    ad1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(ao4 != null){
          fb1 = ao4.m2(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
        boolean lb1 = true;
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
        Thought lo2 = Thought55.getInstance(ao4, fo0, fo1, ao1);
        boolean lb3 = true;
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ld0, ad1);
}
        boolean lb4 = false;
        lb3 = ad2 > ad3;
        Thought lo5 = Thought50.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
if(ao1 != null){
          ad1 = ao1.m3();
}
        lb4 = ab1 && ab2;
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
    Output.points[5][0] -= fd0;
    Thought lo0 = Thought117.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 177.8750916715023;
    fd0 = fd1 + ld1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
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
    Output.points[5][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab2 = fd1 < fd0;
    boolean lb0 = false;
    fd1 *= -1;
    boolean lb1 = false;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought314.getInstance(fo1, fo0, fo1, fo0);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    lb0 = fd1 > ad1;
    Thought lo1 = Thought240.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 < ad1;
    ad2 *= -1;
    fb1 = ad3 < ad4;
    lb0 = fb0 || fb1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    Thought lo2 = Thought133.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m1();
}
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    Output.points[5][2] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    boolean lb3 = true;
    fd1 *= -1;
    Output.points[5][3] -= ad1;

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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought217.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought34.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
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
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought73.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao4.m2();
}
        fb1 = fb0 && fb1;
if(fo0 != null){
          fd1 = fo0.m3(fb0, fb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 588.6946343990561;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    if (fb1) {
        ad1 = ad2 + ad3;
        double ld1 = 647.369043331426;
        fb0 = !fb1;
        fb0 = !fb1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    ab3 = !ab4;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[5][4] -= fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
    Thought lo2 = Thought132.getInstance(ab3, ab4, fb0, fb1);
    lb0 = !lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    fd1 *= -1;
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, lb0, lb1, lb3, ab1);
}
    ab2 = fd0 > fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
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
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[5][5] -= ad3;
    Thought lo0 = Thought162.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    boolean lb1 = false;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    Thought lo2 = Thought141.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    Thought lo3 = Thought8.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb1, ab1);
    Output.points[5][6] -= ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
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
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
        fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[5][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    fd1 = fd0 - fd1;

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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    Output.points[5][8] -= fd0;
    Thought lo2 = Thought318.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;

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
    fb1 = ad2 < ad3;
    fb0 = !fb1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo0 = Thought189.getInstance();
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = fb1 && fb0;
    fd1 = ad1 - ad2;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought388.getInstance(ad3, ad4, fd0, fd1);

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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    double ld1 = 426.1959814551569;
    lb0 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    boolean lb2 = true;
    ab3 = ab4 && fb0;
    Thought lo3 = Thought197.getInstance(fb1, lb0, lb2, ab1);
    ab2 = ad2 < ad3;
    ab3 = ab4 || fb0;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, lb0, lb2, ab1, ab2);
}
    double ld4 = 73.40827419601791;
    ab3 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(ld1, ld4, ad1, ad2, ab4, fb0, fb1, lb0);
}
    lb2 = !ab1;
        ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld4, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld4, ad1, ad2);
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb2, lb5);
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
    Thought lo0 = Thought337.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 518.7633338424305;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld1 - fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
        fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb4 = false;
    fd0 = fd1 + ld1;
    lb2 = lb3 && lb4;
    double ld5 = 106.21216170670886;
    boolean lb6 = false;
    lb6 = fb0 && fb1;
    ld5 *= -1;
    lb2 = fd0 < fd1;
    lb3 = lb4 || lb6;
    ld1 = ld5 + fd0;
    fb0 = fd1 < ld1;

Thought.STACK_COUNTER++;
return ld5;
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
    fb1 = fd0 > fd1;
    boolean lb0 = true;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    lb0 = !fb0;
    fb1 = fd1 > ad1;
    double ld1 = 534.8265754497612;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ad4 = ao3.m3();
}
if(ao4 != null){
      lb0 = ao4.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    ad3 *= -1;
    boolean lb2 = true;
    double ld3 = 983.974906412387;
    ad3 = ad4 - fd0;
    fd1 = ld1 + ld3;
    ad1 = ad2 - ad3;
    boolean lb4 = false;
    ad4 = fd0 - fd1;
    boolean lb5 = true;
if(fo0 != null){
      ao4 = fo0.m4(ld1, ld3, ad1, ad2, lb0, lb2, lb4, lb5);
}
    double ld6 = 900.8061238130716;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    lb4 = lb5 || fb0;

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
    if (ab2) {
        fd1 *= -1;
if(ao2 != null){
          ao2.m1(fd0, fd1, fd0, fd1);
}
        ab3 = !ab4;
        Output.points[6][0] += fd0;
        Thought lo0 = Thought343.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
        fb0 = !fb1;
        boolean lb1 = true;
        fd1 = fd0 + fd1;
        lb1 = fd0 < fd1;
        double ld2 = 143.57939690469397;
        ab1 = ld2 < fd0;
        Thought lo3 = Thought266.getInstance();
        Thought lo4 = Thought318.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(ao1 != null){
          ao1.m2(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
        boolean lb5 = false;
        boolean lb6 = false;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, lb1, lb5, lb6, ab1);
}
        fd0 *= -1;
        double ld7 = 392.813446265857;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        boolean lb8 = true;
        ab1 = fd1 < ld2;
        Output.points[6][1] -= ld7;
        Thought lo9 = Thought147.getInstance(fd0, fd1, ld2, ld7);
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld2, ld7, fd0);
}
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
    double ld0 = 963.9953981077804;
if(ao1 != null){
      ab2 = ao1.m2();
}
    ab3 = ld0 < ad1;
        boolean lb1 = true;
    double ld2 = 446.4366970508276;
    ad1 = ad2 + ad3;
    boolean lb3 = false;
    ad4 = fd0 + fd1;
    double ld4 = 627.3155782258965;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld2, ld4, ad1, fb1, lb1, lb3, ab1);
}
    Output.points[6][2] += ad2;
    double ld5 = 422.06761649591493;
    Output.points[6][3] += ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, ld2, ld4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, lb1, lb3, ab1);
}
    ld5 = ad1 - ad2;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab2 = ao4.m2(ad3, ad4, fd0, fd1);
}
    boolean lb6 = true;
    Thought lo7 = Thought9.getInstance(fo0, fo1, ao1, ao2, ld0, ld2, ld4, ld5);

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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Output.points[6][4] -= fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[6][5] -= fd0;
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;

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
    ab1 = ab2 || ab3;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld1 = 727.8809569852697;
    ld1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ld1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld1);
}
        Thought lo2 = Thought16.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
if(fo1 != null){
      fo1.m3();
}
    Thought lo3 = Thought54.getInstance(lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ld1 > fd0;
    boolean lb4 = false;
    fd1 *= -1;
    ab1 = ld1 < fd0;
    double ld5 = 122.4413923874623;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld1, ld5, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
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
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought287.getInstance(fo1, fo0, fo1, fo0);
    Output.points[6][6] -= ad3;
    ad4 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
        fb1 = !fb0;
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          ad1 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ad1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fb1 = ab1 && ab2;
    boolean lb0 = false;
    ab2 = !ab3;
    double ld1 = 774.1727642712441;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    ld1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = ad3 > ad4;
    ab1 = fd0 < fd1;

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
    fb0 = fd0 > fd1;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Output.points[6][7] -= fd1;
    boolean lb0 = false;
    Thought lo1 = Thought279.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    Thought lo2 = Thought36.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb3);
}
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    lb3 = !fb0;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !lb0;
if(fo1 != null){
      lb3 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[6][8] += fd1;
if(ao1 != null){
      lb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      lb3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb3);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb3);
}
    fb0 = fd0 > fd1;
    Thought lo4 = Thought90.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, lb3, fb0);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    double ld0 = 502.733619029608;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - ad1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought387.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[7][0] -= ad3;
    ad4 *= -1;
    Output.points[7][1] += fd0;
if(ao4 != null){
      ao4.m3(fd1, ld0, ad1, ad2);
}
    fb0 = fb1 && lb2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}
    boolean lb3 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
        boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    Output.points[7][2] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    double ld3 = 544.0473421612314;
    boolean lb4 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought246.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab3 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
        Thought lo1 = Thought277.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    double ld2 = 171.07358518511637;
    ab4 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ld2 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 = ld2 + ad1;
    double ld3 = 727.9406486901917;
    double ld4 = 583.243304803974;
    ld4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ld2, ld3, ld4, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
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
    double ld0 = 286.3752375762809;
        ld0 = fd0 - fd1;
    boolean lb1 = false;
    Thought lo2 = Thought168.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
    double ld3 = 235.8302626713313;
    fb1 = lb1 && fb0;
    Output.points[7][3] -= ld0;
    fb1 = lb1 || fb0;
    ld3 = fd0 + fd1;
    ld0 = ld3 - fd0;
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
    fd0 *= -1;
    double ld0 = 443.0076039912329;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 518.9729103242315;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld0);
}
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo0.m3();
}
    boolean lb2 = true;
    Thought lo3 = Thought20.getInstance(fb0, fb1, lb2, fb0);
    fb1 = fd0 < fd1;
    boolean lb4 = true;
    ld0 = ld1 - fd0;
    double ld5 = 945.4331055533647;
    lb2 = lb4 && fb0;

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
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought247.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[7][4] -= fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    Thought lo2 = Thought272.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
    boolean lb3 = true;
    lb1 = fd0 < fd1;
    boolean lb4 = false;
    fd0 = fd1 - fd0;
    Thought lo5 = Thought118.getInstance(fd1, fd0, fd1, fd0, lb3, lb4, fb0, fb1);
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
}
    fd1 = fd0 - fd1;

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
