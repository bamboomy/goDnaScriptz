package genetic;
import java.util.ArrayList;
class Thought395 extends Thought{
private static ArrayList<Thought395> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 670.9985379640822;
private double fd1 = 0.2810636065584057;
private Thought fo0 = null;
private Thought fo1 = null;
Thought395 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought395 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought395 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought395 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought395 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought395 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought395 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought395 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought395 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought395 instance = new Thought395 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought395 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought395 instance = new Thought395 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought395 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought395 instance = new Thought395 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought395 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought395 instance = new Thought395 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought395 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought395 instance = new Thought395 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought395 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought395 instance = new Thought395 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought395 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought395 instance = new Thought395 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought395 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought395 instance = new Thought395 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 604.5429196314088;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    lb1 = !lb2;
    Output.points[7][1] -= ld0;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    lb2 = fb0 || fb1;
    lb1 = fd1 < ld0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m3();
}
    Thought lo3 = Thought323.getInstance(lb2, fb0, fb1, lb1);
    fd0 = fd1 + ld0;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    boolean lb0 = false;
    Thought lo1 = Thought304.getInstance(fo0, fo1, fo0, fo1);
    double ld2 = 856.6950671730846;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
        fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(ab1, ab2, ab3, ab4);
}
    double ld3 = 654.8834506783197;
    ld2 = ld3 - fd0;

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
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    Thought lo0 = Thought180.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
    Output.points[7][2] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    lb2 = fb0 && fb1;
    Thought lo3 = Thought38.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    boolean lb4 = true;
    Output.points[7][3] -= ad1;
    Thought lo5 = Thought23.getInstance();
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb1, lb2, lb4, fb0);
}
    Thought lo6 = Thought64.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, lb2, lb4);
    double ld7 = 323.2851231362757;
    fb0 = fb1 || lb1;
    ad4 *= -1;
    Output.points[7][4] += fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought201.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought114.getInstance(ad3, ad4, fd0, fd1);
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    double ld2 = 399.8690432606275;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    Thought lo3 = Thought66.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
    double ld4 = 639.6842330141574;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
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
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    Thought lo1 = Thought7.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    lb0 = !fb0;
    fb1 = !lb0;
    Thought lo2 = Thought31.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought118.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
    lb0 = fd0 < fd1;
    Thought lo4 = Thought103.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 = fd1 + fd0;
    fb1 = lb0 || fb0;
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    boolean lb5 = true;
    fd1 = fd0 + fd1;
    lb5 = fb0 && fb1;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = !lb5;
    lb6 = fb0 && fb1;
    boolean lb7 = false;
    fd0 = fd1 - fd0;

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
    Thought lo0 = Thought188.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    lb1 = fd1 < ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    boolean lb2 = true;
    lb2 = !fb0;
    ad3 *= -1;
    fb1 = lb1 || lb2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    if (fb0) {
        fb1 = ad4 < fd0;
        lb1 = fd1 < ad1;
if(ao2 != null){
          lb2 = ao2.m2(fb0, fb1, lb1, lb2);
}
        fb0 = ad2 < ad3;
        fb1 = ad4 < fd0;
        lb1 = fd1 > ad1;
        Thought lo3 = Thought382.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab3 = ao2.m2();
}
    ab4 = !fb0;
