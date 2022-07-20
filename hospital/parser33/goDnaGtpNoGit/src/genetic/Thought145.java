package genetic;
import java.util.ArrayList;
class Thought145 extends Thought{
private static ArrayList<Thought145> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 80.32385137223562;
private double fd1 = 319.8807727012029;
private Thought fo0 = null;
private Thought fo1 = null;
Thought145 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought145 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought145 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought145 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought145 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought145 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought145 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought145 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought145 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought145 instance = new Thought145 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought145 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought145 instance = new Thought145 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought145 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought145 instance = new Thought145 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought145 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought145 instance = new Thought145 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought145 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought145 instance = new Thought145 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought145 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought145 instance = new Thought145 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought145 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought145 instance = new Thought145 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought145 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought145 instance = new Thought145 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    if (fb0) {
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        Output.points[0][0] += fd1;
        fb1 = fd0 < fd1;
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        double ld0 = 522.2380425078454;
        ld0 = fd0 + fd1;
if(fo1 != null){
          fo1.m1(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
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
    Output.points[0][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 199.25241010301406;
    Thought lo1 = Thought292.getInstance(fd0, fd1, ld0, fd0);
    boolean lb2 = true;
        Output.points[0][2] += fd1;
    double ld3 = 498.5584159023974;
    ld0 = ld3 - fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
          ld0 = fo0.m3();
}
    boolean lb4 = true;
    boolean lb5 = false;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb4, lb5, ab1);
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
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought212.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
    lb1 = ad2 < ad3;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
    double ld3 = 332.12816234202927;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld3;
    Thought lo4 = Thought237.getInstance();
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought96.getInstance(fb1, lb1, lb2, fb0);
        boolean lb6 = false;
        boolean lb7 = false;
        for(int i1=0; i1<10; i1++){
            double ld8 = 60.13138247383551;
            Thought lo9 = Thought75.getInstance(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, lb2, fb0, fb1, lb6);
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
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought33.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 + ad2;
    ab1 = ab2 || ab3;
    ad3 *= -1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ab3 = ab4 && fb0;
    ad2 *= -1;

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
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      lb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    lb0 = !lb1;

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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought167.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    double ld1 = 856.7201573767709;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
    fb0 = ad1 > ad2;
        fb1 = fb0 && fb1;
    fb0 = ad3 < ad4;
    double ld2 = 274.44177210408816;
    ad4 *= -1;
    double ld3 = 324.32210702700587;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld1, ld2, ld3, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb4 = true;
    lb4 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb4, fb0);
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      lb4 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd1 = ld1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ad1, ad2, ad3);
}
    fb0 = !fb1;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld2);
}
    lb4 = ld3 > ad1;
    fb0 = fb1 && lb4;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld5 = 463.5120257800983;
