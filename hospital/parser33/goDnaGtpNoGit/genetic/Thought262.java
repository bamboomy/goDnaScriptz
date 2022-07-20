package genetic;
import java.util.ArrayList;
class Thought262 extends Thought{
private static ArrayList<Thought262> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 916.0403515107117;
private double fd1 = 419.33670534261955;
private Thought fo0 = null;
private Thought fo1 = null;
Thought262 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought262 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought262 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought262 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought262 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought262 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought262 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought262 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought262 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought262 instance = new Thought262 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought262 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought262 instance = new Thought262 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought262 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought262 instance = new Thought262 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought262 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought262 instance = new Thought262 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought262 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought262 instance = new Thought262 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought262 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought262 instance = new Thought262 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought262 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought262 instance = new Thought262 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought262 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought262 instance = new Thought262 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld1 = 15.325768612953166;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo2 = Thought66.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 < ld1;
    Thought lo3 = Thought147.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
        fb0 = fb1 && lb0;

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
    Output.points[0][3] -= fd0;
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        double ld0 = 37.572564086757154;
        Output.points[0][4] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
        }
    Thought lo1 = Thought279.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);

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
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought342.getInstance();
    fd1 = ad1 - ad2;
    Thought lo1 = Thought264.getInstance(fb1, fb0, fb1, fb0);
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Output.points[0][5] += ad2;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[0][6] -= ad1;
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
    Thought lo3 = Thought364.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
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
    boolean lb0 = true;
    lb0 = ad2 < ad3;
    double ld1 = 798.9296107647807;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld1, ad1, fb0, fb1, lb0, ab1);
}
    double ld2 = 935.3889969058371;
    Output.points[0][7] += ad1;
    ad2 *= -1;
    ab2 = ad3 > ad4;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought375.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ld2 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ld1);
}
    boolean lb4 = true;
    ld2 = ad1 - ad2;
    lb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
}
if(fo0 != null){
      lb4 = fo0.m2();
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
    fb0 = fd0 > fd1;
    boolean lb0 = false;
    Thought lo1 = Thought100.getInstance(fb0, fb1, lb0, fb0);
    if (fb1) {
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
        double ld2 = 100.92728864118537;
        fd0 *= -1;
        lb0 = !fb0;
        boolean lb3 = false;
        fd1 *= -1;
        Thought lo4 = Thought37.getInstance(ao1, ao2, ao3, ao4);
        fb0 = ld2 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
        fb1 = !lb3;
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
}
        boolean lb5 = true;
        boolean lb6 = false;
        lb6 = fd0 > fd1;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          ld2 = ao2.m3(lb0, fb0, fb1, lb3);
}
        Thought lo7 = Thought160.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, lb5, lb6, lb0, fb0);
        fb1 = lb3 || lb5;
        double ld8 = 602.9232249888288;
        } else if (fb1) {
        double ld9 = 682.0483002533974;
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
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 169.33172653815356;
    Thought lo1 = Thought205.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[0][8] -= fd0;
    fd1 = ld0 - ad1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Output.points[1][0] += ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
    Output.points[1][1] -= ad3;
    Thought lo2 = Thought348.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
    Thought lo3 = Thought162.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb4 = true;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb4, fb0, fb1, lb4);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, ld0, ad1, fb0, fb1, lb4, fb0);
}
    Output.points[1][2] -= ad2;
    double ld5 = 793.7831532457287;
    boolean lb6 = true;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    fb0 = !fb1;
    lb4 = lb6 || fb0;
if(ao2 != null){
      ld5 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb4, lb6, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = ad1 < ad2;

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
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = lb1 || ab1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    lb1 = ab1 && ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = true;
    fd0 *= -1;
    ab3 = ab4 || fb0;
    double ld3 = 454.68575953853133;
    Thought lo4 = Thought10.getInstance(fb1, lb0, lb1, lb2);
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld3, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(fd1, ld3, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ld3 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld3, fd0, fd1);
}
    ld3 = fd0 + fd1;
    boolean lb5 = false;
    ab4 = fb0 || fb1;
    lb0 = ld3 > fd0;
    lb1 = fd1 < ld3;
    lb2 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld3);
}
    lb5 = fd0 < fd1;
    Thought lo6 = Thought200.getInstance();

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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao4.m3();
}
    fb1 = ad1 > ad2;
    boolean lb0 = true;
