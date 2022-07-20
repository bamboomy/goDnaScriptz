package genetic;
import java.util.ArrayList;
class Thought384 extends Thought{
private static ArrayList<Thought384> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 583.6529304718108;
private double fd1 = 482.07430882017536;
private Thought fo0 = null;
private Thought fo1 = null;
Thought384 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought384 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought384 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought384 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought384 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought384 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought384 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought384 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought384 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought384 instance = new Thought384 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought384 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought384 instance = new Thought384 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought384 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought384 instance = new Thought384 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought384 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought384 instance = new Thought384 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought384 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought384 instance = new Thought384 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought384 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought384 instance = new Thought384 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought384 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought384 instance = new Thought384 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought384 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought384 instance = new Thought384 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    Thought lo0 = Thought369.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
        boolean lb1 = true;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld2 = 986.8331586669169;
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    lb1 = !lb3;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb1);
}
    Output.points[6][5] -= fd1;
    lb3 = !fb0;
        fb1 = ld2 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, lb1, lb3, fb0, fb1);
}
    Output.points[6][6] += ld2;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld2, fd0, lb1, lb3, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb3, lb4);
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
    double ld0 = 961.1383304254606;
    Thought lo1 = Thought176.getInstance(fo0, fo1, fo0, fo1);
    ab2 = ld0 > fd0;
    Thought lo2 = Thought240.getInstance(fd1, ld0, fd0, fd1);
    Output.points[6][7] -= ld0;
    fd0 = fd1 - ld0;
    ab3 = !ab4;
    for(int i0=0; i0<10; i0++){
        double ld3 = 373.31689080974036;
        ld0 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld0, fd0, fd1);
}
        Thought lo4 = Thought118.getInstance();
        ld3 *= -1;
        fb0 = ld0 > fd0;
        fb1 = fd1 > ld3;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
        double ld5 = 154.31885907665335;
        double ld6 = 396.18561989423597;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld5, ld6, ld0, fd0, fb1, ab1, ab2, ab3);
}
        fd1 = ld3 + ld5;
if(fo1 != null){
          ld6 = fo1.m3(ld0, fd0, fd1, ld3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    ad1 = ad2 - ad3;
    Output.points[6][8] -= ad4;
    Thought lo0 = Thought241.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    Thought lo1 = Thought130.getInstance();
    ad3 = ad4 - fd0;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought295.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad2 < ad3;

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
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab1 = ab2 || ab3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
        ad1 = ad2 + ad3;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && ab1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab2 = ad4 > fd0;
        Output.points[7][0] += fd1;
if(fo0 != null){
          ad1 = fo0.m3(ab3, ab4, fb0, fb1);
}
        lb0 = ad2 < ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb1;
        Output.points[7][1] += fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        lb0 = ab1 && ab2;
        fd0 = fd1 + ad1;
        ad2 = ad3 + ad4;
        ab3 = !ab4;
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
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2();
}
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
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
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fb1, lb0, fb0, fb1);
}
    ad1 *= -1;
    Thought lo1 = Thought84.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    fb0 = fb1 && lb0;
if(ao3 != null){
      fb0 = ao3.m2(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    ad4 = fd0 - fd1;
    double ld2 = 850.3340512748094;
    ld2 *= -1;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought191.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1);
}
if(ao2 != null){
      ad2 = ao2.m3();
}
    fb1 = lb0 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = ld2 < ad1;
    ad2 = ad3 + ad4;
    fb1 = !lb0;
    fb0 = fd0 > fd1;
    Output.points[7][2] -= ld2;
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
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
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld0 = 548.8732388425427;
    double ld1 = 121.38083183576776;
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld0 *= -1;
if(ao1 != null){
      ld1 = ao1.m3(fd0, fd1, ld0, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought203.getInstance();
        double ld4 = 858.0254989489846;
        ab1 = ld1 > fd0;
if(ao2 != null){
          fd1 = ao2.m3(ab2, ab3, ab4, fb0);
}
        double ld5 = 438.8933891554376;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, ld5, ld0, ld1, fb1, lb2, ab1, ab2);
}
        ab3 = ab4 || fb0;
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
    ad1 *= -1;
    ad2 *= -1;
    Output.points[7][3] -= ad3;
    ad4 *= -1;
    Thought lo0 = Thought361.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought214.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
    ab3 = ad3 > ad4;
    fd0 *= -1;
    double ld2 = 658.9925510275125;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - ld2;
    ab3 = ad1 < ad2;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    if (ab4) {
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
    Thought lo0 = Thought269.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    double ld3 = 989.3564952028879;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 158.69770283229005;
    ab1 = fd0 < fd1;
    if (ab2) {
        double ld1 = 364.54742934149635;
        boolean lb2 = false;
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        ld0 = fd0 + fd1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab2 = ab3 && ab4;
        fb0 = fb1 && ab1;
if(fo0 != null){
          fo0.m2(ld0, fd0, fd1, ld0);
}
        boolean lb3 = false;
        fd0 = fd1 + ld0;
        Output.points[7][4] -= fd0;
        Output.points[7][5] -= fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab1 = fd0 > fd1;
        ld0 = fd0 - fd1;
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = !lb3;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb3;
        ab1 = fd0 < fd1;
        double ld4 = 503.45121591527874;
        Thought lo5 = Thought15.getInstance(ld4, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
    Thought lo0 = Thought170.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    fb0 = ad3 > ad4;
    Thought lo2 = Thought203.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      ad3 = fo1.m3();
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, lb3, fb0, fb1);
}
    lb1 = lb3 && fb0;
    Thought lo4 = Thought124.getInstance(fd0, fd1, ad1, ad2, fb1, lb1, lb3, fb0);
    fb1 = ad3 < ad4;
    fd0 *= -1;
    lb1 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;

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
    Thought lo0 = Thought318.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = false;
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    if (ab4) {
        double ld2 = 534.7088844525341;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad2 = ad3 + ad4;
        boolean lb3 = true;
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, lb3, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[7][6] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = lb0 && fb0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && fb0;
        fb1 = lb0 || fb0;
        fb1 = !lb0;
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
        double ld1 = 676.1755184456672;
        boolean lb2 = true;
        boolean lb3 = false;
        boolean lb4 = false;
        lb4 = fd0 > fd1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb2);
}
        double ld5 = 387.99583896353886;
