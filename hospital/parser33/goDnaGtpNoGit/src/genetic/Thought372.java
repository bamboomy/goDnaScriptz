package genetic;
import java.util.ArrayList;
class Thought372 extends Thought{
private static ArrayList<Thought372> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 0.9868402328891306;
private double fd1 = 75.08177025718075;
private Thought fo0 = null;
private Thought fo1 = null;
Thought372 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought372 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought372 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought372 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought372 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought372 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought372 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought372 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought372 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought372 instance = new Thought372 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought372 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought372 instance = new Thought372 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought372 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought372 instance = new Thought372 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought372 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought372 instance = new Thought372 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought372 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought372 instance = new Thought372 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought372 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought372 instance = new Thought372 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought372 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought372 instance = new Thought372 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought372 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought372 instance = new Thought372 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[8][5] += fd1;
    Thought lo0 = Thought37.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    Output.points[8][6] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought65.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    lb2 = fd0 > fd1;
    fb0 = fb1 || lb2;
    fb0 = fb1 && lb2;
    fb0 = fd0 > fd1;
    fb1 = !lb2;
    Thought lo3 = Thought15.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
    fd0 = fd1 - fd0;
    fb1 = !lb2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[8][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb4 = true;
    boolean lb5 = true;

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
    Output.points[8][8] -= fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    lb0 = ab1 && ab2;
    ab3 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought96.getInstance();
        double ld2 = 191.19229000300874;
    ld2 = fd0 - fd1;
    Thought lo3 = Thought42.getInstance(ab4, fb0, fb1, lb0);
    Thought lo4 = Thought14.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld2, fd0, fb1, lb0, ab1, ab2);
}
    Output.points[0][0] += fd1;
    double ld5 = 559.8102375264465;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ld2 = ld5 + fd0;

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
    fb0 = fb1 || fb0;
    Output.points[0][1] += ad2;
    Output.points[0][2] -= ad3;
    boolean lb0 = false;
    fb0 = !fb1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ad1;
    Thought lo1 = Thought330.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
    lb0 = ad1 > ad2;
    boolean lb2 = true;

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
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ad3 > ad4;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    double ld0 = 646.6231638852828;
    Thought lo1 = Thought165.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    Thought lo3 = Thought277.getInstance(fo1, fo0, fo1, fo0);
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ad1, ad2, ad3);
}
    if (lb2) {
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
        ab1 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ad3 < ad4;
        Thought lo4 = Thought40.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, lb2, ab1, ab2, ab3);
        ad2 = ad3 + ad4;
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[0][3] += fd1;
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[0][4] += fd0;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought167.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
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
    ad1 = ad2 + ad3;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    Output.points[0][5] += fd0;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought240.getInstance();
    Thought lo1 = Thought168.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab4 = fd0 < fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    lb2 = ab1 && ab2;
    if (ab3) {
        ab4 = fd0 < fd1;
        boolean lb3 = true;
        ab4 = fb0 || fb1;
        lb3 = !lb2;
        double ld4 = 932.4402522894691;
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    Output.points[0][6] -= ad2;
if(ao2 != null){
      ab1 = ao2.m2();
}
    ab2 = ad3 > ad4;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Output.points[0][7] += ad3;
    boolean lb0 = false;
    ab4 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Output.points[0][8] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab2 = ad4 < fd0;

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
    fd1 = fd0 + fd1;
    double ld0 = 333.73483688646945;
        fb1 = ld0 < fd0;
    Thought lo1 = Thought284.getInstance(fd1, ld0, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        double ld2 = 643.9481912155135;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld0, fd0, fd1);
}
        double ld3 = 719.0660039381488;
        ld2 = ld3 - ld0;
        fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo0.m1();
}
        fb0 = fb1 && fb0;
        boolean lb4 = false;
        ld2 = ld3 - ld0;
        double ld5 = 364.57218363440404;
        fb0 = fb1 || lb4;
        Output.points[1][0] -= ld0;
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, lb4, fb0);
}
        fb1 = fd1 < ld2;
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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ab1 = fd1 < fd0;
    double ld1 = 615.655432986676;
    double ld2 = 806.5463385962765;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
    Output.points[1][1] += fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = fd1 > ld1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(ld2, fd0, fd1, ld1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1);
}
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought285.getInstance(fo0, fo1, fo0, fo1);
        fb1 = fb0 && fb1;
        fd1 = ad1 + ad2;
        ad3 *= -1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo2 = Thought159.getInstance(fb0, fb1, lb1, fb0);
        fb1 = lb1 || fb0;
        Output.points[1][2] -= fd1;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought387.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld1 = 445.27129186479215;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Output.points[1][3] += fd0;
    double ld1 = 265.03749495116983;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = ld1 > fd0;

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
    ad1 *= -1;
    Thought lo0 = Thought202.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought335.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      fb1 = ao3.m2(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    Output.points[1][4] += fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo2 = Thought29.getInstance(fb1, fb0, fb1, fb0);
    double ld3 = 819.0300959065576;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 885.3562105674791;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought47.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    fd0 = fd1 + ld0;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    Thought lo2 = Thought14.getInstance(fo1, ao1, ao2, ao3);
    ab4 = ld0 > fd0;
        fb0 = fd1 > ld0;
    fb1 = ab1 || ab2;
    Thought lo3 = Thought296.getInstance(fd0, fd1, ld0, fd0);
    double ld4 = 872.402644422567;
    boolean lb5 = true;
    boolean lb6 = false;
    Output.points[1][5] += fd0;

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
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
        boolean lb0 = true;
    ad4 = fd0 + fd1;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    double ld2 = 118.68060145196883;
if(ao3 != null){
      lb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ab1 = ao4.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo2 = Thought157.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb0 = lb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought227.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought78.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld4 = 340.23937416467726;
    fd0 = fd1 - ld4;
    Output.points[1][6] += fd0;
    fd1 = ld4 + fd0;
    fd1 = ld4 - fd0;
    boolean lb5 = true;
    fd1 = ld4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb5, ab1, ab2);
}
    ab3 = fd1 > ld4;
    ab4 = fd0 < fd1;
    if (fb0) {
        boolean lb6 = true;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, fb1, lb6, lb0, lb1);
}
        double ld7 = 49.07217914026415;
        ld4 = fd0 - fd1;
        ld7 = ld4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld7, ld4, fd0, lb5, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb6);
}
        fd1 = ld7 - ld4;
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
    fb1 = ad1 > ad2;
    fb0 = !fb1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;

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
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        ab1 = !ab2;
        fd0 = fd1 - ad1;
