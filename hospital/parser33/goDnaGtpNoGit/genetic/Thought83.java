package genetic;
import java.util.ArrayList;
class Thought83 extends Thought{
private static ArrayList<Thought83> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 253.81980094397068;
private double fd1 = 550.2152227396418;
private Thought fo0 = null;
private Thought fo1 = null;
Thought83 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought83 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought83 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought83 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought83 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought212.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb1 = fb0 && fb1;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        lb1 = !fb0;
        boolean lb2 = true;
        fd1 = fd0 + fd1;
        double ld3 = 404.4547850599671;
        boolean lb4 = true;
        lb4 = ld3 < fd0;
        fb0 = fd1 < ld3;
        fb1 = fd0 > fd1;
        double ld5 = 131.15325279279585;
        double ld6 = 140.8402101567703;
        double ld7 = 618.5689404709047;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld5, ld6, ld7);
}
        Output.points[3][8] -= fd0;
        Thought lo8 = Thought307.getInstance();
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd0 *= -1;
    double ld1 = 363.748571320543;

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
    fb0 = ad2 < ad3;
    if (fb1) {
        ad4 *= -1;
        double ld0 = 651.9515987851647;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
        double ld1 = 489.20178089952026;
        if (fb0) {
if(fo0 != null){
              fb1 = fo0.m2(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
              ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
            double ld2 = 561.4400395639437;
if(fo0 != null){
              fb0 = fo0.m2();
}
            ad4 = fd0 + fd1;
            ld2 *= -1;
            Output.points[4][0] += ld0;
            ld1 = ad1 + ad2;
            if (fb1) {
                fb0 = !fb1;
                fb0 = ad3 < ad4;
                boolean lb3 = true;
                fb0 = fd0 > fd1;
}}}
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
    Output.points[4][1] += ad1;
if(fo1 != null){
      ad2 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought148.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);

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
    Thought lo0 = Thought122.getInstance();
    fb1 = fb0 || fb1;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
        double ld2 = 277.3337541170632;
    fd0 = fd1 + ld2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb3 = false;
    fd1 = ld2 + fd0;
    fd1 *= -1;
    lb3 = ld2 > fd0;
    double ld4 = 340.4608287629318;
    boolean lb5 = false;
    boolean lb6 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, ld4, lb5, lb6, fb0, fb1);
}
    lb1 = !lb3;
if(ao4 != null){
      lb5 = ao4.m2(fo0, fo1, ao1, ao2, lb6, fb0, fb1, lb1);
}
    fd0 = fd1 - ld2;
    double ld7 = 551.0950317800579;
    ld4 *= -1;
    boolean lb8 = true;
    lb3 = !lb5;
if(ao3 != null){
      lb6 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb9 = false;
    ld7 = fd0 + fd1;

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
    double ld0 = 216.37416088123288;
    ld0 = ad1 + ad2;
    ad3 *= -1;
    Thought lo1 = Thought320.getInstance(ad4, fd0, fd1, ld0);
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[4][2] -= ad2;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    Output.points[4][3] -= ad4;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    double ld2 = 674.2923728294506;
    double ld3 = 908.0760027331798;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    double ld4 = 495.4362048579552;
    boolean lb5 = false;
    ad3 *= -1;
    Thought lo6 = Thought283.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ld2);
}
    Output.points[4][4] += ld3;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    ab4 = fd0 > fd1;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    boolean lb2 = true;
    lb2 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
    lb3 = ab1 && ab2;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    double ld4 = 946.2295296597152;
    lb0 = lb1 || lb2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb3, ab1, ab2, ab3);
}
    fd0 = fd1 + ld4;
    ab4 = fd0 < fd1;
    boolean lb5 = false;
    boolean lb6 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
