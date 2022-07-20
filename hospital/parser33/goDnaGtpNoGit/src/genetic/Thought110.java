package genetic;
import java.util.ArrayList;
class Thought110 extends Thought{
private static ArrayList<Thought110> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 304.7878094413183;
private double fd1 = 126.05605258267883;
private Thought fo0 = null;
private Thought fo1 = null;
Thought110 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought110 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought110 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought110 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought110 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought110 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought110 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought110 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought110 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought110 instance = new Thought110 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought110 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought110 instance = new Thought110 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought110 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought110 instance = new Thought110 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought110 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought110 instance = new Thought110 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought110 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought110 instance = new Thought110 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought110 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought110 instance = new Thought110 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought110 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought110 instance = new Thought110 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought110 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought110 instance = new Thought110 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb1 = true;
    Thought lo2 = Thought79.getInstance(lb1, fb0, fb1, lb0);
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    double ld3 = 468.25468894691437;
    fb0 = !fb1;
    Output.points[1][5] -= fd0;
if(fo1 != null){
      fo1.m1(fd1, ld3, fd0, fd1, lb0, lb1, fb0, fb1);
}
    ld3 *= -1;

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
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    double ld1 = 766.0562602946865;
    double ld2 = 348.0876080347549;
    ld2 = fd0 + fd1;
    ld1 = ld2 - fd0;
    fd1 = ld1 + ld2;
    fd0 = fd1 + ld1;
    ab1 = ld2 > fd0;
    ab2 = !ab3;
    Output.points[1][6] -= fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fb0 = ad1 > ad2;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        fb1 = !fb0;
        fb1 = fb0 || fb1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        boolean lb0 = true;
if(fo0 != null){
          lb0 = fo0.m2();
}
        Thought lo1 = Thought159.getInstance(fb0, fb1, lb0, fb0);
        fb1 = !lb0;
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
    boolean lb0 = false;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought41.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);

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
    fb0 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought60.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Output.points[1][7] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      lb1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    if (fb0) {
        fb1 = lb1 && lb2;
        boolean lb3 = false;
        Thought lo4 = Thought280.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb3);
        lb1 = fd1 < fd0;
        Output.points[1][8] -= fd1;
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
    if (fb0) {
        boolean lb0 = false;
if(ao2 != null){
          ao2.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
        fd0 = fd1 - ad1;
        fb1 = ad2 > ad3;
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Thought lo2 = Thought198.getInstance(fd0, fd1, ad1, ad2);
        boolean lb3 = true;
        double ld4 = 575.9789269394086;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        double ld5 = 262.4868479536196;
        fd0 = fd1 - ld4;
        double ld6 = 954.737569234248;
        lb1 = ld5 < ld6;
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        lb3 = fb0 || fb1;
        lb0 = ld4 < ld5;
        boolean lb7 = false;
if(ao1 != null){
          ld6 = ao1.m3();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][0] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
    Thought lo0 = Thought233.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
    if (ab2) {
        fd0 = fd1 + fd0;
        if (ab3) {
if(ao3 != null){
              ab4 = ao3.m2(fd1, fd0, fd1, fd0);
}
            fb0 = fb1 || lb1;
            fd1 *= -1;
            ab1 = fd0 < fd1;
            Thought lo2 = Thought171.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
            ab2 = ab3 && ab4;
            fb0 = fd0 > fd1;
if(ao3 != null){
              ao2 = ao3.m4();
}
if(ao4 != null){
              ao4.m1(fb1, lb1, ab1, ab2);
}
if(fo0 != null){
              fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
            fd1 *= -1;
if(fo0 != null){
              ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
            ab4 = fd0 < fd1;
}}
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
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought373.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought267.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    boolean lb2 = false;
    ab2 = fd1 < ad1;
    ad2 = ad3 + ad4;
    ab3 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    ad2 = ad3 + ad4;
    boolean lb3 = false;
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb2, lb3);
}
    Thought lo4 = Thought365.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb3);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;

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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    double ld0 = 145.03370836861592;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
    fb1 = !fb0;
    double ld1 = 309.31359699497017;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, fd0, fb0, fb1, lb2, fb0);
}
    fd1 = ld0 + ld1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[2][1] += fd1;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Output.points[2][2] += fd0;
    double ld0 = 159.81151513028064;
    Thought lo1 = Thought230.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 - ld0;
    fb1 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
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
    fb0 = fb1 || fb0;
    double ld0 = 24.911065326934576;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    boolean lb2 = false;
    Thought lo3 = Thought199.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld0, ad1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