if(ao3 != null){
      ao3.m3(fb1, lb0, ab1, ab2);
}
    Thought lo1 = Thought62.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, lb2, ab1);
}
    Thought lo3 = Thought241.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;

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
    double ld0 = 789.6187888040907;
    Output.points[7][5] += ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Output.points[7][6] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab1 = ab2 || ab3;
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
    fb1 = !lb1;

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
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1();
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought278.getInstance(fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought360.getInstance();
    boolean lb3 = true;
        double ld4 = 914.2157041095192;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        boolean lb0 = true;
        boolean lb1 = false;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        Output.points[7][7] -= fd1;
        lb1 = ab1 || ab2;
        ab3 = ab4 && fb0;
        fb1 = lb0 && lb1;
        }
    ab3 = fd0 < fd1;
    boolean lb2 = true;
    double ld3 = 432.13735437759107;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb2);
}
    double ld4 = 96.59575648827895;
    ab1 = fd0 < fd1;

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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    Output.points[7][8] -= fd0;
    Output.points[8][0] -= fd1;
    ad1 *= -1;
    double ld0 = 556.8023192196245;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 < ad1;
    ab2 = !ab3;
    double ld0 = 609.201952293537;
        Thought lo1 = Thought88.getInstance();
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 + ld0;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld2 = 137.91532572854373;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ad4 > fd0;
    ab4 = fb0 && fb1;
    double ld3 = 979.8398908077882;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
    fb0 = ld3 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    Thought lo4 = Thought56.getInstance(fb1, ab1, ab2, ab3);
    boolean lb5 = true;
    fd0 = fd1 + ld0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought263.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb2 = false;

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
    fb1 = fb0 && fb1;
    Output.points[8][1] -= ad2;
    Thought lo0 = Thought133.getInstance(ad3, ad4, fd0, fd1);
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = ad1 - ad2;
    double ld1 = 144.85043856863314;
    Thought lo2 = Thought137.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    if (ab3) {
        ab4 = !fb0;
        } else {
        fb1 = ab1 || ab2;
if(ao3 != null){
          fd0 = ao3.m3();
}
        ab3 = fd1 < fd0;
        ab4 = fb0 && fb1;
        Thought lo0 = Thought270.getInstance(ab1, ab2, ab3, ab4);
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = fd1 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        Thought lo1 = Thought20.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
        fb1 = fd1 < fd0;
        ab1 = ab2 && ab3;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        ab4 = fd0 < fd1;
        Output.points[8][2] -= fd0;
        fd1 = fd0 - fd1;
        Thought lo2 = Thought212.getInstance();
        fb0 = fb1 && ab1;
        fd0 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    double ld0 = 616.6202766915441;
    double ld1 = 371.10845623896057;
    ad1 *= -1;
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        fd1 *= -1;
        }
    Thought lo3 = Thought178.getInstance(ld0, ld1, ad1, ad2);
    boolean lb4 = false;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    lb4 = ld1 < ad1;
if(ao2 != null){
      ab1 = ao2.m2();
}
    Thought lo5 = Thought56.getInstance(ab2, ab3, ab4, fb0);
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb1, lb2, lb4, ab1);
}
    boolean lb6 = true;
    Thought lo7 = Thought129.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
    ld0 = ld1 + ad1;

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
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    double ld1 = 10.30248148630671;
    lb0 = ld1 > fd0;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    fb0 = ld1 < fd0;
    fd1 = ld1 + fd0;
        boolean lb2 = true;
    Thought lo3 = Thought302.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ld1 + fd0;
    fb0 = fd1 > ld1;
        fb1 = fd0 > fd1;
    ld1 = fd0 + fd1;
    lb0 = lb2 || fb0;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    fb1 = lb0 || lb2;
    boolean lb4 = true;
    fd1 *= -1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 268.79248844832927;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][3] -= fd1;
    double ld1 = 818.2902080846065;
    Output.points[8][4] -= ld0;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
    ab1 = ab2 && ab3;
    boolean lb3 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 672.5157883071154;
    double ld1 = 332.7507252446195;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
        Thought lo3 = Thought26.getInstance(fo1, fo0, fo1, fo0);
        Output.points[8][5] += ad1;
