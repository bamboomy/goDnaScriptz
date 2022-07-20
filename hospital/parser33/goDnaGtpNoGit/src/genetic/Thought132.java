package genetic;
import java.util.ArrayList;
class Thought132 extends Thought{
private static ArrayList<Thought132> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 876.2889587202442;
private double fd1 = 879.5414456028533;
private Thought fo0 = null;
private Thought fo1 = null;
Thought132 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought132 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought132 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought132 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought132 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought132 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought132 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought132 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought132 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought132 instance = new Thought132 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought132 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought132 instance = new Thought132 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought132 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought132 instance = new Thought132 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought132 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought132 instance = new Thought132 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought132 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought132 instance = new Thought132 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought132 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought132 instance = new Thought132 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought132 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought132 instance = new Thought132 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought132 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought132 instance = new Thought132 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    double ld0 = 248.88823657179734;
        fb1 = fb0 && fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    fd1 *= -1;
    double ld2 = 808.3954706063349;
    fb0 = fb1 && lb1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[0][2] -= ld0;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    double ld3 = 304.7424805866409;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3);
}
    Thought lo4 = Thought67.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
    fd1 = ld3 - fd0;
if(fo1 != null){
      fo1.m1();
}
    ab1 = ab2 && ab3;
    ab4 = fd1 < ld3;
    fd0 = fd1 + ld3;
    Output.points[0][3] += fd0;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb1);
}
    lb2 = fd1 < ld3;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1, fb1, lb0, lb1, lb2);
}
    boolean lb5 = false;
    double ld6 = 97.35650738744239;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
            fd1 = ad1 - ad2;
    fb0 = ad3 > ad4;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
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
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought26.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ab1 || ab2;
    boolean lb1 = false;
    ab2 = ab3 || ab4;
    double ld2 = 773.7433864546132;
    boolean lb3 = false;
        ld2 = ad1 - ad2;
    ab4 = ad3 > ad4;
    fb0 = !fb1;
    lb1 = !lb3;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld2, ad1);
}
    ad2 *= -1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld2 = ad1 - ad2;

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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][4] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fd1 = fd0 - fd1;

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
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    fd1 *= -1;
    Thought lo1 = Thought111.getInstance(ad1, ad2, ad3, ad4);
        fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    Output.points[0][5] -= fd0;
    boolean lb2 = false;
    fd1 = ad1 - ad2;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    lb2 = !fb0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m1();
}
    Thought lo3 = Thought68.getInstance(fb1, lb0, lb2, fb0);
    ad4 = fd0 - fd1;
        fb1 = !lb0;

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
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    Thought lo0 = Thought81.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    boolean lb1 = true;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    Output.points[0][6] -= fd1;
    double ld2 = 986.8837266184171;
    Thought lo3 = Thought42.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    boolean lb4 = true;
    lb1 = !lb4;
    ld2 = fd0 - fd1;
    Output.points[0][7] += ld2;
    boolean lb5 = false;
    boolean lb6 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb5 = !lb6;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    double ld7 = 494.5237962009542;
    ab1 = ab2 || ab3;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m3();
}
    Output.points[0][8] += fd0;
    boolean lb0 = false;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought75.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
    double ld2 = 174.23968292836014;
    boolean lb3 = false;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[1][0] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld2, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    boolean lb4 = false;
    ld2 *= -1;
        ad1 *= -1;

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
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 204.27191065212955;
    boolean lb1 = true;
    fb0 = fb1 || lb1;

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
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[1][1] += fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought370.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    ab2 = fd0 < fd1;
    boolean lb2 = true;
    Thought lo3 = Thought105.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab2 = fd0 < fd1;
    Thought lo4 = Thought332.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;
    fd1 = fd0 - fd1;
    lb1 = !lb2;
    Output.points[1][2] -= fd0;
    lb5 = !ab1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, lb2, lb5, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    fd0 *= -1;
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[1][3] += fd1;

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
    double ld0 = 612.4029334731986;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought247.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
