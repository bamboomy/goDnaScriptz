package genetic;
import java.util.ArrayList;
class Thought374 extends Thought{
private static ArrayList<Thought374> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 446.1861654681537;
private double fd1 = 526.0048628724545;
private Thought fo0 = null;
private Thought fo1 = null;
Thought374 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought374 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought374 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought374 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought374 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought374 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought374 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought374 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought374 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought374 instance = new Thought374 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought374 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought374 instance = new Thought374 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought374 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought374 instance = new Thought374 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought374 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought374 instance = new Thought374 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought374 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought374 instance = new Thought374 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought374 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought374 instance = new Thought374 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought374 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought374 instance = new Thought374 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought374 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought374 instance = new Thought374 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 486.46189450708505;
    fb0 = ld0 < fd0;
    boolean lb1 = true;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    Thought lo2 = Thought130.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    fd0 *= -1;
    Thought lo3 = Thought394.getInstance();
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    Thought lo4 = Thought163.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
if(fo1 != null){
      lb1 = fo1.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
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
    fd1 *= -1;
    boolean lb0 = true;
    Thought lo1 = Thought20.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
    boolean lb2 = true;
    Thought lo3 = Thought100.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb4 = true;
    fd1 = fd0 - fd1;
    ab2 = fd0 < fd1;
    if (ab3) {
        fd0 *= -1;
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
    boolean lb0 = false;
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(lb0, lb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb4, lb5, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, lb1, lb2, lb3);
}
        lb4 = lb5 || fb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        lb3 = lb4 || lb5;
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
        fb0 = !fb1;
        ad4 = fd0 + fd1;
        Thought lo6 = Thought1.getInstance();
        boolean lb7 = false;
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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 215.26440718512237;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    double ld1 = 577.6529140068409;
    ld0 *= -1;
    ab2 = ld1 < ad1;
    ad2 = ad3 + ad4;
    Output.points[6][4] += fd0;
    fd1 = ld0 - ld1;
    Thought lo2 = Thought87.getInstance(fo0, fo1, fo0, fo1);

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
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(ao2 != null){
      lb0 = ao2.m2();
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
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
    fb1 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    Output.points[6][5] += ad1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[6][6] -= ad2;
    Thought lo1 = Thought375.getInstance(ad3, ad4, fd0, fd1);
    lb0 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        Output.points[6][7] += ad1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab1 = ao1.m2();
}
        ab2 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        Output.points[6][8] -= fd0;
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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = !ab3;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m1(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab3 = !ab4;
if(ao1 != null){
      ao1.m2();
}
    Thought lo2 = Thought219.getInstance(fb0, fb1, lb0, lb1);
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld3 = 698.9962510184442;
    fd0 = fd1 - ld3;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb1 = ld3 < ad1;
    lb0 = lb1 || ab1;
    ab2 = ab3 || ab4;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    double ld2 = 577.5024450145384;
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb1, fb0, fb1);
}
    boolean lb3 = false;
    fd1 *= -1;
    Thought lo4 = Thought252.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb0, lb1, lb3, fb0);
    boolean lb5 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb5, fb0, fb1);
}
    double ld6 = 203.74571028941196;
    ld2 = ld6 - fd0;
    Output.points[7][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought94.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought249.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    Output.points[7][1] -= fd1;
    Thought lo2 = Thought214.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;

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
    boolean lb0 = false;
    Thought lo1 = Thought133.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    lb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = lb0 || fb0;
    Thought lo2 = Thought399.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
    double ld3 = 73.3980344752865;
    lb0 = !fb0;
    Thought lo4 = Thought1.getInstance(ad4, fd0, fd1, ld3, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought82.getInstance(ad2, ad3, ad4, fd0);
    ab1 = fd1 > ad1;
    ab2 = ab3 || ab4;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought18.getInstance();
    Thought lo3 = Thought140.getInstance(ab4, fb0, fb1, lb1);
    Thought lo4 = Thought332.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    Thought lo5 = Thought53.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb1, ab1);
    ad2 *= -1;
    ab2 = ad3 > ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb6 = false;
    Thought lo7 = Thought244.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought302.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb1);
}
    fd0 *= -1;
    double ld3 = 530.6275499890304;
    lb2 = fb0 && fb1;
    fd0 *= -1;
    fd1 = ld3 - fd0;
    if (lb1) {
        lb2 = fb0 || fb1;
        fd1 *= -1;
        lb1 = lb2 && fb0;
        fb1 = lb1 || lb2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
        ad3 *= -1;
    ad4 = fd0 - fd1;
    Output.points[7][2] += ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    fb0 = ad1 < ad2;
    fb1 = lb0 || fb0;
    ad3 *= -1;
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
    boolean lb1 = false;
    Thought lo2 = Thought391.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    double ld3 = 366.1808325264082;
    fb0 = !fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3();
}
    double ld0 = 618.250702924271;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd0 = fd1 + ld0;
    ab2 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
        if (ab1) {
            Output.points[7][3] += fd0;
            boolean lb1 = false;
            ab1 = ab2 && ab3;
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            Thought lo2 = Thought67.getInstance(fd1, ld0, fd0, fd1);
            ab1 = !ab2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][4] -= ad1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
    double ld1 = 742.4096962212942;
    boolean lb2 = true;
    double ld3 = 253.38493906956364;
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld3, ab3, ab4, fb0, fb1);
}
    lb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, ld3, ad1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb2);
}
    ab1 = ad2 < ad3;
    Output.points[7][5] -= ad4;
    ab2 = !ab3;
    Thought lo4 = Thought200.getInstance(ao4, fo0, fo1, ao1);
    fd0 = fd1 - ld1;