if(fo1 != null){
          lb2 = fo1.m2(ad2, ad3, ad4, fd0);
}
        fd1 = ld0 - ld1;
        fb0 = ad1 < ad2;
        fb1 = !lb2;
        fb0 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
          fb1 = fo0.m2();
}
if(fo1 != null){
          fo1.m1(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld1 = 750.064635886758;
    double ld2 = 565.8460062400968;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    double ld3 = 898.3799680880767;
    Output.points[8][6] += ld2;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, lb4, lb0, ab1, ab2);
}
        ab3 = ad4 > fd0;
        Thought lo5 = Thought94.getInstance(fd1, ld1, ld2, ld3, ab4, fb0, fb1, lb4);
        ad1 = ad2 + ad3;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        double ld6 = 481.3674154059956;
        ad3 = ad4 + fd0;
        Thought lo7 = Thought129.getInstance(fd1, ld6, ld1, ld2);
        for(int i1=0; i1<10; i1++){
            fb0 = ld3 < ad1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = false;
    if (lb0) {
        Thought lo1 = Thought22.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
        Output.points[8][7] += fd1;
        fb0 = fb1 && lb0;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
        fb0 = fb1 && lb0;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
        double ld2 = 588.3033223475221;
        ld2 = fd0 + fd1;
        Thought lo3 = Thought95.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
        fd0 = fd1 - ld2;
        fd0 = fd1 - ld2;
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
}
        boolean lb4 = false;
        double ld5 = 110.28849693496454;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb4);
}
if(ao2 != null){
          ld2 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m3(ld5, fd0, fd1, ld2);
}
        for(int i0=0; i0<10; i0++){
            lb0 = ld5 > fd0;
            fd1 = ld2 - ld5;
}}
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
    boolean lb0 = false;
    Output.points[8][8] -= ad2;
    lb0 = ad3 > ad4;
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought264.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    boolean lb4 = false;
if(fo1 != null){
      lb2 = fo1.m2();
}
    boolean lb5 = false;
    lb4 = !lb5;
    ad2 = ad3 - ad4;
    boolean lb6 = true;
    boolean lb7 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 151.026875039392;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought232.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
    fd1 *= -1;
    ld0 = fd0 + fd1;
    Thought lo2 = Thought62.getInstance(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
    ab2 = !ab3;
    Output.points[0][0] -= fd0;
    ab4 = !fb0;
    fd1 = ld0 - fd0;
    fb1 = fd1 > ld0;
    ab1 = !ab2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
    boolean lb3 = false;
    fd1 = ld0 - fd0;
    boolean lb4 = true;
    lb3 = lb4 && ab1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ld0 *= -1;
    if (ab2) {
        ab3 = fd0 > fd1;
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
    Output.points[0][1] -= ad2;
    Thought lo0 = Thought79.getInstance(ad3, ad4, fd0, fd1);
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2();
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    Thought lo1 = Thought375.getInstance(fb1, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
    fb1 = ab1 || ab2;
    Thought lo2 = Thought295.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
    fd1 = ad1 - ad2;
    double ld3 = 557.5386864535841;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 - ad4;
    boolean lb5 = true;
    lb4 = fd0 < fd1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    boolean lb0 = true;
    Output.points[0][2] += fd1;
    lb0 = !fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought158.getInstance();
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    double ld3 = 972.2971833387694;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    Output.points[0][3] -= fd1;
    ld3 = fd0 + fd1;
    ld3 = fd0 + fd1;
    fb1 = ld3 > fd0;
    fd1 = ld3 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = lb1 || fb0;
    fb1 = lb0 || lb1;
    boolean lb4 = true;

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
    ab1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        double ld0 = 610.6068405530277;
        ab2 = ld0 > fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
          fo1.m3();
}
        boolean lb1 = true;
        ab2 = ld0 < fd0;
        fd1 = ld0 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        lb1 = ab1 || ab2;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
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
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd0 = fd1 - ad1;
    double ld0 = 842.1384408997761;
    double ld1 = 101.14206011674815;
    Thought lo2 = Thought248.getInstance(ld1, ad1, ad2, ad3);
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    fb0 = !fb1;
    Thought lo3 = Thought270.getInstance();
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    double ld4 = 738.2957296775576;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo5 = Thought342.getInstance(fo0, fo1, fo0, fo1, ld4, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    ad4 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, ld4, ad1, fb0, fb1, fb0, fb1);
}
    double ld6 = 231.0339862593874;
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
    ad2 *= -1;
    if (ab1) {
        ad3 *= -1;
        for(int i0=0; i0<10; i0++){
            ad4 = fd0 - fd1;
            }
        ab2 = ad1 > ad2;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
        boolean lb0 = false;
        ad2 *= -1;
        Output.points[0][4] -= ad3;
        ab2 = ad4 < fd0;
        double ld1 = 533.3801365803002;
        Output.points[0][5] += fd0;
        double ld2 = 182.83540722603826;
        ab3 = fd0 > fd1;
        ab4 = ld1 > ld2;
        ad1 *= -1;
        fb0 = fb1 && lb0;
        ad2 *= -1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        ld1 = ld2 + ad1;
        Output.points[0][6] += ad2;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, ad1, ad2, fb0, fb1, lb0, ab1);
}
        double ld3 = 56.36285852943928;
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
    Thought lo0 = Thought65.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb1 = true;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    boolean lb3 = true;
    lb1 = lb2 || lb3;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1();
}
    Thought lo5 = Thought41.getInstance(lb1, lb2, lb3, lb4);
    fd1 = fd0 - fd1;
    Output.points[0][7] += fd0;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb2, lb3, lb4, fb0);
}
    boolean lb6 = true;
    fd0 *= -1;
    Output.points[0][8] += fd1;
    fb0 = fb1 && lb1;
    boolean lb7 = true;
    lb2 = fd0 < fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ad1 = ad2 + ad3;
        fb1 = fb0 && fb1;
        ad4 = fd0 + fd1;
        fb0 = ad1 > ad2;
