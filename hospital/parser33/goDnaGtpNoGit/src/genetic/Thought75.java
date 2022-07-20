package genetic;
import java.util.ArrayList;
class Thought75 extends Thought{
private static ArrayList<Thought75> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 925.4525111540454;
private double fd1 = 115.03218832549126;
private Thought fo0 = null;
private Thought fo1 = null;
Thought75 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought75 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought75 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought75 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought75 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought75 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought75 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought75 instance = new Thought75 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 *= -1;
    Output.points[1][8] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Output.points[2][0] += fd0;
    double ld2 = 756.7096329323628;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 - fd0;
    fb0 = fb1 || lb0;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    Output.points[2][1] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    boolean lb0 = false;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    if (ab3) {
        fd0 = fd1 + fd0;
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
      fo0.m1();
}
if(fo1 != null){
      ad2 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[2][2] -= ad3;
    fb0 = fb1 && fb0;
    ad4 *= -1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    Output.points[2][3] += fd1;
    Thought lo2 = Thought93.getInstance(ad1, ad2, ad3, ad4);
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
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
    Output.points[2][4] += ad1;
    boolean lb0 = false;
    lb0 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 && lb0;
    ad2 = ad3 - ad4;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m2();
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought140.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[2][5] += fd0;
    Output.points[2][6] += fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 896.1961840567309;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought222.getInstance(fd0, fd1, ld1, fd0);
    fd1 = ld1 - fd0;
    if (fb1) {
        fd1 *= -1;
        ld1 = fd0 + fd1;
if(ao2 != null){
          ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        Thought lo3 = Thought63.getInstance(fb0, fb1, fb0, fb1);
        fb0 = !fb1;
        double ld4 = 526.7089648365385;
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
    Output.points[2][7] += ad1;
    Thought lo0 = Thought10.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought264.getInstance(ao1, ao2, ao3, ao4);
        ad4 *= -1;
        Thought lo2 = Thought283.getInstance(fd0, fd1, ad1, ad2);
        fb0 = fb1 || fb0;
        boolean lb3 = true;
        Thought lo4 = Thought117.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
if(ao3 != null){
          ad1 = ao3.m3();
}
        Thought lo5 = Thought394.getInstance(fb0, fb1, lb3, fb0);
        ad2 = ad3 - ad4;
        fb1 = fd0 > fd1;
        boolean lb6 = false;
        ad1 = ad2 + ad3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, lb3, lb6, fb0, fb1);
}
        boolean lb7 = false;
        Thought lo8 = Thought266.getInstance(ad2, ad3, ad4, fd0, lb3, lb6, lb7, fb0);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb3, lb6, lb7);
}
        fd1 *= -1;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
        fb1 = lb3 || lb6;
        double ld9 = 277.2974283941218;
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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
    double ld0 = 834.2511715794041;
if(ao3 != null){
      fb0 = ao3.m2();
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m3(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Output.points[2][8] += fd0;
    fb1 = !lb1;
    Output.points[3][0] -= fd1;
if(ao4 != null){
      ab1 = ao4.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
        fd1 = ld0 + fd0;
        double ld2 = 483.0660743491884;
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
    ad1 = ad2 + ad3;
    Output.points[3][1] -= ad4;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ad1;
    Output.points[3][2] += ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    double ld0 = 138.1290593950103;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
if(ao2 != null){
      ab2 = ao2.m2();
}
    boolean lb1 = true;
    ab2 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
        boolean lb2 = true;
        Output.points[3][3] += ad3;
        boolean lb3 = false;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, lb2, lb3, lb1, ab1);
}
        }
    ab4 = fb0 && fb1;
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 - ad1;
    Output.points[3][4] += ad2;

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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    boolean lb0 = false;
        fb0 = fb1 || lb0;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    Output.points[3][5] -= fd1;
    lb0 = fd0 > fd1;
    double ld2 = 946.6610890204768;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}

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
    Thought lo0 = Thought253.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
        Thought lo1 = Thought167.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    fb0 = fb1 || ab1;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb2);
}
        fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb3 = true;
    boolean lb4 = false;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, lb4, ab1, ab2);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, lb3, lb4, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb5 = false;

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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    Thought lo0 = Thought256.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
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
    ab1 = ad2 > ad3;
    Thought lo0 = Thought85.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 *= -1;
    ab2 = ab3 || ab4;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    ad3 *= -1;
    ab4 = fb0 && fb1;
    double ld2 = 770.8990230031226;

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
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought4.getInstance(fb1, lb0, fb0, fb1);
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    lb0 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    double ld2 = 956.7228294787375;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, ld2, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;

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
    double ld0 = 683.4203018843489;