if(ao3 != null){
      ao2 = ao3.m4(lb4, fb0, fb1, lb4);
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
    double ld0 = 912.2119201511234;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought63.getInstance(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Output.points[0][3] += ld0;
    ab2 = fd0 < fd1;
    ab3 = ld0 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        ab4 = !fb0;
        fd1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
        fb1 = ab1 && ab2;
        ab3 = !ab4;
        double ld2 = 829.1113402704382;
        boolean lb3 = false;
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
    double ld0 = 541.8888139223556;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = !ab2;
if(ao1 != null){
      ao1.m1();
}
    fd0 = fd1 + ld0;
    Thought lo1 = Thought11.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
    fb0 = ad1 > ad2;
    double ld2 = 189.06752193944794;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ld0;

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
    Thought lo0 = Thought73.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    double ld1 = 948.9553547947608;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    ld1 *= -1;
    boolean lb3 = true;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = ld1 < fd0;
        fd1 = ld1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
        lb2 = !lb3;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb2, lb3, fb0);
}
        Output.points[0][4] += fd1;
        ld1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb2, lb3, fb0);
}
        fd1 *= -1;
        ld1 = fd0 - fd1;
        fb1 = lb2 || lb3;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 257.0870692304255;
    Thought lo1 = Thought125.getInstance(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    double ld2 = 859.2421163035078;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb3 = false;
    ab3 = !ab4;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, fd0, fd1);
}
    double ld4 = 1000.662210685329;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, ld4, fd0);
}
    fb0 = fd1 < ld0;
    Output.points[0][5] -= ld2;
    boolean lb5 = false;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb3, lb5, ab1);
}
        Output.points[0][6] -= fd0;
        ab2 = ab3 && ab4;
        Output.points[0][7] += fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 557.3105615563353;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(ld0, ad1, ad2, ad3);
}
    Thought lo1 = Thought97.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
    fb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fd0 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
    double ld3 = 387.48511935012823;

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
    Thought lo0 = Thought271.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ab4 = fo0.m2();
}
        ad4 *= -1;
        fd0 *= -1;
        boolean lb1 = true;
        fd1 = ad1 - ad2;
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
        ab1 = ab2 || ab3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        Output.points[0][8] -= fd1;
        boolean lb1 = true;
        fd0 = fd1 - fd0;
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
    fb1 = fb0 && fb1;
    double ld0 = 736.3526201611747;
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    double ld1 = 365.6842929753001;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, ad1, ad2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ld0 = ld1 - ad1;
if(ao2 != null){
      fb0 = ao2.m2();
}
        Thought lo2 = Thought179.getInstance(fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = ld0 > ld1;

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
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    double ld1 = 19.638236356014943;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    lb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb3 = false;
if(ao2 != null){
      ao2.m1(ld1, fd0, fd1, ld1);
}
    boolean lb4 = false;
    Thought lo5 = Thought40.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
    ab2 = ab3 || ab4;

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
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought151.getInstance(ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    double ld1 = 121.37797865036583;
    ld1 *= -1;
    ab3 = !ab4;
    if (fb0) {
        fb1 = !ab1;
        boolean lb2 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        ad1 = ad2 - ad3;
        double ld3 = 646.4445710339329;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        boolean lb4 = false;
        Thought lo5 = Thought121.getInstance(ad3, ad4, fd0, fd1);
        ab4 = ld3 < ld1;
        ad1 = ad2 - ad3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    lb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb0 = fb1 || lb0;
    double ld2 = 607.7043942766747;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
    lb1 = fd1 > ld2;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld2, fd0, lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = ld2 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
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
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2();
}
    Output.points[1][0] -= fd1;
    double ld1 = 256.51809337113207;
    ab1 = !ab2;
    Thought lo2 = Thought339.getInstance(ab3, ab4, fb0, fb1);
    if (lb0) {
        Output.points[1][1] -= ld1;
        boolean lb3 = true;
        fd0 = fd1 - ld1;
        fd0 = fd1 + ld1;
        lb0 = !ab1;
        ab2 = fd0 < fd1;
        boolean lb4 = true;
        ab2 = ld1 > fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb3 = ld1 > fd0;
        fd1 = ld1 - fd0;
        lb4 = !lb0;
if(fo1 != null){
          fd1 = fo1.m3(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought47.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && lb1;
    fb0 = ad1 < ad2;
    Output.points[1][2] -= ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb1 = fb0 || fb1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    Output.points[1][3] -= ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 + fd0;
    Output.points[1][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    double ld1 = 630.9718628352018;
    ld1 = fd0 - fd1;
    double ld2 = 785.2207820317952;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ld2, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought301.getInstance(fb1, lb0, fb0, fb1);
    double ld4 = 830.0732714400054;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ld2, ld4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, ld2, ld4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd1 = ld1 + ld2;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    lb0 = ld4 > fd0;
    fd1 = ld1 - ld2;
    Output.points[1][5] -= ld4;
    double ld5 = 121.17187666376851;
    ld5 = fd0 - fd1;
    ld1 = ld2 - ld4;
    fb0 = fb1 && lb0;
    Thought lo6 = Thought105.getInstance(ao3, ao4, fo0, fo1);

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld0 = 700.4209301911966;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ld0;
    boolean lb1 = true;
    Thought lo2 = Thought362.getInstance(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[1][6] += ad1;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;

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
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    double ld0 = 295.33938644486796;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    double ld2 = 937.3327350648293;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2, fb0, fb1, lb1, ab1);
}
    fd0 = fd1 + ld0;
    ab2 = !ab3;
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    ad4 *= -1;
    double ld0 = 61.50041062846704;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
    fb0 = !fb1;
    Thought lo1 = Thought340.getInstance(ad4, fd0, fd1, ld0);
    ad1 *= -1;
    double ld2 = 512.7632626601738;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][7] -= fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1();
}
    Thought lo1 = Thought222.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    boolean lb2 = false;
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    lb2 = fd1 < fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought307.getInstance(fd1, fd0, fd1, fd0);
    lb2 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought105.getInstance();
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    Output.points[1][8] -= fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    fd1 *= -1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought171.getInstance();
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld1 = 459.3243338004415;
    ab1 = ld1 < fd0;
    ab2 = fd1 > ld1;
    Thought lo2 = Thought264.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);

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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    fb0 = !fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      lb0 = fo0.m2();
}
    double ld1 = 861.8595234812724;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    fb0 = ld1 > ad1;
    boolean lb3 = true;
    ad2 *= -1;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb0, lb2, lb3, fb0);
}
    Output.points[2][0] -= ad4;
    fd0 = fd1 - ld1;
    fb1 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1, lb0, lb2, lb3, fb0);
}
    fb1 = !lb0;
    ad1 *= -1;
    boolean lb4 = false;
    lb2 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Thought lo5 = Thought318.getInstance(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
    boolean lb6 = false;

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
    Thought lo0 = Thought68.getInstance(fo0, fo1, fo0, fo1);
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought71.getInstance();
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ab4 = !fb0;
    boolean lb2 = false;
    Output.points[2][1] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb2, ab1);
}
    ab2 = ad2 < ad3;
    ab3 = !ab4;
    ad4 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ad1, ad2, fb1, lb2, ab1, ab2);
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
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    double ld1 = 471.1202871599315;
    fb1 = ld1 > fd0;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 = ld1 + fd0;
    double ld2 = 153.8353239181693;
    fd0 *= -1;
    boolean lb3 = true;
    double ld4 = 120.47158044970683;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2);
}
    lb3 = ld4 > fd0;
    Output.points[2][2] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ld2, ld4, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought321.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    ad3 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    Thought lo2 = Thought70.getInstance(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
        boolean lb3 = true;
    lb3 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, lb3, fb0, fb1);
}
        lb1 = ad2 > ad3;

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
    double ld0 = 325.4599964635751;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[2][3] -= fd0;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(fd1, ld0, fd0, fd1);
}
    lb1 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    double ld2 = 450.0298570757067;
