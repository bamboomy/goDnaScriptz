package genetic;
import java.util.ArrayList;
class Thought337 extends Thought{
private static ArrayList<Thought337> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 396.3321375167115;
private double fd1 = 691.5605773474653;
private Thought fo0 = null;
private Thought fo1 = null;
Thought337 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought337 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought337 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought337 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought337 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought337 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought337 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought337 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought337 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought337 instance = new Thought337 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought337 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought337 instance = new Thought337 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought337 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought337 instance = new Thought337 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought337 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought337 instance = new Thought337 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought337 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought337 instance = new Thought337 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought337 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought337 instance = new Thought337 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought337 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought337 instance = new Thought337 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought337 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought337 instance = new Thought337 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought297.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 338.5035502515985;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fb0 = fd1 > ld1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;

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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
        fd0 *= -1;
        ab4 = !fb0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
        Thought lo1 = Thought165.getInstance(fo1, fo0, fo1, fo0);
        Thought lo2 = Thought308.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld3 = 232.44227156086944;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo4 = Thought53.getInstance(ab4, fb0, fb1, lb0);
        ab1 = ab2 || ab3;
        Output.points[6][3] -= fd0;
        double ld5 = 51.32002804095463;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld5, fb0, fb1, lb0, ab1);
}
        fd0 *= -1;