if(ao2 != null){
      ld0 = ao2.m3();
}
    ad1 = ad2 + ad3;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(lb1, fb0, fb1, lb1);
}
    Output.points[3][6] += ad4;
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2, fb0, fb1, lb1, lb2);
}
        fb0 = !fb1;
    lb1 = lb2 && fb0;
if(ao4 != null){
      fb1 = ao4.m2(ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
    Output.points[3][7] -= ld0;
    Output.points[3][8] -= ad1;
    Thought lo3 = Thought186.getInstance(fo0, fo1, ao1, ao2, lb1, lb2, fb0, fb1);
    Output.points[4][0] += ad2;
    lb1 = ad3 > ad4;
    lb2 = fd0 < fd1;

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
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought142.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        ab1 = ab2 && ab3;
        ab4 = fd0 < fd1;
        fb0 = fb1 && ab1;
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3();
}
        double ld1 = 194.4219150458912;
        ld1 = fd0 + fd1;
        ab2 = ld1 > fd0;
if(ao1 != null){
          fd1 = ao1.m3(ab3, ab4, fb0, fb1);
}
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
    Thought lo0 = Thought219.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought2.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
    double ld3 = 733.5894720209664;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m2(ab4, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, ld3, ad1, ad2, fb1, lb1, ab1, ab2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    boolean lb1 = false;
    lb1 = fb0 || fb1;

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
    ab1 = ab2 && ab3;
    double ld0 = 398.5677435326236;
    Thought lo1 = Thought297.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    ab4 = fd0 < fd1;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
    lb2 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 = fd0 - fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, lb2, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = lb2 && ab1;
    double ld3 = 24.249690748903415;
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ad2 = ad3 + ad4;
    Output.points[4][1] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    Output.points[4][2] -= ad4;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
    double ld0 = 949.1771221517051;
    Output.points[4][3] -= ad4;
    fb1 = ab1 || ab2;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && ab1;
    fd0 *= -1;
    ab2 = ab3 || ab4;
    Thought lo2 = Thought199.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought20.getInstance();
    ld0 *= -1;
    Thought lo5 = Thought59.getInstance(fb0, fb1, lb1, lb3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[4][4] -= fd1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 936.212948328241;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fb0 = ad1 < ad2;
    boolean lb1 = false;
    Thought lo2 = Thought106.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = ad1 < ad2;
    lb0 = !lb1;
    ad3 = ad4 - fd0;
    double ld3 = 991.0944463722536;
    Output.points[4][5] -= fd0;
        Thought lo4 = Thought380.getInstance(fb0, fb1, lb0, lb1);
    fd1 *= -1;
    fb0 = ld3 < ad1;
    ad2 *= -1;
    fb1 = ad3 > ad4;
    boolean lb5 = false;
    lb0 = lb1 && lb5;
    fb0 = fd0 < fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought383.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
        Output.points[4][6] += fd0;
        boolean lb2 = true;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1);
}
        boolean lb3 = false;
        ab4 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        lb2 = lb3 || lb0;
        ab1 = fd0 < fd1;
        ab2 = fd0 > fd1;
        Thought lo4 = Thought67.getInstance(ab3, ab4, fb0, fb1);
        lb2 = fd0 < fd1;
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb3, lb0, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, lb3, lb5, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
        Thought lo0 = Thought69.getInstance();
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    ab4 = !fb0;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, ab1, ab2);
}
    double ld2 = 840.3585086382838;
    double ld3 = 612.2060500857782;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[4][7] += fd1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[4][8] -= fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    lb0 = !lb1;
    lb2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    Output.points[5][0] -= fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = lb1 || lb2;
    double ld3 = 124.79542714361436;
    boolean lb4 = false;
    boolean lb5 = true;
    fd0 = fd1 - ld3;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb5, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, lb4, lb5);
}
    fd0 = fd1 + ld3;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld3 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ld3 = fd0 + fd1;
    boolean lb6 = true;
    Thought lo7 = Thought100.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb0, lb1, lb2, lb4);
    double ld8 = 132.52753630804867;