if(fo0 != null){
      fo0.m3();
}
    fb1 = ad4 > fd0;
    boolean lb2 = false;
    lb2 = fd1 < ld0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    lb2 = fb0 && fb1;
    ld0 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld0 = ad1 + ad2;
    boolean lb3 = true;
    ad3 = ad4 - fd0;
    lb2 = !lb3;
    double ld4 = 353.18744948698185;

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
    double ld0 = 354.5316148791142;
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought82.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought254.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    lb3 = ab1 && ab2;
    ad1 *= -1;

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
        Output.points[1][4] -= fd0;
    double ld0 = 487.79230745740074;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[1][5] += fd1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    ld0 *= -1;
    Thought lo1 = Thought194.getInstance(fd0, fd1, ld0, fd0);
    boolean lb2 = false;
    Output.points[1][6] -= fd1;
    ld0 *= -1;
    fb0 = !fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb1 = fd1 < ad1;
        boolean lb0 = false;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && fb0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb1 = true;
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb1, lb0);
}
        Output.points[1][7] -= ad4;
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
        fb0 = fd0 > fd1;
        ad1 = ad2 + ad3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, lb1, lb0, fb0);
}
        ad2 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb1, lb1, lb0, fb0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 571.2425725969038;
    ab2 = ld0 < fd0;
    fd1 = ld0 + fd0;
    Thought lo1 = Thought218.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1();
}
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ab3 = ab4 || fb0;
    fd1 = ld0 - fd0;
        fb1 = lb2 || ab1;
    Thought lo3 = Thought196.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
    boolean lb4 = false;
    double ld5 = 952.9308943744658;
    Output.points[1][8] -= ld0;
    Output.points[2][0] -= ld5;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ld5, fb0, fb1, lb2, lb4);
}
    boolean lb6 = false;
        lb6 = fd0 < fd1;
    ld0 *= -1;
    ld5 = fd0 + fd1;
    ab1 = !ab2;

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
    double ld0 = 804.974714478933;
    Thought lo1 = Thought356.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && ab1;
    ld0 = ad1 + ad2;
    boolean lb2 = true;
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ab4 = ld0 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
    ab4 = fb0 || fb1;
    lb2 = ld0 < ad1;
    double ld4 = 628.3377036452551;
    boolean lb5 = false;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3();
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    ab1 = !ab2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    lb0 = lb1 || ab1;
    ab2 = fd0 > fd1;
    ab3 = !ab4;
    fd0 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    Thought lo4 = Thought94.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    lb0 = lb1 && lb2;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb5 = true;
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
    fb1 = !fb0;
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        Thought lo0 = Thought231.getInstance(fd0, fd1, ad1, ad2);
        Output.points[2][1] -= ad3;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld1 = 921.4799221912926;
        double ld2 = 648.2698686820146;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          ad3 = fo0.m3(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;

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
    Output.points[2][2] += ad1;
    boolean lb0 = false;
    double ld1 = 626.8958145740096;
    lb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[2][3] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought105.getInstance(fd0, fd1, ld1, ad1);
    fb0 = fb1 && lb0;
    ab1 = ad2 > ad3;
    Thought lo3 = Thought111.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);

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
    fb0 = !fb1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fd0 *= -1;
    double ld0 = 575.7222080000003;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd0 = fd1 + ld0;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < ld0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo1 = Thought312.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && fb0;

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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      ao4.m2(fb1, lb0, fb0, fb1);
}
    ad3 = ad4 + fd0;
    lb0 = fb0 && fb1;
    fd1 *= -1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    ad2 *= -1;
    Output.points[2][4] -= ad3;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[2][5] += ad4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[2][6] -= fd0;
    double ld1 = 142.52048585149902;
    lb0 = fd0 < fd1;
    boolean lb2 = true;
    lb2 = ab1 && ab2;
