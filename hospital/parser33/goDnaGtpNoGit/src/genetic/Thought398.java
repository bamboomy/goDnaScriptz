package genetic;
import java.util.ArrayList;
class Thought398 extends Thought{
private static ArrayList<Thought398> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 109.1754180342553;
private double fd1 = 534.8693706793578;
private Thought fo0 = null;
private Thought fo1 = null;
Thought398 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought398 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought398 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought398 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought398 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought398 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought398 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought398 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought398 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought398 instance = new Thought398 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought398 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought398 instance = new Thought398 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought398 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought398 instance = new Thought398 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought398 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought398 instance = new Thought398 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought398 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought398 instance = new Thought398 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought398 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought398 instance = new Thought398 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought398 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought398 instance = new Thought398 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought398 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought398 instance = new Thought398 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[8][3] -= fd1;
    Output.points[8][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    lb0 = !fb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought68.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        Thought lo3 = Thought54.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m3();
}
        double ld4 = 874.2440203049613;
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
    Thought lo0 = Thought222.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[8][5] += fd0;
    Output.points[8][6] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld1 = 623.11658827634;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fd0 = fd1 + ld1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ld1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][7] += fd0;
    ab1 = ab2 && ab3;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb2, ab1);
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
        boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    ad2 *= -1;
    double ld2 = 154.86772655277719;
    lb0 = ad2 > ad3;
    boolean lb3 = true;
    ad4 *= -1;
    lb1 = lb3 && fb0;
    Thought lo4 = Thought96.getInstance(fo1, fo0, fo1, fo0);
    Thought lo5 = Thought140.getInstance(fd0, fd1, ld2, ad1);
        ad2 = ad3 + ad4;
    fb1 = !lb0;
    Output.points[8][8] -= fd0;
    lb1 = lb3 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb1, lb3, fb0);
}
    boolean lb6 = false;
    boolean lb7 = false;
    lb7 = fd0 < fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld2, ad1, lb3, lb6, lb7, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb3);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    ab1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    Output.points[0][0] -= ad2;
    ab2 = ab3 && ab4;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    ad3 = ad4 + fd0;

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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Output.points[0][1] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought274.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 && lb2;
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought262.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    boolean lb4 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb4, fb0, fb1, lb0);
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
    Thought lo0 = Thought392.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought235.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 916.8004320593739;
    ad4 = fd0 - fd1;
    ld3 = ad1 + ad2;
    boolean lb4 = false;
    double ld5 = 512.9042921764849;
    lb4 = !fb0;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        Thought lo6 = Thought1.getInstance(fb1, lb1, lb4, fb0);
        Thought lo7 = Thought253.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld3, ld5, fb1, lb1, lb4, fb0);
        ad1 *= -1;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, lb1, lb4, fb0);
}
        Thought lo8 = Thought225.getInstance(fo1, ao1, ao2, ao3, fb1, lb1, lb4, fb0);
        ld3 = ld5 + ad1;
        ad2 = ad3 + ad4;
        double ld9 = 614.946215189065;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 387.57594411898725;
        Output.points[0][2] -= ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    double ld1 = 81.82643471903587;
    ab2 = ld1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld1, fd0);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd1 = ld0 - ld1;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    double ld3 = 667.6465505069734;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld0, fb1, lb2, ab1, ab2);
}
    ld1 *= -1;
    Thought lo4 = Thought383.getInstance(ld3, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    lb2 = ld1 > ld3;
    boolean lb5 = false;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    double ld0 = 965.9678426398588;
    fb1 = ad4 > fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
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
    double ld0 = 217.2405795146495;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought206.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb2 = false;
    lb2 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought381.getInstance(lb2, lb3, fb0, fb1);
    boolean lb5 = false;
    boolean lb6 = false;
    lb2 = lb3 || lb5;
    fd0 = fd1 + ld0;
    if (lb6) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb2, lb3);
}
        Thought lo7 = Thought244.getInstance(fd1, ld0, fd0, fd1, lb5, lb6, fb0, fb1);
        Thought lo8 = Thought123.getInstance(fo1, fo0, fo1, fo0, lb2, lb3, lb5, lb6);
        Thought lo9 = Thought376.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
        boolean lb10 = false;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          fo1.m2(lb6, fb0, fb1, lb10);
}
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought303.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    double ld1 = 470.8020651805767;
    fd0 = fd1 - ld1;
    fd0 *= -1;
    boolean lb2 = false;
    Output.points[0][3] -= fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb3 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    ab1 = ld1 < fd0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    fb0 = fb1 && lb2;
    lb3 = ld1 < fd0;
    ab1 = ab2 || ab3;
    double ld4 = 327.10369485658634;
    ab4 = fb0 && fb1;
    fd0 *= -1;
    boolean lb5 = false;
    boolean lb6 = false;
    double ld7 = 467.2148064512519;
    lb2 = lb3 && lb5;