if(fo0 != null){
          ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
        for(int i1=0; i1<10; i1++){
            fb1 = fd0 > fd1;
if(fo1 != null){
              fo0 = fo1.m4();
}
            Thought lo0 = Thought47.getInstance(fb0, fb1, fb0, fb1);
            double ld1 = 96.6901723906589;
            boolean lb2 = true;
            double ld3 = 651.183721206879;
            lb2 = fb0 && fb1;
            lb2 = ld1 > ld3;
if(ao1 != null){
              ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
            fb1 = fd0 > fd1;
if(ao1 != null){
              fo1 = ao1.m4(ld1, ld3, ad1, ad2, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            Output.points[1][0] += ad3;
            fb1 = lb2 || fb0;
}}
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
    fd1 *= -1;
    Thought lo0 = Thought121.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo2 = Thought254.getInstance(lb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    double ld3 = 210.44367832613509;

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
    double ld0 = 759.6467854232146;
if(ao1 != null){
      ao1.m2(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Output.points[1][1] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1);
}
    boolean lb1 = false;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(ao2 != null){
      ab4 = ao2.m2();
}
    boolean lb4 = false;
    double ld5 = 915.8953366548029;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld5, lb2, lb3, lb4, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo6 = Thought231.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, lb4, ab1, ab2);
}
    Thought lo7 = Thought169.getInstance(ao4, fo0, fo1, ao1);

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
    Thought lo0 = Thought373.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought359.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    fb1 = !lb1;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought150.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    double ld4 = 978.2307810139604;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought117.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][2] += fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    lb2 = fd0 > fd1;
    Output.points[1][3] += fd0;

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
      fb0 = fo1.m2();
}
        double ld0 = 62.64312314151591;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought101.getInstance(fb1, fb0, fb1, fb0);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
    fd1 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, lb2, lb3);
}
    Thought lo4 = Thought30.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && lb2;
    Thought lo5 = Thought239.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    fd0 *= -1;
if(fo1 != null){
      lb3 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, lb3, fb0, fb1);
}
    fd0 = fd1 - ld0;

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