if(ao1 != null){
      ab1 = ao1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought391.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = ab1 || ab2;
    ad3 *= -1;
    ab3 = ab4 || fb0;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
if(ao1 != null){
      ad1 = ao1.m3(fb1, lb1, lb2, ab1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3, fb1, lb1, lb2, ab1);
}
    boolean lb3 = true;
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
    boolean lb4 = true;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    lb3 = ad4 > fd0;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[4][5] -= fd1;
    Thought lo1 = Thought250.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fd1 > fd0;
    boolean lb3 = false;
    lb2 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought185.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[4][6] += fd1;

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
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    fd0 *= -1;
    Thought lo0 = Thought378.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    ab3 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    ab1 = !ab2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought67.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
    ad1 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
        fb0 = fd1 > ad1;
    Output.points[4][7] += ad2;
    fb1 = fb0 || fb1;
    ad3 = ad4 - fd0;
    Output.points[4][8] += fd1;
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
        fb1 = fb0 && fb1;
    Output.points[5][0] -= fd1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 436.529882964781;
    ld0 = ad1 + ad2;
    double ld1 = 734.272195019575;
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought343.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, ad1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 980.9267760501417;
    Output.points[5][1] -= ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m3();
}
    double ld1 = 1.8433976607366236;
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb2 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        Thought lo3 = Thought142.getInstance(ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        ld0 = ld1 + ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad2 = ad3 - ad4;
if(fo0 != null){
          ab1 = fo0.m2(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        ab2 = ab3 && ab4;
        fb0 = fd0 < fd1;
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
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought314.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
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
    Thought lo0 = Thought54.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    Thought lo1 = Thought323.getInstance();
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    Thought lo2 = Thought46.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        fb1 = ad1 > ad2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb3);
}
    fb0 = !fb1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, fb0, fb1, lb3);
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    boolean lb0 = true;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
        }
    fb1 = fd0 < fd1;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought0.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    double ld2 = 73.24107857870567;
    fd0 = fd1 + ld2;
    for(int i1=0; i1<10; i1++){
        fd0 = fd1 - ld2;
        Thought lo3 = Thought316.getInstance();
        Output.points[5][2] -= fd0;
if(fo1 != null){
          ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
        Output.points[5][3] -= fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld2, fd0, fd1, fb1, lb0, ab1, ab2);
}
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
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
    double ld0 = 946.5380341303306;
    boolean lb1 = true;
    ab3 = !ab4;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = !ab4;
    ld0 = ad1 - ad2;
    Thought lo3 = Thought190.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    fb0 = fb1 || lb1;
    lb2 = ld0 > ad1;
    ad2 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(lb4, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2, ab4, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m1(ad3, ad4, fd0, fd1, lb2, lb4, ab1, ab2);
}
    ld0 *= -1;
    ad1 = ad2 + ad3;
    ab3 = ab4 || fb0;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    if (fb1) {
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
        fd0 = fd1 + fd0;
        } else {
        Output.points[5][4] += fd1;
        fb0 = fb1 || fb0;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo2 = Thought130.getInstance();
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
        lb1 = fd0 < fd1;
        fb0 = fd0 < fd1;
        fb1 = fd0 > fd1;
        double ld3 = 898.5873348078914;
        Thought lo4 = Thought38.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb1, fb0, fb1, lb1);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld3, fd0, fb0, fb1, lb1, fb0);
}
        fb1 = lb1 || fb0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
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
    double ld0 = 91.44721095160652;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought165.getInstance(fd0, fd1, ld0, fd0);
    fd1 = ld0 - fd0;
    if (ab1) {
        boolean lb2 = false;
        Thought lo3 = Thought78.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo0 != null){
          ld0 = fo0.m3();
}
        ab1 = ab2 && ab3;
        boolean lb4 = false;
if(fo1 != null){
          fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb2, lb4, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
        lb2 = fd0 < fd1;
        lb4 = ld0 < fd0;
        boolean lb5 = false;
        lb5 = fd1 > ld0;
        ab1 = ab2 || ab3;
        Output.points[5][5] += fd0;
        boolean lb6 = false;
        fd1 = ld0 + fd0;
        ab3 = fd1 < ld0;
        ab4 = fd0 < fd1;
        fb0 = fb1 || lb2;
        boolean lb7 = false;
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
    fb1 = fb0 || fb1;
    double ld0 = 741.703678953426;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    fd1 = ld0 - ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
    Output.points[5][6] += ad3;

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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
    ab1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;

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
    fd0 = fd1 + fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought145.getInstance();
if(ao1 != null){
          ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb1 = fd0 < fd1;
    fb0 = fb1 && lb1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
    lb1 = !lb2;

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
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, ad1, ad2);
}
    lb1 = fb0 || fb1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld2 = 675.3859923673249;
    lb1 = fb0 || fb1;
    double ld3 = 146.87300998522792;
    Output.points[5][7] += ld2;
    Thought lo4 = Thought329.getInstance();
    lb0 = ld3 > ad1;
    Output.points[5][8] -= ad2;