if(fo1 != null){
      fo1.m2(ld8, fd0, fd1, ld3, lb5, lb6, ab1, ab2);
}
    ld8 *= -1;

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
    double ld0 = 417.13996852325374;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0);
}
    double ld1 = 22.38653928029981;
    ld1 = ad1 + ad2;
    double ld2 = 623.4003017664295;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ld0;
    Thought lo3 = Thought359.getInstance();

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
    boolean lb0 = false;
    Thought lo1 = Thought106.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought59.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    ad4 = fd0 + fd1;
    Output.points[5][1] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      ab4 = fo1.m2();
}
    Thought lo3 = Thought191.getInstance(fb0, fb1, lb0, ab1);
    Thought lo4 = Thought274.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = lb0 && ab1;
    Thought lo5 = Thought169.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);

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
    fb0 = fb1 && fb0;
        Output.points[5][2] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 161.67124842684714;
    Output.points[5][3] -= ld0;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought79.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    fb1 = fb0 || fb1;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    fb0 = fb1 || fb0;
    boolean lb2 = false;
        boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
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
    ad2 *= -1;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
    if (fb0) {
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        boolean lb1 = true;
        ad1 = ad2 + ad3;
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
        lb0 = fb0 || fb1;
        boolean lb2 = true;
        ad2 = ad3 + ad4;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        boolean lb3 = true;
        lb1 = lb2 || lb3;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ad4 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4(lb0, fb0, fb1, lb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb2, lb3, lb0, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = !ab4;
    double ld1 = 125.91413378153229;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    ab2 = fd1 > ld1;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = fd1 < ld1;
    fd0 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
          ao4 = fo0.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    if (lb0) {
        ad4 *= -1;
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          ao1.m1(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        lb0 = ad1 < ad2;
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        ad3 = ad4 + fd0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        ad2 = ad3 - ad4;
        Thought lo1 = Thought249.getInstance(lb0, ab1, ab2, ab3);
        boolean lb2 = true;
        Output.points[5][4] += fd0;
        boolean lb3 = false;
        ab2 = !ab3;
        double ld4 = 582.8976852551209;
        fd0 *= -1;
        ab4 = fb0 && fb1;
        boolean lb5 = false;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld4, ad1, ad2, ad3, lb2, lb3, lb5, lb0);
}
        ab1 = ad4 > fd0;
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
    Thought lo0 = Thought111.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    lb1 = !fb0;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    lb1 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb2 = fb0 || fb1;

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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fb0 && fb1;
    Output.points[5][5] -= fd1;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
    double ld1 = 172.77260787522;
    lb0 = fb0 || fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    double ld2 = 304.57127807837844;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought171.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    boolean lb4 = false;
    lb0 = ld2 < fd0;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    Output.points[5][6] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    double ld1 = 99.17599788614646;
        boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, lb2, lb3, fb0);
}
    Thought lo4 = Thought198.getInstance(fd1, ld1, fd0, fd1, fb1, lb0, lb2, lb3);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    fb0 = fd1 < ld1;
    double ld5 = 210.4842731624629;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld1);
}
    lb0 = lb2 && lb3;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
        lb6 = fb0 || fb1;

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
