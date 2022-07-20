package genetic;
import java.util.ArrayList;
class Thought72 extends Thought{
private static ArrayList<Thought72> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 89.86567515860594;
private double fd1 = 371.34773445879796;
private Thought fo0 = null;
private Thought fo1 = null;
Thought72 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought72 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought72 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought72 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought72 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
          fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought64.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    double ld4 = 242.27697857316235;
    fd0 = fd1 - ld4;
    Output.points[1][1] -= fd0;
    lb1 = fd1 < ld4;
    Thought lo5 = Thought225.getInstance(fd0, fd1, ld4, fd0);
    Thought lo6 = Thought392.getInstance(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1);
if(fo0 != null){
      lb3 = fo0.m2();
}
if(fo1 != null){
      ld4 = fo1.m3(fb0, fb1, lb0, lb1);
}
    boolean lb7 = true;
    double ld8 = 555.4981378089374;

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
    double ld0 = 145.52230493944242;
    Output.points[1][2] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
    Thought lo1 = Thought165.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
    ab3 = fd1 < ld0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb3 = false;
        fd1 = ld0 - fd0;
        lb3 = fd1 < ld0;
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
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought163.getInstance(lb0, fb0, fb1, lb0);
    fd1 *= -1;
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    double ld2 = 502.8176798178489;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[1][3] -= ld2;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        lb0 = ad1 < ad2;
        fb0 = !fb1;
        boolean lb3 = false;
        Output.points[1][4] += ad3;
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
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[1][5] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    Thought lo0 = Thought311.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    double ld1 = 128.62110384239978;
    fd0 = fd1 + ld1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][6] += ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ad4 > fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
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
    if (fb1) {
        boolean lb0 = true;
        fd1 = fd0 - fd1;
        fd0 *= -1;
        boolean lb1 = true;
        lb0 = lb1 && fb0;
        boolean lb2 = false;
        fd1 = fd0 - fd1;
        boolean lb3 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
}
        Thought lo4 = Thought227.getInstance(ao2, ao3, ao4, fo0);
        Thought lo5 = Thought17.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(lb1, lb2, lb3, fb0);
}
        Thought lo6 = Thought3.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
}
        Output.points[1][7] -= fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb1, lb2, lb3, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fb1 = fd0 < fd1;
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought321.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 = ad4 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    double ld1 = 296.60543715478013;
    ld1 = ad1 - ad2;
    double ld2 = 68.98766131330211;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
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
    Thought lo0 = Thought192.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
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
    double ld0 = 604.9219330694098;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    ab1 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ld0 + ad1;
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(ld0, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb1, lb2, ab1);
}
    Thought lo3 = Thought366.getInstance(ao3, ao4, fo0, fo1);
        boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1);
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
    fb1 = fd0 < fd1;
    double ld0 = 439.9091382100271;
    Thought lo1 = Thought204.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fd0 < fd1;
        Output.points[1][8] += ld0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    double ld2 = 412.6161205096469;
    ld0 *= -1;

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
    fd1 = fd0 - fd1;
    Thought lo0 = Thought199.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    lb1 = fd0 > fd1;
    boolean lb3 = false;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    lb2 = lb3 && ab1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb0 = !fb1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought144.getInstance();
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
    lb1 = !fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    Output.points[2][0] -= fd0;

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
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1);
}
    double ld0 = 894.1117446834397;
    Output.points[2][1] += ad1;
    ad2 *= -1;
    Thought lo1 = Thought118.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    Thought lo2 = Thought300.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
    boolean lb3 = false;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad3 *= -1;
    Thought lo4 = Thought347.getInstance(ad4, fd0, fd1, ld0);
    fb0 = fb1 || lb3;
    ab1 = ad1 < ad2;
    double ld5 = 57.14253600764744;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    Output.points[2][2] += ad2;
    ad3 = ad4 - fd0;
    double ld6 = 782.0403289441534;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    Thought lo0 = Thought344.getInstance();
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld1 = 290.4451918673607;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 && lb2;
        fb0 = fd1 > ld1;
        double ld3 = 189.36772610576205;
    Output.points[2][3] += ld3;
    fd0 = fd1 - ld1;
    ld3 *= -1;
    fb1 = fd0 < fd1;
    boolean lb4 = false;
    ld1 *= -1;