if(ao1 != null){
      ao1.m3(lb1, fb0, fb1, lb0);
}
    boolean lb5 = true;
    ad3 = ad4 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld2, ld3, ad1, ad2, lb1, lb5, fb0, fb1);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld2, lb0, lb1, lb5, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, lb5);
}
    fb0 = fb1 && lb0;
    lb1 = !lb5;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld3, ad1, ad2, ad3);
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
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought347.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(ao1 != null){
      ab3 = ao1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
        ab3 = fd0 < fd1;
    Thought lo1 = Thought137.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld2 = 194.53771489097826;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
    ab2 = fd0 < fd1;
    double ld3 = 377.65298920978427;
    ab3 = ld2 < ld3;
    boolean lb4 = false;
    boolean lb5 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld3);
}
    Output.points[6][0] += fd0;

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
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    double ld1 = 655.5187742724297;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    double ld3 = 1000.909592169264;
    lb2 = ab1 || ab2;
    double ld4 = 707.8323867402556;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ld1, ld3, ld4, ad1);
}
    ab4 = fb0 && fb1;
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4();
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 834.1708587241694;
    fb0 = fd0 < fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 733.3867870472798;
    fb0 = ld0 > ld1;
    fb1 = fd0 < fd1;
    Thought lo2 = Thought333.getInstance(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought384.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[6][1] -= ld0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[6][2] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    double ld1 = 434.0728506842766;
    double ld2 = 412.55875059477086;
    ld2 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    boolean lb3 = true;
    ab3 = ld2 > fd0;
    ab4 = fd1 > ld1;
    ld2 *= -1;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
        fd0 = fd1 - ld1;
if(fo0 != null){
          fo1 = fo0.m4(ld2, fd0, fd1, ld1, lb0, lb3, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        lb4 = ld2 < fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    double ld0 = 710.0767050194478;
if(fo0 != null){
      fb0 = fo0.m2(ld0, ad1, ad2, ad3);
}
    fb1 = !fb0;
    double ld1 = 432.7767365368177;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1);
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
    ab1 = ad2 > ad3;
    ab2 = ab3 || ab4;
        ad4 = fd0 - fd1;
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
        Output.points[6][3] -= ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
        Output.points[6][4] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
        Output.points[6][5] += fd0;
        lb1 = fd1 > ad1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        Thought lo2 = Thought78.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][6] -= fd1;
    fb0 = fb1 || fb0;
    double ld0 = 246.57167862459775;
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m1(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb1, fb0);
}
    Output.points[6][7] += ld0;
    fd0 = fd1 + ld0;
    double ld2 = 529.3517904911758;
    fb1 = ld2 > fd0;
    if (lb1) {
        fd1 = ld0 - ld2;
        fd0 = fd1 - ld0;
if(ao1 != null){
          ld2 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld2, fb0, fb1, lb1, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    ad2 *= -1;
    double ld0 = 931.6612713946848;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1);
}
    ad2 *= -1;

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    double ld2 = 25.419068071633735;
    Thought lo3 = Thought64.getInstance(ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, lb1, ab1);
}
    ab2 = !ab3;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought283.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
if(ao1 != null){
      ad3 = ao1.m3();
}
    Thought lo1 = Thought135.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fb1 = ad4 < fd0;
    ab1 = ab2 || ab3;
    double ld2 = 10.647664543775983;
    Thought lo3 = Thought222.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[6][8] -= fd1;
    ab1 = ld2 < ad1;
    ab2 = ad2 < ad3;
    ad4 *= -1;
    boolean lb4 = false;
    ab2 = fd0 < fd1;

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
    fb1 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Output.points[7][0] += fd1;
    fb0 = fb1 || lb0;
    double ld1 = 132.53042112561087;
    fb0 = !fb1;
    Thought lo2 = Thought383.getInstance(fo0, fo1, fo0, fo1);
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    lb0 = fd0 > fd1;
    double ld3 = 512.1863702054796;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1);
}
    Thought lo4 = Thought255.getInstance();
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ld3 = fo1.m3(fb0, fb1, lb0, fb0);
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
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 572.7834474861254;
    fd0 = fd1 + ld0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb1 = fd0 < fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    fd0 = fd1 - ld0;
    fb0 = fb1 && lb1;
    boolean lb3 = false;
    Thought lo4 = Thought190.getInstance(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
    double ld5 = 135.0257177068242;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][1] += ld5;
    boolean lb6 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld5, fd0);
}
    boolean lb7 = false;

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
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1();
}
    Output.points[7][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought177.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    lb0 = !fb0;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
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