if(ao3 != null){
      ao2 = ao3.m4(ld3, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, ld3, ad1);
}
    ab4 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo5 = Thought213.getInstance(fb0, fb1, lb0, lb2);
    ad4 = fd0 - fd1;

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
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 622.41260197952;
    fb1 = ld0 > fd0;
    fb0 = fd1 < ld0;
    double ld1 = 538.9972552950716;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    Output.points[7][6] += ld1;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ld0 = fo0.m3();
}
    for(int i0=0; i0<10; i0++){
        ld1 *= -1;
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
    Output.points[7][7] += fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld1 = 811.6024612530764;
    fb0 = ld1 > fd0;
    Thought lo2 = Thought133.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
    ab3 = ab4 || fb0;
    fb1 = lb0 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    Output.points[7][8] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ld1 = fd0 + fd1;
    Output.points[8][0] += ld1;
        fd0 = fd1 + ld1;

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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought38.getInstance(ad4, fd0, fd1, ad1);
    double ld1 = 112.68111331724894;
    ad1 = ad2 - ad3;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    Output.points[8][1] -= ad1;
    fb0 = fb1 || lb2;
    Output.points[8][2] -= ad2;
    Output.points[8][3] -= ad3;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb3 = ad4 > fd0;
    fd1 = ld1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb2, lb3, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld1, ad1, ad2, ad3, fb1, lb2, lb3, fb0);
}
    double ld4 = 892.7895664745904;
    ad3 *= -1;
    double ld5 = 63.739628337409464;
    fb1 = !lb2;
    lb3 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
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
    boolean lb0 = true;
    double ld1 = 285.41531593681435;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = ld1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = fd1 > ld1;
    Output.points[8][4] -= ad1;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    double ld2 = 229.73713956204693;
    boolean lb3 = true;
    boolean lb4 = false;
    ab1 = ab2 || ab3;
    ad1 *= -1;
    Thought lo5 = Thought255.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
    boolean lb6 = false;
    lb3 = !lb4;
    fd1 *= -1;
    Thought lo7 = Thought238.getInstance(ld1, ld2, ad1, ad2, lb6, ab1, ab2, ab3);
    ab4 = !fb0;
    ad3 = ad4 + fd0;
    fd1 = ld1 + ld2;

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
    boolean lb0 = true;
    boolean lb1 = true;
    if (lb1) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Thought lo2 = Thought304.getInstance(fd1, fd0, fd1, fd0);
        Output.points[8][5] += fd1;
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        lb0 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd0 = fd1 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
        boolean lb3 = true;
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[8][6] -= fd1;
        fd0 *= -1;
        lb0 = lb1 && fb0;
        fd1 *= -1;
        fd0 = fd1 + fd0;
        boolean lb4 = false;
        fd1 *= -1;
        if (fb0) {
            fd0 = fd1 - fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    Output.points[8][7] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    Thought lo0 = Thought169.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought223.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = ad4 > fd0;
    Output.points[8][8] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Output.points[0][0] -= ad1;
    Output.points[0][1] -= ad2;
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad2 = ad3 + ad4;
    double ld2 = 404.82002027683905;
    Thought lo3 = Thought345.getInstance(ad4, fd0, fd1, ld2);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld2;
    double ld4 = 592.5569114989198;
    Thought lo5 = Thought254.getInstance();
    fb1 = ld4 < ad1;

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
    double ld0 = 545.6439210097737;
    Thought lo1 = Thought322.getInstance(ab1, ab2, ab3, ab4);
    Thought lo2 = Thought383.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
    fd0 = fd1 - ld0;
    Thought lo3 = Thought226.getInstance(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = fd1 > ld0;
        boolean lb4 = false;
        lb4 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        ld0 = fd0 - fd1;
if(fo0 != null){
          ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
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
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao3 != null){
      ad3 = ao3.m3(ab2, ab3, ab4, fb0);
}
    double ld0 = 835.0758210864203;
    Thought lo1 = Thought98.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ld0);
}
        ab1 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        }
    double ld2 = 878.7012583976359;
    double ld3 = 945.4816502271549;
    ld0 = ld2 + ld3;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought305.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;

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
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    if (fb1) {
        fd1 = fd0 - fd1;
if(fo0 != null){
          fb0 = fo0.m2();
}
        fb1 = fb0 || fb1;
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
    if (ab1) {
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        Thought lo0 = Thought398.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Output.points[0][2] += fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought49.getInstance(fo1, fo0, fo1, fo0);
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        ab3 = fd1 > fd0;
        ab4 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        double ld2 = 797.0487883736841;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 *= -1;
        ab1 = fd1 > ld2;
        ab2 = !ab3;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought320.getInstance(fd1, ld2, fd0, fd1, fb1, ab1, ab2, ab3);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought211.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fb0 && fb1;
    double ld1 = 56.688057671331855;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb2, fb0, fb1);
}
    lb2 = ad1 > ad2;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought348.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Thought lo2 = Thought289.getInstance(fd0, fd1, ad1, ad2);
    ab1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 32.06019558855315;
    Output.points[0][3] += ad3;
    ab2 = ad4 > fd0;
    fd1 = ld3 - ad1;
    Thought lo4 = Thought75.getInstance(ab3, ab4, fb0, fb1);
    double ld5 = 661.525437977269;
    lb1 = ab1 && ab2;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ld5 = fo1.m3(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb1 = ab1 || ab2;
    Thought lo6 = Thought365.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    lb1 = fd0 < fd1;
    ld3 = ld5 + ad1;
    Thought lo7 = Thought254.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
    fd1 *= -1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    Output.points[0][4] += fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought228.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    double ld1 = 405.15411076884686;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m3(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 + ld1;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb2, fb0);
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
    boolean lb0 = false;
        lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    fb1 = !lb0;
    Thought lo1 = Thought28.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = false;
    boolean lb3 = true;
    fd0 = fd1 + ad1;
    Thought lo4 = Thought40.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    Thought lo5 = Thought206.getInstance();
    boolean lb6 = false;
    if (lb2) {
        lb3 = fd1 < ad1;
        if (lb6) {
if(fo1 != null){
              fo0 = fo1.m4(fb0, fb1, lb0, lb2);
}
            Output.points[0][5] -= ad2;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb3, lb6, fb0, fb1);
}
            Output.points[0][6] += ad1;
            ad2 = ad3 - ad4;
}}
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
    Thought lo0 = Thought107.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = ab1 || ab2;
    ab3 = fd1 < fd0;
    double ld1 = 436.5915642648728;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought177.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > ld1;
    ab3 = ab4 || fb0;
    fd0 *= -1;
    fb1 = fd1 > ld1;
    double ld3 = 270.05398279953874;
    boolean lb4 = false;