if(fo1 != null){
          ad2 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        ad1 *= -1;
        ad2 = ad3 - ad4;
        double ld0 = 748.7672562536409;
        fb0 = fb1 || ab1;
        boolean lb1 = false;
        ab1 = ad4 < fd0;
        double ld2 = 762.0277774537072;
        fd0 = fd1 - ld0;
if(fo1 != null){
          fo0 = fo1.m4(ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought163.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought27.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb4 = true;
    Output.points[1][7] += fd1;
    lb2 = !lb3;
    lb4 = fb0 && fb1;
    Thought lo5 = Thought159.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    lb2 = lb3 && lb4;
if(fo1 != null){
      fo0 = fo1.m4();
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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb0 = true;
    Output.points[1][8] -= fd0;
    boolean lb1 = true;
if(ao1 != null){
      lb1 = ao1.m2(fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    Output.points[2][0] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb1, lb0, lb1, fb0);
}
    boolean lb2 = true;
    ad4 = fd0 + fd1;
    Output.points[2][1] += ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, lb1, lb2, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought168.getInstance(ad1, ad2, ad3, ad4);
    Thought lo4 = Thought35.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    fb1 = lb0 || lb1;
    ad3 = ad4 - fd0;
    lb2 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;

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
if(ao2 != null){
      ao2.m1();
}
    ab2 = !ab3;
    ab4 = !fb0;
if(ao3 != null){
      fd0 = ao3.m3(fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    fd1 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    double ld1 = 290.66251641043834;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought175.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          ao2.m3(ld1, fd0, fd1, ld1);
}
        ab2 = ab3 && ab4;
        Thought lo3 = Thought73.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
        fb0 = fb1 && lb0;
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
    double ld0 = 227.35389576435736;
    ab2 = ld0 < ad1;
    double ld1 = 482.2683943917216;
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    Output.points[2][2] += ad2;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ld0 = ld1 + ad1;
if(ao3 != null){
      ab4 = ao3.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
}
    double ld3 = 225.60478597520682;
    Thought lo4 = Thought13.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    boolean lb5 = true;
    Output.points[2][3] -= ld0;
    boolean lb6 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld7 = 241.21379214620296;
    ld1 = ld3 + ld7;
    double ld8 = 126.35066769309546;
    lb2 = lb5 && lb6;
    ld8 *= -1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab1 = ld0 < ld1;
    ab2 = ld3 < ld7;
    boolean lb9 = true;
    ab2 = ld8 < ad1;

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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
        boolean lb1 = false;
        Thought lo2 = Thought205.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb3 = true;
    boolean lb4 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb3, lb4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);
}
    Thought lo5 = Thought258.getInstance(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb0);
    fd0 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
}
    lb0 = fd1 > fd0;
    lb1 = lb3 || lb4;
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
    lb1 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    double ld6 = 830.5501196119765;
    fd0 *= -1;
    lb4 = fd1 < ld6;

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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought233.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought0.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m2();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought123.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
    double ld4 = 375.92156890431465;
    Thought lo5 = Thought379.getInstance(fo0, fo1, fo0, fo1);

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
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      lb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
        double ld2 = 393.75933527405675;
    lb1 = ad3 > ad4;
    boolean lb3 = false;
    lb3 = fd0 > fd1;
    double ld4 = 528.7484767533264;

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
    double ld0 = 777.5344870229643;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = ld0 > ad1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought199.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
        boolean lb2 = false;
        lb2 = ab1 || ab2;
        fd1 = ld0 - ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fd1, ld0, ad1, ad2, lb2, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        Thought lo3 = Thought173.getInstance(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
        ab4 = fb0 || fb1;
        boolean lb4 = true;
        ad3 = ad4 - fd0;
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
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    Output.points[2][4] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    lb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    lb2 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[2][5] += fd0;
if(fo0 != null){
          lb2 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        Output.points[2][6] -= fd1;
        lb2 = fb0 || fb1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        double ld3 = 859.9498347974787;
        Output.points[2][7] -= fd0;
        fd1 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad4 = ao4.m3(lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought49.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
    lb0 = !lb1;
    double ld3 = 830.0684494069411;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = ld3 - ad1;
    Thought lo4 = Thought369.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = ad3 < ad4;
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld3, ad1);
}
    double ld6 = 781.240748926085;
    Output.points[2][8] -= ad1;
    fb0 = !fb1;
    Thought lo7 = Thought237.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao2 != null){
      fd1 = ao2.m3();
}
    Output.points[3][0] += ld3;
if(ao3 != null){
      lb0 = ao3.m2(lb1, lb5, fb0, fb1);
}
    ld6 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, lb1, lb5, fb0);
}
    fb1 = ld3 > ld6;

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
    fd0 *= -1;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