if(ao1 != null){
      ab3 = ao1.m2();
}
    Thought lo3 = Thought113.getInstance(ab4, fb0, fb1, lb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
}
    Thought lo4 = Thought139.getInstance(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
    Output.points[2][7] += fd1;
    lb2 = ld1 > fd0;
    boolean lb5 = true;
    lb5 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
      ao1.m3(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought63.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad3 = ad4 + fd0;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    Output.points[2][8] += fd1;
if(ao4 != null){
      ao4.m1();
}
if(fo0 != null){
      ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought87.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, ab1, ab2);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    boolean lb3 = true;
    double ld4 = 231.78036213521304;
    ab2 = ab3 && ab4;
if(ao4 != null){
      fb0 = ao4.m2(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ld4;
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
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        fb1 = fd1 > fd0;
        double ld0 = 667.7463959421722;
        fb0 = !fb1;
        boolean lb1 = true;
if(fo1 != null){
          fo1.m2();
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m3(lb1, fb0, fb1, lb1);
}
        boolean lb2 = true;
        fd1 = ld0 + fd0;
        fd1 = ld0 + fd0;
        boolean lb3 = false;
        lb2 = lb3 || fb0;
        fb1 = !lb1;
        lb2 = fd1 < ld0;
        Thought lo4 = Thought151.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb3, fb0, fb1, lb1);
        lb2 = lb3 || fb0;
if(fo1 != null){
          fo1.m1(fd1, ld0, fd0, fd1, fb1, lb1, lb2, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought140.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    lb0 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        fd1 *= -1;
        fd0 *= -1;
        Thought lo3 = Thought57.getInstance();
if(fo0 != null){
          lb2 = fo0.m2(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        fd0 = fd1 + fd0;
        fd1 *= -1;
        double ld4 = 414.1616188861864;
if(fo0 != null){
          ld4 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
        fd0 = fd1 - ld4;
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
    fb1 = !fb0;
    fb1 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
        Thought lo0 = Thought283.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
        fb1 = ad1 < ad2;
        double ld1 = 918.4545795671482;
        Thought lo2 = Thought271.getInstance();
        boolean lb3 = true;
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
    Output.points[3][0] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    boolean lb0 = false;
    ab4 = fb0 || fb1;
    boolean lb1 = true;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    Thought lo2 = Thought366.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought192.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb3);
    Thought lo5 = Thought392.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Output.points[3][1] += ad1;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4();
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
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fd1 > fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;

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
    Thought lo0 = Thought35.getInstance();
    Output.points[3][2] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought80.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    ad4 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    lb2 = lb3 && fb0;
    Thought lo4 = Thought104.getInstance(ao3, ao4, fo0, fo1, fb1, lb2, lb3, fb0);
    boolean lb5 = true;
    boolean lb6 = false;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    ab1 = fd0 > fd1;
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ab4 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        lb0 = ab1 || ab2;
        fd0 = fd1 - fd0;
        ab3 = fd1 > fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[3][3] += ad2;
    Output.points[3][4] += ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ab2 = ao3.m2();
}
    ab3 = fd1 > ad1;
    ad2 *= -1;
    Output.points[3][5] -= ad3;
    ab4 = fb0 || fb1;
    if (ab1) {
        ad4 = fd0 - fd1;
        double ld0 = 917.0660539967005;
        ab2 = !ab3;
if(ao4 != null){
          ld0 = ao4.m3(ab4, fb0, fb1, ab1);
}
        ab2 = ad1 < ad2;
if(fo0 != null){
          ab3 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
        boolean lb1 = false;
        ld0 *= -1;
        boolean lb2 = false;
        ad1 = ad2 - ad3;
        boolean lb3 = true;
        double ld4 = 268.9818371988473;
        ad3 = ad4 + fd0;
        lb2 = !lb3;
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 889.4042531772703;
    ld0 = fd0 + fd1;
    Output.points[3][6] += ld0;
    double ld1 = 530.287122215782;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ld1 = fd0 + fd1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = ld0 > ld1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld0, ld1, fd0, fd1);
}
    ld0 *= -1;

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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 471.62502107896165;
    Output.points[3][7] += fd0;
    fd1 *= -1;
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 622.8124921821945;
    fb0 = fd0 > fd1;
    Output.points[3][8] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(lb3, fb0, fb1, lb2);
}
    lb3 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb1, lb2, lb3, fb0);
}
    fb1 = lb2 || lb3;
    double ld4 = 674.6899965239779;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, ld4, fd0, fb0, fb1, lb2, lb3);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb1 = fb0 || fb1;
    fd1 *= -1;
    Thought lo2 = Thought7.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    lb0 = lb1 && fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = true;
    lb4 = fd0 > fd1;
    double ld5 = 750.6531000914574;
if(fo1 != null){
      ld5 = fo1.m3(fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - ld5;
    lb3 = fd0 < fd1;
    ld5 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld5, lb4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld5, fd0, lb1, lb3, lb4, fb0);
}
    boolean lb6 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb3);
}
    fd1 = ld5 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb7 = true;
    fd1 = ld5 - fd0;

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