if(ao3 != null){
      lb4 = ao3.m2(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ld3, fd0, fd1, ld1, fb0, fb1, lb4, ab1);
}
    ab2 = !ab3;

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
    Thought lo1 = Thought5.getInstance(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought338.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
if(fo0 != null){
      ao4 = fo0.m4();
}
    double ld3 = 567.2485755717844;
    ad4 = fd0 + fd1;
    double ld4 = 58.96941181611316;
if(ao1 != null){
      fo1 = ao1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = ld3 > ld4;

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
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought366.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    Thought lo3 = Thought207.getInstance();
    fd1 *= -1;
    lb0 = lb2 || fb0;
    fd0 = fd1 - fd0;
    Thought lo4 = Thought177.getInstance(fb1, lb0, lb2, fb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 763.0143696225701;
        boolean lb1 = true;
    fb0 = fd0 > fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      lb1 = fo0.m2(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
    lb1 = lb2 || fb0;
    Thought lo3 = Thought288.getInstance(fo0, fo1, fo0, fo1);
    fb1 = lb1 || lb2;
    boolean lb4 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    lb4 = !fb0;
    fb1 = lb1 || lb2;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    Output.points[0][7] -= ld0;

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
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    Thought lo1 = Thought34.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
    lb0 = !lb2;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb2);
}
    fd1 = fd0 - fd1;
    Thought lo3 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
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