if(fo0 != null){
          fo0.m3(lb0, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    double ld1 = 69.43677724162036;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[1][3] += fd1;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 973.685358475027;
    ld1 = fd0 + fd1;
    lb0 = ld1 < fd0;
    double ld2 = 673.1251915666104;
    double ld3 = 755.1982347417116;
    double ld4 = 788.7030240795073;
    if (fb0) {
        fb1 = lb0 && fb0;
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
    ab1 = fd0 < fd1;
    ab2 = fd0 > fd1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab2 = !ab3;
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
    ad1 = ad2 - ad3;
    Output.points[1][4] += ad4;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ad1;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;

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
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought280.getInstance(ab1, ab2, ab3, ab4);
    ad1 *= -1;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
}
    double ld3 = 86.95780962222567;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    boolean lb5 = false;
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[1][5] -= fd0;
    Thought lo6 = Thought25.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2);
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ad3 = fo1.m3(lb1, lb2, lb4, lb5);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    lb4 = lb5 && ab1;
    boolean lb7 = true;
    fd0 *= -1;
    boolean lb8 = false;

Thought.STACK_COUNTER++;
return lb8;
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
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[1][6] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought72.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    Output.points[1][7] -= fd1;
    fb0 = fd0 > fd1;
    double ld2 = 264.9956274301392;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 < fd1;

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
    fb0 = fb1 || fb0;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = lb0 && fb0;
    Thought lo1 = Thought4.getInstance(ad4, fd0, fd1, ad1);
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
        Output.points[1][8] -= ad1;

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
    ab2 = fd1 < fd0;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought138.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && ab1;
    double ld1 = 142.07666643978197;
    ld1 *= -1;
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ld1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
if(ao1 != null){
      lb2 = ao1.m2(ld1, fd0, fd1, ld1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][0] -= ad1;
    ab2 = !ab3;
    ab4 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ad2 = ao2.m3();
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    Output.points[2][1] += ad3;
    Thought lo0 = Thought356.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ad4 > fd0;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    Thought lo2 = Thought268.getInstance(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
    fd0 = fd1 - ad1;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}
    double ld3 = 881.8308203738172;
    double ld4 = 976.6139801615437;
    ab4 = !fb0;
    ld4 = ad1 + ad2;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    lb1 = ab1 || ab2;
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld3, ld4, ad1, ad2);
}
    Output.points[2][2] -= ad3;
    ad4 *= -1;
    double ld5 = 568.6448905489707;

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
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    double ld2 = 348.82391671971885;
    lb0 = fd0 > fd1;
    lb1 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ld2 = fd0 + fd1;
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;
    lb1 = fb0 && fb1;
    ld2 *= -1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    lb1 = !fb0;
    fb1 = lb0 && lb1;

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
    boolean lb0 = false;
    fd0 *= -1;
    fd1 *= -1;
    lb0 = ab1 && ab2;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo0.m3();
}
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        double ld1 = 755.519086478147;
        ld1 = fd0 - fd1;
        fb0 = fb1 || lb0;
        ab1 = ld1 > fd0;
        if (ab2) {
if(fo0 != null){
              fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
            double ld2 = 489.26618722171764;
            Thought lo3 = Thought399.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld1, lb0, ab1, ab2, ab3);
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld2, ld1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0);
}
            boolean lb4 = true;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld2, ld1);
}
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, ld1, fd0);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
            boolean lb5 = true;