if(fo0 != null){
          ld5 = fo0.m3(fd0, fd1, ld1, ld5, lb3, lb4, lb0, fb0);
}
        boolean lb6 = false;
        boolean lb7 = true;
        Thought lo8 = Thought273.getInstance(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb2);
if(ao4 != null){
          lb3 = ao4.m2(fo0, fo1, ao1, ao2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        double ld0 = 971.0715022338077;
    fb0 = ld0 < ad1;
    Thought lo1 = Thought164.getInstance(ad2, ad3, ad4, fd0);
    Output.points[7][7] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m1();
}
    fb1 = !fb0;
if(ao2 != null){
      ad4 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        ld0 *= -1;
        ad1 = ad2 + ad3;
        Thought lo2 = Thought75.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
        fb0 = ad4 < fd0;
        fb1 = fd1 > ld0;
        ad1 *= -1;
        fb0 = fb1 || fb0;
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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
}
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(ao4 != null){
      ab1 = ao4.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought383.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 < ad1;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    lb1 = !ab1;
    ab2 = fd1 < ad1;
    double ld2 = 757.713153067154;
    Thought lo3 = Thought27.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, lb1);
}
    ld2 = ad1 - ad2;
    ad3 = ad4 + fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[7][8] -= fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    double ld1 = 631.8069488867267;
    ld1 *= -1;

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
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 > fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought38.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    double ld1 = 108.73683445627515;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = ad1 < ad2;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad3 *= -1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    lb0 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    double ld1 = 157.38201982381116;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    double ld2 = 75.14853621886971;
    boolean lb3 = true;
    Thought lo4 = Thought32.getInstance(fd0, fd1, ld1, ld2, lb3, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
    lb3 = ad1 < ad2;
    fb0 = ad3 > ad4;
    fd0 *= -1;
    fb1 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    double ld0 = 20.76163802098993;
if(fo1 != null){
      fo1.m2();
}
    Thought lo1 = Thought149.getInstance(ab3, ab4, fb0, fb1);
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ad3 = ad4 - fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 107.54885523867213;
    double ld1 = 337.310911040412;
    ld0 *= -1;
    fb1 = ld1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought240.getInstance(fd1, ld0, ld1, fd0);
    Thought lo3 = Thought385.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, ld1, fd0);
    fb0 = !fb1;
    boolean lb4 = false;
        Thought lo5 = Thought63.getInstance();
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(lb4, fb0, fb1, lb4);
}
    ld0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld0, fb1, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0, lb4, fb0, fb1, lb4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb4, fb0);
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
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
    boolean lb0 = true;
    if (lb0) {
        Thought lo1 = Thought174.getInstance(ao2, ao3, ao4, fo0);
        boolean lb2 = false;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        boolean lb3 = false;
        double ld4 = 803.9610991622594;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd0 = fd1 - ld4;
        lb0 = fb0 || fb1;
        lb2 = lb3 || lb0;
        Output.points[8][0] += ad1;
        ad2 = ad3 + ad4;
        fd0 *= -1;
if(ao2 != null){
          ao2.m3(fb0, fb1, lb2, lb3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld4, ad1, ad2, lb0, fb0, fb1, lb2);
}
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld4, ad1, ad2, lb3, lb0, fb0, fb1);
}
        ad3 = ad4 + fd0;
        Thought lo5 = Thought182.getInstance(fo0, fo1, ao1, ao2, lb2, lb3, lb0, fb0);
        fb1 = lb2 && lb3;
        lb0 = fd1 > ld4;
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
    Output.points[8][1] -= fd0;
    ab1 = ab2 && ab3;
    Output.points[8][2] += fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[8][3] += fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 929.725726320244;

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
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = !ab1;
    ab2 = ad1 > ad2;
    double ld0 = 418.0083364677434;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought67.getInstance(fd1, ld0, ad1, ad2);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    Output.points[8][4] += ld0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = !fb0;
        if (fb1) {
            ad1 = ad2 - ad3;
            ab1 = ab2 && ab3;
            ab4 = fb0 || fb1;
            ad4 *= -1;
            Thought lo2 = Thought198.getInstance(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
            boolean lb3 = true;
if(ao2 != null){
              ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb3);
}
if(ao1 != null){
              ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    if (lb0) {
        fb0 = fb1 || lb0;
        fb0 = !fb1;
        double ld1 = 907.1652649638146;
        Thought lo2 = Thought378.getInstance(ld1, fd0, fd1, ld1);
        lb0 = fd0 < fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
        double ld3 = 756.4170001795092;
if(fo0 != null){
          fo0.m2();
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    if (ab1) {
        Thought lo0 = Thought125.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
        fd1 = fd0 + fd1;
        Thought lo1 = Thought103.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
        } else {
        ab4 = fb0 || fb1;
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        Thought lo2 = Thought152.getInstance(fo0, fo1, fo0, fo1);
        fd0 *= -1;
        fd1 *= -1;
        Thought lo3 = Thought376.getInstance(fd0, fd1, fd0, fd1);
        if (ab2) {
            boolean lb4 = false;
            ab2 = fd0 > fd1;
            ab3 = fd0 > fd1;
            double ld5 = 802.2920935498083;
            ab4 = fb0 && fb1;
            Thought lo6 = Thought140.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld5);
if(fo0 != null){
              lb4 = fo0.m2();
}
if(fo1 != null){
              fo1.m1(ab1, ab2, ab3, ab4);
}
            fb0 = !fb1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0, lb4, ab1, ab2, ab3);
}
            Thought lo7 = Thought385.getInstance(fd1, ld5, fd0, fd1, ab4, fb0, fb1, lb4);
            for(int i0=0; i0<10; i0++){
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Output.points[8][5] -= ad2;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ad1);
}
        for(int i0=0; i0<10; i0++){
            fb0 = fb1 || fb0;
            boolean lb0 = false;
            Output.points[8][6] -= ad2;
            fb0 = !fb1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought274.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = ad2 > ad3;
    Output.points[8][7] -= ad4;
if(fo1 != null){
      fd0 = fo1.m3(lb3, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, lb2, lb3, ab1, ab2);
}
    boolean lb4 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    double ld5 = 75.53424082071986;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 *= -1;
    lb1 = ad4 < fd0;
    fd1 = ld5 + ad1;
    ad2 = ad3 + ad4;
    lb2 = fd0 > fd1;
    double ld6 = 622.1035481131227;
    boolean lb7 = false;
    lb3 = lb4 && lb7;
    ab1 = ld5 > ld6;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    lb0 = !lb1;
    lb2 = !fb0;
    fd0 = fd1 + fd0;
    double ld3 = 451.92435928078015;
    double ld4 = 354.93843239321274;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(fb1, lb0, lb1, lb2);
}
    double ld5 = 752.5438689018454;

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
    ad2 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
    ad4 = fd0 + fd1;
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    fd0 *= -1;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[8][8] += fd0;
    Output.points[0][0] += fd1;
    double ld0 = 559.4717010988226;

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
        boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    fd1 *= -1;
    ad1 *= -1;
    Output.points[0][1] -= ad2;
    Output.points[0][2] += ad3;
    Thought lo1 = Thought207.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    double ld2 = 230.51739387985825;
    ab3 = ad1 > ad2;
    ab4 = ad3 > ad4;
    fd0 = fd1 + ld2;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m1();
}
    fb0 = !fb1;
    lb0 = ab1 || ab2;
    fd1 = ld2 + ad1;
    ad2 = ad3 + ad4;
    double ld3 = 530.7844345625856;
    boolean lb4 = true;
    boolean lb5 = true;
    ab1 = ab2 && ab3;
    ad4 *= -1;
    fd0 = fd1 - ld2;

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
    Output.points[0][3] -= fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought193.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    Output.points[0][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    lb0 = fd0 > fd1;
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(lb2, lb3, fb0, fb1);
}
    lb0 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
    fd1 *= -1;
    lb2 = lb3 || fb0;

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
    Thought lo0 = Thought366.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    double ld0 = 850.6728952483037;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fd1 > ld0;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought1.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    boolean lb2 = true;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 && fb0;
    fb1 = lb2 || fb0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    lb2 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    ld0 = fd0 + fd1;
    Thought lo3 = Thought303.getInstance(ld0, fd0, fd1, ld0);
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    fd1 = ld0 - fd0;
    fb0 = fb1 || lb2;
    boolean lb4 = true;
    fd1 *= -1;
    ld0 = fd0 + fd1;
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
}