if(ao1 != null){
          ao1.m2(ld3, fd0, fd1, ld1, lb2, lb4, fb0, fb1);
}
    lb2 = ld3 > fd0;
    fd1 = ld1 + ld3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
    boolean lb0 = true;
    ad3 *= -1;
    double ld1 = 141.38489257455197;
    lb0 = ad3 > ad4;
    double ld2 = 153.91020854027897;
    ad4 = fd0 + fd1;
    ld1 = ld2 + ad1;
    fb0 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    ad4 = fd0 - fd1;
    ld1 *= -1;
    lb0 = fb0 || fb1;
    boolean lb3 = false;
    ld2 = ad1 - ad2;
    boolean lb4 = true;
    lb0 = !lb3;
    double ld5 = 696.9416334855799;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb6 = true;
if(ao1 != null){
      lb4 = ao1.m2(ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return lb6;
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
    ab1 = !ab2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
    Thought lo0 = Thought95.getInstance();
    boolean lb1 = false;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, lb1, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought254.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
}
    ab1 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ad1 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    Output.points[2][4] -= fd1;
    ab4 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[2][5] -= ad1;
    ad2 = ad3 + ad4;
    ab3 = ab4 || fb0;
    fd0 = fd1 + ad1;
    fb1 = !ab1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m2();
}
        fd1 = fd0 + fd1;
        fb0 = fb1 || fb0;
        fb1 = fd0 < fd1;
        fb0 = fb1 && fb0;
        Thought lo0 = Thought295.getInstance(fb1, fb0, fb1, fb0);
        double ld1 = 900.5658652648517;
        } else {
        double ld2 = 632.7165896107674;
                Thought lo3 = Thought198.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
        Output.points[2][6] -= fd0;
        fd1 = ld2 - fd0;
        fb1 = fd1 < ld2;
        Output.points[2][7] -= fd0;
        double ld4 = 602.5092779494775;
if(fo0 != null){
                  fd0 = fo0.m3(fd1, ld2, ld4, fd0, fb0, fb1, fb0, fb1);
}
        Thought lo5 = Thought293.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
    double ld0 = 727.629664948252;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < fd0;
    fd1 *= -1;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 || fb1;
    ad4 *= -1;
    fb0 = !fb1;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    Thought lo1 = Thought214.getInstance();

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
    Thought lo0 = Thought389.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad1 < ad2;
    boolean lb1 = false;
    boolean lb2 = true;
    ad3 = ad4 + fd0;
    ab4 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
    fd1 = ad1 - ad2;
    Thought lo3 = Thought69.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought70.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
    ab1 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld5 = 805.1804645508241;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb1;
    ld5 *= -1;
    boolean lb6 = false;
    ad1 = ad2 - ad3;
    double ld7 = 511.0066380535121;
    lb2 = lb6 || ab1;
    Thought lo8 = Thought379.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ab2 = ld5 < ld7;
    for(int i0=0; i0<10; i0++){
        ab3 = !ab4;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    double ld2 = 793.6188568632504;
if(ao2 != null){
      fb1 = ao2.m2(lb0, lb1, fb0, fb1);
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, lb0, lb1, lb3, fb0);
}
    fb1 = fd1 > ld2;
    boolean lb4 = false;
if(ao3 != null){
      ao3.m2(fd0, fd1, ld2, fd0, lb0, lb1, lb3, lb4);
}
    fd1 *= -1;
    fb0 = ld2 < fd0;
    Output.points[2][8] -= fd1;
    fb1 = ld2 > fd0;

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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought66.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    ad1 *= -1;
    Thought lo1 = Thought124.getInstance(fo1, ao1, ao2, ao3);
    ad2 = ad3 + ad4;
    fb1 = !fb0;
    boolean lb2 = false;
    fb0 = !fb1;
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        lb2 = ad2 > ad3;
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 && lb2;
            fb0 = ad4 < fd0;
}}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    Thought lo0 = Thought353.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 513.1203482981196;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    ab2 = ld1 > fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    double ld2 = 124.72574611768128;
if(ao1 != null){
      ao1.m3();
}
    Output.points[3][0] -= ld2;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m1(fb1, ab1, ab2, ab3);
}
        fd0 = fd1 - ld1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
        double ld3 = 928.0593665865654;
        ld1 = ld2 + fd0;
        fd1 = ld3 + ld1;
        ld2 *= -1;
        fd0 = fd1 - ld3;
        boolean lb4 = false;
