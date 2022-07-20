package genetic;
import java.util.ArrayList;
class Thought181 extends Thought{
private static ArrayList<Thought181> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 236.6325036395817;
private double fd1 = 923.3377213144715;
private Thought fo0 = null;
private Thought fo1 = null;
Thought181 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought181 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought181 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought181 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought181 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought181 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought181 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought181 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought181 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought181 instance = new Thought181 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought181 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought181 instance = new Thought181 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought181 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought181 instance = new Thought181 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought181 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought181 instance = new Thought181 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought181 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought181 instance = new Thought181 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought181 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought181 instance = new Thought181 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought181 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought181 instance = new Thought181 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought181 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought181 instance = new Thought181 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
          fd1 = fo1.m3();
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        lb0 = fd1 > fd0;
        double ld1 = 671.7706753744789;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
        Output.points[6][6] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = !fb0;
        fb1 = lb0 && fb0;
        ld1 *= -1;
        fd0 = fd1 - ld1;
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
        fb0 = fb1 && lb2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[6][7] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
        Output.points[6][8] += ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        boolean lb3 = true;
        fd1 = ld1 + fd0;
        }
    if (fb0) {
        Output.points[7][0] -= fd0;
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
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    fd1 *= -1;
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought107.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[7][1] += fd0;
    Output.points[7][2] += fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    lb0 = !lb2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
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
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    if (fb1) {
        if (lb0) {
            Thought lo1 = Thought100.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            fd1 = ad1 - ad2;
            fb1 = !lb0;
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
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought97.getInstance();
if(fo1 != null){
      fo1.m1(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = ad2 > ad3;
    Output.points[7][3] -= ad4;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ad3 > ad4;
    Thought lo1 = Thought108.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;

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
    fb1 = fb0 && fb1;
    Output.points[7][4] += fd1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought303.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    boolean lb1 = true;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    Thought lo2 = Thought206.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
    double ld3 = 959.3252143874794;
    boolean lb4 = true;

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
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought104.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought169.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb3 = false;
    fb0 = fb1 && lb2;
    double ld4 = 587.528920563089;
    lb3 = fd0 > fd1;
    fb0 = ld4 < ad1;
    boolean lb5 = false;
    fb0 = !fb1;
    Output.points[7][5] -= ad2;
        lb2 = !lb3;
if(ao2 != null){
      ao1 = ao2.m4(lb5, fb0, fb1, lb2);
}
    lb3 = lb5 || fb0;
    fb1 = ad3 < ad4;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld4, ad1, lb2, lb3, lb5, fb0);
}
    ad2 = ad3 + ad4;

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
    ab1 = fd1 < fd0;
    boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[7][6] += fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(ao3 != null){
      fd1 = ao3.m3();
}
    boolean lb2 = false;
    lb2 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
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
    boolean lb0 = false;
if(ao2 != null){
      ab1 = ao2.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld1 = 192.43324611251245;
    fb1 = ld1 > ad1;
    double ld2 = 682.8486521031067;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    lb0 = fd1 > ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3);
}
    Thought lo3 = Thought160.getInstance();

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
    double ld0 = 927.4344236937274;
    double ld1 = 182.7263992612968;
    ld1 *= -1;
    fb1 = fd0 < fd1;
    Output.points[7][7] -= ld0;
    fb0 = fb1 && fb0;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      ld0 = fo1.m3(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < fd0;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    double ld2 = 649.5224965305338;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = lb3 || fb0;
    ld1 = ld2 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb3, fb0, fb1);
}
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ld2, fd0, fb1, lb3, fb0, fb1);
}
    lb3 = fd1 < ld0;

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    double ld0 = 953.4942251156289;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ld0, fd0);
}
    double ld2 = 233.70631688267306;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld0;
    lb3 = ld2 > fd0;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, fb1, lb1, lb3, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld2, fd0, fd1, ab4, fb0, fb1, lb1);
}
    lb3 = ab1 || ab2;
    ab3 = !ab4;
    fb0 = ld0 > ld2;

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
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    double ld0 = 860.9289696023731;
if(fo0 != null){
      fo0.m3(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    Output.points[7][8] += ad2;
    ad3 = ad4 + fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        fb0 = fb1 || fb0;
        fb1 = !fb0;
if(fo0 != null){
          fo0.m2();
}
        double ld1 = 591.9231028536484;
        Output.points[8][0] += ld1;
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
if(fo1 != null){
      ad2 = fo1.m3(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
        for(int i1=0; i1<10; i1++){
            Thought lo0 = Thought310.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
            ab1 = ab2 && ab3;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            fd1 *= -1;
if(fo1 != null){
              ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
            Thought lo1 = Thought356.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
              ad4 = fo0.m3();
}
            ab2 = fd0 > fd1;
            ab3 = ad1 < ad2;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 513.9245506783411;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought374.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
    fb1 = ld0 > fd0;
    double ld2 = 412.08066015912925;
    double ld3 = 99.70178147039314;
    ld3 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld0, ld2, ld3, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
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
        ad1 *= -1;
    boolean lb0 = true;
    Output.points[8][1] += ad2;
    lb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || lb0;
    fd0 *= -1;
    fb0 = fd1 > ad1;
    fb1 = ad2 < ad3;
    double ld1 = 250.41945010454887;
    boolean lb2 = false;
if(ao1 != null){
      lb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought330.getInstance(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
if(ao1 != null){
      fo1 = ao1.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought12.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    Output.points[8][2] -= fd0;
    fd1 *= -1;
    Thought lo1 = Thought108.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    boolean lb2 = true;
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld3 = 970.966575310264;
    lb2 = ld3 > fd0;
    double ld4 = 765.1762604144261;
if(ao1 != null){
      ao1.m2();
}
    boolean lb5 = true;
    lb5 = fd0 < fd1;
if(ao2 != null){
      ld3 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld4, fd0, fd1, ld3, fb1, lb2, lb5, ab1);
}
    ld4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld3, ld4, ab2, ab3, ab4, fb0);
}
    boolean lb6 = true;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb2, lb5, lb6);
}
        Thought lo7 = Thought299.getInstance(ao4, fo0, fo1, ao1);
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
    ad1 = ad2 + ad3;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
        ad3 = ad4 + fd0;
    ab3 = ab4 && fb0;
    Thought lo0 = Thought98.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
    fb1 = ad4 < fd0;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      lb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
    ab2 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    double ld2 = 66.52483350704235;
    boolean lb3 = false;
    lb1 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
    lb3 = ad3 > ad4;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[8][3] -= fd1;
    fd0 *= -1;
    Thought lo0 = Thought137.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 && fb0;
    Output.points[8][4] += fd1;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld1 = 907.7757729826124;
    double ld2 = 256.5346917090486;
if(fo0 != null){
      fo0.m2();
}
    ld2 = fd0 + fd1;
    Thought lo3 = Thought341.getInstance(fb1, fb0, fb1, fb0);
    ld1 = ld2 - fd0;
    fb1 = fb0 || fb1;
    Thought lo4 = Thought31.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
    double ld5 = 768.592596138055;
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
return ld2;
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
    Output.points[8][5] -= fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = !ab4;
    boolean lb0 = true;
    Output.points[8][6] += fd1;
    ab4 = fd0 < fd1;
    fd0 *= -1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        lb0 = fd1 < fd0;
        boolean lb1 = true;
        lb0 = !ab1;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    double ld0 = 835.1799885443043;
    Output.points[8][7] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
        boolean lb1 = true;
if(fo0 != null){
          lb1 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          lb1 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
        boolean lb2 = true;
        lb1 = lb2 || fb0;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4);
}
        fb1 = !lb1;
        lb2 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
        Output.points[8][8] += ad2;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ad1 = ad2 + ad3;
    ab4 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought89.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ab4 = ad3 > ad4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb1 = false;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fb1 = lb1 && ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 > ad1;
    boolean lb2 = false;
    Thought lo3 = Thought223.getInstance(fb0, fb1, lb1, lb2);
    boolean lb4 = true;

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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought302.getInstance(fd1, fd0, fd1, fd0);
    fb1 = lb0 && fb0;
    fb1 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4();
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
    boolean lb1 = true;
    ad1 *= -1;
    Output.points[0][0] += ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < ad1;
    Thought lo2 = Thought300.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = ad4 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
    boolean lb3 = false;
    lb3 = ad1 > ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || lb0;
    lb1 = ad4 > fd0;
    lb3 = fb0 || fb1;
    boolean lb4 = false;
    boolean lb5 = false;
    Thought lo6 = Thought180.getInstance(fd1, ad1, ad2, ad3);

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
    double ld0 = 876.6271605572994;
    ld0 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    Output.points[0][1] += fd0;
    Thought lo1 = Thought64.getInstance();
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Thought lo2 = Thought189.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
    fd0 *= -1;
    ab3 = fd1 > ld0;
    ab4 = fb0 && fb1;
    ab1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought353.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
        ab4 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ld0 = fd0 - fd1;
if(ao1 != null){
          ld0 = ao1.m3(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    if (fb0) {
        fb1 = lb0 && ab1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 < ad1;
        Output.points[0][2] -= ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
        boolean lb1 = true;
        boolean lb2 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4);
}
        if (lb1) {
if(ao1 != null){
              ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
            ad3 *= -1;
            double ld3 = 683.9325760222059;
if(ao1 != null){
              fo1 = ao1.m4();
}
            ad3 = ad4 + fd0;
            lb2 = lb0 && ab1;
if(ao2 != null){
              ao2.m3(ab2, ab3, ab4, fb0);
}
            fd1 = ld3 + ad1;
            Thought lo4 = Thought257.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb1, lb2, lb0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought30.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    if (fb1) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
        lb1 = fd1 < fd0;
        fb0 = fb1 || lb1;
        double ld2 = 681.3305557459012;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
        double ld3 = 495.3221996693677;
        fd0 = fd1 + ld2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld2);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
        lb1 = fb0 && fb1;
        lb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
        Thought lo4 = Thought345.getInstance(ld3, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
        ld3 = fd0 - fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
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
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[0][3] += fd0;
    ab2 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought124.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
        Output.points[0][4] -= fd1;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 600.5798380772321;
    Output.points[0][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld0 = 655.1254792987605;
    ad1 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fd1 = ld0 + ad1;
    fb0 = fb1 || lb1;
    fb0 = !fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ad3 = ad4 - fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 387.9714955352902;
        if (fb0) {
            boolean lb3 = false;
            Output.points[0][6] += ld2;
            double ld4 = 93.55699591632083;
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
        Thought lo0 = Thought331.getInstance();
    ab1 = !ab2;
    ad2 = ad3 - ad4;
    double ld1 = 397.0117248629738;
    double ld2 = 866.7524500237135;
    for(int i0=0; i0<10; i0++){
        ab3 = ad3 < ad4;
        fd0 *= -1;
        fd1 = ld1 + ld2;
        ab4 = !fb0;
        ad1 = ad2 - ad3;
        boolean lb3 = false;
        ad4 = fd0 + fd1;
        fb0 = fb1 && lb3;
        ab1 = ld1 > ld2;
        double ld4 = 493.0734966517949;
        Output.points[0][7] -= ld2;
        Output.points[0][8] += ad1;
        Thought lo5 = Thought364.getInstance(ab2, ab3, ab4, fb0);
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought41.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Thought lo1 = Thought303.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld2 = 599.2314832267056;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
        Thought lo3 = Thought370.getInstance(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
        fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1();
}
    boolean lb0 = false;
    ad3 *= -1;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
    boolean lb1 = false;
    lb0 = ad4 < fd0;
if(ao3 != null){
      fd1 = ao3.m3(lb1, fb0, fb1, lb0);
}
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
if(ao3 != null){
      lb1 = ao3.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
    Output.points[1][0] += ad3;

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
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab4 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
        fb1 = fd0 > fd1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    Thought lo0 = Thought337.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Thought lo1 = Thought24.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    fd0 = fd1 - fd0;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought102.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
    boolean lb1 = false;
    Thought lo2 = Thought277.getInstance(ao3, ao4, fo0, fo1);

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
    fb0 = !fb1;
    double ld0 = 203.90590092325309;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    Thought lo1 = Thought241.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    fd1 *= -1;
    fb1 = fb0 || fb1;
    Output.points[1][1] += ld0;
    fb0 = fb1 || fb0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    Thought lo2 = Thought357.getInstance();
    fd0 = fd1 + ld0;
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought324.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);

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
    Thought lo0 = Thought292.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    double ld1 = 966.2696086571585;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        ld1 = fd0 + fd1;
    fb1 = ld1 > fd0;
    fd1 = ld1 - fd0;
    boolean lb2 = true;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
        boolean lb3 = true;
    Thought lo4 = Thought171.getInstance(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
    fd0 = fd1 - ld1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