if(ao1 != null){
          ab3 = ao1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    Output.points[3][1] -= fd1;
            fd0 *= -1;
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    Output.points[3][2] += fd1;
    fd0 = fd1 + fd0;
    double ld1 = 194.07069945563876;
    Output.points[3][3] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab4 = fb0 && fb1;
    fd1 = ld1 - fd0;
    boolean lb2 = false;

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
    Output.points[3][4] -= ad1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    double ld0 = 834.1709847555295;
    boolean lb1 = false;
    ld0 = ad1 + ad2;
    boolean lb2 = true;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
if(ao2 != null){
      lb1 = ao2.m2();
}
    lb2 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    double ld3 = 148.23354323669793;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    lb1 = lb2 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld3, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought373.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, lb2, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo5 = Thought20.getInstance(ld0, ld3, ad1, ad2);

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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    double ld0 = 21.458990596585434;
if(fo1 != null){
      fo1.m1();
}
    double ld1 = 694.4926580700744;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    Thought lo2 = Thought145.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    ld1 = fd0 + fd1;
    Output.points[3][5] += ld0;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    fb0 = !fb1;
    lb3 = ld1 < fd0;
    fb0 = fb1 && lb3;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought249.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought241.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 437.09939183790567;
    Thought lo2 = Thought290.getInstance(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    Thought lo3 = Thought242.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Thought lo4 = Thought199.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ld1 < fd0;
        fb0 = fd1 > ld1;
    boolean lb5 = false;
    fb0 = fd0 > fd1;
    Output.points[3][6] -= ld1;
    fd0 = fd1 + ld1;
        boolean lb6 = true;
    fb0 = fb1 || lb5;
    fd0 = fd1 + ld1;
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
}