if(fo1 != null){
          ab2 = fo1.m2(fd1, ld3, ld5, fd0, ab3, ab4, fb0, fb1);
}
        lb0 = !ab1;
        ab2 = !ab3;
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
    Thought lo0 = Thought55.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    ad2 *= -1;
    boolean lb1 = true;
    ad3 *= -1;
    ad4 *= -1;
    Output.points[6][4] -= fd0;
    double ld2 = 474.11490087798614;
    Output.points[6][5] += fd0;
    Thought lo3 = Thought182.getInstance(fo0, fo1, fo0, fo1);
    lb1 = fd1 < ld2;
    Thought lo4 = Thought230.getInstance(ad1, ad2, ad3, ad4);
    Output.points[6][6] += fd0;
    double ld5 = 417.688496825821;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld5);
}
    Thought lo6 = Thought53.getInstance();
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
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < ad1;
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ab2 = ad1 < ad2;
    ab3 = ab4 && fb0;
    Thought lo0 = Thought276.getInstance(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    boolean lb1 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought227.getInstance(fo1, fo0, fo1, fo0);
    Output.points[6][7] -= ad2;
    if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        lb2 = ab1 && ab2;
        Output.points[6][8] += ad1;
        ab3 = ad2 < ad3;
        ad4 = fd0 + fd1;
        ab4 = ad1 < ad2;
        Output.points[7][0] += ad3;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        Output.points[7][1] -= ad2;
        Output.points[7][2] -= ad3;
if(fo1 != null){
          fo0 = fo1.m4();
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
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
if(ao1 != null){
          fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
        Output.points[7][3] += fd0;
        fb1 = fd1 < fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          ao1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        boolean lb0 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[7][4] += fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3();
}
    if (fb0) {
        fd1 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(fb1, lb1, fb0, fb1);
}
        double ld2 = 147.26118459479233;
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
    double ld0 = 239.62064024827814;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    Thought lo1 = Thought278.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
    Thought lo3 = Thought137.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld0;
    lb2 = ad1 > ad2;
    double ld4 = 173.7074055239128;
if(ao1 != null){
      fb0 = ao1.m2();
}
    double ld5 = 707.1963258598851;
if(ao2 != null){
      ad1 = ao2.m3(fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
    Thought lo6 = Thought179.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ld4, ld5, lb2, fb0, fb1, lb2);
}
    double ld7 = 718.3737941839905;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    boolean lb8 = true;
    boolean lb9 = true;
    ld7 = ad1 + ad2;

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
    Thought lo0 = Thought299.getInstance(ao2, ao3, ao4, fo0);
    Thought lo1 = Thought293.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
    ab2 = !ab3;
    fd1 *= -1;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
    double ld2 = 844.6602845289184;
        Thought lo3 = Thought210.getInstance(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
    ab1 = fd0 < fd1;
    ld2 *= -1;
    Output.points[7][5] += fd0;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    double ld4 = 420.62472064517357;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld2, ld4, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = !ab1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    Thought lo0 = Thought287.getInstance(ao1, ao2, ao3, ao4);
    ad3 = ad4 - fd0;
    ab1 = fd1 < ad1;
    ab2 = ad2 > ad3;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    Output.points[7][6] += ad2;
    double ld1 = 392.769373862609;
    Output.points[7][7] -= ad2;
        ad3 *= -1;
if(fo0 != null){
          fo0.m1(ad4, fd0, fd1, ld1);
}
        boolean lb2 = true;
    boolean lb3 = true;
    ab4 = ad1 > ad2;

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
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought144.getInstance();
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    Thought lo2 = Thought311.getInstance(fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;
    Output.points[7][8] += fd0;
    fb1 = !lb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        lb1 = !fb0;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
        boolean lb3 = false;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb1 = !fb0;
        fd0 = fd1 + fd0;
        fb1 = lb3 && lb1;
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
    Thought lo0 = Thought6.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
    Thought lo1 = Thought338.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 875.309917548437;
    double ld2 = 332.9340601812654;
    lb0 = fb0 || fb1;
    Output.points[8][0] += ld1;
        boolean lb3 = false;
    ld2 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, lb3, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    lb3 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, ad1, ad2);
}
if(fo1 != null){
      fo1.m3();
}
    lb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb3, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    lb3 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, ad1, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = ad3 < ad4;

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    Thought lo1 = Thought395.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    if (ab4) {
        ad3 = ad4 - fd0;
        Thought lo3 = Thought136.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
        ab1 = ad4 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        Output.points[8][1] += ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, ab1);
}
        fd0 = fd1 + ad1;
        ab2 = ad2 < ad3;
        if (ab3) {
if(fo1 != null){
              ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
            boolean lb4 = true;
            ab4 = fb0 || fb1;
            lb4 = lb0 || lb2;
}}
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
    boolean lb0 = false;
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo2 = Thought328.getInstance();
if(ao2 != null){
      lb0 = ao2.m2(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    Thought lo3 = Thought97.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
    Thought lo4 = Thought55.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
    boolean lb5 = true;
    boolean lb6 = false;
    lb0 = lb1 && lb5;
    fd0 = fd1 - fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought135.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    Output.points[8][2] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad3 *= -1;
    boolean lb1 = false;
    lb1 = ad4 > fd0;
        fd1 = ad1 + ad2;
    fb0 = fb1 || lb1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    double ld2 = 554.8062466854159;
    Thought lo3 = Thought136.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    Thought lo4 = Thought336.getInstance();
    fd1 = ld2 + ad1;
    fb0 = fb1 && lb1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ad1, lb1, fb0, fb1, lb1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, ad1, ad2, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    fb1 = lb1 && fb0;
    ad3 = ad4 - fd0;

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
    Output.points[8][3] -= fd0;
        boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought222.getInstance();
        double ld2 = 649.7699601253428;
        Output.points[8][4] -= ld2;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
        double ld3 = 757.0501530909681;
        fb1 = lb0 || ab1;
        ab2 = fd0 < fd1;
        ab3 = ab4 && fb0;
        fb1 = lb0 || ab1;
        Output.points[8][5] += ld2;
if(fo0 != null){
          ao4 = fo0.m4(ld3, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ab3 = fo1.m2(ld3, fd0, fd1, ld2);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld2);
}
        ab4 = fb0 || fb1;
        double ld4 = 959.0092291489321;
        }
if(ao1 != null){
      lb0 = ao1.m2();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
    ab3 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ab1 = ao3.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Output.points[8][6] -= fd1;
    ad1 = ad2 - ad3;
    double ld0 = 739.9586937153182;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought216.getInstance(ao3, ao4, fo0, fo1);
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
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
    fb0 = !fb1;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    if (fb0) {
        Thought lo1 = Thought108.getInstance();
        fb1 = !lb0;
        fd0 *= -1;
        fd1 = fd0 + fd1;
        fd0 *= -1;
        fb0 = fd1 < fd0;
        fb1 = lb0 || fb0;
if(fo1 != null){
          fo1.m1(fb1, lb0, fb0, fb1);
}
        } else {
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[8][7] -= fd1;
    fb0 = fb1 && ab1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    double ld1 = 99.20238639523525;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 > ld1;
    Output.points[8][8] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    double ld0 = 36.7992374278372;
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb1 = !fb0;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    fd1 = ld0 + ad1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought27.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
if(fo1 != null){
          fo1.m1(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
        fd1 = ld0 - ad1;
        }
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    boolean lb4 = false;
    lb4 = ad2 < ad3;
    ad4 = fd0 + fd1;
    boolean lb5 = false;
if(fo0 != null){
      lb5 = fo0.m2(ld0, ad1, ad2, ad3);
}
        fb0 = fb1 || lb1;
    boolean lb6 = false;
    ad4 = fd0 + fd1;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    double ld1 = 116.97166047066484;
if(fo0 != null){
      ad1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    fd1 = ld1 - ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = ad4 > fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ld1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Thought lo2 = Thought255.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
    Thought lo3 = Thought37.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = ab3 || ab4;

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
    Thought lo0 = Thought323.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    double ld1 = 829.4042770570908;
    boolean lb2 = true;
    Thought lo3 = Thought178.getInstance(ao1, ao2, ao3, ao4);
    Thought lo4 = Thought349.getInstance(fd0, fd1, ld1, fd0);
    Thought lo5 = Thought182.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
    lb2 = !fb0;
    fb1 = lb2 || fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb2, fb0, fb1);
}
    double ld6 = 949.8581995484914;
    ld1 = ld6 - fd0;
    fd1 *= -1;
    ld1 = ld6 + fd0;
    for(int i0=0; i0<10; i0++){
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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought376.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    Thought lo1 = Thought239.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    lb2 = ad3 < ad4;
    boolean lb3 = false;
    boolean lb4 = false;
    Thought lo5 = Thought215.getInstance(fo0, fo1, ao1, ao2);
    boolean lb6 = true;
    fd0 = fd1 - ad1;
    Thought lo7 = Thought112.getInstance(ad2, ad3, ad4, fd0);
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        if (lb3) {
            for(int i1=0; i1<10; i1++){
if(ao3 != null){
                  lb4 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
                Thought lo8 = Thought359.getInstance();
                lb6 = fb0 && fb1;
                Output.points[0][0] += fd0;
}}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m1(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;

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
    ab1 = ad2 > ad3;
    double ld0 = 317.0512469860282;
    ad3 *= -1;
    Output.points[0][1] -= ad4;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought335.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m2(ab2, ab3, ab4, fb0);
}
    ad1 *= -1;

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
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    fd0 = fd1 - fd0;
    Output.points[0][2] += fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 290.7075486923162;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    ab3 = fd1 > ld0;
    double ld1 = 218.85000409299826;
    ab4 = fb0 || fb1;
        ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought268.getInstance(ld1, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld0, ld1);
}
    ab2 = !ab3;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !ab1;
    boolean lb3 = false;
    boolean lb4 = false;
    fd0 = fd1 + ld0;

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
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 912.8911667515084;
    boolean lb1 = true;
    double ld2 = 725.0639997295422;
if(fo1 != null){
      ld0 = fo1.m3(ld2, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2);
}
    lb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld3 = 47.49968323605452;
    fb0 = fb1 && lb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = fb1 && lb1;
        boolean lb4 = true;
        lb1 = fb0 || fb1;
        ld0 = ld2 + ld3;
if(fo1 != null){
          ad1 = fo1.m3(lb4, lb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb4, lb1, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        Output.points[0][3] += fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        Thought lo0 = Thought163.getInstance(fo1, fo0, fo1, fo0);
        Output.points[0][4] -= fd1;
        Thought lo1 = Thought365.getInstance(ad1, ad2, ad3, ad4);
        Thought lo2 = Thought228.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
        ab1 = !ab2;
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
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought337.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Output.points[0][5] += fd1;
        fb1 = fb0 && fb1;
        for(int i1=0; i1<10; i1++){
            Output.points[0][6] += fd0;
            fb0 = !fb1;
            Thought lo1 = Thought271.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
            fb0 = fd1 < fd0;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
            fd1 *= -1;
            if (fb1) {
if(ao2 != null){
                  ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
                Output.points[0][7] += fd0;
                fb0 = fb1 && fb0;
                fb1 = fd1 < fd0;
                Output.points[0][8] -= fd1;
}}}
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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    double ld0 = 637.0100773781105;
    fb0 = fb1 && fb0;
    fd0 = fd1 + ld0;
if(ao1 != null){
      ao1.m3();
}
    double ld1 = 959.0037333122323;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ld1 = ad1 - ad2;
    Output.points[1][0] += ad3;
    ad4 = fd0 - fd1;
    Output.points[1][1] -= ld0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Output.points[1][2] += fd0;
    ab1 = ab2 && ab3;
    fd1 *= -1;
    fd0 *= -1;
    ab4 = fb0 || fb1;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    fd1 *= -1;
    Output.points[1][3] -= fd0;
    boolean lb1 = true;
if(ao1 != null){
      ab3 = ao1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, lb2, ab1, ab2);
}
    ab3 = fd0 < fd1;
    boolean lb3 = true;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought260.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    ab4 = fb0 && fb1;
    Thought lo3 = Thought125.getInstance(ao4, fo0, fo1, ao1);
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;

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
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought330.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
    boolean lb2 = false;
    double ld3 = 534.8592789867555;
    lb1 = ld3 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = !fb0;

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
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, lb1, fb0);
}
    double ld2 = 60.70003053528988;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
    double ld3 = 502.04148731136564;
    fd0 = fd1 + ld2;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 207.4432878840877;
    double ld2 = 570.0084359014176;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld1);
}
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
    Thought lo5 = Thought87.getInstance();
if(fo1 != null){
      lb0 = fo1.m2(lb3, lb4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, lb0, lb3, lb4, fb0);
}
    fd1 *= -1;
    ld1 = ld2 + fd0;
    double ld6 = 636.4966391078839;
    double ld7 = 871.7241725299732;
if(fo0 != null){
      fo1 = fo0.m4(ld7, fd0, fd1, ld1, fb1, lb0, lb3, lb4);
}
    Thought lo8 = Thought151.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb3);
    boolean lb9 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb10 = false;
    Output.points[1][4] -= ld2;
    Output.points[1][5] -= ld6;
    ld7 *= -1;
if(fo1 != null){
      lb4 = fo1.m2(fd0, fd1, ld1, ld2);
}
    Thought lo11 = Thought176.getInstance(fo0, fo1, fo0, fo1, ld6, ld7, fd0, fd1);

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