if(ao4 != null){
          ao3 = ao4.m4(ld1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 + ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ab3 = ad3 < ad4;
    double ld0 = 318.6770668625462;
    double ld1 = 947.6194816211338;
    ab4 = !fb0;
    Thought lo2 = Thought282.getInstance();
    fb1 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[3][1] += ld0;
    ld1 = ad1 - ad2;
    boolean lb3 = true;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld0, fb0, fb1, lb3, ab1);
}
    ld1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    Output.points[3][2] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ld1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
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
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = !fb0;
    fb1 = fd0 > fd1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
}
    boolean lb4 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb0);
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
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought2.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (ab3) {
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought218.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo0.m1(ab4, fb0, fb1, ab1);
}
        boolean lb2 = false;
        ab1 = ab2 || ab3;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        lb2 = ab1 || ab2;
        boolean lb3 = true;
        fd0 *= -1;
        ab2 = fd1 < fd0;
        fd1 = fd0 - fd1;
        ab3 = ab4 && fb0;
        Output.points[3][3] -= fd0;
        fb1 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb2, lb3, ab1, ab2);
}
        fd0 *= -1;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    Thought lo0 = Thought33.getInstance(ad4, fd0, fd1, ad1);
    boolean lb1 = true;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought23.getInstance();
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    Output.points[3][4] += ad3;
    boolean lb3 = true;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb1;

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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        Thought lo0 = Thought61.getInstance(ab3, ab4, fb0, fb1);
    ad3 *= -1;
    ad4 *= -1;
    double ld1 = 863.6532739344032;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
    ab1 = !ab2;
    Thought lo3 = Thought5.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    lb2 = fd1 > ld1;
    Thought lo4 = Thought309.getInstance(fo1, fo0, fo1, fo0);
    Output.points[3][5] += ad1;
    Output.points[3][6] += ad2;
    ab1 = ab2 || ab3;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2);
}
    boolean lb5 = true;
    Thought lo6 = Thought121.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
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
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;

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
    Output.points[3][7] -= ad2;
    Thought lo0 = Thought70.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    double ld1 = 272.9985104270969;
if(fo1 != null){
      ld1 = fo1.m3();
}
    double ld2 = 809.7599268406226;
    fb0 = !fb1;
    ld2 = ad1 - ad2;
    Thought lo3 = Thought297.getInstance(fb0, fb1, fb0, fb1);
    double ld4 = 786.2422933809771;
    fb0 = fb1 || fb0;
    ad2 *= -1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = ad3 < ad4;
    fb1 = fb0 && fb1;
    if (fb0) {
        Output.points[3][8] -= fd0;
        fd1 = ld1 + ld2;
        Thought lo5 = Thought163.getInstance(ao1, ao2, ao3, ao4, ld4, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
        double ld6 = 377.35466009019564;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought60.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    if (fb1) {
        ab1 = ab2 || ab3;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        ab4 = !fb0;
        fb1 = !ab1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        for(int i0=0; i0<10; i0++){
            double ld1 = 441.8685312801534;
            ab2 = fd0 < fd1;
            ld1 = fd0 - fd1;
            ld1 = fd0 + fd1;
            ab3 = !ab4;
            ld1 = fd0 - fd1;
if(fo1 != null){
              ld1 = fo1.m3();
}
if(ao2 != null){
              ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
}}
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
    Thought lo0 = Thought19.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought58.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    Thought lo2 = Thought347.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab1 = ab2 || ab3;
    ad4 = fd0 - fd1;
    Thought lo3 = Thought88.getInstance(ad1, ad2, ad3, ad4);
    ab4 = !fb0;
    boolean lb4 = true;
    fb0 = fd0 < fd1;
    ad1 *= -1;
    double ld5 = 30.25395698150159;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m1();
}
    fd0 = fd1 - ld5;
    ad1 = ad2 + ad3;
    double ld6 = 147.12771389724765;
    ad3 = ad4 + fd0;
    lb4 = !ab1;
    Thought lo7 = Thought285.getInstance(ab2, ab3, ab4, fb0);
    Thought lo8 = Thought275.getInstance(ao4, fo0, fo1, ao1, fd1, ld5, ld6, ad1, fb1, lb4, ab1, ab2);
        Thought lo9 = Thought24.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    lb4 = ab1 || ab2;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 545.7904294914881;
    boolean lb1 = true;

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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[4][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
        boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = lb0 || fb0;
    Output.points[4][1] += fd1;
    fb1 = !lb0;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    lb0 = fd1 < fd0;
    Output.points[4][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
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