if(ao4 != null){
      ao3 = ao4.m4();
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 423.3656498194835;
        Output.points[2][4] -= ld0;
        ld2 = fd0 - fd1;
        ld3 *= -1;
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, ab1);
}
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought398.getInstance(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    ab1 = ad2 > ad3;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    Output.points[2][5] -= ad4;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought316.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    Output.points[2][6] += ad3;
    ab2 = ab3 && ab4;
    ad4 = fd0 + fd1;
    fb0 = ad1 > ad2;
    Output.points[2][7] -= ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    lb2 = ab1 || ab2;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = ad1 + ad2;
    double ld3 = 597.6973261385357;

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
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
        fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    Output.points[2][8] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought165.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    double ld3 = 255.5382666934691;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    double ld4 = 342.8079643123395;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld5 = 234.03186074439327;
    Output.points[3][0] += ld4;
if(fo1 != null){
      lb1 = fo1.m2(ld5, fd0, fd1, ld3);
}
    Output.points[3][1] -= ld4;
    Thought lo6 = Thought203.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld3);

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
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
    Thought lo0 = Thought137.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought209.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
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
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
        lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
        fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    double ld2 = 804.1124968326795;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    Output.points[3][2] += ld2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      ld2 = fo1.m3();
}
    fd0 *= -1;
    fd1 = ld2 - fd0;
    lb1 = fb0 && fb1;

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