if(fo1 != null){
      fo1.m1();
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[0][4] += ad4;
    double ld0 = 211.95238476959992;
    fb1 = ad4 < fd0;
    Output.points[0][5] -= fd1;
    Output.points[0][6] += ld0;

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
        ab2 = ad2 > ad3;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
    Thought lo1 = Thought260.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = false;
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    lb0 = lb2 && ab1;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, lb2, ab1);
}
    Output.points[0][7] += fd0;
    Thought lo3 = Thought332.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo4 = Thought359.getInstance();
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, lb2);
}
    double ld5 = 586.1001665264389;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    double ld0 = 111.00835524431979;
    ld0 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 + fd1;
        boolean lb1 = true;
        fb0 = fb1 || lb1;
        Output.points[0][8] -= ld0;
        Output.points[1][0] += fd0;
        fd1 = ld0 + fd0;
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
    Output.points[1][1] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought234.getInstance(ao2, ao3, ao4, fo0);
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
        fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    if (fb0) {
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
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    double ld0 = 374.983325900085;
    ab4 = fd0 > fd1;
    fb0 = ld0 < fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    fb1 = ab1 && ab2;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3();
}
    ab2 = ld0 > fd0;
    ab3 = fd1 < ld0;
    ab4 = !fb0;
    fb1 = lb1 && ab1;
    ab2 = fd0 < fd1;
    ab3 = ld0 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    fd0 *= -1;
        fd1 = ld0 + fd0;

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
    ab1 = ad1 > ad2;
    boolean lb0 = false;
if(ao2 != null){
      ab1 = ao2.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    Output.points[1][2] += ad2;
    double ld1 = 54.866588570013356;
    fb1 = lb0 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 && lb0;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo4 = Thought367.getInstance(ad2, ad3, ad4, fd0);
    Thought lo5 = Thought13.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(lb2, lb3, ab1, ab2);
}
    ad3 = ad4 + fd0;
    ab3 = !ab4;
    fb0 = !fb1;
    lb0 = fd1 > ld1;
    Output.points[1][3] += ad1;
    boolean lb6 = false;
    Output.points[1][4] -= ad2;
    ad3 = ad4 + fd0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Output.points[1][5] -= fd0;
    Output.points[1][6] += fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought157.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3();
}
    fb0 = fd1 > fd0;
        fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Output.points[1][7] -= fd1;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
    ab2 = !ab3;
    Thought lo0 = Thought142.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[1][8] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought100.getInstance(fd0, fd1, fd0, fd1);
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    fd0 *= -1;
    boolean lb2 = true;
    fd1 *= -1;
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    double ld2 = 578.8539010322835;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    Thought lo3 = Thought105.getInstance(fd0, fd1, ld2, ad1, lb1, fb0, fb1, lb0);
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    Output.points[2][0] -= ad3;
    double ld4 = 458.6846605131351;
    lb1 = fb0 && fb1;
    boolean lb5 = false;

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
    Thought lo0 = Thought8.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    boolean lb1 = false;
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      ad3 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb1, ab1, ab2);
}
    if (ab3) {
        ab4 = !fb0;
        boolean lb2 = true;
if(fo0 != null){
          fo0.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb1);
}
        boolean lb3 = true;
        double ld4 = 141.97525877258298;
        boolean lb5 = true;
        lb5 = ld4 < ad1;
        ad2 = ad3 - ad4;
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
    boolean lb0 = false;
    double ld1 = 488.3606718769835;
    Output.points[2][1] -= ld1;
    fb0 = !fb1;
    boolean lb2 = false;
    lb0 = fd0 < fd1;
    lb2 = ld1 < fd0;
    fb0 = !fb1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb0);
}
    Thought lo3 = Thought75.getInstance(ao1, ao2, ao3, ao4);
    boolean lb4 = false;

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
    Output.points[2][2] -= ad1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    fb1 = lb0 && fb0;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    boolean lb2 = false;
    lb2 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld3 = 320.85072434093695;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld3, ad1, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
}
    Output.points[2][3] += fd1;
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0, lb0, lb1, lb2, fb0);
}
    fb1 = ad1 > ad2;
    boolean lb4 = true;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fd1, ld3, ad1, ad2);
}
    Thought lo5 = Thought288.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
    ld3 = ad1 - ad2;
    ad3 = ad4 + fd0;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 756.2812987295314;
    ab1 = ld0 > fd0;
    Output.points[2][4] += fd1;
    ab2 = ab3 && ab4;
    ld0 = fd0 - fd1;
    double ld1 = 617.7024686694455;
    Output.points[2][5] += ld0;
    Thought lo2 = Thought129.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    double ld3 = 223.84816812886024;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld1, ld3, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = ld0 > ld1;
