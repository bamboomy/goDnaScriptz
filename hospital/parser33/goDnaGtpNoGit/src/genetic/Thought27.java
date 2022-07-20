package genetic;
import java.util.ArrayList;
class Thought27 extends Thought{
private static ArrayList<Thought27> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 414.47939640320084;
private double fd1 = 996.5358578416129;
private Thought fo0 = null;
private Thought fo1 = null;
Thought27 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought27 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought27 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought27 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought27 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 855.4777246346664;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought269.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld2 = 992.4892368227544;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ld2, fd0, fd1, ld0);
}
    fb1 = ld2 > fd0;
        fb0 = fb1 && fb0;
    fb1 = fd1 > ld0;
    Output.points[4][0] -= ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        Thought lo1 = Thought366.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
        ab3 = !ab4;
        Thought lo2 = Thought110.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
        ab2 = ab3 && ab4;
        fd1 = fd0 - fd1;
        boolean lb3 = false;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ab4 = fd1 < fd0;
        fb0 = fd1 < fd0;
        boolean lb4 = false;
        Output.points[4][1] -= fd1;
        fb0 = !fb1;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    double ld0 = 715.2023351997602;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    if (fb0) {
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        double ld2 = 190.45418343909614;
        double ld3 = 288.4955918550717;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        for(int i0=0; i0<10; i0++){
            fb1 = !lb1;
            fb0 = !fb1;
            lb1 = !fb0;
            fb1 = lb1 && fb0;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    double ld0 = 776.0170226647773;
    Thought lo1 = Thought4.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    double ld2 = 657.7497357394299;
    Thought lo3 = Thought123.getInstance();
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ad4 *= -1;
    fd0 *= -1;
    ab3 = !ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ld2 = ad1 - ad2;
    Thought lo4 = Thought394.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    boolean lb5 = false;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
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
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Output.points[4][2] -= fd1;
if(ao2 != null){
          ao2.m1(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 < fd1;
        lb1 = fd0 < fd1;
        Thought lo2 = Thought178.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
        double ld3 = 371.577032570571;
        ld3 = fd0 - fd1;
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
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought270.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    Output.points[4][3] -= ad2;
    Thought lo1 = Thought152.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      fd0 = ao4.m3();
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    boolean lb2 = true;
    Thought lo3 = Thought377.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
    boolean lb4 = true;
    Output.points[4][4] -= fd1;
    ad1 = ad2 + ad3;
    Output.points[4][5] -= ad4;
    fd0 *= -1;
    boolean lb5 = true;
    Thought lo6 = Thought166.getInstance(fd1, ad1, ad2, ad3, lb4, lb5, fb0, fb1);

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
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[4][6] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb0 = fd0 > fd1;
    boolean lb1 = true;
    lb1 = !ab1;
    if (ab2) {
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
        Output.points[4][7] -= fd1;
        double ld2 = 790.323273996041;
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(ao1 != null){
          ab4 = ao1.m2();
}
        fd0 *= -1;
        boolean lb3 = false;
if(ao2 != null){
          ab4 = ao2.m2(fb0, fb1, lb3, lb0);
}
        fd1 = ld2 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, lb1, ab1, ab2, ab3);
}
        ab4 = ld2 > fd0;
        fd1 = ld2 - fd0;
        fb0 = fb1 && lb3;
if(ao3 != null){
          ao3.m3(fd1, ld2, fd0, fd1, lb0, lb1, ab1, ab2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought29.getInstance(ao1, ao2, ao3, ao4);
    ad1 = ad2 + ad3;
    Thought lo1 = Thought376.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao4.m1();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb2, ab1);
}
    Thought lo3 = Thought140.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao4.m3(fd0, fd1, ad1, ad2, fb1, lb2, ab1, ab2);
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
    fd0 = fd1 - fd0;
        Output.points[4][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 < fd0;
        lb0 = fd1 < fd0;
        fb0 = !fb1;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 375.2432113973329;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > ld0;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought90.getInstance(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ld0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought303.getInstance(fd0, fd1, ld0, fd0);
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    Thought lo3 = Thought105.getInstance();

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought131.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought15.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
        fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 *= -1;
    fb0 = ad4 > fd0;
    Output.points[5][0] -= fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = fd1 > ad1;

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
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        ab2 = ad3 > ad4;
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo0 != null){
          fo0.m3(ab3, ab4, fb0, fb1);
}
        if (ab1) {
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
              fo1.m3(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
            ad2 = ad3 + ad4;
            ab4 = fb0 && fb1;
            Thought lo0 = Thought55.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
            boolean lb1 = true;
            fd0 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought113.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[5][1] -= fd1;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo3 = Thought293.getInstance();
    Output.points[5][2] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3(lb1, lb2, fb0, fb1);
}
    boolean lb4 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, lb4, fb0);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][3] -= ad2;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    fb1 = fb0 || fb1;
    double ld0 = 975.3837555356387;
        double ld1 = 809.0486535428064;
    fb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought25.getInstance(ad3, ad4, fd0, fd1);
    ld0 = ld1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, ld1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
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
    Output.points[5][4] -= fd1;
    fd0 *= -1;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab4 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    lb0 = fd1 < fd0;
    double ld1 = 759.7967845521047;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
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
    boolean lb0 = false;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought286.getInstance(ad1, ad2, ad3, ad4);
    ab2 = !ab3;
    Output.points[5][5] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ab4 = ad4 < fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
        fd0 = fd1 - ad1;
    boolean lb2 = true;
    boolean lb3 = true;

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
    fb1 = fb0 || fb1;
    Thought lo0 = Thought319.getInstance();
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    Thought lo2 = Thought330.getInstance(lb1, fb0, fb1, lb1);
    boolean lb3 = true;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb3, fb0, fb1);
}
    double ld4 = 348.25334141122505;
    ld4 = fd0 + fd1;
    ld4 = fd0 - fd1;
    ld4 *= -1;
    fd0 = fd1 + ld4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld4, fd0, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
}
    lb1 = fd1 > ld4;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = lb3 || fb0;
    double ld5 = 976.5211621659992;
    if (fb1) {
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought258.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    boolean lb3 = true;
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    lb1 = fd1 > fd0;
    lb2 = lb3 || ab1;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    fb0 = !fb1;
    lb1 = fd1 < fd0;
    Thought lo4 = Thought382.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    lb2 = lb3 && ab1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb1);
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
    Output.points[5][6] -= ad2;
    fb1 = fb0 || fb1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought375.getInstance(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
        Thought lo3 = Thought72.getInstance(fo1, fo0, fo1, fo0);
        Thought lo4 = Thought27.getInstance(ad1, ad2, ad3, ad4);
        fd0 = fd1 - ad1;
        Thought lo5 = Thought9.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
        Output.points[5][7] += fd1;
        boolean lb6 = false;
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
    ab1 = ab2 && ab3;
    Output.points[5][8] -= ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = ad4 > fd0;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ad4 > fd0;
    Thought lo0 = Thought298.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    ad4 *= -1;
    Output.points[6][0] -= fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[6][1] -= ad1;
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
    Thought lo0 = Thought105.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;

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
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = ad2 > ad3;
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab2 = fd1 > fd0;
    Thought lo0 = Thought232.getInstance();
        Output.points[6][2] += fd1;
if(ao1 != null){
      fd0 = ao1.m3(ab3, ab4, fb0, fb1);
}
            if (ab1) {
        fd1 = fd0 - fd1;
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
            ab2 = ab3 || ab4;
            Thought lo1 = Thought155.getInstance(ao3, ao4, fo0, fo1);
            boolean lb2 = false;
            fd0 *= -1;
            Thought lo3 = Thought190.getInstance(fd1, fd0, fd1, fd0);
            double ld4 = 888.7451556418869;
            boolean lb5 = false;
            boolean lb6 = false;
            fd0 = fd1 - ld4;
            ab2 = !ab3;
}}
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
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
    double ld0 = 982.3592200174227;
    Thought lo1 = Thought157.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ld0 = ao1.m3(ab4, fb0, fb1, ab1);
}
    if (ab2) {
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        ab1 = !ab2;
        ab3 = !ab4;
if(ao1 != null){
          ao1.m2(fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        ad2 = ad3 - ad4;
        fb0 = fb1 || ab1;
        ab2 = fd0 < fd1;
        double ld2 = 337.730936758493;
if(ao1 != null){
          ld2 = ao1.m3(ao2, ao3, ao4, fo0);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo0 = Thought13.getInstance();
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
        boolean lb2 = true;

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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = !fb0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought108.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);

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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = ad1 + ad2;
        boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought24.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 + ad4;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    ad4 = fd0 - fd1;
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    fb0 = ad1 < ad2;
    fb1 = lb0 && fb0;
    double ld2 = 778.0259484171441;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    double ld0 = 72.34582912788417;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 158.7435484145224;
    ab3 = ab4 && fb0;
    double ld2 = 857.105252544964;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ld2);
}
    fb1 = ad1 > ad2;
    ab1 = ad3 < ad4;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ld2, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    fb0 = !fb1;
if(fo1 != null){
      lb3 = fo1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb3, ab1);
}
    ab2 = fd0 < fd1;

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
    fd0 = fd1 - fd0;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(ao3 != null){
      lb1 = ao3.m2(fb0, fb1, lb0, lb1);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    Output.points[6][3] += ad2;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    fb1 = lb0 || lb1;
    boolean lb2 = true;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought99.getInstance(ao3, ao4, fo0, fo1);
    lb2 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    boolean lb4 = false;

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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3();
}
    Thought lo1 = Thought271.getInstance(fb0, fb1, lb0, ab1);
        ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought327.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
    boolean lb3 = true;
    Thought lo4 = Thought121.getInstance(fo1, ao1, ao2, ao3);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][4] -= ad2;
    ab2 = ab3 || ab4;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb0 = ad4 < fd0;
    lb1 = fd1 < ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
    double ld2 = 770.0154925565529;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - ld2;

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
    Output.points[6][5] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 579.1494011221504;
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        fd0 = fd1 - ld0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][6] -= fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought7.getInstance(fb1, lb0, fb0, fb1);
    Thought lo2 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld4 = 995.8373801882839;
    double ld5 = 310.70739840265105;
    Thought lo6 = Thought168.getInstance(ld5, fd0, fd1, ld4);

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
    Thought lo0 = Thought217.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    double ld1 = 261.9155154863073;
        double ld2 = 55.5961730092431;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought74.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = ld1 < ld2;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0);
}
    Output.points[6][7] -= fd1;
        ld1 = ld2 + fd0;
    Thought lo4 = Thought146.getInstance();
    fb1 = fd1 > ld1;
        fb0 = ld2 < fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;

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