if(fo0 != null){
      ab3 = fo0.m2();
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 *= -1;
    Thought lo0 = Thought241.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = ad4 < fd0;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = lb1 || ab1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
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
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought214.getInstance();
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        for(int i1=0; i1<10; i1++){
            Output.points[2][3] += fd1;
            lb1 = fd0 < fd1;
            fb0 = fb1 || lb1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
            double ld2 = 158.51346430680616;
            boolean lb3 = false;
if(ao4 != null){
              fb0 = ao4.m2(ld2, fd0, fd1, ld2, fb1, lb3, lb1, fb0);
}
            fb1 = lb3 && lb1;
            fd0 = fd1 + ld2;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb3, lb1);
}
            Thought lo4 = Thought283.getInstance(fo0, fo1, ao1, ao2);
            fd0 = fd1 + ld2;
if(ao3 != null){
              fd0 = ao3.m3(fd1, ld2, fd0, fd1);
}
            fb0 = ld2 < fd0;
if(ao4 != null){
              fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
}
            fd0 = fd1 - ld2;
}}
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
    fb1 = !fb0;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought301.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    ad4 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3);
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
    fd1 *= -1;
    ab1 = fd0 < fd1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ab1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        Output.points[2][4] -= fd0;
        Thought lo0 = Thought172.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        Thought lo1 = Thought282.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
        boolean lb2 = true;
        boolean lb3 = false;
        lb3 = fd0 > fd1;
        fd0 = fd1 - fd0;
        ab1 = fd1 < fd0;
        ab2 = ab3 && ab4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb3);
}
        double ld4 = 831.1533781759422;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = !ab3;
    Thought lo0 = Thought8.getInstance(ad2, ad3, ad4, fd0);
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ab3 = ao2.m2();
}
    if (ab4) {
        boolean lb1 = true;
if(ao3 != null){
          ab4 = ao3.m2(fb0, fb1, lb1, ab1);
}
        ab2 = !ab3;
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
        Output.points[2][5] -= ad2;
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
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    lb2 = fd0 < fd1;
    fb0 = !fb1;
        for(int i0=0; i0<10; i0++){
        lb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        lb1 = fd1 > fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb3 = true;
        boolean lb4 = false;
        lb1 = !lb2;
        fb0 = fd0 < fd1;
        boolean lb5 = false;
        boolean lb6 = true;
        fd0 = fd1 - fd0;
        fd1 *= -1;
        Output.points[2][6] += fd0;
        boolean lb7 = true;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
        lb1 = lb2 && fb0;
        fd1 = fd0 + fd1;
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
    ab1 = fd1 < fd0;
    Thought lo0 = Thought360.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = fd1 < fd0;
    boolean lb1 = false;
    ab2 = fd1 > fd0;
    boolean lb2 = true;
    Output.points[2][7] += fd1;
    Thought lo3 = Thought322.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, lb2, ab1);
}
    ab2 = !ab3;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
    Output.points[2][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    Output.points[3][0] += fd1;
    boolean lb4 = true;
    Thought lo5 = Thought378.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + fd0;

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
    fb1 = fb0 && fb1;
    Thought lo0 = Thought216.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    fd0 = fd1 - ad1;
        ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    Output.points[3][1] += ad2;
if(fo0 != null){
          fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || lb1;
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
    ad1 = ad2 - ad3;
    if (ab2) {
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
        Thought lo0 = Thought78.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
          ad1 = fo0.m3();
}
if(fo1 != null){
          ad2 = fo1.m3(ab3, ab4, fb0, fb1);
}
        if (ab1) {
            ab2 = ab3 && ab4;
            boolean lb1 = false;
            boolean lb2 = true;
            ad3 *= -1;
if(fo0 != null){
              ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    double ld0 = 369.9593305849057;
    fd0 = fd1 + ld0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
if(ao1 != null){
      ao1.m2(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 || lb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 12.247782604479669;
    boolean lb1 = true;
    ad1 *= -1;
    double ld2 = 955.7671739088906;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ld2 > ad1;
    boolean lb3 = true;
    ad2 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, lb3);
}
    boolean lb4 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb4, fb0, fb1, lb1);
}
if(fo1 != null){
      ld0 = fo1.m3(ld2, ad1, ad2, ad3, lb3, lb4, fb0, fb1);
}
    boolean lb5 = false;
    boolean lb6 = false;
    lb1 = !lb3;
    ad4 = fd0 + fd1;
    boolean lb7 = true;
    lb4 = ld0 > ld2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb5, lb6, lb7, fb0);
}
    fb1 = ad1 > ad2;

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
    Thought lo0 = Thought297.getInstance(ao1, ao2, ao3, ao4);
    ab1 = fd1 < fd0;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    double ld1 = 6.811900163425716;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
    ab2 = !ab3;
    Output.points[3][2] += fd1;
    if (ab4) {
        ld1 *= -1;
        fb0 = !fb1;
        double ld2 = 8.385726449263352;
        Output.points[3][3] += ld1;
if(ao3 != null){
          ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
        Output.points[3][4] -= fd0;
        fb0 = fb1 || ab1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, ld1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld2, ld1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, ao1, ao2, ao3);
}
        fd1 = ld2 + ld1;
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
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    double ld0 = 702.2210367801265;
    fd0 = fd1 + ld0;
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    fb0 = ad1 > ad2;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad3 *= -1;
    fb0 = fb1 || lb1;
    ad4 = fd0 + fd1;
    double ld2 = 853.9857400496658;
    ab1 = ab2 || ab3;
    Output.points[3][5] += ld0;
    ab4 = ld2 < ad1;
    Thought lo3 = Thought113.getInstance(fb0, fb1, lb1, ab1);
    double ld4 = 24.488921469840562;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
    Output.points[3][6] -= ld2;
    ld4 = ad1 - ad2;
    fb1 = !lb1;
    ab1 = !ab2;
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    Output.points[3][7] += fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought315.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    ab2 = !ab3;
    Output.points[3][8] += fd0;
    ab4 = !fb0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought199.getInstance(fb0, fb1, lb0, ab1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    double ld2 = 490.66035952645063;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld2, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb3 = true;
    lb3 = fd1 < ld2;
    double ld4 = 463.8547852050335;
    Output.points[4][0] -= ld4;
    Thought lo5 = Thought113.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought293.getInstance(fd0, fd1, ld2, ld4);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld4);
}
    ab1 = fd0 < fd1;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad1 > ad2;
    Thought lo0 = Thought281.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    double ld2 = 373.04653887896865;
    fb0 = ad1 > ad2;
    fb1 = !lb1;
    fb0 = fb1 && lb1;
    fb0 = ad3 < ad4;
    fd0 *= -1;
    fb1 = !lb1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(fd1, ld2, ad1, ad2, lb3, fb0, fb1, lb1);
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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ab2 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought173.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (fb0) {
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
    Thought lo0 = Thought323.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[4][1] += fd0;
    Output.points[4][2] -= fd1;
        boolean lb1 = true;
    fb0 = !fb1;
    lb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb1);
}
    lb2 = fd0 > fd1;
    fb0 = fb1 || lb1;
    lb2 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
}
    Output.points[4][3] -= fd0;

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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Output.points[4][4] -= fd1;
    fb1 = ad1 < ad2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought346.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 18.61481573804805;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought25.getInstance(ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
        fb1 = ad1 > ad2;
        Output.points[4][5] += ad3;
        boolean lb3 = false;
        ad4 *= -1;
        lb3 = fb0 || fb1;
        lb3 = fd0 > fd1;
if(ao3 != null){
          ld1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb3, fb0);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        Thought lo4 = Thought194.getInstance(ad1, ad2, ad3, ad4);
        boolean lb5 = false;
        fb0 = fd0 < fd1;
        fb1 = lb3 && lb5;
        fb0 = fb1 && lb3;
        Thought lo6 = Thought197.getInstance(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          ad4 = ao1.m3(lb5, fb0, fb1, lb3);
}
        Thought lo7 = Thought337.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1, lb5, fb0, fb1, lb3);
        for(int i1=0; i1<10; i1++){
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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[4][6] -= fd0;
    fb1 = fd1 < fd0;
    ab1 = fd1 < fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought313.getInstance(ao2, ao3, ao4, fo0);
    if (fb1) {
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        Output.points[4][7] += fd1;
if(fo1 != null){
          fo1.m1();
}
        fd0 = fd1 - fd0;
        } else if (ab2) {
        Thought lo1 = Thought360.getInstance(ab3, ab4, fb0, fb1);
        boolean lb2 = true;
        boolean lb3 = true;
        lb2 = lb3 || ab1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
        boolean lb4 = true;
        Thought lo5 = Thought223.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        fb0 = fb1 && ab1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
        for(int i1=0; i1<10; i1++){
if(ao4 != null){
              ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
            ab2 = ab3 && ab4;
            Thought lo0 = Thought306.getInstance();
            boolean lb1 = false;
if(ao4 != null){
              ao3 = ao4.m4(ab4, fb0, fb1, lb1);
}
            Thought lo2 = Thought136.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
            Thought lo3 = Thought195.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
            fb1 = lb1 || ab1;
            ab2 = ad3 > ad4;
if(ao3 != null){
              fd0 = ao3.m3(fd1, ad1, ad2, ad3);
}
            ad4 *= -1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
              ab3 = ao4.m2();
}
            }
        ad3 = ad4 + fd0;
        fb0 = fd1 < ad1;
if(fo0 != null){
          fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
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
    fd1 = fd0 + fd1;
        fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought386.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 432.20367336464085;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    fd1 = ld1 + fd0;
    double ld2 = 684.4597498071455;
if(fo1 != null){
      fo1.m1();
}
    fb1 = fd0 > fd1;
    ld1 = ld2 - fd0;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd1 *= -1;
    ld1 = ld2 - fd0;
    double ld3 = 863.9966670345835;
    fb1 = fd0 > fd1;
    ld1 *= -1;
    fb0 = fb1 || fb0;

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
    Thought lo0 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    Thought lo1 = Thought223.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[4][8] += fd1;
    fb0 = fd0 < fd1;
    Output.points[5][0] -= fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    double ld2 = 707.3436753198208;
    fb0 = fd0 > fd1;
    Thought lo3 = Thought288.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
    boolean lb4 = true;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd0 = fd1 - ld2;
    Thought lo5 = Thought315.getInstance(fb1, lb4, fb0, fb1);
    Thought lo6 = Thought154.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb4, fb0, fb1, lb4);
    fd1 = ld2 + fd0;
    fb0 = fd1 > ld2;
    fd0 = fd1 + ld2;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(ld2, fd0, fd1, ld2, lb4, fb0, fb1, lb4);
}
    fd0 = fd1 + ld2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb4, fb0, fb1);
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 712.3235525529;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought2.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    fb1 = !lb1;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb1);
}
    boolean lb4 = true;
    lb3 = fd0 > fd1;
    ld0 *= -1;
    fd0 = fd1 + ld0;

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