if(ao3 != null){
      fb0 = ao3.m2(ld3, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ab4 = ld1 < ld3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    fd0 = fd1 + ld0;
    Thought lo4 = Thought277.getInstance(ld1, ld3, fd0, fd1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ld1, ld3, fd0);
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
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad1 = ao3.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    Output.points[2][6] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab3 = !ab4;
if(ao1 != null){
      ad2 = ao1.m3();
}
    Thought lo0 = Thought37.getInstance(fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    double ld1 = 936.4999929953855;
    ab1 = ad3 < ad4;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought123.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    boolean lb3 = false;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    double ld2 = 642.5827906861771;
    Thought lo3 = Thought185.getInstance(fd0, fd1, ld2, fd0);
        lb1 = fb0 && fb1;
    lb0 = fd1 < ld2;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    Thought lo4 = Thought308.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    Output.points[2][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Thought lo5 = Thought247.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
    fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
    lb0 = ld2 < fd0;

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
    Output.points[2][8] += fd0;
    boolean lb0 = true;
    fd1 *= -1;
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 600.6987373389096;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = ld3 < fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fd1, ld3, fd0, fd1);
}
    lb2 = ld3 < fd0;
    boolean lb5 = false;

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
    Output.points[3][0] += ad1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    lb2 = ad4 < fd0;

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
    Output.points[3][1] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought160.getInstance(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[3][2] -= ad2;
    ab2 = ab3 && ab4;
    Output.points[3][3] -= ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought366.getInstance();
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought238.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
        double ld0 = 397.97766496988;
        Thought lo1 = Thought1.getInstance();
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fb0 = fb1 && fb0;
    fd0 = fd1 + ld0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fd1 = ld0 + fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = !fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    double ld0 = 885.3550573293389;
    Output.points[3][4] -= ad1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
    boolean lb1 = true;

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
    ab2 = fd0 > fd1;
    fd0 *= -1;
    ab3 = fd1 < fd0;
    ab4 = fb0 && fb1;
    fd1 *= -1;
    fd0 *= -1;
    ab1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = fd1 < fd0;
    Output.points[3][5] -= fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    Thought lo1 = Thought242.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 164.65702453279584;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb3);
}
    double ld4 = 89.88421481758985;
if(fo0 != null){
      ao4 = fo0.m4(ld4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld2);
}
    ab1 = ld4 > fd0;
    double ld6 = 284.3533735742661;
    ab2 = ab3 && ab4;
    fd0 = fd1 + ld2;
    ld4 = ld6 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ld4, ld6);
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
      ao2 = ao3.m4();
}
    boolean lb0 = true;
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
}
    double ld1 = 856.5458107638312;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = !ab1;
    ld1 *= -1;
    ad1 = ad2 - ad3;
    ab2 = !ab3;
    ad4 *= -1;
    boolean lb2 = false;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
    Output.points[3][6] += ld1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ld1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb1 = fd1 < ld1;
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
    boolean lb0 = false;
    lb0 = fd1 < fd0;
    fb0 = fd1 > fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    Output.points[3][7] += fd0;
    lb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    lb2 = fd1 < fd0;
    boolean lb3 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[3][8] += fd0;

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
      fb1 = fo1.m2();
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    Output.points[4][0] -= fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought5.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
    double ld2 = 86.75261590407703;
    fd0 = fd1 - ld2;
    lb0 = fb0 && fb1;

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
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 < fd1;
        double ld2 = 812.9801392274197;
    double ld3 = 647.8285467017595;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld3, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Output.points[4][1] += ld2;
    double ld4 = 535.7753045132191;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld3 = ld4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, ld3, ld4);
}
    fd0 = fd1 - ld2;
    lb0 = lb1 || fb0;
    ld3 *= -1;
    ld4 = fd0 - fd1;

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