if(fo0 != null){
              fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld1, fd0, fd1, lb4, lb5, lb0, ab1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 122.53295321798701;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < ld0;
    fb1 = lb1 && fb0;
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    boolean lb2 = false;
    lb2 = !fb0;
    fb1 = !lb1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ad2 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[2][3] -= ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    fb0 = ad3 > ad4;
    boolean lb2 = true;
    fd0 *= -1;

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
    fb0 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    double ld1 = 411.8103378341611;
    double ld2 = 695.7302057859797;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ld1 = ao2.m3(ld2, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ld2 *= -1;
    fd0 = fd1 + ld1;
    lb0 = ld2 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, ld2, fd0);
}
    fb0 = fd1 < ld1;
    fb1 = lb0 || fb0;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2);
}
    fb1 = fd0 < fd1;
    Output.points[2][4] -= ld1;
if(ao3 != null){
      ao3.m2();
}
    lb0 = !fb0;
if(ao4 != null){
      fb1 = ao4.m2(lb0, fb0, fb1, lb0);
}
    double ld3 = 620.0833057973978;
    boolean lb4 = false;
if(fo0 != null){
      lb4 = fo0.m2(fo1, ao1, ao2, ao3, ld2, ld3, fd0, fd1, fb0, fb1, lb0, lb4);
}
    fb0 = ld1 < ld2;
    ld3 = fd0 - fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought254.getInstance(fd1, ad1, ad2, ad3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought365.getInstance();
    boolean lb2 = false;
if(ao2 != null){
      ao2.m2(lb2, fb0, fb1, lb2);
}
    boolean lb3 = true;
    ad2 = ad3 - ad4;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, lb2, lb3);
}
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb2, lb3);
}
    double ld4 = 275.4586565606833;
    Thought lo5 = Thought333.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb3);
    Thought lo6 = Thought64.getInstance(ao1, ao2, ao3, ao4);
    fb0 = ad1 < ad2;
    boolean lb7 = true;
    Output.points[2][5] -= ad3;
    ad4 = fd0 + fd1;
    fb0 = fb1 && lb2;
        lb3 = lb7 && fb0;
    fb1 = ld4 < ad1;
    ad2 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought41.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    if (ab2) {
        Output.points[2][6] -= fd1;
        Output.points[2][7] -= fd0;
        ab3 = fd1 > fd0;
        double ld1 = 560.6899865797214;
        boolean lb2 = false;
        fd0 *= -1;
        ab3 = ab4 && fb0;
        fb1 = fd1 > ld1;
        Thought lo3 = Thought233.getInstance();
        lb2 = fd0 < fd1;
        ld1 = fd0 - fd1;
        ld1 *= -1;
        ab1 = fd0 > fd1;
        boolean lb4 = false;
        Thought lo5 = Thought13.getInstance(ab1, ab2, ab3, ab4);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, fb0, fb1, lb2, lb4);
}
        ab1 = ab2 && ab3;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb2);
}
        Output.points[2][8] -= ld1;
        lb4 = ab1 || ab2;
        ab3 = fd0 > fd1;
        ld1 = fd0 - fd1;
        ab4 = ld1 < fd0;
        fd1 = ld1 - fd0;
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
    double ld0 = 762.2134412332982;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    ab1 = !ab2;
    double ld2 = 767.4961426654388;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      ab3 = ao1.m2(fd1, ld0, ld2, ad1);
}
    ab4 = !fb0;
    fb1 = ad2 > ad3;
    lb1 = !ab1;
    boolean lb3 = false;
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ld2 = ad1 + ad2;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo0 != null){
      lb0 = fo0.m2(lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    fd0 *= -1;
    lb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, lb2, lb3, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][0] += fd0;
    Thought lo4 = Thought132.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo5 = Thought45.getInstance(fb0, fb1, lb0, lb1);
    lb2 = lb3 && fb0;
    double ld6 = 418.5952593343307;
    ld6 *= -1;

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
    Output.points[3][1] += fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[3][2] -= fd0;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, ab1, ab2, ab3);
}
    boolean lb3 = false;
    boolean lb4 = false;
    fd1 = fd0 - fd1;
    boolean lb5 = true;

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
    Output.points[3][3] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 630.5461412060151;
    fb0 = !fb1;
    fb0 = ld0 > ad1;
    Thought lo1 = Thought143.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    boolean lb2 = true;
    double ld3 = 281.5141733412796;
    double ld4 = 155.34484407739313;
        fb0 = ld4 > ad1;
if(fo1 != null){
      fo1.m2(fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = ld0 < ld3;
if(fo1 != null){
      ld4 = fo1.m3(ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
}
    fd0 = fd1 - ld0;
    lb2 = ld3 < ld4;
    boolean lb5 = false;

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
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Thought lo0 = Thought14.getInstance(fo0, fo1, fo0, fo1);
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
    fb1 = ab1 && ab2;
    ab3 = ad4 < fd0;
    Output.points[3][4] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    lb1 = ad1 < ad2;
    ad3 *= -1;
    lb2 = ab1 || ab2;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb2);
}
    ad2 = ad3 - ad4;
    Thought lo3 = Thought203.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    ad3 *= -1;
    Output.points[3][5] += ad4;
        fb0 = fb1 && lb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
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
    double ld0 = 694.4027367598301;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + ld0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    ld0 *= -1;
    Output.points[3][6] += fd0;
    fd1 = ld0 - fd0;
        double ld1 = 689.9648144539965;
    double ld2 = 719.2881204812968;
    fb1 = ld2 > fd0;
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo3 = Thought319.getInstance(ld0, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
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
    Output.points[3][7] -= ad1;
    fb1 = ad2 > ad3;
        ad4 *= -1;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Output.points[3][8] -= ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;
    boolean lb3 = true;
    double ld4 = 362.42387048777385;
if(ao3 != null){
      ad2 = ao3.m3();
}
if(ao4 != null){
      ad3 = ao4.m3(lb1, lb2, lb3, fb0);
}
    Thought lo5 = Thought207.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld4, fb1, lb0, lb1, lb2);
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    double ld6 = 455.8314527226322;
if(ao4 != null){
      ao3 = ao4.m4(ld4, ld6, ad1, ad2, lb3, fb0, fb1, lb0);
}
    lb1 = lb2 || lb3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought126.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
    double ld1 = 54.85900566302907;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    ld1 = fd0 + fd1;
    Thought lo3 = Thought126.getInstance(ld1, fd0, fd1, ld1);
    Thought lo4 = Thought150.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 = ld1 - fd0;
    ab4 = fb0 || fb1;
    boolean lb5 = false;
    lb2 = fd1 < ld1;
    lb5 = !ab1;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought113.getInstance(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
    ad2 *= -1;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ad4 *= -1;
    Thought lo2 = Thought153.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 - fd0;
    ab4 = fb0 && fb1;
    lb1 = fd1 > ad1;
    double ld3 = 843.0624733683125;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
    double ld4 = 550.8751518480013;
    Output.points[4][0] -= ld3;
if(fo1 != null){
      fo1.m3();
}
    Thought lo5 = Thought267.getInstance(ab2, ab3, ab4, fb0);
    Output.points[4][1] -= ld4;

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
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
            boolean lb1 = true;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought85.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought86.getInstance(fd1, fd0, fd1, fd0);
    fb1 = fd1 > fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
    Thought lo4 = Thought17.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
    fb1 = fd1 < fd0;
    fd1 *= -1;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Output.points[4][2] += fd1;
    Thought lo1 = Thought363.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[4][3] -= fd0;
    fb1 = fd1 > fd0;
    lb0 = !fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][4] -= fd1;
    Thought lo2 = Thought370.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
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
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought221.getInstance(fb1, lb0, fb0, fb1);
    fd0 = fd1 - fd0;
    lb0 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
    boolean lb2 = false;
    double ld3 = 854.2065529055424;
    ld3 = fd0 + fd1;
    ld3 *= -1;
    Output.points[4][5] -= fd0;
    lb2 = fb0 || fb1;
    lb0 = lb2 || fb0;
    boolean lb4 = true;
    boolean lb5 = false;
    fd1 = ld3 - fd0;
    Thought lo6 = Thought89.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, lb5, fb0, fb1, lb0);
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0, lb2, lb4, lb5, fb0);
}
    fb1 = !lb0;
    fd1 *= -1;
    Output.points[4][6] -= ld3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, lb4, lb5, fb0);
}
    fd0 = fd1 - ld3;
    fd0 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
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
